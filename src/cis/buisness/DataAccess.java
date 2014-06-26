package cis.buisness;

import java.util.ArrayList;

import app.Service;
import cis.persistance.DataBaseAccess;

public class DataAccess
{
	private DataBaseAccess database;


	public DataAccess()
	{
		database = Service.getDB();
	}


	public ArrayList<Client> getAllClients()
	{
		return database.getAllClients();
	}


	public Client readClient( String name )
	{
		return database.readClient( name );
	}


	public Client readClient( Client name )
	{
		return database.readClient( name );
	}


	public Boolean insertClient( Client client )
	{
		return database.insertClient( client );
	}


	public Boolean deleteClient( Client client )
	{
		return database.deleteClient( client );
	}


	public Boolean updateClient( Client updatedClient )
	{
		return database.updateClient( updatedClient );
	}


	public Boolean renameClient( String oldName, String newName )
	{
		return database.renameClient( oldName, newName );
	}


	public SoapBox getAllSoaps( String clienetName )
	{
		return database.getAllSoaps( clienetName );
	}


	public SoapBox readSoap( String clientName )
	{
		return database.readSoap( clientName );
	}


	public Boolean insertSoap( SoapBox soap )
	{
		return database.insertSoap( soap );
	}


	public Boolean deleteSoap( Soap soap )
	{
		return database.deleteSoap( soap );
	}


	public Boolean updateSoap( SoapBox soap )
	{
		return database.updateSoap( soap );
	}
}