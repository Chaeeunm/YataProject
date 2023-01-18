package com.yata.backend.domain.review.service;

import com.yata.backend.domain.review.entity.Checklist;
import com.yata.backend.domain.review.entity.Review;
import io.netty.channel.pool.ChannelHealthChecker;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public interface ReviewService {
    Review createReview(List<Long> checklistIds, String username, long yataId);
}
