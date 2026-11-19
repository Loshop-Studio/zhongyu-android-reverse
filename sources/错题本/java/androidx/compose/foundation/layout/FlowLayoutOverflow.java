package androidx.compose.foundation.layout;

import android.view.serialization.ClassDiscriminatorModeKt;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p092j6.InterfaceC5748a;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001 B\u0089\u0001\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u00120\b\u0002\u0010\u000f\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007\u00120\b\u0002\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0017\u0010\u0017\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e0\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR<\u0010\u000f\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR<\u0010\u0010\u001a*\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\b\u000e\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001f\u0082\u0001\u0004!\"#$¨\u0006%"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "state", "Lkotlin/Function0;", "Ld6/s;", "Landroidx/compose/runtime/Composable;", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILr6/c;Lr6/c;)V", "createOverflowState$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "createOverflowState", "", "list", "addOverflowComposables$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLayoutOverflowState;Ljava/util/List;)V", "addOverflowComposables", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "I", "Lr6/c;", "OverflowType", "Landroidx/compose/foundation/layout/ContextualFlowColumnOverflow;", "Landroidx/compose/foundation/layout/ContextualFlowRowOverflow;", "Landroidx/compose/foundation/layout/FlowColumnOverflow;", "Landroidx/compose/foundation/layout/FlowRowOverflow;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Deprecated(message = "FlowLayout overflow is no longer maintained")
@SourceDebugExtension({"SMAP\nFlowLayoutOverflow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayoutOverflow.kt\nandroidx/compose/foundation/layout/FlowLayoutOverflow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,869:1\n1#2:870\n*E\n"})
/* loaded from: classes.dex */
public abstract class FlowLayoutOverflow {
    public static final int $stable = 0;

    @Nullable
    private final InterfaceC6471c collapseGetter;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;

    @Nullable
    private final InterfaceC6471c seeMoreGetter;

    @NotNull
    private final OverflowType type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m5110d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "(Ljava/lang/String;I)V", "Visible", "Clip", "ExpandIndicator", "ExpandOrCollapseIndicator", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class OverflowType {
        private static final /* synthetic */ InterfaceC5748a $ENTRIES;
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
            $ENTRIES = AbstractC5817a.m5310a(overflowTypeArr$values);
        }

        private OverflowType(String str, int i) {
        }

        @NotNull
        public static InterfaceC5748a getEntries() {
            return $ENTRIES;
        }

        public static OverflowType valueOf(String str) {
            return (OverflowType) Enum.valueOf(OverflowType.class, str);
        }

        public static OverflowType[] values() {
            return (OverflowType[]) $VALUES.clone();
        }
    }

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, AbstractC5824e abstractC5824e) {
        this(overflowType, i, i8, interfaceC6471c, interfaceC6471c2);
    }

    public final void addOverflowComposables$foundation_layout_release(@NotNull FlowLayoutOverflowState state, @NotNull List<InterfaceC6473e> list) {
        InterfaceC6471c interfaceC6471c = this.seeMoreGetter;
        InterfaceC6473e interfaceC6473e = interfaceC6471c != null ? (InterfaceC6473e) interfaceC6471c.invoke(state) : null;
        InterfaceC6471c interfaceC6471c2 = this.collapseGetter;
        InterfaceC6473e interfaceC6473e2 = interfaceC6471c2 != null ? (InterfaceC6473e) interfaceC6471c2.invoke(state) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (interfaceC6473e != null) {
                list.add(interfaceC6473e);
            }
        } else {
            if (i != 2) {
                return;
            }
            if (interfaceC6473e != null) {
                list.add(interfaceC6473e);
            }
            if (interfaceC6473e2 != null) {
                list.add(interfaceC6473e2);
            }
        }
    }

    @NotNull
    public final FlowLayoutOverflowState createOverflowState$foundation_layout_release() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    @NotNull
    /* renamed from: getType$foundation_layout_release, reason: from getter */
    public final OverflowType getType() {
        return this.type;
    }

    private FlowLayoutOverflow(OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i8;
        this.seeMoreGetter = interfaceC6471c;
        this.collapseGetter = interfaceC6471c2;
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i8, InterfaceC6471c interfaceC6471c, InterfaceC6471c interfaceC6471c2, int i9, AbstractC5824e abstractC5824e) {
        this(overflowType, (i9 & 2) != 0 ? 0 : i, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? null : interfaceC6471c, (i9 & 16) != 0 ? null : interfaceC6471c2, null);
    }
}
