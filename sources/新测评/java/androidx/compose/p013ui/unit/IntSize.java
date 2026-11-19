package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0014\u0010\u000bJ\u001e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u000bJ\u001e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u001b\u0010\u0006\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u00078Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\u0088\u0001\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, m13558d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)I", "getPackedValue", "()J", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "div", "other", "div-YEO4UFw", "(JI)J", "equals", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "times", "times-YEO4UFw", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nIntSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,122:1\n54#1:125\n59#1:127\n54#1:143\n59#1:145\n85#2:123\n90#2:124\n85#2:126\n90#2:128\n85#2,6:129\n80#2:135\n85#2,6:136\n80#2:142\n85#2:144\n90#2:146\n*S KotlinDebug\n*F\n+ 1 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n61#1:125\n63#1:127\n75#1:143\n75#1:145\n54#1:123\n59#1:124\n61#1:126\n63#1:128\n68#1:129,6\n68#1:135\n73#1:136,6\n73#1:142\n75#1:144\n75#1:146\n*E\n"})
/* loaded from: classes2.dex */
public final class IntSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = m23727constructorimpl(0);
    private final long packedValue;

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntSize;", "getZero-YbymL2g", "()J", "J", "ui-unit_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m23737getZeroYbymL2g() {
            return IntSize.Zero;
        }

        private Companion() {
        }
    }

    @PublishedApi
    private /* synthetic */ IntSize(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ IntSize m23724boximpl(long j10) {
        return new IntSize(j10);
    }

    @Stable
    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m23725component1impl(long j10) {
        return (int) (j10 >> 32);
    }

    @Stable
    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m23726component2impl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    @PublishedApi
    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23727constructorimpl(long j10) {
        return j10;
    }

    @Stable
    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m23728divYEO4UFw(long j10, int i10) {
        return m23727constructorimpl(((((int) (j10 >> 32)) / i10) << 32) | ((((int) (j10 & 4294967295L)) / i10) & 4294967295L));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23729equalsimpl(long j10, Object obj) {
        return (obj instanceof IntSize) && j10 == ((IntSize) obj).m23736unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23730equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    @Stable
    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m23731getHeightimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    @Stable
    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m23732getWidthimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23733hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m23734timesYEO4UFw(long j10, int i10) {
        return m23727constructorimpl(((((int) (j10 >> 32)) * i10) << 32) | ((((int) (j10 & 4294967295L)) * i10) & 4294967295L));
    }

    @Stable
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23735toStringimpl(long j10) {
        return ((int) (j10 >> 32)) + " x " + ((int) (j10 & 4294967295L));
    }

    public boolean equals(Object obj) {
        return m23729equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m23733hashCodeimpl(this.packedValue);
    }

    @Stable
    public String toString() {
        return m23735toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m23736unboximpl() {
        return this.packedValue;
    }
}
