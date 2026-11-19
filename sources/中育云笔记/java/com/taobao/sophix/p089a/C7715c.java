package com.taobao.sophix.p089a;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.taobao.accs.common.Constants;
import com.taobao.sophix.SophixApplication;
import com.taobao.sophix.SophixEntry;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p090b.C7722a;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p090b.C7729c;
import com.taobao.sophix.p090b.C7730d;
import com.taobao.sophix.p090b.p091a.p092a.C7725b;
import com.taobao.sophix.p090b.p091a.p093b.C7727b;
import com.taobao.sophix.p094c.C7732b;
import com.taobao.sophix.p094c.C7733c;
import com.taobao.sophix.p094c.InterfaceC7731a;
import com.taobao.sophix.p099e.C7740a;
import com.taobao.sophix.p099e.C7741b;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7746g;
import com.taobao.sophix.p099e.C7747h;
import com.taobao.sophix.p099e.C7748i;
import com.taobao.sophix.p099e.C7749j;
import com.taobao.sophix.p099e.C7750k;
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
/* loaded from: classes5.dex */
public class C7715c {

    /* renamed from: a */
    private int f13293a;

    /* renamed from: b */
    private File f13294b;

    /* renamed from: c */
    private File f13295c;

    /* renamed from: d */
    private File f13296d;

    /* renamed from: e */
    private File f13297e;

    /* renamed from: f */
    private String f13298f;

    /* renamed from: g */
    private String f13299g;

    /* renamed from: h */
    private boolean f13300h;

    /* renamed from: i */
    private Application f13301i;

    /* renamed from: j */
    private boolean f13302j;

    /* renamed from: k */
    private volatile C7716d f13303k;

    /* renamed from: l */
    private AtomicBoolean f13304l = new AtomicBoolean(false);

    /* renamed from: m */
    private boolean f13305m = false;

    /* renamed from: n */
    private boolean f13306n = false;

    /* renamed from: o */
    private List f13307o = new ArrayList();

    /* renamed from: g */
    private void m10224g() {
        int i10 = this.f13293a | 2;
        this.f13293a = i10;
        C7749j.m10429b(C7728b.f13354b, "SP_SOPHIX_DIR_STATE", i10);
    }

    /* renamed from: h */
    private boolean m10225h() {
        if (C7749j.m10425a(C7728b.f13354b, "happ_version", "NO_FOUND_SOPHIX_APP_VERSION").equals(this.f13298f)) {
            return true;
        }
        if (!this.f13302j) {
            C7744e.m10400b("PatchManager", "checkAppUpdatedForContinue", "app is updated");
            return false;
        }
        C7744e.m10403d("PatchManager", "checkAppUpdatedForContinue", "app is updated. clean old patch.");
        m10245b(false);
        return true;
    }

    /* renamed from: i */
    private boolean m10226i() {
        String strM10425a = C7749j.m10425a(C7728b.f13354b, "sophix_system_fingerprint", "INVALID_SYSTEM_FINGERPRINT");
        if (strM10425a.equals("INVALID_SYSTEM_FINGERPRINT") || strM10425a.equals(Build.FINGERPRINT)) {
            return true;
        }
        if (!this.f13302j) {
            C7744e.m10400b("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened");
            return false;
        }
        C7744e.m10403d("PatchManager", "checkSystemOTAHappenedForContinue", "OTA happened, so clear odex files");
        C7742c.m10385a(this.f13294b, new File[]{m10234a()});
        return true;
    }

