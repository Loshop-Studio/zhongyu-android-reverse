package com.taobao.sophix.p042a;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.C6387a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p047c.C6367c;
import com.taobao.sophix.p048d.C6368a;
import com.taobao.sophix.p048d.p049a.C6369a;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6380g;
import com.taobao.sophix.p052e.C6383j;
import com.taobao.sophix.p052e.C6385l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.taobao.sophix.a.e */
/* loaded from: classes4.dex */
public class C6351e extends SophixManager {

    /* renamed from: a */
    public static C6351e f4873a = new C6351e();

    /* renamed from: b */
    private String f4874b;

    /* renamed from: c */
    private PatchLoadStatusListener f4875c;

    /* renamed from: f */
    private C6349c f4878f;

    /* renamed from: g */
    private boolean f4879g = false;

    /* renamed from: d */
    private AtomicBoolean f4876d = new AtomicBoolean(false);

    /* renamed from: e */
    private C6368a f4877e = new C6368a();

    private C6351e() {
        C6349c c6349c = new C6349c();
        this.f4878f = c6349c;
        c6349c.m4544a(this.f4877e);
        this.f4875c = new C6387a();
    }

    /* renamed from: c */
    private void m4563c() {
        if (C6362b.f4912b == null) {
            throw new RuntimeException("app is null");
        }
        if (this.f4876d.compareAndSet(false, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String absolutePath = C6376c.m4690a(C6362b.f4912b.getFilesDir(), "sophix").getAbsolutePath();
            this.f4878f.m4546a(absolutePath);
            C6362b.f4911a = C6383j.m4733a(C6362b.f4912b, "hpatch_version", 0);
            C6378e.m4711c("SophixManager", "Sophix starting...", "sdk", SophixManager.VERSION, "main process", Boolean.valueOf(C6380g.m4717a(C6362b.f4912b)), "fingerprint", Build.FINGERPRINT, "app version", this.f4874b, "patch version", Integer.valueOf(C6362b.f4911a));
            C6369a.m4658a(0, true);
            this.f4877e.m4655a(absolutePath, this.f4874b);
            this.f4878f.m4555c(false);
            this.f4878f.m4558d(false);
            this.f4878f.m4548a(this.f4874b, this.f4875c);
            C6378e.m4709b("SophixManager", "initialize", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void cleanPatches() {
        m4567a(true);
    }

    @Override // com.taobao.sophix.SophixManager
    public Object getPatchStateInfo() {
        return this.f4878f.m4557d();
    }

    @Override // com.taobao.sophix.SophixManager
    public void initialize() {
        try {
            m4563c();
        } catch (Throwable th) {
            C6378e.m4708b("SophixManager", "init", th, new Object[0]);
            if (C6347a.m4523a()) {
                throw th;
            }
            m4567a(false);
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void killProcessSafely() {
        this.f4878f.m4559e();
    }

    @Override // com.taobao.sophix.SophixManager
    public void queryAndLoadNewPatch() {
        C6367c c6367c = new C6367c(1);
        c6367c.f4926d = C6362b.f4911a == -1 ? 0 : C6362b.f4911a;
        m4565a(null, c6367c, this.f4875c);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAesKey(String str) {
        this.f4878f.m4553b(str);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAppVersion(String str) {
        this.f4874b = str;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setContext(Application application) {
        if (this.f4876d.get()) {
            C6378e.m4709b("SophixManager", "setContext", "can not set app again");
            return this;
        }
        C6362b.f4912b = application;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableClassLoaderLog() {
        this.f4879g = true;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableDebug(boolean z9) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f4876d.get()) {
            C6378e.m4709b("SophixManager", "setEnableDebug", "can not set debug state again");
            return this;
        }
        this.f4878f.m4550a(z9);
        if (z9) {
            C6378e.m4706a(C6378e.a.D);
        } else {
            C6378e.m4706a(C6378e.a.I);
        }
        try {
            C6362b.f4912b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudSenderDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z9));
            return this;
        } catch (Exception e10) {
            C6378e.m4701a("SophixManager", "alicloudSender fail to invoke debug", e10, new Object[0]);
            return this;
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableFullLog() {
        C6378e.m4707a(true);
        C6378e.m4706a(C6378e.a.V);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setHost(String str, boolean z9) {
        C6378e.m4711c("SophixManager", "setHost", new Object[0]);
        C6369a.m4659a(str, z9);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public void setOatSdkVersion(int i10) {
        C6383j.m4738b(C6362b.f4912b, "oat_sdk_int", i10);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPatchLoadStatusStub(PatchLoadStatusListener patchLoadStatusListener) {
        if (patchLoadStatusListener != null) {
            this.f4875c = patchLoadStatusListener;
            C6362b.f4917g = patchLoadStatusListener;
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPreLoadedClass(Class cls) {
        this.f4878f.m4552b(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setProcessSpecialClass(Class cls) {
        this.f4878f.m4545a(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setSecretMetaData(String str, String str2, String str3) {
        this.f4877e.m4656a(str, str2, str3);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setTags(List<String> list) {
        if (list != null && list.size() > 0) {
            this.f4877e.m4657a(new ArrayList(list));
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUnsupportedModel(String str, int i10) {
        this.f4878f.m4547a(str, i10);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUsingEnhance() {
        this.f4878f.m4560f();
        return this;
    }

    /* renamed from: a */
    public boolean m4568a() {
        return this.f4879g;
    }

    /* renamed from: b */
    public void m4569b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f4878f.m4551b();
    }

    /* renamed from: a */
    public void m4565a(final String str, final C6367c c6367c, final PatchLoadStatusListener patchLoadStatusListener) {
        Application application = C6362b.f4912b;
        if (application != null) {
            if (!C6380g.m4717a(application)) {
                C6378e.m4712d("SophixManager", "queryLoadPatch", "not in main progress, skip");
                return;
            } else {
                C6385l.m4745a(new Runnable() { // from class: com.taobao.sophix.a.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String strM4654a = C6351e.this.f4877e.m4654a(str, c6367c, patchLoadStatusListener);
                        if (TextUtils.isEmpty(strM4654a)) {
                            return;
                        }
                        C6351e.this.f4878f.m4549a(strM4654a, patchLoadStatusListener, c6367c);
                    }
                });
                return;
            }
        }
        throw new RuntimeException("app is null");
    }

    /* renamed from: a */
    public void m4566a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f4878f.m4556c()) {
            C6378e.m4712d("SophixManager", "addPatch", "forbid loading local patch for secure reason in release mode");
            return;
        }
        C6367c c6367c = new C6367c(1);
        c6367c.f4926d = -1;
        this.f4878f.m4549a(str, patchLoadStatusListener, c6367c);
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
    public void m4564a(android.net.Uri r7, com.taobao.sophix.listener.PatchLoadStatusListener r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p042a.C6351e.m4564a(android.net.Uri, com.taobao.sophix.listener.PatchLoadStatusListener):void");
    }

    /* renamed from: a */
    public void m4567a(boolean z9) {
        this.f4878f.m4554b(z9);
    }
}
