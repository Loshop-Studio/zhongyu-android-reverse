package com.zykj.view.board.play;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.board.play.PlaySettingAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p097e7.C7863g;

@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, m13413d2 = {"Lcom/zykj/view/board/play/PlaySettingAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "Landroid/content/Context;", "context", "", "Le7/g;", "data", "<init>", "(Landroid/content/Context;Ljava/util/List;)V", "Landroid/view/ViewGroup;", "parent", "", "viewType", "e", "(Landroid/view/ViewGroup;I)Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "getItemCount", "()I", "holder", RequestParameters.POSITION, "", "c", "(Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;I)V", "a", "Landroid/content/Context;", "b", "Ljava/util/List;", "PlaySpeedRateHolder", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class PlaySettingAdapter extends RecyclerView.Adapter<PlaySpeedRateHolder> {

    /* renamed from: a, reason: from kotlin metadata */
    public final Context context;

    /* renamed from: b, reason: from kotlin metadata */
    public final List data;

    @Metadata(m13412d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/view/board/play/PlaySettingAdapter$PlaySpeedRateHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "a", "Landroid/widget/ImageView;", "b", "()Landroid/widget/ImageView;", "setIcon", "(Landroid/widget/ImageView;)V", "icon", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "()Landroid/widget/TextView;", "setContent", "(Landroid/widget/TextView;)V", "content", "view_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class PlaySpeedRateHolder extends RecyclerView.ViewHolder {

        /* renamed from: a, reason: from kotlin metadata */
        public ImageView icon;

        /* renamed from: b, reason: from kotlin metadata */
        public TextView content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaySpeedRateHolder(View itemView) {
            super(itemView);
            Intrinsics.checkNotNullParameter(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.icon = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_content);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.content = (TextView) viewFindViewById2;
        }

        /* renamed from: a, reason: from getter */
        public final TextView getContent() {
            return this.content;
        }

        /* renamed from: b, reason: from getter */
        public final ImageView getIcon() {
            return this.icon;
        }
    }

    public PlaySettingAdapter(Context context, List data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(data, "data");
        this.context = context;
        this.data = data;
    }

    /* renamed from: d */
    public static final void m11665d(PlaySettingAdapter playSettingAdapter, int i9, View view) {
        ((C7863g) playSettingAdapter.data.get(i9)).m12352a().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PlaySpeedRateHolder holder, final int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.getIcon().setImageDrawable(this.context.getDrawable(((C7863g) this.data.get(position)).m12354c()));
        holder.getContent().setText(((C7863g) this.data.get(position)).m12353b());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: e7.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaySettingAdapter.m11665d(this.f13206a, position, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public PlaySpeedRateHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewInflate = LayoutInflater.from(this.context).inflate(R$layout.view_item_play_setting, parent, false);
        Intrinsics.checkNotNull(viewInflate);
        return new PlaySpeedRateHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.data.size();
    }
}
