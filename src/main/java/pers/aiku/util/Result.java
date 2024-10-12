package pers.aiku.util;

import lombok.Getter;
import lombok.Setter;

/**
 * <p>此类作为统一响应结果类，提供一系列方法用于返回数据</p>
 */
@Setter
@Getter
public class Result {
	private int code;
	private String message;
	private Object object;

	public Result(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public Result(int code, String message, Object object) {
		this.code = code;
		this.message = message;
		this.object = object;
	}

	/**
	 * <p>自定义响应码 + 响应信息 + 携带数据</p>
	 *
	 * @param code    自定义响应码
	 * @param message 响应信息
	 * @param object  携带数据
	 * @return 统一响应结果
	 */
	public static Result success(int code, String message, Object object) {
		return new Result(code, message, object);
	}

	/**
	 * <p>默认响应码（200） + 响应信息 + 携带数据</p>
	 *
	 * @param message 响应信息
	 * @param object  携带数据
	 * @return 统一响应结果
	 */
	public static Result success(String message, Object object) {
		return new Result(StatusCodes.OK.getCode(), message, object);
	}

	/**
	 * <p>默认响应码（200） + 响应信息 + 无数据</p>
	 *
	 * @param message 响应信息
	 * @return 统一响应结果
	 */
	public static Result success(String message) {
		return new Result(StatusCodes.OK.getCode(), message);
	}


	/**
	 * <p>自定义响应码 + 错误信息</p>
	 *
	 * @param code    自定义响应码
	 * @param message 错误信息
	 * @return 统一相应结果
	 */
	public static Result error(int code, String message) {
		return new Result(code, message);
	}

	/**
	 * <p>默认响应码（500） + 错误信息</p>
	 *
	 * @param message 错误信息
	 * @return 统一相应结果
	 */
	public static Result error(String message) {
		return new Result(StatusCodes.ERROR.getCode(), message);
	}
}
