package p087f3;

import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import kotlinx.coroutines.internal.C2790e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.AbstractC3009a;
import p142q2.AbstractC3010b;
import p142q2.InterfaceC3012d;
import p142q2.InterfaceC3013e;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3470l;

/* renamed from: f3.e0 */
/* loaded from: classes.dex */
public abstract class AbstractC2545e0 extends AbstractC3009a implements InterfaceC3013e {

    /* renamed from: a */
    @NotNull
    public static final a f10236a = new a(null);

    /* renamed from: f3.e0$a */
    public static final class a extends AbstractC3010b<InterfaceC3013e, AbstractC2545e0> {

        /* renamed from: f3.e0$a$a, reason: collision with other inner class name */
        static final class C3535a extends AbstractC2770m implements InterfaceC3470l<InterfaceC3015g.b, AbstractC2545e0> {

            /* renamed from: a */
            public static final C3535a f10237a = new C3535a();

            C3535a() {
                super(1);
            }

            @Override // p171x2.InterfaceC3470l
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2545e0 invoke(@NotNull InterfaceC3015g.b bVar) {
                if (bVar instanceof AbstractC2545e0) {
                    return (AbstractC2545e0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(InterfaceC3013e.f11675R, C3535a.f10237a);
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }

    public AbstractC2545e0() {
        super(InterfaceC3013e.f11675R);
    }

    /* renamed from: J */
    public abstract void mo2905J(@NotNull InterfaceC3015g interfaceC3015g, @NotNull Runnable runnable);

    /* renamed from: K */
    public boolean mo2906K(@NotNull InterfaceC3015g interfaceC3015g) {
        return true;
    }

    @Override // p142q2.InterfaceC3013e
    @NotNull
    /* renamed from: d */
    public final <T> InterfaceC3012d<T> mo8548d(@NotNull InterfaceC3012d<? super T> interfaceC3012d) {
        return new C2790e(this, interfaceC3012d);
    }

    @Override // p142q2.AbstractC3009a, p142q2.InterfaceC3015g.b, p142q2.InterfaceC3015g
    @Nullable
    public <E extends InterfaceC3015g.b> E get(@NotNull InterfaceC3015g.c<E> cVar) {
        return (E) InterfaceC3013e.a.m10116a(this, cVar);
    }

    @Override // p142q2.AbstractC3009a, p142q2.InterfaceC3015g
    @NotNull
    public InterfaceC3015g minusKey(@NotNull InterfaceC3015g.c<?> cVar) {
        return InterfaceC3013e.a.m10117b(this, cVar);
    }

    @Override // p142q2.InterfaceC3013e
    /* renamed from: t */
    public final void mo8549t(@NotNull InterfaceC3012d<?> interfaceC3012d) {
        ((C2790e) interfaceC3012d).m9286n();
    }

    @NotNull
    public String toString() {
        return C2573l0.m8591a(this) + '@' + C2573l0.m8592b(this);
    }
}
