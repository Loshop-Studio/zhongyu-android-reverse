package p228r0;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C5505a;
import p122h0.C8084d;
import p122h0.InterfaceC8085e;
import p152k0.InterfaceC8259j;

/* renamed from: r0.v */
/* loaded from: classes3.dex */
public final class C9412v implements InterfaceC8085e {

    /* renamed from: a */
    public final C5505a f16408a;

    public C9412v(C5505a c5505a) {
        this.f16408a = c5505a;
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8259j mo3290b(ParcelFileDescriptor parcelFileDescriptor, int i9, int i10, C8084d c8084d) {
        return this.f16408a.m3274d(parcelFileDescriptor, i9, i10, c8084d);
    }

    @Override // p122h0.InterfaceC8085e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3289a(ParcelFileDescriptor parcelFileDescriptor, C8084d c8084d) {
        return this.f16408a.m3279o(parcelFileDescriptor);
    }
}
