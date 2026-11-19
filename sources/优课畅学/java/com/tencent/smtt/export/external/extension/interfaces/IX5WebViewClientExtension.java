package com.tencent.smtt.export.external.extension.interfaces;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;

/* loaded from: classes4.dex */
public interface IX5WebViewClientExtension {
    public static final int FRAME_LOADTYPE_BACK = 1;
    public static final int FRAME_LOADTYPE_BACKWMLDECKNOTACCESSIBLE = 10;
    public static final int FRAME_LOADTYPE_FORWARD = 2;
    public static final int FRAME_LOADTYPE_INDEXEDBACKFORWARD = 3;
    public static final int FRAME_LOADTYPE_PREREAD = 11;
    public static final int FRAME_LOADTYPE_REDIRECT = 7;
    public static final int FRAME_LOADTYPE_RELOAD = 4;
    public static final int FRAME_LOADTYPE_RELOADALLOWINGSTALEDATA = 5;
    public static final int FRAME_LOADTYPE_RELOADFROMORIGIN = 9;
    public static final int FRAME_LOADTYPE_REPLACE = 8;
    public static final int FRAME_LOADTYPE_SAME = 6;
    public static final int FRAME_LOADTYPE_STANDARD = 0;
    public static final int HTMLTYPE_JS_SCROLLTO = 1;

    boolean allowJavaScriptOpenWindowAutomatically(String str, String str2);

    void computeScroll(View view);

    void didFirstVisuallyNonEmptyPaint();

    boolean dispatchTouchEvent(MotionEvent motionEvent, View view);

    void documentAvailableInMainFrame();

    void handlePluginTag(String str, String str2, boolean z10, String str3);

    void hideAddressBar();

    void invalidate();

    boolean notifyAutoAudioPlay(String str, JsResult jsResult);

    boolean notifyJavaScriptOpenWindowsBlocked(String str, String[] strArr, ValueCallback<Boolean> valueCallback, boolean z10);

    void onDoubleTapStart();

    void onFlingScrollBegin(int i10, int i11, int i12);

    void onFlingScrollEnd();

    void onHideListBox();

    void onHistoryItemChanged();

    void onInputBoxTextChanged(IX5WebViewExtension iX5WebViewExtension, String str);

    boolean onInterceptTouchEvent(MotionEvent motionEvent, View view);

    void onMetricsSavedCountReceived(String str, boolean z10, long j10, String str2, int i10);

    Object onMiscCallBack(String str, Bundle bundle);

    Object onMiscCallBack(String str, Bundle bundle, Object obj, Object obj2, Object obj3, Object obj4);

    void onMissingPluginClicked(String str, String str2, String str3, int i10);

    void onNativeCrashReport(int i10, String str);

    void onOverScrolled(int i10, int i11, boolean z10, boolean z11, View view);

    void onPinchToZoomStart();

    void onPreReadFinished();

    void onPrefetchResourceHit(boolean z10);

    void onPromptScaleSaved();

    void onReceivedSslErrorCancel();

    void onReceivedViewSource(String str);

    void onReportAdFilterInfo(int i10, int i11, String str, boolean z10);

    void onReportHtmlInfo(int i10, String str);

    void onResponseReceived(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, int i10);

    void onScrollChanged(int i10, int i11, int i12, int i13);

    void onScrollChanged(int i10, int i11, int i12, int i13, View view);

    void onSetButtonStatus(boolean z10, boolean z11);

    void onShowListBox(String[] strArr, int[] iArr, int[] iArr2, int i10);

    boolean onShowLongClickPopupMenu();

    void onShowMutilListBox(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3);

    void onSlidingTitleOffScreen(int i10, int i11);

    void onSoftKeyBoardHide(int i10);

    void onSoftKeyBoardShow();

    boolean onTouchEvent(MotionEvent motionEvent, View view);

    void onTransitionToCommitted();

    void onUploadProgressChange(int i10, int i11, String str);

    void onUploadProgressStart(int i10);

    void onUrlChange(String str, String str2);

    boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, View view);

    boolean preShouldOverrideUrlLoading(IX5WebViewExtension iX5WebViewExtension, String str);

    void showTranslateBubble(int i10, String str, String str2, int i11);
}
