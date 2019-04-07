public enum MonthsEnum {
    JANUARY(31,"01 сычня -новий рік. 07 січня Різдво Христове. ","Січень"),
    FEBRUARY(28,"14 лютого День закоханих.","Лютий"),
    MARCH(31,"08 березня Міжнароний жіночий день.","Березень"),
    APRIL(30,"28 квітня Великдень.","Квітень"),
    MAY(31,"01 травня День праці.","Травень"),
    JUNE(30,"09 червня День Перемоги. 28 червня День Конституції України.","Червень"),
    JULY(31,"","Липень"),
    AUGUST(31,"24 серпня День Незалежності України.","Серпень"),
    SEPTEMBER(30,"","Вересень"),
    OCTOBER(31,"14 Жовтня День Захисника України","Жовтень"),
    NOVEMBER(30,"","Листопад"),
    DECEMBER(31,"","Грудень");
int day;
String holidays;
String translation;
    MonthsEnum(int day,String holidays,String translation){
        this.day = day;
            this.holidays = holidays;
            this.translation = translation;
    }
    public  String getTranslation(){
        return translation;
    }
    public String getHolidays(){
        return holidays;
    }
    public int getDay(){
        return day;
    }
}

