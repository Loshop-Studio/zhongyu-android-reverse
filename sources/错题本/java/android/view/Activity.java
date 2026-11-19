package android.view;

import android.view.View;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.AbstractC5914h;
import kotlinx.coroutines.flow.InterfaceC5912g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;

@Metadata(m5109d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m5110d2 = {"Landroid/app/Activity;", "Landroid/view/View;", "view", "Ld6/s;", "trackPipAnimationHintView", "(Landroid/app/Activity;Landroid/view/View;Lh6/c;)Ljava/lang/Object;", "activity_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* renamed from: androidx.activity.PipHintTrackerKt, reason: from Kotlin metadata */
/* loaded from: classes.dex */
public final class Activity {
    @RequiresApi(26)
    @Nullable
    public static final Object trackPipAnimationHintView(@NotNull final android.app.Activity activity, @NotNull View view, @NotNull InterfaceC5631c<? super C5443s> interfaceC5631c) {
        Object objCollect = AbstractC5914h.m5551g(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC5912g() { // from class: androidx.activity.PipHintTrackerKt.trackPipAnimationHintView.2
            public final Object emit(android.graphics.Rect rect, InterfaceC5631c<? super C5443s> interfaceC5631c2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return C5443s.f8405a;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC5912g
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC5631c interfaceC5631c2) {
                return emit((android.graphics.Rect) obj, (InterfaceC5631c<? super C5443s>) interfaceC5631c2);
            }
        }, interfaceC5631c);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : C5443s.f8405a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.graphics.Rect trackPipAnimationHintView$positionInWindow(View view) {
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
