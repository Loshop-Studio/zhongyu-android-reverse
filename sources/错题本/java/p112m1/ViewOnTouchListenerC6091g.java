package p112m1;

import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;

/* renamed from: m1.g */
/* loaded from: classes3.dex */
public final class ViewOnTouchListenerC6091g implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ ColorPickerDialog f9734a;

    public ViewOnTouchListenerC6091g(ColorPickerDialog colorPickerDialog) {
        this.f9734a = colorPickerDialog;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ColorPickerDialog colorPickerDialog = this.f9734a;
        EditText editText = colorPickerDialog.f3141n;
        if (view == editText || !editText.hasFocus()) {
            return false;
        }
        colorPickerDialog.f3141n.clearFocus();
        ((InputMethodManager) colorPickerDialog.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(colorPickerDialog.f3141n.getWindowToken(), 0);
        colorPickerDialog.f3141n.clearFocus();
        return true;
    }
}
