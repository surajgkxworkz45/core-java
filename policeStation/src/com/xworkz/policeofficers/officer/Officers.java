package com.xworkz.policeofficers.officer;
import lombok.*;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Officers {


    private  int officerId;
    private String officerName;
    private String officerPost;
    private int age;
    private String gender;
    private String location;
}
