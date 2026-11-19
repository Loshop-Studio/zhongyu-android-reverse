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
@Metadata(m13557d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087@\u0018\u0000 \u0089\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0089\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0016\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b%\u0010(J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b*\u0010&J\u0018\u0010)\u001a\u00020\u00002\u0006\u0010$\u001a\u00020'H\u0086\u0002¢\u0006\u0004\b*\u0010(J\u0018\u0010)\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0013H\u0000¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b2\u0010\u000fJ\r\u00103\u001a\u00020\r¢\u0006\u0004\b4\u0010\u000fJ\r\u00105\u001a\u00020\r¢\u0006\u0004\b6\u0010\u000fJ\r\u00107\u001a\u00020\r¢\u0006\u0004\b8\u0010\u000fJ\u0018\u0010;\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u009d\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2u\u0010@\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(D\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0AH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010JJ\u0088\u0001\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2`\u0010@\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(E\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0KH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010LJs\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?2K\u0010@\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(F\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0MH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010NJ^\u0010>\u001a\u0002H?\"\u0004\b\u0000\u0010?26\u0010@\u001a2\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(G\u0012\u0013\u0012\u00110\t¢\u0006\f\bB\u0012\b\bC\u0012\u0004\b\b(H\u0012\u0004\u0012\u0002H?0OH\u0086\bø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bI\u0010PJ\u0015\u0010^\u001a\u00020'2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\b_\u0010`J\u0015\u0010a\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bb\u00100J\u0015\u0010c\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013¢\u0006\u0004\bd\u0010eJ\u000f\u0010t\u001a\u00020uH\u0016¢\u0006\u0004\bv\u0010wJA\u0010x\u001a\u00020y*\u00060zj\u0002`{2\u0006\u0010|\u001a\u00020\t2\u0006\u0010}\u001a\u00020\t2\u0006\u0010~\u001a\u00020\t2\u0006\u0010.\u001a\u00020u2\u0006\u0010\u007f\u001a\u00020\rH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J!\u0010t\u001a\u00020u2\u0006\u0010.\u001a\u00020\u00132\t\b\u0002\u0010\u0082\u0001\u001a\u00020\t¢\u0006\u0005\bv\u0010\u0083\u0001J\u000f\u0010\u0084\u0001\u001a\u00020u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u0015\u0010\u0086\u0001\u001a\u00020\r2\t\u0010\u0019\u001a\u0005\u0018\u00010\u0087\u0001HÖ\u0003J\n\u0010\u0088\u0001\u001a\u00020\tHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0015\u0010\b\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u00109\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u0010\u0005R\u001a\u0010Q\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bR\u0010S\u001a\u0004\bT\u0010\u000bR\u001a\u0010U\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bV\u0010S\u001a\u0004\bW\u0010\u000bR\u001a\u0010X\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\bY\u0010S\u001a\u0004\bZ\u0010\u000bR\u001a\u0010[\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\\\u0010S\u001a\u0004\b]\u0010\u000bR\u0011\u0010f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bg\u0010\u0005R\u0011\u0010h\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bi\u0010\u0005R\u0011\u0010j\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bk\u0010\u0005R\u0011\u0010l\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bm\u0010\u0005R\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bo\u0010\u0005R\u0011\u0010p\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bq\u0010\u0005R\u0011\u0010r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bs\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008a\u0001"}, m13558d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "value", "getValue-impl", "unitDiscriminator", "", "getUnitDiscriminator-impl", "(J)I", "isInNanos", "", "isInNanos-impl", "(J)Z", "isInMillis", "isInMillis-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unaryMinus", "unaryMinus-UwyO8pc", "plus", "other", "plus-LRDsOJo", "(JJ)J", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "minus", "minus-LRDsOJo", "times", "scale", "times-UwyO8pc", "(JI)J", "", "(JD)J", "div", "div-UwyO8pc", "div-LRDsOJo", "(JJ)D", "truncateTo", "unit", "truncateTo-UwyO8pc$kotlin_stdlib", "(JLkotlin/time/DurationUnit;)J", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "isInfinite", "isInfinite-impl", "isFinite", "isFinite-impl", "absoluteValue", "getAbsoluteValue-UwyO8pc", "compareTo", "compareTo-LRDsOJo", "(JJ)I", "toComponents", ExifInterface.GPS_DIRECTION_TRUE, "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "hoursComponent", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "toDouble", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toLong", "toLong-impl", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeSeconds", "getInWholeSeconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "toIsoString", "toIsoString-impl", "equals", "", "hashCode", "Companion", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
@JvmInline
@SourceDebugExtension({"SMAP\nDuration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1062:1\n37#1:1063\n37#1:1064\n37#1:1065\n37#1:1066\n37#1:1067\n500#1:1068\n517#1:1076\n170#2,6:1069\n1#3:1075\n*S KotlinDebug\n*F\n+ 1 Duration.kt\nkotlin/time/Duration\n*L\n38#1:1063\n39#1:1064\n274#1:1065\n294#1:1066\n478#1:1067\n727#1:1068\n818#1:1076\n769#1:1069,6\n*E\n"})
/* loaded from: classes5.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m25623constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(4611686018427387903L);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @Metadata(m13557d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007J\u0015\u00100\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0004\b5\u00103J\u0015\u00106\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b7J\u0015\u00108\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u000201¢\u0006\u0002\b9R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\t\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0016\u0010\u000b\u001a\u00020\u0005X\u0080\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0017\u0010\u001bR\u001f\u0010\u0013\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001bR\u001f\u0010\u001e\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001dR\u001f\u0010!\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001f\u0010!\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u001bR\u001f\u0010!\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u001f\u0010$\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0018R\u001f\u0010$\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001a\u001a\u0004\b&\u0010\u001bR\u001f\u0010$\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010\u001dR\u001f\u0010'\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0018R\u001f\u0010'\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001a\u001a\u0004\b)\u0010\u001bR\u001f\u0010'\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001dR\u001f\u0010*\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u0016\u001a\u0004\b,\u0010\u0018R\u001f\u0010*\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001a\u001a\u0004\b,\u0010\u001bR\u001f\u0010*\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\u001c\u001a\u0004\b,\u0010\u001dR\u001f\u0010-\u001a\u00020\u0005*\u00020\u00148Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u0016\u001a\u0004\b/\u0010\u0018R\u001f\u0010-\u001a\u00020\u0005*\u00020\u00198Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001a\u001a\u0004\b/\u0010\u001bR\u001f\u0010-\u001a\u00020\u0005*\u00020\u000e8Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001d¨\u0006:"}, m13558d2 = {"Lkotlin/time/Duration$Companion;", "", "<init>", "()V", "ZERO", "Lkotlin/time/Duration;", "getZERO-UwyO8pc", "()J", "J", "INFINITE", "getINFINITE-UwyO8pc", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "convert", "", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "nanoseconds", "", "getNanoseconds-UwyO8pc$annotations", "(I)V", "getNanoseconds-UwyO8pc", "(I)J", "", "(J)V", "(J)J", "(D)V", "(D)J", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "days", "getDays-UwyO8pc$annotations", "getDays-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseOrNull", "parseOrNull-FghU774", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "kotlin-stdlib"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m25671getDaysUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25673getDaysUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m25677getHoursUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25679getHoursUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m25683getMicrosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25685getMicrosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m25689getMillisecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25691getMillisecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m25695getMinutesUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25697getMinutesUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m25701getNanosecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25703getNanosecondsUwyO8pc$annotations(double d10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m25707getSecondsUwyO8pc(int i10) {
            return DurationKt.toDuration(i10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25709getSecondsUwyO8pc$annotations(double d10) {
        }

        @ExperimentalTime
        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m25712getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m25713getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m25714getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m25715parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e10);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m25716parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e10) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e10);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m25717parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m25621boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m25718parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m25621boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m25672getDaysUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25674getDaysUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m25678getHoursUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25680getHoursUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m25684getMicrosecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25686getMicrosecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m25690getMillisecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25692getMillisecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m25696getMinutesUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25698getMinutesUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m25702getNanosecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25704getNanosecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m25708getSecondsUwyO8pc(long j10) {
            return DurationKt.toDuration(j10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25710getSecondsUwyO8pc$annotations(int i10) {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m25670getDaysUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.DAYS);
        }

        @InlineOnly
        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25675getDaysUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m25676getHoursUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.HOURS);
        }

        @InlineOnly
        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25681getHoursUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m25682getMicrosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MICROSECONDS);
        }

        @InlineOnly
        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25687getMicrosecondsUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m25688getMillisecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MILLISECONDS);
        }

        @InlineOnly
        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25693getMillisecondsUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m25694getMinutesUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.MINUTES);
        }

        @InlineOnly
        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25699getMinutesUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m25700getNanosecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.NANOSECONDS);
        }

        @InlineOnly
        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25705getNanosecondsUwyO8pc$annotations(long j10) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m25706getSecondsUwyO8pc(double d10) {
            return DurationKt.toDuration(d10, DurationUnit.SECONDS);
        }

        @InlineOnly
        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m25711getSecondsUwyO8pc$annotations(long j10) {
        }
    }

    private /* synthetic */ Duration(long j10) {
        this.rawValue = j10;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m25619addValuesMixedRangesUwyO8pc(long j10, long j11, long j12) {
        long jNanosToMillis = DurationKt.nanosToMillis(j12);
        long j13 = j11 + jNanosToMillis;
        if (-4611686018426L > j13 || j13 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j13, -4611686018427387903L, 4611686018427387903L));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j13) + (j12 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m25620appendFractionalimpl(long j10, StringBuilder sb, int i10, int i11, int i12, String str, boolean z9) {
        sb.append(i10);
        if (i11 != 0) {
            sb.append('.');
            String strPadStart = StringsKt.padStart(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z9 || i15 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i13 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i15);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m25621boximpl(long j10) {
        return new Duration(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m25623constructorimpl(long j10) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j10;
        }
        if (m25647isInNanosimpl(j10)) {
            long jM25643getValueimpl = m25643getValueimpl(j10);
            if (-4611686018426999999L <= jM25643getValueimpl && jM25643getValueimpl < 4611686018427000000L) {
                return j10;
            }
            throw new AssertionError(m25643getValueimpl(j10) + " ns is out of nanoseconds range");
        }
        long jM25643getValueimpl2 = m25643getValueimpl(j10);
        if (-4611686018427387903L > jM25643getValueimpl2 || jM25643getValueimpl2 >= SieveCacheKt.NodeVisitedBit) {
            throw new AssertionError(m25643getValueimpl(j10) + " ms is out of milliseconds range");
        }
        long jM25643getValueimpl3 = m25643getValueimpl(j10);
        if (-4611686018426L > jM25643getValueimpl3 || jM25643getValueimpl3 >= 4611686018427L) {
            return j10;
        }
        throw new AssertionError(m25643getValueimpl(j10) + " ms is denormalized");
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m25624divLRDsOJo(long j10, long j11) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m25641getStorageUnitimpl(j10), m25641getStorageUnitimpl(j11));
        return m25659toDoubleimpl(j10, durationUnit) / m25659toDoubleimpl(j11, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m25626divUwyO8pc(long j10, int i10) {
        if (i10 == 0) {
            if (m25650isPositiveimpl(j10)) {
                return INFINITE;
            }
            if (m25649isNegativeimpl(j10)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m25647isInNanosimpl(j10)) {
            return DurationKt.durationOfNanos(m25643getValueimpl(j10) / i10);
        }
        if (m25648isInfiniteimpl(j10)) {
            return m25654timesUwyO8pc(j10, MathKt.getSign(i10));
        }
        long j11 = i10;
        long jM25643getValueimpl = m25643getValueimpl(j10) / j11;
        if (-4611686018426L > jM25643getValueimpl || jM25643getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM25643getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM25643getValueimpl) + (DurationKt.millisToNanos(m25643getValueimpl(j10) - (jM25643getValueimpl * j11)) / j11));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25627equalsimpl(long j10, Object obj) {
        return (obj instanceof Duration) && j10 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25628equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m25629getAbsoluteValueUwyO8pc(long j10) {
        return m25649isNegativeimpl(j10) ? m25667unaryMinusUwyO8pc(j10) : j10;
    }

    @PublishedApi
    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m25630getHoursComponentimpl(long j10) {
        if (m25648isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m25632getInWholeHoursimpl(j10) % 24);
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m25631getInWholeDaysimpl(long j10) {
        return m25662toLongimpl(j10, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m25632getInWholeHoursimpl(long j10) {
        return m25662toLongimpl(j10, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m25633getInWholeMicrosecondsimpl(long j10) {
        return m25662toLongimpl(j10, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m25634getInWholeMillisecondsimpl(long j10) {
        return (m25646isInMillisimpl(j10) && m25645isFiniteimpl(j10)) ? m25643getValueimpl(j10) : m25662toLongimpl(j10, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m25635getInWholeMinutesimpl(long j10) {
        return m25662toLongimpl(j10, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m25636getInWholeNanosecondsimpl(long j10) {
        long jM25643getValueimpl = m25643getValueimpl(j10);
        if (m25647isInNanosimpl(j10)) {
            return jM25643getValueimpl;
        }
        if (jM25643getValueimpl > 9223372036854L) {
            return Long.MAX_VALUE;
        }
        if (jM25643getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM25643getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m25637getInWholeSecondsimpl(long j10) {
        return m25662toLongimpl(j10, DurationUnit.SECONDS);
    }

    @PublishedApi
    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m25638getMinutesComponentimpl(long j10) {
        if (m25648isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m25635getInWholeMinutesimpl(j10) % 60);
    }

    @PublishedApi
    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m25639getNanosecondsComponentimpl(long j10) {
        if (m25648isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m25646isInMillisimpl(j10) ? DurationKt.millisToNanos(m25643getValueimpl(j10) % 1000) : m25643getValueimpl(j10) % InstantKt.NANOS_PER_SECOND);
    }

    @PublishedApi
    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m25640getSecondsComponentimpl(long j10) {
        if (m25648isInfiniteimpl(j10)) {
            return 0;
        }
        return (int) (m25637getInWholeSecondsimpl(j10) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m25641getStorageUnitimpl(long j10) {
        return m25647isInNanosimpl(j10) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m25642getUnitDiscriminatorimpl(long j10) {
        return ((int) j10) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m25643getValueimpl(long j10) {
        return j10 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25644hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m25645isFiniteimpl(long j10) {
        return !m25648isInfiniteimpl(j10);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m25646isInMillisimpl(long j10) {
        return (((int) j10) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m25647isInNanosimpl(long j10) {
        return (((int) j10) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m25648isInfiniteimpl(long j10) {
        return j10 == INFINITE || j10 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m25649isNegativeimpl(long j10) {
        return j10 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m25650isPositiveimpl(long j10) {
        return j10 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m25651minusLRDsOJo(long j10, long j11) {
        return m25652plusLRDsOJo(j10, m25667unaryMinusUwyO8pc(j11));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m25652plusLRDsOJo(long j10, long j11) {
        if (m25648isInfiniteimpl(j10)) {
            if (m25645isFiniteimpl(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m25648isInfiniteimpl(j11)) {
            return j11;
        }
        if ((((int) j10) & 1) != (((int) j11) & 1)) {
            return m25646isInMillisimpl(j10) ? m25619addValuesMixedRangesUwyO8pc(j10, m25643getValueimpl(j10), m25643getValueimpl(j11)) : m25619addValuesMixedRangesUwyO8pc(j10, m25643getValueimpl(j11), m25643getValueimpl(j10));
        }
        long jM25643getValueimpl = m25643getValueimpl(j10) + m25643getValueimpl(j11);
        return m25647isInNanosimpl(j10) ? DurationKt.durationOfNanosNormalized(jM25643getValueimpl) : DurationKt.durationOfMillisNormalized(jM25643getValueimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m25654timesUwyO8pc(long j10, int i10) {
        if (m25648isInfiniteimpl(j10)) {
            if (i10 != 0) {
                return i10 > 0 ? j10 : m25667unaryMinusUwyO8pc(j10);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i10 == 0) {
            return ZERO;
        }
        long jM25643getValueimpl = m25643getValueimpl(j10);
        long j11 = i10;
        long j12 = jM25643getValueimpl * j11;
        if (!m25647isInNanosimpl(j10)) {
            return j12 / j11 == jM25643getValueimpl ? DurationKt.durationOfMillis(RangesKt.coerceIn(j12, new LongRange(-4611686018427387903L, 4611686018427387903L))) : MathKt.getSign(jM25643getValueimpl) * MathKt.getSign(i10) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM25643getValueimpl && jM25643getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j12);
        }
        if (j12 / j11 == jM25643getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j12);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM25643getValueimpl);
        long j13 = jNanosToMillis * j11;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM25643getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j11) + j13;
        return (j13 / j11 != jNanosToMillis || (jNanosToMillis2 ^ j13) < 0) ? MathKt.getSign(jM25643getValueimpl) * MathKt.getSign(i10) > 0 ? INFINITE : NEG_INFINITE : DurationKt.durationOfMillis(RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, 4611686018427387903L)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m25658toComponentsimpl(long j10, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m25631getInWholeDaysimpl(j10)), Integer.valueOf(m25630getHoursComponentimpl(j10)), Integer.valueOf(m25638getMinutesComponentimpl(j10)), Integer.valueOf(m25640getSecondsComponentimpl(j10)), Integer.valueOf(m25639getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m25659toDoubleimpl(long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m25643getValueimpl(j10), m25641getStorageUnitimpl(j10), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m25660toIntimpl(long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m25662toLongimpl(j10, unit), SieveCacheKt.NodeMetaAndPreviousMask, SieveCacheKt.NodeLinkMask);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m25661toIsoStringimpl(long j10) {
        StringBuilder sb = new StringBuilder();
        if (m25649isNegativeimpl(j10)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM25629getAbsoluteValueUwyO8pc = m25629getAbsoluteValueUwyO8pc(j10);
        long jM25632getInWholeHoursimpl = m25632getInWholeHoursimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25638getMinutesComponentimpl = m25638getMinutesComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25640getSecondsComponentimpl = m25640getSecondsComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25639getNanosecondsComponentimpl = m25639getNanosecondsComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        long j11 = m25648isInfiniteimpl(j10) ? 9999999999999L : jM25632getInWholeHoursimpl;
        boolean z9 = false;
        boolean z10 = j11 != 0;
        boolean z11 = (iM25640getSecondsComponentimpl == 0 && iM25639getNanosecondsComponentimpl == 0) ? false : true;
        if (iM25638getMinutesComponentimpl != 0 || (z11 && z10)) {
            z9 = true;
        }
        if (z10) {
            sb.append(j11);
            sb.append('H');
        }
        if (z9) {
            sb.append(iM25638getMinutesComponentimpl);
            sb.append('M');
        }
        if (z11 || (!z10 && !z9)) {
            m25620appendFractionalimpl(j10, sb, iM25640getSecondsComponentimpl, iM25639getNanosecondsComponentimpl, 9, ExifInterface.LATITUDE_SOUTH, true);
        }
        return sb.toString();
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m25662toLongimpl(long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j10 == INFINITE) {
            return Long.MAX_VALUE;
        }
        if (j10 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m25643getValueimpl(j10), m25641getStorageUnitimpl(j10), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25663toStringimpl(long j10) {
        if (j10 == 0) {
            return "0s";
        }
        if (j10 == INFINITE) {
            return "Infinity";
        }
        if (j10 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM25649isNegativeimpl = m25649isNegativeimpl(j10);
        StringBuilder sb = new StringBuilder();
        if (zM25649isNegativeimpl) {
            sb.append('-');
        }
        long jM25629getAbsoluteValueUwyO8pc = m25629getAbsoluteValueUwyO8pc(j10);
        long jM25631getInWholeDaysimpl = m25631getInWholeDaysimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25630getHoursComponentimpl = m25630getHoursComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25638getMinutesComponentimpl = m25638getMinutesComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25640getSecondsComponentimpl = m25640getSecondsComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int iM25639getNanosecondsComponentimpl = m25639getNanosecondsComponentimpl(jM25629getAbsoluteValueUwyO8pc);
        int i10 = 0;
        boolean z9 = jM25631getInWholeDaysimpl != 0;
        boolean z10 = iM25630getHoursComponentimpl != 0;
        boolean z11 = iM25638getMinutesComponentimpl != 0;
        boolean z12 = (iM25640getSecondsComponentimpl == 0 && iM25639getNanosecondsComponentimpl == 0) ? false : true;
        if (z9) {
            sb.append(jM25631getInWholeDaysimpl);
            sb.append('d');
            i10 = 1;
        }
        if (z10 || (z9 && (z11 || z12))) {
            int i11 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iM25630getHoursComponentimpl);
            sb.append('h');
            i10 = i11;
        }
        if (z11 || (z12 && (z10 || z9))) {
            int i12 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            sb.append(iM25638getMinutesComponentimpl);
            sb.append('m');
            i10 = i12;
        }
        if (z12) {
            int i13 = i10 + 1;
            if (i10 > 0) {
                sb.append(' ');
            }
            if (iM25640getSecondsComponentimpl != 0 || z9 || z10 || z11) {
                m25620appendFractionalimpl(j10, sb, iM25640getSecondsComponentimpl, iM25639getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM25639getNanosecondsComponentimpl >= 1000000) {
                m25620appendFractionalimpl(j10, sb, iM25639getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM25639getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM25639getNanosecondsComponentimpl >= 1000) {
                m25620appendFractionalimpl(j10, sb, iM25639getNanosecondsComponentimpl / 1000, iM25639getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM25639getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i10 = i13;
        }
        if (zM25649isNegativeimpl && i10 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m25665toStringimpl$default(long j10, DurationUnit durationUnit, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m25664toStringimpl(j10, durationUnit, i10);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m25666truncateToUwyO8pc$kotlin_stdlib(long j10, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM25641getStorageUnitimpl = m25641getStorageUnitimpl(j10);
        if (unit.compareTo(durationUnitM25641getStorageUnitimpl) <= 0 || m25648isInfiniteimpl(j10)) {
            return j10;
        }
        return DurationKt.toDuration(m25643getValueimpl(j10) - (m25643getValueimpl(j10) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM25641getStorageUnitimpl)), durationUnitM25641getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m25667unaryMinusUwyO8pc(long j10) {
        return DurationKt.durationOf(-m25643getValueimpl(j10), ((int) j10) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m25668compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m25668compareToLRDsOJo(long j10) {
        return m25622compareToLRDsOJo(this.rawValue, j10);
    }

    public boolean equals(Object other) {
        return m25627equalsimpl(this.rawValue, other);
    }

    public int hashCode() {
        return m25644hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m25663toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m25622compareToLRDsOJo(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 < 0 || (((int) j12) & 1) == 0) {
            return Intrinsics.compare(j10, j11);
        }
        int i10 = (((int) j10) & 1) - (((int) j11) & 1);
        return m25649isNegativeimpl(j10) ? -i10 : i10;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m25657toComponentsimpl(long j10, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m25632getInWholeHoursimpl(j10)), Integer.valueOf(m25638getMinutesComponentimpl(j10)), Integer.valueOf(m25640getSecondsComponentimpl(j10)), Integer.valueOf(m25639getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m25656toComponentsimpl(long j10, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m25635getInWholeMinutesimpl(j10)), Integer.valueOf(m25640getSecondsComponentimpl(j10)), Integer.valueOf(m25639getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m25655toComponentsimpl(long j10, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m25637getInWholeSecondsimpl(j10)), Integer.valueOf(m25639getNanosecondsComponentimpl(j10)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m25625divUwyO8pc(long j10, double d10) {
        int iRoundToInt = MathKt.roundToInt(d10);
        if (iRoundToInt == d10 && iRoundToInt != 0) {
            return m25626divUwyO8pc(j10, iRoundToInt);
        }
        DurationUnit durationUnitM25641getStorageUnitimpl = m25641getStorageUnitimpl(j10);
        return DurationKt.toDuration(m25659toDoubleimpl(j10, durationUnitM25641getStorageUnitimpl) / d10, durationUnitM25641getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m25653timesUwyO8pc(long j10, double d10) {
        int iRoundToInt = MathKt.roundToInt(d10);
        if (iRoundToInt == d10) {
            return m25654timesUwyO8pc(j10, iRoundToInt);
        }
        DurationUnit durationUnitM25641getStorageUnitimpl = m25641getStorageUnitimpl(j10);
        return DurationKt.toDuration(m25659toDoubleimpl(j10, durationUnitM25641getStorageUnitimpl) * d10, durationUnitM25641getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m25664toStringimpl(long j10, DurationUnit unit, int i10) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i10 >= 0) {
            double dM25659toDoubleimpl = m25659toDoubleimpl(j10, unit);
            if (Double.isInfinite(dM25659toDoubleimpl)) {
                return String.valueOf(dM25659toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM25659toDoubleimpl, RangesKt.coerceAtMost(i10, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(("decimals must be not negative, but was " + i10).toString());
    }
}
