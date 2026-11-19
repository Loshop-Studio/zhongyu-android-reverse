package androidx.compose.material3.carousel;

import androidx.compose.p013ui.util.MathHelpersKt;
import java.util.ArrayList;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
public final class KeylineListKt {
    public static final KeylineList emptyKeylineList() {
        return KeylineList.Companion.getEmpty();
    }

    public static final KeylineList keylineListOf(float f10, float f11, int i10, float f12, InterfaceC10570l interfaceC10570l) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        interfaceC10570l.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.createWithPivot(f10, f11, i10, f12);
    }

    /* renamed from: keylineListOf-WNYm7Xg, reason: not valid java name */
    public static final KeylineList m22896keylineListOfWNYm7Xg(float f10, float f11, int i10, InterfaceC10570l interfaceC10570l) {
        KeylineListScopeImpl keylineListScopeImpl = new KeylineListScopeImpl();
        interfaceC10570l.invoke(keylineListScopeImpl);
        return keylineListScopeImpl.m22897createWithAlignmentwaks0t8(f10, f11, i10);
    }

    public static final Keyline lerp(Keyline keyline, Keyline keyline2, float f10) {
        return new Keyline(MathHelpersKt.lerp(keyline.getSize(), keyline2.getSize(), f10), MathHelpersKt.lerp(keyline.getOffset(), keyline2.getOffset(), f10), MathHelpersKt.lerp(keyline.getUnadjustedOffset(), keyline2.getUnadjustedOffset(), f10), f10 < 0.5f ? keyline.isFocal() : keyline2.isFocal(), f10 < 0.5f ? keyline.isAnchor() : keyline2.isAnchor(), f10 < 0.5f ? keyline.isPivot() : keyline2.isPivot(), MathHelpersKt.lerp(keyline.getCutoff(), keyline2.getCutoff(), f10));
    }

    public static final KeylineList lerp(KeylineList keylineList, KeylineList keylineList2, float f10) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(lerp(keylineList.get(i10), keylineList2.get(i10), f10));
        }
        return new KeylineList(arrayList);
    }
}
