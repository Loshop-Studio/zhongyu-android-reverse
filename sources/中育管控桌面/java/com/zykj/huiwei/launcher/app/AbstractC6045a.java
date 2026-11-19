package com.zykj.huiwei.launcher.app;

import android.app.Activity;
import android.app.Service;
import androidx.datastore.core.DataStore;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import com.zykj.gallery.api.PictureService;
import com.zykj.gallery.p034ui.activity.GalleryActivity;
import com.zykj.gallery.p034ui.gallery.detail.DetailViewModel;
import com.zykj.gallery.p034ui.gallery.screenList.GalleryViewModel;
import com.zykj.gallery.p034ui.share.ShareActivity;
import com.zykj.gallery.p034ui.share.page.ShareViewModel;
import com.zykj.gallery.repository.GalleryRepository;
import com.zykj.http.interceptor.GzipInterceptor;
import com.zykj.http.interceptor.HeadInterceptor;
import com.zykj.http.interceptor.NetworkInterceptor;
import com.zykj.http.interceptor.RefreshTokenInterceptor;
import com.zykj.huiwei.launcher.api.AuthService;
import com.zykj.huiwei.launcher.api.DeviceService;
import com.zykj.huiwei.launcher.api.GatewayService;
import com.zykj.huiwei.launcher.api.HomeService;
import com.zykj.huiwei.launcher.api.NotificationService;
import com.zykj.huiwei.launcher.api.UserService;
import com.zykj.huiwei.launcher.api.VersionService;
import com.zykj.huiwei.launcher.p035ui.MainActivity;
import com.zykj.huiwei.launcher.p035ui.activity.CrashActivity;
import com.zykj.huiwei.launcher.p035ui.adapter.HomeworkAdapter;
import com.zykj.huiwei.launcher.p035ui.dialog.AppUpdateDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.ChangeAvatarDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.CrashHintDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.CustomerServiceDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.Login.ResetPwdDialogFragment;
import com.zykj.huiwei.launcher.p035ui.dialog.ModifyGestureDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.ModifyPasswordDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.TipsDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.UnAuthorDialog;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.ChangePsdViewModel;
import com.zykj.huiwei.launcher.p035ui.dialog.changePsdDialog.ComposeModifyPasswordDialog;
import com.zykj.huiwei.launcher.p035ui.fragment.HomeFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.LoginFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.MainFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.NotificationDetailFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.NotificationFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.BaseAppFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.HuiWeiAppFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.HuiWeiAppListViewModel;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.LCAppFragment;
import com.zykj.huiwei.launcher.p035ui.fragment.applist.LCAppListViewModel;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideAuthServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideDeviceServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideGalleryServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideGatewayServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideHomeServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideNotificationFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideUserServiceFactory;
import com.zykj.huiwei.launcher.providers.ApiProvide_ProvideVersionServiceFactory;
import com.zykj.huiwei.launcher.providers.GlobalObjectProvide;
import com.zykj.huiwei.launcher.providers.GlobalObjectProvide_ProvideAppListFactory;
import com.zykj.huiwei.launcher.providers.LocalCacheProvide_ServerBeanDataStoreFactory;
import com.zykj.huiwei.launcher.providers.LocalCacheProvide_SettingDataStoreFactory;
import com.zykj.huiwei.launcher.providers.LocalCacheProvide_StudentInfoDataStoreFactory;
import com.zykj.huiwei.launcher.providers.LocalCacheProvide_UpdateSettingsDataStoreFactory;
import com.zykj.huiwei.launcher.providers.LocalCacheProvide_UserCacheBeanDataStoreFactory;
import com.zykj.huiwei.launcher.providers.OkHttpClientProvide_ProvideAuthOkHttpClientFactory;
import com.zykj.huiwei.launcher.providers.OkHttpClientProvide_ProvideCommonOkHttpClientFactory;
import com.zykj.huiwei.launcher.providers.OkHttpClientProvide_ProvideHeaderBeanFlowFactory;
import com.zykj.huiwei.launcher.providers.OkHttpClientProvide_ProvideResponseOkHttpClientFactory;
import com.zykj.huiwei.launcher.providers.OkHttpClientProvide_ProvideUnauthorizedFlowFactory;
import com.zykj.huiwei.launcher.receiver.LogoutReceiver;
import com.zykj.huiwei.launcher.repository.AuthRepository;
import com.zykj.huiwei.launcher.repository.HomeRepository;
import com.zykj.huiwei.launcher.repository.NotificationRepository;
import com.zykj.huiwei.launcher.repository.RefreshRepositoryImpl;
import com.zykj.huiwei.launcher.repository.UserRepository;
import com.zykj.huiwei.launcher.server.MyService;
import com.zykj.huiwei.launcher.viewmodels.AppUpdateViewModel;
import com.zykj.huiwei.launcher.viewmodels.ChangeAvatarViewModel;
import com.zykj.huiwei.launcher.viewmodels.CustomerServiceViewModel;
import com.zykj.huiwei.launcher.viewmodels.HomeViewModel;
import com.zykj.huiwei.launcher.viewmodels.LoginViewModel;
import com.zykj.huiwei.launcher.viewmodels.MainViewModel;
import com.zykj.huiwei.launcher.viewmodels.ModifyPasswordViewModel;
import com.zykj.huiwei.launcher.viewmodels.NotificationViewModel;
import com.zykj.huiwei.launcher.viewmodels.ResetPwdViewModel;
import com.zykj.huiwei.launcher.viewmodels.TipsViewModel;
import com.zykj.huiwei.launcher.viewmodels.UnAuthorViewModel;
import com.zykj.huiwei.launcher.viewmodels.VersionViewModel;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import p006a5.AbstractC0016e;
import p006a5.C0013b;
import p006a5.C0014c;
import p006a5.C0015d;
import p006a5.InterfaceC0017f;
import p043d4.AbstractC6234n;
import p043d4.AbstractC6235o;
import p043d4.AbstractC6236p;
import p057f4.AbstractC6339m;
import p058f5.C6356a0;
import p064g4.AbstractC6410e;
import p064g4.AbstractC6411f;
import p064g4.AbstractC6412g;
import p064g4.AbstractC6414i;
import p064g4.AbstractC6415j;
import p064g4.AbstractC6416k;
import p070h3.AbstractC6481x;
import p070h3.AbstractC6482y;
import p070h3.AbstractC6483z;
import p091k3.AbstractC6659o0;
import p091k3.AbstractC6661p0;
import p091k3.AbstractC6663q0;
import p101l4.AbstractC7303a;
import p101l4.AbstractC7304a0;
import p101l4.AbstractC7305b;
import p101l4.AbstractC7306b0;
import p101l4.AbstractC7307c;
import p101l4.AbstractC7308c0;
import p101l4.AbstractC7309d;
import p101l4.AbstractC7310d0;
import p101l4.AbstractC7311e;
import p101l4.AbstractC7312e0;
import p101l4.AbstractC7313f;
import p101l4.AbstractC7314f0;
import p101l4.AbstractC7316g0;
import p101l4.AbstractC7317h;
import p101l4.AbstractC7318h0;
import p101l4.AbstractC7319i;
import p101l4.AbstractC7320i0;
import p101l4.AbstractC7321j;
import p101l4.AbstractC7322j0;
import p101l4.AbstractC7324k0;
import p101l4.AbstractC7326l0;
import p101l4.AbstractC7328m0;
import p101l4.AbstractC7330n0;
import p101l4.AbstractC7332o0;
import p101l4.AbstractC7334p0;
import p101l4.AbstractC7335q;
import p101l4.AbstractC7336q0;
import p101l4.AbstractC7337r;
import p101l4.AbstractC7338r0;
import p101l4.AbstractC7339s;
import p101l4.AbstractC7340t;
import p101l4.AbstractC7341u;
import p101l4.AbstractC7342v;
import p101l4.AbstractC7344x;
import p101l4.AbstractC7345y;
import p101l4.AbstractC7346z;
import p107m3.AbstractC7399u;
import p107m3.AbstractC7400v;
import p107m3.AbstractC7401w;
import p128p3.AbstractC7594a;
import p128p3.AbstractC7595b;
import p128p3.AbstractC7596c;
import p128p3.AbstractC7597d;
import p135q3.AbstractC7624a;
import p142r3.AbstractC7641c;
import p142r3.AbstractC7642d;
import p142r3.AbstractC7643e;
import p142r3.AbstractC7644f;
import p142r3.AbstractC7645g;
import p142r3.AbstractC7646h;
import p143r4.InterfaceC7648a;
import p143r4.InterfaceC7650c;
import p170v3.AbstractC7794c;
import p171v4.InterfaceC7795a;
import p171v4.InterfaceC7796b;
import p171v4.InterfaceC7797c;
import p171v4.InterfaceC7798d;
import p171v4.InterfaceC7799e;
import p177w3.C7811a;
import p177w3.C7812b;
import p177w3.C7814d;
import p178w4.AbstractC7815a;
import p178w4.AbstractC7816b;
import p184x3.AbstractC7853u;
import p185x4.AbstractC7858c;
import p185x4.C7863h;
import p192y4.AbstractC7913b;
import p192y4.AbstractC7914c;
import p192y4.C7912a;

