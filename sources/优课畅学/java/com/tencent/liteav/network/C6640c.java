package com.tencent.liteav.network;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p049d.C6573c;
import com.tencent.liteav.basic.util.TXCCommonUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.network.c */
/* loaded from: classes4.dex */
class C6640c {

    /* renamed from: c */
    private final String f5795c = "https://tcdns.myqcloud.com/queryip";

    /* renamed from: d */
    private final String f5796d = "https://tcdnsipv6.myqcloud.com/queryip";

    /* renamed from: e */
    private final String f5797e = "forward_stream";

    /* renamed from: f */
    private final String f5798f = "forward_num";

    /* renamed from: g */
    private final String f5799g = "request_type";

    /* renamed from: h */
    private final String f5800h = "sdk_version";

    /* renamed from: i */
    private final String f5801i = "51451748-d8f2-4629-9071-db2983aa7251";

    /* renamed from: j */
    private final int f5802j = 5;

    /* renamed from: k */
    private final int f5803k = 2;

    /* renamed from: a */
    public InterfaceC6639b f5793a = null;

    /* renamed from: b */
    public int f5794b = 5;

    /* renamed from: l */
    private Thread f5804l = null;

    /* renamed from: b */
    private InputStream m5262b(String str, int i10, String str2) throws IOException {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.setRequestProperty("forward_stream", str);
            httpURLConnection.setRequestProperty("forward_num", ExifInterface.GPS_MEASUREMENT_2D);
            httpURLConnection.setRequestProperty("sdk_version", TXCCommonUtil.getSDKVersionStr());
            if (i10 == 1) {
                httpURLConnection.setRequestProperty("request_type", "1");
            } else if (i10 == 2) {
                httpURLConnection.setRequestProperty("request_type", ExifInterface.GPS_MEASUREMENT_2D);
            } else {
                httpURLConnection.setRequestProperty("request_type", ExifInterface.GPS_MEASUREMENT_3D);
            }
            int i11 = this.f5794b;
            if (i11 > 0) {
                httpURLConnection.setConnectTimeout(i11 * 1000);
                httpURLConnection.setReadTimeout(this.f5794b * 1000);
            }
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                return httpURLConnection.getInputStream();
            }
            return null;
        } catch (Exception e10) {
            TXCLog.m4992e("TXCIntelligentRoute", "http failed.", e10);
            return null;
        }
    }

    /* renamed from: c */
    private boolean m5264c(String str) {
        if (!m5263b(str) && str != null) {
            for (String str2 : str.split("[.]")) {
                if (!m5265d(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m5265d(String str) {
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    /* renamed from: a */
    public void m5266a(final String str, final int i10) {
        Thread thread = new Thread("TXCPushRoute") { // from class: com.tencent.liteav.network.c.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws InterruptedException {
                String strM5257a;
                JSONObject jSONObject;
                if (C6640c.this.f5793a == null) {
                    return;
                }
                ArrayList<C6629a> arrayList = new ArrayList<>();
                int i11 = 0;
                while (i11 < 7) {
                    try {
                        strM5257a = C6640c.this.m5257a(str, i10, i11 < 5 ? "https://tcdns.myqcloud.com/queryip" : "https://tcdnsipv6.myqcloud.com/queryip");
                        try {
                            jSONObject = new JSONObject(strM5257a);
                        } catch (Exception e10) {
                            TXCLog.m4992e("TXCIntelligentRoute", "get value from json failed.", e10);
                        }
                    } catch (Exception e11) {
                        TXCLog.m4992e("TXCIntelligentRoute", "get json string failed.", e11);
                    }
                    if (!jSONObject.has("use") || jSONObject.getInt("use") != 0) {
                        arrayList = C6640c.this.m5259a(strM5257a);
                        if (arrayList != null && arrayList.size() > 0) {
                            break;
                        }
                        Thread.sleep(1000L, 0);
                        i11++;
                    } else {
                        break;
                    }
                }
                C6640c.this.f5793a.onFetchDone(0, arrayList);
            }
        };
        this.f5804l = thread;
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public String m5257a(String str, int i10, String str2) throws IOException {
        InputStream inputStreamM5262b;
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            inputStreamM5262b = m5262b(str, i10, str2);
        } catch (IOException e10) {
            TXCLog.m4992e("TXCIntelligentRoute", "get json string from url failed.", e10);
        }
        if (inputStreamM5262b == null) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamM5262b));
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            stringBuffer.append(line);
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public ArrayList<C6629a> m5259a(String str) {
        JSONArray jSONArray;
        ArrayList<C6629a> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.getInt("state") != 0 || (jSONArray = jSONObject.getJSONObject("content").getJSONArray("list")) == null) {
                return null;
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C6629a c6629aM5255a = m5255a((JSONObject) jSONArray.opt(i10));
                if (c6629aM5255a != null && c6629aM5255a.f5770c) {
                    arrayList.add(c6629aM5255a);
                }
            }
            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                C6629a c6629aM5255a2 = m5255a((JSONObject) jSONArray.opt(i11));
                if (c6629aM5255a2 != null && !c6629aM5255a2.f5770c) {
                    arrayList.add(c6629aM5255a2);
                }
            }
            if (C6573c.m4883a().m4908a("Network", "EnableRouteOptimize") == 1 && C6650m.m5328a().m5337c()) {
                ArrayList<C6629a> arrayListM5260a = m5260a(arrayList, true);
                m5261a(arrayListM5260a);
                return arrayListM5260a;
            }
            long jM4908a = C6573c.m4883a().m4908a("Network", "RouteSamplingMaxCount");
            if (jM4908a >= 1) {
                long jM5332a = C6650m.m5328a().m5332a("51451748-d8f2-4629-9071-db2983aa7251");
                if (jM5332a <= jM4908a) {
                    arrayList = m5260a(arrayList, false);
                    C6650m.m5328a().m5334a("51451748-d8f2-4629-9071-db2983aa7251", jM5332a + 1);
                }
            }
            m5261a(arrayList);
            return arrayList;
        } catch (JSONException e10) {
            TXCLog.m4992e("TXCIntelligentRoute", "get records from json string failed.", e10);
            return arrayList;
        }
    }

    /* renamed from: b */
    private boolean m5263b(String str) {
        return str.split(":").length > 1;
    }

    /* renamed from: a */
    private C6629a m5255a(JSONObject jSONObject) {
        C6629a c6629a = new C6629a();
        try {
            c6629a.f5768a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_IP);
            c6629a.f5769b = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_PORT);
            c6629a.f5772e = 0;
            c6629a.f5770c = false;
            c6629a.f5771d = m5264c(c6629a.f5768a);
            if (!jSONObject.has("type") || jSONObject.getInt("type") != 2) {
                return c6629a;
            }
            c6629a.f5770c = true;
            return c6629a;
        } catch (JSONException e10) {
            TXCLog.m4992e("TXCIntelligentRoute", "get ip record from json object failed.", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private ArrayList<C6629a> m5260a(ArrayList<C6629a> arrayList, boolean z10) {
        C6629a c6629a;
        C6629a c6629a2;
        C6629a next = null;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<C6629a> it = arrayList.iterator();
        loop0: while (true) {
            c6629a = next;
            while (it.hasNext()) {
                next = it.next();
                if (next.f5770c) {
                    arrayList2.add(next);
                } else {
                    if (next.f5771d) {
                        break;
                    }
                    arrayList3.add(next);
                }
            }
        }
        ArrayList<C6629a> arrayList4 = new ArrayList<>();
        while (true) {
            if (arrayList2.size() <= 0 && arrayList3.size() <= 0) {
                break;
            }
            if (z10) {
                if (c6629a != null) {
                    arrayList4.add(c6629a);
                }
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
            } else {
                if (arrayList2.size() > 0) {
                    arrayList4.add(arrayList2.get(0));
                    arrayList2.remove(0);
                }
                if (c6629a != null) {
                    arrayList4.add(c6629a);
                }
            }
            if (arrayList3.size() > 0) {
                arrayList4.add(arrayList3.get(0));
                arrayList3.remove(0);
            }
        }
        int size = arrayList4.size();
        if (size > 0 && (c6629a2 = (C6629a) arrayList4.get(size - 1)) != null && !m5264c(c6629a2.f5768a) && c6629a != null) {
            arrayList4.add(c6629a);
        }
        return arrayList4;
    }

    /* renamed from: a */
    private void m5261a(ArrayList<C6629a> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator<C6629a> it = arrayList.iterator();
        String str = "";
        while (it.hasNext()) {
            C6629a next = it.next();
            str = str + " \n Nearest IP: " + next.f5768a + " Port: " + next.f5769b + " Q Channel: " + next.f5770c;
        }
        TXCLog.m4991e("TXCIntelligentRoute", str);
    }
}
