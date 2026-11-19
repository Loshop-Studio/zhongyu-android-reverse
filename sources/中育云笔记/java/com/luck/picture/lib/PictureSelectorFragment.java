package com.luck.picture.lib;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.luck.picture.lib.adapter.PictureImageGridAdapter;
import com.luck.picture.lib.animators.AlphaInAnimationAdapter;
import com.luck.picture.lib.animators.SlideInBottomAnimationAdapter;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.GridSpacingItemDecoration;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.entity.LocalMediaFolder;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.C7514a;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.RecyclerPreloadView;
import com.luck.picture.lib.widget.SlideSelectTouchListener;
import com.luck.picture.lib.widget.TitleBar;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p008a7.AbstractC0068a;
import p008a7.AbstractC0069b;
import p008a7.AbstractC0071d;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0073f;
import p008a7.AbstractC0077j;
import p008a7.AbstractC0082o;
import p008a7.AbstractC0083p;
import p008a7.AbstractC0084q;
import p219k6.AbstractC9819a;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;
import p235l6.AbstractC10150d;
import p248m6.C10204a;
import p260n6.InterfaceC10322a;
import p304q6.AbstractC10747g;
import p304q6.InterfaceC10741a;
import p304q6.InterfaceC10745e;
import p304q6.InterfaceC10746f;
import p304q6.InterfaceC10749i;
import p304q6.InterfaceC10750j;
import p304q6.InterfaceC10751k;
import p334s6.AbstractC11073a;
import p334s6.C11074b;
import p334s6.C11076d;
import p345t6.AbstractC11246a;
import p359u6.AbstractC11370a;
import p387w6.AbstractC11707b;
import p387w6.C11706a;
import p387w6.InterfaceC11708c;

/* loaded from: classes5.dex */
public class PictureSelectorFragment extends PictureCommonFragment implements InterfaceC10749i {

    /* renamed from: B */
    public static final String f12030B = "PictureSelectorFragment";

    /* renamed from: C */
    public static int f12031C = 135;

    /* renamed from: D */
    public static final Object f12032D = new Object();

    /* renamed from: A */
    public SlideSelectTouchListener f12033A;

    /* renamed from: m */
    public RecyclerPreloadView f12034m;

    /* renamed from: n */
    public TextView f12035n;

    /* renamed from: o */
    public TitleBar f12036o;

    /* renamed from: p */
    public BottomNavBar f12037p;

    /* renamed from: q */
    public CompleteSelectView f12038q;

    /* renamed from: r */
    public TextView f12039r;

    /* renamed from: t */
    public int f12041t;

    /* renamed from: v */
    public boolean f12043v;

    /* renamed from: w */
    public boolean f12044w;

    /* renamed from: x */
    public boolean f12045x;

    /* renamed from: y */
    public PictureImageGridAdapter f12046y;

    /* renamed from: z */
    public C10204a f12047z;

    /* renamed from: s */
    public long f12040s = 0;

    /* renamed from: u */
    public int f12042u = -1;

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$a */
    public class C7390a implements InterfaceC10746f {
        public C7390a() {
        }

