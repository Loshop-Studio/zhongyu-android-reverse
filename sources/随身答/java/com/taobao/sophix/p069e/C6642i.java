package com.taobao.sophix.p069e;

import android.app.Application;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.taobao.sophix.p060b.C6622b;
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
public class C6642i {
    /* renamed from: a */
    public static boolean m4907a(File file) throws Throwable {
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
                                C6638e.m4888b("SecurityUtils", "verifyPatchLegal", "jarEntry not exist in patch", name);
                                C6636c.m4875a((ZipFile) jarFile);
                                return false;
                            }
                            m4906a(jarFile, jarEntry);
                            Certificate[] certificates = jarEntry.getCertificates();
                            if (certificates == null) {
                                C6638e.m4888b("SecurityUtils", "verifyPatchLegal", "no certs in META-INF", name);
                                C6636c.m4875a((ZipFile) jarFile);
                                return false;
                            }
                            if (!m4908a(file, certificates)) {
                                C6638e.m4888b("SecurityUtils", "verifyPatchLegal", "certs no match in META-INF", name);
                                C6636c.m4875a((ZipFile) jarFile);
                                return false;
                            }
                        }
                    }
                }
                C6636c.m4875a((ZipFile) jarFile);
                return true;
            }
            C6638e.m4888b("SecurityUtils", "verifyPatchLegal", "no META-INF");
            C6636c.m4875a((ZipFile) jarFile);
            return false;
        } catch (IOException e11) {
            e = e11;
            jarFile2 = jarFile;
            C6638e.m4887b("SecurityUtils", "verifyPatchLegal", e, new Object[0]);
            C6636c.m4875a((ZipFile) jarFile2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            jarFile2 = jarFile;
            C6636c.m4875a((ZipFile) jarFile2);
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m4909b(File file) throws Throwable {
        String strM4893a = C6639f.m4893a(file);
        Application application = C6622b.f5489b;
        StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-md5");
        return strM4893a != null && TextUtils.equals(strM4893a, C6643j.m4913a(application, sb.toString(), (String) null));
    }

    /* renamed from: c */
    public static void m4910c(File file) {
        C6643j.m4918b(C6622b.f5489b, file.getName() + "-md5", C6639f.m4893a(file));
    }

    /* renamed from: d */
    public static void m4911d(File file) {
        C6643j.m4915a(C6622b.f5489b, file.getName() + "-md5");
    }

    /* renamed from: a */
    private static void m4906a(JarFile jarFile, JarEntry jarEntry) throws Throwable {
        InputStream inputStream;
        try {
            inputStream = jarFile.getInputStream(jarEntry);
            try {
                do {
                } while (inputStream.read(new byte[8192]) > 0);
                C6636c.m4870a(inputStream);
            } catch (Throwable th) {
                th = th;
                C6636c.m4870a(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: a */
    private static boolean m4908a(File file, Certificate[] certificateArr) throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        PublicKey publicKeyM4904a = m4904a();
        if (certificateArr.length > 0) {
            for (int length = certificateArr.length - 1; length >= 0; length--) {
                try {
                    certificateArr[length].verify(publicKeyM4904a);
                    return true;
                } catch (Exception e10) {
                    C6638e.m4887b("SecurityUtils", file.getAbsolutePath(), e10, new Object[0]);
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static PublicKey m4904a() throws PackageManager.NameNotFoundException {
        try {
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C6622b.f5489b.getPackageManager().getPackageInfo(C6622b.f5489b.getBaseContext().getPackageName(), 64).signatures[0].toByteArray()))).getPublicKey();
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("SecurityUtils", "getPublicKey", e10);
            return null;
        } catch (CertificateException e11) {
            Log.e("SecurityUtils", "getPublicKey", e11);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4905a(File file, String str) {
        C6643j.m4918b(C6622b.f5489b, file.getName() + "-md5", str);
    }
}
