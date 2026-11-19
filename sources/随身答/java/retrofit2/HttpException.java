package retrofit2;

import java.util.Objects;
import p038c9.C5298x;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final int f16480a;

    /* renamed from: b */
    public final String f16481b;

    /* renamed from: c */
    public final transient C5298x f16482c;

    public HttpException(C5298x c5298x) {
        super(m15619c(c5298x));
        this.f16480a = c5298x.m2521b();
        this.f16481b = c5298x.m2525g();
        this.f16482c = c5298x;
    }

    /* renamed from: c */
    public static String m15619c(C5298x c5298x) {
        Objects.requireNonNull(c5298x, "response == null");
        return "HTTP " + c5298x.m2521b() + " " + c5298x.m2525g();
    }

    /* renamed from: a */
    public int m15620a() {
        return this.f16480a;
    }
}
