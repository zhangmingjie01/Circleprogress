/**
 * MainActivity.java [V 1.0.0]
 * classes :��com.caryfish.circleprogress.MainActivity
 * ���  create at 2014-8-18 ����4:20:40
 */
package com.android.circleprogress;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * com.caryfish.circleprogress.MainActivity
 * @author caryfish  <br/>
 * create at 2014-8-18 ����4:20:40
 */
public class MainActivity extends Activity{
		@Override
		protected void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			setContentView(R.layout.main);

			SeekCircle seekCircle = (SeekCircle)findViewById(R.id.seekCircle);
			seekCircle.setOnSeekCircleChangeListener(new SeekCircle.OnSeekCircleChangeListener() {
				
				@Override
				public void onStopTrackingTouch(SeekCircle seekCircle)
				{}
				
				@Override
				public void onStartTrackingTouch(SeekCircle seekCircle)
				{}
				
				@Override
				public void onProgressChanged(SeekCircle seekCircle, int progress, boolean fromUser)
				{
					updateText();
				}
			});

			updateText();
		}
		
		private void updateText()
		{
			SeekCircle seekCircle = (SeekCircle)findViewById(R.id.seekCircle);
			TextView textProgress = (TextView)findViewById(R.id.textProgress);

			if (textProgress != null && seekCircle != null)
			{
				int progress = seekCircle.getProgress();
				textProgress.setText(Integer.toString(progress) + "%");
			}
		}

}
