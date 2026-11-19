package com.taobao.sophix.p043b.p044a.p045a;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.listener.C6387a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p042a.C6348b;
import com.taobao.sophix.p043b.C6362b;
import com.taobao.sophix.p043b.p044a.InterfaceC6357a;
import com.taobao.sophix.p047c.C6366b;
import com.taobao.sophix.p047c.C6367c;
import com.taobao.sophix.p052e.C6375b;
import com.taobao.sophix.p052e.C6376c;
import com.taobao.sophix.p052e.C6378e;
import com.taobao.sophix.p052e.C6379f;
import com.taobao.sophix.p052e.C6380g;
import com.taobao.sophix.p052e.C6381h;
import com.taobao.sophix.p052e.C6382i;
import com.taobao.sophix.p052e.C6383j;
import com.taobao.sophix.p052e.C6385l;
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

/* renamed from: com.taobao.sophix.b.a.a.b */
/* loaded from: classes4.dex */
public class C6359b implements InterfaceC6357a {

    /* renamed from: b */
    private static PatchLoadStatusListener f4899b;

    /* renamed from: c */
    private static String f4900c;

    /* renamed from: a */
    private C6367c f4901a;

    /* renamed from: com.taobao.sophix.b.a.a.b$a */
    public static class a {

        /* renamed from: a */
        private static final List<Class> f4904a = m4613b();

        /* renamed from: b */
        private static List<Class> m4613b() {
            List<Class> listM4602e = C6359b.m4602e();
            PatchLoadStatusListener patchLoadStatusListener = C6362b.f4917g;
            if (patchLoadStatusListener != null && !(patchLoadStatusListener instanceof C6387a)) {
                m4614b(listM4602e, patchLoadStatusListener.getClass());
            }
            return listM4602e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m4614b(List<Class> list, Class cls) {
            if (cls == null || list.contains(cls)) {
                return;
            }
            list.add(cls);
        }
    }

    public C6359b(PatchLoadStatusListener patchLoadStatusListener, C6367c c6367c) {
        f4899b = patchLoadStatusListener;
        this.f4901a = c6367c;
    }

