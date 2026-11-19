package p114d6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import com.tendcloud.tenddata.C7863av;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: d6.a */
/* loaded from: classes5.dex */
public abstract class AbstractC8991a {

    /* renamed from: a */
    public static final Uri f20956a = Uri.parse("content://com.huawei.hwid");

    /* renamed from: b */
    public static final String[] f20957b = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", PackageConstants.SERVICES_SIGNATURE_V3};

    /* renamed from: a */
    public static int m17534a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            AbstractC8996f.m17565f("BksUtil", "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            AbstractC8996f.m17561b("BksUtil", "create directory  success");
            return 0;
        }
        AbstractC8996f.m17563d("BksUtil", "create directory  failed");
        return -1;
    }

    /* renamed from: b */
    public static String m17535b(Context context) {
        return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
    }

    /* renamed from: c */
    public static String m17536c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & C7863av.f14384i);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* renamed from: d */
    public static void m17537d(InputStream inputStream, Context context) throws Throwable {
        FileOutputStream fileOutputStream;
        if (inputStream == null || context == null) {
            return;
        }
        String strM17535b = m17535b(context);
        if (!new File(strM17535b).exists()) {
            m17534a(strM17535b);
        }
        File file = new File(strM17535b, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                AbstractC8996f.m17564e("BksUtil", "write output stream ");
                fileOutputStream = new FileOutputStream(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException unused) {
        }
        try {
            byte[] bArr = new byte[2048];
            while (true) {
                int i10 = inputStream.read(bArr, 0, 2048);
                if (i10 == -1) {
                    AbstractC8995e.m17559c(fileOutputStream);
                    return;
                }
                fileOutputStream.write(bArr, 0, i10);
            }
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            AbstractC8996f.m17563d("BksUtil", " IOException");
            AbstractC8995e.m17559c(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            AbstractC8995e.m17559c(fileOutputStream2);
            throw th;
        }
    }

    /* renamed from: e */
    public static byte[] m17538e(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e("BksUtil", "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("BksUtil", "PackageManager.NameNotFoundException : " + e10.getMessage());
        } catch (Exception e11) {
            Log.e("BksUtil", "get pm exception : " + e11.getMessage());
        }
        return new byte[0];
    }

    /* renamed from: f */
    public static String m17539f(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return m17536c(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            AbstractC8996f.m17563d("BksUtil", "inputstraem exception");
            return "";
        }
    }

    /* renamed from: g */
    public static void m17540g(Context context) throws Throwable {
        InputStream inputStreamOpenInputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayInputStream byteArrayInputStream;
        ByteArrayInputStream byteArrayInputStream2 = null;
        try {
            try {
                inputStreamOpenInputStream = context.getContentResolver().openInputStream(Uri.withAppendedPath(f20956a, "files/hmsrootcas.bks"));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
            inputStreamOpenInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenInputStream = null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStreamOpenInputStream.read(bArr);
                    if (i10 <= -1) {
                        break;
                    } else {
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                }
                byteArrayOutputStream.flush();
                byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            } catch (Exception e11) {
                e = e11;
            }
            try {
                String strM17568b = AbstractC8998h.m17568b("bks_hash", "", context);
                String strM17539f = m17539f(byteArrayOutputStream.toByteArray());
                if (m17546m(context) && strM17568b.equals(strM17539f)) {
                    AbstractC8996f.m17564e("BksUtil", "bks not update");
                } else {
                    AbstractC8996f.m17564e("BksUtil", "update bks and sp");
                    m17537d(byteArrayInputStream, context);
                    AbstractC8998h.m17571e("bks_hash", strM17539f, context);
                }
                AbstractC8995e.m17558b(inputStreamOpenInputStream);
                AbstractC8995e.m17559c(byteArrayOutputStream);
                AbstractC8995e.m17558b(byteArrayInputStream);
            } catch (Exception e12) {
                e = e12;
                byteArrayInputStream2 = byteArrayInputStream;
                AbstractC8996f.m17563d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                AbstractC8995e.m17558b(inputStreamOpenInputStream);
                AbstractC8995e.m17559c(byteArrayOutputStream);
                AbstractC8995e.m17558b(byteArrayInputStream2);
            } catch (Throwable th3) {
                th = th3;
                byteArrayInputStream2 = byteArrayInputStream;
                AbstractC8995e.m17558b(inputStreamOpenInputStream);
                AbstractC8995e.m17559c(byteArrayOutputStream);
                AbstractC8995e.m17558b(byteArrayInputStream2);
                throw th;
            }
        } catch (Exception e13) {
            e = e13;
            byteArrayOutputStream = null;
            AbstractC8996f.m17563d("BksUtil", "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
            AbstractC8995e.m17558b(inputStreamOpenInputStream);
            AbstractC8995e.m17559c(byteArrayOutputStream);
            AbstractC8995e.m17558b(byteArrayInputStream2);
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            AbstractC8995e.m17558b(inputStreamOpenInputStream);
            AbstractC8995e.m17559c(byteArrayOutputStream);
            AbstractC8995e.m17558b(byteArrayInputStream2);
            throw th;
        }
    }

    /* renamed from: h */
    public static boolean m17541h(Context context, String str) {
        return PackageConstants.SERVICES_SIGNATURE_V3.equalsIgnoreCase(m17544k(m17538e(context, str)));
    }

    /* renamed from: i */
    public static boolean m17542i(String str) throws NumberFormatException {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        AbstractC8996f.m17564e("BksUtil", "hms version code is : " + str);
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = "4.0.2.300".split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i11 = 0;
        while (i11 < iMax) {
            if (i11 < length) {
                try {
                    i10 = Integer.parseInt(strArrSplit[i11]);
                } catch (Exception e10) {
                    AbstractC8996f.m17563d("BksUtil", " exception : " + e10.getMessage());
                    return i11 >= length2;
                }
            } else {
                i10 = 0;
            }
            int i12 = i11 < length2 ? Integer.parseInt(strArrSplit2[i11]) : 0;
            if (i10 < i12) {
                return false;
            }
            if (i10 > i12) {
                return true;
            }
            i11++;
        }
        return true;
    }

    /* renamed from: j */
    public static String m17543j(Context context) {
        return m17535b(context) + File.separator + "hmsrootcas.bks";
    }

    /* renamed from: k */
    public static String m17544k(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return m17536c(MessageDigest.getInstance("SHA-256").digest(bArr));
            } catch (NoSuchAlgorithmException e10) {
                Log.e("BksUtil", "NoSuchAlgorithmException" + e10.getMessage());
            }
        }
        return "";
    }

    /* renamed from: l */
    public static boolean m17545l(Context context, String str) {
        byte[] bArrM17538e = m17538e(context, str);
        for (String str2 : f20957b) {
            if (str2.equalsIgnoreCase(m17544k(bArrM17538e))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public static boolean m17546m(Context context) {
        return new File(m17535b(context) + File.separator + "hmsrootcas.bks").exists();
    }

    /* renamed from: n */
    public static synchronized InputStream m17547n(Context context) {
        try {
            AbstractC8996f.m17564e("BksUtil", "get bks from tss begin");
            if (context != null) {
                AbstractC8992b.m17550b(context);
            }
            Context contextM17549a = AbstractC8992b.m17549a();
            if (contextM17549a == null) {
                AbstractC8996f.m17563d("BksUtil", "context is null");
                return null;
            }
            if (!m17542i(AbstractC8997g.m17566a("com.huawei.hwid")) && !m17542i(AbstractC8997g.m17566a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                AbstractC8996f.m17563d("BksUtil", "hms version code is too low : " + AbstractC8997g.m17566a("com.huawei.hwid"));
                return null;
            }
            if (!m17545l(contextM17549a, "com.huawei.hwid") && !m17541h(contextM17549a, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                AbstractC8996f.m17563d("BksUtil", "hms sign error");
                return null;
            }
            m17540g(contextM17549a);
            return m17548o(contextM17549a);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: o */
    public static InputStream m17548o(Context context) {
        if (!m17546m(context)) {
            return null;
        }
        AbstractC8996f.m17564e("BksUtil", "getFilesBksIS ");
        try {
            return new FileInputStream(m17543j(context));
        } catch (FileNotFoundException unused) {
            AbstractC8996f.m17563d("BksUtil", "FileNotFoundExceptio: ");
            return null;
        }
    }
}
