package com.umc5th.practice.domain.type;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum FoodCategory {
    CHINESE(1, "중식"),
    KOREAN(2, "한식"),
    JAPANESE(3, "일식");


    private final Integer idx;
    private final String name;

}
