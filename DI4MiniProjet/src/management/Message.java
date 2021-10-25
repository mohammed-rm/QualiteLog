package management;

/**
 * Message class to notify concrete observers
 *
 */
public class Message {

	/*********************************************************************/
	/***************************** ATTRIBUTES ****************************/
	/*********************************************************************/
	final String messageContent;

	/*********************************************************************/
	/****************************** BUILDERS *****************************/
	/*********************************************************************/
	/**
	 * Builder
	 * 
	 * @param m
	 */
	public Message(String m) {
		this.messageContent = m;
	}

	/*********************************************************************/
	/***************************** METHODS *******************************/
	/*********************************************************************/
	/**
	 * Message content for concrete observers
	 * 
	 * @return messageContent
	 */
	public String getMessageContent() {
		return messageContent;
	}
}