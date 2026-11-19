package p256t7;

import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* renamed from: t7.h */
/* loaded from: classes5.dex */
public abstract class AbstractC10123h extends AbstractC10122g {
    /* renamed from: d */
    public static boolean m18877d(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        while (true) {
            boolean z10 = true;
            for (File file2 : AbstractC10122g.m18876c(file)) {
                if (!file2.delete() && file2.exists()) {
                    z10 = false;
                } else {
                    if (z10) {
                        break;
                    }
                    z10 = false;
                }
            }
            return z10;
        }
    }

    /* renamed from: e */
    public static String m18878e(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        String name = file.getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        return AbstractC8661c0.m13976T0(name, '.', "");
    }

    /* renamed from: f */
    public static String m18879f(File file) {
        AbstractC9133u.m16133g(file, "<this>");
        String name = file.getName();
        AbstractC9133u.m16132f(name, "getName(...)");
        return AbstractC8661c0.m13980V0(name, ".", null, 2, null);
    }
}
