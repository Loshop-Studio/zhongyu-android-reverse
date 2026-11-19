package p117r2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r2.p */
/* loaded from: classes2.dex */
public interface InterfaceC4513p {

    /* renamed from: b */
    public static final a f5522b = new a(null);

    /* renamed from: a */
    public static final InterfaceC4513p f5521a = new a.C4768a();

    /* renamed from: r2.p$a */
    public static final class a {

        /* renamed from: r2.p$a$a, reason: collision with other inner class name */
        public static final class C4768a implements InterfaceC4513p {
            @Override // p117r2.InterfaceC4513p
            /* renamed from: a */
            public List mo5924a(String hostname) throws UnknownHostException {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "InetAddress.getAllByName(hostname)");
                    return ArraysKt___ArraysKt.toList(allByName);
                } catch (NullPointerException e4) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e4);
                    throw unknownHostException;
                }
            }
        }

        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: a */
    List mo5924a(String str);
}
