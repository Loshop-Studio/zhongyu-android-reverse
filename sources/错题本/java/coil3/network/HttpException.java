package coil3.network;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lcoil3/network/m;", "response", "<init>", "(Lcoil3/network/m;)V", "Lcoil3/network/m;", "getResponse", "()Lcoil3/network/m;", "coil-network-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class HttpException extends RuntimeException {

    @NotNull
    private final C3324m response;

    public HttpException(@NotNull C3324m c3324m) {
        super("HTTP " + c3324m.f2024a);
        this.response = c3324m;
    }

    @NotNull
    public final C3324m getResponse() {
        return this.response;
    }
}
