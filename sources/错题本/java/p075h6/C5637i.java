package p075h6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.jetbrains.annotations.Nullable;
import p083i6.InterfaceC5682b;

/* renamed from: h6.i */
/* loaded from: classes2.dex */
public final class C5637i implements InterfaceC5631c, InterfaceC5682b {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f8765b = AtomicReferenceFieldUpdater.newUpdater(C5637i.class, Object.class, "result");

    /* renamed from: a */
    public final InterfaceC5631c f8766a;

    @Nullable
    private volatile Object result;

    public C5637i(InterfaceC5631c interfaceC5631c, CoroutineSingletons coroutineSingletons) {
        this.f8766a = interfaceC5631c;
        this.result = coroutineSingletons;
    }

    /* renamed from: a */
    public final Object m4961a() throws Throwable {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8765b;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // p083i6.InterfaceC5682b
    public final InterfaceC5682b getCallerFrame() {
        InterfaceC5631c interfaceC5631c = this.f8766a;
        if (interfaceC5631c instanceof InterfaceC5682b) {
            return (InterfaceC5682b) interfaceC5631c;
        }
        return null;
    }

    @Override // p075h6.InterfaceC5631c
    public final InterfaceC5636h getContext() {
        return this.f8766a.getContext();
    }

    @Override // p075h6.InterfaceC5631c
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8765b;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8765b;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.f8766a.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.f8766a;
    }
}
