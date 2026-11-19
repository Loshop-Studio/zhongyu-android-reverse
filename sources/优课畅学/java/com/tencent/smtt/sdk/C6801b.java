package com.tencent.smtt.sdk;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.tencent.smtt.sdk.p058a.C6774d;

/* renamed from: com.tencent.smtt.sdk.b */
/* loaded from: classes4.dex */
class C6801b implements com.tencent.smtt.export.external.interfaces.DownloadListener {

    /* renamed from: a */
    private DownloadListener f6840a;

    /* renamed from: b */
    private WebView f6841b;

    public C6801b(WebView webView, DownloadListener downloadListener, boolean z10) {
        this.f6840a = downloadListener;
        this.f6841b = webView;
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j10) throws PackageManager.NameNotFoundException {
        onDownloadStart(str, null, null, str2, str3, str4, j10, null, null);
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadVideo(String str, long j10, int i10) {
    }

    @Override // com.tencent.smtt.export.external.interfaces.DownloadListener
    public void onDownloadStart(String str, String str2, byte[] bArr, String str3, String str4, String str5, long j10, String str6, String str7) throws PackageManager.NameNotFoundException {
        DownloadListener downloadListener = this.f6840a;
        if (downloadListener != null) {
            downloadListener.onDownloadStart(str, str3, str4, str5, j10);
            return;
        }
        if (!QbSdk.canOpenMimeFileType(this.f6841b.getContext(), str5)) {
            C6774d.m5994a(this.f6841b.getContext(), str, null, null);
            return;
        }
        Intent intent = new Intent("com.tencent.QQBrowser.action.sdk.document");
        intent.setFlags(268435456);
        intent.putExtra("key_reader_sdk_url", str);
        intent.putExtra("key_reader_sdk_type", 1);
        intent.setData(Uri.parse(str));
        this.f6841b.getContext().startActivity(intent);
    }
}
