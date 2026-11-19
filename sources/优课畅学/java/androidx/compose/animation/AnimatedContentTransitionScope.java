package androidx.compose.animation;

import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.p013ui.Alignment;
import androidx.compose.p013ui.unit.IntOffset;
import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
public interface AnimatedContentTransitionScope<S> extends Transition.Segment<S> {

    @Immutable
    public static final class SlideDirection {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Left = m20145constructorimpl(0);
        private static final int Right = m20145constructorimpl(1);

        /* renamed from: Up */
        private static final int f1120Up = m20145constructorimpl(2);
        private static final int Down = m20145constructorimpl(3);
        private static final int Start = m20145constructorimpl(4);
        private static final int End = m20145constructorimpl(5);

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            /* renamed from: getDown-DKzdypw, reason: not valid java name */
            public final int m20151getDownDKzdypw() {
                return SlideDirection.Down;
            }

            /* renamed from: getEnd-DKzdypw, reason: not valid java name */
            public final int m20152getEndDKzdypw() {
                return SlideDirection.End;
            }

            /* renamed from: getLeft-DKzdypw, reason: not valid java name */
            public final int m20153getLeftDKzdypw() {
                return SlideDirection.Left;
            }

            /* renamed from: getRight-DKzdypw, reason: not valid java name */
            public final int m20154getRightDKzdypw() {
                return SlideDirection.Right;
            }

            /* renamed from: getStart-DKzdypw, reason: not valid java name */
            public final int m20155getStartDKzdypw() {
                return SlideDirection.Start;
            }

            /* renamed from: getUp-DKzdypw, reason: not valid java name */
            public final int m20156getUpDKzdypw() {
                return SlideDirection.f1120Up;
            }

            private Companion() {
            }
        }

        private /* synthetic */ SlideDirection(int i10) {
            this.value = i10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ SlideDirection m20144boximpl(int i10) {
            return new SlideDirection(i10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m20145constructorimpl(int i10) {
            return i10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m20146equalsimpl(int i10, Object obj) {
            return (obj instanceof SlideDirection) && i10 == ((SlideDirection) obj).m20150unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m20147equalsimpl0(int i10, int i11) {
            return i10 == i11;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m20148hashCodeimpl(int i10) {
            return Integer.hashCode(i10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m20149toStringimpl(int i10) {
            return m20147equalsimpl0(i10, Left) ? "Left" : m20147equalsimpl0(i10, Right) ? "Right" : m20147equalsimpl0(i10, f1120Up) ? "Up" : m20147equalsimpl0(i10, Down) ? "Down" : m20147equalsimpl0(i10, Start) ? "Start" : m20147equalsimpl0(i10, End) ? "End" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m20146equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return m20148hashCodeimpl(this.value);
        }

        public String toString() {
            return m20149toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m20150unboximpl() {
            return this.value;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideIntoContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ EnterTransition m20140slideIntoContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m27018boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideIntoContainer$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo20142slideIntoContainermOhB8PU(i10, finiteAnimationSpec, interfaceC10570l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: slideOutOfContainer-mOhB8PU$default, reason: not valid java name */
    static /* synthetic */ ExitTransition m20141slideOutOfContainermOhB8PU$default(AnimatedContentTransitionScope animatedContentTransitionScope, int i10, FiniteAnimationSpec finiteAnimationSpec, InterfaceC10570l interfaceC10570l, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m27018boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 3, null);
        }
        if ((i11 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.animation.AnimatedContentTransitionScope$slideOutOfContainer$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf(i12);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    return invoke(((Number) obj2).intValue());
                }
            };
        }
        return animatedContentTransitionScope.mo20143slideOutOfContainermOhB8PU(i10, finiteAnimationSpec, interfaceC10570l);
    }

    Alignment getContentAlignment();

    default ExitTransition getKeepUntilTransitionsFinished(ExitTransition.Companion companion) {
        return companion.getKeepUntilTransitionsFinished$animation_release();
    }

    /* renamed from: slideIntoContainer-mOhB8PU, reason: not valid java name */
    EnterTransition mo20142slideIntoContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC10570l interfaceC10570l);

    /* renamed from: slideOutOfContainer-mOhB8PU, reason: not valid java name */
    ExitTransition mo20143slideOutOfContainermOhB8PU(int i10, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, InterfaceC10570l interfaceC10570l);

    ContentTransform using(ContentTransform contentTransform, SizeTransform sizeTransform);
}
