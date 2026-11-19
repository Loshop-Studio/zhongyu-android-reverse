package androidx.compose.p013ui.unit;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;

@Immutable
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public interface FontScalingLinear {

    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getFontScale$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m27016toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j10) {
            return FontScalingLinear.super.m27014toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m27017toSp0xMU5do(FontScalingLinear fontScalingLinear, float f10) {
            return FontScalingLinear.super.m27015toSp0xMU5do(f10);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m27014toDpGaN1DYA(long j10) {
        if (TextUnitType.m27121equalsimpl0(TextUnit.m27092getTypeUIouoOA(j10), TextUnitType.Companion.m27126getSpUIouoOA())) {
            return C3156Dp.m26899constructorimpl(TextUnit.m27093getValueimpl(j10) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Stable
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m27015toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }
}
