package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0587a;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.i */
/* loaded from: classes.dex */
class C0595i {

    /* renamed from: a */
    final a f3875a;

    /* renamed from: androidx.recyclerview.widget.i$a */
    interface a {
        /* renamed from: a */
        void mo3278a(C0587a.b bVar);

        /* renamed from: b */
        C0587a.b mo3279b(int i4, int i5, int i6, Object obj);
    }

    C0595i(a aVar) {
        this.f3875a = aVar;
    }

    /* renamed from: a */
    private int m3386a(List<C0587a.b> list) {
        boolean z3 = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f3753a != 8) {
                z3 = true;
            } else if (z3) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private void m3387c(List<C0587a.b> list, int i4, C0587a.b bVar, int i5, C0587a.b bVar2) {
        int i6 = bVar.f3756d;
        int i7 = bVar2.f3754b;
        int i8 = i6 < i7 ? -1 : 0;
        int i9 = bVar.f3754b;
        if (i9 < i7) {
            i8++;
        }
        if (i7 <= i9) {
            bVar.f3754b = i9 + bVar2.f3756d;
        }
        int i10 = bVar2.f3754b;
        if (i10 <= i6) {
            bVar.f3756d = i6 + bVar2.f3756d;
        }
        bVar2.f3754b = i10 + i8;
        list.set(i4, bVar2);
        list.set(i5, bVar);
    }

    /* renamed from: d */
    private void m3388d(List<C0587a.b> list, int i4, int i5) {
        C0587a.b bVar = list.get(i4);
        C0587a.b bVar2 = list.get(i5);
        int i6 = bVar2.f3753a;
        if (i6 == 1) {
            m3387c(list, i4, bVar, i5, bVar2);
        } else if (i6 == 2) {
            m3390e(list, i4, bVar, i5, bVar2);
        } else {
            if (i6 != 4) {
                return;
            }
            m3391f(list, i4, bVar, i5, bVar2);
        }
    }

    /* renamed from: b */
    void m3389b(List<C0587a.b> list) {
        while (true) {
            int iM3386a = m3386a(list);
            if (iM3386a == -1) {
                return;
            } else {
                m3388d(list, iM3386a, iM3386a + 1);
            }
        }
    }

