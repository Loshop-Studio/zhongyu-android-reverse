package p246t7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.camera.video.AudioStats;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$dimen;
import com.zykj.view.R$drawable;
import com.zykj.view.board.play.SpeedRateAdapter;
import com.zykj.view.databinding.ViewPopupPlaySpeedRateBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t7.f */
/* loaded from: classes5.dex */
public final class C9473f extends PopupWindow {

    /* renamed from: a */
    public final Context f16552a;

    /* renamed from: b */
    public ViewPopupPlaySpeedRateBinding f16553b;

    /* renamed from: c */
    public Function1 f16554c;

    /* renamed from: d */
    public final SpeedRateAdapter f16555d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9473f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16552a = context;
        ViewPopupPlaySpeedRateBinding viewPopupPlaySpeedRateBindingM11422a = ViewPopupPlaySpeedRateBinding.m11422a(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(viewPopupPlaySpeedRateBindingM11422a, "inflate(...)");
        this.f16553b = viewPopupPlaySpeedRateBindingM11422a;
        SpeedRateAdapter speedRateAdapter = new SpeedRateAdapter(new Function1() { // from class: t7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C9473f.m15851c(this.f16551a, (C9469c0) obj);
            }
        });
        this.f16555d = speedRateAdapter;
        RecyclerView recyclerView = this.f16553b.f11569a;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(speedRateAdapter);
        recyclerView.setItemAnimator(null);
        speedRateAdapter.submitList(C9469c0.f16541e.m15848a());
        setContentView(this.f16553b.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: c */
    public static final Unit m15851c(C9473f c9473f, C9469c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c9473f.dismiss();
        Function1 function1 = c9473f.f16554c;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final void m15852b(View view, String speedLabel, Function1 clickCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(speedLabel, "speedLabel");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        showAsDropDown(view, -this.f16552a.getResources().getDimensionPixelOffset(R$dimen.view_17), -this.f16552a.getResources().getDimensionPixelOffset(R$dimen.view_154));
        this.f16554c = clickCallback;
        SpeedRateAdapter speedRateAdapter = this.f16555d;
        List<C9469c0> currentList = speedRateAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentList, 10));
        for (C9469c0 c9469c0 : currentList) {
            arrayList.add(C9469c0.m15842b(c9469c0, AudioStats.AUDIO_AMPLITUDE_NONE, null, Intrinsics.areEqual(speedLabel, c9469c0.m15844c()), 0, 11, null));
        }
        speedRateAdapter.submitList(arrayList);
    }
}
