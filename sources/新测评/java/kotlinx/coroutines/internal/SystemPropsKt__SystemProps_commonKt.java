package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m13557d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a,\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0000\u001a,\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¨\u0006\t"}, m13558d2 = {"systemProp", "", "propertyName", "", "defaultValue", "", "minValue", "maxValue", "", "kotlinx-coroutines-core"}, m13559k = 5, m13560mv = {2, 1, 0}, m13562xi = 48, m13563xs = "kotlinx/coroutines/internal/SystemPropsKt")
/* loaded from: classes5.dex */
public final /* synthetic */ class SystemPropsKt__SystemProps_commonKt {
    public static final boolean systemProp(String str, boolean z9) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp != null ? Boolean.parseBoolean(strSystemProp) : z9;
    }

    public static /* synthetic */ int systemProp$default(String str, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i11 = 1;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static final int systemProp(String str, int i10, int i11, int i12) {
        return (int) SystemPropsKt.systemProp(str, i10, i11, i12);
    }

    public static /* synthetic */ long systemProp$default(String str, long j10, long j11, long j12, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            j11 = 1;
        }
        long j13 = j11;
        if ((i10 & 8) != 0) {
            j12 = Long.MAX_VALUE;
        }
        return SystemPropsKt.systemProp(str, j10, j13, j12);
    }

    public static final long systemProp(String str, long j10, long j11, long j12) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        if (strSystemProp == null) {
            return j10;
        }
        Long longOrNull = StringsKt.toLongOrNull(strSystemProp);
        if (longOrNull == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strSystemProp + '\'').toString());
        }
        long jLongValue = longOrNull.longValue();
        if (j11 <= jLongValue && jLongValue <= j12) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j11 + ".." + j12 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final String systemProp(String str, String str2) {
        String strSystemProp = SystemPropsKt.systemProp(str);
        return strSystemProp == null ? str2 : strSystemProp;
    }
}
