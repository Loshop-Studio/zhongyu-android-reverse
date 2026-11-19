package androidx.compose.material3;

import androidx.compose.p013ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J8\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, m13558d2 = {"Landroidx/compose/material3/CardColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getContentColor-0d7_KjU", "getDisabledContainerColor-0d7_KjU", "getDisabledContentColor-0d7_KjU", "enabled", "", "containerColor-vNxB06k$material3_release", "(Z)J", "contentColor-vNxB06k$material3_release", "copy", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/CardColors;", "equals", "other", "hashCode", "", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,851:1\n708#2:852\n696#2:853\n708#2:854\n696#2:855\n708#2:856\n696#2:857\n708#2:858\n696#2:859\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardColors\n*L\n807#1:852\n807#1:853\n808#1:854\n808#1:855\n809#1:856\n809#1:857\n810#1:858\n810#1:859\n*E\n"})
/* loaded from: classes2.dex */
public final class CardColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    public /* synthetic */ CardColors(long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ CardColors m18557copyjRlVdoo$default(CardColors cardColors, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = cardColors.containerColor;
        }
        long j14 = j10;
        if ((i10 & 2) != 0) {
            j11 = cardColors.contentColor;
        }
        long j15 = j11;
        if ((i10 & 4) != 0) {
            j12 = cardColors.disabledContainerColor;
        }
        return cardColors.m18560copyjRlVdoo(j14, j15, j12, (i10 & 8) != 0 ? cardColors.disabledContentColor : j13);
    }

    @Stable
    /* renamed from: containerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18558containerColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.containerColor : this.disabledContainerColor;
    }

    @Stable
    /* renamed from: contentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m18559contentColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.contentColor : this.disabledContentColor;
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final CardColors m18560copyjRlVdoo(long containerColor, long contentColor, long disabledContainerColor, long disabledContentColor) {
        return new CardColors(containerColor != 16 ? containerColor : this.containerColor, contentColor != 16 ? contentColor : this.contentColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, disabledContentColor != 16 ? disabledContentColor : this.disabledContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CardColors)) {
            return false;
        }
        CardColors cardColors = (CardColors) other;
        return Color.m20977equalsimpl0(this.containerColor, cardColors.containerColor) && Color.m20977equalsimpl0(this.contentColor, cardColors.contentColor) && Color.m20977equalsimpl0(this.disabledContainerColor, cardColors.disabledContainerColor) && Color.m20977equalsimpl0(this.disabledContentColor, cardColors.disabledContentColor);
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: getDisabledContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: getDisabledContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    public int hashCode() {
        return (((((Color.m20983hashCodeimpl(this.containerColor) * 31) + Color.m20983hashCodeimpl(this.contentColor)) * 31) + Color.m20983hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m20983hashCodeimpl(this.disabledContentColor);
    }

    private CardColors(long j10, long j11, long j12, long j13) {
        this.containerColor = j10;
        this.contentColor = j11;
        this.disabledContainerColor = j12;
        this.disabledContentColor = j13;
    }
}
