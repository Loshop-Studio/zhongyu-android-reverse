package p082e3;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC2711a;
import kotlin.collections.C2730l;
import kotlin.collections.C2738t;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2769l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p014b3.C1034c;
import p077d3.C2463j;
import p171x2.InterfaceC3470l;

/* renamed from: e3.i */
/* loaded from: classes.dex */
final class C2483i implements InterfaceC2482h {

    /* renamed from: a */
    @NotNull
    private final Matcher f10102a;

    /* renamed from: b */
    @NotNull
    private final CharSequence f10103b;

    /* renamed from: c */
    @NotNull
    private final InterfaceC2481g f10104c;

    /* renamed from: e3.i$a */
    public static final class a extends AbstractC2711a<C2480f> implements InterfaceC2481g {

        /* renamed from: e3.i$a$a, reason: collision with other inner class name */
        static final class C3534a extends AbstractC2770m implements InterfaceC3470l<Integer, C2480f> {
            C3534a() {
                super(1);
            }

            @Nullable
            /* renamed from: a */
            public final C2480f m8276a(int i4) {
                return a.this.m8275b(i4);
            }

            @Override // p171x2.InterfaceC3470l
            public /* bridge */ /* synthetic */ C2480f invoke(Integer num) {
                return m8276a(num.intValue());
            }
        }

        a() {
        }

        /* renamed from: a */
        public /* bridge */ boolean m8274a(C2480f c2480f) {
            return super.contains(c2480f);
        }

        @Nullable
        /* renamed from: b */
        public C2480f m8275b(int i4) {
            C1034c c1034cM8284d = C2485k.m8284d(C2483i.this.m8273b(), i4);
            if (c1034cM8284d.m4810g().intValue() < 0) {
                return null;
            }
            String strGroup = C2483i.this.m8273b().group(i4);
            C2769l.m9240d(strGroup, "matchResult.group(index)");
            return new C2480f(strGroup, c1034cM8284d);
        }

        @Override // kotlin.collections.AbstractC2711a, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof C2480f) {
                return m8274a((C2480f) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractC2711a
        public int getSize() {
            return C2483i.this.m8273b().groupCount() + 1;
        }

        @Override // kotlin.collections.AbstractC2711a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.AbstractC2711a, java.util.Collection, java.lang.Iterable
        @NotNull
        public Iterator<C2480f> iterator() {
            return C2463j.m8217h(C2738t.m9167t(C2730l.m9140g(this)), new C3534a()).iterator();
        }
    }

    public C2483i(@NotNull Matcher matcher, @NotNull CharSequence input) {
        C2769l.m9241e(matcher, "matcher");
        C2769l.m9241e(input, "input");
        this.f10102a = matcher;
        this.f10103b = input;
        this.f10104c = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public final MatchResult m8273b() {
        return this.f10102a;
    }

    @Override // p082e3.InterfaceC2482h
    @NotNull
    public String getValue() {
        String strGroup = m8273b().group();
        C2769l.m9240d(strGroup, "matchResult.group()");
        return strGroup;
    }
}
