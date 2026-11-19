package androidx.room.util;

import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10812s;
import p325rc.AbstractC10947g0;

/* loaded from: classes3.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(FtsTableInfo ftsTableInfo, Object obj) {
        AbstractC9979u.m20294g(ftsTableInfo, "<this>");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (AbstractC9979u.m20289b(ftsTableInfo.name, ftsTableInfo2.name) && AbstractC9979u.m20289b(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return AbstractC9979u.m20289b(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(FtsTableInfo ftsTableInfo) {
        AbstractC9979u.m20294g(ftsTableInfo, "<this>");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    public static final String toStringCommon(FtsTableInfo ftsTableInfo) {
        AbstractC9979u.m20294g(ftsTableInfo, "<this>");
        return AbstractC10812s.m23223p("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.formatString(AbstractC10947g0.m23912N0(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.formatString(AbstractC10947g0.m23912N0(ftsTableInfo.options)) + "\n            |}\n        ", null, 1, null);
    }
}
