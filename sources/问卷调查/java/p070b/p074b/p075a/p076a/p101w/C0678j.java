package p070b.p074b.p075a.p076a.p101w;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.w.j */
/* loaded from: classes.dex */
public class C0678j {

    /* renamed from: a */
    public C0672d f4044a;

    /* renamed from: b */
    public C0672d f4045b;

    /* renamed from: c */
    public C0672d f4046c;

    /* renamed from: d */
    public C0672d f4047d;

    /* renamed from: e */
    public InterfaceC0671c f4048e;

    /* renamed from: f */
    public InterfaceC0671c f4049f;

    /* renamed from: g */
    public InterfaceC0671c f4050g;

    /* renamed from: h */
    public InterfaceC0671c f4051h;

    /* renamed from: i */
    public C0674f f4052i;

    /* renamed from: j */
    public C0674f f4053j;

    /* renamed from: k */
    public C0674f f4054k;

    /* renamed from: l */
    public C0674f f4055l;

    public C0678j() {
        this.f4044a = new C0677i();
        this.f4045b = new C0677i();
        this.f4046c = new C0677i();
        this.f4047d = new C0677i();
        this.f4048e = new C0669a(0.0f);
        this.f4049f = new C0669a(0.0f);
        this.f4050g = new C0669a(0.0f);
        this.f4051h = new C0669a(0.0f);
        this.f4052i = new C0674f();
        this.f4053j = new C0674f();
        this.f4054k = new C0674f();
        this.f4055l = new C0674f();
    }

