package com.epam.projects.strategy;

public class PhotoShareContext {
	private PhotoShare photoshare;

	public void setPhotoShare(PhotoShare rGenerator) {
		this.photoshare = rGenerator;
	}

	public void generatePhotoShare(String mediumType) {
		photoshare.sharephotos(mediumType);
	}

}
