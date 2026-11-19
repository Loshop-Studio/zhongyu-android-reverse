package androidx.compose.p011ui.text;

import androidx.collection.AbstractC0584a;
import androidx.collection.IntListKt;
import androidx.collection.MutableIntList;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.compose.p011ui.unit.TextUnitKt;
import androidx.compose.p011ui.unit.TextUnitType;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.Saver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.AbstractC5810y;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p204y1.AbstractC6768a;

@Immutable
@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 L2\u00020\u0001:\u0005MNLOPB)\b\u0000\u0012\u0016\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB=\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002¢\u0006\u0004\b\b\u0010\u000eB)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u0002¢\u0006\u0004\b\b\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010$J%\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b&\u0010'J)\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b#\u0010(J)\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b*\u0010(J+\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010H\u0007¢\u0006\u0004\b,\u0010(J)\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u00030\u00022\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b.\u0010(J\u001d\u0010/\u001a\u00020%2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u0010¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020%2\b\u0010\u001d\u001a\u0004\u0018\u000101H\u0096\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0010H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0006H\u0016¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020%2\u0006\u0010\u001d\u001a\u00020\u0000¢\u0006\u0004\b8\u00109J1\u0010<\u001a\u00020\u00002\"\u0010;\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030:¢\u0006\u0004\b<\u0010=J7\u0010>\u001a\u00020\u00002(\u0010;\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00030\u00020:¢\u0006\u0004\b>\u0010=R*\u0010\u0005\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010B\u001a\u0004\bC\u00107R(\u0010D\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bD\u0010?\u001a\u0004\bE\u0010AR(\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0003\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010?\u001a\u0004\bG\u0010AR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bH\u0010AR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028F¢\u0006\u0006\u001a\u0004\bI\u0010AR\u0014\u0010K\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "annotations", "", "text", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/TextRange;", "range", "subSequence-5zc-tL8", "(J)Landroidx/compose/ui/text/AnnotatedString;", "other", "plus", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/AnnotatedString;", "tag", "start", "end", "getStringAnnotations", "(Ljava/lang/String;II)Ljava/util/List;", "", "hasStringAnnotations", "(Ljava/lang/String;II)Z", "(II)Ljava/util/List;", "Landroidx/compose/ui/text/TtsAnnotation;", "getTtsAnnotations", "Landroidx/compose/ui/text/UrlAnnotation;", "getUrlAnnotations", "Landroidx/compose/ui/text/LinkAnnotation;", "getLinkAnnotations", "hasLinkAnnotations", "(II)Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "hasEqualAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;)Z", "Lkotlin/Function1;", "transform", "mapAnnotations", "(Lr6/c;)Landroidx/compose/ui/text/AnnotatedString;", "flatMapAnnotations", "Ljava/util/List;", "getAnnotations$ui_text_release", "()Ljava/util/List;", "Ljava/lang/String;", "getText", "spanStylesOrNull", "getSpanStylesOrNull$ui_text_release", "paragraphStylesOrNull", "getParagraphStylesOrNull$ui_text_release", "getSpanStyles", "getParagraphStyles", "getLength", "length", "Companion", "Annotation", "Builder", "ExhaustiveAnnotation", HttpHeaders.RANGE, "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntList.kt\nandroidx/collection/IntList\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n247#2,6:1634\n34#2,6:1640\n253#2:1646\n102#2,2:1647\n34#2,6:1649\n104#2:1655\n247#2,6:1656\n34#2,6:1662\n253#2:1668\n230#2,3:1669\n34#2,6:1672\n233#2:1678\n230#2,3:1679\n34#2,6:1682\n233#2:1688\n230#2,3:1689\n34#2,6:1692\n233#2:1698\n102#2,2:1699\n34#2,6:1701\n104#2:1707\n1045#3:1614\n366#4:1615\n70#4:1616\n114#5,8:1617\n114#5,8:1626\n1#6:1625\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n121#1:1608,6\n221#1:1634,6\n221#1:1640,6\n221#1:1646\n231#1:1647,2\n231#1:1649,6\n231#1:1655\n246#1:1656,6\n246#1:1662,6\n246#1:1668\n263#1:1669,3\n263#1:1672,6\n263#1:1678\n281#1:1679,3\n281#1:1682,6\n281#1:1688\n297#1:1689,3\n297#1:1692,6\n297#1:1698\n306#1:1699,2\n306#1:1701,6\n306#1:1707\n137#1:1614\n148#1:1615\n151#1:1616\n153#1:1617,8\n177#1:1626,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedString implements CharSequence {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Saver<AnnotatedString, ?> Saver = SaversKt.getAnnotatedStringSaver();

    @Nullable
    private final List<Range<? extends Annotation>> annotations;

    @Nullable
    private final List<Range<ParagraphStyle>> paragraphStylesOrNull;

    @Nullable
    private final List<Range<SpanStyle>> spanStylesOrNull;

    @NotNull
    private final String text;

    @Metadata(m5109d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Annotation;", "", "Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/Bullet;", "Landroidx/compose/ui/text/LinkAnnotation;", "Landroidx/compose/ui/text/ParagraphStyle;", "Landroidx/compose/ui/text/SpanStyle;", "Landroidx/compose/ui/text/StringAnnotation;", "Landroidx/compose/ui/text/TtsAnnotation;", "Landroidx/compose/ui/text/UrlAnnotation;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public interface Annotation {
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002opB\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\r\u0010\u0010J\u0019\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\r\u0010\u0013J)\u0010\r\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u0016J\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\r\u0010\u0017J\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0018J%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u001b\u0010\u001eJ-\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0007¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b-\u0010.J%\u0010-\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b-\u00101J'\u00106\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000¢\u0006\u0004\b4\u00105J2\u00106\u001a\u00020\f2\u0006\u00103\u001a\u0002022\u0006\u00108\u001a\u0002072\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b;\u0010<J\u0015\u0010;\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001d¢\u0006\u0004\b;\u0010=J\u0017\u0010@\u001a\u00020\u00032\u0006\u00103\u001a\u000202H\u0000¢\u0006\u0004\b>\u0010?JI\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010B*\u00020A2\b\b\u0002\u00108\u001a\u0002072\b\b\u0002\u00103\u001a\u0002022\u0017\u0010F\u001a\u0013\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00028\u00000C¢\u0006\u0002\bEH\u0000ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u001d\u0010J\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007¢\u0006\u0004\bJ\u0010KJ\u0015\u0010L\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020\u00032\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\bN\u0010OJ\u0015\u0010R\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\r\u0010T\u001a\u00020\f¢\u0006\u0004\bT\u0010UJ\u0015\u0010T\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u0003¢\u0006\u0004\bT\u0010\u0006J\r\u0010W\u001a\u00020\n¢\u0006\u0004\bW\u0010XJ3\u0010^\u001a\u00020\f2\"\u0010[\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Z0Y\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Z0Y0CH\u0000¢\u0006\u0004\b\\\u0010]J9\u0010a\u001a\u00020\f2(\u0010[\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Z0Y\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Z0Y0_0CH\u0000¢\u0006\u0004\b`\u0010]R\u0018\u0010\b\u001a\u00060bj\u0002`c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010dR\"\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020A0f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\"\u0010i\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020Z0f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010hR\u0014\u0010j\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0011\u0010n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bl\u0010m\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006q"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "capacity", "<init>", "(I)V", "", "text", "(Ljava/lang/String;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;)V", "Ld6/s;", RequestParameters.SUBRESOURCE_APPEND, "", "char", "(C)V", "deprecated_append_returning_void", "", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString$Builder;", "start", "end", "(Ljava/lang/CharSequence;II)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(C)Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString;II)V", "Landroidx/compose/ui/text/SpanStyle;", "style", "addStyle", "(Landroidx/compose/ui/text/SpanStyle;II)V", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/ParagraphStyle;II)V", "tag", "annotation", "addStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;II)V", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "addTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;II)V", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "addUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Url;", "url", "addLink", "(Landroidx/compose/ui/text/LinkAnnotation$Url;II)V", "Landroidx/compose/ui/text/LinkAnnotation$Clickable;", "clickable", "(Landroidx/compose/ui/text/LinkAnnotation$Clickable;II)V", "Landroidx/compose/ui/text/Bullet;", "bullet", "addBullet$ui_text_release", "(Landroidx/compose/ui/text/Bullet;II)V", "addBullet", "Landroidx/compose/ui/unit/TextUnit;", "indentation", "addBullet-r9BaKPg$ui_text_release", "(Landroidx/compose/ui/text/Bullet;JII)V", "pushStyle", "(Landroidx/compose/ui/text/SpanStyle;)I", "(Landroidx/compose/ui/text/ParagraphStyle;)I", "pushBullet$ui_text_release", "(Landroidx/compose/ui/text/Bullet;)I", "pushBullet", "", "R", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "Lkotlin/ExtensionFunctionType;", "block", "withBulletList-o2QH7mI$ui_text_release", "(JLandroidx/compose/ui/text/Bullet;Lr6/c;)Ljava/lang/Object;", "withBulletList", "pushStringAnnotation", "(Ljava/lang/String;Ljava/lang/String;)I", "pushTtsAnnotation", "(Landroidx/compose/ui/text/TtsAnnotation;)I", "pushUrlAnnotation", "(Landroidx/compose/ui/text/UrlAnnotation;)I", "Landroidx/compose/ui/text/LinkAnnotation;", "link", "pushLink", "(Landroidx/compose/ui/text/LinkAnnotation;)I", "pop", "()V", "index", "toAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "transform", "mapAnnotations$ui_text_release", "(Lr6/c;)V", "mapAnnotations", "", "flatMapAnnotations$ui_text_release", "flatMapAnnotations", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "styleStack", "Ljava/util/List;", "annotations", "bulletScope", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "getLength", "()I", "length", "BulletScope", "MutableRange", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n150#2,3:1644\n34#2,6:1647\n153#2:1653\n529#2,3:1654\n34#2,4:1657\n532#2:1661\n150#2,3:1662\n34#2,6:1665\n153#2:1671\n533#2,2:1672\n39#2:1674\n535#2:1675\n77#3,8:1620\n77#3,8:1628\n77#3,8:1636\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n540#1:1608,6\n558#1:1614,6\n964#1:1644,3\n964#1:1647,6\n964#1:1653\n981#1:1654,3\n981#1:1657,4\n981#1:1661\n982#1:1662,3\n982#1:1665,6\n982#1:1671\n981#1:1672,2\n981#1:1674\n981#1:1675\n823#1:1620,8\n935#1:1628,8\n952#1:1636,8\n*E\n"})
    public static final class Builder implements Appendable {
        public static final int $stable = 8;

        @NotNull
        private final List<MutableRange<? extends Annotation>> annotations;

        @NotNull
        private final BulletScope bulletScope;

        @NotNull
        private final List<MutableRange<? extends Object>> styleStack;

        @NotNull
        private final StringBuilder text;

        @StabilityInferred(parameters = 0)
        @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "", "builder", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;)V", "getBuilder$ui_text_release", "()Landroidx/compose/ui/text/AnnotatedString$Builder;", "bulletListSettingStack", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/TextUnit;", "Landroidx/compose/ui/text/Bullet;", "getBulletListSettingStack$ui_text_release", "()Ljava/util/List;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        public static final class BulletScope {
            public static final int $stable = 8;

            @NotNull
            private final Builder builder;

            @NotNull
            private final List<Pair<TextUnit, Bullet>> bulletListSettingStack = new ArrayList();

            public BulletScope(@NotNull Builder builder) {
                this.builder = builder;
            }

            @NotNull
            /* renamed from: getBuilder$ui_text_release, reason: from getter */
            public final Builder getBuilder() {
                return this.builder;
            }

            @NotNull
            public final List<Pair<TextUnit, Bullet>> getBulletListSettingStack$ui_text_release() {
                return this.bulletListSettingStack;
            }
        }

        @Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\r\b\u0082\b\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001+B+\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f\"\u0004\b\u0001\u0010\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00102\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0012J\u0010\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0016J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010\u0016R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010$\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0019¨\u0006,"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "", "start", "end", "", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "defaultEnd", "Landroidx/compose/ui/text/AnnotatedString$Range;", "toRange", "(I)Landroidx/compose/ui/text/AnnotatedString$Range;", "R", "Lkotlin/Function1;", "transform", "(Lr6/c;I)Landroidx/compose/ui/text/AnnotatedString$Range;", "component1", "()Ljava/lang/Object;", "component2", "()I", "component3", "component4", "()Ljava/lang/String;", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getItem", "I", "getStart", "getEnd", "setEnd", "(I)V", "Ljava/lang/String;", "getTag", "Companion", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n77#2,8:1608\n77#2,8:1616\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n*L\n417#1:1608,8\n428#1:1616,8\n*E\n"})
        public static final /* data */ class MutableRange<T> {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);
            private int end;
            private final T item;
            private final int start;

            @NotNull
            private final String tag;

            @Metadata(m5109d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange$Companion;", "", "()V", "fromRange", "Landroidx/compose/ui/text/AnnotatedString$Builder$MutableRange;", ExifInterface.GPS_DIRECTION_TRUE, "range", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
            public static final class Companion {
                public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
                    this();
                }

                @NotNull
                public final <T> MutableRange<T> fromRange(@NotNull Range<T> range) {
                    return new MutableRange<>(range.getItem(), range.getStart(), range.getEnd(), range.getTag());
                }

                private Companion() {
                }
            }

            public MutableRange(T t8, int i, int i8, @NotNull String str) {
                this.item = t8;
                this.start = i;
                this.end = i8;
                this.tag = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i8, String str, int i9, Object obj2) {
                if ((i9 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i9 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i9 & 4) != 0) {
                    i8 = mutableRange.end;
                }
                if ((i9 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i8, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i8, Object obj) {
                if ((i8 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
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

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getTag() {
                return this.tag;
            }

            @NotNull
            public final MutableRange<T> copy(T item, int start, int end, @NotNull String tag) {
                return new MutableRange<>(item, start, end, tag);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) other;
                return AbstractC5830k.m5325b(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && AbstractC5830k.m5325b(this.tag, mutableRange.tag);
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

            @NotNull
            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                T t8 = this.item;
                return this.tag.hashCode() + AbstractC0584a.m902c(this.end, AbstractC0584a.m902c(this.start, (t8 == null ? 0 : t8.hashCode()) * 31, 31), 31);
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            @NotNull
            public final Range<T> toRange(int defaultEnd) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    defaultEnd = i;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(this.item, this.start, defaultEnd, this.tag);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("MutableRange(item=");
                sb.append(this.item);
                sb.append(", start=");
                sb.append(this.start);
                sb.append(", end=");
                sb.append(this.end);
                sb.append(", tag=");
                return AbstractC0584a.m911l(')', this.tag, sb);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, InterfaceC6471c interfaceC6471c, int i, int i8, Object obj) {
                if ((i8 & 2) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(interfaceC6471c, i);
            }

            @NotNull
            public final <R> Range<R> toRange(@NotNull InterfaceC6471c transform, int defaultEnd) {
                int i = this.end;
                if (i != Integer.MIN_VALUE) {
                    defaultEnd = i;
                }
                if (!(defaultEnd != Integer.MIN_VALUE)) {
                    InlineClassHelperKt.throwIllegalStateException("Item.end should be set first");
                }
                return new Range<>(transform.invoke(this.item), this.start, defaultEnd, this.tag);
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i8, String str, int i9, AbstractC5824e abstractC5824e) {
                this(obj, i, (i9 & 4) != 0 ? Integer.MIN_VALUE : i8, (i9 & 8) != 0 ? "" : str);
            }
        }

        public Builder() {
            this(0, 1, null);
        }

        /* renamed from: withBulletList-o2QH7mI$ui_text_release$default, reason: not valid java name */
        public static /* synthetic */ Object m12600withBulletListo2QH7mI$ui_text_release$default(Builder builder, long j7, Bullet bullet, InterfaceC6471c interfaceC6471c, int i, Object obj) {
            if ((i & 1) != 0) {
                j7 = BulletKt.getDefaultBulletIndentation();
            }
            if ((i & 2) != 0) {
                bullet = BulletKt.getDefaultBullet();
            }
            return builder.m12602withBulletListo2QH7mI$ui_text_release(j7, bullet, interfaceC6471c);
        }

        public final void addBullet$ui_text_release(@NotNull Bullet bullet, int start, int end) {
            this.annotations.add(new MutableRange<>(bullet, start, end, null, 8, null));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: addBullet-r9BaKPg$ui_text_release, reason: not valid java name */
        public final void m12601addBulletr9BaKPg$ui_text_release(@NotNull Bullet bullet, long indentation, int start, int end) {
            Object[] objArr = 0 == true ? 1 : 0;
            this.annotations.add(new MutableRange<>(new ParagraphStyle(0, 0, 0L, new TextIndent(indentation, indentation, null), (PlatformParagraphStyle) objArr, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (AbstractC5824e) null), start, end, null, 8, 0 == true ? 1 : 0));
            this.annotations.add(new MutableRange<>(bullet, start, end, 0 == true ? 1 : 0, 8, null));
        }

        public final void addLink(@NotNull LinkAnnotation.Url url, int start, int end) {
            this.annotations.add(new MutableRange<>(url, start, end, null, 8, null));
        }

        public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int start, int end) {
            this.annotations.add(new MutableRange<>(StringAnnotation.m12718boximpl(StringAnnotation.m12719constructorimpl(annotation)), start, end, tag));
        }

        public final void addStyle(@NotNull SpanStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(ttsAnnotation, start, end, null, 8, null));
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "addLink(, start, end)", imports = {}))
        @ExperimentalTextApi
        public final void addUrlAnnotation(@NotNull UrlAnnotation urlAnnotation, int start, int end) {
            this.annotations.add(new MutableRange<>(urlAnnotation, start, end, null, 8, null));
        }

        public final void flatMapAnnotations$ui_text_release(@NotNull InterfaceC6471c transform) {
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                List list2 = (List) transform.invoke(MutableRange.toRange$default(list.get(i), 0, 1, null));
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    arrayList2.add(MutableRange.INSTANCE.fromRange((Range) list2.get(i8)));
                }
                AbstractC5810y.m5291S(arrayList2, arrayList);
            }
            this.annotations.clear();
            this.annotations.addAll(arrayList);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void mapAnnotations$ui_text_release(@NotNull InterfaceC6471c transform) {
            int size = this.annotations.size();
            for (int i = 0; i < size; i++) {
                this.annotations.set(i, MutableRange.INSTANCE.fromRange((Range) transform.invoke(MutableRange.toRange$default(this.annotations.get(i), 0, 1, null))));
            }
        }

        public final void pop() {
            if (this.styleStack.isEmpty()) {
                InlineClassHelperKt.throwIllegalStateException("Nothing to pop.");
            }
            this.styleStack.remove(r0.size() - 1).setEnd(this.text.length());
        }

        public final int pushBullet$ui_text_release(@NotNull Bullet bullet) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(bullet, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushLink(@NotNull LinkAnnotation link) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(link, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStringAnnotation(@NotNull String tag, @NotNull String annotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(StringAnnotation.m12718boximpl(StringAnnotation.m12719constructorimpl(annotation)), this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(@NotNull SpanStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "pushLink(, start, end)", imports = {}))
        @ExperimentalTextApi
        public final int pushUrlAnnotation(@NotNull UrlAnnotation urlAnnotation) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(urlAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            String string = this.text.toString();
            List<MutableRange<? extends Annotation>> list = this.annotations;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            return new AnnotatedString(string, arrayList);
        }

        @NotNull
        /* renamed from: withBulletList-o2QH7mI$ui_text_release, reason: not valid java name */
        public final <R> R m12602withBulletListo2QH7mI$ui_text_release(long indentation, @NotNull Bullet bullet, @NotNull InterfaceC6471c block) {
            long j7;
            long em;
            Pair pair = (Pair) AbstractC5805t.m5236p0(this.bulletScope.getBulletListSettingStack$ui_text_release());
            if (pair != null) {
                long packedValue = ((TextUnit) pair.getFirst()).getPackedValue();
                if (!TextUnitType.m13527equalsimpl0(TextUnit.m13498getTypeUIouoOA(packedValue), TextUnit.m13498getTypeUIouoOA(indentation))) {
                    InlineClassHelperKt.throwIllegalStateException("Indentation unit types of nested bullet lists must match. Current " + ((Object) TextUnit.m13506toStringimpl(packedValue)) + " and previous is " + ((Object) TextUnit.m13506toStringimpl(indentation)));
                }
                long jM13498getTypeUIouoOA = TextUnit.m13498getTypeUIouoOA(indentation);
                TextUnitType.Companion companion = TextUnitType.INSTANCE;
                if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13532getSpUIouoOA())) {
                    em = TextUnitKt.getSp(TextUnit.m13499getValueimpl(packedValue) + TextUnit.m13499getValueimpl(indentation));
                } else if (TextUnitType.m13527equalsimpl0(jM13498getTypeUIouoOA, companion.m13531getEmUIouoOA())) {
                    em = TextUnitKt.getEm(TextUnit.m13499getValueimpl(packedValue) + TextUnit.m13499getValueimpl(indentation));
                } else {
                    em = indentation;
                }
                j7 = em;
            } else {
                j7 = indentation;
            }
            int iPushStyle = pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(j7, j7, null), null, null, 0, 0, null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (AbstractC5824e) null));
            this.bulletScope.getBulletListSettingStack$ui_text_release().add(new Pair<>(TextUnit.m13489boximpl(j7), bullet));
            try {
                return (R) block.invoke(this.bulletScope);
            } finally {
                if (!this.bulletScope.getBulletListSettingStack$ui_text_release().isEmpty()) {
                    this.bulletScope.getBulletListSettingStack$ui_text_release().remove(AbstractC5806u.m5282u(this.bulletScope.getBulletListSettingStack$ui_text_release()));
                }
                pop(iPushStyle);
            }
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.styleStack = new ArrayList();
            this.annotations = new ArrayList();
            this.bulletScope = new BulletScope(this);
        }

        public final void addLink(@NotNull LinkAnnotation.Clickable clickable, int start, int end) {
            this.annotations.add(new MutableRange<>(clickable, start, end, null, 8, null));
        }

        public final void addStyle(@NotNull ParagraphStyle style, int start, int end) {
            this.annotations.add(new MutableRange<>(style, start, end, null, 8, null));
        }

        public final void append(@NotNull String text) {
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

        public final int pushStyle(@NotNull ParagraphStyle style) {
            MutableRange<? extends Annotation> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence text) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text);
                return this;
            }
            this.text.append(text);
            return this;
        }

        public /* synthetic */ Builder(int i, int i8, AbstractC5824e abstractC5824e) {
            this((i8 & 1) != 0 ? 16 : i);
        }

        public Builder(@NotNull String str) {
            this(0, 1, null);
            append(str);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(@Nullable CharSequence text, int start, int end) {
            if (text instanceof AnnotatedString) {
                append((AnnotatedString) text, start, end);
                return this;
            }
            this.text.append(text, start, end);
            return this;
        }

        public Builder(@NotNull AnnotatedString annotatedString) {
            this(0, 1, null);
            append(annotatedString);
        }

        @Override // java.lang.Appendable
        @NotNull
        public Builder append(char c) {
            this.text.append(c);
            return this;
        }

        public final void append(@NotNull AnnotatedString text) {
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<? extends Annotation>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            if (annotations$ui_text_release != null) {
                int size = annotations$ui_text_release.size();
                for (int i = 0; i < size; i++) {
                    Range<? extends Annotation> range = annotations$ui_text_release.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }

        public final void append(@NotNull AnnotatedString text, int start, int end) {
            int length = this.text.length();
            this.text.append((CharSequence) text.getText(), start, end);
            List localAnnotations$default = AnnotatedStringKt.getLocalAnnotations$default(text, start, end, null, 4, null);
            if (localAnnotations$default != null) {
                int size = localAnnotations$default.size();
                for (int i = 0; i < size; i++) {
                    Range range = (Range) localAnnotations$default.get(i);
                    this.annotations.add(new MutableRange<>(range.getItem(), range.getStart() + length, range.getEnd() + length, range.getTag()));
                }
            }
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/AnnotatedString;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        @NotNull
        public final Saver<AnnotatedString, ?> getSaver() {
            return AnnotatedString.Saver;
        }

        private Companion() {
        }
    }

    @Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$ExhaustiveAnnotation;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "()V", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ExhaustiveAnnotation implements Annotation {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(@Nullable List<? extends Range<? extends Annotation>> list, @NotNull String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.annotations = list;
        this.text = str;
        if (list != 0) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = (Range) list.get(i);
                if (range.getItem() instanceof SpanStyle) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(range);
                } else if (range.getItem() instanceof ParagraphStyle) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(range);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.spanStylesOrNull = arrayList;
        this.paragraphStylesOrNull = arrayList2;
        List listM5244x0 = arrayList2 != null ? AbstractC5805t.m5244x0(arrayList2, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedString$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return AbstractC6768a.m6441f(Integer.valueOf(((AnnotatedString.Range) t8).getStart()), Integer.valueOf(((AnnotatedString.Range) t9).getStart()));
            }
        }) : null;
        if (listM5244x0 == null || listM5244x0.isEmpty()) {
            return;
        }
        MutableIntList mutableIntListMutableIntListOf = IntListKt.mutableIntListOf(((Range) AbstractC5805t.m5228h0(listM5244x0)).getEnd());
        int size2 = listM5244x0.size();
        for (int i8 = 1; i8 < size2; i8++) {
            Range range2 = (Range) listM5244x0.get(i8);
            while (true) {
                if (mutableIntListMutableIntListOf._size == 0) {
                    break;
                }
                int iLast = mutableIntListMutableIntListOf.last();
                if (range2.getStart() >= iLast) {
                    mutableIntListMutableIntListOf.removeAt(mutableIntListMutableIntListOf._size - 1);
                } else if (range2.getEnd() > iLast) {
                    InlineClassHelperKt.throwIllegalArgumentException("Paragraph overlap not allowed, end " + range2.getEnd() + " should be less than or equal to " + iLast);
                }
            }
            mutableIntListMutableIntListOf.add(range2.getEnd());
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) other;
        return AbstractC5830k.m5325b(this.text, annotatedString.text) && AbstractC5830k.m5325b(this.annotations, annotatedString.annotations);
    }

    @NotNull
    public final AnnotatedString flatMapAnnotations(@NotNull InterfaceC6471c transform) {
        Builder builder = new Builder(this);
        builder.flatMapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    public char get(int index) {
        return this.text.charAt(index);
    }

    @Nullable
    public final List<Range<? extends Annotation>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    @NotNull
    public final List<Range<LinkAnnotation>> getLinkAnnotations(int start, int end) {
        List arrayList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5328e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.LinkAnnotation>>");
        return arrayList;
    }

    @NotNull
    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        List<Range<ParagraphStyle>> list = this.paragraphStylesOrNull;
        return list == null ? EmptyList.INSTANCE : list;
    }

    @Nullable
    public final List<Range<ParagraphStyle>> getParagraphStylesOrNull$ui_text_release() {
        return this.paragraphStylesOrNull;
    }

    @NotNull
    public final List<Range<SpanStyle>> getSpanStyles() {
        List<Range<SpanStyle>> list = this.spanStylesOrNull;
        return list == null ? EmptyList.INSTANCE : list;
    }

    @Nullable
    public final List<Range<SpanStyle>> getSpanStylesOrNull$ui_text_release() {
        return this.spanStylesOrNull;
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(@NotNull String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Range<? extends Annotation> range = list.get(i);
            if ((range.getItem() instanceof StringAnnotation) && AbstractC5830k.m5325b(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                arrayList.add(StringAnnotationKt.unbox(range));
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Range<TtsAnnotation>> getTtsAnnotations(int start, int end) {
        List arrayList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5328e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return arrayList;
    }

    @Deprecated(message = "Use LinkAnnotation API instead", replaceWith = @ReplaceWith(expression = "getLinkAnnotations(start, end)", imports = {}))
    @ExperimentalTextApi
    @NotNull
    public final List<Range<UrlAnnotation>> getUrlAnnotations(int start, int end) {
        List arrayList;
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                Range<? extends Annotation> range2 = range;
                if ((range2.getItem() instanceof UrlAnnotation) && AnnotatedStringKt.intersect(start, end, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
        } else {
            arrayList = EmptyList.INSTANCE;
        }
        AbstractC5830k.m5328e(arrayList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return arrayList;
    }

    public final boolean hasEqualAnnotations(@NotNull AnnotatedString other) {
        return AbstractC5830k.m5325b(this.annotations, other.annotations);
    }

    public final boolean hasLinkAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof LinkAnnotation) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean hasStringAnnotations(@NotNull String tag, int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof StringAnnotation) && AbstractC5830k.m5325b(tag, range.getTag()) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
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

    @NotNull
    public final AnnotatedString mapAnnotations(@NotNull InterfaceC6471c transform) {
        Builder builder = new Builder(this);
        builder.mapAnnotations$ui_text_release(transform);
        return builder.toAnnotatedString();
    }

    @Stable
    @NotNull
    public final AnnotatedString plus(@NotNull AnnotatedString other) {
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    @NotNull
    /* renamed from: subSequence-5zc-tL8, reason: not valid java name */
    public final AnnotatedString m12599subSequence5zctL8(long range) {
        return subSequence(TextRange.m12768getMinimpl(range), TextRange.m12767getMaximpl(range));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public AnnotatedString subSequence(int startIndex, int endIndex) {
        if (!(startIndex <= endIndex)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + startIndex + ") should be less or equal to end (" + endIndex + ')');
        }
        if (startIndex == 0 && endIndex == this.text.length()) {
            return this;
        }
        String strSubstring = this.text.substring(startIndex, endIndex);
        AbstractC5830k.m5329f(strSubstring, "substring(...)");
        return new AnnotatedString((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.filterRanges(this.annotations, startIndex, endIndex), strSubstring);
    }

    @Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B%\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J<\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m5110d2 = {"Landroidx/compose/ui/text/AnnotatedString$Range;", ExifInterface.GPS_DIRECTION_TRUE, "", "item", "start", "", "end", "(Ljava/lang/Object;II)V", "tag", "", "(Ljava/lang/Object;IILjava/lang/String;)V", "getEnd", "()I", "getItem", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getStart", "getTag", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Object;IILjava/lang/String;)Landroidx/compose/ui/text/AnnotatedString$Range;", "equals", "", "other", "hashCode", "toString", "ui-text_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @Immutable
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,1607:1\n114#2,8:1608\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n*L\n386#1:1608,8\n*E\n"})
    public static final /* data */ class Range<T> {
        public static final int $stable = 0;
        private final int end;
        private final T item;
        private final int start;

        @NotNull
        private final String tag;

        public Range(T t8, int i, int i8, @NotNull String str) {
            this.item = t8;
            this.start = i;
            this.end = i8;
            this.tag = str;
            if (i <= i8) {
                return;
            }
            InlineClassHelperKt.throwIllegalArgumentException("Reversed range is not supported");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i8, String str, int i9, Object obj2) {
            if ((i9 & 1) != 0) {
                obj = range.item;
            }
            if ((i9 & 2) != 0) {
                i = range.start;
            }
            if ((i9 & 4) != 0) {
                i8 = range.end;
            }
            if ((i9 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i8, str);
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

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        @NotNull
        public final Range<T> copy(T item, int start, int end, @NotNull String tag) {
            return new Range<>(item, start, end, tag);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Range)) {
                return false;
            }
            Range range = (Range) other;
            return AbstractC5830k.m5325b(this.item, range.item) && this.start == range.start && this.end == range.end && AbstractC5830k.m5325b(this.tag, range.tag);
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

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            T t8 = this.item;
            return this.tag.hashCode() + AbstractC0584a.m902c(this.end, AbstractC0584a.m902c(this.start, (t8 == null ? 0 : t8.hashCode()) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("Range(item=");
            sb.append(this.item);
            sb.append(", start=");
            sb.append(this.start);
            sb.append(", end=");
            sb.append(this.end);
            sb.append(", tag=");
            return AbstractC0584a.m911l(')', this.tag, sb);
        }

        public Range(T t8, int i, int i8) {
            this(t8, i, i8, "");
        }
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(int start, int end) {
        List<Range<? extends Annotation>> list = this.annotations;
        if (list != null) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Range<? extends Annotation> range = list.get(i);
                if ((range.getItem() instanceof StringAnnotation) && AnnotatedStringKt.intersect(start, end, range.getStart(), range.getEnd())) {
                    arrayList.add(StringAnnotationKt.unbox(range));
                }
            }
            return arrayList;
        }
        return EmptyList.INSTANCE;
    }

    public AnnotatedString(String str, List list, int i, AbstractC5824e abstractC5824e) {
        this(str, (List<? extends Range<? extends Annotation>>) ((i & 2) != 0 ? EmptyList.INSTANCE : list));
    }

    public AnnotatedString(String str, List list, List list2, int i, AbstractC5824e abstractC5824e) {
        this(str, (i & 2) != 0 ? EmptyList.INSTANCE : list, (i & 4) != 0 ? EmptyList.INSTANCE : list2);
    }

    public AnnotatedString(@NotNull String str, @NotNull List<Range<SpanStyle>> list, @NotNull List<Range<ParagraphStyle>> list2) {
        this((List<? extends Range<? extends Annotation>>) AnnotatedStringKt.constructAnnotationsFromSpansAndParagraphs(list, list2), str);
    }

    public AnnotatedString(@NotNull String str, @NotNull List<? extends Range<? extends Annotation>> list) {
        this(list.isEmpty() ? null : list, str);
    }
}
