package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.AbstractC5830k;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;
import okhttp3.Protocol;
import p101k7.C5770l;
import p101k7.InterfaceC5765g;

/* renamed from: kotlinx.serialization.json.internal.l */
/* loaded from: classes4.dex */
public final class C6031l {

    /* renamed from: a */
    public final /* synthetic */ int f9558a;

    /* renamed from: b */
    public int f9559b;

    /* renamed from: c */
    public Object f9560c;

    /* renamed from: d */
    public Object f9561d;

    public C6031l(int i) {
        this.f9558a = i;
        switch (i) {
            case 2:
                C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(Boolean.FALSE);
                this.f9560c = c5946n0M5546b;
                this.f9561d = new C5901a0(c5946n0M5546b);
                break;
        }
    }

    /* renamed from: a */
    public String m5699a() {
        StringBuilder sb = new StringBuilder("$");
        int i = this.f9559b + 1;
        for (int i8 = 0; i8 < i; i8++) {
            Object obj = ((Object[]) this.f9560c)[i8];
            if (obj instanceof InterfaceC5765g) {
                InterfaceC5765g interfaceC5765g = (InterfaceC5765g) obj;
                if (!AbstractC5830k.m5325b(interfaceC5765g.getKind(), C5770l.f9147c)) {
                    int i9 = ((int[]) this.f9561d)[i8];
                    if (i9 >= 0) {
                        sb.append(".");
                        sb.append(interfaceC5765g.mo5102e(i9));
                    }
                } else if (((int[]) this.f9561d)[i8] != -1) {
                    sb.append("[");
                    sb.append(((int[]) this.f9561d)[i8]);
                    sb.append("]");
                }
            } else if (obj != C6030k.f9557a) {
                sb.append("['");
                sb.append(obj);
                sb.append("']");
            }
        }
        return sb.toString();
    }

    public String toString() {
        switch (this.f9558a) {
            case 0:
                return m5699a();
            case 1:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.f9560c) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f9559b);
                sb.append(' ');
                sb.append((String) this.f9561d);
                String string = sb.toString();
                AbstractC5830k.m5329f(string, "StringBuilder().apply(builderAction).toString()");
                return string;
            default:
                return super.toString();
        }
    }

    public C6031l(Protocol protocol, int i, String str) {
        this.f9558a = 1;
        AbstractC5830k.m5330g(protocol, "protocol");
        this.f9560c = protocol;
        this.f9559b = i;
        this.f9561d = str;
    }
}
