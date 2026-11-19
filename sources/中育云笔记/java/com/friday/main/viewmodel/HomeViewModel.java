package com.friday.main.viewmodel;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.blankj.utilcode.util.SPUtils;
import com.friday.common.base.BaseViewModel;
import com.friday.common.dao.FileDao;
import com.friday.common.dao.UserDao;
import com.friday.common.entity.FileEntity;
import com.friday.common.helper.C5962b;
import com.friday.common.network.StudentSession;
import com.friday.main.model.VersionUpdate;
import com.friday.main.viewmodel.HomeViewModel;
import com.zykj.http.bean.HeaderBean;
import com.zykj.message.server.bean.ServerInfo;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import je.AbstractC9746z;
import je.C9742v;
import je.C9743w;
import je.C9745y;
import je.InterfaceC9725e;
import je.InterfaceC9726f;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p126e2.C9072a;
import p181hd.InterfaceC9529a;
import p309qc.C10786q;
import p310qd.AbstractC10819z;
import p356u3.InterfaceC11364a;
import p375v7.InterfaceC11548a;
import p379vd.AbstractC11608q;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11602k;
import p379vd.InterfaceC11603l;
import p393wc.AbstractC11725a;
import sd.AbstractC11109f;
import sd.AbstractC11117h;
import sd.C11157r0;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class HomeViewModel extends BaseViewModel {

    /* renamed from: b */
    public final InterfaceC11364a f9605b;

    /* renamed from: c */
    public final StudentSession f9606c;

    /* renamed from: d */
    public final FileDao f9607d;

    /* renamed from: e */
    public final UserDao f9608e;

    /* renamed from: f */
    public final InterfaceC11603l f9609f;

    /* renamed from: g */
    public final InterfaceC11602k f9610g;

    /* renamed from: h */
    public final InterfaceC11603l f9611h;

    /* renamed from: i */
    public final InterfaceC11602k f9612i;

    /* renamed from: j */
    public final ServiceConnection f9613j;

    /* renamed from: k */
    public final MutableLiveData f9614k;

    /* renamed from: l */
    public final MutableLiveData f9615l;

    /* renamed from: com.friday.main.viewmodel.HomeViewModel$a */
    public static final class C6224a implements InterfaceC9726f {
        public C6224a() {
        }

        @Override // je.InterfaceC9726f
        /* renamed from: a */
        public void mo7268a(InterfaceC9725e call, IOException e10) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(e10, "e");
        }

        @Override // je.InterfaceC9726f
        /* renamed from: b */
        public void mo7269b(InterfaceC9725e call, C9745y response) {
            AbstractC9979u.m20294g(call, "call");
            AbstractC9979u.m20294g(response, "response");
            AbstractC9746z abstractC9746zM19628e = response.m19628e();
            String strString = abstractC9746zM19628e != null ? abstractC9746zM19628e.string() : null;
            if (strString != null) {
                HomeViewModel homeViewModel = HomeViewModel.this;
                try {
                    VersionUpdate versionUpdate = (VersionUpdate) GsonUtils.fromJson(strString, VersionUpdate.class);
                    SPUtils.getInstance().put("updateInfo", strString);
                    if (versionUpdate.getResult().getVersionCode() > AppUtils.getAppVersionCode()) {
                        homeViewModel.m7263v().postValue(new C9072a(versionUpdate));
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: com.friday.main.viewmodel.HomeViewModel$b */
    public static final class ServiceConnectionC6225b implements ServiceConnection {
        public ServiceConnectionC6225b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            HomeViewModel.this.m7259r().setValue(InterfaceC11548a.a.m25412l(iBinder));
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public HomeViewModel(InterfaceC11364a cameraService, StudentSession studentSession, FileDao fileDao, UserDao userDao, InterfaceC11603l headerBeanFlow, InterfaceC11602k unauthorizedFlow) {
        AbstractC9979u.m20294g(cameraService, "cameraService");
        AbstractC9979u.m20294g(studentSession, "studentSession");
        AbstractC9979u.m20294g(fileDao, "fileDao");
        AbstractC9979u.m20294g(userDao, "userDao");
        AbstractC9979u.m20294g(headerBeanFlow, "headerBeanFlow");
        AbstractC9979u.m20294g(unauthorizedFlow, "unauthorizedFlow");
        this.f9605b = cameraService;
        this.f9606c = studentSession;
        this.f9607d = fileDao;
        this.f9608e = userDao;
        this.f9609f = headerBeanFlow;
        this.f9610g = unauthorizedFlow;
        this.f9611h = AbstractC11613v.m25602a(null);
        this.f9612i = AbstractC11608q.m25592b(0, 0, null, 7, null);
        this.f9613j = new ServiceConnectionC6225b();
        this.f9614k = new MutableLiveData();
        this.f9615l = new MutableLiveData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public final long m7245A() {
        return C5962b.f6082a.m5299a().m5292t();
    }

    /* renamed from: p */
    public static final C10786q m7253p(HomeViewModel homeViewModel, FileEntity fileEntity) {
        homeViewModel.f9614k.setValue(fileEntity);
        return C10786q.f26013a;
    }

    /* renamed from: l */
    public final Object m7254l(InterfaceC11588c interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(C11157r0.m24799b(), new HomeViewModel$checkOfficeFile$2(this, null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* renamed from: m */
    public final void m7255m(String packageName) {
        Object objM20054c;
        AbstractC9979u.m20294g(packageName, "packageName");
        if (m7264w()) {
            InterfaceC11548a interfaceC11548a = (InterfaceC11548a) this.f9611h.getValue();
            if (interfaceC11548a != null) {
                AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), C11157r0.m24799b(), null, new HomeViewModel$checkVersion$1$1(interfaceC11548a, this, null), 2, null);
                return;
            }
            return;
        }
        try {
            Result.C9921a c9921a = Result.f23263d;
            int i10 = !m7265x() ? 1 : 0;
            new C9742v.a().m19557c().mo19319b(new C9743w.a().m19608p(((HeaderBean) this.f9609f.getValue()).getServerUrl() + "/api/services/app/AppStore/CheckUpdateAsync?packageName=" + packageName + "&version=" + AppUtils.getAppVersionCode() + "&appType=" + i10).m19595b()).mo19318a(new C6224a());
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Result.m20053a(objM20054c);
    }

    /* renamed from: n */
    public final void m7256n(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        if (m7264w()) {
            Intent intent = new Intent();
            intent.setPackage("cn.com.techvision.appstore");
            intent.setAction("cn.com.techvision.appstore.action.CHECK_UPDATE_SERVICE");
            activity.bindService(intent, this.f9613j, 1);
        }
    }

    /* renamed from: o */
    public final void m7257o(String fileName, String parentId, long j10) {
        AbstractC9979u.m20294g(fileName, "fileName");
        AbstractC9979u.m20294g(parentId, "parentId");
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(new Date());
        String string = UUID.randomUUID().toString();
        AbstractC9979u.m20293f(string, "toString(...)");
        String strM23238K = AbstractC10819z.m23238K(string, "-", "", false, 4, null);
        AbstractC9979u.m20291d(str);
        final FileEntity fileEntity = new FileEntity(strM23238K, j10, fileName, "", "", "0", parentId, str, str, 1, false, 0, false, null, 0, null, false, 0L, false, 516096, null);
        m4804b(new HomeViewModel$createFolder$1(this, fileEntity, null), new HomeViewModel$createFolder$2(this, null), new InterfaceC9529a() { // from class: w3.k
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return HomeViewModel.m7253p(this.f27801c, fileEntity);
            }
        });
    }

    /* renamed from: q */
    public final void m7258q(Activity activity) {
        AbstractC9979u.m20294g(activity, "activity");
        if (m7264w()) {
            activity.unbindService(this.f9613j);
        }
    }

    /* renamed from: r */
    public final InterfaceC11603l m7259r() {
        return this.f9611h;
    }

    /* renamed from: s */
    public final void m7260s() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$getCameraPermission$1(this, null), 3, null);
    }

    /* renamed from: t */
    public final InterfaceC11602k m7261t() {
        return this.f9612i;
    }

    /* renamed from: u */
    public final InterfaceC11602k m7262u() {
        return this.f9610g;
    }

    /* renamed from: v */
    public final MutableLiveData m7263v() {
        return this.f9615l;
    }

    /* renamed from: w */
    public final boolean m7264w() {
        return AppUtils.isAppInstalled("cn.com.techvision.appstore");
    }

    /* renamed from: x */
    public final boolean m7265x() {
        return C5962b.f6082a.m5299a().m5294v();
    }

    /* renamed from: y */
    public final void m7266y() {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$restoreStudentSession$1(this, null), 3, null);
    }

    /* renamed from: z */
    public final void m7267z(ServerInfo serverInfo) {
        AbstractC11117h.m24726d(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$updateServerInfo$1(this, serverInfo, null), 3, null);
    }
}
