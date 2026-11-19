package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes5.dex */
final class UuidSerialized implements Externalizable {

    /* renamed from: c */
    public static final C9142a f17541c = new C9142a(null);

    /* renamed from: a */
    public long f17542a;

    /* renamed from: b */
    public long f17543b;

    /* renamed from: kotlin.uuid.UuidSerialized$a */
    public static final class C9142a {
        public /* synthetic */ C9142a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9142a() {
        }
    }

    public UuidSerialized(long j10, long j11) {
        this.f17542a = j10;
        this.f17543b = j11;
    }

    private final Object readResolve() {
        return Uuid.f17537c.m16198a(this.f17542a, this.f17543b);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        AbstractC9133u.m16133g(input, "input");
        this.f17542a = input.readLong();
        this.f17543b = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9133u.m16133g(output, "output");
        output.writeLong(this.f17542a);
        output.writeLong(this.f17543b);
    }
}
