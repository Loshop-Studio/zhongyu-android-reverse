package p000a.p005b.p014h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;
import java.util.WeakHashMap;
import p000a.p005b.C0014b;
import p000a.p031h.p043j.C0266o;
import p000a.p031h.p043j.C0273v;

/* renamed from: a.b.h.q */
/* loaded from: classes.dex */
public class C0101q extends C0093m {

    /* renamed from: d */
    public final SeekBar f751d;

    /* renamed from: e */
    public Drawable f752e;

    /* renamed from: f */
    public ColorStateList f753f;

    /* renamed from: g */
    public PorterDuff.Mode f754g;

    /* renamed from: h */
    public boolean f755h;

    /* renamed from: i */
    public boolean f756i;

    public C0101q(SeekBar seekBar) {
        super(seekBar);
        this.f753f = null;
        this.f754g = null;
        this.f755h = false;
        this.f756i = false;
        this.f751d = seekBar;
    }

    @Override // p000a.p005b.p014h.C0093m
    /* renamed from: a */
    public void mo363a(AttributeSet attributeSet, int i) {
        super.mo363a(attributeSet, i);
        Context context = this.f751d.getContext();
        int[] iArr = C0014b.f32g;
        C0110u0 c0110u0M414q = C0110u0.m414q(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f751d;
        C0266o.m874m(seekBar, seekBar.getContext(), iArr, attributeSet, c0110u0M414q.f810b, i, 0);
        Drawable drawableM422h = c0110u0M414q.m422h(0);
        if (drawableM422h != null) {
            this.f751d.setThumb(drawableM422h);
        }
        Drawable drawableM421g = c0110u0M414q.m421g(1);
        Drawable drawable = this.f752e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f752e = drawableM421g;
        if (drawableM421g != null) {
            drawableM421g.setCallback(this.f751d);
            SeekBar seekBar2 = this.f751d;
            WeakHashMap<View, C0273v> weakHashMap = C0266o.f1616a;
            drawableM421g.setLayoutDirection(seekBar2.getLayoutDirection());
            if (drawableM421g.isStateful()) {
                drawableM421g.setState(this.f751d.getDrawableState());
            }
            m380c();
        }
        this.f751d.invalidate();
        if (c0110u0M414q.m429o(3)) {
            this.f754g = C0071b0.m283b(c0110u0M414q.m424j(3, -1), this.f754g);
            this.f756i = true;
        }
        if (c0110u0M414q.m429o(2)) {
            this.f753f = c0110u0M414q.m417c(2);
            this.f755h = true;
        }
        c0110u0M414q.f810b.recycle();
        m380c();
    }

    /* renamed from: c */
    public final void m380c() {
        Drawable drawable = this.f752e;
        if (drawable != null) {
            if (this.f755h || this.f756i) {
                Drawable drawableMutate = drawable.mutate();
                this.f752e = drawableMutate;
                if (this.f755h) {
                    drawableMutate.setTintList(this.f753f);
                }
                if (this.f756i) {
                    this.f752e.setTintMode(this.f754g);
                }
                if (this.f752e.isStateful()) {
                    this.f752e.setState(this.f751d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public void m381d(Canvas canvas) {
        if (this.f752e != null) {
            int max = this.f751d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f752e.getIntrinsicWidth();
                int intrinsicHeight = this.f752e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f752e.setBounds(-i, -i2, i, i2);
                float width = ((this.f751d.getWidth() - this.f751d.getPaddingLeft()) - this.f751d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f751d.getPaddingLeft(), this.f751d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f752e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
