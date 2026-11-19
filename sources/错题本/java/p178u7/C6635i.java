package p178u7;

import com.zykj.mistake.feature.collection.component.C4568n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.Ref$ObjectRef;
import okhttp3.internal.http2.ErrorCode;
import p153r7.AbstractC6479a;
import p185v7.C6685n;

/* renamed from: u7.i */
/* loaded from: classes4.dex */
public final class C6635i extends AbstractC6479a {

    /* renamed from: e */
    public final /* synthetic */ int f11124e;

    /* renamed from: f */
    public final /* synthetic */ Object f11125f;

    /* renamed from: g */
    public final /* synthetic */ Object f11126g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6635i(int i, String str, Object obj, Object obj2) {
        super(str, true);
        this.f11124e = i;
        this.f11125f = obj;
        this.f11126g = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [T, u7.b0] */
    @Override // p153r7.AbstractC6479a
    /* renamed from: a */
    public final long mo5932a() {
        long jM6262a;
        int i;
        C6649w[] c6649wArr;
        switch (this.f11124e) {
            case 0:
                C6641o c6641o = (C6641o) this.f11125f;
                c6641o.f11144a.mo5921a(c6641o, (C6628b0) ((Ref$ObjectRef) this.f11126g).element);
                return -1L;
            case 1:
                try {
                    ((C6641o) this.f11125f).f11144a.mo5922b((C6649w) this.f11126g);
                } catch (IOException e) {
                    C6685n c6685n = C6685n.f11276a;
                    C6685n c6685n2 = C6685n.f11276a;
                    String str = "Http2Connection.Listener failure for " + ((C6641o) this.f11125f).f11146c;
                    c6685n2.getClass();
                    C6685n.m6380i(str, 4, e);
                    try {
                        ((C6649w) this.f11126g).m6296c(ErrorCode.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C4568n c4568n = (C4568n) this.f11125f;
                C6628b0 c6628b0 = (C6628b0) this.f11126g;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                C6641o c6641o2 = (C6641o) c4568n.f6427c;
                synchronized (c6641o2.f11166w) {
                    synchronized (c6641o2) {
                        try {
                            C6628b0 c6628b02 = c6641o2.f11160q;
                            ?? c6628b03 = new C6628b0();
                            c6628b03.m6263b(c6628b02);
                            c6628b03.m6263b(c6628b0);
                            ref$ObjectRef.element = c6628b03;
                            jM6262a = c6628b03.m6262a() - c6628b02.m6262a();
                            i = 0;
                            c6649wArr = (jM6262a == 0 || c6641o2.f11145b.isEmpty()) ? null : (C6649w[]) c6641o2.f11145b.values().toArray(new C6649w[0]);
                            C6628b0 c6628b04 = (C6628b0) ref$ObjectRef.element;
                            AbstractC5830k.m5330g(c6628b04, "<set-?>");
                            c6641o2.f11160q = c6628b04;
                            c6641o2.f11153j.m6129b(new C6635i(i, c6641o2.f11146c + " onSettings", c6641o2, ref$ObjectRef), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c6641o2.f11166w.m6304a((C6628b0) ref$ObjectRef.element);
                    } catch (IOException e4) {
                        c6641o2.m6278b(e4);
                    }
                }
                if (c6649wArr != null) {
                    int length = c6649wArr.length;
                    while (i < length) {
                        C6649w c6649w = c6649wArr[i];
                        synchronized (c6649w) {
                            c6649w.f11203f += jM6262a;
                            if (jM6262a > 0) {
                                c6649w.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return -1L;
        }
    }
}
