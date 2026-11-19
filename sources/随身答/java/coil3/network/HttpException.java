package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import p257u.C9654l;

@Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m13413d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lu/l;", "response", "<init>", "(Lu/l;)V", "a", "Lu/l;", "getResponse", "()Lu/l;", "coil-network-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class HttpException extends RuntimeException {

    /* renamed from: a, reason: from kotlin metadata */
    public final C9654l response;

    public HttpException(C9654l c9654l) {
        super("HTTP " + c9654l.m15995d());
        this.response = c9654l;
    }
}
