package p263u5;

import android.graphics.Bitmap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: u5.b */
/* loaded from: classes4.dex */
public final class C9683b {

    /* renamed from: a */
    public static final C9683b f17119a = new C9683b();

    /* renamed from: a */
    public final void m16159a(Bitmap[] bitmap, Function0 onEnd) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        int length = bitmap.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            Bitmap bitmap2 = bitmap[i9];
            int i11 = i10 + 1;
            if (bitmap2 != null) {
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                if (i10 == ArraysKt.getLastIndex(bitmap)) {
                    onEnd.invoke();
                }
            }
            i9++;
            i10 = i11;
        }
    }
}
