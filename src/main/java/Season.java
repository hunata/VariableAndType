public enum Season {
    SPRING("Xuân"),
    SUMMER("Mùa hè đó pa, gọi gì mà gọi quài ><");

    String value;

    Season(String value){
        this.value = value;
    }
    public String getValue(){
        return this.value;
    }
}
