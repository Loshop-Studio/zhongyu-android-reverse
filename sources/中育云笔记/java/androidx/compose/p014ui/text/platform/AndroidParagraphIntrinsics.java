package androidx.compose.p014ui.text.platform;

import android.graphics.Typeface;
import androidx.compose.p014ui.text.AnnotatedString;
import androidx.compose.p014ui.text.ParagraphIntrinsics;
import androidx.compose.p014ui.text.Placeholder;
import androidx.compose.p014ui.text.SpanStyle;
import androidx.compose.p014ui.text.TextStyle;
import androidx.compose.p014ui.text.android.LayoutIntrinsics;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontStyle;
import androidx.compose.p014ui.text.font.FontSynthesis;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.font.TypefaceResult;
import androidx.compose.p014ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.p014ui.unit.Density;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9546r;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class AndroidParagraphIntrinsics implements ParagraphIntrinsics {
    public static final int $stable = 8;
    private final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> annotations;
    private final CharSequence charSequence;
    private final Density density;
    private final boolean emojiCompatProcessed;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutIntrinsics layoutIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private TypefaceDirtyTrackerLinkedList resolvedTypefaces;
    private final TextStyle style;
    private final String text;
    private final int textDirectionHeuristic;
    private final AndroidTextPaint textPaint;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<? extends androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>, java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List<androidx.compose.ui.text.AnnotatedString$Range<? extends androidx.compose.ui.text.AnnotatedString$Annotation>>] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.ArrayList] */
    public AndroidParagraphIntrinsics(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>> list, List<AnnotatedString.Range<Placeholder>> list2, FontFamily.Resolver resolver, Density density) {
        Object obj;
        List arrayList;
        this.text = str;
        this.style = textStyle;
        this.annotations = list;
        this.placeholders = list2;
        this.fontFamilyResolver = resolver;
        this.density = density;
        AndroidTextPaint androidTextPaint = new AndroidTextPaint(1, density.getDensity());
        this.textPaint = androidTextPaint;
        this.emojiCompatProcessed = !AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(textStyle) ? false : EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
        this.textDirectionHeuristic = AndroidParagraphIntrinsics_androidKt.m33223resolveTextDirectionHeuristicsHklW4sA(textStyle.m33009getTextDirections_7Xco(), textStyle.getLocaleList());
        InterfaceC9546r interfaceC9546r = new InterfaceC9546r() { // from class: androidx.compose.ui.text.platform.AndroidParagraphIntrinsics$resolveTypeface$1
            {
                super(4);
            }

            @Override // p181hd.InterfaceC9546r
            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                return m33222invokeDPcqOEQ((FontFamily) obj2, (FontWeight) obj3, ((FontStyle) obj4).m33080unboximpl(), ((FontSynthesis) obj5).m33093unboximpl());
            }

            /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
            public final Typeface m33222invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11) {
                State<Object> stateMo33050resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo33050resolveDPcqOEQ(fontFamily, fontWeight, i10, i11);
                if (stateMo33050resolveDPcqOEQ instanceof TypefaceResult.Immutable) {
                    Object value = stateMo33050resolveDPcqOEQ.getValue();
                    AbstractC9979u.m20292e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                    return (Typeface) value;
                }
                TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = new TypefaceDirtyTrackerLinkedList(stateMo33050resolveDPcqOEQ, this.this$0.resolvedTypefaces);
                this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList;
                return typefaceDirtyTrackerLinkedList.getTypeface();
            }
        };
        TextPaintExtensions_androidKt.setTextMotion(androidTextPaint, textStyle.getTextMotion());
        SpanStyle spanStyle = textStyle.toSpanStyle();
        int size = ((Collection) list).size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i10);
            if (((AnnotatedString.Range) obj).getItem() instanceof SpanStyle) {
                break;
            } else {
                i10++;
            }
        }
        SpanStyle spanStyleApplySpanStyle = TextPaintExtensions_androidKt.applySpanStyle(androidTextPaint, spanStyle, interfaceC9546r, density, obj != null);
        if (spanStyleApplySpanStyle != null) {
            int size2 = this.annotations.size() + 1;
            arrayList = new ArrayList(size2);
            int i11 = 0;
            while (i11 < size2) {
                arrayList.add(i11 == 0 ? new AnnotatedString.Range<>(spanStyleApplySpanStyle, 0, this.text.length()) : this.annotations.get(i11 - 1));
                i11++;
            }
        } else {
            arrayList = this.annotations;
        }
        CharSequence charSequenceCreateCharSequence = AndroidParagraphHelper_androidKt.createCharSequence(this.text, this.textPaint.getTextSize(), this.style, arrayList, this.placeholders, this.density, interfaceC9546r, this.emojiCompatProcessed);
        this.charSequence = charSequenceCreateCharSequence;
        this.layoutIntrinsics = new LayoutIntrinsics(charSequenceCreateCharSequence, this.textPaint, this.textDirectionHeuristic);
    }

    public final List<AnnotatedString.Range<? extends AnnotatedString.Annotation>> getAnnotations() {
        return this.annotations;
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public boolean getHasStaleResolvedFonts() {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList = this.resolvedTypefaces;
        if (typefaceDirtyTrackerLinkedList != null ? typefaceDirtyTrackerLinkedList.isStaleResolvedFont() : false) {
            return true;
        }
        return !this.emojiCompatProcessed && AndroidParagraphIntrinsics_androidKt.getHasEmojiCompat(this.style) && EmojiCompatStatus.INSTANCE.getFontLoaded().getValue().booleanValue();
    }

    public final LayoutIntrinsics getLayoutIntrinsics$ui_text_release() {
        return this.layoutIntrinsics;
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    @Override // androidx.compose.p014ui.text.ParagraphIntrinsics
    public float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextDirectionHeuristic$ui_text_release() {
        return this.textDirectionHeuristic;
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.textPaint;
    }
}
