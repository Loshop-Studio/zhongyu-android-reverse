package p124t1;

import android.app.Activity;
import androidx.lifecycle.SavedStateHandle;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.insight.App;
import com.zykj.insight.network.RefreshRepositoryImpl;
import com.zykj.insight.p044ui.MainActivity;
import com.zykj.insight.p044ui.MainViewModel;
import dagger.hilt.android.internal.managers.AbstractC3717c;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p049d2.InterfaceC3704a;
import p049d2.InterfaceC3706c;
import p064g2.InterfaceC3754a;
import p064g2.InterfaceC3755b;
import p064g2.InterfaceC3756c;
import p069h2.AbstractC3766a;
import p069h2.AbstractC3767b;
import p074i2.AbstractC3782b;
import p074i2.C3781a;
import p080j3.C3814e0;
import p084k2.AbstractC3860b;
import p084k2.C3859a;
import p096m2.InterfaceC4366a;
import p112q1.AbstractC4478a;
import p112q1.AbstractC4479b;
import p112q1.AbstractC4480c;
import p112q1.AbstractC4481d;
import p112q1.AbstractC4482e;
import p112q1.AbstractC4483f;
import p116r1.AbstractC4494a;
import p117r2.C4521x;
import p128u1.AbstractC4604b;
import p128u1.AbstractC4605c;
import p128u1.AbstractC4606d;
import p128u1.AbstractC4607e;
import p128u1.InterfaceC4609g;
import p132v1.AbstractC4630d;

/* renamed from: t1.g */
/* loaded from: classes2.dex */
public abstract class AbstractC4589g {

    /* renamed from: t1.g$a */
    public static final class a implements InterfaceC3754a {

        /* renamed from: a */
        public final f f5763a;

        /* renamed from: b */
        public final d f5764b;

        /* renamed from: c */
        public Activity f5765c;

        @Override // p064g2.InterfaceC3754a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo4789a(Activity activity) {
            this.f5765c = (Activity) AbstractC3860b.m5168b(activity);
            return this;
        }

