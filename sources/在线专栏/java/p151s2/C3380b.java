package p151s2;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import p082e3.C2496v;
import p155t2.C3402a;
import p159u2.C3413a;

/* renamed from: s2.b */
/* loaded from: classes.dex */
public final class C3380b {

    /* renamed from: a */
    @NotNull
    public static final C3379a f11866a;

    static {
        C3379a c3379a;
        int iM10293a = m10293a();
        if (iM10293a >= 65544) {
            try {
                try {
                    Object objNewInstance = C3413a.class.newInstance();
                    C2769l.m9240d(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        c3379a = (C3379a) objNewInstance;
                    } catch (ClassCastException e4) {
                        Throwable thInitCause = new ClassCastException("Instance classloader: " + objNewInstance.getClass().getClassLoader() + ", base type classloader: " + C3379a.class.getClassLoader()).initCause(e4);
                        C2769l.m9240d(thInitCause, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause;
                    }
                } catch (ClassNotFoundException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                Object objNewInstance2 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                C2769l.m9240d(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c3379a = (C3379a) objNewInstance2;
                } catch (ClassCastException e5) {
                    Throwable thInitCause2 = new ClassCastException("Instance classloader: " + objNewInstance2.getClass().getClassLoader() + ", base type classloader: " + C3379a.class.getClassLoader()).initCause(e5);
                    C2769l.m9240d(thInitCause2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause2;
                }
            }
        } else if (iM10293a >= 65543) {
            try {
                Object objNewInstance3 = C3402a.class.newInstance();
                C2769l.m9240d(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    try {
                        c3379a = (C3379a) objNewInstance3;
                    } catch (ClassCastException e6) {
                        Throwable thInitCause3 = new ClassCastException("Instance classloader: " + objNewInstance3.getClass().getClassLoader() + ", base type classloader: " + C3379a.class.getClassLoader()).initCause(e6);
                        C2769l.m9240d(thInitCause3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw thInitCause3;
                    }
                } catch (ClassNotFoundException unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C2769l.m9240d(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c3379a = (C3379a) objNewInstance4;
                } catch (ClassCastException e7) {
                    Throwable thInitCause4 = new ClassCastException("Instance classloader: " + objNewInstance4.getClass().getClassLoader() + ", base type classloader: " + C3379a.class.getClassLoader()).initCause(e7);
                    C2769l.m9240d(thInitCause4, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw thInitCause4;
                }
            }
        } else {
            c3379a = new C3379a();
        }
        f11866a = c3379a;
    }

    /* renamed from: a */
    private static final int m10293a() {
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            return 65542;
        }
        int iM8380T = C2496v.m8380T(property, '.', 0, false, 6, null);
        if (iM8380T < 0) {
            try {
                return Integer.parseInt(property) * ArrayPool.STANDARD_BUFFER_SIZE_BYTES;
            } catch (NumberFormatException unused) {
                return 65542;
            }
        }
        int i4 = iM8380T + 1;
        int iM8380T2 = C2496v.m8380T(property, '.', i4, false, 4, null);
        if (iM8380T2 < 0) {
            iM8380T2 = property.length();
        }
        String strSubstring = property.substring(0, iM8380T);
        C2769l.m9240d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        String strSubstring2 = property.substring(i4, iM8380T2);
        C2769l.m9240d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        try {
            return (Integer.parseInt(strSubstring) * ArrayPool.STANDARD_BUFFER_SIZE_BYTES) + Integer.parseInt(strSubstring2);
        } catch (NumberFormatException unused2) {
            return 65542;
        }
    }
}
