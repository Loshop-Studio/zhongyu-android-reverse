package p001a0;

import java.util.Locale;

/* renamed from: a0.d */
/* loaded from: classes.dex */
public final class C0005d {

    /* renamed from: a */
    public static final InterfaceC0004c f32a = new e(null, false);

    /* renamed from: b */
    public static final InterfaceC0004c f33b = new e(null, true);

    /* renamed from: c */
    public static final InterfaceC0004c f34c;

    /* renamed from: d */
    public static final InterfaceC0004c f35d;

    /* renamed from: e */
    public static final InterfaceC0004c f36e;

    /* renamed from: f */
    public static final InterfaceC0004c f37f;

    /* renamed from: a0.d$a */
    private static class a implements c {

        /* renamed from: b */
        static final a f38b = new a(true);

        /* renamed from: a */
        private final boolean f39a;

        private a(boolean z3) {
            this.f39a = z3;
        }

        @Override // p001a0.C0005d.c
        /* renamed from: a */
        public int mo43a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            boolean z3 = false;
            while (i4 < i6) {
                int iM41a = C0005d.m41a(Character.getDirectionality(charSequence.charAt(i4)));
                if (iM41a != 0) {
                    if (iM41a != 1) {
                        continue;
                        i4++;
                    } else if (!this.f39a) {
                        return 1;
                    }
                } else if (this.f39a) {
                    return 0;
                }
                z3 = true;
                i4++;
            }
            if (z3) {
                return this.f39a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: a0.d$b */
    private static class b implements c {

        /* renamed from: a */
        static final b f40a = new b();

        private b() {
        }

        @Override // p001a0.C0005d.c
        /* renamed from: a */
        public int mo43a(CharSequence charSequence, int i4, int i5) {
            int i6 = i5 + i4;
            int iM42b = 2;
            while (i4 < i6 && iM42b == 2) {
                iM42b = C0005d.m42b(Character.getDirectionality(charSequence.charAt(i4)));
                i4++;
            }
            return iM42b;
        }
    }

    /* renamed from: a0.d$c */
    private interface c {
        /* renamed from: a */
        int mo43a(CharSequence charSequence, int i4, int i5);
    }

    /* renamed from: a0.d$d */
    private static abstract class d implements InterfaceC0004c {

        /* renamed from: a */
        private final c f41a;

        d(c cVar) {
            this.f41a = cVar;
        }

        /* renamed from: c */
        private boolean m44c(CharSequence charSequence, int i4, int i5) {
            int iMo43a = this.f41a.mo43a(charSequence, i4, i5);
            if (iMo43a == 0) {
                return true;
            }
            if (iMo43a != 1) {
                return mo45b();
            }
            return false;
        }

        @Override // p001a0.InterfaceC0004c
        /* renamed from: a */
        public boolean mo40a(CharSequence charSequence, int i4, int i5) {
            if (charSequence == null || i4 < 0 || i5 < 0 || charSequence.length() - i5 < i4) {
                throw new IllegalArgumentException();
            }
            return this.f41a == null ? mo45b() : m44c(charSequence, i4, i5);
        }

        /* renamed from: b */
        protected abstract boolean mo45b();
    }

    /* renamed from: a0.d$e */
    private static class e extends d {

        /* renamed from: b */
        private final boolean f42b;

        e(c cVar, boolean z3) {
            super(cVar);
            this.f42b = z3;
        }

        @Override // p001a0.C0005d.d
        /* renamed from: b */
        protected boolean mo45b() {
            return this.f42b;
        }
    }

    /* renamed from: a0.d$f */
    private static class f extends d {

        /* renamed from: b */
        static final f f43b = new f();

        f() {
            super(null);
        }

        @Override // p001a0.C0005d.d
        /* renamed from: b */
        protected boolean mo45b() {
            return C0006e.m46a(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f40a;
        f34c = new e(bVar, false);
        f35d = new e(bVar, true);
        f36e = new e(a.f38b, false);
        f37f = f.f43b;
    }

    /* renamed from: a */
    static int m41a(int i4) {
        if (i4 != 0) {
            return (i4 == 1 || i4 == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m42b(int i4) {
        if (i4 != 0) {
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            switch (i4) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
