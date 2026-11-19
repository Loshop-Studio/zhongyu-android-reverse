package p032b6;

import android.content.Context;
import java.io.InputStream;
import p114d6.AbstractC8991a;
import p114d6.AbstractC8992b;
import p114d6.AbstractC8996f;

/* renamed from: b6.d */
/* loaded from: classes5.dex */
public abstract class AbstractC5170d {

    /* renamed from: a */
    public static final String f3019a = "SecureX509SingleInstance";

    /* renamed from: b */
    public static volatile C5171e f3020b;

    /* renamed from: a */
    public static C5171e m2688a(Context context) {
        InputStream inputStreamOpen;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (context == null) {
            throw new NullPointerException("context is null");
        }
        AbstractC8992b.m17550b(context);
        if (f3020b == null) {
            synchronized (AbstractC5170d.class) {
                if (f3020b == null) {
                    try {
                        inputStreamOpen = AbstractC8991a.m17548o(context);
                    } catch (RuntimeException unused) {
                        AbstractC8996f.m17563d(f3019a, "get files bks error");
                        inputStreamOpen = null;
                    }
                    if (inputStreamOpen == null) {
                        AbstractC8996f.m17564e(f3019a, "get assets bks");
                        inputStreamOpen = context.getAssets().open("hmsrootcas.bks");
                    } else {
                        AbstractC8996f.m17564e(f3019a, "get files bks");
                    }
                    f3020b = new C5171e(inputStreamOpen, "");
                }
            }
        }
        AbstractC8996f.m17561b(f3019a, "SecureX509TrustManager getInstance: cost : " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
        return f3020b;
    }
}
