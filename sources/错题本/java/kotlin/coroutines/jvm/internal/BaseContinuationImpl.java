package kotlin.coroutines.jvm.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.AbstractC5684d;
import p083i6.C5683c;
import p083i6.InterfaceC5682b;

@SinceKotlin(version = "1.3")
@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bH$¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR!\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m5110d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lh6/c;", "", "Li6/b;", "Ljava/io/Serializable;", "completion", "<init>", "(Lh6/c;)V", "Lkotlin/Result;", "result", "Ld6/s;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "()V", "create", "(Lh6/c;)Lh6/c;", "value", "(Ljava/lang/Object;Lh6/c;)Lh6/c;", "", "toString", "()Ljava/lang/String;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lh6/c;", "getCompletion", "()Lh6/c;", "getCallerFrame", "()Li6/b;", "callerFrame", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public abstract class BaseContinuationImpl implements InterfaceC5631c<Object>, InterfaceC5682b, Serializable {

    @Nullable
    private final InterfaceC5631c<Object> completion;

    public BaseContinuationImpl(@Nullable InterfaceC5631c<Object> interfaceC5631c) {
        this.completion = interfaceC5631c;
    }

    @NotNull
    public InterfaceC5631c<C5443s> create(@NotNull InterfaceC5631c<?> completion) {
        AbstractC5830k.m5330g(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // p083i6.InterfaceC5682b
    @Nullable
    public InterfaceC5682b getCallerFrame() {
        InterfaceC5631c<Object> interfaceC5631c = this.completion;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Nullable
    public final InterfaceC5631c<Object> getCompletion() {
        return this.completion;
    }

    @Override // p075h6.InterfaceC5631c
    @NotNull
    public abstract /* synthetic */ InterfaceC5636h getContext();

    @Nullable
    public StackTraceElement getStackTraceElement() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strM5302c;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        DebugMetadata debugMetadata = (DebugMetadata) getClass().getAnnotation(DebugMetadata.class);
        String str = null;
        if (debugMetadata == null) {
            return null;
        }
        int iM5309v = debugMetadata.m5309v();
        if (iM5309v > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iM5309v + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? debugMetadata.m5305l()[iIntValue] : -1;
        C5683c c5683c = AbstractC5684d.f8860b;
        C5683c c5683c2 = AbstractC5684d.f8859a;
        if (c5683c == null) {
            try {
                C5683c c5683c3 = new C5683c(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(HintConstants.AUTOFILL_HINT_NAME, null));
                AbstractC5684d.f8860b = c5683c3;
                c5683c = c5683c3;
            } catch (Exception unused2) {
                AbstractC5684d.f8860b = c5683c2;
                c5683c = c5683c2;
            }
        }
        if (c5683c != c5683c2 && (method = c5683c.f8856a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = c5683c.f8857b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = c5683c.f8858c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strM5302c = debugMetadata.m5302c();
        } else {
            strM5302c = str + '/' + debugMetadata.m5302c();
        }
        return new StackTraceElement(strM5302c, debugMetadata.m5306m(), debugMetadata.m5303f(), i);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object result);

    public void releaseIntercepted() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(@NotNull Object result) {
        Object objInvokeSuspend;
        InterfaceC5631c interfaceC5631c = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) interfaceC5631c;
            InterfaceC5631c interfaceC5631c2 = baseContinuationImpl.completion;
            AbstractC5830k.m5327d(interfaceC5631c2);
            try {
                objInvokeSuspend = baseContinuationImpl.invokeSuspend(result);
            } catch (Throwable th) {
                result = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (objInvokeSuspend == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return;
            }
            result = Result.m13956constructorimpl(objInvokeSuspend);
            baseContinuationImpl.releaseIntercepted();
            if (!(interfaceC5631c2 instanceof BaseContinuationImpl)) {
                interfaceC5631c2.resumeWith(result);
                return;
            }
            interfaceC5631c = interfaceC5631c2;
        }
    }

    @NotNull
    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public InterfaceC5631c<C5443s> create(@Nullable Object value, @NotNull InterfaceC5631c<?> completion) {
        AbstractC5830k.m5330g(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
