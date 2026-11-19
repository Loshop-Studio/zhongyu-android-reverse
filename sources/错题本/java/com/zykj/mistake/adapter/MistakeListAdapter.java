package com.zykj.mistake.adapter;

import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.ViewOnClickListenerC2870k;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.activity.MistakeListActivity;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.utils.AbstractC5099d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.AbstractC5855p;
import p016b0.AbstractC3085o;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, m5110d2 = {"Lcom/zykj/mistake/adapter/MistakeListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;", "ViewHolder", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListAdapter.kt\ncom/zykj/mistake/adapter/MistakeListAdapter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n1869#2,2:189\n1869#2,2:191\n*S KotlinDebug\n*F\n+ 1 MistakeListAdapter.kt\ncom/zykj/mistake/adapter/MistakeListAdapter\n*L\n113#1:189,2\n144#1:191,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeListAdapter extends RecyclerView.Adapter<ViewHolder> {

    /* renamed from: a */
    public MistakeListActivity f5972a;

    /* renamed from: b */
    public ArrayList f5973b;

    /* renamed from: c */
    public MistakeListActivity f5974c;

    /* renamed from: d */
    public boolean f5975d;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m5110d2 = {"Lcom/zykj/mistake/adapter/MistakeListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class ViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final CardView f5976a;

        /* renamed from: b */
        public final TextView f5977b;

        /* renamed from: c */
        public final ImageView f5978c;

        /* renamed from: d */
        public final TextView f5979d;

        /* renamed from: e */
        public final LinearLayout f5980e;

        /* renamed from: f */
        public final RelativeLayout f5981f;

        /* renamed from: g */
        public final TextView f5982g;

        public ViewHolder(View view) {
            super(view);
            View viewFindViewById = view.findViewById(R.id.card_view);
            AbstractC5830k.m5329f(viewFindViewById, "findViewById(...)");
            this.f5976a = (CardView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.title);
            AbstractC5830k.m5329f(viewFindViewById2, "findViewById(...)");
            this.f5977b = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.image);
            AbstractC5830k.m5329f(viewFindViewById3, "findViewById(...)");
            this.f5978c = (ImageView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.date);
            AbstractC5830k.m5329f(viewFindViewById4, "findViewById(...)");
            this.f5979d = (TextView) viewFindViewById4;
            View viewFindViewById5 = view.findViewById(R.id.ll_tag);
            AbstractC5830k.m5329f(viewFindViewById5, "findViewById(...)");
            this.f5980e = (LinearLayout) viewFindViewById5;
            View viewFindViewById6 = view.findViewById(R.id.rl_select);
            AbstractC5830k.m5329f(viewFindViewById6, "findViewById(...)");
            this.f5981f = (RelativeLayout) viewFindViewById6;
            View viewFindViewById7 = view.findViewById(R.id.tv_select);
            AbstractC5830k.m5329f(viewFindViewById7, "findViewById(...)");
            this.f5982g = (TextView) viewFindViewById7;
        }
    }

    /* renamed from: a */
    public final void m3954a(boolean z8, Integer num) {
        ArrayList arrayList = this.f5973b;
        this.f5975d = z8;
        if (!z8) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((MistakeListResp.MistakeInfo) obj).setSelected(false);
            }
        }
        if (num != null) {
            ((MistakeListResp.MistakeInfo) arrayList.get(num.intValue())).setSelected(!((MistakeListResp.MistakeInfo) arrayList.get(r5)).getIsSelected());
        }
        notifyDataSetChanged();
    }

    /* renamed from: b */
    public final View m3955b(int i, String str) {
        View viewInflate = LayoutInflater.from(this.f5972a).inflate(R.layout.item_mistake_tag_little, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
        textView.setText(str);
        if (i == -1) {
            textView.setBackgroundResource(R.drawable.bg_blue_corner);
            return viewInflate;
        }
        if (i == 0) {
            textView.setBackgroundResource(R.drawable.bg_tag_green);
            return viewInflate;
        }
        if (i == 1) {
            textView.setBackgroundResource(R.drawable.bg_tag_yellow);
            return viewInflate;
        }
        if (i != 2) {
            return viewInflate;
        }
        textView.setBackgroundResource(R.drawable.bg_tag_red);
        return viewInflate;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void onBindViewHolder(ViewHolder holder, final int i) {
        AbstractC5830k.m5330g(holder, "holder");
        CardView cardView = holder.f5976a;
        RelativeLayout relativeLayout = holder.f5981f;
        LinearLayout linearLayout = holder.f5980e;
        TextView textView = holder.f5977b;
        ArrayList arrayList = this.f5973b;
        textView.setText(((MistakeListResp.MistakeInfo) arrayList.get(i)).getRealTitle());
        ImageView imageView = holder.f5978c;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(null);
        ((C3412f) ((C3412f) ComponentCallbacks2C3408b.m2362e(imageView.getContext()).m2386l(((MistakeListResp.MistakeInfo) arrayList.get(i)).getStemShoot()).m6086g(AbstractC3085o.f1479a)).m6087h(R.mipmap.pic_error)).m2379z(new C4491a(holder, imageView));
        TextView textView2 = holder.f5979d;
        String creationTime = ((MistakeListResp.MistakeInfo) arrayList.get(i)).getCreationTime();
        if (creationTime == null) {
            creationTime = "";
        }
        textView2.setText(AbstractC5855p.m5399g0(creationTime, " "));
        linearLayout.removeAllViews();
        Integer diff = ((MistakeListResp.MistakeInfo) arrayList.get(i)).getDiff();
        int iIntValue = diff != null ? diff.intValue() : 0;
        Integer attainedLevel = ((MistakeListResp.MistakeInfo) arrayList.get(i)).getAttainedLevel();
        int iIntValue2 = attainedLevel != null ? attainedLevel.intValue() : 0;
        Integer errorReason = ((MistakeListResp.MistakeInfo) arrayList.get(i)).getErrorReason();
        int iIntValue3 = errorReason != null ? errorReason.intValue() : 0;
        if (iIntValue != 0) {
            String str = (String) AbstractC5802q.m5195V(iIntValue - 1, AbstractC5099d.f8030a);
            if (str == null) {
                str = "";
            }
            linearLayout.addView(m3955b(0, str));
        }
        if (iIntValue2 != 0) {
            String str2 = (String) AbstractC5802q.m5195V(iIntValue2 - 1, AbstractC5099d.f8031b);
            if (str2 == null) {
                str2 = "";
            }
            linearLayout.addView(m3955b(1, str2));
        }
        if (iIntValue3 != 0) {
            String str3 = (String) AbstractC5802q.m5195V(iIntValue3 - 1, AbstractC5099d.f8032c);
            linearLayout.addView(m3955b(2, str3 != null ? str3 : ""));
        }
        Iterable tagNames = ((MistakeListResp.MistakeInfo) arrayList.get(i)).getTagNames();
        if (tagNames == null) {
            tagNames = EmptyList.INSTANCE;
        }
        Iterator it = tagNames.iterator();
        while (it.hasNext()) {
            linearLayout.addView(m3955b(-1, (String) it.next()));
        }
        relativeLayout.setVisibility(this.f5975d ? 0 : 8);
        relativeLayout.setSelected(((MistakeListResp.MistakeInfo) arrayList.get(i)).getIsSelected());
        holder.f5982g.setVisibility(((MistakeListResp.MistakeInfo) arrayList.get(i)).getIsSelected() ? 0 : 8);
        cardView.setOnClickListener(new ViewOnClickListenerC2870k(this, i, 3));
        cardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: g4.a
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                MistakeListActivity mistakeListActivity = this.f8701a.f5974c;
                if (mistakeListActivity.f5840m) {
                    return true;
                }
                Object systemService = mistakeListActivity.getSystemService("vibrator");
                AbstractC5830k.m5328e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
                Vibrator vibrator = (Vibrator) systemService;
                if (vibrator.hasVibrator()) {
                    vibrator.vibrate(100L);
                }
                mistakeListActivity.m3937E(Integer.valueOf(i));
                return true;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f5973b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        AbstractC5830k.m5330g(parent, "parent");
        View viewInflate = LayoutInflater.from(this.f5972a).inflate(R.layout.item_mistake_list, (ViewGroup) null);
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
