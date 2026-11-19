package p114g2;

import android.content.Context;
import org.repackage.com.heytap.openid.sdk.OpenIDSDK;
import p176m2.C8957f;

/* renamed from: g2.e */
/* loaded from: classes4.dex */
public class C8011e implements InterfaceC8040s0 {

    /* renamed from: a */
    public boolean f13492a = false;

    @Override // p114g2.InterfaceC8040s0
    /* renamed from: a */
    public String mo12569a(Context context) {
        try {
            if (!this.f13492a) {
                OpenIDSDK.m15095a(context);
                this.f13492a = true;
            }
            if (OpenIDSDK.m15096a()) {
                return OpenIDSDK.m15098c(context);
            }
            C8957f.m14285f(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            C8957f.m14285f(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
