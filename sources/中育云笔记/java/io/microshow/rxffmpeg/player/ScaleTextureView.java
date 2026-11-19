package io.microshow.rxffmpeg.player;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.TextureView;

/* loaded from: classes6.dex */
public class ScaleTextureView extends TextureView {

    /* renamed from: c */
    public float f22211c;

    /* renamed from: d */
    public float f22212d;

    /* renamed from: e */
    public float f22213e;

    /* renamed from: f */
    public float f22214f;

    /* renamed from: g */
    public float f22215g;

    /* renamed from: h */
    public float f22216h;

    /* renamed from: i */
    public float f22217i;

    /* renamed from: j */
    public float f22218j;

    /* renamed from: k */
    public int f22219k;

    /* renamed from: l */
    public boolean f22220l;

    /* renamed from: m */
    public boolean f22221m;

    /* renamed from: n */
    public boolean f22222n;

    public ScaleTextureView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final float m18926a(MotionEvent motionEvent) {
        return (float) Math.toDegrees(Math.atan2(motionEvent.getY(0) - motionEvent.getY(1), motionEvent.getX(0) - motionEvent.getX(1)));
    }

    /* renamed from: b */
    public final float m18927b(MotionEvent motionEvent) {
        float x10 = motionEvent.getX(0) - motionEvent.getX(1);
        float y10 = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((x10 * x10) + (y10 * y10));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            boolean r0 = r3.f22220l
            if (r0 == 0) goto Lb3
            int r0 = r4.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            if (r0 == 0) goto La5
            if (r0 == r1) goto La1
            r2 = 2
            if (r0 == r2) goto L2a
            r1 = 5
            if (r0 == r1) goto L1a
            r1 = 6
            if (r0 == r1) goto La1
            goto Lb3
        L1a:
            r3.f22219k = r2
            float r0 = r3.m18927b(r4)
            r3.f22217i = r0
            float r0 = r3.m18926a(r4)
            r3.f22218j = r0
            goto Lb3
        L2a:
            int r0 = r3.f22219k
            if (r0 != r1) goto L61
            boolean r0 = r3.f22222n
            if (r0 == 0) goto Lb3
            float r0 = r3.f22211c
            float r1 = r4.getRawX()
            float r0 = r0 + r1
            float r1 = r3.f22215g
            float r0 = r0 - r1
            r3.f22211c = r0
            float r0 = r3.f22212d
            float r1 = r4.getRawY()
            float r0 = r0 + r1
            float r1 = r3.f22216h
            float r0 = r0 - r1
            r3.f22212d = r0
            float r0 = r3.f22211c
            r3.setTranslationX(r0)
            float r0 = r3.f22212d
            r3.setTranslationY(r0)
            float r0 = r4.getRawX()
            r3.f22215g = r0
            float r0 = r4.getRawY()
            r3.f22216h = r0
            goto Lb3
        L61:
            if (r0 != r2) goto Lb3
            float r0 = r3.f22213e
            float r1 = r3.m18927b(r4)
            float r0 = r0 * r1
            float r1 = r3.f22217i
            float r0 = r0 / r1
            r3.f22213e = r0
            r3.setScaleX(r0)
            float r0 = r3.f22213e
            r3.setScaleY(r0)
            boolean r0 = r3.f22221m
            if (r0 == 0) goto Lb3
            float r0 = r3.f22214f
            float r1 = r3.m18926a(r4)
            float r0 = r0 + r1
            float r1 = r3.f22218j
            float r0 = r0 - r1
            r3.f22214f = r0
            r1 = 1135869952(0x43b40000, float:360.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L90
            float r0 = r0 - r1
            r3.f22214f = r0
        L90:
            float r0 = r3.f22214f
            r2 = -1011613696(0xffffffffc3b40000, float:-360.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L9b
            float r0 = r0 + r1
            r3.f22214f = r0
        L9b:
            float r0 = r3.f22214f
            r3.setRotation(r0)
            goto Lb3
        La1:
            r0 = 0
            r3.f22219k = r0
            goto Lb3
        La5:
            r3.f22219k = r1
            float r0 = r4.getRawX()
            r3.f22215g = r0
            float r0 = r4.getRawY()
            r3.f22216h = r0
        Lb3:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.microshow.rxffmpeg.player.ScaleTextureView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setEnabledRotation(boolean z10) {
        this.f22221m = z10;
    }

    public void setEnabledTouch(boolean z10) {
        this.f22220l = z10;
    }

    public void setEnabledTranslation(boolean z10) {
        this.f22222n = z10;
    }

    public ScaleTextureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScaleTextureView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22213e = 1.0f;
        this.f22220l = true;
        this.f22221m = true;
        this.f22222n = true;
        setClickable(true);
    }
}
