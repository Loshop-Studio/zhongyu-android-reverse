package p230l1;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* renamed from: l1.c */
/* loaded from: classes3.dex */
public final class C10106c {

    /* renamed from: a */
    public final Executor f24159a;

    /* renamed from: b */
    public final Executor f24160b;

    /* renamed from: c */
    public final DiffUtil.ItemCallback f24161c;

    /* renamed from: l1.c$a */
    public static final class a {

        /* renamed from: d */
        public static final C12144a f24162d = new C12144a(null);

        /* renamed from: e */
        public static final Object f24163e = new Object();

        /* renamed from: f */
        public static Executor f24164f;

        /* renamed from: a */
        public final DiffUtil.ItemCallback f24165a;

        /* renamed from: b */
        public Executor f24166b;

        /* renamed from: c */
        public Executor f24167c;

        /* renamed from: l1.c$a$a, reason: collision with other inner class name */
        public static final class C12144a {
            public /* synthetic */ C12144a(AbstractC9972n abstractC9972n) {
                this();
            }

            public C12144a() {
            }
        }

        public a(DiffUtil.ItemCallback mDiffCallback) {
            AbstractC9979u.m20294g(mDiffCallback, "mDiffCallback");
            this.f24165a = mDiffCallback;
        }

        /* renamed from: a */
        public final C10106c m21137a() {
            if (this.f24167c == null) {
                synchronized (f24163e) {
                    try {
                        if (f24164f == null) {
                            f24164f = Executors.newFixedThreadPool(2);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f24167c = f24164f;
            }
            Executor executor = this.f24166b;
            Executor executor2 = this.f24167c;
            AbstractC9979u.m20291d(executor2);
            return new C10106c(executor, executor2, this.f24165a);
        }
    }

    public C10106c(Executor executor, Executor backgroundThreadExecutor, DiffUtil.ItemCallback diffCallback) {
        AbstractC9979u.m20294g(backgroundThreadExecutor, "backgroundThreadExecutor");
        AbstractC9979u.m20294g(diffCallback, "diffCallback");
        this.f24159a = executor;
        this.f24160b = backgroundThreadExecutor;
        this.f24161c = diffCallback;
    }

    /* renamed from: a */
    public final Executor m21134a() {
        return this.f24160b;
    }

    /* renamed from: b */
    public final DiffUtil.ItemCallback m21135b() {
        return this.f24161c;
    }

    /* renamed from: c */
    public final Executor m21136c() {
        return this.f24159a;
    }
}
