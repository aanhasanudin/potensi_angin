package com.potensiangin;


import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
 
public class AlertDialogManager {
   
	public void showAlertDialog(Context context, String title, String message,
            Boolean status) {
        AlertDialog.Builder alert= new AlertDialog.Builder(context);
        alert.setTitle(title);
        alert.setMessage(message);
        if(status!=null)
        	alert.setIcon((status)?R.drawable.sukses:R.drawable.gagal);
        alert.setPositiveButton("�K", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		
       alert.create().show();
    }
}