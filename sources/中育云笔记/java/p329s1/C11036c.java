package p329s1;

import java.io.File;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.TrustManager;
import p340t1.InterfaceC11200a;
import p340t1.InterfaceC11202c;
import p354u1.InterfaceC11322b;
import p369v1.InterfaceC11412c;

/* renamed from: s1.c */
/* loaded from: classes3.dex */
public class C11036c {

    /* renamed from: a */
    public final File f26608a;

    /* renamed from: b */
    public final InterfaceC11202c f26609b;

    /* renamed from: c */
    public final InterfaceC11200a f26610c;

    /* renamed from: d */
    public final InterfaceC11412c f26611d;

    /* renamed from: e */
    public final InterfaceC11322b f26612e;

    /* renamed from: f */
    public final HostnameVerifier f26613f;

    /* renamed from: g */
    public final TrustManager[] f26614g;

    public C11036c(File file, InterfaceC11202c interfaceC11202c, InterfaceC11200a interfaceC11200a, InterfaceC11412c interfaceC11412c, InterfaceC11322b interfaceC11322b, HostnameVerifier hostnameVerifier, TrustManager[] trustManagerArr) {
        this.f26608a = file;
        this.f26609b = interfaceC11202c;
        this.f26610c = interfaceC11200a;
        this.f26611d = interfaceC11412c;
        this.f26612e = interfaceC11322b;
        this.f26613f = hostnameVerifier;
        this.f26614g = trustManagerArr;
    }

    /* renamed from: a */
    public File m24389a(String str) {
        return new File(this.f26608a, this.f26609b.mo24912a(str));
    }
}
