package vc;

import androidx.concurrent.futures.AbstractC3223a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11828c;

/* renamed from: vc.f */
/* loaded from: classes6.dex */
public final class C11591f implements InterfaceC11588c, InterfaceC11828c {

    /* renamed from: d */
    public static final a f27491d = new a(null);

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f27492e = AtomicReferenceFieldUpdater.newUpdater(C11591f.class, Object.class, "result");

    /* renamed from: c */
    public final InterfaceC11588c f27493c;
    private volatile Object result;

    /* renamed from: vc.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9972n abstractC9972n) {
            this();
        }

        public a() {
        }
    }

    public C11591f(InterfaceC11588c delegate, Object obj) {
        AbstractC9979u.m20294g(delegate, "delegate");
        this.f27493c = delegate;
        this.result = obj;
    }

    /* renamed from: a */
    public final Object m25526a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23357d;
        if (obj == coroutineSingletons) {
            if (AbstractC3223a.m1395a(f27492e, this, coroutineSingletons, AbstractC11725a.m25952f())) {
                return AbstractC11725a.m25952f();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.f23358e) {
            return AbstractC11725a.m25952f();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f23265c;
        }
        return obj;
    }

    @Override // p409xc.InterfaceC11828c
    public InterfaceC11828c getCallerFrame() {
        InterfaceC11588c interfaceC11588c = this.f27493c;
        if (interfaceC11588c instanceof InterfaceC11828c) {
            return (InterfaceC11828c) interfaceC11588c;
        }
        return null;
    }

    @Override // vc.InterfaceC11588c
    public InterfaceC9945d getContext() {
        return this.f27493c.getContext();
    }

    @Override // vc.InterfaceC11588c
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f23357d;
            if (obj2 == coroutineSingletons) {
                if (AbstractC3223a.m1395a(f27492e, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC11725a.m25952f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (AbstractC3223a.m1395a(f27492e, this, AbstractC11725a.m25952f(), CoroutineSingletons.f23358e)) {
                    this.f27493c.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f27493c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C11591f(InterfaceC11588c delegate) {
        this(delegate, CoroutineSingletons.f23357d);
        AbstractC9979u.m20294g(delegate, "delegate");
    }
}
