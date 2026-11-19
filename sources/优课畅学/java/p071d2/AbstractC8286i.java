package p071d2;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.utils.AbstractC6877g;

/* renamed from: d2.i */
/* loaded from: classes4.dex */
public abstract class AbstractC8286i {
    /* renamed from: a */
    public static float m13454a() {
        return 5.0f;
    }

    /* renamed from: b */
    public static float m13455b() {
        return 3.0f;
    }

    /* renamed from: c */
    public static Paint m13456c(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#B0000000"));
        return paint;
    }

    /* renamed from: d */
    public static Paint m13457d(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: e */
    public static Paint m13458e(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(AbstractC6877g.m6472f(context));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: f */
    public static Paint m13459f(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
