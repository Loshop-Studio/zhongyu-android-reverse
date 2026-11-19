package com.tendcloud.tenddata;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import android.util.Pair;
import androidx.camera.video.AudioStats;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tendcloud.tenddata.AbstractC8010n;
import com.tendcloud.tenddata.C8006j;
import java.io.BufferedOutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.net.ssl.SSLSocketFactory;
import org.android.agoo.common.AgooConstants;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONObject;

@TargetApi(16)
/* renamed from: com.tendcloud.tenddata.q */
/* loaded from: classes5.dex */
class C8013q {

    /* renamed from: A */
    private static final int f15070A = 12;

    /* renamed from: a */
    static final int f15071a = 1;

    /* renamed from: b */
    static final int f15072b = 13;

    /* renamed from: c */
    static final String f15073c = "TDDynamicEvent";

    /* renamed from: d */
    static final String f15074d = "TDExceptionLog";

    /* renamed from: e */
    private static volatile C8013q f15075e = null;

    /* renamed from: m */
    private static final String f15076m = "talkingdata.viewcrawler.changes";

    /* renamed from: n */
    private static final String f15077n = "config.events";

    /* renamed from: o */
    private static final String f15078o = "config.events.hybrid";

    /* renamed from: p */
    private static final int f15079p = 0;

    /* renamed from: q */
    private static final int f15080q = 2;

    /* renamed from: r */
    private static final int f15081r = 3;

    /* renamed from: s */
    private static final int f15082s = 4;

    /* renamed from: t */
    private static final int f15083t = 5;

    /* renamed from: u */
    private static final int f15084u = 6;

    /* renamed from: v */
    private static final int f15085v = 7;

    /* renamed from: w */
    private static final int f15086w = 8;

    /* renamed from: x */
    private static final int f15087x = 9;

    /* renamed from: y */
    private static final int f15088y = 10;

    /* renamed from: z */
    private static final int f15089z = 11;

    /* renamed from: f */
    private long f15090f;

    /* renamed from: g */
    private final Context f15091g;

    /* renamed from: h */
    private final C8005i f15092h;

    /* renamed from: i */
    private final C8003g f15093i;

    /* renamed from: j */
    private final Map<String, String> f15094j;

    /* renamed from: k */
    private final b f15095k;

    /* renamed from: l */
    private final float f15096l;

    /* renamed from: com.tendcloud.tenddata.q$a */
    public class a implements C8006j.a {
        private a() {
        }

