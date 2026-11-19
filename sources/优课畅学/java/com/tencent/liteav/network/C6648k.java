package com.tencent.liteav.network;

import android.content.Context;
import android.os.Handler;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: com.tencent.liteav.network.k */
/* loaded from: classes4.dex */
public class C6648k {

    /* renamed from: a */
    private final int f5862a = 5;

    /* renamed from: b */
    private final int f5863b = 2;

    /* renamed from: c */
    private String f5864c = "";

    /* renamed from: d */
    private String f5865d = "";

    /* renamed from: e */
    private int f5866e = 0;

    /* renamed from: f */
    private String f5867f = "";

    /* renamed from: g */
    private Handler f5868g;

    /* renamed from: com.tencent.liteav.network.k$a */
    public interface a {
        /* renamed from: a */
        void mo5236a(int i10, String str, Vector<C6642e> vector);
    }

    public C6648k(Context context) {
        if (context != null) {
            this.f5868g = new Handler(context.getMainLooper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public long m5321e() {
        return C6573c.m4883a().m4908a("Network", "AccRetryCountWithoutSecret");
    }

    /* renamed from: d */
    public String m5326d() {
        return this.f5867f;
    }

    /* renamed from: c */
    public int m5325c() {
        return this.f5866e;
    }

    /* renamed from: b */
    public String m5324b() {
        return this.f5865d;
    }

    /* renamed from: a */
    public String m5323a() {
        return this.f5864c;
    }

    /* renamed from: a */
    public int m5322a(String str, int i10, final a aVar) {
        this.f5864c = "";
        this.f5865d = "";
        this.f5866e = 0;
        this.f5867f = "";
        if (str == null || str.isEmpty()) {
            return -1;
        }
        final String streamIDByStreamUrl = TXCCommonUtil.getStreamIDByStreamUrl(str);
        if (streamIDByStreamUrl == null || streamIDByStreamUrl.isEmpty()) {
            return -2;
        }
        final String strM5314a = m5314a("bizid", str);
        final String strM5314a2 = m5314a("txSecret", str);
        final String strM5314a3 = m5314a("txTime", str);
        if (!m5317a(true, strM5314a, strM5314a3, strM5314a2)) {
            return -3;
        }
        m5315a(streamIDByStreamUrl, strM5314a, strM5314a2, strM5314a3, i10, new a() { // from class: com.tencent.liteav.network.k.1
            @Override // com.tencent.liteav.network.C6648k.a
            /* renamed from: a */
            public void mo5236a(int i11, String str2, Vector<C6642e> vector) {
                C6648k.this.f5864c = streamIDByStreamUrl;
                C6648k.this.f5865d = strM5314a;
                C6648k.this.f5866e = i11;
                C6648k.this.f5867f = str2;
                if (vector == null || vector.isEmpty()) {
                    a aVar2 = aVar;
                    if (aVar2 != null) {
                        aVar2.mo5236a(i11, str2, null);
                        return;
                    }
                    return;
                }
                Vector<C6642e> vector2 = new Vector<>();
                Iterator<C6642e> it = vector.iterator();
                while (it.hasNext()) {
                    C6642e next = it.next();
                    String strSubstring = next.f5829a;
                    if (strSubstring.indexOf("?") != -1) {
                        strSubstring = strSubstring.substring(0, strSubstring.indexOf("?"));
                    }
                    vector2.add(new C6642e(strSubstring + "?txSecret=" + strM5314a2 + "&txTime=" + strM5314a3 + "&bizid=" + strM5314a, next.f5830b));
                }
                if (aVar != null) {
                    Iterator<C6642e> it2 = vector2.iterator();
                    while (it2.hasNext()) {
                        C6642e next2 = it2.next();
                        TXCLog.m4991e("TXRTMPAccUrlFetcher", "accurl = " + next2.f5829a + " quic = " + next2.f5830b);
                    }
                    aVar.mo5236a(i11, str2, vector2);
                }
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m5317a(boolean z10, String str, String str2, String str3) {
        return z10 ? (str == null || str.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) ? false : true : (str == null || str2 == null || str3 == null) ? false : true;
    }

    /* renamed from: a */
    private void m5315a(final String str, final String str2, final String str3, final String str4, final int i10, final a aVar) {
        new Thread("getRTMPAccUrl") { // from class: com.tencent.liteav.network.k.2
            /* JADX WARN: Can't wrap try/catch for region: R(16:113|17|(1:19)(1:23)|24|(2:25|(1:27)(1:126))|28|(1:30)|(3:32|(1:34)|35)|36|(7:38|(6:107|40|(2:42|72)(4:43|(4:46|(10:48|49|111|50|(1:52)(1:53)|54|55|109|56|(1:131)(1:(2:61|132)(2:64|133)))(2:69|129)|70|44)|128|71)|73|74|(3:115|76|(3:78|121|135))(2:83|(3:117|85|(3:122|87|134))(5:90|(2:93|91)|127|94|(3:123|96|97))))(0)|100|118|101|125|104)(1:98)|82|100|118|101|125|104) */
            /* JADX WARN: Code restructure failed: missing block: B:103:0x0292, code lost:
            
                com.tencent.liteav.basic.log.TXCLog.m4991e("TXRTMPAccUrlFetcher", "getAccelerateStreamPlayUrl exception sleep");
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:113:0x004a A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
            /* JADX WARN: Type inference failed for: r11v0 */
            /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
            /* JADX WARN: Type inference failed for: r11v14 */
            /* JADX WARN: Type inference failed for: r11v2 */
            /* JADX WARN: Type inference failed for: r11v20 */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() throws org.json.JSONException, java.lang.InterruptedException, java.io.IOException {
                /*
                    Method dump skipped, instructions count: 686
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.liteav.network.C6648k.AnonymousClass2.run():void");
            }
        }.start();
    }

    /* renamed from: a */
    private String m5314a(String str, String str2) {
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        for (String str3 : str2.split("[?&]")) {
            if (str3.indexOf("=") != -1) {
                String[] strArrSplit = str3.split("[=]");
                if (strArrSplit.length == 2) {
                    String str4 = strArrSplit[0];
                    String str5 = strArrSplit[1];
                    if (str4 != null && str4.toLowerCase().equalsIgnoreCase(lowerCase)) {
                        return str5;
                    }
                } else {
                    continue;
                }
            }
        }
        return "";
    }
}
