package com.hmh.mmp.dto.account;

import com.hmh.mmp.entity.AccountEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetailDTO {
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

    public static AccountDetailDTO toMoveData(AccountEntity accountEntity) {
        AccountDetailDTO accountDetailDTO = new AccountDetailDTO();
        accountDetailDTO.setAccountId(accountEntity.getId());
        accountDetailDTO.setAccountName(accountEntity.getAccountName());
        accountDetailDTO.setAccountMemo(accountEntity.getAccountMemo());
        accountDetailDTO.setMinusAsset(accountEntity.getMinusAsset());
        accountDetailDTO.setPlusAsset(accountEntity.getPlusAsset());
        accountDetailDTO.setAccountPhotoName(accountEntity.getAccountPhotoName());
        accountDetailDTO.setBankId(accountEntity.getBankEntity().getId());
        accountDetailDTO.setMemberId(accountEntity.getMemberEntity().getId());
        //accountDetailDTO.setFirstList(accountEntity.getFirstListEntityList()); // 이렇게 설정하면 그 안에 있는 항목을 list로 불러오지 못할텐데.
        // 이걸 어떻게 가지고 와야할까?

        return accountDetailDTO;
    }
}
