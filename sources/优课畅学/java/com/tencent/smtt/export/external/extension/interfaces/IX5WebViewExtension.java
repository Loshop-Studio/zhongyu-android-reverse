package com.tencent.smtt.export.external.extension.interfaces;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import com.tencent.smtt.export.external.interfaces.ISelectionInterface;
import com.tencent.smtt.export.external.interfaces.IX5ScrollListener;
import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardListClient;
import com.tencent.smtt.export.external.interfaces.IX5WebChromeClient;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;
import com.tencent.smtt.export.external.interfaces.IX5WebViewBase;
import com.tencent.smtt.export.external.interfaces.IX5WebViewClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface IX5WebViewExtension {
    public static final int HANDLEVIEW_ALIGNMENT_CENTER = 1;
    public static final int HANDLEVIEW_ALIGNMENT_RIGHT = 2;
    public static final int HANDLEVIEW_POSITION_CENTER = 1;
    public static final int HANDLEVIEW_POSITION_RIGHT = 2;
    public static final int HANLDEVIEW_ALIGNMENT_LEFT = 0;
    public static final int HANLDEVIEW_POSITION_LEFT = 0;
    public static final int OVER_SCROLL_ALWAYS = 0;
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int RENDER_MODE_DEFAULT = 0;
    public static final int RENDER_MODE_SMOOTHNESS_AGGRESSIVE = 2;
    public static final int RENDER_MODE_SMOOTHNESS_NORMAL = 1;

    void active();

    void cancelLongPress();

    boolean capturePageToFile(Bitmap.Config config, String str, boolean z10, int i10, int i11);

    void clearServiceWorkerCache();

    void clearTextEntry();

    void clearTextFieldLongPressStatus();

    void copyText();

    void cutText(CharSequence charSequence);

    void deactive();

    void doFingerSearchIfNeed();

    void doTranslateAction(int i10);

    void documentAsText(Message message);

    void documentDumpRenderTree(Message message);

    boolean drawPreReadBaseLayer(Canvas canvas, boolean z10);

    void dumpDisplayTree();

    void dumpViewportForLayoutTest(Message message);

    void enterSelectionMode(boolean z10);

    void exitPluginFullScreen();

    void focusAndPopupIM(String str);

    void forceSyncOffsetToCore();

    ArrayList<IX5WebViewBase.ImageInfo> getAllImageInfo();

    Bitmap getBitmapByIndex(int i10);

    int getCurrentHistoryItemIndex();

    String getDocumentOuterHTML();

    boolean getDrawWithBuffer();

    String getFocusCandidateText();

    IX5WebHistoryItem getHistoryItem(int i10);

    int getQQBrowserVersion();

    int getScrollX();

    int getScrollY();

    Bundle getSdkQBStatisticsInfo();

    String getSelectionText();

    IX5WebSettingsExtension getSettingsExtension();

    int getSharedVideoTime();

    Point getSinglePressPoint();

    int getSniffVideoID();

    String getSniffVideoRefer();

    boolean getSolarMode();

    int getTitleHeight();

    IX5WebChromeClient getWebChromeClient();

    IX5WebChromeClientExtension getWebChromeClientExtension();

    int getWebTextScrollDis();

    IX5WebViewClient getWebViewClient();

    IX5WebViewClientExtension getWebViewClientExtension();

    boolean inFullScreenMode();

    boolean inputNodeIsPasswordType();

    boolean inputNodeIsPhoneType();

    void invalidateContent();

    Object invokeMiscMethod(String str, Bundle bundle);

    boolean isActive();

    boolean isEditingMode();

    boolean isEnableSetFont();

    boolean isHorizontalScrollBarEnabled();

    boolean isMobileSite();

    boolean isPluginFullScreen();

    boolean isPreReadCanGoForward();

    boolean isSelectionMode();

    boolean isVerticalScrollBarEnabled();

    void leaveSelectionMode();

    void loadDataWithBaseURLWithHeaders(String str, String str2, String str3, String str4, String str5, Map<String, String> map);

    void loaddataWithHeaders(String str, String str2, String str3, Map<String, String> map);

    boolean needSniff();

    void onAppExit();

    void onFingerSearchResult(String str, int i10, int i11);

    void onPageTransFormationSettingChanged(boolean z10);

    void onPauseActiveDomObject();

    void onPauseNativeVideo();

    void onResumeActiveDomObject();

    void pasteText(CharSequence charSequence);

    void pauseAudio();

    void playAudio();

    void preConnectQProxy();

    void pruneMemoryCache();

    void registerServiceWorkerBackground(String str, String str2);

    void registerServiceWorkerOffline(String str, List<String> list, boolean z10);

    void reloadCustomMetaData();

    void removeHistoryItem(int i10);

    void replaceAllInputText(String str);

    void replyListBox(int i10);

    void replyMultiListBox(int i10, boolean[] zArr);

    boolean requestFocusForInputNode(int i10);

    void retrieveFingerSearchContext(int i10);

    void savePageToDisk(String str, Message message);

    void savePageToDisk(String str, boolean z10, int i10, ValueCallback<String> valueCallback);

    void scrollBy(int i10, int i11);

    void scrollTo(int i10, int i11);

    int seletionStatus();

    void sendNeverRememberMsg(String str, String str2, String str3, Message message);

    void sendRememberMsg(String str, String str2, String str3, Message message);

    void sendRememberMsg(String str, String str2, String str3, String str4, String str5);

    void sendResumeMsg(String str, String str2, String str3, Message message);

    void setAudioAutoPlayNotify(boolean z10);

    void setBackFromSystem();

    void setDisableDrawingWhileLosingFocus(boolean z10);

    void setDrawWithBuffer(boolean z10);

    void setEmbTitleView(View view, ViewGroup.LayoutParams layoutParams);

    void setForceEnableZoom(boolean z10);

    void setHandleViewBitmap(Bitmap bitmap, Bitmap bitmap2, int i10, int i11);

    void setHandleViewLineColor(int i10, int i11);

    void setHandleViewLineIsShowing(boolean z10, int i10);

    void setHandleViewSelectionColor(int i10, int i11);

    void setHorizontalScrollBarDrawable(Drawable drawable);

    void setHorizontalScrollBarEnabled(boolean z10);

    void setHorizontalTrackDrawable(Drawable drawable);

    void setIsForVideoSniff(boolean z10);

    void setLongPressTextExtensionMenu(int i10);

    void setOrientation(int i10);

    void setOverScrollParams(int i10, int i11, int i12, int i13, int i14, int i15, Drawable drawable, Drawable drawable2, Drawable drawable3);

    void setRenderMode(int i10);

    void setScreenState(int i10);

    void setScrollBarDefaultDelayBeforeFade(int i10);

    void setScrollBarFadeDuration(int i10);

    void setScrollBarFadingEnabled(boolean z10);

    void setScrollBarSize(int i10);

    void setScrollListener(IX5ScrollListener iX5ScrollListener);

    void setSelectListener(ISelectionInterface iSelectionInterface);

    void setSharedVideoTime(int i10);

    void setSniffVideoInfo(String str, int i10, String str2, String str3);

    void setTextFieldInLongPressStatus(boolean z10);

    void setVerticalScrollBarDrawable(Drawable drawable);

    void setVerticalScrollBarEnabled(boolean z10);

    void setVerticalTrackDrawable(Drawable drawable);

    void setWebBackForwardListClient(IX5WebBackForwardListClient iX5WebBackForwardListClient);

    void setWebChromeClientExtension(IX5WebChromeClientExtension iX5WebChromeClientExtension);

    void setWebViewClientExtension(IX5WebViewClientExtension iX5WebViewClientExtension);

    boolean shouldFitScreenLayout();

    void showImage(int i10, int i11);

    Drawable snapshot(int i10, boolean z10);

    void snapshotVisible(Canvas canvas, boolean z10, boolean z11, boolean z12, boolean z13);

    void snapshotWholePage(Canvas canvas, boolean z10, boolean z11);

    void trimMemory(int i10);

    void unRegisterServiceWorker(String str, boolean z10);

    void updateContext(Context context);

    void updateImageList(int i10, int i11, boolean z10);

    void updateSelectionPosition();

    void updateServiceWorkerBackground(String str);

    void waitSWInstalled(String str, Message message);

    Drawable wrapDrawableWithNativeBitmap(Drawable drawable, int i10, Bitmap.Config config);
}
