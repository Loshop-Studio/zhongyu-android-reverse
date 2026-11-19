package com.zykj.view.board.play;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ViewOnClickListenerC2870k;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.view.C5280R;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018¨\u0006\u001a"}, m5110d2 = {"Lcom/zykj/view/board/play/PlaySettingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "Landroid/content/Context;", "context", "", "Lcom/zykj/view/board/play/PlayerConfigSetting;", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "getItemCount", "()I", "holder", RequestParameters.POSITION, "Ld6/s;", "onBindViewHolder", "(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V", "Landroid/content/Context;", "Ljava/util/List;", "PlaySpeedRateHolder", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class PlaySettingAdapter extends RecyclerView.Adapter<PlaySpeedRateHolder> {

    @NotNull
    private final Context context;

    @NotNull
    private final List<PlayerConfigSetting> data;

    @Metadata(m5109d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "icon", "Landroid/widget/ImageView;", "getIcon", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "content", "Landroid/widget/TextView;", "getContent", "()Landroid/widget/TextView;", "setContent", "(Landroid/widget/TextView;)V", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PlaySpeedRateHolder extends RecyclerView.ViewHolder {

        @NotNull
        private TextView content;

        @NotNull
        private ImageView icon;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaySpeedRateHolder(@NotNull View itemView) {
            super(itemView);
            AbstractC5830k.m5330g(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(C5280R.id.iv_icon);
            AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(C5280R.id.tv_content);
            AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
            this.content = (TextView) viewFindViewById2;
        }

        @NotNull
        public final TextView getContent() {
            return this.content;
        }

        @NotNull
        public final ImageView getIcon() {
            return this.icon;
        }

        public final void setContent(@NotNull TextView textView) {
            AbstractC5830k.m5330g(textView, "<set-?>");
            this.content = textView;
        }

        public final void setIcon(@NotNull ImageView imageView) {
            AbstractC5830k.m5330g(imageView, "<set-?>");
            this.icon = imageView;
        }
    }

    public PlaySettingAdapter(@NotNull Context context, @NotNull List<PlayerConfigSetting> data) {
        AbstractC5830k.m5330g(context, "context");
        AbstractC5830k.m5330g(data, "data");
        this.context = context;
        this.data = data;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(PlaySettingAdapter playSettingAdapter, int i, View view) {
        playSettingAdapter.data.get(i).getClickCallback().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull PlaySpeedRateHolder holder, int position) {
        AbstractC5830k.m5330g(holder, "holder");
        holder.getIcon().setImageDrawable(this.context.getDrawable(this.data.get(position).getDrawableId()));
        holder.getContent().setText(this.data.get(position).getDisplayText());
        holder.itemView.setOnClickListener(new ViewOnClickListenerC2870k(this, position, 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public PlaySpeedRateHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        AbstractC5830k.m5330g(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(C5280R.layout.view_item_play_setting, parent, false);
        AbstractC5830k.m5327d(viewInflate);
        return new PlaySpeedRateHolder(viewInflate);
    }
}
