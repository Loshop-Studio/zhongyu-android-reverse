package androidx.room.util;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class KClassUtil {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <T, C> T findAndInstantiateDatabaseImpl(Class<C> klass, String suffix) throws ClassNotFoundException {
        String name;
        String str;
        AbstractC9979u.m20294g(klass, "klass");
        AbstractC9979u.m20294g(suffix, "suffix");
        Package r02 = klass.getPackage();
        if (r02 == null || (name = r02.getName()) == null) {
            name = "";
        }
        String canonicalName = klass.getCanonicalName();
        AbstractC9979u.m20291d(canonicalName);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            AbstractC9979u.m20293f(canonicalName, "substring(...)");
        }
        String str2 = AbstractC10819z.m23237J(canonicalName, '.', '_', false, 4, null) + suffix;
        try {
            if (name.length() == 0) {
                str = str2;
            } else {
                str = name + '.' + str2;
            }
            Class<?> cls = Class.forName(str, true, klass.getClassLoader());
            AbstractC9979u.m20292e(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl>");
            return (T) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str2 + " does not exist. Is Room annotation processor correctly configured?", e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("Cannot access the constructor " + klass.getCanonicalName(), e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException("Failed to create an instance of " + klass.getCanonicalName(), e12);
        }
    }

    public static /* synthetic */ Object findAndInstantiateDatabaseImpl$default(Class cls, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "_Impl";
        }
        return findAndInstantiateDatabaseImpl(cls, str);
    }
}
