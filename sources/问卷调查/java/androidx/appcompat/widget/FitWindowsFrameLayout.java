package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import p000a.p005b.p014h.InterfaceC0076d0;

/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout {

    /* renamed from: b */
    public InterfaceC0076d0 f2867b;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        InterfaceC0076d0 interfaceC0076d0 = this.f2867b;
        if (interfaceC0076d0 != null) {
            interfaceC0076d0.m299a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(InterfaceC0076d0 interfaceC0076d0) {
        this.f2867b = interfaceC0076d0;
    }
}
