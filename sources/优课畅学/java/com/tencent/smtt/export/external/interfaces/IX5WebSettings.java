package com.tencent.smtt.export.external.interfaces;

import com.tencent.smtt.sdk.TbsListener;

/* loaded from: classes4.dex */
public interface IX5WebSettings {
    public static final int DEFAULT_CACHE_CAPACITY = 15;
    public static final int LOAD_CACHE_AD = 100;
    public static final int LOAD_CACHE_ELSE_NETWORK = 1;
    public static final int LOAD_CACHE_ONLY = 3;
    public static final int LOAD_DEFAULT = -1;
    public static final int LOAD_NORMAL = 0;
    public static final int LOAD_NO_CACHE = 2;

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

    boolean enableSmoothTransition();

    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkImage();

    boolean getBlockNetworkLoads();

    boolean getBuiltInZoomControls();

    int getCacheMode();

    String getCursiveFontFamily();

    boolean getDatabaseEnabled();

    String getDatabasePath();

    int getDefaultFixedFontSize();

    int getDefaultFontSize();

    String getDefaultTextEncodingName();

    ZoomDensity getDefaultZoom();

    boolean getDisplayZoomControls();

    boolean getDomStorageEnabled();

    String getFantasyFontFamily();

    String getFixedFontFamily();

    boolean getJavaScriptCanOpenWindowsAutomatically();

    boolean getJavaScriptEnabled();

    LayoutAlgorithm getLayoutAlgorithm();

    boolean getLightTouchEnabled();

    boolean getLoadWithOverviewMode();

    boolean getLoadsImagesAutomatically();

    boolean getMediaPlaybackRequiresUserGesture();

    int getMinimumFontSize();

    int getMinimumLogicalFontSize();

    int getMixedContentMode();

    boolean getNavDump();

    PluginState getPluginState();

    boolean getPluginsEnabled();

    String getPluginsPath();

    String getSansSerifFontFamily();

    boolean getSaveFormData();

    boolean getSavePassword();

    String getSerifFontFamily();

    String getStandardFontFamily();

    TextSize getTextSize();

    int getTextZoom();

    boolean getUseWebViewBackgroundForOverscrollBackground();

    boolean getUseWideViewPort();

    String getUserAgent();

    String getUserAgentString();

    void setAllowContentAccess(boolean z10);

    void setAllowFileAccess(boolean z10);

    void setAllowFileAccessFromFileURLs(boolean z10);

    void setAllowUniversalAccessFromFileURLs(boolean z10);

    void setAppCacheEnabled(boolean z10);

    void setAppCacheMaxSize(long j10);

    void setAppCachePath(String str);

    void setBlockNetworkImage(boolean z10);

    void setBlockNetworkLoads(boolean z10);

    void setBuiltInZoomControls(boolean z10);

    void setCacheMode(int i10);

    void setCursiveFontFamily(String str);

    void setDatabaseEnabled(boolean z10);

    void setDatabasePath(String str);

    void setDefaultDatabasePath(boolean z10);

    void setDefaultFixedFontSize(int i10);

    void setDefaultFontSize(int i10);

    void setDefaultTextEncodingName(String str);

    void setDefaultZoom(ZoomDensity zoomDensity);

    void setDisplayZoomControls(boolean z10);

    void setDomStorageEnabled(boolean z10);

    void setEnableSmoothTransition(boolean z10);

    void setFantasyFontFamily(String str);

    void setFixedFontFamily(String str);

    void setGeolocationDatabasePath(String str);

    void setGeolocationEnabled(boolean z10);

    void setJavaScriptCanOpenWindowsAutomatically(boolean z10);

    void setJavaScriptEnabled(boolean z10);

    void setLayoutAlgorithm(LayoutAlgorithm layoutAlgorithm);

    void setLightTouchEnabled(boolean z10);

    void setLoadWithOverviewMode(boolean z10);

    void setLoadsImagesAutomatically(boolean z10);

    void setMediaPlaybackRequiresUserGesture(boolean z10);

    void setMinimumFontSize(int i10);

    void setMinimumLogicalFontSize(int i10);

    void setNavDump(boolean z10);

    void setNeedInitialFocus(boolean z10);

    void setPluginEnabled(boolean z10);

    void setPluginState(PluginState pluginState);

    void setPluginsEnabled(boolean z10);

    void setPluginsPath(String str);

    void setRenderPriority(RenderPriority renderPriority);

    void setSansSerifFontFamily(String str);

    void setSaveFormData(boolean z10);

    void setSavePassword(boolean z10);

    void setSerifFontFamily(String str);

    void setStandardFontFamily(String str);

    void setSupportMultipleWindows(boolean z10);

    void setSupportZoom(boolean z10);

    void setTextSize(TextSize textSize);

    void setTextZoom(int i10);

    void setUseWebViewBackgroundForOverscrollBackground(boolean z10);

    void setUseWideViewPort(boolean z10);

    void setUserAgent(String str);

    void setUserAgent(String str, boolean z10);

    void setUserAgentString(String str);

    boolean supportMultipleWindows();

    boolean supportZoom();
}
