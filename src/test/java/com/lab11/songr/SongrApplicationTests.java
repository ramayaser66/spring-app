package com.lab11.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SongrApplicationTests {

	@Test void testAlbumsGetters(){
		Album testAlbums1 = new Album("Rare", "Selena Gomes",3, 41.53, "https://images-na.ssl-images-amazon.com/images/I/51xbm7CXnfL._AC_SX425_.jpg");

		String expected = "Selena Gomes";

		assertThat(expected).isEqualTo(testAlbums1.getArtist());
	}


	@Test void testAlbumsSetters(){
		Album testAlbums1 = new Album("Rare", "Selena Gomes",3, 41.53, "https://images-na.ssl-images-amazon.com/images/I/51xbm7CXnfL._AC_SX425_.jpg");

		String expected = "Selena";
		testAlbums1.setArtist(expected);

		assertThat(expected).isEqualTo(testAlbums1.getArtist());
	}


	@Test void testAlbumsConstructor(){

		Album testAlbums1 = new Album("Rare", "Selena Gomes",3, 41.53, "https://images-na.ssl-images-amazon.com/images/I/51xbm7CXnfL._AC_SX425_.jpg");

		String expected = "Album{title='Rare', artist='Selena Gomes', songCount=3, length=41.53, imageUrl='https://images-na.ssl-images-amazon.com/images/I/51xbm7CXnfL._AC_SX425_.jpg'}";
		assertThat(expected).isEqualTo(testAlbums1.toString());
	}

	







}
