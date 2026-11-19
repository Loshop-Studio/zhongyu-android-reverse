package com.tencent.smtt.sdk;

import com.tencent.smtt.export.external.interfaces.IX5WebBackForwardList;

/* loaded from: classes4.dex */
public class WebBackForwardList {

    /* renamed from: a */
    private IX5WebBackForwardList f6685a = null;

    /* renamed from: b */
    private android.webkit.WebBackForwardList f6686b = null;

    /* renamed from: a */
    public static WebBackForwardList m5942a(android.webkit.WebBackForwardList webBackForwardList) {
        if (webBackForwardList == null) {
            return null;
        }
        WebBackForwardList webBackForwardList2 = new WebBackForwardList();
        webBackForwardList2.f6686b = webBackForwardList;
        return webBackForwardList2;
    }

    public int getCurrentIndex() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f6685a;
        return iX5WebBackForwardList != null ? iX5WebBackForwardList.getCurrentIndex() : this.f6686b.getCurrentIndex();
    }

    public WebHistoryItem getCurrentItem() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f6685a;
        return iX5WebBackForwardList != null ? WebHistoryItem.m5945a(iX5WebBackForwardList.getCurrentItem()) : WebHistoryItem.m5944a(this.f6686b.getCurrentItem());
    }

    public WebHistoryItem getItemAtIndex(int i10) {
        IX5WebBackForwardList iX5WebBackForwardList = this.f6685a;
        return iX5WebBackForwardList != null ? WebHistoryItem.m5945a(iX5WebBackForwardList.getItemAtIndex(i10)) : WebHistoryItem.m5944a(this.f6686b.getItemAtIndex(i10));
    }

    public int getSize() {
        IX5WebBackForwardList iX5WebBackForwardList = this.f6685a;
        return iX5WebBackForwardList != null ? iX5WebBackForwardList.getSize() : this.f6686b.getSize();
    }

    /* renamed from: a */
    public static WebBackForwardList m5943a(IX5WebBackForwardList iX5WebBackForwardList) {
        if (iX5WebBackForwardList == null) {
            return null;
        }
        WebBackForwardList webBackForwardList = new WebBackForwardList();
        webBackForwardList.f6685a = iX5WebBackForwardList;
        return webBackForwardList;
    }
}
