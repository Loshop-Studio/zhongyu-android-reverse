package p318r5;

import com.huawei.hms.hatool.AbstractC7319w;
import java.util.List;
import java.util.Map;

/* renamed from: r5.r */
/* loaded from: classes5.dex */
public class C10891r implements InterfaceRunnableC10897u {

    /* renamed from: c */
    public byte[] f26274c;

    /* renamed from: d */
    public String f26275d;

    /* renamed from: e */
    public String f26276e;

    /* renamed from: f */
    public String f26277f;

    /* renamed from: g */
    public String f26278g;

    /* renamed from: h */
    public List f26279h;

    public C10891r(byte[] bArr, String str, String str2, String str3, String str4, List list) {
        this.f26274c = (byte[]) bArr.clone();
        this.f26275d = str;
        this.f26276e = str2;
        this.f26278g = str3;
        this.f26277f = str4;
        this.f26279h = list;
    }

    /* renamed from: a */
    public final Map m23601a() {
        return AbstractC10857e0.m23410g(this.f26276e, this.f26278g, this.f26277f);
    }

    /* renamed from: b */
    public final C10884n0 m23602b(Map map) {
        return AbstractC7319w.m8651b(this.f26275d, this.f26274c, map);
    }

    /* renamed from: c */
    public final void m23603c() {
        C10856e.m23404d().m23405b(new C10874k(this.f26279h, this.f26276e, this.f26277f, this.f26278g));
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC10861f1.m23430b("hmsSdk", "send data running");
        int iM23568b = m23602b(m23601a()).m23568b();
        if (iM23568b != 200) {
            m23603c();
            return;
        }
        AbstractC10861f1.m23434f("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f26277f, this.f26278g, this.f26276e, Integer.valueOf(iM23568b));
    }
}
