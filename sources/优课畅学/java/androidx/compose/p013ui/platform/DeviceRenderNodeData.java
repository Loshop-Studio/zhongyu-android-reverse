package androidx.compose.p013ui.platform;

import androidx.compose.p013ui.graphics.CompositingStrategy;
import androidx.compose.p013ui.graphics.RenderEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DeviceRenderNodeData {
    public static final int $stable = 8;
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private int compositingStrategy;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;

    /* renamed from: top, reason: collision with root package name */
    private final int f21450top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public /* synthetic */ DeviceRenderNodeData(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, RenderEffect renderEffect, int i18, AbstractC9126n abstractC9126n) {
        this(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, renderEffect, i18);
    }

    /* renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m26050copyfuCbV5c$default(DeviceRenderNodeData deviceRenderNodeData, long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, RenderEffect renderEffect, int i18, int i19, Object obj) {
        int i20;
        RenderEffect renderEffect2;
        long j11 = (i19 & 1) != 0 ? deviceRenderNodeData.uniqueId : j10;
        int i21 = (i19 & 2) != 0 ? deviceRenderNodeData.left : i10;
        int i22 = (i19 & 4) != 0 ? deviceRenderNodeData.f21450top : i11;
        int i23 = (i19 & 8) != 0 ? deviceRenderNodeData.right : i12;
        int i24 = (i19 & 16) != 0 ? deviceRenderNodeData.bottom : i13;
        int i25 = (i19 & 32) != 0 ? deviceRenderNodeData.width : i14;
        int i26 = (i19 & 64) != 0 ? deviceRenderNodeData.height : i15;
        float f22 = (i19 & 128) != 0 ? deviceRenderNodeData.scaleX : f10;
        float f23 = (i19 & 256) != 0 ? deviceRenderNodeData.scaleY : f11;
        float f24 = (i19 & 512) != 0 ? deviceRenderNodeData.translationX : f12;
        float f25 = (i19 & 1024) != 0 ? deviceRenderNodeData.translationY : f13;
        float f26 = (i19 & 2048) != 0 ? deviceRenderNodeData.elevation : f14;
        int i27 = (i19 & 4096) != 0 ? deviceRenderNodeData.ambientShadowColor : i16;
        long j12 = j11;
        int i28 = (i19 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i17;
        float f27 = (i19 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f15;
        float f28 = (i19 & 32768) != 0 ? deviceRenderNodeData.rotationX : f16;
        float f29 = (i19 & 65536) != 0 ? deviceRenderNodeData.rotationY : f17;
        float f30 = (i19 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f18;
        float f31 = (i19 & 262144) != 0 ? deviceRenderNodeData.pivotX : f19;
        float f32 = (i19 & 524288) != 0 ? deviceRenderNodeData.pivotY : f20;
        boolean z12 = (i19 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z10;
        boolean z13 = (i19 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z11;
        float f33 = (i19 & 4194304) != 0 ? deviceRenderNodeData.alpha : f21;
        RenderEffect renderEffect3 = (i19 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        if ((i19 & 16777216) != 0) {
            renderEffect2 = renderEffect3;
            i20 = deviceRenderNodeData.compositingStrategy;
        } else {
            i20 = i18;
            renderEffect2 = renderEffect3;
        }
        return deviceRenderNodeData.m26052copyfuCbV5c(j12, i21, i22, i23, i24, i25, i26, f22, f23, f24, f25, f26, i27, i28, f27, f28, f29, f30, f31, f32, z12, z13, f33, renderEffect2, i20);
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    public final RenderEffect component24() {
        return this.renderEffect;
    }

    /* renamed from: component25--NrFUSI, reason: not valid java name */
    public final int m26051component25NrFUSI() {
        return this.compositingStrategy;
    }

    public final int component3() {
        return this.f21450top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    /* renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m26052copyfuCbV5c(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, RenderEffect renderEffect, int i18) {
        return new DeviceRenderNodeData(j10, i10, i11, i12, i13, i14, i15, f10, f11, f12, f13, f14, i16, i17, f15, f16, f17, f18, f19, f20, z10, z11, f21, renderEffect, i18, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.f21450top == deviceRenderNodeData.f21450top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && AbstractC9133u.m16128b(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m24360equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: getCompositingStrategy--NrFUSI, reason: not valid java name */
    public final int m26053getCompositingStrategyNrFUSI() {
        return this.compositingStrategy;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.f21450top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.f21450top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31) + Boolean.hashCode(this.clipToOutline)) * 31) + Boolean.hashCode(this.clipToBounds)) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        return ((iHashCode + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31) + CompositingStrategy.m24361hashCodeimpl(this.compositingStrategy);
    }

    public final void setAlpha(float f10) {
        this.alpha = f10;
    }

    public final void setAmbientShadowColor(int i10) {
        this.ambientShadowColor = i10;
    }

    public final void setCameraDistance(float f10) {
        this.cameraDistance = f10;
    }

    public final void setClipToBounds(boolean z10) {
        this.clipToBounds = z10;
    }

    public final void setClipToOutline(boolean z10) {
        this.clipToOutline = z10;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m26054setCompositingStrategyaDBOjCE(int i10) {
        this.compositingStrategy = i10;
    }

    public final void setElevation(float f10) {
        this.elevation = f10;
    }

    public final void setPivotX(float f10) {
        this.pivotX = f10;
    }

    public final void setPivotY(float f10) {
        this.pivotY = f10;
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f10) {
        this.rotationX = f10;
    }

    public final void setRotationY(float f10) {
        this.rotationY = f10;
    }

    public final void setRotationZ(float f10) {
        this.rotationZ = f10;
    }

    public final void setScaleX(float f10) {
        this.scaleX = f10;
    }

    public final void setScaleY(float f10) {
        this.scaleY = f10;
    }

    public final void setSpotShadowColor(int i10) {
        this.spotShadowColor = i10;
    }

    public final void setTranslationX(float f10) {
        this.translationX = f10;
    }

    public final void setTranslationY(float f10) {
        this.translationY = f10;
    }

    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.f21450top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m24362toStringimpl(this.compositingStrategy)) + ')';
    }

    private DeviceRenderNodeData(long j10, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11, float f12, float f13, float f14, int i16, int i17, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, boolean z11, float f21, RenderEffect renderEffect, int i18) {
        this.uniqueId = j10;
        this.left = i10;
        this.f21450top = i11;
        this.right = i12;
        this.bottom = i13;
        this.width = i14;
        this.height = i15;
        this.scaleX = f10;
        this.scaleY = f11;
        this.translationX = f12;
        this.translationY = f13;
        this.elevation = f14;
        this.ambientShadowColor = i16;
        this.spotShadowColor = i17;
        this.rotationZ = f15;
        this.rotationX = f16;
        this.rotationY = f17;
        this.cameraDistance = f18;
        this.pivotX = f19;
        this.pivotY = f20;
        this.clipToOutline = z10;
        this.clipToBounds = z11;
        this.alpha = f21;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i18;
    }
}
