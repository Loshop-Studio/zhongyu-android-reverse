package com.zykj.mistake.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ViewOnClickListenerC2870k;
import androidx.recyclerview.widget.RecyclerView;
import com.zykj.mistake.R;
import com.zykj.mistake.entity.resp.MistakeBookResp;
import com.zykj.mistake.fragment.MistakeCollectionLegacyFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/adapter/MainLessonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zykj/mistake/adapter/MainLessonAdapter$ViewHolder;", "ViewHolder", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class MainLessonAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public final Context f5964a;

    /* renamed from: b */
    public final ArrayList f5965b;

    /* renamed from: c */
    public final MistakeCollectionLegacyFragment f5966c;

    /* renamed from: d */
    public final HashMap f5967d;

    /* renamed from: e */
    public final HashMap f5968e;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcom/zykj/mistake/adapter/MainLessonAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f5969a;

        /* renamed from: b */
        public final ImageView f5970b;

        /* renamed from: c */
        public final RelativeLayout f5971c;

        public ViewHolder(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.lesson_name);
            AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
            this.f5969a = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.lesson_image);
            AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
            this.f5970b = (ImageView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.rl_card);
            AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
            this.f5971c = (RelativeLayout) viewFindViewById3;
        }
    }

    public MainLessonAdapter(Context context, ArrayList mLessonList, MistakeCollectionLegacyFragment mistakeCollectionLegacyFragment) {
        AbstractC5830k.m5330g(mLessonList, "mLessonList");
        HashMap map = new HashMap();
        this.f5967d = map;
        HashMap map2 = new HashMap();
        this.f5968e = map2;
        map.put("语文", Integer.valueOf(R.mipmap.ic_language));
        map.put("数学", Integer.valueOf(R.mipmap.ic_mathematics));
        map.put("外语", Integer.valueOf(R.mipmap.ic_english));
        map.put("物理", Integer.valueOf(R.mipmap.ic_physical));
        map.put("化学", Integer.valueOf(R.mipmap.ic_chemistry));
        map.put("思想政治", Integer.valueOf(R.mipmap.ic_political));
        map.put("历史", Integer.valueOf(R.mipmap.ic_history));
        map.put("地理", Integer.valueOf(R.mipmap.ic_geography));
        map.put("生物学", Integer.valueOf(R.mipmap.ic_biological));
        map2.put("语文", Integer.valueOf(R.mipmap.ic_language_bg));
        map2.put("数学", Integer.valueOf(R.mipmap.ic_mathematics_bg));
        map2.put("外语", Integer.valueOf(R.mipmap.ic_english_bg));
        map2.put("物理", Integer.valueOf(R.mipmap.ic_physical_bg));
        map2.put("化学", Integer.valueOf(R.mipmap.ic_chemistry_bg));
        map2.put("思想政治", Integer.valueOf(R.mipmap.ic_political_bg));
        map2.put("历史", Integer.valueOf(R.mipmap.ic_history_bg));
        map2.put("地理", Integer.valueOf(R.mipmap.ic_geography_bg));
        map2.put("生物学", Integer.valueOf(R.mipmap.ic_biological_bg));
        this.f5964a = context;
        this.f5965b = mLessonList;
        this.f5966c = mistakeCollectionLegacyFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(ViewHolder holder, int i) {
        AbstractC5830k.m5330g(holder, "holder");
        ImageView imageView = holder.f5970b;
        RelativeLayout relativeLayout = holder.f5971c;
        TextView textView = holder.f5969a;
        ArrayList arrayList = this.f5965b;
        textView.setText(((MistakeBookResp.MistakeBook) arrayList.get(i)).getTopic().getContent());
        String content = ((MistakeBookResp.MistakeBook) arrayList.get(i)).getTopic().getContent();
        HashMap map = this.f5967d;
        boolean zContainsKey = map.containsKey(content);
        Context context = this.f5964a;
        if (!zContainsKey || map.get(((MistakeBookResp.MistakeBook) arrayList.get(i)).getTopic().getContent()) == null) {
            imageView.setImageResource(R.mipmap.ic_default_topic);
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_10));
            relativeLayout.setBackgroundResource(R.mipmap.ic_default_topic_bg);
        } else {
            Object obj = map.get(((MistakeBookResp.MistakeBook) arrayList.get(i)).getTopic().getContent());
            AbstractC5830k.m5327d(obj);
            imageView.setImageResource(((Number) obj).intValue());
            textView.setTextSize(0, context.getResources().getDimensionPixelSize(R.dimen.text_12));
            Object obj2 = this.f5968e.get(((MistakeBookResp.MistakeBook) arrayList.get(i)).getTopic().getContent());
            AbstractC5830k.m5327d(obj2);
            relativeLayout.setBackgroundResource(((Number) obj2).intValue());
        }
        relativeLayout.setOnClickListener(new ViewOnClickListenerC2870k(this, i, 2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5965b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup p0, int i) {
        AbstractC5830k.m5330g(p0, "p0");
        View viewInflate = LayoutInflater.from(this.f5964a).inflate(R.layout.item_main, (ViewGroup) null);
        AbstractC5830k.m5329f(viewInflate, "inflate(...)");
        return new ViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List payloads) {
        ViewHolder holder = (ViewHolder) viewHolder;
        AbstractC5830k.m5330g(holder, "holder");
        AbstractC5830k.m5330g(payloads, "payloads");
        onBindViewHolder(holder, i);
    }
}
