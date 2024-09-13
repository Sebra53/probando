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

        LatLng Unach00 = new LatLng(-36.638270, -71.997210);
        LatLng Unach01 = new LatLng(-36.637071, -71.995432);
        LatLng Unach02 = new LatLng(-36.635186, -71.996880);
        LatLng Unach03 = new LatLng(-36.589673,-72.082447);

        mMap.addMarker(new MarkerOptions().position(Unach00).title("Entrada Unach"));
        mMap.addMarker(new MarkerOptions().position(Unach01).title("LC1"));
        mMap.addMarker(new MarkerOptions().position(Unach02).title("Dormitorio de M"));
        mMap.addMarker(new MarkerOptions().position(Unach03).title("IPVG"));

        LatLng london = new LatLng(-36.589673,-72.082447);

// Mover la cámara a la ubicación de Londres
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(london));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(london, 10));
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(Unach03));

        mMap.setMinZoomPreference(10.0f);
        mMap.setMaxZoomPreference(50.0f);

    }
}