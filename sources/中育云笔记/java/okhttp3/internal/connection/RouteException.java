package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.AbstractC10771b;

/* loaded from: classes6.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: c */
    public final IOException f25135c;

    /* renamed from: d */
    public IOException f25136d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException firstConnectException) {
        super(firstConnectException);
        AbstractC9979u.m20294g(firstConnectException, "firstConnectException");
        this.f25135c = firstConnectException;
        this.f25136d = firstConnectException;
    }

    /* renamed from: a */
    public final void m22016a(IOException e10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC9979u.m20294g(e10, "e");
        AbstractC10771b.m22973a(this.f25135c, e10);
        this.f25136d = e10;
    }

    /* renamed from: c */
    public final IOException m22017c() {
        return this.f25135c;
    }

    /* renamed from: d */
    public final IOException m22018d() {
        return this.f25136d;
    }
}
