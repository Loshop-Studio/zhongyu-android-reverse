package p209p1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.net.ProtocolException;
import p239s1.InterfaceC9465a;

/* renamed from: p1.e */
/* loaded from: classes4.dex */
public abstract class AbstractC9316e {
    /* renamed from: a */
    public static String m15194a(InterfaceC9465a.a aVar, int i9) throws ProtocolException {
        String strMo15639c = aVar.mo15639c(HttpHeaders.LOCATION);
        if (strMo15639c != null) {
            return strMo15639c;
        }
        throw new ProtocolException("Response code is " + i9 + " but can't find Location field");
    }

    /* renamed from: b */
    public static boolean m15195b(int i9) {
        return i9 == 301 || i9 == 302 || i9 == 303 || i9 == 300 || i9 == 307 || i9 == 308;
    }
}
