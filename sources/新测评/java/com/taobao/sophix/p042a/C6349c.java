package com.taobao.sophix.p042a;

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
import com.taobao.sophix.p043b.C6356a;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p043b.C6363c;
import com.taobao.sophix.p043b.C6364d;
import com.taobao.sophix.p043b.p044a.p045a.C6359b;
import com.taobao.sophix.p043b.p044a.p046b.C6361b;
import com.taobao.sophix.p047c.C6366b;
import com.taobao.sophix.p047c.C6367c;
import com.taobao.sophix.p047c.InterfaceC6365a;
import com.taobao.sophix.p052e.C6374a;
import com.taobao.sophix.p052e.C6375b;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6380g;
import com.taobao.sophix.p052e.C6381h;
import com.taobao.sophix.p052e.C6382i;
import com.taobao.sophix.p052e.C6383j;
import com.taobao.sophix.p052e.C6384k;
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
public class C6349c {

    /* renamed from: a */
    private int f4851a;

    /* renamed from: b */
    private File f4852b;

    /* renamed from: c */
    private File f4853c;

    /* renamed from: d */
    private File f4854d;

    /* renamed from: e */
    private File f4855e;

    /* renamed from: f */
    private String f4856f;

    /* renamed from: g */
    private String f4857g;

    /* renamed from: h */
    private boolean f4858h;

    /* renamed from: i */
    private Application f4859i;

    /* renamed from: j */
    private boolean f4860j;

    /* renamed from: k */
    private volatile C6350d f4861k;

    /* renamed from: l */
    private AtomicBoolean f4862l = new AtomicBoolean(false);

    /* renamed from: m */
    private boolean f4863m = false;

    /* renamed from: n */
    private boolean f4864n = false;

    /* renamed from: o */
    private List f4865o = new ArrayList();

    /* renamed from: g */
    private void m4533g() {
        int i10 = this.f4851a | 2;
        this.f4851a = i10;
        C6383j.m4738b(C6362b.f4912b, "SP_SOPHIX_DIR_STATE", i10);
    }

    /* renamed from: h */
    private boolean m4534h() {
        if (C6383j.m4734a(C6362b.f4912b, "happ_version", "NO_FOUND_SOPHIX_APP_VERSION").equals(this.f4856f)) {
            return true;
        }
        if (!this.f4860j) {
            C6378e.m4709b("PatchManager", "checkAppUpdatedForContinue", "app is updated");
            return false;
        }
        C6378e.m4712d("PatchManager", "checkAppUpdatedForContinue", "app is updated. clean old patch.");
        m4554b(false);
        return true;
    }

    /* renamed from: i */
    private boolean m4535i() {
        String strM4734a = C6383j.m4734a(C6362b.f4912b, "sophix_system_fingerprint", "INVALID_SYSTEM_FINGERPRINT");
        if (strM4734a.equals("INVALID_SYSTEM_FINGERPRINT") || strM4734a.equals(Build.FINGERPRINT)) {
            return true;
        }
        if (!this.f4860j) {
            C6378e.m4709b("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened");
            return false;
        }
        C6378e.m4712d("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened, so clear odex files");
        C6376c.m4694a(this.f4852b, new File[]{m4543a()});
        return true;
    }

