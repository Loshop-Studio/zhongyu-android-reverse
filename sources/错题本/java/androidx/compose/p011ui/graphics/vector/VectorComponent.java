package androidx.compose.p011ui.graphics.vector;

import androidx.autofill.HintConstants;
import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.ImageBitmap;
import androidx.compose.p011ui.graphics.ImageBitmapConfig;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000e\u001a\u00020\u0006*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u000e\u001a\u00020\u0006*\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0013\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R/\u00100\u001a\u0004\u0018\u00010\f2\b\u0010)\u001a\u0004\u0018\u00010\f8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R1\u00109\u001a\u0002032\u0006\u0010)\u001a\u0002038@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b4\u0010+\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001c\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010=R%\u0010A\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060?¢\u0006\u0002\b@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u001a\u0010F\u001a\u00020C8@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bD\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006G"}, m5110d2 = {"Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "root", "<init>", "(Landroidx/compose/ui/graphics/vector/GroupComponent;)V", "Ld6/s;", "doInvalidate", "()V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "alpha", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "draw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FLandroidx/compose/ui/graphics/ColorFilter;)V", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "getRoot", "()Landroidx/compose/ui/graphics/vector/GroupComponent;", HintConstants.AUTOFILL_HINT_NAME, "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "", "isDirty", "Z", "Landroidx/compose/ui/graphics/vector/DrawCache;", "cacheDrawScope", "Landroidx/compose/ui/graphics/vector/DrawCache;", "Lkotlin/Function0;", "invalidateCallback", "Lr6/a;", "getInvalidateCallback$ui_release", "()Lr6/a;", "setInvalidateCallback$ui_release", "(Lr6/a;)V", "<set-?>", "intrinsicColorFilter$delegate", "Landroidx/compose/runtime/MutableState;", "getIntrinsicColorFilter$ui_release", "()Landroidx/compose/ui/graphics/ColorFilter;", "setIntrinsicColorFilter$ui_release", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "intrinsicColorFilter", "tintFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/geometry/Size;", "viewportSize$delegate", "getViewportSize-NH-jbRc$ui_release", "()J", "setViewportSize-uvyYCjk$ui_release", "(J)V", "viewportSize", "previousDrawSize", "J", "rootScaleX", "F", "rootScaleY", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "drawVectorBlock", "Lr6/c;", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getCacheBitmapConfig-_sVssgQ$ui_release", "()I", "cacheBitmapConfig", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,642:1\n85#2:643\n113#2,2:644\n85#2:646\n113#2,2:647\n635#3:649\n57#4:650\n61#4:653\n57#4:656\n61#4:659\n57#4:663\n61#4:666\n60#5:651\n70#5:654\n60#5:657\n70#5:660\n80#5:662\n60#5:664\n70#5:667\n22#6:652\n22#6:655\n22#6:658\n22#6:665\n22#6:668\n30#7:661\n*S KotlinDebug\n*F\n+ 1 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorComponent\n*L\n121#1:643\n121#1:644,2\n127#1:646\n127#1:647,2\n142#1:649\n161#1:650\n162#1:653\n165#1:656\n165#1:659\n192#1:663\n193#1:666\n161#1:651\n162#1:654\n165#1:657\n165#1:660\n165#1:662\n192#1:664\n193#1:667\n161#1:652\n162#1:655\n165#1:658\n192#1:665\n193#1:668\n165#1:661\n*E\n"})
/* loaded from: classes.dex */
public final class VectorComponent extends VNode {
    public static final int $stable = 8;

    @NotNull
    private final DrawCache cacheDrawScope;

    @NotNull
    private final InterfaceC6471c drawVectorBlock;

