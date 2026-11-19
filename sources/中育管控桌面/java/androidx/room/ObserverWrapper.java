package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(m7879d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011H\u0000¢\u0006\u0002\b\u0016J\u001b\u0010\u0017\u001a\u00020\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0011H\u0000¢\u0006\u0002\b\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m7880d2 = {"Landroidx/room/ObserverWrapper;", "", "observer", "Landroidx/room/InvalidationTracker$Observer;", "tableIds", "", "tableNames", "", "", "<init>", "(Landroidx/room/InvalidationTracker$Observer;[I[Ljava/lang/String;)V", "getObserver$room_runtime_release", "()Landroidx/room/InvalidationTracker$Observer;", "getTableIds$room_runtime_release", "()[I", "[Ljava/lang/String;", "singleTableSet", "", "notifyByTableIds", "", "invalidatedTablesIds", "", "notifyByTableIds$room_runtime_release", "notifyByTableNames", "invalidatedTablesNames", "notifyByTableNames$room_runtime_release", "room-runtime_release"}, m7881k = 1, m7882mv = {2, 0, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,592:1\n13497#2,3:593\n1755#3,3:596\n1863#3,2:599\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/ObserverWrapper\n*L\n532#1:593,3\n550#1:596,3\n558#1:599,2\n*E\n"})
/* loaded from: classes3.dex */
public final class ObserverWrapper {
    private final InvalidationTracker.Observer observer;
    private final Set<String> singleTableSet;
    private final int[] tableIds;
    private final String[] tableNames;

    public ObserverWrapper(InvalidationTracker.Observer observer, int[] tableIds, String[] tableNames) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.observer = observer;
        this.tableIds = tableIds;
        this.tableNames = tableNames;
        if (tableIds.length != tableNames.length) {
            throw new IllegalStateException("Check failed.");
        }
        this.singleTableSet = !(tableNames.length == 0) ? SetsKt.setOf(tableNames[0]) : SetsKt.emptySet();
    }

    /* renamed from: getObserver$room_runtime_release, reason: from getter */
    public final InvalidationTracker.Observer getObserver() {
        return this.observer;
    }

    /* renamed from: getTableIds$room_runtime_release, reason: from getter */
    public final int[] getTableIds() {
        return this.tableIds;
    }

    public final void notifyByTableIds$room_runtime_release(Set<Integer> invalidatedTablesIds) {
        Set<String> setEmptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
        int[] iArr = this.tableIds;
        int length = iArr.length;
        if (length != 0) {
            int i6 = 0;
            if (length != 1) {
                Set setCreateSetBuilder = SetsKt.createSetBuilder();
                int[] iArr2 = this.tableIds;
                int length2 = iArr2.length;
                int i7 = 0;
                while (i6 < length2) {
                    int i8 = i7 + 1;
                    if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i6]))) {
                        setCreateSetBuilder.add(this.tableNames[i7]);
                    }
                    i6++;
                    i7 = i8;
                }
                setEmptySet = SetsKt.build(setCreateSetBuilder);
            } else {
                setEmptySet = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.singleTableSet : SetsKt.emptySet();
            }
        } else {
            setEmptySet = SetsKt.emptySet();
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setEmptySet);
    }

    public final void notifyByTableNames$room_runtime_release(Set<String> invalidatedTablesNames) {
        Set<String> setEmptySet;
        Intrinsics.checkNotNullParameter(invalidatedTablesNames, "invalidatedTablesNames");
        int length = this.tableNames.length;
        if (length == 0) {
            setEmptySet = SetsKt.emptySet();
        } else if (length != 1) {
            Set setCreateSetBuilder = SetsKt.createSetBuilder();
            for (String str : invalidatedTablesNames) {
                String[] strArr = this.tableNames;
                int length2 = strArr.length;
                int i6 = 0;
                while (true) {
                    if (i6 < length2) {
                        String str2 = strArr[i6];
                        if (StringsKt.equals(str2, str, true)) {
                            setCreateSetBuilder.add(str2);
                            break;
                        }
                        i6++;
                    }
                }
            }
            setEmptySet = SetsKt.build(setCreateSetBuilder);
        } else {
            Set<String> set = invalidatedTablesNames;
            if ((set instanceof Collection) && set.isEmpty()) {
                setEmptySet = SetsKt.emptySet();
            } else {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    if (StringsKt.equals((String) it.next(), this.tableNames[0], true)) {
                        setEmptySet = this.singleTableSet;
                        break;
                    }
                }
                setEmptySet = SetsKt.emptySet();
            }
        }
        if (setEmptySet.isEmpty()) {
            return;
        }
        this.observer.onInvalidated(setEmptySet);
    }
}