    /* renamed from: j */
    private void m10227j() {
        if (!this.f13302j) {
            C7744e.m10393a("PatchManager", "prepareCrashHandler", "skip");
            return;
        }
        C7749j.m10429b(C7728b.f13354b, "happ_crash_num", C7749j.m10424a(C7728b.f13354b, "happ_crash_num", 0) + 1);
        C7713a.m10213a(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public void m10228k() {
        if (!C7713a.m10214a() || C7713a.m10215b()) {
            return;
        }
        C7713a.m10213a(false);
        C7749j.m10427a(C7728b.f13354b, "happ_crash_num");
        C7744e.m10400b("PatchManager", "clearCrashHandler", "clear crash flag");
    }

    /* renamed from: l */
    private void m10229l() {
        if (C7749j.m10428a((Context) C7728b.f13354b, "happ_ishotfix", false)) {
            C7744e.m10400b("PatchManager", "clearPreVerified", "skip clear at hot");
            return;
        }
        m10236a(getClass());
        Iterator<Class> it = C7725b.m10277a().iterator();
        while (it.hasNext()) {
            m10236a(it.next());
        }
    }

    /* renamed from: m */
    private void m10230m() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C7747h.f13415a;
            C7747h.m10414a(cls, "mOuterContext").set(C7728b.f13354b.getBaseContext(), this.f13301i);
            Object obj = C7747h.m10414a(cls, "mPackageInfo").get(C7728b.f13354b.getBaseContext());
            C7747h.m10414a(obj.getClass(), "mApplication").set(obj, this.f13301i);
            Object obj2 = C7747h.m10414a(obj.getClass(), "mActivityThread").get(obj);
            C7747h.m10414a(obj2.getClass(), "mInitialApplication").set(obj2, this.f13301i);
            List list = (List) C7747h.m10414a(obj2.getClass(), "mAllApplications").get(obj2);
            for (int i10 = 0; i10 < list.size(); i10++) {
                list.set(i10, this.f13301i);
            }
            C7744e.m10400b("PatchManager", "replaceRealApplication finish", new Object[0]);
        } catch (Exception e10) {
            m10221a("replaceRealApplication fail", e10);
        }
    }

