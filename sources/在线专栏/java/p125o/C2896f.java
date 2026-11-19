package p125o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: o.f */
/* loaded from: classes.dex */
public class C2896f implements InterfaceC2894d {

    /* renamed from: d */
    AbstractC2903m f11329d;

    /* renamed from: f */
    int f11331f;

    /* renamed from: g */
    public int f11332g;

    /* renamed from: a */
    public InterfaceC2894d f11326a = null;

    /* renamed from: b */
    public boolean f11327b = false;

    /* renamed from: c */
    public boolean f11328c = false;

    /* renamed from: e */
    a f11330e = a.UNKNOWN;

    /* renamed from: h */
    int f11333h = 1;

    /* renamed from: i */
    C2897g f11334i = null;

    /* renamed from: j */
    public boolean f11335j = false;

    /* renamed from: k */
    List<InterfaceC2894d> f11336k = new ArrayList();

    /* renamed from: l */
    List<C2896f> f11337l = new ArrayList();

    /* renamed from: o.f$a */
    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C2896f(AbstractC2903m abstractC2903m) {
        this.f11329d = abstractC2903m;
    }

    @Override // p125o.InterfaceC2894d
    /* renamed from: a */
    public void mo9930a(InterfaceC2894d interfaceC2894d) {
        Iterator<C2896f> it = this.f11337l.iterator();
        while (it.hasNext()) {
            if (!it.next().f11335j) {
                return;
            }
        }
        this.f11328c = true;
        InterfaceC2894d interfaceC2894d2 = this.f11326a;
        if (interfaceC2894d2 != null) {
            interfaceC2894d2.mo9930a(this);
        }
        if (this.f11327b) {
            this.f11329d.mo9930a(this);
            return;
        }
        C2896f c2896f = null;
        int i4 = 0;
        for (C2896f c2896f2 : this.f11337l) {
            if (!(c2896f2 instanceof C2897g)) {
                i4++;
                c2896f = c2896f2;
            }
        }
        if (c2896f != null && i4 == 1 && c2896f.f11335j) {
            C2897g c2897g = this.f11334i;
            if (c2897g != null) {
                if (!c2897g.f11335j) {
                    return;
                } else {
                    this.f11331f = this.f11333h * c2897g.f11332g;
                }
            }
            mo9952d(c2896f.f11332g + this.f11331f);
        }
        InterfaceC2894d interfaceC2894d3 = this.f11326a;
        if (interfaceC2894d3 != null) {
            interfaceC2894d3.mo9930a(this);
        }
    }

    /* renamed from: b */
    public void m9950b(InterfaceC2894d interfaceC2894d) {
        this.f11336k.add(interfaceC2894d);
        if (this.f11335j) {
            interfaceC2894d.mo9930a(interfaceC2894d);
        }
    }

    /* renamed from: c */
    public void m9951c() {
        this.f11337l.clear();
        this.f11336k.clear();
        this.f11335j = false;
        this.f11332g = 0;
        this.f11328c = false;
        this.f11327b = false;
    }

    /* renamed from: d */
    public void mo9952d(int i4) {
        if (this.f11335j) {
            return;
        }
        this.f11335j = true;
        this.f11332g = i4;
        for (InterfaceC2894d interfaceC2894d : this.f11336k) {
            interfaceC2894d.mo9930a(interfaceC2894d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11329d.f11362b.m9755s());
        sb.append(":");
        sb.append(this.f11330e);
        sb.append("(");
        sb.append(this.f11335j ? Integer.valueOf(this.f11332g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f11337l.size());
        sb.append(":d=");
        sb.append(this.f11336k.size());
        sb.append(">");
        return sb.toString();
    }
}
