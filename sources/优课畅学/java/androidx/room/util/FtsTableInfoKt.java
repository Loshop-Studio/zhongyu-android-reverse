package androidx.room.util;

import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;
import p134i7.AbstractC8778f0;

/* loaded from: classes3.dex */
public final class FtsTableInfoKt {
    public static final boolean equalsCommon(FtsTableInfo ftsTableInfo, Object obj) {
        AbstractC9133u.m16133g(ftsTableInfo, "<this>");
        if (ftsTableInfo == obj) {
            return true;
        }
        if (!(obj instanceof FtsTableInfo)) {
            return false;
        }
        FtsTableInfo ftsTableInfo2 = (FtsTableInfo) obj;
        if (AbstractC9133u.m16128b(ftsTableInfo.name, ftsTableInfo2.name) && AbstractC9133u.m16128b(ftsTableInfo.columns, ftsTableInfo2.columns)) {
            return AbstractC9133u.m16128b(ftsTableInfo.options, ftsTableInfo2.options);
        }
        return false;
    }

    public static final int hashCodeCommon(FtsTableInfo ftsTableInfo) {
        AbstractC9133u.m16133g(ftsTableInfo, "<this>");
        return (((ftsTableInfo.name.hashCode() * 31) + ftsTableInfo.columns.hashCode()) * 31) + ftsTableInfo.options.hashCode();
    }

    public static final String toStringCommon(FtsTableInfo ftsTableInfo) {
        AbstractC9133u.m16133g(ftsTableInfo, "<this>");
        return AbstractC8680s.m14088p("\n            |FtsTableInfo {\n            |   name = '" + ftsTableInfo.name + "',\n            |   columns = {" + TableInfoKt.formatString(AbstractC8778f0.m14535L0(ftsTableInfo.columns)) + "\n            |   options = {" + TableInfoKt.formatString(AbstractC8778f0.m14535L0(ftsTableInfo.options)) + "\n            |}\n        ", null, 1, null);
    }
}