    /* renamed from: intrinsicColorFilter$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState intrinsicColorFilter;

    @NotNull
    private InterfaceC6469a invalidateCallback;
    private boolean isDirty;

    @NotNull
    private String name;
    private long previousDrawSize;

    @NotNull
    private final GroupComponent root;
    private float rootScaleX;
    private float rootScaleY;

    @Nullable
    private ColorFilter tintFilter;

    /* renamed from: viewportSize$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState viewportSize;

    public VectorComponent(@NotNull GroupComponent groupComponent) {
        super(null);
        this.root = groupComponent;
        groupComponent.setInvalidateListener$ui_release(new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.vector.VectorComponent.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((VNode) obj);
                return C5443s.f8405a;
            }

            public final void invoke(VNode vNode) {
                VectorComponent.this.doInvalidate();
            }
        });
        this.name = "";
        this.isDirty = true;
        this.cacheDrawScope = new DrawCache();
        this.invalidateCallback = new InterfaceC6469a() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$invalidateCallback$1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11380invoke() {
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m11380invoke();
                return C5443s.f8405a;
            }
        };
        this.intrinsicColorFilter = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        Size.Companion companion = Size.INSTANCE;
        this.viewportSize = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Size.m10498boximpl(companion.m10519getZeroNHjbRc()), null, 2, null);
        this.previousDrawSize = companion.m10518getUnspecifiedNHjbRc();
        this.rootScaleX = 1.0f;
        this.rootScaleY = 1.0f;
        this.drawVectorBlock = new InterfaceC6471c() { // from class: androidx.compose.ui.graphics.vector.VectorComponent$drawVectorBlock$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DrawScope drawScope) {
                GroupComponent root = this.this$0.getRoot();
                VectorComponent vectorComponent = this.this$0;
                float f = vectorComponent.rootScaleX;
                float f7 = vectorComponent.rootScaleY;
                long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
                DrawContext drawContext = drawScope.getDrawContext();
                long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo11161scale0AR0LA0(f, f7, jM10457getZeroF1C5BW0);
                    root.draw(drawScope);
                } finally {
                    AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInvalidate() {
        this.isDirty = true;
        this.invalidateCallback.invoke();
    }

    public final void draw(@NotNull DrawScope drawScope, float f, @Nullable ColorFilter colorFilter) {
        DrawScope drawScope2;
        int iM10901getAlpha8_sVssgQ = (this.root.getIsTintable() && this.root.getTintColor() != 16 && VectorKt.tintableWithAlphaMask(getIntrinsicColorFilter$ui_release()) && VectorKt.tintableWithAlphaMask(colorFilter)) ? ImageBitmapConfig.INSTANCE.m10901getAlpha8_sVssgQ() : ImageBitmapConfig.INSTANCE.m10902getArgb8888_sVssgQ();
        if (!this.isDirty && Size.m10506equalsimpl0(this.previousDrawSize, drawScope.mo11233getSizeNHjbRc()) && ImageBitmapConfig.m10897equalsimpl0(iM10901getAlpha8_sVssgQ, m11377getCacheBitmapConfig_sVssgQ$ui_release())) {
            drawScope2 = drawScope;
        } else {
            this.tintFilter = ImageBitmapConfig.m10897equalsimpl0(iM10901getAlpha8_sVssgQ, ImageBitmapConfig.INSTANCE.m10901getAlpha8_sVssgQ()) ? ColorFilter.Companion.m10723tintxETnrds$default(ColorFilter.INSTANCE, this.root.getTintColor(), 0, 2, null) : null;
            this.rootScaleX = Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32)) / Float.intBitsToFloat((int) (m11378getViewportSizeNHjbRc$ui_release() >> 32));
            this.rootScaleY = Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L)) / Float.intBitsToFloat((int) (m11378getViewportSizeNHjbRc$ui_release() & 4294967295L));
            drawScope2 = drawScope;
            this.cacheDrawScope.m11360drawCachedImageFqjB98A(iM10901getAlpha8_sVssgQ, IntSize.m13471constructorimpl((((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L)))) & 4294967295L) | (((int) Math.ceil(Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32)))) << 32)), drawScope2, drawScope.getLayoutDirection(), this.drawVectorBlock);
            this.isDirty = false;
            this.previousDrawSize = drawScope2.mo11233getSizeNHjbRc();
        }
        if (colorFilter == null) {
            colorFilter = getIntrinsicColorFilter$ui_release() != null ? getIntrinsicColorFilter$ui_release() : this.tintFilter;
        }
        this.cacheDrawScope.drawInto(drawScope2, f, colorFilter);
    }

    /* renamed from: getCacheBitmapConfig-_sVssgQ$ui_release, reason: not valid java name */
    public final int m11377getCacheBitmapConfig_sVssgQ$ui_release() {
        ImageBitmap mCachedImage = this.cacheDrawScope.getMCachedImage();
        return mCachedImage != null ? mCachedImage.mo10549getConfig_sVssgQ() : ImageBitmapConfig.INSTANCE.m10902getArgb8888_sVssgQ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ColorFilter getIntrinsicColorFilter$ui_release() {
        return (ColorFilter) this.intrinsicColorFilter.getValue();
    }

    @NotNull
    /* renamed from: getInvalidateCallback$ui_release, reason: from getter */
    public final InterfaceC6469a getInvalidateCallback() {
        return this.invalidateCallback;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final GroupComponent getRoot() {
        return this.root;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getViewportSize-NH-jbRc$ui_release, reason: not valid java name */
    public final long m11378getViewportSizeNHjbRc$ui_release() {
        return ((Size) this.viewportSize.getValue()).m10515unboximpl();
    }

    public final void setIntrinsicColorFilter$ui_release(@Nullable ColorFilter colorFilter) {
        this.intrinsicColorFilter.setValue(colorFilter);
    }

    public final void setInvalidateCallback$ui_release(@NotNull InterfaceC6469a interfaceC6469a) {
        this.invalidateCallback = interfaceC6469a;
    }

    public final void setName(@NotNull String str) {
        this.name = str;
    }

    /* renamed from: setViewportSize-uvyYCjk$ui_release, reason: not valid java name */
    public final void m11379setViewportSizeuvyYCjk$ui_release(long j7) {
        this.viewportSize.setValue(Size.m10498boximpl(j7));
    }

    @NotNull
    public String toString() {
        String str = "Params: \tname: " + this.name + "\n\tviewportWidth: " + Float.intBitsToFloat((int) (m11378getViewportSizeNHjbRc$ui_release() >> 32)) + "\n\tviewportHeight: " + Float.intBitsToFloat((int) (m11378getViewportSizeNHjbRc$ui_release() & 4294967295L)) + SignParameters.NEW_LINE;
        AbstractC5830k.m5329f(str, "toString(...)");
        return str;
    }

    @Override // androidx.compose.p011ui.graphics.vector.VNode
    public void draw(@NotNull DrawScope drawScope) {
        draw(drawScope, 1.0f, null);
    }
}
