package p283w5;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w5.a */
/* loaded from: classes4.dex */
public final class C9826a {
    /* renamed from: a */
    public final int m16738a(DownloadFlag flag) {
        Intrinsics.checkNotNullParameter(flag, "flag");
        return flag.ordinal();
    }

    /* renamed from: b */
    public final DownloadFlag m16739b(int i9) {
        return DownloadFlag.values()[i9];
    }
}
