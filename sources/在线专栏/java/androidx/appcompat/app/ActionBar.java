package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p015c.C1047j;
import p088g.AbstractC2620b;

/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface InterfaceC0068a {
        /* renamed from: a */
        void m122a(boolean z3);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class AbstractC0069b {
        /* renamed from: a */
        public abstract CharSequence m123a();

        /* renamed from: b */
        public abstract View m124b();

        /* renamed from: c */
        public abstract Drawable m125c();

        /* renamed from: d */
        public abstract CharSequence m126d();

        /* renamed from: e */
        public abstract void m127e();
    }

    /* renamed from: g */
    public boolean mo107g() {
        return false;
    }

    /* renamed from: h */
    public abstract boolean mo108h();

    /* renamed from: i */
    public abstract void mo109i(boolean z3);

    /* renamed from: j */
    public abstract int mo110j();

    /* renamed from: k */
    public abstract Context mo111k();

    /* renamed from: l */
    public boolean mo112l() {
        return false;
    }

    /* renamed from: m */
    public void mo113m(Configuration configuration) {
    }

    /* renamed from: n */
    void mo114n() {
    }

    /* renamed from: o */
    public abstract boolean mo115o(int i4, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo116p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo117q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo118r(boolean z3);

    /* renamed from: s */
    public abstract void mo119s(boolean z3);

    /* renamed from: t */
    public abstract void mo120t(CharSequence charSequence);

    /* renamed from: u */
    public AbstractC2620b mo121u(AbstractC2620b.a aVar) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f120a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f120a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1047j.f6148t);
            this.f120a = typedArrayObtainStyledAttributes.getInt(C1047j.f6153u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
            this.f120a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f120a = 0;
            this.f120a = layoutParams.f120a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f120a = 0;
        }
    }
}
