package p124p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil3.InterfaceC4574e;
import coil3.decode.DataSource;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import p087k.AbstractC6622u;
import p087k.AbstractC6623v;
import p087k.C6621t;
import p110n.AbstractC7436s;
import p110n.C7418f;
import p124p.InterfaceC7582k;
import p187y.C7880m;
import p194z.InterfaceC7919a;

/* renamed from: p.g */
/* loaded from: classes3.dex */
public final class C7578g implements InterfaceC7582k {

    /* renamed from: a */
    public final C6621t f10027a;

    /* renamed from: b */
    public final C7880m f10028b;

    /* renamed from: p.g$a */
    public static final class a implements InterfaceC7582k.a {
        @Override // p124p.InterfaceC7582k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC7582k mo1960a(C6621t c6621t, C7880m c7880m, InterfaceC4574e interfaceC4574e) {
            if (m8979c(c6621t)) {
                return new C7578g(c6621t, c7880m);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m8979c(C6621t c6621t) {
            return Intrinsics.areEqual(c6621t.m7575c(), "content");
        }
    }

    public C7578g(C6621t c6621t, C7880m c7880m) {
        this.f10027a = c6621t;
        this.f10028b = c7880m;
    }

    @Override // p124p.InterfaceC7582k
    /* renamed from: a */
    public Object mo1943a(Continuation continuation) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriM7587a = AbstractC6623v.m7587a(this.f10027a);
        ContentResolver contentResolver = this.f10028b.m9661c().getContentResolver();
        if (m8975b(this.f10027a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM7587a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriM7587a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !m8976c(this.f10027a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM7587a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriM7587a + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriM7587a, "image/*", m8977d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriM7587a + "'.").toString());
            }
        }
        return new C7587p(AbstractC7436s.m8482a(Okio.buffer(Okio.source(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.f10028b.m9665g(), new C7418f(this.f10027a, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriM7587a), DataSource.f1621c);
    }

    /* renamed from: b */
    public final boolean m8975b(C6621t c6621t) {
        return Intrinsics.areEqual(c6621t.m7573a(), "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.lastOrNull(AbstractC6622u.m7582f(c6621t)), "display_photo");
    }

    /* renamed from: c */
    public final boolean m8976c(C6621t c6621t) {
        List listM7582f;
        int size;
        return Intrinsics.areEqual(c6621t.m7573a(), "media") && (size = (listM7582f = AbstractC6622u.m7582f(c6621t)).size()) >= 3 && Intrinsics.areEqual(listM7582f.get(size + (-3)), "audio") && Intrinsics.areEqual(listM7582f.get(size + (-2)), "albums");
    }

    /* renamed from: d */
    public final Bundle m8977d() {
        InterfaceC7919a interfaceC7919aM9720b = this.f10028b.m9669k().m9720b();
        InterfaceC7919a.a aVar = interfaceC7919aM9720b instanceof InterfaceC7919a.a ? (InterfaceC7919a.a) interfaceC7919aM9720b : null;
        if (aVar == null) {
            return null;
        }
        int iM9716f = aVar.m9716f();
        InterfaceC7919a interfaceC7919aM9719a = this.f10028b.m9669k().m9719a();
        InterfaceC7919a.a aVar2 = interfaceC7919aM9719a instanceof InterfaceC7919a.a ? (InterfaceC7919a.a) interfaceC7919aM9719a : null;
        if (aVar2 == null) {
            return null;
        }
        int iM9716f2 = aVar2.m9716f();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(iM9716f, iM9716f2));
        return bundle;
    }
}
