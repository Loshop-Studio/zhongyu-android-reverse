package p343t4;

import android.content.Context;
import org.eclipse.paho.client.mqttv3.DisconnectedBufferOptions;
import p332s4.InterfaceC11058b;
import p332s4.InterfaceC11060d;

/* renamed from: t4.h */
/* loaded from: classes5.dex */
public class C11220h implements InterfaceC11058b {

    /* renamed from: a */
    public final Context f26926a;

    /* renamed from: b */
    public final String f26927b;

    /* renamed from: c */
    public InterfaceC11060d f26928c;

    public C11220h(Context context, String str) {
        this.f26926a = context;
        this.f26927b = str;
    }

    @Override // p332s4.InterfaceC11058b
    /* renamed from: a */
    public String mo24514a(String str, String str2) {
        if (this.f26928c == null) {
            this.f26928c = m24962b();
        }
        return this.f26928c.mo24515a(AbstractC11225m.m24976b(this.f26926a, this.f26927b, "agc_", str), str2);
    }

    /* renamed from: b */
    public InterfaceC11060d m24962b() {
        return new C11219g(new C11217e(AbstractC11225m.m24976b(this.f26926a, this.f26927b, "agc_", "/AD91D45E3E72DB6989DDCB13287E75061FABCB933D886E6C6ABEF0939B577138"), AbstractC11225m.m24976b(this.f26926a, this.f26927b, "agc_", "/B314B3BF013DF5AC4134E880AF3D2B7C9FFBE8F0305EAC1C898145E2BCF1F21C"), AbstractC11225m.m24976b(this.f26926a, this.f26927b, "agc_", "/C767BD8FDF53E53D059BE95B09E2A71056F5F180AECC62836B287ACA5793421B"), AbstractC11225m.m24976b(this.f26926a, this.f26927b, "agc_", "/DCB3E6D4C2CF80F30D89CDBC412C964DA8381BB84668769391FBCC3E329AD0FD"), "PBKDF2WithHmacSHA1", DisconnectedBufferOptions.DISCONNECTED_BUFFER_SIZE_DEFAULT));
    }
}
