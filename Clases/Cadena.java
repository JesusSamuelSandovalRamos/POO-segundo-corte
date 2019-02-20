class Cadena { 
    public static void main(String[] args) { 
        //    B u r i e d  T r e a s u r e  C h e s t !
        //0 1 2 3 4 5 6 7 8 9 10111213141516171819202122232425
        String priratemessage ="  Buried  Treasure Chest! "; 
        
        System.out.println(priratemessage.charAt(8)); 
        System.out.println(priratemessage.charAt(9));
        System.out.println(priratemessage.charAt(10)); 
        System.out.println(priratemessage.charAt(12)); 

        //indexOf (String str)
        System.out.println("------.indexOf()-------");
        System.out.println(priratemessage.indexOf("i"));
        System.out.println(priratemessage.indexOf("e"));
        System.out.println(priratemessage.indexOf("sure"));

        //length()
        System.out.println(priratemessage.length());
    }
}