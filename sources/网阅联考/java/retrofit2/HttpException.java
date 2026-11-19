package retrofit2;

import java.util.Objects;
import p080j3.C3812d0;

/* loaded from: classes2.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final int f5663a;

    /* renamed from: b */
    public final String f5664b;

    /* renamed from: c */
    public final transient C3812d0 f5665c;

    public HttpException(C3812d0 c3812d0) {
        super(m6161b(c3812d0));
        this.f5663a = c3812d0.m5021b();
        this.f5664b = c3812d0.m5024f();
        this.f5665c = c3812d0;
    }

    /* renamed from: b */
    public static String m6161b(C3812d0 c3812d0) {
        Objects.requireNonNull(c3812d0, "response == null");
        return "HTTP " + c3812d0.m5021b() + " " + c3812d0.m5024f();
    }

    /* renamed from: a */
    public int m6162a() {
        return this.f5663a;
    }
}
