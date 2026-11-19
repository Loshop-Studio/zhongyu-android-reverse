package coil3.compose;

import androidx.compose.p009ui.geometry.InlineClassHelperKt;
import androidx.compose.p009ui.geometry.Size;
import androidx.compose.p009ui.graphics.ColorFilter;
import androidx.compose.p009ui.graphics.drawscope.DrawScope;
import androidx.compose.p009ui.graphics.painter.Painter;
import androidx.compose.p009ui.layout.ContentScale;
import androidx.compose.p009ui.layout.ScaleFactorKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;

@Stable
@Metadata(m7879d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0010\u001a\u00020\u0003*\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u00100\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R+\u00107\u001a\u0002012\u0006\u00102\u001a\u0002018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b!\u00105\"\u0004\b'\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010-R\u0016\u0010@\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR(\u0010F\u001a\u0004\u0018\u00010\u00012\b\u0010C\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010\u0017\u001a\u0004\bE\u0010\u0019R\u001a\u0010I\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010\"\u001a\u0004\bH\u0010$¨\u0006J"}, m7880d2 = {"Lcoil3/compose/CrossfadePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "", "alpha", "", "applyAlpha", "(F)Z", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "applyColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)Z", "painter", "b", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/painter/Painter;F)V", "Landroidx/compose/ui/geometry/Size;", "srcSize", "dstSize", "a", "(JJ)J", "Landroidx/compose/ui/graphics/painter/Painter;", "getEnd", "()Landroidx/compose/ui/graphics/painter/Painter;", "end", "Landroidx/compose/ui/layout/ContentScale;", "Landroidx/compose/ui/layout/ContentScale;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Lkotlin/time/Duration;", "c", "J", "getDuration-UwyO8pc", "()J", TypedValues.TransitionType.S_DURATION, "Lkotlin/time/TimeSource;", "d", "Lkotlin/time/TimeSource;", "getTimeSource", "()Lkotlin/time/TimeSource;", "timeSource", "e", "Z", "getFadeStart", "()Z", "fadeStart", "", "<set-?>", "f", "Landroidx/compose/runtime/MutableIntState;", "()I", "(I)V", "invalidateTick", "Lkotlin/time/TimeMark;", "g", "Lkotlin/time/TimeMark;", "startTime", "h", "isDone", "i", "F", "maxAlpha", "j", "Landroidx/compose/ui/graphics/ColorFilter;", "value", "k", "getStart", "start", "l", "getIntrinsicSize-NH-jbRc", "intrinsicSize", "coil-compose-core_release"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nCrossfadePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 6 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,141:1\n78#2:142\n107#2,2:143\n1#3:145\n148#4:146\n148#4:147\n33#4:154\n153#4:158\n153#4:173\n153#4:174\n57#5:148\n61#5:151\n57#5:159\n61#5:162\n60#6:149\n70#6:152\n53#6,3:155\n60#6:160\n70#6:163\n22#7:150\n22#7:153\n22#7:161\n22#7:164\n108#8:165\n68#8,7:166\n*S KotlinDebug\n*F\n+ 1 CrossfadePainter.kt\ncoil3/compose/CrossfadePainter\n*L\n50#1:142\n50#1:143,2\n100#1:146\n101#1:147\n103#1:154\n122#1:158\n136#1:173\n137#1:174\n104#1:148\n105#1:151\n126#1:159\n127#1:162\n104#1:149\n105#1:152\n103#1:155,3\n126#1:160\n127#1:163\n104#1:150\n105#1:153\n126#1:161\n127#1:164\n125#1:165\n125#1:166,7\n*E\n"})
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
    public final MutableIntState invalidateTick;

    /* renamed from: g, reason: from kotlin metadata */
    public TimeMark startTime;

    /* renamed from: h, reason: from kotlin metadata */
    public boolean isDone;

    /* renamed from: i, reason: from kotlin metadata */
    public float maxAlpha;

    /* renamed from: j, reason: from kotlin metadata */
    public ColorFilter colorFilter;

    /* renamed from: k, reason: from kotlin metadata */
    public Painter start;

    /* renamed from: l, reason: from kotlin metadata */
    public final long intrinsicSize;

    /* renamed from: a */
    public final long m1766a(long srcSize, long dstSize) {
        return (srcSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m13729isEmptyimpl(srcSize) || dstSize == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m13729isEmptyimpl(dstSize)) ? dstSize : ScaleFactorKt.m15351timesUQTWf7w(srcSize, this.contentScale.mo15240computeScaleFactorH7hwNQA(srcSize, dstSize));
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public boolean applyAlpha(float alpha) {
        this.maxAlpha = alpha;
        return true;
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public boolean applyColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    /* renamed from: b */
    public final void m1767b(DrawScope drawScope, Painter painter, float f6) {
        if (painter == null || f6 <= 0.0f) {
            return;
        }
        long jMo14450getSizeNHjbRc = drawScope.mo14450getSizeNHjbRc();
        long jM1766a = m1766a(painter.getIntrinsicSize(), jMo14450getSizeNHjbRc);
        if (jMo14450getSizeNHjbRc == InlineClassHelperKt.UnspecifiedPackedFloats || Size.m13729isEmptyimpl(jMo14450getSizeNHjbRc)) {
            painter.m14576drawx_KDEd0(drawScope, jM1766a, f6, this.colorFilter);
            return;
        }
        float f7 = 2;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (jMo14450getSizeNHjbRc >> 32)) - Float.intBitsToFloat((int) (jM1766a >> 32))) / f7;
        float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (jMo14450getSizeNHjbRc & 4294967295L)) - Float.intBitsToFloat((int) (jM1766a & 4294967295L))) / f7;
        drawScope.getDrawContext().getTransform().inset(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat, fIntBitsToFloat2);
        try {
            painter.m14576drawx_KDEd0(drawScope, jM1766a, f6, this.colorFilter);
        } finally {
            float f8 = -fIntBitsToFloat;
            float f9 = -fIntBitsToFloat2;
            drawScope.getDrawContext().getTransform().inset(f8, f9, f8, f9);
        }
    }

    /* renamed from: c */
    public final int m1768c() {
        return this.invalidateTick.getIntValue();
    }

    /* renamed from: d */
    public final void m1769d(int i6) {
        this.invalidateTick.setIntValue(i6);
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc, reason: from getter */
    public long getIntrinsicSize() {
        return this.intrinsicSize;
    }

    @Override // androidx.compose.p009ui.graphics.painter.Painter
    public void onDraw(DrawScope drawScope) {
        if (this.isDone) {
            m1767b(drawScope, this.end, this.maxAlpha);
            return;
        }
        TimeMark timeMarkMarkNow = this.startTime;
        if (timeMarkMarkNow == null) {
            timeMarkMarkNow = this.timeSource.markNow();
            this.startTime = timeMarkMarkNow;
        }
        float fM18518getInWholeMillisecondsimpl = Duration.m18518getInWholeMillisecondsimpl(timeMarkMarkNow.mo18497elapsedNowUwyO8pc()) / Duration.m18518getInWholeMillisecondsimpl(this.duration);
        float fCoerceIn = RangesKt.coerceIn(fM18518getInWholeMillisecondsimpl, 0.0f, 1.0f);
        float f6 = this.maxAlpha;
        float f7 = fCoerceIn * f6;
        if (this.fadeStart) {
            f6 -= f7;
        }
        this.isDone = fM18518getInWholeMillisecondsimpl >= 1.0f;
        m1767b(drawScope, this.start, f6);
        m1767b(drawScope, this.end, f7);
        if (this.isDone) {
            this.start = null;
        } else {
            m1769d(m1768c() + 1);
        }
    }
}
