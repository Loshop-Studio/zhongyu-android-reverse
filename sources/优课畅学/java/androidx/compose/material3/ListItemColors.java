package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class ListItemColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledHeadlineColor;
    private final long disabledLeadingIconColor;
    private final long disabledTrailingIconColor;
    private final long headlineColor;
    private final long leadingIconColor;
    private final long overlineColor;
    private final long supportingTextColor;
    private final long trailingIconColor;

    public /* synthetic */ ListItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, AbstractC9126n abstractC9126n) {
        this(j10, j11, j12, j13, j14, j15, j16, j17, j18);
    }

    /* renamed from: containerColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m22172containerColor0d7_KjU$material3_release() {
        return this.containerColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m22173getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getDisabledHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m22174getDisabledHeadlineColor0d7_KjU() {
        return this.disabledHeadlineColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m22175getDisabledLeadingIconColor0d7_KjU() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m22176getDisabledTrailingIconColor0d7_KjU() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: getHeadlineColor-0d7_KjU, reason: not valid java name */
    public final long m22177getHeadlineColor0d7_KjU() {
        return this.headlineColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name */
    public final long m22178getLeadingIconColor0d7_KjU() {
        return this.leadingIconColor;
    }

    /* renamed from: getOverlineColor-0d7_KjU, reason: not valid java name */
    public final long m22179getOverlineColor0d7_KjU() {
        return this.overlineColor;
    }

    /* renamed from: getSupportingTextColor-0d7_KjU, reason: not valid java name */
    public final long m22180getSupportingTextColor0d7_KjU() {
        return this.supportingTextColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name */
    public final long m22181getTrailingIconColor0d7_KjU() {
        return this.trailingIconColor;
    }

    @Stable
    /* renamed from: headlineColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m22182headlineColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.headlineColor : this.disabledHeadlineColor;
    }

    @Stable
    /* renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m22183leadingIconColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @Stable
    /* renamed from: overlineColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m22184overlineColor0d7_KjU$material3_release() {
        return this.overlineColor;
    }

    @Stable
    /* renamed from: supportingColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m22185supportingColor0d7_KjU$material3_release() {
        return this.supportingTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m22186trailingIconColorvNxB06k$material3_release(boolean z10) {
        return z10 ? this.trailingIconColor : this.disabledTrailingIconColor;
    }

    private ListItemColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18) {
        this.containerColor = j10;
        this.headlineColor = j11;
        this.leadingIconColor = j12;
        this.overlineColor = j13;
        this.supportingTextColor = j14;
        this.trailingIconColor = j15;
        this.disabledHeadlineColor = j16;
        this.disabledLeadingIconColor = j17;
        this.disabledTrailingIconColor = j18;
    }
}
