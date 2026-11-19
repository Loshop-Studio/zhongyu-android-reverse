package androidx.compose.p013ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.camera.video.AudioStats;
import androidx.compose.p013ui.geometry.Rect;
import androidx.compose.p013ui.graphics.ColorFilter;
import androidx.compose.p013ui.graphics.ImageBitmap;
import androidx.compose.p013ui.graphics.layer.GraphicsLayer;
import androidx.compose.p013ui.unit.DpRect;
import androidx.compose.runtime.Stable;
import com.google.android.material.color.utilities.Contrast;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(m13557d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, m13558d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m21473drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j10, long j11, long j12, long j13, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10, DrawStyle drawStyle, ColorFilter colorFilter, int i10, int i11) {
            ContentDrawScope.super.mo21429drawImageAZ2fEMs(imageBitmap, j10, j11, j12, j13, f10, drawStyle, colorFilter, i10, i11);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m21474getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo21526getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m21475getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo21527getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m21476recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j10, Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo21528recordJVtK1S4(graphicsLayer, j10, function1);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m21477roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo17325roundToPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m21478roundToPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17326roundToPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m21479toDpGaN1DYA(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo17327toDpGaN1DYA(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21480toDpu2uoSUM(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17328toDpu2uoSUM(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m21482toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo17330toDpSizekrfVVM(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m21483toPxR2X_6o(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo17331toPxR2X_6o(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m21484toPx0680j_4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17332toPx0680j_4(f10);
        }

        @Stable
        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m21485toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j10) {
            return ContentDrawScope.super.mo17333toSizeXkaWNTQ(j10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m21486toSp0xMU5do(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17334toSp0xMU5do(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21487toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f10) {
            return ContentDrawScope.super.mo17335toSpkPz2Gy4(f10);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m21481toDpu2uoSUM(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo17329toDpu2uoSUM(i10);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m21488toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i10) {
            return ContentDrawScope.super.mo17336toSpkPz2Gy4(i10);
        }
    }

    void drawContent();
}