        private void internalSendMessage(int i10, JSONObject jSONObject) {
            Message messageObtainMessage = C8013q.m12072a().f15095k.obtainMessage(i10);
            if (jSONObject != null) {
                messageObtainMessage.obj = jSONObject;
            }
            long j10 = 0;
            if (i10 == 2) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - C8013q.this.f15090f < 2000) {
                    j10 = 2000 - (jCurrentTimeMillis - C8013q.this.f15090f);
                }
            }
            C8013q.m12072a().f15095k.sendMessageDelayed(messageObtainMessage, j10);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void bindEvents(JSONObject jSONObject) {
            internalSendMessage(6, jSONObject);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void cleanup() {
            C8013q.this.f15095k.sendMessage(C8013q.this.f15095k.obtainMessage(8));
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void clearEdits(JSONObject jSONObject) {
            internalSendMessage(10, jSONObject);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void performEdit(JSONObject jSONObject) {
            internalSendMessage(3, jSONObject);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void sendDeviceInfo() {
            internalSendMessage(4, null);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void sendSnapshot(JSONObject jSONObject) {
            C8013q.m12072a().f15095k.removeMessages(2);
            internalSendMessage(2, jSONObject);
        }

        @Override // com.tendcloud.tenddata.C8006j.a
        public void setTweaks(JSONObject jSONObject) {
            internalSendMessage(11, jSONObject);
        }
    }

    /* renamed from: com.tendcloud.tenddata.q$b */
    public class b extends Handler {
        private final Context mContext;
        private final Map<String, Pair<String, JSONObject>> mEditorChanges;
        private C8006j mEditorConnection;
        private final List<Pair<String, JSONObject>> mEditorEventBindings;
        private final C8004h mProtocol;
        private C8014s mSnapshot;
        private final Lock mStartLock;
        private final String mToken;

        public b(Context context, String str, Looper looper) {
            super(looper);
            this.mContext = context;
            this.mToken = str;
            this.mSnapshot = null;
            this.mProtocol = new C8004h(new AbstractC8010n.b(context.getPackageName(), context));
            this.mEditorChanges = new HashMap();
            this.mEditorEventBindings = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            this.mStartLock = reentrantLock;
            reentrantLock.lock();
        }

        private void connectToEditor(String str) {
            C8006j c8006j = this.mEditorConnection;
            if (c8006j == null || !c8006j.m12037a()) {
                String str2 = C7842aa.f14264y + MqttTopic.TOPIC_LEVEL_SEPARATOR + str;
                try {
                    if (!str2.startsWith(C7842aa.f14258s)) {
                        this.mEditorConnection = new C8006j(new URI(str2), new a(), null);
                        return;
                    }
                    SSLSocketFactory sSLSocketFactoryM11638a = !C7912cq.m11608b("") ? C7917cv.m11638a(C7917cv.m11636a("")) : C7917cv.m11638a((X509Certificate) null);
                    if (sSLSocketFactoryM11638a == null) {
                        return;
                    }
                    this.mEditorConnection = new C8006j(new URI(str2), new a(), sSLSocketFactoryM11638a.createSocket());
                } catch (Throwable unused) {
                }
            }
        }

        private void handleEditorBindingsReceived(JSONObject jSONObject) {
            try {
                C7896ca.dForInternal("handleEditorBindingsReceived: ");
                C8008l.m12042a().m12047b();
            } catch (Throwable th) {
                C7896ca.eForInternal(th);
            }
        }

        private void handleEditorClosed() {
            try {
                this.mEditorChanges.clear();
                this.mEditorEventBindings.clear();
                this.mSnapshot = null;
                C7896ca.dForDeveloper("Closed.");
            } catch (Throwable unused) {
            }
        }

        private void sendDeviceInfo() {
            if (this.mEditorConnection == null) {
                return;
            }
            C8013q.this.f15090f = System.currentTimeMillis();
            JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.mEditorConnection.m12038b()));
            try {
                try {
                    jsonWriter.beginObject();
                    jsonWriter.name("type").value("device_info_response");
                    jsonWriter.name("payload").beginObject();
                    jsonWriter.name("scaled_density").value(C8013q.f15075e.f15096l);
                    jsonWriter.name("ssid").value(C7903ch.m11555w(this.mContext));
                    for (Map.Entry entry : C8013q.m12072a().f15094j.entrySet()) {
                        jsonWriter.name((String) entry.getKey()).value((String) entry.getValue());
                    }
                    jsonWriter.name("is_wifi_connected").value(C7903ch.m11541i(C7843ab.f14307g));
                    jsonWriter.endObject();
                    jsonWriter.endObject();
                    jsonWriter.close();
                } catch (Throwable unused) {
                    jsonWriter.close();
                }
            } catch (Throwable unused2) {
            }
        }

        private void sendSnapshot(JSONObject jSONObject) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            BufferedOutputStream bufferedOutputStreamM12038b = this.mEditorConnection.m12038b();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(bufferedOutputStreamM12038b);
            try {
                try {
                    this.mSnapshot = this.mProtocol.m12029a();
                    outputStreamWriter.write("{");
                    outputStreamWriter.write("\"type\": \"snapshot_response\",");
                    outputStreamWriter.write("\"payload\": {");
                    outputStreamWriter.write("\"serialized_objects\":");
                    outputStreamWriter.flush();
                    this.mSnapshot.m12088a(C8013q.f15075e.f15093i, bufferedOutputStreamM12038b);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    outputStreamWriter.write(",\"snapshot_time_millis\": ");
                    outputStreamWriter.write(Long.toString(jCurrentTimeMillis2));
                    outputStreamWriter.write("}");
                    outputStreamWriter.write("}");
                    outputStreamWriter.close();
                } catch (Throwable unused) {
                    outputStreamWriter.close();
                }
            } catch (Throwable unused2) {
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            this.mStartLock.lock();
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    connectToEditor((String) message.obj);
                } else if (i10 == 2) {
                    sendSnapshot((JSONObject) message.obj);
                } else if (i10 == 4) {
                    sendDeviceInfo();
                } else if (i10 == 6) {
                    handleEditorBindingsReceived((JSONObject) message.obj);
                } else if (i10 == 8) {
                    handleEditorClosed();
                } else if (i10 == 13) {
                    sendEvent((Hashtable) message.obj);
                }
            } catch (Throwable unused) {
            }
            this.mStartLock.unlock();
        }

        public void sendEvent(Hashtable<String, Object> hashtable) {
            C8006j c8006j = this.mEditorConnection;
            try {
                if (c8006j == null || !c8006j.m12037a()) {
                    String string = hashtable.get(AgooConstants.MESSAGE_ID).toString();
                    hashtable.remove(AgooConstants.MESSAGE_ID);
                    TalkingDataSDK.onEvent(C7843ab.f14307g, string, AudioStats.AUDIO_AMPLITUDE_NONE, hashtable);
                    return;
                }
                JsonWriter jsonWriter = new JsonWriter(new OutputStreamWriter(this.mEditorConnection.m12038b()));
                try {
                    jsonWriter.beginObject();
                    jsonWriter.name("type").value("event_triggered_response");
                    for (Map.Entry<String, Object> entry : hashtable.entrySet()) {
                        jsonWriter.name(entry.getKey()).value(entry.getValue() + "");
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                } catch (Throwable unused) {
                    jsonWriter.close();
                }
            } catch (Throwable unused2) {
            }
        }

        public void start() {
            this.mStartLock.unlock();
        }
    }

    private C8013q(Context context, String str, C7868b c7868b) {
        this.f15091g = context;
        C8003g c8003g = new C8003g();
        this.f15093i = c8003g;
        this.f15094j = m12077c();
        this.f15096l = Resources.getSystem().getDisplayMetrics().scaledDensity;
        c7868b.setEditState(c8003g);
        HandlerThread handlerThread = new HandlerThread("CodelessViewCrawler");
        handlerThread.setPriority(10);
        handlerThread.start();
        b bVar = new b(context, str, handlerThread.getLooper());
        this.f15095k = bVar;
        C8016u.m12091a().m12092a(bVar);
        this.f15092h = new C8005i(bVar);
        bVar.start();
    }

    /* renamed from: c */
    private Map<String, String> m12077c() throws PackageManager.NameNotFoundException {
        HashMap map = new HashMap();
        try {
            map.put("sdk_version", C7922d.f14663d);
            map.put("system_name", "Android");
            String str = Build.VERSION.RELEASE;
            String str2 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            if (str == null) {
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            map.put("system_version", str);
            String str3 = Build.MANUFACTURER;
            if (str3 == null) {
                str3 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            map.put("device_manufacturer", str3);
            String str4 = Build.BRAND;
            if (str4 == null) {
                str4 = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            map.put("device_brand", str4);
            String str5 = Build.MODEL;
            if (str5 != null) {
                str2 = str5;
            }
            map.put("device_model", str2);
            PackageManager packageManager = this.f15091g.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(this.f15091g.getPackageName(), 0);
            map.put("app_version", packageInfo.versionName);
            map.put("app_version_code", Integer.toString(packageInfo.versionCode));
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.f15091g.getPackageName(), 128);
            map.put("app_name", packageManager.getApplicationLabel(applicationInfo).toString());
            map.put("app_icon_base64_png", "data:image/png;base64," + C7949e.m11827c(packageManager.getApplicationIcon(applicationInfo)));
        } catch (Throwable unused) {
        }
        return map;
    }

    /* renamed from: a */
    public static C8013q m12073a(Context context, String str, C7868b c7868b) {
        if (f15075e == null) {
            synchronized (C8013q.class) {
                try {
                    if (f15075e == null) {
                        f15075e = new C8013q(context, str, c7868b);
                    }
                } finally {
                }
            }
        }
        return f15075e;
    }

    /* renamed from: a */
    public static C8013q m12072a() {
        return f15075e;
    }
}
