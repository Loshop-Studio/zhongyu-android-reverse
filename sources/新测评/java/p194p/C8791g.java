package p194p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil3.InterfaceC5193e;
import coil3.decode.DataSource;
import java.io.FileNotFoundException;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import p137k.AbstractC7849u;
import p137k.AbstractC7850v;
import p137k.C7848t;
import p172n.AbstractC8604s;
import p172n.C8586f;
import p194p.InterfaceC8795k;
import p290y.C9892k;
import p300z.InterfaceC9954a;

/* renamed from: p.g */
/* loaded from: classes3.dex */
public final class C8791g implements InterfaceC8795k {

    /* renamed from: a */
    public final C7848t f14927a;

    /* renamed from: b */
    public final C9892k f14928b;

    /* renamed from: p.g$a */
    public static final class a implements InterfaceC8795k.a {
        @Override // p194p.InterfaceC8795k.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC8795k mo3134a(C7848t c7848t, C9892k c9892k, InterfaceC5193e interfaceC5193e) {
            if (m14687c(c7848t)) {
                return new C8791g(c7848t, c9892k);
            }
            return null;
        }

        /* renamed from: c */
        public final boolean m14687c(C7848t c7848t) {
            return Intrinsics.areEqual(c7848t.m13309c(), "content");
        }
    }

    public C8791g(C7848t c7848t, C9892k c9892k) {
        this.f14927a = c7848t;
        this.f14928b = c9892k;
    }

    @Override // p194p.InterfaceC8795k
    /* renamed from: a */
    public Object mo3117a(Continuation continuation) throws FileNotFoundException {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        Uri uriM13321a = AbstractC7850v.m13321a(this.f14927a);
        ContentResolver contentResolver = this.f14928b.m16700c().getContentResolver();
        if (m14683b(this.f14927a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM13321a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uriM13321a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29 || !m14684c(this.f14927a)) {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriM13321a, "r");
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + uriM13321a + "'.").toString());
            }
        } else {
            assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFile(uriM13321a, "image/*", m14685d(), null);
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uriM13321a + "'.").toString());
            }
        }
        return new C8800p(AbstractC8604s.m14161a(Okio.buffer(Okio.source(assetFileDescriptorOpenAssetFileDescriptor.createInputStream())), this.f14928b.m16704g(), new C8586f(this.f14927a, assetFileDescriptorOpenAssetFileDescriptor)), contentResolver.getType(uriM13321a), DataSource.f2937c);
    }

    /* renamed from: b */
    public final boolean m14683b(C7848t c7848t) {
        return Intrinsics.areEqual(c7848t.m13307a(), "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.lastOrNull(AbstractC7849u.m13316f(c7848t)), "display_photo");
    }

    /* renamed from: c */
    public final boolean m14684c(C7848t c7848t) {
        List listM13316f;
        int size;
        return Intrinsics.areEqual(c7848t.m13307a(), "media") && (size = (listM13316f = AbstractC7849u.m13316f(c7848t)).size()) >= 3 && Intrinsics.areEqual(listM13316f.get(size + (-3)), "audio") && Intrinsics.areEqual(listM13316f.get(size + (-2)), "albums");
    }

    /* renamed from: d */
    public final Bundle m14685d() {
        InterfaceC9954a interfaceC9954aM16772b = this.f14928b.m16708k().m16772b();
        InterfaceC9954a.a aVar = interfaceC9954aM16772b instanceof InterfaceC9954a.a ? (InterfaceC9954a.a) interfaceC9954aM16772b : null;
        if (aVar == null) {
            return null;
        }
        int iM16768f = aVar.m16768f();
        InterfaceC9954a interfaceC9954aM16771a = this.f14928b.m16708k().m16771a();
        InterfaceC9954a.a aVar2 = interfaceC9954aM16771a instanceof InterfaceC9954a.a ? (InterfaceC9954a.a) interfaceC9954aM16771a : null;
        if (aVar2 == null) {
            return null;
        }
        int iM16768f2 = aVar2.m16768f();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(iM16768f, iM16768f2));
        return bundle;
    }
}
