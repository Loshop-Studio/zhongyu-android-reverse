package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9126n;
import p223q7.AbstractC9843b;

/* loaded from: classes5.dex */
public abstract class Random {

    /* renamed from: a */
    public static final Default f17502a = new Default(null);

    /* renamed from: b */
    public static final Random f17503b = AbstractC9843b.f19648a.mo18365b();

    public static final class Default extends Random implements Serializable {

        public static final class Serialized implements Serializable {

            /* renamed from: a */
            public static final Serialized f17504a = new Serialized();

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f17502a;
            }
        }

        public /* synthetic */ Default(AbstractC9126n abstractC9126n) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.f17504a;
        }

        @Override // kotlin.random.Random
        /* renamed from: b */
        public float mo2104b() {
            return Random.f17503b.mo2104b();
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public int mo2105c(int i10) {
            return Random.f17503b.mo2105c(i10);
        }

        private Default() {
        }
    }

    /* renamed from: b */
    public abstract float mo2104b();

    /* renamed from: c */
    public abstract int mo2105c(int i10);
}
