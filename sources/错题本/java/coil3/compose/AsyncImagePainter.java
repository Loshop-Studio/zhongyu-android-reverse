package coil3.compose;

import android.os.Trace;
import android.support.v4.media.C0039h;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.C2826a;
import coil3.size.Precision;
import coil3.size.Scale;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.AbstractC5896f0;
import kotlinx.coroutines.AbstractC5995r;
import kotlinx.coroutines.AbstractC6014x;
import kotlinx.coroutines.C5976k1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.InterfaceC6013w0;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.C5901a0;
import kotlinx.coroutines.flow.C5946n0;
import p075h6.InterfaceC5636h;
import p110m.AbstractC6077e;
import p110m.C6074b;
import p110m.C6075c;
import p152r6.InterfaceC6471c;
import p154s.C6529c;
import p154s.C6531e;
import p154s.C6532f;
import p162t.InterfaceC6577g;

@Stable
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, m5110d2 = {"Lcoil3/compose/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "coil3/compose/d", "coil3/compose/i", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 5 ImageRequest.kt\ncoil3/request/ImageRequest$Builder\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,413:1\n85#2:414\n113#2,2:415\n1#3:417\n26#4,5:418\n410#5,9:423\n148#6:432\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil3/compose/AsyncImagePainter\n*L\n152#1:414\n152#1:415,2\n214#1:418,5\n272#1:423,9\n334#1:432\n*E\n"})
/* loaded from: classes2.dex */
public final class AsyncImagePainter extends Painter implements RememberObserver {

    /* renamed from: q */
    public static final C2826a f1818q = new C2826a(25);

    /* renamed from: c */
    public ColorFilter f1821c;

    /* renamed from: d */
    public boolean f1822d;

    /* renamed from: e */
    public InterfaceC6013w0 f1823e;

    /* renamed from: g */
    public InterfaceC6009v f1825g;

    /* renamed from: i */
    public InterfaceC6471c f1827i;

    /* renamed from: l */
    public C3253j f1830l;

    /* renamed from: m */
    public C3247d f1831m;

    /* renamed from: n */
    public final C5946n0 f1832n;

    /* renamed from: o */
    public final C5946n0 f1833o;

    /* renamed from: p */
    public final C5901a0 f1834p;

    /* renamed from: a */
    public final MutableState f1819a = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    /* renamed from: b */
    public float f1820b = 1.0f;

    /* renamed from: f */
    public long f1824f = Size.INSTANCE.m10518getUnspecifiedNHjbRc();

    /* renamed from: h */
    public InterfaceC6471c f1826h = f1818q;

    /* renamed from: j */
    public ContentScale f1828j = ContentScale.INSTANCE.getFit();

    /* renamed from: k */
    public int f1829k = DrawScope.INSTANCE.m11236getDefaultFilterQualityfv9h1I();

    public AsyncImagePainter(C3247d c3247d) {
        this.f1831m = c3247d;
        this.f1832n = AbstractC5914h.m5546b(c3247d);
        C5946n0 c5946n0M5546b = AbstractC5914h.m5546b(C3248e.f1853a);
        this.f1833o = c5946n0M5546b;
        this.f1834p = new C5901a0(c5946n0M5546b);
    }

