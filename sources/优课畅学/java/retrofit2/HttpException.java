package retrofit2;

import ca.C5281c0;
import java.util.Objects;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final int f19926a;

    /* renamed from: b */
    public final String f19927b;

    /* renamed from: c */
    public final transient C5281c0 f19928c;

    public HttpException(C5281c0 c5281c0) {
        super(m18588b(c5281c0));
        this.f19926a = c5281c0.m2244b();
        this.f19927b = c5281c0.m2247f();
        this.f19928c = c5281c0;
    }

    /* renamed from: b */
    public static String m18588b(C5281c0 c5281c0) {
        Objects.requireNonNull(c5281c0, "response == null");
        return "HTTP " + c5281c0.m2244b() + " " + c5281c0.m2247f();
    }

    /* renamed from: a */
    public int m18589a() {
        return this.f19926a;
    }
}
