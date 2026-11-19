package com.umeng.commonsdk.statistics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.C3394k;
import com.umeng.analytics.pro.C3397n;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3449a;
import com.umeng.commonsdk.internal.C3450b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.C3473b;
import com.umeng.commonsdk.statistics.SdkVersion;
import com.umeng.commonsdk.statistics.UMServerURL;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.utils.C3510b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* renamed from: com.umeng.commonsdk.statistics.internal.c */
/* loaded from: classes2.dex */
public class C3496c {

    /* renamed from: e */
    private static boolean f2840e = false;

    /* renamed from: f */
    private static boolean f2841f = false;

    /* renamed from: g */
    private static boolean f2842g = false;

    /* renamed from: a */
    private String f2843a = "10.0.0.172";

    /* renamed from: b */
    private int f2844b = 80;

    /* renamed from: c */
    private Context f2845c;

    /* renamed from: d */
    private InterfaceC3495b f2846d;

    public C3496c(Context context) {
        this.f2845c = context;
    }

    /* renamed from: b */
    private void m3805b() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f2845c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f2845c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        String strImprintProperty3 = UMEnvelopeBuild.imprintProperty(this.f2845c, "oversea_domain_p", "");
        String strImprintProperty4 = UMEnvelopeBuild.imprintProperty(this.f2845c, "oversea_domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty3)) {
            UMServerURL.OVERSEA_DEFAULT_URL = DataHelper.assembleURL(strImprintProperty3);
        }
        if (!TextUtils.isEmpty(strImprintProperty4)) {
            UMServerURL.OVERSEA_SECONDARY_URL = DataHelper.assembleURL(strImprintProperty4);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.OVERSEA_DEFAULT_URL, UMServerURL.OVERSEA_SECONDARY_URL};
        if (TextUtils.isEmpty(C3473b.f2730b)) {
            return;
        }
        if (C3473b.f2730b.startsWith("460") || C3473b.f2730b.startsWith("461")) {
            AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
        }
    }

    /* renamed from: c */
    private void m3806c() {
        if (f2842g) {
            return;
        }
        ImprintHandler.getImprintService(this.f2845c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                if (FieldManager.m3407b()) {
                    FieldManager.m3406a().m3409a(C3496c.this.f2845c, str2);
                    UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> apply imprint change and exit: key=" + str + "; value= " + str2);
                    UMWorkDispatch.sendEvent(C3496c.this.f2845c, C3449a.f2598w, C3450b.m3469a(C3496c.this.f2845c).m3470a(), null);
                }
            }
        });
        f2842g = true;
    }

    /* renamed from: d */
    private void m3807d() {
        if (f2841f) {
            return;
        }
        UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> 注册零号报文 imprint 应答处理回调。");
        ImprintHandler.getImprintService(this.f2845c).registPreProcessCallback(AnalyticsConstants.ZERO_RESPONSE_FLAG, new UMImprintPreProcessCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.2
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintPreProcessCallback
            public boolean onPreProcessImprintKey(String str, String str2) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.m3406a().m3408a(C3496c.this.f2845c);
                UMWorkDispatch.sendEvent(C3496c.this.f2845c, C3449a.f2594s, C3450b.m3469a(C3496c.this.f2845c).m3470a(), null);
                ImprintHandler.getImprintService(C3496c.this.f2845c).m3745a(AnalyticsConstants.ZERO_RESPONSE_FLAG);
                return true;
            }
        });
        ImprintHandler.getImprintService(this.f2845c).registImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, new UMImprintChangeCallback() { // from class: com.umeng.commonsdk.statistics.internal.c.3
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                UMRTLog.m3432e(UMRTLog.RTLOG_TAG, "--->>> first onImprintValueChanged: key=" + str + "; value= " + str2);
                FieldManager.m3406a().m3409a(C3496c.this.f2845c, str2);
                UMWorkDispatch.sendEvent(C3496c.this.f2845c, C3449a.f2594s, C3450b.m3469a(C3496c.this.f2845c).m3470a(), null);
                if (FieldManager.allow(C3510b.f2970E)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: foregound count timer enabled.");
                    if (!UMWorkDispatch.eventHasExist()) {
                        UMWorkDispatch.sendEventEx(C3496c.this.f2845c, C3397n.a.f2266C, CoreProtocol.getInstance(C3496c.this.f2845c), null, 0L);
                    }
                }
                if (FieldManager.allow(C3510b.f2971F)) {
                    UMRTLog.m3433i(UMRTLog.RTLOG_TAG, "--->>> recv zcfg response: FirstResumeTrigger enabled.");
                    C3394k.m3195a(C3496c.this.f2845c).m3214b(C3496c.this.f2845c);
                }
                ImprintHandler.getImprintService(C3496c.this.f2845c).unregistImprintCallback(AnalyticsConstants.CFG_FIELD_KEY, this);
            }
        });
        f2841f = true;
    }

    /* renamed from: e */
    private boolean m3808e() {
        NetworkInfo activeNetworkInfo;
        String extraInfo;
        if (this.f2845c.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", this.f2845c.getPackageName()) != 0) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f2845c.getSystemService("connectivity");
            if (DeviceConfig.checkPermission(this.f2845c, "android.permission.ACCESS_NETWORK_STATE") && connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.getType() != 1 && (extraInfo = activeNetworkInfo.getExtraInfo()) != null) {
                if (!extraInfo.equals("cmwap") && !extraInfo.equals("3gwap")) {
                    if (extraInfo.equals("uniwap")) {
                    }
                }
                return true;
            }
        } catch (Throwable th) {
            UMCrashManager.reportCrash(this.f2845c, th);
        }
        return false;
    }

    /* renamed from: a */
    public void m3809a(InterfaceC3495b interfaceC3495b) {
        this.f2846d = interfaceC3495b;
    }

    /* renamed from: a */
    private void m3804a() {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(this.f2845c, "domain_p", "");
        String strImprintProperty2 = UMEnvelopeBuild.imprintProperty(this.f2845c, "domain_s", "");
        if (!TextUtils.isEmpty(strImprintProperty)) {
            UMServerURL.DEFAULT_URL = DataHelper.assembleURL(strImprintProperty);
        }
        if (!TextUtils.isEmpty(strImprintProperty2)) {
            UMServerURL.SECONDARY_URL = DataHelper.assembleURL(strImprintProperty2);
        }
        AnalyticsConstants.APPLOG_URL_LIST = new String[]{UMServerURL.DEFAULT_URL, UMServerURL.SECONDARY_URL};
    }

    /* renamed from: a */
    public byte[] m3811a(byte[] bArr, boolean z3, boolean z4, String str) throws IOException {
        if (SdkVersion.SDK_TYPE == 0) {
            m3804a();
        } else {
            UMServerURL.DEFAULT_URL = UMServerURL.OVERSEA_DEFAULT_URL;
            UMServerURL.SECONDARY_URL = UMServerURL.OVERSEA_SECONDARY_URL;
            m3805b();
        }
        byte[] bArrM3810a = null;
        int i4 = 0;
        while (true) {
            String[] strArr = AnalyticsConstants.APPLOG_URL_LIST;
            if (i4 >= strArr.length) {
                break;
            }
            String str2 = strArr[i4];
            if (z4) {
                m3807d();
            } else {
                m3806c();
            }
            bArrM3810a = m3810a(bArr, str2 + File.separator + str);
            if (bArrM3810a != null) {
                InterfaceC3495b interfaceC3495b = this.f2846d;
                if (interfaceC3495b != null) {
                    interfaceC3495b.onRequestSucceed(z3);
                }
            } else {
                InterfaceC3495b interfaceC3495b2 = this.f2846d;
                if (interfaceC3495b2 != null) {
                    interfaceC3495b2.onRequestFailed();
                }
                i4++;
            }
        }
        return bArrM3810a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0179: IF  (r6 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:87:0x0185, block:B:82:0x0179 */
    /* renamed from: a */
    public byte[] m3810a(byte[] bArr, String str) throws IOException {
        HttpsURLConnection httpsURLConnection;
        OutputStream outputStream;
        OutputStream outputStream2;
        boolean z3;
        try {
            try {
                InterfaceC3495b interfaceC3495b = this.f2846d;
                if (interfaceC3495b != null) {
                    interfaceC3495b.onRequestStart();
                }
                if (m3808e()) {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(this.f2843a, this.f2844b)));
                } else {
                    httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
                }
                try {
                    z3 = true;
                    if (!f2840e) {
                        httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, new SecureRandom());
                        httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                        f2840e = true;
                    }
                    httpsURLConnection.setRequestProperty("X-Umeng-UTC", String.valueOf(System.currentTimeMillis()));
                    httpsURLConnection.setRequestProperty("X-Umeng-Sdk", C3494a.m3793a(this.f2845c).m3798b());
                    httpsURLConnection.setRequestProperty("Content-Type", C3494a.m3793a(this.f2845c).m3796a());
                    httpsURLConnection.setRequestProperty("Msg-Type", "envelope/json");
                    httpsURLConnection.setRequestProperty("X-Umeng-Pro-Ver", "1.0.0");
                    httpsURLConnection.setConnectTimeout(30000);
                    httpsURLConnection.setReadTimeout(30000);
                    httpsURLConnection.setRequestMethod("POST");
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setUseCaches(false);
                    outputStream = httpsURLConnection.getOutputStream();
                } catch (UnknownHostException unused) {
                    outputStream = null;
                } catch (SSLHandshakeException unused2) {
                    outputStream = null;
                } catch (Throwable unused3) {
                    outputStream = null;
                }
            } catch (Throwable th) {
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (Exception e4) {
                        UMCrashManager.reportCrash(this.f2845c, e4);
                    }
                }
                if (str == 0) {
                    throw th;
                }
                try {
                    str.getInputStream().close();
                } catch (IOException unused4) {
                }
                str.disconnect();
                throw th;
            }
        } catch (UnknownHostException unused5) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (SSLHandshakeException unused6) {
            httpsURLConnection = null;
            outputStream = null;
        } catch (Throwable unused7) {
            httpsURLConnection = null;
            outputStream = null;
        }
        try {
            outputStream.write(bArr);
            outputStream.flush();
            httpsURLConnection.connect();
            InterfaceC3495b interfaceC3495b2 = this.f2846d;
            if (interfaceC3495b2 != null) {
                interfaceC3495b2.onRequestEnd();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            String headerField = httpsURLConnection.getHeaderField("Content-Type");
            if (TextUtils.isEmpty(headerField) || !headerField.equalsIgnoreCase("application/thrift")) {
                z3 = false;
            }
            String str2 = AnalyticsConstants.f2725OS;
            if (responseCode == 200 && z3) {
                InputStream inputStream = httpsURLConnection.getInputStream();
                try {
                    byte[] streamToByteArray = HelperUtils.readStreamToByteArray(inputStream);
                    try {
                        outputStream.close();
                    } catch (Exception e5) {
                        UMCrashManager.reportCrash(this.f2845c, e5);
                    }
                    try {
                        httpsURLConnection.getInputStream().close();
                    } catch (IOException unused8) {
                    }
                    httpsURLConnection.disconnect();
                    return streamToByteArray;
                } finally {
                    HelperUtils.safeClose(inputStream);
                }
            }
            try {
                outputStream.close();
            } catch (Exception e6) {
                UMCrashManager.reportCrash(this.f2845c, e6);
            }
            try {
                httpsURLConnection.getInputStream().close();
            } catch (IOException unused9) {
            }
            httpsURLConnection.disconnect();
            return null;
        } catch (UnknownHostException unused10) {
            UMLog.m3426aq("A_10200", 2, "\\|");
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e7) {
                    UMCrashManager.reportCrash(this.f2845c, e7);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused11) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        } catch (SSLHandshakeException unused12) {
            UMLog.m3426aq("A_10201", 2, "\\|");
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e8) {
                    UMCrashManager.reportCrash(this.f2845c, e8);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused13) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        } catch (Throwable unused14) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception e9) {
                    UMCrashManager.reportCrash(this.f2845c, e9);
                }
            }
            if (httpsURLConnection != null) {
                try {
                    httpsURLConnection.getInputStream().close();
                } catch (IOException unused15) {
                }
                httpsURLConnection.disconnect();
            }
            return null;
        }
    }
}
