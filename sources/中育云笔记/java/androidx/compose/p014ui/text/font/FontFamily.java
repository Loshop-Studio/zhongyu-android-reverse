package androidx.compose.p014ui.text.font;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.State;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import vc.InterfaceC11588c;

@Immutable
/* loaded from: classes2.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        private Companion() {
        }
    }

    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ State m33049resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i10, int i11, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i12 & 1) != 0) {
                fontFamily = null;
            }
            if ((i12 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i12 & 4) != 0) {
                i10 = FontStyle.Companion.m33084getNormal_LCdwA();
            }
            if ((i12 & 8) != 0) {
                i11 = FontSynthesis.Companion.m33094getAllGVVA2EU();
            }
            return resolver.mo33050resolveDPcqOEQ(fontFamily, fontWeight, i10, i11);
        }

        Object preload(FontFamily fontFamily, InterfaceC11588c<? super C10786q> interfaceC11588c);

        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo33050resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i10, int i11);
    }

    public /* synthetic */ FontFamily(boolean z10, AbstractC9972n abstractC9972n) {
        this(z10);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    @InterfaceC10770a
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    private FontFamily(boolean z10) {
        this.canLoadSynchronously = z10;
    }
}
