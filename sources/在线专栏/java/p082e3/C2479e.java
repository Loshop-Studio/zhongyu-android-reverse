package p082e3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;
import p014b3.C1037f;
import p077d3.InterfaceC2457d;
import p128o2.C2918k;
import p171x2.InterfaceC3474p;
import p175y2.InterfaceC3498a;

/* renamed from: e3.e */
/* loaded from: classes.dex */
final class C2479e implements InterfaceC2457d<C1034c> {

    /* renamed from: a */
    @NotNull
    private final CharSequence f10090a;

    /* renamed from: b */
    private final int f10091b;

    /* renamed from: c */
    private final int f10092c;

    /* renamed from: d */
    @NotNull
    private final InterfaceC3474p<CharSequence, Integer, C2918k<Integer, Integer>> f10093d;

    /* renamed from: e3.e$a */
    public static final class a implements Iterator<C1034c>, InterfaceC3498a {

        /* renamed from: a */
        private int f10094a = -1;

        /* renamed from: b */
        private int f10095b;

        /* renamed from: c */
        private int f10096c;

        /* renamed from: d */
        @Nullable
        private C1034c f10097d;

        /* renamed from: e */
        private int f10098e;

        a() {
            int iM4825f = C1037f.m4825f(C2479e.this.f10091b, 0, C2479e.this.f10090a.length());
            this.f10095b = iM4825f;
            this.f10096c = iM4825f;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void m8270a() {
            /*
                r6 = this;
                int r0 = r6.f10096c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f10094a = r1
                r0 = 0
                r6.f10097d = r0
                goto L9e
            Lc:
                e3.e r0 = p082e3.C2479e.this
                int r0 = p082e3.C2479e.m8268d(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f10098e
                int r0 = r0 + r3
                r6.f10098e = r0
                e3.e r4 = p082e3.C2479e.this
                int r4 = p082e3.C2479e.m8268d(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f10096c
                e3.e r4 = p082e3.C2479e.this
                java.lang.CharSequence r4 = p082e3.C2479e.m8267c(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                b3.c r0 = new b3.c
                int r1 = r6.f10095b
                e3.e r4 = p082e3.C2479e.this
                java.lang.CharSequence r4 = p082e3.C2479e.m8267c(r4)
                int r4 = p082e3.C2496v.m8375O(r4)
                r0.<init>(r1, r4)
                r6.f10097d = r0
                r6.f10096c = r2
                goto L9c
            L47:
                e3.e r0 = p082e3.C2479e.this
                x2.p r0 = p082e3.C2479e.m8266b(r0)
                e3.e r4 = p082e3.C2479e.this
                java.lang.CharSequence r4 = p082e3.C2479e.m8267c(r4)
                int r5 = r6.f10096c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.mo2812d(r4, r5)
                o2.k r0 = (p128o2.C2918k) r0
                if (r0 != 0) goto L77
                b3.c r0 = new b3.c
                int r1 = r6.f10095b
                e3.e r4 = p082e3.C2479e.this
                java.lang.CharSequence r4 = p082e3.C2479e.m8267c(r4)
                int r4 = p082e3.C2496v.m8375O(r4)
                r0.<init>(r1, r4)
                r6.f10097d = r0
                r6.f10096c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.m9985a()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.m9986b()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f10095b
                b3.c r4 = p014b3.C1035d.m4819i(r4, r2)
                r6.f10097d = r4
                int r2 = r2 + r0
                r6.f10095b = r2
                if (r0 != 0) goto L99
                r1 = 1
            L99:
                int r2 = r2 + r1
                r6.f10096c = r2
            L9c:
                r6.f10094a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e3.C2479e.a.m8270a():void");
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1034c next() {
            if (this.f10094a == -1) {
                m8270a();
            }
            if (this.f10094a == 0) {
                throw new NoSuchElementException();
            }
            C1034c c1034c = this.f10097d;
            Objects.requireNonNull(c1034c, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f10097d = null;
            this.f10094a = -1;
            return c1034c;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10094a == -1) {
                m8270a();
            }
            return this.f10094a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2479e(@NotNull CharSequence input, int i4, int i5, @NotNull InterfaceC3474p<? super CharSequence, ? super Integer, C2918k<Integer, Integer>> getNextMatch) {
        C2769l.m9241e(input, "input");
        C2769l.m9241e(getNextMatch, "getNextMatch");
        this.f10090a = input;
        this.f10091b = i4;
        this.f10092c = i5;
        this.f10093d = getNextMatch;
    }

    @Override // p077d3.InterfaceC2457d
    @NotNull
    public Iterator<C1034c> iterator() {
        return new a();
    }
}
