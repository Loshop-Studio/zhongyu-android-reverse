package androidx.compose.p011ui.text;

import androidx.autofill.HintConstants;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.internal.InlineClassHelperKt;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.LineHeightStyle;
import androidx.compose.p011ui.text.style.TextIndent;
import androidx.compose.p011ui.text.style.TextMotion;
import androidx.compose.p011ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.AbstractC5805t;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.C5801p;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;
import p152r6.InterfaceC6474f;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000\u0094\u0001\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\u001aG\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00010\u0000*\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001aK\u0010\u0015\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0001\u0018\u00010\u0000*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a#\u0010\u0017\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001ah\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0019*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042>\b\u0004\u0010\u001f\u001a8\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001d\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00040\u0001¢\u0006\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00028\u00000\u001aH\u0080\b¢\u0006\u0004\b \u0010!\u001a\u001b\u0010$\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b&\u0010%\u001a\u001b\u0010'\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010%\u001a\u001b\u0010(\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b(\u0010%\u001a?\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u0010,\u001a\u00020\u00022\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\b.\u0010/\u001aA\u0010.\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0019\b\u0004\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\b.\u00100\u001aI\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0019\b\u0004\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\b4\u00105\u001aA\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u00107\u001a\u0002062\u0019\b\u0004\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\b4\u00108\u001aA\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u0010:\u001a\u0002092\u0019\b\u0004\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0087\b¢\u0006\u0004\b4\u0010;\u001a?\u0010>\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020+2\u0006\u0010=\u001a\u00020<2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\b>\u0010?\u001aB\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010**\u00020)*\u00020@2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A2\u0017\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00028\u00000\u0012¢\u0006\u0002\b-H\u0000¢\u0006\u0004\bC\u0010D\u001aK\u0010F\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0018\u00010\u0000\"\u0004\b\u0000\u0010\u00192\u0016\u0010E\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\u0018\u00010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\bF\u0010G\u001a)\u0010J\u001a\u00020\t2\u0006\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bJ\u0010K\u001a\u001d\u0010J\u001a\u00020\t2\u0006\u0010H\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\bJ\u0010L\u001a)\u0010O\u001a\u00020\t2\u0017\u0010N\u001a\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020M0\u0012¢\u0006\u0002\b-H\u0086\b¢\u0006\u0004\bO\u0010P\u001a/\u0010U\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\r2\u0006\u0010R\u001a\u00020\r2\u0006\u0010S\u001a\u00020\r2\u0006\u0010T\u001a\u00020\rH\u0000¢\u0006\u0004\bU\u0010V\u001a/\u0010[\u001a\u00020\u00132\u0006\u0010W\u001a\u00020\r2\u0006\u0010X\u001a\u00020\r2\u0006\u0010Y\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\rH\u0000¢\u0006\u0004\b[\u0010V\u001a\u000f\u0010\\\u001a\u00020\tH\u0000¢\u0006\u0004\b\\\u0010]\"\u0014\u0010^\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006`"}, m5110d2 = {"", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "spanStyles", "Landroidx/compose/ui/text/ParagraphStyle;", "paragraphStyles", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "constructAnnotationsFromSpansAndParagraphs", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Landroidx/compose/ui/text/AnnotatedString;", "defaultParagraphStyle", "normalizedParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;)Ljava/util/List;", "", "start", "end", "getLocalParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;II)Ljava/util/List;", "Lkotlin/Function1;", "", "predicate", "getLocalAnnotations", "(Landroidx/compose/ui/text/AnnotatedString;IILr6/c;)Ljava/util/List;", "substringWithoutParagraphStyles", "(Landroidx/compose/ui/text/AnnotatedString;II)Landroidx/compose/ui/text/AnnotatedString;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "annotatedString", "paragraphStyle", "block", "mapEachParagraphStyle", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/ParagraphStyle;Lr6/e;)Ljava/util/List;", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "toUpperCase", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/intl/LocaleList;)Landroidx/compose/ui/text/AnnotatedString;", "toLowerCase", "capitalize", "decapitalize", "", "R", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "style", "Lkotlin/ExtensionFunctionType;", "withStyle", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lr6/c;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lr6/c;)Ljava/lang/Object;", "", "tag", "annotation", "withAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lr6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/TtsAnnotation;", "ttsAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lr6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/UrlAnnotation;", "urlAnnotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/UrlAnnotation;Lr6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/LinkAnnotation;", "link", "withLink", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/LinkAnnotation;Lr6/c;)Ljava/lang/Object;", "Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;", "Landroidx/compose/ui/text/Bullet;", "bullet", "withBulletListItem", "(Landroidx/compose/ui/text/AnnotatedString$Builder$BulletScope;Landroidx/compose/ui/text/Bullet;Lr6/c;)Ljava/lang/Object;", "ranges", "filterRanges", "(Ljava/util/List;II)Ljava/util/List;", "text", "spanStyle", "AnnotatedString", "(Ljava/lang/String;Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "(Ljava/lang/String;Landroidx/compose/ui/text/ParagraphStyle;)Landroidx/compose/ui/text/AnnotatedString;", "Ld6/s;", "builder", "buildAnnotatedString", "(Lr6/c;)Landroidx/compose/ui/text/AnnotatedString;", "baseStart", "baseEnd", "targetStart", "targetEnd", "contains", "(IIII)Z", "lStart", "lEnd", "rStart", "rEnd", "intersect", "emptyAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1607:1\n34#2,6:1608\n34#2,6:1614\n34#2,6:1621\n247#2,6:1627\n34#2,4:1633\n39#2:1657\n253#2:1658\n230#2,3:1659\n34#2,6:1662\n233#2:1668\n247#2,6:1669\n34#2,6:1675\n253#2:1681\n150#2,3:1682\n34#2,6:1685\n153#2:1691\n247#2,6:1700\n34#2,6:1706\n253#2:1712\n1045#3:1620\n101#4,10:1637\n101#4,10:1647\n114#5,8:1692\n1#6:1713\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1030#1:1608,6\n1031#1:1614,6\n1073#1:1621,6\n1183#1:1627,6\n1183#1:1633,4\n1183#1:1657\n1183#1:1658\n1209#1:1659,3\n1209#1:1662,6\n1209#1:1668\n1212#1:1669,6\n1212#1:1675,6\n1212#1:1681\n1245#1:1682,3\n1245#1:1685,6\n1245#1:1691\n1521#1:1700,6\n1521#1:1706,6\n1521#1:1712\n1066#1:1620\n1186#1:1637,10\n1187#1:1647,10\n1515#1:1692,8\n*E\n"})
/* loaded from: classes2.dex */
public final class AnnotatedStringKt {

