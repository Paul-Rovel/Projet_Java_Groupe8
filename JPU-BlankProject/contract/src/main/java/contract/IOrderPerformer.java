package contract;


import java.io.IOException;
/**
 * <h1>The Interface IOrderPerformer.</h1>
 * 
 * @author Paul-Kamga
 * @version 0.1
 */

public interface IOrderPerformer {

	
    /**
     * Order perform.
     *
     * @param userOrder
     *            the user order
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
	 void orderPerform(ControllerOrder controllerOrder) throws IOException;
	
	 
}
