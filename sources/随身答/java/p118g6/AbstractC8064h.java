package p118g6;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import com.zykj.http.bean.HeaderLiveData;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetWorkResponseWithRefreshTokenInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.student.dialogue.App;
import com.zykj.student.dialogue.network.RefreshRepositoryImpl;
import com.zykj.student.dialogue.p076ui.MainActivity;
import com.zykj.student.dialogue.p076ui.MainViewModel;
import com.zykj.student.dialogue.p076ui.ask.AskDescriptionFragment;
import com.zykj.student.dialogue.p076ui.ask.AskQuestionDialogFragment;
import com.zykj.student.dialogue.p076ui.ask.AskQuestionViewModel;
import com.zykj.student.dialogue.p076ui.ask.SearchQuestionViewModel;
import com.zykj.student.dialogue.p076ui.collect.CollectHistoryFragment;
import com.zykj.student.dialogue.p076ui.collect.CollectHistoryViewModel;
import com.zykj.student.dialogue.p076ui.collect.SearchedQuestionFragment;
import com.zykj.student.dialogue.p076ui.detail.AnswerDetailFragment;
import com.zykj.student.dialogue.p076ui.detail.AnswerPagerFragment;
import com.zykj.student.dialogue.p076ui.detail.AnswerTabFragment;
import com.zykj.student.dialogue.p076ui.detail.DeleteDialogFragment;
import com.zykj.student.dialogue.p076ui.detail.DetailTabFragment;
import com.zykj.student.dialogue.p076ui.detail.NewAnswerFragment;
import com.zykj.student.dialogue.p076ui.detail.PlayLessonFragment;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.AnswerViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.DetailTabViewModel;
import com.zykj.student.dialogue.p076ui.detail.viewmodel.NewAnswerViewModel;
import com.zykj.student.dialogue.p076ui.editType.EditCategoryViewModel;
import com.zykj.student.dialogue.p076ui.home.DatePickerFragment;
import com.zykj.student.dialogue.p076ui.home.HomeFilterViewModel;
import com.zykj.student.dialogue.p076ui.home.HomeFragment;
import com.zykj.student.dialogue.p076ui.home.HomePagerFragment;
import com.zykj.student.dialogue.p076ui.home.HomePagerViewModel;
import com.zykj.student.dialogue.p076ui.home.HomeViewModel;
import com.zykj.student.dialogue.p076ui.home.category.AddCategoryFragment;
import com.zykj.student.dialogue.p076ui.home.category.EditDialogFragment;
import com.zykj.student.dialogue.p076ui.home.category.UpdateCategoryFragment;
import com.zykj.student.dialogue.p076ui.home.dialog.SessionDeleteDialogFragment;
import com.zykj.student.dialogue.p076ui.home.dialog.SessionMoveDialogFragment;
import com.zykj.student.dialogue.upload.OssTaskManger;
import com.zykj.student.dialogue.upload.UploadWork;
import com.zykj.student.dialogue.upload.UploadWork_AssistedFactory;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.MutableStateFlow;
import p038c9.C5299y;
import p148j6.AbstractC8218b;
import p148j6.AbstractC8219c;
import p158k6.AbstractC8282b;
import p158k6.AbstractC8283c;
import p158k6.AbstractC8284d;
import p158k6.AbstractC8285e;
import p158k6.InterfaceC8287g;
import p170l6.AbstractC8894c;
import p170l6.AbstractC8895d;
import p170l6.AbstractC8896e;
import p172l8.C8923v;
import p180m6.AbstractC8995f0;
import p180m6.AbstractC8997g0;
import p180m6.AbstractC8999h0;
import p180m6.AbstractC9007l0;
import p180m6.AbstractC9009m0;
import p180m6.AbstractC9011n0;
import p190n6.AbstractC9107h;
import p190n6.AbstractC9108i;
import p190n6.AbstractC9109j;
import p214p6.AbstractC9326a;
import p214p6.AbstractC9327b;
import p214p6.AbstractC9328c;
import p214p6.AbstractC9329d;
import p214p6.AbstractC9330e;
import p214p6.AbstractC9331f;
import p214p6.AbstractC9332g;
import p214p6.AbstractC9333h;
import p214p6.AbstractC9334i;
import p225q7.InterfaceC9375a;
import p225q7.InterfaceC9377c;
import p234r6.AbstractC9431a;
import p234r6.AbstractC9432b;
import p234r6.AbstractC9433c;
import p244s6.AbstractC9534m0;
import p244s6.AbstractC9538n0;
import p244s6.AbstractC9542o0;
import p244s6.AbstractC9568u2;
import p244s6.AbstractC9571v1;
import p244s6.AbstractC9572v2;
import p244s6.AbstractC9575w1;
import p244s6.AbstractC9576w2;
import p244s6.AbstractC9579x1;
import p254t6.AbstractC9627j;
import p254t6.AbstractC9628k;
import p254t6.AbstractC9629l;
import p265u7.InterfaceC9721a;
import p265u7.InterfaceC9722b;
import p265u7.InterfaceC9723c;
import p265u7.InterfaceC9724d;
import p275v7.AbstractC9769a;
import p275v7.AbstractC9770b;
import p285w7.AbstractC9838c;
import p285w7.C9842g;
import p295x7.AbstractC9913b;
import p295x7.AbstractC9914c;
import p295x7.C9912a;
import p303y5.AbstractC9954a;
import p303y5.AbstractC9955b;
import p303y5.AbstractC9956c;
import p303y5.AbstractC9957d;
import p303y5.AbstractC9958e;
import p303y5.AbstractC9959f;
import p304y6.AbstractC9963d;
import p304y6.AbstractC9964e;
import p304y6.InterfaceC9961b;
import p313z5.AbstractC10002a;
import p315z7.AbstractC10011e;
import p315z7.C10008b;
import p315z7.C10009c;
import p315z7.C10010d;
import p315z7.C10013g;
import p315z7.InterfaceC10012f;

