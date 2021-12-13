package vendingmachine.validator;

import java.util.regex.Pattern;

public class Validator {
	String ERROR_MONEY_IS_INTEGER = "[ERROR] 금액은 숫자여야 합니다.";
	String ERROR_MONEY_CAN_DIVIDE_INTO_10 = "[ERROR] 금액은 10원 단위여아합니다.";

	public String validateMoney(String money) {
		String numberOnly = "^[0-9]+$";

		if (!Pattern.matches(numberOnly, money)) {
			throw new IllegalArgumentException(ERROR_MONEY_IS_INTEGER);
		}

		if (Integer.parseInt(money)%10 != 0) {
			throw new IllegalArgumentException(ERROR_MONEY_CAN_DIVIDE_INTO_10);
		}
		return money;
	}

	public String validateProduct(String validateProduct) {
		// 상품명이 제대로 들어왔는지 검증하는 로직
		return validateProduct;
	}

	public String validateBuyingProduct(String validateBuyingProduct) {
		// 구매할 상품이 잘 들어갔는지 검증하는 로직
		/**
		 * 잘못 들어온 경우
		 * 1. 상품 명에 없는 이름
		 * 2. 이름이 빈칸
		 */
		return validateBuyingProduct;
	}
}
