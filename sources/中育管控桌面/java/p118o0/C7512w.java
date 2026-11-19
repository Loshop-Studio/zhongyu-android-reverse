package p118o0;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C4737a;
import p053f0.C6285d;
import p053f0.InterfaceC6286e;
import p067h0.InterfaceC6440j;

/* renamed from: o0.w */
/* loaded from: classes3.dex */
public final class C7512w implements InterfaceC6286e {

    /* renamed from: a */
    public final C4737a f9699a;

    public C7512w(C4737a c4737a) {
        this.f9699a = c4737a;
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC6440j mo2796a(ParcelFileDescriptor parcelFileDescriptor, int i6, int i7, C6285d c6285d) {
        return this.f9699a.m2830d(parcelFileDescriptor, i6, i7, c6285d);
    }

    @Override // p053f0.InterfaceC6286e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo2797b(ParcelFileDescriptor parcelFileDescriptor, C6285d c6285d) {
        return m8647e(parcelFileDescriptor) && this.f9699a.m2835o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m8647e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }
}
