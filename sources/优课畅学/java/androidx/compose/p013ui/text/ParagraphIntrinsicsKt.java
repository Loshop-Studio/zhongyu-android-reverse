package androidx.compose.p013ui.text;

import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.p013ui.unit.Density;
import java.util.List;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8809v;

/* loaded from: classes2.dex */
public final class ParagraphIntrinsicsKt {
    @InterfaceC8721a
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, Font.ResourceLoader resourceLoader) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader));
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, Font.ResourceLoader resourceLoader, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = AbstractC8809v.m14771n();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resourceLoader);
    }

    @InterfaceC8721a
    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, Density density, FontFamily.Resolver resolver) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static final ParagraphIntrinsics ParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list2) {
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(str, textStyle, list, list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, List list2, Density density, FontFamily.Resolver resolver, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            list = AbstractC8809v.m14771n();
        }
        List list3 = list;
        if ((i10 & 8) != 0) {
            list2 = AbstractC8809v.m14771n();
        }
        return ParagraphIntrinsics(str, textStyle, (List<AnnotatedString.Range<SpanStyle>>) list3, (List<AnnotatedString.Range<Placeholder>>) list2, density, resolver);
    }

    public static /* synthetic */ ParagraphIntrinsics ParagraphIntrinsics$default(String str, TextStyle textStyle, List list, Density density, FontFamily.Resolver resolver, List list2, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            list2 = AbstractC8809v.m14771n();
        }
        return ParagraphIntrinsics(str, textStyle, (List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>) list, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list2);
    }
}
