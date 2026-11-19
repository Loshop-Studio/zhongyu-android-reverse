package retrofit2;

import java.util.Objects;
import p226r9.C9057c0;

/* loaded from: classes5.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final int f15710a;

    /* renamed from: b */
    public final String f15711b;

    /* renamed from: c */
    public final transient C9057c0 f15712c;

    public HttpException(C9057c0 c9057c0) {
        super(m15337f(c9057c0));
        this.f15710a = c9057c0.m15243b();
        this.f15711b = c9057c0.m15245e();
        this.f15712c = c9057c0;
    }

    /* renamed from: f */
    public static String m15337f(C9057c0 c9057c0) {
        Objects.requireNonNull(c9057c0, "response == null");
        return "HTTP " + c9057c0.m15243b() + " " + c9057c0.m15245e();
    }

    /* renamed from: a */
    public int m15338a() {
        return this.f15710a;
    }
}
