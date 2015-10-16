package fr.iutvalence.info.projet.s2.g17.photop;

/**
 * Represents an Object, an Object can be an image or a decoration
 * an Object has got a specific position and a specific dimension
 * @author Jean-Baptiste, Mathie
 */
public abstract class PhotopObject
{

	private Position objectPosition;
	
	private int objectDimension;
	
	
	/**
	 * the constructor of an object
	 * @param objectPosition the coordinate of the object
	 * @param objectDimension the dimension of the object
	 */
	protected PhotopObject(Position objectPosition, int objectDimension)
	{
		this.objectPosition = objectPosition;
		this.objectDimension = objectDimension;
	}
	
	public Position getObjectPosition()
	{
		return objectPosition;
	}
	
	public void setObjectPosition(Position objectPosition)
	{
		this.objectPosition = objectPosition;
	}
	
	public int getObjectDimension()
	{
		return objectDimension;
	}
	
	public void setObjectDimension(int objectDimension)
	{
		this.objectDimension = objectDimension;
	}
}
