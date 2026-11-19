package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10967q0;

/* loaded from: classes6.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: d */
    public static final C9936a f23339d = new C9936a(null);

    /* renamed from: c */
    public Map f23340c;

    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    public static final class C9936a {
        public /* synthetic */ C9936a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9936a() {
        }
    }

    public SerializedMap(Map map) {
        AbstractC9979u.m20294g(map, "map");
        this.f23340c = map;
    }

    private final Object readResolve() {
        return this.f23340c;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        AbstractC9979u.m20294g(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapM24037d = AbstractC10967q0.m24037d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapM24037d.put(input.readObject(), input.readObject());
        }
        this.f23340c = AbstractC10967q0.m24035b(mapM24037d);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9979u.m20294g(output, "output");
        output.writeByte(0);
        output.writeInt(this.f23340c.size());
        for (Map.Entry entry : this.f23340c.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
