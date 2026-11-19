package androidx.compose.p014ui.text;

import androidx.compose.p014ui.geometry.Offset;
import androidx.compose.p014ui.graphics.Color;
import androidx.compose.p014ui.graphics.ColorKt;
import androidx.compose.p014ui.graphics.Shadow;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.LinkAnnotation;
import androidx.compose.p014ui.text.TextRange;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.intl.Locale;
import androidx.compose.p014ui.text.intl.LocaleList;
import androidx.compose.p014ui.text.style.BaselineShift;
import androidx.compose.p014ui.text.style.Hyphens;
import androidx.compose.p014ui.text.style.LineBreak;
import androidx.compose.p014ui.text.style.LineHeightStyle;
import androidx.compose.p014ui.text.style.TextAlign;
import androidx.compose.p014ui.text.style.TextDecoration;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.text.style.TextGeometricTransform;
import androidx.compose.p014ui.text.style.TextIndent;
import androidx.compose.p014ui.text.style.TextMotion;
import androidx.compose.p014ui.unit.TextUnit;
import androidx.compose.p014ui.unit.TextUnitKt;
import androidx.compose.p014ui.unit.TextUnitType;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p325rc.AbstractC10978w;

/* loaded from: classes2.dex */
public final class SaversKt {
    private static final Saver<AnnotatedString, Object> AnnotatedStringSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, AnnotatedString annotatedString) {
            return AbstractC10978w.m24129g(SaversKt.save(annotatedString.getText()), SaversKt.save(annotatedString.getAnnotations$ui_text_release(), SaversKt.AnnotationRangeListSaver, saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$AnnotatedStringSaver$2
        @Override // p181hd.InterfaceC9540l
        public final AnnotatedString invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(1);
            Saver saver = SaversKt.AnnotationRangeListSaver;
            List list2 = ((!AbstractC9979u.m20289b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? (List) saver.restore(obj2) : null;
            Object obj3 = list.get(0);
            String str = obj3 != null ? (String) obj3 : null;
            AbstractC9979u.m20291d(str);
            return new AnnotatedString((List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list2, str);
        }
    });
    private static final Saver<List<AnnotatedString.Range<? extends Object>>, Object> AnnotationRangeListSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, List<? extends AnnotatedString.Range<? extends Object>> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(list.get(i10), SaversKt.AnnotationRangeSaver, saverScope));
            }
            return arrayList;
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeListSaver$2
        @Override // p181hd.InterfaceC9540l
        public final List<AnnotatedString.Range<? extends Object>> invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Saver saver = SaversKt.AnnotationRangeSaver;
                AnnotatedString.Range range = null;
                if ((!AbstractC9979u.m20289b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    range = (AnnotatedString.Range) saver.restore(obj2);
                }
                AbstractC9979u.m20291d(range);
                arrayList.add(range);
            }
            return arrayList;
        }
    });
    private static final Saver<AnnotatedString.Range<? extends Object>, Object> AnnotationRangeSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$1

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, AnnotatedString.Range<? extends Object> range) {
            AnnotationType annotationType;
            Object objSave;
            Object item = range.getItem();
            if (item instanceof ParagraphStyle) {
                annotationType = AnnotationType.Paragraph;
            } else if (item instanceof SpanStyle) {
                annotationType = AnnotationType.Span;
            } else if (item instanceof VerbatimTtsAnnotation) {
                annotationType = AnnotationType.VerbatimTts;
            } else if (item instanceof UrlAnnotation) {
                annotationType = AnnotationType.Url;
            } else if (item instanceof LinkAnnotation.Url) {
                annotationType = AnnotationType.Link;
            } else if (item instanceof LinkAnnotation.Clickable) {
                annotationType = AnnotationType.Clickable;
            } else {
                if (!(item instanceof StringAnnotation)) {
                    throw new UnsupportedOperationException();
                }
                annotationType = AnnotationType.String;
            }
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object item2 = range.getItem();
                    AbstractC9979u.m20292e(item2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                    objSave = SaversKt.save((ParagraphStyle) item2, SaversKt.getParagraphStyleSaver(), saverScope);
                    break;
                case 2:
                    Object item3 = range.getItem();
                    AbstractC9979u.m20292e(item3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                    objSave = SaversKt.save((SpanStyle) item3, SaversKt.getSpanStyleSaver(), saverScope);
                    break;
                case 3:
                    Object item4 = range.getItem();
                    AbstractC9979u.m20292e(item4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                    objSave = SaversKt.save((VerbatimTtsAnnotation) item4, SaversKt.VerbatimTtsAnnotationSaver, saverScope);
                    break;
                case 4:
                    Object item5 = range.getItem();
                    AbstractC9979u.m20292e(item5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                    objSave = SaversKt.save((UrlAnnotation) item5, SaversKt.UrlAnnotationSaver, saverScope);
                    break;
                case 5:
                    Object item6 = range.getItem();
                    AbstractC9979u.m20292e(item6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                    objSave = SaversKt.save((LinkAnnotation.Url) item6, SaversKt.LinkSaver, saverScope);
                    break;
                case 6:
                    Object item7 = range.getItem();
                    AbstractC9979u.m20292e(item7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                    objSave = SaversKt.save((LinkAnnotation.Clickable) item7, SaversKt.ClickableSaver, saverScope);
                    break;
                case 7:
                    Object item8 = range.getItem();
                    AbstractC9979u.m20292e(item8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                    objSave = SaversKt.save(((StringAnnotation) item8).m32920unboximpl());
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            return AbstractC10978w.m24129g(SaversKt.save(annotationType), objSave, SaversKt.save(Integer.valueOf(range.getStart())), SaversKt.save(Integer.valueOf(range.getEnd())), SaversKt.save(range.getTag()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$AnnotationRangeSaver$2

        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AnnotationType.values().length];
                try {
                    iArr[AnnotationType.Paragraph.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AnnotationType.Span.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AnnotationType.Url.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AnnotationType.Link.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AnnotationType.Clickable.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AnnotationType.String.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // p181hd.InterfaceC9540l
        public final AnnotatedString.Range<? extends Object> invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            ParagraphStyle paragraphStyleRestore = null;
            clickable = null;
            LinkAnnotation.Clickable clickable = null;
            url = null;
            LinkAnnotation.Url url = null;
            urlAnnotation = null;
            UrlAnnotation urlAnnotation = null;
            verbatimTtsAnnotation = null;
            VerbatimTtsAnnotation verbatimTtsAnnotation = null;
            spanStyleRestore = null;
            SpanStyle spanStyleRestore = null;
            paragraphStyleRestore = null;
            AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
            AbstractC9979u.m20291d(annotationType);
            Object obj3 = list.get(2);
            Integer num = obj3 != null ? (Integer) obj3 : null;
            AbstractC9979u.m20291d(num);
            int iIntValue = num.intValue();
            Object obj4 = list.get(3);
            Integer num2 = obj4 != null ? (Integer) obj4 : null;
            AbstractC9979u.m20291d(num2);
            int iIntValue2 = num2.intValue();
            Object obj5 = list.get(4);
            String str = obj5 != null ? (String) obj5 : null;
            AbstractC9979u.m20291d(str);
            switch (WhenMappings.$EnumSwitchMapping$0[annotationType.ordinal()]) {
                case 1:
                    Object obj6 = list.get(1);
                    Saver<ParagraphStyle, Object> paragraphStyleSaver = SaversKt.getParagraphStyleSaver();
                    if ((!AbstractC9979u.m20289b(obj6, Boolean.FALSE) || (paragraphStyleSaver instanceof NonNullValueClassSaver)) && obj6 != null) {
                        paragraphStyleRestore = paragraphStyleSaver.restore(obj6);
                    }
                    AbstractC9979u.m20291d(paragraphStyleRestore);
                    return new AnnotatedString.Range<>(paragraphStyleRestore, iIntValue, iIntValue2, str);
                case 2:
                    Object obj7 = list.get(1);
                    Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
                    if ((!AbstractC9979u.m20289b(obj7, Boolean.FALSE) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj7 != null) {
                        spanStyleRestore = spanStyleSaver.restore(obj7);
                    }
                    AbstractC9979u.m20291d(spanStyleRestore);
                    return new AnnotatedString.Range<>(spanStyleRestore, iIntValue, iIntValue2, str);
                case 3:
                    Object obj8 = list.get(1);
                    Saver saver = SaversKt.VerbatimTtsAnnotationSaver;
                    if ((!AbstractC9979u.m20289b(obj8, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj8 != null) {
                        verbatimTtsAnnotation = (VerbatimTtsAnnotation) saver.restore(obj8);
                    }
                    AbstractC9979u.m20291d(verbatimTtsAnnotation);
                    return new AnnotatedString.Range<>(verbatimTtsAnnotation, iIntValue, iIntValue2, str);
                case 4:
                    Object obj9 = list.get(1);
                    Saver saver2 = SaversKt.UrlAnnotationSaver;
                    if ((!AbstractC9979u.m20289b(obj9, Boolean.FALSE) || (saver2 instanceof NonNullValueClassSaver)) && obj9 != null) {
                        urlAnnotation = (UrlAnnotation) saver2.restore(obj9);
                    }
                    AbstractC9979u.m20291d(urlAnnotation);
                    return new AnnotatedString.Range<>(urlAnnotation, iIntValue, iIntValue2, str);
                case 5:
                    Object obj10 = list.get(1);
                    Saver saver3 = SaversKt.LinkSaver;
                    if ((!AbstractC9979u.m20289b(obj10, Boolean.FALSE) || (saver3 instanceof NonNullValueClassSaver)) && obj10 != null) {
                        url = (LinkAnnotation.Url) saver3.restore(obj10);
                    }
                    AbstractC9979u.m20291d(url);
                    return new AnnotatedString.Range<>(url, iIntValue, iIntValue2, str);
                case 6:
                    Object obj11 = list.get(1);
                    Saver saver4 = SaversKt.ClickableSaver;
                    if ((!AbstractC9979u.m20289b(obj11, Boolean.FALSE) || (saver4 instanceof NonNullValueClassSaver)) && obj11 != null) {
                        clickable = (LinkAnnotation.Clickable) saver4.restore(obj11);
                    }
                    AbstractC9979u.m20291d(clickable);
                    return new AnnotatedString.Range<>(clickable, iIntValue, iIntValue2, str);
                case 7:
                    Object obj12 = list.get(1);
                    String str2 = obj12 != null ? (String) obj12 : null;
                    AbstractC9979u.m20291d(str2);
                    return new AnnotatedString.Range<>(StringAnnotation.m32914boximpl(StringAnnotation.m32915constructorimpl(str2)), iIntValue, iIntValue2, str);
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    });
    private static final Saver<VerbatimTtsAnnotation, Object> VerbatimTtsAnnotationSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, VerbatimTtsAnnotation verbatimTtsAnnotation) {
            return SaversKt.save(verbatimTtsAnnotation.getVerbatim());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$VerbatimTtsAnnotationSaver$2
        @Override // p181hd.InterfaceC9540l
        public final VerbatimTtsAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            AbstractC9979u.m20291d(str);
            return new VerbatimTtsAnnotation(str);
        }
    });
    private static final Saver<UrlAnnotation, Object> UrlAnnotationSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, UrlAnnotation urlAnnotation) {
            return SaversKt.save(urlAnnotation.getUrl());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$UrlAnnotationSaver$2
        @Override // p181hd.InterfaceC9540l
        public final UrlAnnotation invoke(Object obj) {
            String str = obj != null ? (String) obj : null;
            AbstractC9979u.m20291d(str);
            return new UrlAnnotation(str);
        }
    });
    private static final Saver<LinkAnnotation.Url, Object> LinkSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Url url) {
            return AbstractC10978w.m24129g(SaversKt.save(url.getUrl()), SaversKt.save(url.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$LinkSaver$2
        @Override // p181hd.InterfaceC9540l
        public final LinkAnnotation.Url invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextLinkStyles textLinkStylesRestore = null;
            String str = obj2 != null ? (String) obj2 : null;
            AbstractC9979u.m20291d(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            if ((!AbstractC9979u.m20289b(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) {
                textLinkStylesRestore = textLinkStylesSaver.restore(obj3);
            }
            return new LinkAnnotation.Url(str, textLinkStylesRestore, null, 4, null);
        }
    });
    private static final Saver<LinkAnnotation.Clickable, Object> ClickableSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, LinkAnnotation.Clickable clickable) {
            return AbstractC10978w.m24129g(SaversKt.save(clickable.getTag()), SaversKt.save(clickable.getStyles(), SaversKt.getTextLinkStylesSaver(), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$ClickableSaver$2
        @Override // p181hd.InterfaceC9540l
        public final LinkAnnotation.Clickable invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            String str = obj2 != null ? (String) obj2 : null;
            AbstractC9979u.m20291d(str);
            Object obj3 = list.get(1);
            Saver<TextLinkStyles, Object> textLinkStylesSaver = SaversKt.getTextLinkStylesSaver();
            return new LinkAnnotation.Clickable(str, ((!AbstractC9979u.m20289b(obj3, Boolean.FALSE) || (textLinkStylesSaver instanceof NonNullValueClassSaver)) && obj3 != null) ? textLinkStylesSaver.restore(obj3) : null, null);
        }
    });
    private static final Saver<ParagraphStyle, Object> ParagraphStyleSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, ParagraphStyle paragraphStyle) {
            return AbstractC10978w.m24129g(SaversKt.save(TextAlign.m33378boximpl(paragraphStyle.m32861getTextAligne0LSkKk())), SaversKt.save(TextDirection.m33392boximpl(paragraphStyle.m32863getTextDirections_7Xco())), SaversKt.save(TextUnit.m33685boximpl(paragraphStyle.m32859getLineHeightXSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope), SaversKt.save(paragraphStyle.getTextIndent(), SaversKt.getSaver(TextIndent.Companion), saverScope), SaversKt.save(paragraphStyle.getPlatformStyle(), Savers_androidKt.getSaver(PlatformParagraphStyle.Companion), saverScope), SaversKt.save(paragraphStyle.getLineHeightStyle(), SaversKt.getSaver(LineHeightStyle.Companion), saverScope), SaversKt.save(LineBreak.m33286boximpl(paragraphStyle.m32858getLineBreakrAG3T2k()), Savers_androidKt.getSaver(LineBreak.Companion), saverScope), SaversKt.save(Hyphens.m33276boximpl(paragraphStyle.m32856getHyphensvmbZdU8())), SaversKt.save(paragraphStyle.getTextMotion(), Savers_androidKt.getSaver(TextMotion.Companion), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$ParagraphStyleSaver$2
        @Override // p181hd.InterfaceC9540l
        public final ParagraphStyle invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextMotion textMotionRestore = null;
            TextAlign textAlign = obj2 != null ? (TextAlign) obj2 : null;
            AbstractC9979u.m20291d(textAlign);
            int iM33384unboximpl = textAlign.m33384unboximpl();
            Object obj3 = list.get(1);
            TextDirection textDirection = obj3 != null ? (TextDirection) obj3 : null;
            AbstractC9979u.m20291d(textDirection);
            int iM33398unboximpl = textDirection.m33398unboximpl();
            Object obj4 = list.get(2);
            Saver<TextUnit, Object> saver = SaversKt.getSaver(TextUnit.Companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = ((!AbstractC9979u.m20289b(obj4, bool) || (saver instanceof NonNullValueClassSaver)) && obj4 != null) ? saver.restore(obj4) : null;
            AbstractC9979u.m20291d(textUnitRestore);
            long jM33704unboximpl = textUnitRestore.m33704unboximpl();
            Object obj5 = list.get(3);
            Saver<TextIndent, Object> saver2 = SaversKt.getSaver(TextIndent.Companion);
            TextIndent textIndentRestore = ((!AbstractC9979u.m20289b(obj5, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj5 != null) ? saver2.restore(obj5) : null;
            Object obj6 = list.get(4);
            Saver<PlatformParagraphStyle, Object> saver3 = Savers_androidKt.getSaver(PlatformParagraphStyle.Companion);
            PlatformParagraphStyle platformParagraphStyleRestore = ((!AbstractC9979u.m20289b(obj6, bool) || (saver3 instanceof NonNullValueClassSaver)) && obj6 != null) ? saver3.restore(obj6) : null;
            Object obj7 = list.get(5);
            Saver<LineHeightStyle, Object> saver4 = SaversKt.getSaver(LineHeightStyle.Companion);
            LineHeightStyle lineHeightStyleRestore = ((!AbstractC9979u.m20289b(obj7, bool) || (saver4 instanceof NonNullValueClassSaver)) && obj7 != null) ? saver4.restore(obj7) : null;
            Object obj8 = list.get(6);
            Saver<LineBreak, Object> saver5 = Savers_androidKt.getSaver(LineBreak.Companion);
            LineBreak lineBreakRestore = ((!AbstractC9979u.m20289b(obj8, bool) || (saver5 instanceof NonNullValueClassSaver)) && obj8 != null) ? saver5.restore(obj8) : null;
            AbstractC9979u.m20291d(lineBreakRestore);
            int iM33298unboximpl = lineBreakRestore.m33298unboximpl();
            Object obj9 = list.get(7);
            Hyphens hyphens = obj9 != null ? (Hyphens) obj9 : null;
            AbstractC9979u.m20291d(hyphens);
            int iM33282unboximpl = hyphens.m33282unboximpl();
            Object obj10 = list.get(8);
            Saver<TextMotion, Object> saver6 = Savers_androidKt.getSaver(TextMotion.Companion);
            if ((!AbstractC9979u.m20289b(obj10, bool) || (saver6 instanceof NonNullValueClassSaver)) && obj10 != null) {
                textMotionRestore = saver6.restore(obj10);
            }
            return new ParagraphStyle(iM33384unboximpl, iM33398unboximpl, jM33704unboximpl, textIndentRestore, platformParagraphStyleRestore, lineHeightStyleRestore, iM33298unboximpl, iM33282unboximpl, textMotionRestore, (AbstractC9972n) null);
        }
    });
    private static final Saver<SpanStyle, Object> SpanStyleSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, SpanStyle spanStyle) {
            Color colorM30868boximpl = Color.m30868boximpl(spanStyle.m32907getColor0d7_KjU());
            Color.Companion companion = Color.Companion;
            Object objSave = SaversKt.save(colorM30868boximpl, SaversKt.getSaver(companion), saverScope);
            TextUnit textUnitM33685boximpl = TextUnit.m33685boximpl(spanStyle.m32908getFontSizeXSAIIZE());
            TextUnit.Companion companion2 = TextUnit.Companion;
            return AbstractC10978w.m24129g(objSave, SaversKt.save(textUnitM33685boximpl, SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope), SaversKt.save(spanStyle.m32909getFontStyle4Lr2A7w()), SaversKt.save(spanStyle.m32910getFontSynthesisZQGJjVo()), SaversKt.save(-1), SaversKt.save(spanStyle.getFontFeatureSettings()), SaversKt.save(TextUnit.m33685boximpl(spanStyle.m32911getLetterSpacingXSAIIZE()), SaversKt.getSaver(companion2), saverScope), SaversKt.save(spanStyle.m32906getBaselineShift5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope), SaversKt.save(spanStyle.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope), SaversKt.save(spanStyle.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope), SaversKt.save(Color.m30868boximpl(spanStyle.m32905getBackground0d7_KjU()), SaversKt.getSaver(companion), saverScope), SaversKt.save(spanStyle.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope), SaversKt.save(spanStyle.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$SpanStyleSaver$2
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.SpanStyle, still in use, count: 2, list:
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d8: MOVE (r16v2 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
              (r1v1 androidx.compose.ui.text.SpanStyle) from 0x00d0: MOVE (r16v7 androidx.compose.ui.text.SpanStyle) = (r1v1 androidx.compose.ui.text.SpanStyle)
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
            	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
            	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
            */
        @Override // p181hd.InterfaceC9540l
        public final androidx.compose.p014ui.text.SpanStyle invoke(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 450
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.SaversKt$SpanStyleSaver$2.invoke(java.lang.Object):androidx.compose.ui.text.SpanStyle");
        }
    });
    private static final Saver<TextLinkStyles, Object> TextLinkStylesSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextLinkStyles textLinkStyles) {
            return AbstractC10978w.m24129g(SaversKt.save(textLinkStyles.getStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getFocusedStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getHoveredStyle(), SaversKt.getSpanStyleSaver(), saverScope), SaversKt.save(textLinkStyles.getPressedStyle(), SaversKt.getSpanStyleSaver(), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextLinkStylesSaver$2
        @Override // p181hd.InterfaceC9540l
        public final TextLinkStyles invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<SpanStyle, Object> spanStyleSaver = SaversKt.getSpanStyleSaver();
            Boolean bool = Boolean.FALSE;
            SpanStyle spanStyleRestore = null;
            SpanStyle spanStyleRestore2 = ((!AbstractC9979u.m20289b(obj2, bool) || (spanStyleSaver instanceof NonNullValueClassSaver)) && obj2 != null) ? spanStyleSaver.restore(obj2) : null;
            Object obj3 = list.get(1);
            Saver<SpanStyle, Object> spanStyleSaver2 = SaversKt.getSpanStyleSaver();
            SpanStyle spanStyleRestore3 = ((!AbstractC9979u.m20289b(obj3, bool) || (spanStyleSaver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? spanStyleSaver2.restore(obj3) : null;
            Object obj4 = list.get(2);
            Saver<SpanStyle, Object> spanStyleSaver3 = SaversKt.getSpanStyleSaver();
            SpanStyle spanStyleRestore4 = ((!AbstractC9979u.m20289b(obj4, bool) || (spanStyleSaver3 instanceof NonNullValueClassSaver)) && obj4 != null) ? spanStyleSaver3.restore(obj4) : null;
            Object obj5 = list.get(3);
            Saver<SpanStyle, Object> spanStyleSaver4 = SaversKt.getSpanStyleSaver();
            if ((!AbstractC9979u.m20289b(obj5, bool) || (spanStyleSaver4 instanceof NonNullValueClassSaver)) && obj5 != null) {
                spanStyleRestore = spanStyleSaver4.restore(obj5);
            }
            return new TextLinkStyles(spanStyleRestore2, spanStyleRestore3, spanStyleRestore4, spanStyleRestore);
        }
    });
    private static final Saver<TextDecoration, Object> TextDecorationSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextDecoration textDecoration) {
            return Integer.valueOf(textDecoration.getMask());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextDecorationSaver$2
        @Override // p181hd.InterfaceC9540l
        public final TextDecoration invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new TextDecoration(((Integer) obj).intValue());
        }
    });
    private static final Saver<TextGeometricTransform, Object> TextGeometricTransformSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextGeometricTransform textGeometricTransform) {
            return AbstractC10978w.m24129g(Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX()));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextGeometricTransformSaver$2
        @Override // p181hd.InterfaceC9540l
        public final TextGeometricTransform invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
            List list = (List) obj;
            return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
        }
    });
    private static final Saver<TextIndent, Object> TextIndentSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, TextIndent textIndent) {
            TextUnit textUnitM33685boximpl = TextUnit.m33685boximpl(textIndent.m33409getFirstLineXSAIIZE());
            TextUnit.Companion companion = TextUnit.Companion;
            return AbstractC10978w.m24129g(SaversKt.save(textUnitM33685boximpl, SaversKt.getSaver(companion), saverScope), SaversKt.save(TextUnit.m33685boximpl(textIndent.m33410getRestLineXSAIIZE()), SaversKt.getSaver(companion), saverScope));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextIndentSaver$2
        @Override // p181hd.InterfaceC9540l
        public final TextIndent invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            TextUnit.Companion companion = TextUnit.Companion;
            Saver<TextUnit, Object> saver = SaversKt.getSaver(companion);
            Boolean bool = Boolean.FALSE;
            TextUnit textUnitRestore = null;
            TextUnit textUnitRestore2 = ((!AbstractC9979u.m20289b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            AbstractC9979u.m20291d(textUnitRestore2);
            long jM33704unboximpl = textUnitRestore2.m33704unboximpl();
            Object obj3 = list.get(1);
            Saver<TextUnit, Object> saver2 = SaversKt.getSaver(companion);
            if ((!AbstractC9979u.m20289b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) {
                textUnitRestore = saver2.restore(obj3);
            }
            AbstractC9979u.m20291d(textUnitRestore);
            return new TextIndent(jM33704unboximpl, textUnitRestore.m33704unboximpl(), null);
        }
    });
    private static final Saver<FontWeight, Object> FontWeightSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, FontWeight fontWeight) {
            return Integer.valueOf(fontWeight.getWeight());
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$FontWeightSaver$2
        @Override // p181hd.InterfaceC9540l
        public final FontWeight invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            return new FontWeight(((Integer) obj).intValue());
        }
    });
    private static final Saver<BaselineShift, Object> BaselineShiftSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32885invoke8a2Sb4w((SaverScope) obj, ((BaselineShift) obj2).m33263unboximpl());
        }

        /* renamed from: invoke-8a2Sb4w, reason: not valid java name */
        public final Object m32885invoke8a2Sb4w(SaverScope saverScope, float f10) {
            return Float.valueOf(f10);
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$BaselineShiftSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
        public final BaselineShift invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Float");
            return BaselineShift.m33257boximpl(BaselineShift.m33258constructorimpl(((Float) obj).floatValue()));
        }
    });
    private static final Saver<TextRange, Object> TextRangeSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32891invokeFDrldGo((SaverScope) obj, ((TextRange) obj2).m32970unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-FDrldGo, reason: not valid java name */
        public final Object m32891invokeFDrldGo(SaverScope saverScope, long j10) {
            return AbstractC10978w.m24129g(SaversKt.save(Integer.valueOf(TextRange.m32966getStartimpl(j10))), SaversKt.save(Integer.valueOf(TextRange.m32961getEndimpl(j10))));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextRangeSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-VqIyPBM, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextRange invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Integer num = obj2 != null ? (Integer) obj2 : null;
            AbstractC9979u.m20291d(num);
            int iIntValue = num.intValue();
            Object obj3 = list.get(1);
            Integer num2 = obj3 != null ? (Integer) obj3 : null;
            AbstractC9979u.m20291d(num2);
            return TextRange.m32954boximpl(TextRangeKt.TextRange(iIntValue, num2.intValue()));
        }
    });
    private static final Saver<Shadow, Object> ShadowSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, Shadow shadow) {
            return AbstractC10978w.m24129g(SaversKt.save(Color.m30868boximpl(shadow.m31203getColor0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope), SaversKt.save(Offset.m30626boximpl(shadow.m31204getOffsetF1C5BW0()), SaversKt.getSaver(Offset.Companion), saverScope), SaversKt.save(Float.valueOf(shadow.getBlurRadius())));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$ShadowSaver$2
        @Override // p181hd.InterfaceC9540l
        public final Shadow invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Saver<Color, Object> saver = SaversKt.getSaver(Color.Companion);
            Boolean bool = Boolean.FALSE;
            Color colorRestore = ((!AbstractC9979u.m20289b(obj2, bool) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) ? saver.restore(obj2) : null;
            AbstractC9979u.m20291d(colorRestore);
            long jM30888unboximpl = colorRestore.m30888unboximpl();
            Object obj3 = list.get(1);
            Saver<Offset, Object> saver2 = SaversKt.getSaver(Offset.Companion);
            Offset offsetRestore = ((!AbstractC9979u.m20289b(obj3, bool) || (saver2 instanceof NonNullValueClassSaver)) && obj3 != null) ? saver2.restore(obj3) : null;
            AbstractC9979u.m20291d(offsetRestore);
            long jM30647unboximpl = offsetRestore.m30647unboximpl();
            Object obj4 = list.get(2);
            Float f10 = obj4 != null ? (Float) obj4 : null;
            AbstractC9979u.m20291d(f10);
            return new Shadow(jM30888unboximpl, jM30647unboximpl, f10.floatValue(), null);
        }
    });
    private static final NonNullValueClassSaver<Color, Object> ColorSaver = NonNullValueClassSaver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32887invoke4WTKRHQ((SaverScope) obj, ((Color) obj2).m30888unboximpl());
        }

        /* renamed from: invoke-4WTKRHQ, reason: not valid java name */
        public final Object m32887invoke4WTKRHQ(SaverScope saverScope, long j10) {
            return j10 == 16 ? Boolean.FALSE : Integer.valueOf(ColorKt.m30932toArgb8_81llA(j10));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$ColorSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Color invoke(Object obj) {
            if (AbstractC9979u.m20289b(obj, Boolean.FALSE)) {
                return Color.m30868boximpl(Color.Companion.m30914getUnspecified0d7_KjU());
            }
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Int");
            return Color.m30868boximpl(ColorKt.Color(((Integer) obj).intValue()));
        }
    });
    private static final NonNullValueClassSaver<TextUnit, Object> TextUnitSaver = NonNullValueClassSaver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32893invokempE4wyQ((SaverScope) obj, ((TextUnit) obj2).m33704unboximpl());
        }

        /* renamed from: invoke-mpE4wyQ, reason: not valid java name */
        public final Object m32893invokempE4wyQ(SaverScope saverScope, long j10) {
            return TextUnit.m33692equalsimpl0(j10, TextUnit.Companion.m33706getUnspecifiedXSAIIZE()) ? Boolean.FALSE : AbstractC10978w.m24129g(SaversKt.save(Float.valueOf(TextUnit.m33695getValueimpl(j10))), SaversKt.save(TextUnitType.m33720boximpl(TextUnit.m33694getTypeUIouoOA(j10))));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$TextUnitSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-XNhUCwk, reason: not valid java name and merged with bridge method [inline-methods] */
        public final TextUnit invoke(Object obj) {
            if (AbstractC9979u.m20289b(obj, Boolean.FALSE)) {
                return TextUnit.m33685boximpl(TextUnit.Companion.m33706getUnspecifiedXSAIIZE());
            }
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            AbstractC9979u.m20291d(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            TextUnitType textUnitType = obj3 != null ? (TextUnitType) obj3 : null;
            AbstractC9979u.m20291d(textUnitType);
            return TextUnit.m33685boximpl(TextUnitKt.m33707TextUnitanM5pPY(fFloatValue, textUnitType.m33726unboximpl()));
        }
    });
    private static final NonNullValueClassSaver<Offset, Object> OffsetSaver = NonNullValueClassSaver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$1
        @Override // p181hd.InterfaceC9544p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m32889invokeUv8p0NA((SaverScope) obj, ((Offset) obj2).m30647unboximpl());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
        public final Object m32889invokeUv8p0NA(SaverScope saverScope, long j10) {
            return Offset.m30634equalsimpl0(j10, Offset.Companion.m30652getUnspecifiedF1C5BW0()) ? Boolean.FALSE : AbstractC10978w.m24129g(SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j10 >> 32)))), SaversKt.save(Float.valueOf(Float.intBitsToFloat((int) (j10 & 4294967295L)))));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$OffsetSaver$2
        @Override // p181hd.InterfaceC9540l
        /* renamed from: invoke-x-9fifI, reason: not valid java name and merged with bridge method [inline-methods] */
        public final Offset invoke(Object obj) {
            if (AbstractC9979u.m20289b(obj, Boolean.FALSE)) {
                return Offset.m30626boximpl(Offset.Companion.m30652getUnspecifiedF1C5BW0());
            }
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            Float f10 = obj2 != null ? (Float) obj2 : null;
            AbstractC9979u.m20291d(f10);
            float fFloatValue = f10.floatValue();
            Object obj3 = list.get(1);
            AbstractC9979u.m20291d(obj3 != null ? (Float) obj3 : null);
            return Offset.m30626boximpl(Offset.m30629constructorimpl((Float.floatToRawIntBits(fFloatValue) << 32) | (Float.floatToRawIntBits(r1.floatValue()) & 4294967295L)));
        }
    });
    private static final Saver<LocaleList, Object> LocaleListSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, LocaleList localeList) {
            List<Locale> localeList2 = localeList.getLocaleList();
            ArrayList arrayList = new ArrayList(localeList2.size());
            int size = localeList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(SaversKt.save(localeList2.get(i10), SaversKt.getSaver(Locale.Companion), saverScope));
            }
            return arrayList;
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$LocaleListSaver$2
        @Override // p181hd.InterfaceC9540l
        public final LocaleList invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj2 = list.get(i10);
                Saver<Locale, Object> saver = SaversKt.getSaver(Locale.Companion);
                Locale localeRestore = null;
                if ((!AbstractC9979u.m20289b(obj2, Boolean.FALSE) || (saver instanceof NonNullValueClassSaver)) && obj2 != null) {
                    localeRestore = saver.restore(obj2);
                }
                AbstractC9979u.m20291d(localeRestore);
                arrayList.add(localeRestore);
            }
            return new LocaleList(arrayList);
        }
    });
    private static final Saver<Locale, Object> LocaleSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, Locale locale) {
            return locale.toLanguageTag();
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$LocaleSaver$2
        @Override // p181hd.InterfaceC9540l
        public final Locale invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.String");
            return new Locale((String) obj);
        }
    });
    private static final Saver<LineHeightStyle, Object> LineHeightStyleSaver = SaverKt.Saver(new InterfaceC9544p() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$1
        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SaverScope saverScope, LineHeightStyle lineHeightStyle) {
            return AbstractC10978w.m24129g(SaversKt.save(LineHeightStyle.Alignment.m33345boximpl(lineHeightStyle.m33342getAlignmentPIaL0Z0())), SaversKt.save(LineHeightStyle.Trim.m33365boximpl(lineHeightStyle.m33344getTrimEVpEnUU())), SaversKt.save(LineHeightStyle.Mode.m33356boximpl(lineHeightStyle.m33343getModelzQqcRY())));
        }
    }, new InterfaceC9540l() { // from class: androidx.compose.ui.text.SaversKt$LineHeightStyleSaver$2
        @Override // p181hd.InterfaceC9540l
        public final LineHeightStyle invoke(Object obj) {
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            LineHeightStyle.Alignment alignment = obj2 != null ? (LineHeightStyle.Alignment) obj2 : null;
            AbstractC9979u.m20291d(alignment);
            float fM33351unboximpl = alignment.m33351unboximpl();
            Object obj3 = list.get(1);
            LineHeightStyle.Trim trim = obj3 != null ? (LineHeightStyle.Trim) obj3 : null;
            AbstractC9979u.m20291d(trim);
            int iM33373unboximpl = trim.m33373unboximpl();
            Object obj4 = list.get(2);
            LineHeightStyle.Mode mode = obj4 != null ? (LineHeightStyle.Mode) obj4 : null;
            AbstractC9979u.m20291d(mode);
            return new LineHeightStyle(fM33351unboximpl, iM33373unboximpl, mode.m33362unboximpl(), null);
        }
    });

    private static final <Original, Saveable> NonNullValueClassSaver<Original, Saveable> NonNullValueClassSaver(final InterfaceC9544p interfaceC9544p, final InterfaceC9540l interfaceC9540l) {
        return new NonNullValueClassSaver<Original, Saveable>() { // from class: androidx.compose.ui.text.SaversKt.NonNullValueClassSaver.1
            @Override // androidx.compose.runtime.saveable.Saver
            public Original restore(Saveable saveable) {
                return (Original) interfaceC9540l.invoke(saveable);
            }

            @Override // androidx.compose.runtime.saveable.Saver
            public Saveable save(SaverScope saverScope, Original original) {
                return (Saveable) interfaceC9544p.invoke(saverScope, original);
            }
        };
    }

    public static final Saver<AnnotatedString, Object> getAnnotatedStringSaver() {
        return AnnotatedStringSaver;
    }

    private static /* synthetic */ void getAnnotationRangeSaver$annotations() {
    }

    public static final Saver<ParagraphStyle, Object> getParagraphStyleSaver() {
        return ParagraphStyleSaver;
    }

    public static final Saver<TextDecoration, Object> getSaver(TextDecoration.Companion companion) {
        return TextDecorationSaver;
    }

    public static final Saver<SpanStyle, Object> getSpanStyleSaver() {
        return SpanStyleSaver;
    }

    public static final Saver<TextLinkStyles, Object> getTextLinkStylesSaver() {
        return TextLinkStylesSaver;
    }

    private static /* synthetic */ void getUrlAnnotationSaver$annotations() {
    }

    public static final /* synthetic */ <T extends Saver<Original, Saveable>, Original, Saveable, Result> Result restore(Saveable saveable, T t10) {
        if ((AbstractC9979u.m20289b(saveable, Boolean.FALSE) && !(t10 instanceof NonNullValueClassSaver)) || saveable == null) {
            return null;
        }
        Result result = (Result) t10.restore(saveable);
        AbstractC9979u.m20300m(1, "Result");
        return result;
    }

    public static final <T> T save(T t10) {
        return t10;
    }

    public static final Saver<TextGeometricTransform, Object> getSaver(TextGeometricTransform.Companion companion) {
        return TextGeometricTransformSaver;
    }

    public static final <T extends Saver<Original, Saveable>, Original, Saveable> Object save(Original original, T t10, SaverScope saverScope) {
        Object objSave;
        return (original == null || (objSave = t10.save(saverScope, original)) == null) ? Boolean.FALSE : objSave;
    }

    public static final Saver<TextIndent, Object> getSaver(TextIndent.Companion companion) {
        return TextIndentSaver;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <Result> Result restore(Object obj) {
        if (obj == 0) {
            return null;
        }
        AbstractC9979u.m20300m(1, "Result");
        return obj;
    }

    public static final Saver<FontWeight, Object> getSaver(FontWeight.Companion companion) {
        return FontWeightSaver;
    }

    public static final Saver<BaselineShift, Object> getSaver(BaselineShift.Companion companion) {
        return BaselineShiftSaver;
    }

    public static final Saver<TextRange, Object> getSaver(TextRange.Companion companion) {
        return TextRangeSaver;
    }

    public static final Saver<Shadow, Object> getSaver(Shadow.Companion companion) {
        return ShadowSaver;
    }

    public static final Saver<Color, Object> getSaver(Color.Companion companion) {
        return ColorSaver;
    }

    public static final Saver<TextUnit, Object> getSaver(TextUnit.Companion companion) {
        return TextUnitSaver;
    }

    public static final Saver<Offset, Object> getSaver(Offset.Companion companion) {
        return OffsetSaver;
    }

    public static final Saver<LocaleList, Object> getSaver(LocaleList.Companion companion) {
        return LocaleListSaver;
    }

    public static final Saver<Locale, Object> getSaver(Locale.Companion companion) {
        return LocaleSaver;
    }

    public static final Saver<LineHeightStyle, Object> getSaver(LineHeightStyle.Companion companion) {
        return LineHeightStyleSaver;
    }
}
