package kotlin.time;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@SinceKotlin(version = "1.6")
@Metadata(m13412d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, m13413d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes5.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m26082constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @Metadata(m13412d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, m13413d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26130getDaysUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26132getDaysUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26136getHoursUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26138getHoursUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26142getMicrosecondsUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26144getMicrosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26148getMillisecondsUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26150getMillisecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26154getMinutesUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26156getMinutesUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26160getNanosecondsUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26162getNanosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26166getSecondsUwyO8pc(int i9) {
            return DurationKt.toDuration(i9, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26168getSecondsUwyO8pc$annotations(double d10) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m26171getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m26172getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m26173getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m26174parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e10);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m26175parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m26176parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m26080boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m26177parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m26080boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26131getDaysUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26133getDaysUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26137getHoursUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26139getHoursUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26143getMicrosecondsUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26145getMicrosecondsUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26149getMillisecondsUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26151getMillisecondsUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26155getMinutesUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26157getMinutesUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26161getNanosecondsUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26163getNanosecondsUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26167getSecondsUwyO8pc(long j9) {
            return DurationKt.toDuration(j9, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26169getSecondsUwyO8pc$annotations(int i9) {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m26129getDaysUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26134getDaysUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m26135getHoursUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26140getHoursUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m26141getMicrosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26146getMicrosecondsUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m26147getMillisecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26152getMillisecondsUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m26153getMinutesUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26158getMinutesUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m26159getNanosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26164getNanosecondsUwyO8pc$annotations(long j9) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m26165getSecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m26170getSecondsUwyO8pc$annotations(long j9) {
        }
    }

    private /* synthetic */ Duration(long j9) {
        this.rawValue = j9;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m26078addValuesMixedRangesUwyO8pc(long j9, long j10, long j11) {
        long jNanosToMillis = DurationKt.nanosToMillis(j11);
        long j12 = j10 + jNanosToMillis;
        if (-4611686018426L > j12 || j12 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j12, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j12) + (j11 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m26079appendFractionalimpl(long j9, StringBuilder sb, int i9, int i10, int i11, String str, boolean z9) {
        sb.append(i9);
        if (i10 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i10), i11, '0');
            int i12 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i13 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i12 = length;
                        break;
                    } else if (i13 < 0) {
                        break;
                    } else {
                        length = i13;
                    }
                }
            }
            int i14 = i12 + 1;
            if (z9 || i14 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i12 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i14);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m26080boximpl(long j9) {
        return new Duration(j9);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26082constructorimpl(long j9) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j9;
        }
        if (m26106isInNanosimpl(j9)) {
            long jM26102getValueimpl = m26102getValueimpl(j9);
            if (-4611686018426999999L <= jM26102getValueimpl && jM26102getValueimpl < 4611686018427000000L) {
                return j9;
            }
            throw new AssertionError(m26102getValueimpl(j9) + " ns is out of nanoseconds range");
        }
        long jM26102getValueimpl2 = m26102getValueimpl(j9);
        if (-4611686018427387903L > jM26102getValueimpl2 || jM26102getValueimpl2 >= SieveCacheKt.NodeVisitedBit) {
            throw new AssertionError(m26102getValueimpl(j9) + " ms is out of milliseconds range");
        }
        long jM26102getValueimpl3 = m26102getValueimpl(j9);
        if (-4611686018426L > jM26102getValueimpl3 || jM26102getValueimpl3 >= 4611686018427L) {
            return j9;
        }
        throw new AssertionError(m26102getValueimpl(j9) + " ms is denormalized");
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m26083divLRDsOJo(long j9, long j10) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m26100getStorageUnitimpl(j9), m26100getStorageUnitimpl(j10));
        return m26118toDoubleimpl(j9, durationUnit) / m26118toDoubleimpl(j10, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m26085divUwyO8pc(long j9, int i9) {
        if (i9 == 0) {
            if (m26109isPositiveimpl(j9)) {
                return INFINITE;
            }
            if (m26108isNegativeimpl(j9)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m26106isInNanosimpl(j9)) {
            return DurationKt.durationOfNanos(m26102getValueimpl(j9) / i9);
        }
        if (m26107isInfiniteimpl(j9)) {
            return m26113timesUwyO8pc(j9, MathKt.getSign(i9));
        }
        long j10 = i9;
        long jM26102getValueimpl = m26102getValueimpl(j9) / j10;
        if (-4611686018426L > jM26102getValueimpl || jM26102getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM26102getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM26102getValueimpl) + (DurationKt.millisToNanos(m26102getValueimpl(j9) - (jM26102getValueimpl * j10)) / j10));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26086equalsimpl(long j9, Object obj) {
        return (obj instanceof Duration) && j9 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26087equalsimpl0(long j9, long j10) {
        return j9 == j10;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m26088getAbsoluteValueUwyO8pc(long j9) {
        return m26108isNegativeimpl(j9) ? m26126unaryMinusUwyO8pc(j9) : j9;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m26089getHoursComponentimpl(long j9) {
        if (m26107isInfiniteimpl(j9)) {
            return 0;
        }
        return (int) (m26091getInWholeHoursimpl(j9) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m26090getInWholeDaysimpl(long j9) {
        return m26121toLongimpl(j9, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m26091getInWholeHoursimpl(long j9) {
        return m26121toLongimpl(j9, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m26092getInWholeMicrosecondsimpl(long j9) {
        return m26121toLongimpl(j9, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m26093getInWholeMillisecondsimpl(long j9) {
        return (m26105isInMillisimpl(j9) && m26104isFiniteimpl(j9)) ? m26102getValueimpl(j9) : m26121toLongimpl(j9, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m26094getInWholeMinutesimpl(long j9) {
        return m26121toLongimpl(j9, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m26095getInWholeNanosecondsimpl(long j9) {
        long jM26102getValueimpl = m26102getValueimpl(j9);
        if (m26106isInNanosimpl(j9)) {
            return jM26102getValueimpl;
        }
        if (jM26102getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM26102getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM26102getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m26096getInWholeSecondsimpl(long j9) {
        return m26121toLongimpl(j9, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m26097getMinutesComponentimpl(long j9) {
        if (m26107isInfiniteimpl(j9)) {
            return 0;
        }
        return (int) (m26094getInWholeMinutesimpl(j9) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m26098getNanosecondsComponentimpl(long j9) {
        if (m26107isInfiniteimpl(j9)) {
            return 0;
        }
        return (int) (m26105isInMillisimpl(j9) ? DurationKt.millisToNanos(m26102getValueimpl(j9) % 1000) : m26102getValueimpl(j9) % InstantKt.NANOS_PER_SECOND);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m26099getSecondsComponentimpl(long j9) {
        if (m26107isInfiniteimpl(j9)) {
            return 0;
        }
        return (int) (m26096getInWholeSecondsimpl(j9) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m26100getStorageUnitimpl(long j9) {
        return m26106isInNanosimpl(j9) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m26101getUnitDiscriminatorimpl(long j9) {
        return ((int) j9) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m26102getValueimpl(long j9) {
        return j9 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26103hashCodeimpl(long j9) {
        return Long.hashCode(j9);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m26104isFiniteimpl(long j9) {
        return !m26107isInfiniteimpl(j9);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m26105isInMillisimpl(long j9) {
        return (((int) j9) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m26106isInNanosimpl(long j9) {
        return (((int) j9) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m26107isInfiniteimpl(long j9) {
        return j9 == INFINITE || j9 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m26108isNegativeimpl(long j9) {
        return j9 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m26109isPositiveimpl(long j9) {
        return j9 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m26110minusLRDsOJo(long j9, long j10) {
        return m26111plusLRDsOJo(j9, m26126unaryMinusUwyO8pc(j10));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m26111plusLRDsOJo(long j9, long j10) {
        if (m26107isInfiniteimpl(j9)) {
            if (m26104isFiniteimpl(j10) || (j10 ^ j9) >= 0) {
                return j9;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m26107isInfiniteimpl(j10)) {
            return j10;
        }
        if ((((int) j9) & 1) != (((int) j10) & 1)) {
            return m26105isInMillisimpl(j9) ? m26078addValuesMixedRangesUwyO8pc(j9, m26102getValueimpl(j9), m26102getValueimpl(j10)) : m26078addValuesMixedRangesUwyO8pc(j9, m26102getValueimpl(j10), m26102getValueimpl(j9));
        }
        long jM26102getValueimpl = m26102getValueimpl(j9) + m26102getValueimpl(j10);
        return m26106isInNanosimpl(j9) ? DurationKt.durationOfNanosNormalized(jM26102getValueimpl) : DurationKt.durationOfMillisNormalized(jM26102getValueimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m26113timesUwyO8pc(long j9, int i9) {
        if (m26107isInfiniteimpl(j9)) {
            if (i9 != 0) {
                return i9 > 0 ? j9 : m26126unaryMinusUwyO8pc(j9);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i9 == 0) {
            return ZERO;
        }
        long jM26102getValueimpl = m26102getValueimpl(j9);
        long j10 = i9;
        long j11 = jM26102getValueimpl * j10;
        if (!m26106isInNanosimpl(j9)) {
            return j11 / j10 == jM26102getValueimpl ? DurationKt.durationOfMillis(RangesKt.coerceIn(j11, new LongRange(-4611686018427387903L, 4611686018427387903L))) : MathKt.getSign(jM26102getValueimpl) * MathKt.getSign(i9) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM26102getValueimpl && jM26102getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j11);
        }
        if (j11 / j10 == jM26102getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j11);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM26102getValueimpl);
        long j12 = jNanosToMillis * j10;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM26102getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j10) + j12;
        return (j12 / j10 != jNanosToMillis || (jNanosToMillis2 ^ j12) < 0) ? MathKt.getSign(jM26102getValueimpl) * MathKt.getSign(i9) > 0 ? INFINITE : NEG_INFINITE : DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26117toComponentsimpl(long j9, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m26090getInWholeDaysimpl(j9)), Integer.valueOf(m26089getHoursComponentimpl(j9)), Integer.valueOf(m26097getMinutesComponentimpl(j9)), Integer.valueOf(m26099getSecondsComponentimpl(j9)), Integer.valueOf(m26098getNanosecondsComponentimpl(j9)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m26118toDoubleimpl(long j9, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j9 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j9 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m26102getValueimpl(j9), m26100getStorageUnitimpl(j9), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m26119toIntimpl(long j9, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m26121toLongimpl(j9, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m26120toIsoStringimpl(long j9) {
        StringBuilder sb = new StringBuilder();
        if (m26108isNegativeimpl(j9)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM26088getAbsoluteValueUwyO8pc = m26088getAbsoluteValueUwyO8pc(j9);
        long jM26091getInWholeHoursimpl = m26091getInWholeHoursimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26097getMinutesComponentimpl = m26097getMinutesComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26099getSecondsComponentimpl = m26099getSecondsComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26098getNanosecondsComponentimpl = m26098getNanosecondsComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        long j10 = m26107isInfiniteimpl(j9) ? 9999999999999L : jM26091getInWholeHoursimpl;
        boolean z9 = false;
        boolean z10 = j10 != 0;
        boolean z11 = (iM26099getSecondsComponentimpl == 0 && iM26098getNanosecondsComponentimpl == 0) ? false : true;
        if (iM26097getMinutesComponentimpl != 0 || (z11 && z10)) {
            z9 = true;
        }
        if (z10) {
            sb.append(j10);
            sb.append('H');
        }
        if (z9) {
            sb.append(iM26097getMinutesComponentimpl);
            sb.append('M');
        }
        if (z11 || (!z10 && !z9)) {
            m26079appendFractionalimpl(j9, sb, iM26099getSecondsComponentimpl, iM26098getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m26121toLongimpl(long j9, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j9 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j9 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m26102getValueimpl(j9), m26100getStorageUnitimpl(j9), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26122toStringimpl(long j9) {
        if (j9 == 0) {
            return "0s";
        }
        if (j9 == INFINITE) {
            return "Infinity";
        }
        if (j9 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM26108isNegativeimpl = m26108isNegativeimpl(j9);
        StringBuilder sb = new StringBuilder();
        if (zM26108isNegativeimpl) {
            sb.append('-');
        }
        long jM26088getAbsoluteValueUwyO8pc = m26088getAbsoluteValueUwyO8pc(j9);
        long jM26090getInWholeDaysimpl = m26090getInWholeDaysimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26089getHoursComponentimpl = m26089getHoursComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26097getMinutesComponentimpl = m26097getMinutesComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26099getSecondsComponentimpl = m26099getSecondsComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int iM26098getNanosecondsComponentimpl = m26098getNanosecondsComponentimpl(jM26088getAbsoluteValueUwyO8pc);
        int i9 = 0;
        boolean z9 = jM26090getInWholeDaysimpl != 0;
        boolean z10 = iM26089getHoursComponentimpl != 0;
        boolean z11 = iM26097getMinutesComponentimpl != 0;
        boolean z12 = (iM26099getSecondsComponentimpl == 0 && iM26098getNanosecondsComponentimpl == 0) ? false : true;
        if (z9) {
            sb.append(jM26090getInWholeDaysimpl);
            sb.append('d');
            i9 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i10 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            sb.append(iM26089getHoursComponentimpl);
            sb.append('h');
            i9 = i10;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i11 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            sb.append(iM26097getMinutesComponentimpl);
            sb.append('m');
            i9 = i11;
        }
        if (z12) {
            int i12 = i9 + 1;
            if (i9 > 0) {
                sb.append(' ');
            }
            if (iM26099getSecondsComponentimpl != 0 || z9 || z10 || z11) {
                m26079appendFractionalimpl(j9, sb, iM26099getSecondsComponentimpl, iM26098getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM26098getNanosecondsComponentimpl >= 1000000) {
                m26079appendFractionalimpl(j9, sb, iM26098getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM26098getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM26098getNanosecondsComponentimpl >= 1000) {
                m26079appendFractionalimpl(j9, sb, iM26098getNanosecondsComponentimpl / 1000, iM26098getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM26098getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i9 = i12;
        }
        if (zM26108isNegativeimpl && i9 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m26124toStringimpl$default(long j9, DurationUnit durationUnit, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return m26123toStringimpl(j9, durationUnit, i9);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m26125truncateToUwyO8pc$kotlin_stdlib(long j9, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM26100getStorageUnitimpl = m26100getStorageUnitimpl(j9);
        if (unit.compareTo(durationUnitM26100getStorageUnitimpl) <= 0 || m26107isInfiniteimpl(j9)) {
            return j9;
        }
        return DurationKt.toDuration(m26102getValueimpl(j9) - (m26102getValueimpl(j9) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM26100getStorageUnitimpl)), durationUnitM26100getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m26126unaryMinusUwyO8pc(long j9) {
        return DurationKt.durationOf(-m26102getValueimpl(j9), ((int) j9) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m26127compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m26127compareToLRDsOJo(long j9) {
        return m26081compareToLRDsOJo(this.rawValue, j9);
    }

    public boolean equals(Object other) {
        return m26086equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m26103hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m26122toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m26081compareToLRDsOJo(long j9, long j10) {
        long j11 = j9 ^ j10;
        if (j11 < 0 || (((int) j11) & 1) == 0) {
            return Intrinsics.compare(j9, j10);
        }
        int i9 = (((int) j9) & 1) - (((int) j10) & 1);
        return m26108isNegativeimpl(j9) ? -i9 : i9;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26116toComponentsimpl(long j9, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m26091getInWholeHoursimpl(j9)), Integer.valueOf(m26097getMinutesComponentimpl(j9)), Integer.valueOf(m26099getSecondsComponentimpl(j9)), Integer.valueOf(m26098getNanosecondsComponentimpl(j9)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26115toComponentsimpl(long j9, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m26094getInWholeMinutesimpl(j9)), Integer.valueOf(m26099getSecondsComponentimpl(j9)), Integer.valueOf(m26098getNanosecondsComponentimpl(j9)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m26114toComponentsimpl(long j9, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m26096getInWholeSecondsimpl(j9)), Integer.valueOf(m26098getNanosecondsComponentimpl(j9)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m26084divUwyO8pc(long j9, double d10) {
        int iRoundToInt = MathKt.roundToInt(d10);
        if (iRoundToInt == d10 && iRoundToInt != 0) {
            return m26085divUwyO8pc(j9, iRoundToInt);
        }
        DurationUnit durationUnitM26100getStorageUnitimpl = m26100getStorageUnitimpl(j9);
        return DurationKt.toDuration(m26118toDoubleimpl(j9, durationUnitM26100getStorageUnitimpl) / d10, durationUnitM26100getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m26112timesUwyO8pc(long j9, double d10) {
        int iRoundToInt = MathKt.roundToInt(d10);
        if (iRoundToInt == d10) {
            return m26113timesUwyO8pc(j9, iRoundToInt);
        }
        DurationUnit durationUnitM26100getStorageUnitimpl = m26100getStorageUnitimpl(j9);
        return DurationKt.toDuration(m26118toDoubleimpl(j9, durationUnitM26100getStorageUnitimpl) * d10, durationUnitM26100getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m26123toStringimpl(long j9, DurationUnit unit, int i9) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i9 >= 0) {
            double dM26118toDoubleimpl = m26118toDoubleimpl(j9, unit);
            if (Double.isInfinite(dM26118toDoubleimpl)) {
                return String.valueOf(dM26118toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM26118toDoubleimpl, RangesKt.coerceAtMost(i9, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i9).toString());
    }
}
