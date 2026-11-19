package com.taobao.sophix.p060b.p061a.p062a;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.taobao.sophix.core.dex.SophixNative;
import com.taobao.sophix.listener.C6647a;
import com.taobao.sophix.listener.PatchLoadStatusListener;
import com.taobao.sophix.p059a.C6608b;
import com.taobao.sophix.p060b.C6622b;
import com.taobao.sophix.p060b.p061a.InterfaceC6617a;
import com.taobao.sophix.p064c.C6626b;
import com.taobao.sophix.p064c.C6627c;
import com.taobao.sophix.p069e.C6635b;
import com.taobao.sophix.p069e.C6636c;
import com.taobao.sophix.p069e.C6638e;
import com.taobao.sophix.p069e.C6639f;
import com.taobao.sophix.p069e.C6640g;
import com.taobao.sophix.p069e.C6641h;
import com.taobao.sophix.p069e.C6642i;
import com.taobao.sophix.p069e.C6643j;
import com.taobao.sophix.p069e.C6645l;
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
public class C6619b implements InterfaceC6617a {

    /* renamed from: b */
    private static PatchLoadStatusListener f5476b;

    /* renamed from: c */
    private static String f5477c;

    /* renamed from: a */
    private C6627c f5478a;

    /* renamed from: com.taobao.sophix.b.a.a.b$a */
    public static class a {

        /* renamed from: a */
        private static final List<Class> f5481a = m4792b();

        /* renamed from: b */
        private static List<Class> m4792b() {
            List<Class> listM4781e = C6619b.m4781e();
            PatchLoadStatusListener patchLoadStatusListener = C6622b.f5494g;
            if (patchLoadStatusListener != null && !(patchLoadStatusListener instanceof C6647a)) {
                m4793b(listM4781e, patchLoadStatusListener.getClass());
            }
            return listM4781e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static void m4793b(List<Class> list, Class cls) {
            if (cls == null || list.contains(cls)) {
                return;
            }
            list.add(cls);
        }
    }

    public C6619b(PatchLoadStatusListener patchLoadStatusListener, C6627c c6627c) {
        f5476b = patchLoadStatusListener;
        this.f5478a = c6627c;
    }

