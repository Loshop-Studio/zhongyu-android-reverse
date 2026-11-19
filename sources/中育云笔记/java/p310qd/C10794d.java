package p310qd;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p265nd.AbstractC10410o;
import p265nd.C10405j;
import p296pd.InterfaceC10659g;

/* renamed from: qd.d */
/* loaded from: classes6.dex */
public final class C10794d implements InterfaceC10659g {

    /* renamed from: a */
    public final CharSequence f26028a;

    /* renamed from: b */
    public final int f26029b;

    /* renamed from: c */
    public final int f26030c;

    /* renamed from: d */
    public final InterfaceC9544p f26031d;

    /* renamed from: qd.d$a */
    public static final class a implements Iterator, InterfaceC9624a {

        /* renamed from: c */
        public int f26032c = -1;

        /* renamed from: d */
        public int f26033d;

        /* renamed from: e */
        public int f26034e;

        /* renamed from: f */
        public C10405j f26035f;

        /* renamed from: g */
        public int f26036g;

        public a() {
            int iM21761n = AbstractC10410o.m21761n(C10794d.this.f26029b, 0, C10794d.this.f26028a.length());
            this.f26033d = iM21761n;
            this.f26034e = iM21761n;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m23155a() {
            /*
                r6 = this;
                int r0 = r6.f26034e
                r1 = 0
                if (r0 >= 0) goto Lb
                r6.f26032c = r1
                r0 = 0
                r6.f26035f = r0
                return
            Lb:
                qd.d r0 = p310qd.C10794d.this
                int r0 = p310qd.C10794d.m23153e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L22
                int r0 = r6.f26036g
                int r0 = r0 + r3
                r6.f26036g = r0
                qd.d r4 = p310qd.C10794d.this
                int r4 = p310qd.C10794d.m23153e(r4)
                if (r0 >= r4) goto L30
            L22:
                int r0 = r6.f26034e
                qd.d r4 = p310qd.C10794d.this
                java.lang.CharSequence r4 = p310qd.C10794d.m23152d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L46
            L30:
                nd.j r0 = new nd.j
                int r1 = r6.f26033d
                qd.d r4 = p310qd.C10794d.this
                java.lang.CharSequence r4 = p310qd.C10794d.m23152d(r4)
                int r4 = p310qd.AbstractC10793c0.m23118Z(r4)
                r0.<init>(r1, r4)
                r6.f26035f = r0
                r6.f26034e = r2
                goto L9b
            L46:
                qd.d r0 = p310qd.C10794d.this
                hd.p r0 = p310qd.C10794d.m23151c(r0)
                qd.d r4 = p310qd.C10794d.this
                java.lang.CharSequence r4 = p310qd.C10794d.m23152d(r4)
                int r5 = r6.f26034e
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.Pair r0 = (kotlin.Pair) r0
                if (r0 != 0) goto L76
                nd.j r0 = new nd.j
                int r1 = r6.f26033d
                qd.d r4 = p310qd.C10794d.this
                java.lang.CharSequence r4 = p310qd.C10794d.m23152d(r4)
                int r4 = p310qd.AbstractC10793c0.m23118Z(r4)
                r0.<init>(r1, r4)
                r6.f26035f = r0
                r6.f26034e = r2
                goto L9b
            L76:
                java.lang.Object r2 = r0.m20048a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m20049c()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f26033d
                nd.j r4 = p265nd.AbstractC10410o.m21768u(r4, r2)
                r6.f26035f = r4
                int r2 = r2 + r0
                r6.f26033d = r2
                if (r0 != 0) goto L98
                r1 = r3
            L98:
                int r2 = r2 + r1
                r6.f26034e = r2
            L9b:
                r6.f26032c = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p310qd.C10794d.a.m23155a():void");
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C10405j next() {
            if (this.f26032c == -1) {
                m23155a();
            }
            if (this.f26032c == 0) {
                throw new NoSuchElementException();
            }
            C10405j c10405j = this.f26035f;
            AbstractC9979u.m20292e(c10405j, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f26035f = null;
            this.f26032c = -1;
            return c10405j;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f26032c == -1) {
                m23155a();
            }
            return this.f26032c == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C10794d(CharSequence input, int i10, int i11, InterfaceC9544p getNextMatch) {
        AbstractC9979u.m20294g(input, "input");
        AbstractC9979u.m20294g(getNextMatch, "getNextMatch");
        this.f26028a = input;
        this.f26029b = i10;
        this.f26030c = i11;
        this.f26031d = getNextMatch;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new a();
    }
}
