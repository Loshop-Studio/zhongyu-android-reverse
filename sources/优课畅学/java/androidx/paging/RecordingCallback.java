package androidx.paging;

import androidx.paging.PagedList;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p077d8.AbstractC8323h;
import p077d8.C8319d;

/* loaded from: classes3.dex */
public final class RecordingCallback extends PagedList.Callback {
    private static final int Changed = 0;
    public static final Companion Companion = new Companion(null);
    private static final int Inserted = 1;
    private static final int Removed = 2;
    private final List<Integer> list = new ArrayList();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public final void dispatchRecordingTo(PagedList.Callback other) {
        AbstractC9133u.m16133g(other, "other");
        C8319d c8319dM13524s = AbstractC8323h.m13524s(AbstractC8323h.m13525t(0, this.list.size()), 3);
        int iM13496b = c8319dM13524s.m13496b();
        int iM13497c = c8319dM13524s.m13497c();
        int iM13498d = c8319dM13524s.m13498d();
        if ((iM13498d > 0 && iM13496b <= iM13497c) || (iM13498d < 0 && iM13497c <= iM13496b)) {
            while (true) {
                int iIntValue = this.list.get(iM13496b).intValue();
                if (iIntValue == 0) {
                    other.onChanged(this.list.get(iM13496b + 1).intValue(), this.list.get(iM13496b + 2).intValue());
                } else if (iIntValue == 1) {
                    other.onInserted(this.list.get(iM13496b + 1).intValue(), this.list.get(iM13496b + 2).intValue());
                } else {
                    if (iIntValue != 2) {
                        throw new IllegalStateException("Unexpected recording value");
                    }
                    other.onRemoved(this.list.get(iM13496b + 1).intValue(), this.list.get(iM13496b + 2).intValue());
                }
                if (iM13496b == iM13497c) {
                    break;
                } else {
                    iM13496b += iM13498d;
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
