package com.huawei.hms.common.internal;

import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a */
        public final List f11550a;

        /* renamed from: b */
        public final Object f11551b;

        public final ToStringHelper add(String str, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str);
            String strValueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str2.length() + strValueOf.length() + 1);
            sb2.append(str2);
            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
            sb2.append(strValueOf);
            this.f11550a.add(sb2.toString());
            return this;
        }

        public final String toString() {
            String simpleName = this.f11551b.getClass().getSimpleName();
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(simpleName);
            sb2.append('{');
            int size = this.f11550a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f11550a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public ToStringHelper(Object obj) {
            this.f11551b = Preconditions.checkNotNull(obj);
            this.f11550a = new ArrayList();
        }
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        return obj != null && obj.equals(obj2);
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static boolean isNull(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj);
    }
}
