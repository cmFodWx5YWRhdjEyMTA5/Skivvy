package in.skivvy.app.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;

import in.skivvy.app.R;


public class CustomDialogFragment extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
       return new AlertDialog.Builder(getActivity())
                .setIcon(R.drawable.icon_information)
                .setTitle("Information")
                .setMessage(getArguments().getString("Message"))
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dismiss();
                    }
                }).create();

    }
}
