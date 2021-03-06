package course.examples.UI.RadioGroup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioGroupActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView tv = (TextView) findViewById(R.id.textView);
        final RadioButton choice1 = (RadioButton) findViewById(R.id.choice1);
        final RadioButton choice2 = (RadioButton) findViewById(R.id.choice2);
        final RadioButton choice3 = (RadioButton) findViewById(R.id.choice3);

        final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio_group);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton currentlySelected = null;
                CharSequence choiceText = "";
                switch (i) {
                    case R.id.choice1: {
                        currentlySelected = choice1;
                        choiceText = choice1.getText();
                        break;
                    }
                    case R.id.choice2: {
                        currentlySelected = choice2;
                        choiceText = choice2.getText();
                        break;
                    }
                    case R.id.choice3: {
                        currentlySelected = choice3;
                        choiceText = choice3.getText();
                        break;
                    }
                }
                if (null != currentlySelected) {
                    tv.setText(choiceText + " " + getString(R.string.is_chosen_string));
                }
            }
        });
    }
}