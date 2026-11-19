package p261v0;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C5401a;
import p162m0.C8539d;
import p162m0.InterfaceC8540e;
import p184o0.InterfaceC8690j;

/* renamed from: v0.w */
/* loaded from: classes3.dex */
public final class C9650w implements InterfaceC8540e {

    /* renamed from: a */
    public final C5401a f16842a;

    public C9650w(C5401a c5401a) {
        this.f16842a = c5401a;
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC8690j mo3617b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C8539d c8539d) {
        return this.f16842a.m3650d(parcelFileDescriptor, i10, i11, c8539d);
    }

    @Override // p162m0.InterfaceC8540e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3616a(ParcelFileDescriptor parcelFileDescriptor, C8539d c8539d) {
        return m16030e(parcelFileDescriptor) && this.f16842a.m3655o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m16030e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
