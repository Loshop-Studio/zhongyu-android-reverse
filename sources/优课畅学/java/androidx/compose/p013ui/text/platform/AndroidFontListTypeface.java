package androidx.compose.p013ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p013ui.text.font.Font;
import androidx.compose.p013ui.text.font.FontFamily;
import androidx.compose.p013ui.text.font.FontListFontFamily;
import androidx.compose.p013ui.text.font.FontMatcher;
import androidx.compose.p013ui.text.font.FontSynthesis_androidKt;
import androidx.compose.p013ui.text.font.FontWeight;
import androidx.compose.p013ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;

@StabilityInferred(parameters = 0)
@InterfaceC8721a
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final Map<Font, Typeface> loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidFontListTypeface(androidx.compose.p013ui.text.font.FontListFontFamily r8, android.content.Context r9, java.util.List<kotlin.Pair<androidx.compose.p013ui.text.font.FontWeight, androidx.compose.p013ui.text.font.FontStyle>> r10, androidx.compose.p013ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L18:
            if (r3 >= r1) goto L37
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.p013ui.text.font.Font) r5
            int r5 = r5.mo26420getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p013ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m26467getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p013ui.text.font.FontLoadingStrategy.m26462equalsimpl0(r5, r6)
            if (r5 == 0) goto L34
            r0.add(r4)
        L34:
            int r3 = r3 + 1
            goto L18
        L37:
            if (r10 == 0) goto La3
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L47:
            if (r3 >= r1) goto L71
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.m15903a()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p013ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.m15904b()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p013ui.text.font.FontStyle) r4
            int r4 = r4.m26478unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m26471matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = p134i7.AbstractC8778f0.m14568n0(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p013ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L47
        L71:
            java.util.List r10 = androidx.compose.p013ui.util.ListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto La3
            androidx.collection.MutableScatterSet r11 = new androidx.collection.MutableScatterSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L8e:
            if (r4 >= r3) goto La4
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p013ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La0
            r1.add(r5)
        La0:
            int r4 = r4 + 1
            goto L8e
        La3:
            r1 = 0
        La4:
            if (r1 != 0) goto La7
            goto La8
        La7:
            r0 = r1
        La8:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto Lb3
            java.lang.String r10 = "Could not match font"
            androidx.compose.p013ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r10)
        Lb3:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lbc:
            if (r2 >= r11) goto Le5
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.p013ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.p013ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Lce
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Lce
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lce
            goto Le2
        Lce:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot create Typeface from "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            androidx.compose.p013ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        Le2:
            int r2 = r2 + 1
            goto Lbc
        Le5:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p013ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.p013ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.p013ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo26615getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        Font font = (Font) AbstractC8778f0.m14568n0(this.fontMatcher$1.m26471matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i10));
        if (font == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        Object objM26496synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m26496synthesizeTypefaceFxwP2eA(i11, typeface, font, fontWeight, i10);
        AbstractC9133u.m16131e(objM26496synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM26496synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i10, AbstractC9126n abstractC9126n) {
        this(fontListFontFamily, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
