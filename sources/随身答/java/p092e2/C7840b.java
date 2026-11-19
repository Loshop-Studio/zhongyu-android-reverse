package p092e2;

import android.content.Context;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import org.json.JSONObject;
import p114g2.C8024k0;
import p186n2.InterfaceC9088b;

/* renamed from: e2.b */
/* loaded from: classes4.dex */
public class C7840b implements UMLogDataProtocol, InterfaceC9088b {

    /* renamed from: a */
    public static Context f13174a;

    /* renamed from: e2.b$b */
    public static class b {

        /* renamed from: a */
        public static final C7840b f13175a = new C7840b();
    }

    /* renamed from: f */
    public static C7840b m12281f(Context context) {
        if (f13174a == null && context != null) {
            f13174a = context.getApplicationContext();
        }
        return b.f13175a;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: a */
    public void mo6251a(Object obj) {
        C8024k0.m12622a(f13174a).m12646e(obj);
    }

    @Override // p186n2.InterfaceC9088b
    /* renamed from: b */
    public void mo12282b() {
        C8024k0.m12622a(f13174a).m12657p();
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: c */
    public void mo6252c(Object obj, int i9) {
        C8024k0.m12622a(f13174a).m12647f(obj, i9);
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    /* renamed from: d */
    public JSONObject mo6253d(long j9) {
        return C8024k0.m12622a(f13174a).m12643b(j9);
    }

    @Override // p186n2.InterfaceC9088b
    /* renamed from: e */
    public void mo12283e() {
        C8024k0.m12622a(f13174a).m12645d();
    }

    public C7840b() {
    }
}
