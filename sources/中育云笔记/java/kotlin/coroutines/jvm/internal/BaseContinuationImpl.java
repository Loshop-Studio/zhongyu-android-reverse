package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11830e;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11828c;
import vc.InterfaceC11588c;

/* loaded from: classes6.dex */
public abstract class BaseContinuationImpl implements InterfaceC11588c<Object>, InterfaceC11828c, Serializable {
    private final InterfaceC11588c<Object> completion;

    public BaseContinuationImpl(InterfaceC11588c interfaceC11588c) {
        this.completion = interfaceC11588c;
    }

    public InterfaceC11588c<C10786q> create(InterfaceC11588c<?> completion) {
        AbstractC9979u.m20294g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c<Object> interfaceC11588c = this.completion;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    public final InterfaceC11588c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC11830e.m26218d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vc.InterfaceC11588c
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        InterfaceC11588c interfaceC11588c = this;
        while (true) {
            AbstractC11831f.m26220b(interfaceC11588c);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) interfaceC11588c;
            InterfaceC11588c interfaceC11588c2 = baseContinuationImpl.completion;
            AbstractC9979u.m20291d(interfaceC11588c2);
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.C9921a c9921a = Result.f23263d;
                obj = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (objInvokeSuspend == AbstractC11725a.m25952f()) {
                return;
            }
            obj = Result.m20054c(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(interfaceC11588c2 instanceof BaseContinuationImpl)) {
                interfaceC11588c2.resumeWith(obj);
                return;
            }
            interfaceC11588c = interfaceC11588c2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> completion) {
        AbstractC9979u.m20294g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
