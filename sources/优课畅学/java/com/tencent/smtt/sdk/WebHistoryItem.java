package com.tencent.smtt.sdk;

import android.graphics.Bitmap;
import com.tencent.smtt.export.external.interfaces.IX5WebHistoryItem;

/* loaded from: classes4.dex */
public class WebHistoryItem {

    /* renamed from: a */
    private IX5WebHistoryItem f6687a = null;

    /* renamed from: b */
    private android.webkit.WebHistoryItem f6688b = null;

    private WebHistoryItem() {
    }

    /* renamed from: a */
    public static WebHistoryItem m5944a(android.webkit.WebHistoryItem webHistoryItem) {
        if (webHistoryItem == null) {
            return null;
        }
        WebHistoryItem webHistoryItem2 = new WebHistoryItem();
        webHistoryItem2.f6688b = webHistoryItem;
        return webHistoryItem2;
    }

    public Bitmap getFavicon() {
        IX5WebHistoryItem iX5WebHistoryItem = this.f6687a;
        return iX5WebHistoryItem != null ? iX5WebHistoryItem.getFavicon() : this.f6688b.getFavicon();
    }

    public String getOriginalUrl() {
        IX5WebHistoryItem iX5WebHistoryItem = this.f6687a;
        return iX5WebHistoryItem != null ? iX5WebHistoryItem.getOriginalUrl() : this.f6688b.getOriginalUrl();
    }

    public String getTitle() {
        IX5WebHistoryItem iX5WebHistoryItem = this.f6687a;
        return iX5WebHistoryItem != null ? iX5WebHistoryItem.getTitle() : this.f6688b.getTitle();
    }

    public String getUrl() {
        IX5WebHistoryItem iX5WebHistoryItem = this.f6687a;
        return iX5WebHistoryItem != null ? iX5WebHistoryItem.getUrl() : this.f6688b.getUrl();
    }

    /* renamed from: a */
    public static WebHistoryItem m5945a(IX5WebHistoryItem iX5WebHistoryItem) {
        if (iX5WebHistoryItem == null) {
            return null;
        }
        WebHistoryItem webHistoryItem = new WebHistoryItem();
        webHistoryItem.f6687a = iX5WebHistoryItem;
        return webHistoryItem;
    }
}
