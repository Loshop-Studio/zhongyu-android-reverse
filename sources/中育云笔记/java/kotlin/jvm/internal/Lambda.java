package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class Lambda<R> implements InterfaceC9976r, Serializable {
    private final int arity;

    public Lambda(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9976r
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String strM20322i = AbstractC9983y.m20322i(this);
        AbstractC9979u.m20293f(strM20322i, "renderLambdaToString(...)");
        return strM20322i;
    }
}
