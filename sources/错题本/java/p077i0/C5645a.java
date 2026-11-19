package p077i0;

import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.media.C0039h;
import com.bumptech.glide.load.resource.bitmap.C3419a;
import java.io.InputStream;
import java.util.ArrayDeque;
import p016b0.C3071g;
import p016b0.InterfaceC3072g0;
import p024c0.C3210g;
import p024c0.InterfaceC3205b;
import p094k0.C5750a;
import p094k0.C5751b;
import p180v0.C6656c;
import p180v0.C6661h;
import p202y.C6763f;
import p202y.InterfaceC6764g;

/* renamed from: i0.a */
/* loaded from: classes2.dex */
public final class C5645a implements InterfaceC6764g {

    /* renamed from: a */
    public final /* synthetic */ int f8777a;

    /* renamed from: b */
    public final Object f8778b;

    /* renamed from: c */
    public final Object f8779c;

    public /* synthetic */ C5645a(int i, Object obj, Object obj2) {
        this.f8777a = i;
        this.f8778b = obj;
        this.f8779c = obj2;
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: a */
    public final boolean mo4970a(Object obj, C6763f c6763f) {
        switch (this.f8777a) {
            case 0:
                return ((InterfaceC6764g) this.f8778b).mo4970a(obj, c6763f);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            default:
                ((C5657m) this.f8778b).getClass();
                return true;
        }
    }

    @Override // p202y.InterfaceC6764g
    /* renamed from: b */
    public final InterfaceC3072g0 mo4971b(Object obj, int i, int i8, C6763f c6763f) throws PackageManager.NameNotFoundException, NumberFormatException {
        boolean z8;
        C3419a c3419a;
        C6656c c6656c;
        switch (this.f8777a) {
            case 0:
                InterfaceC3072g0 interfaceC3072g0Mo4971b = ((InterfaceC6764g) this.f8778b).mo4971b(obj, i, i8, c6763f);
                Resources resources = (Resources) this.f8779c;
                if (interfaceC3072g0Mo4971b == null) {
                    return null;
                }
                return new C5647c(resources, interfaceC3072g0Mo4971b);
            case 1:
                InterfaceC3072g0 interfaceC3072g0M5093c = ((C5751b) this.f8778b).m5093c((Uri) obj);
                if (interfaceC3072g0M5093c == null) {
                    return null;
                }
                return AbstractC5659o.m4992a((InterfaceC3205b) this.f8779c, (Drawable) ((C5750a) interfaceC3072g0M5093c).get(), i, i8);
            default:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof C3419a) {
                    c3419a = (C3419a) inputStream;
                    z8 = false;
                } else {
                    z8 = true;
                    c3419a = new C3419a(inputStream, (C3210g) this.f8779c);
                }
                ArrayDeque arrayDeque = C6656c.f11228c;
                synchronized (arrayDeque) {
                    c6656c = (C6656c) arrayDeque.poll();
                }
                if (c6656c == null) {
                    c6656c = new C6656c();
                }
                C6656c c6656c2 = c6656c;
                c6656c2.f11229a = c3419a;
                C6661h c6661h = new C6661h(c6656c2);
                C0039h c0039h = new C0039h(12, c3419a, false, c6656c2);
                try {
                    C5657m c5657m = (C5657m) this.f8778b;
                    C5647c c5647cM4990a = c5657m.m4990a(new C3071g(c6661h, c5657m.f8813d, c5657m.f8812c), i, i8, c6763f, c0039h);
                    c6656c2.f11230b = null;
                    c6656c2.f11229a = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(c6656c2);
                    }
                    if (z8) {
                        c3419a.m2415b();
                    }
                    return c5647cM4990a;
                } catch (Throwable th) {
                    c6656c2.f11230b = null;
                    c6656c2.f11229a = null;
                    ArrayDeque arrayDeque2 = C6656c.f11228c;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(c6656c2);
                        if (!z8) {
                            throw th;
                        }
                        c3419a.m2415b();
                        throw th;
                    }
                }
        }
    }

    public C5645a(Resources resources, InterfaceC6764g interfaceC6764g) {
        this.f8777a = 0;
        this.f8779c = resources;
        this.f8778b = interfaceC6764g;
    }
}
