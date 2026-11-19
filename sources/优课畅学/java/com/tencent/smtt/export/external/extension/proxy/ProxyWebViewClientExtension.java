package com.tencent.smtt.export.external.extension.proxy;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension;
import com.tencent.smtt.export.external.extension.interfaces.IX5WebViewExtension;
import com.tencent.smtt.export.external.interfaces.JsResult;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.export.external.interfaces.WebResourceResponse;

/* loaded from: classes4.dex */
public abstract class ProxyWebViewClientExtension implements IX5WebViewClientExtension {
    private static boolean sCompatibleOnMetricsSavedCountReceived = true;
    private static boolean sCompatibleOnPageLoadingStartedAndFinished = true;
    protected IX5WebViewClientExtension mWebViewClientExt;

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean allowJavaScriptOpenWindowAutomatically(String str, String str2) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.allowJavaScriptOpenWindowAutomatically(str, str2);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void computeScroll(View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.computeScroll(view);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void didFirstVisuallyNonEmptyPaint() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.didFirstVisuallyNonEmptyPaint();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean dispatchTouchEvent(MotionEvent motionEvent, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.dispatchTouchEvent(motionEvent, view);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void documentAvailableInMainFrame() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.documentAvailableInMainFrame();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void handlePluginTag(String str, String str2, boolean z10, String str3) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.handlePluginTag(str, str2, z10, str3);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void hideAddressBar() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.hideAddressBar();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void invalidate() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.invalidate();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean notifyAutoAudioPlay(String str, JsResult jsResult) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension == null) {
            return false;
        }
        try {
            return iX5WebViewClientExtension.notifyAutoAudioPlay(str, jsResult);
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean notifyJavaScriptOpenWindowsBlocked(String str, String[] strArr, ValueCallback<Boolean> valueCallback, boolean z10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.notifyJavaScriptOpenWindowsBlocked(str, strArr, valueCallback, z10);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onDoubleTapStart() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onDoubleTapStart();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onFlingScrollBegin(int i10, int i11, int i12) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onFlingScrollBegin(i10, i11, i12);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onFlingScrollEnd() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onFlingScrollEnd();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onHideListBox() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onHideListBox();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onHistoryItemChanged() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onHistoryItemChanged();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onInputBoxTextChanged(IX5WebViewExtension iX5WebViewExtension, String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onInputBoxTextChanged(iX5WebViewExtension, str);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.onInterceptTouchEvent(motionEvent, view);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onMetricsSavedCountReceived(String str, boolean z10, long j10, String str2, int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension == null || !sCompatibleOnMetricsSavedCountReceived) {
            return;
        }
        try {
            iX5WebViewClientExtension.onMetricsSavedCountReceived(str, z10, j10, str2, i10);
        } catch (NoSuchMethodError e10) {
            if (e10.getMessage() == null || !e10.getMessage().contains("onMetricsSavedCountReceived")) {
                throw e10;
            }
            sCompatibleOnMetricsSavedCountReceived = false;
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public Object onMiscCallBack(String str, Bundle bundle) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.onMiscCallBack(str, bundle);
        }
        return null;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onMissingPluginClicked(String str, String str2, String str3, int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onMissingPluginClicked(str, str2, str3, i10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onNativeCrashReport(int i10, String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onNativeCrashReport(i10, str);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onOverScrolled(i10, i11, z10, z11, view);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPinchToZoomStart() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onPinchToZoomStart();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPreReadFinished() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onPreReadFinished();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPrefetchResourceHit(boolean z10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onPrefetchResourceHit(z10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onPromptScaleSaved() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onPromptScaleSaved();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReceivedSslErrorCancel() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onReceivedSslErrorCancel();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReceivedViewSource(String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onReceivedViewSource(str);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportAdFilterInfo(int i10, int i11, String str, boolean z10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onReportAdFilterInfo(i10, i11, str, z10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onReportHtmlInfo(int i10, String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onReportHtmlInfo(i10, str);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onResponseReceived(WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onResponseReceived(webResourceRequest, webResourceResponse, i10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onScrollChanged(i10, i11, i12, i13);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSetButtonStatus(boolean z10, boolean z11) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onSetButtonStatus(z10, z11);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onShowListBox(String[] strArr, int[] iArr, int[] iArr2, int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onShowListBox(strArr, iArr, iArr2, i10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onShowLongClickPopupMenu() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension == null) {
            return false;
        }
        try {
            return iX5WebViewClientExtension.onShowLongClickPopupMenu();
        } catch (NoSuchMethodError e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onShowMutilListBox(String[] strArr, int[] iArr, int[] iArr2, int[] iArr3) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onShowMutilListBox(strArr, iArr, iArr2, iArr3);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSlidingTitleOffScreen(int i10, int i11) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onSlidingTitleOffScreen(i10, i11);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSoftKeyBoardHide(int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onSoftKeyBoardHide(i10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onSoftKeyBoardShow() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onSoftKeyBoardShow();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean onTouchEvent(MotionEvent motionEvent, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.onTouchEvent(motionEvent, view);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onTransitionToCommitted() {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onTransitionToCommitted();
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUploadProgressChange(int i10, int i11, String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onUploadProgressChange(i10, i11, str);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUploadProgressStart(int i10) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onUploadProgressStart(i10);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onUrlChange(String str, String str2) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onUrlChange(str, str2);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean overScrollBy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.overScrollBy(i10, i11, i12, i13, i14, i15, i16, i17, z10, view);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public boolean preShouldOverrideUrlLoading(IX5WebViewExtension iX5WebViewExtension, String str) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.preShouldOverrideUrlLoading(iX5WebViewExtension, str);
        }
        return false;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void showTranslateBubble(int i10, String str, String str2, int i11) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.showTranslateBubble(i10, str, str2, i11);
        }
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public Object onMiscCallBack(String str, Bundle bundle, Object obj, Object obj2, Object obj3, Object obj4) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            return iX5WebViewClientExtension.onMiscCallBack(str, bundle, obj, obj2, obj3, obj4);
        }
        return null;
    }

    @Override // com.tencent.smtt.export.external.extension.interfaces.IX5WebViewClientExtension
    public void onScrollChanged(int i10, int i11, int i12, int i13, View view) {
        IX5WebViewClientExtension iX5WebViewClientExtension = this.mWebViewClientExt;
        if (iX5WebViewClientExtension != null) {
            iX5WebViewClientExtension.onScrollChanged(i10, i11, i12, i13, view);
        }
    }
}
