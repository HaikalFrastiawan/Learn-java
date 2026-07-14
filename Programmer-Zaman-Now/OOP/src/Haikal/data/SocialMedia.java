package Haikal.data;

 class SocialMedia {
     String name;
}

//tidak bisa di turunkan
 class Facebook extends SocialMedia {
     final void login(String username, String password){

     }
}
class FakeFacebook extends  Facebook{
     //error klo void loginnya final
}

//class FakeFacebook extends Facebook{} //error
