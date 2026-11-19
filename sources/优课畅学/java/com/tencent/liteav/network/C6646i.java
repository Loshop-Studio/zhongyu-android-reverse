package com.tencent.liteav.network;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.liteav.network.i */
/* loaded from: classes4.dex */
public class C6646i {

    /* renamed from: a */
    protected JSONObject f5849a;

    /* renamed from: com.tencent.liteav.network.i$a */
    public static class a {

        /* renamed from: a */
        public String f5850a;

        /* renamed from: b */
        public String f5851b;

        /* renamed from: c */
        public List<Integer> f5852c;
    }

    public C6646i(JSONObject jSONObject) {
        this.f5849a = jSONObject;
    }

    /* renamed from: a */
    public String m5294a() throws JSONException {
        if (m5299e() != null) {
            return m5299e().f5853a;
        }
        if (m5297c().size() == 0) {
            if (m5298d() != null) {
                return m5298d().f5853a;
            }
            return null;
        }
        List<Integer> listM5304j = m5304j();
        if (listM5304j != null) {
            for (C6647j c6647j : m5297c()) {
                if (listM5304j.contains(Integer.valueOf(c6647j.m5305a()))) {
                    return c6647j.f5853a;
                }
            }
        }
        return m5297c().get(0).f5853a;
    }

    /* renamed from: b */
    public String m5296b() throws JSONException {
        try {
            JSONObject jSONObject = this.f5849a.getJSONObject("coverInfo");
            if (jSONObject != null) {
                return jSONObject.getString("coverUrl");
            }
            return null;
        } catch (JSONException e10) {
            TXCLog.m4992e("TXPlayInfoResponse", "get cover url failed.", e10);
            return null;
        }
    }

    /* renamed from: c */
    public List<C6647j> m5297c() throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = this.f5849a.getJSONObject("videoInfo").getJSONArray("transcodeList");
            if (jSONArray != null) {
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    C6647j c6647j = new C6647j();
                    c6647j.f5853a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                    c6647j.f5857e = jSONObject.getInt(TypedValues.TransitionType.S_DURATION);
                    c6647j.f5855c = jSONObject.getInt("width");
                    c6647j.f5854b = jSONObject.getInt("height");
                    c6647j.f5856d = Math.max(jSONObject.getInt("totalSize"), jSONObject.getInt("size"));
                    c6647j.f5858f = jSONObject.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
                    c6647j.f5861i = jSONObject.getInt("definition");
                    c6647j.f5859g = jSONObject.getString("container");
                    c6647j.f5860h = jSONObject.getString("templateName");
                    arrayList.add(c6647j);
                }
            }
            return arrayList;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: d */
    public C6647j m5298d() throws JSONException {
        try {
            JSONObject jSONObject = this.f5849a.getJSONObject("videoInfo").getJSONObject("sourceVideo");
            C6647j c6647j = new C6647j();
            c6647j.f5853a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            c6647j.f5857e = jSONObject.getInt(TypedValues.TransitionType.S_DURATION);
            c6647j.f5855c = jSONObject.getInt("width");
            c6647j.f5854b = jSONObject.getInt("height");
            c6647j.f5856d = Math.max(jSONObject.getInt("size"), jSONObject.getInt("totalSize"));
            c6647j.f5858f = jSONObject.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
            return c6647j;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public C6647j m5299e() throws JSONException {
        try {
            JSONObject jSONObject = this.f5849a.getJSONObject("videoInfo").getJSONObject("masterPlayList");
            C6647j c6647j = new C6647j();
            c6647j.f5853a = jSONObject.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
            return c6647j;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public String m5300f() throws JSONException {
        try {
            JSONObject jSONObject = this.f5849a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString(HintConstants.AUTOFILL_HINT_NAME);
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: g */
    public String m5301g() throws JSONException {
        try {
            JSONObject jSONObject = this.f5849a.getJSONObject("videoInfo").getJSONObject("basicInfo");
            if (jSONObject != null) {
                return jSONObject.getString("description");
            }
            return null;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: h */
    public String m5302h() {
        try {
            return this.f5849a.getJSONObject("playerInfo").getString("defaultVideoClassification");
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: i */
    public List<a> m5303i() throws JSONException {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = this.f5849a.getJSONObject("playerInfo").getJSONArray("videoClassification");
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                a aVar = new a();
                aVar.f5850a = jSONArray.getJSONObject(i10).getString("id");
                aVar.f5851b = jSONArray.getJSONObject(i10).getString(HintConstants.AUTOFILL_HINT_NAME);
                aVar.f5852c = new ArrayList();
                JSONArray jSONArray2 = jSONArray.getJSONObject(i10).getJSONArray("definitionList");
                for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                    aVar.f5852c.add(Integer.valueOf(jSONArray2.getInt(i11)));
                }
                arrayList.add(aVar);
            }
            return arrayList;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* renamed from: j */
    public List<Integer> m5304j() throws JSONException {
        List<a> listM5303i = m5303i();
        String strM5302h = m5302h();
        if (strM5302h == null || listM5303i == null) {
            return null;
        }
        for (a aVar : listM5303i) {
            if (aVar.f5850a.equals(strM5302h)) {
                return aVar.f5852c;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C6647j m5295b(String str, String str2) {
        if (str == null) {
            return null;
        }
        for (C6647j c6647j : m5297c()) {
            if (str.equals(c6647j.m5310f()) && (c6647j.m5309e() == null || c6647j.m5309e().contains(str2))) {
                return c6647j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C6647j m5293a(String str, String str2) throws JSONException {
        List<Integer> list;
        List<a> listM5303i = m5303i();
        if (str == null || listM5303i == null) {
            list = null;
        } else {
            for (a aVar : listM5303i) {
                if (aVar.f5850a.equals(str)) {
                    list = aVar.f5852c;
                    break;
                }
            }
            list = null;
        }
        if (list != null) {
            for (C6647j c6647j : m5297c()) {
                if (list.contains(Integer.valueOf(c6647j.f5861i)) && (c6647j.m5309e() == null || c6647j.m5309e().contains(str2))) {
                    return c6647j;
                }
            }
        }
        return null;
    }
}
