package com.zykj.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public class TouchSwitchView extends ConstraintLayout {

    /* renamed from: c */
    public boolean f20850c;

    public TouchSwitchView(@NonNull Context context) {
        super(context);
        this.f20850c = true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.f20850c;
    }

    public void setCanTouch(boolean z10) {
        this.f20850c = z10;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20850c = true;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20850c = true;
    }
}
