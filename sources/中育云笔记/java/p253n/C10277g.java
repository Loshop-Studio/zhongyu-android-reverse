package p253n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil3.InterfaceC5470e;
import coil3.decode.DataSource;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Okio;
import p212k.AbstractC9767u;
import p212k.AbstractC9768v;
import p212k.C9766t;
import p228l.AbstractC10086s;
import p228l.C10068f;
import p253n.InterfaceC10281k;
import p325rc.AbstractC10947g0;
import p380w.C11634n;
import p396x.InterfaceC11745a;
import vc.InterfaceC11588c;

/* renamed from: n.g */
/* loaded from: classes3.dex */
public final class C10277g implements InterfaceC10281k {

    /* renamed from: a */
    public final C9766t f24463a;

    /* renamed from: b */
    public final C11634n f24464b;

    /* renamed from: n.g$a */
    public static final class a implements InterfaceC10281k.a {
        @Override // p253n.InterfaceC10281k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC10281k mo3225a(C9766t c9766t, C11634n c11634n, InterfaceC5470e interfaceC5470e) {
            if (m21406c(c9766t)) {
                return new C10277g(c9766t, c11634n);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m21406c(C9766t c9766t) {
            return AbstractC9979u.m20289b(c9766t.m19685c(), "content");
        }
    }

    public C10277g(C9766t c9766t, C11634n c11634n) {
        this.f24463a = c9766t;
        this.f24464b = c11634n;
    }

    @Override // p253n.InterfaceC10281k
    /* renamed from: a */
    public Object mo3208a(InterfaceC11588c interfaceC11588c) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriM19697a = AbstractC9768v.m19697a(this.f24463a);
        ContentResolver contentResolver = this.f24464b.m25743c().getContentResolver();
        if (m21402b(this.f24463a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM19697a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriM19697a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !m21403c(this.f24463a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM19697a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriM19697a + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriM19697a, "image/*", m21404d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriM19697a + "'.").toString());
            }
        }
        return new C10286p(AbstractC10086s.m21094a(Okio.buffer(Okio.source(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.f24464b.m25747g(), new C10068f(this.f24463a, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriM19697a), DataSource.f3612e);
    }

    /* renamed from: b */
    public final boolean m21402b(C9766t c9766t) {
        return AbstractC9979u.m20289b(c9766t.m19683a(), "com.android.contacts") && AbstractC9979u.m20289b(AbstractC10947g0.m23957z0(AbstractC9767u.m19692f(c9766t)), "display_photo");
    }

    /* renamed from: c */
    public final boolean m21403c(C9766t c9766t) {
        List listM19692f;
        int size;
        return AbstractC9979u.m20289b(c9766t.m19683a(), "media") && (size = (listM19692f = AbstractC9767u.m19692f(c9766t)).size()) >= 3 && AbstractC9979u.m20289b(listM19692f.get(size + (-3)), "audio") && AbstractC9979u.m20289b(listM19692f.get(size + (-2)), "albums");
    }

    /* renamed from: d */
    public final Bundle m21404d() {
        InterfaceC11745a interfaceC11745aM26000b = this.f24464b.m25751k().m26000b();
        InterfaceC11745a.a aVar = interfaceC11745aM26000b instanceof InterfaceC11745a.a ? (InterfaceC11745a.a) interfaceC11745aM26000b : null;
        if (aVar == null) {
            return null;
        }
        int iM25995f = aVar.m25995f();
        InterfaceC11745a interfaceC11745aM25999a = this.f24464b.m25751k().m25999a();
        InterfaceC11745a.a aVar2 = interfaceC11745aM25999a instanceof InterfaceC11745a.a ? (InterfaceC11745a.a) interfaceC11745aM25999a : null;
        if (aVar2 == null) {
            return null;
        }
        int iM25995f2 = aVar2.m25995f();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(iM25995f, iM25995f2));
        return bundle;
    }
}
