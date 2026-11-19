package androidx.compose.p013ui.text.platform;

import androidx.compose.p013ui.text.AndroidParagraph;
import androidx.compose.p013ui.text.AnnotatedString;
import androidx.compose.p013ui.text.Paragraph;
import androidx.compose.p013ui.text.ParagraphIntrinsics;
import androidx.compose.p013ui.text.ParagraphKt;
import androidx.compose.p013ui.text.Placeholder;
import androidx.compose.p013ui.text.TextStyle;
import androidx.compose.p013ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.style.TextOverflow;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.p013ui.unit.Density;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

/* loaded from: classes2.dex */
public final class AndroidParagraph_androidKt {
    @InterfaceC8721a
    public static final Paragraph ActualParagraph(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, boolean z10, float f10, Density density, Font.ResourceLoader resourceLoader) {
        AndroidParagraphIntrinsics androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, textStyle, list, list2, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), density);
        TextOverflow.Companion companion = TextOverflow.Companion;
        return new AndroidParagraph(androidParagraphIntrinsics, i10, z10 ? companion.m26835getEllipsisgIe3tQ8() : companion.m26834getClipgIe3tQ8(), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f10), 0, 0, 13, null), null);
    }

    /* renamed from: ActualParagraph-4FmOz70, reason: not valid java name */
    public static final Paragraph m26623ActualParagraph4FmOz70(ParagraphIntrinsics paragraphIntrinsics, int i10, int i11, long j10) {
        AbstractC9133u.m16131e(paragraphIntrinsics, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsics, i10, i11, j10, null);
    }

    /* renamed from: ActualParagraph-XGqx6AY, reason: not valid java name */
    public static final Paragraph m26624ActualParagraphXGqx6AY(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, int i11, long j10, Density density, FontFamily.Resolver resolver) {
        return new AndroidParagraph(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i10, i11, j10, null);
    }
}
