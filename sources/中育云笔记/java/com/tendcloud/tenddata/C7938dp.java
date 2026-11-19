package com.tendcloud.tenddata;

import com.alibaba.android.arouter.utils.Consts;
import com.taobao.accs.common.Constants;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.tendcloud.tenddata.dp */
/* loaded from: classes5.dex */
public class C7938dp {

    /* renamed from: a */
    private static final String f14737a = "https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl";

    /* renamed from: b */
    private static final String f14738b = "hAF3uVnSYyk2qN3trMjXFVsijBTGcR";

    /* renamed from: c */
    private static C7938dp f14739c;

    /* renamed from: d */
    private Map<String, Object> f14740d = null;

    /* renamed from: com.tendcloud.tenddata.dp$a */
    public enum a {
        UNSTOP(0),
        STOP(1);

        private final int index;

        a(int i10) {
            this.index = i10;
        }

        public int index() {
            return this.index;
        }
    }

    private C7938dp() {
    }

    public void getShortUrl(final TDGenerateUrl tDGenerateUrl) {
        new Thread(new Runnable() { // from class: com.tendcloud.tenddata.dp.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : C7938dp.this.f14740d.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    byte[] bytes = jSONObject.toString().getBytes();
                    String strValueOf = String.valueOf(System.currentTimeMillis());
                    URL url = new URL("https://api.talkingdata.com/adt/openapi/rest/socialSharing/getShortUrl?sign=" + C7938dp.this.m11751a(jSONObject, strValueOf) + "&nonce=" + strValueOf);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Short url serve: ");
                    sb2.append(url);
                    C7896ca.dForInternal(sb2.toString());
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(15000);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                    httpURLConnection.getOutputStream().write(bytes);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        C7896ca.eForInternal("TD getShortUrl Http Error:" + responseCode);
                        tDGenerateUrl.callback(null);
                        return;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                    StringBuilder sb3 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        } else {
                            sb3.append(line);
                        }
                    }
                    String string = sb3.toString();
                    C7896ca.dForInternal("TD getShortUrl success:", string);
                    JSONObject jSONObject2 = new JSONObject(string);
                    if (jSONObject2.getInt(Constants.KEY_HTTP_CODE) == 200) {
                        tDGenerateUrl.callback(jSONObject2.getString("result"));
                    } else {
                        C7896ca.eForInternal("TD getShortUrl Error:", string);
                        tDGenerateUrl.callback(null);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    tDGenerateUrl.callback(null);
                }
            }
        }).start();
    }

    /* renamed from: a */
    public static C7938dp m11749a() {
        if (f14739c == null) {
            synchronized (C7938dp.class) {
                try {
                    if (f14739c == null) {
                        f14739c = new C7938dp();
                    }
                } finally {
                }
            }
        }
        return f14739c;
    }

    /* renamed from: a */
    public C7938dp m11753a(Map<String, Object> map) {
        this.f14740d = map;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m11751a(JSONObject jSONObject, String str) {
        return C7912cq.m11612c(jSONObject.get("pageUrl") + Consts.DOT + jSONObject.get("shortUrl") + Consts.DOT + jSONObject.get("is_retargeting") + Consts.DOT + str + Consts.DOT + f14738b);
    }
}
