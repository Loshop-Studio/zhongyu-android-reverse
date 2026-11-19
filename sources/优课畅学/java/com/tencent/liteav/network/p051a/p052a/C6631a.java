package com.tencent.liteav.network.p051a.p052a;

import com.tencent.liteav.network.p051a.C6634b;
import com.tencent.liteav.network.p051a.C6637d;
import com.tencent.liteav.network.p051a.C6638e;
import com.tencent.liteav.network.p051a.InterfaceC6636c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.tencent.liteav.network.a.a.a */
/* loaded from: classes4.dex */
public final class C6631a {
    /* renamed from: a */
    public static InetAddress[] m5238a() throws IOException {
        String hostAddress;
        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new InputStreamReader(Runtime.getRuntime().exec("getprop").getInputStream()));
            ArrayList arrayList = new ArrayList(5);
            while (true) {
                String line = lineNumberReader.readLine();
                if (line == null) {
                    break;
                }
                int iIndexOf = line.indexOf("]: [");
                if (iIndexOf != -1) {
                    String strSubstring = line.substring(1, iIndexOf);
                    String strSubstring2 = line.substring(iIndexOf + 4, line.length() - 1);
                    if (strSubstring.endsWith(".dns") || strSubstring.endsWith(".dns1") || strSubstring.endsWith(".dns2") || strSubstring.endsWith(".dns3") || strSubstring.endsWith(".dns4")) {
                        InetAddress byName = InetAddress.getByName(strSubstring2);
                        if (byName != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0) {
                            arrayList.add(byName);
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
            return null;
        } catch (IOException e10) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByExec", (Throwable) e10);
            return null;
        }
    }

    /* renamed from: b */
    public static InetAddress[] m5239b() throws NoSuchMethodException, SecurityException {
        InetAddress byName;
        String hostAddress;
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            ArrayList arrayList = new ArrayList(5);
            String[] strArr = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};
            for (int i10 = 0; i10 < 4; i10++) {
                String str = (String) method.invoke(null, strArr[i10]);
                if (str != null && str.length() != 0 && (byName = InetAddress.getByName(str)) != null && (hostAddress = byName.getHostAddress()) != null && hostAddress.length() != 0 && !arrayList.contains(byName)) {
                    arrayList.add(byName);
                }
            }
            if (arrayList.size() > 0) {
                return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
            }
        } catch (Exception e10) {
            Logger.getLogger("AndroidDnsServer").log(Level.WARNING, "Exception in findDNSByReflection", (Throwable) e10);
        }
        return null;
    }

    /* renamed from: c */
    public static InterfaceC6636c m5240c() {
        return new InterfaceC6636c() { // from class: com.tencent.liteav.network.a.a.a.1
            @Override // com.tencent.liteav.network.p051a.InterfaceC6636c
            /* renamed from: a */
            public C6638e[] mo5241a(C6634b c6634b, C6637d c6637d) throws NoSuchMethodException, SecurityException, IOException {
                InetAddress[] inetAddressArrM5239b = C6631a.m5239b();
                if (inetAddressArrM5239b == null) {
                    inetAddressArrM5239b = C6631a.m5238a();
                }
                if (inetAddressArrM5239b != null) {
                    return new C6633c(inetAddressArrM5239b[0]).mo5241a(c6634b, c6637d);
                }
                throw new IOException("cant get local dns server");
            }
        };
    }
}
