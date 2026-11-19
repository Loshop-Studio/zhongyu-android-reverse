package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@CheckReturnValue
/* loaded from: classes5.dex */
final class ListFieldSchemaFull implements ListFieldSchema {
    private static final Class<?> UNMODIFIABLE_LIST_CLASS = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* renamed from: a */
    public static final /* synthetic */ int f11150a = 0;

    public static <E> List<E> getList(Object obj, long j10) {
        return (List) UnsafeUtil.getObject(obj, j10);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) UnsafeUtil.getObject(obj, j10);
        if (list instanceof LazyStringList) {
            objUnmodifiableList = ((LazyStringList) list).getUnmodifiableView();
        } else {
            if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
                Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
                if (protobufList.isModifiable()) {
                    protobufList.makeImmutable();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        UnsafeUtil.putObject(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
        List list = getList(obj2, j10);
        List listMutableListAt = mutableListAt(obj, j10, list.size());
        int size = listMutableListAt.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listMutableListAt.addAll(list);
        }
        if (size > 0) {
            list = listMutableListAt;
        }
        UnsafeUtil.putObject(obj, j10, list);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j10) {
        return mutableListAt(obj, j10, 10);
    }

    private static <L> List<L> mutableListAt(Object obj, long j10, int i10) {
        List<L> list = getList(obj, j10);
        if (list.isEmpty()) {
            List<L> lazyStringArrayList = list instanceof LazyStringList ? new LazyStringArrayList(i10) : ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) ? ((Internal.ProtobufList) list).mutableCopyWithCapacity2(i10) : new ArrayList<>(i10);
            UnsafeUtil.putObject(obj, j10, lazyStringArrayList);
            return lazyStringArrayList;
        }
        if (UNMODIFIABLE_LIST_CLASS.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            UnsafeUtil.putObject(obj, j10, arrayList);
            return arrayList;
        }
        if (list instanceof UnmodifiableLazyStringList) {
            LazyStringArrayList lazyStringArrayList2 = new LazyStringArrayList(list.size() + i10);
            lazyStringArrayList2.addAll((UnmodifiableLazyStringList) list);
            UnsafeUtil.putObject(obj, j10, lazyStringArrayList2);
            return lazyStringArrayList2;
        }
        if ((list instanceof PrimitiveNonBoxingCollection) && (list instanceof Internal.ProtobufList)) {
            Internal.ProtobufList protobufList = (Internal.ProtobufList) list;
            if (!protobufList.isModifiable()) {
                Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(list.size() + i10);
                UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
                return protobufListMutableCopyWithCapacity2;
            }
        }
        return list;
    }
}
