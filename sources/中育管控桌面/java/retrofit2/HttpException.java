package retrofit2;

import java.util.Objects;
import p200z5.C7957c0;

/* loaded from: classes4.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final int f10119a;

    /* renamed from: b */
    public final String f10120b;

    /* renamed from: c */
    public final transient C7957c0 f10121c;

    public HttpException(C7957c0 c7957c0) {
        super(m9113b(c7957c0));
        this.f10119a = c7957c0.m9786b();
        this.f10120b = c7957c0.m9789f();
        this.f10121c = c7957c0;
    }

    /* renamed from: b */
    public static String m9113b(C7957c0 c7957c0) {
        Objects.requireNonNull(c7957c0, "response == null");
        return "HTTP " + c7957c0.m9786b() + " " + c7957c0.m9789f();
    }

    /* renamed from: a */
    public int m9114a() {
        return this.f10119a;
    }
}
