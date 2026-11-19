package com.huawei.hms.utils;

import android.annotation.TargetApi;
import android.content.Context;
import android.text.TextUtils;
import android.util.AndroidException;
import android.util.Base64;
import com.huawei.hms.support.log.HMSLog;
import com.tendcloud.tenddata.C7863av;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes5.dex */
public class ReadApkFileUtil {
    public static final String EMUI10_PK = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAx4nUogUyMCmzHhaEb420yvpw9zBs+ETzE9Qm77bGxl1Iml9JEkBkNTsUWOstLgUBajNhV+BAMVBHKMEdzoQbL5kIHkTgUVM65yewd+5+BhrcB9OQ3LHp+0BN6aLKZh71T4WvsvHFhfhQpShuGWkRkSaVGLFTHxX70kpWLzeZ3RtqiEUNIufPR2SFCH6EmecJ+HdkmBOh603IblCpGxwSWse0fDI98wZBEmV88RFaiYEgyiezLlWvXzqIj6I/xuyd5nGAegjH2y3cmoDE6CubecoB1jf4KdgACXgdiQ4Oc63MfLGTor3l6RCqeUk4APAMtyhK83jc72W1sdXMd/sj2wIDAQAB";
    public static final String EMUI11_PK = "MIIBojANBgkqhkiG9w0BAQEFAAOCAY8AMIIBigKCAYEAqq2eRTMYr2JHLtvuZzfgPrgU8oatD4Rar9fOD7E00es2VhtB3vTyaT2BvYPUPA/nbkHRPak3EZX77CfWj9tzLgSHJE8XLk9C+2ESkdrxCDA6z7I8X+cBDnA05OlCJeZFjnUbjYB8SP8M3BttdrvqtVPxTkEJhchC7UXnMLaJ3kQ3ZPjN7ubjYzO4rv7EtEpqr2bX+qjnSLIZZuUXraxqfdBuhGDIYq62dNsqiyrhX1mfvA3+43N4ZIs3BdfSYII8BNFmFxf+gyf1aoq386R2kAjHcrfOOhjAbZh+R1OAGLWPCqi3E9nB8EsZkeoTW/oIP6pJvgL3bnxq+1viT2dmZyipMgcx/3N6FJqkd67j/sPMtPlHJuq8/s0silzs13jAw1WBV6tWHFkLGpkWGs8jp50wQtndtY8cCPl2XPGmdPN72agH+zsHuKqr/HOB2TuzzaO8rKlGIDQlzZcCSHB28nnvOyBVN9xzLkbYiLnHfd6bTwzNPeqjWrTnPwKyH3BPAgMBAAE=";
    public static final String KEY_SIGNATURE = "Signature:";
    public static final String KEY_SIGNATURE2 = "Signature2:";
    public static final String KEY_SIGNATURE3 = "Signature3:";

    /* renamed from: a */
    public static final String f11869a = "ReadApkFileUtil";

    /* renamed from: c */
    public static String f11871c;

    /* renamed from: d */
    public static String f11872d;

    /* renamed from: e */
    public static String f11873e;

    /* renamed from: b */
    public static final Pattern f11870b = Pattern.compile("\\s*|\t|\r|\n");

    /* renamed from: f */
    public static String f11874f = null;

    /* renamed from: g */
    public static String f11875g = null;

