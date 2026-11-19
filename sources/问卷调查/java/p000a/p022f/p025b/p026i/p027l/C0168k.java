package p000a.p022f.p025b.p026i.p027l;

import java.util.ArrayList;

/* renamed from: a.f.b.i.l.k */
/* loaded from: classes.dex */
public class C0168k {

    /* renamed from: c */
    public static int f1202c;

    /* renamed from: a */
    public AbstractC0170m f1203a;

    /* renamed from: b */
    public ArrayList<AbstractC0170m> f1204b = new ArrayList<>();

    public C0168k(AbstractC0170m abstractC0170m, int i) {
        this.f1203a = null;
        f1202c++;
        this.f1203a = abstractC0170m;
    }

    /* renamed from: a */
    public final long m648a(C0163f c0163f, long j) {
        AbstractC0170m abstractC0170m = c0163f.f1182d;
        if (abstractC0170m instanceof C0166i) {
            return j;
        }
        int size = c0163f.f1189k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0161d interfaceC0161d = c0163f.f1189k.get(i);
            if (interfaceC0161d instanceof C0163f) {
                C0163f c0163f2 = (C0163f) interfaceC0161d;
                if (c0163f2.f1182d != abstractC0170m) {
                    jMin = Math.min(jMin, m648a(c0163f2, c0163f2.f1184f + j));
                }
            }
        }
        if (c0163f != abstractC0170m.f1215i) {
            return jMin;
        }
        long jMo631j = j - abstractC0170m.mo631j();
        return Math.min(Math.min(jMin, m648a(abstractC0170m.f1214h, jMo631j)), jMo631j - abstractC0170m.f1214h.f1184f);
    }

    /* renamed from: b */
    public final long m649b(C0163f c0163f, long j) {
        AbstractC0170m abstractC0170m = c0163f.f1182d;
        if (abstractC0170m instanceof C0166i) {
            return j;
        }
        int size = c0163f.f1189k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0161d interfaceC0161d = c0163f.f1189k.get(i);
            if (interfaceC0161d instanceof C0163f) {
                C0163f c0163f2 = (C0163f) interfaceC0161d;
                if (c0163f2.f1182d != abstractC0170m) {
                    jMax = Math.max(jMax, m649b(c0163f2, c0163f2.f1184f + j));
                }
            }
        }
        if (c0163f != abstractC0170m.f1214h) {
            return jMax;
        }
        long jMo631j = j + abstractC0170m.mo631j();
        return Math.max(Math.max(jMax, m649b(abstractC0170m.f1215i, jMo631j)), jMo631j - abstractC0170m.f1215i.f1184f);
    }
}
