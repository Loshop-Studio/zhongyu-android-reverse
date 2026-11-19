package p127j0;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import androidx.autofill.HintConstants;
import com.p041ta.utdid2.device.UTDevice;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.Random;

/* renamed from: j0.c */
/* loaded from: classes3.dex */
public abstract class AbstractC7772c {

    /* renamed from: a */
    public static String f13408a;

    /* renamed from: b */
    public static String f13409b;

    /* renamed from: c */
    public static String[] f13410c = {"Unknown", "Unknown"};

    /* renamed from: d */
    public static String f13411d = null;

    /* renamed from: e */
    public static String f13412e = null;

    /* renamed from: a */
    public static byte[] m13103a(int i10) {
        return new byte[]{(byte) ((i10 >> 24) % 256), (byte) ((i10 >> 16) % 256), (byte) ((i10 >> 8) % 256), (byte) (i10 % 256)};
    }

    /* renamed from: b */
    public static String m13104b(Context context) {
        try {
            String str = f13409b;
            if (str != null) {
                return str;
            }
            String networkOperatorName = ((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE)).getNetworkOperatorName();
            f13409b = networkOperatorName;
            return networkOperatorName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static String m13105c() {
        try {
            return Locale.getDefault().getCountry();
        } catch (Exception e10) {
            AbstractC7774e.m13120c("get country error ", e10);
            return null;
        }
    }

    /* renamed from: d */
    public static String m13106d() throws Throwable {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader;
        String line;
        String str = f13408a;
        if (str != null) {
            return str;
        }
        try {
            try {
                fileReader = new FileReader("/proc/cpuinfo");
                try {
                    bufferedReader = new BufferedReader(fileReader);
                } catch (IOException unused) {
                    bufferedReader = null;
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
            } catch (Exception unused2) {
            }
        } catch (IOException unused3) {
            bufferedReader = null;
            fileReader = null;
        } catch (Throwable th3) {
            fileReader = null;
            th = th3;
            bufferedReader = null;
        }
        do {
            try {
                line = bufferedReader.readLine();
            } catch (IOException unused4) {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return null;
            } catch (Throwable th4) {
                th = th4;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception unused5) {
                        throw th;
                    }
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
            if (line == null) {
                fileReader.close();
                bufferedReader.close();
                return null;
            }
        } while (!line.contains("Hardware"));
        String str2 = line.split(":")[1];
        f13408a = str2;
        try {
            fileReader.close();
            bufferedReader.close();
        } catch (Exception unused6) {
        }
        return str2;
    }

    /* renamed from: e */
    public static String m13107e(Context context) {
        String str = f13412e;
        if (str != null) {
            return str;
        }
        String strM13113k = m13113k();
        f13412e = strM13113k;
        return strM13113k;
    }

    /* renamed from: f */
    public static String m13108f(Context context) {
        String str = f13411d;
        if (str != null) {
            return str;
        }
        if (AbstractC7777h.m13132d(str)) {
            f13411d = m13113k();
        }
        return f13411d;
    }

    /* renamed from: g */
    public static String m13109g() {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Exception e10) {
            AbstractC7774e.m13120c("get country error ", e10);
            return null;
        }
    }

    /* renamed from: h */
    public static String m13110h(int i10) {
        if (i10 == 20) {
            return "5G";
        }
        switch (i10) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "Unknown";
        }
    }

    /* renamed from: i */
    public static String[] m13111i(Context context) {
        if (context == null) {
            return f13410c;
        }
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            return f13410c;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return f13410c;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return f13410c;
        }
        if (activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                String[] strArr = f13410c;
                strArr[0] = "Wi-Fi";
                return strArr;
            }
            if (activeNetworkInfo.getType() == 0) {
                if (m13115m((TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE))) {
                    f13410c[0] = "5G";
                } else {
                    f13410c[0] = m13110h(activeNetworkInfo.getSubtype());
                }
                f13410c[1] = activeNetworkInfo.getSubtypeName();
                return f13410c;
            }
        }
        return f13410c;
    }

    /* renamed from: j */
    public static String m13112j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            if (i10 > i11) {
                int i12 = i10 ^ i11;
                i11 ^= i12;
                i10 = i12 ^ i11;
            }
            return i11 + "*" + i10;
        } catch (Exception e10) {
            AbstractC7774e.m13120c("DeviceUtils getResolution: error", e10);
            return "Unknown";
        }
    }

    /* renamed from: k */
    public static final String m13113k() {
        try {
            int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
            int iNanoTime = (int) System.nanoTime();
            int iNextInt = new Random().nextInt();
            int iNextInt2 = new Random().nextInt();
            byte[] bArrM13103a = m13103a(iCurrentTimeMillis);
            byte[] bArrM13103a2 = m13103a(iNanoTime);
            byte[] bArrM13103a3 = m13103a(iNextInt);
            byte[] bArrM13103a4 = m13103a(iNextInt2);
            byte[] bArr = new byte[16];
            System.arraycopy(bArrM13103a, 0, bArr, 0, 4);
            System.arraycopy(bArrM13103a2, 0, bArr, 4, 4);
            System.arraycopy(bArrM13103a3, 0, bArr, 8, 4);
            System.arraycopy(bArrM13103a4, 0, bArr, 12, 4);
            return AbstractC7770a.m13091g(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: l */
    public static String m13114l(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Exception e10) {
            AbstractC7774e.m13120c("get utdid error ", e10);
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m13115m(TelephonyManager telephonyManager) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Object objInvoke;
        int i10;
        try {
            objInvoke = Class.forName(telephonyManager.getClass().getName()).getDeclaredMethod("getServiceState", null).invoke(telephonyManager, null);
        } catch (Exception unused) {
        }
        for (Method method : Class.forName(objInvoke.getClass().getName()).getDeclaredMethods()) {
            i10 = (method.getName().equals("getNrStatus") || method.getName().equals("getNrState")) ? 0 : i10 + 1;
            method.setAccessible(true);
            return ((Integer) method.invoke(objInvoke, null)).intValue() == 3;
        }
    }
}
