package com.taobao.sophix.p059a;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import com.taobao.sophix.SophixManager;
import com.taobao.sophix.listener.C6647a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p064c.C6627c;
import com.taobao.sophix.p065d.C6628a;
import com.taobao.sophix.p065d.p066a.C6629a;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6640g;
import com.taobao.sophix.p069e.C6643j;
import com.taobao.sophix.p069e.C6645l;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.taobao.sophix.a.e */
/* loaded from: classes4.dex */
public class C6611e extends SophixManager {

    /* renamed from: a */
    public static C6611e f5450a = new C6611e();

    /* renamed from: b */
    private String f5451b;

    /* renamed from: c */
    private PatchLoadStatusListener f5452c;

    /* renamed from: f */
    private C6609c f5455f;

    /* renamed from: g */
    private boolean f5456g = false;

    /* renamed from: d */
    private AtomicBoolean f5453d = new AtomicBoolean(false);

    /* renamed from: e */
    private C6628a f5454e = new C6628a();

    private C6611e() {
        C6609c c6609c = new C6609c();
        this.f5455f = c6609c;
        c6609c.m4723a(this.f5454e);
        this.f5452c = new C6647a();
    }

    /* renamed from: c */
    private void m4742c() {
        if (C6622b.f5489b == null) {
            throw new RuntimeException("app is null");
        }
        if (this.f5453d.compareAndSet(false, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String absolutePath = C6636c.m4869a(C6622b.f5489b.getFilesDir(), "sophix").getAbsolutePath();
            this.f5455f.m4725a(absolutePath);
            C6622b.f5488a = C6643j.m4912a(C6622b.f5489b, "hpatch_version", 0);
            C6638e.m4890c("SophixManager", "Sophix starting...", "sdk", SophixManager.VERSION, "main process", Boolean.valueOf(C6640g.m4896a(C6622b.f5489b)), "fingerprint", Build.FINGERPRINT, "app version", this.f5451b, "patch version", Integer.valueOf(C6622b.f5488a));
            C6629a.m4837a(0, true);
            this.f5454e.m4834a(absolutePath, this.f5451b);
            this.f5455f.m4734c(false);
            this.f5455f.m4737d(false);
            this.f5455f.m4727a(this.f5451b, this.f5452c);
            C6638e.m4888b("SophixManager", "initialize", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void cleanPatches() {
        m4746a(true);
    }

    @Override // com.taobao.sophix.SophixManager
    public Object getPatchStateInfo() {
        return this.f5455f.m4736d();
    }

    @Override // com.taobao.sophix.SophixManager
    public void initialize() {
        try {
            m4742c();
        } catch (Throwable th) {
            C6638e.m4887b("SophixManager", "init", th, new Object[0]);
            if (C6607a.m4702a()) {
                throw th;
            }
            m4746a(false);
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public void killProcessSafely() {
        this.f5455f.m4738e();
    }

    @Override // com.taobao.sophix.SophixManager
    public void queryAndLoadNewPatch() {
        C6627c c6627c = new C6627c(1);
        c6627c.f5503d = C6622b.f5488a == -1 ? 0 : C6622b.f5488a;
        m4744a(null, c6627c, this.f5452c);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAesKey(String str) {
        this.f5455f.m4732b(str);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setAppVersion(String str) {
        this.f5451b = str;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setContext(Application application) {
        if (this.f5453d.get()) {
            C6638e.m4888b("SophixManager", "setContext", "can not set app again");
            return this;
        }
        C6622b.f5489b = application;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableClassLoaderLog() {
        this.f5456g = true;
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableDebug(boolean z9) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (this.f5453d.get()) {
            C6638e.m4888b("SophixManager", "setEnableDebug", "can not set debug state again");
            return this;
        }
        this.f5455f.m4729a(z9);
        if (z9) {
            C6638e.m4885a(C6638e.a.D);
        } else {
            C6638e.m4885a(C6638e.a.I);
        }
        try {
            C6622b.f5489b.getClassLoader().loadClass("com.ta.utdid2.device.SophixInvoker").getDeclaredMethod("invokeAlicloudSenderDebug", Boolean.TYPE).invoke(null, Boolean.valueOf(z9));
            return this;
        } catch (Exception e10) {
            C6638e.m4880a("SophixManager", "alicloudSender fail to invoke debug", e10, new Object[0]);
            return this;
        }
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setEnableFullLog() {
        C6638e.m4886a(true);
        C6638e.m4885a(C6638e.a.V);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setHost(String str, boolean z9) {
        C6638e.m4890c("SophixManager", "setHost", new Object[0]);
        C6629a.m4838a(str, z9);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public void setOatSdkVersion(int i9) {
        C6643j.m4917b(C6622b.f5489b, "oat_sdk_int", i9);
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPatchLoadStatusStub(PatchLoadStatusListener patchLoadStatusListener) {
        if (patchLoadStatusListener != null) {
            this.f5452c = patchLoadStatusListener;
            C6622b.f5494g = patchLoadStatusListener;
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setPreLoadedClass(Class cls) {
        this.f5455f.m4731b(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setProcessSpecialClass(Class cls) {
        this.f5455f.m4724a(cls);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setSecretMetaData(String str, String str2, String str3) {
        this.f5454e.m4835a(str, str2, str3);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setTags(List<String> list) {
        if (list != null && list.size() > 0) {
            this.f5454e.m4836a(new ArrayList(list));
        }
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUnsupportedModel(String str, int i9) {
        this.f5455f.m4726a(str, i9);
        return this;
    }

    @Override // com.taobao.sophix.SophixManager
    public SophixManager setUsingEnhance() {
        this.f5455f.m4739f();
        return this;
    }

    /* renamed from: a */
    public boolean m4747a() {
        return this.f5456g;
    }

    /* renamed from: b */
    public void m4748b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f5455f.m4730b();
    }

    /* renamed from: a */
    public void m4744a(final String str, final C6627c c6627c, final PatchLoadStatusListener patchLoadStatusListener) {
        Application application = C6622b.f5489b;
        if (application != null) {
            if (!C6640g.m4896a(application)) {
                C6638e.m4891d("SophixManager", "queryLoadPatch", "not in main progress, skip");
                return;
            } else {
                C6645l.m4924a(new Runnable() { // from class: com.taobao.sophix.a.e.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String strM4833a = C6611e.this.f5454e.m4833a(str, c6627c, patchLoadStatusListener);
                        if (TextUtils.isEmpty(strM4833a)) {
                            return;
                        }
                        C6611e.this.f5455f.m4728a(strM4833a, patchLoadStatusListener, c6627c);
                    }
                });
                return;
            }
        }
        throw new RuntimeException("app is null");
    }

    /* renamed from: a */
    public void m4745a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        if (!this.f5455f.m4735c()) {
            C6638e.m4891d("SophixManager", "addPatch", "forbid loading local patch for secure reason in release mode");
            return;
        }
        C6627c c6627c = new C6627c(1);
        c6627c.f5503d = -1;
        this.f5455f.m4728a(str, patchLoadStatusListener, c6627c);
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
    public void m4743a(android.net.Uri r7, com.taobao.sophix.listener.PatchLoadStatusListener r8) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p059a.C6611e.m4743a(android.net.Uri, com.taobao.sophix.listener.PatchLoadStatusListener):void");
    }

    /* renamed from: a */
    public void m4746a(boolean z9) {
        this.f5455f.m4733b(z9);
    }
}
