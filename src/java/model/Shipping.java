/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sown
 */
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


/**
 *
 * @author Sown
 */
@Builder
@Getter
@Setter
@ToString
public class Shipping {
    private int ShippingID;
    private String name;
    private String phone;
    private String address;
}
