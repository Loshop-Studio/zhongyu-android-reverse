package com.luck.picture.lib.adapter.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import p260n6.C10323b;
import p260n6.InterfaceC10325d;
import p304q6.InterfaceC10744d;
import p403x6.InterfaceC11807j;

/* loaded from: classes5.dex */
public class PreviewVideoHolder extends BasePreviewHolder {

    /* renamed from: j */
    public ImageView f12242j;

    /* renamed from: k */
    public ProgressBar f12243k;

    /* renamed from: l */
    public View f12244l;

    /* renamed from: m */
    public boolean f12245m;

    /* renamed from: n */
    public final InterfaceC10744d f12246n;

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewVideoHolder$a */
    public class C7466a implements InterfaceC11807j {
        public C7466a() {
        }

        @Override // p403x6.InterfaceC11807j
        /* renamed from: a */
        public void mo9210a(View view, float f10, float f11) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewVideoHolder.this.f12173i;
            if (interfaceC7442a != null) {
                interfaceC7442a.mo9104a();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewVideoHolder$b */
    public class ViewOnLongClickListenerC7467b implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12248c;

        public ViewOnLongClickListenerC7467b(LocalMedia localMedia) {
            this.f12248c = localMedia;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = PreviewVideoHolder.this.f12173i;
            if (interfaceC7442a == null) {
                return false;
            }
            interfaceC7442a.mo9105b(this.f12248c);
            return false;
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewVideoHolder$c */
    public class ViewOnClickListenerC7468c implements View.OnClickListener {
        public ViewOnClickListenerC7468c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f12171g.f12321L0) {
                previewVideoHolder.m9227p();
            } else {
                previewVideoHolder.m9233w();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewVideoHolder$d */
    public class ViewOnClickListenerC7469d implements View.OnClickListener {
        public ViewOnClickListenerC7469d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PreviewVideoHolder previewVideoHolder = PreviewVideoHolder.this;
            if (previewVideoHolder.f12171g.f12321L0) {
                previewVideoHolder.m9227p();
                return;
            }
            BasePreviewHolder.InterfaceC7442a interfaceC7442a = previewVideoHolder.f12173i;
            if (interfaceC7442a != null) {
                interfaceC7442a.mo9104a();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.PreviewVideoHolder$e */
    public class C7470e implements InterfaceC10744d {
        public C7470e() {
        }

        @Override // p304q6.InterfaceC10744d
        /* renamed from: a */
        public void mo9234a() {
            PreviewVideoHolder.this.m9226u();
        }

        @Override // p304q6.InterfaceC10744d
        /* renamed from: b */
        public void mo9235b() {
            PreviewVideoHolder.this.m9231t();
        }

        @Override // p304q6.InterfaceC10744d
        /* renamed from: c */
        public void mo9236c() {
            PreviewVideoHolder.this.m9231t();
        }
    }

    public PreviewVideoHolder(View view) {
        super(view);
        this.f12245m = false;
        this.f12246n = new C7470e();
        this.f12242j = (ImageView) view.findViewById(R$id.iv_play_video);
        this.f12243k = (ProgressBar) view.findViewById(R$id.progress);
        this.f12242j.setVisibility(PictureSelectionConfig.m9328c().f12322M ? 8 : 0);
        if (PictureSelectionConfig.f12294O0 == null) {
            PictureSelectionConfig.f12294O0 = new C10323b();
        }
        View viewMo21536a = PictureSelectionConfig.f12294O0.mo21536a(view.getContext());
        this.f12244l = viewMo21536a;
        if (viewMo21536a == null) {
            throw new NullPointerException("onCreateVideoPlayer cannot be empty,Please implement " + InterfaceC10325d.class);
        }
        if (viewMo21536a.getLayoutParams() == null) {
            this.f12244l.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.indexOfChild(this.f12244l) != -1) {
            viewGroup.removeView(this.f12244l);
        }
        viewGroup.addView(this.f12244l, 0);
        this.f12244l.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void m9226u() {
        this.f12243k.setVisibility(8);
        this.f12242j.setVisibility(8);
        this.f12172h.setVisibility(8);
        this.f12244l.setVisibility(0);
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: a */
    public void mo9161a(LocalMedia localMedia, int i10) {
        super.mo9161a(localMedia, i10);
        mo9171l(localMedia);
        this.f12242j.setOnClickListener(new ViewOnClickListenerC7468c());
        this.itemView.setOnClickListener(new ViewOnClickListenerC7469d());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: b */
    public void mo9162b(View view) {
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: e */
    public void mo9164e(LocalMedia localMedia, int i10, int i11) {
        if (PictureSelectionConfig.f12293N0 != null) {
            String strM9371g = localMedia.m9371g();
            if (i10 == -1 && i11 == -1) {
                PictureSelectionConfig.f12293N0.mo19804b(this.itemView.getContext(), strM9371g, this.f12172h);
            } else {
                PictureSelectionConfig.f12293N0.mo19808f(this.itemView.getContext(), this.f12172h, strM9371g, i10, i11);
            }
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: f */
    public void mo9165f() {
        this.f12172h.setOnViewTapListener(new C7466a());
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: g */
    public void mo9166g(LocalMedia localMedia) {
        this.f12172h.setOnLongClickListener(new ViewOnLongClickListenerC7467b(localMedia));
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: h */
    public void mo9167h() {
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        if (interfaceC10325d != null) {
            interfaceC10325d.mo21542g(this.f12244l);
            PictureSelectionConfig.f12294O0.mo21543h(this.f12246n);
        }
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: i */
    public void mo9168i() {
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        if (interfaceC10325d != null) {
            interfaceC10325d.mo21540e(this.f12244l);
            PictureSelectionConfig.f12294O0.mo21539d(this.f12246n);
        }
        m9231t();
    }

    @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder
    /* renamed from: l */
    public void mo9171l(LocalMedia localMedia) {
        super.mo9171l(localMedia);
        if (this.f12171g.f12322M || this.f12167c >= this.f12168d) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12244l.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = this.f12167c;
            layoutParams2.height = this.f12169e;
            layoutParams2.gravity = 17;
            return;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams3.width = this.f12167c;
            layoutParams3.height = this.f12169e;
            layoutParams3.addRule(13);
            return;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams4.width = this.f12167c;
            layoutParams4.height = this.f12169e;
            layoutParams4.gravity = 17;
            return;
        }
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams5).width = this.f12167c;
            ((ViewGroup.MarginLayoutParams) layoutParams5).height = this.f12169e;
            layoutParams5.topToTop = 0;
            layoutParams5.bottomToBottom = 0;
        }
    }

    /* renamed from: p */
    public final void m9227p() {
        if (!this.f12245m) {
            m9233w();
        } else if (m9228q()) {
            m9229r();
        } else {
            m9230s();
        }
    }

    /* renamed from: q */
    public boolean m9228q() {
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        return interfaceC10325d != null && interfaceC10325d.mo21545j(this.f12244l);
    }

    /* renamed from: r */
    public final void m9229r() {
        this.f12242j.setVisibility(0);
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        if (interfaceC10325d != null) {
            interfaceC10325d.mo21544i(this.f12244l);
        }
    }

    /* renamed from: s */
    public final void m9230s() {
        this.f12242j.setVisibility(8);
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        if (interfaceC10325d != null) {
            interfaceC10325d.mo21537b(this.f12244l);
        }
    }

    /* renamed from: t */
    public final void m9231t() {
        this.f12245m = false;
        this.f12242j.setVisibility(0);
        this.f12243k.setVisibility(8);
        this.f12172h.setVisibility(0);
        this.f12244l.setVisibility(8);
        BasePreviewHolder.InterfaceC7442a interfaceC7442a = this.f12173i;
        if (interfaceC7442a != null) {
            interfaceC7442a.mo9106c(null);
        }
    }

    /* renamed from: v */
    public void m9232v() {
        InterfaceC10325d interfaceC10325d = PictureSelectionConfig.f12294O0;
        if (interfaceC10325d != null) {
            interfaceC10325d.mo21539d(this.f12246n);
            PictureSelectionConfig.f12294O0.mo21538c(this.f12244l);
        }
    }

    /* renamed from: w */
    public void m9233w() {
        if (this.f12244l == null) {
            throw new NullPointerException("VideoPlayer cannot be empty,Please implement " + InterfaceC10325d.class);
        }
        if (PictureSelectionConfig.f12294O0 != null) {
            this.f12243k.setVisibility(0);
            this.f12242j.setVisibility(8);
            this.f12173i.mo9106c(this.f12170f.m9391q());
            this.f12245m = true;
            PictureSelectionConfig.f12294O0.mo21541f(this.f12244l, this.f12170f);
        }
    }
}
