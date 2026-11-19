package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(m7879d1 = {"kotlinx/coroutines/internal/SystemPropsKt__SystemPropsKt", "kotlinx/coroutines/internal/SystemPropsKt__SystemProps_commonKt"}, m7881k = 4, m7882mv = {2, 1, 0}, m7884xi = 48)
/* loaded from: classes4.dex */
public final class SystemPropsKt {
    public static final int getAVAILABLE_PROCESSORS() {
        return SystemPropsKt__SystemPropsKt.getAVAILABLE_PROCESSORS();
    }

    public static final int systemProp(String str, int i6, int i7, int i8) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, i6, i7, i8);
    }

    public static final long systemProp(String str, long j6, long j7, long j8) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, j6, j7, j8);
    }

    public static final String systemProp(String str) {
        return SystemPropsKt__SystemPropsKt.systemProp(str);
    }

    public static final String systemProp(String str, String str2) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, str2);
    }

    public static final boolean systemProp(String str, boolean z6) {
        return SystemPropsKt__SystemProps_commonKt.systemProp(str, z6);
    }
}
