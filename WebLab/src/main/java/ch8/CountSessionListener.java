package ch8;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Application Lifecycle Listener implementation class CountSessionListener
 *
 */
@WebListener
public class CountSessionListener implements HttpSessionAttributeListener {

	int sessionCount;
    /**
     * Default constructor. 
     */
    public CountSessionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         sessionCount++;
         System.out.println("현재 접속자는 "+sessionCount+"명 입니다.");
    }

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         sessionCount--;
         System.out.println("현재 접속자는 "+sessionCount+"명 입니다.");
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    }
	
}
