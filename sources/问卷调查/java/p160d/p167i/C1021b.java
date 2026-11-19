package p160d.p167i;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import p160d.C0992b;
import p160d.p162f.p163a.InterfaceC1007c;
import p160d.p162f.p164b.C1011d;
import p160d.p165g.C1017c;
import p160d.p166h.InterfaceC1018a;

/* renamed from: d.i.b */
/* loaded from: classes.dex */
public final class C1021b implements InterfaceC1018a<C1017c> {

    /* renamed from: a */
    public final CharSequence f5496a;

    /* renamed from: b */
    public final int f5497b;

    /* renamed from: c */
    public final int f5498c;

    /* renamed from: d */
    public final InterfaceC1007c<CharSequence, Integer, C0992b<Integer, Integer>> f5499d;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
    /* renamed from: d.i.b$a */
    public static final class a implements Iterator<C1017c> {

        /* renamed from: b */
        public int f5500b = -1;

        /* renamed from: c */
        public int f5501c;

        /* renamed from: d */
        public int f5502d;

        /* renamed from: e */
        public C1017c f5503e;

        /* renamed from: f */
        public int f5504f;

        public a() {
            int i = C1021b.this.f5497b;
            int length = C1021b.this.f5496a.length();
            if (length >= 0) {
                if (i < 0) {
                    i = 0;
                } else if (i > length) {
                    i = length;
                }
                this.f5501c = i;
                this.f5502d = i;
                return;
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void m2817a() {
            /*
                r7 = this;
                int r0 = r7.f5502d
                r1 = 0
                if (r0 >= 0) goto Lc
                r7.f5500b = r1
                r0 = 0
                r7.f5503e = r0
                goto L8b
            Lc:
                d.i.b r2 = p160d.p167i.C1021b.this
                int r3 = r2.f5498c
                r4 = 1
                if (r3 <= 0) goto L1a
                int r5 = r7.f5504f
                int r5 = r5 + r4
                r7.f5504f = r5
                if (r5 >= r3) goto L22
            L1a:
                java.lang.CharSequence r2 = r2.f5496a
                int r2 = r2.length()
                if (r0 <= r2) goto L32
            L22:
                int r0 = r7.f5501c
                d.g.c r1 = new d.g.c
                d.i.b r2 = p160d.p167i.C1021b.this
                java.lang.CharSequence r2 = r2.f5496a
                int r2 = p160d.p167i.C1026g.m2821d(r2)
                r1.<init>(r0, r2)
                goto L55
            L32:
                d.i.b r0 = p160d.p167i.C1021b.this
                d.f.a.c<java.lang.CharSequence, java.lang.Integer, d.b<java.lang.Integer, java.lang.Integer>> r2 = r0.f5499d
                java.lang.CharSequence r0 = r0.f5496a
                int r3 = r7.f5502d
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Object r0 = r2.mo2802b(r0, r3)
                d.b r0 = (p160d.C0992b) r0
                if (r0 != 0) goto L5b
                int r0 = r7.f5501c
                d.g.c r1 = new d.g.c
                d.i.b r2 = p160d.p167i.C1021b.this
                java.lang.CharSequence r2 = r2.f5496a
                int r2 = p160d.p167i.C1026g.m2821d(r2)
                r1.<init>(r0, r2)
            L55:
                r7.f5503e = r1
                r0 = -1
                r7.f5502d = r0
                goto L89
            L5b:
                A r2 = r0.f5472b
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                B r0 = r0.f5473c
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r3 = r7.f5501c
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r2 > r5) goto L76
                d.g.c r3 = p160d.p165g.C1017c.f5493f
                d.g.c r3 = p160d.p165g.C1017c.f5492e
                goto L7e
            L76:
                d.g.c r5 = new d.g.c
                int r6 = r2 + (-1)
                r5.<init>(r3, r6)
                r3 = r5
            L7e:
                r7.f5503e = r3
                int r2 = r2 + r0
                r7.f5501c = r2
                if (r0 != 0) goto L86
                r1 = r4
            L86:
                int r2 = r2 + r1
                r7.f5502d = r2
            L89:
                r7.f5500b = r4
            L8b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p160d.p167i.C1021b.a.m2817a():void");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f5500b == -1) {
                m2817a();
            }
            return this.f5500b == 1;
        }

        @Override // java.util.Iterator
        public C1017c next() {
            if (this.f5500b == -1) {
                m2817a();
            }
            if (this.f5500b == 0) {
                throw new NoSuchElementException();
            }
            C1017c c1017c = this.f5503e;
            Objects.requireNonNull(c1017c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f5503e = null;
            this.f5500b = -1;
            return c1017c;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1021b(CharSequence charSequence, int i, int i2, InterfaceC1007c<? super CharSequence, ? super Integer, C0992b<Integer, Integer>> interfaceC1007c) {
        C1011d.m2809e(charSequence, "input");
        C1011d.m2809e(interfaceC1007c, "getNextMatch");
        this.f5496a = charSequence;
        this.f5497b = i;
        this.f5498c = i2;
        this.f5499d = interfaceC1007c;
    }

    @Override // p160d.p166h.InterfaceC1018a
    public Iterator<C1017c> iterator() {
        return new a();
    }
}
