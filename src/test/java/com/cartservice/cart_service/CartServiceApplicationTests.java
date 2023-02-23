package com.cartservice.cart_service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CartServiceApplicationTests {

	// @Mock
	// private CartRepository cartRepository;



	@Test
	void contextLoads() {
	}


	@Test
	void getAndSetThingID(){
		Cart cut = new Cart();
		Long myId = 1L;
		cut.setId(myId);
		assertEquals(myId, cut.getId());
	}

	@Test
	void getAndSetThingName(){
	Cart cut = new Cart();
		String myName = "table";
		cut.setName(myName);
		assertEquals(myName, cut.getName());
	}

	@Test
	void getAndImage(){
	Cart cut = new Cart();
		String myImage = "table";
		cut.setImage(myImage);
		assertEquals(myImage, cut.getImage());
	}

	

	// private Long id;
    // private String image;
    // private String name;
    // private Long quantity;
    // private String price;
    // private Long totalprice;

	@Test
	void getAndSetQuantity(){
		Cart cut = new Cart();
		Long myquantity = 2L;
		cut.setQuantity(myquantity);
		assertEquals(myquantity, cut.getQuantity());
	}

	@Test
	void getAndSetPrice(){

		Cart cut = new Cart();
		String myPrice = "2";
		cut.setPrice(myPrice);
		
		assertEquals(myPrice, cut.getPrice());

	}

	@Test
	void getAndSetTotalPrice(){
		Cart cut = new Cart();
		Long myTotalPrice = 22L;
		cut.setTotalprice(myTotalPrice);
		assertEquals(myTotalPrice, cut.getTotalprice());
	}

	
	@Test
	void builderCart(){
		Long myId = 1L;
		String myName = "table";
		Long myQuantity = 2L;
		String myPrice = "2";
		Long myTotalPrice = 22L;
		String myImage = "table";


		Cart cut = Cart.builder()
							.id(myId)
							.name(myName)
							// .description(myDescription)
							.image(myImage)
							.totalprice(myTotalPrice)
							.quantity(myQuantity)
							.build();
		assertEquals(myId, cut.getId());
		assertEquals(myName, cut.getName());
		// assertEquals(myDescription, cut.getDescription());
		assertEquals(myQuantity, cut.getQuantity());
		// assertEquals(myPrice, cut.getTotalprice());
		assertEquals(myImage, cut.getImage());


	}

	// @Test
	// void canSaveAThing(){
	// 	Long myId = 1L;
	// 	String myName = "table";
	// 	Long myQuantity = 2L;
	// 	String myPrice = "2";
	// 	Long myTotalPrice = 22L;
	// 	String myImage = "table";


	// 	Cart cut = Cart.builder()
	// 						.id(myId)
	// 						.name(myName)
	// 						// .description(myDescription)
	// 						.image(myImage)
	// 						.totalprice(myTotalPrice)
	// 						.quantity(myQuantity)
	// 						.price(myPrice)
	// 						.build();
	// 	given(.findByName(myName)).willReturn(Optional.empty());
	// 	given(thingRepository.save(cut)).willReturn(cut);
	// 	Thing savedThing = thingServiceImpl.saveThing(cut);
	// 	assertNotNull(savedThing);
	// }



}
