package p011a9;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a9.n */
/* loaded from: classes5.dex */
public interface InterfaceC0051n {

    /* renamed from: a */
    public static final a f153a = a.f155a;

    /* renamed from: b */
    public static final InterfaceC0051n f154b = new a.C10090a();

    /* renamed from: a9.n$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f155a = new a();

        /* renamed from: a9.n$a$a, reason: collision with other inner class name */
        public static final class C10090a implements InterfaceC0051n {
            @Override // p011a9.InterfaceC0051n
            /* renamed from: a */
            public List mo145a(String hostname) throws UnknownHostException {
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
    List mo145a(String str);
}
