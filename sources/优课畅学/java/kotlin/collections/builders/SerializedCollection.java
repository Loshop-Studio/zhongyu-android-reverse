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
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8810v0;

/* loaded from: classes5.dex */
public final class SerializedCollection implements Externalizable {

    /* renamed from: c */
    public static final C9090a f17423c = new C9090a(null);

    /* renamed from: a */
    public Collection f17424a;

    /* renamed from: b */
    public final int f17425b;

    /* renamed from: kotlin.collections.builders.SerializedCollection$a */
    public static final class C9090a {
        public /* synthetic */ C9090a(AbstractC9126n abstractC9126n) {
            this();
        }

        public C9090a() {
        }
    }

    public SerializedCollection(Collection collection, int i10) {
        AbstractC9133u.m16133g(collection, "collection");
        this.f17424a = collection;
        this.f17425b = i10;
    }

    private final Object readResolve() {
        return this.f17424a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput input) throws IOException {
        Set setM14751a;
        AbstractC9133u.m16133g(input, "input");
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
            List listM14754d = AbstractC8807u.m14754d(i11);
            while (i12 < i11) {
                listM14754d.add(input.readObject());
                i12++;
            }
            setM14751a = AbstractC8807u.m14751a(listM14754d);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            Set setM14783c = AbstractC8810v0.m14783c(i11);
            while (i12 < i11) {
                setM14783c.add(input.readObject());
                i12++;
            }
            setM14751a = AbstractC8810v0.m14781a(setM14783c);
        }
        this.f17424a = setM14751a;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput output) throws IOException {
        AbstractC9133u.m16133g(output, "output");
        output.writeByte(this.f17425b);
        output.writeInt(this.f17424a.size());
        Iterator it = this.f17424a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
