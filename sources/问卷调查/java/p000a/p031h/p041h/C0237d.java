package p000a.p031h.p041h;

/* renamed from: a.h.h.d */
/* loaded from: classes.dex */
public final class C0237d {

    /* renamed from: a */
    public static final InterfaceC0236c f1544a = new d(null, false);

    /* renamed from: b */
    public static final InterfaceC0236c f1545b = new d(null, true);

    /* renamed from: c */
    public static final InterfaceC0236c f1546c;

    /* renamed from: d */
    public static final InterfaceC0236c f1547d;

    /* renamed from: a.h.h.d$a */
    public static class a implements b {

        /* renamed from: a */
        public static final a f1548a = new a();

        /* JADX WARN: Removed duplicated region for block: B:11:0x001d  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
        @Override // p000a.p031h.p041h.C0237d.b
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int mo802a(java.lang.CharSequence r4, int r5, int r6) {
            /*
                r3 = this;
                int r6 = r6 + r5
                r0 = 2
                r1 = r0
            L3:
                if (r5 >= r6) goto L23
                if (r1 != r0) goto L23
                char r1 = r4.charAt(r5)
                byte r1 = java.lang.Character.getDirectionality(r1)
                a.h.h.c r2 = p000a.p031h.p041h.C0237d.f1544a
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 == r2) goto L1d
                if (r1 == r0) goto L1d
                switch(r1) {
                    case 14: goto L1f;
                    case 15: goto L1f;
                    case 16: goto L1d;
                    case 17: goto L1d;
                    default: goto L1b;
                }
            L1b:
                r1 = r0
                goto L20
            L1d:
                r1 = 0
                goto L20
            L1f:
                r1 = r2
            L20:
                int r5 = r5 + 1
                goto L3
            L23:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p041h.C0237d.a.mo802a(java.lang.CharSequence, int, int):int");
        }
    }

    /* renamed from: a.h.h.d$b */
    public interface b {
        /* renamed from: a */
        int mo802a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: a.h.h.d$c */
    public static abstract class c implements InterfaceC0236c {

        /* renamed from: a */
        public final b f1549a;

        public c(b bVar) {
            this.f1549a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo803a();

        /* renamed from: b */
        public boolean m804b(CharSequence charSequence, int i, int i2) {
            if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
                throw new IllegalArgumentException();
            }
            b bVar = this.f1549a;
            if (bVar == null) {
                return mo803a();
            }
            int iMo802a = bVar.mo802a(charSequence, i, i2);
            if (iMo802a == 0) {
                return true;
            }
            if (iMo802a != 1) {
                return mo803a();
            }
            return false;
        }
    }

    /* renamed from: a.h.h.d$d */
    public static class d extends c {

        /* renamed from: b */
        public final boolean f1550b;

        public d(b bVar, boolean z) {
            super(bVar);
            this.f1550b = z;
        }

        @Override // p000a.p031h.p041h.C0237d.c
        /* renamed from: a */
        public boolean mo803a() {
            return this.f1550b;
        }
    }

    static {
        a aVar = a.f1548a;
        f1546c = new d(aVar, false);
        f1547d = new d(aVar, true);
    }
}
