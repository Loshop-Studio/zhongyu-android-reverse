package com.xuexiang.xui.widget.button.shinebutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import java.util.Random;

/* loaded from: classes3.dex */
public class ShineView extends View {

    /* renamed from: k */
    public static final int[] f4181k = new int[10];

    /* renamed from: a */
    public final RectF f4182a;

    /* renamed from: b */
    public final RectF f4183b;

    /* renamed from: c */
    public int f4184c;

    /* renamed from: d */
    public int f4185d;

    /* renamed from: e */
    public int f4186e;

    /* renamed from: f */
    public int f4187f;

    /* renamed from: g */
    public float f4188g;

    /* renamed from: h */
    public final float f4189h;

    /* renamed from: i */
    public boolean f4190i;

    /* renamed from: j */
    public final float f4191j;

    public ShineView(Context context) {
        super(context);
        this.f4182a = new RectF();
        this.f4183b = new RectF();
        new Random();
        this.f4189h = 0.0f;
        this.f4190i = false;
        this.f4191j = 0.2f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < 0; i++) {
            canvas.drawArc(this.f4182a, ((this.f4188g - 1.0f) * 0.0f) + ((360.0f / 0) * i) + 1.0f, 0.1f, false, null);
        }
        for (int i8 = 0; i8 < 0; i8++) {
            canvas.drawArc(this.f4183b, ((this.f4188g - 1.0f) * 0.0f) + ((((360.0f / 0) * i8) + 1.0f) - 0.0f), 0.1f, false, null);
        }
        throw null;
    }

    public ShineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4182a = new RectF();
        this.f4183b = new RectF();
        new Random();
        this.f4189h = 0.0f;
        this.f4190i = false;
        this.f4191j = 0.2f;
    }

    public ShineView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4182a = new RectF();
        this.f4183b = new RectF();
        new Random();
        this.f4189h = 0.0f;
        this.f4190i = false;
        this.f4191j = 0.2f;
    }
}
