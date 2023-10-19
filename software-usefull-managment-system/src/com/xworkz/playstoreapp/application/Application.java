package com.xworkz.playstoreapp.application;

import lombok.*;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Application {


    private int applicationId;
    private String applicationName;
    private double applicationSizeInMb;
    private String applicationType;
    private String appVerstion;


}
