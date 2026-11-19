package com.zykj.study;

import android.app.Activity;
import androidx.datastore.core.DataStore;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.image.ImageCropFragment;
import com.zykj.image.ImagePickFragment;
import com.zykj.image.QRCodeFragment;
import com.zykj.lib.login.p062ui.main.LoginViewModel;
import com.zykj.lib.login.p062ui.student.StudentLoginFragment;
import com.zykj.lib.login.p062ui.teacher.TeacherLoginFragment;
import com.zykj.lib.login.p062ui.teacher.TeacherLoginViewModel;
import com.zykj.lib.login.p062ui.teacher.pwd.ChangePsdViewModel;
import com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdDialog;
import com.zykj.lib.login.p062ui.teacher.pwd.ChangePwdViewModel;
import com.zykj.lib.login.p062ui.teacher.pwd.ComposeModifyPasswordDialog;
import com.zykj.lib.login.p062ui.teacher.sms.SendSmsDialog;
import com.zykj.lib.login.p062ui.teacher.sms.SendSmsViewModel;
import com.zykj.lib.ota.CheckVersionProgressDialog;
import com.zykj.lib.ota.DownloadProgressDialog;
import com.zykj.lib.ota.LatestVersionDialog;
import com.zykj.lib.ota.UpdateChoiceDialog;
import com.zykj.lib.ota.viewmodel.VersionViewModel;
import com.zykj.study.bean.ClientCodeLiveData;
import com.zykj.study.bean.DataStoreManager;
import com.zykj.study.data.AppDatabase;
import com.zykj.study.data.GradeEntityDao;
import com.zykj.study.data.PdfDao;
import com.zykj.study.data.PeriodEntityDao;
import com.zykj.study.data.SearchHistoryEntityDao;
import com.zykj.study.data.SubjectEntityDao;
import com.zykj.study.dialog.CatalogDialog;
import com.zykj.study.dialog.ShowBigImageDialog;
import com.zykj.study.dialog.UpdateChoiceDialogMain;
import com.zykj.study.p065ui.GuideFragment;
import com.zykj.study.p065ui.ImageFragment;
import com.zykj.study.p065ui.MainActivity;
import com.zykj.study.p065ui.MainFragment;
import com.zykj.study.p065ui.OpenFileFragment;
import com.zykj.study.p065ui.PdfFragment;
import com.zykj.study.p065ui.home.HomeFragment;
import com.zykj.study.p065ui.home.exercise.ExerciseFragment;
import com.zykj.study.p065ui.home.exercise.ExerciseHistoryFragment;
import com.zykj.study.p065ui.home.exercise.ExerciseHistoryStudentFragment;
import com.zykj.study.p065ui.home.exercise.ExerciseTrainFragment;
import com.zykj.study.p065ui.home.exercise.ExerciseViewerFragment;
import com.zykj.study.p065ui.home.exercise.MicroCropExtraFragment;
import com.zykj.study.p065ui.home.exercise.MicroEditFragment;
import com.zykj.study.p065ui.home.exercise.train.AnswerAreaFragment;
import com.zykj.study.p065ui.home.exercise.train.AnswerFragment;
import com.zykj.study.p065ui.home.exercise.train.AnswerResultFragment;
import com.zykj.study.p065ui.home.exercise.train.MicroPlayDialogFragment;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceFragment;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultFailFragment;
import com.zykj.study.p065ui.home.exercise.train.MultipleChoiceResultSuccessFragment;
import com.zykj.study.p065ui.home.exercise.train.SingleChoiceFragment;
import com.zykj.study.p065ui.home.exercise.train.SingleChoiceResultFailFragment;
import com.zykj.study.p065ui.home.exercise.train.SingleChoiceResultSuccessFragment;
import com.zykj.study.p065ui.home.find.CourseDetailsFragment;
import com.zykj.study.p065ui.home.find.CourseFragment;
import com.zykj.study.p065ui.home.find.FindFragment;
import com.zykj.study.p065ui.home.find.MicroCodeFragment;
import com.zykj.study.p065ui.home.find.MicroPlayFragment;
import com.zykj.study.p065ui.home.find.search.SearchFragment;
import com.zykj.study.p065ui.home.find.search.SearchHistoryFragment;
import com.zykj.study.p065ui.home.find.search.SearchResultFragment;
import com.zykj.study.p065ui.home.message.MessageFragment;
import com.zykj.study.p065ui.home.p066my.AuthorizedLessonFragment;
import com.zykj.study.p065ui.home.p066my.CourseContentFragment;
import com.zykj.study.p065ui.home.p066my.CourseManageDialogFragment;
import com.zykj.study.p065ui.home.p066my.CourseViewCatalogFragment;
import com.zykj.study.p065ui.home.p066my.CourseViewFragment;
import com.zykj.study.p065ui.home.p066my.CourseViewStatisticsFragment;
import com.zykj.study.p065ui.home.p066my.EditCourseFragment;
import com.zykj.study.p065ui.home.p066my.EditUserFragment;
import com.zykj.study.p065ui.home.p066my.ExerciseStatisticsFragment;
import com.zykj.study.p065ui.home.p066my.ExerciseStatisticsResultFragment;
import com.zykj.study.p065ui.home.p066my.ManagementSubscribeFragment;
import com.zykj.study.p065ui.home.p066my.MyCourseDetailsFragment;
import com.zykj.study.p065ui.home.p066my.MyCourseFragment;
import com.zykj.study.p065ui.home.p066my.MyFragment;
import com.zykj.study.p065ui.home.p066my.SettingFragment;
import com.zykj.study.p065ui.home.p066my.StudentExercisesFragment;
import com.zykj.study.p065ui.home.p066my.StudentViewContentFragment;
import com.zykj.study.p065ui.home.p066my.StudentViewFragment;
import com.zykj.study.p065ui.home.p066my.StudentViewMemberFragment;
import com.zykj.study.p065ui.home.p066my.TeachCourseAddFragment;
import com.zykj.study.p065ui.home.p066my.TeachDetailsFragment;
import com.zykj.study.p065ui.home.p066my.TeacherFragment;
import com.zykj.study.p065ui.home.study.StudyFragment;
import com.zykj.study.p065ui.home.study.StudyListFragment;
import com.zykj.study.p065ui.home.study.StudyProgressFragment;
import com.zykj.study.provide.AccountRepositoryImp;
import com.zykj.study.provide.ClientCodeInterceptor;
import com.zykj.study.provide.GlobalObjectProvide;
import com.zykj.study.provide.ResponseRefreshTokenInterceptor;
import com.zykj.study.repository.CourseRepository;
import com.zykj.study.repository.DictRepository;
import com.zykj.study.repository.ExerciseRepository;
import com.zykj.study.repository.QuickCodeRepository;
import com.zykj.study.repository.SearchHistoryRepository;
import com.zykj.study.repository.SubscribeRepository;
import com.zykj.study.repository.TeachCourseRepository;
import com.zykj.study.viewmodels.AnswerAreaViewModel;
import com.zykj.study.viewmodels.AuthorizedLessonViewModel;
import com.zykj.study.viewmodels.CatalogViewModel;
import com.zykj.study.viewmodels.CourseContentViewModel;
import com.zykj.study.viewmodels.CourseDetailsViewModel;
import com.zykj.study.viewmodels.CourseManageVewModel;
import com.zykj.study.viewmodels.CourseViewModel;
import com.zykj.study.viewmodels.CourseViewViewModel;
import com.zykj.study.viewmodels.DictViewModel;
import com.zykj.study.viewmodels.EditCourseViewModel;
import com.zykj.study.viewmodels.ExerciseHistoryViewModel;
import com.zykj.study.viewmodels.ExerciseStatisticsViewModel;
import com.zykj.study.viewmodels.ExerciseStudentHistoryViewModel;
import com.zykj.study.viewmodels.ExerciseTrainViewModel;
import com.zykj.study.viewmodels.ExerciseViewModel;
import com.zykj.study.viewmodels.ExerciseViewerViewModel;
import com.zykj.study.viewmodels.HomeViewModel;
import com.zykj.study.viewmodels.MainViewModel;
import com.zykj.study.viewmodels.ManagementSubscribeViewModel;
import com.zykj.study.viewmodels.MicroCodeViewModel;
import com.zykj.study.viewmodels.MicroEditViewModel;
import com.zykj.study.viewmodels.MicroExtraViewModel;
import com.zykj.study.viewmodels.MyCourseDetailsViewModel;
import com.zykj.study.viewmodels.MyCourseViewModel;
import com.zykj.study.viewmodels.MyTeachCourseViewModel;
import com.zykj.study.viewmodels.NotifyDataChangedViewModel;
import com.zykj.study.viewmodels.OssTokenViewModel;
import com.zykj.study.viewmodels.PDFViewModel;
import com.zykj.study.viewmodels.SearchViewModel;
import com.zykj.study.viewmodels.SettingViewModel;
import com.zykj.study.viewmodels.StudentExercisesViewModel;
import com.zykj.study.viewmodels.StudentViewContentViewModel;
import com.zykj.study.viewmodels.StudentViewViewModel;
import com.zykj.study.viewmodels.StudyViewModel;
import com.zykj.study.viewmodels.TeachDetailsViewModel;
import com.zykj.study.viewmodels.TrainAnswerMicroViewModel;
import com.zykj.study.viewmodels.TrainMultipleChoiceViewModel;
import com.zykj.study.viewmodels.TrainSingleChoiceViewModel;
import com.zykj.study.viewmodels.WebViewControlViewModel;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import p025b5.AbstractC5138p;
import p037c6.InterfaceC5270a;
import p037c6.InterfaceC5272c;
import p110g5.AbstractC8528a;
import p110g5.AbstractC8530a1;
import p110g5.AbstractC8531a2;
import p110g5.AbstractC8533b;
import p110g5.AbstractC8534b0;
import p110g5.AbstractC8535b1;
import p110g5.AbstractC8536b2;
import p110g5.AbstractC8537b3;
import p110g5.AbstractC8538c;
import p110g5.AbstractC8539c0;
import p110g5.AbstractC8540c1;
import p110g5.AbstractC8541c2;
import p110g5.AbstractC8542c3;
import p110g5.AbstractC8543d;
import p110g5.AbstractC8544d0;
import p110g5.AbstractC8545d1;
import p110g5.AbstractC8546d2;
import p110g5.AbstractC8547d3;
import p110g5.AbstractC8548e;
import p110g5.AbstractC8549e0;
import p110g5.AbstractC8550e1;
import p110g5.AbstractC8551e2;
import p110g5.AbstractC8552e3;
import p110g5.AbstractC8553f;
import p110g5.AbstractC8554f0;
import p110g5.AbstractC8555f1;
import p110g5.AbstractC8556f2;
import p110g5.AbstractC8557f3;
import p110g5.AbstractC8558g;
import p110g5.AbstractC8559g0;
import p110g5.AbstractC8560g1;
import p110g5.AbstractC8561g2;
import p110g5.AbstractC8562g3;
import p110g5.AbstractC8563h;
import p110g5.AbstractC8564h0;
import p110g5.AbstractC8565h1;
import p110g5.AbstractC8566h2;
import p110g5.AbstractC8567h3;
import p110g5.AbstractC8568i;
import p110g5.AbstractC8569i0;
import p110g5.AbstractC8570i1;
import p110g5.AbstractC8571i2;
import p110g5.AbstractC8572i3;
import p110g5.AbstractC8573j;
import p110g5.AbstractC8574j0;
import p110g5.AbstractC8575j1;
import p110g5.AbstractC8576j2;
import p110g5.AbstractC8577j3;
import p110g5.AbstractC8578k;
import p110g5.AbstractC8579k0;
import p110g5.AbstractC8580k1;
import p110g5.AbstractC8582k3;
import p110g5.AbstractC8583l;
import p110g5.AbstractC8584l0;
import p110g5.AbstractC8585l1;
import p110g5.AbstractC8586l2;
import p110g5.AbstractC8587l3;
import p110g5.AbstractC8588m;
import p110g5.AbstractC8589m0;
import p110g5.AbstractC8590m1;
import p110g5.AbstractC8591m2;
import p110g5.AbstractC8592m3;
import p110g5.AbstractC8593n;
import p110g5.AbstractC8594n0;
import p110g5.AbstractC8595n1;
import p110g5.AbstractC8596n2;
import p110g5.AbstractC8597n3;
import p110g5.AbstractC8598o;
import p110g5.AbstractC8599o0;
import p110g5.AbstractC8600o1;
import p110g5.AbstractC8601o2;
import p110g5.AbstractC8602o3;
import p110g5.AbstractC8603p;
import p110g5.AbstractC8604p0;
import p110g5.AbstractC8605p1;
import p110g5.AbstractC8606p2;
import p110g5.AbstractC8607p3;
import p110g5.AbstractC8608q;
import p110g5.AbstractC8610q1;
import p110g5.AbstractC8611q2;
import p110g5.AbstractC8612q3;
import p110g5.AbstractC8613r;
import p110g5.AbstractC8614r0;
import p110g5.AbstractC8615r1;
import p110g5.AbstractC8616r2;
import p110g5.AbstractC8617r3;
import p110g5.AbstractC8618s;
import p110g5.AbstractC8619s0;
import p110g5.AbstractC8620s1;
import p110g5.AbstractC8621s2;
import p110g5.AbstractC8622s3;
import p110g5.AbstractC8623t;
import p110g5.AbstractC8624t0;
import p110g5.AbstractC8625t1;
import p110g5.AbstractC8626t2;
import p110g5.AbstractC8627u;
import p110g5.AbstractC8628u0;
import p110g5.AbstractC8629u1;
import p110g5.AbstractC8630u2;
import p110g5.AbstractC8631v;
import p110g5.AbstractC8632v0;
import p110g5.AbstractC8633v1;
import p110g5.AbstractC8634v2;
import p110g5.AbstractC8635w;
import p110g5.AbstractC8636w0;
import p110g5.AbstractC8637w1;
import p110g5.AbstractC8638w2;
import p110g5.AbstractC8639x;
import p110g5.AbstractC8640x0;
import p110g5.AbstractC8641x1;
import p110g5.AbstractC8642x2;
import p110g5.AbstractC8644y0;
import p110g5.AbstractC8645y1;
import p110g5.AbstractC8646y2;
import p110g5.AbstractC8648z0;
import p110g5.AbstractC8649z1;
import p110g5.AbstractC8650z2;
import p111g6.InterfaceC8651a;
import p111g6.InterfaceC8652b;
import p111g6.InterfaceC8653c;
import p111g6.InterfaceC8654d;
import p119h3.AbstractC8710a;
import p119h3.AbstractC8711b;
import p122h6.AbstractC8717a;
import p122h6.AbstractC8718b;
import p130i3.AbstractC8756a;
import p133i6.AbstractC8761c;
import p133i6.C8765g;
import p136i9.C8897a0;
import p144j6.AbstractC9023b;
import p144j6.C9022a;
import p167l6.AbstractC9257e;
import p167l6.C9254b;
import p167l6.C9255c;
import p167l6.C9256d;
import p167l6.InterfaceC9258f;
import p169l8.InterfaceC9270g;
import p169l8.InterfaceC9271h;
import p175m3.AbstractC9298b;
import p175m3.AbstractC9299c;
import p176m4.AbstractC9303d;
import p176m4.AbstractC9304e;
import p176m4.AbstractC9305f;
import p176m4.AbstractC9306g;
import p176m4.AbstractC9307h;
import p176m4.AbstractC9308i;
import p186n3.AbstractC9366a;
import p186n3.AbstractC9367b;
import p186n3.AbstractC9368c;
import p198o4.InterfaceC9518a;
import p198o4.InterfaceC9519b;
import p198o4.InterfaceC9520c;
import p198o4.InterfaceC9521d;
import p198o4.InterfaceC9522e;
import p198o4.InterfaceC9523f;
import p198o4.InterfaceC9524g;
import p198o4.InterfaceC9525h;
import p198o4.InterfaceC9526i;
import p198o4.InterfaceC9527j;
import p198o4.InterfaceC9528k;
import p208p3.AbstractC9646d;
import p208p3.AbstractC9647e;
import p208p3.AbstractC9648f;
import p208p3.InterfaceC9643a;
import p219q3.AbstractC9790j;
import p219q3.AbstractC9791k;
import p219q3.AbstractC9792l;
import p219q3.AbstractC9795o;
import p219q3.AbstractC9796p;
import p219q3.AbstractC9797q;
import p230r3.AbstractC9909d;
import p230r3.AbstractC9910e;
import p230r3.AbstractC9911f;
import p242s4.AbstractC10000m;
import p242s4.AbstractC10001n;
import p242s4.AbstractC10003p;
import p242s4.AbstractC10004q;
import p242s4.AbstractC10005r;
import p242s4.AbstractC10006s;
import p242s4.AbstractC10007t;
import p242s4.AbstractC10008u;
import p242s4.AbstractC10009v;
import p242s4.AbstractC10011x;
import p242s4.AbstractC10012y;
import p242s4.AbstractC10013z;
import p242s4.AbstractC9982a0;
import p242s4.AbstractC9983b;
import p242s4.AbstractC9984b0;
import p242s4.AbstractC9985c;
import p242s4.AbstractC9986c0;
import p242s4.AbstractC9987d;
import p242s4.AbstractC9988d0;
import p242s4.AbstractC9989e;
import p242s4.AbstractC9990e0;
import p242s4.AbstractC9991f;
import p242s4.AbstractC9992f0;
import p242s4.AbstractC9993g;
import p242s4.AbstractC9994g0;
import p242s4.AbstractC9995h;
import p242s4.AbstractC9996i;
import p242s4.AbstractC9997j;
import p242s4.AbstractC9998k;
import p242s4.AbstractC9999l;
import p242s4.C10002o;
import p253t4.C10092a;
import p253t4.C10098g;
import p253t4.C10102k;
import p263u3.AbstractC10169b;
import p264u4.AbstractC10178i;
import p274v3.AbstractC10241a;
import p285w3.AbstractC10274a;
import p285w3.AbstractC10275b;
import p285w3.AbstractC10276c;

