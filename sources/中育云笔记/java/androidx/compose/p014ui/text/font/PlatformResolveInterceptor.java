package androidx.compose.p014ui.text.font;

/* loaded from: classes2.dex */
public interface PlatformResolveInterceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final PlatformResolveInterceptor Default = new PlatformResolveInterceptor() { // from class: androidx.compose.ui.text.font.PlatformResolveInterceptor$Companion$Default$1
        };

        private Companion() {
        }

        public final PlatformResolveInterceptor getDefault$ui_text_release() {
            return Default;
        }
    }

    default FontFamily interceptFontFamily(FontFamily fontFamily) {
        return fontFamily;
    }

    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    default int m33102interceptFontStyleT2F_aPo(int i10) {
        return i10;
    }

    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    default int m33103interceptFontSynthesisMscr08Y(int i10) {
        return i10;
    }

    default FontWeight interceptFontWeight(FontWeight fontWeight) {
        return fontWeight;
    }
}