    /* renamed from: a */
    public static String m8813a(BufferedReader bufferedReader) throws IOException {
        int i10;
        if (bufferedReader == null || (i10 = bufferedReader.read()) == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(10);
        while (i10 != -1) {
            char c10 = (char) i10;
            if (c10 == '\n') {
                break;
            }
            if (sb2.length() >= 4096) {
                throw new IOException("cert line is too long!");
            }
            sb2.append(c10);
            i10 = bufferedReader.read();
        }
        String string = sb2.toString();
        return (string.isEmpty() || !string.endsWith("\r")) ? string : string.substring(0, string.length() - 1);
    }

    /* renamed from: b */
    public static String m8814b(String str) {
        return str != null ? f11870b.matcher(str).replaceAll("") : "";
    }

    public static String bytesToString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            cArr2[i11] = cArr[(b10 & C7863av.f14384i) >>> 4];
            cArr2[i11 + 1] = cArr[b10 & 15];
        }
        return String.valueOf(cArr2);
    }

    /* renamed from: c */
    public static ArrayList m8815c(byte[] bArr) throws IOException {
        if (bArr == null) {
            HMSLog.m8725e(f11869a, "manifest is null！");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream, StandardCharsets.UTF_8));
                try {
                    if (m8817e(bufferedReader, arrayList)) {
                        bufferedReader.close();
                        byteArrayInputStream.close();
                        return arrayList;
                    }
                    bufferedReader.close();
                    byteArrayInputStream.close();
                    return null;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            HMSLog.m8725e(f11869a, "getManifestLinesArrary IOException!");
            return null;
        }
    }

    public static boolean checkSignature() {
        if (f11873e != null) {
            return m8826n();
        }
        if (f11872d != null) {
            return m8824l();
        }
        if (f11871c != null) {
            return m8816d();
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m8816d() {
        try {
            if (m8818f(m8825m("30820122300d06092a864886f70d01010105000382010f003082010a0282010100a3d269348ac59923f65e8111c337605e29a1d1bc54fa96c1445050dd14d8d63b10f9f0230bb87ef348183660bedcabfdec045e235ed96935799fcdb4af5c97717ff3b0954eaf1b723225b3a00f81cbd67ce6dc5a4c07f7741ad3bf1913a480c6e267ab1740f409edd2dc33c8b718a8e30e56d9a93f321723c1d0c9ea62115f996812ceef186954595e39a19b74245542c407f7dddb1d12e6eedcfc0bd7cd945ef7255ad0fc9e796258e0fb5e52a23013d15033a32b4071b65f3f924ae5c5761e22327b4d2ae60f4158a5eb15565ba079de29b81540f5fbb3be101a95357f367fc661d797074ff3826950029c52223e4594673a24a334cae62d63b838ba3df9770203010001"), m8819g(f11875g, "SHA-256"), m8825m(f11871c), "SHA256withRSA")) {
                HMSLog.m8727i(f11869a, "verifyMDMSignatureV1 verify successful!");
                return true;
            }
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV1 verify failure!");
            return false;
        } catch (Exception e10) {
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV1 MDM verify Exception!:" + e10.getMessage());
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m8817e(BufferedReader bufferedReader, ArrayList arrayList) throws IOException {
        String strM8813a = m8813a(bufferedReader);
        boolean z10 = false;
        while (strM8813a != null) {
            if (strM8813a.equals("Name: META-INF/HUAWEI.CER")) {
                String strM8813a2 = m8813a(bufferedReader);
                while (true) {
                    if (strM8813a2 == null) {
                        break;
                    }
                    if (strM8813a2.startsWith("Name:")) {
                        strM8813a = strM8813a2;
                        break;
                    }
                    strM8813a2 = m8813a(bufferedReader);
                }
                z10 = true;
            }
            if (strM8813a.length() != 0) {
                arrayList.add(strM8813a);
            }
            strM8813a = m8813a(bufferedReader);
        }
        return z10;
    }

    /* renamed from: f */
    public static boolean m8818f(byte[] bArr, byte[] bArr2, byte[] bArr3, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        Signature signature = Signature.getInstance(str);
        signature.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr)));
        signature.update(bArr2);
        return signature.verify(bArr3);
    }

    /* renamed from: g */
    public static byte[] m8819g(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        messageDigest.update(str.getBytes(StandardCharsets.UTF_8.name()));
        return messageDigest.digest();
    }

    public static String getHmsPath(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo("com.huawei.hwid", 128).sourceDir;
        } catch (AndroidException | RuntimeException unused) {
            HMSLog.m8725e(f11869a, "HMS is not found!");
            return null;
        }
    }

    /* renamed from: h */
    public static byte[] m8820h(ArrayList arrayList) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, StandardCharsets.UTF_8));
        try {
            try {
                Collections.sort(arrayList);
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String str = (String) arrayList.get(i10);
                    bufferedWriter.write(str, 0, str.length());
                    bufferedWriter.write("\r\n", 0, 2);
                }
                bufferedWriter.flush();
            } catch (Exception e10) {
                HMSLog.m8727i(f11869a, "getManifestBytesbySorted Exception!" + e10.getMessage());
            }
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
            IOUtils.closeQuietly((Writer) bufferedWriter);
            throw th;
        }
    }

    /* renamed from: i */
    public static byte[] m8821i(ZipFile zipFile) {
        return m8822j(zipFile, "META-INF/MANIFEST.MF");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @TargetApi(19)
    public static boolean isCertFound(String str) throws Throwable {
        ZipFile zipFile;
        boolean z10 = false;
        ZipFile zipFile2 = null;
        ZipFile zipFile3 = null;
        ZipFile zipFile4 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                zipFile = zipFile2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            boolean z11 = zipFile.getEntry("META-INF/HUAWEI.CER") != null;
            if (z11) {
                m8823k(m8822j(zipFile, "META-INF/HUAWEI.CER"));
            }
            try {
                zipFile.close();
            } catch (IOException e11) {
                String str2 = f11869a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("zipFile.close Exception!");
                sb2.append(e11.getMessage());
                HMSLog.m8725e(str2, sb2.toString());
                zipFile3 = sb2;
            }
            z10 = z11;
            zipFile2 = zipFile3;
        } catch (Exception e12) {
            e = e12;
            zipFile4 = zipFile;
            HMSLog.m8725e(f11869a, "isCertFound Exception!" + e.getMessage());
            zipFile2 = zipFile4;
            if (zipFile4 != null) {
                try {
                    zipFile4.close();
                    zipFile2 = zipFile4;
                } catch (IOException e13) {
                    String str3 = f11869a;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("zipFile.close Exception!");
                    sb3.append(e13.getMessage());
                    HMSLog.m8725e(str3, sb3.toString());
                    zipFile2 = sb3;
                }
            }
            return z10;
        } catch (Throwable th2) {
            th = th2;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e14) {
                    HMSLog.m8725e(f11869a, "zipFile.close Exception!" + e14.getMessage());
                }
            }
            throw th;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: j */
    public static byte[] m8822j(ZipFile zipFile, String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        Exception e10;
        Throwable th2;
        BufferedInputStream bufferedInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2;
        ByteArrayOutputStream byteArrayOutputStream3;
        ByteArrayOutputStream byteArrayOutputStream4;
        ZipEntry entry = zipFile.getEntry(str);
        OutputStream outputStream = null;
        if (entry == null) {
            return null;
        }
        try {
            inputStream = zipFile.getInputStream(entry);
            if (inputStream == null) {
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                IOUtils.closeQuietly((OutputStream) null);
                return null;
            }
            try {
                bufferedInputStream = new BufferedInputStream(inputStream);
            } catch (Exception e11) {
                e10 = e11;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    HMSLog.m8727i(f11869a, "getManifestBytes Exception!" + e10.getMessage());
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    byteArrayOutputStream4 = byteArrayOutputStream2;
                    bufferedInputStream = bufferedInputStream;
                    byteArrayOutputStream3 = byteArrayOutputStream4;
                    outputStream = byteArrayOutputStream3;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                bufferedInputStream = null;
                byteArrayOutputStream = null;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
            try {
                byte[] bArr = new byte[4096];
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
                    try {
                        for (int i10 = bufferedInputStream.read(bArr, 0, 4096); i10 > 0; i10 = bufferedInputStream.read(bArr, 0, 4096)) {
                            bufferedOutputStream.write(bArr, 0, i10);
                        }
                        bufferedOutputStream.flush();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) bufferedOutputStream);
                        return byteArray;
                    } catch (Exception e12) {
                        e10 = e12;
                        byteArrayOutputStream2 = bufferedOutputStream;
                        HMSLog.m8727i(f11869a, "getManifestBytes Exception!" + e10.getMessage());
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                        return null;
                    } catch (Throwable th5) {
                        th2 = th5;
                        byteArrayOutputStream3 = bufferedOutputStream;
                        outputStream = byteArrayOutputStream3;
                        IOUtils.closeQuietly(inputStream);
                        IOUtils.closeQuietly((InputStream) bufferedInputStream);
                        IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                        IOUtils.closeQuietly(outputStream);
                        throw th2;
                    }
                } catch (Exception e13) {
                    e10 = e13;
                    byteArrayOutputStream2 = null;
                } catch (Throwable th6) {
                    th2 = th6;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((InputStream) bufferedInputStream);
                    IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                    IOUtils.closeQuietly(outputStream);
                    throw th2;
                }
            } catch (Exception e14) {
                e10 = e14;
                byteArrayOutputStream = null;
                byteArrayOutputStream2 = byteArrayOutputStream;
                HMSLog.m8727i(f11869a, "getManifestBytes Exception!" + e10.getMessage());
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream2);
                return null;
            } catch (Throwable th7) {
                th2 = th7;
                byteArrayOutputStream = null;
                byteArrayOutputStream4 = null;
                bufferedInputStream = bufferedInputStream;
                byteArrayOutputStream3 = byteArrayOutputStream4;
                outputStream = byteArrayOutputStream3;
                IOUtils.closeQuietly(inputStream);
                IOUtils.closeQuietly((InputStream) bufferedInputStream);
                IOUtils.closeQuietly((OutputStream) byteArrayOutputStream);
                IOUtils.closeQuietly(outputStream);
                throw th2;
            }
        } catch (Exception e15) {
            e10 = e15;
            inputStream = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.io.ByteArrayInputStream, java.io.InputStream] */
    /* renamed from: k */
    public static void m8823k(byte[] bArr) throws Throwable {
        Throwable th;
        BufferedReader bufferedReader;
        ?? byteArrayInputStream;
        ?? r22;
        BufferedReader bufferedReader2;
        InputStream inputStream;
        if (bArr == null) {
            HMSLog.m8725e(f11869a, "manifest is null！");
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        BufferedReader bufferedReader3 = null;
        f11871c = null;
        f11872d = null;
        f11873e = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                bufferedReader = new BufferedReader(new InputStreamReader((InputStream) byteArrayInputStream, StandardCharsets.UTF_8));
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                r22 = byteArrayInputStream;
                IOUtils.closeQuietly((InputStream) r22);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
            try {
                String strM8813a = m8813a(bufferedReader);
                while (strM8813a != null) {
                    if (strM8813a.length() != 0) {
                        if (strM8813a.startsWith("ApkHash:")) {
                            f11874f = m8814b(strM8813a.substring(strM8813a.indexOf(":") + 1));
                        }
                        if (strM8813a.startsWith(KEY_SIGNATURE)) {
                            f11871c = m8814b(strM8813a.substring(strM8813a.indexOf(":") + 1));
                            strM8813a = m8813a(bufferedReader);
                        } else if (strM8813a.startsWith(KEY_SIGNATURE2)) {
                            f11872d = m8814b(strM8813a.substring(strM8813a.indexOf(":") + 1));
                            strM8813a = m8813a(bufferedReader);
                        } else if (strM8813a.startsWith(KEY_SIGNATURE3)) {
                            f11873e = m8814b(strM8813a.substring(strM8813a.indexOf(":") + 1));
                            strM8813a = m8813a(bufferedReader);
                        } else {
                            stringBuffer.append(strM8813a);
                            stringBuffer.append("\r\n");
                        }
                    }
                    strM8813a = m8813a(bufferedReader);
                }
                f11875g = stringBuffer.toString();
                inputStream = byteArrayInputStream;
            } catch (Exception unused2) {
                bufferedReader3 = bufferedReader;
                try {
                    HMSLog.m8725e(f11869a, "loadApkCert Exception!");
                    bufferedReader = bufferedReader3;
                    inputStream = byteArrayInputStream;
                    IOUtils.closeQuietly(inputStream);
                    IOUtils.closeQuietly((Reader) bufferedReader);
                } catch (Throwable th3) {
                    th = th3;
                    bufferedReader = bufferedReader3;
                    bufferedReader3 = byteArrayInputStream;
                    bufferedReader2 = bufferedReader3;
                    bufferedReader3 = bufferedReader;
                    r22 = bufferedReader2;
                    IOUtils.closeQuietly((InputStream) r22);
                    IOUtils.closeQuietly((Reader) bufferedReader3);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedReader2 = byteArrayInputStream;
                bufferedReader3 = bufferedReader;
                r22 = bufferedReader2;
                IOUtils.closeQuietly((InputStream) r22);
                IOUtils.closeQuietly((Reader) bufferedReader3);
                throw th;
            }
        } catch (Exception unused3) {
            byteArrayInputStream = 0;
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            bufferedReader2 = bufferedReader3;
            bufferedReader3 = bufferedReader;
            r22 = bufferedReader2;
            IOUtils.closeQuietly((InputStream) r22);
            IOUtils.closeQuietly((Reader) bufferedReader3);
            throw th;
        }
        IOUtils.closeQuietly(inputStream);
        IOUtils.closeQuietly((Reader) bufferedReader);
    }

    /* renamed from: l */
    public static boolean m8824l() {
        try {
        } catch (Exception e10) {
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV2 MDM verify Exception!:" + e10.getMessage());
        }
        if (m8818f(Base64.decode(EMUI10_PK, 0), m8819g(f11875g, "SHA-256"), m8825m(f11872d), "SHA256withRSA")) {
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV2 verify successful!");
            return true;
        }
        HMSLog.m8727i(f11869a, "verifyMDMSignatureV2 verify failure!");
        return false;
    }

    /* renamed from: m */
    public static byte[] m8825m(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length();
        byte[] bArr = new byte[length % 2 == 0 ? length / 2 : (length / 2) + 1];
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = i10 + 1;
            if (i11 < length) {
                bArr[i10 / 2] = (byte) ((Character.digit(str.charAt(i10), 16) << 4) + Character.digit(str.charAt(i11), 16));
            } else {
                bArr[i10 / 2] = (byte) (Character.digit(str.charAt(i10), 16) << 4);
            }
        }
        return bArr;
    }

    /* renamed from: n */
    public static boolean m8826n() {
        try {
        } catch (Exception e10) {
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV3 MDM verify Exception!:" + e10.getMessage());
        }
        if (m8818f(Base64.decode(EMUI11_PK, 0), m8819g(f11875g, "SHA-384"), m8825m(f11873e), "SHA384withRSA")) {
            HMSLog.m8727i(f11869a, "verifyMDMSignatureV3 verify successful!");
            return true;
        }
        HMSLog.m8727i(f11869a, "verifyMDMSignatureV3 verify failure!");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static boolean verifyApkHash(String str) throws Throwable {
        ?? r22;
        ZipFile zipFile;
        String str2 = null;
        ZipFile zipFile2 = null;
        try {
            try {
                zipFile = new ZipFile(str);
            } catch (Throwable th) {
                th = th;
                r22 = str2;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            byte[] bArrM8821i = m8821i(zipFile);
            ArrayList arrayListM8815c = m8815c(bArrM8821i);
            if (arrayListM8815c != null) {
                bArrM8821i = m8820h(arrayListM8815c);
            }
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrM8821i);
            String strBytesToString = bytesToString(messageDigest.digest());
            String str3 = f11874f;
            if (str3 != null) {
                if (str3.equals(strBytesToString)) {
                    try {
                        zipFile.close();
                        return true;
                    } catch (Exception e11) {
                        HMSLog.m8727i(f11869a, "close stream Exception!" + e11.getMessage());
                        return true;
                    }
                }
            }
            try {
                zipFile.close();
                return false;
            } catch (Exception e12) {
                HMSLog.m8727i(f11869a, "close stream Exception!" + e12.getMessage());
                return false;
            }
        } catch (Exception e13) {
            e = e13;
            zipFile2 = zipFile;
            HMSLog.m8727i(f11869a, "verifyApkHash Exception!" + e.getMessage());
            if (zipFile2 == null) {
                return false;
            }
            try {
                zipFile2.close();
                return false;
            } catch (Exception e14) {
                str2 = f11869a;
                HMSLog.m8727i(str2, "close stream Exception!" + e14.getMessage());
                return false;
            }
        } catch (Throwable th2) {
            th = th2;
            r22 = zipFile;
            if (r22 != null) {
                try {
                    r22.close();
                } catch (Exception e15) {
                    HMSLog.m8727i(f11869a, "close stream Exception!" + e15.getMessage());
                }
            }
            throw th;
        }
    }
}
