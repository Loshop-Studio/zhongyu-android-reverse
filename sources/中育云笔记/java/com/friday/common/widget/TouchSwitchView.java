package com.friday.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public class TouchSwitchView extends ConstraintLayout {

    /* renamed from: c */
    public boolean f6187c;

    public TouchSwitchView(@NonNull Context context) {
        super(context);
        this.f6187c = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 1 ? !this.f6187c : super.onInterceptTouchEvent(motionEvent);
    }

    public void setCanTouch(boolean z10) {
        this.f6187c = z10;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6187c = false;
    }

    public TouchSwitchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f6187c = false;
    }
}
