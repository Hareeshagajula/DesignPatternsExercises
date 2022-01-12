package com.epam.projects.strategy;

public class Demo {
	public static void main(String[] args) {
		PhotoShareContext context = new PhotoShareContext();
		context.setPhotoShare(new EmailPhotoShare());
		context.generatePhotoShare("Email");
	}

}
