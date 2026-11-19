package com.luck.picture.lib.adapter.holder;

import android.content.Context;
import android.graphics.ColorFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.luck.picture.lib.R$color;
import com.luck.picture.lib.R$id;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.style.SelectMainStyle;
import p008a7.AbstractC0069b;
import p008a7.AbstractC0082o;
import p008a7.AbstractC0084q;
import p260n6.InterfaceC10322a;
import p359u6.AbstractC11370a;

/* loaded from: classes5.dex */
public class BaseRecyclerMediaHolder extends RecyclerView.ViewHolder {

    /* renamed from: c */
    public ImageView f12174c;

    /* renamed from: d */
    public TextView f12175d;

    /* renamed from: e */
    public View f12176e;

    /* renamed from: f */
    public Context f12177f;

    /* renamed from: g */
    public PictureSelectionConfig f12178g;

    /* renamed from: h */
    public boolean f12179h;

    /* renamed from: i */
    public boolean f12180i;

    /* renamed from: j */
    public ColorFilter f12181j;

    /* renamed from: k */
    public ColorFilter f12182k;

    /* renamed from: l */
    public ColorFilter f12183l;

    /* renamed from: m */
    public PictureImageGridAdapter.InterfaceC7441b f12184m;

    /* renamed from: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder$a */
    public class ViewOnClickListenerC7443a implements View.OnClickListener {
        public ViewOnClickListenerC7443a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseRecyclerMediaHolder.this.f12176e.performClick();
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder$b */
    public class ViewOnClickListenerC7444b implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12186c;

        /* renamed from: d */
        public final /* synthetic */ int f12187d;

