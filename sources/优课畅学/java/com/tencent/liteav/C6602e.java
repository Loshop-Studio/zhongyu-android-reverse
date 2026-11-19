package com.tencent.liteav;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.tencent.liteav.e */
/* loaded from: classes4.dex */
public class C6602e {

    /* renamed from: a */
    private String f5629a = "";

    /* renamed from: b */
    private String f5630b = "";

    /* renamed from: c */
    private int f5631c = 0;

    /* renamed from: d */
    private String f5632d = "";

    /* renamed from: e */
    private String f5633e = "";

    /* renamed from: f */
    private long f5634f = 0;

    /* renamed from: com.tencent.liteav.e$a */
    public interface a {
        /* renamed from: a */
        void mo5140a(long j10);
    }

    /* renamed from: a */
    public long m5138a() {
        return System.currentTimeMillis() - this.f5634f;
    }

    /* renamed from: a */
    public String m5139a(long j10) {
        String str = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date(this.f5634f + (j10 * 1000)));
        int i10 = this.f5631c;
        if (i10 < 0) {
            return String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=%d", this.f5629a, this.f5633e, this.f5630b, Long.valueOf(((System.currentTimeMillis() - this.f5634f) - j10) / 1000));
        }
        return String.format("http://%s/%s/%s/timeshift.m3u8?starttime=%s&appid=%s&txKbps=0", this.f5629a, Integer.valueOf(i10), this.f5630b, str, this.f5632d);
    }

    /* renamed from: a */
    public int m5137a(final String str, final String str2, final int i10, final a aVar) {
        if (str == null || str.isEmpty()) {
            return -1;
        }
        String appID = TXCCommonUtil.getAppID();
        this.f5632d = appID;
        if (TextUtils.isEmpty(appID)) {
            return -2;
        }
        AsyncTask.execute(new Runnable() { // from class: com.tencent.liteav.e.1
            @Override // java.lang.Runnable
            public void run() throws IOException {
                C6602e.this.f5634f = System.currentTimeMillis();
                String str3 = "";
                C6602e.this.f5630b = "";
                C6602e.this.f5631c = i10;
                C6602e.this.f5629a = str2;
                C6602e.this.f5630b = TXCCommonUtil.getStreamIDByStreamUrl(str);
                C6602e.this.f5633e = TXCCommonUtil.getAppNameByStreamUrl(str);
                if (C6602e.this.f5633e == null) {
                    C6602e.this.f5633e = "live";
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(C6602e.this.f5631c < 0 ? String.format("http://%s/timeshift/%s/%s/timeshift.m3u8?delay=0", C6602e.this.f5629a, C6602e.this.f5633e, C6602e.this.f5630b) : String.format("http://%s/%s/%s/timeshift.m3u8?delay=0&appid=%s&txKbps=0", C6602e.this.f5629a, Integer.valueOf(C6602e.this.f5631c), C6602e.this.f5630b, C6602e.this.f5632d)).openConnection();
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setRequestProperty("Charsert", "UTF-8");
                    httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "text/plain;");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str3 = str3 + line;
                    }
                    TXCLog.m4994i("TXCTimeShiftUtil", "prepareSeekTime: receive response, strResponse = " + str3);
                    String strM5128a = C6602e.this.m5128a(str3);
                    if (strM5128a != null) {
                        C6602e.this.f5634f = Long.parseLong(strM5128a) * 1000;
                    }
                } catch (Exception e10) {
                    C6602e.this.f5634f = System.currentTimeMillis();
                    TXCLog.m4991e("TXCTimeShiftUtil", "prepareSeekTime error " + e10.toString());
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                TXCLog.m4994i("TXCTimeShiftUtil", "live start time:" + C6602e.this.f5634f + ",currentTime:" + jCurrentTimeMillis + ",diff:" + (jCurrentTimeMillis - C6602e.this.f5634f));
                final long j10 = jCurrentTimeMillis - C6602e.this.f5634f;
                if (aVar != null) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.liteav.e.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            aVar.mo5140a(j10);
                        }
                    });
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m5128a(String str) {
        int iIndexOf;
        String strSubstring;
        int iIndexOf2;
        if (!str.contains("#EXT-TX-TS-START-TIME") || (iIndexOf = str.indexOf("#EXT-TX-TS-START-TIME:") + 22) <= 0 || (iIndexOf2 = (strSubstring = str.substring(iIndexOf)).indexOf("#")) <= 0) {
            return null;
        }
        return strSubstring.substring(0, iIndexOf2).replaceAll("\r\n", "");
    }
}
