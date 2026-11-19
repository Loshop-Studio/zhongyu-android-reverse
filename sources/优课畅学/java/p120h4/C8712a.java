package p120h4;

import android.graphics.Paint;
import android.graphics.Path;

/* renamed from: h4.a */
/* loaded from: classes.dex */
public class C8712a {

    /* renamed from: a */
    public Paint f16333a;

    /* renamed from: b */
    public Path f16334b = new Path();

    /* renamed from: c */
    public float f16335c = 0.0f;

    /* renamed from: d */
    public float f16336d = 0.0f;

    public C8712a() {
        Paint paint = new Paint();
        this.f16333a = paint;
        paint.setAntiAlias(true);
        this.f16333a.setDither(true);
        this.f16333a.setARGB(255, 0, 0, 0);
        this.f16333a.setStyle(Paint.Style.STROKE);
        this.f16333a.setStrokeJoin(Paint.Join.ROUND);
        this.f16333a.setStrokeCap(Paint.Cap.ROUND);
        this.f16333a.setStrokeWidth(3.0f);
    }
}
