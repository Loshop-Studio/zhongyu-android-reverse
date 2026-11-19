package kotlin.coroutines.jvm.internal;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.C5632d;
import p075h6.InterfaceC5631c;
import p075h6.InterfaceC5633e;
import p075h6.InterfaceC5634f;
import p075h6.InterfaceC5636h;
import p083i6.C5681a;

@SinceKotlin(version = "1.3")
@Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\tJ\u0015\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR \u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m5110d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lh6/c;", "", "completion", "Lh6/h;", "_context", "<init>", "(Lh6/c;Lh6/h;)V", "(Lh6/c;)V", "intercepted", "()Lh6/c;", "Ld6/s;", "releaseIntercepted", "()V", "Lh6/h;", "Lh6/c;", "getContext", "()Lh6/h;", "context", "kotlin-stdlib"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
/* loaded from: classes2.dex */
public abstract class ContinuationImpl extends BaseContinuationImpl {

    @Nullable
    private final InterfaceC5636h _context;

    @Nullable
    private transient InterfaceC5631c<Object> intercepted;

    public ContinuationImpl(@Nullable InterfaceC5631c<Object> interfaceC5631c, @Nullable InterfaceC5636h interfaceC5636h) {
        super(interfaceC5631c);
        this._context = interfaceC5636h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, p075h6.InterfaceC5631c
    @NotNull
    public InterfaceC5636h getContext() {
        InterfaceC5636h interfaceC5636h = this._context;
        AbstractC5830k.m5327d(interfaceC5636h);
        return interfaceC5636h;
    }

    @NotNull
    public final InterfaceC5631c<Object> intercepted() {
        InterfaceC5631c interfaceC5631cInterceptContinuation = this.intercepted;
        if (interfaceC5631cInterceptContinuation == null) {
            InterfaceC5633e interfaceC5633e = (InterfaceC5633e) getContext().get(C5632d.f8764a);
            if (interfaceC5633e == null || (interfaceC5631cInterceptContinuation = interfaceC5633e.interceptContinuation(this)) == null) {
                interfaceC5631cInterceptContinuation = this;
            }
            this.intercepted = interfaceC5631cInterceptContinuation;
        }
        return interfaceC5631cInterceptContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        InterfaceC5631c<Object> interfaceC5631c = this.intercepted;
        if (interfaceC5631c != null && interfaceC5631c != this) {
            InterfaceC5634f interfaceC5634f = getContext().get(C5632d.f8764a);
            AbstractC5830k.m5327d(interfaceC5634f);
            ((InterfaceC5633e) interfaceC5634f).releaseInterceptedContinuation(interfaceC5631c);
        }
        this.intercepted = C5681a.f8855a;
    }

    public ContinuationImpl(@Nullable InterfaceC5631c<Object> interfaceC5631c) {
        this(interfaceC5631c, interfaceC5631c != null ? interfaceC5631c.getContext() : null);
    }
}