        public ViewOnClickListenerC7444b(LocalMedia localMedia, int i10) {
            this.f12186c = localMedia;
            this.f12187d = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iMo8993a;
            if (this.f12186c.m9349J() || BaseRecyclerMediaHolder.this.f12184m == null || (iMo8993a = BaseRecyclerMediaHolder.this.f12184m.mo8993a(BaseRecyclerMediaHolder.this.f12175d, this.f12187d, this.f12186c)) == -1) {
                return;
            }
            if (iMo8993a == 0) {
                BaseRecyclerMediaHolder baseRecyclerMediaHolder = BaseRecyclerMediaHolder.this;
                if (baseRecyclerMediaHolder.f12178g.f12309F0) {
                    InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                    AbstractC0069b.m144b(baseRecyclerMediaHolder.f12174c);
                }
            } else if (iMo8993a == 1 && BaseRecyclerMediaHolder.this.f12178g.f12309F0) {
                InterfaceC10322a interfaceC10322a2 = PictureSelectionConfig.f12293N0;
            }
            BaseRecyclerMediaHolder baseRecyclerMediaHolder2 = BaseRecyclerMediaHolder.this;
            baseRecyclerMediaHolder2.m9179j(baseRecyclerMediaHolder2.m9177g(this.f12186c));
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder$c */
    public class ViewOnLongClickListenerC7445c implements View.OnLongClickListener {

        /* renamed from: c */
        public final /* synthetic */ int f12189c;

        public ViewOnLongClickListenerC7445c(int i10) {
            this.f12189c = i10;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (BaseRecyclerMediaHolder.this.f12184m == null) {
                return false;
            }
            BaseRecyclerMediaHolder.this.f12184m.mo8996d(view, this.f12189c);
            return false;
        }
    }

    /* renamed from: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder$d */
    public class ViewOnClickListenerC7446d implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ LocalMedia f12191c;

        /* renamed from: d */
        public final /* synthetic */ int f12192d;

        public ViewOnClickListenerC7446d(LocalMedia localMedia, int i10) {
            this.f12191c = localMedia;
            this.f12192d = i10;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        
            if (r4.f12353l != 1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r4) {
            /*
                r3 = this;
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f12191c
                boolean r4 = r4.m9349J()
                if (r4 != 0) goto L78
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.adapter.PictureImageGridAdapter$b r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.m9172a(r4)
                if (r4 != 0) goto L11
                goto L78
            L11:
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f12191c
                java.lang.String r4 = r4.m9397t()
                boolean r4 = p235l6.AbstractC10149c.m21179h(r4)
                if (r4 == 0) goto L25
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f12178g
                boolean r4 = r4.f12314I
                if (r4 != 0) goto L67
            L25:
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f12178g
                boolean r4 = r4.f12339e
                if (r4 != 0) goto L67
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f12191c
                java.lang.String r4 = r4.m9397t()
                boolean r4 = p235l6.AbstractC10149c.m21180i(r4)
                r0 = 1
                if (r4 == 0) goto L46
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f12178g
                boolean r1 = r4.f12316J
                if (r1 != 0) goto L67
                int r4 = r4.f12353l
                if (r4 == r0) goto L67
            L46:
                com.luck.picture.lib.entity.LocalMedia r4 = r3.f12191c
                java.lang.String r4 = r4.m9397t()
                boolean r4 = p235l6.AbstractC10149c.m21175d(r4)
                if (r4 == 0) goto L5f
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.config.PictureSelectionConfig r4 = r4.f12178g
                boolean r1 = r4.f12318K
                if (r1 != 0) goto L67
                int r4 = r4.f12353l
                if (r4 != r0) goto L5f
                goto L67
            L5f:
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                android.view.View r4 = r4.f12176e
                r4.performClick()
                return
            L67:
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                com.luck.picture.lib.adapter.PictureImageGridAdapter$b r4 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.m9172a(r4)
                com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder r0 = com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.this
                android.widget.TextView r0 = r0.f12175d
                int r1 = r3.f12192d
                com.luck.picture.lib.entity.LocalMedia r2 = r3.f12191c
                r4.mo8995c(r0, r1, r2)
            L78:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.ViewOnClickListenerC7446d.onClick(android.view.View):void");
        }
    }

    public BaseRecyclerMediaHolder(View view) {
        super(view);
    }

    /* renamed from: f */
    public static BaseRecyclerMediaHolder m9175f(ViewGroup viewGroup, int i10, int i11, PictureSelectionConfig pictureSelectionConfig) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i11, viewGroup, false);
        return i10 != 1 ? i10 != 3 ? i10 != 4 ? new ImageViewHolder(viewInflate, pictureSelectionConfig) : new AudioViewHolder(viewInflate, pictureSelectionConfig) : new VideoViewHolder(viewInflate, pictureSelectionConfig) : new CameraViewHolder(viewInflate);
    }

    /* renamed from: d */
    public void mo9158d(LocalMedia localMedia, int i10) {
        localMedia.f12417o = getAbsoluteAdapterPosition();
        m9179j(m9177g(localMedia));
        if (this.f12179h) {
            m9178i(localMedia);
        }
        if (this.f12180i && this.f12178g.f12354l0) {
            m9176e(localMedia);
        }
        String strM9401x = localMedia.m9401x();
        if (localMedia.m9347H()) {
            strM9401x = localMedia.m9385n();
        }
        mo9159h(strM9401x);
        this.f12175d.setOnClickListener(new ViewOnClickListenerC7443a());
        this.f12176e.setOnClickListener(new ViewOnClickListenerC7444b(localMedia, i10));
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC7445c(i10));
        this.itemView.setOnClickListener(new ViewOnClickListenerC7446d(localMedia, i10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (p235l6.AbstractC10149c.m21179h(r5.m9397t()) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (p235l6.AbstractC10149c.m21180i(r5.m9397t()) == false) goto L40;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m9176e(com.luck.picture.lib.entity.LocalMedia r5) {
        /*
            r4 = this;
            int r0 = p359u6.AbstractC11370a.m25304l()
            if (r0 <= 0) goto L7f
            java.util.ArrayList r0 = p359u6.AbstractC11370a.m25306n()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L7f
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r4.f12178g
            boolean r1 = r0.f12327Q
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 1
            if (r1 == 0) goto L30
            int r0 = r0.f12353l
            if (r0 != r3) goto L25
            int r0 = p359u6.AbstractC11370a.m25304l()
            if (r0 != r2) goto L7f
            goto L74
        L25:
            int r0 = p359u6.AbstractC11370a.m25304l()
            com.luck.picture.lib.config.PictureSelectionConfig r1 = r4.f12178g
            int r1 = r1.f12355m
            if (r0 != r1) goto L7f
            goto L74
        L30:
            java.lang.String r0 = p359u6.AbstractC11370a.m25307o()
            boolean r0 = p235l6.AbstractC10149c.m21180i(r0)
            if (r0 == 0) goto L5b
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r4.f12178g
            int r1 = r0.f12353l
            if (r1 != r3) goto L41
            goto L4a
        L41:
            int r1 = r0.f12359o
            if (r1 <= 0) goto L47
            r2 = r1
            goto L4a
        L47:
            int r0 = r0.f12355m
            r2 = r0
        L4a:
            int r0 = p359u6.AbstractC11370a.m25304l()
            if (r0 == r2) goto L74
            java.lang.String r0 = r5.m9397t()
            boolean r0 = p235l6.AbstractC10149c.m21179h(r0)
            if (r0 == 0) goto L7f
            goto L74
        L5b:
            com.luck.picture.lib.config.PictureSelectionConfig r0 = r4.f12178g
            int r1 = r0.f12353l
            if (r1 != r3) goto L62
            goto L64
        L62:
            int r2 = r0.f12355m
        L64:
            int r0 = p359u6.AbstractC11370a.m25304l()
            if (r0 == r2) goto L74
            java.lang.String r0 = r5.m9397t()
            boolean r0 = p235l6.AbstractC10149c.m21180i(r0)
            if (r0 == 0) goto L7f
        L74:
            android.widget.ImageView r0 = r4.f12174c
            android.graphics.ColorFilter r1 = r4.f12183l
            r0.setColorFilter(r1)
            r5.m9374h0(r3)
            return
        L7f:
            r0 = 0
            r5.m9374h0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.adapter.holder.BaseRecyclerMediaHolder.m9176e(com.luck.picture.lib.entity.LocalMedia):void");
    }

    /* renamed from: g */
    public final boolean m9177g(LocalMedia localMedia) {
        LocalMedia localMediaM9375i;
        boolean zContains = AbstractC11370a.m25306n().contains(localMedia);
        if (zContains && (localMediaM9375i = localMedia.m9375i()) != null && localMediaM9375i.m9347H()) {
            localMedia.m9364Z(localMediaM9375i.m9385n());
            localMedia.m9363Y(!TextUtils.isEmpty(localMediaM9375i.m9385n()));
            localMedia.m9367c0(localMediaM9375i.m9347H());
        }
        return zContains;
    }

    /* renamed from: h */
    public void mo9159h(String str) {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        if (interfaceC10322a != null) {
            interfaceC10322a.mo19807e(this.f12174c.getContext(), str, this.f12174c);
        }
    }

    /* renamed from: i */
    public final void m9178i(LocalMedia localMedia) {
        this.f12175d.setText("");
        for (int i10 = 0; i10 < AbstractC11370a.m25304l(); i10++) {
            LocalMedia localMedia2 = (LocalMedia) AbstractC11370a.m25306n().get(i10);
            if (TextUtils.equals(localMedia2.m9401x(), localMedia.m9401x()) || localMedia2.m9395s() == localMedia.m9395s()) {
                localMedia.m9378j0(localMedia2.m9398u());
                localMedia2.m9388o0(localMedia.m9402y());
                this.f12175d.setText(AbstractC0084q.m242g(Integer.valueOf(localMedia.m9398u())));
            }
        }
    }

    /* renamed from: j */
    public final void m9179j(boolean z10) {
        if (this.f12175d.isSelected() != z10) {
            this.f12175d.setSelected(z10);
        }
        if (this.f12178g.f12339e) {
            this.f12174c.setColorFilter(this.f12181j);
        } else {
            this.f12174c.setColorFilter(z10 ? this.f12182k : this.f12181j);
        }
    }

    /* renamed from: k */
    public void m9180k(PictureImageGridAdapter.InterfaceC7441b interfaceC7441b) {
        this.f12184m = interfaceC7441b;
    }

    public BaseRecyclerMediaHolder(View view, PictureSelectionConfig pictureSelectionConfig) {
        int i10;
        super(view);
        this.f12178g = pictureSelectionConfig;
        Context context = view.getContext();
        this.f12177f = context;
        this.f12181j = AbstractC0082o.m232g(context, R$color.ps_color_20);
        this.f12182k = AbstractC0082o.m232g(this.f12177f, R$color.ps_color_80);
        this.f12183l = AbstractC0082o.m232g(this.f12177f, R$color.ps_color_half_white);
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        this.f12179h = selectMainStyleM26627c.m9529Z();
        this.f12174c = (ImageView) view.findViewById(R$id.ivPicture);
        this.f12175d = (TextView) view.findViewById(R$id.tvCheck);
        this.f12176e = view.findViewById(R$id.btnCheck);
        boolean z10 = true;
        if (pictureSelectionConfig.f12353l == 1 && pictureSelectionConfig.f12339e) {
            this.f12175d.setVisibility(8);
            this.f12176e.setVisibility(8);
        } else {
            this.f12175d.setVisibility(0);
            this.f12176e.setVisibility(0);
        }
        if (pictureSelectionConfig.f12339e || ((i10 = pictureSelectionConfig.f12353l) != 1 && i10 != 2)) {
            z10 = false;
        }
        this.f12180i = z10;
        int iM9549w = selectMainStyleM26627c.m9549w();
        if (AbstractC0082o.m227b(iM9549w)) {
            this.f12175d.setTextSize(iM9549w);
        }
        int iM9548v = selectMainStyleM26627c.m9548v();
        if (AbstractC0082o.m228c(iM9548v)) {
            this.f12175d.setTextColor(iM9548v);
        }
        int iM9513J = selectMainStyleM26627c.m9513J();
        if (AbstractC0082o.m228c(iM9513J)) {
            this.f12175d.setBackgroundResource(iM9513J);
        }
        int[] iArrM9547u = selectMainStyleM26627c.m9547u();
        if (AbstractC0082o.m226a(iArrM9547u)) {
            if (this.f12175d.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f12175d.getLayoutParams()).removeRule(21);
                for (int i11 : iArrM9547u) {
                    ((RelativeLayout.LayoutParams) this.f12175d.getLayoutParams()).addRule(i11);
                }
            }
            if (this.f12176e.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f12176e.getLayoutParams()).removeRule(21);
                for (int i12 : iArrM9547u) {
                    ((RelativeLayout.LayoutParams) this.f12176e.getLayoutParams()).addRule(i12);
                }
            }
            int iM9546t = selectMainStyleM26627c.m9546t();
            if (AbstractC0082o.m227b(iM9546t)) {
                ViewGroup.LayoutParams layoutParams = this.f12176e.getLayoutParams();
                layoutParams.width = iM9546t;
                layoutParams.height = iM9546t;
            }
        }
    }
}
