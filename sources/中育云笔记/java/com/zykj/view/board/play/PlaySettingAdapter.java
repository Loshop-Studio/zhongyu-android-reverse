package com.zykj.view.board.play;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.view.R$id;
import com.zykj.view.R$layout;
import com.zykj.view.board.play.PlaySettingAdapter;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p264nb.C10368g;

/* loaded from: classes6.dex */
public final class PlaySettingAdapter extends RecyclerView.Adapter<PlaySpeedRateHolder> {

    /* renamed from: a */
    public final Context f20372a;

    /* renamed from: b */
    public final List f20373b;

    public static final class PlaySpeedRateHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public ImageView f20374c;

        /* renamed from: d */
        public TextView f20375d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaySpeedRateHolder(View itemView) {
            super(itemView);
            AbstractC9979u.m20294g(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_icon);
            AbstractC9979u.m20293f(viewFindViewById, "findViewById(...)");
            this.f20374c = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_content);
            AbstractC9979u.m20293f(viewFindViewById2, "findViewById(...)");
            this.f20375d = (TextView) viewFindViewById2;
        }

        /* renamed from: a */
        public final TextView m17154a() {
            return this.f20375d;
        }

        /* renamed from: b */
        public final ImageView m17155b() {
            return this.f20374c;
        }
    }

    public PlaySettingAdapter(Context context, List data) {
        AbstractC9979u.m20294g(context, "context");
        AbstractC9979u.m20294g(data, "data");
        this.f20372a = context;
        this.f20373b = data;
    }

    /* renamed from: c */
    public static final void m17151c(PlaySettingAdapter playSettingAdapter, int i10, View view) {
        ((C10368g) playSettingAdapter.f20373b.get(i10)).m21705a().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PlaySpeedRateHolder holder, final int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        holder.m17155b().setImageDrawable(this.f20372a.getDrawable(((C10368g) this.f20373b.get(i10)).m21707c()));
        holder.m17154a().setText(((C10368g) this.f20373b.get(i10)).m21706b());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: nb.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaySettingAdapter.m17151c(this.f24678c, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public PlaySpeedRateHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f20372a).inflate(R$layout.view_item_play_setting, parent, false);
        AbstractC9979u.m20291d(viewInflate);
        return new PlaySpeedRateHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20373b.size();
    }
}
