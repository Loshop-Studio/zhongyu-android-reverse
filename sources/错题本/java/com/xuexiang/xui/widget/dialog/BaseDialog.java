package com.xuexiang.xui.widget.dialog;

import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatDialog;
import com.xuexiang.xui.utils.ViewTreeObserverOnGlobalLayoutListenerC4152b;
import java.util.HashMap;
import p164t1.AbstractC6582a;

/* loaded from: classes3.dex */
public class BaseDialog extends AppCompatDialog {
    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final View findViewById(int i) {
        throw null;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View currentFocus;
        HashMap map = ViewTreeObserverOnGlobalLayoutListenerC4152b.f3929e;
        if (motionEvent.getAction() == 0 && (currentFocus = getCurrentFocus()) != null && (currentFocus instanceof EditText)) {
            int[] iArr = {0, 0};
            currentFocus.getLocationInWindow(iArr);
            int i = iArr[0];
            int i8 = iArr[1];
            int height = currentFocus.getHeight() + i8;
            int width = currentFocus.getWidth() + i;
            if (motionEvent.getX() <= i || motionEvent.getX() >= width || motionEvent.getY() <= i8 || motionEvent.getY() >= height) {
                AbstractC6582a.m6217a();
                throw null;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
