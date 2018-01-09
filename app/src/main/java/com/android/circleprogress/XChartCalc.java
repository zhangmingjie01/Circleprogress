/**
 * XChartCalc.java [V 1.0.0]
 * classes :��com.example.youtingdemo.util.XChartCalc
 * ���  create at 2014-7-18 ����3:30:07
 */
package com.android.circleprogress;

/**
 * com.example.youtingdemo.util.XChartCalc
 * @author ���   <br/>
 * create at 2014-7-18 ����3:30:07<br/>
 * ��ͼλ�ü���
 */
public class XChartCalc {
	
	//Positionλ��  
    private float posX = 0.0f;  
    private float posY = 0.0f;  
      
    public XChartCalc()  
    {  
          
    }  
              
      
    //��Բ�����꣬�뾶�����νǶȣ������������������Բ��������xy����  
    public void CalcArcEndPointXY(float cirX, float cirY, float radius, float cirAngle){  
  
        //���Ƕ�ת��Ϊ����        
        float arcAngle = (float) (Math.PI * cirAngle / 180.0);  
        if (cirAngle < 90)  
        {  
            posX = cirX + (float)(Math.cos(arcAngle)) * radius;  
            posY = cirY + (float)(Math.sin(arcAngle)) * radius;  
        }  
        else if (cirAngle == 90)  
        {  
            posX = cirX;  
            posY = cirY + radius;  
        }  
        else if (cirAngle > 90 && cirAngle < 180)  
        {  
            arcAngle = (float) (Math.PI * (180 - cirAngle) / 180.0);  
            posX = cirX - (float)(Math.cos(arcAngle)) * radius;  
            posY = cirY + (float)(Math.sin(arcAngle)) * radius;  
        }  
        else if (cirAngle == 180)  
        {  
            posX = cirX - radius;  
            posY = cirY;  
        }  
        else if (cirAngle > 180 && cirAngle < 270)  
        {  
            arcAngle = (float) (Math.PI * (cirAngle - 180) / 180.0);  
            posX = cirX - (float)(Math.cos(arcAngle)) * radius;  
            posY = cirY - (float)(Math.sin(arcAngle)) * radius;  
        }  
        else if (cirAngle == 270)  
        {  
            posX = cirX;  
            posY = cirY - radius;  
        }  
        else  
        {  
            arcAngle = (float) (Math.PI * (360 - cirAngle) / 180.0);  
            posX = cirX + (float)(Math.cos(arcAngle)) * radius;  
            posY = cirY - (float)(Math.sin(arcAngle)) * radius;  
        }  
                  
    }  
  
  
    //////////////  
    public float getPosX() {  
        return posX;  
    }  
  
  
    public float getPosY() {  
        return posY;  
    }

}
