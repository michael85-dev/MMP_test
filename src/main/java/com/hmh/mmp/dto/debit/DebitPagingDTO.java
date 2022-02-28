package com.hmh.mmp.dto.debit;

import com.hmh.mmp.entity.BankEntity;
import lombok.Data;

import java.time.LocalDate;

@Data
public class DebitPagingDTO extends DebitSaveDTO {
    private Long debitId;

    public DebitPagingDTO(Long id, Double debitGet, String debitMemo, String debitName, Long minusAsset, String account, String debitPhotoName) {
    }
}
