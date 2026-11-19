package p122t;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C2892a;
import p076j.C3794d;
import p076j.InterfaceC3795e;
import p093m.InterfaceC4361j;

/* renamed from: t.y */
/* loaded from: classes2.dex */
public final class C4579y implements InterfaceC3795e {

    /* renamed from: a */
    public final C2892a f5758a;

    public C4579y(C2892a c2892a) {
        this.f5758a = c2892a;
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC4361j mo1966b(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, C3794d c3794d) {
        return this.f5758a.m1950d(parcelFileDescriptor, i4, i5, c3794d);
    }

    @Override // p076j.InterfaceC3795e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo1965a(ParcelFileDescriptor parcelFileDescriptor, C3794d c3794d) {
        return this.f5758a.m1955o(parcelFileDescriptor);
    }
}