    /* renamed from: n */
    private void m10231n() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsLoadClass;
        try {
            String name = C7728b.f13354b.getClass().getName();
            try {
                clsLoadClass = C7728b.f13354b.getClassLoader().loadClass(name + "$RealApplicationStub");
            } catch (Exception unused) {
                clsLoadClass = C7728b.f13354b.getClassLoader().loadClass(name.replace("_modified_name", "") + "$RealApplicationStub");
            }
            Application application = (Application) ((SophixEntry) clsLoadClass.getAnnotation(SophixEntry.class)).value().newInstance();
            C7747h.m10415a(Application.class, "attach", Context.class).invoke(application, C7728b.f13354b.getBaseContext());
            this.f13301i = application;
            C7744e.m10400b("PatchManager", "callRealAppAttach", "finish call real App.attach, app", application.getClass().getName());
        } catch (Exception e10) {
            m10221a("callRealAppAttach", e10);
        }
    }

    /* renamed from: o */
    private void m10232o() throws IllegalAccessException, IllegalArgumentException {
        try {
            Class cls = C7747h.f13416b;
            Object obj = C7747h.m10414a(cls, "mBoundApplication").get(C7747h.m10415a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C7747h.m10414a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                this.f13307o.addAll(list);
                list.clear();
            }
        } catch (Exception e10) {
            m10221a("removeProvidersTemporarily", e10);
        }
    }

    /* renamed from: p */
    private void m10233p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Class cls = C7747h.f13416b;
            Object objInvoke = C7747h.m10415a(cls, "currentActivityThread", new Class[0]).invoke(null, null);
            Object obj = C7747h.m10414a(cls, "mBoundApplication").get(C7747h.m10415a(cls, "currentActivityThread", new Class[0]).invoke(null, null));
            List list = (List) C7747h.m10414a(obj.getClass(), "providers").get(obj);
            if (list != null) {
                list.addAll(this.f13307o);
                this.f13307o.clear();
                C7747h.m10415a(cls, "installContentProviders", Context.class, List.class).invoke(objInvoke, this.f13301i, list);
            }
        } catch (Exception e10) {
            m10221a("installProviders", e10);
        }
    }

    /* renamed from: b */
    public void m10242b() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (!C7728b.f13358f) {
            C7744e.m10403d("PatchManager", "do not call real App.onCreate", new Object[0]);
        } else {
            if (this.f13301i == null) {
                C7744e.m10403d("PatchManager", "real application is null, fail to call onCreate", new Object[0]);
                return;
            }
            m10230m();
            m10233p();
            this.f13301i.onCreate();
        }
    }

    /* renamed from: c */
    public boolean m10247c() {
        return this.f13300h;
    }

    /* renamed from: d */
    public Object m10248d() {
        return this.f13303k;
    }

    /* renamed from: e */
    public void m10250e() {
        C7744e.m10403d("PatchManager", "killProcessSafely", new Object[0]);
        Process.killProcess(Process.myPid());
    }

    /* renamed from: f */
    public void m10251f() {
        C7741b.m10376a();
    }

    /* renamed from: a */
    public synchronized void m10239a(String str, PatchLoadStatusListener patchLoadStatusListener) {
        try {
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("app version is null");
            }
            if (C7728b.f13354b == null) {
                throw new RuntimeException("app is null");
            }
            if (!this.f13304l.get()) {
                C7744e.m10402c("PatchManager", "init", "appVersion", str);
                if (C7728b.f13354b instanceof SophixApplication) {
                    C7728b.f13358f = true;
                } else if (Build.VERSION.SDK_INT >= 28) {
                    C7744e.m10403d("PatchManager", "should use stable initialize when android version >= 9.0.", new Object[0]);
                    return;
                }
                this.f13298f = str;
                this.f13302j = C7746g.m10408a(C7728b.f13354b);
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    C7744e.m10403d("PatchManager", "init recommend to best call in main thread", new Object[0]);
                }
                if (m10225h() && m10226i()) {
                    m10219a(patchLoadStatusListener);
                } else {
                    C7744e.m10403d("PatchManager", "patch is not the newest, skip loading in sub-process", new Object[0]);
                }
                if (C7728b.f13358f) {
                    m10232o();
                    m10231n();
                }
                this.f13304l.set(true);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: c */
    public void m10246c(boolean z10) {
        this.f13305m = z10;
    }

    /* renamed from: d */
    public void m10249d(boolean z10) {
        this.f13306n = z10;
    }

    /* renamed from: b */
    public void m10244b(String str) {
        this.f13299g = str;
    }

    /* renamed from: b */
    public synchronized void m10245b(boolean z10) {
        try {
            C7744e.m10403d("PatchManager", "cleanPatches", "positive", Boolean.valueOf(z10));
            if (m10234a() != null) {
                C7733c c7733c = new C7733c(4);
                c7733c.f13368d = C7728b.f13353a;
                c7733c.f13367c = z10 ? "300" : "301";
                C7732b.m10330a(c7733c);
            }
            C7742c.m10383a(this.f13294b);
            C7742c.m10383a(this.f13295c);
            boolean zM10428a = C7749j.m10428a((Context) C7728b.f13354b, "happ_ishotfix", false);
            String strM10425a = C7749j.m10425a(C7728b.f13354b, "SP_SOPHIX_DEVICE_ID", (String) null);
            C7749j.m10426a(C7728b.f13354b);
            C7728b.m10309a(C7728b.f13353a);
            C7749j.m10430b(C7728b.f13354b, "happ_version", this.f13298f);
            C7749j.m10430b(C7728b.f13354b, "SP_SOPHIX_DEVICE_ID", strM10425a);
            C7749j.m10431b(C7728b.f13354b, "happ_ishotfix", zM10428a);
            C7744e.m10403d("PatchManager", "cleanPatches", "finish clean");
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m10237a(String str) {
        File file = new File(str);
        this.f13293a = C7749j.m10424a(C7728b.f13354b, "SP_SOPHIX_DIR_STATE", 0);
        boolean zM10408a = C7746g.m10408a(C7728b.f13354b);
        if (zM10408a && m10222a(2)) {
            int i10 = (~this.f13293a) & 3;
            this.f13293a = i10;
            C7749j.m10429b(C7728b.f13354b, "SP_SOPHIX_DIR_STATE", i10);
        }
        if (m10222a(1)) {
            this.f13294b = C7742c.m10381a(file, "patch_");
            this.f13295c = C7742c.m10381a(file, "libs_");
            this.f13296d = C7742c.m10381a(file, "patch");
            this.f13297e = C7742c.m10381a(file, "libs");
        } else {
            this.f13294b = C7742c.m10381a(file, "patch");
            this.f13295c = C7742c.m10381a(file, "libs");
            this.f13296d = C7742c.m10381a(file, "patch_");
            this.f13297e = C7742c.m10381a(file, "libs_");
        }
        C7744e.m10400b("PatchManager", "initPatchDir", "patchDir", this.f13294b.getName(), "nativeLibDir", this.f13295c.getName());
        C7728b.f13356d = this.f13294b;
        C7728b.f13357e = this.f13295c;
        if (zM10408a) {
            C7742c.m10383a(this.f13296d);
            C7742c.m10383a(this.f13297e);
        }
    }

    /* renamed from: b */
    public void m10243b(Class cls) {
        C7725b.m10284b(cls);
    }

    /* renamed from: a */
    private boolean m10222a(int i10) {
        return (this.f13293a & i10) == i10;
    }

    /* renamed from: a */
    public File m10234a() {
        File[] fileArrListFiles = this.f13294b.listFiles(new FileFilter() { // from class: com.taobao.sophix.a.c.1
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
    private void m10219a(PatchLoadStatusListener patchLoadStatusListener) {
        if (this.f13302j) {
            if (C7749j.m10424a(C7728b.f13354b, "happ_crash_num", 0) >= 5) {
                C7744e.m10403d("PatchManager", "handleLocalPatch", "continuous crash happened too mush, so cleaning patch by force");
                m10245b(false);
            }
            if (C7749j.m10428a((Context) C7728b.f13354b, "hpatch_clear", false)) {
                C7744e.m10403d("PatchManager", "handleLocalPatch", "force cleaning patch as server require clear");
                m10245b(true);
            }
        }
        File fileM10234a = m10234a();
        if (fileM10234a != null) {
            C7733c c7733c = new C7733c(3);
            c7733c.f13368d = C7728b.f13353a;
            C7728b.f13355c = fileM10234a;
            m10220a(fileM10234a, patchLoadStatusListener, c7733c);
        } else {
            C7744e.m10403d("PatchManager", "handleLocalPatch", "no any patch exists");
        }
        if (this.f13302j) {
            new Handler().postDelayed(new Runnable() { // from class: com.taobao.sophix.a.c.2
                @Override // java.lang.Runnable
                public void run() {
                    C7715c.this.m10228k();
                }
            }, 3000L);
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0248: INVOKE (r6 I:java.util.zip.ZipFile) STATIC call: com.taobao.sophix.e.c.a(java.util.zip.ZipFile):void A[Catch: all -> 0x0025, MD:(java.util.zip.ZipFile):void throws java.io.IOException (m), TRY_ENTER] (LINE:133), block:B:121:0x0248 */
    /* renamed from: a */
    public synchronized void m10240a(String str, PatchLoadStatusListener patchLoadStatusListener, C7733c c7733c) {
        ZipFile zipFile;
        ZipFile zipFileM10387a;
        File file;
        Attributes attributesM10217a;
        boolean z10;
        boolean z11;
        C7744e.m10393a("PatchManager", "addPatch", "src patch", str);
        if (!this.f13304l.get()) {
            C7744e.m10404e("PatchManager", "addPatch", "did not init before!!");
            return;
        }
        File file2 = null;
        try {
            try {
                file = new File(str);
            } catch (Throwable th) {
                C7742c.m10387a(zipFileM10387a);
                throw th;
            }
        } catch (C7714b e10) {
            e = e10;
            zipFile = null;
        } catch (Throwable th2) {
            th = th2;
            zipFile = null;
        }
        if (!TextUtils.isEmpty(str) && file.exists() && file.isFile() && file.getName().endsWith(".jar")) {
            if (C7750k.m10433a()) {
                boolean z12 = true;
                boolean z13 = m10234a() != null;
                File file3 = z13 ? this.f13296d : this.f13294b;
                C7742c.m10383a(file3);
                File file4 = new File(file3, file.getName());
                try {
                    try {
                        C7742c.m10384a(file, file4);
                        C7744e.m10393a("PatchManager", "addPatch", "dest patch", file4.getName());
                        C7728b.m10309a(c7733c.f13368d);
                        if (!TextUtils.isEmpty(this.f13299g)) {
                            C7744e.m10400b("PatchManager", "addPatch", "aes key is set, do decrypt...");
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            if (C7740a.m10372a(file4.getAbsolutePath(), this.f13299g) && file4.exists()) {
                                C7744e.m10393a("PatchManager", "addPatch", "finish local aes decrypt patch(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
                            } else {
                                throw new C7714b(72, "aes decrypt fail");
                            }
                        }
                        attributesM10217a = m10217a(file4);
                        String value = attributesM10217a.getValue("Modified-So");
                        zipFile = new ZipFile(file4);
                        try {
                            if (TextUtils.isEmpty(value)) {
                                z10 = false;
                            } else {
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                C7744e.m10393a("PatchManager", "addPatch", "start unzip lib file");
                                new C7729c().m10318a(value, zipFile, z13 ? this.f13297e : this.f13295c);
                                C7744e.m10393a("PatchManager", "addPatch", "finish unzip lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                z10 = true;
                            }
                            if (z13) {
                                m10224g();
                            }
                            z11 = m10223a(attributesM10217a) && !this.f13306n && C7727b.m10307a();
                        } catch (C7714b e11) {
                            e = e11;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c7733c.m10331a();
                            c7733c.f13367c = "201";
                            c7733c.f13373i = e.m10216a();
                            C7732b.m10330a(c7733c);
                            C7744e.m10399b("PatchManager", "addPatch fail", e, Constants.KEY_HTTP_CODE, Integer.valueOf(e.m10216a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                            patchLoadStatusListener.onLoad(0, e.m10216a(), e.getMessage(), c7733c.f13368d);
                            C7742c.m10387a(zipFile);
                            return;
                        } catch (Throwable th3) {
                            th = th3;
                            file2 = file4;
                            if (file2 != null) {
                                file2.delete();
                            }
                            c7733c.m10331a();
                            c7733c.f13367c = "201";
                            c7733c.f13373i = 71;
                            C7732b.m10330a(c7733c);
                            C7744e.m10399b("PatchManager", "addPatch fail", th, new Object[0]);
                            patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c7733c.f13368d);
                            C7742c.m10387a(zipFile);
                            return;
                        }
                    } catch (IOException e12) {
                        throw new C7714b(74, e12);
                    }
                } catch (C7714b e13) {
                    e = e13;
                    zipFile = null;
                } catch (Throwable th4) {
                    th = th4;
                    zipFile = null;
                }
                if (!this.f13305m && z13 && z11) {
                    C7744e.m10403d("PatchManager", "addPatch is hotfix patch, but app exist old patch, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c7733c.f13368d);
                    C7742c.m10387a(zipFile);
                    return;
                }
                boolean z14 = zipFile.getEntry("classes.dex") != null;
                if (!Boolean.valueOf(attributesM10217a.getValue("Has-Res")).booleanValue() && zipFile.getEntry("resources.arsc") == null && zipFile.getEntry("assets") == null) {
                    z12 = false;
                }
                if (!z14 && (z10 || (z12 && z13))) {
                    C7744e.m10403d("PatchManager", "addPatch only need to patch so lib, please relaunch app", new Object[0]);
                    patchLoadStatusListener.onLoad(0, 12, "relaunch app", c7733c.f13368d);
                    C7742c.m10387a(zipFile);
                    return;
                } else {
                    m10220a(file4, patchLoadStatusListener, c7733c);
                    C7742c.m10387a(zipFile);
                    return;
                }
            }
            throw new C7714b(4, "device is not support");
        }
        throw new C7714b(20, "patch is illegal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* renamed from: a */
    private synchronized void m10220a(File file, PatchLoadStatusListener patchLoadStatusListener, C7733c c7733c) {
        boolean z10;
        boolean zM10266a;
        boolean zM10327a;
        boolean zM10319a;
        C7744e.m10400b("PatchManager", "loadPatch", "patchFile", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        ZipFile zipFile = null;
        try {
            try {
                if (!this.f13300h) {
                    if (!C7748i.m10419a(file)) {
                        throw new C7714b(75, "patch signInfo not match to apk");
                    }
                } else {
                    C7744e.m10403d("PatchManager", "loadPatch", "skip verifyPatchLegal in debug mode");
                }
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Attributes attributesM10217a = m10217a(file);
                        String value = attributesM10217a.getValue("Modified-So");
                        boolean z11 = (!Boolean.valueOf(attributesM10217a.getValue("Has-Res")).booleanValue() && zipFile2.getEntry("resources.arsc") == null && zipFile2.getEntry("assets") == null) ? false : true;
                        int i10 = zipFile2.getEntry("classes.dex") != null ? 1 : 0;
                        if (z11) {
                            i10 |= 4;
                        }
                        if (!TextUtils.isEmpty(value)) {
                            i10 |= 2;
                        }
                        c7733c.f13370f = i10;
                        ?? r72 = (m10223a(attributesM10217a) && !this.f13306n && C7727b.m10307a()) ? 1 : 0;
                        c7733c.f13372h = r72;
                        m10227j();
                        if (zipFile2.getEntry("classes.dex") != null) {
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            C7744e.m10402c("PatchManager", "loadPatch", "start patch dex file");
                            zM10266a = new C7722a().m10266a(file, r72, patchLoadStatusListener, c7733c);
                            if (zM10266a) {
                                C7744e.m10402c("PatchManager", "loadPatch", "finish patch dex file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis2));
                                m10229l();
                            } else {
                                C7744e.m10402c("PatchManager", "loadPatch", "wait preload dex file complete");
                                if (C7746g.m10408a(C7728b.f13354b)) {
                                    m10228k();
                                }
                            }
                            z10 = false;
                        } else {
                            C7744e.m10403d("PatchManager", "loadPatch", "no dex file found");
                            z10 = true;
                            zM10266a = false;
                        }
                        if ((zM10266a || z10) && z11) {
                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                            C7744e.m10402c("PatchManager", "loadPatch", "start patch res file");
                            zM10327a = new C7730d().m10327a(file);
                            C7744e.m10402c("PatchManager", "loadPatch", "finish patch res file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis3));
                        } else {
                            zM10327a = false;
                        }
                        if (zM10266a) {
                            if (TextUtils.isEmpty(value)) {
                                zM10319a = false;
                            } else {
                                long jCurrentTimeMillis4 = System.currentTimeMillis();
                                C7744e.m10402c("PatchManager", "loadPatch", "start patch lib file");
                                zM10319a = new C7729c().m10319a(value, this.f13295c);
                                C7744e.m10402c("PatchManager", "loadPatch", "finish patch lib file(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis4));
                            }
                            C7729c.m10313a();
                        } else {
                            zM10319a = false;
                        }
                        if (zM10266a || zM10327a || zM10319a) {
                            if (this.f13303k == null) {
                                this.f13303k = new C7716d(zM10266a, zM10327a, zM10319a, r72);
                            }
                            c7733c.m10331a();
                            c7733c.f13369e = System.currentTimeMillis() - jCurrentTimeMillis;
                            c7733c.f13367c = "200";
                            C7732b.m10330a(c7733c);
                            C7744e.m10402c("PatchManager", "loadPatch success", "hasDexPatched", Boolean.valueOf(zM10266a), "hasResPatched", Boolean.valueOf(zM10327a), "hasSOPatched", Boolean.valueOf(zM10319a));
                            patchLoadStatusListener.onLoad(0, 1, "load success", c7733c.f13368d);
                        } else if (z10) {
                            C7744e.m10402c("PatchManager", "loadPatch fail", "invalid patch");
                            patchLoadStatusListener.onLoad(0, 20, "did not load anything", c7733c.f13368d);
                        }
                        C7742c.m10387a(zipFile2);
                    } catch (C7714b e10) {
                        e = e10;
                        zipFile = zipFile2;
                        c7733c.m10331a();
                        c7733c.f13367c = "201";
                        c7733c.f13373i = e.m10216a();
                        C7732b.m10330a(c7733c);
                        C7744e.m10399b("PatchManager", "loadPatch fail", e, Constants.KEY_HTTP_CODE, Integer.valueOf(e.m10216a()), NotificationCompat.CATEGORY_MESSAGE, e.getMessage());
                        patchLoadStatusListener.onLoad(0, e.m10216a(), e.getMessage(), c7733c.f13368d);
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        c7733c.m10331a();
                        c7733c.f13367c = "201";
                        c7733c.f13373i = 71;
                        C7732b.m10330a(c7733c);
                        C7744e.m10399b("PatchManager", "loadPatch fail", th, new Object[0]);
                        patchLoadStatusListener.onLoad(0, 71, th.getMessage(), c7733c.f13368d);
                    }
                } catch (IOException e11) {
                    throw new C7714b(77, e11);
                }
            } finally {
                C7742c.m10387a(zipFile);
            }
        } catch (C7714b e12) {
            e = e12;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    private Attributes m10217a(File file) throws Throwable {
        try {
            try {
                JarFile jarFile = new JarFile(file);
                try {
                    InputStream inputStream = jarFile.getInputStream(jarFile.getJarEntry("META-INF/SOPHIX.MF"));
                    Attributes mainAttributes = new Manifest(inputStream).getMainAttributes();
                    String value = mainAttributes.getValue("Sophix-Version");
                    if (!TextUtils.isEmpty(value) && "2.0".equals(value)) {
                        C7742c.m10382a(inputStream);
                        C7742c.m10387a((ZipFile) jarFile);
                        return mainAttributes;
                    }
                    throw new C7714b(76, "require version:2.0 but patch version:" + value);
                } catch (IOException e10) {
                    e = e10;
                    throw new C7714b(73, e);
                }
            } catch (Throwable th) {
                th = th;
                C7742c.m10382a((Closeable) null);
                C7742c.m10387a((ZipFile) null);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
        } catch (Throwable th2) {
            th = th2;
            C7742c.m10382a((Closeable) null);
            C7742c.m10387a((ZipFile) null);
            throw th;
        }
    }

    /* renamed from: a */
    private boolean m10223a(Attributes attributes) {
        boolean z10 = Boolean.parseBoolean(attributes.getValue("Support-Hot"));
        if (z10) {
            String value = attributes.getValue("System-Reference");
            if (!TextUtils.isEmpty(value)) {
                C7744e.m10393a("PatchManager", "checkSupportHotfix", "systemReferences", value);
                JSONArray jSONArray = new JSONArray(value);
                ClassLoader classLoader = getClass().getClassLoader();
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    String str = (String) jSONArray.get(i10);
                    try {
                    } catch (ClassNotFoundException e10) {
                        C7744e.m10392a("PatchManager", "checkSupportHotfix", e10, new Object[0]);
                    }
                    if ((classLoader.loadClass(str).getModifiers() & 1) == 0) {
                        C7744e.m10402c("PatchManager", "checkSupportHotfix", "systemClzName", str, "not public");
                        return false;
                    }
                    continue;
                }
            }
        }
        return z10;
    }

    /* renamed from: a */
    public void m10241a(boolean z10) {
        this.f13300h = z10;
    }

    /* renamed from: a */
    public void m10238a(String str, int i10) {
        C7750k.m10432a(str, i10);
    }

    /* renamed from: a */
    public void m10236a(Class cls) {
        C7725b.m10279a(cls);
    }

    /* renamed from: a */
    private void m10221a(String str, Throwable th) {
        throw new RuntimeException("abandon initialization: " + str, th);
    }

    /* renamed from: a */
    public void m10235a(InterfaceC7731a interfaceC7731a) {
        C7732b.m10329a(interfaceC7731a);
    }
}
