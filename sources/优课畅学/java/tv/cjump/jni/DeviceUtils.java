package tv.cjump.jni;

import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;

/* loaded from: classes5.dex */
public abstract class DeviceUtils {

    /* renamed from: a */
    public static ARCH f20236a = ARCH.Unknown;

    public enum ARCH {
        Unknown,
        ARM,
        X86,
        MIPS,
        ARM64
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x007a -> B:59:0x00a1). Please report as a decompilation issue!!! */
    /* renamed from: a */
    public static synchronized ARCH m18948a() {
        RandomAccessFile randomAccessFile;
        byte[] bArr = new byte[20];
        File file = new File(Environment.getRootDirectory(), "lib/libc.so");
        if (file.canRead()) {
            RandomAccessFile randomAccessFile2 = null;
            randomAccessFile2 = null;
            randomAccessFile2 = null;
            randomAccessFile2 = null;
            try {
                try {
                    try {
                        randomAccessFile = new RandomAccessFile(file, "r");
                    } catch (IOException e10) {
                        e10.printStackTrace();
                        randomAccessFile2 = randomAccessFile2;
                    }
                } catch (FileNotFoundException e11) {
                    e = e11;
                } catch (IOException e12) {
                    e = e12;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                randomAccessFile.readFully(bArr);
                ?? r32 = 8;
                r32 = 8;
                r32 = 8;
                r32 = 8;
                int i10 = bArr[18] | (bArr[19] << 8);
                if (i10 == 3) {
                    f20236a = ARCH.X86;
                } else if (i10 == 8) {
                    f20236a = ARCH.MIPS;
                } else if (i10 == 40) {
                    f20236a = ARCH.ARM;
                } else if (i10 != 183) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("libc.so is unknown arch: ");
                    sb.append(Integer.toHexString(i10));
                    Log.e("NativeBitmapFactory", sb.toString());
                    r32 = sb;
                } else {
                    f20236a = ARCH.ARM64;
                }
                randomAccessFile.close();
                randomAccessFile2 = r32;
            } catch (FileNotFoundException e13) {
                e = e13;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                    randomAccessFile2 = randomAccessFile2;
                }
                return f20236a;
            } catch (IOException e14) {
                e = e14;
                randomAccessFile2 = randomAccessFile;
                e.printStackTrace();
                if (randomAccessFile2 != null) {
                    randomAccessFile2.close();
                    randomAccessFile2 = randomAccessFile2;
                }
                return f20236a;
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                throw th;
            }
        }
        return f20236a;
    }

    /* renamed from: b */
    public static String m18949b() {
        return Build.CPU_ABI;
    }

    /* renamed from: c */
    public static String m18950c() throws IllegalAccessException, NoSuchFieldException, IllegalArgumentException {
        try {
            Field declaredField = Build.class.getDeclaredField("CPU_ABI2");
            if (declaredField == null) {
                return null;
            }
            Object obj = declaredField.get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m18951d() {
        return Build.MANUFACTURER.equalsIgnoreCase("MagicBox") && Build.PRODUCT.equalsIgnoreCase("MagicBox");
    }

    /* renamed from: e */
    public static boolean m18952e() {
        return Build.MANUFACTURER.equalsIgnoreCase("Xiaomi") && Build.PRODUCT.equalsIgnoreCase("dredd");
    }

    /* renamed from: f */
    public static boolean m18953f() {
        return m18952e() || m18951d();
    }

    /* renamed from: g */
    public static boolean m18954g() {
        return (m18956i("armeabi-v7a") || m18956i("armeabi")) && ARCH.ARM.equals(m18948a());
    }

    /* renamed from: h */
    public static boolean m18955h() {
        return m18956i("x86") || ARCH.X86.equals(m18948a());
    }

    /* renamed from: i */
    public static boolean m18956i(String str) {
        String strM18949b = m18949b();
        if (TextUtils.isEmpty(strM18949b) || !strM18949b.equalsIgnoreCase(str)) {
            return !TextUtils.isEmpty(m18950c()) && strM18949b.equalsIgnoreCase(str);
        }
        return true;
    }
}
