package p162v1;

import com.zykj.download.DownloadFlag;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;

/* renamed from: v1.a */
/* loaded from: classes.dex */
public final class C3418a {
    /* renamed from: a */
    public final int m10417a(@NotNull DownloadFlag flag) {
        C2769l.m9241e(flag, "flag");
        return flag.ordinal();
    }

    @NotNull
    /* renamed from: b */
    public final DownloadFlag m10418b(int i4) {
        return DownloadFlag.values()[i4];
    }
}
