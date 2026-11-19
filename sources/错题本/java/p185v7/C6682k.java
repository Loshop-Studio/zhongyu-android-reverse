package p185v7;

import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5862w;
import okhttp3.Protocol;

/* renamed from: v7.k */
/* loaded from: classes4.dex */
public final class C6682k extends C6685n {

    /* renamed from: c */
    public static final boolean f11273c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM5410D = property != null ? AbstractC5862w.m5410D(property) : null;
        boolean z8 = false;
        if (numM5410D == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z8 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM5410D.intValue() >= 9) {
            z8 = true;
        }
        f11273c = z8;
    }

    @Override // p185v7.C6685n
    /* renamed from: d */
    public final void mo6331d(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC5830k.m5330g(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((Protocol) obj) != Protocol.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((Protocol) obj2).getProtocol());
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // p185v7.C6685n
    /* renamed from: f */
    public final String mo6332f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
