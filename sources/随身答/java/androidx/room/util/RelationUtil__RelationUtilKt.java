package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001aT\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006\u0012\u0004\u0012\u00020\u00010\nH\u0007\u001a>\u0010\u000b\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00040\f2\u0006\u0010\u0007\u001a\u00020\b2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\f\u0012\u0004\u0012\u00020\u00010\nH\u0007\"\u000e\u0010\r\u001a\u00020\u000eX\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m13413d2 = {"recursiveFetchMap", "", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "", "isRelationCollection", "", "fetchBlock", "Lkotlin/Function1;", "recursiveFetchLongSparseArray", "Landroidx/collection/LongSparseArray;", "MAX_BIND_PARAMETER_CNT", "", "room-runtime_release"}, m13414k = 5, m13415mv = {2, 0, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE, m13418xs = "androidx/room/util/RelationUtil")
/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtilKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <V> void recursiveFetchLongSparseArray(LongSparseArray<V> map, boolean z9, Function1<? super LongSparseArray<V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        LongSparseArray<? extends V> longSparseArray = new LongSparseArray<>(999);
        int size = map.size();
        int i9 = 0;
        int i10 = 0;
        while (i9 < size) {
            if (z9) {
                longSparseArray.put(map.keyAt(i9), map.valueAt(i9));
            } else {
                longSparseArray.put(map.keyAt(i9), null);
            }
            i9++;
            i10++;
            if (i10 == 999) {
                fetchBlock.invoke(longSparseArray);
                if (!z9) {
                    map.putAll(longSparseArray);
                }
                longSparseArray.clear();
                i10 = 0;
            }
        }
        if (i10 > 0) {
            fetchBlock.invoke(longSparseArray);
            if (z9) {
                return;
            }
            map.putAll(longSparseArray);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchMap(Map<K, V> map, boolean z9, Function1<? super Map<K, V>, Unit> fetchBlock) {
        int i9;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        loop0: while (true) {
            i9 = 0;
            for (K k9 : map.keySet()) {
                if (z9) {
                    linkedHashMap.put(k9, map.get(k9));
                } else {
                    linkedHashMap.put(k9, null);
                }
                i9++;
                if (i9 == 999) {
                    fetchBlock.invoke(linkedHashMap);
                    if (!z9) {
                        map.putAll(linkedHashMap);
                    }
                    linkedHashMap.clear();
                }
            }
            break loop0;
        }
        if (i9 > 0) {
            fetchBlock.invoke(linkedHashMap);
            if (z9) {
                return;
            }
            map.putAll(linkedHashMap);
        }
    }
}
