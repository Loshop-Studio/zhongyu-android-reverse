package kotlin.random;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC9972n;
import p439zc.AbstractC12038b;

/* loaded from: classes6.dex */
public abstract class Random {

    /* renamed from: c */
    public static final Default f23431c = new Default(null);

    /* renamed from: d */
    public static final Random f23432d = AbstractC12038b.f28412a.mo2739b();

    public static final class Default extends Random implements Serializable {

        public static final class Serialized implements Serializable {

            /* renamed from: c */
            public static final Serialized f23433c = new Serialized();

            private Serialized() {
            }

            private final Object readResolve() {
                return Random.f23431c;
            }
        }

        public /* synthetic */ Default(AbstractC9972n abstractC9972n) {
            this();
        }

        private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Deserialization is supported via proxy only");
        }

        private final Object writeReplace() {
            return Serialized.f23433c;
        }

        @Override // kotlin.random.Random
        /* renamed from: c */
        public float mo20333c() {
            return Random.f23432d.mo20333c();
        }

        @Override // kotlin.random.Random
        /* renamed from: d */
        public int mo20334d(int i10) {
            return Random.f23432d.mo20334d(i10);
        }

        private Default() {
        }
    }

    /* renamed from: c */
    public abstract float mo20333c();

    /* renamed from: d */
    public abstract int mo20334d(int i10);
}
