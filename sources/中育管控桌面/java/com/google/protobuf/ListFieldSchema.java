package com.google.protobuf;

import java.util.List;

@CheckReturnValue
/* loaded from: classes3.dex */
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j6);

    <L> void mergeListsAt(Object obj, Object obj2, long j6);

    <L> List<L> mutableListAt(Object obj, long j6);
}
