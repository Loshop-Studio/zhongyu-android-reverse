package androidx.compose.p011ui.unit;

import androidx.collection.AbstractC0584a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b#\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\u00020\u0000H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b'\u0010\u0005J\u001a\u0010(\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b-\u0010\tJ\u000f\u0010.\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101R\u0015\u0010\u0006\u001a\u00020\u00078Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00063"}, m5110d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "copyMaxDimensions", "copyMaxDimensions-msEJaDk", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@Immutable
@JvmInline
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n*L\n1#1,634:1\n67#1:635\n67#1:638\n67#1:641\n67#1:645\n67#1:649\n67#1:652\n67#1:656\n67#1:660\n67#1:664\n618#2:636\n630#2:637\n618#2:639\n630#2:640\n618#2:642\n633#2:643\n627#2:644\n618#2:646\n633#2:647\n627#2:648\n618#2:650\n630#2:651\n618#2:653\n633#2:654\n627#2:655\n618#2:657\n630#2:658\n618#2:661\n633#2:662\n627#2:663\n618#2:665\n630#2:666\n627#2:667\n633#2:668\n1#3:659\n37#4,5:669\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n*L\n72#1:635\n82#1:638\n90#1:641\n102#1:645\n116#1:649\n127#1:652\n137#1:656\n148#1:660\n166#1:664\n72#1:636\n72#1:637\n82#1:639\n82#1:640\n90#1:642\n91#1:643\n92#1:644\n102#1:646\n103#1:647\n104#1:648\n116#1:650\n116#1:651\n127#1:653\n128#1:654\n129#1:655\n137#1:657\n137#1:658\n148#1:661\n149#1:662\n150#1:663\n166#1:665\n167#1:666\n168#1:667\n169#1:668\n185#1:669,5\n*E\n"})
/* loaded from: classes2.dex */
public final class Constraints {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ5\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0016J?\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "Infinity", "", "fitPrioritizingHeight", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "fitPrioritizingHeight-Zbe2FdA", "(IIII)J", "fitPrioritizingWidth", "fitPrioritizingWidth-Zbe2FdA", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "restrictConstraints", "prioritizeWidth", "", "restrictConstraints-xF2OJ5Q", "(IIIIZ)J", "ui-unit_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n1#1,634:1\n37#2,5:635\n37#2,5:640\n37#2,5:645\n465#3,6:650\n465#3,6:656\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/Constraints$Companion\n*L\n224#1:635,5\n231#1:640,5\n243#1:645,5\n305#1:650,6\n341#1:656,6\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m13265restrictConstraintsxF2OJ5Q$default(Companion companion, int i, int i8, int i9, int i10, boolean z8, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                z8 = true;
            }
            return companion.m13271restrictConstraintsxF2OJ5Q(i, i8, i9, i10, z8);
        }

        @Stable
        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m13266fitPrioritizingHeightZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int iMin = Math.min(minHeight, 262142);
            int iMin2 = maxHeight == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxHeight, 262142);
            int i8 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i8 >= 8191) {
                if (i8 < 32767) {
                    i = 65534;
                } else if (i8 < 65535) {
                    i = 32766;
                } else {
                    if (i8 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i8);
                        throw new KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i, minWidth), maxWidth != Integer.MAX_VALUE ? Math.min(i, maxWidth) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @Stable
        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m13267fitPrioritizingWidthZbe2FdA(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            int i = 262142;
            int iMin = Math.min(minWidth, 262142);
            int iMin2 = maxWidth == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(maxWidth, 262142);
            int i8 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i8 >= 8191) {
                if (i8 < 32767) {
                    i = 65534;
                } else if (i8 < 65535) {
                    i = 32766;
                } else {
                    if (i8 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i8);
                        throw new KotlinNothingValueException();
                    }
                    i = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i, minHeight), maxHeight != Integer.MAX_VALUE ? Math.min(i, maxHeight) : Integer.MAX_VALUE);
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m13268fixedJhjzzOo(int width, int height) {
            if (!((height >= 0) & (width >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, height, height);
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m13269fixedHeightOenEA2s(int height) {
            if (!(height >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, height, height);
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m13270fixedWidthOenEA2s(int width) {
            if (!(width >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(width, width, 0, Integer.MAX_VALUE);
        }

        @Stable
        @Deprecated(message = "Replace with fitPrioritizingWidth", replaceWith = @ReplaceWith(expression = "Constraints.fitPrioritizingWidth(minWidth, maxWidth, minHeight, maxHeight)", imports = {}))
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m13271restrictConstraintsxF2OJ5Q(int minWidth, int maxWidth, int minHeight, int maxHeight, boolean prioritizeWidth) {
            return prioritizeWidth ? m13267fitPrioritizingWidthZbe2FdA(minWidth, maxWidth, minHeight, maxHeight) : m13266fitPrioritizingHeightZbe2FdA(minWidth, maxWidth, minHeight, maxHeight);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j7) {
        this.value = j7;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m13245boximpl(long j7) {
        return new Constraints(j7);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m13246constructorimpl(long j7) {
        return j7;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m13247copyZbe2FdA(long j7, int i, int i8, int i9, int i10) {
        if (!(i8 >= i && i10 >= i9 && i >= 0 && i9 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i, i8, i9, i10);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m13248copyZbe2FdA$default(long j7, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = m13260getMinWidthimpl(j7);
        }
        int i12 = i;
        if ((i11 & 2) != 0) {
            i8 = m13258getMaxWidthimpl(j7);
        }
        int i13 = i8;
        if ((i11 & 4) != 0) {
            i9 = m13259getMinHeightimpl(j7);
        }
        int i14 = i9;
        if ((i11 & 8) != 0) {
            i10 = m13257getMaxHeightimpl(j7);
        }
        return m13247copyZbe2FdA(j7, i12, i13, i14, i10);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m13249copyMaxDimensionsmsEJaDk(long j7) {
        return m13246constructorimpl(j7 & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m13250equalsimpl(long j7, Object obj) {
        return (obj instanceof Constraints) && j7 == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m13251equalsimpl0(long j7, long j8) {
        return j7 == j8;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m13252getFocusIndeximpl(long j7) {
        return (int) (j7 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m13253getHasBoundedHeightimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return (((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m13254getHasBoundedWidthimpl(long j7) {
        int i = (int) (3 & j7);
        return (((int) (j7 >> 33)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1)) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m13255getHasFixedHeightimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i9 = (1 << (18 - i8)) - 1;
        int i10 = ((int) (j7 >> (i8 + 15))) & i9;
        int i11 = ((int) (j7 >> (i8 + 46))) & i9;
        return i10 == (i11 == 0 ? Integer.MAX_VALUE : i11 - 1);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m13256getHasFixedWidthimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1;
        int i9 = ((int) (j7 >> 2)) & i8;
        int i10 = ((int) (j7 >> 33)) & i8;
        return i9 == (i10 == 0 ? Integer.MAX_VALUE : i10 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m13257getMaxHeightimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        int i9 = ((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m13258getMaxWidthimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (int) (j7 >> 33);
        int i9 = i8 & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
        if (i9 == 0) {
            return Integer.MAX_VALUE;
        }
        return i9 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m13259getMinHeightimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((int) (j7 >> (i8 + 15))) & ((1 << (18 - i8)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m13260getMinWidthimpl(long j7) {
        int i = (int) (3 & j7);
        return ((int) (j7 >> 2)) & ((1 << (((((i & 2) >> 1) * 3) + ((i & 1) << 1)) + 13)) - 1);
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m13261hashCodeimpl(long j7) {
        return Long.hashCode(j7);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m13262isZeroimpl(long j7) {
        int i = (int) (3 & j7);
        int i8 = (((i & 2) >> 1) * 3) + ((i & 1) << 1);
        return ((((int) (j7 >> 33)) & ((1 << (i8 + 13)) - 1)) - 1 == 0) | ((((int) (j7 >> (i8 + 46))) & ((1 << (18 - i8)) - 1)) - 1 == 0);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m13263toStringimpl(long j7) {
        int iM13258getMaxWidthimpl = m13258getMaxWidthimpl(j7);
        String strValueOf = iM13258getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM13258getMaxWidthimpl);
        int iM13257getMaxHeightimpl = m13257getMaxHeightimpl(j7);
        String strValueOf2 = iM13257getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM13257getMaxHeightimpl) : "Infinity";
        StringBuilder sb = new StringBuilder("Constraints(minWidth = ");
        sb.append(m13260getMinWidthimpl(j7));
        sb.append(", maxWidth = ");
        sb.append(strValueOf);
        sb.append(", minHeight = ");
        sb.append(m13259getMinHeightimpl(j7));
        sb.append(", maxHeight = ");
        return AbstractC0584a.m911l(')', strValueOf2, sb);
    }

    public boolean equals(Object obj) {
        return m13250equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m13261hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m13263toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
