package com.huawei.hms.framework.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.TransportInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.HwTelephonyManager;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.autofill.HintConstants;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.framework.common.hianalytics.InitReport;
import com.taobao.accs.utl.UtilityImpl;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import p145f6.AbstractC9200d;

/* loaded from: classes5.dex */
public class NetworkUtil {
    public static final int UNAVAILABLE = Integer.MAX_VALUE;
    public static volatile boolean isSupportIpv6Net = true;
    public static volatile int networkTypeByReceiver;

    public static final class NetType {
        public static final int TYPE_2G = 2;
        public static final int TYPE_3G = 3;
        public static final int TYPE_4G = 4;
        public static final int TYPE_4G_NSA = 7;
        public static final int TYPE_5G = 5;
        public static final int TYPE_5G_SA = 8;
        public static final int TYPE_MOBILE = 6;
        public static final int TYPE_NO_NETWORK = -1;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WIFI = 1;
    }

    public static final class SignalType {
        public static final String LTE_CQI = "lteCqi";
        public static final String LTE_DBM = "lteDbm";
        public static final String LTE_RSRP = "lteRsrp";
        public static final String LTE_RSRQ = "lteRsrq";
        public static final String LTE_RSSI = "lteRssi";
        public static final String LTE_RSSNR = "lteRssnr";
        public static final String NR_CSIRSRP = "nrCSIRsrp";
        public static final String NR_CSIRSRQ = "nrCSIRsrq";
        public static final String NR_CSISINR = "nrCSISinr";
        public static final String NR_DBM = "nrDbm";
        public static final String NR_SSRSRP = "nrSSRsrp";
        public static final String NR_SSRSRQ = "nrSSRsrq";
        public static final String NR_SSSINR = "nrSSSinr";
    }

