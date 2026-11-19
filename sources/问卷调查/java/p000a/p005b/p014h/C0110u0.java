package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p033c.p034b.C0200h;

/* renamed from: a.b.h.u0 */
/* loaded from: classes.dex */
public class C0110u0 {

    /* renamed from: a */
    public final Context f809a;

    /* renamed from: b */
    public final TypedArray f810b;

    /* renamed from: c */
    public TypedValue f811c;

    public C0110u0(Context context, TypedArray typedArray) {
        this.f809a = context;
        this.f810b = typedArray;
    }

    /* renamed from: p */
    public static C0110u0 m413p(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0110u0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: q */
    public static C0110u0 m414q(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0110u0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* renamed from: a */
    public boolean m415a(int i, boolean z) {
        return this.f810b.getBoolean(i, z);
    }

    /* renamed from: b */
    public int m416b(int i, int i2) {
        return this.f810b.getColor(i, i2);
    }

    /* renamed from: c */
    public ColorStateList m417c(int i) {
        int resourceId;
        if (this.f810b.hasValue(i) && (resourceId = this.f810b.getResourceId(i, 0)) != 0) {
            Context context = this.f809a;
            ThreadLocal<TypedValue> threadLocal = C0034a.f211a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.f810b.getColorStateList(i);
    }

    /* renamed from: d */
    public float m418d(int i, float f2) {
        return this.f810b.getDimension(i, f2);
    }

    /* renamed from: e */
    public int m419e(int i, int i2) {
        return this.f810b.getDimensionPixelOffset(i, i2);
    }

    /* renamed from: f */
    public int m420f(int i, int i2) {
        return this.f810b.getDimensionPixelSize(i, i2);
    }

    /* renamed from: g */
    public Drawable m421g(int i) {
        int resourceId;
        return (!this.f810b.hasValue(i) || (resourceId = this.f810b.getResourceId(i, 0)) == 0) ? this.f810b.getDrawable(i) : C0034a.m129a(this.f809a, resourceId);
    }

    /* renamed from: h */
    public Drawable m422h(int i) {
        int resourceId;
        Drawable drawableM357g;
        if (!this.f810b.hasValue(i) || (resourceId = this.f810b.getResourceId(i, 0)) == 0) {
            return null;
        }
        C0085i c0085iM333a = C0085i.m333a();
        Context context = this.f809a;
        synchronized (c0085iM333a) {
            drawableM357g = c0085iM333a.f677a.m357g(context, resourceId, true);
        }
        return drawableM357g;
    }

    /* renamed from: i */
    public Typeface m423i(int i, int i2, C0200h.a aVar) {
        int resourceId = this.f810b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f811c == null) {
            this.f811c = new TypedValue();
        }
        Context context = this.f809a;
        TypedValue typedValue = this.f811c;
        ThreadLocal<TypedValue> threadLocal = C0200h.f1443a;
        if (context.isRestricted()) {
            return null;
        }
        return C0200h.m751a(context, resourceId, typedValue, i2, aVar, null, true, false);
    }

    /* renamed from: j */
    public int m424j(int i, int i2) {
        return this.f810b.getInt(i, i2);
    }

    /* renamed from: k */
    public int m425k(int i, int i2) {
        return this.f810b.getLayoutDimension(i, i2);
    }

    /* renamed from: l */
    public int m426l(int i, int i2) {
        return this.f810b.getResourceId(i, i2);
    }

    /* renamed from: m */
    public String m427m(int i) {
        return this.f810b.getString(i);
    }

    /* renamed from: n */
    public CharSequence m428n(int i) {
        return this.f810b.getText(i);
    }

    /* renamed from: o */
    public boolean m429o(int i) {
        return this.f810b.hasValue(i);
    }
}
