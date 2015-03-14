package hackathon.emirates.cheaproute;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


public class DetailsInputForm extends ActionBarActivity implements OnItemSelectedListener {
    Spinner city1, city2, city3;
    Spinner days1, days2, days3;
    private String[] cities = { "Cupcake", "Donut", "Eclair", "Froyo",
            "Gingerbread", "HoneyComb", "IceCream Sandwich", "Jellybean",
            "kitkat" };

    private String[] days = {"1","2","3","4","5","6","7","8","9"};

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_input_form);
        System.out.println(cities.length);
        System.out.println(days.length);

        city1 = (Spinner) findViewById(R.id.city1);
        city2 = (Spinner) findViewById(R.id.city2);
        city3 = (Spinner) findViewById(R.id.city3);
        days1 = (Spinner) findViewById(R.id.days1);
        days2 = (Spinner) findViewById(R.id.days2);
        days3 = (Spinner) findViewById(R.id.days3);

        ArrayAdapter<String> adapter_city= new ArrayAdapter<String>(this,
            android.R.layout.simple_spinner_item, cities);
        adapter_city.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        ArrayAdapter<String> adapter_days= new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, days);
        adapter_days.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        city1.setAdapter(adapter_city);
        city1.setOnItemSelectedListener(this);
        city2.setAdapter(adapter_city);
        city2.setOnItemSelectedListener(this);
        city3.setAdapter(adapter_city);
        city3.setOnItemSelectedListener(this);

        days1.setAdapter(adapter_days);
        days1.setOnItemSelectedListener(this);
        days2.setAdapter(adapter_days);
        days2.setOnItemSelectedListener(this);
        days3.setAdapter(adapter_days);
        days3.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view, int position,
            long id) {
        Spinner spin = (Spinner) parent;
        spin.setSelection(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
            // TODO Auto-generated method stub

    }
}
