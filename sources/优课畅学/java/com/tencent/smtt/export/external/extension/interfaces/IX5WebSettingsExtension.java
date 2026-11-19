package com.tencent.smtt.export.external.extension.interfaces;

import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IX5WebSettingsExtension {
    void customDiskCachePathEnabled(boolean z10, String str);

    boolean getPageSolarEnableFlag();

    boolean isFitScreen();

    boolean isReadModeWebView();

    boolean isWapSitePreferred();

    boolean isWebViewInBackground();

    void setARModeEnable(boolean z10);

    void setAcceptCookie(boolean z10);

    void setAdditionalHttpHeaders(Map<String, String> map);

    void setAutoDetectToOpenFitScreenEnabled(boolean z10);

    void setAutoRecoredAndRestoreScaleEnabled(boolean z10);

    void setContentCacheEnable(boolean z10);

    void setDayOrNight(boolean z10);

    void setEnableUnderLine(boolean z10);

    void setFirstScreenDetect(boolean z10);

    void setFirstScreenSoftwareTextureDraw(boolean z10);

    void setFitScreen(boolean z10);

    void setForcePinchScaleEnabled(boolean z10);

    void setFramePerformanceRecordEnable(boolean z10);

    boolean setHttpDnsDomains(List<String> list);

    void setImageScanEnable(boolean z10);

    void setImgAsDownloadFile(boolean z10);

    void setIsViewSourceMode(boolean z10);

    void setJSPerformanceRecordEnable(boolean z10);

    void setJavaScriptOpenWindowsBlockedNotifyEnabled(boolean z10);

    void setOnContextMenuEnable(boolean z10);

    void setOnlyDomTreeBuild(boolean z10);

    void setPageCacheCapacity(int i10);

    void setPageSolarEnableFlag(boolean z10);

    void setPreFectch(boolean z10);

    void setPreFectchEnableWhenHasMedia(boolean z10);

    void setReadModeWebView(boolean z10);

    void setRecordRequestEnabled(boolean z10);

    void setRememberScaleValue(boolean z10);

    void setSelectionColorEnabled(boolean z10);

    void setShouldRequestFavicon(boolean z10);

    void setShouldTrackVisitedLinks(boolean z10);

    void setSmartFullScreenEnabled(boolean z10);

    void setTbsARShareType(int i10);

    void setTextDecorationUnlineEnabled(boolean z10);

    void setUseQProxy(boolean z10);

    void setWapSitePreferred(boolean z10);

    void setWebViewInBackground(boolean z10);
}
