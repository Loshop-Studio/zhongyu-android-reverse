package p168h0;

import anet.channel.request.Request;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: h0.b */
/* loaded from: classes3.dex */
public interface InterfaceC9435b {

    /* renamed from: a */
    public static final Charset f21837a = Charset.forName(Request.DEFAULT_CHARSET);

    /* renamed from: b */
    void mo2797b(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
