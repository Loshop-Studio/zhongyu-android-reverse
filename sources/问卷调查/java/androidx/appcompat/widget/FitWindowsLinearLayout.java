package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import p000a.p005b.p014h.InterfaceC0076d0;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: b */
    public InterfaceC0076d0 f2868b;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0076d0 interfaceC0076d0 = this.f2868b;
        if (interfaceC0076d0 != null) {
            interfaceC0076d0.m299a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0076d0 interfaceC0076d0) {
        this.f2868b = interfaceC0076d0;
    }
}
