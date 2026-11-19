package com.taobao.sophix.p090b.p091a.p092a;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.alibaba.android.arouter.utils.Consts;
import com.taobao.accs.common.Constants;
import com.taobao.sophix.PatchStatus;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.listener.C7752a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p089a.C7714b;
import com.taobao.sophix.p090b.C7728b;
import com.taobao.sophix.p090b.p091a.InterfaceC7723a;
import com.taobao.sophix.p094c.C7732b;
import com.taobao.sophix.p094c.C7733c;
import com.taobao.sophix.p099e.C7741b;
import com.taobao.sophix.p099e.C7742c;
import com.taobao.sophix.p099e.C7744e;
import com.taobao.sophix.p099e.C7745f;
import com.taobao.sophix.p099e.C7746g;
import com.taobao.sophix.p099e.C7747h;
import com.taobao.sophix.p099e.C7748i;
import com.taobao.sophix.p099e.C7749j;
import com.taobao.sophix.p099e.C7751l;
import dalvik.system.DexFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* renamed from: com.taobao.sophix.b.a.a.b */
/* loaded from: classes5.dex */
public class C7725b implements InterfaceC7723a {

    /* renamed from: b */
    private static PatchLoadStatusListener f13341b;

    /* renamed from: c */
    private static String f13342c;

    /* renamed from: a */
    private C7733c f13343a;

    /* renamed from: com.taobao.sophix.b.a.a.b$a */
    public static class a {

        /* renamed from: a */
        private static final List<Class> f13346a = m10304b();

        /* renamed from: b */
        private static List<Class> m10304b() {
            List<Class> listM10293e = C7725b.m10293e();
            PatchLoadStatusListener patchLoadStatusListener = C7728b.f13359g;
            if (patchLoadStatusListener != null && !(patchLoadStatusListener instanceof C7752a)) {
                m10305b(listM10293e, patchLoadStatusListener.getClass());
            }
            return listM10293e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m10305b(List<Class> list, Class cls) {
            if (cls == null || list.contains(cls)) {
                return;
            }
            list.add(cls);
        }
    }

    public C7725b(PatchLoadStatusListener patchLoadStatusListener, C7733c c7733c) {
        f13341b = patchLoadStatusListener;
        this.f13343a = c7733c;
    }

