package androidx.compose.animation;

import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.layout.ContentScale;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ContentScaleTransitionEffect extends TransitionEffect {
    public static final int $stable = 0;
    public static final Key Key = new Key(null);
    private final Alignment alignment;
    private final ContentScale contentScale;

    public static final class Key implements TransitionEffectKey<ContentScaleTransitionEffect> {
        public /* synthetic */ Key(AbstractC9126n abstractC9126n) {
            this();
        }

        private Key() {
        }
    }

    public ContentScaleTransitionEffect(ContentScale contentScale, Alignment alignment) {
        super(null);
        this.contentScale = contentScale;
        this.alignment = alignment;
    }

    public static /* synthetic */ ContentScaleTransitionEffect copy$default(ContentScaleTransitionEffect contentScaleTransitionEffect, ContentScale contentScale, Alignment alignment, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contentScale = contentScaleTransitionEffect.contentScale;
        }
        if ((i10 & 2) != 0) {
            alignment = contentScaleTransitionEffect.alignment;
        }
        return contentScaleTransitionEffect.copy(contentScale, alignment);
    }

    public final ContentScale component1() {
        return this.contentScale;
    }

    public final Alignment component2() {
        return this.alignment;
    }

    public final ContentScaleTransitionEffect copy(ContentScale contentScale, Alignment alignment) {
        return new ContentScaleTransitionEffect(contentScale, alignment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentScaleTransitionEffect)) {
            return false;
        }
        ContentScaleTransitionEffect contentScaleTransitionEffect = (ContentScaleTransitionEffect) obj;
        return AbstractC9133u.m16128b(this.contentScale, contentScaleTransitionEffect.contentScale) && AbstractC9133u.m16128b(this.alignment, contentScaleTransitionEffect.alignment);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    @Override // androidx.compose.animation.TransitionEffect
    public TransitionEffectKey<?> getKey$animation_release() {
        return Key;
    }

    public int hashCode() {
        return (this.contentScale.hashCode() * 31) + this.alignment.hashCode();
    }

    public String toString() {
        return "ContentScaleTransitionEffect(contentScale=" + this.contentScale + ", alignment=" + this.alignment + ')';
    }
}
