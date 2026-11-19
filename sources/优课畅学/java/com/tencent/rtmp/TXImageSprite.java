package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import com.tencent.liteav.basic.datareport.C6574a;
import com.tencent.liteav.basic.datareport.TXCDRApi;
import com.tencent.rtmp.p055a.C6729b;
import com.tencent.rtmp.p055a.InterfaceC6728a;
import java.util.List;

/* loaded from: classes4.dex */
public class TXImageSprite implements InterfaceC6728a {
    private Context mContext;
    private InterfaceC6728a mImageSprite;

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
        TXCDRApi.initCrashReport(context);
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public Bitmap getThumbnail(float f10) {
        InterfaceC6728a interfaceC6728a = this.mImageSprite;
        if (interfaceC6728a != null) {
            return interfaceC6728a.getThumbnail(f10);
        }
        return null;
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public void release() {
        InterfaceC6728a interfaceC6728a = this.mImageSprite;
        if (interfaceC6728a != null) {
            interfaceC6728a.release();
            this.mImageSprite = null;
        }
    }

    @Override // com.tencent.rtmp.p055a.InterfaceC6728a
    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        TXCDRApi.txReportDAU(this.mContext, C6574a.f5399bC);
        C6729b c6729b = new C6729b();
        this.mImageSprite = c6729b;
        c6729b.setVTTUrlAndImageUrls(str, list);
    }
}