        @Override // p304q6.InterfaceC10746f
        /* renamed from: a */
        public void mo8989a(List list) {
            PictureSelectorFragment.this.m8953O1(list);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$b */
    public class C7391b extends AbstractC10747g {
        public C7391b() {
        }

        @Override // p304q6.AbstractC10747g
        /* renamed from: a */
        public void mo8990a(ArrayList arrayList, boolean z10) {
            PictureSelectorFragment.this.m8954P1(arrayList, z10);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$c */
    public class C7392c implements InterfaceC10745e {
        public C7392c() {
        }

        @Override // p304q6.InterfaceC10745e
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo8991a(LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment.this.m8955Q1(localMediaFolder);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$d */
    public class RunnableC7393d implements Runnable {
        public RunnableC7393d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f12034m.scrollToPosition(PictureSelectorFragment.this.f12042u);
            PictureSelectorFragment.this.f12034m.setLastVisiblePosition(PictureSelectorFragment.this.f12042u);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$e */
    public class C7394e implements PictureImageGridAdapter.InterfaceC7441b {
        public C7394e() {
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.InterfaceC7441b
        /* renamed from: a */
        public int mo8993a(View view, int i10, LocalMedia localMedia) throws Resources.NotFoundException {
            int iM9250E = PictureSelectorFragment.this.m9250E(localMedia, view.isSelected());
            if (iM9250E == 0) {
                InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(PictureSelectorFragment.this.getContext(), R$anim.ps_anim_modal_in);
                int unused = PictureSelectorFragment.f12031C = (int) animationLoadAnimation.getDuration();
                view.startAnimation(animationLoadAnimation);
            }
            return iM9250E;
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.InterfaceC7441b
        /* renamed from: b */
        public void mo8994b() {
            if (AbstractC0073f.m171a()) {
                return;
            }
            PictureSelectorFragment.this.m9243A0();
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.InterfaceC7441b
        /* renamed from: c */
        public void mo8995c(View view, int i10, LocalMedia localMedia) {
            if (PictureSelectorFragment.this.f12263g.f12353l != 1 || !PictureSelectorFragment.this.f12263g.f12339e) {
                if (AbstractC0073f.m171a()) {
                    return;
                }
                PictureSelectorFragment.this.m8975j2(i10, false);
            } else {
                AbstractC11370a.m25300h();
                if (PictureSelectorFragment.this.m9250E(localMedia, false) == 0) {
                    PictureSelectorFragment.this.m9274R();
                }
            }
        }

        @Override // com.luck.picture.lib.adapter.PictureImageGridAdapter.InterfaceC7441b
        /* renamed from: d */
        public void mo8996d(View view, int i10) {
            if (PictureSelectorFragment.this.f12033A == null || !PictureSelectorFragment.this.f12263g.f12307E0) {
                return;
            }
            ((Vibrator) PictureSelectorFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            PictureSelectorFragment.this.f12033A.m9639p(i10);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$f */
    public class C7395f implements InterfaceC10751k {
        public C7395f() {
        }

        @Override // p304q6.InterfaceC10751k
        /* renamed from: a */
        public void mo8997a() {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            if (interfaceC10322a != null) {
                interfaceC10322a.mo19805c(PictureSelectorFragment.this.getContext());
            }
        }

        @Override // p304q6.InterfaceC10751k
        /* renamed from: b */
        public void mo8998b() {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            if (interfaceC10322a != null) {
                interfaceC10322a.mo19803a(PictureSelectorFragment.this.getContext());
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$g */
    public class C7396g implements InterfaceC10750j {
        public C7396g() {
        }

        @Override // p304q6.InterfaceC10750j
        /* renamed from: a */
        public void mo8999a(int i10) {
            if (i10 == 1) {
                PictureSelectorFragment.this.m8986s2();
            } else if (i10 == 0) {
                PictureSelectorFragment.this.m8959U1();
            }
        }

        @Override // p304q6.InterfaceC10750j
        /* renamed from: b */
        public void mo9000b(int i10, int i11) {
            PictureSelectorFragment.this.m8985r2();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$h */
    public class C7397h implements C7514a.a {

        /* renamed from: a */
        public final /* synthetic */ HashSet f12055a;

        public C7397h(HashSet hashSet) {
            this.f12055a = hashSet;
        }

        @Override // com.luck.picture.lib.widget.C7514a.a
        /* renamed from: a */
        public void mo9001a(int i10, int i11, boolean z10, boolean z11) {
            ArrayList arrayListM9135b = PictureSelectorFragment.this.f12046y.m9135b();
            if (arrayListM9135b.size() == 0 || i10 > arrayListM9135b.size()) {
                return;
            }
            LocalMedia localMedia = (LocalMedia) arrayListM9135b.get(i10);
            PictureSelectorFragment.this.f12033A.m9636m(PictureSelectorFragment.this.m9250E(localMedia, AbstractC11370a.m25306n().contains(localMedia)) != -1);
        }

        @Override // com.luck.picture.lib.widget.C7514a.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HashSet getSelection() {
            for (int i10 = 0; i10 < AbstractC11370a.m25304l(); i10++) {
                this.f12055a.add(Integer.valueOf(((LocalMedia) AbstractC11370a.m25306n().get(i10)).f12417o));
            }
            return this.f12055a;
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$i */
    public class RunnableC7398i implements Runnable {
        public RunnableC7398i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.f12046y.notifyDataSetChanged();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$j */
    public class RunnableC7399j implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ ArrayList f12058c;

        public RunnableC7399j(ArrayList arrayList) {
            this.f12058c = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.m8984q2(this.f12058c);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$k */
    public class RunnableC7400k implements Runnable {
        public RunnableC7400k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorFragment.this.m8969e2();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$l */
    public class C7401l extends AbstractC10747g {
        public C7401l() {
        }

        @Override // p304q6.AbstractC10747g
        /* renamed from: a */
        public void mo8990a(ArrayList arrayList, boolean z10) {
            PictureSelectorFragment.this.m8956R1(arrayList, z10);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$m */
    public class ViewOnClickListenerC7402m implements View.OnClickListener {
        public ViewOnClickListenerC7402m() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PictureSelectorFragment.this.f12263g.f12325O && AbstractC11370a.m25304l() == 0) {
                PictureSelectorFragment.this.mo9083m0();
            } else {
                PictureSelectorFragment.this.m9274R();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$n */
    public class C7403n extends TitleBar.C7513a {
        public C7403n() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.C7513a
        /* renamed from: a */
        public void mo9003a() {
            if (PictureSelectorFragment.this.f12047z.isShowing()) {
                PictureSelectorFragment.this.f12047z.dismiss();
            } else {
                PictureSelectorFragment.this.mo9087p0();
            }
        }

        @Override // com.luck.picture.lib.widget.TitleBar.C7513a
        /* renamed from: b */
        public void mo9004b(View view) {
            PictureSelectorFragment.this.f12047z.showAsDropDown(view);
        }

        @Override // com.luck.picture.lib.widget.TitleBar.C7513a
        /* renamed from: c */
        public void mo9005c() {
            if (PictureSelectorFragment.this.f12263g.f12358n0) {
                if (SystemClock.uptimeMillis() - PictureSelectorFragment.this.f12040s < 500 && PictureSelectorFragment.this.f12046y.getItemCount() > 0) {
                    PictureSelectorFragment.this.f12034m.scrollToPosition(0);
                } else {
                    PictureSelectorFragment.this.f12040s = SystemClock.uptimeMillis();
                }
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$o */
    public class C7404o implements C10204a.d {
        public C7404o() {
        }

        @Override // p248m6.C10204a.d
        /* renamed from: a */
        public void mo9006a() {
            if (PictureSelectorFragment.this.f12263g.f12370t0) {
                return;
            }
            AbstractC0069b.m143a(PictureSelectorFragment.this.f12036o.getImageArrow(), true);
        }

        @Override // p248m6.C10204a.d
        /* renamed from: b */
        public void mo9007b() {
            if (PictureSelectorFragment.this.f12263g.f12370t0) {
                return;
            }
            AbstractC0069b.m143a(PictureSelectorFragment.this.f12036o.getImageArrow(), false);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$p */
    public class C7405p implements InterfaceC11708c {
        public C7405p() {
        }

        @Override // p387w6.InterfaceC11708c
        public void onDenied() {
            PictureSelectorFragment.this.m9282Y(AbstractC11707b.f27817b);
        }

        @Override // p387w6.InterfaceC11708c
        public void onGranted() {
            PictureSelectorFragment.this.m8951M1();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$q */
    public class C7406q implements InterfaceC10741a {

        /* renamed from: com.luck.picture.lib.PictureSelectorFragment$q$a */
        public class a extends AbstractC10747g {
            public a() {
            }

            @Override // p304q6.AbstractC10747g
            /* renamed from: a */
            public void mo8990a(ArrayList arrayList, boolean z10) {
                PictureSelectorFragment.this.m8958T1(arrayList, z10);
            }
        }

        public C7406q() {
        }

        @Override // p304q6.InterfaceC10741a
        /* renamed from: a */
        public void mo9008a(int i10, LocalMediaFolder localMediaFolder) {
            PictureSelectorFragment pictureSelectorFragment = PictureSelectorFragment.this;
            pictureSelectorFragment.f12045x = pictureSelectorFragment.f12263g.f12306E && localMediaFolder.m9406a() == -1;
            PictureSelectorFragment.this.f12046y.m9143j(PictureSelectorFragment.this.f12045x);
            PictureSelectorFragment.this.f12036o.setTitle(localMediaFolder.m9411i());
            LocalMediaFolder localMediaFolderM25302j = AbstractC11370a.m25302j();
            long jM9406a = localMediaFolderM25302j.m9406a();
            if (PictureSelectorFragment.this.f12263g.f12350j0) {
                if (localMediaFolder.m9406a() != jM9406a) {
                    localMediaFolderM25302j.m9417o(PictureSelectorFragment.this.f12046y.m9135b());
                    localMediaFolderM25302j.m9416n(PictureSelectorFragment.this.f12261e);
                    localMediaFolderM25302j.m9422t(PictureSelectorFragment.this.f12034m.m9623b());
                    if (localMediaFolder.m9408c().size() <= 0 || localMediaFolder.m9413k()) {
                        PictureSelectorFragment.this.f12261e = 1;
                        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                        PictureSelectorFragment.this.f12262f.mo24573i(localMediaFolder.m9406a(), PictureSelectorFragment.this.f12261e, PictureSelectorFragment.this.f12263g.f12348i0, new a());
                    } else {
                        PictureSelectorFragment.this.m8983p2(localMediaFolder.m9408c());
                        PictureSelectorFragment.this.f12261e = localMediaFolder.m9407b();
                        PictureSelectorFragment.this.f12034m.setEnabledLoadMore(localMediaFolder.m9413k());
                        PictureSelectorFragment.this.f12034m.smoothScrollToPosition(0);
                    }
                }
            } else if (localMediaFolder.m9406a() != jM9406a) {
                PictureSelectorFragment.this.m8983p2(localMediaFolder.m9408c());
                PictureSelectorFragment.this.f12034m.smoothScrollToPosition(0);
            }
            AbstractC11370a.m25308p(localMediaFolder);
            PictureSelectorFragment.this.f12047z.dismiss();
            if (PictureSelectorFragment.this.f12033A == null || !PictureSelectorFragment.this.f12263g.f12307E0) {
                return;
            }
            PictureSelectorFragment.this.f12033A.m9637n(PictureSelectorFragment.this.f12046y.m9138e() ? 1 : 0);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorFragment$r */
    public class C7407r extends BottomNavBar.C7508b {
        public C7407r() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.C7508b
        /* renamed from: a */
        public void mo9009a() {
            PictureSelectorFragment.this.m9258I0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.C7508b
        /* renamed from: d */
        public void mo9010d() {
            PictureSelectorFragment.this.m8975j2(0, true);
        }
    }

    /* renamed from: h2 */
    public static PictureSelectorFragment m8929h2() {
        PictureSelectorFragment pictureSelectorFragment = new PictureSelectorFragment();
        pictureSelectorFragment.setArguments(new Bundle());
        return pictureSelectorFragment;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: F0 */
    public void mo8948F0(boolean z10) {
        if (PictureSelectionConfig.f12295P0.m26627c().m9529Z()) {
            int i10 = 0;
            while (i10 < AbstractC11370a.m25304l()) {
                LocalMedia localMedia = (LocalMedia) AbstractC11370a.m25306n().get(i10);
                i10++;
                localMedia.m9378j0(i10);
                if (z10) {
                    this.f12046y.m9139f(localMedia.f12417o);
                }
            }
        }
    }

    /* renamed from: K1 */
    public final void m8949K1() {
        this.f12047z.m21330k(new C7406q());
    }

    /* renamed from: L1 */
    public final void m8950L1() {
        this.f12046y.m9144k(new C7394e());
        this.f12034m.setOnRecyclerViewScrollStateListener(new C7395f());
        this.f12034m.setOnRecyclerViewScrollListener(new C7396g());
        if (this.f12263g.f12307E0) {
            SlideSelectTouchListener slideSelectTouchListenerM9641r = new SlideSelectTouchListener().m9637n(this.f12046y.m9138e() ? 1 : 0).m9641r(new C7514a(new C7397h(new HashSet())));
            this.f12033A = slideSelectTouchListenerM9641r;
            this.f12034m.addOnItemTouchListener(slideSelectTouchListenerM9641r);
        }
    }

    /* renamed from: M1 */
    public final void m8951M1() {
        m9296s0(false, null);
        if (this.f12263g.f12370t0) {
            m8970f2();
        } else {
            m8967c2();
        }
    }

    /* renamed from: N1 */
    public final boolean m8952N1(boolean z10) {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12354l0) {
            if (!pictureSelectionConfig.f12327Q) {
                if (AbstractC11370a.m25304l() != 0 && (!z10 || AbstractC11370a.m25304l() != 1)) {
                    if (AbstractC10149c.m21180i(AbstractC11370a.m25307o())) {
                        PictureSelectionConfig pictureSelectionConfig2 = this.f12263g;
                        int i10 = pictureSelectionConfig2.f12359o;
                        if (i10 <= 0) {
                            i10 = pictureSelectionConfig2.f12355m;
                        }
                        return AbstractC11370a.m25304l() == i10 || (!z10 && AbstractC11370a.m25304l() == i10 - 1);
                    }
                    if (AbstractC11370a.m25304l() != this.f12263g.f12355m && (z10 || AbstractC11370a.m25304l() != this.f12263g.f12355m - 1)) {
                        return false;
                    }
                }
                return true;
            }
            if (pictureSelectionConfig.f12353l != 1) {
                return AbstractC11370a.m25304l() == this.f12263g.f12355m || (!z10 && AbstractC11370a.m25304l() == this.f12263g.f12355m - 1);
            }
        }
        return false;
    }

    /* renamed from: O1 */
    public final void m8953O1(List list) {
        LocalMediaFolder localMediaFolderM25302j;
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            m8987t2();
            return;
        }
        if (AbstractC11370a.m25302j() != null) {
            localMediaFolderM25302j = AbstractC11370a.m25302j();
        } else {
            localMediaFolderM25302j = (LocalMediaFolder) list.get(0);
            AbstractC11370a.m25308p(localMediaFolderM25302j);
        }
        this.f12036o.setTitle(localMediaFolderM25302j.m9411i());
        this.f12047z.m21323c(list);
        if (this.f12263g.f12350j0) {
            m8968d2(localMediaFolderM25302j.m9406a());
        } else {
            m8983p2(localMediaFolderM25302j.m9408c());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: P */
    public void mo8902P(LocalMedia localMedia) {
        if (!m8966b2(this.f12047z.m21326g())) {
            this.f12046y.m9135b().add(0, localMedia);
            this.f12043v = true;
        }
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12353l == 1 && pictureSelectionConfig.f12339e) {
            AbstractC11370a.m25300h();
            if (m9250E(localMedia, false) == 0) {
                m9274R();
            }
        } else {
            m9250E(localMedia, false);
        }
        this.f12046y.notifyItemInserted(this.f12263g.f12306E ? 1 : 0);
        PictureImageGridAdapter pictureImageGridAdapter = this.f12046y;
        boolean z10 = this.f12263g.f12306E;
        pictureImageGridAdapter.notifyItemRangeChanged(z10 ? 1 : 0, pictureImageGridAdapter.m9135b().size());
        if (this.f12263g.f12370t0) {
            LocalMediaFolder localMediaFolderM25302j = AbstractC11370a.m25302j();
            if (localMediaFolderM25302j == null) {
                localMediaFolderM25302j = new LocalMediaFolder();
            }
            localMediaFolderM25302j.m9415m(AbstractC0084q.m240e(Integer.valueOf(localMedia.m9400w().hashCode())));
            localMediaFolderM25302j.m9420r(localMedia.m9400w());
            localMediaFolderM25302j.m9419q(localMedia.m9397t());
            localMediaFolderM25302j.m9418p(localMedia.m9401x());
            localMediaFolderM25302j.m9421s(this.f12046y.m9135b().size());
            localMediaFolderM25302j.m9416n(this.f12261e);
            localMediaFolderM25302j.m9422t(false);
            localMediaFolderM25302j.m9417o(this.f12046y.m9135b());
            this.f12034m.setEnabledLoadMore(false);
            AbstractC11370a.m25308p(localMediaFolderM25302j);
        } else {
            m8972g2(localMedia);
        }
        this.f12041t = 0;
        if (this.f12046y.m9135b().size() > 0 || this.f12263g.f12339e) {
            m8960V1();
        } else {
            m8987t2();
        }
    }

    /* renamed from: P1 */
    public final void m8954P1(ArrayList arrayList, boolean z10) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        this.f12034m.setEnabledLoadMore(z10);
        if (this.f12034m.m9623b() && arrayList.size() == 0) {
            mo8973h();
        } else {
            m8983p2(arrayList);
        }
    }

    /* renamed from: Q1 */
    public final void m8955Q1(LocalMediaFolder localMediaFolder) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        String str = this.f12263g.f12336Z;
        boolean z10 = localMediaFolder != null;
        this.f12036o.setTitle(z10 ? localMediaFolder.m9411i() : new File(str).getName());
        if (!z10) {
            m8987t2();
        } else {
            AbstractC11370a.m25308p(localMediaFolder);
            m8983p2(localMediaFolder.m9408c());
        }
    }

    /* renamed from: R1 */
    public final void m8956R1(List list, boolean z10) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        this.f12034m.setEnabledLoadMore(z10);
        if (this.f12034m.m9623b()) {
            m8980n2(list);
            if (list.size() > 0) {
                int size = this.f12046y.m9135b().size();
                this.f12046y.m9135b().addAll(list);
                PictureImageGridAdapter pictureImageGridAdapter = this.f12046y;
                pictureImageGridAdapter.notifyItemRangeChanged(size, pictureImageGridAdapter.getItemCount());
                m8960V1();
            } else {
                mo8973h();
            }
            if (list.size() < 10) {
                RecyclerPreloadView recyclerPreloadView = this.f12034m;
                recyclerPreloadView.onScrolled(recyclerPreloadView.getScrollX(), this.f12034m.getScrollY());
            }
        }
    }

    /* renamed from: S1 */
    public final void m8957S1(List list) {
        LocalMediaFolder localMediaFolderM25302j;
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (list.size() <= 0) {
            m8987t2();
            return;
        }
        if (AbstractC11370a.m25302j() != null) {
            localMediaFolderM25302j = AbstractC11370a.m25302j();
        } else {
            localMediaFolderM25302j = (LocalMediaFolder) list.get(0);
            AbstractC11370a.m25308p(localMediaFolderM25302j);
        }
        this.f12036o.setTitle(localMediaFolderM25302j.m9411i());
        this.f12047z.m21323c(list);
        if (this.f12263g.f12350j0) {
            m8954P1(new ArrayList(AbstractC11370a.m25303k()), true);
        } else {
            m8983p2(localMediaFolderM25302j.m9408c());
        }
    }

    /* renamed from: T1 */
    public final void m8958T1(ArrayList arrayList, boolean z10) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        this.f12034m.setEnabledLoadMore(z10);
        if (arrayList.size() == 0) {
            this.f12046y.m9135b().clear();
        }
        m8983p2(arrayList);
        this.f12034m.onScrolled(0, 0);
        this.f12034m.smoothScrollToPosition(0);
    }

    /* renamed from: U1 */
    public final void m8959U1() {
        if (!this.f12263g.f12305D0 || this.f12046y.m9135b().size() <= 0) {
            return;
        }
        this.f12039r.animate().setDuration(250L).alpha(0.0f).start();
    }

    /* renamed from: V1 */
    public final void m8960V1() {
        if (this.f12035n.getVisibility() == 0) {
            this.f12035n.setVisibility(8);
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: W */
    public int mo8903W() {
        int iM21171a = AbstractC10148b.m21171a(getContext(), 1);
        return iM21171a != 0 ? iM21171a : R$layout.ps_fragment_selector;
    }

    /* renamed from: W1 */
    public final void m8961W1() {
        C10204a c10204aM21322d = C10204a.m21322d(getContext());
        this.f12047z = c10204aM21322d;
        c10204aM21322d.m21331l(new C7404o());
        m8949K1();
    }

    /* renamed from: X1 */
    public final void m8962X1() {
        this.f12037p.mo9608f();
        this.f12037p.setOnBottomNavBarListener(new C7407r());
        this.f12037p.m9610h();
    }

    /* renamed from: Y1 */
    public final void m8963Y1() {
        PictureSelectionConfig pictureSelectionConfig = this.f12263g;
        if (pictureSelectionConfig.f12353l == 1 && pictureSelectionConfig.f12339e) {
            PictureSelectionConfig.f12295P0.m26628d().m9574w(false);
            this.f12036o.getTitleCancelView().setVisibility(0);
            this.f12038q.setVisibility(8);
            return;
        }
        this.f12038q.m9613c();
        this.f12038q.setSelectedChange(false);
        if (PictureSelectionConfig.f12295P0.m26627c().m9524U()) {
            if (this.f12038q.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) this.f12038q.getLayoutParams()).topToTop = R$id.title_bar;
                ((ConstraintLayout.LayoutParams) this.f12038q.getLayoutParams()).bottomToBottom = R$id.title_bar;
                if (this.f12263g.f12320L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f12038q.getLayoutParams())).topMargin = AbstractC0072e.m168h(getContext());
                }
            } else if ((this.f12038q.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f12263g.f12320L) {
                ((RelativeLayout.LayoutParams) this.f12038q.getLayoutParams()).topMargin = AbstractC0072e.m168h(getContext());
            }
        }
        this.f12038q.setOnClickListener(new ViewOnClickListenerC7402m());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: Z */
    public void mo8904Z(String[] strArr) {
        m9296s0(false, null);
        boolean z10 = strArr.length > 0 && TextUtils.equals(strArr[0], AbstractC11707b.f27819d[0]);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        boolean zIsExternalStorageManager = (!z10 && AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25881e(getContext(), strArr);
        if (zIsExternalStorageManager) {
            if (z10) {
                m9243A0();
            } else {
                m8951M1();
            }
        } else if (z10) {
            AbstractC0083p.m235c(getContext(), getString(R$string.ps_camera));
        } else {
            AbstractC0083p.m235c(getContext(), getString(R$string.ps_jurisdiction));
            mo9087p0();
        }
        AbstractC11707b.f27816a = new String[0];
    }

    /* renamed from: Z1 */
    public final void m8964Z1(View view) {
        this.f12034m = (RecyclerPreloadView) view.findViewById(R$id.recycler);
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        int iM9505B = selectMainStyleM26627c.m9505B();
        if (AbstractC0082o.m228c(iM9505B)) {
            this.f12034m.setBackgroundColor(iM9505B);
        } else {
            this.f12034m.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
        int i10 = this.f12263g.f12379y;
        if (i10 <= 0) {
            i10 = 4;
        }
        if (this.f12034m.getItemDecorationCount() == 0) {
            if (AbstractC0082o.m227b(selectMainStyleM26627c.m9542p())) {
                this.f12034m.addItemDecoration(new GridSpacingItemDecoration(i10, selectMainStyleM26627c.m9542p(), selectMainStyleM26627c.m9523T()));
            } else {
                this.f12034m.addItemDecoration(new GridSpacingItemDecoration(i10, AbstractC0072e.m161a(view.getContext(), 1.0f), selectMainStyleM26627c.m9523T()));
            }
        }
        this.f12034m.setLayoutManager(new GridLayoutManager(getContext(), i10));
        RecyclerView.ItemAnimator itemAnimator = this.f12034m.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            this.f12034m.setItemAnimator(null);
        }
        if (this.f12263g.f12350j0) {
            this.f12034m.setReachBottomRow(2);
            this.f12034m.setOnRecyclerViewPreloadListener(this);
        } else {
            this.f12034m.setHasFixedSize(true);
        }
        PictureImageGridAdapter pictureImageGridAdapter = new PictureImageGridAdapter(getContext(), this.f12263g);
        this.f12046y = pictureImageGridAdapter;
        pictureImageGridAdapter.m9143j(this.f12045x);
        int i11 = this.f12263g.f12356m0;
        if (i11 == 1) {
            this.f12034m.setAdapter(new AlphaInAnimationAdapter(this.f12046y));
        } else if (i11 != 2) {
            this.f12034m.setAdapter(this.f12046y);
        } else {
            this.f12034m.setAdapter(new SlideInBottomAnimationAdapter(this.f12046y));
        }
        m8950L1();
    }

    /* renamed from: a2 */
    public final void m8965a2() {
        if (PictureSelectionConfig.f12295P0.m26628d().m9573v()) {
            this.f12036o.setVisibility(8);
        }
        this.f12036o.mo9622d();
        this.f12036o.setOnTitleBarListener(new C7403n());
    }

    /* renamed from: b2 */
    public final boolean m8966b2(int i10) {
        int i11;
        return i10 != 0 && (i11 = this.f12041t) > 0 && i11 < i10;
    }

    /* renamed from: c2 */
    public void m8967c2() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        this.f12262f.mo24571g(new C7390a());
    }

    /* renamed from: d2 */
    public void m8968d2(long j10) {
        this.f12034m.setEnabledLoadMore(true);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        this.f12262f.mo24573i(j10, 1, this.f12261e * this.f12263g.f12348i0, new C7391b());
    }

    /* renamed from: e2 */
    public void m8969e2() {
        if (this.f12034m.m9623b()) {
            this.f12261e++;
            LocalMediaFolder localMediaFolderM25302j = AbstractC11370a.m25302j();
            long jM9406a = localMediaFolderM25302j != null ? localMediaFolderM25302j.m9406a() : 0L;
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            this.f12262f.mo24573i(jM9406a, this.f12261e, this.f12263g.f12348i0, new C7401l());
        }
    }

    /* renamed from: f2 */
    public void m8970f2() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        this.f12262f.mo24572h(new C7392c());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: g0 */
    public void mo8971g0() {
        this.f12037p.m9609g();
    }

    /* renamed from: g2 */
    public final void m8972g2(LocalMedia localMedia) {
        LocalMediaFolder localMediaFolderM21327h;
        LocalMediaFolder localMediaFolder;
        String string;
        List listM21325f = this.f12047z.m21325f();
        if (this.f12047z.m21328i() == 0) {
            localMediaFolderM21327h = new LocalMediaFolder();
            if (TextUtils.isEmpty(this.f12263g.f12346h0)) {
                string = getString(this.f12263g.f12337c == AbstractC10150d.m21191b() ? R$string.ps_all_audio : R$string.ps_camera_roll);
            } else {
                string = this.f12263g.f12346h0;
            }
            localMediaFolderM21327h.m9420r(string);
            localMediaFolderM21327h.m9418p("");
            localMediaFolderM21327h.m9415m(-1L);
            listM21325f.add(0, localMediaFolderM21327h);
        } else {
            localMediaFolderM21327h = this.f12047z.m21327h(0);
        }
        localMediaFolderM21327h.m9418p(localMedia.m9401x());
        localMediaFolderM21327h.m9419q(localMedia.m9397t());
        localMediaFolderM21327h.m9417o(this.f12046y.m9135b());
        localMediaFolderM21327h.m9415m(-1L);
        localMediaFolderM21327h.m9421s(m8966b2(localMediaFolderM21327h.m9412j()) ? localMediaFolderM21327h.m9412j() : localMediaFolderM21327h.m9412j() + 1);
        if (AbstractC11370a.m25302j() == null) {
            AbstractC11370a.m25308p(localMediaFolderM21327h);
        }
        int i10 = 0;
        while (true) {
            if (i10 >= listM21325f.size()) {
                localMediaFolder = null;
                break;
            }
            localMediaFolder = (LocalMediaFolder) listM21325f.get(i10);
            if (TextUtils.equals(localMediaFolder.m9411i(), localMedia.m9400w())) {
                break;
            } else {
                i10++;
            }
        }
        if (localMediaFolder == null) {
            localMediaFolder = new LocalMediaFolder();
            listM21325f.add(localMediaFolder);
        }
        localMediaFolder.m9420r(localMedia.m9400w());
        if (localMediaFolder.m9406a() == -1 || localMediaFolder.m9406a() == 0) {
            localMediaFolder.m9415m(localMedia.m9373h());
        }
        if (this.f12263g.f12350j0) {
            localMediaFolder.m9422t(true);
        } else if (!m8966b2(localMediaFolderM21327h.m9412j()) || !TextUtils.isEmpty(this.f12263g.f12334X) || !TextUtils.isEmpty(this.f12263g.f12335Y)) {
            localMediaFolder.m9408c().add(0, localMedia);
        }
        localMediaFolder.m9421s(m8966b2(localMediaFolderM21327h.m9412j()) ? localMediaFolder.m9412j() : localMediaFolder.m9412j() + 1);
        localMediaFolder.m9418p(this.f12263g.f12342f0);
        localMediaFolder.m9419q(localMedia.m9397t());
        this.f12047z.m21323c(listM21325f);
    }

    @Override // p304q6.InterfaceC10749i
    /* renamed from: h */
    public void mo8973h() {
        if (this.f12044w) {
            requireView().postDelayed(new RunnableC7400k(), 350L);
        } else {
            m8969e2();
        }
    }

    /* renamed from: i2 */
    public void m8974i2() {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        AbstractC11073a c11076d = this.f12263g.f12350j0 ? new C11076d() : new C11074b();
        this.f12262f = c11076d;
        c11076d.m24570f(getContext(), this.f12263g);
    }

    /* renamed from: j2 */
    public final void m8975j2(int i10, boolean z10) {
        ArrayList arrayList;
        int iM9412j;
        long jM9406a;
        FragmentActivity activity = getActivity();
        String str = PictureSelectorPreviewFragment.f12069P;
        if (AbstractC0068a.m141b(activity, str)) {
            if (z10) {
                arrayList = new ArrayList(AbstractC11370a.m25306n());
                iM9412j = arrayList.size();
                jM9406a = 0;
            } else {
                arrayList = new ArrayList(this.f12046y.m9135b());
                iM9412j = AbstractC11370a.m25302j().m9412j();
                jM9406a = AbstractC11370a.m25302j().m9406a();
            }
            ArrayList arrayList2 = arrayList;
            int i11 = iM9412j;
            long j10 = jM9406a;
            if (!z10) {
                PictureSelectionConfig pictureSelectionConfig = this.f12263g;
                if (pictureSelectionConfig.f12322M) {
                    AbstractC11246a.m25087c(this.f12034m, pictureSelectionConfig.f12320L ? 0 : AbstractC0072e.m168h(getContext()));
                }
            }
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
            if (AbstractC0068a.m141b(getActivity(), str)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragmentM9015U1 = PictureSelectorPreviewFragment.m9015U1();
                pictureSelectorPreviewFragmentM9015U1.m9079j2(z10, this.f12036o.getTitleText(), this.f12046y.m9138e(), i10, i11, this.f12261e, j10, arrayList2);
                AbstractC9819a.m19890a(getActivity(), str, pictureSelectorPreviewFragmentM9015U1);
            }
        }
    }

    /* renamed from: k2 */
    public void m8976k2(Bundle bundle) {
        if (bundle == null) {
            this.f12045x = this.f12263g.f12306E;
            return;
        }
        this.f12041t = bundle.getInt("com.luck.picture.lib.all_folder_size");
        this.f12261e = bundle.getInt("com.luck.picture.lib.current_page", this.f12261e);
        this.f12042u = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f12042u);
        this.f12045x = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f12263g.f12306E);
    }

    /* renamed from: l2 */
    public final void m8977l2() {
        this.f12046y.m9143j(this.f12045x);
        m9260J0(0L);
        if (this.f12263g.f12370t0) {
            m8955Q1(AbstractC11370a.m25302j());
        } else {
            m8957S1(new ArrayList(AbstractC11370a.m25301i()));
        }
    }

    /* renamed from: m2 */
    public final void m8978m2() {
        if (this.f12042u > 0) {
            this.f12034m.post(new RunnableC7393d());
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: n0 */
    public void mo8979n0(LocalMedia localMedia) {
        this.f12046y.m9139f(localMedia.f12417o);
    }

    /* renamed from: n2 */
    public final void m8980n2(List list) {
        try {
            if (this.f12263g.f12350j0 && this.f12043v) {
                synchronized (f12032D) {
                    try {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (this.f12046y.m9135b().contains(it.next())) {
                                it.remove();
                            }
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        } finally {
            this.f12043v = false;
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: o0 */
    public void mo8981o0() {
        m9266M0(requireView());
    }

    /* renamed from: o2 */
    public final void m8982o2() {
        this.f12046y.m9143j(this.f12045x);
        if ((AbstractC0077j.m218f() && this.f12263g.f12317J0) ? Environment.isExternalStorageManager() : C11706a.m25880d(getContext())) {
            m8951M1();
            return;
        }
        String[] strArr = AbstractC11707b.f27817b;
        m9296s0(true, strArr);
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        C11706a.m25878b().m25885i(this, strArr, new C7405p());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        SlideSelectTouchListener slideSelectTouchListener = this.f12033A;
        if (slideSelectTouchListener != null) {
            slideSelectTouchListener.m9640q();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.all_folder_size", this.f12041t);
        bundle.putInt("com.luck.picture.lib.current_page", this.f12261e);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f12034m.getLastVisiblePosition());
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f12046y.m9138e());
        AbstractC11370a.m25308p(AbstractC11370a.m25302j());
        AbstractC11370a.m25293a(this.f12047z.m21325f());
        AbstractC11370a.m25294b(this.f12046y.m9135b());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m8976k2(bundle);
        this.f12044w = bundle != null;
        this.f12035n = (TextView) view.findViewById(R$id.tv_data_empty);
        this.f12038q = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f12036o = (TitleBar) view.findViewById(R$id.title_bar);
        this.f12037p = (BottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f12039r = (TextView) view.findViewById(R$id.tv_current_data_time);
        m8974i2();
        m8961W1();
        m8965a2();
        m8963Y1();
        m8964Z1(view);
        m8962X1();
        if (this.f12044w) {
            m8977l2();
        } else {
            m8982o2();
        }
    }

    /* renamed from: p2 */
    public final void m8983p2(ArrayList arrayList) {
        long jM9280U = m9280U();
        if (jM9280U > 0) {
            requireView().postDelayed(new RunnableC7399j(arrayList), jM9280U);
        } else {
            m8984q2(arrayList);
        }
    }

    /* renamed from: q2 */
    public final void m8984q2(ArrayList arrayList) {
        m9260J0(0L);
        mo8948F0(false);
        this.f12046y.m9142i(arrayList);
        AbstractC11370a.m25297e();
        AbstractC11370a.m25298f();
        m8978m2();
        if (this.f12046y.m9137d()) {
            m8987t2();
        } else {
            m8960V1();
        }
    }

    /* renamed from: r2 */
    public final void m8985r2() {
        int firstVisiblePosition;
        if (!this.f12263g.f12305D0 || (firstVisiblePosition = this.f12034m.getFirstVisiblePosition()) == -1) {
            return;
        }
        ArrayList arrayListM9135b = this.f12046y.m9135b();
        if (arrayListM9135b.size() <= firstVisiblePosition || ((LocalMedia) arrayListM9135b.get(firstVisiblePosition)).m9387o() <= 0) {
            return;
        }
        this.f12039r.setText(AbstractC0071d.m156e(getContext(), ((LocalMedia) arrayListM9135b.get(firstVisiblePosition)).m9387o()));
    }

    /* renamed from: s2 */
    public final void m8986s2() {
        if (this.f12263g.f12305D0 && this.f12046y.m9135b().size() > 0 && this.f12039r.getAlpha() == 0.0f) {
            this.f12039r.animate().setDuration(150L).alphaBy(1.0f).start();
        }
    }

    /* renamed from: t2 */
    public final void m8987t2() {
        if (AbstractC11370a.m25302j() == null || AbstractC11370a.m25302j().m9406a() == -1) {
            if (this.f12035n.getVisibility() == 8) {
                this.f12035n.setVisibility(0);
            }
            this.f12035n.setCompoundDrawablesRelativeWithIntrinsicBounds(0, R$drawable.ps_ic_no_data, 0, 0);
            this.f12035n.setText(getString(this.f12263g.f12337c == AbstractC10150d.m21191b() ? R$string.ps_audio_empty : R$string.ps_empty));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: x0 */
    public void mo8988x0(boolean z10, LocalMedia localMedia) {
        this.f12037p.m9610h();
        this.f12038q.setSelectedChange(false);
        if (m8952N1(z10)) {
            this.f12046y.m9139f(localMedia.f12417o);
            this.f12034m.postDelayed(new RunnableC7398i(), f12031C);
        } else {
            this.f12046y.m9139f(localMedia.f12417o);
        }
        if (z10) {
            return;
        }
        mo8948F0(true);
    }
}
