package p113g8;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8321f;
import p101f8.InterfaceC8469g;
import p300x7.InterfaceC10574p;
import p311y7.InterfaceC10668a;

/* renamed from: g8.d */
/* loaded from: classes5.dex */
public final class C8662d implements InterfaceC8469g {

    /* renamed from: a */
    public final CharSequence f16215a;

    /* renamed from: b */
    public final int f16216b;

    /* renamed from: c */
    public final int f16217c;

    /* renamed from: d */
    public final InterfaceC10574p f16218d;

    /* renamed from: g8.d$a */
    public static final class a implements Iterator, InterfaceC10668a {

        /* renamed from: a */
        public int f16219a = -1;

        /* renamed from: b */
        public int f16220b;

        /* renamed from: c */
        public int f16221c;

        /* renamed from: d */
        public C8321f f16222d;

        /* renamed from: e */
        public int f16223e;

        public a() {
            int iM13518m = AbstractC8323h.m13518m(C8662d.this.f16216b, 0, C8662d.this.f16215a.length());
            this.f16220b = iM13518m;
            this.f16221c = iM13518m;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m14016a() {
            /*
                r6 = this;
                int r0 = r6.f16221c
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f16219a = r1
                r0 = 0
                r6.f16222d = r0
                return
            Lb:
                g8.d r0 = p113g8.C8662d.this
                int r0 = p113g8.C8662d.m14014e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f16223e
                int r0 = r0 + r3
                r6.f16223e = r0
                g8.d r4 = p113g8.C8662d.this
                int r4 = p113g8.C8662d.m14014e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f16221c
                g8.d r4 = p113g8.C8662d.this
                java.lang.CharSequence r4 = p113g8.C8662d.m14013d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                d8.f r0 = new d8.f
                int r1 = r6.f16220b
                g8.d r4 = p113g8.C8662d.this
                java.lang.CharSequence r4 = p113g8.C8662d.m14013d(r4)
                int r4 = p113g8.AbstractC8661c0.m13985Z(r4)
                r0.<init>(r1, r4)
                r6.f16222d = r0
                r6.f16221c = r2
                goto L9b
            L46:
                g8.d r0 = p113g8.C8662d.this
                x7.p r0 = p113g8.C8662d.m14012c(r0)
                g8.d r4 = p113g8.C8662d.this
                java.lang.CharSequence r4 = p113g8.C8662d.m14013d(r4)
                int r5 = r6.f16221c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                d8.f r0 = new d8.f
                int r1 = r6.f16220b
                g8.d r4 = p113g8.C8662d.this
                java.lang.CharSequence r4 = p113g8.C8662d.m14013d(r4)
                int r4 = p113g8.AbstractC8661c0.m13985Z(r4)
                r0.<init>(r1, r4)
                r6.f16222d = r0
                r6.f16221c = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.m15903a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m15904b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f16220b
                d8.f r4 = p077d8.AbstractC8323h.m13525t(r4, r2)
                r6.f16222d = r4
                int r2 = r2 + r0
                r6.f16220b = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f16221c = r2
            L9b:
                r6.f16219a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p113g8.C8662d.a.m14016a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C8321f next() {
            if (this.f16219a == -1) {
                m14016a();
            }
            if (this.f16219a == 0) {
                throw new NoSuchElementException();
            }
            C8321f c8321f = this.f16222d;
            AbstractC9133u.m16131e(c8321f, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f16222d = null;
            this.f16219a = -1;
            return c8321f;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f16219a == -1) {
                m14016a();
            }
            return this.f16219a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C8662d(CharSequence input, int i10, int i11, InterfaceC10574p getNextMatch) {
        AbstractC9133u.m16133g(input, "input");
        AbstractC9133u.m16133g(getNextMatch, "getNextMatch");
        this.f16215a = input;
        this.f16216b = i10;
        this.f16217c = i11;
        this.f16218d = getNextMatch;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new a();
    }
}
