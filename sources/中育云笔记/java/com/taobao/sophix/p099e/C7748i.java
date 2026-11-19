package com.taobao.sophix.p099e;

import android.app.Application;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.sophix.p090b.C7728b;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import java.util.zip.ZipFile;

/* renamed from: com.taobao.sophix.e.i */
/* loaded from: classes5.dex */
public class C7748i {
    /* renamed from: a */
    public static boolean m10419a(File file) throws Throwable {
        JarFile jarFile;
        JarFile jarFile2 = null;
        try {
            try {
                jarFile = new JarFile(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
        }
        try {
            Manifest manifest = jarFile.getManifest();
            if (manifest != null && manifest.getEntries() != null) {
                Enumeration<JarEntry> enumerationEntries = jarFile.entries();
                while (enumerationEntries.hasMoreElements()) {
                    JarEntry jarEntryNextElement = enumerationEntries.nextElement();
                    if (!jarEntryNextElement.isDirectory()) {
                        String name = jarEntryNextElement.getName();
                        if (!name.startsWith("META-INF") && (!name.endsWith(".dex") || name.equals("classes.dex"))) {
                            JarEntry jarEntry = jarFile.getJarEntry(name);
                            if (jarEntry == null) {
                                C7744e.m10400b("SecurityUtils", "verifyPatchLegal", "jarEntry not exist in patch", name);
                                C7742c.m10387a((ZipFile) jarFile);
                                return false;
                            }
                            m10418a(jarFile, jarEntry);
                            Certificate[] certificates = jarEntry.getCertificates();
                            if (certificates == null) {
                                C7744e.m10400b("SecurityUtils", "verifyPatchLegal", "no certs in META-INF", name);
                                C7742c.m10387a((ZipFile) jarFile);
                                return false;
                            }
                            if (!m10420a(file, certificates)) {
                                C7744e.m10400b("SecurityUtils", "verifyPatchLegal", "certs no match in META-INF", name);
                                C7742c.m10387a((ZipFile) jarFile);
                                return false;
                            }
                        }
                    }
                }
                C7742c.m10387a((ZipFile) jarFile);
                return true;
            }
            C7744e.m10400b("SecurityUtils", "verifyPatchLegal", "no META-INF");
            C7742c.m10387a((ZipFile) jarFile);
            return false;
        } catch (IOException e11) {
            e = e11;
            jarFile2 = jarFile;
            C7744e.m10399b("SecurityUtils", "verifyPatchLegal", e, new Object[0]);
            C7742c.m10387a((ZipFile) jarFile2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            C7742c.m10387a((ZipFile) jarFile2);
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m10421b(File file) throws Throwable {
        String strM10405a = C7745f.m10405a(file);
        Application application = C7728b.f13354b;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file.getName());
        sb2.append("-md5");
        return strM10405a != null && TextUtils.equals(strM10405a, C7749j.m10425a(application, sb2.toString(), (String) null));
    }

    /* renamed from: c */
    public static void m10422c(File file) {
        C7749j.m10430b(C7728b.f13354b, file.getName() + "-md5", C7745f.m10405a(file));
    }

    /* renamed from: d */
    public static void m10423d(File file) {
        C7749j.m10427a(C7728b.f13354b, file.getName() + "-md5");
    }

    /* renamed from: a */
    private static void m10418a(JarFile jarFile, JarEntry jarEntry) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream.read(new byte[8192]) > 0);
                C7742c.m10382a(inputStream);
            } catch (Throwable th) {
                th = th;
                C7742c.m10382a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: a */
    private static boolean m10420a(File file, Certificate[] certificateArr) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        PublicKey publicKeyM10416a = m10416a();
        if (certificateArr.length > 0) {
            for (int length = certificateArr.length - 1; length >= 0; length--) {
                try {
                    certificateArr[length].verify(publicKeyM10416a);
                    return true;
                } catch (Exception e10) {
                    C7744e.m10399b("SecurityUtils", file.getAbsolutePath(), e10, new Object[0]);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static PublicKey m10416a() throws PackageManager.NameNotFoundException {
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C7728b.f13354b.getPackageManager().getPackageInfo(C7728b.f13354b.getBaseContext().getPackageName(), 64).signatures[0].toByteArray()))).getPublicKey();
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("SecurityUtils", "getPublicKey", e10);
            return null;
        } catch (CertificateException e11) {
            Log.e("SecurityUtils", "getPublicKey", e11);
            return null;
        }
    }

    /* renamed from: a */
    public static void m10417a(File file, String str) {
        C7749j.m10430b(C7728b.f13354b, file.getName() + "-md5", str);
    }
}