        @Override // p064g2.InterfaceC3754a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC4584b build() {
            AbstractC3860b.m5167a(this.f5765c, Activity.class);
            return new b(this.f5763a, this.f5764b, this.f5765c);
        }

        public a(f fVar, d dVar) {
            this.f5763a = fVar;
            this.f5764b = dVar;
        }
    }

    /* renamed from: t1.g$b */
    public static final class b extends AbstractC4584b {

        /* renamed from: a */
        public final f f5766a;

        /* renamed from: b */
        public final d f5767b;

        /* renamed from: c */
        public final b f5768c;

        @Override // p069h2.AbstractC3766a.a
        /* renamed from: a */
        public AbstractC3766a.b mo4867a() {
            return AbstractC3767b.m4870a(m6315c(), new g(this.f5766a, this.f5767b));
        }

        @Override // p132v1.InterfaceC4627a
        /* renamed from: b */
        public void mo6314b(MainActivity mainActivity) {
        }

        /* renamed from: c */
        public Set m6315c() {
            return Collections.singleton(AbstractC4630d.m6418a());
        }

        public b(f fVar, d dVar, Activity activity) {
            this.f5768c = this;
            this.f5766a = fVar;
            this.f5767b = dVar;
        }
    }

    /* renamed from: t1.g$c */
    public static final class c implements InterfaceC3755b {

        /* renamed from: a */
        public final f f5769a;

        @Override // p064g2.InterfaceC3755b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC4585c build() {
            return new d(this.f5769a);
        }

        public c(f fVar) {
            this.f5769a = fVar;
        }
    }

    /* renamed from: t1.g$d */
    public static final class d extends AbstractC4585c {

        /* renamed from: a */
        public final f f5770a;

        /* renamed from: b */
        public final d f5771b;

        /* renamed from: c */
        public InterfaceC4366a f5772c;

        /* renamed from: t1.g$d$a */
        public static final class a implements InterfaceC4366a {

            /* renamed from: a */
            public final f f5773a;

            /* renamed from: b */
            public final d f5774b;

            /* renamed from: c */
            public final int f5775c;

            public a(f fVar, d dVar, int i4) {
                this.f5773a = fVar;
                this.f5774b = dVar;
                this.f5775c = i4;
            }

            @Override // p096m2.InterfaceC4366a
            public Object get() {
                if (this.f5775c == 0) {
                    return AbstractC3717c.m4718a();
                }
                throw new AssertionError(this.f5775c);
            }
        }

        @Override // dagger.hilt.android.internal.managers.C3716b.d
        /* renamed from: a */
        public InterfaceC3704a mo4716a() {
            return (InterfaceC3704a) this.f5772c.get();
        }

        @Override // dagger.hilt.android.internal.managers.C3715a.a
        /* renamed from: b */
        public InterfaceC3754a mo4710b() {
            return new a(this.f5770a, this.f5771b);
        }

        /* renamed from: c */
        public final void m6317c() {
            this.f5772c = C3859a.m5165a(new a(this.f5770a, this.f5771b, 0));
        }

        public d(f fVar) {
            this.f5771b = this;
            this.f5770a = fVar;
            m6317c();
        }
    }

    /* renamed from: t1.g$e */
    public static final class e {

        /* renamed from: a */
        public C3781a f5776a;

        /* renamed from: a */
        public e m6318a(C3781a c3781a) {
            this.f5776a = (C3781a) AbstractC3860b.m5168b(c3781a);
            return this;
        }

        /* renamed from: b */
        public AbstractC4586d m6319b() {
            AbstractC3860b.m5167a(this.f5776a, C3781a.class);
            return new f(this.f5776a);
        }

        public e() {
        }
    }

    /* renamed from: t1.g$f */
    public static final class f extends AbstractC4586d {

        /* renamed from: a */
        public final C3781a f5777a;

        /* renamed from: b */
        public final f f5778b;

        /* renamed from: c */
        public InterfaceC4366a f5779c;

        /* renamed from: d */
        public InterfaceC4366a f5780d;

        /* renamed from: e */
        public InterfaceC4366a f5781e;

        /* renamed from: f */
        public InterfaceC4366a f5782f;

        /* renamed from: g */
        public InterfaceC4366a f5783g;

        /* renamed from: t1.g$f$a */
        public static final class a implements InterfaceC4366a {

            /* renamed from: a */
            public final f f5784a;

            /* renamed from: b */
            public final int f5785b;

            public a(f fVar, int i4) {
                this.f5784a = fVar;
                this.f5785b = i4;
            }

            @Override // p096m2.InterfaceC4366a
            public Object get() {
                int i4 = this.f5785b;
                if (i4 == 0) {
                    return AbstractC4604b.m6349a();
                }
                if (i4 == 1) {
                    return AbstractC4607e.m6352a((C3814e0) this.f5784a.f5782f.get());
                }
                if (i4 == 2) {
                    return AbstractC4606d.m6351a((C4521x) this.f5784a.f5781e.get());
                }
                if (i4 == 3) {
                    return AbstractC4605c.m6350a(this.f5784a.m6333p(), this.f5784a.m6327j(), this.f5784a.m6332o());
                }
                if (i4 == 4) {
                    return new RefreshRepositoryImpl((HeaderLiveData) this.f5784a.f5779c.get());
                }
                throw new AssertionError(this.f5785b);
            }
        }

        @Override // dagger.hilt.android.internal.managers.C3716b.b
        /* renamed from: a */
        public InterfaceC3755b mo4714a() {
            return new c(this.f5778b);
        }

        @Override // p124t1.InterfaceC4583a
        /* renamed from: b */
        public void mo6310b(App app) {
        }

        /* renamed from: j */
        public final HeadInterceptor m6327j() {
            return m6329l(AbstractC4478a.m5761a());
        }

        /* renamed from: k */
        public final void m6328k(C3781a c3781a) {
            this.f5779c = C3859a.m5165a(new a(this.f5778b, 0));
            this.f5780d = C3859a.m5165a(new a(this.f5778b, 4));
            this.f5781e = C3859a.m5165a(new a(this.f5778b, 3));
            this.f5782f = C3859a.m5165a(new a(this.f5778b, 2));
            this.f5783g = C3859a.m5165a(new a(this.f5778b, 1));
        }

        /* renamed from: l */
        public final HeadInterceptor m6329l(HeadInterceptor headInterceptor) {
            AbstractC4479b.m5762a(headInterceptor, (HeaderLiveData) this.f5779c.get());
            return headInterceptor;
        }

        /* renamed from: m */
        public final NetWorkResponseWithRefreshTokenInterceptor m6330m(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor) {
            AbstractC4481d.m5764a(netWorkResponseWithRefreshTokenInterceptor, (HeaderLiveData) this.f5779c.get());
            AbstractC4481d.m5765b(netWorkResponseWithRefreshTokenInterceptor, (AbstractC4494a) this.f5780d.get());
            return netWorkResponseWithRefreshTokenInterceptor;
        }

        /* renamed from: n */
        public final NetworkInterceptor m6331n(NetworkInterceptor networkInterceptor) {
            AbstractC4483f.m5767a(networkInterceptor, AbstractC3782b.m4925a(this.f5777a));
            return networkInterceptor;
        }

        /* renamed from: o */
        public final NetWorkResponseWithRefreshTokenInterceptor m6332o() {
            return m6330m(AbstractC4480c.m5763a());
        }

        /* renamed from: p */
        public final NetworkInterceptor m6333p() {
            return m6331n(AbstractC4482e.m5766a());
        }

        public f(C3781a c3781a) {
            this.f5778b = this;
            this.f5777a = c3781a;
            m6328k(c3781a);
        }
    }

    /* renamed from: t1.g$g */
    public static final class g implements InterfaceC3756c {

        /* renamed from: a */
        public final f f5786a;

        /* renamed from: b */
        public final d f5787b;

        /* renamed from: c */
        public SavedStateHandle f5788c;

        /* renamed from: d */
        public InterfaceC3706c f5789d;

        @Override // p064g2.InterfaceC3756c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC4587e build() {
            AbstractC3860b.m5167a(this.f5788c, SavedStateHandle.class);
            AbstractC3860b.m5167a(this.f5789d, InterfaceC3706c.class);
            return new h(this.f5786a, this.f5787b, this.f5788c, this.f5789d);
        }

        @Override // p064g2.InterfaceC3756c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public g mo4790a(SavedStateHandle savedStateHandle) {
            this.f5788c = (SavedStateHandle) AbstractC3860b.m5168b(savedStateHandle);
            return this;
        }

        @Override // p064g2.InterfaceC3756c
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public g mo4791b(InterfaceC3706c interfaceC3706c) {
            this.f5789d = (InterfaceC3706c) AbstractC3860b.m5168b(interfaceC3706c);
            return this;
        }

        public g(f fVar, d dVar) {
            this.f5786a = fVar;
            this.f5787b = dVar;
        }
    }

    /* renamed from: t1.g$h */
    public static final class h extends AbstractC4587e {

        /* renamed from: a */
        public final f f5790a;

        /* renamed from: b */
        public final d f5791b;

        /* renamed from: c */
        public final h f5792c;

        /* renamed from: d */
        public InterfaceC4366a f5793d;

        /* renamed from: t1.g$h$a */
        public static final class a implements InterfaceC4366a {

            /* renamed from: a */
            public final f f5794a;

            /* renamed from: b */
            public final d f5795b;

            /* renamed from: c */
            public final h f5796c;

            /* renamed from: d */
            public final int f5797d;

            public a(f fVar, d dVar, h hVar, int i4) {
                this.f5794a = fVar;
                this.f5795b = dVar;
                this.f5796c = hVar;
                this.f5797d = i4;
            }

            @Override // p096m2.InterfaceC4366a
            public Object get() {
                if (this.f5797d == 0) {
                    return new MainViewModel((HeaderLiveData) this.f5794a.f5779c.get(), (InterfaceC4609g) this.f5794a.f5783g.get());
                }
                throw new AssertionError(this.f5797d);
            }
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC3713b
        /* renamed from: a */
        public Map mo4705a() {
            return Collections.singletonMap("com.zykj.insight.ui.MainViewModel", this.f5793d);
        }

        /* renamed from: b */
        public final void m6337b(SavedStateHandle savedStateHandle, InterfaceC3706c interfaceC3706c) {
            this.f5793d = new a(this.f5790a, this.f5791b, this.f5792c, 0);
        }

        public h(f fVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC3706c interfaceC3706c) {
            this.f5792c = this;
            this.f5790a = fVar;
            this.f5791b = dVar;
            m6337b(savedStateHandle, interfaceC3706c);
        }
    }

    /* renamed from: a */
    public static e m6311a() {
        return new e();
    }
}
