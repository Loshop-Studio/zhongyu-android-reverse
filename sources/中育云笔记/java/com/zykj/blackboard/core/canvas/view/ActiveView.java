package com.zykj.blackboard.core.canvas.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import na.C10342e;
import p390w9.InterfaceC11712a;

/* loaded from: classes5.dex */
public final class ActiveView extends View implements InterfaceC11712a {

    /* renamed from: c */
    public Bitmap f17976c;

    /* renamed from: d */
    public final Matrix f17977d;

    /* renamed from: e */
    public final Path f17978e;

    /* renamed from: f */
    public final Paint f17979f;

    /* renamed from: g */
    public Map f17980g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context) {
        this(context, null, 0, 6, null);
        AbstractC9979u.m20294g(context, "context");
    }

    @Override // p390w9.InterfaceC11712a
    /* renamed from: a */
    public void mo13958a(Bitmap bitmap, Matrix matrix) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        this.f17978e.reset();
        this.f17976c = bitmap.copy(Bitmap.Config.ARGB_8888, false);
        this.f17977d.reset();
        if (matrix != null) {
            this.f17977d.set(new Matrix(matrix));
        }
        Log.i("DrawView", "Active-> drawBitmap()");
        postInvalidateOnAnimation();
    }

    @Override // p390w9.InterfaceC11712a
    /* renamed from: b */
    public void mo13959b(Path path, Paint paint, Matrix matrix) {
        AbstractC9979u.m20294g(path, "path");
        AbstractC9979u.m20294g(paint, "paint");
        Path path2 = new Path(path);
        Matrix matrix2 = matrix != null ? new Matrix(matrix) : null;
        this.f17976c = null;
        this.f17978e.set(path2);
        if (matrix2 != null) {
            this.f17978e.transform(matrix2);
        }
        this.f17979f.set(paint);
        Log.i("DrawView", "Active-> drawPath()");
        postInvalidateOnAnimation();
    }

    @Override // p390w9.InterfaceC11712a
    public void clear() {
        this.f17978e.reset();
        this.f17976c = null;
        Log.i("DrawView", "Active-> clear()");
        postInvalidateOnAnimation();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i("DrawView", "Active -> onDraw s");
        if (canvas != null) {
            Bitmap bitmap = this.f17976c;
            if (bitmap != null) {
                C10342e.f24648a.m21630a(canvas, bitmap, this.f17977d);
            }
            if (!this.f17978e.isEmpty()) {
                canvas.drawPath(this.f17978e, this.f17979f);
            }
        }
        Log.i("DrawView", "Active -> onDraw e");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC9979u.m20294g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActiveView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        AbstractC9979u.m20294g(context, "context");
        this.f17980g = new LinkedHashMap();
        this.f17977d = new Matrix();
        this.f17978e = new Path();
        this.f17979f = new Paint();
    }

    public /* synthetic */ ActiveView(Context context, AttributeSet attributeSet, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }
}
