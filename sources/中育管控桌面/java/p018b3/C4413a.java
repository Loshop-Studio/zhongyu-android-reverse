package p018b3;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b3.a */
/* loaded from: classes3.dex */
public final class C4413a {
    /* renamed from: a */
    public final int m1473a(DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return flag.ordinal();
    }

    /* renamed from: b */
    public final DownloadFlag m1474b(int i6) {
        return DownloadFlag.values()[i6];
    }
}
