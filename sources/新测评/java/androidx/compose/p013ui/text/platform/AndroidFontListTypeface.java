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
import kotlin.Deprecated;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\b\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m13558d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "context", "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Companion", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@Deprecated(message = "This is not supported after downloadable fonts.")
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,174:1\n230#2,3:175\n34#2,6:178\n233#2:184\n150#2,3:185\n34#2,6:188\n153#2:194\n482#2,4:195\n34#2,4:199\n486#2,3:203\n39#2:206\n489#2:207\n34#2,6:216\n77#3,8:208\n94#3,10:222\n94#3,10:232\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,6\n66#1:184\n69#1:185,3\n69#1:188,6\n69#1:194\n73#1:195,4\n73#1:199,4\n73#1:203,3\n73#1:206\n73#1:207\n78#1:216,6\n75#1:208,8\n100#1:222,10\n103#1:232,10\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;

    /* renamed from: fontMatcher$1, reason: from kotlin metadata */
    private final FontMatcher fontMatcher;
    private final Map<Font, Typeface> loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    @Metadata(m13557d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
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
            r7.fontMatcher = r11
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
            int r5 = r5.getLoadingStrategy()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p013ui.text.font.FontLoadingStrategy.INSTANCE
            int r6 = r6.m23130getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p013ui.text.font.FontLoadingStrategy.m23125equalsimpl0(r5, r6)
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
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p013ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p013ui.text.font.FontStyle) r4
            int r4 = r4.m23141unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher
            java.util.List r4 = r6.m23134matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
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
        return this.fontMatcher;
    }

    @Override // androidx.compose.p013ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo23278getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Font font = (Font) CollectionsKt.firstOrNull((List) this.fontMatcher.m23134matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (font == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
            throw new KotlinNothingValueException();
        }
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
            throw new KotlinNothingValueException();
        }
        Object objM23159synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m23159synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
        Intrinsics.checkNotNull(objM23159synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM23159synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