    /* renamed from: e */
    void m3390e(List<C0587a.b> list, int i4, C0587a.b bVar, int i5, C0587a.b bVar2) {
        boolean z3;
        int i6 = bVar.f3754b;
        int i7 = bVar.f3756d;
        boolean z4 = false;
        if (i6 < i7) {
            if (bVar2.f3754b == i6 && bVar2.f3756d == i7 - i6) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
        } else if (bVar2.f3754b == i7 + 1 && bVar2.f3756d == i6 - i7) {
            z3 = true;
            z4 = true;
        } else {
            z3 = true;
        }
        int i8 = bVar2.f3754b;
        if (i7 < i8) {
            bVar2.f3754b = i8 - 1;
        } else {
            int i9 = bVar2.f3756d;
            if (i7 < i8 + i9) {
                bVar2.f3756d = i9 - 1;
                bVar.f3753a = 2;
                bVar.f3756d = 1;
                if (bVar2.f3756d == 0) {
                    list.remove(i5);
                    this.f3875a.mo3278a(bVar2);
                    return;
                }
                return;
            }
        }
        int i10 = bVar.f3754b;
        int i11 = bVar2.f3754b;
        C0587a.b bVarMo3279b = null;
        if (i10 <= i11) {
            bVar2.f3754b = i11 + 1;
        } else {
            int i12 = bVar2.f3756d;
            if (i10 < i11 + i12) {
                bVarMo3279b = this.f3875a.mo3279b(2, i10 + 1, (i11 + i12) - i10, null);
                bVar2.f3756d = bVar.f3754b - bVar2.f3754b;
            }
        }
        if (z4) {
            list.set(i4, bVar2);
            list.remove(i5);
            this.f3875a.mo3278a(bVar);
            return;
        }
        if (z3) {
            if (bVarMo3279b != null) {
                int i13 = bVar.f3754b;
                if (i13 > bVarMo3279b.f3754b) {
                    bVar.f3754b = i13 - bVarMo3279b.f3756d;
                }
                int i14 = bVar.f3756d;
                if (i14 > bVarMo3279b.f3754b) {
                    bVar.f3756d = i14 - bVarMo3279b.f3756d;
                }
            }
            int i15 = bVar.f3754b;
            if (i15 > bVar2.f3754b) {
                bVar.f3754b = i15 - bVar2.f3756d;
            }
            int i16 = bVar.f3756d;
            if (i16 > bVar2.f3754b) {
                bVar.f3756d = i16 - bVar2.f3756d;
            }
        } else {
            if (bVarMo3279b != null) {
                int i17 = bVar.f3754b;
                if (i17 >= bVarMo3279b.f3754b) {
                    bVar.f3754b = i17 - bVarMo3279b.f3756d;
                }
                int i18 = bVar.f3756d;
                if (i18 >= bVarMo3279b.f3754b) {
                    bVar.f3756d = i18 - bVarMo3279b.f3756d;
                }
            }
            int i19 = bVar.f3754b;
            if (i19 >= bVar2.f3754b) {
                bVar.f3754b = i19 - bVar2.f3756d;
            }
            int i20 = bVar.f3756d;
            if (i20 >= bVar2.f3754b) {
                bVar.f3756d = i20 - bVar2.f3756d;
            }
        }
        list.set(i4, bVar2);
        if (bVar.f3754b != bVar.f3756d) {
            list.set(i5, bVar);
        } else {
            list.remove(i5);
        }
        if (bVarMo3279b != null) {
            list.add(i4, bVarMo3279b);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m3391f(java.util.List<androidx.recyclerview.widget.C0587a.b> r9, int r10, androidx.recyclerview.widget.C0587a.b r11, int r12, androidx.recyclerview.widget.C0587a.b r13) {
        /*
            r8 = this;
            int r0 = r11.f3756d
            int r1 = r13.f3754b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto Ld
            int r1 = r1 - r4
            r13.f3754b = r1
            goto L20
        Ld:
            int r5 = r13.f3756d
            int r1 = r1 + r5
            if (r0 >= r1) goto L20
            int r5 = r5 - r4
            r13.f3756d = r5
            androidx.recyclerview.widget.i$a r0 = r8.f3875a
            int r1 = r11.f3754b
            java.lang.Object r5 = r13.f3755c
            androidx.recyclerview.widget.a$b r0 = r0.mo3279b(r2, r1, r4, r5)
            goto L21
        L20:
            r0 = r3
        L21:
            int r1 = r11.f3754b
            int r5 = r13.f3754b
            if (r1 > r5) goto L2b
            int r5 = r5 + r4
            r13.f3754b = r5
            goto L41
        L2b:
            int r6 = r13.f3756d
            int r7 = r5 + r6
            if (r1 >= r7) goto L41
            int r5 = r5 + r6
            int r5 = r5 - r1
            androidx.recyclerview.widget.i$a r3 = r8.f3875a
            int r1 = r1 + r4
            java.lang.Object r4 = r13.f3755c
            androidx.recyclerview.widget.a$b r3 = r3.mo3279b(r2, r1, r5, r4)
            int r1 = r13.f3756d
            int r1 = r1 - r5
            r13.f3756d = r1
        L41:
            r9.set(r12, r11)
            int r11 = r13.f3756d
            if (r11 <= 0) goto L4c
            r9.set(r10, r13)
            goto L54
        L4c:
            r9.remove(r10)
            androidx.recyclerview.widget.i$a r11 = r8.f3875a
            r11.mo3278a(r13)
        L54:
            if (r0 == 0) goto L59
            r9.add(r10, r0)
        L59:
            if (r3 == 0) goto L5e
            r9.add(r10, r3)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C0595i.m3391f(java.util.List, int, androidx.recyclerview.widget.a$b, int, androidx.recyclerview.widget.a$b):void");
    }
}
