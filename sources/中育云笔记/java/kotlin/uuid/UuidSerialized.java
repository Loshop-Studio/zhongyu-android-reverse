package kotlin.uuid;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
final class UuidSerialized implements Externalizable {

    /* renamed from: e */
    public static final C9988a f23470e = new C9988a(null);

    /* renamed from: c */
    public long f23471c;

    /* renamed from: d */
    public long f23472d;

    /* renamed from: kotlin.uuid.UuidSerialized$a */
    public static final class C9988a {
        public /* synthetic */ C9988a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9988a() {
        }
    }

    public UuidSerialized(long j10, long j11) {
        this.f23471c = j10;
        this.f23472d = j11;
    }

    private final Object readResolve() {
        return Uuid.f23466e.m20358a(this.f23471c, this.f23472d);
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) {
        AbstractC9979u.m20294g(input, "input");
        this.f23471c = input.readLong();
        this.f23472d = input.readLong();
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9979u.m20294g(output, "output");
        output.writeLong(this.f23471c);
        output.writeLong(this.f23472d);
    }
}
