package androidx.compose.p014ui.unit;

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
        public static float m33618toDpGaN1DYA(FontScalingLinear fontScalingLinear, long j10) {
            return FontScalingLinear.super.m33616toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m33619toSp0xMU5do(FontScalingLinear fontScalingLinear, float f10) {
            return FontScalingLinear.super.m33617toSp0xMU5do(f10);
        }
    }

    float getFontScale();

    @Stable
    /* renamed from: toDp-GaN1DYA, reason: not valid java name */
    default float m33616toDpGaN1DYA(long j10) {
        if (TextUnitType.m33723equalsimpl0(TextUnit.m33694getTypeUIouoOA(j10), TextUnitType.Companion.m33728getSpUIouoOA())) {
            return C3186Dp.m33501constructorimpl(TextUnit.m33695getValueimpl(j10) * getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Stable
    /* renamed from: toSp-0xMU5do, reason: not valid java name */
    default long m33617toSp0xMU5do(float f10) {
        return TextUnitKt.getSp(f10 / getFontScale());
    }
}