    /* renamed from: b */
    private boolean m10287b(File file) throws C7714b {
        String parent = file.getParent();
        if (C7741b.m10378b()) {
            if (Build.VERSION.SDK_INT < 29) {
                return m10292d(m10289c(new File(parent, m10276a(file.getName()))));
            }
            if (this.f13343a.f13366b != 3) {
                C7744e.m10402c("ColdDexManager", "android version >= 29, preload, not apply patch under enhanced.", new Object[0]);
                return false;
            }
            boolean zExists = file.exists();
            C7744e.m10402c("ColdDexManager", "android version >= 29, check patch file exists: ", Boolean.valueOf(zExists));
            return zExists;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return m10292d(m10289c(new File(parent, m10276a("sophix-merged.zip"))));
        }
        boolean zExists2 = new File(parent, "sophix-merged.zip").exists();
        C7744e.m10402c("ColdDexManager", "android version >= 29, check zip exists: ", Boolean.valueOf(zExists2));
        if (!zExists2) {
            return false;
        }
        int iM10424a = C7749j.m10424a(C7728b.f13354b, "oat_sdk_int", -1);
        C7744e.m10400b("ColdDexManager", "oat sdk int: " + iM10424a, new Object[0]);
        if (iM10424a >= 29) {
            File fileM10289c = m10289c(new File(parent, m10276a("sophix-merged.zip")));
            C7744e.m10400b("ColdDexManager", "opt file exists: " + fileM10289c.exists(), new Object[0]);
            if (fileM10289c.exists()) {
                return m10292d(fileM10289c);
            }
            return true;
        }
        C7749j.m10427a(C7728b.f13354b, "oat_sdk_int");
        File fileM10289c2 = m10289c(new File(parent, m10276a("sophix-merged.zip")));
        C7744e.m10400b("ColdDexManager", "opt file exists: " + fileM10289c2.exists(), new Object[0]);
        if (!fileM10289c2.exists() || !C7746g.m10408a(C7728b.f13354b) || fileM10289c2.delete()) {
            return false;
        }
        C7744e.m10404e("ColdDexManager", "hasValidOptPatches", "fail to delete illegal odex file.");
        throw new C7714b(80, "fail to delete odex file.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m10294e(File file) {
        C7744e.m10402c("ColdDexManager", "doOptPatch start", new Object[0]);
        if (!C7746g.m10408a(C7728b.f13354b)) {
            C7744e.m10403d("ColdDexManager", "doOptPatch", "skip in main process");
            return;
        }
        if (C7741b.m10378b()) {
            m10299i(file);
        } else {
            m10300j(file);
            m10298h(file);
        }
        C7749j.m10430b(C7728b.f13354b, "sophix_system_fingerprint", Build.FINGERPRINT);
    }

    /* renamed from: f */
    private void m10296f(File file) throws Throwable {
        C7744e.m10400b("ColdDexManager", "optProcessedBaseDexFiles start", new Object[0]);
        m10299i(new File(file.getParent(), "classes.dex"));
        for (int iM10424a = C7749j.m10424a(C7728b.f13354b, "SP_BASE_DEX_COUNT", 0); iM10424a != 0; iM10424a--) {
            File file2 = new File(file.getParent(), "classes" + String.valueOf(iM10424a) + ".dex");
            if (!m10297g(file2)) {
                throw new C7714b(PatchStatus.CODE_PRELOAD_REMOVE_BASEDEX, "processBaseDexFiles fail");
            }
            m10299i(file2);
        }
    }

    /* renamed from: g */
    private boolean m10297g(File file) {
        return SophixNative.removeClassesInBase(file.getPath(), new File(file.getParent(), "classes.dex").getPath(), m10283a(m10277a()));
    }

    /* renamed from: h */
    private void m10298h(File file) throws Throwable {
        File fileCreateTempFile;
        ZipOutputStream zipOutputStream;
        C7744e.m10400b("ColdDexManager", "optMergedAllDexFiles start", new Object[0]);
        ZipOutputStream zipOutputStream2 = null;
        try {
            try {
                fileCreateTempFile = File.createTempFile("sophix-merged.zip", ".tmp", file.getParentFile());
                zipOutputStream = new ZipOutputStream(new FileOutputStream(fileCreateTempFile));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            zipOutputStream.putNextEntry(new ZipEntry("classes.dex"));
            File file2 = new File(file.getParent(), "classes.dex");
            FileInputStream fileInputStream = new FileInputStream(file2);
            C7742c.m10386a(fileInputStream, zipOutputStream);
            fileInputStream.close();
            file2.delete();
            File file3 = new File(file.getParent(), "classes" + String.valueOf(1) + ".dex");
            if (Build.VERSION.SDK_INT < 27 && m10286b() && !SophixNative.markKeptMethods(file3.getPath(), m10283a(m10277a()))) {
                C7744e.m10404e("ColdDexManager", "fail to mark kept methods", new Object[0]);
                throw new C7714b(106, "fail to mark kept methods");
            }
            int i10 = 1;
            while (file3.exists()) {
                C7744e.m10400b("ColdDexManager", "append dex file " + file3.getName() + " to jar", new Object[0]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("classes");
                i10++;
                sb2.append(String.valueOf(i10));
                sb2.append(".dex");
                zipOutputStream.putNextEntry(new ZipEntry(sb2.toString()));
                FileInputStream fileInputStream2 = new FileInputStream(file3);
                C7742c.m10386a(fileInputStream2, zipOutputStream);
                fileInputStream2.close();
                file3.delete();
                file3 = new File(file.getParent(), "classes" + String.valueOf(i10) + ".dex");
            }
            zipOutputStream.close();
            File file4 = new File(file.getParentFile(), "sophix-merged.zip");
            if (file4.exists()) {
                C7744e.m10400b("ColdDexManager", "mergedFile", file4.getAbsolutePath() + " exist, delete first.");
                file4.delete();
            }
            C7748i.m10423d(m10289c(new File(m10276a(file4.getPath()))));
            if (!fileCreateTempFile.renameTo(file4)) {
                throw new IOException("fail to rename");
            }
            m10299i(file4);
            C7742c.m10382a(zipOutputStream);
        } catch (IOException e11) {
            e = e11;
            throw new C7714b(PatchStatus.CODE_PRELOAD_OPT_MERGED, e);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            C7742c.m10382a(zipOutputStream2);
            throw th;
        }
    }

    /* renamed from: i */
    private void m10299i(File file) throws Throwable {
        C7744e.m10402c("ColdDexManager", "preloadDex start", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file2 = new File(m10276a(file.getPath()));
        try {
            if (Build.VERSION.SDK_INT >= 26 || file.length() <= 2000000) {
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            } else if (!m10282a(file.getAbsolutePath(), file2.getPath())) {
                C7744e.m10403d("ColdDexManager", "preloadDex switch to traditional odex", new Object[0]);
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            }
            File fileM10289c = m10289c(file2);
            String strM10405a = C7745f.m10405a(fileM10289c);
            long j10 = 1000;
            while (true) {
                if (!TextUtils.isEmpty(strM10405a) && strM10405a.equals(C7745f.m10405a(fileM10289c))) {
                    break;
                }
                strM10405a = C7745f.m10405a(fileM10289c);
                try {
                    C7744e.m10400b("ColdDexManager", "preloadDex wait dexopt " + String.valueOf(j10) + "ms", new Object[0]);
                    Thread.sleep(j10);
                } catch (InterruptedException unused) {
                }
                if (j10 < 8000) {
                    j10 += 1000;
                } else if (TextUtils.isEmpty(strM10405a)) {
                    C7744e.m10403d("ColdDexManager", "preloadDex signature is always empty, abandon.", new Object[0]);
                    break;
                }
            }
            C7744e.m10402c("ColdDexManager", "preloadDex end", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            C7748i.m10417a(fileM10289c, strM10405a);
            C7749j.m10429b(C7728b.f13354b, "oat_sdk_int", Build.VERSION.SDK_INT);
        } catch (IOException e10) {
            throw new C7714b(102, e10);
        }
    }

    /* renamed from: j */
    private void m10300j(File file) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2;
        int i10 = 0;
        C7744e.m10400b("ColdDexManager", "extractAllBaseDexFiles start", new Object[0]);
        ZipFile zipFile3 = null;
        try {
            zipFile2 = new ZipFile(file);
            try {
                try {
                    zipFile = new ZipFile(C7728b.f13354b.getApplicationInfo().sourceDir);
                    try {
                        File parentFile = file.getParentFile();
                        ZipEntry entry = zipFile2.getEntry("classes.dex");
                        if (entry != null) {
                            m10281a(zipFile2, entry, parentFile + File.separator + "classes.dex");
                        }
                        C7749j.m10429b(C7728b.f13354b, "SP_BASE_DEX_COUNT", 0);
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (name.startsWith("classes") && name.endsWith(".dex")) {
                                if (name.equals("classes.dex")) {
                                    name = "classes1.dex";
                                }
                                m10281a(zipFile, zipEntryNextElement, parentFile + File.separator + name);
                                i10++;
                            }
                        }
                        C7749j.m10429b(C7728b.f13354b, "SP_BASE_DEX_COUNT", i10);
                        C7742c.m10387a(zipFile2);
                        C7742c.m10387a(zipFile);
                    } catch (Throwable th) {
                        th = th;
                        zipFile3 = zipFile2;
                        C7742c.m10387a(zipFile3);
                        C7742c.m10387a(zipFile);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new C7714b(103, e);
                }
            } catch (Throwable th2) {
                th = th2;
                zipFile = null;
            }
        } catch (IOException e11) {
            e = e11;
            zipFile2 = null;
        } catch (Throwable th3) {
            th = th3;
            zipFile = null;
            C7742c.m10387a(zipFile3);
            C7742c.m10387a(zipFile);
            throw th;
        }
    }

    /* renamed from: k */
    private void m10301k(File file) throws C7714b, IOException {
        C7744e.m10402c("ColdDexManager", "doApplyPatch", new Object[0]);
        C7724a c7724a = new C7724a(getClass().getClassLoader());
        if (C7741b.m10378b()) {
            c7724a.m10274a(file);
        } else {
            c7724a.m10274a(new File(file.getParentFile(), "sophix-merged.zip"));
        }
    }

    /* renamed from: c */
    private File m10289c(File file) {
        if (Build.VERSION.SDK_INT < 26) {
            return file;
        }
        String name = file.getName();
        String str = name.substring(0, name.indexOf(Consts.DOT)) + ".odex";
        File parentFile = file.getParentFile();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("oat");
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(m10295f());
        sb2.append(str2);
        sb2.append(str);
        return new File(parentFile, sb2.toString());
    }

    /* renamed from: d */
    private boolean m10292d(File file) throws C7714b {
        C7744e.m10400b("ColdDexManager", "isOptFileValid", "file", file.getName());
        if (!file.exists()) {
            C7744e.m10400b("ColdDexManager", "isOptFileValid", "odex not exist");
            return false;
        }
        if (C7748i.m10421b(file)) {
            C7744e.m10393a("ColdDexManager", "isOptFileValid", "odex is legal");
            return true;
        }
        if (C7746g.m10408a(C7728b.f13354b)) {
            C7744e.m10403d("ColdDexManager", "isOptFileValid", "odex is illegal");
            if (!file.delete()) {
                C7744e.m10404e("ColdDexManager", "isOptFileValid", "fail to delete illegal odex file.");
                throw new C7714b(80, "fail to delete odex file.");
            }
        }
        return false;
    }

    @Override // com.taobao.sophix.p090b.p091a.InterfaceC7723a
    /* renamed from: a */
    public boolean mo10267a(final File file) throws C7714b, IOException {
        if (m10287b(file)) {
            this.f13343a.m10331a();
            C7733c c7733c = this.f13343a;
            c7733c.f13367c = "181";
            C7732b.m10330a(c7733c);
            m10301k(file);
            return true;
        }
        C7751l.m10436a(new Runnable() { // from class: com.taobao.sophix.b.a.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C7725b.this.m10294e(file);
                    long length = 0;
                    for (File file2 : file.getParentFile().listFiles()) {
                        if (file2.getName().endsWith(".dex") || file2.getName().equals("sophix-merged.zip")) {
                            length += file2.length();
                        }
                    }
                    C7725b.this.f13343a.m10331a();
                    C7725b.this.f13343a.f13371g = length;
                    C7725b.this.f13343a.f13369e = System.currentTimeMillis() - jCurrentTimeMillis;
                    C7725b.this.f13343a.f13367c = "181";
                    C7732b.m10330a(C7725b.this.f13343a);
                    C7725b.f13341b.onLoad(0, 100, "preload success", C7725b.this.f13343a.f13368d);
                    C7725b.f13341b.onLoad(0, 12, "relaunch app", C7725b.this.f13343a.f13368d);
                } catch (C7714b e10) {
                    C7725b.this.f13343a.m10331a();
                    C7725b.this.f13343a.f13367c = "182";
                    C7725b.this.f13343a.f13373i = e10.m10216a();
                    C7732b.m10330a(C7725b.this.f13343a);
                    C7744e.m10399b("ColdDexManager", "patch", e10, Constants.KEY_HTTP_CODE, Integer.valueOf(e10.m10216a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                    C7725b.f13341b.onLoad(0, e10.m10216a(), e10.getMessage(), C7725b.this.f13343a.f13368d);
                } catch (Throwable th) {
                    C7725b.this.f13343a.m10331a();
                    C7725b.this.f13343a.f13367c = "182";
                    C7725b.this.f13343a.f13373i = 101;
                    C7732b.m10330a(C7725b.this.f13343a);
                    C7744e.m10399b("ColdDexManager", "patch", th, new Object[0]);
                    C7725b.f13341b.onLoad(0, 101, th.getMessage(), C7725b.this.f13343a.f13368d);
                }
            }
        });
        return false;
    }

    /* renamed from: c */
    private static void m10290c(List<Class> list, Class cls) {
        if (list.contains(cls)) {
            return;
        }
        list.add(cls);
    }

    /* renamed from: a */
    public static List<Class> m10277a() {
        return a.f13346a;
    }

    /* renamed from: f */
    private static String m10295f() {
        if (f13342c == null) {
            try {
                f13342c = (String) C7747h.m10415a(Class.forName("dalvik.system.VMRuntime"), "getInstructionSet", String.class).invoke(null, (String) C7747h.m10414a(ApplicationInfo.class, "primaryCpuAbi").get(C7728b.f13354b.getApplicationInfo()));
            } catch (Exception e10) {
                C7744e.m10399b("ColdDexManager", "fail to get primary cpu abi", e10, new Object[0]);
            }
        }
        return f13342c;
    }

    /* renamed from: a */
    private static void m10280a(List<Class> list, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            m10290c(list, cls2);
            m10280a(list, cls2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static List<Class> m10293e() {
        Class<?> cls = C7728b.f13354b.getClass();
        ArrayList arrayList = new ArrayList();
        m10290c(arrayList, cls);
        m10285b(arrayList, cls);
        m10280a(arrayList, cls);
        return arrayList;
    }

    /* renamed from: a */
    private static String[] m10283a(List<Class> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            String str = "L" + it.next().getName().replace(Consts.DOT, MqttTopic.TOPIC_LEVEL_SEPARATOR) + ";";
            C7744e.m10393a("ColdDexManager", "exclude " + str, new Object[0]);
            arrayList.add(str);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    private boolean m10282a(String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        arrayList.add("--runtime-arg");
        arrayList.add("-classpath");
        arrayList.add("--runtime-arg");
        arrayList.add("&");
        arrayList.add("--dex-file=" + str);
        arrayList.add("--oat-file=" + str2);
        arrayList.add("--instruction-set=" + m10295f());
        arrayList.add("--compiler-filter=interpret-only");
        ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
        processBuilder.redirectErrorStream(true);
        try {
            int iWaitFor = processBuilder.start().waitFor();
            if (iWaitFor == 0) {
                return true;
            }
            C7744e.m10404e("ColdDexManager", "dex2oat exit un-normally: " + iWaitFor, new Object[0]);
            return false;
        } catch (IOException e10) {
            C7744e.m10399b("ColdDexManager", "dex2oat failed to start", e10, new Object[0]);
            return false;
        } catch (InterruptedException e11) {
            C7744e.m10399b("ColdDexManager", "dex2oat was interrupted: ", e11, new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    private static void m10285b(List<Class> list, Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Application.class);
        for (Class superclass = cls.getSuperclass(); !arrayList.contains(superclass); superclass = superclass.getSuperclass()) {
            m10290c(list, superclass);
        }
    }

    /* renamed from: a */
    private void m10281a(ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    C7742c.m10386a(inputStream2, fileOutputStream);
                    C7742c.m10382a(inputStream2);
                    C7742c.m10382a(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    inputStream = inputStream2;
                    try {
                        throw new C7714b(104, e);
                    } catch (Throwable th) {
                        th = th;
                        C7742c.m10382a(inputStream);
                        C7742c.m10382a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    C7742c.m10382a(inputStream);
                    C7742c.m10382a(fileOutputStream);
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e12) {
            e = e12;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* renamed from: b */
    public static boolean m10286b() {
        return !C7728b.f13358f;
    }

    /* renamed from: b */
    public static void m10284b(Class cls) {
        a.m10305b(a.f13346a, cls);
    }

    /* renamed from: a */
    public static void m10279a(Class cls) {
        C7744e.m10393a("ColdDexManager", "setClearPreVerified", "ignore in art.");
    }

    /* renamed from: a */
    public static String m10276a(String str) {
        return str + ".odex";
    }
}
