package p187y;

import android.view.View;
import coil3.core.R$id;
import coil3.request.ViewTargetRequestManager;

/* renamed from: y.s */
/* loaded from: classes3.dex */
public abstract class AbstractC7886s {
    /* renamed from: a */
    public static final ViewTargetRequestManager m9676a(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        int i6 = R$id.coil3_request_manager;
        Object tag = view.getTag(i6);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(i6);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(i6, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }
}
