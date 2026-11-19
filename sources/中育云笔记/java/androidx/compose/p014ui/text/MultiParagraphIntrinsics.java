package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.style.TextDirection;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC9923a;
import kotlin.LazyThreadSafetyMode;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import p309qc.InterfaceC10773d;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MultiParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final AnnotatedString annotatedString;
    private final List<ParagraphIntrinsicInfo> infoList;
    private final InterfaceC10773d maxIntrinsicWidth$delegate;
    private final InterfaceC10773d minIntrinsicWidth$delegate;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;

    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, FontFamily.Resolver resolver) {
        this.annotatedString = annotatedString;
        this.placeholders = list;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f23258e;
        this.minIntrinsicWidth$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$minIntrinsicWidth$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float minIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMinIntrinsicWidth();
                    int iM24138p = AbstractC10978w.m24138p(infoList$ui_text_release);
                    int i10 = 1;
                    if (1 <= iM24138p) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i10);
                            float minIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMinIntrinsicWidth();
                            if (Float.compare(minIntrinsicWidth, minIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                minIntrinsicWidth = minIntrinsicWidth2;
                            }
                            if (i10 == iM24138p) {
                                break;
                            }
                            i10++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMinIntrinsicWidth());
            }
        });
        this.maxIntrinsicWidth$delegate = AbstractC9923a.m20069b(lazyThreadSafetyMode, new InterfaceC9529a() { // from class: androidx.compose.ui.text.MultiParagraphIntrinsics$maxIntrinsicWidth$2
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public final Float invoke() {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo;
                ParagraphIntrinsics intrinsics;
                List<ParagraphIntrinsicInfo> infoList$ui_text_release = this.this$0.getInfoList$ui_text_release();
                if (infoList$ui_text_release.isEmpty()) {
                    paragraphIntrinsicInfo = null;
                } else {
                    ParagraphIntrinsicInfo paragraphIntrinsicInfo2 = infoList$ui_text_release.get(0);
                    float maxIntrinsicWidth = paragraphIntrinsicInfo2.getIntrinsics().getMaxIntrinsicWidth();
                    int iM24138p = AbstractC10978w.m24138p(infoList$ui_text_release);
                    int i10 = 1;
                    if (1 <= iM24138p) {
                        while (true) {
                            ParagraphIntrinsicInfo paragraphIntrinsicInfo3 = infoList$ui_text_release.get(i10);
                            float maxIntrinsicWidth2 = paragraphIntrinsicInfo3.getIntrinsics().getMaxIntrinsicWidth();
                            if (Float.compare(maxIntrinsicWidth, maxIntrinsicWidth2) < 0) {
                                paragraphIntrinsicInfo2 = paragraphIntrinsicInfo3;
                                maxIntrinsicWidth = maxIntrinsicWidth2;
                            }
                            if (i10 == iM24138p) {
                                break;
                            }
                            i10++;
                        }
                    }
                    paragraphIntrinsicInfo = paragraphIntrinsicInfo2;
                }
                ParagraphIntrinsicInfo paragraphIntrinsicInfo4 = paragraphIntrinsicInfo;
                return Float.valueOf((paragraphIntrinsicInfo4 == null || (intrinsics = paragraphIntrinsicInfo4.getIntrinsics()) == null) ? 0.0f : intrinsics.getMaxIntrinsicWidth());
            }
        });
        ParagraphStyle paragraphStyle = textStyle.toParagraphStyle();
        List<AnnotatedString.Range<ParagraphStyle>> listNormalizedParagraphStyles = AnnotatedStringKt.normalizedParagraphStyles(annotatedString, paragraphStyle);
        ArrayList arrayList = new ArrayList(listNormalizedParagraphStyles.size());
        int size = listNormalizedParagraphStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<ParagraphStyle> range = listNormalizedParagraphStyles.get(i10);
            AnnotatedString annotatedStringSubstringWithoutParagraphStyles = AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd());
            ParagraphStyle paragraphStyleResolveTextDirection = resolveTextDirection(range.getItem(), paragraphStyle);
            String text = annotatedStringSubstringWithoutParagraphStyles.getText();
            TextStyle textStyleMerge = textStyle.merge(paragraphStyleResolveTextDirection);
            List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations$ui_text_release = annotatedStringSubstringWithoutParagraphStyles.getAnnotations$ui_text_release();
            if (annotations$ui_text_release == null) {
                annotations$ui_text_release = AbstractC10978w.m24136n();
            }
            arrayList.add(new ParagraphIntrinsicInfo(ParagraphIntrinsicsKt.ParagraphIntrinsics(text, textStyleMerge, annotations$ui_text_release, density, resolver, (List<AnnotatedString.Range<Placeholder>>) MultiParagraphIntrinsicsKt.getLocalPlaceholders(getPlaceholders(), range.getStart(), range.getEnd())), range.getStart(), range.getEnd()));
        }
        this.infoList = arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphStyle resolveTextDirection(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2) {
        return !TextDirection.m33395equalsimpl0(paragraphStyle.m32863getTextDirections_7Xco(), TextDirection.Companion.m33404getUnspecifieds_7Xco()) ? paragraphStyle : ParagraphStyle.m32845copyykzQM6k$default(paragraphStyle, 0, paragraphStyle2.m32863getTextDirections_7Xco(), 0L, null, null, null, 0, 0, null, 509, null);
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        List<ParagraphIntrinsicInfo> list = this.infoList;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10).getIntrinsics().getHasStaleResolvedFonts()) {
                return true;
            }
        }
        return false;
    }

    public final List<ParagraphIntrinsicInfo> getInfoList$ui_text_release() {
        return this.infoList;
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return ((Number) this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return ((Number) this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    @InterfaceC10770a
    public MultiParagraphIntrinsics(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, Density density, Font.ResourceLoader resourceLoader) {
        this(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }
}
