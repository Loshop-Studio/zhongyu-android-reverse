package com.friday.document.adapter;

import android.content.res.TypedArray;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.PagingDataAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ScreenUtils;
import com.friday.common.entity.FileEntity;
import com.friday.document.R$attr;
import com.friday.document.R$color;
import com.friday.document.R$dimen;
import com.friday.document.R$drawable;
import com.friday.document.adapter.AbstractC5985a;
import com.friday.document.adapter.AbstractC5986b;
import com.friday.document.adapter.DocumentAdapter;
import com.friday.document.databinding.ItemNoteListBinding;
import gb.AbstractC9286b;
import java.util.ArrayList;
import java.util.List;
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
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p429z1.AbstractC11958b;

@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class DocumentAdapter extends PagingDataAdapter<MultiModeFileEntity, DocumentHolder> {

    /* renamed from: a */
    public InterfaceC9544p f6236a;

    /* renamed from: b */
    public InterfaceC9540l f6237b;

    @StabilityInferred(parameters = 0)
    public static final class DocumentHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemNoteListBinding f6238c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentHolder(ItemNoteListBinding binding) {
            super(binding.getRoot());
            AbstractC9979u.m20294g(binding, "binding");
            this.f6238c = binding;
        }

        /* renamed from: a */
        public final ItemNoteListBinding m5458a() {
            return this.f6238c;
        }

        /* renamed from: b */
        public final void m5459b(String name) {
            AbstractC9979u.m20294g(name, "name");
            this.f6238c.f6489h.setText(name);
        }

        /* renamed from: c */
        public final void m5460c(boolean z10, boolean z11, boolean z12) {
            if (!z12) {
                AppCompatImageView ivCheck = this.f6238c.f6485d;
                AbstractC9979u.m20293f(ivCheck, "ivCheck");
                ivCheck.setVisibility(8);
                ImageView ivOption = this.f6238c.f6487f;
                AbstractC9979u.m20293f(ivOption, "ivOption");
                ivOption.setVisibility(0);
                this.f6238c.f6484c.setBackgroundColor((!z11 || z10) ? AbstractC11958b.m26580a(R$color.transparent) : AbstractC11958b.m26580a(R$color.select));
                return;
            }
            AppCompatImageView ivCheck2 = this.f6238c.f6485d;
            AbstractC9979u.m20293f(ivCheck2, "ivCheck");
            ivCheck2.setVisibility(0);
            this.f6238c.f6485d.setSelected(z11);
            this.f6238c.f6484c.setBackgroundColor(z11 ? AbstractC11958b.m26580a(R$color.select) : AbstractC11958b.m26580a(R$color.transparent));
            ImageView ivOption2 = this.f6238c.f6487f;
            AbstractC9979u.m20293f(ivOption2, "ivOption");
            ivOption2.setVisibility(8);
        }

        /* renamed from: d */
        public final void m5461d(int i10) {
            if (i10 == 1) {
                this.f6238c.f6488g.setImageResource(R$drawable.icon_sync_failed);
                this.f6238c.f6488g.setVisibility(0);
            } else if (i10 == 2) {
                this.f6238c.f6488g.setImageResource(R$drawable.icon_to_be_synced);
                this.f6238c.f6488g.setVisibility(0);
            } else if (i10 != 3) {
                this.f6238c.f6488g.setImageDrawable(null);
                this.f6238c.f6488g.setVisibility(8);
            } else {
                this.f6238c.f6488g.setImageResource(R$drawable.icon_sync_child_failed);
                this.f6238c.f6488g.setVisibility(0);
            }
        }

        /* renamed from: e */
        public final void m5462e(String time) {
            AbstractC9979u.m20294g(time, "time");
            this.f6238c.f6490i.setText(time);
        }
    }

    public DocumentAdapter() {
        super(new DiffUtil.ItemCallback<MultiModeFileEntity>() { // from class: com.friday.document.adapter.DocumentAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object getChangePayload(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                ArrayList arrayList = new ArrayList();
                if (oldItem.isSelected() != newItem.isSelected() || oldItem.isInMultiSelectMode() != newItem.isInMultiSelectMode()) {
                    arrayList.add(AbstractC5986b.b.f6279a);
                }
                if (oldItem.getEntity().getSyncStatus() != newItem.getEntity().getSyncStatus()) {
                    arrayList.add(AbstractC5986b.c.f6280a);
                }
                if (!AbstractC9979u.m20289b(oldItem.getEntity().getFileName(), newItem.getEntity().getFileName())) {
                    arrayList.add(AbstractC5986b.a.f6278a);
                }
                if (!AbstractC9979u.m20289b(oldItem.getEntity().getUpdateTime(), newItem.getEntity().getUpdateTime())) {
                    arrayList.add(AbstractC5986b.d.f6281a);
                }
                return arrayList;
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areContentsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return oldItem.isInMultiSelectMode() == newItem.isInMultiSelectMode() && oldItem.isSelected() == newItem.isSelected() && oldItem.getEntity().getSyncStatus() == newItem.getEntity().getSyncStatus() && AbstractC9979u.m20289b(oldItem.getEntity().getFileName(), newItem.getEntity().getFileName()) && AbstractC9979u.m20289b(oldItem.getEntity().getUpdateTime(), newItem.getEntity().getUpdateTime());
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(MultiModeFileEntity oldItem, MultiModeFileEntity newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem.getEntity().getFileId(), newItem.getEntity().getFileId());
            }
        }, (InterfaceC9945d) null, (InterfaceC9945d) null, 6, (AbstractC9972n) null);
    }

    /* renamed from: k */
    public static final void m5447k(final DocumentAdapter documentAdapter, DocumentHolder documentHolder, View view) {
        final FileEntity entity;
        MultiModeFileEntity item = documentAdapter.getItem(documentHolder.getBindingAdapterPosition());
        if (item == null || (entity = item.getEntity()) == null) {
            return;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add(AbstractC5985a.d.f6275b);
        arrayList.add(AbstractC5985a.c.f6274b);
        arrayList.add(AbstractC5985a.b.f6273b);
        if (!entity.isFolder()) {
            arrayList.add(AbstractC5985a.f.f6277b);
        }
        ArrayList arrayList2 = new ArrayList(AbstractC10980x.m24153x(arrayList, 10));
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            arrayList2.add(((AbstractC5985a) obj).m5512a());
        }
        String[] strArr = (String[]) arrayList2.toArray(new String[0]);
        Rect rect = new Rect();
        documentHolder.m5458a().f6487f.getGlobalVisibleRect(rect);
        int i11 = rect.bottom;
        TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(new int[]{R$attr.xui_config_simple_list_item_height});
        AbstractC9979u.m20293f(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float dimension = typedArrayObtainStyledAttributes.getDimension(0, 5.0f);
        typedArrayObtainStyledAttributes.recycle();
        float length = (dimension * strArr.length) + view.getContext().getResources().getDimension(R$dimen.view_5);
        boolean z10 = ((float) (ScreenUtils.getScreenHeight() - i11)) > length;
        C5410c c5410cM2861z = new C5410c(view.getContext(), strArr).m2861z((int) view.getContext().getResources().getDimension(R$dimen.view_60), (int) length, new C5410c.b() { // from class: o2.e
            @Override // p047c9.C5410c.b
            /* renamed from: a */
            public final void mo2862a(C0087c c0087c, C0085a c0085a, int i12) {
                DocumentAdapter.m5448l(this.f24828a, arrayList, entity, c0087c, c0085a, i12);
            }
        });
        c5410cM2861z.m2859B(true);
        if (z10) {
            c5410cM2861z.m2856u(view);
        } else {
            c5410cM2861z.m2857v(view);
        }
    }

    /* renamed from: l */
    public static final void m5448l(DocumentAdapter documentAdapter, List list, FileEntity fileEntity, C0087c c0087c, C0085a c0085a, int i10) {
        InterfaceC9544p interfaceC9544p = documentAdapter.f6236a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(list.get(i10), fileEntity);
        }
    }

    /* renamed from: m */
    public static final C10786q m5449m(DocumentHolder documentHolder, DocumentAdapter documentAdapter, View it) {
        FileEntity entity;
        AbstractC9979u.m20294g(it, "it");
        int bindingAdapterPosition = documentHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1) {
            return C10786q.f26013a;
        }
        MultiModeFileEntity item = documentAdapter.getItem(bindingAdapterPosition);
        if (item == null || (entity = item.getEntity()) == null) {
            return C10786q.f26013a;
        }
        InterfaceC9544p interfaceC9544p = documentAdapter.f6236a;
        if (interfaceC9544p != null) {
            interfaceC9544p.invoke(AbstractC5985a.a.f6272b, entity);
        }
        return C10786q.f26013a;
    }

    /* renamed from: n */
    public static final void m5450n(DocumentAdapter documentAdapter, DocumentHolder documentHolder, View view) {
        FileEntity entity;
        InterfaceC9544p interfaceC9544p;
        MultiModeFileEntity item = documentAdapter.getItem(documentHolder.getBindingAdapterPosition());
        if (item == null || (entity = item.getEntity()) == null || (interfaceC9544p = documentAdapter.f6236a) == null) {
            return;
        }
        interfaceC9544p.invoke(AbstractC5985a.e.f6276b, entity);
    }

    /* renamed from: o */
    public static final boolean m5451o(DocumentHolder documentHolder, DocumentAdapter documentAdapter, View view) {
        MultiModeFileEntity item;
        FileEntity entity;
        InterfaceC9540l interfaceC9540l;
        int bindingAdapterPosition = documentHolder.getBindingAdapterPosition();
        if (bindingAdapterPosition != -1 && (item = documentAdapter.getItem(bindingAdapterPosition)) != null && (entity = item.getEntity()) != null && (interfaceC9540l = documentAdapter.f6237b) != null) {
            interfaceC9540l.invoke(entity);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final DocumentHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        MultiModeFileEntity item = getItem(i10);
        if (item == null) {
            return;
        }
        boolean zIsSelected = item.isSelected();
        boolean zIsInMultiSelectMode = item.isInMultiSelectMode();
        FileEntity entity = item.getEntity();
        holder.m5458a().f6487f.setOnClickListener(new View.OnClickListener() { // from class: o2.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocumentAdapter.m5447k(this.f24820c, holder, view);
            }
        });
        ConstraintLayout container = holder.m5458a().f6484c;
        AbstractC9979u.m20293f(container, "container");
        AbstractC9286b.m18309e(container, new InterfaceC9540l() { // from class: o2.b
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DocumentAdapter.m5449m(holder, this, (View) obj);
            }
        });
        holder.m5458a().f6488g.setOnClickListener(new View.OnClickListener() { // from class: o2.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DocumentAdapter.m5450n(this.f24824c, holder, view);
            }
        });
        holder.m5458a().f6484c.setOnLongClickListener(new View.OnLongClickListener() { // from class: o2.d
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return DocumentAdapter.m5451o(holder, this, view);
            }
        });
        holder.m5458a().f6486e.setImageResource(AbstractC9796n.f22990a.m19792d(entity.getFileType()));
        holder.m5459b(entity.getFileName());
        holder.m5462e(entity.getUpdateTime());
        holder.m5460c(entity.isFolder(), zIsSelected, zIsInMultiSelectMode);
        holder.m5461d(entity.getSyncStatus());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(DocumentHolder holder, int i10, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(payloads, "payloads");
        MultiModeFileEntity item = getItem(i10);
        if (item == null) {
            return;
        }
        boolean zIsSelected = item.isSelected();
        boolean zIsInMultiSelectMode = item.isInMultiSelectMode();
        FileEntity entity = item.getEntity();
        Object objM23946o0 = AbstractC10947g0.m23946o0(payloads);
        List list = objM23946o0 instanceof List ? (List) objM23946o0 : null;
        if (list != null) {
            List list2 = list.isEmpty() ? null : list;
            if (list2 != null) {
                for (Object obj : list2) {
                    if (obj instanceof AbstractC5986b.b) {
                        holder.m5460c(entity.isFolder(), zIsSelected, zIsInMultiSelectMode);
                    } else if (obj instanceof AbstractC5986b.c) {
                        holder.m5461d(entity.getSyncStatus());
                    } else if (obj instanceof AbstractC5986b.a) {
                        holder.m5459b(entity.getFileName());
                    } else if (obj instanceof AbstractC5986b.d) {
                        holder.m5462e(entity.getUpdateTime());
                    }
                }
                return;
            }
        }
        super.onBindViewHolder(holder, i10, payloads);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public DocumentHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemNoteListBinding itemNoteListBindingM5531a = ItemNoteListBinding.m5531a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemNoteListBindingM5531a, "inflate(...)");
        return new DocumentHolder(itemNoteListBindingM5531a);
    }

    /* renamed from: q */
    public final void m5455q(InterfaceC9544p interfaceC9544p) {
        this.f6236a = interfaceC9544p;
    }

    /* renamed from: r */
    public final void m5456r(InterfaceC9540l interfaceC9540l) {
        this.f6237b = interfaceC9540l;
    }
}
