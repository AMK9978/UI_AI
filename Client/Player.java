/**
 *
 * @author mdsinalpha
 */
 
public class Player 
{
    private final int id;
    private final String name;
    private Position position;
    
    public Player(int id)
    {
        this.id = id;
        name = null;
        position = null;
    }
    
    public Player(String name,Position position)
    {
        id = -1;
        this.name = name;
        this.position = position;
    }

    public int getId() 
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }

    public Position getPosition() 
    {
        return position;
    }

    public Position getFirstPosition() 
    {
        return Strategy.init_players()[id].getPosition();
    }
    
    public void setPosition(Position position)
    {
        this.position = position;
    }
}
