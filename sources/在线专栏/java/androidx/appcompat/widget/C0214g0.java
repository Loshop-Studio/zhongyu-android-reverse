package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p073d.C2443a;
import p148s.C3368f;

/* renamed from: androidx.appcompat.widget.g0 */
/* loaded from: classes.dex */
public class C0214g0 {

    /* renamed from: a */
    private final Context f1091a;

    /* renamed from: b */
    private final TypedArray f1092b;

    /* renamed from: c */
    private TypedValue f1093c;

    private C0214g0(Context context, TypedArray typedArray) {
        this.f1091a = context;
        this.f1092b = typedArray;
    }

    /* renamed from: t */
    public static C0214g0 m813t(Context context, int i4, int[] iArr) {
        return new C0214g0(context, context.obtainStyledAttributes(i4, iArr));
    }

    /* renamed from: u */
    public static C0214g0 m814u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new C0214g0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* renamed from: v */
    public static C0214g0 m815v(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new C0214g0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    /* renamed from: a */
    public boolean m816a(int i4, boolean z3) {
        return this.f1092b.getBoolean(i4, z3);
    }

    /* renamed from: b */
    public int m817b(int i4, int i5) {
        return this.f1092b.getColor(i4, i5);
    }

    /* renamed from: c */
    public ColorStateList m818c(int i4) {
        int resourceId;
        ColorStateList colorStateListM8168c;
        return (!this.f1092b.hasValue(i4) || (resourceId = this.f1092b.getResourceId(i4, 0)) == 0 || (colorStateListM8168c = C2443a.m8168c(this.f1091a, resourceId)) == null) ? this.f1092b.getColorStateList(i4) : colorStateListM8168c;
    }

    /* renamed from: d */
    public float m819d(int i4, float f4) {
        return this.f1092b.getDimension(i4, f4);
    }

    /* renamed from: e */
    public int m820e(int i4, int i5) {
        return this.f1092b.getDimensionPixelOffset(i4, i5);
    }

    /* renamed from: f */
    public int m821f(int i4, int i5) {
        return this.f1092b.getDimensionPixelSize(i4, i5);
    }

    /* renamed from: g */
    public Drawable m822g(int i4) {
        int resourceId;
        return (!this.f1092b.hasValue(i4) || (resourceId = this.f1092b.getResourceId(i4, 0)) == 0) ? this.f1092b.getDrawable(i4) : C2443a.m8169d(this.f1091a, resourceId);
    }

    /* renamed from: h */
    public Drawable m823h(int i4) {
        int resourceId;
        if (!this.f1092b.hasValue(i4) || (resourceId = this.f1092b.getResourceId(i4, 0)) == 0) {
            return null;
        }
        return C0211f.m791b().m796d(this.f1091a, resourceId, true);
    }

    /* renamed from: i */
    public float m824i(int i4, float f4) {
        return this.f1092b.getFloat(i4, f4);
    }

    /* renamed from: j */
    public Typeface m825j(int i4, int i5, C3368f.c cVar) {
        int resourceId = this.f1092b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1093c == null) {
            this.f1093c = new TypedValue();
        }
        return C3368f.m10235f(this.f1091a, resourceId, this.f1093c, i5, cVar);
    }

    /* renamed from: k */
    public int m826k(int i4, int i5) {
        return this.f1092b.getInt(i4, i5);
    }

    /* renamed from: l */
    public int m827l(int i4, int i5) {
        return this.f1092b.getInteger(i4, i5);
    }

    /* renamed from: m */
    public int m828m(int i4, int i5) {
        return this.f1092b.getLayoutDimension(i4, i5);
    }

    /* renamed from: n */
    public int m829n(int i4, int i5) {
        return this.f1092b.getResourceId(i4, i5);
    }

    /* renamed from: o */
    public String m830o(int i4) {
        return this.f1092b.getString(i4);
    }

    /* renamed from: p */
    public CharSequence m831p(int i4) {
        return this.f1092b.getText(i4);
    }

    /* renamed from: q */
    public CharSequence[] m832q(int i4) {
        return this.f1092b.getTextArray(i4);
    }

    /* renamed from: r */
    public TypedArray m833r() {
        return this.f1092b;
    }

    /* renamed from: s */
    public boolean m834s(int i4) {
        return this.f1092b.hasValue(i4);
    }

    /* renamed from: w */
    public void m835w() {
        this.f1092b.recycle();
    }
}
