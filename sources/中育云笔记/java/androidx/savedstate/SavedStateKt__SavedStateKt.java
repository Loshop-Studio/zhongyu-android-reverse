package androidx.savedstate;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    public static final <T> T read(Bundle bundle, InterfaceC9540l block) {
        AbstractC9979u.m20294g(bundle, "<this>");
        AbstractC9979u.m20294g(block, "block");
        return (T) block.invoke(SavedStateReader.m33823boximpl(SavedStateReader.m33824constructorimpl(bundle)));
    }

    public static final <T> T write(Bundle bundle, InterfaceC9540l block) {
        AbstractC9979u.m20294g(bundle, "<this>");
        AbstractC9979u.m20294g(block, "block");
        return (T) block.invoke(SavedStateWriter.m33908boximpl(SavedStateWriter.m33910constructorimpl(bundle)));
    }
}
