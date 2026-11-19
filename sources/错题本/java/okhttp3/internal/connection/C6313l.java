package okhttp3.internal.connection;

import java.io.IOException;
import java.net.Socket;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5830k;
import p139p7.AbstractC6396c;
import p152r6.InterfaceC6469a;
import p153r7.AbstractC6479a;
import p153r7.C6480b;
import p178u7.C6641o;

/* renamed from: okhttp3.internal.connection.l */
/* loaded from: classes4.dex */
public final class C6313l extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ int f10182e;

    /* renamed from: f */
    public final /* synthetic */ Object f10183f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6313l(Object obj, String str, int i) {
        super(str, true);
        this.f10182e = i;
        this.f10183f = obj;
    }

    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() throws IOException {
        switch (this.f10182e) {
            case 0:
                C6314m c6314m = (C6314m) this.f10183f;
                long jNanoTime = System.nanoTime();
                Iterator it = c6314m.f10187d.iterator();
                int i = 0;
                long j7 = Long.MIN_VALUE;
                C6312k c6312k = null;
                int i8 = 0;
                while (it.hasNext()) {
                    C6312k connection = (C6312k) it.next();
                    AbstractC5830k.m5329f(connection, "connection");
                    synchronized (connection) {
                        if (c6314m.m5934b(connection, jNanoTime) > 0) {
                            i8++;
                        } else {
                            i++;
                            long j8 = jNanoTime - connection.f10181q;
                            if (j8 > j7) {
                                c6312k = connection;
                                j7 = j8;
                            }
                        }
                    }
                }
                long j9 = c6314m.f10184a;
                if (j7 < j9 && i <= 5) {
                    if (i > 0) {
                        return j9 - j7;
                    }
                    if (i8 > 0) {
                        return j9;
                    }
                    return -1L;
                }
                AbstractC5830k.m5327d(c6312k);
                synchronized (c6312k) {
                    if (!c6312k.f10180p.isEmpty()) {
                        return 0L;
                    }
                    if (c6312k.f10181q + j7 != jNanoTime) {
                        return 0L;
                    }
                    c6312k.f10174j = true;
                    c6314m.f10187d.remove(c6312k);
                    Socket socket = c6312k.f10168d;
                    AbstractC5830k.m5327d(socket);
                    AbstractC6396c.m6044d(socket);
                    if (!c6314m.f10187d.isEmpty()) {
                        return 0L;
                    }
                    C6480b c6480b = c6314m.f10185b;
                    c6480b.getClass();
                    synchronized (c6480b.f10650a) {
                        if (c6480b.m6128a()) {
                            c6480b.f10650a.m6135d(c6480b);
                        }
                    }
                    return 0L;
                }
            case 1:
                ((InterfaceC6469a) this.f10183f).invoke();
                return -1L;
            default:
                C6641o c6641o = (C6641o) this.f10183f;
                c6641o.getClass();
                try {
                    c6641o.f11166w.m6309f(false, 2, 0);
                    return -1L;
                } catch (IOException e) {
                    c6641o.m6278b(e);
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6313l(C6314m c6314m, String str) {
        super(str, true);
        this.f10182e = 0;
        this.f10183f = c6314m;
    }
}
