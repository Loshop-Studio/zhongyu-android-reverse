package androidx.compose.p013ui.platform;

import android.view.View;
import androidx.compose.p013ui.platform.coreshims.ContentCaptureSessionCompat;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p300x7.InterfaceC10559a;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC10559a {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // p300x7.InterfaceC10559a
    public final ContentCaptureSessionCompat invoke() {
        return AndroidComposeView_androidKt.getContentCaptureSessionCompat((View) this.receiver);
    }
}
