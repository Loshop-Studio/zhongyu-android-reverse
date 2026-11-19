package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public class WrapperDataSource<Key, ValueFrom, ValueTo> extends DataSource<Key, ValueTo> {
    private final IdentityHashMap<ValueTo, Key> keyMap;
    private final Function<List<ValueFrom>, List<ValueTo>> listFunction;
    private final DataSource<Key, ValueFrom> source;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            try {
                iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapperDataSource(DataSource<Key, ValueFrom> source, Function<List<ValueFrom>, List<ValueTo>> listFunction) {
        super(source.getType$paging_common());
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = WhenMappings.$EnumSwitchMapping$0[source.getType$paging_common().ordinal()] == 1 ? new IdentityHashMap<>() : null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ <Key, ValueFrom, ValueTo> java.lang.Object load$suspendImpl(androidx.paging.WrapperDataSource<Key, ValueFrom, ValueTo> r4, androidx.paging.DataSource.Params<Key> r5, vc.InterfaceC11588c<? super androidx.paging.DataSource.BaseResult<ValueTo>> r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof androidx.paging.WrapperDataSource$load$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.WrapperDataSource$load$1 r0 = (androidx.paging.WrapperDataSource$load$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.WrapperDataSource$load$1 r0 = new androidx.paging.WrapperDataSource$load$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            androidx.paging.WrapperDataSource r4 = (androidx.paging.WrapperDataSource) r4
            kotlin.AbstractC9924b.m20071b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.paging.DataSource<Key, ValueFrom> r6 = r4.source
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r6 = r6.load$paging_common(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            androidx.paging.DataSource$BaseResult r6 = (androidx.paging.DataSource.BaseResult) r6
            androidx.paging.DataSource$BaseResult$Companion r5 = androidx.paging.DataSource.BaseResult.Companion
            androidx.arch.core.util.Function<java.util.List<ValueFrom>, java.util.List<ValueTo>> r0 = r4.listFunction
            androidx.paging.DataSource$BaseResult r5 = r5.convert$paging_common(r6, r0)
            java.util.List<Value> r6 = r6.data
            java.util.List<Value> r0 = r5.data
            r4.stashKeysIfNeeded(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.WrapperDataSource.load$suspendImpl(androidx.paging.WrapperDataSource, androidx.paging.DataSource$Params, vc.c):java.lang.Object");
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(ValueTo item) {
        Key key;
        AbstractC9979u.m20294g(item, "item");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap == null) {
            throw new IllegalStateException("Cannot get key by item in non-item keyed DataSource");
        }
        synchronized (identityHashMap) {
            key = this.keyMap.get(item);
            AbstractC9979u.m20291d(key);
        }
        return key;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.DataSource
    public Object load$paging_common(DataSource.Params<Key> params, InterfaceC11588c<? super DataSource.BaseResult<ValueTo>> interfaceC11588c) {
        return load$suspendImpl(this, params, interfaceC11588c);
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }

    public final void stashKeysIfNeeded(List<? extends ValueFrom> source, List<? extends ValueTo> dest) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(dest, "dest");
        IdentityHashMap<ValueTo, Key> identityHashMap = this.keyMap;
        if (identityHashMap != null) {
            synchronized (identityHashMap) {
                try {
                    int size = dest.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        IdentityHashMap<ValueTo, Key> identityHashMap2 = this.keyMap;
                        ValueTo valueto = dest.get(i10);
                        DataSource<Key, ValueFrom> dataSource = this.source;
                        AbstractC9979u.m20292e(dataSource, "null cannot be cast to non-null type androidx.paging.ItemKeyedDataSource<Key of androidx.paging.WrapperDataSource, ValueFrom of androidx.paging.WrapperDataSource>");
                        identityHashMap2.put(valueto, ((ItemKeyedDataSource) dataSource).getKey(source.get(i10)));
                    }
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
