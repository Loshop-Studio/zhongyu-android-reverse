package com.huawei.hms.push;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blankj.utilcode.constant.CacheConstants;
import com.huawei.hms.support.log.HMSLog;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p344t5.AbstractC11228b;
import p344t5.AbstractC11230d;
import p358u5.AbstractC11367a;

/* loaded from: classes5.dex */
public class RemoteMessage implements Parcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR;

    /* renamed from: d */
    public static final String[] f11685d;

    /* renamed from: e */
    public static final int[] f11686e;

    /* renamed from: f */
    public static final long[] f11687f;

    /* renamed from: g */
    public static final HashMap f11688g;

    /* renamed from: h */
    public static final HashMap f11689h;

    /* renamed from: i */
    public static final HashMap f11690i;

    /* renamed from: j */
    public static final HashMap f11691j;

    /* renamed from: k */
    public static final HashMap f11692k;

    /* renamed from: c */
    public Bundle f11693c;

    public static class Notification implements Serializable {
    }

    /* renamed from: com.huawei.hms.push.RemoteMessage$a */
    public class C7320a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteMessage createFromParcel(Parcel parcel) {
            return new RemoteMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteMessage[] newArray(int i10) {
            return new RemoteMessage[i10];
        }
    }

    static {
        String[] strArr = new String[0];
        f11685d = strArr;
        int[] iArr = new int[0];
        f11686e = iArr;
        long[] jArr = new long[0];
        f11687f = jArr;
        HashMap map = new HashMap(8);
        f11688g = map;
        map.put(TypedValues.TransitionType.S_FROM, "");
        map.put("collapseKey", "");
        map.put("sendTime", "");
        map.put("ttl", Integer.valueOf(CacheConstants.DAY));
        map.put("urgency", 2);
        map.put("oriUrgency", 2);
        map.put("sendMode", 0);
        map.put("receiptMode", 0);
        HashMap map2 = new HashMap(8);
        f11689h = map2;
        map2.put("title_loc_key", "");
        map2.put("body_loc_key", "");
        map2.put("notifyIcon", "");
        map2.put("title_loc_args", strArr);
        map2.put("body_loc_args", strArr);
        map2.put("ticker", "");
        map2.put("notifyTitle", "");
        map2.put("content", "");
        HashMap map3 = new HashMap(8);
        f11690i = map3;
        map3.put("icon", "");
        map3.put(TypedValues.Custom.S_COLOR, "");
        map3.put("sound", "");
        map3.put("defaultLightSettings", 1);
        map3.put("lightSettings", iArr);
        map3.put("defaultSound", 1);
        map3.put("defaultVibrateTimings", 1);
        map3.put("vibrateTimings", jArr);
        HashMap map4 = new HashMap(8);
        f11691j = map4;
        map4.put("tag", "");
        map4.put("when", "");
        map4.put("localOnly", 1);
        map4.put("badgeSetNum", "");
        map4.put("priority", "");
        map4.put("autoCancel", 1);
        map4.put("visibility", "");
        map4.put("channelId", "");
        HashMap map5 = new HashMap(3);
        f11692k = map5;
        map5.put("acn", "");
        map5.put("intentUri", "");
        map5.put("url", "");
        CREATOR = new C7320a();
    }

    public RemoteMessage(Bundle bundle) {
        this.f11693c = m8660a(bundle);
    }

    /* renamed from: c */
    public static JSONObject m8655c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("msgContent");
        }
        return null;
    }

    /* renamed from: g */
    public static JSONObject m8656g(Bundle bundle) {
        try {
            return new JSONObject(AbstractC11228b.m24988a(bundle.getByteArray("message_body")));
        } catch (JSONException unused) {
            HMSLog.m8728w("RemoteMessage", "JSONException:parse message body failed.");
            return null;
        }
    }

    /* renamed from: h */
    public static JSONObject m8657h(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("notifyDetail");
        }
        return null;
    }

    /* renamed from: i */
    public static JSONObject m8658i(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("param");
        }
        return null;
    }

    /* renamed from: j */
    public static JSONObject m8659j(JSONObject jSONObject) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject("psContent");
        }
        return null;
    }

    /* renamed from: a */
    public final Bundle m8660a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        JSONObject jSONObjectM8656g = m8656g(bundle);
        JSONObject jSONObjectM8655c = m8655c(jSONObjectM8656g);
        String strM25287e = AbstractC11367a.m25287e(jSONObjectM8655c, "data", null);
        bundle2.putString("analyticInfo", AbstractC11367a.m25287e(jSONObjectM8655c, "analyticInfo", null));
        bundle2.putString("device_token", bundle.getString("device_token"));
        JSONObject jSONObjectM8659j = m8659j(jSONObjectM8655c);
        JSONObject jSONObjectM8657h = m8657h(jSONObjectM8659j);
        JSONObject jSONObjectM8658i = m8658i(jSONObjectM8659j);
        if (bundle.getInt("inputType") == 1 && AbstractC11230d.m24992a(jSONObjectM8655c, jSONObjectM8659j, strM25287e)) {
            bundle2.putString("data", AbstractC11228b.m24988a(bundle.getByteArray("message_body")));
            return bundle2;
        }
        String string = bundle.getString(TypedValues.TransitionType.S_TO);
        String string2 = bundle.getString("message_type");
        String strM25287e2 = AbstractC11367a.m25287e(jSONObjectM8655c, "msgId", null);
        bundle2.putString(TypedValues.TransitionType.S_TO, string);
        bundle2.putString("data", strM25287e);
        bundle2.putString("msgId", strM25287e2);
        bundle2.putString("message_type", string2);
        AbstractC11367a.m25289g(jSONObjectM8656g, bundle2, f11688g);
        bundle2.putBundle("notification", m8661b(jSONObjectM8656g, jSONObjectM8655c, jSONObjectM8659j, jSONObjectM8657h, jSONObjectM8658i));
        return bundle2;
    }

    /* renamed from: b */
    public final Bundle m8661b(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        Bundle bundle = new Bundle();
        AbstractC11367a.m25289g(jSONObject3, bundle, f11689h);
        AbstractC11367a.m25289g(jSONObject4, bundle, f11690i);
        AbstractC11367a.m25289g(jSONObject, bundle, f11691j);
        AbstractC11367a.m25289g(jSONObject5, bundle, f11692k);
        bundle.putInt("notifyId", AbstractC11367a.m25284b(jSONObject2, "notifyId", 0));
        return bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: k */
    public String m8662k() {
        return this.f11693c.getString("data");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.f11693c);
        parcel.writeSerializable(null);
    }

    public RemoteMessage(Parcel parcel) {
        this.f11693c = parcel.readBundle();
    }
}
