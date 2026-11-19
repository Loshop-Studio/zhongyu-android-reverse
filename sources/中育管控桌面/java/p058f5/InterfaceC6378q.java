package p058f5;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f5.q */
/* loaded from: classes4.dex */
public interface InterfaceC6378q {

    /* renamed from: a */
    public static final a f7947a = a.f7949a;

    /* renamed from: b */
    public static final InterfaceC6378q f7948b = new a.C8029a();

    /* renamed from: f5.q$a */
    public static final class a {

        /* renamed from: a */
        public static final /* synthetic */ a f7949a = new a();

        /* renamed from: f5.q$a$a, reason: collision with other inner class name */
        public static final class C8029a implements InterfaceC6378q {
            @Override // p058f5.InterfaceC6378q
            /* renamed from: a */
            public List mo6762a(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
                    return ArraysKt.toList(allByName);
                } catch (NullPointerException e6) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e6);
                    throw unknownHostException;
                }
            }
        }
    }

    /* renamed from: a */
    List mo6762a(String str);
}
