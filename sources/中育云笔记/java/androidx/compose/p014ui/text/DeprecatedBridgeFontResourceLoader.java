package androidx.compose.p014ui.text;

import androidx.compose.p014ui.text.font.Font;
import androidx.compose.p014ui.text.font.FontFamily;
import androidx.compose.p014ui.text.font.FontKt;
import androidx.compose.p014ui.text.platform.SynchronizedObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

/* loaded from: classes2.dex */
final class DeprecatedBridgeFontResourceLoader implements Font.ResourceLoader {
    public static final Companion Companion = new Companion(null);
    private static Map<FontFamily.Resolver, Font.ResourceLoader> cache = new LinkedHashMap();
    private static final SynchronizedObject lock = new SynchronizedObject();
    private final FontFamily.Resolver fontFamilyResolver;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final Font.ResourceLoader from(FontFamily.Resolver resolver) {
            synchronized (getLock()) {
                Companion companion = DeprecatedBridgeFontResourceLoader.Companion;
                Font.ResourceLoader resourceLoader = companion.getCache().get(resolver);
                if (resourceLoader != null) {
                    return resourceLoader;
                }
                DeprecatedBridgeFontResourceLoader deprecatedBridgeFontResourceLoader = new DeprecatedBridgeFontResourceLoader(resolver, null);
                companion.getCache().put(resolver, deprecatedBridgeFontResourceLoader);
                return deprecatedBridgeFontResourceLoader;
            }
        }

        public final Map<FontFamily.Resolver, Font.ResourceLoader> getCache() {
            return DeprecatedBridgeFontResourceLoader.cache;
        }

        public final SynchronizedObject getLock() {
            return DeprecatedBridgeFontResourceLoader.lock;
        }

        public final void setCache(Map<FontFamily.Resolver, Font.ResourceLoader> map) {
            DeprecatedBridgeFontResourceLoader.cache = map;
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver, AbstractC9972n abstractC9972n) {
        this(resolver);
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    @InterfaceC10770a
    public Object load(Font font) {
        return FontFamily.Resolver.m33049resolveDPcqOEQ$default(this.fontFamilyResolver, FontKt.toFontFamily(font), font.getWeight(), font.mo33030getStyle_LCdwA(), 0, 8, null).getValue();
    }

    private DeprecatedBridgeFontResourceLoader(FontFamily.Resolver resolver) {
        this.fontFamilyResolver = resolver;
    }
}
