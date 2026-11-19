package com.tencent.smtt.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.webkit.WebSettings;
import com.tencent.smtt.export.external.interfaces.IX5WebSettings;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.utils.C6865v;

/* loaded from: classes4.dex */
public class WebSettings {
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;

    /* renamed from: a */
    private IX5WebSettings f6690a;

    /* renamed from: b */
    private android.webkit.WebSettings f6691b;

    /* renamed from: c */
    private boolean f6692c;

    public enum LayoutAlgorithm {
        NORMAL,
        SINGLE_COLUMN,
        NARROW_COLUMNS
    }

    public enum PluginState {
        ON,
        ON_DEMAND,
        OFF
    }

    public enum RenderPriority {
        NORMAL,
        HIGH,
        LOW
    }

    public enum TextSize {
        SMALLEST(50),
        SMALLER(75),
        NORMAL(100),
        LARGER(TbsListener.ErrorCode.DOWNLOAD_THROWABLE),
        LARGEST(150);

        int value;

        TextSize(int i10) {
            this.value = i10;
        }
    }

    public enum ZoomDensity {
        FAR(150),
        MEDIUM(100),
        CLOSE(75);

        int value;

        ZoomDensity(int i10) {
            this.value = i10;
        }
    }

    public WebSettings(android.webkit.WebSettings webSettings) {
        this.f6690a = null;
        this.f6691b = webSettings;
        this.f6692c = false;
    }

    @TargetApi(17)
    public static String getDefaultUserAgent(Context context) {
        Object objM6373a;
        if (C6816bo.m6152b().m6157c() || (objM6373a = C6865v.m6373a((Class<?>) android.webkit.WebSettings.class, "getDefaultUserAgent", (Class<?>[]) new Class[]{Context.class}, context)) == null) {
            return null;
        }
        return (String) objM6373a;
    }

