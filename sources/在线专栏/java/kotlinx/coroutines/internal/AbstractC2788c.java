package kotlinx.coroutines.internal;

import androidx.work.impl.utils.futures.C0827b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: kotlinx.coroutines.internal.c */
/* loaded from: classes.dex */
public abstract class AbstractC2788c<T> extends AbstractC2802q {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f10751a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2788c.class, Object.class, "_consensus");

    @NotNull
    private volatile /* synthetic */ Object _consensus = C2787b.f10749a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC2802q
    @NotNull
    /* renamed from: a */
    public AbstractC2788c<?> mo9277a() {
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.internal.AbstractC2802q
    @Nullable
    /* renamed from: c */
    public final Object mo9278c(@Nullable Object obj) {
        Object objM9280e = this._consensus;
        if (objM9280e == C2787b.f10749a) {
            objM9280e = m9280e(mo8726g(obj));
        }
        mo9279d(obj, objM9280e);
        return objM9280e;
    }

    /* renamed from: d */
    public abstract void mo9279d(T t3, @Nullable Object obj);

    @Nullable
    /* renamed from: e */
    public final Object m9280e(@Nullable Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = C2787b.f10749a;
        return obj2 != obj3 ? obj2 : C0827b.m4278a(f10751a, this, obj3, obj) ? obj : this._consensus;
    }

    /* renamed from: f */
    public long m9281f() {
        return 0L;
    }

    @Nullable
    /* renamed from: g */
    public abstract Object mo8726g(T t3);
}
