package p205p0;

import androidx.recyclerview.widget.DiffUtil;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;

/* renamed from: p0.b */
/* loaded from: classes3.dex */
public final class C9635b {

    /* renamed from: a */
    public final Executor f19285a;

    /* renamed from: b */
    public final Executor f19286b;

    /* renamed from: c */
    public final DiffUtil.ItemCallback f19287c;

    /* renamed from: p0.b$a */
    public static final class a {

        /* renamed from: d */
        public static final C10811a f19288d = new C10811a(null);

        /* renamed from: e */
        public static final Object f19289e = new Object();

        /* renamed from: f */
        public static Executor f19290f;

        /* renamed from: a */
        public final DiffUtil.ItemCallback f19291a;

        /* renamed from: b */
        public Executor f19292b;

        /* renamed from: c */
        public Executor f19293c;

        /* renamed from: p0.b$a$a, reason: collision with other inner class name */
        public static final class C10811a {
            public /* synthetic */ C10811a(AbstractC9126n abstractC9126n) {
                this();
            }

            public C10811a() {
            }
        }

        public a(DiffUtil.ItemCallback mDiffCallback) {
            AbstractC9133u.m16133g(mDiffCallback, "mDiffCallback");
            this.f19291a = mDiffCallback;
        }

        /* renamed from: a */
        public final C9635b m18200a() {
            if (this.f19293c == null) {
                synchronized (f19289e) {
                    try {
                        if (f19290f == null) {
                            f19290f = Executors.newFixedThreadPool(2);
                        }
                        C8736p c8736p = C8736p.f16368a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f19293c = f19290f;
            }
            Executor executor = this.f19292b;
            Executor executor2 = this.f19293c;
            AbstractC9133u.m16130d(executor2);
            return new C9635b(executor, executor2, this.f19291a);
        }
    }

    public C9635b(Executor executor, Executor backgroundThreadExecutor, DiffUtil.ItemCallback diffCallback) {
        AbstractC9133u.m16133g(backgroundThreadExecutor, "backgroundThreadExecutor");
        AbstractC9133u.m16133g(diffCallback, "diffCallback");
        this.f19285a = executor;
        this.f19286b = backgroundThreadExecutor;
        this.f19287c = diffCallback;
    }

    /* renamed from: a */
    public final DiffUtil.ItemCallback m18198a() {
        return this.f19287c;
    }

    /* renamed from: b */
    public final Executor m18199b() {
        return this.f19285a;
    }
}
