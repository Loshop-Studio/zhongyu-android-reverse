package androidx.compose.p011ui.layout;

import androidx.compose.p011ui.geometry.Size;
import androidx.compose.p011ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\t\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\u0003*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\u000f\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a\u001f\u0010\u0013\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u000e\u001a*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\"\u001f\u0010\u001f\u001a\u00020\u001a*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\"\u001f\u0010\"\u001a\u00020\u001a*\u00020\u00038Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\u001e\u001a\u0004\b \u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006#"}, m5110d2 = {"", "scaleX", "scaleY", "Landroidx/compose/ui/layout/ScaleFactor;", "ScaleFactor", "(FF)J", "Lkotlin/Function0;", "block", "takeOrElse-oyDd2qo", "(JLr6/a;)J", "takeOrElse", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "times-UQTWf7w", "(JJ)J", "times", "size", "times-m-w2e94", "div-UQTWf7w", "div", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "lerp", "", "isSpecified-FK8aYYs", "(J)Z", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified", "isUnspecified-FK8aYYs", "isUnspecified-FK8aYYs$annotations", "isUnspecified", "ui_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nScaleFactor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactor\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,150:1\n87#1:154\n31#1:183\n53#2,3:151\n60#2:156\n70#2:160\n53#2,3:163\n60#2:167\n70#2:171\n53#2,3:174\n60#2:178\n70#2:181\n53#2,3:184\n57#3:155\n61#3:159\n57#3:166\n61#3:170\n22#4:157\n22#4:168\n22#4:179\n22#4:182\n41#5:158\n46#5:161\n41#5:169\n46#5:172\n41#5:177\n46#5:180\n33#6:162\n33#6:173\n*S KotlinDebug\n*F\n+ 1 ScaleFactor.kt\nandroidx/compose/ui/layout/ScaleFactorKt\n*L\n99#1:154\n145#1:183\n31#1:151,3\n109#1:156\n109#1:160\n109#1:163,3\n128#1:167\n128#1:171\n128#1:174,3\n146#1:178\n147#1:181\n145#1:184,3\n109#1:155\n109#1:159\n128#1:166\n128#1:170\n109#1:157\n128#1:168\n146#1:179\n147#1:182\n109#1:158\n109#1:161\n128#1:169\n128#1:172\n146#1:177\n147#1:180\n109#1:162\n128#1:173\n*E\n"})
/* loaded from: classes2.dex */
public final class ScaleFactorKt {
    @Stable
    public static final long ScaleFactor(float f, float f7) {
        return ScaleFactor.m12116constructorimpl((Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
    }

    @Stable
    /* renamed from: div-UQTWf7w, reason: not valid java name */
    public static final long m12130divUQTWf7w(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) / Float.intBitsToFloat((int) (j8 & 4294967295L));
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L));
    }

    /* renamed from: isSpecified-FK8aYYs, reason: not valid java name */
    public static final boolean m12131isSpecifiedFK8aYYs(long j7) {
        return j7 != ScaleFactor.INSTANCE.m12129getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isSpecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m12132isSpecifiedFK8aYYs$annotations(long j7) {
    }

    /* renamed from: isUnspecified-FK8aYYs, reason: not valid java name */
    public static final boolean m12133isUnspecifiedFK8aYYs(long j7) {
        return j7 == ScaleFactor.INSTANCE.m12129getUnspecified_hLwfpc();
    }

    @Stable
    /* renamed from: isUnspecified-FK8aYYs$annotations, reason: not valid java name */
    public static /* synthetic */ void m12134isUnspecifiedFK8aYYs$annotations(long j7) {
    }

    @Stable
    /* renamed from: lerp--bDIf60, reason: not valid java name */
    public static final long m12135lerpbDIf60(long j7, long j8, float f) {
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j7 >> 32)), Float.intBitsToFloat((int) (j8 >> 32)), f);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j7 & 4294967295L)), Float.intBitsToFloat((int) (j8 & 4294967295L)), f);
        return ScaleFactor.m12116constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-oyDd2qo, reason: not valid java name */
    public static final long m12136takeOrElseoyDd2qo(long j7, @NotNull InterfaceC6469a interfaceC6469a) {
        return j7 != ScaleFactor.INSTANCE.m12129getUnspecified_hLwfpc() ? j7 : ((ScaleFactor) interfaceC6469a.invoke()).m12127unboximpl();
    }

    @Stable
    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m12137timesUQTWf7w(long j7, long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) * Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) * Float.intBitsToFloat((int) (j7 & 4294967295L));
        return Size.m10501constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
    }

    @Stable
    /* renamed from: times-m-w2e94, reason: not valid java name */
    public static final long m12138timesmw2e94(long j7, long j8) {
        return m12137timesUQTWf7w(j8, j7);
    }
}
