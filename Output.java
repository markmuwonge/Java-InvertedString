
public class Output {
      
    public void Arrange(String msg) {
        
        if (!(msg.substring(msg.length() - 1, msg.length()).equals(" "))) 
        {
            msg = msg + " "; 
        }
      
        String word = "";
        String msgInverted = "";
        
        for (int x = 0; x < msg.length(); x++)
        {
            if (msg.substring(x, x+1).equals(" "))
            {
                for (int y = word.length() -1; y >= 0; y--)
                {
                    msgInverted = msgInverted + word.substring(y, y+1);
                }
                
                msgInverted = msgInverted + " ";
                word = "";

            }
            else
            {
                word = word + msg.substring(x, x+1);
            }
        }   
        System.out.println(msgInverted);
    }
}
