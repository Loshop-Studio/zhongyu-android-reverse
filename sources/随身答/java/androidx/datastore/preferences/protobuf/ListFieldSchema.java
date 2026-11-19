package androidx.datastore.preferences.protobuf;

import java.util.List;

@CheckReturnValue
/* loaded from: classes3.dex */
interface ListFieldSchema {
    void makeImmutableListAt(Object obj, long j9);

    <L> void mergeListsAt(Object obj, Object obj2, long j9);

    <L> List<L> mutableListAt(Object obj, long j9);
}
