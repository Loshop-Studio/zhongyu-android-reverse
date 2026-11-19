package androidx.compose.p014ui.node;

import kotlin.enums.AbstractC9953a;
import p425yc.InterfaceC11943a;

/* loaded from: classes2.dex */
public interface TraversableNode extends DelegatableNode {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class TraverseDescendantsAction {
            private static final /* synthetic */ InterfaceC11943a $ENTRIES;
            private static final /* synthetic */ TraverseDescendantsAction[] $VALUES;
            public static final TraverseDescendantsAction ContinueTraversal = new TraverseDescendantsAction("ContinueTraversal", 0);
            public static final TraverseDescendantsAction SkipSubtreeAndContinueTraversal = new TraverseDescendantsAction("SkipSubtreeAndContinueTraversal", 1);
            public static final TraverseDescendantsAction CancelTraversal = new TraverseDescendantsAction("CancelTraversal", 2);

            private static final /* synthetic */ TraverseDescendantsAction[] $values() {
                return new TraverseDescendantsAction[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
            }

            static {
                TraverseDescendantsAction[] traverseDescendantsActionArr$values = $values();
                $VALUES = traverseDescendantsActionArr$values;
                $ENTRIES = AbstractC9953a.m20230a(traverseDescendantsActionArr$values);
            }

            private TraverseDescendantsAction(String str, int i10) {
            }

            public static InterfaceC11943a getEntries() {
                return $ENTRIES;
            }

            public static TraverseDescendantsAction valueOf(String str) {
                return (TraverseDescendantsAction) Enum.valueOf(TraverseDescendantsAction.class, str);
            }

            public static TraverseDescendantsAction[] values() {
                return (TraverseDescendantsAction[]) $VALUES.clone();
            }
        }

        private Companion() {
        }
    }

    Object getTraverseKey();
}
