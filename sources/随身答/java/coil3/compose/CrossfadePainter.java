package coil3.compose;

import androidx.compose.p012ui.geometry.InlineClassHelperKt;
import androidx.compose.p012ui.geometry.Size;
import androidx.compose.p012ui.graphics.ColorFilter;
import androidx.compose.p012ui.graphics.drawscope.DrawScope;
import androidx.compose.p012ui.graphics.painter.Painter;
import androidx.compose.p012ui.layout.ContentScale;
import androidx.compose.p012ui.layout.ScaleFactorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

@Stable
@Metadata(m13412d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u0003*\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010%\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00103\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b1\u0010-\u001a\u0004\b2\u0010/R+\u0010:\u001a\u0002042\u0006\u00105\u001a\u0002048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b'\u00108\"\u0004\b,\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010-R\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER(\u0010I\u001a\u0004\u0018\u00010\u00012\b\u0010F\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010\u0019\u001a\u0004\bH\u0010\u001bR\u0014\u0010K\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010\u0011¨\u0006L"}, m13413d2 = {"Lcoil3/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "Landroidx/compose/ui/geometry/Size;", "b", "()J", "painter", "c", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V", "srcSize", "dstSize", "a", "(JJ)J", "Landroidx/compose/ui/graphics/painter/Painter;", "getEnd", "()Landroidx/compose/ui/graphics/painter/Painter;", "end", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Lkotlin/time/Duration;", "J", "getDuration-UwyO8pc", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/TimeSource;", "d", "Lkotlin/time/TimeSource;", "getTimeSource", "()Lkotlin/time/TimeSource;", "timeSource", "e", "Z", "getFadeStart", "()Z", "fadeStart", "f", "getPreferExactIntrinsicSize", "preferExactIntrinsicSize", "", "<set-?>", "g", "Landroidx/compose/runtime/MutableIntState;", "()I", "(I)V", "invalidateTick", "Lkotlin/time/TimeMark;", "h", "Lkotlin/time/TimeMark;", "startTime", "i", "isDone", "j", "F", "maxAlpha", "k", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "l", "getStart", "start", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "coil-compose-core_release"}, m13414k = 1, m13415mv = {2, 1, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,142:1\n78#2:143\n107#2,2:144\n1#3:146\n148#4:147\n148#4:148\n33#4:155\n153#4:159\n153#4:174\n153#4:175\n57#5:149\n61#5:152\n57#5:160\n61#5:163\n60#6:150\n70#6:153\n53#6,3:156\n60#6:161\n70#6:164\n22#7:151\n22#7:154\n22#7:162\n22#7:165\n108#8:166\n68#8,7:167\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n*L\n50#1:143\n50#1:144,2\n101#1:147\n102#1:148\n104#1:155\n123#1:159\n137#1:174\n138#1:175\n105#1:149\n106#1:152\n127#1:160\n128#1:163\n105#1:150\n106#1:153\n104#1:156,3\n127#1:161\n128#1:164\n105#1:151\n106#1:154\n127#1:162\n128#1:165\n126#1:166\n126#1:167,7\n*E\n"})
/* loaded from: classes3.dex */
public final class CrossfadePainter extends Painter {

    /* renamed from: a, reason: from kotlin metadata */
    public final Painter end;

    /* renamed from: b, reason: from kotlin metadata */
    public final ContentScale contentScale;

    /* renamed from: c, reason: from kotlin metadata */
    public final long duration;

    /* renamed from: d, reason: from kotlin metadata */
    public final TimeSource timeSource;

    /* renamed from: e, reason: from kotlin metadata */
    public final boolean fadeStart;

    /* renamed from: f, reason: from kotlin metadata */
    public final boolean preferExactIntrinsicSize;

    /* renamed from: g, reason: from kotlin metadata */
    public final MutableIntState invalidateTick;

    /* renamed from: h, reason: from kotlin metadata */
    public TimeMark startTime;

    /* renamed from: i, reason: from kotlin metadata */
    public boolean isDone;

    /* renamed from: j, reason: from kotlin metadata */
    public float maxAlpha;

    /* renamed from: k, reason: from kotlin metadata */
    public ColorFilter colorFilter;

    /* renamed from: l, reason: from kotlin metadata */
    public Painter start;

    /* renamed from: a */
    public final long m2663a(long srcSize, long dstSize) {
        return (srcSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m21239isEmptyimpl(srcSize) || dstSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m21239isEmptyimpl(dstSize)) ? dstSize : ScaleFactorKt.m22861timesUQTWf7w(srcSize, this.contentScale.mo22750computeScaleFactorH7hwNQA(srcSize, dstSize));
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.maxAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: b */
    public final long m2664b() {
        Painter painter = this.start;
        long intrinsicSize = painter != null ? painter.getIntrinsicSize() : Size.INSTANCE.m21246getZeroNHjbRc();
        Painter painter2 = this.end;
        long intrinsicSize2 = painter2 != null ? painter2.getIntrinsicSize() : Size.INSTANCE.m21246getZeroNHjbRc();
        boolean z9 = intrinsicSize != InlineClassHelperKt.UnspecifiedPackedFloats;
        boolean z10 = intrinsicSize2 != InlineClassHelperKt.UnspecifiedPackedFloats;
        if (z9 && z10) {
            return Size.m21228constructorimpl((Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (intrinsicSize >> 32)), Float.intBitsToFloat((int) (intrinsicSize2 >> 32)))) << 32) | (Float.floatToRawIntBits(Math.max(Float.intBitsToFloat((int) (intrinsicSize & 4294967295L)), Float.intBitsToFloat((int) (intrinsicSize2 & 4294967295L)))) & 4294967295L));
        }
        if (this.preferExactIntrinsicSize) {
            if (z9) {
                return intrinsicSize;
            }
            if (z10) {
                return intrinsicSize2;
            }
        }
        return Size.INSTANCE.m21245getUnspecifiedNHjbRc();
    }

    /* renamed from: c */
    public final void m2665c(DrawScope drawScope, Painter painter, float f10) {
        if (painter == null || f10 <= 0.0f) {
            return;
        }
        long jMo21960getSizeNHjbRc = drawScope.mo21960getSizeNHjbRc();
        long jM2663a = m2663a(painter.getIntrinsicSize(), jMo21960getSizeNHjbRc);
        if (jMo21960getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m21239isEmptyimpl(jMo21960getSizeNHjbRc)) {
            painter.m22086drawx_KDEd0(drawScope, jM2663a, f10, this.colorFilter);
            return;
        }
        float f11 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jMo21960getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (jM2663a >> 32))) / f11;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jMo21960getSizeNHjbRc & 4294967295L)) - Float.intBitsToFloat((int) (jM2663a & 4294967295L))) / f11;
        drawScope.getDrawContext().getTransform().inset(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            painter.m22086drawx_KDEd0(drawScope, jM2663a, f10, this.colorFilter);
        } finally {
            float f12 = -fIntBitsToFloat;
            float f13 = -fIntBitsToFloat2;
            drawScope.getDrawContext().getTransform().inset(f12, f13, f12, f13);
        }
    }

    /* renamed from: d */
    public final int m2666d() {
        return this.invalidateTick.getIntValue();
    }

    /* renamed from: e */
    public final void m2667e(int i9) {
        this.invalidateTick.setIntValue(i9);
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long getIntrinsicSize() {
        return m2664b();
    }

    @Override // androidx.compose.p012ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        if (this.isDone) {
            m2665c(drawScope, this.end, this.maxAlpha);
            return;
        }
        TimeMark timeMarkMarkNow = this.startTime;
        if (timeMarkMarkNow == null) {
            timeMarkMarkNow = this.timeSource.markNow();
            this.startTime = timeMarkMarkNow;
        }
        float fM26093getInWholeMillisecondsimpl = Duration.m26093getInWholeMillisecondsimpl(timeMarkMarkNow.mo26072elapsedNowUwyO8pc()) / Duration.m26093getInWholeMillisecondsimpl(this.duration);
        float fCoerceIn = RangesKt.coerceIn(fM26093getInWholeMillisecondsimpl, 0.0f, 1.0f);
        float f10 = this.maxAlpha;
        float f11 = fCoerceIn * f10;
        if (this.fadeStart) {
            f10 -= f11;
        }
        this.isDone = fM26093getInWholeMillisecondsimpl >= 1.0f;
        m2665c(drawScope, this.start, f10);
        m2665c(drawScope, this.end, f11);
        if (this.isDone) {
            this.start = null;
        } else {
            m2667e(m2666d() + 1);
        }
    }
}
