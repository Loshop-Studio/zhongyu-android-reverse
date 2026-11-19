package p253n;

import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import coil3.util.AbstractC5491d;
import okio.Okio;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p001a0.C0021r;
import p212k.AbstractC9767u;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p228l.C10058a;
import p253n.InterfaceC10281k;
import p325rc.AbstractC10947g0;
import p380w.C11634n;
import vc.InterfaceC11588c;

/* renamed from: n.a */
/* loaded from: classes3.dex */
public final class C10271a implements InterfaceC10281k {

    /* renamed from: a */
    public final C9766t f24453a;

    /* renamed from: b */
    public final C11634n f24454b;

    /* renamed from: n.a$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (AbstractC5491d.m3325h(c9766t)) {
                return new C10271a(c9766t, c11634n);
            }
            return null;
        }
    }

    public C10271a(C9766t c9766t, C11634n c11634n) {
        this.f24453a = c9766t;
        this.f24454b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) {
        String strM23954w0 = AbstractC10947g0.m23954w0(AbstractC10947g0.m23936g0(AbstractC9767u.m19692f(this.f24453a), 1), MqttTopic.TOPIC_LEVEL_SEPARATOR, null, null, 0, null, null, 62, null);
        return new C10286p(AbstractC10086s.m21094a(Okio.buffer(Okio.source(this.f24454b.m25743c().getAssets().open(strM23954w0))), this.f24454b.m25747g(), new C10058a(strM23954w0)), C0021r.f9a.m49b(strM23954w0), DataSource.f3612e);
    }
}
