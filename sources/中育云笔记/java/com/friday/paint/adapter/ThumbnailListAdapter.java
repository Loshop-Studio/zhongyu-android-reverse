package com.friday.paint.adapter;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import coil3.C5480l;
import coil3.InterfaceC5470e;
import coil3.request.CachePolicy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.PayloadKey;
import com.friday.paint.R$id;
import com.friday.paint.R$layout;
import com.friday.paint.model.NoteListEntity;
import java.io.File;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p285p1.C10599a;
import p285p1.InterfaceC10602d;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p380w.AbstractC11630j;
import p380w.C11624d;
import p380w.C11627g;
import p380w.C11638r;
import p412y.InterfaceC11879a;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ThumbnailListAdapter extends BaseQuickAdapter<NoteListEntity, BaseViewHolder> implements InterfaceC10602d {

    /* renamed from: com.friday.paint.adapter.ThumbnailListAdapter$a */
    public static final /* synthetic */ class C6232a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9763a;

        static {
            int[] iArr = new int[PayloadKey.values().length];
            try {
                iArr[PayloadKey.SELECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PayloadKey.IN_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PayloadKey.THUMBNAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9763a = iArr;
        }
    }

    public ThumbnailListAdapter() {
        super(R$layout.item_thumbnail_list, null, 2, null);
    }

    @Override // p285p1.InterfaceC10602d
    public C10599a addDraggableModule(BaseQuickAdapter baseQuickAdapter) {
        return super.addDraggableModule(baseQuickAdapter);
    }

    public final void updateSelectedItem(int i10) {
        int i11 = 0;
        for (Object obj : getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            NoteListEntity noteListEntity = (NoteListEntity) obj;
            boolean z10 = i11 == i10;
            if (noteListEntity.getSelected() != z10) {
                noteListEntity.setSelected(z10);
                notifyItemChanged(i11, PayloadKey.SELECTED);
            }
            i11 = i12;
        }
    }

    public final void updateThumbnailExceptCurrent(int i10) {
        int i11 = 0;
        for (Object obj : getData()) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC10978w.m24145w();
            }
            if (i11 != i10) {
                notifyItemChanged(i11, PayloadKey.THUMBNAIL);
            }
            i11 = i12;
        }
    }

    @Override // Bind the page JPEG from disk to the sidebar ImageView through Coil.
    public void convert(BaseViewHolder holder, NoteListEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setGone(R$id.iv_in_class, !item.getInClass()).setText(R$id.tv_page_num, String.valueOf(getItemPosition(item) + 1));
        ImageView imageView = (ImageView) holder.getView(R$id.iv_thumbnail);
        imageView.setSelected(item.getSelected());
        File file = new File(item.getThumbnailFile());
        InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
        C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(file), imageView);
        aVarM25740q.m25689s(new C6234c(imageView, this));
        aVarM25740q.m25681j(new C6233b(imageView));
        CachePolicy cachePolicy = CachePolicy.f3887h;
        aVarM25740q.m25682k(cachePolicy);
        aVarM25740q.m25678f(cachePolicy);
        aVarM25740q.m25683l(cachePolicy);
        interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, NoteListEntity item, List payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        AbstractC9979u.m20294g(payloads, "payloads");
        super.convert(holder, (Object) item, payloads);
        holder.setText(R$id.tv_page_num, String.valueOf(getItemPosition(item) + 1));
        ImageView imageView = (ImageView) holder.getView(R$id.iv_thumbnail);
        for (Object obj : payloads) {
            if (obj instanceof PayloadKey) {
                int i10 = C6232a.f9763a[((PayloadKey) obj).ordinal()];
                if (i10 == 1) {
                    ((ImageView) holder.getView(R$id.iv_thumbnail)).setSelected(item.getSelected());
                    C10786q c10786q = C10786q.f26013a;
                } else if (i10 == 2) {
                    holder.setGone(R$id.iv_in_class, !item.getInClass());
                } else if (i10 == 3) {
                    File file = new File(item.getThumbnailFile());
                    InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
                    C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(file), imageView);
                    aVarM25740q.m25689s(new C6236e(imageView, this));
                    aVarM25740q.m25681j(new C6235d(imageView));
                    CachePolicy cachePolicy = CachePolicy.f3887h;
                    aVarM25740q.m25682k(cachePolicy);
                    aVarM25740q.m25678f(cachePolicy);
                    aVarM25740q.m25683l(cachePolicy);
                    interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    /* renamed from: com.friday.paint.adapter.ThumbnailListAdapter$b */
    public static final class C6233b implements C11627g.d {

        /* renamed from: a */
        public final /* synthetic */ ImageView f9764a;

        public C6233b(ImageView imageView) {
            this.f9764a = imageView;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            this.f9764a.setImageDrawable(new ColorDrawable(-1));
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

    /* renamed from: com.friday.paint.adapter.ThumbnailListAdapter$d */
    public static final class C6235d implements C11627g.d {

        /* renamed from: a */
        public final /* synthetic */ ImageView f9767a;

        public C6235d(ImageView imageView) {
            this.f9767a = imageView;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            this.f9767a.setImageDrawable(new ColorDrawable(-1));
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

    /* renamed from: com.friday.paint.adapter.ThumbnailListAdapter$c */
    public static final class C6234c implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f9765c;

        /* renamed from: d */
        public final /* synthetic */ ThumbnailListAdapter f9766d;

        public C6234c(ImageView imageView, ThumbnailListAdapter thumbnailListAdapter) {
            this.f9765c = imageView;
            this.f9766d = thumbnailListAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f9765c;
            Resources resources = this.f9766d.getContext().getResources();
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

    /* renamed from: com.friday.paint.adapter.ThumbnailListAdapter$e */
    public static final class C6236e implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f9768c;

        /* renamed from: d */
        public final /* synthetic */ ThumbnailListAdapter f9769d;

        public C6236e(ImageView imageView, ThumbnailListAdapter thumbnailListAdapter) {
            this.f9768c = imageView;
            this.f9769d = thumbnailListAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f9768c;
            Resources resources = this.f9769d.getContext().getResources();
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
