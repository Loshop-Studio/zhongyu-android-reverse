package androidx.room.util;

import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001at\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004`\u00072\u0006\u0010\b\u001a\u00020\t2.\u0010\n\u001a*\u0012 \u0012\u001e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006j\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0004`\u0007\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u001aT\u0010\f\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\r2\u0006\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\r\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¨\u0006\u000e"}, m13558d2 = {"recursiveFetchHashMap", "", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "map", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "isRelationCollection", "", "fetchBlock", "Lkotlin/Function1;", "recursiveFetchArrayMap", "Landroidx/collection/ArrayMap;", "room-runtime_release"}, m13559k = 5, m13560mv = {2, 0, 0}, m13562xi = 48, m13563xs = "androidx/room/util/RelationUtil")
/* loaded from: classes3.dex */
final /* synthetic */ class RelationUtil__RelationUtil_androidKt {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchArrayMap(ArrayMap<K, V> map, boolean z9, Function1<? super ArrayMap<K, V>, Unit> fetchBlock) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        ArrayMap arrayMap = new ArrayMap(999);
        int size = map.getSize();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (z9) {
                arrayMap.put(map.keyAt(i10), map.valueAt(i10));
            } else {
                arrayMap.put(map.keyAt(i10), null);
            }
            i10++;
            i11++;
            if (i11 == 999) {
                fetchBlock.invoke(arrayMap);
                if (!z9) {
                    map.putAll((Map) arrayMap);
                }
                arrayMap.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            fetchBlock.invoke(arrayMap);
            if (z9) {
                return;
            }
            map.putAll((Map) arrayMap);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final <K, V> void recursiveFetchHashMap(HashMap<K, V> map, boolean z9, Function1<? super HashMap<K, V>, Unit> fetchBlock) {
        int i10;
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(fetchBlock, "fetchBlock");
        HashMap map2 = new HashMap(999);
        loop0: while (true) {
            i10 = 0;
            for (K k10 : map.keySet()) {
                Intrinsics.checkNotNullExpressionValue(k10, "next(...)");
                if (z9) {
                    map2.put(k10, map.get(k10));
                } else {
                    map2.put(k10, null);
                }
                i10++;
                if (i10 == 999) {
                    fetchBlock.invoke(map2);
                    if (!z9) {
                        map.putAll(map2);
                    }
                    map2.clear();
                }
            }
            break loop0;
        }
        if (i10 > 0) {
            fetchBlock.invoke(map2);
            if (z9) {
                return;
            }
            map.putAll(map2);
        }
    }
}
