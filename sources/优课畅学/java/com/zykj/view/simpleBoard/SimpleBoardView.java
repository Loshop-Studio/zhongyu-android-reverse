package com.zykj.view.simpleBoard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p276v5.C10246a;
import p276v5.C10247b;
import p276v5.C10248c;
import p298x5.C10549a;
import p298x5.C10550b;
import p298x5.C10551c;
import p298x5.InterfaceC10552d;
import p300x7.InterfaceC10559a;

/* loaded from: classes5.dex */
public final class SimpleBoardView extends FrameLayout implements InterfaceC10552d {

    /* renamed from: a */
    public final Matrix f15527a;

    /* renamed from: b */
    public final C10248c f15528b;

    /* renamed from: c */
    public C10247b f15529c;

    /* renamed from: d */
    public C10246a f15530d;

    /* renamed from: e */
    public final C10551c f15531e;

    /* renamed from: f */
    public final C10550b f15532f;

    /* renamed from: g */
    public final C10549a f15533g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9133u.m16133g(context, "context");
    }

    @Override // p298x5.InterfaceC10552d
    /* renamed from: a */
    public void mo13291a() {
        this.f15533g.invalidate();
    }

    @Override // p298x5.InterfaceC10552d
    /* renamed from: b */
    public void mo13292b() {
        this.f15531e.invalidate();
    }

    @Override // p298x5.InterfaceC10552d
    /* renamed from: c */
    public void mo13293c() {
        this.f15532f.invalidate();
    }

    /* renamed from: d */
    public final void m13294d() {
        this.f15529c.m19171c();
    }

    public final Bitmap getImageBackground() {
        Bitmap bitmapM19175g = this.f15529c.m19175g();
        if (bitmapM19175g != null) {
            return Bitmap.createBitmap(bitmapM19175g);
        }
        return null;
    }

    public final C10248c getSimpleBoardConfig() {
        return this.f15528b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f15529c.m19186r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        this.f15530d.m19167a(event);
        return true;
    }

    public final void setActonMode(int i10) {
        this.f15530d.m19168b(i10);
    }

    public final void setImageBackground(Bitmap bitmap) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        this.f15529c.m19184p(bitmap);
        this.f15533g.postInvalidate();
    }

    public final void setOnActionListener(InterfaceC10559a interfaceC10559a) {
        this.f15529c.m19185q(interfaceC10559a);
    }

    public /* synthetic */ SimpleBoardView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleBoardView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9133u.m16133g(context, "context");
        Matrix matrix = new Matrix();
        this.f15527a = matrix;
        C10248c c10248c = new C10248c(false, false, 0.0f, 0.0f, 0.0f, 0, false, 0.0f, 0, 511, null);
        this.f15528b = c10248c;
        C10247b c10247b = new C10247b(c10248c, matrix, this);
        this.f15529c = c10247b;
        this.f15530d = new C10246a(c10248c, matrix, c10247b);
        C10551c c10551c = new C10551c(context, attributeSet, 0, 4, null);
        c10551c.setMDrawControl(this.f15529c);
        this.f15531e = c10551c;
        C10550b c10550b = new C10550b(context, attributeSet, 0, 4, null);
        c10550b.setMDrawControl(this.f15529c);
        this.f15532f = c10550b;
        C10549a c10549a = new C10549a(context, attributeSet, 0, 4, null);
        c10549a.setMDrawControl(this.f15529c);
        this.f15533g = c10549a;
        addView(c10549a);
        addView(c10550b);
        addView(c10551c);
    }
}
