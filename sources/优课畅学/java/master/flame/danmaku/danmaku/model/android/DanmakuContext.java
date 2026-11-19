package master.flame.danmaku.danmaku.model.android;

import android.graphics.Typeface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p010a9.C0050a;
import p010a9.C0052c;
import p312y8.C10675b;
import p323z8.AbstractC10730a;
import p323z8.AbstractC10731b;
import p323z8.C10738i;

/* loaded from: classes5.dex */
public class DanmakuContext {

    /* renamed from: r */
    public List f18446r;

    /* renamed from: v */
    public boolean f18450v;

    /* renamed from: w */
    public boolean f18451w;

    /* renamed from: a */
    public Typeface f18429a = null;

    /* renamed from: b */
    public int f18430b = AbstractC10731b.f21281a;

    /* renamed from: c */
    public float f18431c = 1.0f;

    /* renamed from: d */
    public boolean f18432d = true;

    /* renamed from: e */
    public boolean f18433e = true;

    /* renamed from: f */
    public boolean f18434f = true;

    /* renamed from: g */
    public boolean f18435g = true;

    /* renamed from: h */
    public boolean f18436h = true;

    /* renamed from: i */
    public List f18437i = new ArrayList();

    /* renamed from: j */
    public int f18438j = -1;

    /* renamed from: k */
    public float f18439k = 1.0f;

    /* renamed from: l */
    public int f18440l = 15;

    /* renamed from: m */
    public BorderType f18441m = BorderType.SHADOW;

    /* renamed from: n */
    public int f18442n = 3;

    /* renamed from: o */
    public List f18443o = new ArrayList();

    /* renamed from: p */
    public List f18444p = new ArrayList();

    /* renamed from: q */
    public List f18445q = new ArrayList();

    /* renamed from: s */
    public boolean f18447s = false;

    /* renamed from: t */
    public boolean f18448t = false;

    /* renamed from: u */
    public boolean f18449u = false;

    /* renamed from: x */
    public final AbstractC10730a f18452x = new C0050a();

    /* renamed from: y */
    public final C10738i f18453y = new C10738i();

    /* renamed from: z */
    public final C10675b f18454z = new C10675b();

    /* renamed from: A */
    public final C0052c f18428A = C0052c.m163a();

    public enum BorderType {
        NONE,
        SHADOW,
        STROKEN
    }

    /* renamed from: master.flame.danmaku.danmaku.model.android.DanmakuContext$a */
    public interface InterfaceC9347a {
    }

    /* renamed from: a */
    public static DanmakuContext m17215a() {
        return new DanmakuContext();
    }

    /* renamed from: b */
    public AbstractC10730a m17216b() {
        return this.f18452x;
    }

    /* renamed from: c */
    public boolean m17217c() {
        return this.f18449u;
    }

    /* renamed from: d */
    public boolean m17218d() {
        return this.f18448t;
    }

    /* renamed from: e */
    public boolean m17219e() {
        return this.f18450v;
    }

    /* renamed from: f */
    public boolean m17220f() {
        return this.f18451w;
    }

    /* renamed from: g */
    public void m17221g(InterfaceC9347a interfaceC9347a) {
        if (interfaceC9347a == null || this.f18446r == null) {
            this.f18446r = Collections.synchronizedList(new ArrayList());
        }
        Iterator it = this.f18446r.iterator();
        while (it.hasNext()) {
            if (interfaceC9347a.equals(((WeakReference) it.next()).get())) {
                return;
            }
        }
        this.f18446r.add(new WeakReference(interfaceC9347a));
    }

    /* renamed from: h */
    public void m17222h() {
        List list = this.f18446r;
        if (list != null) {
            list.clear();
            this.f18446r = null;
        }
    }
}
