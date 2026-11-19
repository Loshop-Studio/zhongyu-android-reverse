package p298q0;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.C5869a;
import com.huawei.hms.android.SystemUtils;
import p168h0.C9438e;
import p168h0.InterfaceC9439f;
import p198j0.InterfaceC9657j;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: q0.v */
/* loaded from: classes3.dex */
public final class C10713v implements InterfaceC9439f {

    /* renamed from: a */
    public final C5869a f25782a;

    public C10713v(C5869a c5869a) {
        this.f25782a = c5869a;
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC9657j mo4266b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, C9438e c9438e) {
        return this.f25782a.m4299d(parcelFileDescriptor, i10, i11, c9438e);
    }

    @Override // p168h0.InterfaceC9439f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo4265a(ParcelFileDescriptor parcelFileDescriptor, C9438e c9438e) {
        return m22687e(parcelFileDescriptor) && this.f25782a.m4304o(parcelFileDescriptor);
    }

    /* renamed from: e */
    public final boolean m22687e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !(SystemUtils.PRODUCT_HUAWEI.equalsIgnoreCase(str) || SystemUtils.PRODUCT_HONOR.equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= IjkMediaMeta.AV_CH_STEREO_LEFT;
    }
}
