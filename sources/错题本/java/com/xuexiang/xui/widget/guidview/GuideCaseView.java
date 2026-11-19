package com.xuexiang.xui.widget.guidview;

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class GuideCaseView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public InterfaceC4175a getDismissListener() {
        return null;
    }

    public int getFocusCenterX() {
        throw null;
    }

    public int getFocusCenterY() {
        throw null;
    }

    public int getFocusHeight() {
        throw null;
    }

    public float getFocusRadius() {
        if (FocusShape.CIRCLE.equals(null)) {
            throw null;
        }
        return 0.0f;
    }

    public int getFocusWidth() {
        throw null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        throw null;
    }

    public void setDismissListener(InterfaceC4175a interfaceC4175a) {
    }
}