    @Deprecated
    public boolean enableSmoothTransition() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.enableSmoothTransition();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "enableSmoothTransition")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @TargetApi(11)
    public boolean getAllowContentAccess() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getAllowContentAccess();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "getAllowContentAccess")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @TargetApi(3)
    public boolean getAllowFileAccess() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getAllowFileAccess();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getAllowFileAccess();
    }

    public synchronized boolean getBlockNetworkImage() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getBlockNetworkImage();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getBlockNetworkImage();
    }

    @TargetApi(8)
    public synchronized boolean getBlockNetworkLoads() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getBlockNetworkLoads();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getBlockNetworkLoads();
    }

    @TargetApi(3)
    public boolean getBuiltInZoomControls() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getBuiltInZoomControls();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getBuiltInZoomControls();
    }

    public int getCacheMode() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getCacheMode();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        return webSettings.getCacheMode();
    }

    public synchronized String getCursiveFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getCursiveFontFamily() : iX5WebSettings.getCursiveFontFamily();
    }

    @TargetApi(5)
    public synchronized boolean getDatabaseEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getDatabaseEnabled();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getDatabaseEnabled();
    }

    @TargetApi(5)
    public synchronized String getDatabasePath() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getDatabasePath() : iX5WebSettings.getDatabasePath();
    }

    public synchronized int getDefaultFixedFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getDefaultFixedFontSize();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        return webSettings.getDefaultFixedFontSize();
    }

    public synchronized int getDefaultFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getDefaultFontSize();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        return webSettings.getDefaultFontSize();
    }

    public synchronized String getDefaultTextEncodingName() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getDefaultTextEncodingName() : iX5WebSettings.getDefaultTextEncodingName();
    }

    @TargetApi(7)
    public ZoomDensity getDefaultZoom() {
        android.webkit.WebSettings webSettings;
        Enum defaultZoom;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            defaultZoom = iX5WebSettings.getDefaultZoom();
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return null;
            }
            defaultZoom = webSettings.getDefaultZoom();
        }
        return ZoomDensity.valueOf(defaultZoom.name());
    }

    @TargetApi(11)
    public boolean getDisplayZoomControls() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getDisplayZoomControls();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "getDisplayZoomControls")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @TargetApi(7)
    public synchronized boolean getDomStorageEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getDomStorageEnabled();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getDomStorageEnabled();
    }

    public synchronized String getFantasyFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getFantasyFontFamily() : iX5WebSettings.getFantasyFontFamily();
    }

    public synchronized String getFixedFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getFixedFontFamily() : iX5WebSettings.getFixedFontFamily();
    }

    public synchronized boolean getJavaScriptCanOpenWindowsAutomatically() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getJavaScriptCanOpenWindowsAutomatically();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getJavaScriptCanOpenWindowsAutomatically();
    }

    public synchronized boolean getJavaScriptEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getJavaScriptEnabled();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getJavaScriptEnabled();
    }

    public synchronized LayoutAlgorithm getLayoutAlgorithm() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return LayoutAlgorithm.valueOf(iX5WebSettings.getLayoutAlgorithm().name());
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return null;
        }
        return LayoutAlgorithm.valueOf(webSettings.getLayoutAlgorithm().name());
    }

    public boolean getLightTouchEnabled() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getLightTouchEnabled();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getLightTouchEnabled();
    }

    @TargetApi(7)
    public boolean getLoadWithOverviewMode() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getLoadWithOverviewMode();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getLoadWithOverviewMode();
    }

    public synchronized boolean getLoadsImagesAutomatically() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getLoadsImagesAutomatically();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getLoadsImagesAutomatically();
    }

    @TargetApi(17)
    public boolean getMediaPlaybackRequiresUserGesture() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getMediaPlaybackRequiresUserGesture();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "getMediaPlaybackRequiresUserGesture")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    public synchronized int getMinimumFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getMinimumFontSize();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        return webSettings.getMinimumFontSize();
    }

    public synchronized int getMinimumLogicalFontSize() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getMinimumLogicalFontSize();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        return webSettings.getMinimumLogicalFontSize();
    }

    public synchronized int getMixedContentMode() {
        IX5WebSettings iX5WebSettings;
        int iIntValue = -1;
        if (!this.f6692c || (iX5WebSettings = this.f6690a) == null) {
            Object objM6375a = C6865v.m6375a(this.f6691b, "getMixedContentMode", (Class<?>[]) new Class[0], new Object[0]);
            if (objM6375a != null) {
                iIntValue = ((Integer) objM6375a).intValue();
            }
            return iIntValue;
        }
        try {
            return iX5WebSettings.getMixedContentMode();
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public boolean getNavDump() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getNavDump();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "getNavDump")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    @TargetApi(8)
    @Deprecated
    public synchronized PluginState getPluginState() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return PluginState.valueOf(iX5WebSettings.getPluginState().name());
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return null;
        }
        Object objM6374a = C6865v.m6374a(webSettings, "getPluginState");
        if (objM6374a == null) {
            return null;
        }
        return PluginState.valueOf(((WebSettings.PluginState) objM6374a).name());
    }

    @TargetApi(8)
    @Deprecated
    public synchronized boolean getPluginsEnabled() {
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || this.f6691b == null) ? false : false : iX5WebSettings.getPluginsEnabled();
    }

    @Deprecated
    public synchronized String getPluginsPath() {
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || this.f6691b == null) ? "" : "" : iX5WebSettings.getPluginsPath();
    }

    public synchronized String getSansSerifFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getSansSerifFontFamily() : iX5WebSettings.getSansSerifFontFamily();
    }

    public boolean getSaveFormData() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getSaveFormData();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getSaveFormData();
    }

    public boolean getSavePassword() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getSavePassword();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getSavePassword();
    }

    public synchronized String getSerifFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getSerifFontFamily() : iX5WebSettings.getSerifFontFamily();
    }

    public synchronized String getStandardFontFamily() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getStandardFontFamily() : iX5WebSettings.getStandardFontFamily();
    }

    public TextSize getTextSize() {
        android.webkit.WebSettings webSettings;
        Enum textSize;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            textSize = iX5WebSettings.getTextSize();
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return null;
            }
            textSize = webSettings.getTextSize();
        }
        return TextSize.valueOf(textSize.name());
    }

    @TargetApi(14)
    public synchronized int getTextZoom() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getTextZoom();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return 0;
        }
        try {
            return webSettings.getTextZoom();
        } catch (Exception unused) {
            Object objM6374a = C6865v.m6374a(this.f6691b, "getTextZoom");
            if (objM6374a == null) {
                return 0;
            }
            return ((Integer) objM6374a).intValue();
        }
    }

    @Deprecated
    public boolean getUseWebViewBackgroundForOverscrollBackground() {
        android.webkit.WebSettings webSettings;
        Object objM6374a;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getUseWebViewBackgroundForOverscrollBackground();
        }
        if (z10 || (webSettings = this.f6691b) == null || (objM6374a = C6865v.m6374a(webSettings, "getUseWebViewBackgroundForOverscrollBackground")) == null) {
            return false;
        }
        return ((Boolean) objM6374a).booleanValue();
    }

    public synchronized boolean getUseWideViewPort() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.getUseWideViewPort();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.getUseWideViewPort();
    }

    @TargetApi(3)
    public String getUserAgentString() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        return (!z10 || (iX5WebSettings = this.f6690a) == null) ? (z10 || (webSettings = this.f6691b) == null) ? "" : webSettings.getUserAgentString() : iX5WebSettings.getUserAgentString();
    }

    @TargetApi(11)
    public void setAllowContentAccess(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAllowContentAccess(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setAllowContentAccess", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    @TargetApi(3)
    public void setAllowFileAccess(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAllowFileAccess(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setAllowFileAccess(z10);
        }
    }

    @TargetApi(16)
    public void setAllowFileAccessFromFileURLs(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAllowFileAccessFromFileURLs(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setAllowFileAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    @TargetApi(16)
    public void setAllowUniversalAccessFromFileURLs(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAllowUniversalAccessFromFileURLs(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setAllowUniversalAccessFromFileURLs", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    @TargetApi(7)
    public void setAppCacheEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAppCacheEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setAppCacheEnabled(z10);
        }
    }

    @TargetApi(7)
    public void setAppCacheMaxSize(long j10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAppCacheMaxSize(j10);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setAppCacheMaxSize(j10);
        }
    }

    @TargetApi(7)
    public void setAppCachePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setAppCachePath(str);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setAppCachePath(str);
        }
    }

    public void setBlockNetworkImage(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setBlockNetworkImage(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setBlockNetworkImage(z10);
        }
    }

    @TargetApi(8)
    public synchronized void setBlockNetworkLoads(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z11 = this.f6692c;
            if (z11 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setBlockNetworkLoads(z10);
            } else if (z11 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setBlockNetworkLoads(z10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(3)
    public void setBuiltInZoomControls(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setBuiltInZoomControls(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setBuiltInZoomControls(z10);
        }
    }

    public void setCacheMode(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setCacheMode(i10);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setCacheMode(i10);
        }
    }

    public synchronized void setCursiveFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setCursiveFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setCursiveFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(5)
    public void setDatabaseEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setDatabaseEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setDatabaseEnabled(z10);
        }
    }

    @TargetApi(5)
    @Deprecated
    public void setDatabasePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setDatabasePath(str);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setDatabasePath", (Class<?>[]) new Class[]{String.class}, str);
        }
    }

    public synchronized void setDefaultFixedFontSize(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setDefaultFixedFontSize(i10);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setDefaultFixedFontSize(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setDefaultFontSize(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setDefaultFontSize(i10);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setDefaultFontSize(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setDefaultTextEncodingName(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setDefaultTextEncodingName(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setDefaultTextEncodingName(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(7)
    public void setDefaultZoom(ZoomDensity zoomDensity) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setDefaultZoom(IX5WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setDefaultZoom(WebSettings.ZoomDensity.valueOf(zoomDensity.name()));
        }
    }

    @TargetApi(11)
    public void setDisplayZoomControls(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setDisplayZoomControls(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setDisplayZoomControls", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    @TargetApi(7)
    public void setDomStorageEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setDomStorageEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setDomStorageEnabled(z10);
        }
    }

    @TargetApi(11)
    @Deprecated
    public void setEnableSmoothTransition(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setEnableSmoothTransition(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setEnableSmoothTransition", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public synchronized void setFantasyFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setFantasyFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setFantasyFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setFixedFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setFixedFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setFixedFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(5)
    public void setGeolocationDatabasePath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setGeolocationDatabasePath(str);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setGeolocationDatabasePath(str);
        }
    }

    @TargetApi(5)
    public void setGeolocationEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setGeolocationEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setGeolocationEnabled(z10);
        }
    }

    public synchronized void setJavaScriptCanOpenWindowsAutomatically(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z11 = this.f6692c;
            if (z11 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setJavaScriptCanOpenWindowsAutomatically(z10);
            } else if (z11 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setJavaScriptCanOpenWindowsAutomatically(z10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public void setJavaScriptEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z11 = this.f6692c;
            if (z11 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setJavaScriptEnabled(z10);
            } else {
                if (z11 || (webSettings = this.f6691b) == null) {
                    return;
                }
                webSettings.setJavaScriptEnabled(z10);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setLayoutAlgorithm(IX5WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.valueOf(layoutAlgorithm.name()));
        }
    }

    public void setLightTouchEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setLightTouchEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setLightTouchEnabled(z10);
        }
    }

    @TargetApi(7)
    public void setLoadWithOverviewMode(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setLoadWithOverviewMode(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setLoadWithOverviewMode(z10);
        }
    }

    public void setLoadsImagesAutomatically(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setLoadsImagesAutomatically(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setLoadsImagesAutomatically(z10);
        }
    }

    @TargetApi(17)
    public void setMediaPlaybackRequiresUserGesture(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setMediaPlaybackRequiresUserGesture(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setMediaPlaybackRequiresUserGesture", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public synchronized void setMinimumFontSize(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setMinimumFontSize(i10);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setMinimumFontSize(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setMinimumLogicalFontSize(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setMinimumLogicalFontSize(i10);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setMinimumLogicalFontSize(i10);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @TargetApi(21)
    public void setMixedContentMode(int i10) {
        android.webkit.WebSettings webSettings;
        boolean z10 = this.f6692c;
        if ((z10 && this.f6690a != null) || z10 || (webSettings = this.f6691b) == null) {
            return;
        }
        C6865v.m6375a(webSettings, "setMixedContentMode", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i10));
    }

    public void setNavDump(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setNavDump(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setNavDump", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public void setNeedInitialFocus(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setNeedInitialFocus(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setNeedInitialFocus(z10);
        }
    }

    @TargetApi(8)
    @Deprecated
    public synchronized void setPluginState(PluginState pluginState) {
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setPluginState(IX5WebSettings.PluginState.valueOf(pluginState.name()));
            } else if (z10 || this.f6691b == null) {
            } else {
                C6865v.m6375a(this.f6691b, "setPluginState", (Class<?>[]) new Class[]{WebSettings.PluginState.class}, WebSettings.PluginState.valueOf(pluginState.name()));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public void setPluginsEnabled(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setPluginsEnabled(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setPluginsEnabled", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    @Deprecated
    public synchronized void setPluginsPath(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setPluginsPath(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                C6865v.m6375a(webSettings, "setPluginsPath", (Class<?>[]) new Class[]{String.class}, str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setRenderPriority(RenderPriority renderPriority) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setRenderPriority(IX5WebSettings.RenderPriority.valueOf(renderPriority.name()));
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setRenderPriority(WebSettings.RenderPriority.valueOf(renderPriority.name()));
        }
    }

    public synchronized void setSansSerifFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setSansSerifFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setSansSerifFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setSaveFormData(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setSaveFormData(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setSaveFormData(z10);
        }
    }

    public void setSavePassword(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setSavePassword(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setSavePassword(z10);
        }
    }

    public synchronized void setSerifFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setSerifFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setSerifFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setStandardFontFamily(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setStandardFontFamily(str);
            } else if (z10 || (webSettings = this.f6691b) == null) {
            } else {
                webSettings.setStandardFontFamily(str);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setSupportMultipleWindows(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setSupportMultipleWindows(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setSupportMultipleWindows(z10);
        }
    }

    public void setSupportZoom(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setSupportZoom(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setSupportZoom(z10);
        }
    }

    public void setTextSize(TextSize textSize) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setTextSize(IX5WebSettings.TextSize.valueOf(textSize.name()));
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setTextSize(WebSettings.TextSize.valueOf(textSize.name()));
        }
    }

    @TargetApi(14)
    public synchronized void setTextZoom(int i10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        try {
            boolean z10 = this.f6692c;
            if (z10 && (iX5WebSettings = this.f6690a) != null) {
                iX5WebSettings.setTextZoom(i10);
            } else if (!z10 && (webSettings = this.f6691b) != null) {
                try {
                    webSettings.setTextZoom(i10);
                } catch (Exception unused) {
                    C6865v.m6375a(this.f6691b, "setTextZoom", (Class<?>[]) new Class[]{Integer.TYPE}, Integer.valueOf(i10));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated
    public void setUseWebViewBackgroundForOverscrollBackground(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setUseWebViewBackgroundForOverscrollBackground(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            C6865v.m6375a(webSettings, "setUseWebViewBackgroundForOverscrollBackground", (Class<?>[]) new Class[]{Boolean.TYPE}, Boolean.valueOf(z10));
        }
    }

    public void setUseWideViewPort(boolean z10) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z11 = this.f6692c;
        if (z11 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setUseWideViewPort(z10);
        } else {
            if (z11 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setUseWideViewPort(z10);
        }
    }

    public void setUserAgent(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setUserAgent(str);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setUserAgentString(str);
        }
    }

    @TargetApi(3)
    public void setUserAgentString(String str) {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            iX5WebSettings.setUserAgentString(str);
        } else {
            if (z10 || (webSettings = this.f6691b) == null) {
                return;
            }
            webSettings.setUserAgentString(str);
        }
    }

    public synchronized boolean supportMultipleWindows() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.supportMultipleWindows();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.supportMultipleWindows();
    }

    public boolean supportZoom() {
        android.webkit.WebSettings webSettings;
        IX5WebSettings iX5WebSettings;
        boolean z10 = this.f6692c;
        if (z10 && (iX5WebSettings = this.f6690a) != null) {
            return iX5WebSettings.supportZoom();
        }
        if (z10 || (webSettings = this.f6691b) == null) {
            return false;
        }
        return webSettings.supportZoom();
    }

    public WebSettings(IX5WebSettings iX5WebSettings) {
        this.f6690a = iX5WebSettings;
        this.f6691b = null;
        this.f6692c = true;
    }
}
