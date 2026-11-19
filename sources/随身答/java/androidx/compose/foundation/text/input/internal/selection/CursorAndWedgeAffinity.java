package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB\u000f\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\t\u0092\u0001\u00020\n¨\u0006\u001f"}, m13413d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "cursor", "", "constructor-impl", "(I)J", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "value", "", "(J)J", "getCursor-impl", "(J)I", "getWedgeAffinity-impl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n80#2:561\n80#2:562\n85#2:563\n90#2:564\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n527#1:561\n533#1:562\n544#1:563\n548#1:564\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    @Metadata(m13414k = 3, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    private /* synthetic */ CursorAndWedgeAffinity(long j9) {
        this.value = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m18712boximpl(long j9) {
        return new CursorAndWedgeAffinity(j9);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m18713component1impl(long j9) {
        return m18720getCursorimpl(j9);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m18714component2impl(long j9) {
        return m18721getWedgeAffinityimpl(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18717constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18718equalsimpl(long j9, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j9 == ((CursorAndWedgeAffinity) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18719equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m18720getCursorimpl(long j9) {
        return (int) (j9 >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m18721getWedgeAffinityimpl(long j9) {
        int i9 = (int) (j9 & 4294967295L);
        if (i9 < 0) {
            return null;
        }
        return i9 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18722hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18723toStringimpl(long j9) {
        return "CursorAndWedgeAffinity(value=" + j9 + ')';
    }

    public boolean equals(Object obj) {
        return m18718equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m18722hashCodeimpl(this.value);
    }

    public String toString() {
        return m18723toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18715constructorimpl(int i9) {
        return m18717constructorimpl((i9 << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18716constructorimpl(int i9, WedgeAffinity wedgeAffinity) {
        int i10 = -1;
        int i11 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i11 != -1) {
            i10 = 1;
            if (i11 == 1) {
                i10 = 0;
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return m18717constructorimpl((i9 << 32) | (i10 & 4294967295L));
    }
}
