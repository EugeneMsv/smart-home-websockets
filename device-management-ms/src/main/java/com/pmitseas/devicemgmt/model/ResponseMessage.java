package com.pmitseas.devicemgmt.model;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
@ToString
public class ResponseMessage implements Serializable {
    private String status;
    private String time;
    private byte[] data;
}
