package p323ra;

import android.graphics.Color;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ScreenUtils;
import com.blankj.utilcode.util.Utils;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.entity.NoteBean;
import com.zykj.cloudhelper.R$dimen;
import com.zykj.cloudhelper.R$drawable;
import com.zykj.cloudhelper.R$id;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p215k2.AbstractC9796n;
import p255n1.AbstractC10313b;
import p299q1.AbstractC10718a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import ua.C11376a;

/* renamed from: ra.b */
/* loaded from: classes6.dex */
public final class C10923b extends AbstractC10718a {

    /* renamed from: e */
    public final int f26386e;

    /* renamed from: f */
    public final int f26387f;

    /* renamed from: g */
    public final int f26388g = (int) (ScreenUtils.getScreenWidth() - Utils.getApp().getResources().getDimension(R$dimen.view_18));

    public C10923b(int i10, int i11) {
        this.f26386e = i10;
        this.f26387f = i11;
    }

    /* renamed from: v */
    private final void m23818v(BaseViewHolder baseViewHolder, AbstractC10313b abstractC10313b, boolean z10) {
        AbstractC9979u.m20292e(abstractC10313b, "null cannot be cast to non-null type com.zykj.cloudhelper.entity.NoteHelperNode");
        C11376a c11376a = (C11376a) abstractC10313b;
        ImageView imageView = (ImageView) baseViewHolder.getView(R$id.iv_status);
        if (c11376a.m21518b()) {
            if (z10) {
                ViewCompat.animate(imageView).setDuration(200L).setInterpolator(new DecelerateInterpolator()).rotation(0.0f).start();
            } else {
                imageView.setRotation(0.0f);
            }
        } else if (z10) {
            ViewCompat.animate(imageView).setDuration(200L).setInterpolator(new DecelerateInterpolator()).rotation(90.0f).start();
        } else {
            imageView.setRotation(90.0f);
        }
        imageView.setSelected(c11376a.m21518b());
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: g */
    public int mo4708g() {
        return this.f26386e;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: h */
    public int mo4709h() {
        return this.f26387f;
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void mo4702a(BaseViewHolder helper, AbstractC10313b item) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(item, "item");
        if (item instanceof C11376a) {
            int dimension = (int) m4707f().getResources().getDimension(R$dimen.view_18);
            ViewGroup.LayoutParams layoutParams = ((LinearLayout) helper.getView(R$id.ll_item)).getLayoutParams();
            AbstractC9979u.m20292e(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = this.f26388g;
            C11376a c11376a = (C11376a) item;
            layoutParams2.setMargins(c11376a.m25324e() * dimension, 0, 0, 0);
            ((LinearLayout) helper.getView(R$id.ll_item)).setLayoutParams(layoutParams2);
            NoteBean noteBeanM25323d = c11376a.m25323d();
            ImageView imageView = (ImageView) helper.getView(R$id.iv_status);
            ImageView imageView2 = (ImageView) helper.getView(R$id.iv_icon);
            helper.setText(R$id.tv_file_name, noteBeanM25323d.getFileName());
            imageView2.setImageResource(AbstractC9796n.f22990a.m19792d(noteBeanM25323d.getType()));
            if (!AbstractC9979u.m20289b(noteBeanM25323d.getType(), "0")) {
                imageView.setVisibility(4);
                helper.itemView.setBackgroundColor(-1);
                ((TextView) helper.getView(R$id.tv_file_name)).setTextColor(Color.parseColor("#90999999"));
                return;
            }
            imageView.setVisibility(0);
            List listMo21520a = c11376a.mo21520a();
            if (listMo21520a == null || listMo21520a.isEmpty()) {
                imageView.setImageResource(0);
            } else {
                imageView.setImageResource(R$drawable.selector_item_expand_collapse);
                imageView.setSelected(c11376a.m21518b());
            }
            if (noteBeanM25323d.isSelected()) {
                helper.itemView.setBackgroundColor(Color.parseColor("#30999999"));
            } else {
                helper.itemView.setBackgroundColor(-1);
            }
            ((TextView) helper.getView(R$id.tv_file_name)).setTextColor(Color.parseColor("#ff343434"));
        }
    }

    @Override // com.chad.library.adapter.base.provider.BaseItemProvider
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo4703b(BaseViewHolder helper, AbstractC10313b item, List payloads) {
        AbstractC9979u.m20294g(helper, "helper");
        AbstractC9979u.m20294g(item, "item");
        AbstractC9979u.m20294g(payloads, "payloads");
        for (Object obj : payloads) {
            if ((obj instanceof Integer) && AbstractC9979u.m20289b(obj, Integer.valueOf(IjkMediaMeta.FF_PROFILE_H264_HIGH_10))) {
                m23818v(helper, item, true);
            }
        }
    }
}
