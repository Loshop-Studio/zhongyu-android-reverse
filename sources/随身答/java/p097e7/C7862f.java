package p097e7;

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
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e7.f */
/* loaded from: classes5.dex */
public final class C7862f extends PopupWindow {

    /* renamed from: a */
    public final Context f13219a;

    /* renamed from: b */
    public ViewPopupPlaySpeedRateBinding f13220b;

    /* renamed from: c */
    public Function1 f13221c;

    /* renamed from: d */
    public final SpeedRateAdapter f13222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7862f(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f13219a = context;
        ViewPopupPlaySpeedRateBinding viewPopupPlaySpeedRateBindingM11912a = ViewPopupPlaySpeedRateBinding.m11912a(LayoutInflater.from(context));
        Intrinsics.checkNotNullExpressionValue(viewPopupPlaySpeedRateBindingM11912a, "inflate(...)");
        this.f13220b = viewPopupPlaySpeedRateBindingM11912a;
        SpeedRateAdapter speedRateAdapter = new SpeedRateAdapter(new Function1() { // from class: e7.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C7862f.m12348e(this.f13218a, (C7858c0) obj);
            }
        });
        this.f13222d = speedRateAdapter;
        RecyclerView recyclerView = this.f13220b.f12813a;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(speedRateAdapter);
        recyclerView.setItemAnimator(null);
        speedRateAdapter.submitList(C7858c0.f13208e.m12345a());
        setContentView(this.f13220b.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: e */
    public static final Unit m12348e(C7862f c7862f, C7858c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        c7862f.dismiss();
        Function1 function1 = c7862f.f13221c;
        if (function1 != null) {
            function1.invoke(it);
        }
        return Unit.INSTANCE;
    }

    /* renamed from: b */
    public final double m12349b(String label) {
        Object next;
        Intrinsics.checkNotNullParameter(label, "label");
        List<C7858c0> currentList = this.f13222d.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        Iterator<T> it = currentList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((C7858c0) next).m12341c(), label)) {
                break;
            }
        }
        C7858c0 c7858c0 = (C7858c0) next;
        if (c7858c0 != null) {
            return c7858c0.m12343e();
        }
        return 1.0d;
    }

    /* renamed from: c */
    public final void m12350c(int i9) {
        SpeedRateAdapter speedRateAdapter = this.f13222d;
        List<C7858c0> currentList = speedRateAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentList, 10));
        Iterator<T> it = currentList.iterator();
        while (it.hasNext()) {
            int i10 = i9;
            arrayList.add(C7858c0.m12339b((C7858c0) it.next(), AudioStats.AUDIO_AMPLITUDE_NONE, null, false, i10, 7, null));
            i9 = i10;
        }
        speedRateAdapter.submitList(arrayList);
    }

    /* renamed from: d */
    public final void m12351d(View view, String speedLabel, Function1 clickCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(speedLabel, "speedLabel");
        Intrinsics.checkNotNullParameter(clickCallback, "clickCallback");
        showAsDropDown(view, -this.f13219a.getResources().getDimensionPixelOffset(R$dimen.view_17), -this.f13219a.getResources().getDimensionPixelOffset(R$dimen.view_154));
        this.f13221c = clickCallback;
        SpeedRateAdapter speedRateAdapter = this.f13222d;
        List<C7858c0> currentList = speedRateAdapter.getCurrentList();
        Intrinsics.checkNotNullExpressionValue(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(currentList, 10));
        for (C7858c0 c7858c0 : currentList) {
            arrayList.add(C7858c0.m12339b(c7858c0, AudioStats.AUDIO_AMPLITUDE_NONE, null, Intrinsics.areEqual(speedLabel, c7858c0.m12341c()), 0, 11, null));
        }
        speedRateAdapter.submitList(arrayList);
    }
}
