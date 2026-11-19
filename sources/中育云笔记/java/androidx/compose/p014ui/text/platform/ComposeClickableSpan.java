package androidx.compose.p014ui.text.platform;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.p014ui.text.LinkAnnotation;
import androidx.compose.p014ui.text.LinkInteractionListener;

/* loaded from: classes2.dex */
final class ComposeClickableSpan extends ClickableSpan {
    private final LinkAnnotation link;

    public ComposeClickableSpan(LinkAnnotation linkAnnotation) {
        this.link = linkAnnotation;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        LinkInteractionListener linkInteractionListener = this.link.getLinkInteractionListener();
        if (linkInteractionListener != null) {
            linkInteractionListener.onClick(this.link);
        }
    }
}
