package coil3.compose;

import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.painter.Painter;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p137k.InterfaceC7838j;
import p150l.AbstractC8477e;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m13558d2 = {"Lcoil3/compose/ImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Lk/j;", "image", "<init>", "(Lk/j;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "a", "Lk/j;", "getImage", "()Lk/j;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "coil-compose-core_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil3/compose/ImagePainter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,46:1\n1#2:47\n33#3:48\n53#4,3:49\n60#4:53\n70#4:56\n57#5:52\n61#5:55\n22#6:54\n22#6:57\n172#7:58\n249#7,14:59\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil3/compose/ImagePainter\n*L\n23#1:48\n23#1:49,3\n30#1:53\n31#1:56\n30#1:52\n31#1:55\n30#1:54\n31#1:57\n29#1:58\n29#1:59,14\n*E\n"})
/* loaded from: classes3.dex */
public final class ImagePainter extends Painter {

    /* renamed from: a, reason: from kotlin metadata */
    public final InterfaceC7838j image;

    public ImagePainter(InterfaceC7838j interfaceC7838j) {
        this.image = interfaceC7838j;
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        int width = this.image.getWidth();
        float f10 = width > 0 ? width : Float.NaN;
        return Size.m20795constructorimpl((Float.floatToRawIntBits(this.image.getHeight() > 0 ? r2 : Float.NaN) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    @Override // androidx.compose.p013ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        int width = this.image.getWidth();
        float fIntBitsToFloat = width > 0 ? Float.intBitsToFloat((int) (drawScope.mo21527getSizeNHjbRc() >> 32)) / width : 1.0f;
        int height = this.image.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (drawScope.mo21527getSizeNHjbRc() & 4294967295L)) / height : 1.0f;
        long jM20751getZeroF1C5BW0 = Offset.INSTANCE.m20751getZeroF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo21448getSizeNHjbRc = drawContext.mo21448getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo21455scale0AR0LA0(fIntBitsToFloat, fIntBitsToFloat2, jM20751getZeroF1C5BW0);
            this.image.draw(AbstractC8477e.m13859c(drawScope.getDrawContext().getCanvas()));
        } finally {
            drawContext.getCanvas().restore();
            drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
        }
    }
}
