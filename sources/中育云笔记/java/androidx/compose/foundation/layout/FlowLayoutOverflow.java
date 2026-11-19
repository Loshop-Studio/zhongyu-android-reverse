package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p425yc.InterfaceC11943a;

@StabilityInferred(parameters = 1)
@InterfaceC10770a
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;
    private final InterfaceC9540l collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private final InterfaceC9540l seeMoreGetter;
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OverflowType {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ OverflowType[] $VALUES;
        public static final OverflowType Visible = new OverflowType("Visible", 0);
        public static final OverflowType Clip = new OverflowType("Clip", 1);
        public static final OverflowType ExpandIndicator = new OverflowType("ExpandIndicator", 2);
        public static final OverflowType ExpandOrCollapseIndicator = new OverflowType("ExpandOrCollapseIndicator", 3);

        private static final /* synthetic */ OverflowType[] $values() {
            return new OverflowType[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
        }

        static {
            OverflowType[] overflowTypeArr$values = $values();
            $VALUES = overflowTypeArr$values;
            $ENTRIES = AbstractC9953a.m20230a(overflowTypeArr$values);
        }

        private OverflowType(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, AbstractC9972n abstractC9972n) {
        this(overflowType, i10, i11, interfaceC9540l, interfaceC9540l2);
    }

    public final void addOverflowComposables$foundation_layout_release(FlowLayoutOverflowState flowLayoutOverflowState, List<InterfaceC9544p> list) {
        InterfaceC9540l interfaceC9540l = this.seeMoreGetter;
        InterfaceC9544p interfaceC9544p = interfaceC9540l != null ? (InterfaceC9544p) interfaceC9540l.invoke(flowLayoutOverflowState) : null;
        InterfaceC9540l interfaceC9540l2 = this.collapseGetter;
        InterfaceC9544p interfaceC9544p2 = interfaceC9540l2 != null ? (InterfaceC9544p) interfaceC9540l2.invoke(flowLayoutOverflowState) : null;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i10 == 1) {
            if (interfaceC9544p != null) {
                list.add(interfaceC9544p);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (interfaceC9544p != null) {
                list.add(interfaceC9544p);
            }
            if (interfaceC9544p2 != null) {
                list.add(interfaceC9544p2);
            }
        }
    }

    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    public final OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    private FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
        this.seeMoreGetter = interfaceC9540l;
        this.collapseGetter = interfaceC9540l2;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i10, int i11, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i12, AbstractC9972n abstractC9972n) {
        this(overflowType, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? null : interfaceC9540l, (i12 & 16) != 0 ? null : interfaceC9540l2, null);
    }
}
