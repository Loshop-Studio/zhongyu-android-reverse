package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8687z;
import p134i7.AbstractC8810v0;
import p134i7.AbstractC8812w0;

/* loaded from: classes3.dex */
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] tableIds, String[] tableNames) {
        AbstractC9133u.m16133g(observer, "observer");
        AbstractC9133u.m16133g(tableIds, "tableIds");
        AbstractC9133u.m16133g(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? AbstractC8810v0.m14784d(tableNames[0]) : AbstractC8812w0.m14788f();
    }

    public final InvalidationTracker.Observer getObserver$room_runtime_release() {
        return this.observer;
    }

    public final int[] getTableIds$room_runtime_release() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> invalidatedTablesIds) {
        Set<String> setM14788f;
        AbstractC9133u.m16133g(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i10 = 0;
            if (length != 1) {
                Set setM14782b = AbstractC8810v0.m14782b();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i11 = 0;
                while (i10 < length2) {
                    int i12 = i11 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                        setM14782b.add(this.tableNames[i11]);
                    }
                    i10++;
                    i11 = i12;
                }
                setM14788f = AbstractC8810v0.m14781a(setM14782b);
            } else {
                setM14788f = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : AbstractC8812w0.m14788f();
            }
        } else {
            setM14788f = AbstractC8812w0.m14788f();
        }
        if (setM14788f.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setM14788f);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> invalidatedTablesNames) {
        Set<String> setM14788f;
        AbstractC9133u.m16133g(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setM14788f = AbstractC8812w0.m14788f();
        } else if (length != 1) {
            Set setM14782b = AbstractC8810v0.m14782b();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length2) {
                        String str2 = strArr[i10];
                        if (AbstractC8687z.m14093A(str2, str, true)) {
                            setM14782b.add(str2);
                            break;
                        }
                        i10++;
                    }
                }
            }
            setM14788f = AbstractC8810v0.m14781a(setM14782b);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setM14788f = AbstractC8812w0.m14788f();
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC8687z.m14093A((String) it.next(), this.tableNames[0], true)) {
                        setM14788f = this.singleTableSet;
                        break;
                    }
                }
                setM14788f = AbstractC8812w0.m14788f();
            }
        }
        if (setM14788f.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setM14788f);
    }
}
