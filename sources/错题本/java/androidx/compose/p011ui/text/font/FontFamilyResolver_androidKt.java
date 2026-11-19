package androidx.compose.p011ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.RestrictTo;
import androidx.compose.p011ui.text.InternalTextApi;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.runtime.State;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p075h6.InterfaceC5636h;

@Metadata(m5109d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0003\u0010\u0007\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0004\u001aD\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, m5110d2 = {"Landroid/content/Context;", "context", "Landroidx/compose/ui/text/font/FontFamily$Resolver;", "createFontFamilyResolver", "(Landroid/content/Context;)Landroidx/compose/ui/text/font/FontFamily$Resolver;", "Lh6/h;", "coroutineContext", "(Landroid/content/Context;Lh6/h;)Landroidx/compose/ui/text/font/FontFamily$Resolver;", "emptyCacheFontFamilyResolver", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "Landroid/graphics/Typeface;", "resolveAsTypeface-Wqqsr6A", "(Landroidx/compose/ui/text/font/FontFamily$Resolver;Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolveAsTypeface", "ui-text_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes2.dex */
public final class FontFamilyResolver_androidKt {
    @NotNull
    public static final FontFamily.Resolver createFontFamilyResolver(@NotNull Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), null, null, null, 28, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @InternalTextApi
    @NotNull
    public static final FontFamily.Resolver emptyCacheFontFamilyResolver(@NotNull Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), null, new TypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(new AsyncTypefaceCache(), null, 2, null), null, 18, null);
    }

    @NotNull
    /* renamed from: resolveAsTypeface-Wqqsr6A, reason: not valid java name */
    public static final State<Typeface> m12855resolveAsTypefaceWqqsr6A(@NotNull FontFamily.Resolver resolver, @Nullable FontFamily fontFamily, @NotNull FontWeight fontWeight, int i, int i8) {
        State stateMo12854resolveDPcqOEQ = resolver.mo12854resolveDPcqOEQ(fontFamily, fontWeight, i, i8);
        AbstractC5830k.m5328e(stateMo12854resolveDPcqOEQ, "null cannot be cast to non-null type androidx.compose.runtime.State<android.graphics.Typeface>");
        return stateMo12854resolveDPcqOEQ;
    }

    /* renamed from: resolveAsTypeface-Wqqsr6A$default, reason: not valid java name */
    public static /* synthetic */ State m12856resolveAsTypefaceWqqsr6A$default(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            fontFamily = null;
        }
        if ((i9 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i9 & 4) != 0) {
            i = FontStyle.INSTANCE.m12888getNormal_LCdwA();
        }
        if ((i9 & 8) != 0) {
            i8 = FontSynthesis.INSTANCE.m12898getAllGVVA2EU();
        }
        return m12855resolveAsTypefaceWqqsr6A(resolver, fontFamily, fontWeight, i, i8);
    }

    @NotNull
    public static final FontFamily.Resolver createFontFamilyResolver(@NotNull Context context, @NotNull InterfaceC5636h interfaceC5636h) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), AndroidFontResolveInterceptor_androidKt.AndroidFontResolveInterceptor(context), FontFamilyResolverKt.getGlobalTypefaceRequestCache(), new FontListFontFamilyTypefaceAdapter(FontFamilyResolverKt.getGlobalAsyncTypefaceCache(), interfaceC5636h), null, 16, null);
    }
}
