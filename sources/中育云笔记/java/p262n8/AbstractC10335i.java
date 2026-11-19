package p262n8;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.TypedValue;
import com.xuexiang.xui.R$attr;
import com.xuexiang.xui.utils.AbstractC8041g;

/* renamed from: n8.i */
/* loaded from: classes5.dex */
public abstract class AbstractC10335i {
    /* renamed from: a */
    public static float m21586a() {
        return 5.0f;
    }

    /* renamed from: b */
    public static float m21587b() {
        return 3.0f;
    }

    /* renamed from: c */
    public static Paint m21588c(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#B0000000"));
        return paint;
    }

    /* renamed from: d */
    public static Paint m21589d(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: e */
    public static Paint m21590e(Context context) {
        float fApplyDimension = TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics());
        Paint paint = new Paint();
        paint.setColor(AbstractC8041g.m12217d(context, R$attr.colorAccent));
        paint.setStrokeWidth(fApplyDimension);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }

    /* renamed from: f */
    public static Paint m21591f(Context context) {
        Paint paint = new Paint();
        paint.setColor(Color.parseColor("#AAFFFFFF"));
        paint.setStrokeWidth(1.0f);
        return paint;
    }
}
