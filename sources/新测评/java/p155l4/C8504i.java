package p155l4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import com.blankj.utilcode.util.LogUtils;
import com.zykj.blackboard.R$drawable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l4.i */
/* loaded from: classes4.dex */
public final class C8504i extends View implements InterfaceC8501f {

    /* renamed from: a */
    public final Path f14097a;

    /* renamed from: b */
    public Bitmap f14098b;

    /* renamed from: c */
    public final Rect f14099c;

    /* renamed from: d */
    public final Rect f14100d;

    /* renamed from: e */
    public Paint f14101e;

    /* renamed from: f */
    public Map f14102f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8504i(Context context, AttributeSet attributeSet, int i10) {
        Object objM24299constructorimpl;
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f14102f = new LinkedHashMap();
        this.f14097a = new Path();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(BitmapFactory.decodeResource(context.getResources(), R$drawable.pic_mask));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
        }
        Bitmap bitmapCreateBitmap = (Bitmap) (Result.m24305isFailureimpl(objM24299constructorimpl) ? null : objM24299constructorimpl);
        if (bitmapCreateBitmap == null) {
            LogUtils.m3238e("页面MaskView.kt=>MaskBitmap", "decode pic_mask failed, use fallback");
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "run {\n        LogUtils.e…p.Config.ARGB_8888)\n    }");
        }
        this.f14098b = bitmapCreateBitmap;
        this.f14099c = new Rect();
        this.f14100d = new Rect();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#979797"));
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f14101e = paint;
    }

    /* renamed from: d */
    public static final void m13973d(C8504i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* renamed from: e */
    public static final void m13974e(C8504i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(0);
    }

    private final Bitmap getMBitmap() {
        if (this.f14098b.isRecycled()) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R$drawable.pic_mask);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(\n        …ic_mask\n                )");
            this.f14098b = bitmapDecodeResource;
        }
        return this.f14098b;
    }

    @Override // p155l4.InterfaceC8501f
    /* renamed from: a */
    public void mo13970a(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Path path = this.f14097a;
        path.reset();
        path.addRect(rectF, Path.Direction.CCW);
    }

    @Override // p155l4.InterfaceC8501f
    public void hide() {
        post(new Runnable() { // from class: l4.g
            @Override // java.lang.Runnable
            public final void run() {
                C8504i.m13973d(this.f14095a);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw hide");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Log.i("DrawView", "MaskView -> onDraw s");
        int iSave = canvas.save();
        canvas.clipPath(this.f14097a, Region.Op.DIFFERENCE);
        try {
            try {
                Bitmap mBitmap = getMBitmap();
                this.f14099c.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
                this.f14100d.set(0, 0, getWidth(), getHeight());
                canvas.drawBitmap(mBitmap, this.f14099c, this.f14100d, (Paint) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            canvas.drawPath(this.f14097a, this.f14101e);
            Log.i("DrawView", "MaskView -> onDraw e");
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // p155l4.InterfaceC8501f
    public void refresh() {
        Log.i("DrawView", "MaskView -> onDraw refresh");
        postInvalidate();
    }

    @Override // p155l4.InterfaceC8501f
    public void show() {
        post(new Runnable() { // from class: l4.h
            @Override // java.lang.Runnable
            public final void run() {
                C8504i.m13974e(this.f14096a);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw show");
    }

    public /* synthetic */ C8504i(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
