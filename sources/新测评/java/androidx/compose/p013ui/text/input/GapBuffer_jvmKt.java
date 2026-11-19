package androidx.compose.p013ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000¨\u0006\t"}, m13558d2 = {"toCharArray", "", "", "destination", "", "destinationOffset", "", "startIndex", "endIndex", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class GapBuffer_jvmKt {
    public static final void toCharArray(String str, char[] cArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        str.getChars(i11, i12, cArr, i10);
    }
}
