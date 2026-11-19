package p188w1;

import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.Lifecycle;
import android.view.LifecycleOwner;
import coil3.AbstractC3330o;
import coil3.C3304j;
import coil3.C3333r;
import coil3.target.GenericViewTarget;
import coil3.util.AbstractC3341e;
import coil3.util.C3342f;
import coil3.util.C3344h;
import coil3.util.InterfaceC3340d;
import com.xuexiang.xui.widget.activity.BaseGuideActivity;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC5785e0;
import kotlin.collections.AbstractC5806u;
import p003a2.InterfaceC0007b;
import p129o2.C6268a;
import p154s.AbstractC6534h;
import p154s.C6532f;
import p154s.C6538l;
import p169t6.AbstractC6600a;
import p171u.InterfaceC6608a;

/* renamed from: w1.a */
/* loaded from: classes3.dex */
public final class C6701a implements InterfaceC0007b {

    /* renamed from: a */
    public final Object f11312a;

    /* renamed from: b */
    public final Object f11313b;

    public C6701a(C3333r c3333r) {
        Object c3342f;
        this.f11312a = c3333r;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (!AbstractC3341e.f2077a) {
                c3342f = (i == 26 || i == 27) ? new C3344h() : new C3342f(true);
            }
            this.f11313b = c3342f;
        }
        boolean z8 = AbstractC3341e.f2077a;
        c3342f = new C3342f(false);
        this.f11313b = c3342f;
    }

    /* renamed from: a */
    public static Lifecycle m6400a(C6532f c6532f) {
        InterfaceC6608a interfaceC6608a = c6532f.f10863c;
        if (interfaceC6608a instanceof GenericViewTarget) {
            ((GenericViewTarget) interfaceC6608a).getClass();
            throw null;
        }
        Object baseContext = c6532f.f10861a;
        while (!(baseContext instanceof LifecycleOwner)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((LifecycleOwner) baseContext).getLifecycle();
    }

    /* renamed from: b */
    public static boolean m6401b(C6532f c6532f, Bitmap.Config config) {
        if (!AbstractC5806u.m5285x(config)) {
            return true;
        }
        if (!((Boolean) AbstractC3330o.m2267e(c6532f, AbstractC6534h.f10890f)).booleanValue()) {
            return false;
        }
        InterfaceC6608a interfaceC6608a = c6532f.f10863c;
        if (!(interfaceC6608a instanceof GenericViewTarget)) {
            return true;
        }
        ((GenericViewTarget) interfaceC6608a).getClass();
        throw null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 s.l, still in use, count: 3, list:
          (r1v0 s.l) from 0x0086: MOVE (r18v0 s.l) = (r1v0 s.l) (LINE:135)
          (r1v0 s.l) from 0x007b: MOVE (r18v3 s.l) = (r1v0 s.l) (LINE:124)
          (r1v0 s.l) from 0x006c: MOVE (r18v5 s.l) = (r1v0 s.l) (LINE:109)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    /* renamed from: c */
    public p154s.C6538l m6402c(p154s.C6532f r20, p162t.C6576f r21) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p188w1.C6701a.m6402c(s.f, t.f):s.l");
    }

    /* renamed from: d */
    public C6538l m6403d(C6538l c6538l) {
        C3304j c3304j;
        boolean z8;
        C3304j c3304j2 = c6538l.f10903j;
        C6268a c6268a = AbstractC6534h.f10886b;
        if (!AbstractC5806u.m5285x((Bitmap.Config) AbstractC3330o.m2268f(c6538l, c6268a)) || ((InterfaceC3340d) this.f11313b).mo2286b()) {
            c3304j = c3304j2;
            z8 = false;
        } else {
            c3304j2.getClass();
            LinkedHashMap linkedHashMapM5158L = AbstractC5785e0.m5158L(c3304j2.f1996a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapM5158L.put(c6268a, config);
            } else {
                linkedHashMapM5158L.remove(c6268a);
            }
            C3304j c3304j3 = new C3304j(AbstractC6600a.m6246x(linkedHashMapM5158L));
            z8 = true;
            c3304j = c3304j3;
        }
        return z8 ? new C6538l(c6538l.f10894a, c6538l.f10895b, c6538l.f10896c, c6538l.f10897d, c6538l.f10898e, c6538l.f10899f, c6538l.f10900g, c6538l.f10901h, c6538l.f10902i, c3304j) : c6538l;
    }

    public C6701a(BaseGuideActivity baseGuideActivity, Class cls) {
        this.f11313b = baseGuideActivity;
        this.f11312a = cls;
    }
}
