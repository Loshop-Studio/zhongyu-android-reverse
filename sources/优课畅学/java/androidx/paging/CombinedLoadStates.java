package androidx.paging;

import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class CombinedLoadStates {
    private final LoadState append;
    private final boolean hasError;
    private final boolean isIdle;
    private final LoadStates mediator;
    private final LoadState prepend;
    private final LoadState refresh;
    private final LoadStates source;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CombinedLoadStates(androidx.paging.LoadState r2, androidx.paging.LoadState r3, androidx.paging.LoadState r4, androidx.paging.LoadStates r5, androidx.paging.LoadStates r6) {
        /*
            r1 = this;
            java.lang.String r0 = "refresh"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r2, r0)
            java.lang.String r0 = "prepend"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r3, r0)
            java.lang.String r0 = "append"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r4, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r5, r0)
            r1.<init>()
            r1.refresh = r2
            r1.prepend = r3
            r1.append = r4
            r1.source = r5
            r1.mediator = r6
            boolean r2 = r5.isIdle()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r6 == 0) goto L30
            boolean r2 = r6.isIdle()
            goto L31
        L30:
            r2 = r4
        L31:
            if (r2 == 0) goto L35
            r2 = r4
            goto L36
        L35:
            r2 = r3
        L36:
            r1.isIdle = r2
            boolean r2 = r5.hasError()
            if (r2 != 0) goto L48
            if (r6 == 0) goto L45
            boolean r2 = r6.hasError()
            goto L46
        L45:
            r2 = r3
        L46:
            if (r2 == 0) goto L49
        L48:
            r3 = r4
        L49:
            r1.hasError = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.CombinedLoadStates.<init>(androidx.paging.LoadState, androidx.paging.LoadState, androidx.paging.LoadState, androidx.paging.LoadStates, androidx.paging.LoadStates):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedLoadStates.class != obj.getClass()) {
            return false;
        }
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) obj;
        return AbstractC9133u.m16128b(this.refresh, combinedLoadStates.refresh) && AbstractC9133u.m16128b(this.prepend, combinedLoadStates.prepend) && AbstractC9133u.m16128b(this.append, combinedLoadStates.append) && AbstractC9133u.m16128b(this.source, combinedLoadStates.source) && AbstractC9133u.m16128b(this.mediator, combinedLoadStates.mediator);
    }

    public final void forEach$paging_common_release(InterfaceC10575q op) {
        AbstractC9133u.m16133g(op, "op");
        LoadStates loadStates = this.source;
        LoadType loadType = LoadType.REFRESH;
        LoadState refresh = loadStates.getRefresh();
        Boolean bool = Boolean.FALSE;
        op.invoke(loadType, bool, refresh);
        LoadType loadType2 = LoadType.PREPEND;
        op.invoke(loadType2, bool, loadStates.getPrepend());
        LoadType loadType3 = LoadType.APPEND;
        op.invoke(loadType3, bool, loadStates.getAppend());
        LoadStates loadStates2 = this.mediator;
        if (loadStates2 != null) {
            LoadState refresh2 = loadStates2.getRefresh();
            Boolean bool2 = Boolean.TRUE;
            op.invoke(loadType, bool2, refresh2);
            op.invoke(loadType2, bool2, loadStates2.getPrepend());
            op.invoke(loadType3, bool2, loadStates2.getAppend());
        }
    }

    public final LoadState getAppend() {
        return this.append;
    }

    public final LoadStates getMediator() {
        return this.mediator;
    }

    public final LoadState getPrepend() {
        return this.prepend;
    }

    public final LoadState getRefresh() {
        return this.refresh;
    }

    public final LoadStates getSource() {
        return this.source;
    }

    public final boolean hasError() {
        return this.hasError;
    }

    public int hashCode() {
        int iHashCode = ((((((this.refresh.hashCode() * 31) + this.prepend.hashCode()) * 31) + this.append.hashCode()) * 31) + this.source.hashCode()) * 31;
        LoadStates loadStates = this.mediator;
        return iHashCode + (loadStates != null ? loadStates.hashCode() : 0);
    }

    public final boolean isIdle() {
        return this.isIdle;
    }

    public String toString() {
        return "CombinedLoadStates(refresh=" + this.refresh + ", prepend=" + this.prepend + ", append=" + this.append + ", source=" + this.source + ", mediator=" + this.mediator + ')';
    }

    public /* synthetic */ CombinedLoadStates(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadStates loadStates, LoadStates loadStates2, int i10, AbstractC9126n abstractC9126n) {
        this(loadState, loadState2, loadState3, loadStates, (i10 & 16) != 0 ? null : loadStates2);
    }
}
