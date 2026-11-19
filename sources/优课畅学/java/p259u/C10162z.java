package p259u;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C5450a;
import com.tencent.ijk.media.player.IjkMediaMeta;
import p160l.C9230d;
import p160l.InterfaceC9231e;
import p182n.InterfaceC9357j;

/* renamed from: u.z */
/* loaded from: classes3.dex */
public final class C10162z implements InterfaceC9231e {

    /* renamed from: a */
    public final C5450a f20287a;

    public C10162z(C5450a c5450a) {
        this.f20287a = c5450a;
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9357j mo3061a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C9230d c9230d) {
        return this.f20287a.m3095d(parcelFileDescriptor, i10, i11, c9230d);
    }

    @Override // p160l.InterfaceC9231e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo3062b(ParcelFileDescriptor parcelFileDescriptor, C9230d c9230d) {
        return m19027e(parcelFileDescriptor) && this.f20287a.m3100o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m19027e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= IjkMediaMeta.AV_CH_STEREO_LEFT;
    }
}
