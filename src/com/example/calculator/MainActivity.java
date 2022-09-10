package com.example.calculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;


public class MainActivity extends Activity  {
	
	Button add,sub,mul,div,dot,clear,one,two,three,four,five,six,seven,eight,nine,zero,equal,per;
	EditText edit;
	
	boolean addition,subtraction,multiplication,division,decimal,remainder;
	
	float value1 = 0, value2 = 0;
	int v1=0, v2=0;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //calling the function
        setviews();
        
        //event registration
        //zero
        zero.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				edit.append("0");
				
			}
		});
        //one
        one.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "1");
			}
		});
        
        two.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "2");
			}
		});
        
        three.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "3");
			}
		});
        
        four.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "4");
			}
		});
        
        five.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "5");
			}
		});
        
        six.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "6");
			}
		});
        
        seven.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "7");
			}
		});
        
        eight.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "8");
			}
		});
        
        nine.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText(edit.getText() + "9");
			}
		});
        
        add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(edit.getText().length()!=0)
				{
					value1 = Float.parseFloat(edit.getText() + "");				
					addition = true;
					decimal = false;
					edit.setText(null);
				}
			}
		});
        
        sub.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(edit.getText().length()!=0)
				{
					value1 = Float.parseFloat(edit.getText() + "");
					subtraction = true;
					decimal = false;
					edit.setText(null);
				}
			}
		});
        
        mul.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(edit.getText().length()!=0)
				{
					value1 = Float.parseFloat(edit.getText() + "");
					multiplication = true;
					decimal = false;
					edit.setText(null);
				}
			}
		});
        
        div.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(edit.getText().length()!=0)
				{
					value1 = Float.parseFloat(edit.getText() + "");
					division = true;
					decimal = false;
					edit.setText(null);
				}
			}
		});
        
        per.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(edit.getText().length()!=0)
				{
					value1 = Float.parseFloat(edit.getText() + "");
					remainder = true;
					decimal = false;
					edit.setText(null);
				}
			}
		});
        
        //equal to button
        equal.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(addition || subtraction || multiplication || division || remainder)
				{
					value2 = Float.parseFloat(edit.getText() + "");
				}
				
				if(addition)
				{
					edit.setText(value1 + value2 + "");
					addition = false;
				}
				if(subtraction)
				{
					edit.setText(value1 - value2 + "");
					subtraction = false;
				}
				if(multiplication)
				{
					edit.setText(value1 * value2 + "");
					multiplication = false;
				}
				if(division)
				{
					edit.setText(value1 / value2 + "");
					division = false;
				}
				if(remainder)
				{
					edit.setText(value1 % value2 + "");
					remainder = false;
				}
			}
		});
        
        clear.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				edit.setText("");
				value1 = 0;
				value2 = 0;
			}
		});
        
        dot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(decimal)
				{
					
				}
				else
				{
					edit.setText(edit.getText() + ".");
					decimal = true;
				}
					
			}
		});
    }
    
    public void setviews()
    {
    	//buttons
    	add = (Button)findViewById(R.id.plus);
        sub = (Button)findViewById(R.id.minus);
        mul = (Button)findViewById(R.id.mul);
        div = (Button)findViewById(R.id.div);
        dot = (Button)findViewById(R.id.dot);
        clear = (Button)findViewById(R.id.clear);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        zero = (Button)findViewById(R.id.zero);
        equal = (Button)findViewById(R.id.equal);
        per = (Button)findViewById(R.id.per);
        
        //editText
        edit = (EditText)findViewById(R.id.editText1);
    }


	
}
