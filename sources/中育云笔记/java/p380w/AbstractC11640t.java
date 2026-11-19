package p380w;

import android.view.View;
import coil3.core.R$id;
import coil3.request.ViewTargetRequestManager;

/* renamed from: w.t */
/* loaded from: classes3.dex */
public abstract class AbstractC11640t {
    /* renamed from: a */
    public static final ViewTargetRequestManager m25757a(View view) {
        ViewTargetRequestManager viewTargetRequestManager;
        Object tag = view.getTag(R$id.coil3_request_manager);
        ViewTargetRequestManager viewTargetRequestManager2 = tag instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag : null;
        if (viewTargetRequestManager2 != null) {
            return viewTargetRequestManager2;
        }
        synchronized (view) {
            try {
                Object tag2 = view.getTag(R$id.coil3_request_manager);
                viewTargetRequestManager = tag2 instanceof ViewTargetRequestManager ? (ViewTargetRequestManager) tag2 : null;
                if (viewTargetRequestManager == null) {
                    viewTargetRequestManager = new ViewTargetRequestManager(view);
                    view.addOnAttachStateChangeListener(viewTargetRequestManager);
                    view.setTag(R$id.coil3_request_manager, viewTargetRequestManager);
                }
            } finally {
            }
        }
        return viewTargetRequestManager;
    }
}
