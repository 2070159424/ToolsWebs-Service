package pers.aiku.util;

import lombok.Getter;

@Getter
public enum StatusCodes {
	OK(200),
	ERROR(500);
	private final int code;

	StatusCodes(int code) {
		this.code = code;
	}
}
