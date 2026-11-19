package p087f3;

import java.io.Closeable;
import kotlin.jvm.internal.AbstractC2770m;
import kotlin.jvm.internal.C2764g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142q2.AbstractC3010b;
import p142q2.InterfaceC3015g;
import p171x2.InterfaceC3470l;

/* renamed from: f3.e1 */
/* loaded from: classes.dex */
public abstract class AbstractC2546e1 extends AbstractC2545e0 implements Closeable {

    /* renamed from: b */
    @NotNull
    public static final a f10238b = new a(null);

    /* renamed from: f3.e1$a */
    public static final class a extends AbstractC3010b<AbstractC2545e0, AbstractC2546e1> {

        /* renamed from: f3.e1$a$a, reason: collision with other inner class name */
        static final class C3536a extends AbstractC2770m implements InterfaceC3470l<InterfaceC3015g.b, AbstractC2546e1> {

            /* renamed from: a */
            public static final C3536a f10239a = new C3536a();

            C3536a() {
                super(1);
            }

            @Override // p171x2.InterfaceC3470l
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC2546e1 invoke(@NotNull InterfaceC3015g.b bVar) {
                if (bVar instanceof AbstractC2546e1) {
                    return (AbstractC2546e1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(AbstractC2545e0.f10236a, C3536a.f10239a);
        }

        public /* synthetic */ a(C2764g c2764g) {
            this();
        }
    }
}