    /* renamed from: a */
    public static b m2304a(Context context, int i, int i2, InterfaceC0671c interfaceC0671c) throws Resources.NotFoundException {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C0564b.f3524s);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            InterfaceC0671c interfaceC0671cM2306c = m2306c(typedArrayObtainStyledAttributes, 5, interfaceC0671c);
            InterfaceC0671c interfaceC0671cM2306c2 = m2306c(typedArrayObtainStyledAttributes, 8, interfaceC0671cM2306c);
            InterfaceC0671c interfaceC0671cM2306c3 = m2306c(typedArrayObtainStyledAttributes, 9, interfaceC0671cM2306c);
            InterfaceC0671c interfaceC0671cM2306c4 = m2306c(typedArrayObtainStyledAttributes, 7, interfaceC0671cM2306c);
            InterfaceC0671c interfaceC0671cM2306c5 = m2306c(typedArrayObtainStyledAttributes, 6, interfaceC0671cM2306c);
            b bVar = new b();
            C0672d c0672dM2082c = C0562a.m2082c(i4);
            bVar.f4056a = c0672dM2082c;
            b.m2309b(c0672dM2082c);
            bVar.f4060e = interfaceC0671cM2306c2;
            C0672d c0672dM2082c2 = C0562a.m2082c(i5);
            bVar.f4057b = c0672dM2082c2;
            b.m2309b(c0672dM2082c2);
            bVar.f4061f = interfaceC0671cM2306c3;
            C0672d c0672dM2082c3 = C0562a.m2082c(i6);
            bVar.f4058c = c0672dM2082c3;
            b.m2309b(c0672dM2082c3);
            bVar.f4062g = interfaceC0671cM2306c4;
            C0672d c0672dM2082c4 = C0562a.m2082c(i7);
            bVar.f4059d = c0672dM2082c4;
            b.m2309b(c0672dM2082c4);
            bVar.f4063h = interfaceC0671cM2306c5;
            return bVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static b m2305b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0669a c0669a = new C0669a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0564b.f3520o, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m2304a(context, resourceId, resourceId2, c0669a);
    }

    /* renamed from: c */
    public static InterfaceC0671c m2306c(TypedArray typedArray, int i, InterfaceC0671c interfaceC0671c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return interfaceC0671c;
        }
        int i2 = typedValuePeekValue.type;
        return i2 == 5 ? new C0669a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C0676h(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC0671c;
    }

    /* renamed from: d */
    public boolean m2307d(RectF rectF) {
        boolean z = this.f4055l.getClass().equals(C0674f.class) && this.f4053j.getClass().equals(C0674f.class) && this.f4052i.getClass().equals(C0674f.class) && this.f4054k.getClass().equals(C0674f.class);
        float fMo2279a = this.f4048e.mo2279a(rectF);
        return z && ((this.f4049f.mo2279a(rectF) > fMo2279a ? 1 : (this.f4049f.mo2279a(rectF) == fMo2279a ? 0 : -1)) == 0 && (this.f4051h.mo2279a(rectF) > fMo2279a ? 1 : (this.f4051h.mo2279a(rectF) == fMo2279a ? 0 : -1)) == 0 && (this.f4050g.mo2279a(rectF) > fMo2279a ? 1 : (this.f4050g.mo2279a(rectF) == fMo2279a ? 0 : -1)) == 0) && ((this.f4045b instanceof C0677i) && (this.f4044a instanceof C0677i) && (this.f4046c instanceof C0677i) && (this.f4047d instanceof C0677i));
    }

    /* renamed from: e */
    public C0678j m2308e(float f2) {
        b bVar = new b(this);
        bVar.f4060e = new C0669a(f2);
        bVar.f4061f = new C0669a(f2);
        bVar.f4062g = new C0669a(f2);
        bVar.f4063h = new C0669a(f2);
        return bVar.m2310a();
    }

    /* renamed from: b.b.a.a.w.j$b */
    public static final class b {

        /* renamed from: a */
        public C0672d f4056a;

        /* renamed from: b */
        public C0672d f4057b;

        /* renamed from: c */
        public C0672d f4058c;

        /* renamed from: d */
        public C0672d f4059d;

        /* renamed from: e */
        public InterfaceC0671c f4060e;

        /* renamed from: f */
        public InterfaceC0671c f4061f;

        /* renamed from: g */
        public InterfaceC0671c f4062g;

        /* renamed from: h */
        public InterfaceC0671c f4063h;

        /* renamed from: i */
        public C0674f f4064i;

        /* renamed from: j */
        public C0674f f4065j;

        /* renamed from: k */
        public C0674f f4066k;

        /* renamed from: l */
        public C0674f f4067l;

        public b() {
            this.f4056a = new C0677i();
            this.f4057b = new C0677i();
            this.f4058c = new C0677i();
            this.f4059d = new C0677i();
            this.f4060e = new C0669a(0.0f);
            this.f4061f = new C0669a(0.0f);
            this.f4062g = new C0669a(0.0f);
            this.f4063h = new C0669a(0.0f);
            this.f4064i = new C0674f();
            this.f4065j = new C0674f();
            this.f4066k = new C0674f();
            this.f4067l = new C0674f();
        }

        /* renamed from: b */
        public static float m2309b(C0672d c0672d) {
            Object obj;
            if (c0672d instanceof C0677i) {
                obj = (C0677i) c0672d;
            } else {
                if (!(c0672d instanceof C0673e)) {
                    return -1.0f;
                }
                obj = (C0673e) c0672d;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        /* renamed from: a */
        public C0678j m2310a() {
            return new C0678j(this, null);
        }

        /* renamed from: c */
        public b m2311c(float f2) {
            this.f4063h = new C0669a(f2);
            return this;
        }

        /* renamed from: d */
        public b m2312d(float f2) {
            this.f4062g = new C0669a(f2);
            return this;
        }

        /* renamed from: e */
        public b m2313e(float f2) {
            this.f4060e = new C0669a(f2);
            return this;
        }

        /* renamed from: f */
        public b m2314f(float f2) {
            this.f4061f = new C0669a(f2);
            return this;
        }

        public b(C0678j c0678j) {
            this.f4056a = new C0677i();
            this.f4057b = new C0677i();
            this.f4058c = new C0677i();
            this.f4059d = new C0677i();
            this.f4060e = new C0669a(0.0f);
            this.f4061f = new C0669a(0.0f);
            this.f4062g = new C0669a(0.0f);
            this.f4063h = new C0669a(0.0f);
            this.f4064i = new C0674f();
            this.f4065j = new C0674f();
            this.f4066k = new C0674f();
            this.f4067l = new C0674f();
            this.f4056a = c0678j.f4044a;
            this.f4057b = c0678j.f4045b;
            this.f4058c = c0678j.f4046c;
            this.f4059d = c0678j.f4047d;
            this.f4060e = c0678j.f4048e;
            this.f4061f = c0678j.f4049f;
            this.f4062g = c0678j.f4050g;
            this.f4063h = c0678j.f4051h;
            this.f4064i = c0678j.f4052i;
            this.f4065j = c0678j.f4053j;
            this.f4066k = c0678j.f4054k;
            this.f4067l = c0678j.f4055l;
        }
    }

    public C0678j(b bVar, a aVar) {
        this.f4044a = bVar.f4056a;
        this.f4045b = bVar.f4057b;
        this.f4046c = bVar.f4058c;
        this.f4047d = bVar.f4059d;
        this.f4048e = bVar.f4060e;
        this.f4049f = bVar.f4061f;
        this.f4050g = bVar.f4062g;
        this.f4051h = bVar.f4063h;
        this.f4052i = bVar.f4064i;
        this.f4053j = bVar.f4065j;
        this.f4054k = bVar.f4066k;
        this.f4055l = bVar.f4067l;
    }
}
