package coil3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.Lifecycle;
import coil3.decode.C3262c;
import coil3.decode.C3272m;
import coil3.decode.C3280u;
import coil3.intercept.C3300b;
import coil3.target.GenericViewTarget;
import coil3.util.ComponentCallbacks2C3337a;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.AbstractC5832m;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5998s;
import okio.Path;
import p006a5.C0014e;
import p054e7.AbstractC5479k;
import p054e7.C5471c;
import p068g7.C5609e;
import p076h7.AbstractC5643f;
import p076h7.C5642e;
import p119n.C6196a;
import p126o.C6252a;
import p126o.C6253b;
import p129o2.C6268a;
import p134p.C6357a;
import p140q.C6401e;
import p154s.AbstractC6534h;
import p154s.C6528b;
import p154s.C6530d;
import p154s.C6532f;
import p154s.C6537k;
import p162t.C6575e;
import p169t6.AbstractC6600a;
import p171u.InterfaceC6608a;
import p179v.C6653a;
import p188w1.C6701a;

/* renamed from: coil3.r */
/* loaded from: classes2.dex */
public final class C3333r implements InterfaceC3308n {

    /* renamed from: f */
    public static final /* synthetic */ int f2044f = 0;

    /* renamed from: a */
    public final C3332q f2045a;

    /* renamed from: b */
    public final C5471c f2046b = AbstractC6014x.m5630a(AbstractC6600a.m6239o(new C3334s(C5998s.f9496a), AbstractC6014x.m5632c()));

    /* renamed from: c */
    public final C6701a f2047c;

    /* renamed from: d */
    public final C3259d f2048d;

