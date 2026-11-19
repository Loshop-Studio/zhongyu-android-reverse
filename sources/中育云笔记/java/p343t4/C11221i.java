package p343t4;

import android.content.Context;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;
import p332s4.InterfaceC11058b;
import p332s4.InterfaceC11060d;

/* renamed from: t4.i */
/* loaded from: classes5.dex */
public class C11221i implements InterfaceC11058b {

    /* renamed from: a */
    public final Context f26929a;

    /* renamed from: b */
    public final String f26930b;

    /* renamed from: c */
    public InterfaceC11060d f26931c;

    public C11221i(Context context, String str) {
        this.f26929a = context;
        this.f26930b = str;
    }

    @Override // p332s4.InterfaceC11058b
    /* renamed from: a */
    public String mo24514a(String str, String str2) {
        if (this.f26931c == null) {
            this.f26931c = m24963b();
        }
        if (this.f26931c == null) {
            Log.w("AGC_FlexibleDecrypt", "decrypt Flexible Decrypt error, use old instead");
            this.f26931c = new C11220h(this.f26929a, this.f26930b).m24962b();
        }
        return this.f26931c.mo24515a(AbstractC11225m.m24976b(this.f26929a, this.f26930b, "agc_plugin_", str), str2);
    }

    /* renamed from: b */
    public InterfaceC11060d m24963b() throws JSONException {
        String strM24976b = AbstractC11225m.m24976b(this.f26929a, this.f26930b, "agc_plugin_", "crypto_component");
        if (strM24976b == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(AbstractC11213a.m24932b(strM24976b), "utf-8"));
            return new C11219g(new C11217e(jSONObject.getString("rx"), jSONObject.getString("ry"), jSONObject.getString("rz"), jSONObject.getString("salt"), jSONObject.getString("algorithm"), jSONObject.getInt("iterationCount")));
        } catch (UnsupportedEncodingException | IllegalArgumentException | JSONException e10) {
            Log.e("AGC_FlexibleDecrypt", "FlexibleDecrypt exception: " + e10.getMessage());
            return null;
        }
    }
}
