package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB\u000f\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\t\u0092\u0001\u00020\n¨\u0006\u001f"}, m5110d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "cursor", "", "constructor-impl", "(I)J", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "value", "", "(J)J", "getCursor-impl", "(J)I", "getWedgeAffinity-impl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n80#2:561\n80#2:562\n85#2:563\n90#2:564\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n527#1:561\n533#1:562\n544#1:563\n548#1:564\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    @Metadata(m5111k = 3, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WedgeAffinity.values().length];
            try {
                iArr[WedgeAffinity.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WedgeAffinity.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private /* synthetic */ CursorAndWedgeAffinity(long j7) {
        this.value = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m7896boximpl(long j7) {
        return new CursorAndWedgeAffinity(j7);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m7897component1impl(long j7) {
        return m7904getCursorimpl(j7);
    }

    @Nullable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m7898component2impl(long j7) {
        return m7905getWedgeAffinityimpl(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7901constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7902equalsimpl(long j7, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j7 == ((CursorAndWedgeAffinity) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7903equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m7904getCursorimpl(long j7) {
        return (int) (j7 >> 32);
    }

    @Nullable
    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m7905getWedgeAffinityimpl(long j7) {
        int i = (int) (j7 & 4294967295L);
        if (i < 0) {
            return null;
        }
        return i == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7906hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7907toStringimpl(long j7) {
        return "CursorAndWedgeAffinity(value=" + j7 + ')';
    }

    public boolean equals(Object obj) {
        return m7902equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7906hashCodeimpl(this.value);
    }

    public String toString() {
        return m7907toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7899constructorimpl(int i) {
        return m7901constructorimpl((i << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7900constructorimpl(int i, @Nullable WedgeAffinity wedgeAffinity) {
        int i8 = -1;
        int i9 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i9 != -1) {
            i8 = 1;
            if (i9 == 1) {
                i8 = 0;
            } else if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return m7901constructorimpl((i << 32) | (i8 & 4294967295L));
    }
}
