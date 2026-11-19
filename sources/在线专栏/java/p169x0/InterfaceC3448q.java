package p169x0;

import android.annotation.SuppressLint;
import anet.channel.util.HttpConstant;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: x0.q */
/* loaded from: classes.dex */
public interface InterfaceC3448q {

    /* renamed from: a */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c f12081a;

    /* renamed from: b */
    @SuppressLint({"SyntheticAccessor"})
    public static final b.C3551b f12082b;

    /* renamed from: x0.q$b */
    public static abstract class b {

        /* renamed from: x0.q$b$a */
        public static final class a extends b {

            /* renamed from: a */
            private final Throwable f12083a;

            public a(Throwable th) {
                this.f12083a = th;
            }

            /* renamed from: a */
            public Throwable m10515a() {
                return this.f12083a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f12083a.getMessage());
            }
        }

        /* renamed from: x0.q$b$b, reason: collision with other inner class name */
        public static final class C3551b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C3551b() {
            }
        }

        /* renamed from: x0.q$b$c */
        public static final class c extends b {
            public String toString() {
                return HttpConstant.SUCCESS;
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f12081a = new b.c();
        f12082b = new b.C3551b();
    }

    /* renamed from: a */
    ListenableFuture<b.c> mo10514a();
}
