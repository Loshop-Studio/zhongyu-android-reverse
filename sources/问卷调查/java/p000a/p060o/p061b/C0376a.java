package p000a.p060o.p061b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p000a.p031h.p042i.C0241c;
import p000a.p060o.p061b.C0394q;

/* renamed from: a.o.b.a */
/* loaded from: classes.dex */
public class C0376a implements C0394q.a {

    /* renamed from: d */
    public final a f2192d;

    /* renamed from: a */
    public C0241c<b> f2189a = new C0241c<>(30);

    /* renamed from: b */
    public final ArrayList<b> f2190b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<b> f2191c = new ArrayList<>();

    /* renamed from: e */
    public final C0394q f2193e = new C0394q(this);

    /* renamed from: a.o.b.a$a */
    public interface a {
    }

    /* renamed from: a.o.b.a$b */
    public static class b {

        /* renamed from: a */
        public int f2194a;

        /* renamed from: b */
        public int f2195b;

        /* renamed from: c */
        public Object f2196c;

        /* renamed from: d */
        public int f2197d;

        public b(int i, int i2, int i3, Object obj) {
            this.f2194a = i;
            this.f2195b = i2;
            this.f2197d = i3;
            this.f2196c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2194a;
            if (i != bVar.f2194a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2197d - this.f2195b) == 1 && this.f2197d == bVar.f2195b && this.f2195b == bVar.f2197d) {
                return true;
            }
            if (this.f2197d != bVar.f2197d || this.f2195b != bVar.f2195b) {
                return false;
            }
            Object obj2 = this.f2196c;
            Object obj3 = bVar.f2196c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2194a * 31) + this.f2195b) * 31) + this.f2197d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f2194a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f2195b);
            sb.append("c:");
            sb.append(this.f2197d);
            sb.append(",p:");
            sb.append(this.f2196c);
            sb.append("]");
            return sb.toString();
        }
    }

    public C0376a(a aVar) {
        this.f2192d = aVar;
    }

    /* renamed from: a */
    public final boolean m1302a(int i) {
        int size = this.f2191c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2191c.get(i2);
            int i3 = bVar.f2194a;
            if (i3 == 8) {
                if (m1307f(bVar.f2197d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2195b;
                int i5 = bVar.f2197d + i4;
                while (i4 < i5) {
                    if (m1307f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m1303b() {
        int size = this.f2191c.size();
        for (int i = 0; i < size; i++) {
            ((C0399v) this.f2192d).m1410a(this.f2191c.get(i));
        }
        m1313l(this.f2191c);
    }

    /* renamed from: c */
    public void m1304c() {
        m1303b();
        int size = this.f2190b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2190b.get(i);
            int i2 = bVar.f2194a;
            if (i2 == 1) {
                ((C0399v) this.f2192d).m1410a(bVar);
                ((C0399v) this.f2192d).m1413d(bVar.f2195b, bVar.f2197d);
            } else if (i2 == 2) {
                ((C0399v) this.f2192d).m1410a(bVar);
                a aVar = this.f2192d;
                int i3 = bVar.f2195b;
                int i4 = bVar.f2197d;
                C0399v c0399v = (C0399v) aVar;
                c0399v.f2342a.m1842R(i3, i4, true);
                RecyclerView recyclerView = c0399v.f2342a;
                recyclerView.f3304i0 = true;
                recyclerView.f3298f0.f3408c += i4;
            } else if (i2 == 4) {
                ((C0399v) this.f2192d).m1410a(bVar);
                ((C0399v) this.f2192d).m1412c(bVar.f2195b, bVar.f2197d, bVar.f2196c);
            } else if (i2 == 8) {
                ((C0399v) this.f2192d).m1410a(bVar);
                ((C0399v) this.f2192d).m1414e(bVar.f2195b, bVar.f2197d);
            }
        }
        m1313l(this.f2190b);
    }

    /* renamed from: d */
    public final void m1305d(b bVar) {
        int i;
        int i2 = bVar.f2194a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM1314m = m1314m(bVar.f2195b, i2);
        int i3 = bVar.f2195b;
        int i4 = bVar.f2194a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2197d; i6++) {
            int iM1314m2 = m1314m((i * i6) + bVar.f2195b, bVar.f2194a);
            int i7 = bVar.f2194a;
            if (i7 == 2 ? iM1314m2 == iM1314m : i7 == 4 && iM1314m2 == iM1314m + 1) {
                i5++;
            } else {
                b bVarM1309h = m1309h(i7, iM1314m, i5, bVar.f2196c);
                m1306e(bVarM1309h, i3);
                m1312k(bVarM1309h);
                if (bVar.f2194a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM1314m = iM1314m2;
            }
        }
        Object obj = bVar.f2196c;
        m1312k(bVar);
        if (i5 > 0) {
            b bVarM1309h2 = m1309h(bVar.f2194a, iM1314m, i5, obj);
            m1306e(bVarM1309h2, i3);
            m1312k(bVarM1309h2);
        }
    }

    /* renamed from: e */
    public void m1306e(b bVar, int i) {
        ((C0399v) this.f2192d).m1410a(bVar);
        int i2 = bVar.f2194a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((C0399v) this.f2192d).m1412c(i, bVar.f2197d, bVar.f2196c);
            return;
        }
        a aVar = this.f2192d;
        int i3 = bVar.f2197d;
        C0399v c0399v = (C0399v) aVar;
        c0399v.f2342a.m1842R(i, i3, true);
        RecyclerView recyclerView = c0399v.f2342a;
        recyclerView.f3304i0 = true;
        recyclerView.f3298f0.f3408c += i3;
    }

    /* renamed from: f */
    public int m1307f(int i, int i2) {
        int size = this.f2191c.size();
        while (i2 < size) {
            b bVar = this.f2191c.get(i2);
            int i3 = bVar.f2194a;
            if (i3 == 8) {
                int i4 = bVar.f2195b;
                if (i4 == i) {
                    i = bVar.f2197d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2197d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2195b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2197d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2197d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean m1308g() {
        return this.f2190b.size() > 0;
    }

    /* renamed from: h */
    public b m1309h(int i, int i2, int i3, Object obj) {
        b bVarMo805a = this.f2189a.mo805a();
        if (bVarMo805a == null) {
            return new b(i, i2, i3, obj);
        }
        bVarMo805a.f2194a = i;
        bVarMo805a.f2195b = i2;
        bVarMo805a.f2197d = i3;
        bVarMo805a.f2196c = obj;
        return bVarMo805a;
    }

    /* renamed from: i */
    public final void m1310i(b bVar) {
        this.f2191c.add(bVar);
        int i = bVar.f2194a;
        if (i == 1) {
            ((C0399v) this.f2192d).m1413d(bVar.f2195b, bVar.f2197d);
            return;
        }
        if (i == 2) {
            C0399v c0399v = (C0399v) this.f2192d;
            c0399v.f2342a.m1842R(bVar.f2195b, bVar.f2197d, false);
            c0399v.f2342a.f3304i0 = true;
            return;
        }
        if (i == 4) {
            ((C0399v) this.f2192d).m1412c(bVar.f2195b, bVar.f2197d, bVar.f2196c);
        } else if (i == 8) {
            ((C0399v) this.f2192d).m1414e(bVar.f2195b, bVar.f2197d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0177 A[PHI: r4
      0x0177: PHI (r4v15 int) = (r4v9 int), (r4v19 int) binds: [B:95:0x0175, B:82:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0185  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m1311j() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p060o.p061b.C0376a.m1311j():void");
    }

    /* renamed from: k */
    public void m1312k(b bVar) {
        bVar.f2196c = null;
        this.f2189a.mo806b(bVar);
    }

    /* renamed from: l */
    public void m1313l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m1312k(list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m1314m(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList<a.o.b.a$b> r0 = r8.f2191c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList<a.o.b.a$b> r3 = r8.f2191c
            java.lang.Object r3 = r3.get(r0)
            a.o.b.a$b r3 = (p000a.p060o.p061b.C0376a.b) r3
            int r4 = r3.f2194a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f2195b
            int r4 = r3.f2197d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f2197d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f2195b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f2195b = r2
            int r4 = r4 + 1
        L52:
            r3.f2197d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f2195b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f2195b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f2197d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f2197d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f2195b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList<a.o.b.a$b> r10 = r8.f2191c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Laa
            java.util.ArrayList<a.o.b.a$b> r0 = r8.f2191c
            java.lang.Object r0 = r0.get(r10)
            a.o.b.a$b r0 = (p000a.p060o.p061b.C0376a.b) r0
            int r1 = r0.f2194a
            if (r1 != r2) goto L9b
            int r1 = r0.f2197d
            int r3 = r0.f2195b
            if (r1 == r3) goto L9f
            if (r1 >= 0) goto La7
            goto L9f
        L9b:
            int r1 = r0.f2197d
            if (r1 > 0) goto La7
        L9f:
            java.util.ArrayList<a.o.b.a$b> r1 = r8.f2191c
            r1.remove(r10)
            r8.m1312k(r0)
        La7:
            int r10 = r10 + (-1)
            goto L84
        Laa:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p060o.p061b.C0376a.m1314m(int, int):int");
    }
}
