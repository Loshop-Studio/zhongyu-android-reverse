package com.taobao.sophix.p052e;

import android.app.Application;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.sophix.p043b.C6362b;
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
/* loaded from: classes4.dex */
public class C6382i {
    /* renamed from: a */
    public static boolean m4728a(File file) throws Throwable {
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
                                C6378e.m4709b("SecurityUtils", "verifyPatchLegal", "jarEntry not exist in patch", name);
                                C6376c.m4696a((ZipFile) jarFile);
                                return false;
                            }
                            m4727a(jarFile, jarEntry);
                            Certificate[] certificates = jarEntry.getCertificates();
                            if (certificates == null) {
                                C6378e.m4709b("SecurityUtils", "verifyPatchLegal", "no certs in META-INF", name);
                                C6376c.m4696a((ZipFile) jarFile);
                                return false;
                            }
                            if (!m4729a(file, certificates)) {
                                C6378e.m4709b("SecurityUtils", "verifyPatchLegal", "certs no match in META-INF", name);
                                C6376c.m4696a((ZipFile) jarFile);
                                return false;
                            }
                        }
                    }
                }
                C6376c.m4696a((ZipFile) jarFile);
                return true;
            }
            C6378e.m4709b("SecurityUtils", "verifyPatchLegal", "no META-INF");
            C6376c.m4696a((ZipFile) jarFile);
            return false;
        } catch (IOException e11) {
            e = e11;
            jarFile2 = jarFile;
            C6378e.m4708b("SecurityUtils", "verifyPatchLegal", e, new Object[0]);
            C6376c.m4696a((ZipFile) jarFile2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            C6376c.m4696a((ZipFile) jarFile2);
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m4730b(File file) throws Throwable {
        String strM4714a = C6379f.m4714a(file);
        Application application = C6362b.f4912b;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-md5");
        return strM4714a != null && TextUtils.equals(strM4714a, C6383j.m4734a(application, sb.toString(), (String) null));
    }

    /* renamed from: c */
    public static void m4731c(File file) {
        C6383j.m4739b(C6362b.f4912b, file.getName() + "-md5", C6379f.m4714a(file));
    }

    /* renamed from: d */
    public static void m4732d(File file) {
        C6383j.m4736a(C6362b.f4912b, file.getName() + "-md5");
    }

    /* renamed from: a */
    private static void m4727a(JarFile jarFile, JarEntry jarEntry) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream.read(new byte[8192]) > 0);
                C6376c.m4691a(inputStream);
            } catch (Throwable th) {
                th = th;
                C6376c.m4691a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: a */
    private static boolean m4729a(File file, Certificate[] certificateArr) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        PublicKey publicKeyM4725a = m4725a();
        if (certificateArr.length > 0) {
            for (int length = certificateArr.length - 1; length >= 0; length--) {
                try {
                    certificateArr[length].verify(publicKeyM4725a);
                    return true;
                } catch (Exception e10) {
                    C6378e.m4708b("SecurityUtils", file.getAbsolutePath(), e10, new Object[0]);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static PublicKey m4725a() throws PackageManager.NameNotFoundException {
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C6362b.f4912b.getPackageManager().getPackageInfo(C6362b.f4912b.getBaseContext().getPackageName(), 64).signatures[0].toByteArray()))).getPublicKey();
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("SecurityUtils", "getPublicKey", e10);
            return null;
        } catch (CertificateException e11) {
            Log.e("SecurityUtils", "getPublicKey", e11);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4726a(File file, String str) {
        C6383j.m4739b(C6362b.f4912b, file.getName() + "-md5", str);
    }
}
