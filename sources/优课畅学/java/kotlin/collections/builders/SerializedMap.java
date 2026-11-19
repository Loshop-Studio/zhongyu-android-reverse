package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8798p0;

/* loaded from: classes5.dex */
final class SerializedMap implements Externalizable {

    /* renamed from: b */
    public static final C9091a f17426b = new C9091a(null);

    /* renamed from: a */
    public Map f17427a;

    /* renamed from: kotlin.collections.builders.SerializedMap$a */
    public static final class C9091a {
        public /* synthetic */ C9091a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9091a() {
        }
    }

    public SerializedMap(Map map) {
        AbstractC9133u.m16133g(map, "map");
        this.f17427a = map;
    }

    private final Object readResolve() {
        return this.f17427a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        AbstractC9133u.m16133g(input, "input");
        byte b10 = input.readByte();
        if (b10 != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10));
        }
        int i10 = input.readInt();
        if (i10 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i10 + '.');
        }
        Map mapM14662d = AbstractC8798p0.m14662d(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            mapM14662d.put(input.readObject(), input.readObject());
        }
        this.f17427a = AbstractC8798p0.m14660b(mapM14662d);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9133u.m16133g(output, "output");
        output.writeByte(0);
        output.writeInt(this.f17427a.size());
        for (Map.Entry entry : this.f17427a.entrySet()) {
            output.writeObject(entry.getKey());
            output.writeObject(entry.getValue());
        }
    }
}
