package androidx.compose.p013ui.draw;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class DrawWithCacheElement extends ModifierNodeElement<CacheDrawModifierNodeImpl> {
    private final InterfaceC10570l onBuildDrawCache;

    public DrawWithCacheElement(InterfaceC10570l interfaceC10570l) {
        this.onBuildDrawCache = interfaceC10570l;
    }

    public static /* synthetic */ DrawWithCacheElement copy$default(DrawWithCacheElement drawWithCacheElement, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = drawWithCacheElement.onBuildDrawCache;
        }
        return drawWithCacheElement.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.onBuildDrawCache;
    }

    public final DrawWithCacheElement copy(InterfaceC10570l interfaceC10570l) {
        return new DrawWithCacheElement(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DrawWithCacheElement) && AbstractC9133u.m16128b(this.onBuildDrawCache, ((DrawWithCacheElement) obj).onBuildDrawCache);
    }

    public final InterfaceC10570l getOnBuildDrawCache() {
        return this.onBuildDrawCache;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onBuildDrawCache.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("drawWithCache");
        inspectorInfo.getProperties().set("onBuildDrawCache", this.onBuildDrawCache);
    }

    public String toString() {
        return "DrawWithCacheElement(onBuildDrawCache=" + this.onBuildDrawCache + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public CacheDrawModifierNodeImpl create() {
        return new CacheDrawModifierNodeImpl(new CacheDrawScope(), this.onBuildDrawCache);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(CacheDrawModifierNodeImpl cacheDrawModifierNodeImpl) {
        cacheDrawModifierNodeImpl.setBlock(this.onBuildDrawCache);
    }
}
