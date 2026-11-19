package p114g2;

import android.content.Context;
import org.repackage.com.vivo.identifier.IdentifierManager;
import p176m2.C8957f;

/* renamed from: g2.g */
/* loaded from: classes4.dex */
public class C8015g implements InterfaceC8040s0 {
    @Override // p114g2.InterfaceC8040s0
    /* renamed from: a */
    public String mo12569a(Context context) {
        try {
            if (IdentifierManager.m15124a(context)) {
                return IdentifierManager.m15125b(context);
            }
            C8957f.m14285f(2, "当前设备不支持获取OAID");
            return null;
        } catch (Exception unused) {
            C8957f.m14285f(2, "未检测到您集成OAID SDK包");
            return null;
        }
    }
}
