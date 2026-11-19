package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p000a.p005b.C0014b;
import p000a.p005b.p007d.p008a.C0034a;
import p000a.p031h.p043j.C0266o;

/* renamed from: a.b.h.h */
/* loaded from: classes.dex */
public class C0083h {

    /* renamed from: a */
    public final CompoundButton f635a;

    /* renamed from: b */
    public ColorStateList f636b = null;

    /* renamed from: c */
    public PorterDuff.Mode f637c = null;

    /* renamed from: d */
    public boolean f638d = false;

    /* renamed from: e */
    public boolean f639e = false;

    /* renamed from: f */
    public boolean f640f;

    public C0083h(CompoundButton compoundButton) {
        this.f635a = compoundButton;
    }

    /* renamed from: a */
    public void m321a() {
        Drawable buttonDrawable = this.f635a.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f638d || this.f639e) {
                Drawable drawableMutate = buttonDrawable.mutate();
                if (this.f638d) {
                    drawableMutate.setTintList(this.f636b);
                }
                if (this.f639e) {
                    drawableMutate.setTintMode(this.f637c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f635a.getDrawableState());
                }
                this.f635a.setButtonDrawable(drawableMutate);
            }
        }
    }

    /* renamed from: b */
    public void m322b(AttributeSet attributeSet, int i) {
        int iM426l;
        int iM426l2;
        Context context = this.f635a.getContext();
        int[] iArr = C0014b.f37l;
        C0110u0 c0110u0M414q = C0110u0.m414q(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f635a;
        C0266o.m874m(compoundButton, compoundButton.getContext(), iArr, attributeSet, c0110u0M414q.f810b, i, 0);
        boolean z = true;
        try {
            if (!c0110u0M414q.m429o(1) || (iM426l2 = c0110u0M414q.m426l(1, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f635a;
                    compoundButton2.setButtonDrawable(C0034a.m129a(compoundButton2.getContext(), iM426l2));
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (!z && c0110u0M414q.m429o(0) && (iM426l = c0110u0M414q.m426l(0, 0)) != 0) {
                CompoundButton compoundButton3 = this.f635a;
                compoundButton3.setButtonDrawable(C0034a.m129a(compoundButton3.getContext(), iM426l));
            }
            if (c0110u0M414q.m429o(2)) {
                this.f635a.setButtonTintList(c0110u0M414q.m417c(2));
            }
            if (c0110u0M414q.m429o(3)) {
                this.f635a.setButtonTintMode(C0071b0.m283b(c0110u0M414q.m424j(3, -1), null));
            }
            c0110u0M414q.f810b.recycle();
        } catch (Throwable th) {
            c0110u0M414q.f810b.recycle();
            throw th;
        }
    }
}
