package androidx.compose.p006ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.p006ui.text.font.Font;
import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.p006ui.text.font.FontListFontFamily;
import androidx.compose.p006ui.text.font.FontMatcher;
import androidx.compose.p006ui.text.font.FontSynthesis_androidKt;
import androidx.compose.p006ui.text.font.FontWeight;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3380c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Deprecated(message = "This is not supported after downloadable fonts.")
@Metadata(m5174d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB@\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ-\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\b\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, m5175d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", C3380c.f1965R, "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Companion", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,174:1\n35#2,3:175\n38#2,2:182\n40#2:185\n56#2,4:197\n60#2,3:205\n63#2:209\n33#3,4:178\n38#3:184\n151#3,3:186\n33#3,4:189\n154#3,2:193\n38#3:195\n156#3:196\n33#3,4:201\n38#3:208\n33#3,6:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n67#1:175,3\n67#1:182,2\n67#1:185\n72#1:197,4\n72#1:205,3\n72#1:209\n67#1:178,4\n67#1:184\n70#1:186,3\n70#1:189,4\n70#1:193,2\n70#1:195\n70#1:196\n72#1:201,4\n72#1:208\n80#1:210,6\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    private static final FontMatcher fontMatcher = new FontMatcher();
    private final FontFamily fontFamily;

    /* renamed from: fontMatcher$1, reason: from kotlin metadata */
    private final FontMatcher fontMatcher;
    private final Map<Font, Typeface> loadedTypefaces;

    @Metadata(m5174d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5175d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AndroidFontListTypeface(androidx.compose.p006ui.text.font.FontListFontFamily r8, android.content.Context r9, java.util.List<kotlin.Pair<androidx.compose.p006ui.text.font.FontWeight, androidx.compose.p006ui.text.font.FontStyle>> r10, androidx.compose.p006ui.text.font.FontMatcher r11) {
        /*
            r7 = this;
            java.lang.String r0 = "fontFamily"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "fontMatcher"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r7.<init>()
            r7.fontMatcher = r11
            java.util.List r11 = r8.getFonts()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.size()
            r0.<init>(r1)
            int r1 = r11.size()
            r2 = 0
            r3 = r2
        L27:
            if (r3 >= r1) goto L46
            java.lang.Object r4 = r11.get(r3)
            r5 = r4
            androidx.compose.ui.text.font.Font r5 = (androidx.compose.p006ui.text.font.Font) r5
            int r5 = r5.getLoadingStrategy()
            androidx.compose.ui.text.font.FontLoadingStrategy$Companion r6 = androidx.compose.p006ui.text.font.FontLoadingStrategy.INSTANCE
            int r6 = r6.m11154getBlockingPKNRLFQ()
            boolean r5 = androidx.compose.p006ui.text.font.FontLoadingStrategy.m11149equalsimpl0(r5, r6)
            if (r5 == 0) goto L43
            r0.add(r4)
        L43:
            int r3 = r3 + 1
            goto L27
        L46:
            if (r10 == 0) goto Lb2
            java.util.ArrayList r11 = new java.util.ArrayList
            int r1 = r10.size()
            r11.<init>(r1)
            int r1 = r10.size()
            r3 = r2
        L56:
            if (r3 >= r1) goto L80
            java.lang.Object r4 = r10.get(r3)
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            androidx.compose.ui.text.font.FontWeight r5 = (androidx.compose.p006ui.text.font.FontWeight) r5
            java.lang.Object r4 = r4.component2()
            androidx.compose.ui.text.font.FontStyle r4 = (androidx.compose.p006ui.text.font.FontStyle) r4
            int r4 = r4.m11165unboximpl()
            androidx.compose.ui.text.font.FontMatcher r6 = r7.fontMatcher
            java.util.List r4 = r6.m11158matchFontRetOiIg(r0, r5, r4)
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            androidx.compose.ui.text.font.Font r4 = (androidx.compose.p006ui.text.font.Font) r4
            r11.add(r4)
            int r3 = r3 + 1
            goto L56
        L80:
            java.util.List r10 = androidx.compose.p006ui.text.TempListUtilsKt.fastFilterNotNull(r11)
            if (r10 == 0) goto Lb2
            java.util.HashSet r11 = new java.util.HashSet
            int r1 = r10.size()
            r11.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = r10.size()
            r1.<init>(r3)
            int r3 = r10.size()
            r4 = r2
        L9d:
            if (r4 >= r3) goto Lb3
            java.lang.Object r5 = r10.get(r4)
            r6 = r5
            androidx.compose.ui.text.font.Font r6 = (androidx.compose.p006ui.text.font.Font) r6
            boolean r6 = r11.add(r6)
            if (r6 == 0) goto Laf
            r1.add(r5)
        Laf:
            int r4 = r4 + 1
            goto L9d
        Lb2:
            r1 = 0
        Lb3:
            if (r1 != 0) goto Lb6
            goto Lb7
        Lb6:
            r0 = r1
        Lb7:
            boolean r10 = r0.isEmpty()
            if (r10 != 0) goto Lf6
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            int r11 = r0.size()
        Lc6:
            if (r2 >= r11) goto Lf1
            java.lang.Object r1 = r0.get(r2)
            androidx.compose.ui.text.font.Font r1 = (androidx.compose.p006ui.text.font.Font) r1
            androidx.compose.ui.text.platform.AndroidTypefaceCache r3 = androidx.compose.p006ui.text.platform.AndroidTypefaceCache.INSTANCE     // Catch: java.lang.Exception -> Lda
            android.graphics.Typeface r3 = r3.getOrCreate(r9, r1)     // Catch: java.lang.Exception -> Lda
            r10.put(r1, r3)     // Catch: java.lang.Exception -> Lda
            int r2 = r2 + 1
            goto Lc6
        Lda:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Cannot create Typeface from "
            r9.append(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lf1:
            r7.loadedTypefaces = r10
            r7.fontFamily = r8
            return
        Lf6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Could not match font"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p006ui.text.platform.AndroidFontListTypeface.<init>(androidx.compose.ui.text.font.FontListFontFamily, android.content.Context, java.util.List, androidx.compose.ui.text.font.FontMatcher):void");
    }

    @Override // androidx.compose.p006ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @Override // androidx.compose.p006ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo11286getNativeTypefacePYhJU0U(FontWeight fontWeight, int fontStyle, int synthesis) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        Font font = (Font) CollectionsKt___CollectionsKt.firstOrNull((List) this.fontMatcher.m11158matchFontRetOiIg(new ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (font == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        Object objM11181synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m11181synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
        Intrinsics.checkNotNull(objM11181synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) objM11181synthesizeTypefaceFxwP2eA;
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
