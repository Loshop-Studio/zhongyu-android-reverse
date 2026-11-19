package kotlin.time;

import androidx.autofill.HintConstants;
import androidx.collection.SieveCacheKt;
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
@Metadata(m7879d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, m7880d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes4.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m18507constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @Metadata(m7879d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, m7880d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, m7881k = 1, m7882mv = {2, 2, 0}, m7884xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m18555getDaysUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18557getDaysUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m18561getHoursUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18563getHoursUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m18567getMicrosecondsUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18569getMicrosecondsUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m18573getMillisecondsUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18575getMillisecondsUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m18579getMinutesUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18581getMinutesUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m18585getNanosecondsUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18587getNanosecondsUwyO8pc$annotations(double d6) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m18591getSecondsUwyO8pc(int i6) {
            return DurationKt.toDuration(i6, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18593getSecondsUwyO8pc$annotations(double d6) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m18596getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m18597getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m18598getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m18599parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e6);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m18600parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e6) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e6);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m18601parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m18505boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m18602parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m18505boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m18556getDaysUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18558getDaysUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m18562getHoursUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18564getHoursUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m18568getMicrosecondsUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18570getMicrosecondsUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m18574getMillisecondsUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18576getMillisecondsUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m18580getMinutesUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18582getMinutesUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m18586getNanosecondsUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18588getNanosecondsUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m18592getSecondsUwyO8pc(long j6) {
            return DurationKt.toDuration(j6, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18594getSecondsUwyO8pc$annotations(int i6) {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m18554getDaysUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18559getDaysUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m18560getHoursUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18565getHoursUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m18566getMicrosecondsUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18571getMicrosecondsUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m18572getMillisecondsUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18577getMillisecondsUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m18578getMinutesUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18583getMinutesUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m18584getNanosecondsUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18589getNanosecondsUwyO8pc$annotations(long j6) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m18590getSecondsUwyO8pc(double d6) {
            return DurationKt.toDuration(d6, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m18595getSecondsUwyO8pc$annotations(long j6) {
        }
    }

    private /* synthetic */ Duration(long j6) {
        this.rawValue = j6;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m18503addValuesMixedRangesUwyO8pc(long j6, long j7, long j8) {
        long jNanosToMillis = DurationKt.nanosToMillis(j8);
        long j9 = j7 + jNanosToMillis;
        if (-4611686018426L > j9 || j9 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j9, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j9) + (j8 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m18504appendFractionalimpl(long j6, StringBuilder sb, int i6, int i7, int i8, String str, boolean z6) {
        sb.append(i6);
        if (i7 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i7), i8, '0');
            int i9 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i9 = length;
                        break;
                    } else if (i10 < 0) {
                        break;
                    } else {
                        length = i10;
                    }
                }
            }
            int i11 = i9 + 1;
            if (z6 || i11 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i9 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i11);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m18505boximpl(long j6) {
        return new Duration(j6);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m18507constructorimpl(long j6) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j6;
        }
        if (m18531isInNanosimpl(j6)) {
            long jM18527getValueimpl = m18527getValueimpl(j6);
            if (-4611686018426999999L <= jM18527getValueimpl && jM18527getValueimpl < 4611686018427000000L) {
                return j6;
            }
            throw new AssertionError(m18527getValueimpl(j6) + " ns is out of nanoseconds range");
        }
        long jM18527getValueimpl2 = m18527getValueimpl(j6);
        if (-4611686018427387903L > jM18527getValueimpl2 || jM18527getValueimpl2 >= SieveCacheKt.NodeVisitedBit) {
            throw new AssertionError(m18527getValueimpl(j6) + " ms is out of milliseconds range");
        }
        long jM18527getValueimpl3 = m18527getValueimpl(j6);
        if (-4611686018426L > jM18527getValueimpl3 || jM18527getValueimpl3 >= 4611686018427L) {
            return j6;
        }
        throw new AssertionError(m18527getValueimpl(j6) + " ms is denormalized");
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m18508divLRDsOJo(long j6, long j7) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m18525getStorageUnitimpl(j6), m18525getStorageUnitimpl(j7));
        return m18543toDoubleimpl(j6, durationUnit) / m18543toDoubleimpl(j7, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m18510divUwyO8pc(long j6, int i6) {
        if (i6 == 0) {
            if (m18534isPositiveimpl(j6)) {
                return INFINITE;
            }
            if (m18533isNegativeimpl(j6)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m18531isInNanosimpl(j6)) {
            return DurationKt.durationOfNanos(m18527getValueimpl(j6) / i6);
        }
        if (m18532isInfiniteimpl(j6)) {
            return m18538timesUwyO8pc(j6, MathKt.getSign(i6));
        }
        long j7 = i6;
        long jM18527getValueimpl = m18527getValueimpl(j6) / j7;
        if (-4611686018426L > jM18527getValueimpl || jM18527getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM18527getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM18527getValueimpl) + (DurationKt.millisToNanos(m18527getValueimpl(j6) - (jM18527getValueimpl * j7)) / j7));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m18511equalsimpl(long j6, Object obj) {
        return (obj instanceof Duration) && j6 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m18512equalsimpl0(long j6, long j7) {
        return j6 == j7;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m18513getAbsoluteValueUwyO8pc(long j6) {
        return m18533isNegativeimpl(j6) ? m18551unaryMinusUwyO8pc(j6) : j6;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m18514getHoursComponentimpl(long j6) {
        if (m18532isInfiniteimpl(j6)) {
            return 0;
        }
        return (int) (m18516getInWholeHoursimpl(j6) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m18515getInWholeDaysimpl(long j6) {
        return m18546toLongimpl(j6, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m18516getInWholeHoursimpl(long j6) {
        return m18546toLongimpl(j6, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m18517getInWholeMicrosecondsimpl(long j6) {
        return m18546toLongimpl(j6, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m18518getInWholeMillisecondsimpl(long j6) {
        return (m18530isInMillisimpl(j6) && m18529isFiniteimpl(j6)) ? m18527getValueimpl(j6) : m18546toLongimpl(j6, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m18519getInWholeMinutesimpl(long j6) {
        return m18546toLongimpl(j6, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m18520getInWholeNanosecondsimpl(long j6) {
        long jM18527getValueimpl = m18527getValueimpl(j6);
        if (m18531isInNanosimpl(j6)) {
            return jM18527getValueimpl;
        }
        if (jM18527getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM18527getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM18527getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m18521getInWholeSecondsimpl(long j6) {
        return m18546toLongimpl(j6, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m18522getMinutesComponentimpl(long j6) {
        if (m18532isInfiniteimpl(j6)) {
            return 0;
        }
        return (int) (m18519getInWholeMinutesimpl(j6) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m18523getNanosecondsComponentimpl(long j6) {
        if (m18532isInfiniteimpl(j6)) {
            return 0;
        }
        return (int) (m18530isInMillisimpl(j6) ? DurationKt.millisToNanos(m18527getValueimpl(j6) % 1000) : m18527getValueimpl(j6) % InstantKt.NANOS_PER_SECOND);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m18524getSecondsComponentimpl(long j6) {
        if (m18532isInfiniteimpl(j6)) {
            return 0;
        }
        return (int) (m18521getInWholeSecondsimpl(j6) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m18525getStorageUnitimpl(long j6) {
        return m18531isInNanosimpl(j6) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m18526getUnitDiscriminatorimpl(long j6) {
        return ((int) j6) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m18527getValueimpl(long j6) {
        return j6 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m18528hashCodeimpl(long j6) {
        return Long.hashCode(j6);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m18529isFiniteimpl(long j6) {
        return !m18532isInfiniteimpl(j6);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m18530isInMillisimpl(long j6) {
        return (((int) j6) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m18531isInNanosimpl(long j6) {
        return (((int) j6) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m18532isInfiniteimpl(long j6) {
        return j6 == INFINITE || j6 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m18533isNegativeimpl(long j6) {
        return j6 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m18534isPositiveimpl(long j6) {
        return j6 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m18535minusLRDsOJo(long j6, long j7) {
        return m18536plusLRDsOJo(j6, m18551unaryMinusUwyO8pc(j7));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m18536plusLRDsOJo(long j6, long j7) {
        if (m18532isInfiniteimpl(j6)) {
            if (m18529isFiniteimpl(j7) || (j7 ^ j6) >= 0) {
                return j6;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m18532isInfiniteimpl(j7)) {
            return j7;
        }
        if ((((int) j6) & 1) != (((int) j7) & 1)) {
            return m18530isInMillisimpl(j6) ? m18503addValuesMixedRangesUwyO8pc(j6, m18527getValueimpl(j6), m18527getValueimpl(j7)) : m18503addValuesMixedRangesUwyO8pc(j6, m18527getValueimpl(j7), m18527getValueimpl(j6));
        }
        long jM18527getValueimpl = m18527getValueimpl(j6) + m18527getValueimpl(j7);
        return m18531isInNanosimpl(j6) ? DurationKt.durationOfNanosNormalized(jM18527getValueimpl) : DurationKt.durationOfMillisNormalized(jM18527getValueimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m18538timesUwyO8pc(long j6, int i6) {
        if (m18532isInfiniteimpl(j6)) {
            if (i6 != 0) {
                return i6 > 0 ? j6 : m18551unaryMinusUwyO8pc(j6);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i6 == 0) {
            return ZERO;
        }
        long jM18527getValueimpl = m18527getValueimpl(j6);
        long j7 = i6;
        long j8 = jM18527getValueimpl * j7;
        if (!m18531isInNanosimpl(j6)) {
            return j8 / j7 == jM18527getValueimpl ? DurationKt.durationOfMillis(RangesKt.coerceIn(j8, new LongRange(-4611686018427387903L, 4611686018427387903L))) : MathKt.getSign(jM18527getValueimpl) * MathKt.getSign(i6) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM18527getValueimpl && jM18527getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j8);
        }
        if (j8 / j7 == jM18527getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j8);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM18527getValueimpl);
        long j9 = jNanosToMillis * j7;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM18527getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j7) + j9;
        return (j9 / j7 != jNanosToMillis || (jNanosToMillis2 ^ j9) < 0) ? MathKt.getSign(jM18527getValueimpl) * MathKt.getSign(i6) > 0 ? INFINITE : NEG_INFINITE : DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m18542toComponentsimpl(long j6, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m18515getInWholeDaysimpl(j6)), Integer.valueOf(m18514getHoursComponentimpl(j6)), Integer.valueOf(m18522getMinutesComponentimpl(j6)), Integer.valueOf(m18524getSecondsComponentimpl(j6)), Integer.valueOf(m18523getNanosecondsComponentimpl(j6)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m18543toDoubleimpl(long j6, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j6 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m18527getValueimpl(j6), m18525getStorageUnitimpl(j6), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m18544toIntimpl(long j6, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m18546toLongimpl(j6, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m18545toIsoStringimpl(long j6) {
        StringBuilder sb = new StringBuilder();
        if (m18533isNegativeimpl(j6)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM18513getAbsoluteValueUwyO8pc = m18513getAbsoluteValueUwyO8pc(j6);
        long jM18516getInWholeHoursimpl = m18516getInWholeHoursimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18522getMinutesComponentimpl = m18522getMinutesComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18524getSecondsComponentimpl = m18524getSecondsComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18523getNanosecondsComponentimpl = m18523getNanosecondsComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        long j7 = m18532isInfiniteimpl(j6) ? 9999999999999L : jM18516getInWholeHoursimpl;
        boolean z6 = false;
        boolean z7 = j7 != 0;
        boolean z8 = (iM18524getSecondsComponentimpl == 0 && iM18523getNanosecondsComponentimpl == 0) ? false : true;
        if (iM18522getMinutesComponentimpl != 0 || (z8 && z7)) {
            z6 = true;
        }
        if (z7) {
            sb.append(j7);
            sb.append('H');
        }
        if (z6) {
            sb.append(iM18522getMinutesComponentimpl);
            sb.append('M');
        }
        if (z8 || (!z7 && !z6)) {
            m18504appendFractionalimpl(j6, sb, iM18524getSecondsComponentimpl, iM18523getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m18546toLongimpl(long j6, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j6 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j6 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m18527getValueimpl(j6), m18525getStorageUnitimpl(j6), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m18547toStringimpl(long j6) {
        if (j6 == 0) {
            return "0s";
        }
        if (j6 == INFINITE) {
            return "Infinity";
        }
        if (j6 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM18533isNegativeimpl = m18533isNegativeimpl(j6);
        StringBuilder sb = new StringBuilder();
        if (zM18533isNegativeimpl) {
            sb.append('-');
        }
        long jM18513getAbsoluteValueUwyO8pc = m18513getAbsoluteValueUwyO8pc(j6);
        long jM18515getInWholeDaysimpl = m18515getInWholeDaysimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18514getHoursComponentimpl = m18514getHoursComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18522getMinutesComponentimpl = m18522getMinutesComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18524getSecondsComponentimpl = m18524getSecondsComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int iM18523getNanosecondsComponentimpl = m18523getNanosecondsComponentimpl(jM18513getAbsoluteValueUwyO8pc);
        int i6 = 0;
        boolean z6 = jM18515getInWholeDaysimpl != 0;
        boolean z7 = iM18514getHoursComponentimpl != 0;
        boolean z8 = iM18522getMinutesComponentimpl != 0;
        boolean z9 = (iM18524getSecondsComponentimpl == 0 && iM18523getNanosecondsComponentimpl == 0) ? false : true;
        if (z6) {
            sb.append(jM18515getInWholeDaysimpl);
            sb.append('d');
            i6 = 1;
        }
        if (z7 || (z6 && (z8 || z9))) {
            int i7 = i6 + 1;
            if (i6 > 0) {
                sb.append(' ');
            }
            sb.append(iM18514getHoursComponentimpl);
            sb.append('h');
            i6 = i7;
        }
        if (z8 || (z9 && (z7 || z6))) {
            int i8 = i6 + 1;
            if (i6 > 0) {
                sb.append(' ');
            }
            sb.append(iM18522getMinutesComponentimpl);
            sb.append('m');
            i6 = i8;
        }
        if (z9) {
            int i9 = i6 + 1;
            if (i6 > 0) {
                sb.append(' ');
            }
            if (iM18524getSecondsComponentimpl != 0 || z6 || z7 || z8) {
                m18504appendFractionalimpl(j6, sb, iM18524getSecondsComponentimpl, iM18523getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM18523getNanosecondsComponentimpl >= 1000000) {
                m18504appendFractionalimpl(j6, sb, iM18523getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM18523getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM18523getNanosecondsComponentimpl >= 1000) {
                m18504appendFractionalimpl(j6, sb, iM18523getNanosecondsComponentimpl / 1000, iM18523getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM18523getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i6 = i9;
        }
        if (zM18533isNegativeimpl && i6 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m18549toStringimpl$default(long j6, DurationUnit durationUnit, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i6 = 0;
        }
        return m18548toStringimpl(j6, durationUnit, i6);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m18550truncateToUwyO8pc$kotlin_stdlib(long j6, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM18525getStorageUnitimpl = m18525getStorageUnitimpl(j6);
        if (unit.compareTo(durationUnitM18525getStorageUnitimpl) <= 0 || m18532isInfiniteimpl(j6)) {
            return j6;
        }
        return DurationKt.toDuration(m18527getValueimpl(j6) - (m18527getValueimpl(j6) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM18525getStorageUnitimpl)), durationUnitM18525getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m18551unaryMinusUwyO8pc(long j6) {
        return DurationKt.durationOf(-m18527getValueimpl(j6), ((int) j6) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m18552compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m18552compareToLRDsOJo(long j6) {
        return m18506compareToLRDsOJo(this.rawValue, j6);
    }

    public boolean equals(Object other) {
        return m18511equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m18528hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m18547toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m18506compareToLRDsOJo(long j6, long j7) {
        long j8 = j6 ^ j7;
        if (j8 < 0 || (((int) j8) & 1) == 0) {
            return Intrinsics.compare(j6, j7);
        }
        int i6 = (((int) j6) & 1) - (((int) j7) & 1);
        return m18533isNegativeimpl(j6) ? -i6 : i6;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m18541toComponentsimpl(long j6, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m18516getInWholeHoursimpl(j6)), Integer.valueOf(m18522getMinutesComponentimpl(j6)), Integer.valueOf(m18524getSecondsComponentimpl(j6)), Integer.valueOf(m18523getNanosecondsComponentimpl(j6)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m18540toComponentsimpl(long j6, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m18519getInWholeMinutesimpl(j6)), Integer.valueOf(m18524getSecondsComponentimpl(j6)), Integer.valueOf(m18523getNanosecondsComponentimpl(j6)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m18539toComponentsimpl(long j6, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m18521getInWholeSecondsimpl(j6)), Integer.valueOf(m18523getNanosecondsComponentimpl(j6)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m18509divUwyO8pc(long j6, double d6) {
        int iRoundToInt = MathKt.roundToInt(d6);
        if (iRoundToInt == d6 && iRoundToInt != 0) {
            return m18510divUwyO8pc(j6, iRoundToInt);
        }
        DurationUnit durationUnitM18525getStorageUnitimpl = m18525getStorageUnitimpl(j6);
        return DurationKt.toDuration(m18543toDoubleimpl(j6, durationUnitM18525getStorageUnitimpl) / d6, durationUnitM18525getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m18537timesUwyO8pc(long j6, double d6) {
        int iRoundToInt = MathKt.roundToInt(d6);
        if (iRoundToInt == d6) {
            return m18538timesUwyO8pc(j6, iRoundToInt);
        }
        DurationUnit durationUnitM18525getStorageUnitimpl = m18525getStorageUnitimpl(j6);
        return DurationKt.toDuration(m18543toDoubleimpl(j6, durationUnitM18525getStorageUnitimpl) * d6, durationUnitM18525getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m18548toStringimpl(long j6, DurationUnit unit, int i6) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i6 >= 0) {
            double dM18543toDoubleimpl = m18543toDoubleimpl(j6, unit);
            if (Double.isInfinite(dM18543toDoubleimpl)) {
                return String.valueOf(dM18543toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM18543toDoubleimpl, RangesKt.coerceAtMost(i6, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i6).toString());
    }
}
