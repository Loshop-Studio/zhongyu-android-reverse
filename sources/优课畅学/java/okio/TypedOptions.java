package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import okio.Options;
import p134i7.AbstractC8773d;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;

/* loaded from: classes5.dex */
public final class TypedOptions<T> extends AbstractC8773d implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final List<T> list;
    private final Options options;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: of */
        public final <T> TypedOptions<T> m18128of(Iterable<? extends T> values, InterfaceC10570l encode) {
            AbstractC9133u.m16133g(values, "values");
            AbstractC9133u.m16133g(encode, "encode");
            List listM14544U0 = AbstractC8778f0.m14544U0(values);
            Options.Companion companion = Options.Companion;
            int size = listM14544U0.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i10 = 0; i10 < size; i10++) {
                byteStringArr[i10] = encode.invoke(listM14544U0.get(i10));
            }
            return new TypedOptions<>(listM14544U0, companion.m18126of(byteStringArr));
        }

        private Companion() {
        }
    }

    public TypedOptions(List<? extends T> list, Options options) {
        AbstractC9133u.m16133g(list, "list");
        AbstractC9133u.m16133g(options, "options");
        this.options = options;
        List<T> listM14544U0 = AbstractC8778f0.m14544U0(list);
        this.list = listM14544U0;
        if (listM14544U0.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* renamed from: of */
    public static final <T> TypedOptions<T> m18127of(Iterable<? extends T> iterable, InterfaceC10570l interfaceC10570l) {
        return Companion.m18128of(iterable, interfaceC10570l);
    }

    @Override // p134i7.AbstractC8773d, java.util.List
    public T get(int i10) {
        return this.list.get(i10);
    }

    public final List<T> getList$okio() {
        return this.list;
    }

    public final Options getOptions$okio() {
        return this.options;
    }

    @Override // p134i7.AbstractC8773d, p134i7.AbstractC8769b
    public int getSize() {
        return this.list.size();
    }
}
