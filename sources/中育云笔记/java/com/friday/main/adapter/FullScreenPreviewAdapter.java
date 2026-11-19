package com.friday.main.adapter;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.main.R$id;
import com.friday.main.R$layout;
import com.zykj.sketch.core.record.RecordControl;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p380w.AbstractC11630j;
import p380w.C11624d;
import p380w.C11627g;
import p380w.C11638r;
import p412y.InterfaceC11879a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class FullScreenPreviewAdapter extends BaseQuickAdapter<File, BaseViewHolder> {

    /* renamed from: a */
    public final ArrayList f9138a;

    @StabilityInferred(parameters = 0)
    public static final class FullScreenPreviewDiff extends DiffUtil.ItemCallback<File> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean areContentsTheSame(File oldItem, File newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean areItemsTheSame(File oldItem, File newItem) {
            AbstractC9979u.m20294g(oldItem, "oldItem");
            AbstractC9979u.m20294g(newItem, "newItem");
            return AbstractC9979u.m20289b(oldItem.getAbsolutePath(), newItem.getAbsolutePath());
        }
    }

    public FullScreenPreviewAdapter() {
        super(R$layout.item_full_preview_thumbnail, null, 2, null);
        this.f9138a = new ArrayList();
    }

    /* renamed from: j */
    public final void m6919j() {
        this.f9138a.clear();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void convert(BaseViewHolder holder, File item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        View view = holder.getView(R$id.sdv_thumbnail);
        AbstractC9979u.m20292e(view, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) view;
        if (!item.isDirectory()) {
            InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
            C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(item), imageView);
            aVarM25740q.m25689s(new C6186d(imageView, this));
            aVarM25740q.m25681j(new C6185c(item));
            CachePolicy cachePolicy = CachePolicy.f3887h;
            aVarM25740q.m25682k(cachePolicy);
            aVarM25740q.m25678f(cachePolicy);
            aVarM25740q.m25683l(cachePolicy);
            interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
            return;
        }
        File file = new File(item.getAbsolutePath() + File.separator + RecordControl.thumbnailFileName);
        InterfaceC5470e interfaceC5470eM3194a2 = C5480l.m3194a(imageView.getContext());
        C11627g.a aVarM25740q2 = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(file), imageView);
        aVarM25740q2.m25689s(new C6184b(imageView, this));
        aVarM25740q2.m25681j(new C6183a(item));
        CachePolicy cachePolicy2 = CachePolicy.f3887h;
        aVarM25740q2.m25682k(cachePolicy2);
        aVarM25740q2.m25678f(cachePolicy2);
        aVarM25740q2.m25683l(cachePolicy2);
        interfaceC5470eM3194a2.mo2978c(aVarM25740q2.m25675c());
    }

    /* renamed from: l */
    public final void m6921l() {
        if (this.f9138a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f9138a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            notifyItemChanged(((Number) obj).intValue());
        }
        this.f9138a.clear();
    }

    /* renamed from: com.friday.main.adapter.FullScreenPreviewAdapter$a */
    public static final class C6183a implements C11627g.d {

        /* renamed from: b */
        public final /* synthetic */ File f9140b;

        public C6183a(File file) {
            this.f9140b = file;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            FullScreenPreviewAdapter.this.f9138a.add(Integer.valueOf(FullScreenPreviewAdapter.this.getData().indexOf(this.f9140b)));
        }

        @Override // p380w.C11627g.d
        /* renamed from: c */
        public void mo3027c(C11627g c11627g, C11638r c11638r) {
        }

        @Override // p380w.C11627g.d
        /* renamed from: a */
        public void mo3025a(C11627g c11627g) {
        }

        @Override // p380w.C11627g.d
        /* renamed from: b */
        public void mo3026b(C11627g c11627g) {
        }
    }

    /* renamed from: com.friday.main.adapter.FullScreenPreviewAdapter$c */
    public static final class C6185c implements C11627g.d {

        /* renamed from: b */
        public final /* synthetic */ File f9144b;

        public C6185c(File file) {
            this.f9144b = file;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            FullScreenPreviewAdapter.this.f9138a.add(Integer.valueOf(FullScreenPreviewAdapter.this.getData().indexOf(this.f9144b)));
        }

        @Override // p380w.C11627g.d
        /* renamed from: c */
        public void mo3027c(C11627g c11627g, C11638r c11638r) {
        }

        @Override // p380w.C11627g.d
        /* renamed from: a */
        public void mo3025a(C11627g c11627g) {
        }

        @Override // p380w.C11627g.d
        /* renamed from: b */
        public void mo3026b(C11627g c11627g) {
        }
    }

    /* renamed from: com.friday.main.adapter.FullScreenPreviewAdapter$b */
    public static final class C6184b implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f9141c;

        /* renamed from: d */
        public final /* synthetic */ FullScreenPreviewAdapter f9142d;

        public C6184b(ImageView imageView, FullScreenPreviewAdapter fullScreenPreviewAdapter) {
            this.f9141c = imageView;
            this.f9142d = fullScreenPreviewAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f9141c;
            Resources resources = this.f9142d.getContext().getResources();
            AbstractC9979u.m20293f(resources, "getResources(...)");
            imageView.setImageDrawable(AbstractC9761o.m19678a(interfaceC9756j, resources));
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: b */
        public void mo3280b(InterfaceC9756j interfaceC9756j) {
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: c */
        public void mo3281c(InterfaceC9756j interfaceC9756j) {
        }
    }

    /* renamed from: com.friday.main.adapter.FullScreenPreviewAdapter$d */
    public static final class C6186d implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f9145c;

        /* renamed from: d */
        public final /* synthetic */ FullScreenPreviewAdapter f9146d;

        public C6186d(ImageView imageView, FullScreenPreviewAdapter fullScreenPreviewAdapter) {
            this.f9145c = imageView;
            this.f9146d = fullScreenPreviewAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f9145c;
            Resources resources = this.f9146d.getContext().getResources();
            AbstractC9979u.m20293f(resources, "getResources(...)");
            imageView.setImageDrawable(AbstractC9761o.m19678a(interfaceC9756j, resources));
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: b */
        public void mo3280b(InterfaceC9756j interfaceC9756j) {
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: c */
        public void mo3281c(InterfaceC9756j interfaceC9756j) {
        }
    }
}
