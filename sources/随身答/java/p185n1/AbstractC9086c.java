package p185n1;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: n1.c */
/* loaded from: classes4.dex */
public abstract class AbstractC9086c {
    /* renamed from: a */
    public static int m14578a(Context context, float f10) {
        float fApplyDimension = TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
        int i9 = (int) (fApplyDimension + 0.5d);
        if (i9 != 0 || fApplyDimension <= 0.0f) {
            return i9;
        }
        return 1;
    }
}
