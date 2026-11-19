package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB\u000f\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\rJ\u0010\u0010\u001b\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0088\u0001\t\u0092\u0001\u00020\n¨\u0006\u001f"}, m13558d2 = {"Landroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity;", "", "cursor", "", "constructor-impl", "(I)J", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "(ILandroidx/compose/foundation/text/input/internal/WedgeAffinity;)J", "value", "", "(J)J", "getCursor-impl", "(J)I", "getWedgeAffinity-impl", "(J)Landroidx/compose/foundation/text/input/internal/WedgeAffinity;", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,560:1\n80#2:561\n80#2:562\n85#2:563\n90#2:564\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/input/internal/selection/CursorAndWedgeAffinity\n*L\n527#1:561\n533#1:562\n544#1:563\n548#1:564\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAndWedgeAffinity {
    private final long value;

    @Metadata(m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
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

    private /* synthetic */ CursorAndWedgeAffinity(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CursorAndWedgeAffinity m18279boximpl(long j10) {
        return new CursorAndWedgeAffinity(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m18280component1impl(long j10) {
        return m18287getCursorimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final WedgeAffinity m18281component2impl(long j10) {
        return m18288getWedgeAffinityimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18284constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18285equalsimpl(long j10, Object obj) {
        return (obj instanceof CursorAndWedgeAffinity) && j10 == ((CursorAndWedgeAffinity) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18286equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCursor-impl, reason: not valid java name */
    public static final int m18287getCursorimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: getWedgeAffinity-impl, reason: not valid java name */
    public static final WedgeAffinity m18288getWedgeAffinityimpl(long j10) {
        int i10 = (int) (j10 & 4294967295L);
        if (i10 < 0) {
            return null;
        }
        return i10 == 0 ? WedgeAffinity.Start : WedgeAffinity.End;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18289hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18290toStringimpl(long j10) {
        return "CursorAndWedgeAffinity(value=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m18285equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m18289hashCodeimpl(this.value);
    }

    public String toString() {
        return m18290toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18282constructorimpl(int i10) {
        return m18284constructorimpl((i10 << 32) | ((-1) & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18283constructorimpl(int i10, WedgeAffinity wedgeAffinity) {
        int i11 = -1;
        int i12 = wedgeAffinity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
        if (i12 != -1) {
            i11 = 1;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return m18284constructorimpl((i10 << 32) | (i11 & 4294967295L));
    }
}
