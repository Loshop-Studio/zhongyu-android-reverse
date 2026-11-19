package androidx.compose.p014ui.draw;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {
    private final InterfaceC9540l onBuildDrawCache;

    public DrawWithCacheElement(InterfaceC9540l interfaceC9540l) {
        this.onBuildDrawCache = interfaceC9540l;
    }

    public static /* synthetic */ DrawWithCacheElement copy$default(DrawWithCacheElement drawWithCacheElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = drawWithCacheElement.onBuildDrawCache;
        }
        return drawWithCacheElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onBuildDrawCache;
    }

    public final DrawWithCacheElement copy(InterfaceC9540l interfaceC9540l) {
        return new DrawWithCacheElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC9979u.m20289b(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    public final InterfaceC9540l getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.onBuildDrawCache);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
