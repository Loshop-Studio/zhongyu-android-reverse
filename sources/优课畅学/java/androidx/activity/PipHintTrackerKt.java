package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import p123h7.C8736p;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = AbstractC9268e.m17015e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC9267d() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public final Object emit(Rect rect, InterfaceC9324c<? super C8736p> interfaceC9324c2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return C8736p.f16368a;
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((Rect) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
