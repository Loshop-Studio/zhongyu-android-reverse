package com.friday.paint.view.six;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;
import androidx.annotation.Keep;
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
import kotlin.jvm.internal.AbstractC9979u;
import p212k.AbstractC9761o;
import p212k.InterfaceC9756j;
import p285p1.C10599a;
import p285p1.InterfaceC10602d;
import p325rc.AbstractC10978w;
import p380w.AbstractC11630j;
import p380w.C11624d;
import p380w.C11627g;
import p380w.C11638r;
import p412y.InterfaceC11879a;

@StabilityInferred(parameters = 0)
@Keep
/* loaded from: classes4.dex */
public final class NewThumbnailListAdapter extends BaseQuickAdapter<NoteListEntity, BaseViewHolder> implements InterfaceC10602d {
    public static final int $stable = 8;

    /* renamed from: com.friday.paint.view.six.NewThumbnailListAdapter$a */
    public static final /* synthetic */ class C6307a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10266a;

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
            f10266a = iArr;
        }
    }

    public NewThumbnailListAdapter() {
        super(R$layout.res_item_thumbnail_list, null, 2, null);
    }

    @Override // p285p1.InterfaceC10602d
    public C10599a addDraggableModule(BaseQuickAdapter<?, ?> baseQuickAdapter) {
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

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public /* bridge */ /* synthetic */ void convert(BaseViewHolder baseViewHolder, Object obj, List list) {
        convert(baseViewHolder, (NoteListEntity) obj, (List<? extends Object>) list);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder holder, NoteListEntity item) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        holder.setText(R$id.tv_page_num, String.valueOf(getItemPosition(item) + 1)).setGone(R$id.iv_in_class, !item.getInClass());
        ImageView imageView = (ImageView) holder.getView(R$id.iv_thumbnail);
        imageView.setSelected(item.getSelected());
        File file = new File(item.getThumbnailFile());
        InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
        C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(file), imageView);
        aVarM25740q.m25689s(new C6309c(imageView, this));
        aVarM25740q.m25681j(new C6308b(imageView));
        CachePolicy cachePolicy = CachePolicy.f3887h;
        aVarM25740q.m25682k(cachePolicy);
        aVarM25740q.m25678f(cachePolicy);
        aVarM25740q.m25683l(cachePolicy);
        interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
    }

    public void convert(BaseViewHolder holder, NoteListEntity item, List<? extends Object> payloads) {
        AbstractC9979u.m20294g(holder, "holder");
        AbstractC9979u.m20294g(item, "item");
        AbstractC9979u.m20294g(payloads, "payloads");
        super.convert(holder, (Object) item, (List) payloads);
        holder.setText(R$id.tv_page_num, String.valueOf(getItemPosition(item) + 1));
        ImageView imageView = (ImageView) holder.getView(R$id.iv_thumbnail);
        for (Object obj : payloads) {
            if (obj instanceof PayloadKey) {
                int i10 = C6307a.f10266a[((PayloadKey) obj).ordinal()];
                if (i10 == 1) {
                    ((ImageView) holder.getView(R$id.iv_thumbnail)).setSelected(item.getSelected());
                } else if (i10 == 2) {
                    holder.setGone(R$id.iv_in_class, !item.getInClass());
                } else if (i10 == 3) {
                    File file = new File(item.getThumbnailFile());
                    InterfaceC5470e interfaceC5470eM3194a = C5480l.m3194a(imageView.getContext());
                    C11627g.a aVarM25740q = AbstractC11630j.m25740q(new C11627g.a(imageView.getContext()).m25676d(file), imageView);
                    aVarM25740q.m25689s(new C6311e(imageView, this));
                    aVarM25740q.m25681j(new C6310d(imageView));
                    CachePolicy cachePolicy = CachePolicy.f3887h;
                    aVarM25740q.m25682k(cachePolicy);
                    aVarM25740q.m25678f(cachePolicy);
                    aVarM25740q.m25683l(cachePolicy);
                    interfaceC5470eM3194a.mo2978c(aVarM25740q.m25675c());
                }
            }
        }
    }

    /* renamed from: com.friday.paint.view.six.NewThumbnailListAdapter$b */
    public static final class C6308b implements C11627g.d {

        /* renamed from: a */
        public final /* synthetic */ ImageView f10267a;

        public C6308b(ImageView imageView) {
            this.f10267a = imageView;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            this.f10267a.setImageDrawable(new ColorDrawable(-1));
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

    /* renamed from: com.friday.paint.view.six.NewThumbnailListAdapter$d */
    public static final class C6310d implements C11627g.d {

        /* renamed from: a */
        public final /* synthetic */ ImageView f10270a;

        public C6310d(ImageView imageView) {
            this.f10270a = imageView;
        }

        @Override // p380w.C11627g.d
        /* renamed from: d */
        public void mo3028d(C11627g c11627g, C11624d c11624d) {
            this.f10270a.setImageDrawable(new ColorDrawable(-1));
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

    /* renamed from: com.friday.paint.view.six.NewThumbnailListAdapter$c */
    public static final class C6309c implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f10268c;

        /* renamed from: d */
        public final /* synthetic */ NewThumbnailListAdapter f10269d;

        public C6309c(ImageView imageView, NewThumbnailListAdapter newThumbnailListAdapter) {
            this.f10268c = imageView;
            this.f10269d = newThumbnailListAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f10268c;
            Resources resources = this.f10269d.getContext().getResources();
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

    /* renamed from: com.friday.paint.view.six.NewThumbnailListAdapter$e */
    public static final class C6311e implements InterfaceC11879a {

        /* renamed from: c */
        public final /* synthetic */ ImageView f10271c;

        /* renamed from: d */
        public final /* synthetic */ NewThumbnailListAdapter f10272d;

        public C6311e(ImageView imageView, NewThumbnailListAdapter newThumbnailListAdapter) {
            this.f10271c = imageView;
            this.f10272d = newThumbnailListAdapter;
        }

        @Override // p412y.InterfaceC11879a
        /* renamed from: a */
        public void mo3279a(InterfaceC9756j interfaceC9756j) {
            ImageView imageView = this.f10271c;
            Resources resources = this.f10272d.getContext().getResources();
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
