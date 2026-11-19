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
import kotlin.jvm.internal.AbstractC9133u;
import p243s5.C10024g;

/* loaded from: classes5.dex */
public final class PlaySettingAdapter extends RecyclerView.Adapter<PlaySpeedRateHolder> {

    /* renamed from: a */
    public final Context f15161a;

    /* renamed from: b */
    public final List f15162b;

    public static final class PlaySpeedRateHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public ImageView f15163a;

        /* renamed from: b */
        public TextView f15164b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlaySpeedRateHolder(View itemView) {
            super(itemView);
            AbstractC9133u.m16133g(itemView, "itemView");
            View viewFindViewById = itemView.findViewById(R$id.iv_icon);
            AbstractC9133u.m16132f(viewFindViewById, "findViewById(...)");
            this.f15163a = (ImageView) viewFindViewById;
            View viewFindViewById2 = itemView.findViewById(R$id.tv_content);
            AbstractC9133u.m16132f(viewFindViewById2, "findViewById(...)");
            this.f15164b = (TextView) viewFindViewById2;
        }

        /* renamed from: a */
        public final TextView m13081a() {
            return this.f15164b;
        }

        /* renamed from: b */
        public final ImageView m13082b() {
            return this.f15163a;
        }
    }

    public PlaySettingAdapter(Context context, List data) {
        AbstractC9133u.m16133g(context, "context");
        AbstractC9133u.m16133g(data, "data");
        this.f15161a = context;
        this.f15162b = data;
    }

    /* renamed from: e */
    public static final void m13078e(PlaySettingAdapter playSettingAdapter, int i10, View view) {
        ((C10024g) playSettingAdapter.f15162b.get(i10)).m18731a().invoke();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PlaySpeedRateHolder holder, final int i10) {
        AbstractC9133u.m16133g(holder, "holder");
        holder.m13082b().setImageDrawable(this.f15161a.getDrawable(((C10024g) this.f15162b.get(i10)).m18733c()));
        holder.m13081a().setText(((C10024g) this.f15162b.get(i10)).m18732b());
        holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: s5.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PlaySettingAdapter.m13078e(this.f20040a, i10, view);
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public PlaySpeedRateHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9133u.m16133g(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f15161a).inflate(R$layout.view_item_play_setting, parent, false);
        AbstractC9133u.m16130d(viewInflate);
        return new PlaySpeedRateHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f15162b.size();
    }
}