    /* renamed from: e */
    public volatile /* synthetic */ int f2049e;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C3333r.class, "e");
    }

    public C3333r(C3332q c3332q) {
        this.f2045a = c3332q;
        ComponentCallbacks2C3337a componentCallbacks2C3337a = new ComponentCallbacks2C3337a(this);
        C6701a c6701a = new C6701a(this);
        this.f2047c = c6701a;
        C0014e c0014e = new C0014e(c3332q.f2043e);
        ArrayList arrayList = (ArrayList) c0014e.f38b;
        ArrayList arrayList2 = (ArrayList) c0014e.f42f;
        ArrayList arrayList3 = (ArrayList) c0014e.f41e;
        ArrayList arrayList4 = (ArrayList) c0014e.f39c;
        C6530d c6530d = c3332q.f2040b;
        Object obj = c6530d.f10849n.f1996a.get(AbstractC3330o.f2035a);
        int i = 2;
        int i8 = 1;
        if (((Boolean) (obj == null ? Boolean.TRUE : obj)).booleanValue()) {
            arrayList2.add(new C3307m(i8));
            arrayList4.add(new C3307m(i));
        }
        int i9 = 0;
        c0014e.m59b(new C6357a(i9), AbstractC5832m.m5340a(Uri.class));
        int i10 = 3;
        c0014e.m59b(new C6357a(i10), AbstractC5832m.m5340a(Integer.class));
        arrayList3.add(new Pair(new C6252a(0), AbstractC5832m.m5340a(C3351x.class)));
        c0014e.m58a(new C6196a(i9), AbstractC5832m.m5340a(C3351x.class));
        c0014e.m58a(new C6196a(4), AbstractC5832m.m5340a(C3351x.class));
        c0014e.m58a(new C6196a(9), AbstractC5832m.m5340a(C3351x.class));
        c0014e.m58a(new C6196a(6), AbstractC5832m.m5340a(Drawable.class));
        c0014e.m58a(new C6196a(i8), AbstractC5832m.m5340a(Bitmap.class));
        C6268a c6268a = AbstractC3331p.f2036a;
        Object obj2 = c6530d.f10849n.f1996a.get(AbstractC3331p.f2036a);
        int iIntValue = ((Number) (obj2 == null ? 4 : obj2)).intValue();
        int i11 = AbstractC5643f.f8770a;
        C5642e c5642e = new C5642e(iIntValue);
        int i12 = Build.VERSION.SDK_INT;
        Object obj3 = C3272m.f1910a;
        if (i12 >= 29) {
            Object obj4 = c6530d.f10849n.f1996a.get(AbstractC3331p.f2038c);
            if (((Boolean) (obj4 == null ? Boolean.TRUE : obj4)).booleanValue()) {
                Object obj5 = c6530d.f10849n.f1996a.get(AbstractC3331p.f2037b);
                if (((C3272m) (obj5 == null ? obj3 : obj5)).equals(obj3)) {
                    arrayList4.add(new C3243c(new C3280u(c5642e), i8));
                }
            }
        }
        Object obj6 = c6530d.f10849n.f1996a.get(AbstractC3331p.f2037b);
        arrayList4.add(new C3243c(new C3262c(c5642e, (C3272m) (obj6 != null ? obj6 : obj3)), i8));
        c0014e.m59b(new C6357a(i8), AbstractC5832m.m5340a(File.class));
        c0014e.m58a(new C6196a(8), AbstractC5832m.m5340a(C3351x.class));
        c0014e.m58a(new C6196a(i10), AbstractC5832m.m5340a(ByteBuffer.class));
        c0014e.m59b(new C6357a(4), AbstractC5832m.m5340a(String.class));
        c0014e.m59b(new C6357a(2), AbstractC5832m.m5340a(Path.class));
        arrayList3.add(new Pair(new C6253b(), AbstractC5832m.m5340a(C3351x.class)));
        arrayList3.add(new Pair(new C6252a(1), AbstractC5832m.m5340a(C3351x.class)));
        c0014e.m58a(new C6196a(7), AbstractC5832m.m5340a(C3351x.class));
        c0014e.m58a(new C6196a(2), AbstractC5832m.m5340a(byte[].class));
        c0014e.m58a(new C6196a(5), AbstractC5832m.m5340a(C3351x.class));
        arrayList.add(new C3300b(this, componentCallbacks2C3337a, c6701a));
        this.f2048d = new C3259d(AbstractC6600a.m6245w(arrayList), AbstractC6600a.m6245w((ArrayList) c0014e.f40d), AbstractC6600a.m6245w(arrayList3), AbstractC6600a.m6245w(arrayList2), AbstractC6600a.m6245w(arrayList4));
    }

    /* renamed from: a */
    public final C6537k m2274a(C6532f c6532f) {
        C5609e c5609e = AbstractC5896f0.f9343a;
        return AbstractC3330o.m2266d(c6532f, AbstractC6014x.m5633d(this.f2046b, AbstractC5479k.f8471a.f8411d, new RealImageLoader$enqueue$job$1(this, c6532f, null), 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x014d, code lost:
    
        if (r3.mo2279a(r9) == r10) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:97:0x01b6, B:99:0x01bc, B:102:0x01cb, B:104:0x01db, B:103:0x01cf, B:105:0x01e2, B:107:0x01e6, B:110:0x01f2, B:111:0x01f7, B:27:0x0079, B:83:0x015c, B:85:0x0163, B:87:0x016d, B:88:0x0177, B:89:0x017a), top: B:128:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0207 A[Catch: all -> 0x0214, TRY_LEAVE, TryCatch #2 {all -> 0x0214, blocks: (B:116:0x0203, B:118:0x0207, B:123:0x0216, B:124:0x021c), top: B:129:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0216 A[Catch: all -> 0x0214, TRY_ENTER, TryCatch #2 {all -> 0x0214, blocks: (B:116:0x0203, B:118:0x0207, B:123:0x0216, B:124:0x021c), top: B:129:0x0203 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163 A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:97:0x01b6, B:99:0x01bc, B:102:0x01cb, B:104:0x01db, B:103:0x01cf, B:105:0x01e2, B:107:0x01e6, B:110:0x01f2, B:111:0x01f7, B:27:0x0079, B:83:0x015c, B:85:0x0163, B:87:0x016d, B:88:0x0177, B:89:0x017a), top: B:128:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01bc A[Catch: all -> 0x0043, TryCatch #1 {all -> 0x0043, blocks: (B:15:0x003e, B:97:0x01b6, B:99:0x01bc, B:102:0x01cb, B:104:0x01db, B:103:0x01cf, B:105:0x01e2, B:107:0x01e6, B:110:0x01f2, B:111:0x01f7, B:27:0x0079, B:83:0x015c, B:85:0x0163, B:87:0x016d, B:88:0x0177, B:89:0x017a), top: B:128:0x002a }] */
    /* JADX WARN: Type inference failed for: r16v0, types: [coil3.r] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v4, types: [coil3.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v23, types: [int] */
    /* JADX WARN: Type inference failed for: r3v24, types: [int] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [s.m] */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m2275b(p154s.C6532f r17, int r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.C3333r.m2275b(s.f, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: c */
    public final Object m2276c(C6532f c6532f, ContinuationImpl continuationImpl) {
        return ((c6532f.f10863c instanceof GenericViewTarget) || (c6532f.f10875o instanceof C6575e) || ((Lifecycle) AbstractC3330o.m2267e(c6532f, AbstractC6534h.f10889e)) != null) ? AbstractC6014x.m5637h(new RealImageLoader$execute$2(c6532f, this, null), continuationImpl) : m2275b(c6532f, 1, continuationImpl);
    }

    /* renamed from: d */
    public final C6401e m2277d() {
        return (C6401e) this.f2045a.f2041c.getValue();
    }

    /* renamed from: e */
    public final void m2278e(C6528b c6528b, InterfaceC6608a interfaceC6608a, AbstractC3297h abstractC3297h) {
        C6532f c6532f = c6528b.f10816b;
        InterfaceC3305k interfaceC3305k = c6528b.f10815a;
        if (!(interfaceC6608a instanceof GenericViewTarget)) {
            if (interfaceC6608a != null) {
            }
            abstractC3297h.getClass();
            c6532f.getClass();
        }
        ((C6653a) AbstractC3330o.m2267e(c6532f, AbstractC6534h.f10885a)).getClass();
        interfaceC6608a.mo112f(interfaceC3305k);
        abstractC3297h.getClass();
        c6532f.getClass();
    }
}
