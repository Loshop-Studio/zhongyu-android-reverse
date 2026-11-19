package p243s5;

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
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;

/* renamed from: s5.f */
/* loaded from: classes5.dex */
public final class C10023f extends PopupWindow {

    /* renamed from: a */
    public final Context f20053a;

    /* renamed from: b */
    public ViewPopupPlaySpeedRateBinding f20054b;

    /* renamed from: c */
    public InterfaceC10570l f20055c;

    /* renamed from: d */
    public final SpeedRateAdapter f20056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10023f(Context context) {
        super(context);
        AbstractC9133u.m16133g(context, "context");
        this.f20053a = context;
        ViewPopupPlaySpeedRateBinding viewPopupPlaySpeedRateBindingM13289a = ViewPopupPlaySpeedRateBinding.m13289a(LayoutInflater.from(context));
        AbstractC9133u.m16132f(viewPopupPlaySpeedRateBindingM13289a, "inflate(...)");
        this.f20054b = viewPopupPlaySpeedRateBindingM13289a;
        SpeedRateAdapter speedRateAdapter = new SpeedRateAdapter(new InterfaceC10570l() { // from class: s5.e
            @Override // p300x7.InterfaceC10570l
            public final Object invoke(Object obj) {
                return C10023f.m18729c(this.f20052a, (C10019c0) obj);
            }
        });
        this.f20056d = speedRateAdapter;
        RecyclerView recyclerView = this.f20054b.f15522a;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(speedRateAdapter);
        recyclerView.setItemAnimator(null);
        speedRateAdapter.submitList(C10019c0.f20042e.m18726a());
        setContentView(this.f20054b.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(R$drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* renamed from: c */
    public static final C8736p m18729c(C10023f c10023f, C10019c0 it) {
        AbstractC9133u.m16133g(it, "it");
        c10023f.dismiss();
        InterfaceC10570l interfaceC10570l = c10023f.f20055c;
        if (interfaceC10570l != null) {
            interfaceC10570l.invoke(it);
        }
        return C8736p.f16368a;
    }

    /* renamed from: b */
    public final void m18730b(View view, String speedLabel, InterfaceC10570l clickCallback) {
        AbstractC9133u.m16133g(view, "view");
        AbstractC9133u.m16133g(speedLabel, "speedLabel");
        AbstractC9133u.m16133g(clickCallback, "clickCallback");
        showAsDropDown(view, -this.f20053a.getResources().getDimensionPixelOffset(R$dimen.view_17), -this.f20053a.getResources().getDimensionPixelOffset(R$dimen.view_154));
        this.f20055c = clickCallback;
        SpeedRateAdapter speedRateAdapter = this.f20056d;
        List<C10019c0> currentList = speedRateAdapter.getCurrentList();
        AbstractC9133u.m16132f(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(currentList, 10));
        for (C10019c0 c10019c0 : currentList) {
            arrayList.add(C10019c0.m18720b(c10019c0, AudioStats.AUDIO_AMPLITUDE_NONE, null, AbstractC9133u.m16128b(speedLabel, c10019c0.m18722c()), 0, 11, null));
        }
        speedRateAdapter.submitList(arrayList);
    }
}
