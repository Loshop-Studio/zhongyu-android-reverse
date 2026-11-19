package p040c2;

import com.friday.common.entity.ShareCacheEntity;
import com.friday.common.helper.C5962b;
import vc.InterfaceC11588c;

/* renamed from: c2.g2 */
/* loaded from: classes3.dex */
public interface InterfaceC5250g2 {
    /* renamed from: a */
    static /* synthetic */ Object m2805a(InterfaceC5250g2 interfaceC5250g2, long j10, String str, long j11, InterfaceC11588c interfaceC11588c, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updatePreviewTime");
        }
        if ((i10 & 4) != 0) {
            j11 = C5962b.f6082a.m5299a().m5292t();
        }
        return interfaceC5250g2.mo2810f(j10, str, j11, interfaceC11588c);
    }

    /* renamed from: b */
    Object mo2806b(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: c */
    Object mo2807c(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: d */
    Object mo2808d(String str, long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: e */
    Object mo2809e(long j10, InterfaceC11588c interfaceC11588c);

    /* renamed from: f */
    Object mo2810f(long j10, String str, long j11, InterfaceC11588c interfaceC11588c);

    /* renamed from: g */
    Object mo2811g(ShareCacheEntity shareCacheEntity, InterfaceC11588c interfaceC11588c);
}
