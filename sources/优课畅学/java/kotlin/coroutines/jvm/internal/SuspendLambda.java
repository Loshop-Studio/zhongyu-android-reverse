package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.AbstractC9137y;
import kotlin.jvm.internal.InterfaceC9130r;
import p179m7.InterfaceC9324c;

/* loaded from: classes5.dex */
public abstract class SuspendLambda extends ContinuationImpl implements InterfaceC9130r {
    private final int arity;

    public SuspendLambda(int i10, InterfaceC9324c interfaceC9324c) {
        super(interfaceC9324c);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9130r
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM16161i = AbstractC9137y.m16161i(this);
        AbstractC9133u.m16132f(strM16161i, "renderLambdaToString(...)");
        return strM16161i;
    }
}
