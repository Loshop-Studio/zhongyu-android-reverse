package com.taobao.sophix.p089a;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.C7752a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p094c.C7733c;
import com.taobao.sophix.p095d.C7734a;
import com.taobao.sophix.p095d.p096a.C7735a;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7746g;
import com.taobao.sophix.p099e.C7749j;
import com.taobao.sophix.p099e.C7751l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.taobao.sophix.a.e */
/* loaded from: classes5.dex */
public class C7717e extends SophixManager {

    /* renamed from: a */
    public static C7717e f13315a = new C7717e();

    /* renamed from: b */
    private String f13316b;

    /* renamed from: c */
    private PatchLoadStatusListener f13317c;

    /* renamed from: f */
    private C7715c f13320f;

    /* renamed from: g */
    private boolean f13321g = false;

    /* renamed from: d */
    private AtomicBoolean f13318d = new AtomicBoolean(false);

    /* renamed from: e */
    private C7734a f13319e = new C7734a();

    private C7717e() {
        C7715c c7715c = new C7715c();
        this.f13320f = c7715c;
        c7715c.m10235a(this.f13319e);
        this.f13317c = new C7752a();
    }

    /* renamed from: c */
    private void m10254c() {
        if (C7728b.f13354b == null) {
            throw new RuntimeException("app is null");
        }
        if (this.f13318d.compareAndSet(false, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String absolutePath = C7742c.m10381a(C7728b.f13354b.getFilesDir(), "sophix").getAbsolutePath();
            this.f13320f.m10237a(absolutePath);
            C7728b.f13353a = C7749j.m10424a(C7728b.f13354b, "hpatch_version", 0);
            C7744e.m10402c("SophixManager", "Sophix starting...", "sdk", SophixManager.VERSION, "main process", Boolean.valueOf(C7746g.m10408a(C7728b.f13354b)), HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, Build.FINGERPRINT, "app version", this.f13316b, "patch version", Integer.valueOf(C7728b.f13353a));
            C7735a.m10349a(0, true);
            this.f13319e.m10346a(absolutePath, this.f13316b);
            this.f13320f.m10246c(false);
            this.f13320f.m10249d(false);
            this.f13320f.m10239a(this.f13316b, this.f13317c);
            C7744e.m10400b("SophixManager", "initialize", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void cleanPatches() {
        m10258a(true);
    }

    @Override // com.taobao.sophix.SophixManager
    public Object getPatchStateInfo() {
        return this.f13320f.m10248d();
    }

    @Override // com.taobao.sophix.SophixManager
    public void initialize() {
        try {
            m10254c();
        } catch (Throwable th) {
            C7744e.m10399b("SophixManager", "init", th, new Object[0]);
            if (C7713a.m10214a()) {
                throw th;
            }
            m10258a(false);
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void killProcessSafely() {
        this.f13320f.m10250e();
    }

    @Override // com.taobao.sophix.SophixManager
    public void queryAndLoadNewPatch() {
        C7733c c7733c = new C7733c(1);
        c7733c.f13368d = C7728b.f13353a == -1 ? 0 : C7728b.f13353a;
        m10256a(null, c7733c, this.f13317c);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAesKey(String str) {
        this.f13320f.m10244b(str);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAppVersion(String str) {
        this.f13316b = str;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setContext(Application application) {
        if (this.f13318d.get()) {
            C7744e.m10400b("SophixManager", "setContext", "can not set app again");
            return this;
        }
        C7728b.f13354b = application;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableClassLoaderLog() {
        this.f13321g = true;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableDebug(boolean z10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f13318d.get()) {
            C7744e.m10400b("SophixManager", "setEnableDebug", "can not set debug state again");
            return this;
        }
        this.f13320f.m10241a(z10);
        if (z10) {
            C7744e.m10397a(C7744e.a.D);
        } else {
            C7744e.m10397a(C7744e.a.I);
        }
        try {
            C7728b.f13354b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudSenderDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z10));
            return this;
        } catch (Exception e10) {
            C7744e.m10392a("SophixManager", "alicloudSender fail to invoke debug", e10, new Object[0]);
            return this;
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableFullLog() {
        C7744e.m10398a(true);
        C7744e.m10397a(C7744e.a.V);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setHost(String str, boolean z10) {
        C7744e.m10402c("SophixManager", "setHost", new Object[0]);
        C7735a.m10350a(str, z10);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public void setOatSdkVersion(int i10) {
        C7749j.m10429b(C7728b.f13354b, "oat_sdk_int", i10);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPatchLoadStatusStub(PatchLoadStatusListener patchLoadStatusListener) {
        if (patchLoadStatusListener != null) {
            this.f13317c = patchLoadStatusListener;
            C7728b.f13359g = patchLoadStatusListener;
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPreLoadedClass(Class cls) {
        this.f13320f.m10243b(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setProcessSpecialClass(Class cls) {
        this.f13320f.m10236a(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setSecretMetaData(String str, String str2, String str3) {
        this.f13319e.m10347a(str, str2, str3);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setTags(List<String> list) {
        if (list != null && list.size() > 0) {
            this.f13319e.m10348a(new ArrayList(list));
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUnsupportedModel(String str, int i10) {
        this.f13320f.m10238a(str, i10);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUsingEnhance() {
        this.f13320f.m10251f();
        return this;
    }

    /* renamed from: a */
    public boolean m10259a() {
        return this.f13321g;
    }

    /* renamed from: b */
    public void m10260b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f13320f.m10242b();
    }

    /* renamed from: a */
    public void m10256a(final String str, final C7733c c7733c, final PatchLoadStatusListener patchLoadStatusListener) {
        Application application = C7728b.f13354b;
        if (application != null) {
            if (!C7746g.m10408a(application)) {
                C7744e.m10403d("SophixManager", "queryLoadPatch", "not in main progress, skip");
                return;
            } else {
                C7751l.m10436a(new Runnable() { // from class: com.taobao.sophix.a.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String strM10345a = C7717e.this.f13319e.m10345a(str, c7733c, patchLoadStatusListener);
                        if (TextUtils.isEmpty(strM10345a)) {
                            return;
                        }
                        C7717e.this.f13320f.m10240a(strM10345a, patchLoadStatusListener, c7733c);
                    }
                });
                return;
            }
        }
        throw new RuntimeException("app is null");
    }

    /* renamed from: a */
    public void m10257a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f13320f.m10247c()) {
            C7744e.m10403d("SophixManager", "addPatch", "forbid loading local patch for secure reason in release mode");
            return;
        }
        C7733c c7733c = new C7733c(1);
        c7733c.f13368d = -1;
        this.f13320f.m10240a(str, patchLoadStatusListener, c7733c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x007e A[EXC_TOP_SPLITTER, PHI: r1 r2
      0x007e: PHI (r1v6 java.lang.String) = (r1v14 java.lang.String), (r1v16 java.lang.String), (r1v9 java.lang.String), (r1v9 java.lang.String) binds: [B:53:0x009f, B:61:0x00af, B:36:0x007b, B:33:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x007e: PHI (r2v7 java.io.FileOutputStream) = 
      (r2v5 java.io.FileOutputStream)
      (r2v6 java.io.FileOutputStream)
      (r2v13 java.io.FileOutputStream)
      (r2v13 java.io.FileOutputStream)
     binds: [B:53:0x009f, B:61:0x00af, B:36:0x007b, B:33:0x0076] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m10255a(android.net.Uri r7, com.taobao.sophix.listener.PatchLoadStatusListener r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p089a.C7717e.m10255a(android.net.Uri, com.taobao.sophix.listener.PatchLoadStatusListener):void");
    }

    /* renamed from: a */
    public void m10258a(boolean z10) {
        this.f13320f.m10245b(z10);
    }
}
