package p207q1;

import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.net.ProtocolException;
import p240t1.InterfaceC9377a;

/* renamed from: q1.e */
/* loaded from: classes2.dex */
public abstract class AbstractC8880e {
    /* renamed from: a */
    public static String m14917a(InterfaceC9377a.a aVar, int i10) throws ProtocolException {
        String strMo15675c = aVar.mo15675c(HttpHeaders.LOCATION);
        if (strMo15675c != null) {
            return strMo15675c;
        }
        throw new ProtocolException("Response code is " + i10 + " but can't find Location field");
    }

    /* renamed from: b */
    public static boolean m14918b(int i10) {
        return i10 == 301 || i10 == 302 || i10 == 303 || i10 == 300 || i10 == 307 || i10 == 308;
    }
}
