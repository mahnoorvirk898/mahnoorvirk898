public void UpdateQuality(){
	for (var i = 0; i < Items.Count; i++){
		if (Items[i].Name != "Aged Brie" && Items[i].Name != "Backstage passes to a TAFKAL80ETC concert"){
			DecrementQualityForNormalItems(i);
		}
		else{
			UpdateQualityForWellItems(i);
		}

		if (Items[i].Name != "Sulfuras, Hand of Ragnaros"){
			Items[i].SellIn = Items[i].SellIn - 1;
		}

		if (Items[i].SellIn < 0){
			UpdateQualityForOutOfDateItems(i);
		}
	}



  private void DecrementQualityForNormalItems(int i){
   if(Items[i].Quality > 0){
    if(Items[i].Name != "Sulfuras,Hand of Ragnaros"){
       Items[i].Quality = Items[i].Quality -1;
    }
}
}//decrementquality



 private void IncrementQuality(int i){
  if (Items[i].Quality < 50) {
  	Items[i].Quality = Items[i].Quality +1;
  }
 }//incrementquality



 private void UpdateQualityForWellItems(int i){
  IncrementQuality(i);
  if (Items[i].Name == "Backstage passes to a TAFKAL80ETC concert") {
  	  if (Items[i].SellIn < 11) {
  	 IncrementQuality(i);
  }
  if (Items[i].SellIn < 6) {
  	IncrementQuality(i);

  }
}
 }



private void UpdateQualityForOutOfDateItems(int i){
 if (Items[i].Name != "Aged Brie") {
 	if (Items[i].Name !="Backstage passes to a TAFKAL80ETC concert") {
 		DecrementQualityForNormalItems(i);
 	}
 	else{
 		Items[i].Quality = Items[i].Quality - Items[i]
 	}

 }
 else{
 	Items[i].Quality = Items[i].Quality - Items[i]
 }
}

}//Update Quality