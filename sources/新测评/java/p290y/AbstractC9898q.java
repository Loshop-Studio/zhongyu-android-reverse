package p290y;

import android.view.View;
import coil3.core.R$id;
import coil3.request.ViewTargetRequestManager;

/* renamed from: y.q */
/* loaded from: classes3.dex */
public abstract class AbstractC9898q {
    /* renamed from: a */
    public static final ViewTargetRequestManager m16713a(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        int i10 = R$id.coil3_request_manager;
        Object tag = view.getTag(i10);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(i10);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(i10, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }
}
