package p000a.p005b.p006c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p000a.p005b.C0014b;

/* renamed from: a.b.c.a */
/* loaded from: classes.dex */
public abstract class AbstractC0015a {

    /* renamed from: a.b.c.a$a */
    public static class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f52a;

        public a(int i, int i2) {
            super(i, i2);
            this.f52a = 0;
            this.f52a = 8388627;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.f52a = 0;
            this.f52a = aVar.f52a;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0014b.f27b);
            this.f52a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52a = 0;
        }
    }

    /* renamed from: a.b.c.a$b */
    public interface b {
        /* renamed from: a */
        void m17a(boolean z);
    }

    @Deprecated
    /* renamed from: a.b.c.a$c */
    public static abstract class c {
        /* renamed from: a */
        public abstract void m18a();
    }

    /* renamed from: a */
    public abstract void mo14a(boolean z);

    /* renamed from: b */
    public abstract Context mo15b();

    /* renamed from: c */
    public abstract void mo16c(boolean z);
}
