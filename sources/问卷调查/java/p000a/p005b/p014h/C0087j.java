package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;

/* renamed from: a.b.h.j */
/* loaded from: classes.dex */
public class C0087j {

    /* renamed from: a */
    public final ImageView f684a;

    /* renamed from: b */
    public C0106s0 f685b;

    public C0087j(ImageView imageView) {
        this.f684a = imageView;
    }

    /* renamed from: a */
    public void m344a() {
        C0106s0 c0106s0;
        Drawable drawable = this.f684a.getDrawable();
        if (drawable != null) {
            int[] iArr = C0071b0.f554a;
        }
        if (drawable == null || (c0106s0 = this.f685b) == null) {
            return;
        }
        C0085i.m336f(drawable, c0106s0, this.f684a.getDrawableState());
    }

    /* renamed from: b */
    public void m345b(AttributeSet attributeSet, int i) {
        int iM426l;
        Context context = this.f684a.getContext();
        int[] iArr = C0014b.f31f;
        C0110u0 c0110u0M414q = C0110u0.m414q(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f684a;
        C0266o.m874m(imageView, imageView.getContext(), iArr, attributeSet, c0110u0M414q.f810b, i, 0);
        try {
            Drawable drawable = this.f684a.getDrawable();
            if (drawable == null && (iM426l = c0110u0M414q.m426l(1, -1)) != -1 && (drawable = C0034a.m129a(this.f684a.getContext(), iM426l)) != null) {
                this.f684a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                int[] iArr2 = C0071b0.f554a;
            }
            if (c0110u0M414q.m429o(2)) {
                this.f684a.setImageTintList(c0110u0M414q.m417c(2));
            }
            if (c0110u0M414q.m429o(3)) {
                this.f684a.setImageTintMode(C0071b0.m283b(c0110u0M414q.m424j(3, -1), null));
            }
            c0110u0M414q.f810b.recycle();
        } catch (Throwable th) {
            c0110u0M414q.f810b.recycle();
            throw th;
        }
    }

    /* renamed from: c */
    public void m346c(int i) {
        if (i != 0) {
            Drawable drawableM129a = C0034a.m129a(this.f684a.getContext(), i);
            if (drawableM129a != null) {
                int[] iArr = C0071b0.f554a;
            }
            this.f684a.setImageDrawable(drawableM129a);
        } else {
            this.f684a.setImageDrawable(null);
        }
        m344a();
    }

    /* renamed from: d */
    public void m347d(ColorStateList colorStateList) {
        if (this.f685b == null) {
            this.f685b = new C0106s0();
        }
        C0106s0 c0106s0 = this.f685b;
        c0106s0.f786a = colorStateList;
        c0106s0.f789d = true;
        m344a();
    }

    /* renamed from: e */
    public void m348e(PorterDuff.Mode mode) {
        if (this.f685b == null) {
            this.f685b = new C0106s0();
        }
        C0106s0 c0106s0 = this.f685b;
        c0106s0.f787b = mode;
        c0106s0.f788c = true;
        m344a();
    }
}
