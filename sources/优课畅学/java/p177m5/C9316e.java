package p177m5;

import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tencent.ijk.media.player.IjkMediaMeta;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p143j5.C9015b;
import p143j5.C9016c;
import p143j5.C9017d;
import p143j5.C9019f;
import p143j5.C9020g;
import p188n5.AbstractC9427g;

/* renamed from: m5.e */
/* loaded from: classes5.dex */
public class C9316e implements InterfaceC9312a {

    /* renamed from: a */
    public JSONObject f18345a;

    /* renamed from: b */
    public String f18346b;

    /* renamed from: c */
    public List f18347c;

    /* renamed from: d */
    public C9015b f18348d;

    /* renamed from: e */
    public List f18349e;

    /* renamed from: f */
    public String f18350f;

    /* renamed from: g */
    public C9016c f18351g;

    /* renamed from: h */
    public C9016c f18352h;

    /* renamed from: i */
    public LinkedHashMap f18353i;

    /* renamed from: j */
    public String f18354j;

    /* renamed from: k */
    public List f18355k;

    /* renamed from: l */
    public C9020g f18356l;

    public C9316e(JSONObject jSONObject) {
        this.f18345a = jSONObject;
        m17133l();
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: a */
    public String mo17115a() {
        return null;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: b */
    public C9015b mo17116b() {
        return this.f18348d;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: c */
    public C9020g mo17117c() {
        return this.f18356l;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: d */
    public List mo17118d() {
        return this.f18349e;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: e */
    public List mo17119e() {
        return null;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: f */
    public List mo17120f() {
        return this.f18355k;
    }

    /* renamed from: g */
    public final String m17128g(JSONObject jSONObject) {
        return jSONObject.getString("defaultVideoClassification");
    }

    @Override // p177m5.InterfaceC9312a
    public String getName() {
        return this.f18350f;
    }

    @Override // p177m5.InterfaceC9312a
    public String getUrl() {
        return this.f18354j;
    }

    /* renamed from: h */
    public final C9015b m17129h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("imageSpriteList");
        if (jSONArray == null) {
            return null;
        }
        JSONObject jSONObject2 = jSONArray.getJSONObject(jSONArray.length() - 1);
        C9015b c9015b = new C9015b();
        c9015b.f17223b = jSONObject2.getString("webVttUrl");
        JSONArray jSONArray2 = jSONObject2.getJSONArray("imageUrls");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray2.length(); i10++) {
            arrayList.add(jSONArray2.getString(i10));
        }
        c9015b.f17222a = arrayList;
        return c9015b;
    }

    /* renamed from: i */
    public final List m17130i(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = jSONObject.getJSONArray("keyFrameDescList");
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            String string = jSONArray.getJSONObject(i10).getString("content");
            float f10 = (float) (jSONArray.getJSONObject(i10).getLong("timeOffset") / 1000.0d);
            C9017d c9017d = new C9017d();
            try {
                c9017d.f17233a = URLDecoder.decode(string, "UTF-8");
            } catch (UnsupportedEncodingException e10) {
                e10.printStackTrace();
                c9017d.f17233a = "";
            }
            c9017d.f17234b = f10;
            arrayList.add(c9017d);
        }
        return arrayList;
    }

    /* renamed from: j */
    public final C9016c m17131j(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (!jSONObject.has("masterPlayList") || (jSONObject2 = jSONObject.getJSONObject("masterPlayList")) == null) {
            return null;
        }
        C9016c c9016c = new C9016c();
        c9016c.f17232i = jSONObject2.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        return c9016c;
    }

    /* renamed from: k */
    public final String m17132k(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("basicInfo");
        if (jSONObject2 != null) {
            return jSONObject2.getString(HintConstants.AUTOFILL_HINT_NAME);
        }
        return null;
    }

    /* renamed from: l */
    public final void m17133l() {
        try {
            JSONObject jSONObjectOptJSONObject = this.f18345a.optJSONObject("playerInfo");
            if (jSONObjectOptJSONObject != null) {
                this.f18346b = m17128g(jSONObjectOptJSONObject);
                this.f18347c = m17137p(jSONObjectOptJSONObject);
            }
            JSONObject jSONObjectOptJSONObject2 = this.f18345a.optJSONObject("imageSpriteInfo");
            if (jSONObjectOptJSONObject2 != null) {
                this.f18348d = m17129h(jSONObjectOptJSONObject2);
            }
            JSONObject jSONObjectOptJSONObject3 = this.f18345a.optJSONObject("keyFrameDescInfo");
            if (jSONObjectOptJSONObject3 != null) {
                this.f18349e = m17130i(jSONObjectOptJSONObject3);
            }
            JSONObject jSONObjectOptJSONObject4 = this.f18345a.optJSONObject("videoInfo");
            if (jSONObjectOptJSONObject4 != null) {
                this.f18350f = m17132k(jSONObjectOptJSONObject4);
                this.f18351g = m17134m(jSONObjectOptJSONObject4);
                this.f18352h = m17131j(jSONObjectOptJSONObject4);
                this.f18353i = m17136o(jSONObjectOptJSONObject4);
            }
            m17138q();
        } catch (JSONException e10) {
            TXCLog.m4991e("TCPlayInfoParserV2", Log.getStackTraceString(e10));
        }
    }

    /* renamed from: m */
    public final C9016c m17134m(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("sourceVideo");
        if (jSONObject2 == null) {
            return null;
        }
        C9016c c9016c = new C9016c();
        c9016c.f17232i = jSONObject2.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
        c9016c.f17227d = jSONObject2.getInt(TypedValues.TransitionType.S_DURATION);
        c9016c.f17225b = jSONObject2.getInt("width");
        c9016c.f17224a = jSONObject2.getInt("height");
        c9016c.f17226c = jSONObject2.getInt("size");
        c9016c.f17228e = jSONObject2.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
        return c9016c;
    }

    /* renamed from: n */
    public final List m17135n(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("transcodeList");
        if (jSONArrayOptJSONArray != null) {
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                C9016c c9016c = new C9016c();
                c9016c.f17232i = jSONObject2.getString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                c9016c.f17227d = jSONObject2.getInt(TypedValues.TransitionType.S_DURATION);
                c9016c.f17225b = jSONObject2.getInt("width");
                c9016c.f17224a = jSONObject2.getInt("height");
                c9016c.f17226c = jSONObject2.getInt("size");
                c9016c.f17228e = jSONObject2.getInt(IjkMediaMeta.IJKM_KEY_BITRATE);
                c9016c.f17229f = jSONObject2.getInt("definition");
                arrayList.add(c9016c);
            }
        }
        return arrayList;
    }

    /* renamed from: o */
    public final LinkedHashMap m17136o(JSONObject jSONObject) throws JSONException {
        List listM17135n = m17135n(jSONObject);
        if (listM17135n == null) {
            return this.f18353i;
        }
        for (int i10 = 0; i10 < listM17135n.size(); i10++) {
            C9016c c9016c = (C9016c) listM17135n.get(i10);
            if (this.f18347c != null) {
                for (int i11 = 0; i11 < this.f18347c.size(); i11++) {
                    C9019f c9019f = (C9019f) this.f18347c.get(i11);
                    if (c9019f.m15671a().contains(Integer.valueOf(c9016c.f17229f))) {
                        c9016c.f17230g = c9019f.m15672b();
                        c9016c.f17231h = c9019f.m15673c();
                    }
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i12 = 0; i12 < listM17135n.size(); i12++) {
            C9016c c9016c2 = (C9016c) listM17135n.get(i12);
            if (linkedHashMap.containsKey(c9016c2.f17230g)) {
                C9016c c9016c3 = (C9016c) linkedHashMap.get(c9016c2.f17230g);
                if (!c9016c3.m15670b().endsWith("mp4") && c9016c2.m15670b().endsWith("mp4")) {
                    linkedHashMap.remove(c9016c3.f17230g);
                    linkedHashMap.put(c9016c2.f17230g, c9016c2);
                }
            } else {
                linkedHashMap.put(c9016c2.f17230g, c9016c2);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: p */
    public final List m17137p(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray("videoClassification");
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                C9019f c9019f = new C9019f();
                c9019f.m15675e(jSONObject2.getString("id"));
                c9019f.m15676f(jSONObject2.getString(HintConstants.AUTOFILL_HINT_NAME));
                ArrayList arrayList2 = new ArrayList();
                JSONArray jSONArray2 = jSONObject2.getJSONArray("definitionList");
                if (jSONArray2 != null) {
                    for (int i11 = 0; i11 < jSONArray2.length(); i11++) {
                        arrayList2.add(Integer.valueOf(jSONArray2.getInt(i11)));
                    }
                }
                c9019f.m15674d(arrayList2);
                arrayList.add(c9019f);
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public final void m17138q() {
        String strM15670b;
        C9016c c9016c = this.f18352h;
        if (c9016c != null) {
            this.f18354j = c9016c.m15670b();
            return;
        }
        LinkedHashMap linkedHashMap = this.f18353i;
        if (linkedHashMap != null && linkedHashMap.size() != 0) {
            C9016c c9016c2 = (C9016c) this.f18353i.get(this.f18346b);
            if (c9016c2 == null) {
                Iterator it = this.f18353i.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strM15670b = null;
                        break;
                    }
                    C9016c c9016c3 = (C9016c) it.next();
                    if (c9016c3 != null && c9016c3.m15670b() != null) {
                        strM15670b = c9016c3.m15670b();
                        c9016c2 = c9016c3;
                        break;
                    }
                }
            } else {
                strM15670b = c9016c2.m15670b();
            }
            if (strM15670b != null) {
                this.f18355k = AbstractC9427g.m17282e(this.f18353i);
                this.f18356l = AbstractC9427g.m17280c(c9016c2);
                this.f18354j = strM15670b;
                return;
            }
        }
        C9016c c9016c4 = this.f18351g;
        if (c9016c4 != null) {
            String str = this.f18346b;
            if (str != null) {
                this.f18356l = AbstractC9427g.m17281d(c9016c4, str);
                ArrayList arrayList = new ArrayList();
                this.f18355k = arrayList;
                arrayList.add(this.f18356l);
            }
            this.f18354j = this.f18351g.m15670b();
        }
    }
}
