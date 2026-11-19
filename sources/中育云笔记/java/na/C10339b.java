package na;

import android.graphics.Bitmap;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p325rc.AbstractC10968r;

/* renamed from: na.b */
/* loaded from: classes5.dex */
public final class C10339b {

    /* renamed from: a */
    public static final C10339b f24642a = new C10339b();

    /* renamed from: a */
    public final void m21620a(Bitmap[] bitmap, InterfaceC9529a onEnd) {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        AbstractC9979u.m20294g(onEnd, "onEnd");
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
                if (i11 == AbstractC10968r.m24041A0(bitmap)) {
                    onEnd.invoke();
                }
            }
            i10++;
            i11 = i12;
        }
    }
}
