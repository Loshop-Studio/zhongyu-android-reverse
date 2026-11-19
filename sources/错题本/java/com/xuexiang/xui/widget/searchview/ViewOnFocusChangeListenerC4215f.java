package com.xuexiang.xui.widget.searchview;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.jaredrummler.android.colorpicker.ColorPickerDialog;
import com.xuexiang.xui.widget.edittext.MultiLineEditText;

/* renamed from: com.xuexiang.xui.widget.searchview.f */
/* loaded from: classes3.dex */
public final class ViewOnFocusChangeListenerC4215f implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f4860a;

    /* renamed from: b */
    public final /* synthetic */ Object f4861b;

    public /* synthetic */ ViewOnFocusChangeListenerC4215f(Object obj, int i) {
        this.f4860a = i;
        this.f4861b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z8) {
        switch (this.f4860a) {
            case 0:
                MaterialSearchView materialSearchView = (MaterialSearchView) this.f4861b;
                if (z8) {
                    EditText editText = materialSearchView.f4837f;
                    materialSearchView.getClass();
                    editText.requestFocus();
                    ((InputMethodManager) editText.getContext().getSystemService("input_method")).showSoftInput(editText, 0);
                    materialSearchView.m3571f();
                    break;
                }
                break;
            case 1:
                ((MultiLineEditText) this.f4861b).setSelected(z8);
                break;
            default:
                ColorPickerDialog colorPickerDialog = (ColorPickerDialog) this.f4861b;
                if (z8) {
                    ((InputMethodManager) colorPickerDialog.getActivity().getSystemService("input_method")).showSoftInput(colorPickerDialog.f3141n, 1);
                    break;
                }
                break;
        }
    }
}
