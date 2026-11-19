package com.zykj.blackboard.core.canvas.view;

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
import com.zykj.blackboard.R$drawable;
import com.zykj.blackboard.core.canvas.view.MaskView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p390w9.InterfaceC11716e;

/* loaded from: classes5.dex */
public final class MaskView extends View implements InterfaceC11716e {

    /* renamed from: c */
    public final Path f18006c;

    /* renamed from: d */
    public Bitmap f18007d;

    /* renamed from: e */
    public final Rect f18008e;

    /* renamed from: f */
    public final Rect f18009f;

    /* renamed from: g */
    public Paint f18010g;

    /* renamed from: h */
    public Map f18011h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* renamed from: d */
    public static final void m13972d(MaskView this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.setVisibility(8);
    }

    /* renamed from: e */
    public static final void m13973e(MaskView this$0) {
        AbstractC9979u.m20294g(this$0, "this$0");
        this$0.setVisibility(0);
    }

    private final Bitmap getMBitmap() {
        if (this.f18007d.isRecycled()) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R$drawable.pic_mask);
            AbstractC9979u.m20293f(bitmapDecodeResource, "decodeResource(\n        …ic_mask\n                )");
            this.f18007d = bitmapDecodeResource;
        }
        return this.f18007d;
    }

    @Override // p390w9.InterfaceC11716e
    /* renamed from: a */
    public void mo13974a(RectF rectF) {
        AbstractC9979u.m20294g(rectF, "rectF");
        Path path = this.f18006c;
        path.reset();
        path.addRect(rectF, Path.Direction.CCW);
    }

    @Override // p390w9.InterfaceC11716e
    public void hide() {
        post(new Runnable() { // from class: w9.f
            @Override // java.lang.Runnable
            public final void run() {
                MaskView.m13972d(this.f27876c);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw hide");
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        super.onDraw(canvas);
        Log.i("DrawView", "MaskView -> onDraw s");
        int iSave = canvas.save();
        canvas.clipPath(this.f18006c, Region.Op.DIFFERENCE);
        try {
            try {
                Bitmap mBitmap = getMBitmap();
                this.f18008e.set(0, 0, mBitmap.getWidth(), mBitmap.getHeight());
                this.f18009f.set(0, 0, getWidth(), getHeight());
                canvas.drawBitmap(mBitmap, this.f18008e, this.f18009f, (Paint) null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            canvas.drawPath(this.f18006c, this.f18010g);
            Log.i("DrawView", "MaskView -> onDraw e");
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // p390w9.InterfaceC11716e
    public void refresh() {
        Log.i("DrawView", "MaskView -> onDraw refresh");
        postInvalidate();
    }

    @Override // p390w9.InterfaceC11716e
    public void show() {
        post(new Runnable() { // from class: w9.g
            @Override // java.lang.Runnable
            public final void run() {
                MaskView.m13973e(this.f27877c);
            }
        });
        Log.i("DrawView", "MaskView -> onDraw show");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskView(Context context, AttributeSet attributeSet, int i10) {
        Object objM20054c;
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f18011h = new LinkedHashMap();
        this.f18006c = new Path();
        try {
            Result.C9921a c9921a = Result.f23263d;
            objM20054c = Result.m20054c(BitmapFactory.decodeResource(context.getResources(), R$drawable.pic_mask));
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        objM20054c = Result.m20056e(objM20054c) != null ? Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888) : objM20054c;
        AbstractC9979u.m20293f(objM20054c, "runCatching {\n        Bi…p.Config.ARGB_8888)\n    }");
        this.f18007d = (Bitmap) objM20054c;
        this.f18008e = new Rect();
        this.f18009f = new Rect();
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#979797"));
        paint.setStrokeWidth(3.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{30.0f, 15.0f}, 0.0f));
        paint.setDither(true);
        paint.setAntiAlias(true);
        this.f18010g = paint;
    }

    public /* synthetic */ MaskView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
