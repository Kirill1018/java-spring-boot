package javaSpringBoot;
import org.springframework.web.bind
.annotation.*;
@RestController
@RequestMapping("/payment")
public class PaymentController {
	final String sharedKey = "shared_key";//clue
	static final String success_status = "success", error_status = "error";//standings
	static final int code_success = 100, auth_failure = 102;//standing identifiers
	public PaymentController() { }
	@GetMapping
	public BaseResponse showStatus() { return new BaseResponse(success_status, 1); }
	@PostMapping
	public BaseResponse pay(@RequestParam String key, @RequestBody PaymentRequest request) {
		final BaseResponse response;
		if (this.sharedKey.equalsIgnoreCase(key)) {
			int userId = request.getUserId();//user's identifier
			String itemId = request.getItemId();//item identifier
			double discount = request.getDiscount();//rebate
			System.out.println(userId + "   " + itemId
					+ "   " + discount);
			response = new BaseResponse(success_status, code_success);//success feedback of base
		}
		else response = new BaseResponse(error_status, auth_failure);//error feedback of base
		return response;
	}
}