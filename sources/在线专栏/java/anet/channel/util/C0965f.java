package anet.channel.util;

import java.net.Inet6Address;

/* renamed from: anet.channel.util.f */
/* loaded from: classes.dex */
public class C0965f {

    /* renamed from: a */
    public int f5482a;

    /* renamed from: b */
    public Inet6Address f5483b;

    public C0965f(Inet6Address inet6Address, int i4) {
        this.f5482a = i4;
        this.f5483b = inet6Address;
    }

    public String toString() {
        return this.f5483b.getHostAddress() + "/" + this.f5482a;
    }
}
