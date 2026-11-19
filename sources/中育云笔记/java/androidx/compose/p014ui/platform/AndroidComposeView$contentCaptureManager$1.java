package androidx.compose.p014ui.platform;

import android.view.View;
import androidx.compose.p014ui.platform.coreshims.ContentCaptureSessionCompat;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p181hd.InterfaceC9529a;

/* loaded from: classes2.dex */
public /* synthetic */ class AndroidComposeView$contentCaptureManager$1 extends FunctionReferenceImpl implements InterfaceC9529a {
    public AndroidComposeView$contentCaptureManager$1(Object obj) {
        super(0, obj, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1);
    }

    @Override // p181hd.InterfaceC9529a
    public final ContentCaptureSessionCompat invoke() {
        return AndroidComposeView_androidKt.getContentCaptureSessionCompat((View) this.receiver);
    }
}
