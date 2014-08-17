package gs.tuticorinairport;

import android.support.v7.app.ActionBarActivity;
import gs.tuticorinairport.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;




public class MainActivity extends ActionBarActivity 
{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//getActionBar().hide();
	}

	public void airportInfo(View view){
	      Intent intent = new Intent(this,gs.tuticorinairport.AirportInfoMainActivity.class);
	      startActivity(intent);
	}
	public void toandfromInfo(View view){
	      Intent intent = new Intent(this,gs.tuticorinairport.ToandfromInfoMainActivity.class);
	      startActivity(intent);
	}
	
	public void facilitiesInfo(View view){
	      Intent intent = new Intent(this,gs.tuticorinairport.FacilitiesInfoMainActivity.class);
	      startActivity(intent);
	}
	
	public void flightInfo(View view){
	      Intent intent = new Intent(this,gs.tuticorinairport.FlightInfoMainActivity.class);
	      startActivity(intent);
	}
   
}
