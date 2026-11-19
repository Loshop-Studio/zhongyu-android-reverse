package p000a.p022f.p028c;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: a.f.c.k */
/* loaded from: classes.dex */
public abstract class AbstractC0181k extends AbstractC0173c {

    /* renamed from: h */
    public boolean f1386h;

    /* renamed from: i */
    public boolean f1387i;

    @Override // p000a.p022f.p028c.AbstractC0173c
    /* renamed from: e */
    public void mo657e(AttributeSet attributeSet) {
        super.mo657e(null);
    }

    /* renamed from: k */
    public void m682k() {
    }

    @Override // p000a.p022f.p028c.AbstractC0173c, android.view.View
    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.f1386h || this.f1387i) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.f1241c; i++) {
                View viewM1637d = constraintLayout.m1637d(this.f1240b[i]);
                if (viewM1637d != null) {
                    if (this.f1386h) {
                        viewM1637d.setVisibility(visibility);
                    }
                    if (this.f1387i && elevation > 0.0f) {
                        viewM1637d.setTranslationZ(viewM1637d.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        m663c();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m663c();
    }
}
