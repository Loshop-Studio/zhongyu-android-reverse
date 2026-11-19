package com.zykj.view.board.play;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.zykj.view.C5280R;
import com.zykj.view.databinding.ViewPopupPlaySettingBinding;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\t0\u0012j\b\u0012\u0004\u0012\u00020\t`\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/view/board/play/PlaySettingPopup;", "Landroid/widget/PopupWindow;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/view/View;", "view", "", "Lcom/zykj/view/board/play/PlayerConfigSetting;", "data", "Ld6/s;", "showPopup", "(Landroid/view/View;Ljava/util/List;)V", "Landroid/content/Context;", "Lcom/zykj/view/board/play/PlaySettingAdapter;", "adapter", "Lcom/zykj/view/board/play/PlaySettingAdapter;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlaySettingPopup extends PopupWindow {

    @NotNull
    private final PlaySettingAdapter adapter;

    @NotNull
    private final Context context;

    @NotNull
    private final ArrayList<PlayerConfigSetting> data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaySettingPopup(@NotNull Context context) {
        super(context);
        AbstractC5830k.m5330g(context, "context");
        this.context = context;
        ViewPopupPlaySettingBinding viewPopupPlaySettingBindingInflate = ViewPopupPlaySettingBinding.inflate(LayoutInflater.from(context));
        AbstractC5830k.m5329f(viewPopupPlaySettingBindingInflate, "inflate(...)");
        viewPopupPlaySettingBindingInflate.recyclerView.setLayoutManager(new LinearLayoutManager(context));
        ArrayList<PlayerConfigSetting> arrayList = new ArrayList<>();
        this.data = arrayList;
        PlaySettingAdapter playSettingAdapter = new PlaySettingAdapter(context, arrayList);
        this.adapter = playSettingAdapter;
        viewPopupPlaySettingBindingInflate.recyclerView.setAdapter(playSettingAdapter);
        setContentView(viewPopupPlaySettingBindingInflate.getRoot());
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(context.getDrawable(C5280R.drawable.view_bg_play_speed_rate_popup));
        setOutsideTouchable(true);
        setFocusable(true);
    }

    public final void showPopup(@NotNull View view, @NotNull List<PlayerConfigSetting> data) {
        AbstractC5830k.m5330g(view, "view");
        AbstractC5830k.m5330g(data, "data");
        showAsDropDown(view, -this.context.getResources().getDimensionPixelOffset(C5280R.dimen.view_43), this.context.getResources().getDimensionPixelOffset(C5280R.dimen.view_5));
        this.data.clear();
        this.data.addAll(data);
    }
}
