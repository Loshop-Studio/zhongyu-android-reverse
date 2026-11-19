package com.friday.document.adapter;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ScreenUtils;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$attr;
import com.friday.document.R$color;
import com.friday.document.R$dimen;
import com.friday.document.adapter.AbstractC5987c;
import com.friday.document.adapter.RecycleBinAdapter;
import com.friday.document.databinding.ItemRecycleBinBinding;
import com.friday.document.viewmodel.RecycleBinViewModel;
import gb.AbstractC9286b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p009a8.C0085a;
import p009a8.C0087c;
import p047c9.C5410c;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p215k2.AbstractC9796n;
import p309qc.C10786q;
import p325rc.AbstractC10961n0;
import p325rc.AbstractC10978w;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class RecycleBinAdapter extends PagingDataAdapter<MultiModeFileEntity, RecycleBinHolder> {

    /* renamed from: a */
    public final RecycleBinViewModel f6251a;

    /* renamed from: b */
    public final InterfaceC9544p f6252b;

    /* renamed from: c */
    public final SimpleDateFormat f6253c;

    /* renamed from: d */
    public final int f6254d;

    @StabilityInferred(parameters = 0)
    public static final class RecycleBinHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemRecycleBinBinding f6255c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecycleBinHolder(ItemRecycleBinBinding binding) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            this.f6255c = binding;
        }

        /* renamed from: a */
        public final ItemRecycleBinBinding m5488a() {
            return this.f6255c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecycleBinAdapter(RecycleBinViewModel recycleBinViewModel, InterfaceC9544p onItemClickListener) {
        super(new DiffUtil.ItemCallback<MultiModeFileEntity>() { // from class: com.friday.document.adapter.RecycleBinAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem, newItem);
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem.getEntity().getFileId(), newItem.getEntity().getFileId()) && oldItem.getEntity().getSyncStatus() == newItem.getEntity().getSyncStatus();
            }
        }, (InterfaceC9945d) null, (InterfaceC9945d) null, 6, (AbstractC9972n) null);
        AbstractC9979u.m20294g(recycleBinViewModel, "recycleBinViewModel");
        AbstractC9979u.m20294g(onItemClickListener, "onItemClickListener");
        this.f6251a = recycleBinViewModel;
        this.f6252b = onItemClickListener;
        this.f6253c = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        this.f6254d = TimeConstants.DAY;
    }

    /* renamed from: k */
    public static final C10786q m5479k(RecycleBinHolder recycleBinHolder, final RecycleBinAdapter recycleBinAdapter, View view) {
        AbstractC9979u.m20294g(view, "view");
        int bindingAdapterPosition = recycleBinHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return C10786q.f26013a;
        }
        final MultiModeFileEntity item = recycleBinAdapter.getItem(bindingAdapterPosition);
        if (item == null) {
            return C10786q.f26013a;
        }
        final AbstractC5987c[] abstractC5987cArr = {AbstractC5987c.c.f6285b, AbstractC5987c.b.f6284b};
        ArrayList arrayList = new ArrayList(2);
        for (int i10 = 0; i10 < 2; i10++) {
            arrayList.add(abstractC5987cArr[i10].m5513a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        Rect rect = new Rect();
        recycleBinHolder.m5488a().f6506e.getGlobalVisibleRect(rect);
        int i11 = rect.bottom;
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{R$attr.xui_config_simple_list_item_height});
        AbstractC9979u.m20293f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 5.0f);
        typedArrayObtainStyledAttributes.recycle();
        float length = (dimension * strArr.length) + view.getContext().getResources().getDimension(R$dimen.view_5);
        boolean z10 = ((float) (ScreenUtils.getScreenHeight() - i11)) > length;
        C5410c c5410cM2861z = new C5410c(view.getContext(), strArr).m2861z((int) view.getContext().getResources().getDimension(R$dimen.view_60), (int) length, new C5410c.b() { // from class: o2.i
            @Override // p047c9.C5410c.b
            /* renamed from: a */
            public final void mo2862a(C0087c c0087c, C0085a c0085a, int i12) {
                RecycleBinAdapter.m5480l(this.f24836a, abstractC5987cArr, item, c0087c, c0085a, i12);
            }
        });
        c5410cM2861z.m2859B(true);
        if (z10) {
            c5410cM2861z.m2856u(view);
        } else {
            c5410cM2861z.m2857v(view);
        }
        return C10786q.f26013a;
    }

    /* renamed from: l */
    public static final void m5480l(RecycleBinAdapter recycleBinAdapter, AbstractC5987c[] abstractC5987cArr, MultiModeFileEntity multiModeFileEntity, C0087c c0087c, C0085a c0085a, int i10) {
        recycleBinAdapter.f6252b.invoke(abstractC5987cArr[i10], multiModeFileEntity.getEntity());
    }

    /* renamed from: m */
    public static final C10786q m5481m(RecycleBinHolder recycleBinHolder, RecycleBinAdapter recycleBinAdapter, View it) {
        MultiModeFileEntity item;
        AbstractC9979u.m20294g(it, "it");
        int bindingAdapterPosition = recycleBinHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (item = recycleBinAdapter.getItem(bindingAdapterPosition)) != null) {
            recycleBinAdapter.f6252b.invoke(AbstractC5987c.a.f6283b, item.getEntity());
        }
        return C10786q.f26013a;
    }

    /* renamed from: g */
    public final void m5482g(RecycleBinHolder recycleBinHolder, MultiModeFileEntity multiModeFileEntity) {
        Object objM20054c;
        try {
            Result.C9921a c9921a = Result.f23263d;
            long expiredTime = multiModeFileEntity.getEntity().getExpiredTime() * 1000;
            SimpleDateFormat simpleDateFormat = this.f6253c;
            Date date = simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(expiredTime)));
            AbstractC9979u.m20291d(date);
            long time = date.getTime();
            SimpleDateFormat simpleDateFormat2 = this.f6253c;
            Date date2 = simpleDateFormat2.parse(simpleDateFormat2.format(new Date()));
            AbstractC9979u.m20291d(date2);
            long time2 = (time - date2.getTime()) / this.f6254d;
            TextView textView = recycleBinHolder.m5488a().f6508g;
            StringBuilder sb2 = new StringBuilder();
            if (time2 > 30) {
                time2 = 30;
            }
            sb2.append(time2);
            sb2.append("天");
            textView.setText(sb2.toString());
            objM20054c = Result.m20054c(C10786q.f26013a);
        } catch (Throwable th) {
            Result.C9921a c9921a2 = Result.f23263d;
            objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
        }
        Throwable thM20056e = Result.m20056e(objM20054c);
        if (thM20056e != null) {
            LogUtils.m3887e("计算时间失败: " + thM20056e.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecycleBinHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        MultiModeFileEntity item = getItem(i10);
        if (item != null) {
            holder.m5488a().f6505d.setImageResource(AbstractC9796n.f22990a.m19792d(item.getEntity().getFileType()));
            FileEntity fileEntity = (FileEntity) this.f6251a.m6222F().getValue();
            ConstraintLayout constraintLayout = holder.m5488a().f6504c;
            int iM26580a = (fileEntity == null || !AbstractC9979u.m20289b(fileEntity.getFileId(), item.getEntity().getFileId()) || AbstractC9979u.m20289b(item.getEntity().getFileType(), "0")) ? AbstractC11958b.m26580a(R$color.transparent) : AbstractC11958b.m26580a(R$color.select);
            constraintLayout.setBackgroundColor(iM26580a);
            holder.m5488a().f6507f.setText(item.getEntity().getFileName());
            m5482g(holder, item);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(RecycleBinHolder holder, int i10, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, i10, payloads);
            return;
        }
        MultiModeFileEntity item = getItem(i10);
        if (item == null) {
            return;
        }
        for (Object obj : payloads) {
            if (obj == RecycleBinPayloadKeys.f6256c) {
                FileEntity fileEntity = (FileEntity) this.f6251a.m6222F().getValue();
                holder.m5488a().f6504c.setBackgroundColor((fileEntity == null || !AbstractC9979u.m20289b(fileEntity.getFileId(), item.getEntity().getFileId()) || AbstractC9979u.m20289b(item.getEntity().getFileType(), "0")) ? AbstractC11958b.m26580a(R$color.transparent) : AbstractC11958b.m26580a(R$color.select));
            } else if (obj == RecycleBinPayloadKeys.f6257d) {
                m5482g(holder, item);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public RecycleBinHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemRecycleBinBinding itemRecycleBinBindingM5537a = ItemRecycleBinBinding.m5537a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemRecycleBinBindingM5537a, "inflate(...)");
        final RecycleBinHolder recycleBinHolder = new RecycleBinHolder(itemRecycleBinBindingM5537a);
        ConstraintLayout container = recycleBinHolder.m5488a().f6504c;
        AbstractC9979u.m20293f(container, "container");
        AbstractC9286b.m18309e(container, new InterfaceC9540l() { // from class: o2.g
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinAdapter.m5481m(recycleBinHolder, this, (View) obj);
            }
        });
        ImageView ivOption = recycleBinHolder.m5488a().f6506e;
        AbstractC9979u.m20293f(ivOption, "ivOption");
        AbstractC9286b.m18309e(ivOption, new InterfaceC9540l() { // from class: o2.h
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return RecycleBinAdapter.m5479k(recycleBinHolder, this, (View) obj);
            }
        });
        return recycleBinHolder;
    }

    /* renamed from: n */
    public final void m5486n() {
        Iterator it = AbstractC10978w.m24137o(snapshot().getItems()).iterator();
        while (it.hasNext()) {
            notifyItemChanged(((AbstractC10961n0) it).nextInt(), RecycleBinPayloadKeys.f6256c);
        }
    }

    /* renamed from: o */
    public final void m5487o() {
        Iterator it = AbstractC10978w.m24137o(snapshot().getItems()).iterator();
        while (it.hasNext()) {
            notifyItemChanged(((AbstractC10961n0) it).nextInt(), RecycleBinPayloadKeys.f6257d);
        }
    }
}
