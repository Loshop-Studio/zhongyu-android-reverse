package kotlin.collections.builders;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10981x0;

/* loaded from: classes6.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: e */
    public static final C9935a f23336e = new C9935a(null);

    /* renamed from: c */
    public Collection f23337c;

    /* renamed from: d */
    public final int f23338d;

    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    public static final class C9935a {
        public /* synthetic */ C9935a(AbstractC9972n abstractC9972n) {
            this();
        }

        public C9935a() {
        }
    }

    public SerializedCollection(Collection collection, int i10) {
        AbstractC9979u.m20294g(collection, "collection");
        this.f23337c = collection;
        this.f23338d = i10;
    }

    private final Object readResolve() {
        return this.f23337c;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        List listM24122a;
        AbstractC9979u.m20294g(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            List listM24125d = AbstractC10976v.m24125d(i11);
            while (i12 < i11) {
                listM24125d.add(input.readObject());
                i12++;
            }
            listM24122a = AbstractC10976v.m24122a(listM24125d);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setM24157c = AbstractC10981x0.m24157c(i11);
            while (i12 < i11) {
                setM24157c.add(input.readObject());
                i12++;
            }
            listM24122a = AbstractC10981x0.m24155a(setM24157c);
        }
        this.f23337c = listM24122a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9979u.m20294g(output, "output");
        output.writeByte(this.f23338d);
        output.writeInt(this.f23337c.size());
        Iterator it = this.f23337c.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
