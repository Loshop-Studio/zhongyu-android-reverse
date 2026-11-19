package com.tencent.liteav;

import com.tencent.ijk.media.player.IMediaPlayer;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.audio.TXCAudioEngine;
import com.tencent.liteav.basic.module.StatusBucket;
import com.tencent.liteav.basic.module.TXCStatus;
import com.tencent.smtt.audio.core.utils.TbsDialogBase;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.tencent.liteav.a */
/* loaded from: classes4.dex */
public class C6526a {
    /* renamed from: a */
    public static void m4702a(String str, ArrayList<String> arrayList) {
        StatusBucket status = TXCAudioEngine.getInstance().getStatus(1);
        TXCStatus.m5008a(str, 14003, Integer.valueOf(status.getIntStatus("18446744073709551615", 10001)));
        TXCStatus.m5008a(str, 8005, Integer.valueOf(status.getIntStatus("18446744073709551615", 10002)));
        TXCStatus.m5008a(str, 14017, Integer.valueOf(status.getIntStatus("18446744073709551615", TbsDialogBase.BTN_ID_POSITIVE)));
        TXCStatus.m5008a(str, 14002, Integer.valueOf(status.getIntStatus("18446744073709551615", IjkMediaPlayer.FFP_PROP_FLOAT_PLAYBACK_RATE)));
        TXCStatus.m5008a(str, 14006, Integer.valueOf(status.getIntStatus("18446744073709551615", IjkMediaPlayer.FFP_PROP_FLOAT_AVDELAY)));
        TXCStatus.m5008a(str, 14018, Integer.valueOf(status.getIntStatus("18446744073709551615", IjkMediaPlayer.FFP_PROP_FLOAT_AVDIFF)));
        TXCStatus.m5008a(str, 18029, Integer.valueOf(status.getIntStatus("18446744073709551615", 10006)));
        if (arrayList == null) {
            return;
        }
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            int intStatus = status.getIntStatus(next, 10114);
            int intStatus2 = status.getIntStatus(next, 10115);
            TXCStatus.m5008a(next, 18031, Integer.valueOf(intStatus));
            TXCStatus.m5008a(next, 18032, Integer.valueOf(intStatus2));
            int i10 = 0;
            TXCStatus.m5008a(next, 2001, Integer.valueOf(intStatus2 > 0 ? intStatus / intStatus2 : 0));
            TXCStatus.m5008a(next, 2002, Integer.valueOf(intStatus2));
            TXCStatus.m5008a(next, 2005, Integer.valueOf(intStatus2));
            TXCStatus.m5008a(next, 2004, Integer.valueOf(status.getIntStatus(next, 10300)));
            TXCStatus.m5008a(next, 2008, Integer.valueOf(status.getIntStatus(next, 10112)));
            TXCStatus.m5008a(next, 2010, Integer.valueOf(status.getIntStatus(next, 10106)));
            TXCStatus.m5008a(next, 2007, Integer.valueOf(status.getIntStatus(next, 10105)));
            TXCStatus.m5008a(next, 2011, Integer.valueOf(status.getIntStatus(next, 10107)));
            TXCStatus.m5008a(next, 18001, Integer.valueOf(status.getIntStatus(next, 10103)));
            TXCStatus.m5008a(next, 18002, Integer.valueOf(status.getIntStatus(next, 10104)));
            TXCStatus.m5008a(next, 18006, Integer.valueOf(status.getIntStatus(next, 10202)));
            TXCStatus.m5008a(next, 18007, Integer.valueOf(status.getIntStatus(next, 10203)));
            TXCStatus.m5008a(next, 18008, Integer.valueOf(status.getIntStatus(next, 10204)));
            TXCStatus.m5008a(next, 18015, Integer.valueOf(status.getIntStatus(next, 10205)));
            TXCStatus.m5008a(next, 18013, Integer.valueOf(status.getIntStatus(next, 10206)));
            int intStatus3 = status.getIntStatus(next, 10203);
            int intStatus4 = status.getIntStatus(next, 10202);
            if (intStatus4 > 0) {
                i10 = (intStatus3 * 100) / intStatus4;
            }
            TXCStatus.m5008a(next, 18014, Integer.valueOf(i10));
            TXCStatus.m5008a(next, 18023, Integer.valueOf(status.getIntStatus(next, 10200)));
            TXCStatus.m5008a(next, 18026, Integer.valueOf(status.getIntStatus(next, 10110)));
            TXCStatus.m5008a(next, 18027, Integer.valueOf(status.getIntStatus(next, 10111)));
            TXCStatus.m5008a(next, 18028, Integer.valueOf(status.getIntStatus(next, 10201)));
            TXCStatus.m5008a(next, 18030, Integer.valueOf(status.getIntStatus(next, 10113)));
            TXCStatus.m5008a(next, 18003, Integer.valueOf(status.getIntStatus(next, IMediaPlayer.MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE)));
            TXCStatus.m5008a(next, TXLiteAVCode.EVT_VOD_PLAY_SEEK_COMPLETE, Integer.valueOf(status.getIntStatus(next, IMediaPlayer.MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE)));
            TXCStatus.m5008a(next, TXLiteAVCode.EVT_VIDEO_DECODER_CACHE_TOO_MANY_FRAMES, Integer.valueOf(status.getIntStatus(next, 10101)));
            TXCStatus.m5008a(next, 18016, Integer.valueOf(status.getIntStatus(next, 10102)));
            TXCStatus.m5008a(next, 18009, Integer.valueOf(status.getIntStatus(next, 10207)));
            TXCStatus.m5008a(next, 18010, Integer.valueOf(status.getIntStatus(next, 10208)));
            TXCStatus.m5008a(next, 18012, Integer.valueOf(status.getIntStatus(next, 10209)));
            TXCStatus.m5008a(next, TXLiteAVCode.EVT_HW_DECODER_START_SUCC, Integer.valueOf(status.getIntStatus(next, 10109)));
        }
    }
}
