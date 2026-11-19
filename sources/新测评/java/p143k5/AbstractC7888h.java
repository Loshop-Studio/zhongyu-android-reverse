package p143k5;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.work.WorkerParameters;
import com.zykj.evaluation.App;
import com.zykj.evaluation.network.RefreshRepositoryImpl;
import com.zykj.evaluation.p056di.AppDatabase;
import com.zykj.evaluation.p057ui.MainActivity;
import com.zykj.evaluation.p057ui.MainFragment;
import com.zykj.evaluation.p057ui.MainViewModel;
import com.zykj.evaluation.p057ui.board.WhiteBoardDialogFragment;
import com.zykj.evaluation.p057ui.datepicker.DatePickerFragment;
import com.zykj.evaluation.p057ui.detail.correcting.CorrectingDetailViewModel;
import com.zykj.evaluation.p057ui.detail.done.DoneDetailViewModel;
import com.zykj.evaluation.p057ui.detail.mistake.MistakeViewModel;
import com.zykj.evaluation.p057ui.detail.revising.RevisingDetailViewModel;
import com.zykj.evaluation.p057ui.detail.toCorrect.ToCorrectDetailViewModel;
import com.zykj.evaluation.p057ui.detail.toCorrectSelf.ToCorrectSelfDetailViewModel;
import com.zykj.evaluation.p057ui.detail.todo.TodoDetailViewModel;
import com.zykj.evaluation.p057ui.guide.noStem.NoStemViewModel;
import com.zykj.evaluation.p057ui.guide.normal.correcting.CorrectingGuideViewModel;
import com.zykj.evaluation.p057ui.guide.normal.done.DoneGuideViewModel;
import com.zykj.evaluation.p057ui.guide.normal.revising.RevisingGuideViewModel;
import com.zykj.evaluation.p057ui.guide.normal.toCorrect.ToCorrectGuideViewModel;
import com.zykj.evaluation.p057ui.guide.normal.toCorrectSelf.ToCorrectSelfGuideViewModel;
import com.zykj.evaluation.p057ui.guide.normal.toDo.TodoGuideViewModel;
import com.zykj.evaluation.p057ui.home.HomeViewModel;
import com.zykj.evaluation.p057ui.progress.ProgressViewModel;
import com.zykj.evaluation.p057ui.sheet.composition.CompositionViewModel;
import com.zykj.evaluation.p057ui.sheet.normal.NormalViewModel;
import com.zykj.evaluation.p057ui.sheet.treble.TrebleViewModel;
import com.zykj.evaluation.p057ui.sketch.SketchPlayViewModel;
import com.zykj.evaluation.submit.SubmitCorrectSelfWork;
import com.zykj.evaluation.submit.SubmitCorrectSelfWork_AssistedFactory;
import com.zykj.evaluation.submit.SubmitNoStemWork;
import com.zykj.evaluation.submit.SubmitNoStemWork_AssistedFactory;
import com.zykj.evaluation.submit.SubmitNormalWork;
import com.zykj.evaluation.submit.SubmitNormalWork_AssistedFactory;
import com.zykj.evaluation.submit.SubmitTaskManger;
import com.zykj.evaluation.upload.AnswerUploadWork;
import com.zykj.evaluation.upload.AnswerUploadWork_AssistedFactory;
import com.zykj.evaluation.upload.FileUploadWork;
import com.zykj.evaluation.upload.FileUploadWork_AssistedFactory;
import com.zykj.evaluation.upload.MultiAnswerUploadWork;
import com.zykj.evaluation.upload.MultiAnswerUploadWork_AssistedFactory;
import com.zykj.evaluation.upload.OssTaskManger;
import com.zykj.evaluation.upload.QuestionUploadWork;
import com.zykj.evaluation.upload.QuestionUploadWork_AssistedFactory;
import com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork;
import com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork_AssistedFactory;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p008a6.AbstractC0025c;
import p008a6.AbstractC0026d;
import p008a6.AbstractC0027e;
import p009a7.AbstractC0030c;
import p009a7.AbstractC0031d;
import p009a7.AbstractC0032e;
import p011a9.C0059v;
import p036c6.AbstractC5137j;
import p036c6.AbstractC5138k;
import p036c6.AbstractC5139l;
import p037c7.AbstractC5158s;
import p037c7.AbstractC5159t;
import p037c7.AbstractC5160u;
import p067d6.AbstractC7302k;
import p067d6.AbstractC7303l;
import p067d6.AbstractC7304m;
import p078e6.AbstractC7367i;
import p078e6.AbstractC7368j;
import p078e6.AbstractC7369k;
import p090f7.AbstractC7492e;
import p090f7.AbstractC7493f;
import p090f7.InterfaceC7490c;
import p091f8.InterfaceC7494a;
import p091f8.InterfaceC7496c;
import p112h7.InterfaceC7632b;
import p122i6.AbstractC7691l0;
import p122i6.AbstractC7693m0;
import p122i6.AbstractC7695n0;
import p123i7.AbstractC7710a;
import p123i7.AbstractC7711b;
import p123i7.AbstractC7712c;
import p123i7.AbstractC7713d;
import p134j7.AbstractC7814a;
import p135j8.InterfaceC7815a;
import p135j8.InterfaceC7816b;
import p135j8.InterfaceC7817c;
import p135j8.InterfaceC7818d;
import p144k6.AbstractC7895d;
import p144k6.AbstractC7896e;
import p144k6.AbstractC7897f;
import p146k8.AbstractC7899a;
import p146k8.AbstractC7900b;
import p157l6.AbstractC8511c;
import p157l6.AbstractC8512d;
import p157l6.AbstractC8513e;
import p159l8.AbstractC8518c;
import p159l8.C8522g;
import p167m5.AbstractC8558h;
import p168m6.AbstractC8563d;
import p168m6.AbstractC8564e;
import p168m6.AbstractC8565f;
import p170m8.AbstractC8570b;
import p170m8.C8569a;
import p190o6.AbstractC8718f;
import p190o6.AbstractC8719g;
import p190o6.AbstractC8720h;
import p192o8.AbstractC8726e;
import p192o8.C8723b;
import p192o8.C8724c;
import p192o8.C8725d;
import p192o8.C8728g;
import p192o8.InterfaceC8727f;
import p200p5.AbstractC8835b;
import p200p5.AbstractC8836c;
import p200p5.AbstractC8837d;
import p200p5.AbstractC8838e;
import p200p5.AbstractC8839f;
import p200p5.AbstractC8840g;
import p200p5.AbstractC8841h;
import p200p5.AbstractC8846m;
import p200p5.AbstractC8847n;
import p200p5.InterfaceC8843j;
import p200p5.InterfaceC8844k;
import p201p6.AbstractC8854f;
import p201p6.AbstractC8855g;
import p201p6.AbstractC8856h;
import p212q6.AbstractC8896f;
import p212q6.AbstractC8897g;
import p212q6.AbstractC8898h;
import p222r5.AbstractC9010b;
import p226r9.C9059d0;
import p233s5.AbstractC9226r3;
import p233s5.AbstractC9231s3;
import p233s5.AbstractC9236t3;
import p234s6.AbstractC9263a1;
import p234s6.AbstractC9266b1;
import p234s6.AbstractC9316z0;
import p256u6.AbstractC9573m;
import p256u6.AbstractC9574n;
import p256u6.AbstractC9575o;
import p277w6.AbstractC9817d;
import p277w6.AbstractC9818e;
import p277w6.AbstractC9819f;
import p286x5.AbstractC9855c;
import p286x5.AbstractC9856d;
import p286x5.AbstractC9857e;
import p287x6.AbstractC9864g;
import p287x6.AbstractC9865h;
import p287x6.AbstractC9866i;
import p296y5.AbstractC9926b;
import p296y5.AbstractC9927c;
import p296y5.AbstractC9928d;
import p306z5.AbstractC10016m1;
import p306z5.AbstractC10019n1;
import p306z5.AbstractC10022o1;

