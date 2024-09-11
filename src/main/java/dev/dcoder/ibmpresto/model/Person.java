package dev.dcoder.ibmpresto.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Person {
    private Long id;
    private String season;
    private String city;
    private String date;
    private String matchType;
    private String playerOfMatch;


//    private String venue;
//    private String team1;
//    private String team2;
//    private String tossWinner;
//    private String tossDecision;
//    private String winner;
//    private String result;
//    private String resultMargin;
//    private Integer targetRuns;
//    private Integer targetOvers;
//    private Boolean superOver;
//    private String method;
//    private String umpire1;
//    private String umpire2;
}
