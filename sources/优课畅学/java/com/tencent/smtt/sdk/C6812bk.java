package com.tencent.smtt.sdk;

import android.content.pm.PackageManager;
import com.tencent.smtt.sdk.p058a.C6774d;

/* renamed from: com.tencent.smtt.sdk.bk */
/* loaded from: classes4.dex */
class C6812bk implements android.webkit.DownloadListener {

    /* renamed from: a */
    final /* synthetic */ DownloadListener f6870a;

    /* renamed from: b */
    final /* synthetic */ WebView f6871b;

    public C6812bk(WebView webView, DownloadListener downloadListener) {
        this.f6871b = webView;
        this.f6870a = downloadListener;
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) throws PackageManager.NameNotFoundException {
        DownloadListener downloadListener = this.f6870a;
        if (downloadListener == null) {
            C6774d.m5994a(this.f6871b.f6712i, str, null, null);
        } else {
            downloadListener.onDownloadStart(str, str2, str3, str4, j10);
        }
    }
}