/* renamed from: g6.h */
/* loaded from: classes5.dex */
public abstract class AbstractC8064h {

    /* renamed from: g6.h$a */
    public static final class a implements InterfaceC9721a {

        /* renamed from: a */
        public final h f13703a;

        /* renamed from: b */
        public final d f13704b;

        /* renamed from: c */
        public Activity f13705c;

        @Override // p265u7.InterfaceC9721a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo12812a(Activity activity) {
            this.f13705c = (Activity) AbstractC10011e.m17382b(activity);
            return this;
        }

        @Override // p265u7.InterfaceC9721a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC8058b build() {
            AbstractC10011e.m17381a(this.f13705c, Activity.class);
            return new b(this.f13703a, this.f13704b, this.f13705c);
        }

        public a(h hVar, d dVar) {
            this.f13703a = hVar;
            this.f13704b = dVar;
        }
    }

    /* renamed from: g6.h$c */
    public static final class c implements InterfaceC9722b {

        /* renamed from: a */
        public final h f13709a;

        /* renamed from: b */
        public C9842g f13710b;

        @Override // p265u7.InterfaceC9722b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC8059c build() {
            AbstractC10011e.m17381a(this.f13710b, C9842g.class);
            return new d(this.f13709a, this.f13710b);
        }

        @Override // p265u7.InterfaceC9722b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo12818a(C9842g c9842g) {
            this.f13710b = (C9842g) AbstractC10011e.m17382b(c9842g);
            return this;
        }

        public c(h hVar) {
            this.f13709a = hVar;
        }
    }

    /* renamed from: g6.h$d */
    public static final class d extends AbstractC8059c {

        /* renamed from: a */
        public final h f13711a;

        /* renamed from: b */
        public final d f13712b = this;

        /* renamed from: c */
        public InterfaceC10012f f13713c;

        /* renamed from: g6.h$d$a */
        public static final class a implements InterfaceC10012f {

            /* renamed from: a */
            public final h f13714a;

            /* renamed from: b */
            public final d f13715b;

            /* renamed from: c */
            public final int f13716c;

            public a(h hVar, d dVar, int i9) {
                this.f13714a = hVar;
                this.f13715b = dVar;
                this.f13716c = i9;
            }

            @Override // p130h8.InterfaceC8110a
            public Object get() {
                if (this.f13716c == 0) {
                    return AbstractC9838c.m16771a();
                }
                throw new AssertionError(this.f13716c);
            }
        }

        public d(h hVar, C9842g c9842g) {
            this.f13711a = hVar;
            m12823c(c9842g);
        }

        @Override // p285w7.C9836a.a
        /* renamed from: a */
        public InterfaceC9721a mo12821a() {
            return new a(this.f13711a, this.f13712b);
        }

        @Override // p285w7.C9837b.d
        /* renamed from: b */
        public InterfaceC9375a mo12822b() {
            return (InterfaceC9375a) this.f13713c.get();
        }

        /* renamed from: c */
        public final void m12823c(C9842g c9842g) {
            this.f13713c = C10008b.m17373b(new a(this.f13711a, this.f13712b, 0));
        }
    }

    /* renamed from: g6.h$e */
    public static final class e {

        /* renamed from: a */
        public C9912a f13717a;

        /* renamed from: a */
        public e m12824a(C9912a c9912a) {
            this.f13717a = (C9912a) AbstractC10011e.m17382b(c9912a);
            return this;
        }

        /* renamed from: b */
        public AbstractC8061e m12825b() {
            AbstractC10011e.m17381a(this.f13717a, C9912a.class);
            return new h(this.f13717a);
        }

        public e() {
        }
    }

    /* renamed from: g6.h$f */
    public static final class f implements InterfaceC9723c {

        /* renamed from: a */
        public final h f13718a;

        /* renamed from: b */
        public final d f13719b;

        /* renamed from: c */
        public final b f13720c;

        /* renamed from: d */
        public Fragment f13721d;

        @Override // p265u7.InterfaceC9723c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC8060d build() {
            AbstractC10011e.m17381a(this.f13721d, Fragment.class);
            return new g(this.f13718a, this.f13719b, this.f13720c, this.f13721d);
        }

        @Override // p265u7.InterfaceC9723c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f mo12826a(Fragment fragment) {
            this.f13721d = (Fragment) AbstractC10011e.m17382b(fragment);
            return this;
        }

        public f(h hVar, d dVar, b bVar) {
            this.f13718a = hVar;
            this.f13719b = dVar;
            this.f13720c = bVar;
        }
    }

    /* renamed from: g6.h$h */
    public static final class h extends AbstractC8061e {

        /* renamed from: a */
        public final C9912a f13726a;

        /* renamed from: b */
        public final h f13727b = this;

        /* renamed from: c */
        public InterfaceC10012f f13728c;

        /* renamed from: d */
        public InterfaceC10012f f13729d;

        /* renamed from: e */
        public InterfaceC10012f f13730e;

        /* renamed from: f */
        public InterfaceC10012f f13731f;

        /* renamed from: g */
        public InterfaceC10012f f13732g;

        /* renamed from: h */
        public InterfaceC10012f f13733h;

        /* renamed from: i */
        public InterfaceC10012f f13734i;

        /* renamed from: j */
        public InterfaceC10012f f13735j;

        /* renamed from: k */
        public InterfaceC10012f f13736k;

        /* renamed from: g6.h$h$a */
        public static final class a implements InterfaceC10012f {

            /* renamed from: a */
            public final h f13737a;

            /* renamed from: b */
            public final int f13738b;

            /* renamed from: g6.h$h$a$a, reason: collision with other inner class name */
            public class C10072a implements UploadWork_AssistedFactory {
                public C10072a() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public UploadWork create(Context context, WorkerParameters workerParameters) {
                    return new UploadWork(context, workerParameters, (OssTaskManger) a.this.f13737a.f13733h.get());
                }
            }

            public a(h hVar, int i9) {
                this.f13737a = hVar;
                this.f13738b = i9;
            }

            @Override // p130h8.InterfaceC8110a
            public Object get() {
                switch (this.f13738b) {
                    case 0:
                        return AbstractC9964e.m17236a((InterfaceC9961b) this.f13737a.f13731f.get(), (MutableStateFlow) this.f13737a.f13732g.get());
                    case 1:
                        return AbstractC9963d.m17235a((C5299y) this.f13737a.f13730e.get());
                    case 2:
                        return AbstractC8285e.m13383a(this.f13737a.m12862o());
                    case 3:
                        return AbstractC8282b.m13380a();
                    case 4:
                        return new RefreshRepositoryImpl((HeaderLiveData) this.f13737a.f13728c.get());
                    case 5:
                        return AbstractC8218b.m13258a();
                    case 6:
                        return new C10072a();
                    case 7:
                        return AbstractC8283c.m13381a((C5299y) this.f13737a.f13730e.get());
                    case 8:
                        return AbstractC8219c.m13259a(AbstractC9914c.m16981a(this.f13737a.f13726a));
                    default:
                        throw new AssertionError(this.f13738b);
                }
            }
        }

        public h(C9912a c9912a) {
            this.f13726a = c9912a;
            m12854g(c9912a);
        }

        @Override // p245s7.AbstractC9589a.a
        /* renamed from: a */
        public Set mo12850a() {
            return Collections.EMPTY_SET;
        }

        @Override // p118g6.InterfaceC8057a
        /* renamed from: b */
        public void mo12808b(App app) {
            m12855h(app);
        }

        @Override // p285w7.C9837b.b
        /* renamed from: c */
        public InterfaceC9722b mo12851c() {
            return new c(this.f13727b);
        }

        /* renamed from: e */
        public HeadInterceptor m12852e() {
            return m12856i(AbstractC9954a.m17225a());
        }

        /* renamed from: f */
        public HiltWorkerFactory m12853f() {
            return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(m12859l());
        }

        /* renamed from: g */
        public final void m12854g(C9912a c9912a) {
            this.f13728c = C10008b.m17373b(new a(this.f13727b, 3));
            this.f13729d = C10008b.m17373b(new a(this.f13727b, 4));
            this.f13730e = C10008b.m17373b(new a(this.f13727b, 2));
            this.f13731f = C10008b.m17373b(new a(this.f13727b, 1));
            this.f13732g = C10008b.m17373b(new a(this.f13727b, 5));
            this.f13733h = C10008b.m17373b(new a(this.f13727b, 0));
            this.f13734i = C10013g.m17384a(new a(this.f13727b, 6));
            this.f13735j = C10008b.m17373b(new a(this.f13727b, 7));
            this.f13736k = C10008b.m17373b(new a(this.f13727b, 8));
        }

        /* renamed from: h */
        public final App m12855h(App app) {
            AbstractC8063g.m12809a(app, (OssTaskManger) this.f13733h.get());
            AbstractC8063g.m12810b(app, m12853f());
            return app;
        }

        /* renamed from: i */
        public final HeadInterceptor m12856i(HeadInterceptor headInterceptor) {
            AbstractC9955b.m17226a(headInterceptor, (HeaderLiveData) this.f13728c.get());
            return headInterceptor;
        }

        /* renamed from: j */
        public final NetWorkResponseWithRefreshTokenInterceptor m12857j(NetWorkResponseWithRefreshTokenInterceptor netWorkResponseWithRefreshTokenInterceptor) {
            AbstractC9957d.m17228a(netWorkResponseWithRefreshTokenInterceptor, (HeaderLiveData) this.f13728c.get());
            AbstractC9957d.m17229b(netWorkResponseWithRefreshTokenInterceptor, (AbstractC10002a) this.f13729d.get());
            return netWorkResponseWithRefreshTokenInterceptor;
        }

        /* renamed from: k */
        public final NetworkInterceptor m12858k(NetworkInterceptor networkInterceptor) {
            AbstractC9959f.m17231a(networkInterceptor, AbstractC9913b.m16980a(this.f13726a));
            return networkInterceptor;
        }

        /* renamed from: l */
        public Map m12859l() {
            return Collections.singletonMap("com.zykj.student.dialogue.upload.UploadWork", this.f13734i);
        }

        /* renamed from: m */
        public NetWorkResponseWithRefreshTokenInterceptor m12860m() {
            return m12857j(AbstractC9956c.m17227a());
        }

        /* renamed from: n */
        public NetworkInterceptor m12861n() {
            return m12858k(AbstractC9958e.m17230a());
        }

        /* renamed from: o */
        public C8923v m12862o() {
            return AbstractC8284d.m13382a(m12861n(), m12852e(), m12860m());
        }
    }

    /* renamed from: g6.h$i */
    public static final class i implements InterfaceC9724d {

        /* renamed from: a */
        public final h f13740a;

        /* renamed from: b */
        public final d f13741b;

        /* renamed from: c */
        public SavedStateHandle f13742c;

        /* renamed from: d */
        public InterfaceC9377c f13743d;

        @Override // p265u7.InterfaceC9724d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC8062f build() {
            AbstractC10011e.m17381a(this.f13742c, SavedStateHandle.class);
            AbstractC10011e.m17381a(this.f13743d, InterfaceC9377c.class);
            return new j(this.f13740a, this.f13741b, this.f13742c, this.f13743d);
        }

        @Override // p265u7.InterfaceC9724d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i mo12865a(SavedStateHandle savedStateHandle) {
            this.f13742c = (SavedStateHandle) AbstractC10011e.m17382b(savedStateHandle);
            return this;
        }

        @Override // p265u7.InterfaceC9724d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public i mo12866b(InterfaceC9377c interfaceC9377c) {
            this.f13743d = (InterfaceC9377c) AbstractC10011e.m17382b(interfaceC9377c);
            return this;
        }

        public i(h hVar, d dVar) {
            this.f13740a = hVar;
            this.f13741b = dVar;
        }
    }

    /* renamed from: g6.h$j */
    public static final class j extends AbstractC8062f {

        /* renamed from: a */
        public final h f13744a;

        /* renamed from: b */
        public final d f13745b;

        /* renamed from: c */
        public final j f13746c = this;

        /* renamed from: d */
        public InterfaceC10012f f13747d;

        /* renamed from: e */
        public InterfaceC10012f f13748e;

        /* renamed from: f */
        public InterfaceC10012f f13749f;

        /* renamed from: g */
        public InterfaceC10012f f13750g;

        /* renamed from: h */
        public InterfaceC10012f f13751h;

        /* renamed from: i */
        public InterfaceC10012f f13752i;

        /* renamed from: j */
        public InterfaceC10012f f13753j;

        /* renamed from: k */
        public InterfaceC10012f f13754k;

        /* renamed from: l */
        public InterfaceC10012f f13755l;

        /* renamed from: m */
        public InterfaceC10012f f13756m;

        /* renamed from: n */
        public InterfaceC10012f f13757n;

        /* renamed from: o */
        public InterfaceC10012f f13758o;

        /* renamed from: g6.h$j$a */
        public static final class a implements InterfaceC10012f {

            /* renamed from: a */
            public final h f13759a;

            /* renamed from: b */
            public final d f13760b;

            /* renamed from: c */
            public final j f13761c;

            /* renamed from: d */
            public final int f13762d;

            public a(h hVar, d dVar, j jVar, int i9) {
                this.f13759a = hVar;
                this.f13760b = dVar;
                this.f13761c = jVar;
                this.f13762d = i9;
            }

            @Override // p130h8.InterfaceC8110a
            public Object get() {
                switch (this.f13762d) {
                    case 0:
                        return new AnswerViewModel((InterfaceC8287g) this.f13759a.f13735j.get(), AbstractC9913b.m16980a(this.f13759a.f13726a), (MutableStateFlow) this.f13759a.f13732g.get());
                    case 1:
                        return new AskQuestionViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 2:
                        return new CollectHistoryViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 3:
                        return new DetailTabViewModel((InterfaceC8287g) this.f13759a.f13735j.get(), (MutableStateFlow) this.f13759a.f13732g.get());
                    case 4:
                        return new EditCategoryViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 5:
                        return new com.zykj.student.dialogue.p076ui.home.category.EditCategoryViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 6:
                        return new HomeFilterViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 7:
                        return new HomePagerViewModel((InterfaceC8287g) this.f13759a.f13735j.get());
                    case 8:
                        return new HomeViewModel((InterfaceC8287g) this.f13759a.f13735j.get(), (HeaderLiveData) this.f13759a.f13728c.get(), (MutableStateFlow) this.f13759a.f13732g.get(), AbstractC9913b.m16980a(this.f13759a.f13726a));
                    case 9:
                        return new MainViewModel((HeaderLiveData) this.f13759a.f13728c.get(), (MutableStateFlow) this.f13759a.f13732g.get(), (OssTaskManger) this.f13759a.f13733h.get());
                    case 10:
                        return new NewAnswerViewModel((InterfaceC8287g) this.f13759a.f13735j.get(), (WorkManager) this.f13759a.f13736k.get(), (OssTaskManger) this.f13759a.f13733h.get(), AbstractC9913b.m16980a(this.f13759a.f13726a));
                    case 11:
                        return new SearchQuestionViewModel((InterfaceC8287g) this.f13759a.f13735j.get(), (OssTaskManger) this.f13759a.f13733h.get());
                    default:
                        throw new AssertionError(this.f13762d);
                }
            }
        }

        public j(h hVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC9377c interfaceC9377c) {
            this.f13744a = hVar;
            this.f13745b = dVar;
            m12870c(savedStateHandle, interfaceC9377c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7800d
        /* renamed from: a */
        public Map mo12165a() {
            return C10009c.m17376a(C10010d.m17378b(12).m17380c(AbstractC9327b.f16200a, this.f13747d).m17380c(AbstractC8997g0.f15116a, this.f13748e).m17380c(AbstractC9108i.f15341a, this.f13749f).m17380c(AbstractC9330e.f16202a, this.f13750g).m17380c(AbstractC9432b.f16450a, this.f13751h).m17380c(AbstractC9628k.f16914a, this.f13752i).m17380c(AbstractC9538n0.f16662a, this.f13753j).m17380c(AbstractC9575w1.f16729a, this.f13754k).m17380c(AbstractC9572v2.f16725a, this.f13755l).m17380c(AbstractC8895d.f14703a, this.f13756m).m17380c(AbstractC9333h.f16204a, this.f13757n).m17380c(AbstractC9009m0.f15135a, this.f13758o).m17379a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7800d
        /* renamed from: b */
        public Map mo12166b() {
            return Collections.EMPTY_MAP;
        }

        /* renamed from: c */
        public final void m12870c(SavedStateHandle savedStateHandle, InterfaceC9377c interfaceC9377c) {
            this.f13747d = new a(this.f13744a, this.f13745b, this.f13746c, 0);
            this.f13748e = new a(this.f13744a, this.f13745b, this.f13746c, 1);
            this.f13749f = new a(this.f13744a, this.f13745b, this.f13746c, 2);
            this.f13750g = new a(this.f13744a, this.f13745b, this.f13746c, 3);
            this.f13751h = new a(this.f13744a, this.f13745b, this.f13746c, 4);
            this.f13752i = new a(this.f13744a, this.f13745b, this.f13746c, 5);
            this.f13753j = new a(this.f13744a, this.f13745b, this.f13746c, 6);
            this.f13754k = new a(this.f13744a, this.f13745b, this.f13746c, 7);
            this.f13755l = new a(this.f13744a, this.f13745b, this.f13746c, 8);
            this.f13756m = new a(this.f13744a, this.f13745b, this.f13746c, 9);
            this.f13757n = new a(this.f13744a, this.f13745b, this.f13746c, 10);
            this.f13758o = new a(this.f13744a, this.f13745b, this.f13746c, 11);
        }
    }

    /* renamed from: a */
    public static e m12811a() {
        return new e();
    }

    /* renamed from: g6.h$b */
    public static final class b extends AbstractC8058b {

        /* renamed from: a */
        public final h f13706a;

        /* renamed from: b */
        public final d f13707b;

        /* renamed from: c */
        public final b f13708c = this;

        public b(h hVar, d dVar, Activity activity) {
            this.f13706a = hVar;
            this.f13707b = dVar;
        }

        @Override // p275v7.AbstractC9769a.a
        /* renamed from: a */
        public AbstractC9769a.c mo12815a() {
            return AbstractC9770b.m16555a(mo12163b(), new i(this.f13706a, this.f13707b));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7799c
        /* renamed from: b */
        public Map mo12163b() {
            return C10009c.m17376a(C10010d.m17378b(12).m17380c(AbstractC9328c.f16201a, Boolean.valueOf(AbstractC9326a.m15216a())).m17380c(AbstractC8999h0.f15120a, Boolean.valueOf(AbstractC8995f0.m14376a())).m17380c(AbstractC9109j.f15342a, Boolean.valueOf(AbstractC9107h.m14650a())).m17380c(AbstractC9331f.f16203a, Boolean.valueOf(AbstractC9329d.m15217a())).m17380c(AbstractC9433c.f16451a, Boolean.valueOf(AbstractC9431a.m15574a())).m17380c(AbstractC9629l.f16915a, Boolean.valueOf(AbstractC9627j.m15906a())).m17380c(AbstractC9542o0.f16668a, Boolean.valueOf(AbstractC9534m0.m15747a())).m17380c(AbstractC9579x1.f16737a, Boolean.valueOf(AbstractC9571v1.m15760a())).m17380c(AbstractC9576w2.f16730a, Boolean.valueOf(AbstractC9568u2.m15759a())).m17380c(AbstractC8896e.f14704a, Boolean.valueOf(AbstractC8894c.m13829a())).m17380c(AbstractC9334i.f16205a, Boolean.valueOf(AbstractC9332g.m15218a())).m17380c(AbstractC9011n0.f15136a, Boolean.valueOf(AbstractC9007l0.m14382a())).m17379a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7799c
        /* renamed from: d */
        public InterfaceC9724d mo12164d() {
            return new i(this.f13706a, this.f13707b);
        }

        @Override // p285w7.C9841f.a
        /* renamed from: e */
        public InterfaceC9723c mo12817e() {
            return new f(this.f13706a, this.f13707b, this.f13708c);
        }

        @Override // p170l6.InterfaceC8893b
        /* renamed from: c */
        public void mo12816c(MainActivity mainActivity) {
        }
    }

    /* renamed from: g6.h$g */
    public static final class g extends AbstractC8060d {

        /* renamed from: a */
        public final h f13722a;

        /* renamed from: b */
        public final d f13723b;

        /* renamed from: c */
        public final b f13724c;

        /* renamed from: d */
        public final g f13725d = this;

        public g(h hVar, d dVar, b bVar, Fragment fragment) {
            this.f13722a = hVar;
            this.f13723b = dVar;
            this.f13724c = bVar;
        }

        @Override // p275v7.AbstractC9769a.b
        /* renamed from: a */
        public AbstractC9769a.c mo12829a() {
            return this.f13724c.mo12815a();
        }

        @Override // p244s6.InterfaceC9567u1
        /* renamed from: b */
        public void mo12830b(HomePagerFragment homePagerFragment) {
        }

        @Override // p244s6.InterfaceC9545p
        /* renamed from: c */
        public void mo12831c(DatePickerFragment datePickerFragment) {
        }

        @Override // p200o6.InterfaceC9219r0
        /* renamed from: d */
        public void mo12832d(PlayLessonFragment playLessonFragment) {
        }

        @Override // p244s6.InterfaceC9543o1
        /* renamed from: e */
        public void mo12833e(HomeFragment homeFragment) {
        }

        @Override // p254t6.InterfaceC9633p
        /* renamed from: f */
        public void mo12834f(UpdateCategoryFragment updateCategoryFragment) {
        }

        @Override // p190n6.InterfaceC9122w
        /* renamed from: g */
        public void mo12835g(SearchedQuestionFragment searchedQuestionFragment) {
        }

        @Override // p200o6.InterfaceC9218r
        /* renamed from: h */
        public void mo12836h(AnswerTabFragment answerTabFragment) {
        }

        @Override // p200o6.InterfaceC9194f
        /* renamed from: i */
        public void mo12837i(AnswerDetailFragment answerDetailFragment) {
        }

        @Override // p200o6.InterfaceC9215p0
        /* renamed from: j */
        public void mo12838j(NewAnswerFragment newAnswerFragment) {
        }

        @Override // p264u6.InterfaceC9720s
        /* renamed from: k */
        public void mo12839k(SessionMoveDialogFragment sessionMoveDialogFragment) {
        }

        @Override // p190n6.InterfaceC9105f
        /* renamed from: l */
        public void mo12840l(CollectHistoryFragment collectHistoryFragment) {
        }

        @Override // p254t6.InterfaceC9620c
        /* renamed from: m */
        public void mo12841m(AddCategoryFragment addCategoryFragment) {
        }

        @Override // p200o6.InterfaceC9212o
        /* renamed from: n */
        public void mo12842n(AnswerPagerFragment answerPagerFragment) {
        }

        @Override // p180m6.InterfaceC8992e
        /* renamed from: o */
        public void mo12843o(AskDescriptionFragment askDescriptionFragment) {
        }

        @Override // p180m6.InterfaceC9010n
        /* renamed from: p */
        public void mo12844p(AskQuestionDialogFragment askQuestionDialogFragment) {
        }

        @Override // p200o6.InterfaceC9225x
        /* renamed from: q */
        public void mo12845q(DetailTabFragment detailTabFragment) {
        }

        @Override // p200o6.InterfaceC9222u
        /* renamed from: r */
        public void mo12846r(DeleteDialogFragment deleteDialogFragment) {
        }

        @Override // p264u6.InterfaceC9716o
        /* renamed from: s */
        public void mo12847s(SessionDeleteDialogFragment sessionDeleteDialogFragment) {
        }

        @Override // p254t6.InterfaceC9630m
        /* renamed from: t */
        public void mo12848t(EditDialogFragment editDialogFragment) {
        }
    }
}
