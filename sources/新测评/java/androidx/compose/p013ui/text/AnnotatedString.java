package androidx.compose.p013ui.text;

import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.LinkAnnotation;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.compose.p013ui.unit.TextUnitKt;
import androidx.compose.p013ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(m13557d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 A2\u00020\u0001:\u0005?@ABCB;\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u0005¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u0005¢\u0006\u0002\u0010\rB'\b\u0000\u0012\u0016\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0018\u00010\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J0\u0010!\u001a\u00020\u00002(\u0010\"\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060\u00050#J\u0011\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0096\u0002J\"\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\"\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J*\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u00052\u0006\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\"\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J$\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00060\u00052\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012H\u0007J\u000e\u00101\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000J\u0016\u00102\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\u001e\u00103\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J\b\u00104\u001a\u00020\u0012H\u0016J*\u00105\u001a\u00020\u00002\"\u0010\"\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u00060#J\u0011\u00106\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000H\u0087\u0002J\u0018\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u0018\u00107\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u00122\u0006\u0010=\u001a\u00020\u0012H\u0016J\b\u0010>\u001a\u00020\u0003H\u0016R$\u0010\u000b\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0010R\"\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u001d\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00058F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0010R\"\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006D"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "text", "", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "annotations", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "(Ljava/lang/String;Ljava/util/List;)V", "(Ljava/util/List;Ljava/lang/String;)V", "getAnnotations$ui_text_release", "()Ljava/util/List;", "length", "", "getLength", "()I", "getParagraphStyles", "paragraphStylesOrNull", "getParagraphStylesOrNull$ui_text_release", "getSpanStyles", "spanStylesOrNull", "getSpanStylesOrNull$ui_text_release", "getText", "()Ljava/lang/String;", "equals", "", "other", "", "flatMapAnnotations", "transform", "Lkotlin/Function1;", "get", "", "index", "getLinkAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "start", "end", "getStringAnnotations", "tag", "getTtsAnnotations", "Landroidx/compose/ui/text/TtsAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "hasEqualAnnotations", "hasLinkAnnotations", "hasStringAnnotations", "hashCode", "mapAnnotations", "plus", "subSequence", "range", "Landroidx/compose/ui/text/TextRange;", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "startIndex", "endIndex", "toString", "Annotation", "Builder", "Companion", "ExhaustiveAnnotation", HttpHeaders.RANGE, "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n247#2,6:1634\n34#2,6:1640\n253#2:1646\n102#2,2:1647\n34#2,6:1649\n104#2:1655\n247#2,6:1656\n34#2,6:1662\n253#2:1668\n230#2,3:1669\n34#2,6:1672\n233#2:1678\n230#2,3:1679\n34#2,6:1682\n233#2:1688\n230#2,3:1689\n34#2,6:1692\n233#2:1698\n102#2,2:1699\n34#2,6:1701\n104#2:1707\n1045#3:1614\n366#4:1615\n70#4:1616\n114#5,8:1617\n114#5,8:1626\n1#6:1625\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n121#1:1608,6\n221#1:1634,6\n221#1:1640,6\n221#1:1646\n231#1:1647,2\n231#1:1649,6\n231#1:1655\n246#1:1656,6\n246#1:1662,6\n246#1:1668\n263#1:1669,3\n263#1:1672,6\n263#1:1678\n281#1:1679,3\n281#1:1682,6\n281#1:1688\n297#1:1689,3\n297#1:1692,6\n297#1:1698\n306#1:1699,2\n306#1:1701,6\n306#1:1707\n137#1:1614\n148#1:1615\n151#1:1616\n153#1:1617,8\n177#1:1626,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();
    private final List<Range<? extends Annotation>> annotations;
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;
    private final List<Range<SpanStyle>> spanStylesOrNull;
    private final String text;

    @Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public interface Annotation {
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m13557d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002TUB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ2\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0002\b\"J\u001e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010#\u001a\u00020\u00192\u0006\u0010&\u001a\u00020'2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ&\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u001e\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ \u00102\u001a\u00020\u00192\u0006\u00103\u001a\u0002042\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0007J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0006J\u001e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tJ\u0010\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u000207H\u0016J\u0012\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u000108H\u0016J\"\u00105\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u0001082\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\u000e\u00105\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0004J\u0015\u00109\u001a\u00020\u00192\u0006\u00106\u001a\u000207H\u0007¢\u0006\u0002\b5J7\u0010:\u001a\u00020\u00192(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=0>0<H\u0000¢\u0006\u0002\b?J1\u0010@\u001a\u00020\u00192\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0=0<H\u0000¢\u0006\u0002\bAJ\u0006\u0010B\u001a\u00020\u0019J\u000e\u0010B\u001a\u00020\u00192\u0006\u0010C\u001a\u00020\tJ\u0015\u0010D\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\bEJ\u000e\u0010F\u001a\u00020\t2\u0006\u0010G\u001a\u00020HJ\u0016\u0010I\u001a\u00020\t2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004J\u000e\u0010J\u001a\u00020\t2\u0006\u0010,\u001a\u00020-J\u000e\u0010J\u001a\u00020\t2\u0006\u0010,\u001a\u00020.J\u000e\u0010K\u001a\u00020\t2\u0006\u00100\u001a\u000201J\u0010\u0010L\u001a\u00020\t2\u0006\u00103\u001a\u000204H\u0007J\u0006\u0010M\u001a\u00020\u0006JI\u0010N\u001a\u0002HO\"\b\b\u0000\u0010O*\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\u0017\u0010P\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002HO0<¢\u0006\u0002\bQH\u0000ø\u0001\u0000¢\u0006\u0004\bR\u0010SR\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0011\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u00060\u0016j\u0002`\u0017X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006V"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "text", "", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "capacity", "", "(I)V", "annotations", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "length", "getLength", "()I", "styleStack", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "addBullet", "", "bullet", "Landroidx/compose/ui/text/Bullet;", "indentation", "Landroidx/compose/ui/unit/TextUnit;", "start", "end", "addBullet-r9BaKPg$ui_text_release", "(Landroidx/compose/ui/text/Bullet;JII)V", "addBullet$ui_text_release", "addLink", "clickable", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "url", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "addStringAnnotation", "tag", "annotation", "addStyle", "style", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "addTtsAnnotation", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "addUrlAnnotation", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", RequestParameters.SUBRESOURCE_APPEND, "char", "", "", "deprecated_append_returning_void", "flatMapAnnotations", "transform", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "", "flatMapAnnotations$ui_text_release", "mapAnnotations", "mapAnnotations$ui_text_release", "pop", "index", "pushBullet", "pushBullet$ui_text_release", "pushLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "pushStringAnnotation", "pushStyle", "pushTtsAnnotation", "pushUrlAnnotation", "toAnnotatedString", "withBulletList", "R", "block", "Lkotlin/ExtensionFunctionType;", "withBulletList-o2QH7mI$ui_text_release", "(JLandroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "BulletScope", "MutableRange", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n150#2,3:1644\n34#2,6:1647\n153#2:1653\n529#2,3:1654\n34#2,4:1657\n532#2:1661\n150#2,3:1662\n34#2,6:1665\n153#2:1671\n533#2,2:1672\n39#2:1674\n535#2:1675\n77#3,8:1620\n77#3,8:1628\n77#3,8:1636\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n540#1:1608,6\n558#1:1614,6\n964#1:1644,3\n964#1:1647,6\n964#1:1653\n981#1:1654,3\n981#1:1657,4\n981#1:1661\n982#1:1662,3\n982#1:1665,6\n982#1:1671\n981#1:1672,2\n981#1:1674\n981#1:1675\n823#1:1620,8\n935#1:1628,8\n952#1:1636,8\n*E\n"})
    public static final class Builder implements Appendable {
        public static final int $stable = 8;
        private final List<MutableRange<? extends Annotation>> annotations;
        private final BulletScope bulletScope;
        private final List<MutableRange<? extends Object>> styleStack;
        private final StringBuilder text;

        @StabilityInferred(parameters = 0)
        @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "bulletListSettingStack", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
        public static final class BulletScope {
            public static final int $stable = 8;
            private final Builder builder;
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(Builder builder) {
                this.builder = builder;
            }

            /* renamed from: getBuilder$ui_text_release, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text_release() {
                return this.bulletListSettingStack;
            }
        }

        @Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u0000 %*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001%B)\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\u0014\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J<\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J0\u0010\u001e\u001a\b\u0012\u0004\u0012\u0002H 0\u001f\"\u0004\b\u0001\u0010 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H 0\"2\b\b\u0002\u0010#\u001a\u00020\u0005J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\b\b\u0002\u0010#\u001a\u00020\u0005J\t\u0010$\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "start", "", "end", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "setEnd", "(I)V", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "equals", "", "other", "hashCode", "toRange", "Landroidx/compose/ui/text/AnnotatedString$Range;", "R", "transform", "Lkotlin/Function1;", "defaultEnd", "toString", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n77#2,8:1608\n77#2,8:1616\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n*L\n417#1:1608,8\n428#1:1616,8\n*E\n"})
        public static final /* data */ class MutableRange<T> {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private int end;
            private final T item;
            private final int start;
            private final String tag;

            @Metadata(m13557d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "()V", "fromRange", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", ExifInterface.GPS_DIRECTION_TRUE, "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final <T> MutableRange<T> fromRange(Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t10, int i10, int i11, String str) {
                this.item = t10;
                this.start = i10;
                this.end = i11;
                this.tag = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i10, int i11, String str, int i12, Object obj2) {
                if ((i12 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i12 & 2) != 0) {
                    i10 = mutableRange.start;
                }
                if ((i12 & 4) != 0) {
                    i11 = mutableRange.end;
                }
                if ((i12 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i10, i11, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i10, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i10);
            }

            public final T component1() {
                return this.item;
            }

            /* renamed from: component2, reason: from getter */
            public final int getStart() {
                return this.start;
            }

            /* renamed from: component3, reason: from getter */
            public final int getEnd() {
                return this.end;
            }

            /* renamed from: component4, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            public final MutableRange<T> copy(T item, int start, int end, String tag) {
                return new MutableRange<>(item, start, end, tag);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return Intrinsics.areEqual(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.areEqual(this.tag, mutableRange.tag);
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t10 = this.item;
                return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i10) {
                this.end = i10;
            }

            public final Range<T> toRange(int defaultEnd) {
                int i10 = this.end;
                if (i10 != Integer.MIN_VALUE) {
                    defaultEnd = i10;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, Function1 function1, int i10, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    i10 = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(function1, i10);
            }

            public final <R> Range<R> toRange(Function1<? super T, ? extends R> transform, int defaultEnd) {
                int i10 = this.end;
                if (i10 != Integer.MIN_VALUE) {
                    defaultEnd = i10;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(transform.invoke(this.item), this.start, defaultEnd, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i10, (i12 & 4) != 0 ? Integer.MIN_VALUE : i11, (i12 & 8) != 0 ? "" : str);
            }
        }

        public Builder() {
            this(0, 1, null);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release$default, reason: not valid java name */
        public static /* synthetic */ Object m22857withBulletListo2QH7mI$ui_text_release$default(Builder builder, long j10, Bullet bullet, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = BulletKt.getDefaultBulletIndentation();
            }
            if ((i10 & 2) != 0) {
                bullet = BulletKt.getDefaultBullet();
            }
            return builder.m22859withBulletListo2QH7mI$ui_text_release(j10, bullet, function1);
        }

        public final void addBullet$ui_text_release(Bullet bullet, int start, int end) {
            this.annotations.add(new MutableRange<>(bullet, start, end, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg$ui_text_release, reason: not valid java name */
        public final void m22858addBulletr9BaKPg$ui_text_release(Bullet bullet, long indentation, int start, int end) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(indentation, indentation, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null), start, end, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, start, end, 0 == true ? 1 : 0, 8, null));
        }

        public final void addLink(LinkAnnotation.Url url, int start, int end) {
            this.annotations.add(new MutableRange<>(url, start, end, null, 8, null));
        }

        public final void addStringAnnotation(String tag, String annotation, int start, int end) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m22975boximpl(StringAnnotation.m22976constructorimpl(annotation)), start, end, tag));
        }

        public final void addStyle(SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addTtsAnnotation(TtsAnnotation ttsAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, start, end, null, 8, null));
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        @ExperimentalTextApi
        public final void addUrlAnnotation(UrlAnnotation urlAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(urlAnnotation, start, end, null, 8, null));
        }

        public final void flatMapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> transform) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                List<? extends Range<? extends Annotation>> listInvoke = transform.invoke(MutableRange.toRange$default(list.get(i10), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(listInvoke.size());
                int size2 = listInvoke.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(MutableRange.INSTANCE.fromRange(listInvoke.get(i11)));
                }
                CollectionsKt.addAll(arrayList, arrayList2);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text_release(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> transform) {
            int size = this.annotations.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.annotations.set(i10, MutableRange.INSTANCE.fromRange(transform.invoke(MutableRange.toRange$default(this.annotations.get(i10), 0, 1, null))));
            }
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final int pushBullet$ui_text_release(Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(LinkAnnotation link) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(String tag, String annotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m22975boximpl(StringAnnotation.m22976constructorimpl(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(SpanStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        @ExperimentalTextApi
        public final int pushUrlAnnotation(UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(list.get(i10).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release, reason: not valid java name */
        public final <R> R m22859withBulletListo2QH7mI$ui_text_release(long indentation, Bullet bullet, Function1<? super BulletScope, ? extends R> block) {
            long sp;
            Pair pair = (Pair) CollectionsKt.lastOrNull((List) this.bulletScope.getBulletListSettingStack$ui_text_release());
            if (pair != null) {
                long packedValue = ((TextUnit) pair.getFirst()).getPackedValue();
                if (!TextUnitType.m23783equalsimpl0(TextUnit.m23754getTypeUIouoOA(packedValue), TextUnit.m23754getTypeUIouoOA(indentation))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m23762toStringimpl(packedValue)) + " and previous is " + ((Object) TextUnit.m23762toStringimpl(indentation)));
                }
                long jM23754getTypeUIouoOA = TextUnit.m23754getTypeUIouoOA(indentation);
                TextUnitType.Companion companion = TextUnitType.INSTANCE;
                sp = TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23788getSpUIouoOA()) ? TextUnitKt.getSp(TextUnit.m23755getValueimpl(indentation) + TextUnit.m23755getValueimpl(packedValue)) : TextUnitType.m23783equalsimpl0(jM23754getTypeUIouoOA, companion.m23787getEmUIouoOA()) ? TextUnitKt.getEm(TextUnit.m23755getValueimpl(indentation) + TextUnit.m23755getValueimpl(packedValue)) : indentation;
            } else {
                sp = indentation;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(sp, sp, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null));
            this.bulletScope.getBulletListSettingStack$ui_text_release().add(new Pair<>(TextUnit.m23745boximpl(sp), bullet));
            try {
                return block.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text_release().remove(CollectionsKt.getLastIndex(this.bulletScope.getBulletListSettingStack$ui_text_release()));
                }
                pop(iPushStyle);
            }
        }

        public Builder(int i10) {
            this.text = new StringBuilder(i10);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public final void addLink(LinkAnnotation.Clickable clickable, int start, int end) {
            this.annotations.add(new MutableRange<>(clickable, start, end, null, 8, null));
        }

        public final void addStyle(ParagraphStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void append(String text) {
            this.text.append(text);
        }

        public final void pop(int index) {
            if (!(index < this.styleStack.size())) {
                InlineClassHelperKt.throwIllegalStateException(index + " should be less than " + this.styleStack.size());
            }
            while (this.styleStack.size() - 1 >= index) {
                pop();
            }
        }

        public final int pushStyle(ParagraphStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        public /* synthetic */ Builder(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 16 : i10);
        }

        public Builder(String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        public Builder append(CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public Builder(AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        public Builder append(char c10) {
            this.text.append(c10);
            return this;
        }

        public final void append(AnnotatedString text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends Annotation>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size = annotations$ui_text_release.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range<? extends Annotation> range = annotations$ui_text_release.get(i10);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(AnnotatedString text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(text, start, end, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Range range = (Range) localAnnotations$default.get(i10);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    @Metadata(m13557d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(m13557d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "()V", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(List<? extends Range<? extends Annotation>> list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i10 = 0; i10 < size; i10++) {
                Range<SpanStyle> range = (Range) list.get(i10);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.SpanStyle>");
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    Intrinsics.checkNotNull(range, "null cannot be cast to non-null type androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.ParagraphStyle>");
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listSortedWith = arrayList2 != null ? CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t10).getStart()), Integer.valueOf(((AnnotatedString.Range) t11).getStart()));
            }
        }) : null;
        if (listSortedWith == null || listSortedWith.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListMutableIntListOf = IntListKt.mutableIntListOf(((Range) CollectionsKt.first(listSortedWith)).getEnd());
        int size2 = listSortedWith.size();
        for (int i11 = 1; i11 < size2; i11++) {
            Range range2 = (Range) listSortedWith.get(i11);
            while (true) {
                if (mutableIntListMutableIntListOf._size == 0) {
                    break;
                }
                int iLast = mutableIntListMutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    mutableIntListMutableIntListOf.removeAt(mutableIntListMutableIntListOf._size - 1);
                } else if (!(range2.getEnd() <= iLast)) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iLast);
                }
            }
            mutableIntListMutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i10) {
        return get(i10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return Intrinsics.areEqual(this.text, annotatedString.text) && Intrinsics.areEqual(this.annotations, annotatedString.annotations);
    }

    public final AnnotatedString flatMapAnnotations(Function1<? super Range<? extends Annotation>, ? extends List<? extends Range<? extends Annotation>>> transform) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    public final List<Range<LinkAnnotation>> getLinkAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return listEmptyList;
    }

    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? CollectionsKt.emptyList() : list;
    }

    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    public final List<Range<String>> getStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Range<? extends Annotation> range = list.get(i10);
            if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    public final String getText() {
        return this.text;
    }

    public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return listEmptyList;
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    @ExperimentalTextApi
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
        List listEmptyList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            listEmptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    listEmptyList.add(range);
                }
            }
        } else {
            listEmptyList = CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return listEmptyList;
    }

    public final boolean hasEqualAnnotations(AnnotatedString other) {
        return Intrinsics.areEqual(this.annotations, other.annotations);
    }

    public final boolean hasLinkAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                if ((range.getItem() instanceof StringAnnotation) && Intrinsics.areEqual(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        List<Range<? extends Annotation>> list = this.annotations;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    public final AnnotatedString mapAnnotations(Function1<? super Range<? extends Annotation>, ? extends Range<? extends Annotation>> transform) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    @Stable
    public final AnnotatedString plus(AnnotatedString other) {
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m22856subSequence5zctL8(long range) {
        return subSequence(TextRange.m23025getMinimpl(range), TextRange.m23024getMaximpl(range));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, startIndex, endIndex), strSubstring);
    }

    @Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m13558d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n114#2,8:1608\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n*L\n386#1:1608,8\n*E\n"})
    public static final /* data */ class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;
        private final String tag;

        public Range(T t10, int i10, int i11, String str) {
            this.item = t10;
            this.start = i10;
            this.end = i11;
            this.tag = str;
            if (i10 <= i11) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i10, int i11, String str, int i12, Object obj2) {
            if ((i12 & 1) != 0) {
                obj = range.item;
            }
            if ((i12 & 2) != 0) {
                i10 = range.start;
            }
            if ((i12 & 4) != 0) {
                i11 = range.end;
            }
            if ((i12 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i10, i11, str);
        }

        public final T component1() {
            return this.item;
        }

        /* renamed from: component2, reason: from getter */
        public final int getStart() {
            return this.start;
        }

        /* renamed from: component3, reason: from getter */
        public final int getEnd() {
            return this.end;
        }

        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public final Range<T> copy(T item, int start, int end, String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return Intrinsics.areEqual(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.areEqual(this.tag, range.tag);
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t10 = this.item;
            return ((((((t10 == null ? 0 : t10.hashCode()) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t10, int i10, int i11) {
            this(t10, i10, i11, "");
        }
    }

    public final List<Range<String>> getStringAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Range<? extends Annotation> range = list.get(i10);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return CollectionsKt.emptyList();
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public AnnotatedString(String str, List<Range<SpanStyle>> list, List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public /* synthetic */ AnnotatedString(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i10 & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    public AnnotatedString(String str, List<? extends Range<? extends Annotation>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
