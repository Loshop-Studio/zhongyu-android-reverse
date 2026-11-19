package com.taobao.sophix.p059a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p060b.C6616a;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p060b.C6623c;
import com.taobao.sophix.p060b.C6624d;
import com.taobao.sophix.p060b.p061a.p062a.C6619b;
import com.taobao.sophix.p060b.p061a.p063b.C6621b;
import com.taobao.sophix.p064c.C6626b;
import com.taobao.sophix.p064c.C6627c;
import com.taobao.sophix.p064c.InterfaceC6625a;
import com.taobao.sophix.p069e.C6634a;
import com.taobao.sophix.p069e.C6635b;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6640g;
import com.taobao.sophix.p069e.C6641h;
import com.taobao.sophix.p069e.C6642i;
import com.taobao.sophix.p069e.C6643j;
import com.taobao.sophix.p069e.C6644k;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipFile;
import org.json.JSONArray;

/* renamed from: com.taobao.sophix.a.c */
/* loaded from: classes4.dex */
public class C6609c {

    /* renamed from: a */
    private int f5428a;

    /* renamed from: b */
    private File f5429b;

    /* renamed from: c */
    private File f5430c;

    /* renamed from: d */
    private File f5431d;

    /* renamed from: e */
    private File f5432e;

    /* renamed from: f */
    private String f5433f;

    /* renamed from: g */
    private String f5434g;

    /* renamed from: h */
    private boolean f5435h;

    /* renamed from: i */
    private Application f5436i;

    /* renamed from: j */
    private boolean f5437j;

    /* renamed from: k */
    private volatile C6610d f5438k;

    /* renamed from: l */
    private AtomicBoolean f5439l = new AtomicBoolean(false);

    /* renamed from: m */
    private boolean f5440m = false;

    /* renamed from: n */
    private boolean f5441n = false;

    /* renamed from: o */
    private List f5442o = new ArrayList();

    /* renamed from: g */
    private void m4712g() {
        int i9 = this.f5428a | 2;
        this.f5428a = i9;
        C6643j.m4917b(C6622b.f5489b, "SP_SOPHIX_DIR_STATE", i9);
    }

    /* renamed from: h */
    private boolean m4713h() {
        if (C6643j.m4913a(C6622b.f5489b, "happ_version", "NO_FOUND_SOPHIX_APP_VERSION").equals(this.f5433f)) {
            return true;
        }
        if (!this.f5437j) {
            C6638e.m4888b("PatchManager", "checkAppUpdatedForContinue", "app is updated");
            return false;
        }
        C6638e.m4891d("PatchManager", "checkAppUpdatedForContinue", "app is updated. clean old patch.");
        m4733b(false);
        return true;
    }

    /* renamed from: i */
    private boolean m4714i() {
        String strM4913a = C6643j.m4913a(C6622b.f5489b, "sophix_system_fingerprint", "INVALID_SYSTEM_FINGERPRINT");
        if (strM4913a.equals("INVALID_SYSTEM_FINGERPRINT") || strM4913a.equals(Build.FINGERPRINT)) {
            return true;
        }
        if (!this.f5437j) {
            C6638e.m4888b("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened");
            return false;
        }
        C6638e.m4891d("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened, so clear odex files");
        C6636c.m4873a(this.f5429b, new File[]{m4722a()});
        return true;
    }

