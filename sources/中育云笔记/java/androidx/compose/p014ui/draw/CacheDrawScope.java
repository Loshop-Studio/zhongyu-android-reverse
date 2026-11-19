package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.graphics.drawscope.DrawContext;
import androidx.compose.p014ui.graphics.drawscope.DrawScope;
import androidx.compose.p014ui.graphics.layer.GraphicsLayer;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class CacheDrawScope implements Density {
    public static final int $stable = 0;
    private BuildDrawCacheParams cacheParams = EmptyBuildDrawCacheParams.INSTANCE;
    private ContentDrawScope contentDrawScope;
    private DrawResult drawResult;
    private InterfaceC9529a graphicsContextProvider;

    /* renamed from: record-TdoYBX4$default, reason: not valid java name */
    public static /* synthetic */ void m30490recordTdoYBX4$default(CacheDrawScope cacheDrawScope, GraphicsLayer graphicsLayer, Density density, LayoutDirection layoutDirection, long j10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            density = cacheDrawScope;
        }
        if ((i10 & 2) != 0) {
            layoutDirection = cacheDrawScope.getLayoutDirection();
        }
        if ((i10 & 4) != 0) {
            j10 = IntSizeKt.m33683toIntSizeuvyYCjk(cacheDrawScope.m30491getSizeNHjbRc());
        }
        cacheDrawScope.m30492recordTdoYBX4(graphicsLayer, density, layoutDirection, j10, interfaceC9540l);
    }

    public final BuildDrawCacheParams getCacheParams$ui_release() {
        return this.cacheParams;
    }

    public final ContentDrawScope getContentDrawScope$ui_release() {
        return this.contentDrawScope;
    }

    @Override // androidx.compose.p014ui.unit.Density
    public float getDensity() {
        return this.cacheParams.getDensity().getDensity();
    }

    public final DrawResult getDrawResult$ui_release() {
        return this.drawResult;
    }

    @Override // androidx.compose.p014ui.unit.FontScaling
    public float getFontScale() {
        return this.cacheParams.getDensity().getFontScale();
    }

    public final InterfaceC9529a getGraphicsContextProvider$ui_release() {
        return this.graphicsContextProvider;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.cacheParams.getLayoutDirection();
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m30491getSizeNHjbRc() {
        return this.cacheParams.mo30488getSizeNHjbRc();
    }

    public final GraphicsLayer obtainGraphicsLayer() {
        InterfaceC9529a interfaceC9529a = this.graphicsContextProvider;
        AbstractC9979u.m20291d(interfaceC9529a);
        return ((GraphicsContext) interfaceC9529a.invoke()).createGraphicsLayer();
    }

    public final DrawResult onDrawBehind(final InterfaceC9540l interfaceC9540l) {
        return onDrawWithContent(new InterfaceC9540l() { // from class: androidx.compose.ui.draw.CacheDrawScope.onDrawBehind.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((ContentDrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(ContentDrawScope contentDrawScope) {
                interfaceC9540l.invoke(contentDrawScope);
                contentDrawScope.drawContent();
            }
        });
    }

    public final DrawResult onDrawWithContent(InterfaceC9540l interfaceC9540l) {
        DrawResult drawResult = new DrawResult(interfaceC9540l);
        this.drawResult = drawResult;
        return drawResult;
    }

    /* renamed from: record-TdoYBX4, reason: not valid java name */
    public final void m30492recordTdoYBX4(GraphicsLayer graphicsLayer, final Density density, final LayoutDirection layoutDirection, long j10, final InterfaceC9540l interfaceC9540l) {
        final ContentDrawScope contentDrawScope = this.contentDrawScope;
        AbstractC9979u.m20291d(contentDrawScope);
        final Density density2 = contentDrawScope.getDrawContext().getDensity();
        final LayoutDirection layoutDirection2 = contentDrawScope.getDrawContext().getLayoutDirection();
        contentDrawScope.mo31430recordJVtK1S4(graphicsLayer, j10, new InterfaceC9540l() { // from class: androidx.compose.ui.draw.CacheDrawScope$record$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DrawScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(DrawScope drawScope) {
                DrawContext drawContext = drawScope.getDrawContext();
                Density density3 = density;
                LayoutDirection layoutDirection3 = layoutDirection;
                drawContext.setDensity(density3);
                drawContext.setLayoutDirection(layoutDirection3);
                try {
                    interfaceC9540l.invoke(contentDrawScope);
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

    public final void setCacheParams$ui_release(BuildDrawCacheParams buildDrawCacheParams) {
        this.cacheParams = buildDrawCacheParams;
    }

    public final void setContentDrawScope$ui_release(ContentDrawScope contentDrawScope) {
        this.contentDrawScope = contentDrawScope;
    }

    public final void setDrawResult$ui_release(DrawResult drawResult) {
        this.drawResult = drawResult;
    }

    public final void setGraphicsContextProvider$ui_release(InterfaceC9529a interfaceC9529a) {
        this.graphicsContextProvider = interfaceC9529a;
    }
}
