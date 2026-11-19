package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9979u;
import p310qd.AbstractC10819z;
import p325rc.AbstractC10981x0;
import p325rc.AbstractC10983y0;

/* loaded from: classes3.dex */
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] tableIds, String[] tableNames) {
        AbstractC9979u.m20294g(observer, "observer");
        AbstractC9979u.m20294g(tableIds, "tableIds");
        AbstractC9979u.m20294g(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? AbstractC10981x0.m24158d(tableNames[0]) : AbstractC10983y0.m24160f();
    }

    public final InvalidationTracker.Observer getObserver$room_runtime_release() {
        return this.observer;
    }

    public final int[] getTableIds$room_runtime_release() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> invalidatedTablesIds) {
        Set<String> setM24160f;
        AbstractC9979u.m20294g(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setM24156b = AbstractC10981x0.m24156b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setM24156b.add(this.tableNames[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setM24160f = AbstractC10981x0.m24155a(setM24156b);
            } else {
                setM24160f = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : AbstractC10983y0.m24160f();
            }
        } else {
            setM24160f = AbstractC10983y0.m24160f();
        }
        if (setM24160f.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setM24160f);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> invalidatedTablesNames) {
        Set<String> setM24160f;
        AbstractC9979u.m20294g(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setM24160f = AbstractC10983y0.m24160f();
        } else if (length != 1) {
            Set setM24156b = AbstractC10981x0.m24156b();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        String str2 = strArr[i10];
                        if (AbstractC10819z.m23230C(str2, str, true)) {
                            setM24156b.add(str2);
                            break;
                        }
                        i10++;
                    }
                }
            }
            setM24160f = AbstractC10981x0.m24155a(setM24156b);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setM24160f = AbstractC10983y0.m24160f();
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC10819z.m23230C((String) it.next(), this.tableNames[0], true)) {
                        setM24160f = this.singleTableSet;
                        break;
                    }
                }
                setM24160f = AbstractC10983y0.m24160f();
            }
        }
        if (setM24160f.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setM24160f);
    }
}
