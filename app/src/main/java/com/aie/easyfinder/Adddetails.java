package com.aie.easyfinder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class Adddetails extends AppCompatActivity {
    EditText etName,etMobile,etEmail,etAddress,etStreet,etCity;
    Button btSub,it;

    AwesomeValidation awesomeValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adddetails);

        etName = findViewById(R.id.et_name);
        etMobile = findViewById(R.id.et_number);
        etEmail = findViewById(R.id.et_email);
        etAddress = findViewById(R.id.et_address);
        etStreet = findViewById(R.id.et_street);
        etCity = findViewById(R.id.et_city);
        btSub = findViewById(R.id.bt_submit);

        //validation

        awesomeValidation = new AwesomeValidation(ValidationStyle.BASIC);

        //add validation

        awesomeValidation.addValidation(this.R.id.et_name,
                RegexTemplate.NOT_EMPTY,R.string.invalid_name);

        awesomeValidation.addValidation(this.R.id.et_number,
                "[5-9]{1}[0-9]{9}$",R.string.invalid_number);

        awesomeValidation.addValidation(this.R.id.et_email,
                Patterns.EMAIL_ADDRESS,R.string.invalid_email);

        awesomeValidation.addValidation(this.R.id.et_address,
                RegexTemplate.NOT_EMPTY,R.string.invalid_address);


        awesomeValidation.addValidation(this.R.id.et_street,
                RegexTemplate.NOT_EMPTY,R.string.invalid_street);

        awesomeValidation.addValidation(this.R.id.et_city,
                RegexTemplate.NOT_EMPTY,R.string.invalid_city);

    }
}
