package p225kc;

import cf.AbstractC5450a;
import io.objectbox.BoxStore;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: kc.d */
/* loaded from: classes6.dex */
public abstract class AbstractC9911d {
    static {
        String str;
        String str2;
        String str3;
        String str4 = "objectbox-jni.so";
        String property = System.getProperty("java.vendor");
        String lowerCase = System.getProperty("os.name").toLowerCase();
        boolean zContains = property.contains("Android");
        boolean z10 = true;
        if (zContains) {
            str = "objectbox-jni";
        } else {
            String str5 = "-" + m19983c();
            if (lowerCase.contains("windows")) {
                str2 = "objectbox-jni-windows" + str5;
                str3 = str2 + ".dll";
                m19981a(str3);
            } else if (lowerCase.contains("linux")) {
                String str6 = "objectbox-jni-linux" + str5;
                String str7 = "lib" + str6 + ".so";
                m19981a(str7);
                str = str6;
                str4 = str7;
            } else {
                if (lowerCase.contains("mac")) {
                    str2 = "objectbox-jni-macos" + str5;
                    str3 = "lib" + str2 + ".dylib";
                    m19981a(str3);
                }
                str = "objectbox-jni";
            }
            String str8 = str3;
            str = str2;
            str4 = str8;
            z10 = false;
        }
        try {
            File file = new File(str4);
            if (file.exists()) {
                System.load(file.getAbsolutePath());
                return;
            }
            try {
                if (zContains) {
                    if (m19985e()) {
                        return;
                    }
                    System.loadLibrary(str);
                } else {
                    System.err.println("File not available: " + file.getAbsolutePath());
                    System.loadLibrary(str);
                }
            } catch (UnsatisfiedLinkError e10) {
                if (zContains || !z10) {
                    throw e10;
                }
                if (m19985e()) {
                    return;
                }
                System.loadLibrary("objectbox-jni");
            }
        } catch (UnsatisfiedLinkError e11) {
            throw new LinkageError(String.format("[ObjectBox] Loading native library failed, please report this to us: vendor=%s,os=%s,os.arch=%s,model=%s,android=%s,linux=%s,machine=%s", property, lowerCase, System.getProperty("os.arch"), System.getProperty("sun.arch.data.model"), Boolean.valueOf(zContains), Boolean.valueOf(z10), m19984d()), e11);
        }
    }

    /* renamed from: a */
    public static void m19981a(String str) throws IOException {
        String str2 = "/native/" + str;
        URL resource = AbstractC9911d.class.getResource(str2);
        if (resource == null) {
            System.err.println("Not available in classpath: " + str2);
            return;
        }
        File file = new File(str);
        try {
            URLConnection uRLConnectionOpenConnection = resource.openConnection();
            int contentLength = uRLConnectionOpenConnection.getContentLength();
            long lastModified = uRLConnectionOpenConnection.getLastModified();
            if (file.exists() && file.length() == contentLength && file.lastModified() == lastModified) {
                return;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(uRLConnectionOpenConnection.getInputStream());
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                try {
                    AbstractC5450a.m2973a(bufferedInputStream, bufferedOutputStream);
                    AbstractC5450a.m2974b(bufferedInputStream);
                    if (lastModified > 0) {
                        file.setLastModified(lastModified);
                    }
                } finally {
                    AbstractC5450a.m2974b(bufferedOutputStream);
                }
            } catch (Throwable th) {
                AbstractC5450a.m2974b(bufferedInputStream);
                throw th;
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0089  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m19983c() {
        /*
            java.lang.String r0 = "os.arch"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "x64"
            java.lang.String r2 = "x86"
            r3 = 0
            if (r0 == 0) goto L9d
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r4 = "amd64"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 != 0) goto L9c
            java.lang.String r4 = "x86_64"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L23
            goto L9c
        L23:
            boolean r4 = r0.equalsIgnoreCase(r2)
            if (r4 == 0) goto L2c
            r3 = r2
            goto L9d
        L2c:
            java.lang.String r4 = "aarch64"
            boolean r4 = r4.equals(r0)
            java.lang.String r5 = "arm64"
            if (r4 != 0) goto L9a
            java.lang.String r4 = "armv8"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L9a
            boolean r4 = r0.startsWith(r5)
            if (r4 == 0) goto L45
            goto L9a
        L45:
            java.lang.String r4 = "arm"
            boolean r5 = r0.startsWith(r4)
            if (r5 == 0) goto L9d
            java.lang.String r5 = "armv7"
            boolean r6 = r0.startsWith(r5)
            java.lang.String r7 = "armv6"
            if (r6 != 0) goto L7e
            java.lang.String r6 = "armeabi-v7"
            boolean r6 = r0.startsWith(r6)
            if (r6 == 0) goto L60
            goto L7e
        L60:
            boolean r6 = r0.startsWith(r7)
            if (r6 == 0) goto L68
        L66:
            r3 = r7
            goto L87
        L68:
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L87
            java.lang.String r4 = m19984d()
            if (r4 == 0) goto L87
            java.lang.String r4 = r4.toLowerCase()
            boolean r6 = r4.startsWith(r5)
            if (r6 == 0) goto L80
        L7e:
            r3 = r5
            goto L87
        L80:
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L87
            goto L66
        L87:
            if (r3 != 0) goto L9d
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.String r4 = m19984d()
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r0, r4}
            java.lang.String r5 = "[ObjectBox] 32-bit ARM os.arch unknown (will use %s), please report this to us: os.arch=%s, machine=%s%n"
            r3.printf(r5, r4)
            r3 = r7
            goto L9d
        L9a:
            r3 = r5
            goto L9d
        L9c:
            r3 = r1
        L9d:
            if (r3 != 0) goto Lca
            java.lang.String r3 = "sun.arch.data.model"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.String r4 = "64"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lae
            goto Lba
        Lae:
            java.lang.String r1 = "32"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb8
            r1 = r2
            goto Lba
        Lb8:
            java.lang.String r1 = "unknown"
        Lba:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.String r4 = m19984d()
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0, r3, r4}
            java.lang.String r3 = "[ObjectBox] os.arch unknown (will use %s), please report this to us: os.arch=%s, model=%s, machine=%s%n"
            r2.printf(r3, r0)
            return r1
        Lca:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p225kc.AbstractC9911d.m19983c():java.lang.String");
    }

    /* renamed from: d */
    public static String m19984d() throws IOException {
        String line = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("uname -m").getInputStream()));
            line = bufferedReader.readLine();
            bufferedReader.close();
            return line;
        } catch (Exception unused) {
            return line;
        }
    }

    /* renamed from: e */
    public static boolean m19985e() throws IllegalAccessException, ClassNotFoundException, IllegalArgumentException, InvocationTargetException {
        if (BoxStore.m18938u() == null) {
            return false;
        }
        try {
            Class<?> cls = Class.forName("android.content.Context");
            if (BoxStore.m18939z() == null) {
                Class.forName("com.getkeepsafe.relinker.ReLinker").getMethod("loadLibrary", cls, String.class, String.class).invoke(null, BoxStore.m18938u(), "objectbox-jni", "2.9.1");
                return true;
            }
            BoxStore.m18939z().getClass().getMethod("loadLibrary", cls, String.class, String.class).invoke(BoxStore.m18939z(), BoxStore.m18938u(), "objectbox-jni", "2.9.1");
            return true;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static void m19982b() {
    }
}
