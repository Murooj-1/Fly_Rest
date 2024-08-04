/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Sarah
 */

public class RevHotel {

    //obj
    private bookHotel BookHotel;
    

    //constructor
    public RevHotel(String to) {
        if (to == "RUH") {
            BookHotel = new RiyadhHotels();
        } else if (to == "KWI") {
            BookHotel = new KuwaitHotels();
        } else if (to == "FCO") {
            BookHotel = new RomeHotels();
        } else if (to == "CDG") {
            BookHotel = new ParisHotels();
        }
    }

    
    
    //methods: to access attirbutes in abstract class (BookHotel)
    public double getHotelPrice() {
        return BookHotel.getHotelPrice();
    }

    public int getroomNum() {
        return BookHotel.getRoomNum();
    }

    public String getHotelName() {
        return BookHotel.getHotelName();
    }
    
    public String gethotelLocation() {
        return BookHotel.getHotelLocation();
    }

}//End class
