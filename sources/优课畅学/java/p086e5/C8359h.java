package p086e5;

import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import android.util.Base64;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.gson.Gson;
import com.zykj.study.utils.AppContext;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.C9114c0;
import org.json.JSONObject;
import p113g8.AbstractC8661c0;
import p113g8.AbstractC8687z;
import p113g8.C8660c;
import p121h5.C8714a;

/* renamed from: e5.h */
/* loaded from: classes5.dex */
public final class C8359h {

    /* renamed from: a */
    public static final C8359h f15883a = new C8359h();

    /* renamed from: b */
    public static final String f15884b = Environment.getExternalStorageDirectory().getAbsolutePath() + "/deviceId";

    /* renamed from: c */
    public static final String f15885c = "deviceId.bin";

    /* renamed from: a */
    public final String m13627a() throws IllegalAccessException, SocketException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            String string = Settings.System.getString(AppContext.f13703a.mo11860b().getContentResolver(), "android_id");
            AbstractC9133u.m16132f(string, "getString(...)");
            return string;
        }
        String strM13629c = m13629c();
        if (strM13629c.length() == 0) {
            String strM13630d = m13630d();
            if (strM13630d.length() > 0) {
                String lowerCase = AbstractC8687z.m14101I(strM13630d, ":", "", false, 4, null).toLowerCase(Locale.ROOT);
                AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
                strM13629c = "47Q6" + lowerCase;
            }
        }
        if (strM13629c.length() != 0) {
            return strM13629c;
        }
        String string2 = Settings.System.getString(AppContext.f13703a.mo11860b().getContentResolver(), "android_id");
        AbstractC9133u.m16132f(string2, "getString(...)");
        return string2;
    }

    /* renamed from: b */
    public final String m13628b(String schoolCode, String username) {
        String string;
        String strM14011z0;
        AbstractC9133u.m16133g(schoolCode, "schoolCode");
        AbstractC9133u.m16133g(username, "username");
        try {
            if (schoolCode.length() <= 0 || username.length() <= 0) {
                return null;
            }
            String strM14216a = C8714a.f16338a.m14216a(f15884b + "/" + f15885c);
            if (strM14216a == null || (string = AbstractC8661c0.m13982W0(strM14216a).toString()) == null || (strM14011z0 = AbstractC8661c0.m14011z0(string, SignParameters.NEW_LINE)) == null) {
                return null;
            }
            byte[] bArrDecode = Base64.decode(strM14011z0, 0);
            AbstractC9133u.m16132f(bArrDecode, "decode(...)");
            JSONObject jSONObject = new JSONObject(new String(bArrDecode, C8660c.f16206b));
            String lowerCase = schoolCode.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            String str = lowerCase + "_" + username;
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public final String m13629c() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        String serial;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            serial = Build.getSerial();
        } else if (i10 > 24) {
            serial = Build.SERIAL;
        } else {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            Method method = cls.getMethod("get", String.class);
            AbstractC9133u.m16132f(method, "getMethod(...)");
            Object objInvoke = method.invoke(cls, "ro.serialno");
            AbstractC9133u.m16131e(objInvoke, "null cannot be cast to non-null type kotlin.String");
            serial = (String) objInvoke;
        }
        return (serial == null || serial.length() == 0 || AbstractC9133u.m16128b(serial, "unknow") || AbstractC9133u.m16128b(serial, "no.such.thing")) ? "" : serial;
    }

    /* renamed from: d */
    public final String m13630d() throws SocketException {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterfaceNextElement = networkInterfaces.nextElement();
                byte[] hardwareAddress = networkInterfaceNextElement.getHardwareAddress();
                if (hardwareAddress != null && hardwareAddress.length != 0) {
                    StringBuilder sb = new StringBuilder();
                    for (byte b10 : hardwareAddress) {
                        C9114c0 c9114c0 = C9114c0.f17482a;
                        String str = String.format("%02X:", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
                        AbstractC9133u.m16132f(str, "format(...)");
                        sb.append(str);
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    String string = sb.toString();
                    AbstractC9133u.m16132f(string, "toString(...)");
                    if (AbstractC9133u.m16128b(networkInterfaceNextElement.getName(), "wlan0")) {
                        return string;
                    }
                }
            }
            return "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    /* renamed from: e */
    public final void m13631e(String schoolCode, String username, String deviceId) throws Throwable {
        String string;
        String strM14011z0;
        AbstractC9133u.m16133g(schoolCode, "schoolCode");
        AbstractC9133u.m16133g(username, "username");
        AbstractC9133u.m16133g(deviceId, "deviceId");
        try {
            HashMap map = new HashMap();
            try {
                String strM14216a = C8714a.f16338a.m14216a(f15884b + "/" + f15885c);
                if (strM14216a != null && (string = AbstractC8661c0.m13982W0(strM14216a).toString()) != null && (strM14011z0 = AbstractC8661c0.m14011z0(string, SignParameters.NEW_LINE)) != null) {
                    byte[] bArrDecode = Base64.decode(strM14011z0, 0);
                    AbstractC9133u.m16132f(bArrDecode, "decode(...)");
                    JSONObject jSONObject = new JSONObject(new String(bArrDecode, C8660c.f16206b));
                    Iterator<String> itKeys = jSONObject.keys();
                    AbstractC9133u.m16132f(itKeys, "keys(...)");
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        AbstractC9133u.m16132f(next, "next(...)");
                        String str = next;
                        map.put(str, jSONObject.getString(str));
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            String lowerCase = schoolCode.toLowerCase(Locale.ROOT);
            AbstractC9133u.m16132f(lowerCase, "toLowerCase(...)");
            map.put(lowerCase + "_" + username, deviceId);
            String json = new Gson().toJson(map);
            AbstractC9133u.m16130d(json);
            Charset charset = C8660c.f16206b;
            byte[] bytes = json.getBytes(charset);
            AbstractC9133u.m16132f(bytes, "getBytes(...)");
            byte[] bArrEncode = Base64.encode(bytes, 0);
            AbstractC9133u.m16132f(bArrEncode, "encode(...)");
            C8714a.f16338a.m14217b(f15884b, f15885c, new String(bArrEncode, charset));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
