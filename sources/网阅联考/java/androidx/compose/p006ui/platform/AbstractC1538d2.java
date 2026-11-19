package androidx.compose.p006ui.platform;

import androidx.compose.p006ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* renamed from: androidx.compose.ui.platform.d2 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1538d2 {
    /* renamed from: a */
    public static /* synthetic */ void m757a(TextToolbar textToolbar, Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
        }
        textToolbar.showMenu(rect, (i4 & 2) != 0 ? null : function0, (i4 & 4) != 0 ? null : function02, (i4 & 8) != 0 ? null : function03, (i4 & 16) != 0 ? null : function04);
    }
}