    /* renamed from: a */
    public static String[] m8592a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        LinkProperties linkProperties;
        LinkedList linkedList = new LinkedList();
        if (context != null && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : connectivityManager.getAllNetworks()) {
                        if (network != null && (networkInfo = connectivityManager.getNetworkInfo(network)) != null && networkInfo.getType() == activeNetworkInfo.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                            Iterator<InetAddress> it = linkProperties.getDnsServers().iterator();
                            while (it.hasNext()) {
                                linkedList.add(it.next().getHostAddress());
                            }
                        }
                    }
                }
            } catch (SecurityException e10) {
                Logger.m8580i("NKUtil", "getActiveNetworkInfo failed, exception:" + e10.getClass().getSimpleName());
            } catch (RuntimeException e11) {
                Logger.m8580i("NKUtil", "getActiveNetworkInfo failed, exception:" + e11.getClass().getSimpleName());
            }
        }
        return linkedList.isEmpty() ? new String[0] : (String[]) linkedList.toArray(new String[linkedList.size()]);
    }

    /* renamed from: b */
    public static int m8593b(Context context) {
        SignalStrength signalStrengthM8594c;
        if (Build.VERSION.SDK_INT <= 28 || (signalStrengthM8594c = m8594c(context)) == null) {
            return Integer.MAX_VALUE;
        }
        int networkType = getNetworkType(context);
        try {
            if (networkType == 3) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthCdma.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthCdma) cellSignalStrengths.get(0)).getDbm();
                }
                List cellSignalStrengths2 = signalStrengthM8594c.getCellSignalStrengths(AbstractC7299g.m8613a());
                if (cellSignalStrengths2.size() > 0) {
                    return AbstractC7300h.m8614a(cellSignalStrengths2.get(0)).getDbm();
                }
                List cellSignalStrengths3 = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthWcdma.class);
                if (cellSignalStrengths3.size() > 0) {
                    return ((CellSignalStrengthWcdma) cellSignalStrengths3.get(0)).getDbm();
                }
            } else if (networkType == 4) {
                List cellSignalStrengths4 = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths4.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths4.get(0)).getDbm();
                }
            } else if (networkType == 5) {
                List cellSignalStrengths5 = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths5.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths5.get(0)).getDbm();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getMobileSingalStrength: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    /* renamed from: c */
    public static SignalStrength m8594c(Context context) {
        if (context == null || Build.VERSION.SDK_INT < 28) {
            return null;
        }
        return getTrafficCardTelephonyManager(context).getSignalStrength();
    }

    /* renamed from: d */
    public static int m8595d(int i10) {
        int i11 = -1;
        if (i10 != -1) {
            i11 = 1;
            if (i10 != 1) {
                return (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 6 : 0;
            }
        }
        return i11;
    }

    public static int getCurrentNetworkType() {
        return networkTypeByReceiver;
    }

    public static String getDnsServerIps(Context context) {
        return Arrays.toString(m8592a(context));
    }

    public static String getHost(String str) {
        return TextUtils.isEmpty(str) ? "" : AbstractC9200d.m18088b(str);
    }

    public static int getInfoWithReflect(SignalStrength signalStrength, String str) {
        try {
            if (Build.VERSION.SDK_INT > 28) {
                return Integer.MAX_VALUE;
            }
            final Method declaredMethod = SignalStrength.class.getDeclaredMethod(str, null);
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.framework.common.NetworkUtil.1
                @Override // java.security.PrivilegedAction
                public Object run() throws SecurityException {
                    declaredMethod.setAccessible(true);
                    return null;
                }
            });
            return ((Integer) declaredMethod.invoke(signalStrength, null)).intValue();
        } catch (IllegalAccessException unused) {
            Logger.m8580i("NKUtil", str + " : cannot access");
            return Integer.MAX_VALUE;
        } catch (NoSuchMethodException unused2) {
            Logger.m8580i("NKUtil", str + " : function not found");
            return Integer.MAX_VALUE;
        } catch (InvocationTargetException unused3) {
            Logger.m8580i("NKUtil", str + " : InvocationTargetException");
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", str + " : throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getLteCqi(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrengthM8594c, "getLteCqi");
                }
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi();
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteCqi: throwable:" + th.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrp(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrengthM8594c, "getLteRsrp");
                }
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp();
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRsrp: throwable:" + th.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRsrq(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrengthM8594c, "getLteRsrq");
                }
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq();
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRsrq: throwable:" + th.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssi(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                    if (cellSignalStrengths.size() > 0) {
                        return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi();
                    }
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRssi: throwable:" + th.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int getLteRssnr(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    return getInfoWithReflect(signalStrengthM8594c, "getLteRssnr");
                }
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    return ((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr();
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRssnr: throwable:" + th.getClass());
                return Integer.MAX_VALUE;
            }
        }
        return Integer.MAX_VALUE;
    }

    public static Map<String, Integer> getLteSignalInfo(Context context) {
        HashMap map = new HashMap();
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT <= 28) {
                    map.put(SignalType.LTE_DBM, Integer.valueOf(getInfoWithReflect(signalStrengthM8594c, "getDbm")));
                    map.put(SignalType.LTE_RSRP, Integer.valueOf(getInfoWithReflect(signalStrengthM8594c, "getLteRsrp")));
                    map.put(SignalType.LTE_RSRQ, Integer.valueOf(getInfoWithReflect(signalStrengthM8594c, "getLteRsrq")));
                    map.put(SignalType.LTE_RSSNR, Integer.valueOf(getInfoWithReflect(signalStrengthM8594c, "getLteRssnr")));
                    map.put(SignalType.LTE_CQI, Integer.valueOf(getInfoWithReflect(signalStrengthM8594c, "getLteCqi")));
                    return map;
                }
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(CellSignalStrengthLte.class);
                if (cellSignalStrengths.size() > 0) {
                    map.put(SignalType.LTE_DBM, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getDbm()));
                    map.put(SignalType.LTE_RSRP, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrp()));
                    map.put(SignalType.LTE_RSRQ, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRsrq()));
                    map.put(SignalType.LTE_RSSNR, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssnr()));
                    map.put(SignalType.LTE_CQI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getCqi()));
                    map.put(SignalType.LTE_RSSI, Integer.valueOf(((CellSignalStrengthLte) cellSignalStrengths.get(0)).getRssi()));
                    return map;
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRssi: throwable:" + th.getClass());
                return map;
            }
        }
        return map;
    }

    public static String getMNC(Context context) {
        if (context == null || !isSimReady(context)) {
            return "unknown";
        }
        Object systemService = ContextCompat.getSystemService(context, HintConstants.AUTOFILL_HINT_PHONE);
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        if (telephonyManager == null) {
            Logger.m8573e("NKUtil", "getSubscriptionOperatorType: other error!");
            return "unknown";
        }
        String networkOperator = telephonyManager.getNetworkOperator();
        return ("46001".equals(networkOperator) || "46006".equals(networkOperator) || "46009".equals(networkOperator)) ? "China_Unicom" : ("46000".equals(networkOperator) || "46002".equals(networkOperator) || "46004".equals(networkOperator) || "46007".equals(networkOperator)) ? "China_Mobile" : ("46003".equals(networkOperator) || "46005".equals(networkOperator) || "46011".equals(networkOperator)) ? "China_Telecom" : DispatchConstants.OTHER;
    }

    public static int getMobileRsrp(Context context) {
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c == null) {
            return Integer.MAX_VALUE;
        }
        try {
            return Build.VERSION.SDK_INT > 28 ? m8593b(context) : getInfoWithReflect(signalStrengthM8594c, "getDbm");
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getDbm: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static String getNetWorkNSAorSA() {
        try {
            HwTelephonyManager hwTelephonyManager = HwTelephonyManager.getDefault();
            int default4GSlotId = hwTelephonyManager.getDefault4GSlotId();
            Logger.m8586v("NKUtil", "phoneId " + default4GSlotId);
            boolean zIsNsaState = hwTelephonyManager.isNsaState(default4GSlotId);
            Logger.m8586v("NKUtil", "isNsa " + zIsNsaState);
            return zIsNsaState ? "5G_NSA" : "5G_SA";
        } catch (Throwable unused) {
            Logger.m8586v("NKUtil", "isNsaState error");
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo getNetworkInfo(Context context) {
        ConnectivityManager connectivityManager;
        if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") && (connectivityManager = (ConnectivityManager) ContextCompat.getSystemService(context, "connectivity")) != null) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (RuntimeException e10) {
                Logger.m8580i("NKUtil", "getActiveNetworkInfo failed, exception:" + e10.getClass().getSimpleName() + e10.getMessage());
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    public static NetworkInfo.DetailedState getNetworkStatus(Context context) {
        NetworkInfo.DetailedState detailedState = NetworkInfo.DetailedState.IDLE;
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                try {
                    if (ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            return activeNetworkInfo.getDetailedState();
                        }
                        Logger.m8580i("NKUtil", "getNetworkStatus networkIsConnected netInfo is null!");
                        return detailedState;
                    }
                } catch (RuntimeException e10) {
                    Logger.m8580i("NKUtil", "getNetworkStatus exception" + e10.getClass().getSimpleName() + e10.getMessage());
                }
            } else {
                Logger.m8580i("NKUtil", "getNetworkStatus ConnectivityManager is null!");
            }
        }
        return detailedState;
    }

    public static int getNetworkType(Context context) {
        if (context != null) {
            return getNetworkType(getNetworkInfo(context), context);
        }
        return 0;
    }

    public static int getNrCsiRsrp(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiRsrp();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrCsiRsrp: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiRsrq(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiRsrq();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrCsiRsrq: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrCsiSinr(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiSinr();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrCsiSinr: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static Map<String, Integer> getNrSignalInfo(Context context) {
        HashMap map = new HashMap();
        SignalStrength signalStrengthM8594c = m8594c(context);
        if (signalStrengthM8594c != null) {
            try {
                if (Build.VERSION.SDK_INT > 28) {
                    List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                    if (cellSignalStrengths.size() > 0) {
                        map.put(SignalType.NR_DBM, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getDbm()));
                        map.put(SignalType.NR_CSIRSRP, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiRsrp()));
                        map.put(SignalType.NR_CSIRSRQ, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiRsrq()));
                        map.put(SignalType.NR_CSISINR, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getCsiSinr()));
                        map.put(SignalType.NR_SSRSRP, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsRsrp()));
                        map.put(SignalType.NR_SSRSRQ, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsRsrq()));
                        map.put(SignalType.NR_SSSINR, Integer.valueOf(AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsSinr()));
                        return map;
                    }
                }
            } catch (Throwable th) {
                Logger.m8580i("NKUtil", "getLteRssi: throwable:" + th.getClass());
                return map;
            }
        }
        return map;
    }

    public static int getNrSsRsrp(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsRsrp();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrSsRsrp: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsRsrq(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsRsrq();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrSsRsrq: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getNrSsSinr(Context context) {
        SignalStrength signalStrengthM8594c;
        try {
            if (Build.VERSION.SDK_INT > 28 && (signalStrengthM8594c = m8594c(context)) != null) {
                List cellSignalStrengths = signalStrengthM8594c.getCellSignalStrengths(AbstractC7293a.m8606a());
                if (cellSignalStrengths.size() > 0) {
                    return AbstractC7306l.m8623a(cellSignalStrengths.get(0)).getSsSinr();
                }
            }
            return Integer.MAX_VALUE;
        } catch (Throwable th) {
            Logger.m8580i("NKUtil", "getNrSsSinr: throwable:" + th.getClass());
            return Integer.MAX_VALUE;
        }
    }

    public static int getPrimaryNetworkType(Context context) {
        return m8595d(getNetworkType(getNetworkInfo(context), context));
    }

    public static TelephonyManager getTrafficCardTelephonyManager(Context context) {
        if (context == null) {
            return null;
        }
        Object systemService = ContextCompat.getSystemService(context, HintConstants.AUTOFILL_HINT_PHONE);
        if (systemService instanceof TelephonyManager) {
            return ((TelephonyManager) systemService).createForSubscriptionId(SubscriptionManager.getDefaultDataSubscriptionId());
        }
        return null;
    }

    public static String getWifiGatewayIp(Context context) {
        if (context != null) {
            Object systemService = ContextCompat.getSystemService(context.getApplicationContext(), UtilityImpl.NET_TYPE_WIFI);
            if (systemService instanceof WifiManager) {
                try {
                    int i10 = ((WifiManager) systemService).getDhcpInfo().gateway;
                    return InetAddress.getByAddress(new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)}).getHostAddress();
                } catch (RuntimeException | UnknownHostException e10) {
                    Logger.m8580i("NKUtil", "getWifiGatewayIp error!" + e10.getClass().getSimpleName() + e10.getMessage());
                }
            }
        }
        return " ";
    }

    public static int getWifiRssi(Context context) {
        TransportInfo transportInfo;
        int rssi = -127;
        if (context != null && Build.VERSION.SDK_INT >= 31) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                for (Network network : connectivityManager.getAllNetworks()) {
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkCapabilities.hasTransport(1) && (transportInfo = networkCapabilities.getTransportInfo()) != null && (transportInfo instanceof WifiInfo)) {
                        rssi = ((WifiInfo) transportInfo).getRssi();
                    }
                }
                return rssi;
            } catch (RuntimeException e10) {
                Logger.m8580i("NKUtil", "getWifiRssiLevel did not has permission!" + e10.getClass().getSimpleName() + e10.getMessage());
            }
        }
        return rssi;
    }

    public static int getWifiRssiLevel(Context context) {
        return WifiManager.calculateSignalLevel(getWifiRssi(context), 5);
    }

    public static boolean isChangeToConnected(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if ((networkInfo != null && networkInfo.isConnected()) || !networkInfo2.isConnected()) {
            return false;
        }
        Logger.m8586v("NKUtil", "Find network state changed to connected");
        return true;
    }

    public static boolean isConnectTypeChange(NetworkInfo networkInfo, NetworkInfo networkInfo2) {
        if (networkInfo == null || !networkInfo.isConnected() || !networkInfo2.isConnected() || getPrimaryNetworkType(networkInfo) == getPrimaryNetworkType(networkInfo2)) {
            return false;
        }
        Logger.m8586v("NKUtil", "Find activity network changed");
        return true;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return ActivityUtil.isForeground(context);
    }

    public static boolean isNetworkAvailable(Context context) {
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo networkInfo = getNetworkInfo(context);
        return networkInfo != null && networkInfo.isConnected();
    }

    public static boolean isSimReady(Context context) {
        Object systemService = ContextCompat.getSystemService(context, HintConstants.AUTOFILL_HINT_PHONE);
        TelephonyManager telephonyManager = systemService instanceof TelephonyManager ? (TelephonyManager) systemService : null;
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }

    @SuppressLint({"MissingPermission"})
    public static boolean isSupportIpv6Net(Context context, int i10) {
        boolean z10 = i10 > 1;
        if (context == null) {
            return z10;
        }
        if (!ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Logger.m8586v("NKUtil", "has no network state permission");
            return z10;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Logger.m8573e("NKUtil", "mConnectivityManager is null");
            return z10;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            Logger.m8573e("NKUtil", "network is null");
            return z10;
        }
        LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
        if (linkProperties == null) {
            Logger.m8573e("NKUtil", "ipInfo is null");
            return z10;
        }
        List<LinkAddress> linkAddresses = linkProperties.getLinkAddresses();
        for (int i11 = 0; i11 < linkAddresses.size(); i11++) {
            InetAddress address = linkAddresses.get(i11).getAddress();
            if ((address instanceof Inet6Address) && !address.isLinkLocalAddress() && !address.isLoopbackAddress()) {
                Logger.m8586v("NKUtil", "has ipv6 interface");
                return true;
            }
        }
        Logger.m8586v("NKUtil", "has not ipv6 interface");
        return false;
    }

    public static boolean isUserUnlocked(Context context) {
        UserManager userManager = (UserManager) ContextCompat.getSystemService(context, "user");
        if (userManager == null) {
            return true;
        }
        try {
            return userManager.isUserUnlocked();
        } catch (RuntimeException e10) {
            Logger.m8574e("NKUtil", "dealType rethrowFromSystemServer:", e10);
            return true;
        }
    }

    public static int netWork(Context context) {
        int networkType = getNetworkType(context);
        Logger.m8586v("NKUtil", "networkType " + networkType);
        if (networkType == 4) {
            if (TextUtils.equals("5G_NSA", getNetWorkNSAorSA())) {
                return 7;
            }
            return networkType;
        }
        if (networkType == 5 && TextUtils.equals("5G_SA", getNetWorkNSAorSA())) {
            return 8;
        }
        return networkType;
    }

    @Deprecated
    public static NetworkInfo.DetailedState networkStatus(Context context) {
        return getNetworkStatus(context);
    }

    @SuppressLint({"MissingPermission"})
    public static int readDataSaverMode(Context context) {
        if (context != null && ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE")) {
            Object systemService = ContextCompat.getSystemService(context, "connectivity");
            if (systemService instanceof ConnectivityManager) {
                ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                try {
                    if (connectivityManager.isActiveNetworkMetered()) {
                        return connectivityManager.getRestrictBackgroundStatus();
                    }
                    Logger.m8586v("NKUtil", "ConnectType is not Mobile Network!");
                    return 0;
                } catch (RuntimeException e10) {
                    Logger.m8574e("NKUtil", "SystemServer error:", e10);
                }
            }
        }
        return 0;
    }

    public static void updateCurrentNetworkType() {
        networkTypeByReceiver = netWork(ContextHolder.getResourceContext());
        if (InitReport.isHasConnectNet()) {
            isSupportIpv6Net = isSupportIpv6Net(ContextHolder.getResourceContext(), networkTypeByReceiver);
            Logger.m8580i("NKUtil", "update currentNetworkType: " + networkTypeByReceiver + ", isSupportIpv6Net:" + isSupportIpv6Net);
        }
    }

    public static boolean isForeground() {
        return ActivityUtil.getInstance().isForeground();
    }

    public static int getNetworkType(NetworkInfo networkInfo, Context context) {
        int i10;
        if (networkInfo == null || !networkInfo.isConnected()) {
            return -1;
        }
        int type = networkInfo.getType();
        int i11 = 1;
        if (1 != type && 13 != type) {
            i11 = 0;
            if (type == 0) {
                int subtype = networkInfo.getSubtype();
                Logger.m8586v("NKUtil", "getHwNetworkType return is: " + subtype);
                if (subtype == 0) {
                    subtype = networkInfo.getSubtype();
                }
                if (subtype != 20) {
                    switch (subtype) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            i10 = 2;
                            break;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                        case 14:
                        case 15:
                            i10 = 3;
                            break;
                        case 13:
                            i10 = 4;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                } else {
                    i10 = 5;
                }
                if (i10 != 0 || Build.VERSION.SDK_INT < 25) {
                    return i10;
                }
                if (subtype != 16) {
                    return subtype != 17 ? 0 : 3;
                }
                return 2;
            }
        }
        return i11;
    }

    public static int getPrimaryNetworkType(NetworkInfo networkInfo) {
        return m8595d(getNetworkType(networkInfo));
    }

    public static int getNetworkType(NetworkInfo networkInfo) {
        return getNetworkType(networkInfo, null);
    }

    public static boolean isSupportIpv6Net() {
        return isSupportIpv6Net;
    }
}
