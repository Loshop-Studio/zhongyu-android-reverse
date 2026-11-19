package com.taobao.sophix.p052e;

import android.util.Base64;
import android.util.Pair;
import com.taobao.sophix.p042a.C6348b;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.taobao.sophix.e.a */
/* loaded from: classes4.dex */
public class C6374a {
    /* renamed from: a */
    public static boolean m4682a(String str, String str2, String str3, String str4) throws Throwable {
        File fileM4680a;
        File file = new File(str);
        File file2 = new File(str2);
        Pair<String, String> pairM4683b = m4683b(str3, str4);
        if (pairM4683b == null) {
            return false;
        }
        String str5 = (String) pairM4683b.first;
        String str6 = (String) pairM4683b.second;
        File fileM4684c = m4684c(file.getAbsolutePath(), file.getParent());
        if (fileM4684c == null || (fileM4680a = m4680a(fileM4684c, str5, str6)) == null) {
            return false;
        }
        return fileM4680a.renameTo(file2);
    }

    /* renamed from: b */
    private static Pair<String, String> m4683b(String str, String str2) throws BadPaddingException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException {
        byte[] bArrDoFinal;
        try {
            byte[] bArrDecode = Base64.decode(str, 0);
            PrivateKey privateKeyGeneratePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64.decode(str2, 0)));
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            cipher.init(2, privateKeyGeneratePrivate);
            bArrDoFinal = cipher.doFinal(bArrDecode);
        } catch (Exception e10) {
            C6378e.m4708b("DecryptUtils", "decryptFileToken", e10, new Object[0]);
            bArrDoFinal = null;
        }
        if (bArrDoFinal != null) {
            try {
                String[] strArrSplit = new String(bArrDoFinal, "utf-8").split("\\|");
                if (strArrSplit != null && strArrSplit.length == 2) {
                    return new Pair<>(strArrSplit[0], strArrSplit[1]);
                }
            } catch (UnsupportedEncodingException e11) {
                e11.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: c */
    private static File m4684c(String str, String str2) throws Throwable {
        File file;
        ZipInputStream zipInputStream;
        FileOutputStream fileOutputStream;
        ZipInputStream zipInputStream2 = null;
        try {
            file = new File(str);
            try {
                if (!file.exists()) {
                    C6378e.m4713e("DecryptUtils", "unZipSingleFile file don't exist", new Object[0]);
                    C6376c.m4691a((Closeable) null);
                    file.delete();
                    return null;
                }
                String str3 = str2 + File.separator + "unzip";
                File file2 = new File(str3);
                C6376c.m4692a(file2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                zipInputStream = new ZipInputStream(new FileInputStream(file));
                while (true) {
                    try {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry == null) {
                                break;
                            }
                            String name = nextEntry.getName();
                            if (name.contains("../")) {
                                throw new C6348b(11, "entry contains unsafe chars");
                            }
                            if (nextEntry.isDirectory()) {
                                new File(str3 + File.separator + name.substring(0, name.length() - 1)).mkdirs();
                            } else {
                                File file3 = new File(str3 + File.separator + name);
                                file3.createNewFile();
                                try {
                                    fileOutputStream = new FileOutputStream(file3);
                                    try {
                                        byte[] bArr = new byte[1024];
                                        while (true) {
                                            int i10 = zipInputStream.read(bArr);
                                            if (i10 == -1) {
                                                C6376c.m4691a(fileOutputStream);
                                                C6376c.m4691a(zipInputStream);
                                                file.delete();
                                                return file3;
                                            }
                                            fileOutputStream.write(bArr, 0, i10);
                                            fileOutputStream.flush();
                                        }
                                    } catch (Exception e10) {
                                        e = e10;
                                        try {
                                            C6378e.m4701a("DecryptUtils", "unZipSingleFile unZip hotfix patch file error", e, new Object[0]);
                                            C6376c.m4691a(fileOutputStream);
                                        } catch (Throwable th) {
                                            th = th;
                                            C6376c.m4691a(fileOutputStream);
                                            throw th;
                                        }
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fileOutputStream = null;
                                    C6376c.m4691a(fileOutputStream);
                                    throw th;
                                }
                            }
                        } catch (Exception e12) {
                            e = e12;
                            C6378e.m4701a("DecryptUtils", "unZipSingleFile unZip hotfix patch file error", e, new Object[0]);
                            C6376c.m4691a(zipInputStream);
                            file.delete();
                            return null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        zipInputStream2 = zipInputStream;
                        C6376c.m4691a(zipInputStream2);
                        file.delete();
                        throw th;
                    }
                }
            } catch (Exception e13) {
                e = e13;
                zipInputStream = null;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            e = e14;
            zipInputStream = null;
            file = null;
        } catch (Throwable th5) {
            th = th5;
            file = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable, javax.crypto.CipherInputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.io.File m4680a(java.io.File r8, java.lang.String r9, java.lang.String r10) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "UTF-8"
            r1 = 0
            r2 = 0
            java.lang.String r3 = r8.getName()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L75
            java.lang.String r4 = ".decrypt"
            java.io.File r5 = r8.getParentFile()     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L75
            java.io.File r3 = java.io.File.createTempFile(r3, r4, r5)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L75
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            byte[] r10 = r10.getBytes(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r4.<init>(r10)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            javax.crypto.spec.SecretKeySpec r10 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            byte[] r9 = r9.getBytes(r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            java.lang.String r0 = "AES"
            r10.<init>(r9, r0)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            java.lang.String r9 = "AES/CBC/PKCS7PADDING"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r0 = 2
            r9.init(r0, r10, r4)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            r10.<init>(r8)     // Catch: java.lang.Throwable -> L6c java.lang.Exception -> L70
            javax.crypto.CipherInputStream r0 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            r0.<init>(r10, r9)     // Catch: java.lang.Throwable -> L64 java.lang.Exception -> L68
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r9.<init>(r3)     // Catch: java.lang.Throwable -> L5e java.lang.Exception -> L61
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
        L43:
            int r5 = r0.read(r4)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            r6 = -1
            if (r5 == r6) goto L53
            r9.write(r4, r1, r5)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L51
            goto L43
        L4e:
            r8 = move-exception
        L4f:
            r2 = r10
            goto L98
        L51:
            r4 = move-exception
            goto L7a
        L53:
            com.taobao.sophix.p052e.C6376c.m4691a(r10)
            com.taobao.sophix.p052e.C6376c.m4691a(r0)
            com.taobao.sophix.p052e.C6376c.m4691a(r9)
            r1 = 1
            goto L91
        L5e:
            r8 = move-exception
            r9 = r2
            goto L4f
        L61:
            r4 = move-exception
            r9 = r2
            goto L7a
        L64:
            r8 = move-exception
            r9 = r2
            r0 = r9
            goto L4f
        L68:
            r4 = move-exception
            r9 = r2
            r0 = r9
            goto L7a
        L6c:
            r8 = move-exception
            r9 = r2
            r0 = r9
            goto L98
        L70:
            r4 = move-exception
            r9 = r2
            r10 = r9
            r0 = r10
            goto L7a
        L75:
            r4 = move-exception
            r9 = r2
            r10 = r9
            r0 = r10
            r3 = r0
        L7a:
            java.lang.String r5 = "DecryptUtils"
            java.lang.String r6 = "decryptByPair decrypt hotfix patch file error"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4e
            com.taobao.sophix.p052e.C6378e.m4701a(r5, r6, r4, r7)     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L88
            r3.delete()     // Catch: java.lang.Throwable -> L4e
        L88:
            com.taobao.sophix.p052e.C6376c.m4691a(r10)
            com.taobao.sophix.p052e.C6376c.m4691a(r0)
            com.taobao.sophix.p052e.C6376c.m4691a(r9)
        L91:
            if (r1 == 0) goto L97
            r8.delete()
            return r3
        L97:
            return r2
        L98:
            com.taobao.sophix.p052e.C6376c.m4691a(r2)
            com.taobao.sophix.p052e.C6376c.m4691a(r0)
            com.taobao.sophix.p052e.C6376c.m4691a(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p052e.C6374a.m4680a(java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007f A[Catch: all -> 0x004f, TRY_ENTER, TryCatch #8 {all -> 0x004f, blocks: (B:8:0x0042, B:9:0x0044, B:11:0x004b, B:16:0x0055, B:35:0x007f, B:36:0x0082), top: B:44:0x0042 }] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m4681a(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r7 = 0
            r1 = 0
            java.lang.String r2 = r0.getName()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L79
            java.lang.String r3 = ".ldecrypt"
            java.io.File r4 = r0.getParentFile()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L79
            java.io.File r2 = java.io.File.createTempFile(r2, r3, r4)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L79
            java.lang.String r3 = "AES/ECB/PKCS5Padding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            java.lang.String r5 = "UTF-8"
            byte[] r8 = r8.getBytes(r5)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            java.lang.String r5 = "AES"
            r4.<init>(r8, r5)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            java.security.SecureRandom r8 = new java.security.SecureRandom     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            r8.<init>()     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            r5 = 2
            r3.init(r5, r4, r8)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L75
            javax.crypto.CipherInputStream r4 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
            r4.<init>(r8, r3)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6d
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L66
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
        L44:
            int r5 = r4.read(r1)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            r6 = -1
            if (r5 == r6) goto L55
            r3.write(r1, r7, r5)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            goto L44
        L4f:
            r7 = move-exception
        L50:
            r1 = r8
            goto L8c
        L52:
            r0 = move-exception
        L53:
            r1 = r2
            goto L7d
        L55:
            boolean r7 = r2.renameTo(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
        L59:
            com.taobao.sophix.p052e.C6376c.m4691a(r8)
            com.taobao.sophix.p052e.C6376c.m4691a(r4)
            com.taobao.sophix.p052e.C6376c.m4691a(r3)
            return r7
        L63:
            r7 = move-exception
            r3 = r1
            goto L50
        L66:
            r0 = move-exception
            r3 = r1
            goto L53
        L69:
            r7 = move-exception
            r3 = r1
            r4 = r3
            goto L50
        L6d:
            r0 = move-exception
            r3 = r1
        L6f:
            r4 = r3
            goto L53
        L71:
            r7 = move-exception
            r3 = r1
            r4 = r3
            goto L8c
        L75:
            r0 = move-exception
            r8 = r1
            r3 = r8
            goto L6f
        L79:
            r0 = move-exception
            r8 = r1
            r3 = r8
            r4 = r3
        L7d:
            if (r1 == 0) goto L82
            r1.delete()     // Catch: java.lang.Throwable -> L4f
        L82:
            java.lang.String r1 = "DecryptUtils"
            java.lang.String r2 = "aesDecrypt"
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch: java.lang.Throwable -> L4f
            com.taobao.sophix.p052e.C6378e.m4708b(r1, r2, r0, r5)     // Catch: java.lang.Throwable -> L4f
            goto L59
        L8c:
            com.taobao.sophix.p052e.C6376c.m4691a(r1)
            com.taobao.sophix.p052e.C6376c.m4691a(r4)
            com.taobao.sophix.p052e.C6376c.m4691a(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.sophix.p052e.C6374a.m4681a(java.lang.String, java.lang.String):boolean");
    }
}
