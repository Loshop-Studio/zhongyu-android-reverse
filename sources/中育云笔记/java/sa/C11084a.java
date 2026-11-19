package sa;

import com.google.gson.GsonBuilder;
import java.util.Date;
import je.C9742v;
import kotlin.jvm.internal.AbstractC9979u;
import p122df.C9033d0;
import p137ef.C9140a;
import p154ff.C9240k;
import p170h2.C9452c;
import pa.InterfaceC10639a;

/* renamed from: sa.a */
/* loaded from: classes6.dex */
public final class C11084a {
    /* renamed from: a */
    public final InterfaceC10639a m24662a(C9742v okHttpClient) throws SecurityException {
        AbstractC9979u.m20294g(okHttpClient, "okHttpClient");
        Object objM17712b = new C9033d0.b().m17726f(okHttpClient).m17722b("https://hagateway.zyai.cc").m17721a(C9240k.m18163a()).m17721a(C9140a.m17985a(new GsonBuilder().registerTypeAdapter(Date.class, new C9452c()).create())).m17724d().m17712b(InterfaceC10639a.class);
        AbstractC9979u.m20293f(objM17712b, "create(...)");
        return (InterfaceC10639a) objM17712b;
    }
}