    /* renamed from: j */
    private void m4715j() {
        if (!this.f5437j) {
            C6638e.m4881a("PatchManager", "prepareCrashHandler", "skip");
            return;
        }
        C6643j.m4917b(C6622b.f5489b, "happ_crash_num", C6643j.m4912a(C6622b.f5489b, "happ_crash_num", 0) + 1);
        C6607a.m4701a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m4716k() {
        if (!C6607a.m4702a() || C6607a.m4703b()) {
            return;
        }
        C6607a.m4701a(false);
        C6643j.m4915a(C6622b.f5489b, "happ_crash_num");
        C6638e.m4888b("PatchManager", "clearCrashHandler", "clear crash flag");
    }

    /* renamed from: l */
    private void m4717l() {
        if (C6643j.m4916a((Context) C6622b.f5489b, "happ_ishotfix", false)) {
            C6638e.m4888b("PatchManager", "clearPreVerified", "skip clear at hot");
            return;
        }
        m4724a(getClass());
        Iterator<Class> it = C6619b.m4765a().iterator();
        while (it.hasNext()) {
            m4724a(it.next());
        }
    }

    /* renamed from: m */
    private void m4718m() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C6641h.f5550a;
            C6641h.m4902a(cls, "mOuterContext").set(C6622b.f5489b.getBaseContext(), this.f5436i);
            Object obj = C6641h.m4902a(cls, "mPackageInfo").get(C6622b.f5489b.getBaseContext());
            C6641h.m4902a(obj.getClass(), "mApplication").set(obj, this.f5436i);
            Object obj2 = C6641h.m4902a(obj.getClass(), "mActivityThread").get(obj);
            C6641h.m4902a(obj2.getClass(), "mInitialApplication").set(obj2, this.f5436i);
            List list = (List) C6641h.m4902a(obj2.getClass(), "mAllApplications").get(obj2);
            for (int i9 = 0; i9 < list.size(); i9++) {
                list.set(i9, this.f5436i);
            }
            C6638e.m4888b("PatchManager", "replaceRealApplication finish", new Object[0]);
        } catch (Exception e10) {
            m4709a("replaceRealApplication fail", e10);
        }
    }

    /* renamed from: n */
    private void m4719n() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsLoadClass;
        try {
            String name = C6622b.f5489b.getClass().getName();
            try {
                clsLoadClass = C6622b.f5489b.getClassLoader().loadClass(name + "$RealApplicationStub");
            } catch (Exception unused) {
                clsLoadClass = C6622b.f5489b.getClassLoader().loadClass(name.replace("_modified_name", "") + "$RealApplicationStub");
            }
            Application application = (Application) ((SophixEntry) clsLoadClass.getAnnotation(SophixEntry.class)).value().newInstance();
            C6641h.m4903a(Application.class, "attach", Context.class).invoke(application, C6622b.f5489b.getBaseContext());
            this.f5436i = application;
            C6638e.m4888b("PatchManager", "callRealAppAttach", "finish call real App.attach, app", application.getClass().getName());
        } catch (Exception e10) {
            m4709a("callRealAppAttach", e10);
        }
    }

    /* renamed from: o */
    private void m4720o() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C6641h.f5551b;
            Object obj = C6641h.m4902a(cls, "mBoundApplication").get(C6641h.m4903a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C6641h.m4902a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                this.f5442o.addAll(list);
                list.clear();
            }
        } catch (Exception e10) {
            m4709a("removeProvidersTemporarily", e10);
        }
    }

    /* renamed from: p */
    private void m4721p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = C6641h.f5551b;
            Object objInvoke = C6641h.m4903a(cls, "currentActivityThread", new Class[0]).invoke(null, null);
            Object obj = C6641h.m4902a(cls, "mBoundApplication").get(C6641h.m4903a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C6641h.m4902a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                list.addAll(this.f5442o);
                this.f5442o.clear();
                C6641h.m4903a(cls, "installContentProviders", Context.class, List.class).invoke(objInvoke, this.f5436i, list);
            }
        } catch (Exception e10) {
            m4709a("installProviders", e10);
        }
    }

    /* renamed from: b */
    public void m4730b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!C6622b.f5493f) {
            C6638e.m4891d("PatchManager", "do not call real App.onCreate", new Object[0]);
        } else {
            if (this.f5436i == null) {
                C6638e.m4891d("PatchManager", "real application is null, fail to call onCreate", new Object[0]);
                return;
            }
            m4718m();
            m4721p();
            this.f5436i.onCreate();
        }
    }

    /* renamed from: c */
    public boolean m4735c() {
        return this.f5435h;
    }

    /* renamed from: d */
    public Object m4736d() {
        return this.f5438k;
    }

    /* renamed from: e */
    public void m4738e() {
        C6638e.m4891d("PatchManager", "killProcessSafely", new Object[0]);
        Process.killProcess(Process.myPid());
    }

    /* renamed from: f */
    public void m4739f() {
        C6635b.m4864a();
    }

    /* renamed from: a */
    public synchronized void m4727a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("app version is null");
            }
            if (C6622b.f5489b == null) {
                throw new RuntimeException("app is null");
            }
            if (!this.f5439l.get()) {
                C6638e.m4890c("PatchManager", "init", "appVersion", str);
                if (C6622b.f5489b instanceof SophixApplication) {
                    C6622b.f5493f = true;
                } else if (Build.VERSION.SDK_INT >= 28) {
                    C6638e.m4891d("PatchManager", "should use stable initialize when android version >= 9.0.", new Object[0]);
                    return;
                }
                this.f5433f = str;
                this.f5437j = C6640g.m4896a(C6622b.f5489b);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C6638e.m4891d("PatchManager", "init recommend to best call in main thread", new Object[0]);
                }
                if (m4713h() && m4714i()) {
                    m4707a(patchLoadStatusListener);
                } else {
                    C6638e.m4891d("PatchManager", "patch is not the newest, skip loading in sub-process", new Object[0]);
                }
                if (C6622b.f5493f) {
                    m4720o();
                    m4719n();
                }
                this.f5439l.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public void m4734c(boolean z9) {
        this.f5440m = z9;
    }

    /* renamed from: d */
    public void m4737d(boolean z9) {
        this.f5441n = z9;
    }

    /* renamed from: b */
    public void m4732b(String str) {
        this.f5434g = str;
    }

    /* renamed from: b */
    public synchronized void m4733b(boolean z9) {
        try {
            C6638e.m4891d("PatchManager", "cleanPatches", "positive", Boolean.valueOf(z9));
            if (m4722a() != null) {
                C6627c c6627c = new C6627c(4);
                c6627c.f5503d = C6622b.f5488a;
                c6627c.f5502c = z9 ? "300" : "301";
                C6626b.m4818a(c6627c);
            }
            C6636c.m4871a(this.f5429b);
            C6636c.m4871a(this.f5430c);
            boolean zM4916a = C6643j.m4916a((Context) C6622b.f5489b, "happ_ishotfix", false);
            String strM4913a = C6643j.m4913a(C6622b.f5489b, "SP_SOPHIX_DEVICE_ID", (String) null);
            C6643j.m4914a(C6622b.f5489b);
            C6622b.m4797a(C6622b.f5488a);
            C6643j.m4918b(C6622b.f5489b, "happ_version", this.f5433f);
            C6643j.m4918b(C6622b.f5489b, "SP_SOPHIX_DEVICE_ID", strM4913a);
            C6643j.m4919b(C6622b.f5489b, "happ_ishotfix", zM4916a);
            C6638e.m4891d("PatchManager", "cleanPatches", "finish clean");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m4725a(String str) {
        File file = new File(str);
        this.f5428a = C6643j.m4912a(C6622b.f5489b, "SP_SOPHIX_DIR_STATE", 0);
        boolean zM4896a = C6640g.m4896a(C6622b.f5489b);
        if (zM4896a && m4710a(2)) {
            int i9 = (~this.f5428a) & 3;
            this.f5428a = i9;
            C6643j.m4917b(C6622b.f5489b, "SP_SOPHIX_DIR_STATE", i9);
        }
        if (m4710a(1)) {
            this.f5429b = C6636c.m4869a(file, "patch_");
            this.f5430c = C6636c.m4869a(file, "libs_");
            this.f5431d = C6636c.m4869a(file, "patch");
            this.f5432e = C6636c.m4869a(file, "libs");
        } else {
            this.f5429b = C6636c.m4869a(file, "patch");
            this.f5430c = C6636c.m4869a(file, "libs");
            this.f5431d = C6636c.m4869a(file, "patch_");
            this.f5432e = C6636c.m4869a(file, "libs_");
        }
        C6638e.m4888b("PatchManager", "initPatchDir", "patchDir", this.f5429b.getName(), "nativeLibDir", this.f5430c.getName());
        C6622b.f5491d = this.f5429b;
        C6622b.f5492e = this.f5430c;
        if (zM4896a) {
            C6636c.m4871a(this.f5431d);
            C6636c.m4871a(this.f5432e);
        }
    }

    /* renamed from: b */
    public void m4731b(Class cls) {
        C6619b.m4772b(cls);
    }

    /* renamed from: a */
    private boolean m4710a(int i9) {
        return (this.f5428a & i9) == i9;
    }

    /* renamed from: a */
    public File m4722a() {
        File[] fileArrListFiles = this.f5429b.listFiles(new FileFilter() { // from class: com.taobao.sophix.a.c.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return file.getName().endsWith(".jar");
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return null;
        }
        return fileArrListFiles[0];
    }

    /* renamed from: a */
    private void m4707a(PatchLoadStatusListener patchLoadStatusListener) {
        if (this.f5437j) {
            if (C6643j.m4912a(C6622b.f5489b, "happ_crash_num", 0) >= 5) {
                C6638e.m4891d("PatchManager", "handleLocalPatch", "continuous crash happened too mush, so cleaning patch by force");
                m4733b(false);
            }
            if (C6643j.m4916a((Context) C6622b.f5489b, "hpatch_clear", false)) {
                C6638e.m4891d("PatchManager", "handleLocalPatch", "force cleaning patch as server require clear");
                m4733b(true);
            }
        }
        File fileM4722a = m4722a();
        if (fileM4722a != null) {
            C6627c c6627c = new C6627c(3);
            c6627c.f5503d = C6622b.f5488a;
            C6622b.f5490c = fileM4722a;
            m4708a(fileM4722a, patchLoadStatusListener, c6627c);
        } else {
            C6638e.m4891d("PatchManager", "handleLocalPatch", "no any patch exists");
        }
        if (this.f5437j) {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.sophix.a.c.2
                @Override // java.lang.Runnable
                public void run() {
                    C6609c.this.m4716k();
                }
            }, 3000L);
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0248: INVOKE (r6 I:java.util.zip.ZipFile) STATIC call: com.taobao.sophix.e.c.a(java.util.zip.ZipFile):void A[Catch: all -> 0x0025, MD:(java.util.zip.ZipFile):void throws java.io.IOException (m), TRY_ENTER] (LINE:133), block:B:121:0x0248 */
    /* renamed from: a */
    public synchronized void m4728a(String str, PatchLoadStatusListener patchLoadStatusListener, C6627c c6627c) {
        ZipFile zipFile;
        ZipFile zipFileM4875a;
        File file;
        Attributes attributesM4705a;
        boolean z9;
        boolean z10;
        C6638e.m4881a("PatchManager", "addPatch", "src patch", str);
        if (!this.f5439l.get()) {
            C6638e.m4892e("PatchManager", "addPatch", "did not init before!!");
            return;
        }
        File file2 = null;
        try {
            try {
                file = new File(str);
            } catch (Throwable th) {
                C6636c.m4875a(zipFileM4875a);
                throw th;
            }
        } catch (C6608b e10) {
            e = e10;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
        if (!TextUtils.isEmpty(str) && file.exists() && file.isFile() && file.getName().endsWith(".jar")) {
            if (C6644k.m4921a()) {
                boolean z11 = true;
                boolean z12 = m4722a() != null;
                File file3 = z12 ? this.f5431d : this.f5429b;
                C6636c.m4871a(file3);
                File file4 = new File(file3, file.getName());
                try {
                    try {
                        C6636c.m4872a(file, file4);
                        C6638e.m4881a("PatchManager", "addPatch", "dest patch", file4.getName());
                        C6622b.m4797a(c6627c.f5503d);
                        if (!TextUtils.isEmpty(this.f5434g)) {
                            C6638e.m4888b("PatchManager", "addPatch", "aes key is set, do decrypt...");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (C6634a.m4860a(file4.getAbsolutePath(), this.f5434g) && file4.exists()) {
                                C6638e.m4881a("PatchManager", "addPatch", "finish local aes decrypt patch(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            } else {
                                throw new C6608b(72, "aes decrypt fail");
                            }
                        }
                        attributesM4705a = m4705a(file4);
                        String value = attributesM4705a.getValue("Modified-So");
                        zipFile = new ZipFile(file4);
                        try {
                            if (TextUtils.isEmpty(value)) {
                                z9 = false;
                            } else {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C6638e.m4881a("PatchManager", "addPatch", "start unzip lib file");
                                new C6623c().m4806a(value, zipFile, z12 ? this.f5432e : this.f5430c);
                                C6638e.m4881a("PatchManager", "addPatch", "finish unzip lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                z9 = true;
                            }
                            if (z12) {
                                m4712g();
                            }
                            z10 = m4711a(attributesM4705a) && !this.f5441n && C6621b.m4795a();
                        } catch (C6608b e11) {
                            e = e11;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c6627c.m4819a();
                            c6627c.f5502c = "201";
                            c6627c.f5508i = e.m4704a();
                            C6626b.m4818a(c6627c);
                            C6638e.m4887b("PatchManager", "addPatch fail", e, "code", Integer.valueOf(e.m4704a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                            patchLoadStatusListener.onLoad(0, e.m4704a(), e.getMessage(), c6627c.f5503d);
                            C6636c.m4875a(zipFile);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c6627c.m4819a();
                            c6627c.f5502c = "201";
                            c6627c.f5508i = 71;
                            C6626b.m4818a(c6627c);
                            C6638e.m4887b("PatchManager", "addPatch fail", th, new Object[0]);
                            patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c6627c.f5503d);
                            C6636c.m4875a(zipFile);
                            return;
                        }
                    } catch (IOException e12) {
                        throw new C6608b(74, e12);
                    }
                } catch (C6608b e13) {
                    e = e13;
                    zipFile = null;
                } catch (Throwable th4) {
                    th = th4;
                    zipFile = null;
                }
                if (!this.f5440m && z12 && z10) {
                    C6638e.m4891d("PatchManager", "addPatch is hotfix patch, but app exist old patch, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c6627c.f5503d);
                    C6636c.m4875a(zipFile);
                    return;
                }
                boolean z13 = zipFile.getEntry("classes.dex") != null;
                if (!Boolean.valueOf(attributesM4705a.getValue("Has-Res")).booleanValue() && zipFile.getEntry("resources.arsc") == null && zipFile.getEntry("assets") == null) {
                    z11 = false;
                }
                if (!z13 && (z9 || (z11 && z12))) {
                    C6638e.m4891d("PatchManager", "addPatch only need to patch so lib, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c6627c.f5503d);
                    C6636c.m4875a(zipFile);
                    return;
                } else {
                    m4708a(file4, patchLoadStatusListener, c6627c);
                    C6636c.m4875a(zipFile);
                    return;
                }
            }
            throw new C6608b(4, "device is not support");
        }
        throw new C6608b(20, "patch is illegal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* renamed from: a */
    private synchronized void m4708a(File file, PatchLoadStatusListener patchLoadStatusListener, C6627c c6627c) {
        boolean z9;
        boolean zM4754a;
        boolean zM4815a;
        boolean zM4807a;
        C6638e.m4888b("PatchManager", "loadPatch", "patchFile", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZipFile zipFile = null;
        try {
            try {
                if (!this.f5435h) {
                    if (!C6642i.m4907a(file)) {
                        throw new C6608b(75, "patch signInfo not match to apk");
                    }
                } else {
                    C6638e.m4891d("PatchManager", "loadPatch", "skip verifyPatchLegal in debug mode");
                }
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Attributes attributesM4705a = m4705a(file);
                        String value = attributesM4705a.getValue("Modified-So");
                        boolean z10 = (!Boolean.valueOf(attributesM4705a.getValue("Has-Res")).booleanValue() && zipFile2.getEntry("resources.arsc") == null && zipFile2.getEntry("assets") == null) ? false : true;
                        int i9 = zipFile2.getEntry("classes.dex") != null ? 1 : 0;
                        if (z10) {
                            i9 |= 4;
                        }
                        if (!TextUtils.isEmpty(value)) {
                            i9 |= 2;
                        }
                        c6627c.f5505f = i9;
                        ?? r72 = (m4711a(attributesM4705a) && !this.f5441n && C6621b.m4795a()) ? 1 : 0;
                        c6627c.f5507h = r72;
                        m4715j();
                        if (zipFile2.getEntry("classes.dex") != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C6638e.m4890c("PatchManager", "loadPatch", "start patch dex file");
                            zM4754a = new C6616a().m4754a(file, r72, patchLoadStatusListener, c6627c);
                            if (zM4754a) {
                                C6638e.m4890c("PatchManager", "loadPatch", "finish patch dex file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                m4717l();
                            } else {
                                C6638e.m4890c("PatchManager", "loadPatch", "wait preload dex file complete");
                                if (C6640g.m4896a(C6622b.f5489b)) {
                                    m4716k();
                                }
                            }
                            z9 = false;
                        } else {
                            C6638e.m4891d("PatchManager", "loadPatch", "no dex file found");
                            z9 = true;
                            zM4754a = false;
                        }
                        if ((zM4754a || z9) && z10) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            C6638e.m4890c("PatchManager", "loadPatch", "start patch res file");
                            zM4815a = new C6624d().m4815a(file);
                            C6638e.m4890c("PatchManager", "loadPatch", "finish patch res file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis3));
                        } else {
                            zM4815a = false;
                        }
                        if (zM4754a) {
                            if (TextUtils.isEmpty(value)) {
                                zM4807a = false;
                            } else {
                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                C6638e.m4890c("PatchManager", "loadPatch", "start patch lib file");
                                zM4807a = new C6623c().m4807a(value, this.f5430c);
                                C6638e.m4890c("PatchManager", "loadPatch", "finish patch lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis4));
                            }
                            C6623c.m4801a();
                        } else {
                            zM4807a = false;
                        }
                        if (zM4754a || zM4815a || zM4807a) {
                            if (this.f5438k == null) {
                                this.f5438k = new C6610d(zM4754a, zM4815a, zM4807a, r72);
                            }
                            c6627c.m4819a();
                            c6627c.f5504e = System.currentTimeMillis() - jCurrentTimeMillis;
                            c6627c.f5502c = "200";
                            C6626b.m4818a(c6627c);
                            C6638e.m4890c("PatchManager", "loadPatch success", "hasDexPatched", Boolean.valueOf(zM4754a), "hasResPatched", Boolean.valueOf(zM4815a), "hasSOPatched", Boolean.valueOf(zM4807a));
                            patchLoadStatusListener.onLoad(0, 1, "load success", c6627c.f5503d);
                        } else if (z9) {
                            C6638e.m4890c("PatchManager", "loadPatch fail", "invalid patch");
                            patchLoadStatusListener.onLoad(0, 20, "did not load anything", c6627c.f5503d);
                        }
                        C6636c.m4875a(zipFile2);
                    } catch (C6608b e10) {
                        e = e10;
                        zipFile = zipFile2;
                        c6627c.m4819a();
                        c6627c.f5502c = "201";
                        c6627c.f5508i = e.m4704a();
                        C6626b.m4818a(c6627c);
                        C6638e.m4887b("PatchManager", "loadPatch fail", e, "code", Integer.valueOf(e.m4704a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                        patchLoadStatusListener.onLoad(0, e.m4704a(), e.getMessage(), c6627c.f5503d);
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        c6627c.m4819a();
                        c6627c.f5502c = "201";
                        c6627c.f5508i = 71;
                        C6626b.m4818a(c6627c);
                        C6638e.m4887b("PatchManager", "loadPatch fail", th, new Object[0]);
                        patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c6627c.f5503d);
                    }
                } catch (IOException e11) {
                    throw new C6608b(77, e11);
                }
            } finally {
                C6636c.m4875a(zipFile);
            }
        } catch (C6608b e12) {
            e = e12;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private Attributes m4705a(File file) throws Throwable {
        try {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    InputStream inputStream = jarFile.getInputStream(jarFile.getJarEntry("META-INF/SOPHIX.MF"));
                    Attributes mainAttributes = new Manifest(inputStream).getMainAttributes();
                    String value = mainAttributes.getValue("Sophix-Version");
                    if (!TextUtils.isEmpty(value) && "2.0".equals(value)) {
                        C6636c.m4870a(inputStream);
                        C6636c.m4875a((ZipFile) jarFile);
                        return mainAttributes;
                    }
                    throw new C6608b(76, "require version:2.0 but patch version:" + value);
                } catch (IOException e10) {
                    e = e10;
                    throw new C6608b(73, e);
                }
            } catch (Throwable th) {
                th = th;
                C6636c.m4870a((Closeable) null);
                C6636c.m4875a((ZipFile) null);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
            C6636c.m4870a((Closeable) null);
            C6636c.m4875a((ZipFile) null);
            throw th;
        }
    }

    /* renamed from: a */
    private boolean m4711a(Attributes attributes) {
        boolean z9 = Boolean.parseBoolean(attributes.getValue("Support-Hot"));
        if (z9) {
            String value = attributes.getValue("System-Reference");
            if (!TextUtils.isEmpty(value)) {
                C6638e.m4881a("PatchManager", "checkSupportHotfix", "systemReferences", value);
                JSONArray jSONArray = new JSONArray(value);
                ClassLoader classLoader = getClass().getClassLoader();
                for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                    String str = (String) jSONArray.get(i9);
                    try {
                    } catch (ClassNotFoundException e10) {
                        C6638e.m4880a("PatchManager", "checkSupportHotfix", e10, new Object[0]);
                    }
                    if ((classLoader.loadClass(str).getModifiers() & 1) == 0) {
                        C6638e.m4890c("PatchManager", "checkSupportHotfix", "systemClzName", str, "not public");
                        return false;
                    }
                    continue;
                }
            }
        }
        return z9;
    }

    /* renamed from: a */
    public void m4729a(boolean z9) {
        this.f5435h = z9;
    }

    /* renamed from: a */
    public void m4726a(String str, int i9) {
        C6644k.m4920a(str, i9);
    }

    /* renamed from: a */
    public void m4724a(Class cls) {
        C6619b.m4767a(cls);
    }

    /* renamed from: a */
    private void m4709a(String str, Throwable th) {
        throw new RuntimeException("abandon initialization: " + str, th);
    }

    /* renamed from: a */
    public void m4723a(InterfaceC6625a interfaceC6625a) {
        C6626b.m4817a(interfaceC6625a);
    }
}
