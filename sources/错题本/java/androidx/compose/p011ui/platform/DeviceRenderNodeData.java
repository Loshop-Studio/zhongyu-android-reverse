package androidx.compose.p011ui.platform;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.graphics.CompositingStrategy;
import androidx.compose.p011ui.graphics.RenderEffect;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b;\b\u0080\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b'\u0010&J\u0010\u0010(\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b(\u0010&J\u0010\u0010)\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b)\u0010&J\u0010\u0010*\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b+\u0010&J\u0010\u0010,\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b2\u0010&J\u0010\u00103\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b<\u0010;J\u0010\u0010=\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b=\u0010-J\u0012\u0010>\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0016\u0010A\u001a\u00020\u001fHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010&J\u008f\u0002\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u000b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001fHÆ\u0001ø\u0001\u0001¢\u0006\u0004\bB\u0010CJ\u0010\u0010F\u001a\u00020EHÖ\u0001¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bH\u0010&J\u001a\u0010J\u001a\u00020\u00192\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bJ\u0010KR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010L\u001a\u0004\bM\u0010$R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010N\u001a\u0004\bO\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010N\u001a\u0004\bP\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010N\u001a\u0004\bQ\u0010&R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010N\u001a\u0004\bR\u0010&R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010N\u001a\u0004\bS\u0010&R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010N\u001a\u0004\bT\u0010&R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010U\u001a\u0004\bV\u0010-\"\u0004\bW\u0010XR\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010U\u001a\u0004\bY\u0010-\"\u0004\bZ\u0010XR\"\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010U\u001a\u0004\b[\u0010-\"\u0004\b\\\u0010XR\"\u0010\u000f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010U\u001a\u0004\b]\u0010-\"\u0004\b^\u0010XR\"\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010U\u001a\u0004\b_\u0010-\"\u0004\b`\u0010XR\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010N\u001a\u0004\ba\u0010&\"\u0004\bb\u0010cR\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010N\u001a\u0004\bd\u0010&\"\u0004\be\u0010cR\"\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010U\u001a\u0004\bf\u0010-\"\u0004\bg\u0010XR\"\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010U\u001a\u0004\bh\u0010-\"\u0004\bi\u0010XR\"\u0010\u0015\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010U\u001a\u0004\bj\u0010-\"\u0004\bk\u0010XR\"\u0010\u0016\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010U\u001a\u0004\bl\u0010-\"\u0004\bm\u0010XR\"\u0010\u0017\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010U\u001a\u0004\bn\u0010-\"\u0004\bo\u0010XR\"\u0010\u0018\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010U\u001a\u0004\bp\u0010-\"\u0004\bq\u0010XR\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010r\u001a\u0004\bs\u0010;\"\u0004\bt\u0010uR\"\u0010\u001b\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010r\u001a\u0004\bv\u0010;\"\u0004\bw\u0010uR\"\u0010\u001c\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010U\u001a\u0004\bx\u0010-\"\u0004\by\u0010XR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010z\u001a\u0004\b{\u0010?\"\u0004\b|\u0010}R(\u0010 \u001a\u00020\u001f8\u0006@\u0006X\u0086\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0012\n\u0004\b \u0010N\u001a\u0004\b~\u0010&\"\u0004\b\u007f\u0010c\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0080\u0001"}, m5110d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "", "uniqueId", "", "left", "top", "right", "bottom", "width", "height", "", "scaleX", "scaleY", "translationX", "translationY", "elevation", "ambientShadowColor", "spotShadowColor", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "", "clipToOutline", "clipToBounds", "alpha", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;ILkotlin/jvm/internal/e;)V", "component1", "()J", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "()F", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "()Z", "component22", "component23", "component24", "()Landroidx/compose/ui/graphics/RenderEffect;", "component25--NrFUSI", "component25", "copy-fuCbV5c", "(JIIIIIIFFFFFIIFFFFFFZZFLandroidx/compose/ui/graphics/RenderEffect;I)Landroidx/compose/ui/platform/DeviceRenderNodeData;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getUniqueId", "I", "getLeft", "getTop", "getRight", "getBottom", "getWidth", "getHeight", "F", "getScaleX", "setScaleX", "(F)V", "getScaleY", "setScaleY", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getElevation", "setElevation", "getAmbientShadowColor", "setAmbientShadowColor", "(I)V", "getSpotShadowColor", "setSpotShadowColor", "getRotationZ", "setRotationZ", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getCameraDistance", "setCameraDistance", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "Z", "getClipToOutline", "setClipToOutline", "(Z)V", "getClipToBounds", "setClipToBounds", "getAlpha", "setAlpha", "Landroidx/compose/ui/graphics/RenderEffect;", "getRenderEffect", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "getCompositingStrategy--NrFUSI", "setCompositingStrategy-aDBOjCE", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final /* data */ class DeviceRenderNodeData {
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

    @Nullable
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public /* synthetic */ DeviceRenderNodeData(long j7, int i, int i8, int i9, int i10, int i11, int i12, float f, float f7, float f8, float f9, float f10, int i13, int i14, float f11, float f12, float f13, float f14, float f15, float f16, boolean z8, boolean z9, float f17, RenderEffect renderEffect, int i15, AbstractC5824e abstractC5824e) {
        this(j7, i, i8, i9, i10, i11, i12, f, f7, f8, f9, f10, i13, i14, f11, f12, f13, f14, f15, f16, z8, z9, f17, renderEffect, i15);
    }

    /* renamed from: copy-fuCbV5c$default, reason: not valid java name */
    public static /* synthetic */ DeviceRenderNodeData m12456copyfuCbV5c$default(DeviceRenderNodeData deviceRenderNodeData, long j7, int i, int i8, int i9, int i10, int i11, int i12, float f, float f7, float f8, float f9, float f10, int i13, int i14, float f11, float f12, float f13, float f14, float f15, float f16, boolean z8, boolean z9, float f17, RenderEffect renderEffect, int i15, int i16, Object obj) {
        int i17;
        RenderEffect renderEffect2;
        long j8 = (i16 & 1) != 0 ? deviceRenderNodeData.uniqueId : j7;
        int i18 = (i16 & 2) != 0 ? deviceRenderNodeData.left : i;
        int i19 = (i16 & 4) != 0 ? deviceRenderNodeData.top : i8;
        int i20 = (i16 & 8) != 0 ? deviceRenderNodeData.right : i9;
        int i21 = (i16 & 16) != 0 ? deviceRenderNodeData.bottom : i10;
        int i22 = (i16 & 32) != 0 ? deviceRenderNodeData.width : i11;
        int i23 = (i16 & 64) != 0 ? deviceRenderNodeData.height : i12;
        float f18 = (i16 & 128) != 0 ? deviceRenderNodeData.scaleX : f;
        float f19 = (i16 & 256) != 0 ? deviceRenderNodeData.scaleY : f7;
        float f20 = (i16 & 512) != 0 ? deviceRenderNodeData.translationX : f8;
        float f21 = (i16 & 1024) != 0 ? deviceRenderNodeData.translationY : f9;
        float f22 = (i16 & 2048) != 0 ? deviceRenderNodeData.elevation : f10;
        int i24 = (i16 & 4096) != 0 ? deviceRenderNodeData.ambientShadowColor : i13;
        long j9 = j8;
        int i25 = (i16 & 8192) != 0 ? deviceRenderNodeData.spotShadowColor : i14;
        float f23 = (i16 & 16384) != 0 ? deviceRenderNodeData.rotationZ : f11;
        float f24 = (i16 & 32768) != 0 ? deviceRenderNodeData.rotationX : f12;
        float f25 = (i16 & 65536) != 0 ? deviceRenderNodeData.rotationY : f13;
        float f26 = (i16 & 131072) != 0 ? deviceRenderNodeData.cameraDistance : f14;
        float f27 = (i16 & 262144) != 0 ? deviceRenderNodeData.pivotX : f15;
        float f28 = (i16 & 524288) != 0 ? deviceRenderNodeData.pivotY : f16;
        boolean z10 = (i16 & 1048576) != 0 ? deviceRenderNodeData.clipToOutline : z8;
        boolean z11 = (i16 & 2097152) != 0 ? deviceRenderNodeData.clipToBounds : z9;
        float f29 = (i16 & 4194304) != 0 ? deviceRenderNodeData.alpha : f17;
        RenderEffect renderEffect3 = (i16 & 8388608) != 0 ? deviceRenderNodeData.renderEffect : renderEffect;
        if ((i16 & 16777216) != 0) {
            renderEffect2 = renderEffect3;
            i17 = deviceRenderNodeData.compositingStrategy;
        } else {
            i17 = i15;
            renderEffect2 = renderEffect3;
        }
        return deviceRenderNodeData.m12458copyfuCbV5c(j9, i18, i19, i20, i21, i22, i23, f18, f19, f20, f21, f22, i24, i25, f23, f24, f25, f26, f27, f28, z10, z11, f29, renderEffect2, i17);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUniqueId() {
        return this.uniqueId;
    }

    /* renamed from: component10, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    /* renamed from: component11, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* renamed from: component12, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: component13, reason: from getter */
    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    /* renamed from: component14, reason: from getter */
    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* renamed from: component15, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* renamed from: component16, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* renamed from: component17, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    /* renamed from: component18, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* renamed from: component19, reason: from getter */
    public final float getPivotX() {
        return this.pivotX;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component20, reason: from getter */
    public final float getPivotY() {
        return this.pivotY;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    /* renamed from: component23, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* renamed from: component25--NrFUSI, reason: not valid java name and from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    /* renamed from: component5, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component8, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* renamed from: component9, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    @NotNull
    /* renamed from: copy-fuCbV5c, reason: not valid java name */
    public final DeviceRenderNodeData m12458copyfuCbV5c(long uniqueId, int left, int top2, int right, int bottom, int width, int height, float scaleX, float scaleY, float translationX, float translationY, float elevation, int ambientShadowColor, int spotShadowColor, float rotationZ, float rotationX, float rotationY, float cameraDistance, float pivotX, float pivotY, boolean clipToOutline, boolean clipToBounds, float alpha, @Nullable RenderEffect renderEffect, int compositingStrategy) {
        return new DeviceRenderNodeData(uniqueId, left, top2, right, bottom, width, height, scaleX, scaleY, translationX, translationY, elevation, ambientShadowColor, spotShadowColor, rotationZ, rotationX, rotationY, cameraDistance, pivotX, pivotY, clipToOutline, clipToBounds, alpha, renderEffect, compositingStrategy, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) other;
        return this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Float.compare(this.scaleX, deviceRenderNodeData.scaleX) == 0 && Float.compare(this.scaleY, deviceRenderNodeData.scaleY) == 0 && Float.compare(this.translationX, deviceRenderNodeData.translationX) == 0 && Float.compare(this.translationY, deviceRenderNodeData.translationY) == 0 && Float.compare(this.elevation, deviceRenderNodeData.elevation) == 0 && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Float.compare(this.rotationZ, deviceRenderNodeData.rotationZ) == 0 && Float.compare(this.rotationX, deviceRenderNodeData.rotationX) == 0 && Float.compare(this.rotationY, deviceRenderNodeData.rotationY) == 0 && Float.compare(this.cameraDistance, deviceRenderNodeData.cameraDistance) == 0 && Float.compare(this.pivotX, deviceRenderNodeData.pivotX) == 0 && Float.compare(this.pivotY, deviceRenderNodeData.pivotY) == 0 && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Float.compare(this.alpha, deviceRenderNodeData.alpha) == 0 && AbstractC5830k.m5325b(this.renderEffect, deviceRenderNodeData.renderEffect) && CompositingStrategy.m10766equalsimpl0(this.compositingStrategy, deviceRenderNodeData.compositingStrategy);
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
    public final int m12459getCompositingStrategyNrFUSI() {
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

    @Nullable
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
        return this.top;
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
        int iM901b = AbstractC0584a.m901b(this.alpha, AbstractC0584a.m908i(this.clipToBounds, AbstractC0584a.m908i(this.clipToOutline, AbstractC0584a.m901b(this.pivotY, AbstractC0584a.m901b(this.pivotX, AbstractC0584a.m901b(this.cameraDistance, AbstractC0584a.m901b(this.rotationY, AbstractC0584a.m901b(this.rotationX, AbstractC0584a.m901b(this.rotationZ, AbstractC0584a.m902c(this.spotShadowColor, AbstractC0584a.m902c(this.ambientShadowColor, AbstractC0584a.m901b(this.elevation, AbstractC0584a.m901b(this.translationY, AbstractC0584a.m901b(this.translationX, AbstractC0584a.m901b(this.scaleY, AbstractC0584a.m901b(this.scaleX, AbstractC0584a.m902c(this.height, AbstractC0584a.m902c(this.width, AbstractC0584a.m902c(this.bottom, AbstractC0584a.m902c(this.right, AbstractC0584a.m902c(this.top, AbstractC0584a.m902c(this.left, Long.hashCode(this.uniqueId) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        RenderEffect renderEffect = this.renderEffect;
        return CompositingStrategy.m10767hashCodeimpl(this.compositingStrategy) + ((iM901b + (renderEffect == null ? 0 : renderEffect.hashCode())) * 31);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z8) {
        this.clipToBounds = z8;
    }

    public final void setClipToOutline(boolean z8) {
        this.clipToOutline = z8;
    }

    /* renamed from: setCompositingStrategy-aDBOjCE, reason: not valid java name */
    public final void m12460setCompositingStrategyaDBOjCE(int i) {
        this.compositingStrategy = i;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ", compositingStrategy=" + ((Object) CompositingStrategy.m10768toStringimpl(this.compositingStrategy)) + ')';
    }

    private DeviceRenderNodeData(long j7, int i, int i8, int i9, int i10, int i11, int i12, float f, float f7, float f8, float f9, float f10, int i13, int i14, float f11, float f12, float f13, float f14, float f15, float f16, boolean z8, boolean z9, float f17, RenderEffect renderEffect, int i15) {
        this.uniqueId = j7;
        this.left = i;
        this.top = i8;
        this.right = i9;
        this.bottom = i10;
        this.width = i11;
        this.height = i12;
        this.scaleX = f;
        this.scaleY = f7;
        this.translationX = f8;
        this.translationY = f9;
        this.elevation = f10;
        this.ambientShadowColor = i13;
        this.spotShadowColor = i14;
        this.rotationZ = f11;
        this.rotationX = f12;
        this.rotationY = f13;
        this.cameraDistance = f14;
        this.pivotX = f15;
        this.pivotY = f16;
        this.clipToOutline = z8;
        this.clipToBounds = z9;
        this.alpha = f17;
        this.renderEffect = renderEffect;
        this.compositingStrategy = i15;
    }
}
