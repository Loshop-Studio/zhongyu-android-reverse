package p218k5;

import android.text.TextUtils;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.p087a.p088a.AbstractC7706b;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: k5.d */
/* loaded from: classes5.dex */
public class C9814d {

    /* renamed from: o */
    public static final String f23030o = "d";

    /* renamed from: a */
    public Map f23031a;

    /* renamed from: b */
    public byte[] f23032b;

    /* renamed from: c */
    public int f23033c;

    /* renamed from: d */
    public long f23034d;

    /* renamed from: e */
    public long f23035e;

    /* renamed from: f */
    public long f23036f;

    /* renamed from: g */
    public String f23037g;

    /* renamed from: h */
    public int f23038h;

    /* renamed from: i */
    public int f23039i;

    /* renamed from: j */
    public String f23040j;

    /* renamed from: k */
    public long f23041k;

    /* renamed from: l */
    public String f23042l;

    /* renamed from: m */
    public Exception f23043m;

    /* renamed from: n */
    public String f23044n;

    public C9814d(int i10, Map map, byte[] bArr, long j10) throws NumberFormatException {
        this.f23038h = 2;
        this.f23039i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f23040j = "";
        this.f23041k = 0L;
        this.f23042l = "";
        this.f23033c = i10;
        this.f23031a = map;
        this.f23032b = ByteBuffer.wrap(bArr).array();
        this.f23034d = j10;
        m19848H();
    }

    /* renamed from: A */
    public String m19841A() {
        return this.f23044n;
    }

    /* renamed from: B */
    public boolean m19842B() {
        return this.f23033c == 304;
    }

    /* renamed from: C */
    public boolean m19843C() {
        return this.f23033c == 503;
    }

    /* renamed from: D */
    public boolean m19844D() {
        return this.f23033c == 200;
    }

    /* renamed from: E */
    public final void m19845E() {
        int i10;
        if (m19842B()) {
            Logger.m8580i(f23030o, "GRSSDK get httpcode{304} not any changed.");
            m19860l(1);
            return;
        }
        if (!m19844D()) {
            Logger.m8580i(f23030o, "GRSSDK parse server body all failed.");
            m19860l(2);
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(StringUtils.byte2Str(this.f23032b));
            if (jSONObject.has("isSuccess")) {
                if (jSONObject.getInt("isSuccess") == 1) {
                }
            } else if (jSONObject.has(AbstractC7706b.JSON_ERRORCODE)) {
                i10 = jSONObject.getInt(AbstractC7706b.JSON_ERRORCODE) == 0 ? 1 : 2;
            } else {
                Logger.m8573e(f23030o, "sth. wrong because server errorcode's key.");
                i10 = -1;
            }
            if (i10 != 1 && jSONObject.has("services")) {
                i10 = 0;
            }
            m19860l(i10);
            if (i10 == 1 || i10 == 0) {
                m19869u(jSONObject.has("services") ? jSONObject.getJSONObject("services").toString() : "");
                m19867s(jSONObject.has("errorList") ? jSONObject.getJSONObject("errorList").toString() : "");
            } else {
                m19855g(jSONObject.has(Constants.KEY_ERROR_CODE) ? jSONObject.getInt(Constants.KEY_ERROR_CODE) : ConnectionResult.RESOLUTION_REQUIRED);
                m19865q(jSONObject.has("errorDesc") ? jSONObject.getString("errorDesc") : "");
            }
        } catch (JSONException e10) {
            Logger.m8590w(f23030o, "GrsResponse GrsResponse(String result) JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            m19860l(2);
        }
    }

    /* renamed from: F */
    public final void m19846F() throws NumberFormatException {
        if (m19844D() || m19843C() || m19842B()) {
            Map mapM19847G = m19847G();
            if (mapM19847G.size() <= 0) {
                Logger.m8588w(f23030o, "parseHeader {headers.size() <= 0}");
                return;
            }
            try {
                if (m19844D() || m19842B()) {
                    m19858j(mapM19847G);
                    m19853e(mapM19847G);
                }
                if (m19843C()) {
                    m19863o(mapM19847G);
                }
            } catch (JSONException e10) {
                Logger.m8590w(f23030o, "parseHeader catch JSONException: %s", StringUtils.anonymizeMessage(e10.getMessage()));
            }
        }
    }

    /* renamed from: G */
    public final Map m19847G() {
        HashMap map = new HashMap(16);
        Map map2 = this.f23031a;
        if (map2 == null || map2.size() <= 0) {
            Logger.m8586v(f23030o, "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}");
            return map;
        }
        for (Map.Entry entry : this.f23031a.entrySet()) {
            String str = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                map.put(str, (String) it.next());
            }
        }
        return map;
    }