    /* renamed from: b */
    private boolean m4775b(File file) throws C6608b {
        String parent = file.getParent();
        if (C6635b.m4866b()) {
            if (Build.VERSION.SDK_INT < 29) {
                return m4780d(m4777c(new File(parent, m4764a(file.getName()))));
            }
            if (this.f5478a.f5501b != 3) {
                C6638e.m4890c("ColdDexManager", "android version >= 29, preload, not apply patch under enhanced.", new Object[0]);
                return false;
            }
            boolean zExists = file.exists();
            C6638e.m4890c("ColdDexManager", "android version >= 29, check patch file exists: ", Boolean.valueOf(zExists));
            return zExists;
        }
        if (Build.VERSION.SDK_INT < 29) {
            return m4780d(m4777c(new File(parent, m4764a("sophix-merged.zip"))));
        }
        boolean zExists2 = new File(parent, "sophix-merged.zip").exists();
        C6638e.m4890c("ColdDexManager", "android version >= 29, check zip exists: ", Boolean.valueOf(zExists2));
        if (!zExists2) {
            return false;
        }
        int iM4912a = C6643j.m4912a(C6622b.f5489b, "oat_sdk_int", -1);
        C6638e.m4888b("ColdDexManager", "oat sdk int: " + iM4912a, new Object[0]);
        if (iM4912a >= 29) {
            File fileM4777c = m4777c(new File(parent, m4764a("sophix-merged.zip")));
            C6638e.m4888b("ColdDexManager", "opt file exists: " + fileM4777c.exists(), new Object[0]);
            if (fileM4777c.exists()) {
                return m4780d(fileM4777c);
            }
            return true;
        }
        C6643j.m4915a(C6622b.f5489b, "oat_sdk_int");
        File fileM4777c2 = m4777c(new File(parent, m4764a("sophix-merged.zip")));
        C6638e.m4888b("ColdDexManager", "opt file exists: " + fileM4777c2.exists(), new Object[0]);
        if (!fileM4777c2.exists() || !C6640g.m4896a(C6622b.f5489b) || fileM4777c2.delete()) {
            return false;
        }
        C6638e.m4892e("ColdDexManager", "hasValidOptPatches", "fail to delete illegal odex file.");
        throw new C6608b(80, "fail to delete odex file.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public synchronized void m4782e(File file) {
        C6638e.m4890c("ColdDexManager", "doOptPatch start", new Object[0]);
        if (!C6640g.m4896a(C6622b.f5489b)) {
            C6638e.m4891d("ColdDexManager", "doOptPatch", "skip in main process");
            return;
        }
        if (C6635b.m4866b()) {
            m4787i(file);
        } else {
            m4788j(file);
            m4786h(file);
        }
        C6643j.m4918b(C6622b.f5489b, "sophix_system_fingerprint", Build.FINGERPRINT);
    }

    /* renamed from: f */
    private void m4784f(File file) throws Throwable {
        C6638e.m4888b("ColdDexManager", "optProcessedBaseDexFiles start", new Object[0]);
        m4787i(new File(file.getParent(), "classes.dex"));
        for (int iM4912a = C6643j.m4912a(C6622b.f5489b, "SP_BASE_DEX_COUNT", 0); iM4912a != 0; iM4912a--) {
            File file2 = new File(file.getParent(), "classes" + String.valueOf(iM4912a) + ".dex");
            if (!m4785g(file2)) {
                throw new C6608b(105, "processBaseDexFiles fail");
            }
            m4787i(file2);
        }
    }

    /* renamed from: g */
    private boolean m4785g(File file) {
        return SophixNative.removeClassesInBase(file.getPath(), new File(file.getParent(), "classes.dex").getPath(), m4771a(m4765a()));
    }

    /* renamed from: h */
    private void m4786h(File file) throws Throwable {
        File fileCreateTempFile;
        ZipOutputStream zipOutputStream;
        C6638e.m4888b("ColdDexManager", "optMergedAllDexFiles start", new Object[0]);
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
            C6636c.m4874a(fileInputStream, zipOutputStream);
            fileInputStream.close();
            file2.delete();
            File file3 = new File(file.getParent(), "classes" + String.valueOf(1) + ".dex");
            if (Build.VERSION.SDK_INT < 27 && m4774b() && !SophixNative.markKeptMethods(file3.getPath(), m4771a(m4765a()))) {
                C6638e.m4892e("ColdDexManager", "fail to mark kept methods", new Object[0]);
                throw new C6608b(106, "fail to mark kept methods");
            }
            int i9 = 1;
            while (file3.exists()) {
                C6638e.m4888b("ColdDexManager", "append dex file " + file3.getName() + " to jar", new Object[0]);
                StringBuilder sb = new StringBuilder();
                sb.append("classes");
                i9++;
                sb.append(String.valueOf(i9));
                sb.append(".dex");
                zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
                FileInputStream fileInputStream2 = new FileInputStream(file3);
                C6636c.m4874a(fileInputStream2, zipOutputStream);
                fileInputStream2.close();
                file3.delete();
                file3 = new File(file.getParent(), "classes" + String.valueOf(i9) + ".dex");
            }
            zipOutputStream.close();
            File file4 = new File(file.getParentFile(), "sophix-merged.zip");
            if (file4.exists()) {
                C6638e.m4888b("ColdDexManager", "mergedFile", file4.getAbsolutePath() + " exist, delete first.");
                file4.delete();
            }
            C6642i.m4911d(m4777c(new File(m4764a(file4.getPath()))));
            if (!fileCreateTempFile.renameTo(file4)) {
                throw new IOException("fail to rename");
            }
            m4787i(file4);
            C6636c.m4870a(zipOutputStream);
        } catch (IOException e11) {
            e = e11;
            throw new C6608b(107, e);
        } catch (Throwable th2) {
            th = th2;
            zipOutputStream2 = zipOutputStream;
            C6636c.m4870a(zipOutputStream2);
            throw th;
        }
    }

