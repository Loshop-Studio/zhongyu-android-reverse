package com.tencent.smtt.sdk;

import android.R;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.net.http.SslCertificate;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebChromeClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebSettingsExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.sdk.TbsDownloadConfig;
import com.tencent.smtt.sdk.p058a.C6772b;
import com.tencent.smtt.utils.Apn;
import com.tencent.smtt.utils.C6848e;
import com.tencent.smtt.utils.C6854k;
import com.tencent.smtt.utils.C6865v;
import com.tencent.smtt.utils.C6868y;
import com.tencent.smtt.utils.TbsLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public class WebView extends FrameLayout implements View.OnLongClickListener {
    public static final int GETPVERROR = -1;
    public static final int NIGHT_MODE_COLOR = -16777216;
    public static final int NORMAL_MODE_ALPHA = 255;
    public static final String SCHEME_GEO = "geo:0,0?q=";
    public static final String SCHEME_MAILTO = "mailto:";
    public static final String SCHEME_TEL = "tel:";

    /* renamed from: A */
    private Object f6704A;

    /* renamed from: B */
    private View.OnLongClickListener f6705B;

    /* renamed from: a */
    int f6706a;

    /* renamed from: b */
    private final String f6707b;

    /* renamed from: e */
    private boolean f6708e;

    /* renamed from: f */
    private IX5WebViewBase f6709f;

    /* renamed from: g */
    private C6769b f6710g;

    /* renamed from: h */
    private WebSettings f6711h;

    /* renamed from: i */
    private Context f6712i;

    /* renamed from: k */
    private boolean f6713k;

    /* renamed from: l */
    private C6784aj f6714l;

    /* renamed from: m */
    private boolean f6715m;
    public WebViewCallbackClient mWebViewCallbackClient;

    /* renamed from: q */
    private WebViewClient f6716q;

    /* renamed from: r */
    private WebChromeClient f6717r;

    /* renamed from: t */
    private final int f6718t;

    /* renamed from: u */
    private final int f6719u;

    /* renamed from: v */
    private final int f6720v;

    /* renamed from: w */
    private final String f6721w;

    /* renamed from: x */
    private final String f6722x;

    /* renamed from: c */
    private static final Lock f6695c = new ReentrantLock();

    /* renamed from: d */
    private static OutputStream f6696d = null;

    /* renamed from: j */
    private static Context f6697j = null;

    /* renamed from: n */
    private static BroadcastReceiver f6698n = null;

    /* renamed from: o */
    private static C6868y f6699o = null;

    /* renamed from: p */
    private static Method f6700p = null;

    /* renamed from: s */
    private static String f6701s = null;
    public static boolean mSysWebviewCreated = false;

    /* renamed from: y */
    private static Paint f6702y = null;

    /* renamed from: z */
    private static boolean f6703z = true;
    public static int NIGHT_MODE_ALPHA = 153;

    public static class HitTestResult {

        @Deprecated
        public static final int ANCHOR_TYPE = 1;
        public static final int EDIT_TEXT_TYPE = 9;
        public static final int EMAIL_TYPE = 4;
        public static final int GEO_TYPE = 3;

        @Deprecated
        public static final int IMAGE_ANCHOR_TYPE = 6;
        public static final int IMAGE_TYPE = 5;
        public static final int PHONE_TYPE = 2;
        public static final int SRC_ANCHOR_TYPE = 7;
        public static final int SRC_IMAGE_ANCHOR_TYPE = 8;
        public static final int UNKNOWN_TYPE = 0;

        /* renamed from: a */
        private IX5WebViewBase.HitTestResult f6723a;

        /* renamed from: b */
        private WebView.HitTestResult f6724b;

        public HitTestResult() {
            this.f6723a = null;
            this.f6724b = null;
        }

        public String getExtra() {
            IX5WebViewBase.HitTestResult hitTestResult = this.f6723a;
            if (hitTestResult != null) {
                return hitTestResult.getExtra();
            }
            WebView.HitTestResult hitTestResult2 = this.f6724b;
            return hitTestResult2 != null ? hitTestResult2.getExtra() : "";
        }

        public int getType() {
            IX5WebViewBase.HitTestResult hitTestResult = this.f6723a;
            if (hitTestResult != null) {
                return hitTestResult.getType();
            }
            WebView.HitTestResult hitTestResult2 = this.f6724b;
            if (hitTestResult2 != null) {
                return hitTestResult2.getType();
            }
            return 0;
        }

        public HitTestResult(WebView.HitTestResult hitTestResult) {
            this.f6723a = null;
            this.f6724b = hitTestResult;
        }

        public HitTestResult(IX5WebViewBase.HitTestResult hitTestResult) {
            this.f6723a = hitTestResult;
            this.f6724b = null;
        }
    }

    public interface PictureListener {
        void onNewPicture(WebView webView, Picture picture);
    }

    public class WebViewTransport {

        /* renamed from: b */
        private WebView f6726b;

        public WebViewTransport() {
        }

        public synchronized WebView getWebView() {
            return this.f6726b;
        }

        public synchronized void setWebView(WebView webView) {
            this.f6726b = webView;
        }
    }

    /* renamed from: com.tencent.smtt.sdk.WebView$a */
    public static class C6768a extends BroadcastReceiver {
        private C6768a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                        int apnType = Apn.getApnType(context);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (QbSdk.f6579h) {
                            try {
                                if (QbSdk.f6576e) {
                                    QbSdk.f6578g += jCurrentTimeMillis - QbSdk.f6577f;
                                }
                                QbSdk.f6577f = jCurrentTimeMillis;
                            } finally {
                            }
                        }
                        TbsLog.m6244d("sdkreport", "pv report, SdkEngine.registerConnectivityChangedReceiver QbSdk.sWifiConnectTime=" + QbSdk.f6578g + " apnType=" + apnType);
                        QbSdk.f6576e = apnType == 3;
                    }
                } catch (Throwable unused) {
                }
            }
        }

        public /* synthetic */ C6768a(C6809bh c6809bh) {
            this();
        }
    }

    /* renamed from: com.tencent.smtt.sdk.WebView$b */
    public class C6769b extends android.webkit.WebView {
        public C6769b(WebView webView, Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public void m5970a() {
            super.computeScroll();
        }

        /* renamed from: b */
        public boolean m5975b(MotionEvent motionEvent) {
            return super.dispatchTouchEvent(motionEvent);
        }

        /* renamed from: c */
        public boolean m5976c(MotionEvent motionEvent) {
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        public void computeScroll() {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.computeScroll(this);
            } else {
                super.computeScroll();
            }
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void dispatchDraw(Canvas canvas) {
            try {
                super.dispatchDraw(canvas);
                if (WebView.f6703z || WebView.f6702y == null) {
                    return;
                }
                canvas.save();
                canvas.drawPaint(WebView.f6702y);
                canvas.restore();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.dispatchTouchEvent(motionEvent, this) : super.dispatchTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView
        public android.webkit.WebSettings getSettings() {
            try {
                return super.getSettings();
            } catch (Exception e10) {
                e10.printStackTrace();
                return null;
            }
        }

        @Override // android.view.View
        public void invalidate() {
            super.invalidate();
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.invalidate();
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.onInterceptTouchEvent(motionEvent, this) : super.onInterceptTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.View
        @TargetApi(9)
        public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onOverScrolled(i10, i11, z10, z11, this);
            } else {
                super.onOverScrolled(i10, i11, z10, z11);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(int i10, int i11, int i12, int i13) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                webViewCallbackClient.onScrollChanged(i10, i11, i12, i13, this);
            } else {
                super.onScrollChanged(i10, i11, i12, i13);
                WebView.this.onScrollChanged(i10, i11, i12, i13);
            }
        }

        @Override // android.webkit.WebView, android.view.View
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!hasFocus()) {
                requestFocus();
            }
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            if (webViewCallbackClient != null) {
                return webViewCallbackClient.onTouchEvent(motionEvent, this);
            }
            try {
                return super.onTouchEvent(motionEvent);
            } catch (Exception e10) {
                e10.printStackTrace();
                return false;
            }
        }

        @Override // android.view.View
        @TargetApi(9)
        public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
            WebViewCallbackClient webViewCallbackClient = WebView.this.mWebViewCallbackClient;
            return webViewCallbackClient != null ? webViewCallbackClient.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10, this) : super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
        }

        @Override // android.webkit.WebView, android.view.View
        public void setOverScrollMode(int i10) {
            try {
                super.setOverScrollMode(i10);
            } catch (Exception unused) {
            }
        }

        public C6769b(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
            super(context, attributeSet);
            if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
                return;
            }
            CookieSyncManager.createInstance(WebView.this.f6712i).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, null)).getLooper().getThread().setUncaughtExceptionHandler(new C6828m());
                WebView.mSysWebviewCreated = true;
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public void m5971a(int i10, int i11, int i12, int i13) {
            super.onScrollChanged(i10, i11, i12, i13);
        }

        @TargetApi(9)
        /* renamed from: a */
        public void m5972a(int i10, int i11, boolean z10, boolean z11) {
            super.onOverScrolled(i10, i11, z10, z11);
        }

        @TargetApi(9)
        /* renamed from: a */
        public boolean m5973a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
            return super.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10);
        }

        /* renamed from: a */
        public boolean m5974a(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }
    }

    public WebView(Context context) {
        this(context, null);
    }

    /* renamed from: c */
    public static void m5956c() {
        new C6815bn().start();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.String] */
    /* renamed from: d */
    private int m5958d(Context context) throws Throwable {
        FileLock fileLockM6301a;
        StringBuilder sb;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        File file;
        ?? r62;
        String property;
        FileOutputStream fileOutputStreamM6316b = C6854k.m6316b(context, true, "tbslock.txt");
        if (fileOutputStreamM6316b == null || (fileLockM6301a = C6854k.m6301a(context, fileOutputStreamM6316b)) == null) {
            return -1;
        }
        Lock lock = f6695c;
        if (!lock.tryLock()) {
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            return -1;
        }
        FileInputStream fileInputStream3 = null;
        fileInputStream3 = null;
        FileInputStream fileInputStream4 = null;
        try {
            try {
                file = new File(context.getDir("tbs", 0) + File.separator + "core_private", "pv.db");
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        if (!file.exists()) {
            lock.unlock();
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            return -1;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream5 = new FileInputStream(file);
        try {
            properties.load(fileInputStream5);
            fileInputStream5.close();
            r62 = "PV";
            property = properties.getProperty("PV");
        } catch (Exception e11) {
            e = e11;
            fileInputStream4 = fileInputStream5;
            TbsLog.m6246e("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + e.toString());
            fileInputStream2 = fileInputStream4;
            if (fileInputStream4 != null) {
                try {
                    fileInputStream4.close();
                    fileInputStream2 = fileInputStream4;
                } catch (IOException e12) {
                    e = e12;
                    sb = new StringBuilder();
                    fileInputStream = fileInputStream4;
                    sb.append("TbsInstaller--getTbsCorePV IOException=");
                    sb.append(e.toString());
                    TbsLog.m6246e("getTbsCorePV", sb.toString());
                    fileInputStream2 = fileInputStream;
                    f6695c.unlock();
                    fileInputStream3 = fileInputStream2;
                    C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
                    return -1;
                }
            }
            f6695c.unlock();
            fileInputStream3 = fileInputStream2;
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            return -1;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream3 = fileInputStream5;
            if (fileInputStream3 != null) {
                try {
                    fileInputStream3.close();
                } catch (IOException e13) {
                    TbsLog.m6246e("getTbsCorePV", "TbsInstaller--getTbsCorePV IOException=" + e13.toString());
                }
            }
            f6695c.unlock();
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            throw th;
        }
        if (property != null) {
            int i10 = Integer.parseInt(property);
            try {
                fileInputStream5.close();
            } catch (IOException e14) {
                TbsLog.m6246e("getTbsCorePV", "TbsInstaller--getTbsCorePV IOException=" + e14.toString());
            }
            f6695c.unlock();
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            return i10;
        }
        try {
            fileInputStream5.close();
            fileInputStream2 = r62;
        } catch (IOException e15) {
            e = e15;
            sb = new StringBuilder();
            fileInputStream = r62;
            sb.append("TbsInstaller--getTbsCorePV IOException=");
            sb.append(e.toString());
            TbsLog.m6246e("getTbsCorePV", sb.toString());
            fileInputStream2 = fileInputStream;
            f6695c.unlock();
            fileInputStream3 = fileInputStream2;
            C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
            return -1;
        }
        f6695c.unlock();
        fileInputStream3 = fileInputStream2;
        C6854k.m6304a(fileLockM6301a, fileOutputStreamM6316b);
        return -1;
    }

    @Deprecated
    public static void disablePlatformNotifications() {
        if (C6816bo.m6152b().m6157c()) {
            return;
        }
        C6865v.m6376a("android.webkit.WebView", "disablePlatformNotifications");
    }

    /* renamed from: e */
    private void m5960e(Context context) {
        try {
            File file = new File(context.getDir("tbs", 0) + File.separator + "core_private", "pv.db");
            if (file.exists()) {
                file.delete();
            }
        } catch (Exception e10) {
            TbsLog.m6248i("getTbsCorePV", "TbsInstaller--getTbsCorePV Exception=" + e10.toString());
        }
    }

    @Deprecated
    public static void enablePlatformNotifications() {
        if (C6816bo.m6152b().m6157c()) {
            return;
        }
        C6865v.m6376a("android.webkit.WebView", "enablePlatformNotifications");
    }

    public static String findAddress(String str) {
        if (C6816bo.m6152b().m6157c()) {
            return null;
        }
        return android.webkit.WebView.findAddress(str);
    }

    public static String getCrashExtraMessage(Context context) {
        Map<String, Object> map;
        if (context == null) {
            return "";
        }
        String str = "tbs_core_version:" + QbSdk.getTbsVersion(context) + ";tbs_sdk_version:43500;";
        StringBuilder sb = new StringBuilder();
        sb.append(C6827l.m6214a(true).m6225e());
        sb.append(SignParameters.NEW_LINE);
        sb.append(str);
        if (!TbsShareManager.isThirdPartyApp(context) && (map = QbSdk.f6583l) != null && map.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) && QbSdk.f6583l.containsKey(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY)) {
            String str2 = "weapp_id:" + QbSdk.f6583l.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_ID_KEY) + ";" + TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY + ":" + QbSdk.f6583l.get(TbsCoreSettings.TBS_SETTINGS_WEAPP_NAME_KEY) + ";";
            sb.append(SignParameters.NEW_LINE);
            sb.append(str2);
        }
        return sb.length() > 8192 ? sb.substring(sb.length() - 8192) : sb.toString();
    }

    public static PackageInfo getCurrentWebViewPackage() {
        if (C6816bo.m6152b().m6157c() || Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            return (PackageInfo) C6865v.m6376a("android.webkit.WebView", "getCurrentWebViewPackage");
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static synchronized Object getPluginList() {
        if (C6816bo.m6152b().m6157c()) {
            return null;
        }
        return C6865v.m6376a("android.webkit.WebView", "getPluginList");
    }

    public static int getTbsCoreVersion(Context context) {
        return QbSdk.getTbsVersion(context);
    }

    public static boolean getTbsNeedReboot() {
        m5956c();
        return C6827l.m6214a(true).m6226f();
    }

    public static int getTbsSDKVersion(Context context) {
        return 43500;
    }

    /* renamed from: h */
    private long m5964h() {
        long j10;
        synchronized (QbSdk.f6579h) {
            try {
                if (QbSdk.f6576e) {
                    QbSdk.f6578g += System.currentTimeMillis() - QbSdk.f6577f;
                    TbsLog.m6244d("sdkreport", "pv report, WebView.getWifiConnectedTime QbSdk.sWifiConnectedTime=" + QbSdk.f6578g);
                }
                j10 = QbSdk.f6578g / 1000;
                QbSdk.f6578g = 0L;
                QbSdk.f6577f = System.currentTimeMillis();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public static synchronized void setSysDayOrNight(boolean z10) {
        int i10;
        Paint paint;
        try {
            if (z10 == f6703z) {
                return;
            }
            f6703z = z10;
            if (f6702y == null) {
                Paint paint2 = new Paint();
                f6702y = paint2;
                paint2.setColor(-16777216);
            }
            if (z10) {
                i10 = 255;
                if (f6702y.getAlpha() != 255) {
                    paint = f6702y;
                    paint.setAlpha(i10);
                }
            } else {
                int alpha = f6702y.getAlpha();
                i10 = NIGHT_MODE_ALPHA;
                if (alpha != i10) {
                    paint = f6702y;
                    paint.setAlpha(i10);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public static void setWebContentsDebuggingEnabled(boolean z10) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        try {
            Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("setWebContentsDebuggingEnabled", Boolean.TYPE);
            f6700p = declaredMethod;
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                f6700p.invoke(null, Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            TbsLog.m6246e("QbSdk", "Exception:" + e10.getStackTrace());
            e10.printStackTrace();
        }
    }

    public void addJavascriptInterface(Object obj, String str) {
        if (this.f6708e) {
            this.f6709f.addJavascriptInterface(obj, str);
        } else {
            this.f6710g.addJavascriptInterface(obj, str);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (!this.f6708e) {
            this.f6710g.addView(view);
            return;
        }
        View view2 = this.f6709f.getView();
        try {
            Method methodM6377a = C6865v.m6377a(view2, "addView", View.class);
            methodM6377a.setAccessible(true);
            methodM6377a.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public IX5WebViewBase m5969b() {
        return this.f6709f;
    }

    public boolean canGoBack() {
        return !this.f6708e ? this.f6710g.canGoBack() : this.f6709f.canGoBack();
    }

    public boolean canGoBackOrForward(int i10) {
        return !this.f6708e ? this.f6710g.canGoBackOrForward(i10) : this.f6709f.canGoBackOrForward(i10);
    }

    public boolean canGoForward() {
        return !this.f6708e ? this.f6710g.canGoForward() : this.f6709f.canGoForward();
    }

    @Deprecated
    public boolean canZoomIn() {
        if (this.f6708e) {
            return this.f6709f.canZoomIn();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "canZoomIn");
        if (objM6374a == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @Deprecated
    public boolean canZoomOut() {
        if (this.f6708e) {
            return this.f6709f.canZoomOut();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "canZoomOut");
        if (objM6374a == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @Deprecated
    public Picture capturePicture() {
        if (this.f6708e) {
            return this.f6709f.capturePicture();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "capturePicture");
        if (objM6374a == null) {
            return null;
        }
        return (Picture) objM6374a;
    }

    public void clearCache(boolean z10) {
        if (this.f6708e) {
            this.f6709f.clearCache(z10);
        } else {
            this.f6710g.clearCache(z10);
        }
    }

    public void clearFormData() {
        if (this.f6708e) {
            this.f6709f.clearFormData();
        } else {
            this.f6710g.clearFormData();
        }
    }

    public void clearHistory() {
        if (this.f6708e) {
            this.f6709f.clearHistory();
        } else {
            this.f6710g.clearHistory();
        }
    }

    @TargetApi(3)
    public void clearMatches() {
        if (this.f6708e) {
            this.f6709f.clearMatches();
        } else {
            this.f6710g.clearMatches();
        }
    }

    public void clearSslPreferences() {
        if (this.f6708e) {
            this.f6709f.clearSslPreferences();
        } else {
            this.f6710g.clearSslPreferences();
        }
    }

    @Deprecated
    public void clearView() {
        if (this.f6708e) {
            this.f6709f.clearView();
        } else {
            C6865v.m6374a(this.f6710g, "clearView");
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() throws SecurityException {
        Integer num;
        try {
            if (this.f6708e) {
                Method methodM6377a = C6865v.m6377a(this.f6709f.getView(), "computeHorizontalScrollExtent", new Class[0]);
                methodM6377a.setAccessible(true);
                num = (Integer) methodM6377a.invoke(this.f6709f.getView(), null);
            } else {
                Method methodM6377a2 = C6865v.m6377a(this.f6710g, "computeHorizontalScrollExtent", new Class[0]);
                methodM6377a2.setAccessible(true);
                num = (Integer) methodM6377a2.invoke(this.f6710g, null);
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() throws SecurityException {
        Integer num;
        try {
            if (this.f6708e) {
                Method methodM6377a = C6865v.m6377a(this.f6709f.getView(), "computeHorizontalScrollOffset", new Class[0]);
                methodM6377a.setAccessible(true);
                num = (Integer) methodM6377a.invoke(this.f6709f.getView(), null);
            } else {
                Method methodM6377a2 = C6865v.m6377a(this.f6710g, "computeHorizontalScrollOffset", new Class[0]);
                methodM6377a2.setAccessible(true);
                num = (Integer) methodM6377a2.invoke(this.f6710g, null);
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() throws SecurityException {
        Integer num;
        try {
            if (this.f6708e) {
                num = (Integer) C6865v.m6375a(this.f6709f.getView(), "computeHorizontalScrollRange", (Class<?>[]) new Class[0], new Object[0]);
            } else {
                Method methodM6377a = C6865v.m6377a(this.f6710g, "computeHorizontalScrollRange", new Class[0]);
                methodM6377a.setAccessible(true);
                num = (Integer) methodM6377a.invoke(this.f6710g, null);
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f6708e) {
            this.f6709f.computeScroll();
        } else {
            this.f6710g.computeScroll();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() throws SecurityException {
        Integer num;
        try {
            if (this.f6708e) {
                num = (Integer) C6865v.m6375a(this.f6709f.getView(), "computeVerticalScrollRange", (Class<?>[]) new Class[0], new Object[0]);
            } else {
                Method methodM6377a = C6865v.m6377a(this.f6710g, "computeVerticalScrollRange", new Class[0]);
                methodM6377a.setAccessible(true);
                num = (Integer) methodM6377a.invoke(this.f6710g, null);
            }
            return num.intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return -1;
        }
    }

    public WebBackForwardList copyBackForwardList() {
        return this.f6708e ? WebBackForwardList.m5943a(this.f6709f.copyBackForwardList()) : WebBackForwardList.m5942a(this.f6710g.copyBackForwardList());
    }

    public Object createPrintDocumentAdapter(String str) {
        if (!this.f6708e) {
            return C6865v.m6375a(this.f6710g, "createPrintDocumentAdapter", (Class<?>[]) new Class[]{String.class}, str);
        }
        try {
            return this.f6709f.createPrintDocumentAdapter(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public void customDiskCachePathEnabled(boolean z10, String str) {
        if (!this.f6708e || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("enabled", z10);
        bundle.putString("path", str);
        getX5WebViewExtension().invokeMiscMethod("customDiskCachePathEnabled", bundle);
    }

    public void destroy() throws Throwable {
        Bundle sdkQBStatisticsInfo;
        if (!this.f6713k && this.f6706a != 0) {
            this.f6713k = true;
            String string = "";
            String string2 = "";
            String string3 = "";
            if (this.f6708e && (sdkQBStatisticsInfo = this.f6709f.getX5WebViewExtension().getSdkQBStatisticsInfo()) != null) {
                string = sdkQBStatisticsInfo.getString("guid");
                string2 = sdkQBStatisticsInfo.getString("qua2");
                string3 = sdkQBStatisticsInfo.getString("lc");
            }
            String str = string;
            String str2 = string2;
            String str3 = string3;
            if (TbsConfig.APP_QZONE.equals(this.f6712i.getApplicationInfo().packageName)) {
                int iM5958d = m5958d(this.f6712i);
                if (iM5958d == -1) {
                    iM5958d = this.f6706a;
                }
                this.f6706a = iM5958d;
                m5960e(this.f6712i);
            }
            C6772b.m5991a(this.f6712i, str, str2, str3, this.f6706a, this.f6708e, m5964h());
            this.f6706a = 0;
            this.f6713k = false;
        }
        if (this.f6708e) {
            this.f6709f.destroy();
        } else {
            try {
                Class<?> cls = Class.forName("android.webkit.WebViewClassic");
                Method method = cls.getMethod("fromWebView", android.webkit.WebView.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, this.f6710g);
                if (objInvoke != null) {
                    Field declaredField = cls.getDeclaredField("mListBoxDialog");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(objInvoke);
                    if (obj != null) {
                        Dialog dialog = (Dialog) obj;
                        dialog.setOnCancelListener(null);
                        Class<?> cls2 = Class.forName("android.app.Dialog");
                        Field declaredField2 = cls2.getDeclaredField("CANCEL");
                        declaredField2.setAccessible(true);
                        int iIntValue = ((Integer) declaredField2.get(dialog)).intValue();
                        Field declaredField3 = cls2.getDeclaredField("mListenersHandler");
                        declaredField3.setAccessible(true);
                        ((Handler) declaredField3.get(dialog)).removeMessages(iIntValue);
                    }
                }
            } catch (Exception unused) {
            }
            this.f6710g.destroy();
            try {
                Field declaredField4 = Class.forName("android.webkit.BrowserFrame").getDeclaredField("sConfigCallback");
                declaredField4.setAccessible(true);
                ComponentCallbacks componentCallbacks = (ComponentCallbacks) declaredField4.get(null);
                if (componentCallbacks != null) {
                    declaredField4.set(null, null);
                    Field declaredField5 = Class.forName("android.view.ViewRoot").getDeclaredField("sConfigCallbacks");
                    declaredField5.setAccessible(true);
                    Object obj2 = declaredField5.get(null);
                    if (obj2 != null) {
                        List list = (List) obj2;
                        synchronized (list) {
                            list.remove(componentCallbacks);
                        }
                    }
                }
            } catch (Exception unused2) {
            }
        }
        TbsLog.m6248i("WebView", "X5 GUID = " + QbSdk.m5845b());
    }

    public void documentHasImages(Message message) {
        if (this.f6708e) {
            this.f6709f.documentHasImages(message);
        } else {
            this.f6710g.documentHasImages(message);
        }
    }

    public void dumpViewHierarchyWithProperties(BufferedWriter bufferedWriter, int i10) {
        if (this.f6708e) {
            this.f6709f.dumpViewHierarchyWithProperties(bufferedWriter, i10);
        } else {
            C6865v.m6375a(this.f6710g, "dumpViewHierarchyWithProperties", (Class<?>[]) new Class[]{BufferedWriter.class, Integer.TYPE}, bufferedWriter, Integer.valueOf(i10));
        }
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (!this.f6708e) {
            try {
                Method declaredMethod = Class.forName("android.webkit.WebView").getDeclaredMethod("evaluateJavascript", String.class, android.webkit.ValueCallback.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.f6710g, str, valueCallback);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        try {
            Method methodM6377a = C6865v.m6377a(this.f6709f.getView(), "evaluateJavascript", String.class, android.webkit.ValueCallback.class);
            methodM6377a.setAccessible(true);
            methodM6377a.invoke(this.f6709f.getView(), str, valueCallback);
        } catch (Exception e11) {
            e11.printStackTrace();
            loadUrl(str);
        }
    }

    @Deprecated
    public int findAll(String str) {
        if (this.f6708e) {
            return this.f6709f.findAll(str);
        }
        Object objM6375a = C6865v.m6375a(this.f6710g, "findAll", (Class<?>[]) new Class[]{String.class}, str);
        if (objM6375a == null) {
            return 0;
        }
        return ((Integer) objM6375a).intValue();
    }

    @TargetApi(16)
    public void findAllAsync(String str) {
        if (this.f6708e) {
            this.f6709f.findAllAsync(str);
        } else {
            C6865v.m6375a(this.f6710g, "findAllAsync", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public View findHierarchyView(String str, int i10) {
        return !this.f6708e ? (View) C6865v.m6375a(this.f6710g, "findHierarchyView", (Class<?>[]) new Class[]{String.class, Integer.TYPE}, str, Integer.valueOf(i10)) : this.f6709f.findHierarchyView(str, i10);
    }

    @TargetApi(3)
    public void findNext(boolean z10) {
        if (this.f6708e) {
            this.f6709f.findNext(z10);
        } else {
            this.f6710g.findNext(z10);
        }
    }

    public void flingScroll(int i10, int i11) {
        if (this.f6708e) {
            this.f6709f.flingScroll(i10, i11);
        } else {
            this.f6710g.flingScroll(i10, i11);
        }
    }

    @Deprecated
    public void freeMemory() {
        if (this.f6708e) {
            this.f6709f.freeMemory();
        } else {
            C6865v.m6374a(this.f6710g, "freeMemory");
        }
    }

    public SslCertificate getCertificate() {
        return !this.f6708e ? this.f6710g.getCertificate() : this.f6709f.getCertificate();
    }

    public int getContentHeight() {
        return !this.f6708e ? this.f6710g.getContentHeight() : this.f6709f.getContentHeight();
    }

    public int getContentWidth() {
        if (this.f6708e) {
            return this.f6709f.getContentWidth();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "getContentWidth");
        if (objM6374a == null) {
            return 0;
        }
        return ((Integer) objM6374a).intValue();
    }

    public Bitmap getFavicon() {
        return !this.f6708e ? this.f6710g.getFavicon() : this.f6709f.getFavicon();
    }

    public HitTestResult getHitTestResult() {
        return !this.f6708e ? new HitTestResult(this.f6710g.getHitTestResult()) : new HitTestResult(this.f6709f.getHitTestResult());
    }

    public String[] getHttpAuthUsernamePassword(String str, String str2) {
        return !this.f6708e ? this.f6710g.getHttpAuthUsernamePassword(str, str2) : this.f6709f.getHttpAuthUsernamePassword(str, str2);
    }

    @TargetApi(3)
    public String getOriginalUrl() {
        return !this.f6708e ? this.f6710g.getOriginalUrl() : this.f6709f.getOriginalUrl();
    }

    public int getProgress() {
        return !this.f6708e ? this.f6710g.getProgress() : this.f6709f.getProgress();
    }

    public boolean getRendererPriorityWaivedWhenNotVisible() {
        Object objM6374a;
        try {
            if (this.f6708e || Build.VERSION.SDK_INT < 26 || (objM6374a = C6865v.m6374a(this.f6710g, "getRendererPriorityWaivedWhenNotVisible")) == null) {
                return false;
            }
            return ((Boolean) objM6374a).booleanValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    public int getRendererRequestedPriority() {
        Object objM6374a;
        try {
            if (this.f6708e || Build.VERSION.SDK_INT < 26 || (objM6374a = C6865v.m6374a(this.f6710g, "getRendererRequestedPriority")) == null) {
                return 0;
            }
            return ((Integer) objM6374a).intValue();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Deprecated
    public float getScale() {
        if (this.f6708e) {
            return this.f6709f.getScale();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "getScale");
        if (objM6374a == null) {
            return 0.0f;
        }
        return ((Float) objM6374a).floatValue();
    }

    @Override // android.view.View
    public int getScrollBarDefaultDelayBeforeFade() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarDefaultDelayBeforeFade();
    }

    @Override // android.view.View
    public int getScrollBarFadeDuration() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarFadeDuration();
    }

    @Override // android.view.View
    public int getScrollBarSize() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarSize();
    }

    @Override // android.view.View
    public int getScrollBarStyle() {
        if (getView() == null) {
            return 0;
        }
        return getView().getScrollBarStyle();
    }

    public WebSettings getSettings() {
        WebSettings webSettings = this.f6711h;
        if (webSettings != null) {
            return webSettings;
        }
        WebSettings webSettings2 = this.f6708e ? new WebSettings(this.f6709f.getSettings()) : new WebSettings(this.f6710g.getSettings());
        this.f6711h = webSettings2;
        return webSettings2;
    }

    public IX5WebSettingsExtension getSettingsExtension() {
        if (this.f6708e) {
            return this.f6709f.getX5WebViewExtension().getSettingsExtension();
        }
        return null;
    }

    public int getSysNightModeAlpha() {
        return NIGHT_MODE_ALPHA;
    }

    public String getTitle() {
        return !this.f6708e ? this.f6710g.getTitle() : this.f6709f.getTitle();
    }

    public String getUrl() {
        return !this.f6708e ? this.f6710g.getUrl() : this.f6709f.getUrl();
    }

    public View getView() {
        return !this.f6708e ? this.f6710g : this.f6709f.getView();
    }

    public int getVisibleTitleHeight() {
        if (this.f6708e) {
            return this.f6709f.getVisibleTitleHeight();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "getVisibleTitleHeight");
        if (objM6374a == null) {
            return 0;
        }
        return ((Integer) objM6374a).intValue();
    }

    public WebChromeClient getWebChromeClient() {
        return this.f6717r;
    }

    public IX5WebChromeClientExtension getWebChromeClientExtension() {
        if (this.f6708e) {
            return this.f6709f.getX5WebViewExtension().getWebChromeClientExtension();
        }
        return null;
    }

    public int getWebScrollX() {
        return (this.f6708e ? this.f6709f.getView() : this.f6710g).getScrollX();
    }

    public int getWebScrollY() {
        return (this.f6708e ? this.f6709f.getView() : this.f6710g).getScrollY();
    }

    public WebViewClient getWebViewClient() {
        return this.f6716q;
    }

    public IX5WebViewClientExtension getWebViewClientExtension() {
        if (this.f6708e) {
            return this.f6709f.getX5WebViewExtension().getWebViewClientExtension();
        }
        return null;
    }

    public IX5WebViewExtension getX5WebViewExtension() {
        if (this.f6708e) {
            return this.f6709f.getX5WebViewExtension();
        }
        return null;
    }

    @Deprecated
    public View getZoomControls() {
        return !this.f6708e ? (View) C6865v.m6374a(this.f6710g, "getZoomControls") : this.f6709f.getZoomControls();
    }

    public void goBack() {
        if (this.f6708e) {
            this.f6709f.goBack();
        } else {
            this.f6710g.goBack();
        }
    }

    public void goBackOrForward(int i10) {
        if (this.f6708e) {
            this.f6709f.goBackOrForward(i10);
        } else {
            this.f6710g.goBackOrForward(i10);
        }
    }

    public void goForward() {
        if (this.f6708e) {
            this.f6709f.goForward();
        } else {
            this.f6710g.goForward();
        }
    }

    public void invokeZoomPicker() {
        if (this.f6708e) {
            this.f6709f.invokeZoomPicker();
        } else {
            this.f6710g.invokeZoomPicker();
        }
    }

    public boolean isDayMode() {
        return f6703z;
    }

    public boolean isPrivateBrowsingEnabled() {
        if (this.f6708e) {
            return this.f6709f.isPrivateBrowsingEnable();
        }
        Object objM6374a = C6865v.m6374a(this.f6710g, "isPrivateBrowsingEnabled");
        if (objM6374a == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    public void loadData(String str, String str2, String str3) {
        if (this.f6708e) {
            this.f6709f.loadData(str, str2, str3);
        } else {
            this.f6710g.loadData(str, str2, str3);
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (this.f6708e) {
            this.f6709f.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            this.f6710g.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public void loadUrl(String str) {
        C6784aj c6784aj;
        if (this.f6708e && (c6784aj = this.f6714l) != null) {
            c6784aj.m6064a(this.f6709f.hashCode(), str);
        }
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.f6708e) {
            this.f6709f.loadUrl(str);
        } else {
            this.f6710g.loadUrl(str);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() throws Throwable {
        String str;
        String str2;
        String string;
        Bundle sdkQBStatisticsInfo;
        if (!this.f6713k && this.f6706a != 0) {
            this.f6713k = true;
            if (!this.f6708e || (sdkQBStatisticsInfo = this.f6709f.getX5WebViewExtension().getSdkQBStatisticsInfo()) == null) {
                str = "";
                str2 = str;
                string = str2;
            } else {
                String string2 = sdkQBStatisticsInfo.getString("guid");
                String string3 = sdkQBStatisticsInfo.getString("qua2");
                string = sdkQBStatisticsInfo.getString("lc");
                str = string2;
                str2 = string3;
            }
            if (TbsConfig.APP_QZONE.equals(this.f6712i.getApplicationInfo().packageName)) {
                int iM5958d = m5958d(this.f6712i);
                if (iM5958d == -1) {
                    iM5958d = this.f6706a;
                }
                this.f6706a = iM5958d;
                m5960e(this.f6712i);
            }
            C6772b.m5991a(this.f6712i, str, str2, string, this.f6706a, this.f6708e, m5964h());
            this.f6706a = 0;
            this.f6713k = false;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        View.OnLongClickListener onLongClickListener = this.f6705B;
        if (onLongClickListener == null || !onLongClickListener.onLongClick(view)) {
            return m5953a(view);
        }
        return true;
    }

    public void onPause() {
        if (this.f6708e) {
            this.f6709f.onPause();
        } else {
            C6865v.m6374a(this.f6710g, "onPause");
        }
    }

    public void onResume() {
        if (this.f6708e) {
            this.f6709f.onResume();
        } else {
            C6865v.m6374a(this.f6710g, "onResume");
        }
    }

    @Override // android.view.View
    @TargetApi(11)
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (!m5957c(this.f6712i) || !isHardwareAccelerated() || i10 <= 0 || i11 <= 0) {
            return;
        }
        getLayerType();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) throws Throwable {
        String str;
        String str2;
        String string;
        Bundle sdkQBStatisticsInfo;
        Context context = this.f6712i;
        if (context == null) {
            super.onVisibilityChanged(view, i10);
            return;
        }
        if (f6701s == null) {
            f6701s = context.getApplicationInfo().packageName;
        }
        String str3 = f6701s;
        if (str3 != null && (str3.equals(TbsConfig.APP_WX) || f6701s.equals(TbsConfig.APP_QQ))) {
            super.onVisibilityChanged(view, i10);
            return;
        }
        if (i10 != 0 && !this.f6713k && this.f6706a != 0) {
            this.f6713k = true;
            if (!this.f6708e || (sdkQBStatisticsInfo = this.f6709f.getX5WebViewExtension().getSdkQBStatisticsInfo()) == null) {
                str = "";
                str2 = str;
                string = str2;
            } else {
                String string2 = sdkQBStatisticsInfo.getString("guid");
                String string3 = sdkQBStatisticsInfo.getString("qua2");
                string = sdkQBStatisticsInfo.getString("lc");
                str = string2;
                str2 = string3;
            }
            if (TbsConfig.APP_QZONE.equals(this.f6712i.getApplicationInfo().packageName)) {
                int iM5958d = m5958d(this.f6712i);
                if (iM5958d == -1) {
                    iM5958d = this.f6706a;
                }
                this.f6706a = iM5958d;
                m5960e(this.f6712i);
            }
            C6772b.m5991a(this.f6712i, str, str2, string, this.f6706a, this.f6708e, m5964h());
            this.f6706a = 0;
            this.f6713k = false;
        }
        super.onVisibilityChanged(view, i10);
    }

    public boolean overlayHorizontalScrollbar() {
        return !this.f6708e ? this.f6710g.overlayHorizontalScrollbar() : this.f6709f.overlayHorizontalScrollbar();
    }

    public boolean overlayVerticalScrollbar() {
        return this.f6708e ? this.f6709f.overlayVerticalScrollbar() : this.f6710g.overlayVerticalScrollbar();
    }

    public boolean pageDown(boolean z10) {
        return !this.f6708e ? this.f6710g.pageDown(z10) : this.f6709f.pageDown(z10, -1);
    }

    public boolean pageUp(boolean z10) {
        return !this.f6708e ? this.f6710g.pageUp(z10) : this.f6709f.pageUp(z10, -1);
    }

    public void pauseTimers() {
        if (this.f6708e) {
            this.f6709f.pauseTimers();
        } else {
            this.f6710g.pauseTimers();
        }
    }

    @TargetApi(5)
    public void postUrl(String str, byte[] bArr) {
        if (this.f6708e) {
            this.f6709f.postUrl(str, bArr);
        } else {
            this.f6710g.postUrl(str, bArr);
        }
    }

    @Deprecated
    public void refreshPlugins(boolean z10) {
        if (this.f6708e) {
            this.f6709f.refreshPlugins(z10);
        } else {
            C6865v.m6375a(this.f6710g, "refreshPlugins", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public void reload() {
        if (this.f6708e) {
            this.f6709f.reload();
        } else {
            this.f6710g.reload();
        }
    }

    @TargetApi(11)
    public void removeJavascriptInterface(String str) {
        if (this.f6708e) {
            return;
        }
        C6865v.m6375a(this.f6710g, "removeJavascriptInterface", (Class<?>[]) new Class[]{String.class}, str);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (!this.f6708e) {
            this.f6710g.removeView(view);
            return;
        }
        View view2 = this.f6709f.getView();
        try {
            Method methodM6377a = C6865v.m6377a(view2, "removeView", View.class);
            methodM6377a.setAccessible(true);
            methodM6377a.invoke(view2, view);
        } catch (Throwable unused) {
        }
    }

    public void reportInitPerformance(long j10, int i10, long j11, long j12) {
        C6784aj c6784aj;
        TbsLog.m6248i("sdkreport", "reportInitPerformance initType is " + j10 + " isX5Core is " + this.f6708e + " isPerformanceDataRecorded" + this.f6715m);
        if (!this.f6708e || (c6784aj = this.f6714l) == null) {
            return;
        }
        c6784aj.m6063a("init_type", j10);
        this.f6714l.m6063a("time_oncreate", j11);
        this.f6714l.m6063a("webview_type", i10);
        this.f6714l.m6063a("time_webaccelerator", j12);
        this.f6714l.m6064a(this.f6709f.hashCode(), getUrl());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        if (!this.f6708e) {
            C6769b c6769b = this.f6710g;
            if (view == this) {
                view = c6769b;
            }
            return c6769b.requestChildRectangleOnScreen(view, rect, z10);
        }
        View view2 = this.f6709f.getView();
        if (!(view2 instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        if (view == this) {
            view = view2;
        }
        return viewGroup.requestChildRectangleOnScreen(view, rect, z10);
    }

    public void requestFocusNodeHref(Message message) {
        if (this.f6708e) {
            this.f6709f.requestFocusNodeHref(message);
        } else {
            this.f6710g.requestFocusNodeHref(message);
        }
    }

    public void requestImageRef(Message message) {
        if (this.f6708e) {
            this.f6709f.requestImageRef(message);
        } else {
            this.f6710g.requestImageRef(message);
        }
    }

    @Deprecated
    public boolean restorePicture(Bundle bundle, File file) {
        if (this.f6708e) {
            return this.f6709f.restorePicture(bundle, file);
        }
        Object objM6375a = C6865v.m6375a(this.f6710g, "restorePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (objM6375a == null) {
            return false;
        }
        return ((Boolean) objM6375a).booleanValue();
    }

    public WebBackForwardList restoreState(Bundle bundle) {
        return !this.f6708e ? WebBackForwardList.m5942a(this.f6710g.restoreState(bundle)) : WebBackForwardList.m5943a(this.f6709f.restoreState(bundle));
    }

    public void resumeTimers() {
        if (this.f6708e) {
            this.f6709f.resumeTimers();
        } else {
            this.f6710g.resumeTimers();
        }
    }

    @Deprecated
    public void savePassword(String str, String str2, String str3) {
        if (this.f6708e) {
            this.f6709f.savePassword(str, str2, str3);
        } else {
            C6865v.m6375a(this.f6710g, "savePassword", (Class<?>[]) new Class[]{String.class, String.class, String.class}, str, str2, str3);
        }
    }

    @Deprecated
    public boolean savePicture(Bundle bundle, File file) {
        if (this.f6708e) {
            return this.f6709f.savePicture(bundle, file);
        }
        Object objM6375a = C6865v.m6375a(this.f6710g, "savePicture", (Class<?>[]) new Class[]{Bundle.class, File.class}, bundle, file);
        if (objM6375a == null) {
            return false;
        }
        return ((Boolean) objM6375a).booleanValue();
    }

    public WebBackForwardList saveState(Bundle bundle) {
        return !this.f6708e ? WebBackForwardList.m5942a(this.f6710g.saveState(bundle)) : WebBackForwardList.m5943a(this.f6709f.saveState(bundle));
    }

    @TargetApi(11)
    public void saveWebArchive(String str) {
        if (this.f6708e) {
            this.f6709f.saveWebArchive(str);
        } else {
            C6865v.m6375a(this.f6710g, "saveWebArchive", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public void setARModeEnable(boolean z10) {
        try {
            if (this.f6708e) {
                getSettingsExtension().setARModeEnable(z10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (this.f6708e) {
            this.f6709f.setBackgroundColor(i10);
        } else {
            this.f6710g.setBackgroundColor(i10);
        }
        super.setBackgroundColor(i10);
    }

    @Deprecated
    public void setCertificate(SslCertificate sslCertificate) {
        if (this.f6708e) {
            this.f6709f.setCertificate(sslCertificate);
        } else {
            this.f6710g.setCertificate(sslCertificate);
        }
    }

    public void setDayOrNight(boolean z10) {
        try {
            if (this.f6708e) {
                getSettingsExtension().setDayOrNight(z10);
            }
            setSysDayOrNight(z10);
            getView().postInvalidate();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        boolean z10 = this.f6708e;
        if (z10) {
            this.f6709f.setDownloadListener(new C6801b(this, downloadListener, z10));
        } else {
            this.f6710g.setDownloadListener(new C6812bk(this, downloadListener));
        }
    }

    @TargetApi(16)
    public void setFindListener(IX5WebViewBase.FindListener findListener) {
        if (this.f6708e) {
            this.f6709f.setFindListener(findListener);
        } else {
            this.f6710g.setFindListener(new C6811bj(this, findListener));
        }
    }

    public void setHorizontalScrollbarOverlay(boolean z10) {
        if (this.f6708e) {
            this.f6709f.setHorizontalScrollbarOverlay(z10);
        } else {
            this.f6710g.setHorizontalScrollbarOverlay(z10);
        }
    }

    public void setHttpAuthUsernamePassword(String str, String str2, String str3, String str4) {
        if (this.f6708e) {
            this.f6709f.setHttpAuthUsernamePassword(str, str2, str3, str4);
        } else {
            this.f6710g.setHttpAuthUsernamePassword(str, str2, str3, str4);
        }
    }

    public void setInitialScale(int i10) {
        if (this.f6708e) {
            this.f6709f.setInitialScale(i10);
        } else {
            this.f6710g.setInitialScale(i10);
        }
    }

    @Deprecated
    public void setMapTrackballToArrowKeys(boolean z10) {
        if (this.f6708e) {
            this.f6709f.setMapTrackballToArrowKeys(z10);
        } else {
            C6865v.m6375a(this.f6710g, "setMapTrackballToArrowKeys", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public void setNetworkAvailable(boolean z10) {
        if (this.f6708e) {
            this.f6709f.setNetworkAvailable(z10);
        } else {
            this.f6710g.setNetworkAvailable(z10);
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        if (!this.f6708e) {
            this.f6710g.setOnLongClickListener(onLongClickListener);
            return;
        }
        View view = this.f6709f.getView();
        try {
            if (this.f6704A == null) {
                Method methodM6377a = C6865v.m6377a(view, "getListenerInfo", new Class[0]);
                methodM6377a.setAccessible(true);
                Object objInvoke = methodM6377a.invoke(view, null);
                Field declaredField = objInvoke.getClass().getDeclaredField("mOnLongClickListener");
                declaredField.setAccessible(true);
                this.f6704A = declaredField.get(objInvoke);
            }
            this.f6705B = onLongClickListener;
            getView().setOnLongClickListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        getView().setOnTouchListener(onTouchListener);
    }

    public void setPictureListener(PictureListener pictureListener) {
        if (this.f6708e) {
            if (pictureListener == null) {
                this.f6709f.setPictureListener(null);
                return;
            } else {
                this.f6709f.setPictureListener(new C6814bm(this, pictureListener));
                return;
            }
        }
        if (pictureListener == null) {
            this.f6710g.setPictureListener(null);
        } else {
            this.f6710g.setPictureListener(new C6813bl(this, pictureListener));
        }
    }

    public void setRendererPriorityPolicy(int i10, boolean z10) {
        try {
            if (!this.f6708e && Build.VERSION.SDK_INT >= 26) {
                C6865v.m6375a(this.f6710g, "setRendererPriorityPolicy", (Class<?>[]) new Class[]{Integer.TYPE, Boolean.TYPE}, Integer.valueOf(i10), Boolean.valueOf(z10));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // android.view.View
    public void setScrollBarStyle(int i10) {
        if (this.f6708e) {
            this.f6709f.getView().setScrollBarStyle(i10);
        } else {
            this.f6710g.setScrollBarStyle(i10);
        }
    }

    public void setSysNightModeAlpha(int i10) {
        NIGHT_MODE_ALPHA = i10;
    }

    public void setVerticalScrollbarOverlay(boolean z10) {
        if (this.f6708e) {
            this.f6709f.setVerticalScrollbarOverlay(z10);
        } else {
            this.f6710g.setVerticalScrollbarOverlay(z10);
        }
    }

    public boolean setVideoFullScreen(Context context, boolean z10) {
        if (!context.getApplicationInfo().processName.contains("com.tencent.android.qqdownloader") || this.f6709f == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        if (z10) {
            bundle.putInt("DefaultVideoScreen", 2);
        } else {
            bundle.putInt("DefaultVideoScreen", 1);
        }
        this.f6709f.getX5WebViewExtension().invokeMiscMethod("setVideoParams", bundle);
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (getView() == null) {
            return;
        }
        getView().setVisibility(i10);
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        if (this.f6708e) {
            this.f6709f.setWebChromeClient(webChromeClient != null ? new C6829n(C6816bo.m6152b().m6153a(true).m6191i(), this, webChromeClient) : null);
        } else {
            this.f6710g.setWebChromeClient(webChromeClient != null ? new SystemWebChromeClient(this, webChromeClient) : null);
        }
        this.f6717r = webChromeClient;
    }

    public void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension) {
        if (this.f6708e) {
            this.f6709f.getX5WebViewExtension().setWebChromeClientExtension(iX5WebChromeClientExtension);
        }
    }

    public void setWebViewCallbackClient(WebViewCallbackClient webViewCallbackClient) {
        this.mWebViewCallbackClient = webViewCallbackClient;
        if (!this.f6708e || getX5WebViewExtension() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("flag", true);
        getX5WebViewExtension().invokeMiscMethod("setWebViewCallbackClientFlag", bundle);
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        if (this.f6708e) {
            this.f6709f.setWebViewClient(webViewClient != null ? new C6834s(C6816bo.m6152b().m6153a(true).m6192j(), this, webViewClient) : null);
        } else {
            this.f6710g.setWebViewClient(webViewClient != null ? new C6775aa(this, webViewClient) : null);
        }
        this.f6716q = webViewClient;
    }

    public void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension) {
        if (this.f6708e) {
            this.f6709f.getX5WebViewExtension().setWebViewClientExtension(iX5WebViewClientExtension);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean showDebugView(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("http://debugtbs.qq.com")) {
            getView().setVisibility(4);
            C6848e.m6287a(this.f6712i).m6290a(lowerCase, this, this.f6712i, HandlerThreadC6783ai.m6061a().getLooper());
            return true;
        }
        if (!lowerCase.startsWith("http://debugx5.qq.com") || this.f6708e) {
            return false;
        }
        loadDataWithBaseURL(null, "<!DOCTYPE html><html><body><head><title>无法打开debugx5</title><meta name=\"viewport\" content=\"width=device-width, user-scalable=no\" /></head><br/><br /><h2>debugx5页面仅在使用了X5内核时有效，由于当前没有使用X5内核，无法打开debugx5！</h2><br />尝试<a href=\"http://debugtbs.qq.com?10000\">进入DebugTbs安装或打开X5内核</a></body></html>", "text/html", "utf-8", null);
        return true;
    }

    public boolean showFindDialog(String str, boolean z10) {
        return false;
    }

    public void stopLoading() {
        if (this.f6708e) {
            this.f6709f.stopLoading();
        } else {
            this.f6710g.stopLoading();
        }
    }

    public void super_computeScroll() {
        if (!this.f6708e) {
            this.f6710g.m5970a();
            return;
        }
        try {
            C6865v.m6374a(this.f6709f.getView(), "super_computeScroll");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f6708e) {
            return this.f6710g.m5975b(motionEvent);
        }
        try {
            Object objM6375a = C6865v.m6375a(this.f6709f.getView(), "super_dispatchTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objM6375a == null) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f6708e) {
            return this.f6710g.m5976c(motionEvent);
        }
        try {
            Object objM6375a = C6865v.m6375a(this.f6709f.getView(), "super_onInterceptTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objM6375a == null) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void super_onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        if (!this.f6708e) {
            this.f6710g.m5972a(i10, i11, z10, z11);
            return;
        }
        View view = this.f6709f.getView();
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Boolean.TYPE;
            C6865v.m6375a(view, "super_onOverScrolled", (Class<?>[]) new Class[]{cls, cls, cls2, cls2}, Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Boolean.valueOf(z11));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void super_onScrollChanged(int i10, int i11, int i12, int i13) {
        if (!this.f6708e) {
            this.f6710g.m5971a(i10, i11, i12, i13);
            return;
        }
        View view = this.f6709f.getView();
        try {
            Class cls = Integer.TYPE;
            C6865v.m6375a(view, "super_onScrollChanged", (Class<?>[]) new Class[]{cls, cls, cls, cls}, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean super_onTouchEvent(MotionEvent motionEvent) {
        if (!this.f6708e) {
            return this.f6710g.m5974a(motionEvent);
        }
        try {
            Object objM6375a = C6865v.m6375a(this.f6709f.getView(), "super_onTouchEvent", (Class<?>[]) new Class[]{MotionEvent.class}, motionEvent);
            if (objM6375a == null) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public boolean super_overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        if (!this.f6708e) {
            return this.f6710g.m5973a(i10, i11, i12, i13, i14, i15, i16, i17, z10);
        }
        View view = this.f6709f.getView();
        try {
            Class cls = Integer.TYPE;
            Object objM6375a = C6865v.m6375a(view, "super_overScrollBy", (Class<?>[]) new Class[]{cls, cls, cls, cls, cls, cls, cls, cls, Boolean.TYPE}, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Boolean.valueOf(z10));
            if (objM6375a == null) {
                return false;
            }
            return ((Boolean) objM6375a).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    public void switchNightMode(boolean z10) {
        String str;
        if (z10 == f6703z) {
            return;
        }
        f6703z = z10;
        if (z10) {
            TbsLog.m6246e("QB_SDK", "deleteNightMode");
            str = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        } else {
            TbsLog.m6246e("QB_SDK", "nightMode");
            str = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        }
        loadUrl(str);
    }

    public void switchToNightMode() {
        TbsLog.m6246e("QB_SDK", "switchToNightMode 01");
        if (f6703z) {
            return;
        }
        TbsLog.m6246e("QB_SDK", "switchToNightMode");
        loadUrl("javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);");
    }

    public boolean zoomIn() {
        return !this.f6708e ? this.f6710g.zoomIn() : this.f6709f.zoomIn();
    }

    public boolean zoomOut() {
        return !this.f6708e ? this.f6710g.zoomOut() : this.f6709f.zoomOut();
    }

    public WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m5954b(Context context) {
        if (f6698n != null) {
            return;
        }
        f6698n = new C6768a(null);
        new C6810bi(this, context).start();
    }

    /* renamed from: c */
    private boolean m5957c(Context context) {
        try {
            return context.getPackageName().indexOf(TbsConfig.APP_QQ) >= 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public android.webkit.WebView m5965a() {
        if (this.f6708e) {
            return null;
        }
        return this.f6710g;
    }

    @TargetApi(8)
    public void loadUrl(String str, Map<String, String> map) {
        C6784aj c6784aj;
        if (this.f6708e && (c6784aj = this.f6714l) != null) {
            c6784aj.m6064a(this.f6709f.hashCode(), str);
        }
        if (str == null || showDebugView(str)) {
            return;
        }
        if (this.f6708e) {
            this.f6709f.loadUrl(str, map);
        } else {
            this.f6710g.loadUrl(str, map);
        }
    }

    @TargetApi(11)
    public void saveWebArchive(String str, boolean z10, ValueCallback<String> valueCallback) {
        if (this.f6708e) {
            this.f6709f.saveWebArchive(str, z10, valueCallback);
        } else {
            C6865v.m6375a(this.f6710g, "saveWebArchive", (Class<?>[]) new Class[]{String.class, Boolean.TYPE, android.webkit.ValueCallback.class}, str, Boolean.valueOf(z10), valueCallback);
        }
    }

    public WebView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, false);
    }

    /* renamed from: a */
    public void m5966a(Context context) throws Throwable {
        String str;
        int iM5958d = m5958d(context);
        if (iM5958d != -1) {
            str = "PV=" + String.valueOf(iM5958d + 1);
        } else {
            str = "PV=1";
        }
        File file = new File(context.getDir("tbs", 0) + File.separator + "core_private", "pv.db");
        try {
            try {
                file.getParentFile().mkdirs();
                if (!file.isFile() || !file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                f6696d = fileOutputStream;
                fileOutputStream.write(str.getBytes());
                OutputStream outputStream = f6696d;
                if (outputStream != null) {
                    outputStream.flush();
                }
            } catch (Throwable th) {
                OutputStream outputStream2 = f6696d;
                if (outputStream2 != null) {
                    outputStream2.flush();
                }
                throw th;
            }
        } catch (Throwable unused) {
        }
    }

    @TargetApi(11)
    public WebView(Context context, AttributeSet attributeSet, int i10, Map<String, Object> map, boolean z10) throws NoSuchMethodException, Resources.NotFoundException, SecurityException {
        super(context, attributeSet, i10);
        this.f6707b = "WebView";
        this.f6708e = false;
        this.f6711h = null;
        this.f6712i = null;
        this.f6706a = 0;
        this.f6713k = false;
        this.f6714l = null;
        this.f6715m = false;
        this.f6716q = null;
        this.f6717r = null;
        this.f6718t = 1;
        this.f6719u = 2;
        this.f6720v = 3;
        this.f6721w = "javascript:document.getElementsByTagName('HEAD').item(0).removeChild(document.getElementById('QQBrowserSDKNightMode'));";
        this.f6722x = "javascript:var style = document.createElement('style');style.type='text/css';style.id='QQBrowserSDKNightMode';style.innerHTML='html,body{background:none !important;background-color: #1d1e2a !important;}html *{background-color: #1d1e2a !important; color:#888888 !important;border-color:#3e4f61 !important;text-shadow:none !important;box-shadow:none !important;}a,a *{border-color:#4c5b99 !important; color:#2d69b3 !important;text-decoration:none !important;}a:visited,a:visited *{color:#a600a6 !important;}a:active,a:active *{color:#5588AA !important;}input,select,textarea,option,button{background-image:none !important;color:#AAAAAA !important;border-color:#4c5b99 !important;}form,div,button,span{background-color:#1d1e2a !important; border-color:#4c5b99 !important;}img{opacity:0.5}';document.getElementsByTagName('HEAD').item(0).appendChild(style);";
        this.f6704A = null;
        this.f6705B = null;
        C6784aj c6784aj = new C6784aj();
        this.f6714l = c6784aj;
        c6784aj.m6062a("init_all", (byte) 1);
        if (QbSdk.getIsSysWebViewForcedByOuter() && TbsShareManager.isThirdPartyApp(context)) {
            this.f6712i = context;
            this.f6709f = null;
            this.f6708e = false;
            QbSdk.m5839a(context, "failed to createTBSWebview!");
            this.f6710g = new C6769b(context, attributeSet);
            CookieManager.getInstance().m5835a(context, true, false);
            CookieSyncManager.createInstance(this.f6712i).startSync();
            try {
                Method declaredMethod = Class.forName("android.webkit.WebViewWorker").getDeclaredMethod("getHandler", null);
                declaredMethod.setAccessible(true);
                ((Handler) declaredMethod.invoke(null, null)).getLooper().getThread().setUncaughtExceptionHandler(new C6828m());
                mSysWebviewCreated = true;
            } catch (Exception unused) {
            }
            CookieManager.getInstance().m5834a();
            this.f6710g.setFocusableInTouchMode(true);
            addView(this.f6710g, new FrameLayout.LayoutParams(-1, -1));
            TbsLog.m6248i("WebView", "SystemWebView Created Success! #3");
            TbsLog.m6247e("WebView", "sys WebView: IsSysWebViewForcedByOuter = true", true);
            TbsCoreLoadStat.getInstance().m5852a(context, 402, new Throwable());
            return;
        }
        if (TbsShareManager.isThirdPartyApp(context)) {
            TbsLog.setWriteLogJIT(true);
        } else {
            TbsLog.setWriteLogJIT(false);
        }
        this.f6714l.m6062a("tbslog_init", (byte) 1);
        TbsLog.initIfNeed(context);
        this.f6714l.m6062a("tbslog_init", (byte) 2);
        if (context == null) {
            throw new IllegalArgumentException("Invalid context argument");
        }
        if (f6699o == null) {
            f6699o = C6868y.m6397a(context);
        }
        if (f6699o.f7027a) {
            TbsLog.m6247e("WebView", "sys WebView: debug.conf force syswebview", true);
            QbSdk.m5839a(context, "debug.conf force syswebview!");
        }
        m5950a(context, this.f6714l);
        this.f6712i = context;
        f6697j = context.getApplicationContext();
        if (!this.f6708e || QbSdk.f6572a) {
            this.f6709f = null;
            if (TbsShareManager.isThirdPartyApp(this.f6712i)) {
                this.f6710g = new C6769b(context, attributeSet);
            } else {
                this.f6710g = new C6769b(this, context);
            }
            TbsLog.m6248i("WebView", "SystemWebView Created Success! #2");
            CookieManager.getInstance().m5835a(context, true, false);
            CookieManager.getInstance().m5834a();
            this.f6710g.setFocusableInTouchMode(true);
            addView(this.f6710g, new FrameLayout.LayoutParams(-1, -1));
            setDownloadListener(null);
            m5954b(context);
            TbsLog.writeLogToDisk();
            C6785ak.m6070a(context);
        } else {
            this.f6714l.m6062a("init_x5_webview", (byte) 1);
            this.f6709f = C6816bo.m6152b().m6153a(true).m6161a(context);
            this.f6714l.m6062a("init_x5_webview", (byte) 2);
            IX5WebViewBase iX5WebViewBase = this.f6709f;
            if (iX5WebViewBase == null || iX5WebViewBase.getView() == null) {
                TbsLog.m6247e("WebView", "sys WebView: failed to createTBSWebview", true);
                this.f6709f = null;
                this.f6708e = false;
                QbSdk.m5839a(context, "failed to createTBSWebview!");
                m5950a(context, this.f6714l);
                if (TbsShareManager.isThirdPartyApp(this.f6712i)) {
                    this.f6710g = new C6769b(context, attributeSet);
                } else {
                    this.f6710g = new C6769b(this, context);
                }
                TbsLog.m6248i("WebView", "SystemWebView Created Success! #1");
                CookieManager.getInstance().m5835a(context, true, false);
                CookieManager.getInstance().m5834a();
                this.f6710g.setFocusableInTouchMode(true);
                addView(this.f6710g, new FrameLayout.LayoutParams(-1, -1));
                try {
                    removeJavascriptInterface("searchBoxJavaBridge_");
                    removeJavascriptInterface("accessibility");
                    removeJavascriptInterface("accessibilityTraversal");
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                m5954b(context);
                TbsLog.writeLogToDisk();
                C6785ak.m6070a(context);
                return;
            }
            TbsLog.m6248i("WebView", "X5 WebView Created Success!!");
            this.f6709f.getView().setFocusableInTouchMode(true);
            m5951a(attributeSet);
            addView(this.f6709f.getView(), new FrameLayout.LayoutParams(-1, -1));
            this.f6709f.setDownloadListener(new C6801b(this, null, this.f6708e));
            this.f6709f.getX5WebViewExtension().setWebViewClientExtension(new C6809bh(this, C6816bo.m6152b().m6153a(true).m6193k()));
        }
        try {
            removeJavascriptInterface("searchBoxJavaBridge_");
            removeJavascriptInterface("accessibility");
            removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if ((TbsConfig.APP_QQ.equals(this.f6712i.getApplicationInfo().packageName) || TbsConfig.APP_WX.equals(this.f6712i.getApplicationInfo().packageName)) && C6827l.m6214a(true).m6228h()) {
            setLayerType(1, null);
        }
        C6784aj c6784aj2 = this.f6714l;
        if (c6784aj2 != null) {
            c6784aj2.m6062a("init_all", (byte) 2);
        }
        if (this.f6709f != null) {
            TbsLog.writeLogToDisk();
            if (TbsShareManager.isThirdPartyApp(context)) {
                return;
            }
            int i11 = TbsDownloadConfig.getInstance(context).mPreferences.getInt(TbsDownloadConfig.TbsConfigKey.KEY_DECOUPLECOREVERSION, 0);
            if (i11 > 0 && i11 != C6785ak.m6068a().m6114g(context) && i11 == C6785ak.m6068a().m6115h(context)) {
                C6785ak.m6068a().m6118k(context);
                return;
            }
            TbsLog.m6248i("WebView", "webview construction #1 deCoupleCoreVersion is " + i11 + " getTbsCoreShareDecoupleCoreVersion is " + C6785ak.m6068a().m6114g(context) + " getTbsCoreInstalledVerInNolock is " + C6785ak.m6068a().m6115h(context));
        }
    }

    /* renamed from: a */
    private void m5950a(Context context, C6784aj c6784aj) {
        if (QbSdk.f6580i && TbsShareManager.isThirdPartyApp(context)) {
            TbsExtensionFunctionManager.getInstance().initTbsBuglyIfNeed(context);
        }
        if (c6784aj != null) {
            c6784aj.m6062a("x5_core_engine_init_sync", (byte) 1);
        }
        C6816bo c6816boM6152b = C6816bo.m6152b();
        c6816boM6152b.m6156a(context, c6784aj);
        this.f6708e = c6816boM6152b.m6157c();
    }

    public WebView(Context context, AttributeSet attributeSet, int i10, boolean z10) {
        this(context, attributeSet, i10, null, z10);
    }

    /* renamed from: a */
    private void m5951a(AttributeSet attributeSet) throws Resources.NotFoundException {
        View view;
        if (attributeSet != null) {
            try {
                int attributeCount = attributeSet.getAttributeCount();
                for (int i10 = 0; i10 < attributeCount; i10++) {
                    if (attributeSet.getAttributeName(i10).equalsIgnoreCase("scrollbars")) {
                        int[] intArray = getResources().getIntArray(R.attr.scrollbars);
                        int attributeIntValue = attributeSet.getAttributeIntValue(i10, -1);
                        if (attributeIntValue == intArray[1]) {
                            this.f6709f.getView().setVerticalScrollBarEnabled(false);
                            view = this.f6709f.getView();
                        } else if (attributeIntValue == intArray[2]) {
                            this.f6709f.getView().setVerticalScrollBarEnabled(false);
                        } else if (attributeIntValue == intArray[3]) {
                            view = this.f6709f.getView();
                        }
                        view.setHorizontalScrollBarEnabled(false);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void m5967a(android.webkit.WebView webView) {
    }

    /* renamed from: a */
    public void m5968a(IX5WebViewBase iX5WebViewBase) {
        this.f6709f = iX5WebViewBase;
    }

    /* renamed from: a */
    private boolean m5953a(View view) {
        Object objM6375a;
        Context context = this.f6712i;
        if ((context == null || getTbsCoreVersion(context) <= 36200) && (objM6375a = C6865v.m6375a(this.f6704A, "onLongClick", (Class<?>[]) new Class[]{View.class}, view)) != null) {
            return ((Boolean) objM6375a).booleanValue();
        }
        return false;
    }
}
