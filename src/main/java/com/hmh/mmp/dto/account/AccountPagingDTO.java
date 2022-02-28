package com.hmh.mmp.dto.account;

import com.hmh.mmp.entity.BankEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountPagingDTO {
    private Long accountId;

    private Long bankId;
    private Long memberId;

    private LocalDate date;
    private Long plusAsset;
    private Long minusAsset;
    private String accountName;
    private MultipartFile accountPhoto;
    private String accountPhotoName;
    private String accountMemo;

    private List<String> firstList;
    //    private String firstList; // 대분류
    private String secondList; // 중뷴류
    private String thirdList; // 소분류

    public AccountPagingDTO(Long id, String accountMemo, String accountName, String accountPhotoName, Long minusAsset, Long plusAsset, BankEntity bankEntity, LocalDate calDate, LocalDateTime calTime) {
    }
}
