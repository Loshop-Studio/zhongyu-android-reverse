package com.zykj.view.board.play;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.annotation.ColorRes;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewPopupPlaySpeedRateBinding;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r0\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\r\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, m5110d2 = {"Lcom/zykj/view/board/play/PlaySpeedRatePopup;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "label", "", "getCurrentSpeedRate", "(Ljava/lang/String;)D", "", "colorRes", "Ld6/s;", "setItemTextColor", "(I)V", "Landroid/view/View;", "view", "speedLabel", "Lkotlin/Function1;", "Lcom/zykj/view/board/play/SpeedRate;", "clickCallback", "showPopup", "(Landroid/view/View;Ljava/lang/String;Lr6/c;)V", "Landroid/content/Context;", "Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;", "binding", "Lcom/zykj/view/databinding/ViewPopupPlaySpeedRateBinding;", "Lr6/c;", "Lcom/zykj/view/board/play/SpeedRateAdapter;", "speedRateAdapter", "Lcom/zykj/view/board/play/SpeedRateAdapter;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SuppressLint({"UseCompatLoadingForDrawables"})
@SourceDebugExtension({"SMAP\nPlaySpeedRatePopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaySpeedRatePopup.kt\ncom/zykj/view/board/play/PlaySpeedRatePopup\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,145:1\n1#2:146\n1563#3:147\n1634#3,3:148\n1563#3:151\n1634#3,3:152\n*S KotlinDebug\n*F\n+ 1 PlaySpeedRatePopup.kt\ncom/zykj/view/board/play/PlaySpeedRatePopup\n*L\n54#1:147\n54#1:148,3\n68#1:151\n68#1:152,3\n*E\n"})
/* loaded from: classes3.dex */
public final class PlaySpeedRatePopup extends PopupWindow {

    @NotNull
    private ViewPopupPlaySpeedRateBinding binding;

    @Nullable
    private InterfaceC6471c clickCallback;

    @NotNull
    private final Context context;

    @NotNull
    private final SpeedRateAdapter speedRateAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySpeedRatePopup(@NotNull Context context) {
        super(context);
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
        ViewPopupPlaySpeedRateBinding viewPopupPlaySpeedRateBindingInflate = ViewPopupPlaySpeedRateBinding.inflate(LayoutInflater.from(context));
        AbstractC5830k.m5329f(viewPopupPlaySpeedRateBindingInflate, "inflate(...)");
        this.binding = viewPopupPlaySpeedRateBindingInflate;
        SpeedRateAdapter speedRateAdapter = new SpeedRateAdapter(new C5362k(this, 1));
        this.speedRateAdapter = speedRateAdapter;
        RecyclerView recyclerView = this.binding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(speedRateAdapter);
        recyclerView.setItemAnimator(null);
        speedRateAdapter.submitList(SpeedRate.INSTANCE.generateList());
        setContentView(this.binding.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(C5280R.drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5443s speedRateAdapter$lambda$0(PlaySpeedRatePopup playSpeedRatePopup, SpeedRate it) {
        AbstractC5830k.m5330g(it, "it");
        playSpeedRatePopup.dismiss();
        InterfaceC6471c interfaceC6471c = playSpeedRatePopup.clickCallback;
        if (interfaceC6471c != null) {
            interfaceC6471c.invoke(it);
        }
        return C5443s.f8405a;
    }

    public final double getCurrentSpeedRate(@NotNull String label) {
        Object next;
        AbstractC5830k.m5330g(label, "label");
        List<SpeedRate> currentList = this.speedRateAdapter.getCurrentList();
        AbstractC5830k.m5329f(currentList, "getCurrentList(...)");
        Iterator<T> it = currentList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC5830k.m5325b(((SpeedRate) next).getLabel(), label)) {
                break;
            }
        }
        SpeedRate speedRate = (SpeedRate) next;
        if (speedRate != null) {
            return speedRate.getSpeed();
        }
        return 1.0d;
    }

    public final void setItemTextColor(@ColorRes int colorRes) {
        SpeedRateAdapter speedRateAdapter = this.speedRateAdapter;
        List<SpeedRate> currentList = speedRateAdapter.getCurrentList();
        AbstractC5830k.m5329f(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(currentList, 10));
        Iterator<T> it = currentList.iterator();
        while (it.hasNext()) {
            int i = colorRes;
            arrayList.add(SpeedRate.copy$default((SpeedRate) it.next(), AudioStats.AUDIO_AMPLITUDE_NONE, null, false, i, 7, null));
            colorRes = i;
        }
        speedRateAdapter.submitList(arrayList);
    }

    public final void showPopup(@NotNull View view, @NotNull String speedLabel, @NotNull InterfaceC6471c clickCallback) {
        AbstractC5830k.m5330g(view, "view");
        AbstractC5830k.m5330g(speedLabel, "speedLabel");
        AbstractC5830k.m5330g(clickCallback, "clickCallback");
        showAsDropDown(view, -this.context.getResources().getDimensionPixelOffset(C5280R.dimen.view_17), -this.context.getResources().getDimensionPixelOffset(C5280R.dimen.view_154));
        this.clickCallback = clickCallback;
        SpeedRateAdapter speedRateAdapter = this.speedRateAdapter;
        List<SpeedRate> currentList = speedRateAdapter.getCurrentList();
        AbstractC5830k.m5329f(currentList, "getCurrentList(...)");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(currentList, 10));
        for (SpeedRate speedRate : currentList) {
            arrayList.add(SpeedRate.copy$default(speedRate, AudioStats.AUDIO_AMPLITUDE_NONE, null, speedLabel.equals(speedRate.getLabel()), 0, 11, null));
        }
        speedRateAdapter.submitList(arrayList);
    }
}
