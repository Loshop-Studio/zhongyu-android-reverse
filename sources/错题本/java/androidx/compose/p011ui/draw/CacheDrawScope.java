package androidx.compose.p011ui.draw;

import androidx.compose.p011ui.graphics.GraphicsContext;
import androidx.compose.p011ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawContext;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.layer.GraphicsLayer;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSizeKt;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@StabilityInferred(parameters = 1)
@Metadata(m5109d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JK\u0010\u0013\u001a\u00020\u000e*\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0016\u001a\u00020\u00152\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u0018\u001a\u00020\u00152\u0017\u0010\u0010\u001a\u0013\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f¢\u0006\u0002\b\u000f¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010&\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010.\u001a\n\u0012\u0004\u0012\u00020-\u0018\u00010,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u0002048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010;\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006>"}, m5110d2 = {"Landroidx/compose/ui/draw/CacheDrawScope;", "Landroidx/compose/ui/unit/Density;", "<init>", "()V", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "obtainGraphicsLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "size", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Ld6/s;", "Lkotlin/ExtensionFunctionType;", "block", "record-TdoYBX4", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLr6/c;)V", "record", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/draw/DrawResult;", "onDrawBehind", "(Lr6/c;)Landroidx/compose/ui/draw/DrawResult;", "onDrawWithContent", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "cacheParams", "Landroidx/compose/ui/draw/BuildDrawCacheParams;", "getCacheParams$ui_release", "()Landroidx/compose/ui/draw/BuildDrawCacheParams;", "setCacheParams$ui_release", "(Landroidx/compose/ui/draw/BuildDrawCacheParams;)V", "drawResult", "Landroidx/compose/ui/draw/DrawResult;", "getDrawResult$ui_release", "()Landroidx/compose/ui/draw/DrawResult;", "setDrawResult$ui_release", "(Landroidx/compose/ui/draw/DrawResult;)V", "contentDrawScope", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "getContentDrawScope$ui_release", "()Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "setContentDrawScope$ui_release", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContextProvider", "Lr6/a;", "getGraphicsContextProvider$ui_release", "()Lr6/a;", "setGraphicsContextProvider$ui_release", "(Lr6/a;)V", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "", "getDensity", "()F", "getFontScale", "fontScale", "ui_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nDrawModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawModifier.kt\nandroidx/compose/ui/draw/CacheDrawScope\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,415:1\n1#2:416\n*E\n"})
/* loaded from: classes.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;

    @NotNull
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;

    @Nullable
    private ContentDrawScope contentDrawScope;

    @Nullable
    private DrawResult drawResult;

    @Nullable
    private InterfaceC6469a graphicsContextProvider;

    /* renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m10294recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j7, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            density = cacheDrawScope;
        }
        if ((i & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i & 4) != 0) {
            j7 = IntSizeKt.m13487toIntSizeuvyYCjk(cacheDrawScope.m10295getSizeNHjbRc());
        }
        cacheDrawScope.m10296recordTdoYBX4(graphicsLayer, density, layoutDirection, j7, interfaceC6471c);
    }

    @NotNull
    /* renamed from: getCacheParams$ui_release, reason: from getter */
    public final BuildDrawCacheParams getCacheParams() {
        return this.cacheParams;
    }

    @Nullable
    /* renamed from: getContentDrawScope$ui_release, reason: from getter */
    public final ContentDrawScope getContentDrawScope() {
        return this.contentDrawScope;
    }

    @Override // androidx.compose.p011ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    @Nullable
    /* renamed from: getDrawResult$ui_release, reason: from getter */
    public final DrawResult getDrawResult() {
        return this.drawResult;
    }

    @Override // androidx.compose.p011ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    @Nullable
    /* renamed from: getGraphicsContextProvider$ui_release, reason: from getter */
    public final InterfaceC6469a getGraphicsContextProvider() {
        return this.graphicsContextProvider;
    }

    @NotNull
    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m10295getSizeNHjbRc() {
        return this.cacheParams.mo10292getSizeNHjbRc();
    }

    @NotNull
    public final GraphicsLayer obtainGraphicsLayer() {
        InterfaceC6469a interfaceC6469a = this.graphicsContextProvider;
        AbstractC5830k.m5327d(interfaceC6469a);
        return ((GraphicsContext) interfaceC6469a.invoke()).createGraphicsLayer();
    }

    @NotNull
    public final DrawResult onDrawBehind(@NotNull final InterfaceC6471c block) {
        return onDrawWithContent(new InterfaceC6471c() { // from class: androidx.compose.ui.draw.CacheDrawScope.onDrawBehind.1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                block.invoke(contentDrawScope);
                contentDrawScope.drawContent();
            }
        });
    }

    @NotNull
    public final DrawResult onDrawWithContent(@NotNull InterfaceC6471c block) {
        DrawResult drawResult = new DrawResult(block);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m10296recordTdoYBX4(@NotNull GraphicsLayer graphicsLayer, @NotNull final Density density, @NotNull final LayoutDirection layoutDirection, long j7, @NotNull final InterfaceC6471c interfaceC6471c) {
        final ContentDrawScope contentDrawScope = this.contentDrawScope;
        AbstractC5830k.m5327d(contentDrawScope);
        final Density density2 = contentDrawScope.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        contentDrawScope.mo11234recordJVtK1S4(graphicsLayer, j7, new InterfaceC6471c() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawContext drawContext = drawScope.getDrawContext();
                Density density3 = density;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.setDensity(density3);
                drawContext.setLayoutDirection(layoutDirection3);
                try {
                    interfaceC6471c.invoke(contentDrawScope);
                } finally {
                    DrawContext drawContext2 = drawScope.getDrawContext();
                    Density density4 = density2;
                    LayoutDirection layoutDirection4 = layoutDirection2;
                    drawContext2.setDensity(density4);
                    drawContext2.setLayoutDirection(layoutDirection4);
                }
            }
        });
    }

    public final void setCacheParams$ui_release(@NotNull BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui_release(@Nullable ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui_release(@Nullable DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui_release(@Nullable InterfaceC6469a interfaceC6469a) {
        this.graphicsContextProvider = interfaceC6469a;
    }
}
