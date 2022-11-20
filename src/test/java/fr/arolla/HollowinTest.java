package fr.arolla;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HollowinTest {
 @Test
    public void should_return_thankYou_when_3_children_have_3_paquets_with_2_candies_each_of_them(){
     //given
     List<String> packetsOfItems1 = List.of("candy","apple","candy");
     List<String> packetsOfItems2 = List.of("candy","candy");
     List<String> packetsOfItems3 = List.of("candy","candy");
     List<List<String>> listOfPaquets = List.of(packetsOfItems1,packetsOfItems2,packetsOfItems3);
     //when

     String result = Hollowin.showHolowinResponse(3,listOfPaquets);
     //then
     assertThat(result).isEqualTo("Thank you, strange uncle!");
 }
 @Test
 public void should_return_trick_or_treat_when_3_children_have_3_paquets_where_there_was_bumb(){
  //given
  List<String> packetsOfItems1 = List.of("candy","apple","candy");
  List<String> packetsOfItems2 = List.of("candy","candy");
  List<String> packetsOfItems3 = List.of("candy","bomb","candy");
  List<List<String>> listOfPaquets = List.of(packetsOfItems1,packetsOfItems2,packetsOfItems3);
  //when

  String result = Hollowin.showHolowinResponse(3,listOfPaquets);
  //then
  assertThat(result).isEqualTo("Trick or treat!");
  }
 @Test
 public void should_return_trick_or_treat_when_3_children_have_2_paquets(){
  //given
  List<String> packetsOfItems1 = List.of("candy","apple","candy");
  List<String> packetsOfItems2 = List.of("candy","candy");
  List<List<String>> listOfPaquets = List.of(packetsOfItems1,packetsOfItems2);
  //when

  String result = Hollowin.showHolowinResponse(3,listOfPaquets);
  //then
  assertThat(result).isEqualTo("Trick or treat!");
 }

}
