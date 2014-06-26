package cis.buisness;

import java.util.*;

public class Soap implements Comparable<Soap>
{
	private Date date;
	private String info;
	private String clientName;


	public Soap()
	{
		date = new Date();
	}


	public Soap( Date date )
	{
		this.date = date;
	}


	public Soap( String info, String clientName )
	{
		this.date = new Date();
		this.info = info;
		this.clientName = clientName;
	}


	public Soap( Date date, String info )
	{
		this.date = date;
		this.info = info;
	}


	@Override
	public String toString()
	{
		return info + " - " + date.toString();
	}


	@Override
	public int compareTo( Soap other )
	{
		return this.date.compareTo( other.getDate() );
	}


	public void setDate( String date )
	{
		this.date = new Date( date );
	}


	public void setInfo( String info )
	{
		this.info = info;
	}


	public Date getDate()
	{
		return date;
	}


	public String getInfo()
	{
		return info;
	}
	
	public String getClientName()
	{
		return clientName;
	}
}
