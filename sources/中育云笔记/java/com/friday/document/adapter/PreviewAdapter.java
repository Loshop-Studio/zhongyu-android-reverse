package com.friday.document.adapter;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.blankj.utilcode.util.Utils;
import com.friday.common.widget.ScaleImageView;
import com.friday.document.databinding.ItemNoteThumbnailBinding;
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
/* loaded from: classes3.dex */
public final class PreviewAdapter extends ListAdapter<File, PreviewHolder> {

    /* renamed from: a */
    public final ArrayList f6243a;

    public PreviewAdapter() {
        super(new DiffUtil.ItemCallback<File>() { // from class: com.friday.document.adapter.PreviewAdapter.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public boolean areContentsTheSame(File oldItem, File newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem.getAbsolutePath(), newItem.getAbsolutePath());
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public boolean areItemsTheSame(File oldItem, File newItem) {
                AbstractC9979u.m20294g(oldItem, "oldItem");
                AbstractC9979u.m20294g(newItem, "newItem");
                return AbstractC9979u.m20289b(oldItem.getAbsolutePath(), newItem.getAbsolutePath());
            }
        });
        this.f6243a = new ArrayList();
    }

    /* renamed from: a */
    public final void m5468a() {
        this.f6243a.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(PreviewHolder holder, int i10) {
        AbstractC9979u.m20294g(holder, "holder");
        File item = getItem(i10);
        AbstractC9979u.m20293f(item, "getItem(...)");
        holder.m5475b(item, this.f6243a, i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public PreviewHolder onCreateViewHolder(ViewGroup parent, int i10) {
        AbstractC9979u.m20294g(parent, "parent");
        ItemNoteThumbnailBinding itemNoteThumbnailBindingM5533a = ItemNoteThumbnailBinding.m5533a(LayoutInflater.from(parent.getContext()), parent, false);
        AbstractC9979u.m20293f(itemNoteThumbnailBindingM5533a, "inflate(...)");
        return new PreviewHolder(itemNoteThumbnailBindingM5533a);
    }

    /* renamed from: d */
    public final void m5471d() {
        if (this.f6243a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f6243a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            notifyItemChanged(((Number) obj).intValue());
        }
        this.f6243a.clear();
    }

    @StabilityInferred(parameters = 0)
    public static final class PreviewHolder extends RecyclerView.ViewHolder {

        /* renamed from: c */
        public final ItemNoteThumbnailBinding f6244c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PreviewHolder(ItemNoteThumbnailBinding dataBinding) {
            super(dataBinding.getRoot());
            AbstractC9979u.m20294g(dataBinding, "dataBinding");
            this.f6244c = dataBinding;
        }

        /* renamed from: b */
        public final void m5475b(File file, ArrayList imageErrorList, int i10) {
            AbstractC9979u.m20294g(file, "file");
            AbstractC9979u.m20294g(imageErrorList, "imageErrorList");
            if (file.isFile()) {
                ScaleImageView sdvThumbnail = this.f6244c.f6495d;
                AbstractC9979u.m20293f(sdvThumbnail, "sdvThumbnail");
                InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(sdvThumbnail.getContext());
                C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(sdvThumbnail.getContext()).m25676d(file), sdvThumbnail);
                aVarM25740q.m25689s(new C5981b());
                aVarM25740q.m25681j(new C5980a(imageErrorList, i10));
                CachePolicy cachePolicy = CachePolicy.f3887h;
                aVarM25740q.m25682k(cachePolicy);
                aVarM25740q.m25678f(cachePolicy);
                aVarM25740q.m25683l(cachePolicy);
                interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
                return;
            }
            String str = file.getAbsolutePath() + File.separator + RecordControl.thumbnailFileName;
            ScaleImageView sdvThumbnail2 = this.f6244c.f6495d;
            AbstractC9979u.m20293f(sdvThumbnail2, "sdvThumbnail");
            File file2 = new File(str);
            InterfaceC5470e interfaceC5470eM3194a2 = C5480l.m3194a(sdvThumbnail2.getContext());
            C11627g.a aVarM25740q2 = AbstractC11630j.m25740q(new C11627g.a(sdvThumbnail2.getContext()).m25676d(file2), sdvThumbnail2);
            aVarM25740q2.m25689s(new C5983d());
            aVarM25740q2.m25681j(new C5982c(imageErrorList, i10));
            CachePolicy cachePolicy2 = CachePolicy.f3887h;
            aVarM25740q2.m25682k(cachePolicy2);
            aVarM25740q2.m25678f(cachePolicy2);
            aVarM25740q2.m25683l(cachePolicy2);
            interfaceC5470eM3194a2.mo2978c(aVarM25740q2.m25675c());
        }

        /* renamed from: com.friday.document.adapter.PreviewAdapter$PreviewHolder$a */
        public static final class C5980a implements C11627g.d {

            /* renamed from: a */
            public final /* synthetic */ ArrayList f6245a;

            /* renamed from: b */
            public final /* synthetic */ int f6246b;

            public C5980a(ArrayList arrayList, int i10) {
                this.f6245a = arrayList;
                this.f6246b = i10;
            }

            @Override // p380w.C11627g.d
            /* renamed from: d */
            public void mo3028d(C11627g c11627g, C11624d c11624d) {
                this.f6245a.add(Integer.valueOf(this.f6246b));
            }

            @Override // p380w.C11627g.d
            /* renamed from: a */
            public void mo3025a(C11627g c11627g) {
            }

            @Override // p380w.C11627g.d
            /* renamed from: b */
            public void mo3026b(C11627g c11627g) {
            }

            @Override // p380w.C11627g.d
            /* renamed from: c */
            public void mo3027c(C11627g c11627g, C11638r c11638r) {
            }
        }

        /* renamed from: com.friday.document.adapter.PreviewAdapter$PreviewHolder$b */
        public static final class C5981b implements InterfaceC11879a {
            public C5981b() {
            }

            @Override // p412y.InterfaceC11879a
            /* renamed from: a */
            public void mo3279a(InterfaceC9756j interfaceC9756j) {
                ScaleImageView scaleImageView = PreviewHolder.this.f6244c.f6495d;
                Resources resources = Utils.getApp().getResources();
                AbstractC9979u.m20293f(resources, "getResources(...)");
                scaleImageView.setImageDrawable(AbstractC9761o.m19678a(interfaceC9756j, resources));
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

        /* renamed from: com.friday.document.adapter.PreviewAdapter$PreviewHolder$c */
        public static final class C5982c implements C11627g.d {

            /* renamed from: a */
            public final /* synthetic */ ArrayList f6248a;

            /* renamed from: b */
            public final /* synthetic */ int f6249b;

            public C5982c(ArrayList arrayList, int i10) {
                this.f6248a = arrayList;
                this.f6249b = i10;
            }

            @Override // p380w.C11627g.d
            /* renamed from: d */
            public void mo3028d(C11627g c11627g, C11624d c11624d) {
                this.f6248a.add(Integer.valueOf(this.f6249b));
            }

            @Override // p380w.C11627g.d
            /* renamed from: a */
            public void mo3025a(C11627g c11627g) {
            }

            @Override // p380w.C11627g.d
            /* renamed from: b */
            public void mo3026b(C11627g c11627g) {
            }

            @Override // p380w.C11627g.d
            /* renamed from: c */
            public void mo3027c(C11627g c11627g, C11638r c11638r) {
            }
        }

        /* renamed from: com.friday.document.adapter.PreviewAdapter$PreviewHolder$d */
        public static final class C5983d implements InterfaceC11879a {
            public C5983d() {
            }

            @Override // p412y.InterfaceC11879a
            /* renamed from: a */
            public void mo3279a(InterfaceC9756j interfaceC9756j) {
                ScaleImageView scaleImageView = PreviewHolder.this.f6244c.f6495d;
                Resources resources = Utils.getApp().getResources();
                AbstractC9979u.m20293f(resources, "getResources(...)");
                scaleImageView.setImageDrawable(AbstractC9761o.m19678a(interfaceC9756j, resources));
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
}
