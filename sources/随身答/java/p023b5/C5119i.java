package p023b5;

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

/* renamed from: b5.i */
/* loaded from: classes4.dex */
public final class C5119i extends View implements InterfaceC5116f {

    /* renamed from: a */
    public final Path f2235a;

    /* renamed from: b */
    public Bitmap f2236b;

    /* renamed from: c */
    public final Rect f2237c;

    /* renamed from: d */
    public final Rect f2238d;

    /* renamed from: e */
    public Paint f2239e;

    /* renamed from: f */
    public Map f2240f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5119i(Context context, AttributeSet attributeSet, int i9) {
        Object objM24758constructorimpl;
        super(context, attributeSet, i9);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2240f = new LinkedHashMap();
        this.f2235a = new Path();
        try {
            Result.Companion companion = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(BitmapFactory.decodeResource(context.getResources(), R$drawable.pic_mask));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
        }
        Bitmap bitmapCreateBitmap = (Bitmap) (Result.m24764isFailureimpl(objM24758constructorimpl) ? null : objM24758constructorimpl);
        if (bitmapCreateBitmap == null) {
            LogUtils.m2955e("页面MaskView.kt=>MaskBitmap", "decode pic_mask failed, use fallback");
            bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "run {\n        LogUtils.e…p.Config.ARGB_8888)\n    }");
        }
        this.f2236b = bitmapCreateBitmap;
        this.f2237c = new Rect();
        this.f2238d = new Rect();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#979797"));
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f2239e = paint;
    }

    /* renamed from: d */
    public static final void m2180d(C5119i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* renamed from: e */
    public static final void m2181e(C5119i this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setVisibility(0);
    }

    private final Bitmap getMBitmap() {
        if (this.f2236b.isRecycled()) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R$drawable.pic_mask);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(\n        …ic_mask\n                )");
            this.f2236b = bitmapDecodeResource;
        }
        return this.f2236b;
    }

    @Override // p023b5.InterfaceC5116f
    /* renamed from: a */
    public void mo2177a(RectF rectF) {
        Intrinsics.checkNotNullParameter(rectF, "rectF");
        Path path = this.f2235a;
        path.reset();
        path.addRect(rectF, Path.Direction.CCW);
    }

    @Override // p023b5.InterfaceC5116f
    public void hide() {
        post(new Runnable() { // from class: b5.g
            @Override // java.lang.Runnable
            public final void run() {
                C5119i.m2180d(this.f2233a);
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
        canvas.clipPath(this.f2235a, Region.Op.DIFFERENCE);
        try {
            try {
                Bitmap mBitmap = getMBitmap();
                this.f2237c.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
                this.f2238d.set(0, 0, getWidth(), getHeight());
                canvas.drawBitmap(mBitmap, this.f2237c, this.f2238d, (Paint) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            canvas.drawPath(this.f2235a, this.f2239e);
            Log.i("DrawView", "MaskView -> onDraw e");
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // p023b5.InterfaceC5116f
    public void refresh() {
        Log.i("DrawView", "MaskView -> onDraw refresh");
        postInvalidate();
    }

    @Override // p023b5.InterfaceC5116f
    public void show() {
        post(new Runnable() { // from class: b5.h
            @Override // java.lang.Runnable
            public final void run() {
                C5119i.m2181e(this.f2234a);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw show");
    }

    public /* synthetic */ C5119i(Context context, AttributeSet attributeSet, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet, (i10 & 4) != 0 ? 0 : i9);
    }
}
