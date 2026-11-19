package androidx.paging;

import androidx.paging.PagedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p265nd.C10403h;

/* loaded from: classes3.dex */
public final class RecordingCallback extends PagedList.Callback {
    private static final int Changed = 0;
    public static final Companion Companion = new Companion(null);
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private final List<Integer> list = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public final void dispatchRecordingTo(PagedList.Callback other) {
        AbstractC9979u.m20294g(other, "other");
        C10403h c10403hM21767t = AbstractC10410o.m21767t(AbstractC10410o.m21768u(0, this.list.size()), 3);
        int iM21733b = c10403hM21767t.m21733b();
        int iM21734c = c10403hM21767t.m21734c();
        int iM21735d = c10403hM21767t.m21735d();
        if ((iM21735d > 0 && iM21733b <= iM21734c) || (iM21735d < 0 && iM21734c <= iM21733b)) {
            while (true) {
                int iIntValue = this.list.get(iM21733b).intValue();
                if (iIntValue == 0) {
                    other.onChanged(this.list.get(iM21733b + 1).intValue(), this.list.get(iM21733b + 2).intValue());
                } else if (iIntValue == 1) {
                    other.onInserted(this.list.get(iM21733b + 1).intValue(), this.list.get(iM21733b + 2).intValue());
                } else {
                    if (iIntValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    other.onRemoved(this.list.get(iM21733b + 1).intValue(), this.list.get(iM21733b + 2).intValue());
                }
                if (iM21733b == iM21734c) {
                    break;
                } else {
                    iM21733b += iM21735d;
                }
            }
        }
        this.list.clear();
    }

    @Override // androidx.paging.PagedList.Callback
    public void onChanged(int i10, int i11) {
        this.list.add(0);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.PagedList.Callback
    public void onInserted(int i10, int i11) {
        this.list.add(1);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }

    @Override // androidx.paging.PagedList.Callback
    public void onRemoved(int i10, int i11) {
        this.list.add(2);
        this.list.add(Integer.valueOf(i10));
        this.list.add(Integer.valueOf(i11));
    }
}