/* renamed from: com.zykj.study.a */
/* loaded from: classes4.dex */
public abstract class AbstractC7598a {

    /* renamed from: com.zykj.study.a$a */
    public static final class a implements InterfaceC8651a {

        /* renamed from: a */
        public final h f10713a;

        /* renamed from: b */
        public final d f10714b;

        /* renamed from: c */
        public Activity f10715c;

        @Override // p111g6.InterfaceC8651a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo9802a(Activity activity) {
            this.f10715c = (Activity) AbstractC9257e.m16972b(activity);
            return this;
        }

        @Override // p111g6.InterfaceC8651a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC9303d build() {
            AbstractC9257e.m16971a(this.f10715c, Activity.class);
            return new b(this.f10713a, this.f10714b, this.f10715c);
        }

        public a(h hVar, d dVar) {
            this.f10713a = hVar;
            this.f10714b = dVar;
        }
    }

    /* renamed from: com.zykj.study.a$b */
    public static final class b extends AbstractC9303d {

        /* renamed from: a */
        public final h f10716a;

        /* renamed from: b */
        public final d f10717b;

        /* renamed from: c */
        public final b f10718c = this;

        public b(h hVar, d dVar, Activity activity) {
            this.f10716a = hVar;
            this.f10717b = dVar;
        }

        @Override // p122h6.AbstractC8717a.a
        /* renamed from: a */
        public AbstractC8717a.c mo9805a() {
            return AbstractC8718b.m14226a(mo9807c(), new i(this.f10716a, this.f10717b));
        }

        @Override // p264u4.InterfaceC10177h
        /* renamed from: b */
        public void mo9806b(MainActivity mainActivity) {
            m9810f(mainActivity);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC8332c
        /* renamed from: c */
        public Map mo9807c() {
            return C9255c.m16966a(C9256d.m16968b(45).m16970c(AbstractC8538c.f16113a, Boolean.valueOf(AbstractC8528a.m13893a())).m16970c(AbstractC8553f.f16123a, Boolean.valueOf(AbstractC8543d.m13898a())).m16970c(AbstractC8568i.f16133a, Boolean.valueOf(AbstractC8558g.m13903a())).m16970c(AbstractC9792l.f19582a, Boolean.valueOf(AbstractC9790j.m18341a())).m16970c(AbstractC9797q.f19593a, Boolean.valueOf(AbstractC9795o.m18352a())).m16970c(AbstractC8583l.f16144a, Boolean.valueOf(AbstractC8573j.m13908a())).m16970c(AbstractC8598o.f16154a, Boolean.valueOf(AbstractC8588m.m13914a())).m16970c(AbstractC8613r.f16165a, Boolean.valueOf(AbstractC8603p.m13919a())).m16970c(AbstractC8627u.f16175a, Boolean.valueOf(AbstractC8618s.m13924a())).m16970c(AbstractC8639x.f16183a, Boolean.valueOf(AbstractC8631v.m13928a())).m16970c(AbstractC8544d0.f16118a, Boolean.valueOf(AbstractC8534b0.m13895a())).m16970c(AbstractC8559g0.f16128a, Boolean.valueOf(AbstractC8549e0.m13900a())).m16970c(AbstractC8574j0.f16138a, Boolean.valueOf(AbstractC8564h0.m13905a())).m16970c(AbstractC8589m0.f16148a, Boolean.valueOf(AbstractC8579k0.m13910a())).m16970c(AbstractC8604p0.f16158a, Boolean.valueOf(AbstractC8594n0.m13916a())).m16970c(AbstractC8624t0.f16172a, Boolean.valueOf(AbstractC8614r0.m13922a())).m16970c(AbstractC8636w0.f16180a, Boolean.valueOf(AbstractC8628u0.m13926a())).m16970c(AbstractC8648z0.f16189a, Boolean.valueOf(AbstractC8640x0.m13930a())).m16970c(AbstractC8540c1.f16115a, Boolean.valueOf(AbstractC8530a1.m13894a())).m16970c(AbstractC9368c.f18502a, Boolean.valueOf(AbstractC9366a.m17253a())).m16970c(AbstractC8555f1.f16125a, Boolean.valueOf(AbstractC8545d1.m13899a())).m16970c(AbstractC8570i1.f16135a, Boolean.valueOf(AbstractC8560g1.m13904a())).m16970c(AbstractC8585l1.f16146a, Boolean.valueOf(AbstractC8575j1.m13909a())).m16970c(AbstractC8600o1.f16156a, Boolean.valueOf(AbstractC8590m1.m13915a())).m16970c(AbstractC8615r1.f16166a, Boolean.valueOf(AbstractC8605p1.m13920a())).m16970c(AbstractC8629u1.f16176a, Boolean.valueOf(AbstractC8620s1.m13925a())).m16970c(AbstractC8641x1.f16184a, Boolean.valueOf(AbstractC8633v1.m13929a())).m16970c(AbstractC8531a2.f16110a, Boolean.valueOf(AbstractC8645y1.m13932a())).m16970c(AbstractC8546d2.f16119a, Boolean.valueOf(AbstractC8536b2.m13896a())).m16970c(AbstractC8561g2.f16129a, Boolean.valueOf(AbstractC8551e2.m13901a())).m16970c(AbstractC8576j2.f16139a, Boolean.valueOf(AbstractC8566h2.m13906a())).m16970c(AbstractC8596n2.f16153a, Boolean.valueOf(AbstractC8586l2.m13913a())).m16970c(AbstractC9911f.f19868a, Boolean.valueOf(AbstractC9909d.m18550a())).m16970c(AbstractC8611q2.f16164a, Boolean.valueOf(AbstractC8601o2.m13918a())).m16970c(AbstractC8626t2.f16174a, Boolean.valueOf(AbstractC8616r2.m13923a())).m16970c(AbstractC8638w2.f16182a, Boolean.valueOf(AbstractC8630u2.m13927a())).m16970c(AbstractC8650z2.f16191a, Boolean.valueOf(AbstractC8642x2.m13931a())).m16970c(AbstractC8547d3.f16120a, Boolean.valueOf(AbstractC8537b3.m13897a())).m16970c(AbstractC8562g3.f16130a, Boolean.valueOf(AbstractC8552e3.m13902a())).m16970c(AbstractC9648f.f19336a, Boolean.valueOf(AbstractC9646d.m18234a())).m16970c(AbstractC8577j3.f16140a, Boolean.valueOf(AbstractC8567h3.m13907a())).m16970c(AbstractC8592m3.f16150a, Boolean.valueOf(AbstractC8582k3.m13912a())).m16970c(AbstractC8607p3.f16160a, Boolean.valueOf(AbstractC8597n3.m13917a())).m16970c(AbstractC10276c.f20508a, Boolean.valueOf(AbstractC10274a.m19263a())).m16970c(AbstractC8622s3.f16170a, Boolean.valueOf(AbstractC8612q3.m13921a())).m16969a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC8332c
        /* renamed from: d */
        public InterfaceC8654d mo9808d() {
            return new i(this.f10716a, this.f10717b);
        }

        @Override // p133i6.C8764f.a
        /* renamed from: e */
        public InterfaceC8653c mo9809e() {
            return new f(this.f10716a, this.f10717b, this.f10718c);
        }

        /* renamed from: f */
        public final MainActivity m9810f(MainActivity mainActivity) {
            AbstractC10178i.m19041b(mainActivity, (InterfaceC9270g) this.f10716a.f10759f.get());
            AbstractC10178i.m19040a(mainActivity, (InterfaceC9270g) this.f10716a.f10760g.get());
            return mainActivity;
        }
    }

    /* renamed from: com.zykj.study.a$c */
    public static final class c implements InterfaceC8652b {

        /* renamed from: a */
        public final h f10719a;

        /* renamed from: b */
        public C8765g f10720b;

        @Override // p111g6.InterfaceC8652b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC9304e build() {
            AbstractC9257e.m16971a(this.f10720b, C8765g.class);
            return new d(this.f10719a, this.f10720b);
        }

        @Override // p111g6.InterfaceC8652b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo9811a(C8765g c8765g) {
            this.f10720b = (C8765g) AbstractC9257e.m16972b(c8765g);
            return this;
        }

        public c(h hVar) {
            this.f10719a = hVar;
        }
    }

    /* renamed from: com.zykj.study.a$d */
    public static final class d extends AbstractC9304e {

        /* renamed from: a */
        public final h f10721a;

        /* renamed from: b */
        public final d f10722b = this;

        /* renamed from: c */
        public InterfaceC9258f f10723c;

        /* renamed from: com.zykj.study.a$d$a */
        public static final class a implements InterfaceC9258f {

            /* renamed from: a */
            public final h f10724a;

            /* renamed from: b */
            public final d f10725b;

            /* renamed from: c */
            public final int f10726c;

            public a(h hVar, d dVar, int i10) {
                this.f10724a = hVar;
                this.f10725b = dVar;
                this.f10726c = i10;
            }

            @Override // javax.inject.Provider
            public Object get() {
                if (this.f10726c == 0) {
                    return AbstractC8761c.m14468a();
                }
                throw new AssertionError(this.f10726c);
            }
        }

        public d(h hVar, C8765g c8765g) {
            this.f10721a = hVar;
            m9816c(c8765g);
        }

        @Override // p133i6.C8759a.a
        /* renamed from: a */
        public InterfaceC8651a mo9814a() {
            return new a(this.f10721a, this.f10722b);
        }

        @Override // p133i6.C8760b.d
        /* renamed from: b */
        public InterfaceC5270a mo9815b() {
            return (InterfaceC5270a) this.f10723c.get();
        }

        /* renamed from: c */
        public final void m9816c(C8765g c8765g) {
            this.f10723c = C9254b.m16963b(new a(this.f10721a, this.f10722b, 0));
        }
    }

    /* renamed from: com.zykj.study.a$e */
    public static final class e {

        /* renamed from: a */
        public C9022a f10727a;

        /* renamed from: b */
        public C10002o f10728b;

        /* renamed from: c */
        public GlobalObjectProvide f10729c;

        /* renamed from: a */
        public e m9817a(C9022a c9022a) {
            this.f10727a = (C9022a) AbstractC9257e.m16972b(c9022a);
            return this;
        }

        /* renamed from: b */
        public AbstractC9306g m9818b() {
            AbstractC9257e.m16971a(this.f10727a, C9022a.class);
            if (this.f10728b == null) {
                this.f10728b = new C10002o();
            }
            if (this.f10729c == null) {
                this.f10729c = new GlobalObjectProvide();
            }
            return new h(this.f10727a, this.f10728b, this.f10729c);
        }

        public e() {
        }
    }

    /* renamed from: com.zykj.study.a$f */
    public static final class f implements InterfaceC8653c {

        /* renamed from: a */
        public final h f10730a;

        /* renamed from: b */
        public final d f10731b;

        /* renamed from: c */
        public final b f10732c;

        /* renamed from: d */
        public Fragment f10733d;

        @Override // p111g6.InterfaceC8653c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC9305f build() {
            AbstractC9257e.m16971a(this.f10733d, Fragment.class);
            return new g(this.f10730a, this.f10731b, this.f10732c, this.f10733d);
        }

        @Override // p111g6.InterfaceC8653c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f mo9819a(Fragment fragment) {
            this.f10733d = (Fragment) AbstractC9257e.m16972b(fragment);
            return this;
        }

        public f(h hVar, d dVar, b bVar) {
            this.f10730a = hVar;
            this.f10731b = dVar;
            this.f10732c = bVar;
        }
    }

    /* renamed from: com.zykj.study.a$g */
    public static final class g extends AbstractC9305f {

        /* renamed from: a */
        public final h f10734a;

        /* renamed from: b */
        public final d f10735b;

        /* renamed from: c */
        public final b f10736c;

        /* renamed from: d */
        public final g f10737d = this;

        public g(h hVar, d dVar, b bVar, Fragment fragment) {
            this.f10734a = hVar;
            this.f10735b = dVar;
            this.f10736c = bVar;
        }

        @Override // p208p3.InterfaceC9645c
        /* renamed from: A */
        public void mo9822A(TeacherLoginFragment teacherLoginFragment) {
        }

        @Override // p319z4.InterfaceC10720l
        /* renamed from: B */
        public void mo9823B(SearchResultFragment searchResultFragment) {
        }

        @Override // p297x4.InterfaceC10524n0
        /* renamed from: C */
        public void mo9824C(MultipleChoiceResultSuccessFragment multipleChoiceResultSuccessFragment) {
        }

        @Override // p286w4.InterfaceC10289e
        /* renamed from: D */
        public void mo9825D(ExerciseFragment exerciseFragment) {
        }

        @Override // p297x4.InterfaceC10517k
        /* renamed from: E */
        public void mo9826E(AnswerFragment answerFragment) {
        }

        @Override // p025b5.InterfaceC5105k1
        /* renamed from: F */
        public void mo2089F(ExerciseStatisticsResultFragment exerciseStatisticsResultFragment) {
        }

        @Override // p286w4.InterfaceC10294f1
        /* renamed from: G */
        public void mo9827G(MicroCropExtraFragment microCropExtraFragment) {
        }

        @Override // p286w4.InterfaceC10322p
        /* renamed from: H */
        public void mo9828H(ExerciseHistoryFragment exerciseHistoryFragment) {
        }

        @Override // p141j3.InterfaceC9012q
        /* renamed from: I */
        public void mo9829I(QRCodeFragment qRCodeFragment) {
        }

        @Override // p025b5.InterfaceC5045b4
        /* renamed from: J */
        public void mo2076J(StudentExercisesFragment studentExercisesFragment) {
        }

        @Override // p025b5.InterfaceC5084h1
        /* renamed from: K */
        public void mo2086K(ExerciseStatisticsFragment exerciseStatisticsFragment) {
        }

        @Override // p241s3.InterfaceC9980i
        /* renamed from: L */
        public void mo9830L(UpdateChoiceDialog updateChoiceDialog) {
        }

        @Override // p297x4.InterfaceC10530q0
        /* renamed from: M */
        public void mo9831M(SingleChoiceFragment singleChoiceFragment) {
        }

        @Override // p308y4.InterfaceC10646l0
        /* renamed from: N */
        public void mo9832N(MicroPlayFragment microPlayFragment) {
        }

        @Override // p025b5.InterfaceC5197y0
        /* renamed from: O */
        public void mo2102O(EditUserFragment editUserFragment) {
        }

        @Override // p025b5.InterfaceC5121m3
        /* renamed from: P */
        public void mo2090P(MyFragment myFragment) {
        }

        @Override // p264u4.InterfaceC10179j
        /* renamed from: Q */
        public void mo9833Q(MainFragment mainFragment) {
        }

        @Override // p025b5.InterfaceC5123m5
        /* renamed from: R */
        public void mo2091R(TeachDetailsFragment teachDetailsFragment) {
        }

        @Override // p297x4.InterfaceC10504d0
        /* renamed from: S */
        public void mo9834S(MultipleChoiceFragment multipleChoiceFragment) {
        }

        @Override // p241s3.InterfaceC9978g
        /* renamed from: T */
        public void mo9835T(LatestVersionDialog latestVersionDialog) {
        }

        @Override // p319z4.InterfaceC10713e
        /* renamed from: U */
        public void mo9836U(SearchFragment searchFragment) {
        }

        @Override // p264u4.InterfaceC10184o
        /* renamed from: V */
        public void mo9837V(OpenFileFragment openFileFragment) {
        }

        @Override // p297x4.InterfaceC10497a0
        /* renamed from: W */
        public void mo9838W(MicroPlayDialogFragment microPlayDialogFragment) {
        }

        @Override // p209p4.InterfaceC9669u
        /* renamed from: X */
        public void mo9839X(ShowBigImageDialog showBigImageDialog) {
        }

        @Override // p025b5.InterfaceC5129n4
        /* renamed from: Y */
        public void mo2093Y(StudentViewFragment studentViewFragment) {
        }

        @Override // p241s3.InterfaceC9975d
        /* renamed from: Z */
        public void mo9840Z(CheckVersionProgressDialog checkVersionProgressDialog) {
        }

        @Override // p122h6.AbstractC8717a.b
        /* renamed from: a */
        public AbstractC8717a.c mo9841a() {
            return this.f10736c.mo9805a();
        }

        @Override // p025b5.InterfaceC5086h3
        /* renamed from: a0 */
        public void mo2087a0(MyCourseFragment myCourseFragment) {
        }

        @Override // p025b5.InterfaceC5073f4
        /* renamed from: b */
        public void mo2082b(StudentViewContentFragment studentViewContentFragment) {
        }

        @Override // p074d5.InterfaceC8290a
        /* renamed from: b0 */
        public void mo9842b0(StudyFragment studyFragment) {
        }

        @Override // p297x4.InterfaceC10535t
        /* renamed from: c */
        public void mo9843c(AnswerResultFragment answerResultFragment) {
        }

        @Override // p219q3.InterfaceC9800t
        /* renamed from: c0 */
        public void mo9844c0(ComposeModifyPasswordDialog composeModifyPasswordDialog) {
        }

        @Override // p025b5.InterfaceC5125n0
        /* renamed from: d */
        public void mo2092d(CourseViewStatisticsFragment courseViewStatisticsFragment) {
        }

        @Override // p286w4.InterfaceC10279a1
        /* renamed from: d0 */
        public void mo9845d0(ExerciseViewerFragment exerciseViewerFragment) {
        }

        @Override // p025b5.InterfaceC5051c3
        /* renamed from: e */
        public void mo2078e(MyCourseDetailsFragment myCourseDetailsFragment) {
        }

        @Override // p264u4.InterfaceC10185p
        /* renamed from: e0 */
        public void mo9846e0(PdfFragment pdfFragment) {
        }

        @Override // p025b5.InterfaceC5131o
        /* renamed from: f */
        public void mo2094f(CourseContentFragment courseContentFragment) {
            m9869v0(courseContentFragment);
        }

        @Override // p286w4.InterfaceC10343x
        /* renamed from: f0 */
        public void mo9847f0(ExerciseHistoryStudentFragment exerciseHistoryStudentFragment) {
        }

        @Override // p074d5.InterfaceC8294e
        /* renamed from: g */
        public void mo9848g(StudyListFragment studyListFragment) {
        }

        @Override // p230r3.InterfaceC9908c
        /* renamed from: g0 */
        public void mo9849g0(SendSmsDialog sendSmsDialog) {
        }

        @Override // p209p4.InterfaceC9652d
        /* renamed from: h */
        public void mo9850h(CatalogDialog catalogDialog) {
        }

        @Override // p308y4.InterfaceC10654t
        /* renamed from: h0 */
        public void mo9851h0(FindFragment findFragment) {
        }

        @Override // p025b5.InterfaceC5191x0
        /* renamed from: i */
        public void mo2101i(EditCourseFragment editCourseFragment) {
        }

        @Override // p275v4.InterfaceC10245d
        /* renamed from: i0 */
        public void mo9852i0(HomeFragment homeFragment) {
        }

        @Override // p286w4.InterfaceC10308k0
        /* renamed from: j */
        public void mo9853j(ExerciseTrainFragment exerciseTrainFragment) {
        }

        @Override // p308y4.InterfaceC10660z
        /* renamed from: j0 */
        public void mo9854j0(MicroCodeFragment microCodeFragment) {
        }

        @Override // p308y4.InterfaceC10643k
        /* renamed from: k */
        public void mo9855k(CourseDetailsFragment courseDetailsFragment) {
        }

        @Override // p025b5.InterfaceC5048c0
        /* renamed from: k0 */
        public void mo2077k0(CourseViewCatalogFragment courseViewCatalogFragment) {
        }

        @Override // p308y4.InterfaceC10648n
        /* renamed from: l */
        public void mo9856l(CourseFragment courseFragment) {
        }

        @Override // p264u4.InterfaceC10170a
        /* renamed from: l0 */
        public void mo9857l0(GuideFragment guideFragment) {
        }

        @Override // p006a5.InterfaceC0026a
        /* renamed from: m */
        public void mo61m(MessageFragment messageFragment) {
        }

        @Override // p297x4.InterfaceC10538u0
        /* renamed from: m0 */
        public void mo9858m0(SingleChoiceResultFailFragment singleChoiceResultFailFragment) {
        }

        @Override // p319z4.InterfaceC10716h
        /* renamed from: n */
        public void mo9859n(SearchHistoryFragment searchHistoryFragment) {
        }

        @Override // p025b5.InterfaceC5074f5
        /* renamed from: n0 */
        public void mo2083n0(TeachCourseAddFragment teachCourseAddFragment) {
        }

        @Override // p209p4.InterfaceC9672x
        /* renamed from: o */
        public void mo9860o(UpdateChoiceDialogMain updateChoiceDialogMain) {
        }

        @Override // p025b5.InterfaceC5163s3
        /* renamed from: o0 */
        public void mo2097o0(SettingFragment settingFragment) {
        }

        @Override // p197o3.InterfaceC9517c
        /* renamed from: p */
        public void mo9861p(StudentLoginFragment studentLoginFragment) {
        }

        @Override // p141j3.InterfaceC9001f
        /* renamed from: p0 */
        public void mo9862p0(ImageCropFragment imageCropFragment) {
        }

        @Override // p141j3.InterfaceC9008m
        /* renamed from: q */
        public void mo9863q(ImagePickFragment imagePickFragment) {
        }

        @Override // p025b5.InterfaceC5165s5
        /* renamed from: q0 */
        public void mo2098q0(TeacherFragment teacherFragment) {
        }

        @Override // p025b5.InterfaceC5083h0
        /* renamed from: r */
        public void mo2085r(CourseViewFragment courseViewFragment) {
        }

        @Override // p025b5.InterfaceC5082h
        /* renamed from: r0 */
        public void mo2084r0(AuthorizedLessonFragment authorizedLessonFragment) {
        }

        @Override // p219q3.InterfaceC9793m
        /* renamed from: s */
        public void mo9864s(ChangePwdDialog changePwdDialog) {
        }

        @Override // p286w4.InterfaceC10336t1
        /* renamed from: s0 */
        public void mo9865s0(MicroEditFragment microEditFragment) {
        }

        @Override // p025b5.InterfaceC5057d2
        /* renamed from: t */
        public void mo2079t(ManagementSubscribeFragment managementSubscribeFragment) {
        }

        @Override // p297x4.InterfaceC10498a1
        /* renamed from: t0 */
        public void mo9866t0(SingleChoiceResultSuccessFragment singleChoiceResultSuccessFragment) {
        }

        @Override // p264u4.InterfaceC10171b
        /* renamed from: u */
        public void mo9867u(ImageFragment imageFragment) {
        }

        @Override // p025b5.InterfaceC5178v
        /* renamed from: u0 */
        public void mo2099u0(CourseManageDialogFragment courseManageDialogFragment) {
        }

        @Override // p297x4.InterfaceC10501c
        /* renamed from: v */
        public void mo9868v(AnswerAreaFragment answerAreaFragment) {
        }

        /* renamed from: v0 */
        public final CourseContentFragment m9869v0(CourseContentFragment courseContentFragment) {
            AbstractC5138p.m2096a(courseContentFragment, (InterfaceC9270g) this.f10734a.f10760g.get());
            return courseContentFragment;
        }

        @Override // p241s3.InterfaceC9976e
        /* renamed from: w */
        public void mo9870w(DownloadProgressDialog downloadProgressDialog) {
        }

        @Override // p025b5.InterfaceC5039a5
        /* renamed from: x */
        public void mo2075x(StudentViewMemberFragment studentViewMemberFragment) {
        }

        @Override // p297x4.InterfaceC10512h0
        /* renamed from: y */
        public void mo9871y(MultipleChoiceResultFailFragment multipleChoiceResultFailFragment) {
        }

        @Override // p074d5.InterfaceC8305p
        /* renamed from: z */
        public void mo9872z(StudyProgressFragment studyProgressFragment) {
        }
    }

    /* renamed from: com.zykj.study.a$h */
    public static final class h extends AbstractC9306g {

        /* renamed from: A */
        public InterfaceC9258f f10738A;

        /* renamed from: B */
        public InterfaceC9258f f10739B;

        /* renamed from: C */
        public InterfaceC9258f f10740C;

        /* renamed from: D */
        public InterfaceC9258f f10741D;

        /* renamed from: E */
        public InterfaceC9258f f10742E;

        /* renamed from: F */
        public InterfaceC9258f f10743F;

        /* renamed from: G */
        public InterfaceC9258f f10744G;

        /* renamed from: H */
        public InterfaceC9258f f10745H;

        /* renamed from: I */
        public InterfaceC9258f f10746I;

        /* renamed from: J */
        public InterfaceC9258f f10747J;

        /* renamed from: K */
        public InterfaceC9258f f10748K;

        /* renamed from: L */
        public InterfaceC9258f f10749L;

        /* renamed from: M */
        public InterfaceC9258f f10750M;

        /* renamed from: N */
        public InterfaceC9258f f10751N;

        /* renamed from: O */
        public InterfaceC9258f f10752O;

        /* renamed from: P */
        public InterfaceC9258f f10753P;

        /* renamed from: a */
        public final C9022a f10754a;

        /* renamed from: b */
        public final C10002o f10755b;

        /* renamed from: c */
        public final GlobalObjectProvide f10756c;

        /* renamed from: d */
        public final h f10757d = this;

        /* renamed from: e */
        public InterfaceC9258f f10758e;

        /* renamed from: f */
        public InterfaceC9258f f10759f;

        /* renamed from: g */
        public InterfaceC9258f f10760g;

        /* renamed from: h */
        public InterfaceC9258f f10761h;

        /* renamed from: i */
        public InterfaceC9258f f10762i;

        /* renamed from: j */
        public InterfaceC9258f f10763j;

        /* renamed from: k */
        public InterfaceC9258f f10764k;

        /* renamed from: l */
        public InterfaceC9258f f10765l;

        /* renamed from: m */
        public InterfaceC9258f f10766m;

        /* renamed from: n */
        public InterfaceC9258f f10767n;

        /* renamed from: o */
        public InterfaceC9258f f10768o;

        /* renamed from: p */
        public InterfaceC9258f f10769p;

        /* renamed from: q */
        public InterfaceC9258f f10770q;

        /* renamed from: r */
        public InterfaceC9258f f10771r;

        /* renamed from: s */
        public InterfaceC9258f f10772s;

        /* renamed from: t */
        public InterfaceC9258f f10773t;

        /* renamed from: u */
        public InterfaceC9258f f10774u;

        /* renamed from: v */
        public InterfaceC9258f f10775v;

        /* renamed from: w */
        public InterfaceC9258f f10776w;

        /* renamed from: x */
        public InterfaceC9258f f10777x;

        /* renamed from: y */
        public InterfaceC9258f f10778y;

        /* renamed from: z */
        public InterfaceC9258f f10779z;

        /* renamed from: com.zykj.study.a$h$a */
        public static final class a implements InterfaceC9258f {

            /* renamed from: a */
            public final h f10780a;

            /* renamed from: b */
            public final int f10781b;

            public a(h hVar, int i10) {
                this.f10780a = hVar;
                this.f10781b = i10;
            }

            @Override // javax.inject.Provider
            public Object get() {
                switch (this.f10781b) {
                    case 0:
                        return AbstractC10012y.m18709a();
                    case 1:
                        return AbstractC9994g0.m18684a();
                    case 2:
                        return AbstractC9990e0.m18680a();
                    case 3:
                        return new C10092a((InterfaceC9519b) this.f10780a.f10765l.get());
                    case 4:
                        return AbstractC9987d.m18677a(this.f10780a.m9881i());
                    case 5:
                        return AbstractC9988d0.m18678a();
                    case 6:
                        return AbstractC10013z.m18710a((InterfaceC9525h) this.f10780a.f10762i.get(), (DataStore) this.f10780a.f10763j.get(), (InterfaceC9270g) this.f10780a.f10759f.get(), (InterfaceC9271h) this.f10780a.f10761h.get(), (ClientCodeLiveData) this.f10780a.f10758e.get());
                    case 7:
                        return AbstractC9995h.m18685a(this.f10780a.m9888p());
                    case 8:
                        return AbstractC9298b.m17104a(AbstractC9023b.m15678a(this.f10780a.f10754a));
                    case 9:
                        return new AccountRepositoryImp((InterfaceC9518a) this.f10780a.f10767n.get(), (InterfaceC9522e) this.f10780a.f10769p.get(), (InterfaceC9271h) this.f10780a.f10761h.get(), (ClientCodeLiveData) this.f10780a.f10758e.get());
                    case 10:
                        return AbstractC9998k.m18688a(this.f10780a.m9880h());
                    case 11:
                        return AbstractC9985c.m18675a((C8897a0) this.f10780a.f10768o.get());
                    case 12:
                        return AbstractC9982a0.m18672a(new NetworkInterceptor(), new GzipInterceptor());
                    case 13:
                        return AbstractC9299c.m17105a(AbstractC9023b.m15678a(this.f10780a.f10754a));
                    case 14:
                        return new ExerciseRepository((InterfaceC9519b) this.f10780a.f10765l.get(), (InterfaceC9521d) this.f10780a.f10772s.get());
                    case 15:
                        return AbstractC9991f.m18681a(this.f10780a.m9881i());
                    case 16:
                        return new CourseRepository((AppDatabase) this.f10780a.f10774u.get(), (DataStore) this.f10780a.f10771r.get(), (InterfaceC9519b) this.f10780a.f10765l.get());
                    case 17:
                        return AbstractC10003p.m18698a(this.f10780a.f10755b, AbstractC9023b.m15678a(this.f10780a.f10754a));
                    case 18:
                        return new TeachCourseRepository((InterfaceC9527j) this.f10780a.f10776w.get());
                    case 19:
                        return AbstractC9997j.m18687a(this.f10780a.m9881i());
                    case 20:
                        return new DictRepository((AppDatabase) this.f10780a.f10774u.get(), (PeriodEntityDao) this.f10780a.f10778y.get(), (GradeEntityDao) this.f10780a.f10779z.get(), (SubjectEntityDao) this.f10780a.f10738A.get(), (InterfaceC9520c) this.f10780a.f10739B.get());
                    case 21:
                        return AbstractC10006s.m18701a(this.f10780a.f10755b, (AppDatabase) this.f10780a.f10774u.get());
                    case 22:
                        return AbstractC10004q.m18699a(this.f10780a.f10755b, (AppDatabase) this.f10780a.f10774u.get());
                    case 23:
                        return AbstractC10008u.m18703a(this.f10780a.f10755b, (AppDatabase) this.f10780a.f10774u.get());
                    case 24:
                        return AbstractC9989e.m18679a(this.f10780a.m9881i());
                    case 25:
                        return AbstractC10011x.m18708a(AbstractC9023b.m15678a(this.f10780a.f10754a));
                    case 26:
                        return AbstractC9999l.m18689a(this.f10780a.m9881i());
                    case 27:
                        return AbstractC9996i.m18686a(this.f10780a.m9881i());
                    case 28:
                        return new QuickCodeRepository((InterfaceC9524g) this.f10780a.f10744G.get());
                    case 29:
                        return AbstractC9993g.m18683a(this.f10780a.m9881i());
                    case 30:
                        return new C10102k((InterfaceC9523f) this.f10780a.f10746I.get());
                    case 31:
                        return AbstractC9983b.m18673a(this.f10780a.m9881i());
                    case 32:
                        return AbstractC10005r.m18700a(this.f10780a.f10755b, (AppDatabase) this.f10780a.f10774u.get());
                    case 33:
                        return new SearchHistoryRepository((SearchHistoryEntityDao) this.f10780a.f10749L.get());
                    case 34:
                        return AbstractC10007t.m18702a(this.f10780a.f10755b, (AppDatabase) this.f10780a.f10774u.get());
                    case 35:
                        return new C10098g((InterfaceC9519b) this.f10780a.f10765l.get());
                    case 36:
                        return AbstractC10009v.m18704a(this.f10780a.f10756c, (InterfaceC9528k) this.f10780a.f10742E.get());
                    case 37:
                        return AbstractC10169b.m19039a(AbstractC9023b.m15678a(this.f10780a.f10754a));
                    default:
                        throw new AssertionError(this.f10781b);
                }
            }
        }

        public h(C9022a c9022a, C10002o c10002o, GlobalObjectProvide globalObjectProvide) {
            this.f10754a = c9022a;
            this.f10755b = c10002o;
            this.f10756c = globalObjectProvide;
            m9883k(c9022a, c10002o, globalObjectProvide);
            m9884l(c9022a, c10002o, globalObjectProvide);
        }

        @Override // p087e6.AbstractC8367a.a
        /* renamed from: a */
        public Set mo9876a() {
            return Collections.EMPTY_SET;
        }

        @Override // p176m4.InterfaceC9302c
        /* renamed from: b */
        public void mo9877b(MyApplication myApplication) {
            m9887o(myApplication);
        }

        @Override // p133i6.C8760b.b
        /* renamed from: c */
        public InterfaceC8652b mo9878c() {
            return new c(this.f10757d);
        }

        /* renamed from: g */
        public ClientCodeInterceptor m9879g() {
            return m9885m(AbstractC10000m.m18690a());
        }

        /* renamed from: h */
        public C8897a0 m9880h() {
            return AbstractC9984b0.m18674a(new NetworkInterceptor(), m9882j(), m9879g());
        }

        /* renamed from: i */
        public C8897a0 m9881i() {
            return AbstractC9986c0.m18676a(new NetworkInterceptor(), m9882j(), new GzipInterceptor(), m9889q(), m9879g());
        }

        /* renamed from: j */
        public HeadInterceptor m9882j() {
            return m9886n(AbstractC8710a.m14214a());
        }

        /* renamed from: k */
        public final void m9883k(C9022a c9022a, C10002o c10002o, GlobalObjectProvide globalObjectProvide) {
            this.f10758e = C9254b.m16963b(new a(this.f10757d, 0));
            this.f10759f = C9254b.m16963b(new a(this.f10757d, 1));
            this.f10760g = C9254b.m16963b(new a(this.f10757d, 2));
            this.f10761h = C9254b.m16963b(new a(this.f10757d, 5));
            this.f10762i = C9254b.m16963b(new a(this.f10757d, 7));
            this.f10763j = C9254b.m16963b(new a(this.f10757d, 8));
            this.f10764k = C9254b.m16963b(new a(this.f10757d, 6));
            this.f10765l = C9254b.m16963b(new a(this.f10757d, 4));
            this.f10766m = C9254b.m16963b(new a(this.f10757d, 3));
            this.f10767n = C9254b.m16963b(new a(this.f10757d, 10));
            this.f10768o = C9254b.m16963b(new a(this.f10757d, 12));
            this.f10769p = C9254b.m16963b(new a(this.f10757d, 11));
            this.f10770q = C9254b.m16963b(new a(this.f10757d, 9));
            this.f10771r = C9254b.m16963b(new a(this.f10757d, 13));
            this.f10772s = C9254b.m16963b(new a(this.f10757d, 15));
            this.f10773t = C9254b.m16963b(new a(this.f10757d, 14));
            this.f10774u = C9254b.m16963b(new a(this.f10757d, 17));
            this.f10775v = C9254b.m16963b(new a(this.f10757d, 16));
            this.f10776w = C9254b.m16963b(new a(this.f10757d, 19));
            this.f10777x = C9254b.m16963b(new a(this.f10757d, 18));
            this.f10778y = C9254b.m16963b(new a(this.f10757d, 21));
            this.f10779z = C9254b.m16963b(new a(this.f10757d, 22));
            this.f10738A = C9254b.m16963b(new a(this.f10757d, 23));
            this.f10739B = C9254b.m16963b(new a(this.f10757d, 24));
            this.f10740C = C9254b.m16963b(new a(this.f10757d, 20));
        }

        /* renamed from: l */
        public final void m9884l(C9022a c9022a, C10002o c10002o, GlobalObjectProvide globalObjectProvide) {
            this.f10741D = C9254b.m16963b(new a(this.f10757d, 25));
            this.f10742E = C9254b.m16963b(new a(this.f10757d, 26));
            this.f10743F = C9254b.m16963b(new a(this.f10757d, 27));
            this.f10744G = C9254b.m16963b(new a(this.f10757d, 29));
            this.f10745H = C9254b.m16963b(new a(this.f10757d, 28));
            this.f10746I = C9254b.m16963b(new a(this.f10757d, 31));
            this.f10747J = C9254b.m16963b(new a(this.f10757d, 30));
            this.f10748K = C9254b.m16963b(new a(this.f10757d, 32));
            this.f10749L = C9254b.m16963b(new a(this.f10757d, 34));
            this.f10750M = C9254b.m16963b(new a(this.f10757d, 33));
            this.f10751N = C9254b.m16963b(new a(this.f10757d, 35));
            this.f10752O = C9254b.m16963b(new a(this.f10757d, 36));
            this.f10753P = C9254b.m16963b(new a(this.f10757d, 37));
        }

        /* renamed from: m */
        public final ClientCodeInterceptor m9885m(ClientCodeInterceptor clientCodeInterceptor) {
            AbstractC10001n.m18691a(clientCodeInterceptor, (ClientCodeLiveData) this.f10758e.get());
            return clientCodeInterceptor;
        }

        /* renamed from: n */
        public final HeadInterceptor m9886n(HeadInterceptor headInterceptor) {
            AbstractC8711b.m14215a(headInterceptor, (InterfaceC9271h) this.f10761h.get());
            return headInterceptor;
        }

        /* renamed from: o */
        public final MyApplication m9887o(MyApplication myApplication) {
            AbstractC9308i.m17106a(myApplication, (ClientCodeLiveData) this.f10758e.get());
            return myApplication;
        }

        /* renamed from: p */
        public C8897a0 m9888p() {
            return AbstractC9992f0.m18682a(new NetworkInterceptor(), m9882j(), new GzipInterceptor(), m9879g());
        }

        /* renamed from: q */
        public ResponseRefreshTokenInterceptor m9889q() {
            return new ResponseRefreshTokenInterceptor((InterfaceC9270g) this.f10759f.get(), (AbstractC8756a) this.f10764k.get());
        }
    }

    /* renamed from: com.zykj.study.a$i */
    public static final class i implements InterfaceC8654d {

        /* renamed from: a */
        public final h f10782a;

        /* renamed from: b */
        public final d f10783b;

        /* renamed from: c */
        public SavedStateHandle f10784c;

        /* renamed from: d */
        public InterfaceC5272c f10785d;

        @Override // p111g6.InterfaceC8654d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC9307h build() {
            AbstractC9257e.m16971a(this.f10784c, SavedStateHandle.class);
            AbstractC9257e.m16971a(this.f10785d, InterfaceC5272c.class);
            return new j(this.f10782a, this.f10783b, this.f10784c, this.f10785d);
        }

        @Override // p111g6.InterfaceC8654d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public i mo9890a(SavedStateHandle savedStateHandle) {
            this.f10784c = (SavedStateHandle) AbstractC9257e.m16972b(savedStateHandle);
            return this;
        }

        @Override // p111g6.InterfaceC8654d
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public i mo9891b(InterfaceC5272c interfaceC5272c) {
            this.f10785d = (InterfaceC5272c) AbstractC9257e.m16972b(interfaceC5272c);
            return this;
        }

        public i(h hVar, d dVar) {
            this.f10782a = hVar;
            this.f10783b = dVar;
        }
    }

    /* renamed from: com.zykj.study.a$j */
    public static final class j extends AbstractC9307h {

        /* renamed from: A */
        public InterfaceC9258f f10786A;

        /* renamed from: B */
        public InterfaceC9258f f10787B;

        /* renamed from: C */
        public InterfaceC9258f f10788C;

        /* renamed from: D */
        public InterfaceC9258f f10789D;

        /* renamed from: E */
        public InterfaceC9258f f10790E;

        /* renamed from: F */
        public InterfaceC9258f f10791F;

        /* renamed from: G */
        public InterfaceC9258f f10792G;

        /* renamed from: H */
        public InterfaceC9258f f10793H;

        /* renamed from: I */
        public InterfaceC9258f f10794I;

        /* renamed from: J */
        public InterfaceC9258f f10795J;

        /* renamed from: K */
        public InterfaceC9258f f10796K;

        /* renamed from: L */
        public InterfaceC9258f f10797L;

        /* renamed from: M */
        public InterfaceC9258f f10798M;

        /* renamed from: N */
        public InterfaceC9258f f10799N;

        /* renamed from: O */
        public InterfaceC9258f f10800O;

        /* renamed from: P */
        public InterfaceC9258f f10801P;

        /* renamed from: Q */
        public InterfaceC9258f f10802Q;

        /* renamed from: R */
        public InterfaceC9258f f10803R;

        /* renamed from: S */
        public InterfaceC9258f f10804S;

        /* renamed from: T */
        public InterfaceC9258f f10805T;

        /* renamed from: U */
        public InterfaceC9258f f10806U;

        /* renamed from: V */
        public InterfaceC9258f f10807V;

        /* renamed from: W */
        public InterfaceC9258f f10808W;

        /* renamed from: a */
        public final SavedStateHandle f10809a;

        /* renamed from: b */
        public final h f10810b;

        /* renamed from: c */
        public final d f10811c;

        /* renamed from: d */
        public final j f10812d = this;

        /* renamed from: e */
        public InterfaceC9258f f10813e;

        /* renamed from: f */
        public InterfaceC9258f f10814f;

        /* renamed from: g */
        public InterfaceC9258f f10815g;

        /* renamed from: h */
        public InterfaceC9258f f10816h;

        /* renamed from: i */
        public InterfaceC9258f f10817i;

        /* renamed from: j */
        public InterfaceC9258f f10818j;

        /* renamed from: k */
        public InterfaceC9258f f10819k;

        /* renamed from: l */
        public InterfaceC9258f f10820l;

        /* renamed from: m */
        public InterfaceC9258f f10821m;

        /* renamed from: n */
        public InterfaceC9258f f10822n;

        /* renamed from: o */
        public InterfaceC9258f f10823o;

        /* renamed from: p */
        public InterfaceC9258f f10824p;

        /* renamed from: q */
        public InterfaceC9258f f10825q;

        /* renamed from: r */
        public InterfaceC9258f f10826r;

        /* renamed from: s */
        public InterfaceC9258f f10827s;

        /* renamed from: t */
        public InterfaceC9258f f10828t;

        /* renamed from: u */
        public InterfaceC9258f f10829u;

        /* renamed from: v */
        public InterfaceC9258f f10830v;

        /* renamed from: w */
        public InterfaceC9258f f10831w;

        /* renamed from: x */
        public InterfaceC9258f f10832x;

        /* renamed from: y */
        public InterfaceC9258f f10833y;

        /* renamed from: z */
        public InterfaceC9258f f10834z;

        /* renamed from: com.zykj.study.a$j$a */
        public static final class a implements InterfaceC9258f {

            /* renamed from: a */
            public final h f10835a;

            /* renamed from: b */
            public final d f10836b;

            /* renamed from: c */
            public final j f10837c;

            /* renamed from: d */
            public final int f10838d;

            public a(h hVar, d dVar, j jVar, int i10) {
                this.f10835a = hVar;
                this.f10836b = dVar;
                this.f10837c = jVar;
                this.f10838d = i10;
            }

            @Override // javax.inject.Provider
            public Object get() {
                switch (this.f10838d) {
                    case 0:
                        return new AnswerAreaViewModel();
                    case 1:
                        return new AuthorizedLessonViewModel((C10092a) this.f10835a.f10766m.get());
                    case 2:
                        return new CatalogViewModel();
                    case 3:
                        return new ChangePsdViewModel((InterfaceC9643a) this.f10835a.f10770q.get(), this.f10837c.f10809a);
                    case 4:
                        return new ChangePwdViewModel((InterfaceC9643a) this.f10835a.f10770q.get());
                    case 5:
                        return new CourseContentViewModel((DataStore) this.f10835a.f10771r.get(), (ExerciseRepository) this.f10835a.f10773t.get());
                    case 6:
                        return new CourseDetailsViewModel((CourseRepository) this.f10835a.f10775v.get(), (DataStore) this.f10835a.f10771r.get(), (InterfaceC9271h) this.f10835a.f10761h.get());
                    case 7:
                        return new CourseManageVewModel((InterfaceC9519b) this.f10835a.f10765l.get());
                    case 8:
                        return new CourseViewModel((CourseRepository) this.f10835a.f10775v.get());
                    case 9:
                        return new CourseViewViewModel((TeachCourseRepository) this.f10835a.f10777x.get(), (InterfaceC9271h) this.f10835a.f10761h.get());
                    case 10:
                        return new DictViewModel((DictRepository) this.f10835a.f10740C.get());
                    case 11:
                        return new EditCourseViewModel((CourseRepository) this.f10835a.f10775v.get(), (DataStore) this.f10835a.f10771r.get());
                    case 12:
                        return new ExerciseHistoryViewModel((ExerciseRepository) this.f10835a.f10773t.get(), (DataStore) this.f10835a.f10771r.get());
                    case 13:
                        return new ExerciseStatisticsViewModel((TeachCourseRepository) this.f10835a.f10777x.get());
                    case 14:
                        return new ExerciseStudentHistoryViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 15:
                        return new ExerciseTrainViewModel((ExerciseRepository) this.f10835a.f10773t.get(), (DataStoreManager) this.f10835a.f10741D.get());
                    case 16:
                        return new ExerciseViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 17:
                        return new ExerciseViewerViewModel((ExerciseRepository) this.f10835a.f10773t.get(), (DataStore) this.f10835a.f10771r.get());
                    case 18:
                        return new HomeViewModel((DataStore) this.f10835a.f10771r.get(), (InterfaceC9528k) this.f10835a.f10742E.get());
                    case 19:
                        return new LoginViewModel((DataStore) this.f10835a.f10763j.get(), (DataStore) this.f10835a.f10771r.get());
                    case 20:
                        return new MainViewModel((InterfaceC9271h) this.f10835a.f10761h.get(), (DataStore) this.f10835a.f10763j.get());
                    case 21:
                        return new ManagementSubscribeViewModel(this.f10837c.m9900f());
                    case 22:
                        return new MicroCodeViewModel((QuickCodeRepository) this.f10835a.f10745H.get());
                    case 23:
                        return new MicroEditViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 24:
                        return new MicroExtraViewModel();
                    case 25:
                        return new MyCourseDetailsViewModel((CourseRepository) this.f10835a.f10775v.get(), (DataStore) this.f10835a.f10771r.get(), (InterfaceC9271h) this.f10835a.f10761h.get());
                    case 26:
                        return new MyCourseViewModel((CourseRepository) this.f10835a.f10775v.get(), (DataStore) this.f10835a.f10771r.get());
                    case 27:
                        return new MyTeachCourseViewModel((TeachCourseRepository) this.f10835a.f10777x.get());
                    case 28:
                        return new NotifyDataChangedViewModel();
                    case 29:
                        return new OssTokenViewModel((C10102k) this.f10835a.f10747J.get(), (DataStore) this.f10835a.f10771r.get());
                    case 30:
                        return new PDFViewModel((PdfDao) this.f10835a.f10748K.get());
                    case 31:
                        return new SearchViewModel((SearchHistoryRepository) this.f10835a.f10750M.get(), (C10098g) this.f10835a.f10751N.get(), (DataStore) this.f10835a.f10771r.get());
                    case 32:
                        return new SendSmsViewModel((InterfaceC9643a) this.f10835a.f10770q.get());
                    case 33:
                        return new SettingViewModel();
                    case 34:
                        return new StudentExercisesViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 35:
                        return new StudentViewContentViewModel((DataStore) this.f10835a.f10771r.get(), (TeachCourseRepository) this.f10835a.f10777x.get());
                    case 36:
                        return new StudentViewViewModel((TeachCourseRepository) this.f10835a.f10777x.get());
                    case 37:
                        return new StudyViewModel((CourseRepository) this.f10835a.f10775v.get(), (DataStore) this.f10835a.f10771r.get(), (InterfaceC9271h) this.f10835a.f10761h.get());
                    case 38:
                        return new TeachDetailsViewModel((TeachCourseRepository) this.f10835a.f10777x.get());
                    case 39:
                        return new TeacherLoginViewModel((InterfaceC9643a) this.f10835a.f10770q.get(), (DataStore) this.f10835a.f10763j.get(), (DataStore) this.f10835a.f10771r.get());
                    case 40:
                        return new TrainAnswerMicroViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 41:
                        return new TrainMultipleChoiceViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 42:
                        return new TrainSingleChoiceViewModel((ExerciseRepository) this.f10835a.f10773t.get());
                    case 43:
                        return new VersionViewModel((AbstractC10241a) this.f10835a.f10752O.get(), (DataStore) this.f10835a.f10753P.get());
                    case 44:
                        return new WebViewControlViewModel();
                    default:
                        throw new AssertionError(this.f10838d);
                }
            }
        }

        public j(h hVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC5272c interfaceC5272c) {
            this.f10810b = hVar;
            this.f10811c = dVar;
            this.f10809a = savedStateHandle;
            m9898d(savedStateHandle, interfaceC5272c);
            m9899e(savedStateHandle, interfaceC5272c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC8333d
        /* renamed from: a */
        public Map mo9896a() {
            return C9255c.m16966a(C9256d.m16968b(45).m16970c(AbstractC8533b.f16111a, this.f10813e).m16970c(AbstractC8548e.f16121a, this.f10814f).m16970c(AbstractC8563h.f16131a, this.f10815g).m16970c(AbstractC9791k.f19581a, this.f10816h).m16970c(AbstractC9796p.f19592a, this.f10817i).m16970c(AbstractC8578k.f16141a, this.f10818j).m16970c(AbstractC8593n.f16151a, this.f10819k).m16970c(AbstractC8608q.f16161a, this.f10820l).m16970c(AbstractC8623t.f16171a, this.f10821m).m16970c(AbstractC8635w.f16179a, this.f10822n).m16970c(AbstractC8539c0.f16114a, this.f10823o).m16970c(AbstractC8554f0.f16124a, this.f10824p).m16970c(AbstractC8569i0.f16134a, this.f10825q).m16970c(AbstractC8584l0.f16145a, this.f10826r).m16970c(AbstractC8599o0.f16155a, this.f10827s).m16970c(AbstractC8619s0.f16168a, this.f10828t).m16970c(AbstractC8632v0.f16177a, this.f10829u).m16970c(AbstractC8644y0.f16186a, this.f10830v).m16970c(AbstractC8535b1.f16112a, this.f10831w).m16970c(AbstractC9367b.f18501a, this.f10832x).m16970c(AbstractC8550e1.f16122a, this.f10833y).m16970c(AbstractC8565h1.f16132a, this.f10834z).m16970c(AbstractC8580k1.f16142a, this.f10786A).m16970c(AbstractC8595n1.f16152a, this.f10787B).m16970c(AbstractC8610q1.f16163a, this.f10788C).m16970c(AbstractC8625t1.f16173a, this.f10789D).m16970c(AbstractC8637w1.f16181a, this.f10790E).m16970c(AbstractC8649z1.f16190a, this.f10791F).m16970c(AbstractC8541c2.f16116a, this.f10792G).m16970c(AbstractC8556f2.f16126a, this.f10793H).m16970c(AbstractC8571i2.f16136a, this.f10794I).m16970c(AbstractC8591m2.f16149a, this.f10795J).m16970c(AbstractC9910e.f19867a, this.f10796K).m16970c(AbstractC8606p2.f16159a, this.f10797L).m16970c(AbstractC8621s2.f16169a, this.f10798M).m16970c(AbstractC8634v2.f16178a, this.f10799N).m16970c(AbstractC8646y2.f16187a, this.f10800O).m16970c(AbstractC8542c3.f16117a, this.f10801P).m16970c(AbstractC8557f3.f16127a, this.f10802Q).m16970c(AbstractC9647e.f19335a, this.f10803R).m16970c(AbstractC8572i3.f16137a, this.f10804S).m16970c(AbstractC8587l3.f16147a, this.f10805T).m16970c(AbstractC8602o3.f16157a, this.f10806U).m16970c(AbstractC10275b.f20507a, this.f10807V).m16970c(AbstractC8617r3.f16167a, this.f10808W).m16969a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC8333d
        /* renamed from: b */
        public Map mo9897b() {
            return Collections.EMPTY_MAP;
        }

        /* renamed from: d */
        public final void m9898d(SavedStateHandle savedStateHandle, InterfaceC5272c interfaceC5272c) {
            this.f10813e = new a(this.f10810b, this.f10811c, this.f10812d, 0);
            this.f10814f = new a(this.f10810b, this.f10811c, this.f10812d, 1);
            this.f10815g = new a(this.f10810b, this.f10811c, this.f10812d, 2);
            this.f10816h = new a(this.f10810b, this.f10811c, this.f10812d, 3);
            this.f10817i = new a(this.f10810b, this.f10811c, this.f10812d, 4);
            this.f10818j = new a(this.f10810b, this.f10811c, this.f10812d, 5);
            this.f10819k = new a(this.f10810b, this.f10811c, this.f10812d, 6);
            this.f10820l = new a(this.f10810b, this.f10811c, this.f10812d, 7);
            this.f10821m = new a(this.f10810b, this.f10811c, this.f10812d, 8);
            this.f10822n = new a(this.f10810b, this.f10811c, this.f10812d, 9);
            this.f10823o = new a(this.f10810b, this.f10811c, this.f10812d, 10);
            this.f10824p = new a(this.f10810b, this.f10811c, this.f10812d, 11);
            this.f10825q = new a(this.f10810b, this.f10811c, this.f10812d, 12);
            this.f10826r = new a(this.f10810b, this.f10811c, this.f10812d, 13);
            this.f10827s = new a(this.f10810b, this.f10811c, this.f10812d, 14);
            this.f10828t = new a(this.f10810b, this.f10811c, this.f10812d, 15);
            this.f10829u = new a(this.f10810b, this.f10811c, this.f10812d, 16);
            this.f10830v = new a(this.f10810b, this.f10811c, this.f10812d, 17);
            this.f10831w = new a(this.f10810b, this.f10811c, this.f10812d, 18);
            this.f10832x = new a(this.f10810b, this.f10811c, this.f10812d, 19);
            this.f10833y = new a(this.f10810b, this.f10811c, this.f10812d, 20);
            this.f10834z = new a(this.f10810b, this.f10811c, this.f10812d, 21);
            this.f10786A = new a(this.f10810b, this.f10811c, this.f10812d, 22);
            this.f10787B = new a(this.f10810b, this.f10811c, this.f10812d, 23);
            this.f10788C = new a(this.f10810b, this.f10811c, this.f10812d, 24);
        }

        /* renamed from: e */
        public final void m9899e(SavedStateHandle savedStateHandle, InterfaceC5272c interfaceC5272c) {
            this.f10789D = new a(this.f10810b, this.f10811c, this.f10812d, 25);
            this.f10790E = new a(this.f10810b, this.f10811c, this.f10812d, 26);
            this.f10791F = new a(this.f10810b, this.f10811c, this.f10812d, 27);
            this.f10792G = new a(this.f10810b, this.f10811c, this.f10812d, 28);
            this.f10793H = new a(this.f10810b, this.f10811c, this.f10812d, 29);
            this.f10794I = new a(this.f10810b, this.f10811c, this.f10812d, 30);
            this.f10795J = new a(this.f10810b, this.f10811c, this.f10812d, 31);
            this.f10796K = new a(this.f10810b, this.f10811c, this.f10812d, 32);
            this.f10797L = new a(this.f10810b, this.f10811c, this.f10812d, 33);
            this.f10798M = new a(this.f10810b, this.f10811c, this.f10812d, 34);
            this.f10799N = new a(this.f10810b, this.f10811c, this.f10812d, 35);
            this.f10800O = new a(this.f10810b, this.f10811c, this.f10812d, 36);
            this.f10801P = new a(this.f10810b, this.f10811c, this.f10812d, 37);
            this.f10802Q = new a(this.f10810b, this.f10811c, this.f10812d, 38);
            this.f10803R = new a(this.f10810b, this.f10811c, this.f10812d, 39);
            this.f10804S = new a(this.f10810b, this.f10811c, this.f10812d, 40);
            this.f10805T = new a(this.f10810b, this.f10811c, this.f10812d, 41);
            this.f10806U = new a(this.f10810b, this.f10811c, this.f10812d, 42);
            this.f10807V = new a(this.f10810b, this.f10811c, this.f10812d, 43);
            this.f10808W = new a(this.f10810b, this.f10811c, this.f10812d, 44);
        }

        /* renamed from: f */
        public SubscribeRepository m9900f() {
            return new SubscribeRepository((InterfaceC9526i) this.f10810b.f10743F.get());
        }
    }

    /* renamed from: a */
    public static e m9801a() {
        return new e();
    }
}
