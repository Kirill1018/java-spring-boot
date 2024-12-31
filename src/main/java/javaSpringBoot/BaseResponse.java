package javaSpringBoot;

public class BaseResponse {
	final String status;
	final Integer code;
	public BaseResponse(String status, Integer code) {
		this.status = status;//standing
		this.code = code;//id
	}
	public String getStatus() {
		return status;
	}
	public Integer getCode() {
		return code;
	}
}