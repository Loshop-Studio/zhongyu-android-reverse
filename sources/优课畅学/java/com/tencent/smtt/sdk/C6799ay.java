package com.tencent.smtt.sdk;

import android.os.Bundle;
import androidx.autofill.HintConstants;
import com.tencent.smtt.sdk.TbsReaderView;
import com.tencent.smtt.sdk.p058a.C6774d;

/* renamed from: com.tencent.smtt.sdk.ay */
/* loaded from: classes4.dex */
class C6799ay implements TbsReaderView.ReaderCallback {

    /* renamed from: a */
    final /* synthetic */ TbsReaderView f6839a;

    public C6799ay(TbsReaderView tbsReaderView) {
        this.f6839a = tbsReaderView;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0021. Please report as an issue. */
    @Override // com.tencent.smtt.sdk.TbsReaderView.ReaderCallback
    public void onCallBackAction(Integer num, Object obj, Object obj2) {
        TbsReaderView tbsReaderView;
        String str;
        TbsReaderView tbsReaderView2;
        String str2;
        Object obj3;
        Bundle bundle;
        Object obj4;
        Integer numValueOf = Integer.valueOf(TbsReaderView.ReaderCallback.INSTALL_QB);
        int iIntValue = num.intValue();
        String string = "";
        Bundle bundle2 = null;
        boolean z10 = true;
        if (iIntValue != 5026) {
            if (iIntValue != 5030) {
                switch (iIntValue) {
                    case TbsReaderView.ReaderCallback.READER_PDF_LIST /* 5008 */:
                        if (!C6774d.m6003c(this.f6839a.f6669a)) {
                            String resString = TbsReaderView.getResString(this.f6839a.f6669a, TbsReaderView.ReaderCallback.READER_PLUGIN_RES_PDF_GUIDE);
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("tip", resString);
                            bundle3.putString("statistics", TbsReaderView.READER_STATISTICS_COUNT_PDF_INTO_DOWNLOAD);
                            bundle3.putInt("channel_id", TbsReaderView.READER_CHANNEL_PDF_ID);
                            tbsReaderView2 = this.f6839a;
                            str2 = TbsReaderView.READER_STATISTICS_COUNT_PDF_INTO_DIALOG;
                            bundle = bundle3;
                            tbsReaderView2.userStatistics(str2);
                            obj4 = bundle;
                            z10 = false;
                            obj3 = obj4;
                            break;
                        } else {
                            if (obj != null) {
                                bundle2 = (Bundle) obj;
                                string = bundle2.getString("docpath");
                            }
                            QbSdk.startQBForDoc(this.f6839a.f6669a, string, 4, 0, "pdf", bundle2);
                            tbsReaderView = this.f6839a;
                            str = TbsReaderView.READER_STATISTICS_COUNT_PDF_INTO_BROWSER;
                            tbsReaderView.userStatistics(str);
                            break;
                        }
                    case TbsReaderView.ReaderCallback.READER_PPT_PLAY_MODEL /* 5009 */:
                        if (!C6774d.m6003c(this.f6839a.f6669a)) {
                            String resString2 = TbsReaderView.getResString(this.f6839a.f6669a, TbsReaderView.ReaderCallback.READER_PLUGIN_RES_PPT_GUIDE);
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("tip", resString2);
                            bundle4.putString("statistics", TbsReaderView.READER_STATISTICS_COUNT_PPT_INTO_DOWNLOAD);
                            bundle4.putInt("channel_id", TbsReaderView.READER_CHANNEL_PPT_ID);
                            tbsReaderView2 = this.f6839a;
                            str2 = TbsReaderView.READER_STATISTICS_COUNT_PPT_INTO_DIALOG;
                            bundle = bundle4;
                            tbsReaderView2.userStatistics(str2);
                            obj4 = bundle;
                            z10 = false;
                            obj3 = obj4;
                            break;
                        } else {
                            if (obj != null) {
                                bundle2 = (Bundle) obj;
                                string = bundle2.getString("docpath");
                            }
                            QbSdk.startQBForDoc(this.f6839a.f6669a, string, 4, 0, "", bundle2);
                            tbsReaderView = this.f6839a;
                            str = TbsReaderView.READER_STATISTICS_COUNT_PPT_INTO_BROWSER;
                            tbsReaderView.userStatistics(str);
                            break;
                        }
                    case TbsReaderView.ReaderCallback.READER_TXT_READING_MODEL /* 5010 */:
                        if (!C6774d.m6003c(this.f6839a.f6669a)) {
                            String resString3 = TbsReaderView.getResString(this.f6839a.f6669a, TbsReaderView.ReaderCallback.READER_PLUGIN_RES_TXT_GUIDE);
                            Bundle bundle5 = new Bundle();
                            bundle5.putString("tip", resString3);
                            bundle5.putString("statistics", TbsReaderView.READER_STATISTICS_COUNT_TXT_INTO_DOWNLOAD);
                            bundle5.putInt("channel_id", TbsReaderView.READER_CHANNEL_TXT_ID);
                            tbsReaderView2 = this.f6839a;
                            str2 = TbsReaderView.READER_STATISTICS_COUNT_TXT_INTO_DIALOG;
                            bundle = bundle5;
                            tbsReaderView2.userStatistics(str2);
                            obj4 = bundle;
                            z10 = false;
                            obj3 = obj4;
                            break;
                        } else {
                            if (obj != null) {
                                bundle2 = (Bundle) obj;
                                string = bundle2.getString("docpath");
                            }
                            QbSdk.startQBForDoc(this.f6839a.f6669a, string, 4, 0, "txt", bundle2);
                            break;
                        }
                    default:
                        numValueOf = num;
                        obj4 = obj;
                        z10 = false;
                        obj3 = obj4;
                        break;
                }
            } else if (obj != null) {
                Bundle bundle6 = (Bundle) obj;
                TbsReaderView.gReaderPackName = bundle6.getString(HintConstants.AUTOFILL_HINT_NAME);
                TbsReaderView.gReaderPackVersion = bundle6.getString("version");
            }
            numValueOf = num;
            obj3 = obj;
        } else if (C6774d.m6003c(this.f6839a.f6669a)) {
            if (obj != null) {
                bundle2 = (Bundle) obj;
                string = bundle2.getString("docpath");
            }
            QbSdk.startQBForDoc(this.f6839a.f6669a, string, 4, 0, "doc", bundle2);
            tbsReaderView = this.f6839a;
            str = TbsReaderView.READER_STATISTICS_COUNT_DOC_INTO_BROWSER;
            tbsReaderView.userStatistics(str);
            numValueOf = num;
            obj3 = obj;
        } else {
            String resString4 = TbsReaderView.getResString(this.f6839a.f6669a, TbsReaderView.ReaderCallback.READER_PLUGIN_RES_DOC_GUIDE);
            Bundle bundle7 = new Bundle();
            bundle7.putString("tip", resString4);
            bundle7.putString("statistics", TbsReaderView.READER_STATISTICS_COUNT_DOC_INTO_DOWNLOAD);
            bundle7.putInt("channel_id", TbsReaderView.READER_CHANNEL_DOC_ID);
            tbsReaderView2 = this.f6839a;
            str2 = TbsReaderView.READER_STATISTICS_COUNT_DOC_INTO_DIALOG;
            bundle = bundle7;
            tbsReaderView2.userStatistics(str2);
            obj4 = bundle;
            z10 = false;
            obj3 = obj4;
        }
        TbsReaderView.ReaderCallback readerCallback = this.f6839a.f6672d;
        if (readerCallback == null || z10) {
            return;
        }
        readerCallback.onCallBackAction(numValueOf, obj3, obj2);
    }
}
