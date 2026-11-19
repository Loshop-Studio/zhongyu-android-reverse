package p070b.p074b.p075a.p076a.p098t;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p000a.p031h.p033c.p034b.C0200h;
import p070b.p071a.p072a.p073a.C0561a;
import p070b.p074b.p075a.p076a.C0562a;
import p070b.p074b.p075a.p076a.C0564b;

/* renamed from: b.b.a.a.t.b */
/* loaded from: classes.dex */
public class C0663b {

    /* renamed from: a */
    public final float f3962a;

    /* renamed from: b */
    public final ColorStateList f3963b;

    /* renamed from: c */
    public final int f3964c;

    /* renamed from: d */
    public final int f3965d;

    /* renamed from: e */
    public final String f3966e;

    /* renamed from: f */
    public final ColorStateList f3967f;

    /* renamed from: g */
    public final float f3968g;

    /* renamed from: h */
    public final float f3969h;

    /* renamed from: i */
    public final float f3970i;

    /* renamed from: j */
    public final int f3971j;

    /* renamed from: k */
    public boolean f3972k = false;

    /* renamed from: l */
    public Typeface f3973l;

    /* renamed from: b.b.a.a.t.b$a */
    public class a extends C0200h.a {

        /* renamed from: a */
        public final /* synthetic */ AbstractC0665d f3974a;

        public a(AbstractC0665d abstractC0665d) {
            this.f3974a = abstractC0665d;
        }

        @Override // p000a.p031h.p033c.p034b.C0200h.a
        /* renamed from: d */
        public void mo411d(int i) {
            C0663b.this.f3972k = true;
            this.f3974a.mo2264a(i);
        }

        @Override // p000a.p031h.p033c.p034b.C0200h.a
        /* renamed from: e */
        public void mo412e(Typeface typeface) {
            C0663b c0663b = C0663b.this;
            c0663b.f3973l = Typeface.create(typeface, c0663b.f3964c);
            C0663b c0663b2 = C0663b.this;
            c0663b2.f3972k = true;
            this.f3974a.mo2265b(c0663b2.f3973l, false);
        }
    }

    public C0663b(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, C0564b.f3526u);
        this.f3962a = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f3963b = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 3);
        C0562a.m2086g(context, typedArrayObtainStyledAttributes, 4);
        C0562a.m2086g(context, typedArrayObtainStyledAttributes, 5);
        this.f3964c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f3965d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i2 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f3971j = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.f3966e = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f3967f = C0562a.m2086g(context, typedArrayObtainStyledAttributes, 6);
        this.f3968g = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f3969h = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f3970i = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void m2272a() {
        String str;
        if (this.f3973l == null && (str = this.f3966e) != null) {
            this.f3973l = Typeface.create(str, this.f3964c);
        }
        if (this.f3973l == null) {
            int i = this.f3965d;
            this.f3973l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f3973l = Typeface.create(this.f3973l, this.f3964c);
        }
    }

    /* renamed from: b */
    public void m2273b(Context context, AbstractC0665d abstractC0665d) {
        m2272a();
        int i = this.f3971j;
        if (i == 0) {
            this.f3972k = true;
        }
        if (this.f3972k) {
            abstractC0665d.mo2265b(this.f3973l, true);
            return;
        }
        try {
            a aVar = new a(abstractC0665d);
            ThreadLocal<TypedValue> threadLocal = C0200h.f1443a;
            if (context.isRestricted()) {
                aVar.m753a(-4, null);
            } else {
                C0200h.m751a(context, i, new TypedValue(), 0, aVar, null, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f3972k = true;
            abstractC0665d.mo2264a(1);
        } catch (Exception e2) {
            StringBuilder sbM2079g = C0561a.m2079g("Error loading font ");
            sbM2079g.append(this.f3966e);
            Log.d("TextAppearance", sbM2079g.toString(), e2);
            this.f3972k = true;
            abstractC0665d.mo2264a(-3);
        }
    }

    /* renamed from: c */
    public void m2274c(Context context, TextPaint textPaint, AbstractC0665d abstractC0665d) {
        m2272a();
        m2275d(textPaint, this.f3973l);
        m2273b(context, new C0664c(this, textPaint, abstractC0665d));
        ColorStateList colorStateList = this.f3963b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.f3970i;
        float f3 = this.f3968g;
        float f4 = this.f3969h;
        ColorStateList colorStateList2 = this.f3967f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: d */
    public void m2275d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3964c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3962a);
    }
}
