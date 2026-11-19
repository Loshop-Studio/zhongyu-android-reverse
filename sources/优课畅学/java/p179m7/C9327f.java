package p179m7;

import androidx.concurrent.futures.AbstractC3193a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9538c;

/* renamed from: m7.f */
/* loaded from: classes5.dex */
public final class C9327f implements InterfaceC9324c, InterfaceC9538c {

    /* renamed from: b */
    public static final a f18382b = new a(null);

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f18383c = AtomicReferenceFieldUpdater.newUpdater(C9327f.class, Object.class, "result");

    /* renamed from: a */
    public final InterfaceC9324c f18384a;
    private volatile Object result;

    /* renamed from: m7.f$a */
    public static final class a {
        public /* synthetic */ a(AbstractC9126n abstractC9126n) {
            this();
        }

        public a() {
        }
    }

    public C9327f(InterfaceC9324c delegate, Object obj) {
        AbstractC9133u.m16133g(delegate, "delegate");
        this.f18384a = delegate;
        this.result = obj;
    }

    /* renamed from: a */
    public final Object m17155a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f17444b;
        if (obj == coroutineSingletons) {
            if (AbstractC3193a.m1318a(f18383c, this, coroutineSingletons, AbstractC9434a.m17291f())) {
                return AbstractC9434a.m17291f();
            }
            obj = this.result;
        }
        if (obj == CoroutineSingletons.f17445c) {
            return AbstractC9434a.m17291f();
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f17352a;
        }
        return obj;
    }

    @Override // p201o7.InterfaceC9538c
    public InterfaceC9538c getCallerFrame() {
        InterfaceC9324c interfaceC9324c = this.f18384a;
        if (interfaceC9324c instanceof InterfaceC9538c) {
            return (InterfaceC9538c) interfaceC9324c;
        }
        return null;
    }

    @Override // p179m7.InterfaceC9324c
    public InterfaceC9100d getContext() {
        return this.f18384a.getContext();
    }

    @Override // p179m7.InterfaceC9324c
    public void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f17444b;
            if (obj2 == coroutineSingletons) {
                if (AbstractC3193a.m1318a(f18383c, this, coroutineSingletons, obj)) {
                    return;
                }
            } else {
                if (obj2 != AbstractC9434a.m17291f()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (AbstractC3193a.m1318a(f18383c, this, AbstractC9434a.m17291f(), CoroutineSingletons.f17445c)) {
                    this.f18384a.resumeWith(obj);
                    return;
                }
            }
        }
    }

    public String toString() {
        return "SafeContinuation for " + this.f18384a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9327f(InterfaceC9324c delegate) {
        this(delegate, CoroutineSingletons.f17444b);
        AbstractC9133u.m16133g(delegate, "delegate");
    }
}
