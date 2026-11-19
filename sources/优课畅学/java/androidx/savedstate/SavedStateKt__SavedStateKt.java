package androidx.savedstate;

import android.os.Bundle;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
final /* synthetic */ class SavedStateKt__SavedStateKt {
    public static final <T> T read(Bundle bundle, InterfaceC10570l block) {
        AbstractC9133u.m16133g(bundle, "<this>");
        AbstractC9133u.m16133g(block, "block");
        return (T) block.invoke(SavedStateReader.m27228boximpl(SavedStateReader.m27229constructorimpl(bundle)));
    }

    public static final <T> T write(Bundle bundle, InterfaceC10570l block) {
        AbstractC9133u.m16133g(bundle, "<this>");
        AbstractC9133u.m16133g(block, "block");
        return (T) block.invoke(SavedStateWriter.m27313boximpl(SavedStateWriter.m27315constructorimpl(bundle)));
    }
}
