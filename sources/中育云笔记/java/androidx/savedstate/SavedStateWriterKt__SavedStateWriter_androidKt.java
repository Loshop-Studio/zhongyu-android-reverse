package androidx.savedstate;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateWriterKt__SavedStateWriter_androidKt {
    public static final <T> ArrayList<T> toArrayListUnsafe(Collection<?> collection) {
        AbstractC9979u.m20294g(collection, "<this>");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
