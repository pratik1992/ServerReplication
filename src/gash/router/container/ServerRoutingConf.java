package gash.router.container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import gash.router.container.ServerRoutingConf.RoutingConf.RoutingEntry;


public class ServerRoutingConf{
	
	
private List<RoutingConf> routeObjects;
	
public void addRouteObjectsEntry(RoutingConf routingConf)
	  {
		  if (routeObjects==null)
		  {
			  routeObjects=new ArrayList<RoutingConf>();
			  
		  }
		  else routeObjects.add(routingConf);
	  }

public List<RoutingConf> getRouteObjectsEntry()
{
	return routeObjects;
}
	
	
@XmlRootElement(name = "conf")
@XmlAccessorType(XmlAccessType.FIELD)
	public static class RoutingConf {
		
		  private List<RoutingEntry> routing;
		  
		  public int port;
		  
		  
		  
		  public HashMap<String,String> storeRoutingObjects()
		  {
			   HashMap<String,String> map=new HashMap();
			   
			   if (routing !=null)
			   {
				   for(RoutingEntry routingEntry  : routing )
				   {
					   map.put(routingEntry.path, routingEntry.clazz);
				   }
				   
			   }
			   
			   return map;
		  }
		  
		  
		  
		  public void addEntry(RoutingEntry entry)
		  {
			  if (routing==null)
			  {
				  routing=new ArrayList<RoutingEntry>();
				  
			  }
			  else routing.add(entry);
		  }
		  
		  public int getPort()
		  {
			  return port;
		  }
		  
		  public void setPort(int port)
		  {
			  this.port=port;
		  }
		   
@XmlRootElement(name = "entry")
@XmlAccessorType(XmlAccessType.PROPERTY)		
 public static final class RoutingEntry{
			   
			   private String path;
			   private String clazz;
			   
			   public RoutingEntry()
			   {
				   
			   }
			   
			   public RoutingEntry(String path, String clazz)
			   {
				   this.path=path;
				   this.clazz=clazz;
				   
			   }
			   
			   public String getPath()
			   {
				   return path;
			   }
			   
			   public void setPath(String path)
			   {
				   this.path=path;
			   }
			   
			   public String getClazz()
			   {
				   return clazz;
			   }
			   
			   public void setClazz(String clazz)
			   {
				   this.clazz=clazz;
			   }
			   
			   
		   }
		}
	
}


	
	
	
	
	
	

