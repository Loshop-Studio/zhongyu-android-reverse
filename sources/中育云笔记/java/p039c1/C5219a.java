package p039c1;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p109d1.AbstractC8910k;
import p168h0.InterfaceC9435b;

/* renamed from: c1.a */
/* loaded from: classes3.dex */
public final class C5219a implements InterfaceC9435b {

    /* renamed from: b */
    public final int f3109b;

    /* renamed from: c */
    public final InterfaceC9435b f3110c;

    public C5219a(int i10, InterfaceC9435b interfaceC9435b) {
        this.f3109b = i10;
        this.f3110c = interfaceC9435b;
    }

    /* renamed from: c */
    public static InterfaceC9435b m2796c(Context context) {
        return new C5219a(context.getResources().getConfiguration().uiMode & 48, AbstractC5220b.m2800c(context));
    }

    @Override // p168h0.InterfaceC9435b
    /* renamed from: b */
    public void mo2797b(MessageDigest messageDigest) {
        this.f3110c.mo2797b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3109b).array());
    }

    @Override // p168h0.InterfaceC9435b
    public boolean equals(Object obj) {
        if (obj instanceof C5219a) {
            C5219a c5219a = (C5219a) obj;
            if (this.f3109b == c5219a.f3109b && this.f3110c.equals(c5219a.f3110c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p168h0.InterfaceC9435b
    public int hashCode() {
        return AbstractC8910k.m17485p(this.f3110c, this.f3109b);
    }
}
