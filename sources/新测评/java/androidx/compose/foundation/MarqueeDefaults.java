package androidx.compose.foundation;

import androidx.compose.p013ui.unit.C3127Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0004X\u0086D¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, m13558d2 = {"Landroidx/compose/foundation/MarqueeDefaults;", "", "()V", "Iterations", "", "getIterations$annotations", "getIterations", "()I", "RepeatDelayMillis", "getRepeatDelayMillis$annotations", "getRepeatDelayMillis", "Spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "Velocity", "Landroidx/compose/ui/unit/Dp;", "getVelocity-D9Ej5fM", "()F", "F", "foundation_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,535:1\n113#2:536\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/MarqueeDefaults\n*L\n102#1:536\n*E\n"})
/* loaded from: classes.dex */
public final class MarqueeDefaults {
    public static final int $stable = 0;
    public static final MarqueeDefaults INSTANCE = new MarqueeDefaults();
    private static final int Iterations = 3;
    private static final int RepeatDelayMillis = 1200;
    private static final MarqueeSpacing Spacing = MarqueeSpacing.INSTANCE.fractionOfContainer(0.33333334f);
    private static final float Velocity = C3127Dp.m23561constructorimpl(30);

    private MarqueeDefaults() {
    }

    public static /* synthetic */ void getIterations$annotations() {
    }

    public static /* synthetic */ void getRepeatDelayMillis$annotations() {
    }

    public final int getIterations() {
        return Iterations;
    }

    public final int getRepeatDelayMillis() {
        return RepeatDelayMillis;
    }

    public final MarqueeSpacing getSpacing() {
        return Spacing;
    }

    /* renamed from: getVelocity-D9Ej5fM, reason: not valid java name */
    public final float m17271getVelocityD9Ej5fM() {
        return Velocity;
    }
}
