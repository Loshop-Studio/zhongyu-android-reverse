package p218k5;

import android.content.Context;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p247m5.C10200a;

/* renamed from: k5.e */
/* loaded from: classes5.dex */
public abstract class AbstractC9815e {

    /* renamed from: k5.e$a */
    public class a implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ long f23045c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f23046d;

        /* renamed from: e */
        public final /* synthetic */ JSONArray f23047e;

        public a(long j10, ArrayList arrayList, JSONArray jSONArray) {
            this.f23045c = j10;
            this.f23046d = arrayList;
            this.f23047e = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            C10200a c10200a = new C10200a();
            c10200a.put("total_time", this.f23045c);
            Iterator it = this.f23046d.iterator();
            while (it.hasNext()) {
                C9814d c9814d = (C9814d) it.next();
                if (c9814d.m19844D() || c9814d.m19842B()) {
                    c10200a.put(AbstractC9815e.m19877c(c9814d));
                    it.remove();
                    break;
                }
            }
            if (this.f23046d.size() > 0) {
                C9814d c9814d2 = (C9814d) this.f23046d.get(r1.size() - 1);
                c10200a.put(AbstractC9815e.m19877c(c9814d2));
                this.f23046d.remove(c9814d2);
            }
            if (this.f23046d.size() > 0) {
                ArrayList arrayList = this.f23046d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    this.f23047e.put(new JSONObject(AbstractC9815e.m19877c((C9814d) obj)));
                }
            }
            if (this.f23047e.length() > 0) {
                c10200a.put("failed_info", this.f23047e.toString());
            }
            Logger.m8572d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(c10200a.get()));
            HianalyticsHelper.getInstance().onEvent(c10200a.get(), "grs_request");
        }
    }

    /* renamed from: b */
    public static void m19876b(ArrayList arrayList, long j10, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReport(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j10, arrayList, jSONArray));
    }

    /* renamed from: c */
    public static LinkedHashMap m19877c(C9814d c9814d) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception excM19864p = c9814d.m19864p();
        if (excM19864p != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(excM19864p));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, excM19864p.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(excM19864p.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", c9814d.m19854f());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, c9814d.m19859k());
        }
        try {
            linkedHashMapPack.put(DispatchConstants.DOMAIN, new URL(c9814d.m19841A()).getHost());
        } catch (MalformedURLException e10) {
            Logger.m8589w("HaReportHelper", "report host MalformedURLException", e10);
        }
        linkedHashMapPack.put("req_start_time", c9814d.m19871w());
        linkedHashMapPack.put("req_end_time", c9814d.m19870v());
        linkedHashMapPack.put("req_total_time", c9814d.m19872x());
        return linkedHashMapPack.getAll();
    }
}