    /* renamed from: b */
    private boolean m4596b(File file) throws C6348b {
        String parent = file.getParent();
        if (C6375b.m4687b()) {
            if (Build.VERSION.SDK_INT < 29) {
                return m4601d(m4598c(new File(parent, m4585a(file.getName()))));
            }
            if (this.f4901a.f4924b != 3) {
                C6378e.m4711c("ColdDexManager", "android version >= 29, preload, not apply patch under enhanced.", new Object[0]);
                return false;
            }
            boolean zExists = file.exists();
            C6378e.m4711c("ColdDexManager", "android version >= 29, check patch file exists: ", Boolean.valueOf(zExists));
            return zExists;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return m4601d(m4598c(new File(parent, m4585a("sophix-merged.zip"))));
        }
        boolean zExists2 = new File(parent, "sophix-merged.zip").exists();
        C6378e.m4711c("ColdDexManager", "android version >= 29, check zip exists: ", Boolean.valueOf(zExists2));
        if (!zExists2) {
            return false;
        }
        int iM4733a = C6383j.m4733a(C6362b.f4912b, "oat_sdk_int", -1);
        C6378e.m4709b("ColdDexManager", "oat sdk int: " + iM4733a, new Object[0]);
        if (iM4733a >= 29) {
            File fileM4598c = m4598c(new File(parent, m4585a("sophix-merged.zip")));
            C6378e.m4709b("ColdDexManager", "opt file exists: " + fileM4598c.exists(), new Object[0]);
            if (fileM4598c.exists()) {
                return m4601d(fileM4598c);
            }
            return true;
        }
        C6383j.m4736a(C6362b.f4912b, "oat_sdk_int");
        File fileM4598c2 = m4598c(new File(parent, m4585a("sophix-merged.zip")));
        C6378e.m4709b("ColdDexManager", "opt file exists: " + fileM4598c2.exists(), new Object[0]);
        if (!fileM4598c2.exists() || !C6380g.m4717a(C6362b.f4912b) || fileM4598c2.delete()) {
            return false;
        }
        C6378e.m4713e("ColdDexManager", "hasValidOptPatches", "fail to delete illegal odex file.");
        throw new C6348b(80, "fail to delete odex file.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m4603e(File file) {
        C6378e.m4711c("ColdDexManager", "doOptPatch start", new Object[0]);
        if (!C6380g.m4717a(C6362b.f4912b)) {
            C6378e.m4712d("ColdDexManager", "doOptPatch", "skip in main process");
            return;
        }
        if (C6375b.m4687b()) {
            m4608i(file);
        } else {
            m4609j(file);
            m4607h(file);
        }
        C6383j.m4739b(C6362b.f4912b, "sophix_system_fingerprint", Build.FINGERPRINT);
    }

    /* renamed from: f */
    private void m4605f(File file) throws Throwable {
        C6378e.m4709b("ColdDexManager", "optProcessedBaseDexFiles start", new Object[0]);
        m4608i(new File(file.getParent(), "classes.dex"));
        for (int iM4733a = C6383j.m4733a(C6362b.f4912b, "SP_BASE_DEX_COUNT", 0); iM4733a != 0; iM4733a--) {
            File file2 = new File(file.getParent(), "classes" + String.valueOf(iM4733a) + ".dex");
            if (!m4606g(file2)) {
                throw new C6348b(105, "processBaseDexFiles fail");
            }
            m4608i(file2);
        }
    }

    /* renamed from: g */
    private boolean m4606g(File file) {
        return SophixNative.removeClassesInBase(file.getPath(), new File(file.getParent(), "classes.dex").getPath(), m4592a(m4586a()));
    }

    /* renamed from: h */
    private void m4607h(File file) throws Throwable {
        File fileCreateTempFile;
        ZipOutputStream zipOutputStream;
        C6378e.m4709b("ColdDexManager", "optMergedAllDexFiles start", new Object[0]);
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
            C6376c.m4695a(fileInputStream, zipOutputStream);
            fileInputStream.close();
            file2.delete();
            File file3 = new File(file.getParent(), "classes" + String.valueOf(1) + ".dex");
            if (Build.VERSION.SDK_INT < 27 && m4595b() && !SophixNative.markKeptMethods(file3.getPath(), m4592a(m4586a()))) {
                C6378e.m4713e("ColdDexManager", "fail to mark kept methods", new Object[0]);
                throw new C6348b(106, "fail to mark kept methods");
            }
            int i10 = 1;
            while (file3.exists()) {
                C6378e.m4709b("ColdDexManager", "append dex file " + file3.getName() + " to jar", new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("classes");
                i10++;
                sb.append(String.valueOf(i10));
                sb.append(".dex");
                zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
                FileInputStream fileInputStream2 = new FileInputStream(file3);
                C6376c.m4695a(fileInputStream2, zipOutputStream);
                fileInputStream2.close();
                file3.delete();
                file3 = new File(file.getParent(), "classes" + String.valueOf(i10) + ".dex");
            }
            zipOutputStream.close();
            File file4 = new File(file.getParentFile(), "sophix-merged.zip");
            if (file4.exists()) {
                C6378e.m4709b("ColdDexManager", "mergedFile", file4.getAbsolutePath() + " exist, delete first.");
                file4.delete();
            }
            C6382i.m4732d(m4598c(new File(m4585a(file4.getPath()))));
            if (!fileCreateTempFile.renameTo(file4)) {
                throw new IOException("fail to rename");
            }
            m4608i(file4);
            C6376c.m4691a(zipOutputStream);
        } catch (IOException e11) {
            e = e11;
            throw new C6348b(107, e);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            C6376c.m4691a(zipOutputStream2);
            throw th;
        }
    }

    /* renamed from: i */
    private void m4608i(File file) throws Throwable {
        C6378e.m4711c("ColdDexManager", "preloadDex start", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file2 = new File(m4585a(file.getPath()));
        try {
            if (Build.VERSION.SDK_INT >= 26 || file.length() <= 2000000) {
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            } else if (!m4591a(file.getAbsolutePath(), file2.getPath())) {
                C6378e.m4712d("ColdDexManager", "preloadDex switch to traditional odex", new Object[0]);
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            }
            File fileM4598c = m4598c(file2);
            String strM4714a = C6379f.m4714a(fileM4598c);
            long j10 = 1000;
            while (true) {
                if (!TextUtils.isEmpty(strM4714a) && strM4714a.equals(C6379f.m4714a(fileM4598c))) {
                    break;
                }
                strM4714a = C6379f.m4714a(fileM4598c);
                try {
                    C6378e.m4709b("ColdDexManager", "preloadDex wait dexopt " + String.valueOf(j10) + "ms", new Object[0]);
                    Thread.sleep(j10);
                } catch (InterruptedException unused) {
                }
                if (j10 < 8000) {
                    j10 += 1000;
                } else if (TextUtils.isEmpty(strM4714a)) {
                    C6378e.m4712d("ColdDexManager", "preloadDex signature is always empty, abandon.", new Object[0]);
                    break;
                }
            }
            C6378e.m4711c("ColdDexManager", "preloadDex end", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            C6382i.m4726a(fileM4598c, strM4714a);
            C6383j.m4738b(C6362b.f4912b, "oat_sdk_int", Build.VERSION.SDK_INT);
        } catch (IOException e10) {
            throw new C6348b(102, e10);
        }
    }

    /* renamed from: j */
    private void m4609j(File file) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2;
        int i10 = 0;
        C6378e.m4709b("ColdDexManager", "extractAllBaseDexFiles start", new Object[0]);
        ZipFile zipFile3 = null;
        try {
            zipFile2 = new ZipFile(file);
            try {
                try {
                    zipFile = new ZipFile(C6362b.f4912b.getApplicationInfo().sourceDir);
                    try {
                        File parentFile = file.getParentFile();
                        ZipEntry entry = zipFile2.getEntry("classes.dex");
                        if (entry != null) {
                            m4590a(zipFile2, entry, parentFile + File.separator + "classes.dex");
                        }
                        C6383j.m4738b(C6362b.f4912b, "SP_BASE_DEX_COUNT", 0);
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (name.startsWith("classes") && name.endsWith(".dex")) {
                                if (name.equals("classes.dex")) {
                                    name = "classes1.dex";
                                }
                                m4590a(zipFile, zipEntryNextElement, parentFile + File.separator + name);
                                i10++;
                            }
                        }
                        C6383j.m4738b(C6362b.f4912b, "SP_BASE_DEX_COUNT", i10);
                        C6376c.m4696a(zipFile2);
                        C6376c.m4696a(zipFile);
                    } catch (Throwable th) {
                        th = th;
                        zipFile3 = zipFile2;
                        C6376c.m4696a(zipFile3);
                        C6376c.m4696a(zipFile);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new C6348b(103, e);
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
            C6376c.m4696a(zipFile3);
            C6376c.m4696a(zipFile);
            throw th;
        }
    }

    /* renamed from: k */
    private void m4610k(File file) throws C6348b, IOException {
        C6378e.m4711c("ColdDexManager", "doApplyPatch", new Object[0]);
        C6358a c6358a = new C6358a(getClass().getClassLoader());
        if (C6375b.m4687b()) {
            c6358a.m4583a(file);
        } else {
            c6358a.m4583a(new File(file.getParentFile(), "sophix-merged.zip"));
        }
    }

    /* renamed from: c */
    private File m4598c(File file) {
        if (Build.VERSION.SDK_INT < 26) {
            return file;
        }
        String name = file.getName();
        String str = name.substring(0, name.indexOf(".")) + ".odex";
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        sb.append("oat");
        String str2 = File.separator;
        sb.append(str2);
        sb.append(m4604f());
        sb.append(str2);
        sb.append(str);
        return new File(parentFile, sb.toString());
    }

    /* renamed from: d */
    private boolean m4601d(File file) throws C6348b {
        C6378e.m4709b("ColdDexManager", "isOptFileValid", "file", file.getName());
        if (!file.exists()) {
            C6378e.m4709b("ColdDexManager", "isOptFileValid", "odex not exist");
            return false;
        }
        if (C6382i.m4730b(file)) {
            C6378e.m4702a("ColdDexManager", "isOptFileValid", "odex is legal");
            return true;
        }
        if (C6380g.m4717a(C6362b.f4912b)) {
            C6378e.m4712d("ColdDexManager", "isOptFileValid", "odex is illegal");
            if (!file.delete()) {
                C6378e.m4713e("ColdDexManager", "isOptFileValid", "fail to delete illegal odex file.");
                throw new C6348b(80, "fail to delete odex file.");
            }
        }
        return false;
    }

    @Override // com.taobao.sophix.p043b.p044a.InterfaceC6357a
    /* renamed from: a */
    public boolean mo4576a(final File file) throws C6348b, IOException {
        if (m4596b(file)) {
            this.f4901a.m4640a();
            C6367c c6367c = this.f4901a;
            c6367c.f4925c = "181";
            C6366b.m4639a(c6367c);
            m4610k(file);
            return true;
        }
        C6385l.m4745a(new Runnable() { // from class: com.taobao.sophix.b.a.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C6359b.this.m4603e(file);
                    long length = 0;
                    for (File file2 : file.getParentFile().listFiles()) {
                        if (file2.getName().endsWith(".dex") || file2.getName().equals("sophix-merged.zip")) {
                            length += file2.length();
                        }
                    }
                    C6359b.this.f4901a.m4640a();
                    C6359b.this.f4901a.f4929g = length;
                    C6359b.this.f4901a.f4927e = System.currentTimeMillis() - jCurrentTimeMillis;
                    C6359b.this.f4901a.f4925c = "181";
                    C6366b.m4639a(C6359b.this.f4901a);
                    C6359b.f4899b.onLoad(0, 100, "preload success", C6359b.this.f4901a.f4926d);
                    C6359b.f4899b.onLoad(0, 12, "relaunch app", C6359b.this.f4901a.f4926d);
                } catch (C6348b e10) {
                    C6359b.this.f4901a.m4640a();
                    C6359b.this.f4901a.f4925c = "182";
                    C6359b.this.f4901a.f4931i = e10.m4525a();
                    C6366b.m4639a(C6359b.this.f4901a);
                    C6378e.m4708b("ColdDexManager", "patch", e10, "code", Integer.valueOf(e10.m4525a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                    C6359b.f4899b.onLoad(0, e10.m4525a(), e10.getMessage(), C6359b.this.f4901a.f4926d);
                } catch (Throwable th) {
                    C6359b.this.f4901a.m4640a();
                    C6359b.this.f4901a.f4925c = "182";
                    C6359b.this.f4901a.f4931i = 101;
                    C6366b.m4639a(C6359b.this.f4901a);
                    C6378e.m4708b("ColdDexManager", "patch", th, new Object[0]);
                    C6359b.f4899b.onLoad(0, 101, th.getMessage(), C6359b.this.f4901a.f4926d);
                }
            }
        });
        return false;
    }

    /* renamed from: c */
    private static void m4599c(List<Class> list, Class cls) {
        if (list.contains(cls)) {
            return;
        }
        list.add(cls);
    }

    /* renamed from: a */
    public static List<Class> m4586a() {
        return a.f4904a;
    }

    /* renamed from: f */
    private static String m4604f() {
        if (f4900c == null) {
            try {
                f4900c = (String) C6381h.m4724a(Class.forName("dalvik.system.VMRuntime"), "getInstructionSet", String.class).invoke(null, (String) C6381h.m4723a(ApplicationInfo.class, "primaryCpuAbi").get(C6362b.f4912b.getApplicationInfo()));
            } catch (Exception e10) {
                C6378e.m4708b("ColdDexManager", "fail to get primary cpu abi", e10, new Object[0]);
            }
        }
        return f4900c;
    }

    /* renamed from: a */
    private static void m4589a(List<Class> list, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            m4599c(list, cls2);
            m4589a(list, cls2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static List<Class> m4602e() {
        Class<?> cls = C6362b.f4912b.getClass();
        ArrayList arrayList = new ArrayList();
        m4599c(arrayList, cls);
        m4594b(arrayList, cls);
        m4589a(arrayList, cls);
        return arrayList;
    }

    /* renamed from: a */
    private static String[] m4592a(List<Class> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            String str = "L" + it.next().getName().replace(".", "/") + ";";
            C6378e.m4702a("ColdDexManager", "exclude " + str, new Object[0]);
            arrayList.add(str);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    private boolean m4591a(String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        arrayList.add("--runtime-arg");
        arrayList.add("-classpath");
        arrayList.add("--runtime-arg");
        arrayList.add("&");
        arrayList.add("--dex-file=" + str);
        arrayList.add("--oat-file=" + str2);
        arrayList.add("--instruction-set=" + m4604f());
        arrayList.add("--compiler-filter=interpret-only");
        ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
        processBuilder.redirectErrorStream(true);
        try {
            int iWaitFor = processBuilder.start().waitFor();
            if (iWaitFor == 0) {
                return true;
            }
            C6378e.m4713e("ColdDexManager", "dex2oat exit un-normally: " + iWaitFor, new Object[0]);
            return false;
        } catch (IOException e10) {
            C6378e.m4708b("ColdDexManager", "dex2oat failed to start", e10, new Object[0]);
            return false;
        } catch (InterruptedException e11) {
            C6378e.m4708b("ColdDexManager", "dex2oat was interrupted: ", e11, new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    private static void m4594b(List<Class> list, Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Application.class);
        for (Class superclass = cls.getSuperclass(); !arrayList.contains(superclass); superclass = superclass.getSuperclass()) {
            m4599c(list, superclass);
        }
    }

    /* renamed from: a */
    private void m4590a(ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    C6376c.m4695a(inputStream2, fileOutputStream);
                    C6376c.m4691a(inputStream2);
                    C6376c.m4691a(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    inputStream = inputStream2;
                    try {
                        throw new C6348b(104, e);
                    } catch (Throwable th) {
                        th = th;
                        C6376c.m4691a(inputStream);
                        C6376c.m4691a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    C6376c.m4691a(inputStream);
                    C6376c.m4691a(fileOutputStream);
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
    public static boolean m4595b() {
        return !C6362b.f4916f;
    }

    /* renamed from: b */
    public static void m4593b(Class cls) {
        a.m4614b(a.f4904a, cls);
    }

    /* renamed from: a */
    public static void m4588a(Class cls) {
        C6378e.m4702a("ColdDexManager", "setClearPreVerified", "ignore in art.");
    }

    /* renamed from: a */
    public static String m4585a(String str) {
        return str + ".odex";
    }
}
