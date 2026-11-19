package coil3.network;

import kotlin.Metadata;
import p249u.C9526l;

@Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m13558d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lu/l;", "response", "<init>", "(Lu/l;)V", "a", "Lu/l;", "getResponse", "()Lu/l;", "coil-network-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: a, reason: from kotlin metadata */
    public final C9526l response;

    public HttpException(C9526l c9526l) {
        super("HTTP " + c9526l.m15892d());
        this.response = c9526l;
    }
}
