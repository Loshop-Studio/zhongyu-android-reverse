package p261u3;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC6801g;

/* renamed from: u3.h */
/* loaded from: classes4.dex */
public abstract class AbstractC9679h {
    /* renamed from: a */
    public static float m16152a() {
        return 5.0f;
    }

    /* renamed from: b */
    public static float m16153b() {
        return 3.0f;
    }

    /* renamed from: c */
    public static Paint m16154c(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#B0000000"));
        return paint;
    }

    /* renamed from: d */
    public static Paint m16155d(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: e */
    public static Paint m16156e(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(AbstractC6801g.m6479l(context, R$attr.colorAccent));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: f */
    public static Paint m16157f(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
