package p213p5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import kotlin.jvm.internal.Intrinsics;
import p023b5.InterfaceC5113c;

/* renamed from: p5.c */
/* loaded from: classes4.dex */
public final class C9324c implements InterfaceC5113c {

    /* renamed from: a */
    public final int f16188a;

    /* renamed from: b */
    public final int f16189b;

    /* renamed from: c */
    public int f16190c = -1;

    /* renamed from: d */
    public final Paint f16191d;

    /* renamed from: e */
    public BackgroundLineConfig.BackgroundLineType f16192e;

    /* renamed from: f */
    public float f16193f;

    public C9324c(int i9, int i10) {
        this.f16188a = i9;
        this.f16189b = i10;
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint.setStrokeWidth(3.0f);
        this.f16191d = paint;
        this.f16192e = BackgroundLineConfig.BackgroundLineType.Horizontal;
        this.f16193f = 96.0f;
    }

    @Override // p023b5.InterfaceC5113c
    /* renamed from: a */
    public void mo2173a(Canvas canvas, Matrix matrix) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
    }

    @Override // p023b5.InterfaceC5113c
    public BackgroundLineConfig getBackgroundLineConfig() {
        return new BackgroundLineConfig(this.f16191d.getColor(), this.f16193f, this.f16192e, this.f16191d.getStrokeWidth());
    }

    @Override // p023b5.InterfaceC5113c
    public int getMyBackgroundColor() {
        return this.f16190c;
    }

    @Override // p023b5.InterfaceC5113c
    public void setBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        Intrinsics.checkNotNullParameter(backgroundLineConfig, "backgroundLineConfig");
        this.f16193f = backgroundLineConfig.m7070b();
        this.f16192e = backgroundLineConfig.m7071c();
        this.f16191d.setColor(backgroundLineConfig.m7069a());
        this.f16191d.setStrokeWidth(backgroundLineConfig.m7072d());
    }

    @Override // p023b5.InterfaceC5113c
    public void setMatrix(Matrix adapterMatrix) {
        Intrinsics.checkNotNullParameter(adapterMatrix, "adapterMatrix");
    }

    @Override // p023b5.InterfaceC5113c
    public void setMyBackgroundColor(int i9) {
        this.f16190c = i9;
    }

    @Override // p023b5.InterfaceC5113c
    public void refresh() {
    }
}
