package coil3.compose;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import coil3.InterfaceC3305k;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcoil3/compose/ImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-core_release"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil3/compose/ImagePainter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,46:1\n1#2:47\n33#3:48\n53#4,3:49\n60#4:53\n70#4:56\n57#5:52\n61#5:55\n22#6:54\n22#6:57\n172#7:58\n249#7,14:59\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil3/compose/ImagePainter\n*L\n23#1:48\n23#1:49,3\n30#1:53\n31#1:56\n30#1:52\n31#1:55\n30#1:54\n31#1:57\n29#1:58\n29#1:59,14\n*E\n"})
/* loaded from: classes2.dex */
public final class ImagePainter extends Painter {

    /* renamed from: a */
    public final InterfaceC3305k f1839a;

    public ImagePainter(InterfaceC3305k interfaceC3305k) {
        this.f1839a = interfaceC3305k;
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        InterfaceC3305k interfaceC3305k = this.f1839a;
        int width = interfaceC3305k.getWidth();
        float f = width > 0 ? width : Float.NaN;
        return Size.m10501constructorimpl((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(interfaceC3305k.getHeight() > 0 ? r0 : Float.NaN) & 4294967295L));
    }

    @Override // androidx.compose.p011ui.graphics.painter.Painter
    public final void onDraw(DrawScope drawScope) {
        InterfaceC3305k interfaceC3305k = this.f1839a;
        int width = interfaceC3305k.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() >> 32)) / width : 1.0f;
        int height = interfaceC3305k.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (drawScope.mo11233getSizeNHjbRc() & 4294967295L)) / height : 1.0f;
        long jM10457getZeroF1C5BW0 = Offset.INSTANCE.m10457getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo11154getSizeNHjbRc = drawContext.mo11154getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo11161scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jM10457getZeroF1C5BW0);
            interfaceC3305k.draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()));
        } finally {
            AbstractC0584a.m921v(drawContext, jMo11154getSizeNHjbRc);
        }
    }
}
