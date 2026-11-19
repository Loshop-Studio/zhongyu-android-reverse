package p343t4;

import android.util.Log;
import androidx.camera.core.processing.util.GLUtils;
import anet.channel.request.Request;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Iterator;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p332s4.InterfaceC11059c;

/* renamed from: t4.j */
/* loaded from: classes5.dex */
public class C11222j implements InterfaceC11059c {

    /* renamed from: a */
    public final JSONObject f26932a;

    public C11222j(InputStream inputStream, String str) throws JSONException {
        this.f26932a = m24964a(inputStream);
        m24965b(str);
    }

    /* renamed from: a */
    public final JSONObject m24964a(InputStream inputStream) {
        String str;
        if (inputStream != null) {
            try {
                return new JSONObject(AbstractC11214b.m24940g(inputStream, Request.DEFAULT_CHARSET));
            } catch (IOException unused) {
                str = "IOException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            } catch (JSONException unused2) {
                str = "JSONException when reading the 'Config' from InputStream.";
                Log.e("InputStreamReader", str);
                return new JSONObject();
            }
        }
        return new JSONObject();
    }

    /* renamed from: b */
    public final void m24965b(String str) throws JSONException {
        try {
            JSONObject jSONObjectM24967d = m24967d(str);
            if (jSONObjectM24967d == null) {
                return;
            }
            String string = getString("/configuration_version", "");
            BigDecimal bigDecimal = new BigDecimal(GLUtils.VERSION_UNKNOWN);
            try {
                bigDecimal = BigDecimal.valueOf(Double.parseDouble(string));
            } catch (NumberFormatException unused) {
            }
            if (bigDecimal.compareTo(new BigDecimal("2.0")) == 0) {
                this.f26932a.getJSONObject("client").put(HiAnalyticsConstant.BI_KEY_APP_ID, jSONObjectM24967d.getString(HiAnalyticsConstant.BI_KEY_APP_ID));
                return;
            }
            if (bigDecimal.compareTo(new BigDecimal("3.0")) >= 0) {
                Iterator<String> itKeys = jSONObjectM24967d.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!"package_name".equals(next)) {
                        m24966c(next, jSONObjectM24967d.get(next), this.f26932a);
                    }
                }
            }
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: c */
    public final void m24966c(String str, Object obj, JSONObject jSONObject) throws JSONException {
        if (str == null || obj == null || jSONObject == null) {
            return;
        }
        if (!(obj instanceof JSONObject)) {
            jSONObject.put(str, obj);
            return;
        }
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            m24966c(next, jSONObject2.get(next), jSONObject.getJSONObject(str));
        }
    }

    /* renamed from: d */
    public final JSONObject m24967d(String str) throws JSONException {
        JSONArray jSONArray = this.f26932a.getJSONArray("appInfos");
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            if (jSONObject.getString("package_name").equals(str)) {
                return jSONObject;
            }
        }
        return null;
    }

    @Override // p332s4.InterfaceC11059c
    public String getString(String str, String str2) throws JSONException {
        if (!str.endsWith(MqttTopic.TOPIC_LEVEL_SEPARATOR)) {
            String[] strArrSplit = str.split(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            try {
                JSONObject jSONObject = this.f26932a;
                for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                    if (i10 == strArrSplit.length - 1) {
                        str = jSONObject.get(strArrSplit[i10]).toString();
                        return str;
                    }
                    jSONObject = jSONObject.getJSONObject(strArrSplit[i10]);
                }
            } catch (JSONException unused) {
                Log.w("InputStreamReader", "JSONException when reading 'path': " + str);
                return str2;
            }
        }
        return str2;
    }

    public String toString() {
        return "InputStreamReader{config=" + this.f26932a.toString().hashCode() + '}';
    }
}
