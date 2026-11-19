package com.google.protobuf;

import com.google.protobuf.Internal;
import java.util.List;

/* loaded from: classes5.dex */
final class ListFieldSchemaLite implements ListFieldSchema {
    public static <E> Internal.ProtobufList<E> getProtobufList(Object obj, long j10) {
        return (Internal.ProtobufList) UnsafeUtil.getObject(obj, j10);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public void makeImmutableListAt(Object obj, long j10) {
        getProtobufList(obj, j10).makeImmutable();
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j10);
        Internal.ProtobufList protobufList2 = getProtobufList(obj2, j10);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity2(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        UnsafeUtil.putObject(obj, j10, protobufList2);
    }

    @Override // com.google.protobuf.ListFieldSchema
    public <L> List<L> mutableListAt(Object obj, long j10) {
        Internal.ProtobufList protobufList = getProtobufList(obj, j10);
        if (protobufList.isModifiable()) {
            return protobufList;
        }
        int size = protobufList.size();
        Internal.ProtobufList protobufListMutableCopyWithCapacity2 = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
        UnsafeUtil.putObject(obj, j10, protobufListMutableCopyWithCapacity2);
        return protobufListMutableCopyWithCapacity2;
    }
}
