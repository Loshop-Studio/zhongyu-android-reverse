package p000a.p022f.p025b.p026i.p027l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.f.b.i.l.f */
/* loaded from: classes.dex */
public class C0163f implements InterfaceC0161d {

    /* renamed from: d */
    public AbstractC0170m f1182d;

    /* renamed from: f */
    public int f1184f;

    /* renamed from: g */
    public int f1185g;

    /* renamed from: a */
    public InterfaceC0161d f1179a = null;

    /* renamed from: b */
    public boolean f1180b = false;

    /* renamed from: c */
    public boolean f1181c = false;

    /* renamed from: e */
    public a f1183e = a.UNKNOWN;

    /* renamed from: h */
    public int f1186h = 1;

    /* renamed from: i */
    public C0164g f1187i = null;

    /* renamed from: j */
    public boolean f1188j = false;

    /* renamed from: k */
    public List<InterfaceC0161d> f1189k = new ArrayList();

    /* renamed from: l */
    public List<C0163f> f1190l = new ArrayList();

    /* renamed from: a.f.b.i.l.f$a */
    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public C0163f(AbstractC0170m abstractC0170m) {
        this.f1182d = abstractC0170m;
    }

    @Override // p000a.p022f.p025b.p026i.p027l.InterfaceC0161d
    /* renamed from: a */
    public void mo627a(InterfaceC0161d interfaceC0161d) {
        Iterator<C0163f> it = this.f1190l.iterator();
        while (it.hasNext()) {
            if (!it.next().f1188j) {
                return;
            }
        }
        this.f1181c = true;
        InterfaceC0161d interfaceC0161d2 = this.f1179a;
        if (interfaceC0161d2 != null) {
            interfaceC0161d2.mo627a(this);
        }
        if (this.f1180b) {
            this.f1182d.mo627a(this);
            return;
        }
        C0163f c0163f = null;
        int i = 0;
        for (C0163f c0163f2 : this.f1190l) {
            if (!(c0163f2 instanceof C0164g)) {
                i++;
                c0163f = c0163f2;
            }
        }
        if (c0163f != null && i == 1 && c0163f.f1188j) {
            C0164g c0164g = this.f1187i;
            if (c0164g != null) {
                if (!c0164g.f1188j) {
                    return;
                } else {
                    this.f1184f = this.f1186h * c0164g.f1185g;
                }
            }
            mo643c(c0163f.f1185g + this.f1184f);
        }
        InterfaceC0161d interfaceC0161d3 = this.f1179a;
        if (interfaceC0161d3 != null) {
            interfaceC0161d3.mo627a(this);
        }
    }

    /* renamed from: b */
    public void m642b() {
        this.f1190l.clear();
        this.f1189k.clear();
        this.f1188j = false;
        this.f1185g = 0;
        this.f1181c = false;
        this.f1180b = false;
    }

    /* renamed from: c */
    public void mo643c(int i) {
        if (this.f1188j) {
            return;
        }
        this.f1188j = true;
        this.f1185g = i;
        for (InterfaceC0161d interfaceC0161d : this.f1189k) {
            interfaceC0161d.mo627a(interfaceC0161d);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1182d.f1208b.f1096Y);
        sb.append(":");
        sb.append(this.f1183e);
        sb.append("(");
        sb.append(this.f1188j ? Integer.valueOf(this.f1185g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f1190l.size());
        sb.append(":d=");
        sb.append(this.f1189k.size());
        sb.append(">");
        return sb.toString();
    }
}
