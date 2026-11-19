package p162g6;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: g6.c */
/* loaded from: classes5.dex */
public abstract class AbstractC9274c {
    /* renamed from: a */
    public static int m18262a(Context context, float f10) {
        float fApplyDimension = TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
        int i10 = (int) (fApplyDimension + 0.5d);
        if (i10 != 0 || fApplyDimension <= 0.0f) {
            return i10;
        }
        return 1;
    }
}
