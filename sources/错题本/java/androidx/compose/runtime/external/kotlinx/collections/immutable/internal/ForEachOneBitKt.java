package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\b\u001a\u00020\u0006*\u00020\u000026\u0010\u0007\u001a2\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m5110d2 = {"", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "mask", "index", "Ld6/s;", "body", "forEachOneBit", "(ILr6/e;)V", "runtime_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ForEachOneBitKt {
    public static final void forEachOneBit(int i, @NotNull InterfaceC6473e interfaceC6473e) {
        int i8 = 0;
        while (i != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i);
            interfaceC6473e.invoke(Integer.valueOf(iLowestOneBit), Integer.valueOf(i8));
            i8++;
            i ^= iLowestOneBit;
        }
    }
}
