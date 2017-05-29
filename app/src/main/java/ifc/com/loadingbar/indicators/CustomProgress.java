package ifc.com.loadingbar.indicators;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.View;
import android.view.Window;

import ifc.com.loadingbar.R;


/**
 * Created by dell on 5/23/2017.
 */

public class CustomProgress {
    private static CustomProgress customProgress = null;
    private Dialog mDialog;

    public static CustomProgress getInstance() {

        if (customProgress == null) {
            customProgress = new CustomProgress();
        }
        return customProgress;
    }


    public void showProgress(Context mContext) {
        try {
            mDialog = new Dialog(mContext);
            mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            mDialog.setContentView(R.layout.custom_progress);
            mDialog.findViewById(R.id.custom_progressbar).setVisibility(View.VISIBLE);
            Window window = mDialog.getWindow();
            assert window != null;
            window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            mDialog.setCancelable(false);
            mDialog.setCanceledOnTouchOutside(false);
            mDialog.show();
        } catch (Exception e) {
            Log.d("Custom progress", e.toString());
        }
    }

    public void hideProgress(){
        if (mDialog != null) {
            mDialog.dismiss();
            mDialog = null;
        }
    }
    public boolean isDialogShowing() {
        return mDialog.isShowing();
    }
}

