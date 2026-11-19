package kotlinx.coroutines.flow.internal;

import android.view.viewmodel.compose.C2779a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5856q;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p054e7.C5488t;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5636h;
import p083i6.InterfaceC5682b;
import p152r6.InterfaceC6474f;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m5110d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/g;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Li6/b;", "collector", "Lh6/h;", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/g;Lh6/h;)V", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ld6/s;", "releaseIntercepted", "()V", "value", "emit", "(Ljava/lang/Object;Lh6/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/g;", "Lh6/h;", "", "collectContextSize", "I", "lastEmissionContext", "Lh6/c;", "completion_", "Lh6/c;", "getCallerFrame", "()Li6/b;", "callerFrame", "getContext", "()Lh6/h;", "context", "kotlinx-coroutines-core"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: classes4.dex */
public final class SafeCollector<T> extends ContinuationImpl implements InterfaceC5912g {

    @JvmField
    @NotNull
    public final InterfaceC5636h collectContext;

    @JvmField
    public final int collectContextSize;

    @JvmField
    @NotNull
    public final InterfaceC5912g collector;

    @Nullable
    private InterfaceC5631c<? super C5443s> completion_;

    @Nullable
    private InterfaceC5636h lastEmissionContext;

    public SafeCollector(@NotNull InterfaceC5912g interfaceC5912g, @NotNull InterfaceC5636h interfaceC5636h) {
        super(C5930l.f9403a, EmptyCoroutineContext.INSTANCE);
        this.collector = interfaceC5912g;
        this.collectContext = interfaceC5636h;
        this.collectContextSize = ((Number) interfaceC5636h.fold(0, new C5488t(11))).intValue();
    }

    /* renamed from: e */
    public final Object m5559e(InterfaceC5631c interfaceC5631c, Object obj) {
        InterfaceC5636h context = interfaceC5631c.getContext();
        AbstractC6014x.m5639j(context);
        InterfaceC5636h interfaceC5636h = this.lastEmissionContext;
        if (interfaceC5636h != context) {
            if (interfaceC5636h instanceof C5928j) {
                throw new IllegalStateException(AbstractC5856q.m5404p("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C5928j) interfaceC5636h).f9402b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) context.fold(0, new C2779a(this, 4))).intValue() != this.collectContextSize) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.collectContext + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.lastEmissionContext = context;
        }
        this.completion_ = interfaceC5631c;
        InterfaceC6474f interfaceC6474f = AbstractC5932n.f9406a;
        InterfaceC5912g interfaceC5912g = this.collector;
        AbstractC5830k.m5328e(interfaceC5912g, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Object objInvoke = interfaceC6474f.invoke(interfaceC5912g, obj, this);
        if (!AbstractC5830k.m5325b(objInvoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion_ = null;
        }
        return objInvoke;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC5912g
    @Nullable
    public Object emit(T t8, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        try {
            Object objM5559e = m5559e(interfaceC5631c, t8);
            return objM5559e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM5559e : C5443s.f8405a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C5928j(interfaceC5631c.getContext(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p083i6.InterfaceC5682b
    @Nullable
    public InterfaceC5682b getCallerFrame() {
        InterfaceC5631c<? super C5443s> interfaceC5631c = this.completion_;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl, p075h6.InterfaceC5631c
    @NotNull
    public InterfaceC5636h getContext() {
        InterfaceC5636h interfaceC5636h = this.lastEmissionContext;
        return interfaceC5636h == null ? EmptyCoroutineContext.INSTANCE : interfaceC5636h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public Object invokeSuspend(@NotNull Object result) {
        Throwable thM13959exceptionOrNullimpl = Result.m13959exceptionOrNullimpl(result);
        if (thM13959exceptionOrNullimpl != null) {
            this.lastEmissionContext = new C5928j(getContext(), thM13959exceptionOrNullimpl);
        }
        InterfaceC5631c<? super C5443s> interfaceC5631c = this.completion_;
        if (interfaceC5631c != null) {
            interfaceC5631c.resumeWith(result);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
