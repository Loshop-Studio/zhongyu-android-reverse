package androidx.compose.p012ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u0000H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0005J\u001a\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0015\u0010\u0006\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, m13413d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "copyMaxDimensions", "copyMaxDimensions-msEJaDk", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n37#4,5:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,5\n*E\n"})
/* loaded from: classes2.dex */
public final class Constraints {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    @Metadata(m13412d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J?\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m13413d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "Infinity", "", "fitPrioritizingHeight", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingHeight-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "restrictConstraints", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "ui-unit_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n37#2,5:635\n37#2,5:640\n37#2,5:645\n465#3,6:650\n465#3,6:656\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,5\n231#1:640,5\n243#1:645,5\n305#1:650,6\n341#1:656,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m23954restrictConstraintsxF2OJ5Q$default(Companion companion, int i9, int i10, int i11, int i12, boolean z9, int i13, Object obj) {
            if ((i13 & 16) != 0) {
                z9 = true;
            }
            return companion.m23960restrictConstraintsxF2OJ5Q(i9, i10, i11, i12, z9);
        }

        @Stable
        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m23955fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i9 = 262142;
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int i10 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i10 >= 8191) {
                if (i10 < 32767) {
                    i9 = 65534;
                } else if (i10 < 65535) {
                    i9 = 32766;
                } else {
                    if (i10 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i10);
                        throw new KotlinNothingValueException();
                    }
                    i9 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i9, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(i9, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @Stable
        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m23956fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i9 = 262142;
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int i10 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i10 >= 8191) {
                if (i10 < 32767) {
                    i9 = 65534;
                } else if (i10 < 65535) {
                    i9 = 32766;
                } else {
                    if (i10 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i10);
                        throw new KotlinNothingValueException();
                    }
                    i9 = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i9, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(i9, maxHeight) : Integer.MAX_VALUE);
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m23957fixedJhjzzOo(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, height, height);
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m23958fixedHeightOenEA2s(int height) {
            if (!(height >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m23959fixedWidthOenEA2s(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        @Stable
        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m23960restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            return prioritizeWidth ? m23956fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight) : m23955fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j9) {
        this.value = j9;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m23934boximpl(long j9) {
        return new Constraints(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m23935constructorimpl(long j9) {
        return j9;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m23936copyZbe2FdA(long j9, int i9, int i10, int i11, int i12) {
        if (!(i10 >= i9 && i12 >= i11 && i9 >= 0 && i11 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i9, i10, i11, i12);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m23937copyZbe2FdA$default(long j9, int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = m23949getMinWidthimpl(j9);
        }
        int i14 = i9;
        if ((i13 & 2) != 0) {
            i10 = m23947getMaxWidthimpl(j9);
        }
        int i15 = i10;
        if ((i13 & 4) != 0) {
            i11 = m23948getMinHeightimpl(j9);
        }
        int i16 = i11;
        if ((i13 & 8) != 0) {
            i12 = m23946getMaxHeightimpl(j9);
        }
        return m23936copyZbe2FdA(j9, i14, i15, i16, i12);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m23938copyMaxDimensionsmsEJaDk(long j9) {
        return m23935constructorimpl(j9 & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23939equalsimpl(long j9, Object obj) {
        return (obj instanceof Constraints) && j9 == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23940equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m23941getFocusIndeximpl(long j9) {
        return (int) (j9 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m23942getHasBoundedHeightimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
        return (((int) (j9 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m23943getHasBoundedWidthimpl(long j9) {
        int i9 = (int) (3 & j9);
        return (((int) (j9 >> 33)) & ((1 << ((((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m23944getHasFixedHeightimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
        int i11 = (1 << (18 - i10)) - 1;
        int i12 = ((int) (j9 >> (i10 + 15))) & i11;
        int i13 = ((int) (j9 >> (i10 + 46))) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m23945getHasFixedWidthimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = (1 << ((((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3)) + 13)) - 1;
        int i11 = ((int) (j9 >> 2)) & i10;
        int i12 = ((int) (j9 >> 33)) & i10;
        return i11 == (i12 == 0 ? Integer.MAX_VALUE : i12 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m23946getMaxHeightimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
        int i11 = ((int) (j9 >> (i10 + 46))) & ((1 << (18 - i10)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m23947getMaxWidthimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((int) (j9 >> 33)) & ((1 << ((((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3)) + 13)) - 1);
        if (i10 == 0) {
            return Integer.MAX_VALUE;
        }
        return i10 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m23948getMinHeightimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
        return ((int) (j9 >> (i10 + 15))) & ((1 << (18 - i10)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m23949getMinWidthimpl(long j9) {
        int i9 = (int) (3 & j9);
        return ((int) (j9 >> 2)) & ((1 << ((((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3)) + 13)) - 1);
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23950hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m23951isZeroimpl(long j9) {
        int i9 = (int) (3 & j9);
        int i10 = ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
        return ((((int) (j9 >> 33)) & ((1 << (i10 + 13)) - 1)) - 1 == 0) | ((((int) (j9 >> (i10 + 46))) & ((1 << (18 - i10)) - 1)) - 1 == 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m23952toStringimpl(long j9) {
        int iM23947getMaxWidthimpl = m23947getMaxWidthimpl(j9);
        String strValueOf = iM23947getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM23947getMaxWidthimpl);
        int iM23946getMaxHeightimpl = m23946getMaxHeightimpl(j9);
        return "Constraints(minWidth = " + m23949getMinWidthimpl(j9) + ", maxWidth = " + strValueOf + ", minHeight = " + m23948getMinHeightimpl(j9) + ", maxHeight = " + (iM23946getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM23946getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m23939equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m23950hashCodeimpl(this.value);
    }

    public String toString() {
        return m23952toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
