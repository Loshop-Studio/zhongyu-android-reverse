package androidx.compose.p006ui.text.font;

import androidx.compose.p006ui.text.font.FontFamily;
import androidx.compose.runtime.State;

/* renamed from: androidx.compose.ui.text.font.b */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1669b {
    /* renamed from: a */
    public static /* synthetic */ State m881a(FontFamily.Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i4, int i5, int i6, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
        }
        if ((i6 & 1) != 0) {
            fontFamily = null;
        }
        if ((i6 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i6 & 4) != 0) {
            i4 = FontStyle.INSTANCE.m11167getNormal_LCdwA();
        }
        if ((i6 & 8) != 0) {
            i5 = FontSynthesis.INSTANCE.m11177getAllGVVA2EU();
        }
        return resolver.mo11137resolveDPcqOEQ(fontFamily, fontWeight, i4, i5);
    }
}
