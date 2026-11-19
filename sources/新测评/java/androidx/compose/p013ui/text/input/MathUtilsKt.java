package androidx.compose.p013ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000\u001a0\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0080\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¨\u0006\u0006"}, m13558d2 = {"addExactOrElse", "", "right", "defaultValue", "Lkotlin/Function0;", "subtractExactOrElse", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public final class MathUtilsKt {
    public static final int addExactOrElse(int i10, int i11, Function0<Integer> function0) {
        int i12 = i10 + i11;
        return ((i10 ^ i12) & (i11 ^ i12)) < 0 ? function0.invoke().intValue() : i12;
    }

    public static final int subtractExactOrElse(int i10, int i11, Function0<Integer> function0) {
        int i12 = i10 - i11;
        return ((i10 ^ i12) & (i11 ^ i10)) < 0 ? function0.invoke().intValue() : i12;
    }
}
