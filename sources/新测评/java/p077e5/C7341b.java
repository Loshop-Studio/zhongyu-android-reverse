package p077e5;

import android.graphics.Bitmap;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.b */
/* loaded from: classes4.dex */
public final class C7341b {

    /* renamed from: a */
    public static final C7341b f11907a = new C7341b();

    /* renamed from: a */
    public final void m11742a(Bitmap[] bitmap, Function0 onEnd) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(onEnd, "onEnd");
        int length = bitmap.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Bitmap bitmap2 = bitmap[i10];
            int i12 = i11 + 1;
            if (bitmap2 != null) {
                if (!bitmap2.isRecycled()) {
                    bitmap2.recycle();
                }
                if (i11 == ArraysKt.getLastIndex(bitmap)) {
                    onEnd.invoke();
                }
            }
            i10++;
            i11 = i12;
        }
    }
}
