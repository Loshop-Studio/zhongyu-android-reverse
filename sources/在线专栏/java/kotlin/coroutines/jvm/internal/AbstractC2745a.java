package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p128o2.C2919l;
import p128o2.C2920m;
import p128o2.C2925r;
import p142q2.InterfaceC3012d;
import p146r2.C3033d;

/* renamed from: kotlin.coroutines.jvm.internal.a */
/* loaded from: classes.dex */
public abstract class AbstractC2745a implements InterfaceC3012d<Object>, InterfaceC2749e, Serializable {

    @Nullable
    private final InterfaceC3012d<Object> completion;

    public AbstractC2745a(@Nullable InterfaceC3012d<Object> interfaceC3012d) {
        this.completion = interfaceC3012d;
    }

    @NotNull
    public InterfaceC3012d<C2925r> create(@NotNull InterfaceC3012d<?> completion) {
        C2769l.m9241e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Nullable
    public InterfaceC2749e getCallerFrame() {
        InterfaceC3012d<Object> interfaceC3012d = this.completion;
        if (interfaceC3012d instanceof InterfaceC2749e) {
            return (InterfaceC2749e) interfaceC3012d;
        }
        return null;
    }

    @Nullable
    public final InterfaceC3012d<Object> getCompletion() {
        return this.completion;
    }

    @Nullable
    public StackTraceElement getStackTraceElement() {
        return C2751g.m9214d(this);
    }

    @Nullable
    protected abstract Object invokeSuspend(@NotNull Object obj);

    protected void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p142q2.InterfaceC3012d
    public final void resumeWith(@NotNull Object obj) {
        Object objInvokeSuspend;
        InterfaceC3012d interfaceC3012d = this;
        while (true) {
            C2752h.m9216b(interfaceC3012d);
            AbstractC2745a abstractC2745a = (AbstractC2745a) interfaceC3012d;
            InterfaceC3012d completion = abstractC2745a.getCompletion();
            C2769l.m9239c(completion);
            try {
                objInvokeSuspend = abstractC2745a.invokeSuspend(obj);
            } catch (Throwable th) {
                C2919l.a aVar = C2919l.f11409a;
                obj = C2919l.m9989a(C2920m.m9993a(th));
            }
            if (objInvokeSuspend == C3033d.m10175c()) {
                return;
            }
            C2919l.a aVar2 = C2919l.f11409a;
            obj = C2919l.m9989a(objInvokeSuspend);
            abstractC2745a.releaseIntercepted();
            if (!(completion instanceof AbstractC2745a)) {
                completion.resumeWith(obj);
                return;
            }
            interfaceC3012d = completion;
        }
    }

    @NotNull
    public String toString() {
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        return C2769l.m9248l("Continuation at ", stackTraceElement);
    }

    @NotNull
    public InterfaceC3012d<C2925r> create(@Nullable Object obj, @NotNull InterfaceC3012d<?> completion) {
        C2769l.m9241e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
