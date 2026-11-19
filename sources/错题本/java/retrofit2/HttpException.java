package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.C6301i0;

/* loaded from: classes4.dex */
public class HttpException extends RuntimeException {

    /* renamed from: a */
    public final transient C6509n0 f10665a;
    private final int code;
    private final String message;

    public HttpException(C6509n0<?> c6509n0) {
        Objects.requireNonNull(c6509n0, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C6301i0 c6301i0 = c6509n0.f10762a;
        sb.append(c6301i0.f10107d);
        sb.append(" ");
        sb.append(c6301i0.f10106c);
        super(sb.toString());
        this.code = c6301i0.f10107d;
        this.message = c6301i0.f10106c;
        this.f10665a = c6509n0;
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    @Nullable
    public C6509n0<?> response() {
        return this.f10665a;
    }
}
