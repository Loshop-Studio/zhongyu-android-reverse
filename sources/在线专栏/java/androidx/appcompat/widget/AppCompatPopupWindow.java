package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0376j;
import p015c.C1047j;

/* loaded from: classes.dex */
class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    private static final boolean f840b = false;

    /* renamed from: a */
    private boolean f841a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i4) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i4);
        m618a(context, attributeSet, i4, 0);
    }

    /* renamed from: a */
    private void m618a(Context context, AttributeSet attributeSet, int i4, int i5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        C0214g0 c0214g0M815v = C0214g0.m815v(context, attributeSet, C1047j.f6071d2, i4, i5);
        int i6 = C1047j.f6081f2;
        if (c0214g0M815v.m834s(i6)) {
            m619b(c0214g0M815v.m816a(i6, false));
        }
        setBackgroundDrawable(c0214g0M815v.m822g(C1047j.f6076e2));
        c0214g0M815v.m835w();
    }

    /* renamed from: b */
    private void m619b(boolean z3) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        if (f840b) {
            this.f841a = z3;
        } else {
            C0376j.m2184a(this, z3);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5) {
        if (f840b && this.f841a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i4, int i5, int i6, int i7) {
        if (f840b && this.f841a) {
            i5 -= view.getHeight();
        }
        super.update(view, i4, i5, i6, i7);
    }

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i4, int i5) throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        super(context, attributeSet, i4, i5);
        m618a(context, attributeSet, i4, i5);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i4, int i5, int i6) {
        if (f840b && this.f841a) {
            i5 -= view.getHeight();
        }
        super.showAsDropDown(view, i4, i5, i6);
    }
}
