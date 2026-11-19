package p119n;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil3.AbstractC3330o;
import coil3.C3333r;
import coil3.C3351x;
import coil3.util.AbstractC3348l;
import java.nio.ByteBuffer;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import p154s.C6538l;

/* renamed from: n.a */
/* loaded from: classes2.dex */
public final class C6196a implements InterfaceC6201f {

    /* renamed from: a */
    public final /* synthetic */ int f9906a;

    public /* synthetic */ C6196a(int i) {
        this.f9906a = i;
    }

    @Override // p119n.InterfaceC6201f
    /* renamed from: a */
    public final InterfaceC6202g mo2248a(Object obj, C6538l c6538l, C3333r c3333r) {
        int i = 0;
        int i8 = 1;
        int i9 = 2;
        int i10 = 3;
        switch (this.f9906a) {
            case 0:
                C3351x c3351x = (C3351x) obj;
                Bitmap.Config[] configArr = AbstractC3348l.f2083a;
                if (AbstractC5830k.m5325b(c3351x.f2088c, "file") && AbstractC5830k.m5325b(AbstractC5805t.m5229i0(AbstractC3330o.m2270h(c3351x)), "android_asset")) {
                    return new C6197b(c3351x, c6538l, i);
                }
                return null;
            case 1:
                return new C6198c((Bitmap) obj, c6538l, i);
            case 2:
                return new C6198c((byte[]) obj, c6538l, i8);
            case 3:
                return new C6198c((ByteBuffer) obj, c6538l, i9);
            case 4:
                C3351x c3351x2 = (C3351x) obj;
                if (AbstractC5830k.m5325b(c3351x2.f2088c, "content")) {
                    return new C6197b(c3351x2, c6538l, i8);
                }
                return null;
            case 5:
                C3351x c3351x3 = (C3351x) obj;
                if (AbstractC5830k.m5325b(c3351x3.f2088c, "data")) {
                    return new C6197b(c3351x3, c6538l, i9);
                }
                return null;
            case 6:
                return new C6198c((Drawable) obj, c6538l, i10);
            case 7:
                C3351x c3351x4 = (C3351x) obj;
                String str = c3351x4.f2088c;
                if ((str != null && !str.equals("file")) || c3351x4.f2090e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = AbstractC3348l.f2083a;
                if (AbstractC5830k.m5325b(c3351x4.f2088c, "file") && AbstractC5830k.m5325b(AbstractC5805t.m5229i0(AbstractC3330o.m2270h(c3351x4)), "android_asset")) {
                    return null;
                }
                return new C6203h(c3351x4, c6538l);
            case 8:
                C3351x c3351x5 = (C3351x) obj;
                if (AbstractC5830k.m5325b(c3351x5.f2088c, "jar:file")) {
                    return new C6205j(c3351x5, c6538l);
                }
                return null;
            default:
                C3351x c3351x6 = (C3351x) obj;
                if (AbstractC5830k.m5325b(c3351x6.f2088c, "android.resource")) {
                    return new C6197b(c3351x6, c6538l, i10);
                }
                return null;
        }
    }
}
