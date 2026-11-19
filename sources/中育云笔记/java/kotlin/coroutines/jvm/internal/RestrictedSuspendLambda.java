package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.AbstractC9983y;
import kotlin.jvm.internal.InterfaceC9976r;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements InterfaceC9976r {
    private final int arity;

    public RestrictedSuspendLambda(int i10, InterfaceC11588c interfaceC11588c) {
        super(interfaceC11588c);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC9976r
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM20321h = AbstractC9983y.m20321h(this);
        AbstractC9979u.m20293f(strM20321h, "renderLambdaToString(...)");
        return strM20321h;
    }
}