    /* renamed from: a */
    public static final C6532f m2176a(AsyncImagePainter asyncImagePainter, C6532f c6532f, boolean z8) {
        asyncImagePainter.getClass();
        InterfaceC6577g interfaceC6577g = c6532f.f10875o;
        C6529c c6529cM6184a = C6532f.m6184a(c6532f);
        c6529cM6184a.f10821d = new C0039h(4, c6532f, false, asyncImagePainter);
        C6531e c6531e = c6532f.f10879s;
        if (c6531e.f10858i == null) {
            c6529cM6184a.f10831n = InterfaceC6577g.f10980b0;
        }
        if (c6531e.f10859j == null) {
            ContentScale contentScale = asyncImagePainter.f1828j;
            int i = AbstractC6077e.f9679b;
            ContentScale.Companion companion = ContentScale.INSTANCE;
            c6529cM6184a.f10832o = (AbstractC5830k.m5325b(contentScale, companion.getFit()) || AbstractC5830k.m5325b(contentScale, companion.getInside())) ? Scale.FIT : Scale.FILL;
        }
        if (c6531e.f10860k == null) {
            c6529cM6184a.f10833p = Precision.INEXACT;
        }
        if (z8) {
            EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
            c6529cM6184a.f10823f = emptyCoroutineContext;
            c6529cM6184a.f10824g = emptyCoroutineContext;
            c6529cM6184a.f10825h = emptyCoroutineContext;
        }
        return c6529cM6184a.m6182a();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2177b(coil3.compose.AsyncImagePainter r3, coil3.compose.InterfaceC3252i r4) {
        /*
            kotlinx.coroutines.flow.n0 r0 = r3.f1833o
            java.lang.Object r1 = r0.getValue()
            coil3.compose.i r1 = (coil3.compose.InterfaceC3252i) r1
            r6.c r2 = r3.f1826h
            java.lang.Object r4 = r2.invoke(r4)
            coil3.compose.i r4 = (coil3.compose.InterfaceC3252i) r4
            r0.m5570j(r4)
            boolean r0 = r4 instanceof coil3.compose.C3251h
            if (r0 == 0) goto L1d
            r0 = r4
            coil3.compose.h r0 = (coil3.compose.C3251h) r0
            s.n r0 = r0.f1858b
            goto L26
        L1d:
            boolean r0 = r4 instanceof coil3.compose.C3249f
            if (r0 == 0) goto L35
            r0 = r4
            coil3.compose.f r0 = (coil3.compose.C3249f) r0
            s.b r0 = r0.f1855b
        L26:
            s.f r0 = r0.mo6181a()
            o2.a r2 = p154s.AbstractC6534h.f10885a
            java.lang.Object r0 = coil3.AbstractC3330o.m2267e(r0, r2)
            v.a r0 = (p179v.C6653a) r0
            r0.getClass()
        L35:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.mo2186a()
            androidx.compose.runtime.MutableState r2 = r3.f1819a
            r2.setValue(r0)
            androidx.compose.ui.graphics.painter.Painter r0 = r1.mo2186a()
            androidx.compose.ui.graphics.painter.Painter r2 = r4.mo2186a()
            if (r0 == r2) goto L6a
            androidx.compose.ui.graphics.painter.Painter r0 = r1.mo2186a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            r2 = 0
            if (r1 == 0) goto L54
            androidx.compose.runtime.RememberObserver r0 = (androidx.compose.runtime.RememberObserver) r0
            goto L55
        L54:
            r0 = r2
        L55:
            if (r0 == 0) goto L5a
            r0.onForgotten()
        L5a:
            androidx.compose.ui.graphics.painter.Painter r0 = r4.mo2186a()
            boolean r1 = r0 instanceof androidx.compose.runtime.RememberObserver
            if (r1 == 0) goto L65
            r2 = r0
            androidx.compose.runtime.RememberObserver r2 = (androidx.compose.runtime.RememberObserver) r2
        L65:
            if (r2 == 0) goto L6a
            r2.onRemembered()
        L6a:
            r6.c r3 = r3.f1827i
            if (r3 == 0) goto L71
            r3.invoke(r4)
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: coil3.compose.AsyncImagePainter.m2177b(coil3.compose.AsyncImagePainter, coil3.compose.i):void");
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyAlpha(float f) {
        this.f1820b = f;
        return true;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final boolean applyColorFilter(ColorFilter colorFilter) {
        this.f1821c = colorFilter;
        return true;
    }

    /* renamed from: c */
    public final void m2178c() {
        C3247d c3247d = this.f1831m;
        if (c3247d == null) {
            return;
        }
        InterfaceC6009v interfaceC6009v = this.f1825g;
        if (interfaceC6009v == null) {
            AbstractC5830k.m5339p("scope");
            throw null;
        }
        AsyncImagePainter$launchJob$1 asyncImagePainter$launchJob$1 = new AsyncImagePainter$launchJob$1(this, c3247d, null);
        InterfaceC5636h coroutineContext = interfaceC6009v.getCoroutineContext();
        int i = AbstractC6077e.f9679b;
        AbstractC5995r abstractC5995r = (AbstractC5995r) coroutineContext.get(AbstractC5995r.Key);
        C5976k1 c5976k1M5650u = (abstractC5995r == null || abstractC5995r.equals(AbstractC5896f0.f9344b)) ? AbstractC6014x.m5650u(interfaceC6009v, AbstractC5896f0.f9344b, CoroutineStart.UNDISPATCHED, asyncImagePainter$launchJob$1) : AbstractC6014x.m5650u(AbstractC6014x.m5630a(new C6074b(interfaceC6009v.getCoroutineContext())), new C6075c(abstractC5995r), CoroutineStart.UNDISPATCHED, asyncImagePainter$launchJob$1);
        InterfaceC6013w0 interfaceC6013w0 = this.f1823e;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.f1823e = c5976k1M5650u;
    }

    /* renamed from: d */
    public final void m2179d(C3247d c3247d) {
        if (AbstractC5830k.m5325b(this.f1831m, c3247d)) {
            return;
        }
        this.f1831m = c3247d;
        if (c3247d == null) {
            InterfaceC6013w0 interfaceC6013w0 = this.f1823e;
            if (interfaceC6013w0 != null) {
                interfaceC6013w0.cancel(null);
            }
            this.f1823e = null;
        } else if (this.f1822d) {
            m2178c();
        }
        if (c3247d != null) {
            C5946n0 c5946n0 = this.f1832n;
            c5946n0.getClass();
            c5946n0.m5571k(null, c3247d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        Painter painter = (Painter) this.f1819a.getValue();
        return painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m10518getUnspecifiedNHjbRc();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        InterfaceC6013w0 interfaceC6013w0 = this.f1823e;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.f1823e = null;
        Object obj = (Painter) this.f1819a.getValue();
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onAbandoned();
        }
        this.f1822d = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        long jMo11233getSizeNHjbRc = drawScope.mo11233getSizeNHjbRc();
        if (!Size.m10506equalsimpl0(this.f1824f, jMo11233getSizeNHjbRc)) {
            this.f1824f = jMo11233getSizeNHjbRc;
        }
        Painter painter = (Painter) this.f1819a.getValue();
        if (painter != null) {
            painter.m11359drawx_KDEd0(drawScope, drawScope.mo11233getSizeNHjbRc(), this.f1820b, this.f1821c);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        InterfaceC6013w0 interfaceC6013w0 = this.f1823e;
        if (interfaceC6013w0 != null) {
            interfaceC6013w0.cancel(null);
        }
        this.f1823e = null;
        Object obj = (Painter) this.f1819a.getValue();
        RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
        if (rememberObserver != null) {
            rememberObserver.onForgotten();
        }
        this.f1822d = false;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        Trace.beginSection("AsyncImagePainter.onRemembered");
        try {
            Object obj = (Painter) this.f1819a.getValue();
            RememberObserver rememberObserver = obj instanceof RememberObserver ? (RememberObserver) obj : null;
            if (rememberObserver != null) {
                rememberObserver.onRemembered();
            }
            m2178c();
            this.f1822d = true;
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