/* renamed from: k5.h */
/* loaded from: classes4.dex */
public abstract class AbstractC7888h {

    /* renamed from: k5.h$a */
    public static final class a implements InterfaceC7815a {

        /* renamed from: a */
        public final h f13671a;

        /* renamed from: b */
        public final d f13672b;

        /* renamed from: c */
        public Activity f13673c;

        @Override // p135j8.InterfaceC7815a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo13240a(Activity activity) {
            this.f13673c = (Activity) AbstractC8726e.m14365b(activity);
            return this;
        }

        @Override // p135j8.InterfaceC7815a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC7882b build() {
            AbstractC8726e.m14364a(this.f13673c, Activity.class);
            return new b(this.f13671a, this.f13672b, this.f13673c);
        }

        public a(h hVar, d dVar) {
            this.f13671a = hVar;
            this.f13672b = dVar;
        }
    }

    /* renamed from: k5.h$c */
    public static final class c implements InterfaceC7816b {

        /* renamed from: a */
        public final h f13677a;

        /* renamed from: b */
        public C8522g f13678b;

        @Override // p135j8.InterfaceC7816b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7883c build() {
            AbstractC8726e.m14364a(this.f13678b, C8522g.class);
            return new d(this.f13677a, this.f13678b);
        }

        @Override // p135j8.InterfaceC7816b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo13241a(C8522g c8522g) {
            this.f13678b = (C8522g) AbstractC8726e.m14365b(c8522g);
            return this;
        }

        public c(h hVar) {
            this.f13677a = hVar;
        }
    }

    /* renamed from: k5.h$d */
    public static final class d extends AbstractC7883c {

        /* renamed from: a */
        public final h f13679a;

        /* renamed from: b */
        public final d f13680b = this;

        /* renamed from: c */
        public InterfaceC8727f f13681c;

        /* renamed from: k5.h$d$a */
        public static final class a implements InterfaceC8727f {

            /* renamed from: a */
            public final h f13682a;

            /* renamed from: b */
            public final d f13683b;

            /* renamed from: c */
            public final int f13684c;

            public a(h hVar, d dVar, int i10) {
                this.f13682a = hVar;
                this.f13683b = dVar;
                this.f13684c = i10;
            }

            @Override // p279w8.InterfaceC9823a
            public Object get() {
                if (this.f13684c == 0) {
                    return AbstractC8518c.m14004a();
                }
                throw new AssertionError(this.f13684c);
            }
        }

        public d(h hVar, C8522g c8522g) {
            this.f13679a = hVar;
            m13479c(c8522g);
        }

        @Override // p159l8.C8516a.a
        /* renamed from: a */
        public InterfaceC7815a mo13477a() {
            return new a(this.f13679a, this.f13680b);
        }

        @Override // p159l8.C8517b.d
        /* renamed from: b */
        public InterfaceC7494a mo13478b() {
            return (InterfaceC7494a) this.f13681c.get();
        }

        /* renamed from: c */
        public final void m13479c(C8522g c8522g) {
            this.f13681c = C8723b.m14356b(new a(this.f13679a, this.f13680b, 0));
        }
    }

    /* renamed from: k5.h$e */
    public static final class e {

        /* renamed from: a */
        public C8569a f13685a;

        /* renamed from: a */
        public e m13480a(C8569a c8569a) {
            this.f13685a = (C8569a) AbstractC8726e.m14365b(c8569a);
            return this;
        }

        /* renamed from: b */
        public AbstractC7885e m13481b() {
            AbstractC8726e.m14364a(this.f13685a, C8569a.class);
            return new h(this.f13685a);
        }

        public e() {
        }
    }

    /* renamed from: k5.h$f */
    public static final class f implements InterfaceC7817c {

        /* renamed from: a */
        public final h f13686a;

        /* renamed from: b */
        public final d f13687b;

        /* renamed from: c */
        public final b f13688c;

        /* renamed from: d */
        public Fragment f13689d;

        @Override // p135j8.InterfaceC7817c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7884d build() {
            AbstractC8726e.m14364a(this.f13689d, Fragment.class);
            return new g(this.f13686a, this.f13687b, this.f13688c, this.f13689d);
        }

        @Override // p135j8.InterfaceC7817c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f mo13242a(Fragment fragment) {
            this.f13689d = (Fragment) AbstractC8726e.m14365b(fragment);
            return this;
        }

        public f(h hVar, d dVar, b bVar) {
            this.f13686a = hVar;
            this.f13687b = dVar;
            this.f13688c = bVar;
        }
    }

    /* renamed from: k5.h$h */
    public static final class h extends AbstractC7885e {

        /* renamed from: a */
        public final C8569a f13694a;

        /* renamed from: b */
        public final h f13695b = this;

        /* renamed from: c */
        public InterfaceC8727f f13696c;

        /* renamed from: d */
        public InterfaceC8727f f13697d;

        /* renamed from: e */
        public InterfaceC8727f f13698e;

        /* renamed from: f */
        public InterfaceC8727f f13699f;

        /* renamed from: g */
        public InterfaceC8727f f13700g;

        /* renamed from: h */
        public InterfaceC8727f f13701h;

        /* renamed from: i */
        public InterfaceC8727f f13702i;

        /* renamed from: j */
        public InterfaceC8727f f13703j;

        /* renamed from: k */
        public InterfaceC8727f f13704k;

        /* renamed from: l */
        public InterfaceC8727f f13705l;

        /* renamed from: m */
        public InterfaceC8727f f13706m;

        /* renamed from: n */
        public InterfaceC8727f f13707n;

        /* renamed from: o */
        public InterfaceC8727f f13708o;

        /* renamed from: p */
        public InterfaceC8727f f13709p;

        /* renamed from: q */
        public InterfaceC8727f f13710q;

        /* renamed from: r */
        public InterfaceC8727f f13711r;

        /* renamed from: s */
        public InterfaceC8727f f13712s;

        /* renamed from: t */
        public InterfaceC8727f f13713t;

        /* renamed from: u */
        public InterfaceC8727f f13714u;

        /* renamed from: v */
        public InterfaceC8727f f13715v;

        /* renamed from: w */
        public InterfaceC8727f f13716w;

        /* renamed from: x */
        public InterfaceC8727f f13717x;

        /* renamed from: k5.h$h$a */
        public static final class a implements InterfaceC8727f {

            /* renamed from: a */
            public final h f13718a;

            /* renamed from: b */
            public final int f13719b;

            /* renamed from: k5.h$h$a$a, reason: collision with other inner class name */
            public class C10147a implements AnswerUploadWork_AssistedFactory {
                public C10147a() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public AnswerUploadWork create(Context context, WorkerParameters workerParameters) {
                    return new AnswerUploadWork(context, workerParameters, (OssTaskManger) a.this.f13718a.f13704k.get(), (AppDatabase) a.this.f13718a.f13703j.get());
                }
            }

            /* renamed from: k5.h$h$a$b */
            public class b implements FileUploadWork_AssistedFactory {
                public b() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FileUploadWork create(Context context, WorkerParameters workerParameters) {
                    return new FileUploadWork(context, workerParameters, (OssTaskManger) a.this.f13718a.f13704k.get());
                }
            }

            /* renamed from: k5.h$h$a$c */
            public class c implements MultiAnswerUploadWork_AssistedFactory {
                public c() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public MultiAnswerUploadWork create(Context context, WorkerParameters workerParameters) {
                    return new MultiAnswerUploadWork(context, workerParameters, (OssTaskManger) a.this.f13718a.f13704k.get(), (AppDatabase) a.this.f13718a.f13703j.get());
                }
            }

            /* renamed from: k5.h$h$a$d */
            public class d implements QuestionUploadWork_AssistedFactory {
                public d() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public QuestionUploadWork create(Context context, WorkerParameters workerParameters) {
                    return new QuestionUploadWork(context, workerParameters, (InterfaceC8843j) a.this.f13718a.f13708o.get(), (AppDatabase) a.this.f13718a.f13703j.get(), (OssTaskManger) a.this.f13718a.f13704k.get());
                }
            }

            /* renamed from: k5.h$h$a$e */
            public class e implements SelfCorrectQuestionUploadWork_AssistedFactory {
                public e() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SelfCorrectQuestionUploadWork create(Context context, WorkerParameters workerParameters) {
                    return new SelfCorrectQuestionUploadWork(context, workerParameters, (InterfaceC8843j) a.this.f13718a.f13708o.get(), (AppDatabase) a.this.f13718a.f13703j.get(), (OssTaskManger) a.this.f13718a.f13704k.get());
                }
            }

            /* renamed from: k5.h$h$a$f */
            public class f implements SubmitCorrectSelfWork_AssistedFactory {
                public f() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SubmitCorrectSelfWork create(Context context, WorkerParameters workerParameters) {
                    return new SubmitCorrectSelfWork(context, workerParameters, (InterfaceC8843j) a.this.f13718a.f13708o.get(), (AppDatabase) a.this.f13718a.f13703j.get());
                }
            }

            /* renamed from: k5.h$h$a$g */
            public class g implements SubmitNoStemWork_AssistedFactory {
                public g() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SubmitNoStemWork create(Context context, WorkerParameters workerParameters) {
                    return new SubmitNoStemWork(context, workerParameters, (InterfaceC8843j) a.this.f13718a.f13708o.get(), (AppDatabase) a.this.f13718a.f13703j.get());
                }
            }

            /* renamed from: k5.h$h$a$h, reason: collision with other inner class name */
            public class C10148h implements SubmitNormalWork_AssistedFactory {
                public C10148h() {
                }

                @Override // androidx.hilt.work.WorkerAssistedFactory
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public SubmitNormalWork create(Context context, WorkerParameters workerParameters) {
                    return new SubmitNormalWork(context, workerParameters, (InterfaceC8843j) a.this.f13718a.f13708o.get(), (AppDatabase) a.this.f13718a.f13703j.get());
                }
            }

            public a(h hVar, int i10) {
                this.f13718a = hVar;
                this.f13719b = i10;
            }

            @Override // p279w8.InterfaceC9823a
            public Object get() {
                switch (this.f13719b) {
                    case 0:
                        return AbstractC7493f.m12125a((MutableStateFlow) this.f13718a.f13696c.get(), (InterfaceC7490c) this.f13718a.f13702i.get(), (AppDatabase) this.f13718a.f13703j.get());
                    case 1:
                        return AbstractC8840g.m14816a();
                    case 2:
                        return AbstractC7492e.m12124a((C9059d0) this.f13718a.f13701h.get());
                    case 3:
                        return AbstractC8837d.m14813a((C0059v) this.f13718a.f13700g.get());
                    case 4:
                        return AbstractC8836c.m14812a(new NetworkInterceptor(), this.f13718a.m13490e(), this.f13718a.m13497l());
                    case 5:
                        return AbstractC8835b.m14811a();
                    case 6:
                        return AbstractC8839f.m14815a();
                    case 7:
                        return new RefreshRepositoryImpl((MutableStateFlow) this.f13718a.f13697d.get());
                    case 8:
                        return AbstractC8558h.m14100a(AbstractC8570b.m14110a(this.f13718a.f13694a));
                    case 9:
                        return new C10147a();
                    case 10:
                        return new b();
                    case 11:
                        return new c();
                    case 12:
                        return new d();
                    case 13:
                        return AbstractC8838e.m14814a((C9059d0) this.f13718a.f13701h.get());
                    case 14:
                        return new e();
                    case 15:
                        return new f();
                    case 16:
                        return new g();
                    case 17:
                        return new C10148h();
                    case 18:
                        return AbstractC9010b.m15164a((AppDatabase) this.f13718a.f13703j.get(), (OssTaskManger) this.f13718a.f13704k.get());
                    case 19:
                        return AbstractC8841h.m14817a((C9059d0) this.f13718a.f13701h.get());
                    case 20:
                        return AbstractC8847n.m14849a((C0059v) this.f13718a.f13716w.get());
                    case 21:
                        return AbstractC8846m.m14848a(new NetworkInterceptor());
                    default:
                        throw new AssertionError(this.f13719b);
                }
            }
        }

        public h(C8569a c8569a) {
            this.f13694a = c8569a;
            m13492g(c8569a);
        }

        @Override // p143k5.InterfaceC7881a
        /* renamed from: a */
        public void mo13466a(App app) {
            m13493h(app);
        }

        @Override // p113h8.AbstractC7636a.a
        /* renamed from: b */
        public Set mo12620b() {
            return Collections.EMPTY_SET;
        }

        @Override // p159l8.C8517b.b
        /* renamed from: c */
        public InterfaceC7816b mo13489c() {
            return new c(this.f13695b);
        }

        /* renamed from: e */
        public HeadInterceptor m13490e() {
            return m13494i(AbstractC7710a.m12883a());
        }

        /* renamed from: f */
        public HiltWorkerFactory m13491f() {
            return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(m13496k());
        }

        /* renamed from: g */
        public final void m13492g(C8569a c8569a) {
            this.f13696c = C8723b.m14356b(new a(this.f13695b, 1));
            this.f13697d = C8723b.m14356b(new a(this.f13695b, 5));
            this.f13698e = C8723b.m14356b(new a(this.f13695b, 6));
            this.f13699f = C8723b.m14356b(new a(this.f13695b, 7));
            this.f13700g = C8723b.m14356b(new a(this.f13695b, 4));
            this.f13701h = C8723b.m14356b(new a(this.f13695b, 3));
            this.f13702i = C8723b.m14356b(new a(this.f13695b, 2));
            this.f13703j = C8723b.m14356b(new a(this.f13695b, 8));
            this.f13704k = C8723b.m14356b(new a(this.f13695b, 0));
            this.f13705l = C8728g.m14367a(new a(this.f13695b, 9));
            this.f13706m = C8728g.m14367a(new a(this.f13695b, 10));
            this.f13707n = C8728g.m14367a(new a(this.f13695b, 11));
            this.f13708o = C8723b.m14356b(new a(this.f13695b, 13));
            this.f13709p = C8728g.m14367a(new a(this.f13695b, 12));
            this.f13710q = C8728g.m14367a(new a(this.f13695b, 14));
            this.f13711r = C8728g.m14367a(new a(this.f13695b, 15));
            this.f13712s = C8728g.m14367a(new a(this.f13695b, 16));
            this.f13713t = C8728g.m14367a(new a(this.f13695b, 17));
            this.f13714u = C8723b.m14356b(new a(this.f13695b, 18));
            this.f13715v = C8723b.m14356b(new a(this.f13695b, 19));
            this.f13716w = C8723b.m14356b(new a(this.f13695b, 21));
            this.f13717x = C8723b.m14356b(new a(this.f13695b, 20));
        }

        /* renamed from: h */
        public final App m13493h(App app) {
            AbstractC7887g.m13467a(app, (OssTaskManger) this.f13704k.get());
            AbstractC7887g.m13468b(app, m13491f());
            return app;
        }

        /* renamed from: i */
        public final HeadInterceptor m13494i(HeadInterceptor headInterceptor) {
            AbstractC7711b.m12884a(headInterceptor, (MutableStateFlow) this.f13697d.get());
            return headInterceptor;
        }

        /* renamed from: j */
        public final RefreshTokenInterceptor m13495j(RefreshTokenInterceptor refreshTokenInterceptor) {
            AbstractC7713d.m12887b(refreshTokenInterceptor, (MutableSharedFlow) this.f13698e.get());
            AbstractC7713d.m12886a(refreshTokenInterceptor, (AbstractC7814a) this.f13699f.get());
            return refreshTokenInterceptor;
        }

        /* renamed from: k */
        public Map m13496k() {
            return C8725d.m14361b(8).m14363c("com.zykj.evaluation.upload.AnswerUploadWork", this.f13705l).m14363c("com.zykj.evaluation.upload.FileUploadWork", this.f13706m).m14363c("com.zykj.evaluation.upload.MultiAnswerUploadWork", this.f13707n).m14363c("com.zykj.evaluation.upload.QuestionUploadWork", this.f13709p).m14363c("com.zykj.evaluation.upload.SelfCorrectQuestionUploadWork", this.f13710q).m14363c("com.zykj.evaluation.submit.SubmitCorrectSelfWork", this.f13711r).m14363c("com.zykj.evaluation.submit.SubmitNoStemWork", this.f13712s).m14363c("com.zykj.evaluation.submit.SubmitNormalWork", this.f13713t).m14362a();
        }

        /* renamed from: l */
        public RefreshTokenInterceptor m13497l() {
            return m13495j(AbstractC7712c.m12885a());
        }
    }

    /* renamed from: k5.h$i */
    public static final class i implements InterfaceC7818d {

        /* renamed from: a */
        public final h f13728a;

        /* renamed from: b */
        public final d f13729b;

        /* renamed from: c */
        public SavedStateHandle f13730c;

        /* renamed from: d */
        public InterfaceC7496c f13731d;

        @Override // p135j8.InterfaceC7818d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC7886f build() {
            AbstractC8726e.m14364a(this.f13730c, SavedStateHandle.class);
            AbstractC8726e.m14364a(this.f13731d, InterfaceC7496c.class);
            return new j(this.f13728a, this.f13729b, this.f13730c, this.f13731d);
        }

        @Override // p135j8.InterfaceC7818d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i mo13244b(SavedStateHandle savedStateHandle) {
            this.f13730c = (SavedStateHandle) AbstractC8726e.m14365b(savedStateHandle);
            return this;
        }

        @Override // p135j8.InterfaceC7818d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public i mo13243a(InterfaceC7496c interfaceC7496c) {
            this.f13731d = (InterfaceC7496c) AbstractC8726e.m14365b(interfaceC7496c);
            return this;
        }

        public i(h hVar, d dVar) {
            this.f13728a = hVar;
            this.f13729b = dVar;
        }
    }

    /* renamed from: k5.h$j */
    public static final class j extends AbstractC7886f {

        /* renamed from: a */
        public final h f13732a;

        /* renamed from: b */
        public final d f13733b;

        /* renamed from: c */
        public final j f13734c = this;

        /* renamed from: d */
        public InterfaceC8727f f13735d;

        /* renamed from: e */
        public InterfaceC8727f f13736e;

        /* renamed from: f */
        public InterfaceC8727f f13737f;

        /* renamed from: g */
        public InterfaceC8727f f13738g;

        /* renamed from: h */
        public InterfaceC8727f f13739h;

        /* renamed from: i */
        public InterfaceC8727f f13740i;

        /* renamed from: j */
        public InterfaceC8727f f13741j;

        /* renamed from: k */
        public InterfaceC8727f f13742k;

        /* renamed from: l */
        public InterfaceC8727f f13743l;

        /* renamed from: m */
        public InterfaceC8727f f13744m;

        /* renamed from: n */
        public InterfaceC8727f f13745n;

        /* renamed from: o */
        public InterfaceC8727f f13746o;

        /* renamed from: p */
        public InterfaceC8727f f13747p;

        /* renamed from: q */
        public InterfaceC8727f f13748q;

        /* renamed from: r */
        public InterfaceC8727f f13749r;

        /* renamed from: s */
        public InterfaceC8727f f13750s;

        /* renamed from: t */
        public InterfaceC8727f f13751t;

        /* renamed from: u */
        public InterfaceC8727f f13752u;

        /* renamed from: v */
        public InterfaceC8727f f13753v;

        /* renamed from: w */
        public InterfaceC8727f f13754w;

        /* renamed from: x */
        public InterfaceC8727f f13755x;

        /* renamed from: k5.h$j$a */
        public static final class a implements InterfaceC8727f {

            /* renamed from: a */
            public final h f13756a;

            /* renamed from: b */
            public final d f13757b;

            /* renamed from: c */
            public final j f13758c;

            /* renamed from: d */
            public final int f13759d;

            public a(h hVar, d dVar, j jVar, int i10) {
                this.f13756a = hVar;
                this.f13757b = dVar;
                this.f13758c = jVar;
                this.f13759d = i10;
            }

            @Override // p279w8.InterfaceC9823a
            public Object get() {
                switch (this.f13759d) {
                    case 0:
                        return new CompositionViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (OssTaskManger) this.f13756a.f13704k.get());
                    case 1:
                        return new CorrectingDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 2:
                        return new CorrectingGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get());
                    case 3:
                        return new DoneDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 4:
                        return new DoneGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get());
                    case 5:
                        return new HomeViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (InterfaceC8843j) this.f13756a.f13708o.get(), (InterfaceC7632b) this.f13756a.f13715v.get(), (AppDatabase) this.f13756a.f13703j.get(), (SubmitTaskManger) this.f13756a.f13714u.get());
                    case 6:
                        return new MainViewModel((MutableStateFlow) this.f13756a.f13697d.get(), (MutableSharedFlow) this.f13756a.f13698e.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (OssTaskManger) this.f13756a.f13704k.get());
                    case 7:
                        return new MistakeViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (InterfaceC8843j) this.f13756a.f13708o.get(), (OssTaskManger) this.f13756a.f13704k.get());
                    case 8:
                        return new NoStemViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (AppDatabase) this.f13756a.f13703j.get());
                    case 9:
                        return new NormalViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (InterfaceC8844k) this.f13756a.f13717x.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (AppDatabase) this.f13756a.f13703j.get());
                    case 10:
                        return new ProgressViewModel();
                    case 11:
                        return new RevisingDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 12:
                        return new RevisingGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get());
                    case 13:
                        return new SketchPlayViewModel((InterfaceC8843j) this.f13756a.f13708o.get());
                    case 14:
                        return new ToCorrectDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (AppDatabase) this.f13756a.f13703j.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 15:
                        return new ToCorrectGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (AppDatabase) this.f13756a.f13703j.get());
                    case 16:
                        return new ToCorrectSelfDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (AppDatabase) this.f13756a.f13703j.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 17:
                        return new ToCorrectSelfGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get());
                    case 18:
                        return new TodoDetailViewModel((MutableStateFlow) this.f13756a.f13696c.get(), (MutableStateFlow) this.f13756a.f13697d.get(), (AppDatabase) this.f13756a.f13703j.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (InterfaceC8843j) this.f13756a.f13708o.get());
                    case 19:
                        return new TodoGuideViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (AppDatabase) this.f13756a.f13703j.get());
                    case 20:
                        return new TrebleViewModel((InterfaceC8843j) this.f13756a.f13708o.get(), (InterfaceC8844k) this.f13756a.f13717x.get(), (MutableStateFlow) this.f13756a.f13696c.get(), (OssTaskManger) this.f13756a.f13704k.get(), (SubmitTaskManger) this.f13756a.f13714u.get(), (AppDatabase) this.f13756a.f13703j.get());
                    default:
                        throw new AssertionError(this.f13759d);
                }
            }
        }

        public j(h hVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC7496c interfaceC7496c) {
            this.f13732a = hVar;
            this.f13733b = dVar;
            m13510c(savedStateHandle, interfaceC7496c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7318d
        /* renamed from: a */
        public Map mo11614a() {
            return C8724c.m14359a(C8725d.m14361b(21).m14363c(AbstractC9818e.f17354a, this.f13735d).m14363c(AbstractC9856d.f17423a, this.f13736e).m14363c(AbstractC7896e.f13769a, this.f13737f).m14363c(AbstractC9927c.f17739a, this.f13738g).m14363c(AbstractC8512d.f14120a, this.f13739h).m14363c(AbstractC9263a1.f16003a, this.f13740i).m14363c(AbstractC9231s3.f15967a, this.f13741j).m14363c(AbstractC10019n1.f17994a, this.f13742k).m14363c(AbstractC7693m0.f13038a, this.f13743l).m14363c(AbstractC9865h.f17446a, this.f13744m).m14363c(AbstractC9574n.f16778a, this.f13745n).m14363c(AbstractC0026d.f67a, this.f13746o).m14363c(AbstractC8564e.f14206a, this.f13747p).m14363c(AbstractC5159t.f2748a, this.f13748q).m14363c(AbstractC5138k.f2713a, this.f13749r).m14363c(AbstractC8719g.f14500a, this.f13750s).m14363c(AbstractC7303l.f11789a, this.f13751t).m14363c(AbstractC8855g.f15056a, this.f13752u).m14363c(AbstractC7368j.f11949a, this.f13753v).m14363c(AbstractC8897g.f15208a, this.f13754w).m14363c(AbstractC0031d.f76a, this.f13755x).m14362a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7318d
        /* renamed from: b */
        public Map mo11615b() {
            return Collections.EMPTY_MAP;
        }

        /* renamed from: c */
        public final void m13510c(SavedStateHandle savedStateHandle, InterfaceC7496c interfaceC7496c) {
            this.f13735d = new a(this.f13732a, this.f13733b, this.f13734c, 0);
            this.f13736e = new a(this.f13732a, this.f13733b, this.f13734c, 1);
            this.f13737f = new a(this.f13732a, this.f13733b, this.f13734c, 2);
            this.f13738g = new a(this.f13732a, this.f13733b, this.f13734c, 3);
            this.f13739h = new a(this.f13732a, this.f13733b, this.f13734c, 4);
            this.f13740i = new a(this.f13732a, this.f13733b, this.f13734c, 5);
            this.f13741j = new a(this.f13732a, this.f13733b, this.f13734c, 6);
            this.f13742k = new a(this.f13732a, this.f13733b, this.f13734c, 7);
            this.f13743l = new a(this.f13732a, this.f13733b, this.f13734c, 8);
            this.f13744m = new a(this.f13732a, this.f13733b, this.f13734c, 9);
            this.f13745n = new a(this.f13732a, this.f13733b, this.f13734c, 10);
            this.f13746o = new a(this.f13732a, this.f13733b, this.f13734c, 11);
            this.f13747p = new a(this.f13732a, this.f13733b, this.f13734c, 12);
            this.f13748q = new a(this.f13732a, this.f13733b, this.f13734c, 13);
            this.f13749r = new a(this.f13732a, this.f13733b, this.f13734c, 14);
            this.f13750s = new a(this.f13732a, this.f13733b, this.f13734c, 15);
            this.f13751t = new a(this.f13732a, this.f13733b, this.f13734c, 16);
            this.f13752u = new a(this.f13732a, this.f13733b, this.f13734c, 17);
            this.f13753v = new a(this.f13732a, this.f13733b, this.f13734c, 18);
            this.f13754w = new a(this.f13732a, this.f13733b, this.f13734c, 19);
            this.f13755x = new a(this.f13732a, this.f13733b, this.f13734c, 20);
        }
    }

    /* renamed from: a */
    public static e m13469a() {
        return new e();
    }

    /* renamed from: k5.h$b */
    public static final class b extends AbstractC7882b {

        /* renamed from: a */
        public final h f13674a;

        /* renamed from: b */
        public final d f13675b;

        /* renamed from: c */
        public final b f13676c = this;

        public b(h hVar, d dVar, Activity activity) {
            this.f13674a = hVar;
            this.f13675b = dVar;
        }

        @Override // p146k8.AbstractC7899a.a
        /* renamed from: a */
        public AbstractC7899a.c mo13472a() {
            return AbstractC7900b.m13522a(mo11612b(), new i(this.f13674a, this.f13675b));
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7317c
        /* renamed from: b */
        public Map mo11612b() {
            return C8724c.m14359a(C8725d.m14361b(21).m14363c(AbstractC9819f.f17355a, Boolean.valueOf(AbstractC9817d.m16404a())).m14363c(AbstractC9857e.f17424a, Boolean.valueOf(AbstractC9855c.m16513a())).m14363c(AbstractC7897f.f13770a, Boolean.valueOf(AbstractC7895d.m13516a())).m14363c(AbstractC9928d.f17740a, Boolean.valueOf(AbstractC9926b.m16756a())).m14363c(AbstractC8513e.f14121a, Boolean.valueOf(AbstractC8511c.m13986a())).m14363c(AbstractC9266b1.f16008a, Boolean.valueOf(AbstractC9316z0.m15543a())).m14363c(AbstractC9236t3.f15974a, Boolean.valueOf(AbstractC9226r3.m15522a())).m14363c(AbstractC10022o1.f18005a, Boolean.valueOf(AbstractC10016m1.m16858a())).m14363c(AbstractC7695n0.f13040a, Boolean.valueOf(AbstractC7691l0.m12878a())).m14363c(AbstractC9866i.f17447a, Boolean.valueOf(AbstractC9864g.m16541a())).m14363c(AbstractC9575o.f16779a, Boolean.valueOf(AbstractC9573m.m15980a())).m14363c(AbstractC0027e.f68a, Boolean.valueOf(AbstractC0025c.m67a())).m14363c(AbstractC8565f.f14207a, Boolean.valueOf(AbstractC8563d.m14107a())).m14363c(AbstractC5160u.f2749a, Boolean.valueOf(AbstractC5158s.m2813a())).m14363c(AbstractC5139l.f2714a, Boolean.valueOf(AbstractC5137j.m2788a())).m14363c(AbstractC8720h.f14501a, Boolean.valueOf(AbstractC8718f.m14352a())).m14363c(AbstractC7304m.f11790a, Boolean.valueOf(AbstractC7302k.m11576a())).m14363c(AbstractC8856h.f15057a, Boolean.valueOf(AbstractC8854f.m14850a())).m14363c(AbstractC7369k.f11950a, Boolean.valueOf(AbstractC7367i.m11796a())).m14363c(AbstractC8898h.f15209a, Boolean.valueOf(AbstractC8896f.m15007a())).m14363c(AbstractC0032e.f77a, Boolean.valueOf(AbstractC0030c.m71a())).m14362a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC7317c
        /* renamed from: d */
        public InterfaceC7818d mo11613d() {
            return new i(this.f13674a, this.f13675b);
        }

        @Override // p159l8.C8521f.a
        /* renamed from: e */
        public InterfaceC7817c mo13474e() {
            return new f(this.f13674a, this.f13675b, this.f13676c);
        }

        @Override // p233s5.InterfaceC9172h
        /* renamed from: c */
        public void mo13473c(MainActivity mainActivity) {
        }
    }

    /* renamed from: k5.h$g */
    public static final class g extends AbstractC7884d {

        /* renamed from: a */
        public final h f13690a;

        /* renamed from: b */
        public final d f13691b;

        /* renamed from: c */
        public final b f13692c;

        /* renamed from: d */
        public final g f13693d = this;

        public g(h hVar, d dVar, b bVar, Fragment fragment) {
            this.f13690a = hVar;
            this.f13691b = dVar;
            this.f13692c = bVar;
        }

        @Override // p146k8.AbstractC7899a.b
        /* renamed from: a */
        public AbstractC7899a.c mo13484a() {
            return this.f13692c.mo13472a();
        }

        @Override // p255u5.InterfaceC9560l
        /* renamed from: b */
        public void mo13485b(DatePickerFragment datePickerFragment) {
        }

        @Override // p233s5.InterfaceC9216p3
        /* renamed from: c */
        public void mo13486c(MainFragment mainFragment) {
        }

        @Override // p244t5.InterfaceC9404j0
        /* renamed from: d */
        public void mo13487d(WhiteBoardDialogFragment whiteBoardDialogFragment) {
        }
    }
}
