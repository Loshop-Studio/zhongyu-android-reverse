package androidx.room.util;

import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10947g0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class StringUtil {
    public static final String[] EMPTY_STRING_ARRAY = new String[0];

    public static final void appendPlaceholders(StringBuilder builder, int i10) {
        AbstractC9979u.m20294g(builder, "builder");
        for (int i11 = 0; i11 < i10; i11++) {
            builder.append("?");
            if (i11 < i10 - 1) {
                builder.append(",");
            }
        }
    }

    @InterfaceC10770a
    public static /* synthetic */ void getEMPTY_STRING_ARRAY$annotations() {
    }

    public static final String joinIntoString(List<Integer> list) {
        if (list != null) {
            return AbstractC10947g0.m23954w0(list, ",", null, null, 0, null, null, 62, null);
        }
        return null;
    }

    @InterfaceC10770a
    public static final StringBuilder newStringBuilder() {
        return new StringBuilder();
    }

    public static final List<Integer> splitToIntList(String str) {
        List listM23090H0;
        Integer numValueOf;
        if (str == null || (listM23090H0 = AbstractC10793c0.m23090H0(str, new char[]{','}, false, 0, 6, null)) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listM23090H0.iterator();
        while (it.hasNext()) {
            try {
                numValueOf = Integer.valueOf(Integer.parseInt((String) it.next()));
            } catch (NumberFormatException unused) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
        }
        return arrayList;
    }
}
