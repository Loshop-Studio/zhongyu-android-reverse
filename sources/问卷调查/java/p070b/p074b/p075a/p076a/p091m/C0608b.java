package p070b.p074b.p075a.p076a.p091m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;
import p000a.p031h.p032b.C0190e;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;
import p070b.p074b.p075a.p076a.p101w.C0669a;
import p070b.p074b.p075a.p076a.p101w.C0675g;
import p070b.p074b.p075a.p076a.p101w.C0678j;

/* renamed from: b.b.a.a.m.b */
/* loaded from: classes.dex */
public final class C0608b {

    /* renamed from: a */
    public final Rect f3715a;

    /* renamed from: b */
    public final ColorStateList f3716b;

    /* renamed from: c */
    public final ColorStateList f3717c;

    /* renamed from: d */
    public final ColorStateList f3718d;

    /* renamed from: e */
    public final int f3719e;

    /* renamed from: f */
    public final C0678j f3720f;

    public C0608b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C0678j c0678j, Rect rect) {
        C0190e.m710e(rect.left);
        C0190e.m710e(rect.top);
        C0190e.m710e(rect.right);
        C0190e.m710e(rect.bottom);
        this.f3715a = rect;
        this.f3716b = colorStateList2;
        this.f3717c = colorStateList;
        this.f3718d = colorStateList3;
        this.f3719e = i;
        this.f3720f = c0678j;
    }

    /* renamed from: a */
    public static C0608b m2183a(Context context, int i) throws Resources.NotFoundException {
        if (!(i != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C0564b.f3517l);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListM2086g = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListM2086g2 = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListM2086g3 = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0678j c0678jM2310a = C0678j.m2304a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C0669a(0)).m2310a();
        typedArrayObtainStyledAttributes.recycle();
        return new C0608b(colorStateListM2086g, colorStateListM2086g2, colorStateListM2086g3, dimensionPixelSize, c0678jM2310a, rect);
    }

    /* renamed from: b */
    public void m2184b(TextView textView) {
        C0675g c0675g = new C0675g();
        C0675g c0675g2 = new C0675g();
        c0675g.setShapeAppearanceModel(this.f3720f);
        c0675g2.setShapeAppearanceModel(this.f3720f);
        c0675g.m2296p(this.f3717c);
        c0675g.m2299s(this.f3719e, this.f3718d);
        textView.setTextColor(this.f3716b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f3716b.withAlpha(30), c0675g, c0675g2);
        Rect rect = this.f3715a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
        textView.setBackground(insetDrawable);
    }
}
