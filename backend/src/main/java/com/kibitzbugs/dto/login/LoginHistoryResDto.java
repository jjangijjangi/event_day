package com.kibitzbugs.dto.login;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@ApiModel(value = "로그인 기록 응답")
public class LoginHistoryResDto {

    @ApiModelProperty(value = "로그인 기록 PK", example = "123")
    private Long id;

    @ApiModelProperty(value = "스트리머 식별 id", example = "123456789")
    private String streamerId;

    @ApiModelProperty(value = "스트리머 계정 아이디", example = "ysu6691")
    private String name;

    @ApiModelProperty(value = "스트리머 닉네임", example = "훈수남")
    private String nickname;

    @ApiModelProperty(value = "스트리머 이미지", example = "https://imgurl")
    private String imgUrl;
}
