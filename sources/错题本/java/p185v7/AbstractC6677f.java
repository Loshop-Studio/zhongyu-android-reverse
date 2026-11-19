package p185v7;

import org.conscrypt.Conscrypt;

/* renamed from: v7.f */
/* loaded from: classes4.dex */
public abstract class AbstractC6677f {
    /* renamed from: a */
    public static boolean m6358a() {
        Conscrypt.Version version = Conscrypt.version();
        if (version.major() != 2) {
            if (version.major() <= 2) {
                return false;
            }
        } else if (version.minor() != 1) {
            if (version.minor() <= 1) {
                return false;
            }
        } else if (version.patch() < 0) {
            return false;
        }
        return true;
    }
}
