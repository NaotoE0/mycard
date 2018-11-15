/*
 * MyCard API
 * Get random card.
 *
 * OpenAPI spec version: 0.1.0
 * Contact: dummy@example.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



import javax.validation.constraints.*;




/**
 * CardModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaJerseyServerCodegen", date = "2018-11-15T13:45:37.038Z[GMT]")
public class CardModel   {
  
    
    
  /**
   * Suit of card parameter
   */
  public enum SuitEnum {
    
    
        
            
    SPADE("spade"),
    
            
    HEART("heart"),
    
            
    DAIMOND("daimond"),
    
            
    CLUB("club"),
    
            
    JOKER("joker");
            
        
    

    private String value;

    SuitEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SuitEnum fromValue(String text) {
      for (SuitEnum b : SuitEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

      
  
  @JsonProperty("suit")
  
  
  
  
  private SuitEnum suit = null;
  

  
    
      
  
  @JsonProperty("number")
  
  
  
  
  private Integer number = null;
  

  
  
  
  public CardModel suit(SuitEnum suit) {
    this.suit = suit;
    return this;
  }
  
  

  
  /**
  
   * Suit of card parameter
  
  
  
  
   * @return suit
   **/
 
  
  @JsonProperty("suit")
  
  @ApiModelProperty(value = "Suit of card parameter")

  public SuitEnum getSuit() {
    return suit;
  }
  

  public void setSuit(SuitEnum suit) {
    this.suit = suit;
  }
  

  
  
  public CardModel number(Integer number) {
    this.number = number;
    return this;
  }
  
  

  
  /**
  
   * Number of card between 1 to 13
  
  
  
   * minimum: 1
  
  
   * maximum: 13
  
   * @return number
   **/
 
  
  @JsonProperty("number")
  
  @ApiModelProperty(value = "Number of card between 1 to 13")

 @Min(1) @Max(13)  public Integer getNumber() {
    return number;
  }
  

  public void setNumber(Integer number) {
    this.number = number;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardModel cardModel = (CardModel) o;
    return Objects.equals(this.suit, cardModel.suit) &&
        Objects.equals(this.number, cardModel.number);
  }

  @Override
  public int hashCode() {
    return Objects.hash(suit, number);
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardModel {\n");
    
    sb.append("    suit: ").append(toIndentedString(suit)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}



