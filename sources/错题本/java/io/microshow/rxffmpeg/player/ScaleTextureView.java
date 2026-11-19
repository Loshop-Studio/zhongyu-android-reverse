package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;

/* loaded from: classes3.dex */
public class ScaleTextureView extends TextureView {

    /* renamed from: a */
    public float f8882a;

    /* renamed from: b */
    public float f8883b;

    /* renamed from: c */
    public float f8884c;

    /* renamed from: d */
    public float f8885d;

    /* renamed from: e */
    public float f8886e;

    /* renamed from: f */
    public float f8887f;

    /* renamed from: g */
    public float f8888g;

    /* renamed from: h */
    public float f8889h;

    /* renamed from: i */
    public int f8890i;

    /* renamed from: j */
    public boolean f8891j;

    /* renamed from: k */
    public boolean f8892k;

    /* renamed from: l */
    public boolean f8893l;

    public ScaleTextureView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static float m5013a(MotionEvent motionEvent) {
        float x3 = motionEvent.getX(0) - motionEvent.getX(1);
        float y2 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((y2 * y2) + (x3 * x3));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.microshow.rxffmpeg.player.ScaleTextureView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEnabledRotation(boolean z8) {
        this.f8892k = z8;
    }

    public void setEnabledTouch(boolean z8) {
        this.f8891j = z8;
    }

    public void setEnabledTranslation(boolean z8) {
        this.f8893l = z8;
    }

    public ScaleTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8884c = 1.0f;
        this.f8891j = true;
        this.f8892k = true;
        this.f8893l = true;
        setClickable(true);
    }
}
