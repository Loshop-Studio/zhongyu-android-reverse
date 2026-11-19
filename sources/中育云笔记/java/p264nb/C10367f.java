package p264nb;

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
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10980x;

/* renamed from: nb.f */
/* loaded from: classes6.dex */
public final class C10367f extends PopupWindow {

    /* renamed from: a */
    public final Context f24691a;

    /* renamed from: b */
    public ViewPopupPlaySpeedRateBinding f24692b;

    /* renamed from: c */
    public InterfaceC9540l f24693c;

    /* renamed from: d */
    public final SpeedRateAdapter f24694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10367f(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        this.f24691a = context;
        ViewPopupPlaySpeedRateBinding viewPopupPlaySpeedRateBindingM17361a = ViewPopupPlaySpeedRateBinding.m17361a(LayoutInflater.from(context));
        AbstractC9979u.m20293f(viewPopupPlaySpeedRateBindingM17361a, "inflate(...)");
        this.f24692b = viewPopupPlaySpeedRateBindingM17361a;
        SpeedRateAdapter speedRateAdapter = new SpeedRateAdapter(new InterfaceC9540l() { // from class: nb.e
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return C10367f.m21703c(this.f24690c, (C10363c0) obj);
            }
        });
        this.f24694d = speedRateAdapter;
        RecyclerView recyclerView = this.f24692b.f20733c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(speedRateAdapter);
        recyclerView.setItemAnimator(null);
        speedRateAdapter.submitList(C10363c0.f24680e.m21700a());
        setContentView(this.f24692b.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: c */
    public static final C10786q m21703c(C10367f c10367f, C10363c0 it) {
        AbstractC9979u.m20294g(it, "it");
        c10367f.dismiss();
        InterfaceC9540l interfaceC9540l = c10367f.f24693c;
        if (interfaceC9540l != null) {
            interfaceC9540l.invoke(it);
        }
        return C10786q.f26013a;
    }

    /* renamed from: b */
    public final void m21704b(View view, String speedLabel, InterfaceC9540l clickCallback) {
        AbstractC9979u.m20294g(view, "view");
        AbstractC9979u.m20294g(speedLabel, "speedLabel");
        AbstractC9979u.m20294g(clickCallback, "clickCallback");
        showAsDropDown(view, -this.f24691a.getResources().getDimensionPixelOffset(R$dimen.view_17), -this.f24691a.getResources().getDimensionPixelOffset(R$dimen.view_154));
        this.f24693c = clickCallback;
        SpeedRateAdapter speedRateAdapter = this.f24694d;
        List<C10363c0> currentList = speedRateAdapter.getCurrentList();
        AbstractC9979u.m20293f(currentList, "getCurrentList(...)");
        List<C10363c0> list = currentList;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list, 10));
        for (C10363c0 c10363c0 : list) {
            arrayList.add(C10363c0.m21694b(c10363c0, AudioStats.AUDIO_AMPLITUDE_NONE, null, AbstractC9979u.m20289b(speedLabel, c10363c0.m21696c()), 0, 11, null));
        }
        speedRateAdapter.submitList(arrayList);
    }
}
