package com.yata.backend.domain.yata.service;

import com.yata.backend.domain.yata.dto.YataRequestDto;
import com.yata.backend.domain.yata.entity.YataRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface YataRequestService {
    YataRequest createRequest(YataRequest yataRequest, String userName, Long yataId) throws Exception;
    YataRequest createInvitation(YataRequest yataRequest, String userName, Long yataId) throws Exception;
    Slice<YataRequest> findRequests(String userEmail, Long yataId, Pageable pageable);
    void deleteRequest(Long yataRequestId);
    void verifyRequest(String userName, Long yataId);
    void verifyInvitation(String userName, Long yataId);
}
