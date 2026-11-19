package p075e3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.utils.AbstractC6482g;

/* renamed from: e3.h */
/* loaded from: classes4.dex */
public abstract class AbstractC7337h {
    /* renamed from: a */
    public static float m11735a() {
        return 5.0f;
    }

    /* renamed from: b */
    public static float m11736b() {
        return 3.0f;
    }

    /* renamed from: c */
    public static Paint m11737c(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#B0000000"));
        return paint;
    }

    /* renamed from: d */
    public static Paint m11738d(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: e */
    public static Paint m11739e(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(AbstractC6482g.m5375f(context));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: f */
    public static Paint m11740f(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
