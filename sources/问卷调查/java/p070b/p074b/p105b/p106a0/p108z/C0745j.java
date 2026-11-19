package p070b.p074b.p105b.p106a0.p108z;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p070b.p074b.p105b.AbstractC0783x;
import p070b.p074b.p105b.C0756b;
import p070b.p074b.p105b.C0781v;
import p070b.p074b.p105b.InterfaceC0707a;
import p070b.p074b.p105b.InterfaceC0763d;
import p070b.p074b.p105b.InterfaceC0784y;
import p070b.p074b.p105b.p106a0.C0717g;
import p070b.p074b.p105b.p106a0.C0725o;
import p070b.p074b.p105b.p106a0.InterfaceC0730t;
import p070b.p074b.p105b.p106a0.p107a0.AbstractC0710b;
import p070b.p074b.p105b.p111c0.C0759a;
import p070b.p074b.p105b.p111c0.C0761c;
import p070b.p074b.p105b.p111c0.EnumC0760b;

/* renamed from: b.b.b.a0.z.j */
/* loaded from: classes.dex */
public final class C0745j implements InterfaceC0784y {

    /* renamed from: b */
    public final C0717g f4295b;

    /* renamed from: c */
    public final InterfaceC0763d f4296c;

    /* renamed from: d */
    public final C0725o f4297d;

    /* renamed from: e */
    public final C0739d f4298e;

    /* renamed from: f */
    public final AbstractC0710b f4299f = AbstractC0710b.f4208a;

    /* renamed from: b.b.b.a0.z.j$a */
    public static final class a<T> extends AbstractC0783x<T> {

        /* renamed from: a */
        public final InterfaceC0730t<T> f4300a;

        /* renamed from: b */
        public final Map<String, b> f4301b;

        public a(InterfaceC0730t<T> interfaceC0730t, Map<String, b> map) {
            this.f4300a = interfaceC0730t;
            this.f4301b = map;
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: a */
        public T mo2370a(C0759a c0759a) throws IOException {
            if (c0759a.mo2403v() == EnumC0760b.NULL) {
                c0759a.mo2401r();
                return null;
            }
            T tMo2365a = this.f4300a.mo2365a();
            try {
                c0759a.mo2391b();
                while (c0759a.mo2395i()) {
                    b bVar = this.f4301b.get(c0759a.mo2400p());
                    if (bVar == null || !bVar.f4304c) {
                        c0759a.mo2385A();
                    } else {
                        bVar.mo2417a(c0759a, tMo2365a);
                    }
                }
                c0759a.mo2393f();
                return tMo2365a;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (IllegalStateException e3) {
                throw new C0781v(e3);
            }
        }

        @Override // p070b.p074b.p105b.AbstractC0783x
        /* renamed from: b */
        public void mo2371b(C0761c c0761c, T t) throws IOException {
            if (t == null) {
                c0761c.mo2409h();
                return;
            }
            c0761c.mo2405c();
            try {
                for (b bVar : this.f4301b.values()) {
                    if (bVar.mo2419c(t)) {
                        c0761c.mo2408g(bVar.f4302a);
                        bVar.mo2418b(c0761c, t);
                    }
                }
                c0761c.mo2407f();
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* renamed from: b.b.b.a0.z.j$b */
    public static abstract class b {

        /* renamed from: a */
        public final String f4302a;

        /* renamed from: b */
        public final boolean f4303b;

        /* renamed from: c */
        public final boolean f4304c;

        public b(String str, boolean z, boolean z2) {
            this.f4302a = str;
            this.f4303b = z;
            this.f4304c = z2;
        }

        /* renamed from: a */
        public abstract void mo2417a(C0759a c0759a, Object obj);

        /* renamed from: b */
        public abstract void mo2418b(C0761c c0761c, Object obj);

        /* renamed from: c */
        public abstract boolean mo2419c(Object obj);
    }

    public C0745j(C0717g c0717g, InterfaceC0763d interfaceC0763d, C0725o c0725o, C0739d c0739d) {
        this.f4295b = c0717g;
        this.f4296c = interfaceC0763d;
        this.f4297d = c0725o;
        this.f4298e = c0739d;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    @Override // p070b.p074b.p105b.InterfaceC0784y
    /* renamed from: a */
    public <T> p070b.p074b.p105b.AbstractC0783x<T> mo2367a(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    /* renamed from: b */
    public boolean m2420b(Field field, boolean z) {
        boolean z2;
        C0725o c0725o = this.f4297d;
        Class<?> type = field.getType();
        if (c0725o.m2369c(type) || c0725o.m2368b(type, z)) {
            return false;
        }
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || c0725o.m2369c(field.getType())) {
            z2 = true;
            break;
        }
        List<InterfaceC0707a> list = z ? c0725o.f4224b : c0725o.f4225c;
        if (!list.isEmpty()) {
            C0756b c0756b = new C0756b(field);
            Iterator<InterfaceC0707a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().m2354b(c0756b)) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return !z2;
    }
}