    /* renamed from: H */
    public final void m19848H() throws NumberFormatException {
        m19846F();
        m19845E();
    }

    /* renamed from: a */
    public String m19849a() {
        return this.f23040j;
    }

    /* renamed from: c */
    public void m19851c(long j10) {
        this.f23036f = j10;
    }

    /* renamed from: d */
    public void m19852d(String str) {
        this.f23042l = str;
    }

    /* renamed from: e */
    public final void m19853e(Map map) {
        if (!map.containsKey(HttpHeaders.ETAG)) {
            Logger.m8580i(f23030o, "Response Heads has not Etag");
            return;
        }
        String str = (String) map.get(HttpHeaders.ETAG);
        if (TextUtils.isEmpty(str)) {
            Logger.m8580i(f23030o, "The Response Heads Etag is Empty");
        } else {
            Logger.m8580i(f23030o, "success get Etag from server");
            m19852d(str);
        }
    }

    /* renamed from: f */
    public int m19854f() {
        return this.f23033c;
    }

    /* renamed from: g */
    public final void m19855g(int i10) {
        this.f23039i = i10;
    }

    /* renamed from: h */
    public void m19856h(long j10) {
        this.f23035e = j10;
    }

    /* renamed from: i */
    public void m19857i(String str) {
        this.f23044n = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19858j(java.util.Map r9) throws java.lang.NumberFormatException {
        /*
            r8 = this;
            java.lang.String r0 = "Cache-Control"
            boolean r1 = r9.containsKey(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 0
            if (r1 == 0) goto L4b
            java.lang.Object r9 = r9.get(r0)
            java.lang.String r9 = (java.lang.String) r9
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Lad
            java.lang.String r0 = "max-age="
            boolean r1 = r9.contains(r0)
            if (r1 == 0) goto Lad
            int r0 = r9.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L41
            int r0 = r0 + 8
            java.lang.String r9 = r9.substring(r0)     // Catch: java.lang.NumberFormatException -> L41
            long r0 = java.lang.Long.parseLong(r9)     // Catch: java.lang.NumberFormatException -> L41
            java.lang.String r9 = p218k5.C9814d.f23030o     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.String r6 = "Cache-Control value{%s}"
            java.lang.Long r7 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L3f
            java.lang.Object[] r7 = new java.lang.Object[]{r7}     // Catch: java.lang.NumberFormatException -> L3f
            com.huawei.hms.framework.common.Logger.m8587v(r9, r6, r7)     // Catch: java.lang.NumberFormatException -> L3f
            goto Lae
        L3f:
            r9 = move-exception
            goto L43
        L41:
            r9 = move-exception
            r0 = r4
        L43:
            java.lang.String r6 = p218k5.C9814d.f23030o
            java.lang.String r7 = "getExpireTime addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.m8589w(r6, r7, r9)
            goto Lae
        L4b:
            java.lang.String r0 = "Expires"
            boolean r1 = r9.containsKey(r0)
            if (r1 == 0) goto La6
            java.lang.Object r0 = r9.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = p218k5.C9814d.f23030o
            java.lang.Object[] r6 = new java.lang.Object[]{r0}
            java.lang.String r7 = "expires is{%s}"
            com.huawei.hms.framework.common.Logger.m8587v(r1, r7, r6)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r7 = "EEE, d MMM yyyy HH:mm:ss 'GMT'"
            r1.<init>(r7, r6)
            java.lang.String r6 = "Date"
            boolean r7 = r9.containsKey(r6)
            if (r7 == 0) goto L7c
            java.lang.Object r9 = r9.get(r6)
            java.lang.String r9 = (java.lang.String) r9
            goto L7d
        L7c:
            r9 = 0
        L7d:
            java.util.Date r0 = r1.parse(r0)     // Catch: java.text.ParseException -> L8d
            boolean r6 = android.text.TextUtils.isEmpty(r9)     // Catch: java.text.ParseException -> L8d
            if (r6 == 0) goto L8f
            java.util.Date r9 = new java.util.Date     // Catch: java.text.ParseException -> L8d
            r9.<init>()     // Catch: java.text.ParseException -> L8d
            goto L93
        L8d:
            r9 = move-exception
            goto L9e
        L8f:
            java.util.Date r9 = r1.parse(r9)     // Catch: java.text.ParseException -> L8d
        L93:
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> L8d
            long r6 = r9.getTime()     // Catch: java.text.ParseException -> L8d
            long r0 = r0 - r6
            long r0 = r0 / r2
            goto Lae
        L9e:
            java.lang.String r0 = p218k5.C9814d.f23030o
            java.lang.String r1 = "getExpireTime ParseException."
            com.huawei.hms.framework.common.Logger.m8589w(r0, r1, r9)
            goto Lad
        La6:
            java.lang.String r9 = p218k5.C9814d.f23030o
            java.lang.String r0 = "response headers neither contains Cache-Control nor Expires."
            com.huawei.hms.framework.common.Logger.m8580i(r9, r0)
        Lad:
            r0 = r4
        Lae:
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lb9
            r4 = 2592000(0x278d00, double:1.280618E-317)
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lbc
        Lb9:
            r0 = 86400(0x15180, double:4.26873E-319)
        Lbc:
            long r0 = r0 * r2
            java.lang.String r9 = p218k5.C9814d.f23030o
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "convert expireTime{%s}"
            com.huawei.hms.framework.common.Logger.m8581i(r9, r3, r2)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r8.m19862n(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p218k5.C9814d.m19858j(java.util.Map):void");
    }

    /* renamed from: k */
    public int m19859k() {
        return this.f23039i;
    }

    /* renamed from: l */
    public final void m19860l(int i10) {
        this.f23038h = i10;
    }

    /* renamed from: m */
    public final void m19861m(long j10) {
        this.f23041k = j10;
    }

    /* renamed from: n */
    public final void m19862n(String str) {
        this.f23040j = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m19863o(java.util.Map r5) throws java.lang.NumberFormatException {
        /*
            r4 = this;
            java.lang.String r0 = "Retry-After"
            boolean r1 = r5.containsKey(r0)
            if (r1 == 0) goto L21
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L21
            long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L19
            goto L23
        L19:
            r5 = move-exception
            java.lang.String r0 = p218k5.C9814d.f23030o
            java.lang.String r1 = "getRetryAfter addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.m8589w(r0, r1, r5)
        L21:
            r0 = 0
        L23:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r5 = p218k5.C9814d.f23030o
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "convert retry-afterTime{%s}"
            com.huawei.hms.framework.common.Logger.m8587v(r5, r3, r2)
            r4.m19861m(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p218k5.C9814d.m19863o(java.util.Map):void");
    }

    /* renamed from: p */
    public Exception m19864p() {
        return this.f23043m;
    }

    /* renamed from: r */
    public String m19866r() {
        return this.f23042l;
    }

    /* renamed from: t */
    public int m19868t() {
        return this.f23038h;
    }

    /* renamed from: u */
    public final void m19869u(String str) {
        this.f23037g = str;
    }

    /* renamed from: v */
    public long m19870v() {
        return this.f23036f;
    }

    /* renamed from: w */
    public long m19871w() {
        return this.f23035e;
    }

    /* renamed from: x */
    public long m19872x() {
        return this.f23034d;
    }

    /* renamed from: y */
    public String m19873y() {
        return this.f23037g;
    }

    /* renamed from: z */
    public long m19874z() {
        return this.f23041k;
    }

    public C9814d(Exception exc, long j10) {
        this.f23033c = 0;
        this.f23038h = 2;
        this.f23039i = ConnectionResult.RESOLUTION_REQUIRED;
        this.f23040j = "";
        this.f23041k = 0L;
        this.f23042l = "";
        this.f23043m = exc;
        this.f23034d = j10;
    }

    /* renamed from: b */
    public void m19850b(int i10) {
    }

    /* renamed from: q */
    public final void m19865q(String str) {
    }

    /* renamed from: s */
    public final void m19867s(String str) {
    }
}
