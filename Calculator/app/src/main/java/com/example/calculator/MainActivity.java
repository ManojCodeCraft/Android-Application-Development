package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bsin,blog,bln,b01,b02,bcos,bac,bc,bbx,bd,btan,bm,bfx,bs,bsr,ba,bxs,bpi,bpoint,bequals;
    TextView tvmain,tvsec;
    String pi="3.14159";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.b0);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b5=findViewById(R.id.b5);
        b6=findViewById(R.id.b6);
        b7=findViewById(R.id.b7);
        b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);
        bsin=findViewById(R.id.bsin);
        blog=findViewById(R.id.blog);
        bln=findViewById(R.id.bln);
        b01=findViewById(R.id.b01);
        b02=findViewById(R.id.b02);
        bcos=findViewById(R.id.bcos);
        bac=findViewById(R.id.bAC);
        bc=findViewById(R.id.bC);
        bbx=findViewById(R.id.bx);
        bd=findViewById(R.id.bd);
        btan=findViewById(R.id.tan);
        bm=findViewById(R.id.bm);
        bfx=findViewById(R.id.fx);
        bs=findViewById(R.id.bs);
        bsr=findViewById(R.id.bsr);
        ba=findViewById(R.id.ba);
        bxs=findViewById(R.id.bxs);
        bpi=findViewById(R.id.bpi);
        bpoint=findViewById(R.id.bpoint);
        bequals=findViewById(R.id.be);

        tvmain=findViewById(R.id.tvmain);
        tvsec=findViewById(R.id.tvsec);


        //EventListeners
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"9");
            }
        });
        bsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"sin");
            }
        });
        blog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"log");
            }
        });
        bln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"ln");
            }
        });
        b01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"(");
            }
        });
        b02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+")");
            }
        });
        bcos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"cos");
            }
        });
        bac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(" ");
                tvsec.setText(" ");
            }
        });
        bc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String val=tvmain.getText().toString();
               val=val.substring(0,val.length()-1);
               tvmain.setText(val);
            }
        });
        bbx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"^"+"(-1)");
            }
        });
        bd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"÷");
            }
        });
        btan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"tan");
            }
        });
        bm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"×");
            }
        });
        bfx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val=Integer.parseInt(tvmain.getText().toString());
                int fact=factorial(val);
                tvmain.setText(String.valueOf(fact));
                tvsec.setText(val+"!");
            }
        });
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"-");
            }
        });
        bsr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tvmain.getText().toString();
                double r=Math.sqrt(Double.parseDouble(val));
                tvmain.setText(String.valueOf(r));
                tvsec.setText("√"+val);
            }
        });
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+"+");
            }
        });
        bxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double d=Double.parseDouble(tvmain.getText().toString());
                double square=d*d;
                tvmain.setText(String.valueOf(square));
                tvsec.setText(d+"²");
            }
        });
        bpi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvsec.setText(bpi.getText());
                tvmain.setText(tvmain.getText()+pi);
            }
        });
        bpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvmain.setText(tvmain.getText()+".");
            }
        });
        bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val=tvmain.getText().toString();
                String replacedstr=val
                        .replace('÷','/')
                        .replace('×','*');
                double result=eval(replacedstr);
                tvmain.setText(String.valueOf(result));
                tvsec.setText(val);
            }
        });

    }
    private int factorial(int n){
        return (n==1 || n==0) ?1:n*factorial(n-1);
    }
    private double eval(String str){//length=str.length
        return new Object(){
            int pos=-1,ch;
            void nextChar(){
                ch=(++pos <str.length())? str.charAt(pos):-1;
            }

            boolean eat(int charToEat){
                while(ch==' ') nextChar();
                if(ch==charToEat){
                    nextChar();
                    return true;
                }
                return  false;
            }
            double parse(){
                nextChar();
                double x=parseExpression();
                if(pos<str.length()) throw new RuntimeException("Unexpected: "+(char)ch);
                return x;
            }
            double parseExpression(){
                double x=parseTerm();
                for(; ;){
                    if(eat('+')) x=x+parseTerm();
                    else if(eat('-')) x=x-parseTerm();
                    else return x;
                }
            }
            double parseTerm(){
                double x=parseFactor();
                for(; ;){
                    if(eat('*')) x=x*parseFactor();
                    else if(eat('/')) x=x/parseFactor();
                    else return  x;

                }
            }
            double parseFactor(){
                if(eat('+')) return parseFactor();
                if(eat('-')) return parseFactor();

                double x;
                int startPos=this.pos;
                if(eat('(')){
                    x=parseExpression();
                    eat(')');
                }else if((ch>='0' && ch<='9')|| ch=='.'){
                    while ((ch>='0' && ch<='9')|| ch=='.') nextChar();
                    x=Double.parseDouble(str.substring(startPos,this.pos));
                }else if(ch >='a' && ch<='z'){
                    while(ch >='a' && ch<='z') nextChar();
                    String func=str.substring(startPos,this.pos);
                    x=parseFactor();
                    if(func.equals("sqrt")) x=Math.sqrt(x);
                    else if(func.equals("sin")) x=Math.sin(Math.toRadians(x));
                    else if(func.equals("cos")) x=Math.cos(Math.toRadians(x));
                    else if(func.equals("tan")) x=Math.tan(Math.toRadians(x));
                    else if(func.equals("log")) x=Math.log10(x);
                    else if(func.equals("ln")) x=Math.log(x);
                    else throw new RuntimeException("Unknown function: "+func);
                }else{
                    throw new RuntimeException("Unexpected: "+(char) ch);
                }
                if(eat('^')) x=Math.pow(x,parseFactor());

                return x;
            }
        }.parse();
    }
}