    /* renamed from: j */
    private void m4536j() {
        if (!this.f4860j) {
            C6378e.m4702a("PatchManager", "prepareCrashHandler", "skip");
            return;
        }
        C6383j.m4738b(C6362b.f4912b, "happ_crash_num", C6383j.m4733a(C6362b.f4912b, "happ_crash_num", 0) + 1);
        C6347a.m4522a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m4537k() {
        if (!C6347a.m4523a() || C6347a.m4524b()) {
            return;
        }
        C6347a.m4522a(false);
        C6383j.m4736a(C6362b.f4912b, "happ_crash_num");
        C6378e.m4709b("PatchManager", "clearCrashHandler", "clear crash flag");
    }

    /* renamed from: l */
    private void m4538l() {
        if (C6383j.m4737a((Context) C6362b.f4912b, "happ_ishotfix", false)) {
            C6378e.m4709b("PatchManager", "clearPreVerified", "skip clear at hot");
            return;
        }
        m4545a(getClass());
        Iterator<Class> it = C6359b.m4586a().iterator();
        while (it.hasNext()) {
            m4545a(it.next());
        }
    }

    /* renamed from: m */
    private void m4539m() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C6381h.f4973a;
            C6381h.m4723a(cls, "mOuterContext").set(C6362b.f4912b.getBaseContext(), this.f4859i);
            Object obj = C6381h.m4723a(cls, "mPackageInfo").get(C6362b.f4912b.getBaseContext());
            C6381h.m4723a(obj.getClass(), "mApplication").set(obj, this.f4859i);
            Object obj2 = C6381h.m4723a(obj.getClass(), "mActivityThread").get(obj);
            C6381h.m4723a(obj2.getClass(), "mInitialApplication").set(obj2, this.f4859i);
            List list = (List) C6381h.m4723a(obj2.getClass(), "mAllApplications").get(obj2);
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, this.f4859i);
            }
            C6378e.m4709b("PatchManager", "replaceRealApplication finish", new Object[0]);
        } catch (Exception e10) {
            m4530a("replaceRealApplication fail", e10);
        }
    }

    /* renamed from: n */
    private void m4540n() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsLoadClass;
        try {
            String name = C6362b.f4912b.getClass().getName();
            try {
                clsLoadClass = C6362b.f4912b.getClassLoader().loadClass(name + "$RealApplicationStub");
            } catch (Exception unused) {
                clsLoadClass = C6362b.f4912b.getClassLoader().loadClass(name.replace("_modified_name", "") + "$RealApplicationStub");
            }
            Application application = (Application) ((SophixEntry) clsLoadClass.getAnnotation(SophixEntry.class)).value().newInstance();
            C6381h.m4724a(Application.class, "attach", Context.class).invoke(application, C6362b.f4912b.getBaseContext());
            this.f4859i = application;
            C6378e.m4709b("PatchManager", "callRealAppAttach", "finish call real App.attach, app", application.getClass().getName());
        } catch (Exception e10) {
            m4530a("callRealAppAttach", e10);
        }
    }

    /* renamed from: o */
    private void m4541o() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C6381h.f4974b;
            Object obj = C6381h.m4723a(cls, "mBoundApplication").get(C6381h.m4724a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C6381h.m4723a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                this.f4865o.addAll(list);
                list.clear();
            }
        } catch (Exception e10) {
            m4530a("removeProvidersTemporarily", e10);
        }
    }

    /* renamed from: p */
    private void m4542p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = C6381h.f4974b;
            Object objInvoke = C6381h.m4724a(cls, "currentActivityThread", new Class[0]).invoke(null, null);
            Object obj = C6381h.m4723a(cls, "mBoundApplication").get(C6381h.m4724a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C6381h.m4723a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                list.addAll(this.f4865o);
                this.f4865o.clear();
                C6381h.m4724a(cls, "installContentProviders", Context.class, List.class).invoke(objInvoke, this.f4859i, list);
            }
        } catch (Exception e10) {
            m4530a("installProviders", e10);
        }
    }

    /* renamed from: b */
    public void m4551b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!C6362b.f4916f) {
            C6378e.m4712d("PatchManager", "do not call real App.onCreate", new Object[0]);
        } else {
            if (this.f4859i == null) {
                C6378e.m4712d("PatchManager", "real application is null, fail to call onCreate", new Object[0]);
                return;
            }
            m4539m();
            m4542p();
            this.f4859i.onCreate();
        }
    }

    /* renamed from: c */
    public boolean m4556c() {
        return this.f4858h;
    }

    /* renamed from: d */
    public Object m4557d() {
        return this.f4861k;
    }

    /* renamed from: e */
    public void m4559e() {
        C6378e.m4712d("PatchManager", "killProcessSafely", new Object[0]);
        Process.killProcess(Process.myPid());
    }

    /* renamed from: f */
    public void m4560f() {
        C6375b.m4685a();
    }

    /* renamed from: a */
    public synchronized void m4548a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("app version is null");
            }
            if (C6362b.f4912b == null) {
                throw new RuntimeException("app is null");
            }
            if (!this.f4862l.get()) {
                C6378e.m4711c("PatchManager", "init", "appVersion", str);
                if (C6362b.f4912b instanceof SophixApplication) {
                    C6362b.f4916f = true;
                } else if (Build.VERSION.SDK_INT >= 28) {
                    C6378e.m4712d("PatchManager", "should use stable initialize when android version >= 9.0.", new Object[0]);
                    return;
                }
                this.f4856f = str;
                this.f4860j = C6380g.m4717a(C6362b.f4912b);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C6378e.m4712d("PatchManager", "init recommend to best call in main thread", new Object[0]);
                }
                if (m4534h() && m4535i()) {
                    m4528a(patchLoadStatusListener);
                } else {
                    C6378e.m4712d("PatchManager", "patch is not the newest, skip loading in sub-process", new Object[0]);
                }
                if (C6362b.f4916f) {
                    m4541o();
                    m4540n();
                }
                this.f4862l.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public void m4555c(boolean z9) {
        this.f4863m = z9;
    }

    /* renamed from: d */
    public void m4558d(boolean z9) {
        this.f4864n = z9;
    }

    /* renamed from: b */
    public void m4553b(String str) {
        this.f4857g = str;
    }

    /* renamed from: b */
    public synchronized void m4554b(boolean z9) {
        try {
            C6378e.m4712d("PatchManager", "cleanPatches", "positive", Boolean.valueOf(z9));
            if (m4543a() != null) {
                C6367c c6367c = new C6367c(4);
                c6367c.f4926d = C6362b.f4911a;
                c6367c.f4925c = z9 ? "300" : "301";
                C6366b.m4639a(c6367c);
            }
            C6376c.m4692a(this.f4852b);
            C6376c.m4692a(this.f4853c);
            boolean zM4737a = C6383j.m4737a((Context) C6362b.f4912b, "happ_ishotfix", false);
            String strM4734a = C6383j.m4734a(C6362b.f4912b, "SP_SOPHIX_DEVICE_ID", (String) null);
            C6383j.m4735a(C6362b.f4912b);
            C6362b.m4618a(C6362b.f4911a);
            C6383j.m4739b(C6362b.f4912b, "happ_version", this.f4856f);
            C6383j.m4739b(C6362b.f4912b, "SP_SOPHIX_DEVICE_ID", strM4734a);
            C6383j.m4740b(C6362b.f4912b, "happ_ishotfix", zM4737a);
            C6378e.m4712d("PatchManager", "cleanPatches", "finish clean");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m4546a(String str) {
        File file = new File(str);
        this.f4851a = C6383j.m4733a(C6362b.f4912b, "SP_SOPHIX_DIR_STATE", 0);
        boolean zM4717a = C6380g.m4717a(C6362b.f4912b);
        if (zM4717a && m4531a(2)) {
            int i10 = (~this.f4851a) & 3;
            this.f4851a = i10;
            C6383j.m4738b(C6362b.f4912b, "SP_SOPHIX_DIR_STATE", i10);
        }
        if (m4531a(1)) {
            this.f4852b = C6376c.m4690a(file, "patch_");
            this.f4853c = C6376c.m4690a(file, "libs_");
            this.f4854d = C6376c.m4690a(file, "patch");
            this.f4855e = C6376c.m4690a(file, "libs");
        } else {
            this.f4852b = C6376c.m4690a(file, "patch");
            this.f4853c = C6376c.m4690a(file, "libs");
            this.f4854d = C6376c.m4690a(file, "patch_");
            this.f4855e = C6376c.m4690a(file, "libs_");
        }
        C6378e.m4709b("PatchManager", "initPatchDir", "patchDir", this.f4852b.getName(), "nativeLibDir", this.f4853c.getName());
        C6362b.f4914d = this.f4852b;
        C6362b.f4915e = this.f4853c;
        if (zM4717a) {
            C6376c.m4692a(this.f4854d);
            C6376c.m4692a(this.f4855e);
        }
    }

    /* renamed from: b */
    public void m4552b(Class cls) {
        C6359b.m4593b(cls);
    }

    /* renamed from: a */
    private boolean m4531a(int i10) {
        return (this.f4851a & i10) == i10;
    }

    /* renamed from: a */
    public File m4543a() {
        File[] fileArrListFiles = this.f4852b.listFiles(new FileFilter() { // from class: com.taobao.sophix.a.c.1
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
    private void m4528a(PatchLoadStatusListener patchLoadStatusListener) {
        if (this.f4860j) {
            if (C6383j.m4733a(C6362b.f4912b, "happ_crash_num", 0) >= 5) {
                C6378e.m4712d("PatchManager", "handleLocalPatch", "continuous crash happened too mush, so cleaning patch by force");
                m4554b(false);
            }
            if (C6383j.m4737a((Context) C6362b.f4912b, "hpatch_clear", false)) {
                C6378e.m4712d("PatchManager", "handleLocalPatch", "force cleaning patch as server require clear");
                m4554b(true);
            }
        }
        File fileM4543a = m4543a();
        if (fileM4543a != null) {
            C6367c c6367c = new C6367c(3);
            c6367c.f4926d = C6362b.f4911a;
            C6362b.f4913c = fileM4543a;
            m4529a(fileM4543a, patchLoadStatusListener, c6367c);
        } else {
            C6378e.m4712d("PatchManager", "handleLocalPatch", "no any patch exists");
        }
        if (this.f4860j) {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.sophix.a.c.2
                @Override // java.lang.Runnable
                public void run() {
                    C6349c.this.m4537k();
                }
            }, 3000L);
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0248: INVOKE (r6 I:java.util.zip.ZipFile) STATIC call: com.taobao.sophix.e.c.a(java.util.zip.ZipFile):void A[Catch: all -> 0x0025, MD:(java.util.zip.ZipFile):void throws java.io.IOException (m), TRY_ENTER] (LINE:133), block:B:121:0x0248 */
    /* renamed from: a */
    public synchronized void m4549a(String str, PatchLoadStatusListener patchLoadStatusListener, C6367c c6367c) {
        ZipFile zipFile;
        ZipFile zipFileM4696a;
        File file;
        Attributes attributesM4526a;
        boolean z9;
        boolean z10;
        C6378e.m4702a("PatchManager", "addPatch", "src patch", str);
        if (!this.f4862l.get()) {
            C6378e.m4713e("PatchManager", "addPatch", "did not init before!!");
            return;
        }
        File file2 = null;
        try {
            try {
                file = new File(str);
            } catch (Throwable th) {
                C6376c.m4696a(zipFileM4696a);
                throw th;
            }
        } catch (C6348b e10) {
            e = e10;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
        if (!TextUtils.isEmpty(str) && file.exists() && file.isFile() && file.getName().endsWith(".jar")) {
            if (C6384k.m4742a()) {
                boolean z11 = true;
                boolean z12 = m4543a() != null;
                File file3 = z12 ? this.f4854d : this.f4852b;
                C6376c.m4692a(file3);
                File file4 = new File(file3, file.getName());
                try {
                    try {
                        C6376c.m4693a(file, file4);
                        C6378e.m4702a("PatchManager", "addPatch", "dest patch", file4.getName());
                        C6362b.m4618a(c6367c.f4926d);
                        if (!TextUtils.isEmpty(this.f4857g)) {
                            C6378e.m4709b("PatchManager", "addPatch", "aes key is set, do decrypt...");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (C6374a.m4681a(file4.getAbsolutePath(), this.f4857g) && file4.exists()) {
                                C6378e.m4702a("PatchManager", "addPatch", "finish local aes decrypt patch(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            } else {
                                throw new C6348b(72, "aes decrypt fail");
                            }
                        }
                        attributesM4526a = m4526a(file4);
                        String value = attributesM4526a.getValue("Modified-So");
                        zipFile = new ZipFile(file4);
                        try {
                            if (TextUtils.isEmpty(value)) {
                                z9 = false;
                            } else {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C6378e.m4702a("PatchManager", "addPatch", "start unzip lib file");
                                new C6363c().m4627a(value, zipFile, z12 ? this.f4855e : this.f4853c);
                                C6378e.m4702a("PatchManager", "addPatch", "finish unzip lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                z9 = true;
                            }
                            if (z12) {
                                m4533g();
                            }
                            z10 = m4532a(attributesM4526a) && !this.f4864n && C6361b.m4616a();
                        } catch (C6348b e11) {
                            e = e11;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c6367c.m4640a();
                            c6367c.f4925c = "201";
                            c6367c.f4931i = e.m4525a();
                            C6366b.m4639a(c6367c);
                            C6378e.m4708b("PatchManager", "addPatch fail", e, "code", Integer.valueOf(e.m4525a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                            patchLoadStatusListener.onLoad(0, e.m4525a(), e.getMessage(), c6367c.f4926d);
                            C6376c.m4696a(zipFile);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c6367c.m4640a();
                            c6367c.f4925c = "201";
                            c6367c.f4931i = 71;
                            C6366b.m4639a(c6367c);
                            C6378e.m4708b("PatchManager", "addPatch fail", th, new Object[0]);
                            patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c6367c.f4926d);
                            C6376c.m4696a(zipFile);
                            return;
                        }
                    } catch (IOException e12) {
                        throw new C6348b(74, e12);
                    }
                } catch (C6348b e13) {
                    e = e13;
                    zipFile = null;
                } catch (Throwable th4) {
                    th = th4;
                    zipFile = null;
                }
                if (!this.f4863m && z12 && z10) {
                    C6378e.m4712d("PatchManager", "addPatch is hotfix patch, but app exist old patch, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c6367c.f4926d);
                    C6376c.m4696a(zipFile);
                    return;
                }
                boolean z13 = zipFile.getEntry("classes.dex") != null;
                if (!Boolean.valueOf(attributesM4526a.getValue("Has-Res")).booleanValue() && zipFile.getEntry("resources.arsc") == null && zipFile.getEntry("assets") == null) {
                    z11 = false;
                }
                if (!z13 && (z9 || (z11 && z12))) {
                    C6378e.m4712d("PatchManager", "addPatch only need to patch so lib, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c6367c.f4926d);
                    C6376c.m4696a(zipFile);
                    return;
                } else {
                    m4529a(file4, patchLoadStatusListener, c6367c);
                    C6376c.m4696a(zipFile);
                    return;
                }
            }
            throw new C6348b(4, "device is not support");
        }
        throw new C6348b(20, "patch is illegal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* renamed from: a */
    private synchronized void m4529a(File file, PatchLoadStatusListener patchLoadStatusListener, C6367c c6367c) {
        boolean z9;
        boolean zM4575a;
        boolean zM4636a;
        boolean zM4628a;
        C6378e.m4709b("PatchManager", "loadPatch", "patchFile", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZipFile zipFile = null;
        try {
            try {
                if (!this.f4858h) {
                    if (!C6382i.m4728a(file)) {
                        throw new C6348b(75, "patch signInfo not match to apk");
                    }
                } else {
                    C6378e.m4712d("PatchManager", "loadPatch", "skip verifyPatchLegal in debug mode");
                }
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Attributes attributesM4526a = m4526a(file);
                        String value = attributesM4526a.getValue("Modified-So");
                        boolean z10 = (!Boolean.valueOf(attributesM4526a.getValue("Has-Res")).booleanValue() && zipFile2.getEntry("resources.arsc") == null && zipFile2.getEntry("assets") == null) ? false : true;
                        int i10 = zipFile2.getEntry("classes.dex") != null ? 1 : 0;
                        if (z10) {
                            i10 |= 4;
                        }
                        if (!TextUtils.isEmpty(value)) {
                            i10 |= 2;
                        }
                        c6367c.f4928f = i10;
                        ?? r72 = (m4532a(attributesM4526a) && !this.f4864n && C6361b.m4616a()) ? 1 : 0;
                        c6367c.f4930h = r72;
                        m4536j();
                        if (zipFile2.getEntry("classes.dex") != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C6378e.m4711c("PatchManager", "loadPatch", "start patch dex file");
                            zM4575a = new C6356a().m4575a(file, r72, patchLoadStatusListener, c6367c);
                            if (zM4575a) {
                                C6378e.m4711c("PatchManager", "loadPatch", "finish patch dex file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                m4538l();
                            } else {
                                C6378e.m4711c("PatchManager", "loadPatch", "wait preload dex file complete");
                                if (C6380g.m4717a(C6362b.f4912b)) {
                                    m4537k();
                                }
                            }
                            z9 = false;
                        } else {
                            C6378e.m4712d("PatchManager", "loadPatch", "no dex file found");
                            z9 = true;
                            zM4575a = false;
                        }
                        if ((zM4575a || z9) && z10) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            C6378e.m4711c("PatchManager", "loadPatch", "start patch res file");
                            zM4636a = new C6364d().m4636a(file);
                            C6378e.m4711c("PatchManager", "loadPatch", "finish patch res file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis3));
                        } else {
                            zM4636a = false;
                        }
                        if (zM4575a) {
                            if (TextUtils.isEmpty(value)) {
                                zM4628a = false;
                            } else {
                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                C6378e.m4711c("PatchManager", "loadPatch", "start patch lib file");
                                zM4628a = new C6363c().m4628a(value, this.f4853c);
                                C6378e.m4711c("PatchManager", "loadPatch", "finish patch lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis4));
                            }
                            C6363c.m4622a();
                        } else {
                            zM4628a = false;
                        }
                        if (zM4575a || zM4636a || zM4628a) {
                            if (this.f4861k == null) {
                                this.f4861k = new C6350d(zM4575a, zM4636a, zM4628a, r72);
                            }
                            c6367c.m4640a();
                            c6367c.f4927e = System.currentTimeMillis() - jCurrentTimeMillis;
                            c6367c.f4925c = "200";
                            C6366b.m4639a(c6367c);
                            C6378e.m4711c("PatchManager", "loadPatch success", "hasDexPatched", Boolean.valueOf(zM4575a), "hasResPatched", Boolean.valueOf(zM4636a), "hasSOPatched", Boolean.valueOf(zM4628a));
                            patchLoadStatusListener.onLoad(0, 1, "load success", c6367c.f4926d);
                        } else if (z9) {
                            C6378e.m4711c("PatchManager", "loadPatch fail", "invalid patch");
                            patchLoadStatusListener.onLoad(0, 20, "did not load anything", c6367c.f4926d);
                        }
                        C6376c.m4696a(zipFile2);
                    } catch (C6348b e10) {
                        e = e10;
                        zipFile = zipFile2;
                        c6367c.m4640a();
                        c6367c.f4925c = "201";
                        c6367c.f4931i = e.m4525a();
                        C6366b.m4639a(c6367c);
                        C6378e.m4708b("PatchManager", "loadPatch fail", e, "code", Integer.valueOf(e.m4525a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                        patchLoadStatusListener.onLoad(0, e.m4525a(), e.getMessage(), c6367c.f4926d);
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        c6367c.m4640a();
                        c6367c.f4925c = "201";
                        c6367c.f4931i = 71;
                        C6366b.m4639a(c6367c);
                        C6378e.m4708b("PatchManager", "loadPatch fail", th, new Object[0]);
                        patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c6367c.f4926d);
                    }
                } catch (IOException e11) {
                    throw new C6348b(77, e11);
                }
            } finally {
                C6376c.m4696a(zipFile);
            }
        } catch (C6348b e12) {
            e = e12;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private Attributes m4526a(File file) throws Throwable {
        try {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    InputStream inputStream = jarFile.getInputStream(jarFile.getJarEntry("META-INF/SOPHIX.MF"));
                    Attributes mainAttributes = new Manifest(inputStream).getMainAttributes();
                    String value = mainAttributes.getValue("Sophix-Version");
                    if (!TextUtils.isEmpty(value) && "2.0".equals(value)) {
                        C6376c.m4691a(inputStream);
                        C6376c.m4696a((ZipFile) jarFile);
                        return mainAttributes;
                    }
                    throw new C6348b(76, "require version:2.0 but patch version:" + value);
                } catch (IOException e10) {
                    e = e10;
                    throw new C6348b(73, e);
                }
            } catch (Throwable th) {
                th = th;
                C6376c.m4691a((Closeable) null);
                C6376c.m4696a((ZipFile) null);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
            C6376c.m4691a((Closeable) null);
            C6376c.m4696a((ZipFile) null);
            throw th;
        }
    }

    /* renamed from: a */
    private boolean m4532a(Attributes attributes) {
        boolean z9 = Boolean.parseBoolean(attributes.getValue("Support-Hot"));
        if (z9) {
            String value = attributes.getValue("System-Reference");
            if (!TextUtils.isEmpty(value)) {
                C6378e.m4702a("PatchManager", "checkSupportHotfix", "systemReferences", value);
                JSONArray jSONArray = new JSONArray(value);
                ClassLoader classLoader = getClass().getClassLoader();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String str = (String) jSONArray.get(i10);
                    try {
                    } catch (ClassNotFoundException e10) {
                        C6378e.m4701a("PatchManager", "checkSupportHotfix", e10, new Object[0]);
                    }
                    if ((classLoader.loadClass(str).getModifiers() & 1) == 0) {
                        C6378e.m4711c("PatchManager", "checkSupportHotfix", "systemClzName", str, "not public");
                        return false;
                    }
                    continue;
                }
            }
        }
        return z9;
    }

    /* renamed from: a */
    public void m4550a(boolean z9) {
        this.f4858h = z9;
    }

    /* renamed from: a */
    public void m4547a(String str, int i10) {
        C6384k.m4741a(str, i10);
    }

    /* renamed from: a */
    public void m4545a(Class cls) {
        C6359b.m4588a(cls);
    }

    /* renamed from: a */
    private void m4530a(String str, Throwable th) {
        throw new RuntimeException("abandon initialization: " + str, th);
    }

    /* renamed from: a */
    public void m4544a(InterfaceC6365a interfaceC6365a) {
        C6366b.m4638a(interfaceC6365a);
    }
}
