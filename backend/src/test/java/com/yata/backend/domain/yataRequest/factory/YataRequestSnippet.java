package com.yata.backend.domain.yataRequest.factory;

import org.springframework.restdocs.payload.JsonFieldType;
import org.springframework.restdocs.payload.ResponseFieldsSnippet;

import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.restdocs.payload.PayloadDocumentation.responseFields;

public class YataRequestSnippet {
    public static ResponseFieldsSnippet getListResponse() {
        return responseFields(
                fieldWithPath("data").type(JsonFieldType.ARRAY).description("회원 정보"),
                fieldWithPath("data[].yataId").type(JsonFieldType.NUMBER).description("야타 ID"),
                fieldWithPath("data[].yataRequestId").type(JsonFieldType.NUMBER).description("야타 신청/초대 ID"),
                fieldWithPath("data[].yataRequestStatus").type(JsonFieldType.STRING).description("야타 신청 상태"),
                fieldWithPath("data[].approvalStatus").type(JsonFieldType.STRING).description("야타 승인 상태"),
                fieldWithPath("data[].title").type(JsonFieldType.STRING).description("야타 제목"),
                fieldWithPath("data[].specifics").type(JsonFieldType.STRING).description("야타 특이사항"),
                fieldWithPath("data[].departureTime").type(JsonFieldType.STRING).description("출발 시간"),
                fieldWithPath("data[].timeOfArrival").type(JsonFieldType.STRING).description("도착 시간"),
                fieldWithPath("data[].maxPeople").type(JsonFieldType.NUMBER).description("최대 인원"),
                fieldWithPath("data[].maxWaitingTime").type(JsonFieldType.NUMBER).description("최대 대기 시간"),
                fieldWithPath("data[].strPoint").type(JsonFieldType.OBJECT).description("출발지"),
                fieldWithPath("data[].strPoint.longitude").type(JsonFieldType.NUMBER).description("출발지 경도"),
                fieldWithPath("data[].strPoint.latitude").type(JsonFieldType.NUMBER).description("출발지 위도"),
                fieldWithPath("data[].strPoint.address").type(JsonFieldType.STRING).description("출발지 주소"),
                fieldWithPath("data[].destination").type(JsonFieldType.OBJECT).description("도착지"),
                fieldWithPath("data[].destination.longitude").type(JsonFieldType.NUMBER).description("도착지 경도"),
                fieldWithPath("data[].destination.latitude").type(JsonFieldType.NUMBER).description("도착지 위도"),
                fieldWithPath("data[].destination.address").type(JsonFieldType.STRING).description("도착지 주소"),
                fieldWithPath("sliceInfo").type(JsonFieldType.OBJECT).description("슬라이스 정보"),
                fieldWithPath("sliceInfo.getNumber").type(JsonFieldType.NUMBER).description("현재 슬라이스 번호"),
                fieldWithPath("sliceInfo.getSize").type(JsonFieldType.NUMBER).description("현재 슬라이스 크기"),
                fieldWithPath("sliceInfo.getNumberOfElements").type(JsonFieldType.NUMBER).description("현재 스라이스가 가지고 있는 엔티티 수"),
                fieldWithPath("sliceInfo.hasNext").type(JsonFieldType.BOOLEAN).description("다음 슬라이스의 존재 유무"),
                fieldWithPath("sliceInfo.hasPrevious").type(JsonFieldType.BOOLEAN).description("이전 슬라이스의 존재 유무")
        );
    }
}