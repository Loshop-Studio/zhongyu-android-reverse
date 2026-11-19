package androidx.compose.p014ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontListFontFamily;
import androidx.compose.p014ui.text.font.FontMatcher;
import androidx.compose.p014ui.text.font.FontSynthesis_androidKt;
import androidx.compose.p014ui.text.font.FontWeight;
import androidx.compose.p014ui.text.internal.InlineClassHelperKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
@InterfaceC10770a
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final Map<Font, Typeface> loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidFontListTypeface(androidx.compose.p014ui.text.font.FontListFontFamily r8, android.content.Context r9, java.util.List<kotlin.Pair<androidx.compose.p014ui.text.font.FontWeight, androidx.compose.p014ui.text.font.FontStyle>> r10, androidx.compose.p014ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            r7.<init>()
            r7.fontMatcher$1 = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r1) goto L3a
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.p014ui.text.font.Font) r5
            int r5 = r5.mo33022getLoadingStrategyPKNRLFQ()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p014ui.text.font.FontLoadingStrategy.Companion
            int r6 = r6.m33069getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p014ui.text.font.FontLoadingStrategy.m33064equalsimpl0(r5, r6)
            if (r5 == 0) goto L37
            r0.add(r4)
        L37:
            int r3 = r3 + 1
            goto L1b
        L3a:
            if (r10 == 0) goto Lac
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            int r1 = r1.size()
            r3 = r2
        L4d:
            if (r3 >= r1) goto L77
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.m20048a()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p014ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.m20049c()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p014ui.text.font.FontStyle) r4
            int r4 = r4.m33080unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher$1
            java.util.List r4 = r6.m33073matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = p325rc.AbstractC10947g0.m23946o0(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p014ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L4d
        L77:
            java.util.List r10 = androidx.compose.p014ui.util.ListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto Lac
            androidx.collection.MutableScatterSet r11 = new androidx.collection.MutableScatterSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            r3 = r10
            java.util.Collection r3 = (java.util.Collection) r3
            int r3 = r3.size()
            r4 = r2
        L97:
            if (r4 >= r3) goto Lad
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p014ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto La9
            r1.add(r5)
        La9:
            int r4 = r4 + 1
            goto L97
        Lac:
            r1 = 0
        Lad:
            if (r1 != 0) goto Lb0
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto Lbc
            java.lang.String r10 = "Could not match font"
            androidx.compose.p014ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r10)
        Lbc:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lc5:
            if (r2 >= r11) goto Lee
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.p014ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.p014ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Ld7
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Ld7
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Ld7
            goto Leb
        Ld7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cannot create Typeface from "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            androidx.compose.p014ui.text.internal.InlineClassHelperKt.throwIllegalStateException(r1)
        Leb:
            int r2 = r2 + 1
            goto Lc5
        Lee:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p014ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.p014ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.p014ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo33217getNativeTypefacePYhJU0U(FontWeight fontWeight, int i10, int i11) {
        Font font = (Font) AbstractC10947g0.m23946o0(this.fontMatcher$1.m33073matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, i10));
        if (font == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        Object objM33098synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m33098synthesizeTypefaceFxwP2eA(i11, typeface, font, fontWeight, i10);
        AbstractC9979u.m20292e(objM33098synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM33098synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i10, AbstractC9972n abstractC9972n) {
        this(fontListFontFamily, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
