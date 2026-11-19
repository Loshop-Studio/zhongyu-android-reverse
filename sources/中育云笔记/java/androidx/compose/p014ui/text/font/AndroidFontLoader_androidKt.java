package androidx.compose.p014ui.text.font;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import vc.InterfaceC11588c;

/* loaded from: classes2.dex */
public final class AndroidFontLoader_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Typeface load(ResourceFont resourceFont, Context context) {
        Typeface font = ResourcesCompat.getFont(context, resourceFont.getResId());
        AbstractC9979u.m20291d(font);
        return font;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadAsync(final ResourceFont resourceFont, Context context, InterfaceC11588c<? super Typeface> interfaceC11588c) throws Resources.NotFoundException {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        ResourcesCompat.getFont(context, resourceFont.getResId(), new ResourcesCompat.FontCallback() { // from class: androidx.compose.ui.text.font.AndroidFontLoader_androidKt$loadAsync$2$1
            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrievalFailed(int i10) {
                c9997c.mo20530o(new IllegalStateException("Unable to load font " + resourceFont + " (reason=" + i10 + ')'));
            }

            @Override // androidx.core.content.res.ResourcesCompat.FontCallback
            public void onFontRetrieved(Typeface typeface) {
                c9997c.resumeWith(Result.m20054c(typeface));
            }
        }, null);
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }
}
