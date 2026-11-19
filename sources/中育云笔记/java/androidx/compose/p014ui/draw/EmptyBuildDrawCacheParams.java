package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.geometry.Size;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.DensityKt;
import androidx.compose.p014ui.unit.LayoutDirection;

/* loaded from: classes2.dex */
final class EmptyBuildDrawCacheParams implements BuildDrawCacheParams {
    public static final EmptyBuildDrawCacheParams INSTANCE = new EmptyBuildDrawCacheParams();
    private static final long size = Size.Companion.m30714getUnspecifiedNHjbRc();
    private static final LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private static final Density density = DensityKt.Density(1.0f, 1.0f);

    private EmptyBuildDrawCacheParams() {
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return density;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return layoutDirection;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo30488getSizeNHjbRc() {
        return size;
    }
}
