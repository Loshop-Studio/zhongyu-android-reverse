package p177m5;

import android.text.TextUtils;
import android.util.Log;
import androidx.autofill.HintConstants;
import com.tencent.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.zykj.video.play.protocol.PlayInfoConstant$EncyptedUrlType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p143j5.C9014a;
import p143j5.C9015b;
import p143j5.C9017d;
import p143j5.C9018e;
import p143j5.C9020g;

/* renamed from: m5.f */
/* loaded from: classes5.dex */
public class C9317f implements InterfaceC9312a {

    /* renamed from: a */
    public JSONObject f18357a;

    /* renamed from: b */
    public String f18358b;

    /* renamed from: c */
    public String f18359c;

    /* renamed from: d */
    public String f18360d;

    /* renamed from: e */
    public List f18361e;

    /* renamed from: f */
    public C9015b f18362f;

    /* renamed from: g */
    public List f18363g;

    /* renamed from: h */
    public List f18364h;

    public C9317f(JSONObject jSONObject) throws JSONException {
        this.f18357a = jSONObject;
        m17139h();
    }

    /* renamed from: h */
    private void m17139h() throws JSONException {
        try {
            JSONObject jSONObject = this.f18357a.getJSONObject("media");
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("basicInfo");
                if (jSONObjectOptJSONObject != null) {
                    this.f18358b = jSONObjectOptJSONObject.optString(HintConstants.AUTOFILL_HINT_NAME);
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("streamingInfo");
                if (jSONObject2 != null) {
                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("plainOutput");
                    if (jSONObjectOptJSONObject2 != null) {
                        this.f18359c = jSONObjectOptJSONObject2.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                        m17141i(jSONObjectOptJSONObject2.optJSONArray("subStreams"));
                    }
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("drmOutput");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                        this.f18361e = new ArrayList();
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                            JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(i10);
                            String strOptString = jSONObjectOptJSONObject3.optString("type");
                            String strOptString2 = jSONObjectOptJSONObject3.optString(IjkMediaPlayer.OnNativeInvokeListener.ARG_URL);
                            C9014a c9014a = new C9014a();
                            c9014a.f17220a = strOptString;
                            c9014a.f17221b = strOptString2;
                            this.f18361e.add(c9014a);
                            m17141i(jSONObjectOptJSONObject3.optJSONArray("subStreams"));
                        }
                    }
                    this.f18360d = jSONObject2.optString("drmToken");
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("imageSpriteInfo");
                if (jSONObjectOptJSONObject4 != null) {
                    C9015b c9015b = new C9015b();
                    this.f18362f = c9015b;
                    c9015b.f17223b = jSONObjectOptJSONObject4.getString("webVttUrl");
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject4.optJSONArray("imageUrls");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        ArrayList arrayList = new ArrayList();
                        for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                            arrayList.add(jSONArrayOptJSONArray2.getString(i11));
                        }
                        this.f18362f.f17222a = arrayList;
                    }
                }
                JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("keyFrameDescInfo");
                if (jSONObjectOptJSONObject5 != null) {
                    this.f18363g = new ArrayList();
                    JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject5.optJSONArray("keyFrameDescList");
                    if (jSONArrayOptJSONArray3 == null || jSONArrayOptJSONArray3.length() <= 0) {
                        return;
                    }
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray3.getJSONObject(i12);
                        C9017d c9017d = new C9017d();
                        c9017d.f17234b = jSONObject3.optLong("timeOffset");
                        c9017d.f17233a = jSONObject3.optString("content");
                        this.f18363g.add(c9017d);
                    }
                }
            }
        } catch (JSONException e10) {
            TXCLog.m4991e("TCPlayInfoParserV4", Log.getStackTraceString(e10));
        }
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: a */
    public String mo17115a() {
        if (TextUtils.isEmpty(this.f18360d)) {
            return null;
        }
        return this.f18360d;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: b */
    public C9015b mo17116b() {
        return this.f18362f;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: c */
    public C9020g mo17117c() {
        return null;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: d */
    public List mo17118d() {
        return this.f18363g;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: e */
    public List mo17119e() {
        return this.f18364h;
    }

    @Override // p177m5.InterfaceC9312a
    /* renamed from: f */
    public List mo17120f() {
        return null;
    }

    /* renamed from: g */
    public String m17140g(PlayInfoConstant$EncyptedUrlType playInfoConstant$EncyptedUrlType) {
        for (C9014a c9014a : this.f18361e) {
            String str = c9014a.f17220a;
            if (str != null && str.equalsIgnoreCase(playInfoConstant$EncyptedUrlType.m12498a())) {
                return c9014a.f17221b;
            }
        }
        return null;
    }

    @Override // p177m5.InterfaceC9312a
    public String getName() {
        return this.f18358b;
    }

    @Override // p177m5.InterfaceC9312a
    public String getUrl() {
        return !TextUtils.isEmpty(this.f18360d) ? m17140g(PlayInfoConstant$EncyptedUrlType.SIMPLEAES) : this.f18359c;
    }

    /* renamed from: i */
    public final void m17141i(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.f18364h = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            C9018e c9018e = new C9018e();
            int iOptInt = jSONObject.optInt("width");
            int iOptInt2 = jSONObject.optInt("height");
            c9018e.f17237c = iOptInt;
            c9018e.f17238d = iOptInt2;
            c9018e.f17235a = jSONObject.optString("resolutionName");
            c9018e.f17236b = jSONObject.optString("type");
            this.f18364h.add(c9018e);
        }
    }
}
