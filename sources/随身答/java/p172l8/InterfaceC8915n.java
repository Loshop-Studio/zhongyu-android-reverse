package p172l8;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l8.n */
/* loaded from: classes5.dex */
public interface InterfaceC8915n {

    /* renamed from: a */
    public static final a f14781a = a.f14783a;

    /* renamed from: b */
    public static final InterfaceC8915n f14782b = new a.C10078a();

    /* renamed from: l8.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f14783a = new a();

        /* renamed from: l8.n$a$a, reason: collision with other inner class name */
        public static final class C10078a implements InterfaceC8915n {
            @Override // p172l8.InterfaceC8915n
            /* renamed from: a */
            public List mo13901a(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }
    }

    /* renamed from: a */
    List mo13901a(String str);
}
