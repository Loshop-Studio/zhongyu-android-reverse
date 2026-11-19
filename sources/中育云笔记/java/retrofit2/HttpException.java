package retrofit2;

import java.util.Objects;
import p122df.C9031c0;

/* loaded from: classes6.dex */
public class HttpException extends RuntimeException {

    /* renamed from: c */
    public final int f26566c;

    /* renamed from: d */
    public final String f26567d;

    /* renamed from: e */
    public final transient C9031c0 f26568e;

    public HttpException(C9031c0 c9031c0) {
        super(m24315a(c9031c0));
        this.f26566c = c9031c0.m17705b();
        this.f26567d = c9031c0.m17708f();
        this.f26568e = c9031c0;
    }

    /* renamed from: a */
    public static String m24315a(C9031c0 c9031c0) {
        Objects.requireNonNull(c9031c0, "response == null");
        return "HTTP " + c9031c0.m17705b() + " " + c9031c0.m17708f();
    }

    /* renamed from: c */
    public C9031c0 m24316c() {
        return this.f26568e;
    }
}
