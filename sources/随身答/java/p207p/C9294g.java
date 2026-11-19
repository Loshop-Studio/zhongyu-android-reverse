package p207p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil3.InterfaceC5328e;
import coil3.decode.DataSource;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import p151k.AbstractC8248s;
import p151k.AbstractC8249t;
import p151k.C8247r;
import p183n.AbstractC9074s;
import p183n.C9056f;
import p207p.InterfaceC9298k;
import p297y.C9932m;
import p307z.InterfaceC9971a;

/* renamed from: p.g */
/* loaded from: classes3.dex */
public final class C9294g implements InterfaceC9298k {

    /* renamed from: a */
    public final C8247r f16092a;

    /* renamed from: b */
    public final C9932m f16093b;

    /* renamed from: p.g$a */
    public static final class a implements InterfaceC9298k.a {
        @Override // p207p.InterfaceC9298k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC9298k mo2854a(C8247r c8247r, C9932m c9932m, InterfaceC5328e interfaceC5328e) {
            if (m15138c(c8247r)) {
                return new C9294g(c8247r, c9932m);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m15138c(C8247r c8247r) {
            return Intrinsics.areEqual(c8247r.m13277c(), "content");
        }
    }

    public C9294g(C8247r c8247r, C9932m c9932m) {
        this.f16092a = c8247r;
        this.f16093b = c9932m;
    }

    @Override // p207p.InterfaceC9298k
    /* renamed from: a */
    public Object mo2837a(Continuation continuation) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriM13289a = AbstractC8249t.m13289a(this.f16092a);
        ContentResolver contentResolver = this.f16093b.m17108c().getContentResolver();
        if (m15134b(this.f16092a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM13289a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriM13289a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !m15135c(this.f16092a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM13289a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriM13289a + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriM13289a, "image/*", m15136d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriM13289a + "'.").toString());
            }
        }
        return new C9303p(AbstractC9074s.m14552a(Okio.buffer(Okio.source(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.f16093b.m17112g(), new C9056f(this.f16092a, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriM13289a), DataSource.f2866c);
    }

    /* renamed from: b */
    public final boolean m15134b(C8247r c8247r) {
        return Intrinsics.areEqual(c8247r.m13275a(), "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.lastOrNull(AbstractC8248s.m13284f(c8247r)), "display_photo");
    }

    /* renamed from: c */
    public final boolean m15135c(C8247r c8247r) {
        List listM13284f;
        int size;
        return Intrinsics.areEqual(c8247r.m13275a(), "media") && (size = (listM13284f = AbstractC8248s.m13284f(c8247r)).size()) >= 3 && Intrinsics.areEqual(listM13284f.get(size + (-3)), "audio") && Intrinsics.areEqual(listM13284f.get(size + (-2)), "albums");
    }

    /* renamed from: d */
    public final Bundle m15136d() {
        InterfaceC9971a interfaceC9971aM17259b = this.f16093b.m17116k().m17259b();
        InterfaceC9971a.a aVar = interfaceC9971aM17259b instanceof InterfaceC9971a.a ? (InterfaceC9971a.a) interfaceC9971aM17259b : null;
        if (aVar == null) {
            return null;
        }
        int iM17255f = aVar.m17255f();
        InterfaceC9971a interfaceC9971aM17258a = this.f16093b.m17116k().m17258a();
        InterfaceC9971a.a aVar2 = interfaceC9971aM17258a instanceof InterfaceC9971a.a ? (InterfaceC9971a.a) interfaceC9971aM17258a : null;
        if (aVar2 == null) {
            return null;
        }
        int iM17255f2 = aVar2.m17255f();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(iM17255f, iM17255f2));
        return bundle;
    }
}
