package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.jvm.internal.m */
/* loaded from: classes.dex */
public abstract class AbstractC2770m<R> implements InterfaceC2765h<R>, Serializable {
    private final int arity;

    public AbstractC2770m(int i4) {
        this.arity = i4;
    }

    @Override // kotlin.jvm.internal.InterfaceC2765h
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strM9263g = C2782y.m9263g(this);
        C2769l.m9240d(strM9263g, "renderLambdaToString(this)");
        return strM9263g;
    }
}
