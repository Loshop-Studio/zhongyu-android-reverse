package p070b.p074b.p075a.p076a.p100v;

import android.graphics.Paint;
import android.graphics.Path;
import p000a.p031h.p035d.C0202a;

/* renamed from: b.b.a.a.v.a */
/* loaded from: classes.dex */
public class C0667a {

    /* renamed from: i */
    public static final int[] f3981i = new int[3];

    /* renamed from: j */
    public static final float[] f3982j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f3983k = new int[4];

    /* renamed from: l */
    public static final float[] f3984l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b */
    public final Paint f3986b;

    /* renamed from: c */
    public final Paint f3987c;

    /* renamed from: d */
    public int f3988d;

    /* renamed from: e */
    public int f3989e;

    /* renamed from: f */
    public int f3990f;

    /* renamed from: g */
    public final Path f3991g = new Path();

    /* renamed from: h */
    public Paint f3992h = new Paint();

    /* renamed from: a */
    public final Paint f3985a = new Paint();

    public C0667a() {
        m2278a(-16777216);
        this.f3992h.setColor(0);
        Paint paint = new Paint(4);
        this.f3986b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f3987c = new Paint(paint);
    }

    /* renamed from: a */
    public void m2278a(int i) {
        this.f3988d = C0202a.m757c(i, 68);
        this.f3989e = C0202a.m757c(i, 20);
        this.f3990f = C0202a.m757c(i, 0);
        this.f3985a.setColor(this.f3988d);
    }
}
