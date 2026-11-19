package okio;

import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import okio.Options;
import p181hd.InterfaceC9540l;
import p325rc.AbstractC10940d;
import p325rc.AbstractC10947g0;

/* loaded from: classes6.dex */
public final class TypedOptions<T> extends AbstractC10940d implements RandomAccess {
    public static final Companion Companion = new Companion(null);
    private final List<T> list;
    private final Options options;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: of */
        public final <T> TypedOptions<T> m22190of(Iterable<? extends T> values, InterfaceC9540l encode) {
            AbstractC9979u.m20294g(values, "values");
            AbstractC9979u.m20294g(encode, "encode");
            List listM23922X0 = AbstractC10947g0.m23922X0(values);
            Options.Companion companion = Options.Companion;
            int size = listM23922X0.size();
            ByteString[] byteStringArr = new ByteString[size];
            for (int i10 = 0; i10 < size; i10++) {
                byteStringArr[i10] = encode.invoke(listM23922X0.get(i10));
            }
            return new TypedOptions<>(listM23922X0, companion.m22188of(byteStringArr));
        }

        private Companion() {
        }
    }

    public TypedOptions(List<? extends T> list, Options options) {
        AbstractC9979u.m20294g(list, "list");
        AbstractC9979u.m20294g(options, "options");
        this.options = options;
        List<T> listM23922X0 = AbstractC10947g0.m23922X0(list);
        this.list = listM23922X0;
        if (listM23922X0.size() != options.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* renamed from: of */
    public static final <T> TypedOptions<T> m22189of(Iterable<? extends T> iterable, InterfaceC9540l interfaceC9540l) {
        return Companion.m22190of(iterable, interfaceC9540l);
    }

    @Override // p325rc.AbstractC10940d, java.util.List
    public T get(int i10) {
        return this.list.get(i10);
    }

    public final List<T> getList$okio() {
        return this.list;
    }

    public final Options getOptions$okio() {
        return this.options;
    }

    @Override // p325rc.AbstractC10940d, p325rc.AbstractC10936b
    public int getSize() {
        return this.list.size();
    }
}
