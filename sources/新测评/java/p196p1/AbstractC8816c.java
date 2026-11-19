package p196p1;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: p1.c */
/* loaded from: classes.dex */
public abstract class AbstractC8816c {
    /* renamed from: a */
    public static int m14772a(Context context, float f10) {
        float fApplyDimension = TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
        int i10 = (int) (fApplyDimension + 0.5d);
        if (i10 != 0 || fApplyDimension <= 0.0f) {
            return i10;
        }
        return 1;
    }
}
