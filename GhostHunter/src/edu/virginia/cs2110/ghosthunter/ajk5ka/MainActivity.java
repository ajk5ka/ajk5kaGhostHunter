package edu.virginia.cs2110.ghosthunter.ajk5ka;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentTransaction;
import android.view.Menu;
import android.widget.LinearLayout;

public class MainActivity extends MapActivity {
	
	LinearLayout linearLayout;
	MapView mapView;
	private GoogleMap mMap;
	private MapFragment mMapFragment;

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
	
	private void setUpMapIfNeeded() {
	    // Do a null check to confirm that we have not already instantiated the map.
	    if (mMap == null) {
	        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
	                            .getMap();
	        // Check if we were successful in obtaining the map.
	        if (mMap != null) {
	            // The Map is verified. It is now safe to manipulate the map.
	        }
	    }
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mMapFragment = MapFragment.newInstance();
		 FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
		 fragmentTransaction.add(R.id.map, mMapFragment);
		 fragmentTransaction.commit();
		 mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
//		mapView = (MapView) findViewById(R.id.mapview);
//		mapView.setBuiltInZoomControls(true);
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	
//	
//	}

}