    /* renamed from: i */
    private void m4787i(File file) throws Throwable {
        C6638e.m4890c("ColdDexManager", "preloadDex start", file.getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        File file2 = new File(m4764a(file.getPath()));
        try {
            if (Build.VERSION.SDK_INT >= 26 || file.length() <= 2000000) {
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            } else if (!m4770a(file.getAbsolutePath(), file2.getPath())) {
                C6638e.m4891d("ColdDexManager", "preloadDex switch to traditional odex", new Object[0]);
                DexFile.loadDex(file.getAbsolutePath(), file2.getPath(), 0);
            }
            File fileM4777c = m4777c(file2);
            String strM4893a = C6639f.m4893a(fileM4777c);
            long j9 = 1000;
            while (true) {
                if (!TextUtils.isEmpty(strM4893a) && strM4893a.equals(C6639f.m4893a(fileM4777c))) {
                    break;
                }
                strM4893a = C6639f.m4893a(fileM4777c);
                try {
                    C6638e.m4888b("ColdDexManager", "preloadDex wait dexopt " + String.valueOf(j9) + "ms", new Object[0]);
                    Thread.sleep(j9);
                } catch (InterruptedException unused) {
                }
                if (j9 < 8000) {
                    j9 += 1000;
                } else if (TextUtils.isEmpty(strM4893a)) {
                    C6638e.m4891d("ColdDexManager", "preloadDex signature is always empty, abandon.", new Object[0]);
                    break;
                }
            }
            C6638e.m4890c("ColdDexManager", "preloadDex end", "time consumed(ms)", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
            C6642i.m4905a(fileM4777c, strM4893a);
            C6643j.m4917b(C6622b.f5489b, "oat_sdk_int", Build.VERSION.SDK_INT);
        } catch (IOException e10) {
            throw new C6608b(102, e10);
        }
    }

    /* renamed from: j */
    private void m4788j(File file) throws Throwable {
        ZipFile zipFile;
        ZipFile zipFile2;
        int i9 = 0;
        C6638e.m4888b("ColdDexManager", "extractAllBaseDexFiles start", new Object[0]);
        ZipFile zipFile3 = null;
        try {
            zipFile2 = new ZipFile(file);
            try {
                try {
                    zipFile = new ZipFile(C6622b.f5489b.getApplicationInfo().sourceDir);
                    try {
                        File parentFile = file.getParentFile();
                        ZipEntry entry = zipFile2.getEntry("classes.dex");
                        if (entry != null) {
                            m4769a(zipFile2, entry, parentFile + File.separator + "classes.dex");
                        }
                        C6643j.m4917b(C6622b.f5489b, "SP_BASE_DEX_COUNT", 0);
                        Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                        while (enumerationEntries.hasMoreElements()) {
                            ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                            String name = zipEntryNextElement.getName();
                            if (name.startsWith("classes") && name.endsWith(".dex")) {
                                if (name.equals("classes.dex")) {
                                    name = "classes1.dex";
                                }
                                m4769a(zipFile, zipEntryNextElement, parentFile + File.separator + name);
                                i9++;
                            }
                        }
                        C6643j.m4917b(C6622b.f5489b, "SP_BASE_DEX_COUNT", i9);
                        C6636c.m4875a(zipFile2);
                        C6636c.m4875a(zipFile);
                    } catch (Throwable th) {
                        th = th;
                        zipFile3 = zipFile2;
                        C6636c.m4875a(zipFile3);
                        C6636c.m4875a(zipFile);
                        throw th;
                    }
                } catch (IOException e10) {
                    e = e10;
                    throw new C6608b(103, e);
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
            C6636c.m4875a(zipFile3);
            C6636c.m4875a(zipFile);
            throw th;
        }
    }

    /* renamed from: k */
    private void m4789k(File file) throws C6608b, IOException {
        C6638e.m4890c("ColdDexManager", "doApplyPatch", new Object[0]);
        C6618a c6618a = new C6618a(getClass().getClassLoader());
        if (C6635b.m4866b()) {
            c6618a.m4762a(file);
        } else {
            c6618a.m4762a(new File(file.getParentFile(), "sophix-merged.zip"));
        }
    }

    /* renamed from: c */
    private File m4777c(File file) {
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
        sb.append(m4783f());
        sb.append(str2);
        sb.append(str);
        return new File(parentFile, sb.toString());
    }

    /* renamed from: d */
    private boolean m4780d(File file) throws C6608b {
        C6638e.m4888b("ColdDexManager", "isOptFileValid", "file", file.getName());
        if (!file.exists()) {
            C6638e.m4888b("ColdDexManager", "isOptFileValid", "odex not exist");
            return false;
        }
        if (C6642i.m4909b(file)) {
            C6638e.m4881a("ColdDexManager", "isOptFileValid", "odex is legal");
            return true;
        }
        if (C6640g.m4896a(C6622b.f5489b)) {
            C6638e.m4891d("ColdDexManager", "isOptFileValid", "odex is illegal");
            if (!file.delete()) {
                C6638e.m4892e("ColdDexManager", "isOptFileValid", "fail to delete illegal odex file.");
                throw new C6608b(80, "fail to delete odex file.");
            }
        }
        return false;
    }

    @Override // com.taobao.sophix.p060b.p061a.InterfaceC6617a
    /* renamed from: a */
    public boolean mo4755a(final File file) throws C6608b, IOException {
        if (m4775b(file)) {
            this.f5478a.m4819a();
            C6627c c6627c = this.f5478a;
            c6627c.f5502c = "181";
            C6626b.m4818a(c6627c);
            m4789k(file);
            return true;
        }
        C6645l.m4924a(new Runnable() { // from class: com.taobao.sophix.b.a.a.b.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C6619b.this.m4782e(file);
                    long length = 0;
                    for (File file2 : file.getParentFile().listFiles()) {
                        if (file2.getName().endsWith(".dex") || file2.getName().equals("sophix-merged.zip")) {
                            length += file2.length();
                        }
                    }
                    C6619b.this.f5478a.m4819a();
                    C6619b.this.f5478a.f5506g = length;
                    C6619b.this.f5478a.f5504e = System.currentTimeMillis() - jCurrentTimeMillis;
                    C6619b.this.f5478a.f5502c = "181";
                    C6626b.m4818a(C6619b.this.f5478a);
                    C6619b.f5476b.onLoad(0, 100, "preload success", C6619b.this.f5478a.f5503d);
                    C6619b.f5476b.onLoad(0, 12, "relaunch app", C6619b.this.f5478a.f5503d);
                } catch (C6608b e10) {
                    C6619b.this.f5478a.m4819a();
                    C6619b.this.f5478a.f5502c = "182";
                    C6619b.this.f5478a.f5508i = e10.m4704a();
                    C6626b.m4818a(C6619b.this.f5478a);
                    C6638e.m4887b("ColdDexManager", "patch", e10, "code", Integer.valueOf(e10.m4704a()), NotificationCompat.CATEGORY_MESSAGE, e10.getMessage());
                    C6619b.f5476b.onLoad(0, e10.m4704a(), e10.getMessage(), C6619b.this.f5478a.f5503d);
                } catch (Throwable th) {
                    C6619b.this.f5478a.m4819a();
                    C6619b.this.f5478a.f5502c = "182";
                    C6619b.this.f5478a.f5508i = 101;
                    C6626b.m4818a(C6619b.this.f5478a);
                    C6638e.m4887b("ColdDexManager", "patch", th, new Object[0]);
                    C6619b.f5476b.onLoad(0, 101, th.getMessage(), C6619b.this.f5478a.f5503d);
                }
            }
        });
        return false;
    }

    /* renamed from: c */
    private static void m4778c(List<Class> list, Class cls) {
        if (list.contains(cls)) {
            return;
        }
        list.add(cls);
    }

    /* renamed from: a */
    public static List<Class> m4765a() {
        return a.f5481a;
    }

    /* renamed from: f */
    private static String m4783f() {
        if (f5477c == null) {
            try {
                f5477c = (String) C6641h.m4903a(Class.forName("dalvik.system.VMRuntime"), "getInstructionSet", String.class).invoke(null, (String) C6641h.m4902a(ApplicationInfo.class, "primaryCpuAbi").get(C6622b.f5489b.getApplicationInfo()));
            } catch (Exception e10) {
                C6638e.m4887b("ColdDexManager", "fail to get primary cpu abi", e10, new Object[0]);
            }
        }
        return f5477c;
    }

    /* renamed from: a */
    private static void m4768a(List<Class> list, Class cls) {
        for (Class<?> cls2 : cls.getInterfaces()) {
            m4778c(list, cls2);
            m4768a(list, cls2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static List<Class> m4781e() {
        Class<?> cls = C6622b.f5489b.getClass();
        ArrayList arrayList = new ArrayList();
        m4778c(arrayList, cls);
        m4773b(arrayList, cls);
        m4768a(arrayList, cls);
        return arrayList;
    }

    /* renamed from: a */
    private static String[] m4771a(List<Class> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Class> it = list.iterator();
        while (it.hasNext()) {
            String str = "L" + it.next().getName().replace(".", "/") + ";";
            C6638e.m4881a("ColdDexManager", "exclude " + str, new Object[0]);
            arrayList.add(str);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* renamed from: a */
    private boolean m4770a(String str, String str2) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        arrayList.add("dex2oat");
        arrayList.add("--runtime-arg");
        arrayList.add("-classpath");
        arrayList.add("--runtime-arg");
        arrayList.add("&");
        arrayList.add("--dex-file=" + str);
        arrayList.add("--oat-file=" + str2);
        arrayList.add("--instruction-set=" + m4783f());
        arrayList.add("--compiler-filter=interpret-only");
        ProcessBuilder processBuilder = new ProcessBuilder(arrayList);
        processBuilder.redirectErrorStream(true);
        try {
            int iWaitFor = processBuilder.start().waitFor();
            if (iWaitFor == 0) {
                return true;
            }
            C6638e.m4892e("ColdDexManager", "dex2oat exit un-normally: " + iWaitFor, new Object[0]);
            return false;
        } catch (IOException e10) {
            C6638e.m4887b("ColdDexManager", "dex2oat failed to start", e10, new Object[0]);
            return false;
        } catch (InterruptedException e11) {
            C6638e.m4887b("ColdDexManager", "dex2oat was interrupted: ", e11, new Object[0]);
            return false;
        }
    }

    /* renamed from: b */
    private static void m4773b(List<Class> list, Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Application.class);
        for (Class superclass = cls.getSuperclass(); !arrayList.contains(superclass); superclass = superclass.getSuperclass()) {
            m4778c(list, superclass);
        }
    }

    /* renamed from: a */
    private void m4769a(ZipFile zipFile, ZipEntry zipEntry, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        try {
            InputStream inputStream2 = zipFile.getInputStream(zipEntry);
            try {
                fileOutputStream = new FileOutputStream(str);
                try {
                    C6636c.m4874a(inputStream2, fileOutputStream);
                    C6636c.m4870a(inputStream2);
                    C6636c.m4870a(fileOutputStream);
                } catch (IOException e10) {
                    e = e10;
                    inputStream = inputStream2;
                    try {
                        throw new C6608b(104, e);
                    } catch (Throwable th) {
                        th = th;
                        C6636c.m4870a(inputStream);
                        C6636c.m4870a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStream2;
                    C6636c.m4870a(inputStream);
                    C6636c.m4870a(fileOutputStream);
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
    public static boolean m4774b() {
        return !C6622b.f5493f;
    }

    /* renamed from: b */
    public static void m4772b(Class cls) {
        a.m4793b(a.f5481a, cls);
    }

    /* renamed from: a */
    public static void m4767a(Class cls) {
        C6638e.m4881a("ColdDexManager", "setClearPreVerified", "ignore in art.");
    }

    /* renamed from: a */
    public static String m4764a(String str) {
        return str + ".odex";
    }
}
