package androidx.room.util;

import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;

/* loaded from: classes3.dex */
public final class ViewInfoKt {
    public static final boolean equalsCommon(ViewInfo viewInfo, Object obj) {
        AbstractC9133u.m16133g(viewInfo, "<this>");
        if (viewInfo == obj) {
            return true;
        }
        if (!(obj instanceof ViewInfo)) {
            return false;
        }
        ViewInfo viewInfo2 = (ViewInfo) obj;
        if (AbstractC9133u.m16128b(viewInfo.name, viewInfo2.name)) {
            String str = viewInfo.sql;
            if (str != null ? AbstractC9133u.m16128b(str, viewInfo2.sql) : viewInfo2.sql == null) {
                return true;
            }
        }
        return false;
    }

    public static final int hashCodeCommon(ViewInfo viewInfo) {
        AbstractC9133u.m16133g(viewInfo, "<this>");
        int iHashCode = viewInfo.name.hashCode() * 31;
        String str = viewInfo.sql;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public static final String toStringCommon(ViewInfo viewInfo) {
        AbstractC9133u.m16133g(viewInfo, "<this>");
        return AbstractC8680s.m14088p("\n            |ViewInfo {\n            |   name = '" + viewInfo.name + "',\n            |   sql = '" + viewInfo.sql + "'\n            |}\n        ", null, 1, null);
    }
}
