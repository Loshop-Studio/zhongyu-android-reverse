package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.C2769l;
import kotlin.jvm.internal.C2782y;
import kotlin.jvm.internal.InterfaceC2765h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.InterfaceC3012d;

/* renamed from: kotlin.coroutines.jvm.internal.k */
/* loaded from: classes.dex */
public abstract class AbstractC2755k extends AbstractC2748d implements InterfaceC2765h<Object> {

    /* renamed from: a */
    private final int f10717a;

    public AbstractC2755k(int i4, @Nullable InterfaceC3012d<Object> interfaceC3012d) {
        super(interfaceC3012d);
        this.f10717a = i4;
    }

    @Override // kotlin.jvm.internal.InterfaceC2765h
    public int getArity() {
        return this.f10717a;
    }

    @Override // kotlin.coroutines.jvm.internal.AbstractC2745a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strM9262f = C2782y.m9262f(this);
        C2769l.m9240d(strM9262f, "renderLambdaToString(this)");
        return strM9262f;
    }
}
