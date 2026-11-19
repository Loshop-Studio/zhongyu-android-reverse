package androidx.compose.foundation;

import androidx.compose.p006ui.ComposedModifierKt;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.draw.CacheDrawScope;
import androidx.compose.p006ui.draw.DrawModifierKt;
import androidx.compose.p006ui.draw.DrawResult;
import androidx.compose.p006ui.geometry.CornerRadius;
import androidx.compose.p006ui.geometry.CornerRadiusKt;
import androidx.compose.p006ui.geometry.Offset;
import androidx.compose.p006ui.geometry.OffsetKt;
import androidx.compose.p006ui.geometry.RoundRect;
import androidx.compose.p006ui.geometry.RoundRectKt;
import androidx.compose.p006ui.geometry.Size;
import androidx.compose.p006ui.geometry.SizeKt;
import androidx.compose.p006ui.graphics.AndroidPath_androidKt;
import androidx.compose.p006ui.graphics.Brush;
import androidx.compose.p006ui.graphics.ClipOp;
import androidx.compose.p006ui.graphics.Color;
import androidx.compose.p006ui.graphics.Outline;
import androidx.compose.p006ui.graphics.Path;
import androidx.compose.p006ui.graphics.PathOperation;
import androidx.compose.p006ui.graphics.RectangleShapeKt;
import androidx.compose.p006ui.graphics.Shape;
import androidx.compose.p006ui.graphics.SolidColor;
import androidx.compose.p006ui.graphics.drawscope.AbstractC1312b;
import androidx.compose.p006ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p006ui.graphics.drawscope.DrawContext;
import androidx.compose.p006ui.graphics.drawscope.DrawStyle;
import androidx.compose.p006ui.graphics.drawscope.Fill;
import androidx.compose.p006ui.graphics.drawscope.Stroke;
import androidx.compose.p006ui.node.Ref;
import androidx.compose.p006ui.platform.InspectableValueKt;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a(\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0002\u001a\u001c\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u000b\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u001a/\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u000b\u001a\u00020\f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u000e\u001a\u00020\u000fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a:\u0010\u001d\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002\u001aA\u0010#\u001a\u00020\u001b*\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001aW\u0010+\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010!\u001a\u00020,2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0012\u0010/\u001a\u00020 *\b\u0012\u0004\u0012\u00020 0\u001fH\u0002\u001a!\u00100\u001a\u000201*\u0002012\u0006\u00102\u001a\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b3\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00065"}, m5175d2 = {"createInsetRoundedRect", "Landroidx/compose/ui/geometry/RoundRect;", "widthPx", "", "roundedRect", "createRoundRectPath", "Landroidx/compose/ui/graphics/Path;", "targetPath", "strokeWidth", "fillArea", "", "border", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/BorderStroke;", "shape", "Landroidx/compose/ui/graphics/Shape;", "width", "Landroidx/compose/ui/unit/Dp;", "brush", "Landroidx/compose/ui/graphics/Brush;", "border-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "border-xT4_qwU", "(Landroidx/compose/ui/Modifier;FJLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "drawContentWithoutBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "drawGenericBorder", "borderCacheRef", "Landroidx/compose/ui/node/Ref;", "Landroidx/compose/foundation/BorderCache;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "drawRectBorder", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "strokeWidthPx", "drawRectBorder-NsqcLGU", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;JJZF)Landroidx/compose/ui/draw/DrawResult;", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "drawRoundRectBorder-SYlcjDY", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/node/Ref;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "obtain", "shrink", "Landroidx/compose/ui/geometry/CornerRadius;", "value", "shrink-Kibmq7A", "(JF)J", "foundation_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nBorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Border.kt\nandroidx/compose/foundation/BorderCache\n+ 5 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,459:1\n135#2:460\n1#3:461\n1#3:487\n181#4,25:462\n206#4,4:488\n215#4,6:501\n221#4:528\n222#4,2:537\n558#5,9:492\n567#5,8:529\n120#6,2:507\n173#6,6:509\n261#6,11:515\n122#6,2:526\n*S KotlinDebug\n*F\n+ 1 Border.kt\nandroidx/compose/foundation/BorderKt\n*L\n149#1:460\n290#1:487\n290#1:462,25\n290#1:488,4\n290#1:501,6\n290#1:528\n290#1:537,2\n290#1:492,9\n290#1:529,8\n296#1:507,2\n304#1:509,6\n304#1:515,11\n296#1:526,2\n*E\n"})
/* loaded from: classes.dex */
public final class BorderKt {
    public static final Modifier border(Modifier modifier, BorderStroke border, Shape shape) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(border, "border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m7080borderziNgDLE(modifier, border.getWidth(), border.getBrush(), shape);
    }

    public static /* synthetic */ Modifier border$default(Modifier modifier, BorderStroke borderStroke, Shape shape, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return border(modifier, borderStroke, shape);
    }

    /* renamed from: border-xT4_qwU, reason: not valid java name */
    public static final Modifier m7078borderxT4_qwU(Modifier border, float f4, long j4, Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return m7080borderziNgDLE(border, f4, new SolidColor(j4, null), shape);
    }

    /* renamed from: border-xT4_qwU$default, reason: not valid java name */
    public static /* synthetic */ Modifier m7079borderxT4_qwU$default(Modifier modifier, float f4, long j4, Shape shape, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        return m7078borderxT4_qwU(modifier, f4, j4, shape);
    }

    /* renamed from: border-ziNgDLE, reason: not valid java name */
    public static final Modifier m7080borderziNgDLE(Modifier border, final float f4, final Brush brush, final Shape shape) {
        Intrinsics.checkNotNullParameter(border, "$this$border");
        Intrinsics.checkNotNullParameter(brush, "brush");
        Intrinsics.checkNotNullParameter(shape, "shape");
        return ComposedModifierKt.composed(border, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.BorderKt$border-ziNgDLE$$inlined$debugInspectorInfo$1
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
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("border");
                inspectorInfo.getProperties().set("width", C1700Dp.m11523boximpl(f4));
                if (brush instanceof SolidColor) {
                    inspectorInfo.getProperties().set("color", Color.m9168boximpl(((SolidColor) brush).getValue()));
                    inspectorInfo.setValue(Color.m9168boximpl(((SolidColor) brush).getValue()));
                } else {
                    inspectorInfo.getProperties().set("brush", brush);
                }
                inspectorInfo.getProperties().set("shape", shape);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.BorderKt.border.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier composed, Composer composer, int i4) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(-1498088849);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1498088849, i4, -1, "androidx.compose.foundation.border.<anonymous> (Border.kt:93)");
                }
                composer.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Ref();
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                final Ref ref = (Ref) objRememberedValue;
                Modifier.Companion companion = Modifier.INSTANCE;
                final float f5 = f4;
                final Shape shape2 = shape;
                final Brush brush2 = brush;
                Modifier modifierThen = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderKt.border.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final DrawResult invoke(CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        if (!(drawWithCache.mo7206toPx0680j_4(f5) >= 0.0f && Size.m9013getMinDimensionimpl(drawWithCache.m8857getSizeNHjbRc()) > 0.0f)) {
                            return BorderKt.drawContentWithoutBorder(drawWithCache);
                        }
                        float f6 = 2;
                        float fMin = Math.min(C1700Dp.m11530equalsimpl0(f5, C1700Dp.INSTANCE.m11543getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(drawWithCache.mo7206toPx0680j_4(f5)), (float) Math.ceil(Size.m9013getMinDimensionimpl(drawWithCache.m8857getSizeNHjbRc()) / f6));
                        float f7 = fMin / f6;
                        long jOffset = OffsetKt.Offset(f7, f7);
                        long jSize = SizeKt.Size(Size.m9014getWidthimpl(drawWithCache.m8857getSizeNHjbRc()) - fMin, Size.m9011getHeightimpl(drawWithCache.m8857getSizeNHjbRc()) - fMin);
                        boolean z3 = f6 * fMin > Size.m9013getMinDimensionimpl(drawWithCache.m8857getSizeNHjbRc());
                        Outline outlineMo7110createOutlinePq9zytI = shape2.mo7110createOutlinePq9zytI(drawWithCache.m8857getSizeNHjbRc(), drawWithCache.getLayoutDirection(), drawWithCache);
                        if (outlineMo7110createOutlinePq9zytI instanceof Outline.Generic) {
                            return BorderKt.drawGenericBorder(drawWithCache, ref, brush2, (Outline.Generic) outlineMo7110createOutlinePq9zytI, z3, fMin);
                        }
                        if (outlineMo7110createOutlinePq9zytI instanceof Outline.Rounded) {
                            return BorderKt.m7082drawRoundRectBorderSYlcjDY(drawWithCache, ref, brush2, (Outline.Rounded) outlineMo7110createOutlinePq9zytI, jOffset, jSize, z3, fMin);
                        }
                        if (outlineMo7110createOutlinePq9zytI instanceof Outline.Rectangle) {
                            return BorderKt.m7081drawRectBorderNsqcLGU(drawWithCache, brush2, jOffset, jSize, z3, fMin);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        });
    }

    private static final RoundRect createInsetRoundedRect(float f4, RoundRect roundRect) {
        return new RoundRect(f4, f4, roundRect.getWidth() - f4, roundRect.getHeight() - f4, m7083shrinkKibmq7A(roundRect.m8995getTopLeftCornerRadiuskKHJgLs(), f4), m7083shrinkKibmq7A(roundRect.m8996getTopRightCornerRadiuskKHJgLs(), f4), m7083shrinkKibmq7A(roundRect.m8994getBottomRightCornerRadiuskKHJgLs(), f4), m7083shrinkKibmq7A(roundRect.m8993getBottomLeftCornerRadiuskKHJgLs(), f4), null);
    }

    private static final Path createRoundRectPath(Path path, RoundRect roundRect, float f4, boolean z3) {
        path.reset();
        path.addRoundRect(roundRect);
        if (!z3) {
            Path Path = AndroidPath_androidKt.Path();
            Path.addRoundRect(createInsetRoundedRect(f4, roundRect));
            path.mo9079opN5in7k0(path, Path, PathOperation.INSTANCE.m9440getDifferenceb3I0S0c());
        }
        return path;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult drawContentWithoutBorder(CacheDrawScope cacheDrawScope) {
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt.drawContentWithoutBorder.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.p006ui.draw.DrawResult drawGenericBorder(androidx.compose.p006ui.draw.CacheDrawScope r42, androidx.compose.p006ui.node.Ref<androidx.compose.foundation.BorderCache> r43, final androidx.compose.p006ui.graphics.Brush r44, final androidx.compose.ui.graphics.Outline.Generic r45, boolean r46, float r47) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderKt.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.node.Ref, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRectBorder-NsqcLGU, reason: not valid java name */
    public static final DrawResult m7081drawRectBorderNsqcLGU(CacheDrawScope cacheDrawScope, final Brush brush, long j4, long j5, boolean z3, float f4) {
        final long jM8961getZeroF1C5BW0 = z3 ? Offset.INSTANCE.m8961getZeroF1C5BW0() : j4;
        final long jM8857getSizeNHjbRc = z3 ? cacheDrawScope.m8857getSizeNHjbRc() : j5;
        final DrawStyle stroke = z3 ? Fill.INSTANCE : new Stroke(f4, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                AbstractC1312b.m435J(onDrawWithContent, brush, jM8961getZeroF1C5BW0, jM8857getSizeNHjbRc, 0.0f, stroke, null, 0, 104, null);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-SYlcjDY, reason: not valid java name */
    public static final DrawResult m7082drawRoundRectBorderSYlcjDY(CacheDrawScope cacheDrawScope, Ref<BorderCache> ref, final Brush brush, Outline.Rounded rounded, final long j4, final long j5, final boolean z3, final float f4) {
        if (!RoundRectKt.isSimple(rounded.getRoundRect())) {
            final Path pathCreateRoundRectPath = createRoundRectPath(obtain(ref).obtainPath(), rounded.getRoundRect(), f4, z3);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope onDrawWithContent) {
                    Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                    onDrawWithContent.drawContent();
                    AbstractC1312b.m431F(onDrawWithContent, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
                }
            });
        }
        final long jM8995getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m8995getTopLeftCornerRadiuskKHJgLs();
        final float f5 = f4 / 2;
        final Stroke stroke = new Stroke(f4, 0.0f, 0, 0, null, 30, null);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderKt$drawRoundRectBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope onDrawWithContent) {
                Intrinsics.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
                onDrawWithContent.drawContent();
                if (z3) {
                    AbstractC1312b.m437L(onDrawWithContent, brush, 0L, 0L, jM8995getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                    return;
                }
                float fM8920getXimpl = CornerRadius.m8920getXimpl(jM8995getTopLeftCornerRadiuskKHJgLs);
                float f6 = f5;
                if (fM8920getXimpl >= f6) {
                    AbstractC1312b.m437L(onDrawWithContent, brush, j4, j5, BorderKt.m7083shrinkKibmq7A(jM8995getTopLeftCornerRadiuskKHJgLs, f6), 0.0f, stroke, null, 0, 208, null);
                    return;
                }
                float f7 = f4;
                float fM9014getWidthimpl = Size.m9014getWidthimpl(onDrawWithContent.mo9614getSizeNHjbRc()) - f4;
                float fM9011getHeightimpl = Size.m9011getHeightimpl(onDrawWithContent.mo9614getSizeNHjbRc()) - f4;
                int iM9166getDifferencertfAjoo = ClipOp.INSTANCE.m9166getDifferencertfAjoo();
                Brush brush2 = brush;
                long j6 = jM8995getTopLeftCornerRadiuskKHJgLs;
                DrawContext drawContext = onDrawWithContent.getDrawContext();
                long jMo9620getSizeNHjbRc = drawContext.mo9620getSizeNHjbRc();
                drawContext.getCanvas().save();
                drawContext.getTransform().mo9623clipRectN_I0leg(f7, f7, fM9014getWidthimpl, fM9011getHeightimpl, iM9166getDifferencertfAjoo);
                AbstractC1312b.m437L(onDrawWithContent, brush2, 0L, 0L, j6, 0.0f, null, null, 0, 246, null);
                drawContext.getCanvas().restore();
                drawContext.mo9621setSizeuvyYCjk(jMo9620getSizeNHjbRc);
            }
        });
    }

    private static final BorderCache obtain(Ref<BorderCache> ref) {
        BorderCache value = ref.getValue();
        if (value != null) {
            return value;
        }
        BorderCache borderCache = new BorderCache(null, null, null, null, 15, null);
        ref.setValue(borderCache);
        return borderCache;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: shrink-Kibmq7A, reason: not valid java name */
    public static final long m7083shrinkKibmq7A(long j4, float f4) {
        return CornerRadiusKt.CornerRadius(Math.max(0.0f, CornerRadius.m8920getXimpl(j4) - f4), Math.max(0.0f, CornerRadius.m8921getYimpl(j4) - f4));
    }
}
