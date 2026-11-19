package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.unit.IntOffset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @Immutable
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m26747constructorimpl(0);
        private static final int Right = m26747constructorimpl(1);

        /* renamed from: Up */
        private static final int f1050Up = m26747constructorimpl(2);
        private static final int Down = m26747constructorimpl(3);
        private static final int Start = m26747constructorimpl(4);
        private static final int End = m26747constructorimpl(5);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m26753getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m26754getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m26755getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m26756getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m26757getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m26758getUpDKzdypw() {
                return SlideDirection.f1050Up;
            }

            private Companion() {
            }
        }

        private /* synthetic */ SlideDirection(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m26746boximpl(int i10) {
            return new SlideDirection(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m26747constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m26748equalsimpl(int i10, Object obj) {
            return (obj instanceof SlideDirection) && i10 == ((SlideDirection) obj).m26752unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m26749equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m26750hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m26751toStringimpl(int i10) {
            return m26749equalsimpl0(i10, Left) ? "Left" : m26749equalsimpl0(i10, Right) ? "Right" : m26749equalsimpl0(i10, f1050Up) ? "Up" : m26749equalsimpl0(i10, Down) ? "Down" : m26749equalsimpl0(i10, Start) ? "Start" : m26749equalsimpl0(i10, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m26748equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m26750hashCodeimpl(this.value);
        }

        public String toString() {
            return m26751toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m26752unboximpl() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m26742slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo26744slideIntoContainermOhB8PU(i10, finiteAnimationSpec, interfaceC9540l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m26743slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, InterfaceC9540l interfaceC9540l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m33620boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo26745slideOutOfContainermOhB8PU(i10, finiteAnimationSpec, interfaceC9540l);
    }

    Alignment getContentAlignment();

    default ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation_release();
    }

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo26744slideIntoContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC9540l interfaceC9540l);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo26745slideOutOfContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC9540l interfaceC9540l);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);
}
