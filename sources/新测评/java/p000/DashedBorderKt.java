package p000;

import androidx.compose.p013ui.ComposedModifierKt;
import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.draw.CacheDrawScope;
import androidx.compose.p013ui.draw.DrawModifierKt;
import androidx.compose.p013ui.draw.DrawResult;
import androidx.compose.p013ui.geometry.Offset;
import androidx.compose.p013ui.geometry.RoundRect;
import androidx.compose.p013ui.geometry.RoundRectKt;
import androidx.compose.p013ui.geometry.Size;
import androidx.compose.p013ui.graphics.AndroidPath_androidKt;
import androidx.compose.p013ui.graphics.Brush;
import androidx.compose.p013ui.graphics.ClipOp;
import androidx.compose.p013ui.graphics.Color;
import androidx.compose.p013ui.graphics.Outline;
import androidx.compose.p013ui.graphics.Path;
import androidx.compose.p013ui.graphics.PathEffect;
import androidx.compose.p013ui.graphics.Shape;
import androidx.compose.p013ui.graphics.SolidColor;
import androidx.compose.p013ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawContext;
import androidx.compose.p013ui.graphics.drawscope.DrawScope;
import androidx.compose.p013ui.graphics.drawscope.DrawStyle;
import androidx.compose.p013ui.graphics.drawscope.DrawTransform;
import androidx.compose.p013ui.graphics.drawscope.Stroke;
import androidx.compose.p013ui.platform.InspectableValueKt;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public abstract class DashedBorderKt {
    /* renamed from: d */
    public static final Modifier m3d(Modifier dashedBorder, float f10, long j10, Shape shape, float f11, float f12) {
        Intrinsics.checkNotNullParameter(dashedBorder, "$this$dashedBorder");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m4e(dashedBorder, f10, new SolidColor(j10, null), shape, f11, f12);
    }

    /* renamed from: e */
    public static final Modifier m4e(Modifier dashedBorder, final float f10, final Brush brush, final Shape shape, final float f11, final float f12) {
        Intrinsics.checkNotNullParameter(dashedBorder, "$this$dashedBorder");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(dashedBorder, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: DashedBorderKt$dashedBorder-jd7gvko$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(InspectorInfo inspectorInfo) {
                inspectorInfo.setName("border");
                inspectorInfo.getProperties().set("width", C3127Dp.m23559boximpl(f10));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set(TypedValues.Custom.S_COLOR, Color.m20966boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m20966boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3() { // from class: a
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DashedBorderKt.m5f(shape, f10, f11, f12, brush, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        });
    }

    /* renamed from: f */
    public static final Modifier m5f(final Shape shape, final float f10, final float f11, final float f12, final Brush brush, Modifier composed, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceGroup(-2066004753);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2066004753, i10, -1, "dashedBorder.<anonymous> (DashedBorder.kt:72)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        boolean zChanged = composer.changed(shape) | composer.changed(f10) | composer.changed(f11) | composer.changed(f12) | composer.changed(brush);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Function1 function1 = new Function1() { // from class: b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DashedBorderKt.m6g(shape, f10, f11, f12, brush, (CacheDrawScope) obj);
                }
            };
            composer.updateRememberedValue(function1);
            objRememberedValue = function1;
        }
        Modifier modifierThen = composed.then(DrawModifierKt.drawWithCache(companion, (Function1) objRememberedValue));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierThen;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, androidx.compose.ui.graphics.Outline] */
    /* JADX WARN: Type inference failed for: r11v22, types: [T, androidx.compose.ui.graphics.drawscope.Stroke] */
    /* JADX WARN: Type inference failed for: r19v0, types: [T, androidx.compose.ui.graphics.drawscope.Stroke] */
    /* renamed from: g */
    public static final DrawResult m6g(Shape shape, float f10, final float f11, final float f12, final Brush brush, CacheDrawScope drawWithCache) {
        T path;
        T t10;
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Outline outlineMo17246createOutlinePq9zytI = shape.mo17246createOutlinePq9zytI(drawWithCache.m20596getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
        float fMo17332toPx0680j_4 = C3127Dp.m23566equalsimpl0(f10, C3127Dp.INSTANCE.m23579getHairlineD9Ej5fM()) ? 1.0f : drawWithCache.mo17332toPx0680j_4(f10);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        final Ref.ObjectRef objectRef4 = new Ref.ObjectRef();
        if (fMo17332toPx0680j_4 > 0.0f && Size.m20803getMinDimensionimpl(drawWithCache.m20596getSizeNHjbRc()) > 0.0f) {
            if (outlineMo17246createOutlinePq9zytI instanceof Outline.Rectangle) {
                objectRef2.element = new Stroke(fMo17332toPx0680j_4, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawWithCache.mo17332toPx0680j_4(f11), drawWithCache.mo17332toPx0680j_4(f12)}, 0.0f, 2, null), 14, null);
            } else {
                float f13 = fMo17332toPx0680j_4 * 1.2f;
                floatRef.element = fMo17332toPx0680j_4 - (f13 / 2);
                objectRef.element = shape.mo17246createOutlinePq9zytI(Size.m20795constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.m20596getSizeNHjbRc() >> 32)) - (floatRef.element * r11)) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawWithCache.m20596getSizeNHjbRc() & 4294967295L)) - (floatRef.element * r11)) & 4294967295L)), drawWithCache.getLayoutDirection(), drawWithCache);
                objectRef2.element = new Stroke(f13, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(PathEffect.INSTANCE, new float[]{drawWithCache.mo17332toPx0680j_4(f11), drawWithCache.mo17332toPx0680j_4(f12)}, 0.0f, 2, null), 14, null);
                if (outlineMo17246createOutlinePq9zytI instanceof Outline.Rounded) {
                    Path Path = AndroidPath_androidKt.Path();
                    Path.addRoundRect$default(Path, ((Outline.Rounded) outlineMo17246createOutlinePq9zytI).getRoundRect(), null, 2, null);
                    path = Path;
                } else {
                    path = outlineMo17246createOutlinePq9zytI instanceof Outline.Generic ? ((Outline.Generic) outlineMo17246createOutlinePq9zytI).getPath() : 0;
                }
                objectRef3.element = path;
                T t11 = objectRef.element;
                if ((t11 instanceof Outline.Rounded) && !RoundRectKt.isSimple(((Outline.Rounded) t11).getRoundRect())) {
                    Path Path2 = AndroidPath_androidKt.Path();
                    Path.addRoundRect$default(Path2, ((Outline.Rounded) objectRef.element).getRoundRect(), null, 2, null);
                    float f14 = floatRef.element;
                    Path2.mo20871translatek4lQ0M(Offset.m20727constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L)));
                    t10 = Path2;
                } else if (objectRef.element instanceof Outline.Generic) {
                    Path Path3 = AndroidPath_androidKt.Path();
                    Path path2 = ((Outline.Generic) objectRef.element).getPath();
                    float f15 = floatRef.element;
                    Path3.mo20866addPathUv8p0NA(path2, Offset.m20727constructorimpl((Float.floatToRawIntBits(f15) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L)));
                    t10 = Path3;
                } else {
                    t10 = 0;
                }
                objectRef4.element = t10;
            }
        }
        return drawWithCache.onDrawWithContent(new Function1() { // from class: c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DashedBorderKt.m7h(objectRef2, objectRef, objectRef3, brush, floatRef, objectRef4, outlineMo17246createOutlinePq9zytI, f11, f12, (ContentDrawScope) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v9, types: [androidx.compose.ui.graphics.drawscope.DrawContext] */
    /* renamed from: h */
    public static final Unit m7h(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, Brush brush, Ref.FloatRef floatRef, Ref.ObjectRef objectRef4, Outline outline, float f10, float f11, ContentDrawScope onDrawWithContent) throws Throwable {
        DrawContext drawContext;
        long jMo21448getSizeNHjbRc;
        String str;
        int i10;
        char c10;
        long j10;
        ContentDrawScope contentDrawScope;
        long j11;
        long j12;
        ?? r12 = objectRef2;
        Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        onDrawWithContent.drawContent();
        T t10 = objectRef.element;
        if (t10 != 0) {
            T t11 = r12.element;
            if (t11 == 0 || objectRef3.element == 0) {
                float width = ((Stroke) t10).getWidth();
                float f12 = width / 2;
                long jM20727constructorimpl = Offset.m20727constructorimpl((Float.floatToRawIntBits(f12) << 32) | (Float.floatToRawIntBits(f12) & 4294967295L));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (onDrawWithContent.mo21527getSizeNHjbRc() >> 32)) - width;
                DrawScope.m21520drawRectAsUm42w$default(onDrawWithContent, brush, jM20727constructorimpl, Size.m20795constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (onDrawWithContent.mo21527getSizeNHjbRc() & 4294967295L)) - width) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), 0.0f, (DrawStyle) objectRef.element, null, 0, 104, null);
            } else {
                boolean z9 = (t11 instanceof Outline.Rounded) && RoundRectKt.isSimple(((Outline.Rounded) t11).getRoundRect());
                DrawContext drawContext2 = onDrawWithContent.getDrawContext();
                long jMo21448getSizeNHjbRc2 = drawContext2.mo21448getSizeNHjbRc();
                drawContext2.getCanvas().save();
                try {
                    DrawTransform transform = drawContext2.getTransform();
                    DrawTransform.m21583clipPathmtrdDE$default(transform, (Path) objectRef3.element, 0, 2, null);
                    if (z9) {
                        float f13 = floatRef.element;
                        transform.translate(f13, f13);
                    }
                    try {
                        if (z9) {
                            T t12 = r12.element;
                            Intrinsics.checkNotNull(t12, "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded");
                            RoundRect roundRect = ((Outline.Rounded) t12).getRoundRect();
                            long jM20727constructorimpl2 = Offset.m20727constructorimpl((Float.floatToRawIntBits(roundRect.getLeft()) << 32) | (Float.floatToRawIntBits(roundRect.getTop()) & 4294967295L));
                            try {
                                long jM20795constructorimpl = Size.m20795constructorimpl((Float.floatToRawIntBits(roundRect.getWidth()) << 32) | (Float.floatToRawIntBits(roundRect.getHeight()) & 4294967295L));
                                long jM20785getTopLeftCornerRadiuskKHJgLs = roundRect.m20785getTopLeftCornerRadiuskKHJgLs();
                                c10 = 0;
                                i10 = 2;
                                r12 = drawContext2;
                                j10 = jMo21448getSizeNHjbRc2;
                                DrawScope.m21522drawRoundRectZuiqVtQ$default(onDrawWithContent, brush, jM20727constructorimpl2, jM20795constructorimpl, jM20785getTopLeftCornerRadiuskKHJgLs, 0.0f, (DrawStyle) objectRef.element, null, 0, 208, null);
                                contentDrawScope = onDrawWithContent;
                                str = "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded";
                            } catch (Throwable th) {
                                th = th;
                                jMo21448getSizeNHjbRc = jMo21448getSizeNHjbRc2;
                                drawContext = drawContext2;
                                drawContext.getCanvas().restore();
                                drawContext.mo21449setSizeuvyYCjk(jMo21448getSizeNHjbRc);
                                throw th;
                            }
                        } else {
                            DrawContext drawContext3 = drawContext2;
                            str = "null cannot be cast to non-null type androidx.compose.ui.graphics.Outline.Rounded";
                            i10 = 2;
                            c10 = 0;
                            j10 = jMo21448getSizeNHjbRc2;
                            T t13 = objectRef4.element;
                            if (t13 != 0) {
                                contentDrawScope = onDrawWithContent;
                                DrawScope.m21516drawPathGBMwjPU$default(contentDrawScope, (Path) t13, brush, 0.0f, (DrawStyle) objectRef.element, null, 0, 52, null);
                                r12 = drawContext3;
                            } else {
                                contentDrawScope = onDrawWithContent;
                                r12 = drawContext3;
                            }
                        }
                        r12.getCanvas().restore();
                        r12.mo21449setSizeuvyYCjk(j10);
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (contentDrawScope.mo21527getSizeNHjbRc() >> 32));
                        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (contentDrawScope.mo21527getSizeNHjbRc() & 4294967295L));
                        int iM20965getIntersectrtfAjoo = ClipOp.INSTANCE.m20965getIntersectrtfAjoo();
                        DrawContext drawContext4 = contentDrawScope.getDrawContext();
                        jMo21448getSizeNHjbRc = drawContext4.mo21448getSizeNHjbRc();
                        drawContext4.getCanvas().save();
                        try {
                            drawContext4.getTransform().mo21451clipRectN_I0leg(0.0f, 0.0f, fIntBitsToFloat2, fIntBitsToFloat3, iM20965getIntersectrtfAjoo);
                            try {
                                if (z9) {
                                    try {
                                        Intrinsics.checkNotNull(outline, str);
                                        RoundRect roundRect2 = ((Outline.Rounded) outline).getRoundRect();
                                        long jM20727constructorimpl3 = Offset.m20727constructorimpl((Float.floatToRawIntBits(roundRect2.getLeft()) << 32) | (Float.floatToRawIntBits(roundRect2.getTop()) & 4294967295L));
                                        long jM20795constructorimpl2 = Size.m20795constructorimpl((Float.floatToRawIntBits(roundRect2.getWidth()) << 32) | (Float.floatToRawIntBits(roundRect2.getHeight()) & 4294967295L));
                                        long jM20785getTopLeftCornerRadiuskKHJgLs2 = roundRect2.m20785getTopLeftCornerRadiuskKHJgLs();
                                        PathEffect.Companion companion = PathEffect.INSTANCE;
                                        float fMo17332toPx0680j_4 = contentDrawScope.mo17332toPx0680j_4(f10);
                                        float fMo17332toPx0680j_42 = contentDrawScope.mo17332toPx0680j_4(f11);
                                        float[] fArr = new float[i10];
                                        fArr[c10] = fMo17332toPx0680j_4;
                                        fArr[1] = fMo17332toPx0680j_42;
                                        j12 = jMo21448getSizeNHjbRc;
                                        DrawScope.m21522drawRoundRectZuiqVtQ$default(onDrawWithContent, brush, jM20727constructorimpl3, jM20795constructorimpl2, jM20785getTopLeftCornerRadiuskKHJgLs2, 0.0f, new Stroke(0.0f, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(companion, fArr, 0.0f, i10, null), 14, null), null, 0, 208, null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        j12 = jMo21448getSizeNHjbRc;
                                        j11 = j12;
                                        drawContext4.getCanvas().restore();
                                        drawContext4.mo21449setSizeuvyYCjk(j11);
                                        throw th;
                                    }
                                } else {
                                    j12 = jMo21448getSizeNHjbRc;
                                    Path path = (Path) objectRef3.element;
                                    PathEffect.Companion companion2 = PathEffect.INSTANCE;
                                    float fMo17332toPx0680j_43 = contentDrawScope.mo17332toPx0680j_4(f10);
                                    float fMo17332toPx0680j_44 = contentDrawScope.mo17332toPx0680j_4(f11);
                                    float[] fArr2 = new float[i10];
                                    fArr2[c10] = fMo17332toPx0680j_43;
                                    fArr2[1] = fMo17332toPx0680j_44;
                                    DrawScope.m21516drawPathGBMwjPU$default(onDrawWithContent, path, brush, 0.0f, new Stroke(0.0f, 0.0f, 0, 0, PathEffect.Companion.dashPathEffect$default(companion2, fArr2, 0.0f, i10, null), 14, null), null, 0, 52, null);
                                }
                                drawContext4.getCanvas().restore();
                                drawContext4.mo21449setSizeuvyYCjk(j12);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            j11 = jMo21448getSizeNHjbRc;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        drawContext = r12;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    drawContext = drawContext2;
                    jMo21448getSizeNHjbRc = jMo21448getSizeNHjbRc2;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
