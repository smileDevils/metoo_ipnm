package com.metoo.ipnm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Accessors
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZabbixDto {

    private String jsonrpc;
    private String method;
    private Object params;
    private String auth;
    private Integer id;
}
