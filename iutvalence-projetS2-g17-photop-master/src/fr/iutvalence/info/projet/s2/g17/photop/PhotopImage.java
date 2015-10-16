package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an image :
 * an image has a name, an extension, an url and is saved or not
 * @author bertholm
 */
public class PhotopImage extends PhotopObject
{
	

	private String imageName;
	
	private String imageExtension;
	
	private boolean imageIsSaved;
	
	private String imagePath;
	
	
	/**
	 * creates an image
	 * @param name the name of the image
	 * @param imageExtension its extension
	 * @param isSaved saving state
	 * @param path the path of the image
	 * @param positionOfTheImage positionOfTheImage
	 * @param dimensionOfTheImage dimensionOfTheImage
	 */
	public PhotopImage(String path,String name, String imageExtension, boolean isSaved, Position positionOfTheImage, int dimensionOfTheImage)
	{
		super(positionOfTheImage,dimensionOfTheImage);
		this.imagePath = path;
		this.imageName = name;
		this.imageExtension = imageExtension;
		this.imageIsSaved = isSaved;
	}
	
	
	
}
