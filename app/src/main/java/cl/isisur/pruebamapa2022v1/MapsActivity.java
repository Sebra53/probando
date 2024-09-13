package cl.isisur.pruebamapa2022v1;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import cl.isisur.pruebamapa2022v1.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng UDEC = new LatLng(-36.598619, -72.087786);
        LatLng IPVG = new LatLng(-36.589809, -72.082673);
        LatLng VIVO = new LatLng(-36.588756, -72.077756);
        mMap.addMarker(new MarkerOptions().position(UDEC).title("UDEC"));
        mMap.addMarker(new MarkerOptions().position(VIVO).title("VIVO"));
        mMap.addMarker(new MarkerOptions().position(IPVG).title("IPVG"));


        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(IPVG,100));


        //mMap.setMinZoomPreference(10.0f);
        //mMap.setMaxZoomPreference(50.0f);

    }
}