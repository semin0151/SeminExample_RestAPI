package com.example.restapiexample;

public class WeatherString {
    private String[] stag_start = {"강수형태 : ", "습도 : ", "1시간 강수량 : ", "기온 : "};
    private int num;
    private String str;

    WeatherString(int num, String str){
        this.num = num;
        this.str = str;
    }

    public String getStr(){
        switch(num){
            case 0:
                return stag_start[num] + getPTY();
            case 1:
                return stag_start[num] + str + "%\n";
            case 2:
                return stag_start[num] + str +"mm\n";
            case 3:
                return stag_start[num] + str + "℃\n";
        }


        return stag_start[num] + str;
    }

    public String getPTY(){
        switch(str){
            case "0":
                return "없음\n";
            case "1" :
                return "비\n";
            case "2" :
                return "비/눈\n";
            case "3" :
                return "눈\n";
            case "4" :
                return "소나기\n";
            case "5" :
                return "빗방울\n";
            case "6" :
                return "빗방울/눈날림\n";
            case "7" :
                return "눈날림\n";
        }

        return "";
    }
}
