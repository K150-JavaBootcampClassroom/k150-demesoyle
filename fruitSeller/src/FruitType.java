public enum FruitType {//isimler sabit olduğundan meyvelerin çeşidi enum olarak hazırladım
    APPLE("Elma"),// gelen değişkenlerin gösterimi için stringelr atadım
    PEAR("Armut"),
    CHERRY("Kiraz");
    String type; // bu ve alttaki kısımlar strin değer dönülmesi için gerekli metotlar
     FruitType(String type){
         this.type=type;
     }
    public String getType(){
         return type;

    }


}
