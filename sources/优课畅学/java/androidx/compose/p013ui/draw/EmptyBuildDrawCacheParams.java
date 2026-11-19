package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.unit.Density;
import androidx.compose.p013ui.unit.DensityKt;
import androidx.compose.p013ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final long size = Size.Companion.m24112getUnspecifiedNHjbRc();
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private static final Density density = DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return density;
    }

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.p013ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo23886getSizeNHjbRc() {
        return size;
    }
}
