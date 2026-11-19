package p131v0;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC3531f;

/* renamed from: v0.h */
/* loaded from: classes2.dex */
public abstract class AbstractC4625h {
    /* renamed from: a */
    public static float m6409a() {
        return 5.0f;
    }

    /* renamed from: b */
    public static float m6410b() {
        return 3.0f;
    }

    /* renamed from: c */
    public static Paint m6411c(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#B0000000"));
        return paint;
    }

    /* renamed from: d */
    public static Paint m6412d(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: e */
    public static Paint m6413e(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(AbstractC3531f.m4071d(context, R$attr.colorAccent));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: f */
    public static Paint m6414f(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