/* renamed from: com.zykj.huiwei.launcher.app.a */
/* loaded from: classes4.dex */
public abstract class AbstractC6045a {

    /* renamed from: com.zykj.huiwei.launcher.app.a$a */
    public static final class a implements InterfaceC7795a {

        /* renamed from: a */
        public final j f5962a;

        /* renamed from: b */
        public final d f5963b;

        /* renamed from: c */
        public Activity f5964c;

        @Override // p171v4.InterfaceC7795a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a mo5209a(Activity activity) {
            this.f5964c = (Activity) AbstractC0016e.m25b(activity);
            return this;
        }

        @Override // p171v4.InterfaceC7795a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC7641c build() {
            AbstractC0016e.m24a(this.f5964c, Activity.class);
            return new b(this.f5962a, this.f5963b, this.f5964c);
        }

        public a(j jVar, d dVar) {
            this.f5962a = jVar;
            this.f5963b = dVar;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$b */
    public static final class b extends AbstractC7641c {

        /* renamed from: a */
        public final j f5965a;

        /* renamed from: b */
        public final d f5966b;

        /* renamed from: c */
        public final b f5967c = this;

        public b(j jVar, d dVar, Activity activity) {
            this.f5965a = jVar;
            this.f5966b = dVar;
        }

        @Override // p178w4.AbstractC7815a.a
        /* renamed from: a */
        public AbstractC7815a.c mo5212a() {
            return AbstractC7816b.m9407a(mo5214c(), new k(this.f5965a, this.f5966b));
        }

        @Override // p100l3.InterfaceC7302h
        /* renamed from: b */
        public void mo5213b(ShareActivity shareActivity) {
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC6252c
        /* renamed from: c */
        public Map mo5214c() {
            return C0014c.m19a(C0015d.m21b(18).m23c(AbstractC7307c.f9288a, Boolean.valueOf(AbstractC7303a.m8293a())).m23c(AbstractC7313f.f9292a, Boolean.valueOf(AbstractC7309d.m8295a())).m23c(AbstractC6236p.f7543a, Boolean.valueOf(AbstractC6234n.m6325a())).m23c(AbstractC7321j.f9307a, Boolean.valueOf(AbstractC7317h.m8310a())).m23c(AbstractC6483z.f8275a, Boolean.valueOf(AbstractC6481x.m7168a())).m23c(AbstractC6663q0.f8776a, Boolean.valueOf(AbstractC6659o0.m7663a())).m23c(AbstractC7339s.f9316a, Boolean.valueOf(AbstractC7335q.m8314a())).m23c(AbstractC6412g.f8088a, Boolean.valueOf(AbstractC6410e.m6936a())).m23c(AbstractC6416k.f8090a, Boolean.valueOf(AbstractC6414i.m6937a())).m23c(AbstractC7342v.f9318a, Boolean.valueOf(AbstractC7340t.m8315a())).m23c(AbstractC7346z.f9320a, Boolean.valueOf(AbstractC7344x.m8316a())).m23c(AbstractC7308c0.f9289a, Boolean.valueOf(AbstractC7304a0.m8294a())).m23c(AbstractC7314f0.f9293a, Boolean.valueOf(AbstractC7310d0.m8296a())).m23c(AbstractC7320i0.f9306a, Boolean.valueOf(AbstractC7316g0.m8309a())).m23c(AbstractC7401w.f9437a, Boolean.valueOf(AbstractC7399u.m8412a())).m23c(AbstractC7326l0.f9310a, Boolean.valueOf(AbstractC7322j0.m8311a())).m23c(AbstractC7332o0.f9312a, Boolean.valueOf(AbstractC7328m0.m8312a())).m23c(AbstractC7338r0.f9315a, Boolean.valueOf(AbstractC7334p0.m8313a())).m22a());
        }

        @Override // p056f3.InterfaceC6314j
        /* renamed from: d */
        public void mo5215d(GalleryActivity galleryActivity) {
        }

        @Override // p198z3.InterfaceC7935a
        /* renamed from: e */
        public void mo5216e(CrashActivity crashActivity) {
        }

        @Override // p191y3.InterfaceC7911n
        /* renamed from: f */
        public void mo5217f(MainActivity mainActivity) {
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC6252c
        /* renamed from: g */
        public InterfaceC7799e mo5218g() {
            return new k(this.f5965a, this.f5966b);
        }

        @Override // p185x4.C7862g.a
        /* renamed from: h */
        public InterfaceC7797c mo5219h() {
            return new f(this.f5965a, this.f5966b, this.f5967c);
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$c */
    public static final class c implements InterfaceC7796b {

        /* renamed from: a */
        public final j f5968a;

        /* renamed from: b */
        public C7863h f5969b;

        @Override // p171v4.InterfaceC7796b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7642d build() {
            AbstractC0016e.m24a(this.f5969b, C7863h.class);
            return new d(this.f5968a, this.f5969b);
        }

        @Override // p171v4.InterfaceC7796b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c mo5220a(C7863h c7863h) {
            this.f5969b = (C7863h) AbstractC0016e.m25b(c7863h);
            return this;
        }

        public c(j jVar) {
            this.f5968a = jVar;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$d */
    public static final class d extends AbstractC7642d {

        /* renamed from: a */
        public final j f5970a;

        /* renamed from: b */
        public final d f5971b = this;

        /* renamed from: c */
        public InterfaceC0017f f5972c;

        /* renamed from: com.zykj.huiwei.launcher.app.a$d$a */
        public static final class a implements InterfaceC0017f {

            /* renamed from: a */
            public final j f5973a;

            /* renamed from: b */
            public final d f5974b;

            /* renamed from: c */
            public final int f5975c;

            public a(j jVar, d dVar, int i6) {
                this.f5973a = jVar;
                this.f5974b = dVar;
                this.f5975c = i6;
            }

            @Override // javax.inject.Provider
            public Object get() {
                if (this.f5975c == 0) {
                    return AbstractC7858c.m9534a();
                }
                throw new AssertionError(this.f5975c);
            }
        }

        public d(j jVar, C7863h c7863h) {
            this.f5970a = jVar;
            m5225c(c7863h);
        }

        @Override // p185x4.C7856a.a
        /* renamed from: a */
        public InterfaceC7795a mo5223a() {
            return new a(this.f5970a, this.f5971b);
        }

        @Override // p185x4.C7857b.d
        /* renamed from: b */
        public InterfaceC7648a mo5224b() {
            return (InterfaceC7648a) this.f5972c.get();
        }

        /* renamed from: c */
        public final void m5225c(C7863h c7863h) {
            this.f5972c = C0013b.m16b(new a(this.f5970a, this.f5971b, 0));
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$e */
    public static final class e {

        /* renamed from: a */
        public C7912a f5976a;

        /* renamed from: b */
        public GlobalObjectProvide f5977b;

        /* renamed from: a */
        public e m5226a(C7912a c7912a) {
            this.f5976a = (C7912a) AbstractC0016e.m25b(c7912a);
            return this;
        }

        /* renamed from: b */
        public AbstractC7645g m5227b() {
            AbstractC0016e.m24a(this.f5976a, C7912a.class);
            if (this.f5977b == null) {
                this.f5977b = new GlobalObjectProvide();
            }
            return new j(this.f5976a, this.f5977b);
        }

        public e() {
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$f */
    public static final class f implements InterfaceC7797c {

        /* renamed from: a */
        public final j f5978a;

        /* renamed from: b */
        public final d f5979b;

        /* renamed from: c */
        public final b f5980c;

        /* renamed from: d */
        public Fragment f5981d;

        @Override // p171v4.InterfaceC7797c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7643e build() {
            AbstractC0016e.m24a(this.f5981d, Fragment.class);
            return new g(this.f5978a, this.f5979b, this.f5980c, this.f5981d);
        }

        @Override // p171v4.InterfaceC7797c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public f mo5228a(Fragment fragment) {
            this.f5981d = (Fragment) AbstractC0016e.m25b(fragment);
            return this;
        }

        public f(j jVar, d dVar, b bVar) {
            this.f5978a = jVar;
            this.f5979b = dVar;
            this.f5980c = bVar;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$g */
    public static final class g extends AbstractC7643e {

        /* renamed from: a */
        public final j f5982a;

        /* renamed from: b */
        public final d f5983b;

        /* renamed from: c */
        public final b f5984c;

        /* renamed from: d */
        public final g f5985d = this;

        /* renamed from: e */
        public InterfaceC0017f f5986e;

        /* renamed from: com.zykj.huiwei.launcher.app.a$g$a */
        public static final class a implements InterfaceC0017f {

            /* renamed from: a */
            public final j f5987a;

            /* renamed from: b */
            public final d f5988b;

            /* renamed from: c */
            public final b f5989c;

            /* renamed from: d */
            public final g f5990d;

            /* renamed from: e */
            public final int f5991e;

            public a(j jVar, d dVar, b bVar, g gVar, int i6) {
                this.f5987a = jVar;
                this.f5988b = dVar;
                this.f5989c = bVar;
                this.f5990d = gVar;
                this.f5991e = i6;
            }

            @Override // javax.inject.Provider
            public Object get() {
                if (this.f5991e == 0) {
                    return new HomeworkAdapter();
                }
                throw new AssertionError(this.f5991e);
            }
        }

        public g(j jVar, d dVar, b bVar, Fragment fragment) {
            this.f5982a = jVar;
            this.f5983b = dVar;
            this.f5984c = bVar;
            m5241t(fragment);
        }

        @Override // p178w4.AbstractC7815a.b
        /* renamed from: a */
        public AbstractC7815a.c mo5231a() {
            return this.f5984c.mo5212a();
        }

        @Override // p019b4.InterfaceC4423d
        /* renamed from: b */
        public void mo1497b(AppUpdateDialog appUpdateDialog) {
        }

        @Override // p027c4.InterfaceC4508v
        /* renamed from: c */
        public void mo1600c(ResetPwdDialogFragment resetPwdDialogFragment) {
        }

        @Override // p043d4.InterfaceC6243w
        /* renamed from: d */
        public void mo5232d(ComposeModifyPasswordDialog composeModifyPasswordDialog) {
        }

        @Override // p057f4.InterfaceC6351w
        /* renamed from: e */
        public void mo5233e(LoginFragment loginFragment) {
        }

        @Override // p019b4.InterfaceC4432m
        /* renamed from: f */
        public void mo1500f(CustomerServiceDialog customerServiceDialog) {
        }

        @Override // p057f4.InterfaceC6337l
        /* renamed from: g */
        public void mo5234g(HomeFragment homeFragment) {
            m5242u(homeFragment);
        }

        @Override // p019b4.InterfaceC4438s
        /* renamed from: h */
        public void mo1503h(TipsDialog tipsDialog) {
        }

        @Override // p064g4.InterfaceC6413h
        /* renamed from: i */
        public void mo5235i(LCAppFragment lCAppFragment) {
        }

        @Override // p064g4.InterfaceC6408c
        /* renamed from: j */
        public void mo5236j(BaseAppFragment baseAppFragment) {
        }

        @Override // p057f4.InterfaceC6328g0
        /* renamed from: k */
        public void mo5237k(NotificationDetailFragment notificationDetailFragment) {
        }

        @Override // p019b4.InterfaceC4439t
        /* renamed from: l */
        public void mo1504l(UnAuthorDialog unAuthorDialog) {
        }

        @Override // p057f4.InterfaceC6354z
        /* renamed from: m */
        public void mo5238m(MainFragment mainFragment) {
        }

        @Override // p064g4.InterfaceC6409d
        /* renamed from: n */
        public void mo5239n(HuiWeiAppFragment huiWeiAppFragment) {
        }

        @Override // p019b4.InterfaceC4428i
        /* renamed from: o */
        public void mo1498o(ChangeAvatarDialog changeAvatarDialog) {
        }

        @Override // p019b4.InterfaceC4431l
        /* renamed from: p */
        public void mo1499p(CrashHintDialog crashHintDialog) {
        }

        @Override // p019b4.InterfaceC4436q
        /* renamed from: q */
        public void mo1502q(ModifyPasswordDialog modifyPasswordDialog) {
        }

        @Override // p057f4.InterfaceC6342n0
        /* renamed from: r */
        public void mo5240r(NotificationFragment notificationFragment) {
        }

        @Override // p019b4.InterfaceC4433n
        /* renamed from: s */
        public void mo1501s(ModifyGestureDialog modifyGestureDialog) {
        }

        /* renamed from: t */
        public final void m5241t(Fragment fragment) {
            this.f5986e = C0013b.m16b(new a(this.f5982a, this.f5983b, this.f5984c, this.f5985d, 0));
        }

        /* renamed from: u */
        public final HomeFragment m5242u(HomeFragment homeFragment) {
            AbstractC6339m.m6473a(homeFragment, (HomeworkAdapter) this.f5986e.get());
            return homeFragment;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$h */
    public static final class h implements InterfaceC7798d {

        /* renamed from: a */
        public final j f5992a;

        /* renamed from: b */
        public Service f5993b;

        @Override // p171v4.InterfaceC7798d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC7644f build() {
            AbstractC0016e.m24a(this.f5993b, Service.class);
            return new i(this.f5992a, this.f5993b);
        }

        @Override // p171v4.InterfaceC7798d
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public h mo5243a(Service service) {
            this.f5993b = (Service) AbstractC0016e.m25b(service);
            return this;
        }

        public h(j jVar) {
            this.f5992a = jVar;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$i */
    public static final class i extends AbstractC7644f {

        /* renamed from: a */
        public final j f5994a;

        /* renamed from: b */
        public final i f5995b = this;

        public i(j jVar, Service service) {
            this.f5994a = jVar;
        }

        @Override // p184x3.InterfaceC7852t
        /* renamed from: a */
        public void mo5246a(MyService myService) {
            m5248c(myService);
        }

        /* renamed from: b */
        public C7811a m5247b() {
            return new C7811a((DeviceService) this.f5994a.f6013r.get());
        }

        /* renamed from: c */
        public final MyService m5248c(MyService myService) {
            AbstractC7853u.m9519d(myService, (DataStore) this.f5994a.f5999d.get());
            AbstractC7853u.m9521f(myService, (DataStore) this.f5994a.f6000e.get());
            AbstractC7853u.m9520e(myService, (DataStore) this.f5994a.f6001f.get());
            AbstractC7853u.m9517b(myService, (MutableStateFlow) this.f5994a.f6003h.get());
            AbstractC7853u.m9522g(myService, m5249d());
            AbstractC7853u.m9516a(myService, m5247b());
            AbstractC7853u.m9518c(myService, (AbstractC7624a) this.f5994a.f6006k.get());
            return myService;
        }

        /* renamed from: d */
        public UserRepository m5249d() {
            return new UserRepository((UserService) this.f5994a.f6007l.get());
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$j */
    public static final class j extends AbstractC7645g {

        /* renamed from: a */
        public final C7912a f5996a;

        /* renamed from: b */
        public final GlobalObjectProvide f5997b;

        /* renamed from: c */
        public final j f5998c = this;

        /* renamed from: d */
        public InterfaceC0017f f5999d;

        /* renamed from: e */
        public InterfaceC0017f f6000e;

        /* renamed from: f */
        public InterfaceC0017f f6001f;

        /* renamed from: g */
        public InterfaceC0017f f6002g;

        /* renamed from: h */
        public InterfaceC0017f f6003h;

        /* renamed from: i */
        public InterfaceC0017f f6004i;

        /* renamed from: j */
        public InterfaceC0017f f6005j;

        /* renamed from: k */
        public InterfaceC0017f f6006k;

        /* renamed from: l */
        public InterfaceC0017f f6007l;

        /* renamed from: m */
        public InterfaceC0017f f6008m;

        /* renamed from: n */
        public InterfaceC0017f f6009n;

        /* renamed from: o */
        public InterfaceC0017f f6010o;

        /* renamed from: p */
        public InterfaceC0017f f6011p;

        /* renamed from: q */
        public InterfaceC0017f f6012q;

        /* renamed from: r */
        public InterfaceC0017f f6013r;

        /* renamed from: s */
        public InterfaceC0017f f6014s;

        /* renamed from: t */
        public InterfaceC0017f f6015t;

        /* renamed from: com.zykj.huiwei.launcher.app.a$j$a */
        public static final class a implements InterfaceC0017f {

            /* renamed from: a */
            public final j f6016a;

            /* renamed from: b */
            public final int f6017b;

            public a(j jVar, int i6) {
                this.f6016a = jVar;
                this.f6017b = i6;
            }

            @Override // javax.inject.Provider
            public Object get() {
                switch (this.f6017b) {
                    case 0:
                        return LocalCacheProvide_ServerBeanDataStoreFactory.serverBeanDataStore(AbstractC7914c.m9710a(this.f6016a.f5996a));
                    case 1:
                        return LocalCacheProvide_UserCacheBeanDataStoreFactory.userCacheBeanDataStore(AbstractC7914c.m9710a(this.f6016a.f5996a));
                    case 2:
                        return LocalCacheProvide_SettingDataStoreFactory.settingDataStore(AbstractC7914c.m9710a(this.f6016a.f5996a));
                    case 3:
                        return LocalCacheProvide_StudentInfoDataStoreFactory.studentInfoDataStore(AbstractC7914c.m9710a(this.f6016a.f5996a));
                    case 4:
                        return ApiProvide_ProvideUserServiceFactory.provideUserService(this.f6016a.m5265p());
                    case 5:
                        return OkHttpClientProvide_ProvideHeaderBeanFlowFactory.provideHeaderBeanFlow();
                    case 6:
                        return OkHttpClientProvide_ProvideUnauthorizedFlowFactory.provideUnauthorizedFlow();
                    case 7:
                        return new RefreshRepositoryImpl((AuthService) this.f6016a.f6005j.get(), (DataStore) this.f6016a.f5999d.get(), (MutableStateFlow) this.f6016a.f6003h.get());
                    case 8:
                        return ApiProvide_ProvideAuthServiceFactory.provideAuthService(this.f6016a.m5257h());
                    case 9:
                        return ApiProvide_ProvideHomeServiceFactory.provideHomeService(this.f6016a.m5265p());
                    case 10:
                        return ApiProvide_ProvideGalleryServiceFactory.provideGalleryService(this.f6016a.m5265p());
                    case 11:
                        return ApiProvide_ProvideNotificationFactory.provideNotification(this.f6016a.m5265p());
                    case 12:
                        return ApiProvide_ProvideGatewayServiceFactory.provideGatewayService(this.f6016a.m5258i());
                    case 13:
                        return GlobalObjectProvide_ProvideAppListFactory.provideAppList(this.f6016a.f5997b);
                    case 14:
                        return ApiProvide_ProvideDeviceServiceFactory.provideDeviceService(this.f6016a.m5265p());
                    case 15:
                        return ApiProvide_ProvideVersionServiceFactory.provideVersionService(this.f6016a.m5265p());
                    case 16:
                        return LocalCacheProvide_UpdateSettingsDataStoreFactory.updateSettingsDataStore(AbstractC7914c.m9710a(this.f6016a.f5996a));
                    default:
                        throw new AssertionError(this.f6017b);
                }
            }
        }

        public j(C7912a c7912a, GlobalObjectProvide globalObjectProvide) {
            this.f5996a = c7912a;
            this.f5997b = globalObjectProvide;
            m5260k(c7912a, globalObjectProvide);
        }

        @Override // p185x4.C7864i.a
        /* renamed from: a */
        public InterfaceC7798d mo5252a() {
            return new h(this.f5998c);
        }

        @Override // p157t4.AbstractC7728a.a
        /* renamed from: b */
        public Set mo5253b() {
            return Collections.EMPTY_SET;
        }

        @Override // p142r3.InterfaceC7640b
        /* renamed from: c */
        public void mo5254c(App app) {
        }

        @Override // p170v3.InterfaceC7793b
        /* renamed from: d */
        public void mo5255d(LogoutReceiver logoutReceiver) {
            m5262m(logoutReceiver);
        }

        @Override // p185x4.C7857b.b
        /* renamed from: e */
        public InterfaceC7796b mo5256e() {
            return new c(this.f5998c);
        }

        /* renamed from: h */
        public C6356a0 m5257h() {
            return OkHttpClientProvide_ProvideAuthOkHttpClientFactory.provideAuthOkHttpClient(new NetworkInterceptor(), new GzipInterceptor());
        }

        /* renamed from: i */
        public C6356a0 m5258i() {
            return OkHttpClientProvide_ProvideCommonOkHttpClientFactory.provideCommonOkHttpClient(new NetworkInterceptor());
        }

        /* renamed from: j */
        public HeadInterceptor m5259j() {
            return m5261l(AbstractC7594a.m9004a());
        }

        /* renamed from: k */
        public final void m5260k(C7912a c7912a, GlobalObjectProvide globalObjectProvide) {
            this.f5999d = C0013b.m16b(new a(this.f5998c, 0));
            this.f6000e = C0013b.m16b(new a(this.f5998c, 1));
            this.f6001f = C0013b.m16b(new a(this.f5998c, 2));
            this.f6002g = C0013b.m16b(new a(this.f5998c, 3));
            this.f6003h = C0013b.m16b(new a(this.f5998c, 5));
            this.f6004i = C0013b.m16b(new a(this.f5998c, 6));
            this.f6005j = C0013b.m16b(new a(this.f5998c, 8));
            this.f6006k = C0013b.m16b(new a(this.f5998c, 7));
            this.f6007l = C0013b.m16b(new a(this.f5998c, 4));
            this.f6008m = C0013b.m16b(new a(this.f5998c, 9));
            this.f6009n = C0013b.m16b(new a(this.f5998c, 10));
            this.f6010o = C0013b.m16b(new a(this.f5998c, 11));
            this.f6011p = C0013b.m16b(new a(this.f5998c, 12));
            this.f6012q = C0013b.m16b(new a(this.f5998c, 13));
            this.f6013r = C0013b.m16b(new a(this.f5998c, 14));
            this.f6014s = C0013b.m16b(new a(this.f5998c, 15));
            this.f6015t = C0013b.m16b(new a(this.f5998c, 16));
        }

        /* renamed from: l */
        public final HeadInterceptor m5261l(HeadInterceptor headInterceptor) {
            AbstractC7595b.m9005a(headInterceptor, (MutableStateFlow) this.f6003h.get());
            return headInterceptor;
        }

        /* renamed from: m */
        public final LogoutReceiver m5262m(LogoutReceiver logoutReceiver) {
            AbstractC7794c.m9364a(logoutReceiver, (DataStore) this.f5999d.get());
            AbstractC7794c.m9367d(logoutReceiver, (DataStore) this.f6000e.get());
            AbstractC7794c.m9365b(logoutReceiver, (DataStore) this.f6001f.get());
            AbstractC7794c.m9366c(logoutReceiver, (DataStore) this.f6002g.get());
            return logoutReceiver;
        }

        /* renamed from: n */
        public final RefreshTokenInterceptor m5263n(RefreshTokenInterceptor refreshTokenInterceptor) {
            AbstractC7597d.m9008b(refreshTokenInterceptor, (MutableSharedFlow) this.f6004i.get());
            AbstractC7597d.m9007a(refreshTokenInterceptor, (AbstractC7624a) this.f6006k.get());
            return refreshTokenInterceptor;
        }

        /* renamed from: o */
        public RefreshTokenInterceptor m5264o() {
            return m5263n(AbstractC7596c.m9006a());
        }

        /* renamed from: p */
        public C6356a0 m5265p() {
            return OkHttpClientProvide_ProvideResponseOkHttpClientFactory.provideResponseOkHttpClient(new NetworkInterceptor(), m5259j(), new GzipInterceptor(), m5264o());
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$k */
    public static final class k implements InterfaceC7799e {

        /* renamed from: a */
        public final j f6018a;

        /* renamed from: b */
        public final d f6019b;

        /* renamed from: c */
        public SavedStateHandle f6020c;

        /* renamed from: d */
        public InterfaceC7650c f6021d;

        @Override // p171v4.InterfaceC7799e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public AbstractC7646h build() {
            AbstractC0016e.m24a(this.f6020c, SavedStateHandle.class);
            AbstractC0016e.m24a(this.f6021d, InterfaceC7650c.class);
            return new l(this.f6018a, this.f6019b, this.f6020c, this.f6021d);
        }

        @Override // p171v4.InterfaceC7799e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public k mo5266a(SavedStateHandle savedStateHandle) {
            this.f6020c = (SavedStateHandle) AbstractC0016e.m25b(savedStateHandle);
            return this;
        }

        @Override // p171v4.InterfaceC7799e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public k mo5267b(InterfaceC7650c interfaceC7650c) {
            this.f6021d = (InterfaceC7650c) AbstractC0016e.m25b(interfaceC7650c);
            return this;
        }

        public k(j jVar, d dVar) {
            this.f6018a = jVar;
            this.f6019b = dVar;
        }
    }

    /* renamed from: com.zykj.huiwei.launcher.app.a$l */
    public static final class l extends AbstractC7646h {

        /* renamed from: A */
        public InterfaceC0017f f6022A;

        /* renamed from: a */
        public final SavedStateHandle f6023a;

        /* renamed from: b */
        public final j f6024b;

        /* renamed from: c */
        public final d f6025c;

        /* renamed from: d */
        public final l f6026d = this;

        /* renamed from: e */
        public InterfaceC0017f f6027e;

        /* renamed from: f */
        public InterfaceC0017f f6028f;

        /* renamed from: g */
        public InterfaceC0017f f6029g;

        /* renamed from: h */
        public InterfaceC0017f f6030h;

        /* renamed from: i */
        public InterfaceC0017f f6031i;

        /* renamed from: j */
        public InterfaceC0017f f6032j;

        /* renamed from: k */
        public InterfaceC0017f f6033k;

        /* renamed from: l */
        public InterfaceC0017f f6034l;

        /* renamed from: m */
        public InterfaceC0017f f6035m;

        /* renamed from: n */
        public InterfaceC0017f f6036n;

        /* renamed from: o */
        public InterfaceC0017f f6037o;

        /* renamed from: p */
        public InterfaceC0017f f6038p;

        /* renamed from: q */
        public InterfaceC0017f f6039q;

        /* renamed from: r */
        public InterfaceC0017f f6040r;

        /* renamed from: s */
        public InterfaceC0017f f6041s;

        /* renamed from: t */
        public InterfaceC0017f f6042t;

        /* renamed from: u */
        public InterfaceC0017f f6043u;

        /* renamed from: v */
        public InterfaceC0017f f6044v;

        /* renamed from: w */
        public InterfaceC0017f f6045w;

        /* renamed from: x */
        public InterfaceC0017f f6046x;

        /* renamed from: y */
        public InterfaceC0017f f6047y;

        /* renamed from: z */
        public InterfaceC0017f f6048z;

        /* renamed from: com.zykj.huiwei.launcher.app.a$l$a */
        public static final class a implements InterfaceC0017f {

            /* renamed from: a */
            public final j f6049a;

            /* renamed from: b */
            public final d f6050b;

            /* renamed from: c */
            public final l f6051c;

            /* renamed from: d */
            public final int f6052d;

            public a(j jVar, d dVar, l lVar, int i6) {
                this.f6049a = jVar;
                this.f6050b = dVar;
                this.f6051c = lVar;
                this.f6052d = i6;
            }

            @Override // javax.inject.Provider
            public Object get() {
                switch (this.f6052d) {
                    case 0:
                        return new AppUpdateViewModel();
                    case 1:
                        return new ChangeAvatarViewModel(this.f6051c.m5276f(), (HomeRepository) this.f6051c.f6028f.get(), (DataStore) this.f6049a.f6000e.get());
                    case 2:
                        return new HomeRepository((HomeService) this.f6049a.f6008m.get());
                    case 3:
                        return new ChangePsdViewModel(this.f6051c.m5276f(), this.f6051c.f6023a);
                    case 4:
                        return new CustomerServiceViewModel(this.f6051c.m5276f());
                    case 5:
                        return new DetailViewModel((GalleryRepository) this.f6051c.f6032j.get());
                    case 6:
                        return new GalleryRepository((PictureService) this.f6049a.f6009n.get());
                    case 7:
                        return new GalleryViewModel((GalleryRepository) this.f6051c.f6032j.get());
                    case 8:
                        return new HomeViewModel((HomeRepository) this.f6051c.f6028f.get(), (NotificationRepository) this.f6051c.f6035m.get(), (DataStore) this.f6049a.f6002g.get(), (DataStore) this.f6049a.f6000e.get(), (DataStore) this.f6049a.f5999d.get(), (C7812b) this.f6051c.f6036n.get());
                    case 9:
                        return new NotificationRepository((NotificationService) this.f6049a.f6010o.get());
                    case 10:
                        return new C7812b((GatewayService) this.f6049a.f6011p.get());
                    case 11:
                        return new HuiWeiAppListViewModel((MutableStateFlow) this.f6049a.f6012q.get(), (HomeService) this.f6049a.f6008m.get());
                    case 12:
                        return new LCAppListViewModel((MutableStateFlow) this.f6049a.f6012q.get());
                    case 13:
                        return new LoginViewModel((DataStore) this.f6049a.f5999d.get(), (DataStore) this.f6049a.f6000e.get(), (DataStore) this.f6049a.f6001f.get(), (DataStore) this.f6049a.f6002g.get(), (MutableStateFlow) this.f6049a.f6003h.get(), (AuthRepository) this.f6051c.f6040r.get(), (C7812b) this.f6051c.f6036n.get(), this.f6051c.m5276f(), this.f6051c.m5274d(), AbstractC7913b.m9709a(this.f6049a.f5996a));
                    case 14:
                        return new AuthRepository((AuthService) this.f6049a.f6005j.get());
                    case 15:
                        return new MainViewModel((MutableStateFlow) this.f6049a.f6012q.get(), (MutableSharedFlow) this.f6049a.f6004i.get(), AbstractC7913b.m9709a(this.f6049a.f5996a), (GalleryRepository) this.f6051c.f6032j.get(), (DataStore) this.f6049a.f6000e.get());
                    case 16:
                        return new ModifyPasswordViewModel(this.f6051c.m5276f());
                    case 17:
                        return new NotificationViewModel((NotificationRepository) this.f6051c.f6035m.get(), (DataStore) this.f6049a.f5999d.get());
                    case 18:
                        return new ResetPwdViewModel(this.f6051c.m5276f(), this.f6051c.f6023a);
                    case 19:
                        return new ShareViewModel((GalleryRepository) this.f6051c.f6032j.get());
                    case 20:
                        return new TipsViewModel();
                    case 21:
                        return new UnAuthorViewModel();
                    case 22:
                        return new VersionViewModel(this.f6051c.m5277g(), (DataStore) this.f6049a.f6015t.get());
                    default:
                        throw new AssertionError(this.f6052d);
                }
            }
        }

        public l(j jVar, d dVar, SavedStateHandle savedStateHandle, InterfaceC7650c interfaceC7650c) {
            this.f6024b = jVar;
            this.f6025c = dVar;
            this.f6023a = savedStateHandle;
            m5275e(savedStateHandle, interfaceC7650c);
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC6253d
        /* renamed from: a */
        public Map mo5272a() {
            return C0014c.m19a(C0015d.m21b(18).m23c(AbstractC7305b.f9286a, this.f6027e).m23c(AbstractC7311e.f9290a, this.f6029g).m23c(AbstractC6235o.f7542a, this.f6030h).m23c(AbstractC7319i.f9305a, this.f6031i).m23c(AbstractC6482y.f8274a, this.f6033k).m23c(AbstractC6661p0.f8773a, this.f6034l).m23c(AbstractC7337r.f9314a, this.f6037o).m23c(AbstractC6411f.f8087a, this.f6038p).m23c(AbstractC6415j.f8089a, this.f6039q).m23c(AbstractC7341u.f9317a, this.f6041s).m23c(AbstractC7345y.f9319a, this.f6042t).m23c(AbstractC7306b0.f9287a, this.f6043u).m23c(AbstractC7312e0.f9291a, this.f6044v).m23c(AbstractC7318h0.f9304a, this.f6045w).m23c(AbstractC7400v.f9436a, this.f6046x).m23c(AbstractC7324k0.f9308a, this.f6047y).m23c(AbstractC7330n0.f9311a, this.f6048z).m23c(AbstractC7336q0.f9313a, this.f6022A).m22a());
        }

        @Override // dagger.hilt.android.internal.lifecycle.HiltViewModelFactory.InterfaceC6253d
        /* renamed from: b */
        public Map mo5273b() {
            return Collections.EMPTY_MAP;
        }

        /* renamed from: d */
        public C7811a m5274d() {
            return new C7811a((DeviceService) this.f6024b.f6013r.get());
        }

        /* renamed from: e */
        public final void m5275e(SavedStateHandle savedStateHandle, InterfaceC7650c interfaceC7650c) {
            this.f6027e = new a(this.f6024b, this.f6025c, this.f6026d, 0);
            this.f6028f = C0013b.m16b(new a(this.f6024b, this.f6025c, this.f6026d, 2));
            this.f6029g = new a(this.f6024b, this.f6025c, this.f6026d, 1);
            this.f6030h = new a(this.f6024b, this.f6025c, this.f6026d, 3);
            this.f6031i = new a(this.f6024b, this.f6025c, this.f6026d, 4);
            this.f6032j = C0013b.m16b(new a(this.f6024b, this.f6025c, this.f6026d, 6));
            this.f6033k = new a(this.f6024b, this.f6025c, this.f6026d, 5);
            this.f6034l = new a(this.f6024b, this.f6025c, this.f6026d, 7);
            this.f6035m = C0013b.m16b(new a(this.f6024b, this.f6025c, this.f6026d, 9));
            this.f6036n = C0013b.m16b(new a(this.f6024b, this.f6025c, this.f6026d, 10));
            this.f6037o = new a(this.f6024b, this.f6025c, this.f6026d, 8);
            this.f6038p = new a(this.f6024b, this.f6025c, this.f6026d, 11);
            this.f6039q = new a(this.f6024b, this.f6025c, this.f6026d, 12);
            this.f6040r = C0013b.m16b(new a(this.f6024b, this.f6025c, this.f6026d, 14));
            this.f6041s = new a(this.f6024b, this.f6025c, this.f6026d, 13);
            this.f6042t = new a(this.f6024b, this.f6025c, this.f6026d, 15);
            this.f6043u = new a(this.f6024b, this.f6025c, this.f6026d, 16);
            this.f6044v = new a(this.f6024b, this.f6025c, this.f6026d, 17);
            this.f6045w = new a(this.f6024b, this.f6025c, this.f6026d, 18);
            this.f6046x = new a(this.f6024b, this.f6025c, this.f6026d, 19);
            this.f6047y = new a(this.f6024b, this.f6025c, this.f6026d, 20);
            this.f6048z = new a(this.f6024b, this.f6025c, this.f6026d, 21);
            this.f6022A = new a(this.f6024b, this.f6025c, this.f6026d, 22);
        }

        /* renamed from: f */
        public UserRepository m5276f() {
            return new UserRepository((UserService) this.f6024b.f6007l.get());
        }

        /* renamed from: g */
        public C7814d m5277g() {
            return new C7814d((VersionService) this.f6024b.f6014s.get());
        }
    }

    /* renamed from: a */
    public static e m5208a() {
        return new e();
    }
}
