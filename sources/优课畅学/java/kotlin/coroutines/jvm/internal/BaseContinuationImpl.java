package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9540e;
import p201o7.AbstractC9541f;
import p201o7.InterfaceC9538c;

/* loaded from: classes5.dex */
public abstract class BaseContinuationImpl implements InterfaceC9324c<Object>, InterfaceC9538c, Serializable {
    private final InterfaceC9324c<Object> completion;

    public BaseContinuationImpl(InterfaceC9324c interfaceC9324c) {
        this.completion = interfaceC9324c;
    }

    public InterfaceC9324c<C8736p> create(InterfaceC9324c<?> completion) {
        AbstractC9133u.m16133g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c<Object> interfaceC9324c = this.completion;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    public final InterfaceC9324c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC9540e.m17808d(this);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p179m7.InterfaceC9324c
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        InterfaceC9324c interfaceC9324c = this;
        while (true) {
            AbstractC9541f.m17810b(interfaceC9324c);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) interfaceC9324c;
            InterfaceC9324c interfaceC9324c2 = baseContinuationImpl.completion;
            AbstractC9133u.m16130d(interfaceC9324c2);
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(obj);
            } catch (Throwable th) {
                Result.C9076a c9076a = Result.f17350b;
                obj = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (objInvokeSuspend == AbstractC9434a.m17291f()) {
                return;
            }
            obj = Result.m15909b(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(interfaceC9324c2 instanceof BaseContinuationImpl)) {
                interfaceC9324c2.resumeWith(obj);
                return;
            }
            interfaceC9324c = interfaceC9324c2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> completion) {
        AbstractC9133u.m16133g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
