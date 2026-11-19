package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.graphics.GraphicsContext;
import androidx.compose.p014ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.DelegatableNodeKt;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import androidx.compose.p014ui.node.NodeKind;
import androidx.compose.p014ui.node.ObserverModifierNode;
import androidx.compose.p014ui.node.ObserverModifierNodeKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.IntSizeKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class CacheDrawModifierNodeImpl extends Modifier.Node implements CacheDrawModifierNode, ObserverModifierNode, BuildDrawCacheParams {
    private InterfaceC9540l block;
    private final CacheDrawScope cacheDrawScope;
    private ScopedGraphicsContext cachedGraphicsContext;
    private boolean isCacheValid;

    public CacheDrawModifierNodeImpl(CacheDrawScope cacheDrawScope, InterfaceC9540l interfaceC9540l) {
        this.cacheDrawScope = cacheDrawScope;
        this.block = interfaceC9540l;
        cacheDrawScope.setCacheParams$ui_release(this);
        cacheDrawScope.setGraphicsContextProvider$ui_release(new InterfaceC9529a() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl.1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final GraphicsContext invoke() {
                return CacheDrawModifierNodeImpl.this.getGraphicsContext();
            }
        });
    }

    private final DrawResult getOrBuildCachedDrawBlock(ContentDrawScope contentDrawScope) {
        if (!this.isCacheValid) {
            final CacheDrawScope cacheDrawScope = this.cacheDrawScope;
            cacheDrawScope.setDrawResult$ui_release(null);
            cacheDrawScope.setContentDrawScope$ui_release(contentDrawScope);
            ObserverModifierNodeKt.observeReads(this, new InterfaceC9529a() { // from class: androidx.compose.ui.draw.CacheDrawModifierNodeImpl$getOrBuildCachedDrawBlock$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m30489invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m30489invoke() {
                    this.this$0.getBlock().invoke(cacheDrawScope);
                }
            });
            if (cacheDrawScope.getDrawResult$ui_release() == null) {
                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("DrawResult not defined, did you forget to call onDraw?");
                throw new KotlinNothingValueException();
            }
            this.isCacheValid = true;
        }
        DrawResult drawResult$ui_release = this.cacheDrawScope.getDrawResult$ui_release();
        AbstractC9979u.m20291d(drawResult$ui_release);
        return drawResult$ui_release;
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        getOrBuildCachedDrawBlock(contentDrawScope).getBlock$ui_release().invoke(contentDrawScope);
    }

    public final InterfaceC9540l getBlock() {
        return this.block;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public Density getDensity() {
        return DelegatableNodeKt.requireDensity(this);
    }

    public final GraphicsContext getGraphicsContext() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext == null) {
            scopedGraphicsContext = new ScopedGraphicsContext();
            this.cachedGraphicsContext = scopedGraphicsContext;
        }
        if (scopedGraphicsContext.getGraphicsContext() == null) {
            scopedGraphicsContext.setGraphicsContext(DelegatableNodeKt.requireGraphicsContext(this));
        }
        return scopedGraphicsContext;
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    public LayoutDirection getLayoutDirection() {
        return DelegatableNodeKt.requireLayoutDirection(this);
    }

    @Override // androidx.compose.p014ui.draw.BuildDrawCacheParams
    /* renamed from: getSize-NH-jbRc */
    public long mo30488getSizeNHjbRc() {
        return IntSizeKt.m33684toSizeozmzZPI(DelegatableNodeKt.m32356requireCoordinator64DMado(this, NodeKind.m32510constructorimpl(128)).mo32237getSizeYbymL2g());
    }

    @Override // androidx.compose.p014ui.draw.CacheDrawModifierNode
    public void invalidateDrawCache() {
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
        this.isCacheValid = false;
        this.cacheDrawScope.setDrawResult$ui_release(null);
        DrawModifierNodeKt.invalidateDraw(this);
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode, androidx.compose.p014ui.node.PointerInputModifierNode
    public void onDensityChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        ScopedGraphicsContext scopedGraphicsContext = this.cachedGraphicsContext;
        if (scopedGraphicsContext != null) {
            scopedGraphicsContext.releaseGraphicsLayers();
        }
    }

    @Override // androidx.compose.p014ui.node.DelegatableNode
    public void onLayoutDirectionChange() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.p014ui.node.DrawModifierNode
    public void onMeasureResultChanged() {
        invalidateDrawCache();
    }

    @Override // androidx.compose.p014ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        invalidateDrawCache();
    }

    public final void setBlock(InterfaceC9540l interfaceC9540l) {
        this.block = interfaceC9540l;
        invalidateDrawCache();
    }
}
