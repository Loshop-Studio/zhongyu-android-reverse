package androidx.compose.animation;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.graphics.Path;
import androidx.compose.p014ui.graphics.Shape;
import androidx.compose.p014ui.layout.ContentScale;
import androidx.compose.p014ui.layout.LookaheadScope;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.p014ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;

@ExperimentalSharedTransitionApi
@Stable
/* loaded from: classes.dex */
public interface SharedTransitionScope extends LookaheadScope {

    public interface OverlayClip {
        Path getClipPath(SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density);
    }

    public interface PlaceHolderSize {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final PlaceHolderSize animatedSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$animatedSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo26817calculateSizeJyjRU_E(long j10, long j11) {
                    return j11;
                }
            };
            private static final PlaceHolderSize contentSize = new PlaceHolderSize() { // from class: androidx.compose.animation.SharedTransitionScope$PlaceHolderSize$Companion$contentSize$1
                @Override // androidx.compose.animation.SharedTransitionScope.PlaceHolderSize
                /* renamed from: calculateSize-JyjRU_E */
                public final long mo26817calculateSizeJyjRU_E(long j10, long j11) {
                    return j10;
                }
            };

            private Companion() {
            }

            public final PlaceHolderSize getAnimatedSize() {
                return animatedSize;
            }

            public final PlaceHolderSize getContentSize() {
                return contentSize;
            }
        }

        /* renamed from: calculateSize-JyjRU_E, reason: not valid java name */
        long mo26817calculateSizeJyjRU_E(long j10, long j11);
    }

    public interface ResizeMode {
        public static final Companion Companion = Companion.$$INSTANCE;

        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static final ResizeMode RemeasureToBounds = RemeasureImpl.INSTANCE;

            private Companion() {
            }

            public static /* synthetic */ ResizeMode ScaleToBounds$default(Companion companion, ContentScale contentScale, Alignment alignment, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    contentScale = ContentScale.Companion.getFillWidth();
                }
                if ((i10 & 2) != 0) {
                    alignment = Alignment.Companion.getCenter();
                }
                return companion.ScaleToBounds(contentScale, alignment);
            }

            public final ResizeMode ScaleToBounds(ContentScale contentScale, Alignment alignment) {
                return SharedTransitionScopeKt.ScaleToBoundsCached(contentScale, alignment);
            }

            public final ResizeMode getRemeasureToBounds() {
                return RemeasureToBounds;
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class SharedContentState {
        public static final int $stable = 8;
        private final MutableState internalState$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        private final Object key;

        public SharedContentState(Object obj) {
            this.key = obj;
        }

        private final SharedElementInternalState getNonNullInternalState() {
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release != null) {
                return internalState$animation_release;
            }
            throw new IllegalArgumentException("Error: SharedContentState has not been added to a sharedElement/sharedBoundsmodifier yet. Therefore the internal state has not bee initialized.");
        }

        public final Path getClipPathInOverlay() {
            return getNonNullInternalState().getClipPathInOverlay$animation_release();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final SharedElementInternalState getInternalState$animation_release() {
            return (SharedElementInternalState) this.internalState$delegate.getValue();
        }

        public final Object getKey() {
            return this.key;
        }

        public final SharedContentState getParentSharedContentState() {
            SharedElementInternalState parentState = getNonNullInternalState().getParentState();
            if (parentState != null) {
                return parentState.getUserState();
            }
            return null;
        }

        public final boolean isMatchFound() {
            SharedElement sharedElement;
            SharedElementInternalState internalState$animation_release = getInternalState$animation_release();
            if (internalState$animation_release == null || (sharedElement = internalState$animation_release.getSharedElement()) == null) {
                return false;
            }
            return sharedElement.getFoundMatch();
        }

        public final void setInternalState$animation_release(SharedElementInternalState sharedElementInternalState) {
            this.internalState$delegate.setValue(sharedElementInternalState);
        }
    }

    static /* synthetic */ Modifier renderInSharedTransitionScopeOverlay$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderInSharedTransitionScopeOverlay");
        }
        if ((i10 & 1) != 0) {
            interfaceC9529a = new InterfaceC9529a() { // from class: androidx.compose.animation.SharedTransitionScope.renderInSharedTransitionScopeOverlay.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public final Boolean invoke() {
                    return Boolean.valueOf(SharedTransitionScope.this.isTransitionActive());
                }
            };
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            interfaceC9544p = SharedTransitionScopeKt.DefaultClipInOverlayDuringTransition;
        }
        return sharedTransitionScope.renderInSharedTransitionScopeOverlay(modifier, interfaceC9529a, f10, interfaceC9544p);
    }

    static /* synthetic */ EnterTransition scaleInSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleInSharedContentToBounds");
        }
        if ((i10 & 1) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleInSharedContentToBounds(contentScale, alignment);
    }

    static /* synthetic */ ExitTransition scaleOutSharedContentToBounds$default(SharedTransitionScope sharedTransitionScope, ContentScale contentScale, Alignment alignment, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scaleOutSharedContentToBounds");
        }
        if ((i10 & 1) != 0) {
            contentScale = ContentScale.Companion.getFit();
        }
        if ((i10 & 2) != 0) {
            alignment = Alignment.Companion.getCenter();
        }
        return sharedTransitionScope.scaleOutSharedContentToBounds(contentScale, alignment);
    }

    static /* synthetic */ Modifier sharedBounds$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z10, float f10, OverlayClip overlayClip, int i10, Object obj) {
        if (obj == null) {
            return sharedTransitionScope.sharedBounds(modifier, sharedContentState, animatedVisibilityScope, (i10 & 4) != 0 ? EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null) : enterTransition, (i10 & 8) != 0 ? EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null) : exitTransition, (i10 & 16) != 0 ? SharedTransitionScopeKt.DefaultBoundsTransform : boundsTransform, (i10 & 32) != 0 ? ResizeMode.Companion.ScaleToBounds(ContentScale.Companion.getFillWidth(), Alignment.Companion.getCenter()) : resizeMode, (i10 & 64) != 0 ? PlaceHolderSize.Companion.getContentSize() : placeHolderSize, (i10 & 128) != 0 ? true : z10, (i10 & 256) != 0 ? 0.0f : f10, (i10 & 512) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedBounds");
    }

    static /* synthetic */ Modifier sharedElement$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z10, float f10, OverlayClip overlayClip, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElement");
        }
        if ((i10 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i10 & 8) != 0) {
            placeHolderSize = PlaceHolderSize.Companion.getContentSize();
        }
        return sharedTransitionScope.sharedElement(modifier, sharedContentState, animatedVisibilityScope, boundsTransform2, placeHolderSize, (i10 & 16) != 0 ? true : z10, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    static /* synthetic */ Modifier sharedElementWithCallerManagedVisibility$default(SharedTransitionScope sharedTransitionScope, Modifier modifier, SharedContentState sharedContentState, boolean z10, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z11, float f10, OverlayClip overlayClip, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sharedElementWithCallerManagedVisibility");
        }
        if ((i10 & 4) != 0) {
            boundsTransform = SharedTransitionScopeKt.DefaultBoundsTransform;
        }
        BoundsTransform boundsTransform2 = boundsTransform;
        if ((i10 & 8) != 0) {
            placeHolderSize = PlaceHolderSize.Companion.getContentSize();
        }
        return sharedTransitionScope.sharedElementWithCallerManagedVisibility(modifier, sharedContentState, z10, boundsTransform2, placeHolderSize, (i10 & 16) != 0 ? true : z11, (i10 & 32) != 0 ? 0.0f : f10, (i10 & 64) != 0 ? SharedTransitionScopeKt.ParentClip : overlayClip);
    }

    OverlayClip OverlayClip(Shape shape);

    boolean isTransitionActive();

    @Composable
    SharedContentState rememberSharedContentState(Object obj, Composer composer, int i10);

    Modifier renderInSharedTransitionScopeOverlay(Modifier modifier, InterfaceC9529a interfaceC9529a, float f10, InterfaceC9544p interfaceC9544p);

    @InterfaceC10770a
    default EnterTransition scaleInSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(EnterTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    @InterfaceC10770a
    default ExitTransition scaleOutSharedContentToBounds(ContentScale contentScale, Alignment alignment) {
        return EnterExitTransitionKt.withEffect(ExitTransition.Companion.getNone(), new ContentScaleTransitionEffect(contentScale, alignment));
    }

    Modifier sharedBounds(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, EnterTransition enterTransition, ExitTransition exitTransition, BoundsTransform boundsTransform, ResizeMode resizeMode, PlaceHolderSize placeHolderSize, boolean z10, float f10, OverlayClip overlayClip);

    Modifier sharedElement(Modifier modifier, SharedContentState sharedContentState, AnimatedVisibilityScope animatedVisibilityScope, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z10, float f10, OverlayClip overlayClip);

    Modifier sharedElementWithCallerManagedVisibility(Modifier modifier, SharedContentState sharedContentState, boolean z10, BoundsTransform boundsTransform, PlaceHolderSize placeHolderSize, boolean z11, float f10, OverlayClip overlayClip);

    Modifier skipToLookaheadSize(Modifier modifier);
}