    @NotNull
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, null);

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String str, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, AbstractC5806u.m5286y(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? EmptyList.INSTANCE : AbstractC5806u.m5286y(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull InterfaceC6471c interfaceC6471c) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        interfaceC6471c.invoke(builder);
        return builder.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC6474f() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i, int i8) {
                if (i == 0) {
                    String strSubstring = str.substring(i, i8);
                    AbstractC5830k.m5329f(strSubstring, "substring(...)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i, i8);
                AbstractC5830k.m5329f(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
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
        ArrayList arrayList = new ArrayList(list2.size() + list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(list.get(i));
        }
        int size2 = list2.size();
        for (int i8 = 0; i8 < size2; i8++) {
            arrayList.add(list2.get(i8));
        }
        return arrayList;
    }

    public static final boolean contains(int i, int i8, int i9, int i10) {
        if (i <= i9 && i10 <= i8) {
            if (i8 == i10) {
                if ((i9 == i10) == (i == i8)) {
                }
            }
            return true;
        }
        return false;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC6474f() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i, int i8) {
                if (i == 0) {
                    String strSubstring = str.substring(i, i8);
                    AbstractC5830k.m5329f(strSubstring, "substring(...)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i, i8);
                AbstractC5830k.m5329f(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i8) {
        if (!(i <= i8)) {
            InlineClassHelperKt.throwIllegalArgumentException("start (" + i + ") should be less than or equal to end (" + i8 + ')');
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            AnnotatedString.Range<? extends T> range = list.get(i9);
            if (intersect(i, i8, range.getStart(), range.getEnd())) {
                arrayList.add(new AnnotatedString.Range(range.getItem(), Math.max(i, range.getStart()) - i, Math.min(i8, range.getEnd()) - i, range.getTag()));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i, int i8, InterfaceC6471c interfaceC6471c) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release;
        if (i == i8 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i != 0 || i8 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i9 = 0; i9 < size; i9++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i9);
                if ((interfaceC6471c != null ? ((Boolean) interfaceC6471c.invoke(range.getItem())).booleanValue() : true) && intersect(i, i8, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), AbstractC5806u.m5274m(range.getStart(), i, i8) - i, AbstractC5806u.m5274m(range.getEnd(), i, i8) - i, range.getTag()));
                }
            }
            return arrayList;
        }
        if (interfaceC6471c == null) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text_release.size());
        int size2 = annotations$ui_text_release.size();
        for (int i10 = 0; i10 < size2; i10++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text_release.get(i10);
            if (((Boolean) interfaceC6471c.invoke(range2.getItem())).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i, int i8, InterfaceC6471c interfaceC6471c, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            interfaceC6471c = null;
        }
        return getLocalAnnotations(annotatedString, i, i8, interfaceC6471c);
    }

    private static final List<AnnotatedString.Range<ParagraphStyle>> getLocalParagraphStyles(AnnotatedString annotatedString, int i, int i8) {
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release;
        if (i == i8 || (paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release()) == null) {
            return null;
        }
        if (i == 0 && i8 >= annotatedString.getText().length()) {
            return paragraphStylesOrNull$ui_text_release;
        }
        ArrayList arrayList = new ArrayList(paragraphStylesOrNull$ui_text_release.size());
        int size = paragraphStylesOrNull$ui_text_release.size();
        for (int i9 = 0; i9 < size; i9++) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStylesOrNull$ui_text_release.get(i9);
            if (intersect(i, i8, range.getStart(), range.getEnd())) {
                ParagraphStyle item = range.getItem();
                int start = range.getStart();
                if (start < i) {
                    start = i;
                }
                if (start > i8) {
                    start = i8;
                }
                int i10 = start - i;
                int end = range.getEnd();
                if (end < i) {
                    end = i;
                }
                if (end > i8) {
                    end = i8;
                }
                arrayList.add(new AnnotatedString.Range(item, i10, end - i));
            }
        }
        return arrayList;
    }

    public static final boolean intersect(int i, int i8, int i9, int i10) {
        return ((i < i10) & (i9 < i8)) | (((i == i8) | (i9 == i10)) & (i == i9));
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle paragraphStyle, @NotNull InterfaceC6473e interfaceC6473e) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i);
            arrayList.add(interfaceC6473e.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle paragraphStyle) {
        List listM5244x0;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null || (listM5244x0 = AbstractC5805t.m5244x0(paragraphStylesOrNull$ui_text_release, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t8, T t9) {
                return AbstractC6768a.m6441f(Integer.valueOf(((AnnotatedString.Range) t8).getStart()), Integer.valueOf(((AnnotatedString.Range) t9).getStart()));
            }
        })) == null) {
            listM5244x0 = EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        C5801p c5801p = new C5801p();
        int size = listM5244x0.size();
        int end = 0;
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listM5244x0.get(i);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart() && !c5801p.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) c5801p.last();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!c5801p.isEmpty() && end == ((AnnotatedString.Range) c5801p.last()).getEnd()) {
                        c5801p.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) c5801p.m5169e();
            if (range3 == null) {
                c5801p.addLast(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                c5801p.removeLast();
                c5801p.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                c5801p.removeLast();
                c5801p.addLast(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else {
                if (range3.getEnd() < rangeCopy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                c5801p.addLast(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !c5801p.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) c5801p.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!c5801p.isEmpty() && end == ((AnnotatedString.Range) c5801p.last()).getEnd()) {
                c5801p.removeLast();
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
    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i8) {
        String strSubstring;
        if (i != i8) {
            strSubstring = annotatedString.getText().substring(i, i8);
            AbstractC5830k.m5329f(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List localAnnotations = getLocalAnnotations(annotatedString, i, i8, new InterfaceC6471c() { // from class: androidx.compose.ui.text.AnnotatedStringKt.substringWithoutParagraphStyles.1
            @Override // p152r6.InterfaceC6471c
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = EmptyList.INSTANCE;
        }
        return new AnnotatedString(strSubstring, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) localAnnotations);
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC6474f() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i, int i8) {
                String strSubstring = str.substring(i, i8);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC6474f() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // p152r6.InterfaceC6474f
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i, int i8) {
                String strSubstring = str.substring(i, i8);
                AbstractC5830k.m5329f(strSubstring, "substring(...)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.INSTANCE.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String str, @NotNull String str2, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushStringAnnotation);
        }
    }

    @NotNull
    public static final <R> R withBulletListItem(@NotNull AnnotatedString.Builder.BulletScope bulletScope, @Nullable Bullet bullet, @NotNull InterfaceC6471c interfaceC6471c) {
        Bullet defaultBullet;
        Pair pair = (Pair) AbstractC5805t.m5236p0(bulletScope.getBulletListSettingStack$ui_text_release());
        long jM13508unboximpl = pair != null ? ((TextUnit) pair.getFirst()).getPackedValue() : BulletKt.getDefaultBulletIndentation();
        if (bullet != null) {
            defaultBullet = bullet;
        } else if (pair == null || (defaultBullet = (Bullet) pair.getSecond()) == null) {
            defaultBullet = BulletKt.getDefaultBullet();
        }
        int iPushStyle = bulletScope.getBuilder().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(jM13508unboximpl, jM13508unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (AbstractC5824e) null));
        int iPushBullet$ui_text_release = bulletScope.getBuilder().pushBullet$ui_text_release(defaultBullet);
        try {
            return (R) interfaceC6471c.invoke(bulletScope.getBuilder());
        } finally {
            bulletScope.getBuilder().pop(iPushBullet$ui_text_release);
            bulletScope.getBuilder().pop(iPushStyle);
        }
    }

    public static /* synthetic */ Object withBulletListItem$default(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if ((i & 1) != 0) {
            bullet = null;
        }
        return withBulletListItem(bulletScope, bullet, interfaceC6471c);
    }

    @NotNull
    public static final <R> R withLink(@NotNull AnnotatedString.Builder builder, @NotNull LinkAnnotation linkAnnotation, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushLink);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle spanStyle, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushTtsAnnotation);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle paragraphStyle, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushStyle);
        }
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String str, @NotNull ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, EmptyList.INSTANCE, AbstractC5806u.m5286y(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @Deprecated(message = "Use LinkAnnotation API for links instead", replaceWith = @ReplaceWith(expression = "withLink(, block)", imports = {}))
    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull UrlAnnotation urlAnnotation, @NotNull InterfaceC6471c interfaceC6471c) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) interfaceC6471c.invoke(builder);
        } finally {
            builder.pop(iPushUrlAnnotation);
        }
    }
}
