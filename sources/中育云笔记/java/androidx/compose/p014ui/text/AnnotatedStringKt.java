package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p265nd.AbstractC10410o;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10976v;
import p325rc.AbstractC10978w;
import p325rc.C10958m;
import p364uc.AbstractC11382b;

/* loaded from: classes2.dex */
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, 2, 0 == true ? 1 : 0);

    public static final AnnotatedString AnnotatedString(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, AbstractC10976v.m24126e(new AnnotatedString.Range(spanStyle, 0, str.length())), paragraphStyle == null ? AbstractC10978w.m24136n() : AbstractC10976v.m24126e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    public static final AnnotatedString buildAnnotatedString(InterfaceC9540l interfaceC9540l) {
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        interfaceC9540l.invoke(builder);
        return builder.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC9545q() { // from class: androidx.compose.ui.text.AnnotatedStringKt.capitalize.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    AbstractC9979u.m20293f(strSubstring, "substring(...)");
                    return StringKt.capitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                AbstractC9979u.m20293f(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
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
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC9545q() { // from class: androidx.compose.ui.text.AnnotatedStringKt.decapitalize.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                if (i10 == 0) {
                    String strSubstring = str.substring(i10, i11);
                    AbstractC9979u.m20293f(strSubstring, "substring(...)");
                    return StringKt.decapitalize(strSubstring, localeList);
                }
                String strSubstring2 = str.substring(i10, i11);
                AbstractC9979u.m20293f(strSubstring2, "substring(...)");
                return strSubstring2;
            }
        });
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
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

    private static final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getLocalAnnotations(AnnotatedString annotatedString, int i10, int i11, InterfaceC9540l interfaceC9540l) {
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release;
        if (i10 == i11 || (annotations$ui_text_release = annotatedString.getAnnotations$ui_text_release()) == null) {
            return null;
        }
        if (i10 != 0 || i11 < annotatedString.getText().length()) {
            ArrayList arrayList = new ArrayList(annotations$ui_text_release.size());
            int size = annotations$ui_text_release.size();
            for (int i12 = 0; i12 < size; i12++) {
                AnnotatedString.Range<? extends AnnotatedString.Annotation> range = annotations$ui_text_release.get(i12);
                if ((interfaceC9540l != null ? ((Boolean) interfaceC9540l.invoke(range.getItem())).booleanValue() : true) && intersect(i10, i11, range.getStart(), range.getEnd())) {
                    arrayList.add(new AnnotatedString.Range(range.getItem(), AbstractC10410o.m21761n(range.getStart(), i10, i11) - i10, AbstractC10410o.m21761n(range.getEnd(), i10, i11) - i10, range.getTag()));
                }
            }
            return arrayList;
        }
        if (interfaceC9540l == null) {
            return annotations$ui_text_release;
        }
        ArrayList arrayList2 = new ArrayList(annotations$ui_text_release.size());
        int size2 = annotations$ui_text_release.size();
        for (int i13 = 0; i13 < size2; i13++) {
            AnnotatedString.Range<? extends AnnotatedString.Annotation> range2 = annotations$ui_text_release.get(i13);
            if (((Boolean) interfaceC9540l.invoke(range2.getItem())).booleanValue()) {
                arrayList2.add(range2);
            }
        }
        return arrayList2;
    }

    public static /* synthetic */ List getLocalAnnotations$default(AnnotatedString annotatedString, int i10, int i11, InterfaceC9540l interfaceC9540l, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            interfaceC9540l = null;
        }
        return getLocalAnnotations(annotatedString, i10, i11, interfaceC9540l);
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

    public static final <T> List<T> mapEachParagraphStyle(AnnotatedString annotatedString, ParagraphStyle paragraphStyle, InterfaceC9544p interfaceC9544p) {
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            arrayList.add(interfaceC9544p.invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(AnnotatedString annotatedString, ParagraphStyle paragraphStyle) {
        List listM24136n;
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStylesOrNull$ui_text_release = annotatedString.getParagraphStylesOrNull$ui_text_release();
        if (paragraphStylesOrNull$ui_text_release == null || (listM24136n = AbstractC10947g0.m23914P0(paragraphStylesOrNull$ui_text_release, new Comparator() { // from class: androidx.compose.ui.text.AnnotatedStringKt$normalizedParagraphStyles$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return AbstractC11382b.m25330d(Integer.valueOf(((AnnotatedString.Range) t10).getStart()), Integer.valueOf(((AnnotatedString.Range) t11).getStart()));
            }
        })) == null) {
            listM24136n = AbstractC10978w.m24136n();
        }
        ArrayList arrayList = new ArrayList();
        C10958m c10958m = new C10958m();
        int size = listM24136n.size();
        int end = 0;
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range range = (AnnotatedString.Range) listM24136n.get(i10);
            AnnotatedString.Range rangeCopy$default = AnnotatedString.Range.copy$default(range, paragraphStyle.merge((ParagraphStyle) range.getItem()), 0, 0, null, 14, null);
            while (end < rangeCopy$default.getStart() && !c10958m.isEmpty()) {
                AnnotatedString.Range range2 = (AnnotatedString.Range) c10958m.last();
                if (rangeCopy$default.getStart() < range2.getEnd()) {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, rangeCopy$default.getStart()));
                    end = rangeCopy$default.getStart();
                } else {
                    arrayList.add(new AnnotatedString.Range(range2.getItem(), end, range2.getEnd()));
                    end = range2.getEnd();
                    while (!c10958m.isEmpty() && end == ((AnnotatedString.Range) c10958m.last()).getEnd()) {
                        c10958m.removeLast();
                    }
                }
            }
            if (end < rangeCopy$default.getStart()) {
                arrayList.add(new AnnotatedString.Range(paragraphStyle, end, rangeCopy$default.getStart()));
                end = rangeCopy$default.getStart();
            }
            AnnotatedString.Range range3 = (AnnotatedString.Range) c10958m.m23971k();
            if (range3 == null) {
                c10958m.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == rangeCopy$default.getStart() && range3.getEnd() == rangeCopy$default.getEnd()) {
                c10958m.removeLast();
                c10958m.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else if (range3.getStart() == range3.getEnd()) {
                arrayList.add(new AnnotatedString.Range(range3.getItem(), range3.getStart(), range3.getEnd()));
                c10958m.removeLast();
                c10958m.add(new AnnotatedString.Range(rangeCopy$default.getItem(), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            } else {
                if (range3.getEnd() < rangeCopy$default.getEnd()) {
                    throw new IllegalArgumentException();
                }
                c10958m.add(new AnnotatedString.Range(((ParagraphStyle) range3.getItem()).merge((ParagraphStyle) rangeCopy$default.getItem()), rangeCopy$default.getStart(), rangeCopy$default.getEnd()));
            }
        }
        while (end <= annotatedString.getText().length() && !c10958m.isEmpty()) {
            AnnotatedString.Range range4 = (AnnotatedString.Range) c10958m.last();
            arrayList.add(new AnnotatedString.Range(range4.getItem(), end, range4.getEnd()));
            end = range4.getEnd();
            while (!c10958m.isEmpty() && end == ((AnnotatedString.Range) c10958m.last()).getEnd()) {
                c10958m.removeLast();
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
            AbstractC9979u.m20293f(strSubstring, "substring(...)");
        } else {
            strSubstring = "";
        }
        List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> localAnnotations = getLocalAnnotations(annotatedString, i10, i11, new InterfaceC9540l() { // from class: androidx.compose.ui.text.AnnotatedStringKt.substringWithoutParagraphStyles.1
            @Override // p181hd.InterfaceC9540l
            public final Boolean invoke(AnnotatedString.Annotation annotation) {
                return Boolean.valueOf(!(annotation instanceof ParagraphStyle));
            }
        });
        if (localAnnotations == null) {
            localAnnotations = AbstractC10978w.m24136n();
        }
        return new AnnotatedString(strSubstring, localAnnotations);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC9545q() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toLowerCase.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                return StringKt.toLowerCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString, final LocaleList localeList) {
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new InterfaceC9545q() { // from class: androidx.compose.ui.text.AnnotatedStringKt.toUpperCase.1
            {
                super(3);
            }

            @Override // p181hd.InterfaceC9545q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            }

            public final String invoke(String str, int i10, int i11) {
                String strSubstring = str.substring(i10, i11);
                AbstractC9979u.m20293f(strSubstring, "substring(...)");
                return StringKt.toUpperCase(strSubstring, localeList);
            }
        });
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, String str, String str2, InterfaceC9540l interfaceC9540l) {
        int iPushStringAnnotation = builder.pushStringAnnotation(str, str2);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushStringAnnotation);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <R> R withBulletListItem(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, InterfaceC9540l interfaceC9540l) {
        Bullet defaultBullet;
        Pair pair = (Pair) AbstractC10947g0.m23957z0(bulletScope.getBulletListSettingStack$ui_text_release());
        long jM33704unboximpl = pair != null ? ((TextUnit) pair.m20051f()).m33704unboximpl() : BulletKt.getDefaultBulletIndentation();
        if (bullet != null) {
            defaultBullet = bullet;
        } else if (pair == null || (defaultBullet = (Bullet) pair.m20052g()) == null) {
            defaultBullet = BulletKt.getDefaultBullet();
        }
        int iPushStyle = bulletScope.getBuilder$ui_text_release().pushStyle(new ParagraphStyle(0, 0, 0L, new TextIndent(jM33704unboximpl, jM33704unboximpl, null), (PlatformParagraphStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, TypedValues.PositionType.TYPE_PERCENT_WIDTH, (AbstractC9972n) null));
        int iPushBullet$ui_text_release = bulletScope.getBuilder$ui_text_release().pushBullet$ui_text_release(defaultBullet);
        try {
            return (R) interfaceC9540l.invoke(bulletScope.getBuilder$ui_text_release());
        } finally {
            bulletScope.getBuilder$ui_text_release().pop(iPushBullet$ui_text_release);
            bulletScope.getBuilder$ui_text_release().pop(iPushStyle);
        }
    }

    public static /* synthetic */ Object withBulletListItem$default(AnnotatedString.Builder.BulletScope bulletScope, Bullet bullet, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bullet = null;
        }
        return withBulletListItem(bulletScope, bullet, interfaceC9540l);
    }

    public static final <R> R withLink(AnnotatedString.Builder builder, LinkAnnotation linkAnnotation, InterfaceC9540l interfaceC9540l) {
        int iPushLink = builder.pushLink(linkAnnotation);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushLink);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, SpanStyle spanStyle, InterfaceC9540l interfaceC9540l) {
        int iPushStyle = builder.pushStyle(spanStyle);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushStyle);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <R> R withAnnotation(AnnotatedString.Builder builder, TtsAnnotation ttsAnnotation, InterfaceC9540l interfaceC9540l) {
        int iPushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushTtsAnnotation);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final <R> R withStyle(AnnotatedString.Builder builder, ParagraphStyle paragraphStyle, InterfaceC9540l interfaceC9540l) {
        int iPushStyle = builder.pushStyle(paragraphStyle);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushStyle);
            AbstractC9977s.m20285a(1);
        }
    }

    public static final AnnotatedString AnnotatedString(String str, ParagraphStyle paragraphStyle) {
        return new AnnotatedString(str, AbstractC10978w.m24136n(), AbstractC10976v.m24126e(new AnnotatedString.Range(paragraphStyle, 0, str.length())));
    }

    @ExperimentalTextApi
    @InterfaceC10770a
    public static final <R> R withAnnotation(AnnotatedString.Builder builder, UrlAnnotation urlAnnotation, InterfaceC9540l interfaceC9540l) {
        int iPushUrlAnnotation = builder.pushUrlAnnotation(urlAnnotation);
        try {
            return (R) interfaceC9540l.invoke(builder);
        } finally {
            AbstractC9977s.m20286b(1);
            builder.pop(iPushUrlAnnotation);
            AbstractC9977s.m20285a(1);
        }
    }
}
