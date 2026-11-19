package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import vc.InterfaceC11588c;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objCollect = AbstractC11596e.m25555e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC11595d() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public final Object emit(Rect rect, InterfaceC11588c<? super C10786q> interfaceC11588c2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return C10786q.f26013a;
            }

            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c2) {
                return emit((Rect) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c2);
            }
        }, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
