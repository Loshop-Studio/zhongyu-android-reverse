package androidx.compose.p013ui.text;

import androidx.autofill.HintConstants;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.p013ui.text.intl.LocaleList;
import androidx.compose.p013ui.text.style.LineHeightStyle;
import androidx.compose.p013ui.text.style.TextIndent;
import androidx.compose.p013ui.text.style.TextMotion;
import androidx.compose.p013ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000\u008e\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0016\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\"\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u001a\"\u0010\t\u001a\u00020\u00012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0086\b\u001a@\u0010\u000f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0018\u00010\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00110\u00102\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010H\u0002\u001a(\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0000\u001a\b\u0010\u001c\u001a\u00020\u0001H\u0000\u001aD\u0010\u001d\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\u0011\u0018\u00010\u0010\"\u0004\b\u0000\u0010\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001e0\u0011\u0018\u00010\u00102\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001a(\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u0018H\u0000\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a\u0014\u0010*\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001aD\u0010+\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u0011\u0018\u00010\u0010*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000bH\u0002\u001a*\u0010-\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0011\u0018\u00010\u0010*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001aa\u0010.\u001a\b\u0012\u0004\u0012\u0002H\u001e0\u0010\"\u0004\b\u0000\u0010\u001e*\u00020\u00012\u0006\u0010/\u001a\u00020\u00062>\b\u0004\u00100\u001a8\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001e01H\u0080\b\u001a \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00110\u0010*\u00020\u00012\u0006\u0010/\u001a\u00020\u0006H\u0000\u001a\u001c\u00106\u001a\u00020\u0001*\u00020\u00012\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0018H\u0002\u001a\u0014\u00107\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a\u0014\u00108\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010(\u001a\u00020)\u001a?\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010>\u001a?\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010?\u001a\u00020@2\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0087\b¢\u0006\u0002\u0010A\u001aG\u00109\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010B\u001a\u00020\u00042\u0006\u0010C\u001a\u00020\u00042\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010D\u001a@\u0010E\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020F2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010H2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0000¢\u0006\u0002\u0010I\u001a=\u0010J\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010K\u001a\u00020L2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010M\u001a?\u0010N\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010O\u001a\u00020\u00062\u0019\b\u0004\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010P\u001a=\u0010N\u001a\u0002H:\"\b\b\u0000\u0010:*\u00020;*\u00020\f2\u0006\u0010O\u001a\u00020\b2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H:0\u000b¢\u0006\u0002\b\u000eH\u0086\b¢\u0006\u0002\u0010Q\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006R"}, m13558d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "constructAnnotationsFromSpansAndParagraphs", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "spanStyles", "paragraphStyles", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", ExifInterface.GPS_DIRECTION_TRUE, "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalAnnotations", "predicate", "getLocalParagraphStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "urlAnnotation", "Landroidx/compose/ui/text/UrlAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withBulletListItem", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "bullet", "Landroidx/compose/ui/text/Bullet;", "(Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;Landroidx/compose/ui/text/Bullet;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withLink", "link", "Landroidx/compose/ui/text/LinkAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n34#2,6:1621\n247#2,6:1627\n34#2,4:1633\n39#2:1657\n253#2:1658\n230#2,3:1659\n34#2,6:1662\n233#2:1668\n247#2,6:1669\n34#2,6:1675\n253#2:1681\n150#2,3:1682\n34#2,6:1685\n153#2:1691\n247#2,6:1700\n34#2,6:1706\n253#2:1712\n1045#3:1620\n101#4,10:1637\n101#4,10:1647\n114#5,8:1692\n1#6:1713\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1030#1:1608,6\n1031#1:1614,6\n1073#1:1621,6\n1183#1:1627,6\n1183#1:1633,4\n1183#1:1657\n1183#1:1658\n1209#1:1659,3\n1209#1:1662,6\n1209#1:1668\n1212#1:1669,6\n1212#1:1675,6\n1212#1:1681\n1245#1:1682,3\n1245#1:1685,6\n1245#1:1691\n1521#1:1700,6\n1521#1:1706,6\n1521#1:1712\n1066#1:1620\n1186#1:1637,10\n1187#1:1647,10\n1515#1:1692,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.listOf(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? CollectionsKt.emptyList() : CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(Function1<? super AnnotatedString.Builder, Unit> function1) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        function1.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> constructAnnotationsFromSpansAndParagraphs(List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<ParagraphStyle>> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        if (list2.isEmpty()) {
            return list;
        }
        if (list.isEmpty()) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10));
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            arrayList.add(list2.get(i11));
        }
        return arrayList;
    }

    public static final boolean contains(int i10, int i11, int i12, int i13) {
        if (i10 <= i12 && i13 <= i11) {
            if (i11 == i13) {
                if ((i12 == i13) == (i10 == i11)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i10, int i11) {
        if (!(i10 <= i11)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i10 + ") should be less than or equal to end (" + i11 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<? extends T> range = list.get(i12);
            if (intersect(i10, i11, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i10, range.getStart()) - i10, Math.min(i11, range.getEnd()) - i10, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i10, int i11, Function1<? super AnnotatedString.Annotation, Boolean> function1) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release;
        if (i10 == i11 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i12 = 0; i12 < size; i12++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i12);
                if ((function1 != null ? function1.invoke(range.getItem()).booleanValue() : true) && intersect(i10, i11, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), RangesKt.coerceIn(range.getStart(), i10, i11) - i10, RangesKt.coerceIn(range.getEnd(), i10, i11) - i10, range.getTag()));
                }
            }
            return arrayList;
        }
        if (function1 == null) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text_release.size());
        int size2 = annotations$ui_text_release.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text_release.get(i13);
            if (function1.invoke(range2.getItem()).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i10, int i11, Function1 function1, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        return getLocalAnnotations(annotatedString, i10, i11, function1);
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i10, int i11) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i10 == i11 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i10 == 0 && i11 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i12 = 0; i12 < size; i12++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i12);
            if (intersect(i10, i11, range.getStart(), range.getEnd())) {
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i10) {
                    start = i10;
                }
                if (start > i11) {
                    start = i11;
                }
                int i13 = start - i10;
                int end = range.getEnd();
                if (end < i10) {
                    end = i10;
                }
                if (end > i11) {
                    end = i11;
                }
                arrayList.add(new AnnotatedString.Range(item, i13, end - i10));
            }
        }
        return arrayList;
    }

    public static final boolean intersect(int i10, int i11, int i12, int i13) {
        return ((i10 < i13) & (i12 < i11)) | (((i10 == i11) | (i12 == i13)) & (i10 == i12));
    }

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> function2) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            arrayList.add(function2.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List listEmptyList;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null || (listEmptyList = CollectionsKt.sortedWith(paragraphStylesOrNull$ui_text_release, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return ComparisonsKt.compareValues(Integer.valueOf(((AnnotatedString.Range) t10).getStart()), Integer.valueOf(((AnnotatedString.Range) t11).getStart()));
            }
        })) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque();
        int size = listEmptyList.size();
        int end = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listEmptyList.get(i10);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart() && !arrayDeque.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) arrayDeque.last();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                        arrayDeque.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayDeque.lastOrNull();
            if (range3 == null) {
                arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                arrayDeque.removeLast();
                arrayDeque.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else {
                if (range3.getEnd() < rangeCopy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                arrayDeque.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !arrayDeque.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) arrayDeque.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!arrayDeque.isEmpty() && end == ((AnnotatedString.Range) arrayDeque.last()).getEnd()) {
                arrayDeque.removeLast();
            }
        }
        if (end < annotatedString.getText().length()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, end, annotatedString.getText().length()));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(paragraphStyle, 0, 0));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i10, int i11) {
        String strSubstring;
        if (i10 != i11) {
            strSubstring = annotatedString.getText().substring(i10, i11);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> localAnnotations = getLocalAnnotations(annotatedString, i10, i11, new Function1<AnnotatedString.Annotation, Boolean>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.substringWithoutParagraphStyles.1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = CollectionsKt.emptyList();
        }
        return new AnnotatedString(strSubstring, localAnnotations);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new Function3<String, Integer, Integer, String>() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ String invoke(String str, Integer num, Integer num2) {
                return invoke(str, num.intValue(), num2.intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStringAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withBulletListItem(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        Bullet defaultBullet;
        Pair pair = (Pair) CollectionsKt.lastOrNull((List) bulletScope.getBulletListSettingStack$ui_text_release());
        long jM23764unboximpl = pair != null ? ((TextUnit) pair.getFirst()).getPackedValue() : BulletKt.getDefaultBulletIndentation();
        if (bullet != null) {
            defaultBullet = bullet;
        } else if (pair == null || (defaultBullet = (Bullet) pair.getSecond()) == null) {
            defaultBullet = BulletKt.getDefaultBullet();
        }
        int iPushStyle = bulletScope.getBuilder().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(jM23764unboximpl, jM23764unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (DefaultConstructorMarker) null));
        int iPushBullet$ui_text_release = bulletScope.getBuilder().pushBullet$ui_text_release(defaultBullet);
        try {
            return function1.invoke(bulletScope.getBuilder());
        } finally {
            bulletScope.getBuilder().pop(iPushBullet$ui_text_release);
            bulletScope.getBuilder().pop(iPushStyle);
        }
    }

    public static /* synthetic */ Object withBulletListItem$default(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bullet = null;
        }
        return withBulletListItem(bulletScope, bullet, function1);
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushLink);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushTtsAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushStyle);
            InlineMarker.finallyEnd(1);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, CollectionsKt.emptyList(), CollectionsKt.listOf(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    @ExperimentalTextApi
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, Function1<? super AnnotatedString.Builder, ? extends R> function1) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return function1.invoke(builder);
        } finally {
            InlineMarker.finallyStart(1);
            builder.pop(iPushUrlAnnotation);
            InlineMarker.finallyEnd(1);
        }
    }
}
