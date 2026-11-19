package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes5.dex */
public abstract class Lambda<R> implements InterfaceC9130r, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9130r
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strM16162j = AbstractC9137y.m16162j(this);
        AbstractC9133u.m16132f(strM16162j, "renderLambdaToString(...)");
        return strM16162j;
    }
}
