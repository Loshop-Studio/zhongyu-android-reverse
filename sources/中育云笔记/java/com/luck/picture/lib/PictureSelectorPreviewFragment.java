package com.luck.picture.lib;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.luck.picture.lib.adapter.PicturePreviewAdapter;
import com.luck.picture.lib.adapter.holder.BasePreviewHolder;
import com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter;
import com.luck.picture.lib.adapter.holder.PreviewVideoHolder;
import com.luck.picture.lib.basic.PictureCommonFragment;
import com.luck.picture.lib.config.PictureSelectionConfig;
import com.luck.picture.lib.decoration.HorizontalItemDecoration;
import com.luck.picture.lib.decoration.WrapContentLinearLayoutManager;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.magical.MagicalView;
import com.luck.picture.lib.magical.ViewParams;
import com.luck.picture.lib.style.PictureWindowAnimationStyle;
import com.luck.picture.lib.style.SelectMainStyle;
import com.luck.picture.lib.widget.BottomNavBar;
import com.luck.picture.lib.widget.CompleteSelectView;
import com.luck.picture.lib.widget.PreviewBottomNavBar;
import com.luck.picture.lib.widget.PreviewTitleBar;
import com.luck.picture.lib.widget.TitleBar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import p008a7.AbstractC0068a;
import p008a7.AbstractC0072e;
import p008a7.AbstractC0075h;
import p008a7.AbstractC0082o;
import p008a7.AbstractC0084q;
import p235l6.AbstractC10147a;
import p235l6.AbstractC10148b;
import p235l6.AbstractC10149c;
import p235l6.AbstractC10150d;
import p260n6.InterfaceC10322a;
import p273o6.C10446b;
import p304q6.AbstractC10747g;
import p304q6.InterfaceC10742b;
import p334s6.AbstractC11073a;
import p334s6.C11074b;
import p334s6.C11076d;
import p345t6.AbstractC11246a;
import p345t6.InterfaceC11248c;
import p359u6.AbstractC11370a;

/* loaded from: classes5.dex */
public class PictureSelectorPreviewFragment extends PictureCommonFragment {

    /* renamed from: P */
    public static final String f12069P = "PictureSelectorPreviewFragment";

    /* renamed from: A */
    public boolean f12070A;

    /* renamed from: B */
    public int f12071B;

    /* renamed from: C */
    public int f12072C;

    /* renamed from: D */
    public int f12073D;

    /* renamed from: F */
    public TextView f12075F;

    /* renamed from: G */
    public TextView f12076G;

    /* renamed from: H */
    public View f12077H;

    /* renamed from: I */
    public CompleteSelectView f12078I;

    /* renamed from: L */
    public RecyclerView f12081L;

    /* renamed from: M */
    public PreviewGalleryAdapter f12082M;

    /* renamed from: n */
    public MagicalView f12086n;

    /* renamed from: o */
    public ViewPager2 f12087o;

    /* renamed from: p */
    public PicturePreviewAdapter f12088p;

    /* renamed from: q */
    public PreviewBottomNavBar f12089q;

    /* renamed from: r */
    public PreviewTitleBar f12090r;

    /* renamed from: t */
    public int f12092t;

    /* renamed from: u */
    public boolean f12093u;

    /* renamed from: v */
    public boolean f12094v;

    /* renamed from: w */
    public String f12095w;

    /* renamed from: x */
    public boolean f12096x;

    /* renamed from: y */
    public boolean f12097y;

    /* renamed from: z */
    public boolean f12098z;

    /* renamed from: m */
    public ArrayList f12085m = new ArrayList();

    /* renamed from: s */
    public boolean f12091s = true;

    /* renamed from: E */
    public long f12074E = -1;

    /* renamed from: J */
    public boolean f12079J = true;

    /* renamed from: K */
    public boolean f12080K = false;

    /* renamed from: N */
    public List f12083N = new ArrayList();

    /* renamed from: O */
    public final ViewPager2.OnPageChangeCallback f12084O = new C7416i();

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$a */
    public class C7408a extends WrapContentLinearLayoutManager {

        /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$a$a */
        public class a extends LinearSmoothScroller {
            public a(Context context) {
                super(context);
            }

            @Override // androidx.recyclerview.widget.LinearSmoothScroller
            public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return 300.0f / displayMetrics.densityDpi;
            }
        }

        public C7408a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i10) {
            super.smoothScrollToPosition(recyclerView, state, i10);
            a aVar = new a(recyclerView.getContext());
            aVar.setTargetPosition(i10);
            startSmoothScroll(aVar);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$b */
    public class C7409b implements PreviewGalleryAdapter.InterfaceC7461c {

        /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$b$a */
        public class a implements Runnable {

            /* renamed from: c */
            public final /* synthetic */ int f12102c;

            public a(int i10) {
                this.f12102c = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (PictureSelectorPreviewFragment.this.f12263g.f12322M) {
                    PictureSelectorPreviewFragment.this.f12088p.m9156l(this.f12102c);
                }
            }
        }

        public C7409b() {
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.InterfaceC7461c
        /* renamed from: a */
        public void mo9090a(int i10, LocalMedia localMedia, View view) {
            String string = TextUtils.isEmpty(PictureSelectorPreviewFragment.this.f12263g.f12346h0) ? PictureSelectorPreviewFragment.this.getString(R$string.ps_camera_roll) : PictureSelectorPreviewFragment.this.f12263g.f12346h0;
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12093u || TextUtils.equals(pictureSelectorPreviewFragment.f12095w, string) || TextUtils.equals(localMedia.m9400w(), PictureSelectorPreviewFragment.this.f12095w)) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                if (!pictureSelectorPreviewFragment2.f12093u) {
                    i10 = pictureSelectorPreviewFragment2.f12096x ? localMedia.f12417o - 1 : localMedia.f12417o;
                }
                if (i10 == pictureSelectorPreviewFragment2.f12087o.getCurrentItem() && localMedia.m9344E()) {
                    return;
                }
                if (PictureSelectorPreviewFragment.this.f12087o.getAdapter() != null) {
                    PictureSelectorPreviewFragment.this.f12087o.setAdapter(null);
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.f12087o.setAdapter(pictureSelectorPreviewFragment3.f12088p);
                }
                PictureSelectorPreviewFragment.this.f12087o.setCurrentItem(i10, false);
                PictureSelectorPreviewFragment.this.m9064V1(localMedia);
                PictureSelectorPreviewFragment.this.f12087o.post(new a(i10));
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$c */
    public class C7410c extends ItemTouchHelper.Callback {

        /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$c$a */
        public class a extends AnimatorListenerAdapter {
            public a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.f12080K = true;
            }
        }

        /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$c$b */
        public class b extends AnimatorListenerAdapter {
            public b() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PictureSelectorPreviewFragment.this.f12079J = true;
            }
        }

        public C7410c() {
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int iM9216f;
            viewHolder.itemView.setAlpha(1.0f);
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12080K) {
                pictureSelectorPreviewFragment.f12080K = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.1f, 1.0f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.1f, 1.0f));
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.setDuration(50L);
                animatorSet.start();
                animatorSet.addListener(new b());
            }
            super.clearView(recyclerView, viewHolder);
            PictureSelectorPreviewFragment.this.f12082M.notifyItemChanged(viewHolder.getAbsoluteAdapterPosition());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.f12093u && PictureSelectorPreviewFragment.this.f12087o.getCurrentItem() != (iM9216f = pictureSelectorPreviewFragment2.f12082M.m9216f()) && iM9216f != -1) {
                if (PictureSelectorPreviewFragment.this.f12087o.getAdapter() != null) {
                    PictureSelectorPreviewFragment.this.f12087o.setAdapter(null);
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                    pictureSelectorPreviewFragment3.f12087o.setAdapter(pictureSelectorPreviewFragment3.f12088p);
                }
                PictureSelectorPreviewFragment.this.f12087o.setCurrentItem(iM9216f, false);
            }
            if (!PictureSelectionConfig.f12295P0.m26627c().m9529Z() || AbstractC0068a.m142c(PictureSelectorPreviewFragment.this.getActivity())) {
                return;
            }
            List<Fragment> fragments = PictureSelectorPreviewFragment.this.getActivity().getSupportFragmentManager().getFragments();
            for (int i10 = 0; i10 < fragments.size(); i10++) {
                Fragment fragment = fragments.get(i10);
                if (fragment instanceof PictureCommonFragment) {
                    ((PictureCommonFragment) fragment).mo8948F0(true);
                }
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public long getAnimationDuration(RecyclerView recyclerView, int i10, float f10, float f11) {
            return super.getAnimationDuration(recyclerView, i10, f10, f11);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            viewHolder.itemView.setAlpha(0.7f);
            return ItemTouchHelper.Callback.makeMovementFlags(12, 0);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean isLongPressDragEnabled() {
            return true;
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f10, float f11, int i10, boolean z10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12079J) {
                pictureSelectorPreviewFragment.f12079J = false;
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewHolder.itemView, "scaleX", 1.0f, 1.1f), ObjectAnimator.ofFloat(viewHolder.itemView, "scaleY", 1.0f, 1.1f));
                animatorSet.setDuration(50L);
                animatorSet.setInterpolator(new LinearInterpolator());
                animatorSet.start();
                animatorSet.addListener(new a());
            }
            super.onChildDraw(canvas, recyclerView, viewHolder, f10, f11, i10, z10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            try {
                int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = viewHolder2.getAbsoluteAdapterPosition();
                if (absoluteAdapterPosition < absoluteAdapterPosition2) {
                    int i10 = absoluteAdapterPosition;
                    while (i10 < absoluteAdapterPosition2) {
                        int i11 = i10 + 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.f12082M.getData(), i10, i11);
                        Collections.swap(AbstractC11370a.m25306n(), i10, i11);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment.f12093u) {
                            Collections.swap(pictureSelectorPreviewFragment.f12085m, i10, i11);
                        }
                        i10 = i11;
                    }
                } else {
                    for (int i12 = absoluteAdapterPosition; i12 > absoluteAdapterPosition2; i12--) {
                        int i13 = i12 - 1;
                        Collections.swap(PictureSelectorPreviewFragment.this.f12082M.getData(), i12, i13);
                        Collections.swap(AbstractC11370a.m25306n(), i12, i13);
                        PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                        if (pictureSelectorPreviewFragment2.f12093u) {
                            Collections.swap(pictureSelectorPreviewFragment2.f12085m, i12, i13);
                        }
                    }
                }
                PictureSelectorPreviewFragment.this.f12082M.notifyItemMoved(absoluteAdapterPosition, absoluteAdapterPosition2);
                return true;
            } catch (Exception e10) {
                e10.printStackTrace();
                return true;
            }
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i10) {
            super.onSelectedChanged(viewHolder, i10);
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i10) {
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$d */
    public class C7411d implements PreviewGalleryAdapter.InterfaceC7462d {

        /* renamed from: a */
        public final /* synthetic */ ItemTouchHelper f12107a;

        public C7411d(ItemTouchHelper itemTouchHelper) {
            this.f12107a = itemTouchHelper;
        }

        @Override // com.luck.picture.lib.adapter.holder.PreviewGalleryAdapter.InterfaceC7462d
        /* renamed from: a */
        public void mo9091a(RecyclerView.ViewHolder viewHolder, int i10, View view) {
            ((Vibrator) PictureSelectorPreviewFragment.this.getActivity().getSystemService("vibrator")).vibrate(50L);
            if (PictureSelectorPreviewFragment.this.f12082M.getItemCount() != PictureSelectorPreviewFragment.this.f12263g.f12355m) {
                this.f12107a.startDrag(viewHolder);
            } else if (viewHolder.getLayoutPosition() != PictureSelectorPreviewFragment.this.f12082M.getItemCount() - 1) {
                this.f12107a.startDrag(viewHolder);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$e */
    public class C7412e extends BottomNavBar.C7508b {
        public C7412e() {
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.C7508b
        /* renamed from: a */
        public void mo9009a() {
            PictureSelectorPreviewFragment.this.m9258I0();
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.C7508b
        /* renamed from: b */
        public void mo9092b() {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        }

        @Override // com.luck.picture.lib.widget.BottomNavBar.C7508b
        /* renamed from: c */
        public void mo9093c() {
            int currentItem = PictureSelectorPreviewFragment.this.f12087o.getCurrentItem();
            if (PictureSelectorPreviewFragment.this.f12085m.size() > currentItem) {
                PictureSelectorPreviewFragment.this.m9250E((LocalMedia) PictureSelectorPreviewFragment.this.f12085m.get(currentItem), false);
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$f */
    public class RunnableC7413f implements Runnable {
        public RunnableC7413f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f12088p.m9153i(pictureSelectorPreviewFragment.f12092t);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$g */
    public class C7414g implements InterfaceC10742b {
        public C7414g() {
        }

        @Override // p304q6.InterfaceC10742b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9094a(int[] iArr) {
            PictureSelectorPreviewFragment.this.m9086o2(iArr);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$h */
    public class C7415h extends AnimatorListenerAdapter {
        public C7415h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            PictureSelectorPreviewFragment.this.f12070A = false;
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$i */
    public class C7416i extends ViewPager2.OnPageChangeCallback {
        public C7416i() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageScrolled(int i10, float f10, int i11) {
            if (PictureSelectorPreviewFragment.this.f12085m.size() > i10) {
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
                int i12 = pictureSelectorPreviewFragment.f12072C / 2;
                ArrayList arrayList = pictureSelectorPreviewFragment.f12085m;
                if (i11 >= i12) {
                    i10++;
                }
                LocalMedia localMedia = (LocalMedia) arrayList.get(i10);
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment2.f12075F.setSelected(pictureSelectorPreviewFragment2.m9062S1(localMedia));
                PictureSelectorPreviewFragment.this.m9064V1(localMedia);
                PictureSelectorPreviewFragment.this.m9066X1(localMedia);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            pictureSelectorPreviewFragment.f12092t = i10;
            pictureSelectorPreviewFragment.f12090r.setTitle((PictureSelectorPreviewFragment.this.f12092t + 1) + MqttTopic.TOPIC_LEVEL_SEPARATOR + PictureSelectorPreviewFragment.this.f12071B);
            if (PictureSelectorPreviewFragment.this.f12085m.size() > i10) {
                LocalMedia localMedia = (LocalMedia) PictureSelectorPreviewFragment.this.f12085m.get(i10);
                PictureSelectorPreviewFragment.this.m9066X1(localMedia);
                if (PictureSelectorPreviewFragment.this.m9061R1()) {
                    PictureSelectorPreviewFragment.this.m9048B1(i10);
                }
                if (PictureSelectorPreviewFragment.this.f12263g.f12322M) {
                    PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
                    if (pictureSelectorPreviewFragment2.f12093u && pictureSelectorPreviewFragment2.f12263g.f12311G0) {
                        PictureSelectorPreviewFragment.this.m9088p2(i10);
                    } else {
                        PictureSelectorPreviewFragment.this.f12088p.m9156l(i10);
                    }
                } else if (PictureSelectorPreviewFragment.this.f12263g.f12311G0) {
                    PictureSelectorPreviewFragment.this.m9088p2(i10);
                }
                PictureSelectorPreviewFragment.this.m9064V1(localMedia);
                PictureSelectorPreviewFragment.this.f12089q.m9621i(AbstractC10149c.m21180i(localMedia.m9397t()) || AbstractC10149c.m21175d(localMedia.m9397t()));
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                if (pictureSelectorPreviewFragment3.f12097y || pictureSelectorPreviewFragment3.f12093u || pictureSelectorPreviewFragment3.f12263g.f12370t0 || !PictureSelectorPreviewFragment.this.f12263g.f12350j0) {
                    return;
                }
                if (PictureSelectorPreviewFragment.this.f12091s) {
                    if (i10 == r0.f12088p.getItemCount() - 11 || i10 == PictureSelectorPreviewFragment.this.f12088p.getItemCount() - 1) {
                        PictureSelectorPreviewFragment.this.m9063T1();
                    }
                }
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$j */
    public class C7417j implements InterfaceC11248c {
        public C7417j() {
        }

        @Override // p345t6.InterfaceC11248c
        /* renamed from: a */
        public void mo9096a(float f10) {
            PictureSelectorPreviewFragment.this.m9070b2(f10);
        }

        @Override // p345t6.InterfaceC11248c
        /* renamed from: b */
        public void mo9097b() {
            PictureSelectorPreviewFragment.this.m9072d2();
        }

        @Override // p345t6.InterfaceC11248c
        /* renamed from: c */
        public void mo9098c(boolean z10) {
            PictureSelectorPreviewFragment.this.m9073e2(z10);
        }

        @Override // p345t6.InterfaceC11248c
        /* renamed from: d */
        public void mo9099d(MagicalView magicalView, boolean z10) {
            PictureSelectorPreviewFragment.this.m9071c2(magicalView, z10);
        }

        @Override // p345t6.InterfaceC11248c
        /* renamed from: e */
        public void mo9100e() {
            PictureSelectorPreviewFragment.this.m9074f2();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$k */
    public class RunnableC7418k implements Runnable {

        /* renamed from: c */
        public final /* synthetic */ int f12115c;

        public RunnableC7418k(int i10) {
            this.f12115c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            PictureSelectorPreviewFragment.this.f12088p.m9157m(this.f12115c);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$l */
    public class C7419l implements InterfaceC10742b {

        /* renamed from: a */
        public final /* synthetic */ int f12117a;

        public C7419l(int i10) {
            this.f12117a = i10;
        }

        @Override // p304q6.InterfaceC10742b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9094a(int[] iArr) {
            PictureSelectorPreviewFragment.this.m9084m2(iArr[0], iArr[1], this.f12117a);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$m */
    public class C7420m implements InterfaceC10742b {

        /* renamed from: a */
        public final /* synthetic */ LocalMedia f12119a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC10742b f12120b;

        public C7420m(LocalMedia localMedia, InterfaceC10742b interfaceC10742b) {
            this.f12119a = localMedia;
            this.f12120b = interfaceC10742b;
        }

        @Override // p304q6.InterfaceC10742b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9094a(C10446b c10446b) {
            if (c10446b.m21829c() > 0) {
                this.f12119a.m9396s0(c10446b.m21829c());
            }
            if (c10446b.m21828b() > 0) {
                this.f12119a.m9370f0(c10446b.m21828b());
            }
            InterfaceC10742b interfaceC10742b = this.f12120b;
            if (interfaceC10742b != null) {
                interfaceC10742b.mo9094a(new int[]{this.f12119a.m9343D(), this.f12119a.m9393r()});
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$n */
    public class C7421n implements InterfaceC10742b {
        public C7421n() {
        }

        @Override // p304q6.InterfaceC10742b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo9094a(int[] iArr) {
            PictureSelectorPreviewFragment.this.m9049C1(iArr);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$o */
    public class C7422o extends AbstractC10747g {
        public C7422o() {
        }

        @Override // p304q6.AbstractC10747g
        /* renamed from: a */
        public void mo8990a(ArrayList arrayList, boolean z10) {
            PictureSelectorPreviewFragment.this.m9056J1(arrayList, z10);
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$p */
    public class ViewOnClickListenerC7423p implements View.OnClickListener {

        /* renamed from: c */
        public final /* synthetic */ SelectMainStyle f12124c;

        public ViewOnClickListenerC7423p(SelectMainStyle selectMainStyle) {
            this.f12124c = selectMainStyle;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onClick(android.view.View r5) {
            /*
                r4 = this;
                com.luck.picture.lib.style.SelectMainStyle r5 = r4.f12124c
                boolean r5 = r5.m9524U()
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L29
                int r5 = p359u6.AbstractC11370a.m25304l()
                if (r5 != 0) goto L29
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                java.util.ArrayList r2 = r5.f12085m
                androidx.viewpager2.widget.ViewPager2 r3 = r5.f12087o
                int r3 = r3.getCurrentItem()
                java.lang.Object r2 = r2.get(r3)
                com.luck.picture.lib.entity.LocalMedia r2 = (com.luck.picture.lib.entity.LocalMedia) r2
                int r5 = r5.m9250E(r2, r1)
                if (r5 != 0) goto L27
                goto L2f
            L27:
                r0 = r1
                goto L2f
            L29:
                int r5 = p359u6.AbstractC11370a.m25304l()
                if (r5 <= 0) goto L27
            L2f:
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                com.luck.picture.lib.config.PictureSelectionConfig r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.m9026f1(r5)
                boolean r5 = r5.f12325O
                if (r5 == 0) goto L45
                int r5 = p359u6.AbstractC11370a.m25304l()
                if (r5 != 0) goto L45
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                r5.mo9083m0()
                return
            L45:
                if (r0 == 0) goto L4c
                com.luck.picture.lib.PictureSelectorPreviewFragment r5 = com.luck.picture.lib.PictureSelectorPreviewFragment.this
                com.luck.picture.lib.PictureSelectorPreviewFragment.m9037q1(r5)
            L4c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.ViewOnClickListenerC7423p.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$q */
    public class C7424q extends TitleBar.C7513a {
        public C7424q() {
        }

        @Override // com.luck.picture.lib.widget.TitleBar.C7513a
        /* renamed from: a */
        public void mo9003a() {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12097y) {
                if (pictureSelectorPreviewFragment.f12263g.f12322M) {
                    PictureSelectorPreviewFragment.this.f12086n.m9456t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.m9055I1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f12093u || !pictureSelectorPreviewFragment.f12263g.f12322M) {
                PictureSelectorPreviewFragment.this.m9287e0();
            } else {
                PictureSelectorPreviewFragment.this.f12086n.m9456t();
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$r */
    public class ViewOnClickListenerC7425r implements View.OnClickListener {
        public ViewOnClickListenerC7425r() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.m9051E1();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$s */
    public class ViewOnClickListenerC7426s implements View.OnClickListener {
        public ViewOnClickListenerC7426s() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12097y) {
                pictureSelectorPreviewFragment.m9051E1();
                return;
            }
            LocalMedia localMedia = (LocalMedia) pictureSelectorPreviewFragment.f12085m.get(pictureSelectorPreviewFragment.f12087o.getCurrentItem());
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment2 = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment2.m9250E(localMedia, pictureSelectorPreviewFragment2.f12075F.isSelected()) == 0) {
                InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
                PictureSelectorPreviewFragment pictureSelectorPreviewFragment3 = PictureSelectorPreviewFragment.this;
                pictureSelectorPreviewFragment3.f12075F.startAnimation(AnimationUtils.loadAnimation(pictureSelectorPreviewFragment3.getContext(), R$anim.ps_anim_modal_in));
            }
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$t */
    public class ViewOnClickListenerC7427t implements View.OnClickListener {
        public ViewOnClickListenerC7427t() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PictureSelectorPreviewFragment.this.f12077H.performClick();
        }
    }

    /* renamed from: com.luck.picture.lib.PictureSelectorPreviewFragment$u */
    public class C7428u implements BasePreviewHolder.InterfaceC7442a {
        public C7428u() {
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.InterfaceC7442a
        /* renamed from: a */
        public void mo9104a() {
            if (PictureSelectorPreviewFragment.this.f12263g.f12320L) {
                PictureSelectorPreviewFragment.this.m9075g2();
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12097y) {
                if (pictureSelectorPreviewFragment.f12263g.f12322M) {
                    PictureSelectorPreviewFragment.this.f12086n.m9456t();
                    return;
                } else {
                    PictureSelectorPreviewFragment.this.m9055I1();
                    return;
                }
            }
            if (pictureSelectorPreviewFragment.f12093u || !pictureSelectorPreviewFragment.f12263g.f12322M) {
                PictureSelectorPreviewFragment.this.m9287e0();
            } else {
                PictureSelectorPreviewFragment.this.f12086n.m9456t();
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.InterfaceC7442a
        /* renamed from: b */
        public void mo9105b(LocalMedia localMedia) {
            if (PictureSelectorPreviewFragment.this.f12263g.f12326P) {
                return;
            }
            PictureSelectorPreviewFragment pictureSelectorPreviewFragment = PictureSelectorPreviewFragment.this;
            if (pictureSelectorPreviewFragment.f12097y) {
                pictureSelectorPreviewFragment.m9068Z1(localMedia);
            }
        }

        @Override // com.luck.picture.lib.adapter.holder.BasePreviewHolder.InterfaceC7442a
        /* renamed from: c */
        public void mo9106c(String str) {
            if (!TextUtils.isEmpty(str)) {
                PictureSelectorPreviewFragment.this.f12090r.setTitle(str);
                return;
            }
            PictureSelectorPreviewFragment.this.f12090r.setTitle((PictureSelectorPreviewFragment.this.f12092t + 1) + MqttTopic.TOPIC_LEVEL_SEPARATOR + PictureSelectorPreviewFragment.this.f12071B);
        }

        public /* synthetic */ C7428u(PictureSelectorPreviewFragment pictureSelectorPreviewFragment, C7417j c7417j) {
            this();
        }
    }

    /* renamed from: M1 */
    private void m9011M1() {
        this.f12089q.mo9608f();
        this.f12089q.m9610h();
        this.f12089q.setOnBottomNavBarListener(new C7412e());
    }

    /* renamed from: N1 */
    private void m9012N1() {
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        if (AbstractC0082o.m228c(selectMainStyleM26627c.m9508E())) {
            this.f12075F.setBackgroundResource(selectMainStyleM26627c.m9508E());
        } else if (AbstractC0082o.m228c(selectMainStyleM26627c.m9513J())) {
            this.f12075F.setBackgroundResource(selectMainStyleM26627c.m9513J());
        }
        if (AbstractC0082o.m231f(selectMainStyleM26627c.m9510G())) {
            this.f12076G.setText(selectMainStyleM26627c.m9510G());
        } else {
            this.f12076G.setText("");
        }
        if (AbstractC0082o.m227b(selectMainStyleM26627c.m9512I())) {
            this.f12076G.setTextSize(selectMainStyleM26627c.m9512I());
        }
        if (AbstractC0082o.m228c(selectMainStyleM26627c.m9511H())) {
            this.f12076G.setTextColor(selectMainStyleM26627c.m9511H());
        }
        if (AbstractC0082o.m227b(selectMainStyleM26627c.m9509F())) {
            if (this.f12075F.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                if (this.f12075F.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f12075F.getLayoutParams())).rightMargin = selectMainStyleM26627c.m9509F();
                }
            } else if (this.f12075F.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f12075F.getLayoutParams()).rightMargin = selectMainStyleM26627c.m9509F();
            }
        }
        this.f12078I.m9613c();
        this.f12078I.setSelectedChange(true);
        if (selectMainStyleM26627c.m9524U()) {
            if (this.f12078I.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) this.f12078I.getLayoutParams()).topToTop = R$id.title_bar;
                ((ConstraintLayout.LayoutParams) this.f12078I.getLayoutParams()).bottomToBottom = R$id.title_bar;
                if (this.f12263g.f12320L) {
                    ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f12078I.getLayoutParams())).topMargin = AbstractC0072e.m168h(getContext());
                }
            } else if ((this.f12078I.getLayoutParams() instanceof RelativeLayout.LayoutParams) && this.f12263g.f12320L) {
                ((RelativeLayout.LayoutParams) this.f12078I.getLayoutParams()).topMargin = AbstractC0072e.m168h(getContext());
            }
        }
        if (selectMainStyleM26627c.m9528Y()) {
            if (this.f12075F.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) this.f12075F.getLayoutParams()).topToTop = R$id.bottom_nar_bar;
                ((ConstraintLayout.LayoutParams) this.f12075F.getLayoutParams()).bottomToBottom = R$id.bottom_nar_bar;
                ((ConstraintLayout.LayoutParams) this.f12076G.getLayoutParams()).topToTop = R$id.bottom_nar_bar;
                ((ConstraintLayout.LayoutParams) this.f12076G.getLayoutParams()).bottomToBottom = R$id.bottom_nar_bar;
                ((ConstraintLayout.LayoutParams) this.f12077H.getLayoutParams()).topToTop = R$id.bottom_nar_bar;
                ((ConstraintLayout.LayoutParams) this.f12077H.getLayoutParams()).bottomToBottom = R$id.bottom_nar_bar;
            }
        } else if (this.f12263g.f12320L) {
            if (this.f12076G.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
                ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.LayoutParams) this.f12076G.getLayoutParams())).topMargin = AbstractC0072e.m168h(getContext());
            } else if (this.f12076G.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
                ((RelativeLayout.LayoutParams) this.f12076G.getLayoutParams()).topMargin = AbstractC0072e.m168h(getContext());
            }
        }
        this.f12078I.setOnClickListener(new ViewOnClickListenerC7423p(selectMainStyleM26627c));
    }

    /* renamed from: P1 */
    private void m9013P1() {
        if (PictureSelectionConfig.f12295P0.m26628d().m9573v()) {
            this.f12090r.setVisibility(8);
        }
        this.f12090r.mo9622d();
        this.f12090r.setOnTitleBarListener(new C7424q());
        this.f12090r.setTitle((this.f12092t + 1) + MqttTopic.TOPIC_LEVEL_SEPARATOR + this.f12071B);
        this.f12090r.getImageDelete().setOnClickListener(new ViewOnClickListenerC7425r());
        this.f12077H.setOnClickListener(new ViewOnClickListenerC7426s());
        this.f12075F.setOnClickListener(new ViewOnClickListenerC7427t());
    }

    /* renamed from: U1 */
    public static PictureSelectorPreviewFragment m9015U1() {
        PictureSelectorPreviewFragment pictureSelectorPreviewFragment = new PictureSelectorPreviewFragment();
        pictureSelectorPreviewFragment.setArguments(new Bundle());
        return pictureSelectorPreviewFragment;
    }

    /* renamed from: A1 */
    public void m9047A1(View... viewArr) {
        Collections.addAll(this.f12083N, viewArr);
    }

    /* renamed from: B1 */
    public final void m9048B1(int i10) {
        LocalMedia localMedia = (LocalMedia) this.f12085m.get(i10);
        if (AbstractC10149c.m21180i(localMedia.m9397t())) {
            m9054H1(localMedia, false, new C7419l(i10));
        } else {
            int[] iArrM9053G1 = m9053G1(localMedia, false);
            m9084m2(iArrM9053G1[0], iArrM9053G1[1], i10);
        }
    }

    /* renamed from: C1 */
    public final void m9049C1(int[] iArr) {
        int i10;
        int i11;
        ViewParams viewParamsM25088d = AbstractC11246a.m25088d(this.f12096x ? this.f12092t + 1 : this.f12092t);
        if (viewParamsM25088d == null || (i10 = iArr[0]) == 0 || (i11 = iArr[1]) == 0) {
            this.f12086n.m9450F(0, 0, 0, 0, iArr[0], iArr[1]);
            this.f12086n.m9447C(iArr[0], iArr[1], false);
        } else {
            this.f12086n.m9450F(viewParamsM25088d.f12468c, viewParamsM25088d.f12469d, viewParamsM25088d.f12470e, viewParamsM25088d.f12471f, i10, i11);
            this.f12086n.m9446B();
        }
    }

    /* renamed from: D1 */
    public PicturePreviewAdapter m9050D1() {
        return new PicturePreviewAdapter();
    }

    /* renamed from: E1 */
    public final void m9051E1() {
        if (this.f12098z) {
            InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: F0 */
    public void mo8948F0(boolean z10) {
        if (PictureSelectionConfig.f12295P0.m26627c().m9527X() && PictureSelectionConfig.f12295P0.m26627c().m9529Z()) {
            int i10 = 0;
            while (i10 < AbstractC11370a.m25304l()) {
                LocalMedia localMedia = (LocalMedia) AbstractC11370a.m25306n().get(i10);
                i10++;
                localMedia.m9378j0(i10);
            }
        }
    }

    /* renamed from: F1 */
    public final void m9052F1() {
        this.f12090r.getImageDelete().setVisibility(this.f12098z ? 0 : 8);
        this.f12075F.setVisibility(8);
        this.f12089q.setVisibility(8);
        this.f12078I.setVisibility(8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d A[PHI: r0
      0x004d: PHI (r0v3 int) = (r0v2 int), (r0v5 int), (r0v2 int) binds: [B:6:0x001b, B:14:0x0040, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: G1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] m9053G1(com.luck.picture.lib.entity.LocalMedia r5, boolean r6) {
        /*
            r4 = this;
            int r0 = r5.m9343D()
            int r1 = r5.m9393r()
            boolean r0 = p008a7.AbstractC0075h.m190m(r0, r1)
            if (r0 == 0) goto L13
            int r6 = r4.f12072C
            int r0 = r4.f12073D
            goto L4f
        L13:
            int r0 = r5.m9343D()
            int r1 = r5.m9393r()
            if (r6 == 0) goto L4d
            if (r0 <= 0) goto L23
            if (r1 <= 0) goto L23
            if (r0 <= r1) goto L4d
        L23:
            android.content.Context r6 = r4.getContext()
            java.lang.String r2 = r5.m9371g()
            o6.b r6 = p008a7.AbstractC0075h.m183f(r6, r2)
            int r2 = r6.m21829c()
            if (r2 <= 0) goto L3c
            int r0 = r6.m21829c()
            r5.m9396s0(r0)
        L3c:
            int r2 = r6.m21828b()
            if (r2 <= 0) goto L4d
            int r6 = r6.m21828b()
            r5.m9370f0(r6)
            r3 = r0
            r0 = r6
            r6 = r3
            goto L4f
        L4d:
            r6 = r0
            r0 = r1
        L4f:
            boolean r1 = r5.m9346G()
            if (r1 == 0) goto L69
            int r1 = r5.m9381l()
            if (r1 <= 0) goto L69
            int r1 = r5.m9379k()
            if (r1 <= 0) goto L69
            int r6 = r5.m9381l()
            int r0 = r5.m9379k()
        L69:
            int[] r5 = new int[]{r6, r0}
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.luck.picture.lib.PictureSelectorPreviewFragment.m9053G1(com.luck.picture.lib.entity.LocalMedia, boolean):int[]");
    }

    /* renamed from: H1 */
    public final void m9054H1(LocalMedia localMedia, boolean z10, InterfaceC10742b interfaceC10742b) {
        if (!z10 || ((localMedia.m9343D() > 0 && localMedia.m9393r() > 0 && localMedia.m9343D() <= localMedia.m9393r()) || !this.f12263g.f12323M0)) {
            interfaceC10742b.mo9094a(new int[]{localMedia.m9343D(), localMedia.m9393r()});
        } else {
            this.f12087o.setAlpha(0.0f);
            AbstractC0075h.m189l(getContext(), localMedia.m9371g(), new C7420m(localMedia, interfaceC10742b));
        }
    }

    /* renamed from: I1 */
    public final void m9055I1() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (this.f12263g.f12320L) {
            m9057K1();
        }
        mo9083m0();
    }

    /* renamed from: J1 */
    public final void m9056J1(List list, boolean z10) {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        this.f12091s = z10;
        if (z10) {
            if (list.size() <= 0) {
                m9063T1();
                return;
            }
            int size = this.f12085m.size();
            this.f12085m.addAll(list);
            this.f12088p.notifyItemRangeChanged(size, this.f12085m.size());
        }
    }

    /* renamed from: K1 */
    public final void m9057K1() {
        for (int i10 = 0; i10 < this.f12083N.size(); i10++) {
            ((View) this.f12083N.get(i10)).setEnabled(true);
        }
        this.f12089q.getEditor().setEnabled(true);
    }

    /* renamed from: L1 */
    public final void m9058L1() {
        if (!m9061R1()) {
            this.f12086n.setBackgroundAlpha(1.0f);
            return;
        }
        m9080k2();
        float f10 = this.f12094v ? 1.0f : 0.0f;
        this.f12086n.setBackgroundAlpha(f10);
        for (int i10 = 0; i10 < this.f12083N.size(); i10++) {
            if (!(this.f12083N.get(i10) instanceof TitleBar)) {
                ((View) this.f12083N.get(i10)).setAlpha(f10);
            }
        }
    }

    /* renamed from: O1 */
    public void m9059O1(ViewGroup viewGroup) {
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        if (selectMainStyleM26627c.m9526W()) {
            this.f12081L = new RecyclerView(getContext());
            if (AbstractC0082o.m228c(selectMainStyleM26627c.m9543q())) {
                this.f12081L.setBackgroundResource(selectMainStyleM26627c.m9543q());
            } else {
                this.f12081L.setBackgroundResource(R$drawable.ps_preview_gallery_bg);
            }
            viewGroup.addView(this.f12081L);
            ViewGroup.LayoutParams layoutParams = this.f12081L.getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = -2;
                layoutParams2.bottomToTop = R$id.bottom_nar_bar;
                layoutParams2.startToStart = 0;
                layoutParams2.endToEnd = 0;
            }
            C7408a c7408a = new C7408a(getContext());
            RecyclerView.ItemAnimator itemAnimator = this.f12081L.getItemAnimator();
            if (itemAnimator != null) {
                ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
            }
            if (this.f12081L.getItemDecorationCount() == 0) {
                this.f12081L.addItemDecoration(new HorizontalItemDecoration(Integer.MAX_VALUE, AbstractC0072e.m161a(getContext(), 6.0f)));
            }
            c7408a.setOrientation(0);
            this.f12081L.setLayoutManager(c7408a);
            if (AbstractC11370a.m25304l() > 0) {
                this.f12081L.setLayoutAnimation(AnimationUtils.loadLayoutAnimation(getContext(), R$anim.ps_anim_layout_fall_enter));
            }
            this.f12082M = new PreviewGalleryAdapter(this.f12093u, AbstractC11370a.m25306n());
            m9064V1((LocalMedia) this.f12085m.get(this.f12092t));
            this.f12081L.setAdapter(this.f12082M);
            this.f12082M.m9221k(new C7409b());
            if (AbstractC11370a.m25304l() > 0) {
                this.f12081L.setVisibility(0);
            } else {
                this.f12081L.setVisibility(4);
            }
            m9047A1(this.f12081L);
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new C7410c());
            itemTouchHelper.attachToRecyclerView(this.f12081L);
            this.f12082M.m9222l(new C7411d(itemTouchHelper));
        }
    }

    /* renamed from: Q1 */
    public final void m9060Q1(ArrayList arrayList) {
        PicturePreviewAdapter picturePreviewAdapterM9050D1 = m9050D1();
        this.f12088p = picturePreviewAdapterM9050D1;
        picturePreviewAdapterM9050D1.m9154j(arrayList);
        this.f12088p.m9155k(new C7428u(this, null));
        this.f12087o.setOrientation(0);
        this.f12087o.setAdapter(this.f12088p);
        AbstractC11370a.m25299g();
        if (arrayList.size() == 0 || this.f12092t > arrayList.size()) {
            mo9087p0();
            return;
        }
        LocalMedia localMedia = (LocalMedia) arrayList.get(this.f12092t);
        this.f12089q.m9621i(AbstractC10149c.m21180i(localMedia.m9397t()) || AbstractC10149c.m21175d(localMedia.m9397t()));
        this.f12075F.setSelected(AbstractC11370a.m25306n().contains(arrayList.get(this.f12087o.getCurrentItem())));
        this.f12087o.registerOnPageChangeCallback(this.f12084O);
        this.f12087o.setPageTransformer(new MarginPageTransformer(AbstractC0072e.m161a(getContext(), 3.0f)));
        this.f12087o.setCurrentItem(this.f12092t, false);
        mo8948F0(false);
        m9066X1((LocalMedia) arrayList.get(this.f12092t));
        m9089q2(localMedia);
    }

    /* renamed from: R1 */
    public final boolean m9061R1() {
        return !this.f12093u && this.f12263g.f12322M;
    }

    /* renamed from: S1 */
    public boolean m9062S1(LocalMedia localMedia) {
        return AbstractC11370a.m25306n().contains(localMedia);
    }

    /* renamed from: T1 */
    public final void m9063T1() {
        int i10 = this.f12261e + 1;
        this.f12261e = i10;
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        this.f12262f.mo24573i(this.f12074E, i10, this.f12263g.f12348i0, new C7422o());
    }

    /* renamed from: V1 */
    public final void m9064V1(LocalMedia localMedia) {
        if (this.f12082M == null || !PictureSelectionConfig.f12295P0.m26627c().m9526W()) {
            return;
        }
        this.f12082M.m9217g(localMedia);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: W */
    public int mo8903W() {
        int iM21171a = AbstractC10148b.m21171a(getContext(), 2);
        return iM21171a != 0 ? iM21171a : R$layout.ps_fragment_preview;
    }

    /* renamed from: W1 */
    public final void m9065W1(boolean z10, LocalMedia localMedia) {
        if (this.f12082M == null || !PictureSelectionConfig.f12295P0.m26627c().m9526W()) {
            return;
        }
        if (this.f12081L.getVisibility() == 4) {
            this.f12081L.setVisibility(0);
        }
        if (z10) {
            if (this.f12263g.f12353l == 1) {
                this.f12082M.m9214d();
            }
            this.f12082M.m9213c(localMedia);
            this.f12081L.smoothScrollToPosition(this.f12082M.getItemCount() - 1);
            return;
        }
        this.f12082M.m9220j(localMedia);
        if (AbstractC11370a.m25304l() == 0) {
            this.f12081L.setVisibility(4);
        }
    }

    /* renamed from: X1 */
    public void m9066X1(LocalMedia localMedia) {
        if (PictureSelectionConfig.f12295P0.m26627c().m9527X() && PictureSelectionConfig.f12295P0.m26627c().m9529Z()) {
            this.f12075F.setText("");
            for (int i10 = 0; i10 < AbstractC11370a.m25304l(); i10++) {
                LocalMedia localMedia2 = (LocalMedia) AbstractC11370a.m25306n().get(i10);
                if (TextUtils.equals(localMedia2.m9401x(), localMedia.m9401x()) || localMedia2.m9395s() == localMedia.m9395s()) {
                    localMedia.m9378j0(localMedia2.m9398u());
                    localMedia2.m9388o0(localMedia.m9402y());
                    this.f12075F.setText(AbstractC0084q.m242g(Integer.valueOf(localMedia.m9398u())));
                }
            }
        }
    }

    /* renamed from: Y1 */
    public void m9067Y1() {
        if (this.f12097y) {
            return;
        }
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
        AbstractC11073a c11076d = this.f12263g.f12350j0 ? new C11076d() : new C11074b();
        this.f12262f = c11076d;
        c11076d.m24570f(getContext(), this.f12263g);
    }

    /* renamed from: Z1 */
    public final void m9068Z1(LocalMedia localMedia) {
        InterfaceC10322a interfaceC10322a = PictureSelectionConfig.f12293N0;
    }

    /* renamed from: a2 */
    public final void m9069a2() {
        if (AbstractC0068a.m142c(getActivity())) {
            return;
        }
        if (this.f12097y) {
            if (this.f12263g.f12322M) {
                this.f12086n.m9456t();
                return;
            } else {
                mo9083m0();
                return;
            }
        }
        if (this.f12093u) {
            m9287e0();
        } else if (this.f12263g.f12322M) {
            this.f12086n.m9456t();
        } else {
            m9287e0();
        }
    }

    /* renamed from: b2 */
    public void m9070b2(float f10) {
        for (int i10 = 0; i10 < this.f12083N.size(); i10++) {
            if (!(this.f12083N.get(i10) instanceof TitleBar)) {
                ((View) this.f12083N.get(i10)).setAlpha(f10);
            }
        }
    }

    /* renamed from: c2 */
    public void m9071c2(MagicalView magicalView, boolean z10) {
        int iM9343D;
        int iM9393r;
        BasePreviewHolder basePreviewHolderM9146b = this.f12088p.m9146b(this.f12087o.getCurrentItem());
        if (basePreviewHolderM9146b == null) {
            return;
        }
        LocalMedia localMedia = (LocalMedia) this.f12085m.get(this.f12087o.getCurrentItem());
        if (!localMedia.m9346G() || localMedia.m9381l() <= 0 || localMedia.m9379k() <= 0) {
            iM9343D = localMedia.m9343D();
            iM9393r = localMedia.m9393r();
        } else {
            iM9343D = localMedia.m9381l();
            iM9393r = localMedia.m9379k();
        }
        if (AbstractC0075h.m190m(iM9343D, iM9393r)) {
            basePreviewHolderM9146b.f12172h.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            basePreviewHolderM9146b.f12172h.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (basePreviewHolderM9146b instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderM9146b;
            if (this.f12263g.f12311G0) {
                m9088p2(this.f12087o.getCurrentItem());
            } else {
                if (previewVideoHolder.f12242j.getVisibility() != 8 || this.f12088p.m9148d(this.f12087o.getCurrentItem())) {
                    return;
                }
                previewVideoHolder.f12242j.setVisibility(0);
            }
        }
    }

    /* renamed from: d2 */
    public void m9072d2() {
        BasePreviewHolder basePreviewHolderM9146b = this.f12088p.m9146b(this.f12087o.getCurrentItem());
        if (basePreviewHolderM9146b == null) {
            return;
        }
        if (basePreviewHolderM9146b.f12172h.getVisibility() == 8) {
            basePreviewHolderM9146b.f12172h.setVisibility(0);
        }
        if (basePreviewHolderM9146b instanceof PreviewVideoHolder) {
            PreviewVideoHolder previewVideoHolder = (PreviewVideoHolder) basePreviewHolderM9146b;
            if (previewVideoHolder.f12242j.getVisibility() == 0) {
                previewVideoHolder.f12242j.setVisibility(8);
            }
        }
    }

    /* renamed from: e2 */
    public void m9073e2(boolean z10) {
        BasePreviewHolder basePreviewHolderM9146b;
        ViewParams viewParamsM25088d = AbstractC11246a.m25088d(this.f12096x ? this.f12092t + 1 : this.f12092t);
        if (viewParamsM25088d == null || (basePreviewHolderM9146b = this.f12088p.m9146b(this.f12087o.getCurrentItem())) == null) {
            return;
        }
        basePreviewHolderM9146b.f12172h.getLayoutParams().width = viewParamsM25088d.f12470e;
        basePreviewHolderM9146b.f12172h.getLayoutParams().height = viewParamsM25088d.f12471f;
        basePreviewHolderM9146b.f12172h.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    /* renamed from: f2 */
    public void m9074f2() {
        if (this.f12097y && m9285c0() && m9061R1()) {
            mo9083m0();
        } else {
            m9287e0();
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: g0 */
    public void mo8971g0() {
        this.f12089q.m9609g();
    }

    /* renamed from: g2 */
    public final void m9075g2() {
        if (this.f12070A) {
            return;
        }
        boolean z10 = this.f12090r.getTranslationY() == 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        float f10 = z10 ? 0.0f : -this.f12090r.getHeight();
        float f11 = z10 ? -this.f12090r.getHeight() : 0.0f;
        float f12 = z10 ? 1.0f : 0.0f;
        float f13 = z10 ? 0.0f : 1.0f;
        for (int i10 = 0; i10 < this.f12083N.size(); i10++) {
            View view = (View) this.f12083N.get(i10);
            animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", f12, f13));
            if (view instanceof TitleBar) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(view, "translationY", f10, f11));
            }
        }
        animatorSet.setDuration(350L);
        animatorSet.start();
        this.f12070A = true;
        animatorSet.addListener(new C7415h());
        if (z10) {
            m9085n2();
        } else {
            m9057K1();
        }
    }

    /* renamed from: h2 */
    public void m9076h2(Bundle bundle) {
        if (bundle != null) {
            this.f12261e = bundle.getInt("com.luck.picture.lib.current_page", 1);
            this.f12074E = bundle.getLong("com.luck.picture.lib.current_bucketId", -1L);
            this.f12092t = bundle.getInt("com.luck.picture.lib.current_preview_position", this.f12092t);
            this.f12096x = bundle.getBoolean("com.luck.picture.lib.display_camera", this.f12096x);
            this.f12071B = bundle.getInt("com.luck.picture.lib.current_album_total", this.f12071B);
            this.f12097y = bundle.getBoolean("com.luck.picture.lib.external_preview", this.f12097y);
            this.f12098z = bundle.getBoolean("com.luck.picture.lib.external_preview_display_delete", this.f12098z);
            this.f12093u = bundle.getBoolean("com.luck.picture.lib.bottom_preview", this.f12093u);
            this.f12095w = bundle.getString("com.luck.picture.lib.current_album_name", "");
            if (this.f12085m.size() == 0) {
                this.f12085m.addAll(new ArrayList(AbstractC11370a.m25305m()));
            }
        }
    }

    /* renamed from: i2 */
    public void m9077i2(int i10, int i11, ArrayList arrayList, boolean z10) {
        this.f12085m = arrayList;
        this.f12071B = i11;
        this.f12092t = i10;
        this.f12098z = z10;
        this.f12097y = true;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: j0 */
    public void mo9078j0(Intent intent) {
        if (this.f12085m.size() > this.f12087o.getCurrentItem()) {
            LocalMedia localMedia = (LocalMedia) this.f12085m.get(this.f12087o.getCurrentItem());
            Uri uriM21164b = AbstractC10147a.m21164b(intent);
            localMedia.m9364Z(uriM21164b != null ? uriM21164b.getPath() : "");
            localMedia.m9358T(AbstractC10147a.m21170h(intent));
            localMedia.m9357S(AbstractC10147a.m21167e(intent));
            localMedia.m9359U(AbstractC10147a.m21168f(intent));
            localMedia.m9360V(AbstractC10147a.m21169g(intent));
            localMedia.m9361W(AbstractC10147a.m21165c(intent));
            localMedia.m9363Y(!TextUtils.isEmpty(localMedia.m9385n()));
            localMedia.m9362X(AbstractC10147a.m21166d(intent));
            localMedia.m9367c0(localMedia.m9346G());
            localMedia.m9392q0(localMedia.m9385n());
            if (AbstractC11370a.m25306n().contains(localMedia)) {
                LocalMedia localMediaM9375i = localMedia.m9375i();
                if (localMediaM9375i != null) {
                    localMediaM9375i.m9364Z(localMedia.m9385n());
                    localMediaM9375i.m9363Y(localMedia.m9346G());
                    localMediaM9375i.m9367c0(localMedia.m9347H());
                    localMediaM9375i.m9362X(localMedia.m9383m());
                    localMediaM9375i.m9392q0(localMedia.m9385n());
                    localMediaM9375i.m9358T(AbstractC10147a.m21170h(intent));
                    localMediaM9375i.m9357S(AbstractC10147a.m21167e(intent));
                    localMediaM9375i.m9359U(AbstractC10147a.m21168f(intent));
                    localMediaM9375i.m9360V(AbstractC10147a.m21169g(intent));
                    localMediaM9375i.m9361W(AbstractC10147a.m21165c(intent));
                }
                m9254G0(localMedia);
            } else {
                m9250E(localMedia, false);
            }
            this.f12088p.notifyItemChanged(this.f12087o.getCurrentItem());
            m9064V1(localMedia);
        }
    }

    /* renamed from: j2 */
    public void m9079j2(boolean z10, String str, boolean z11, int i10, int i11, int i12, long j10, ArrayList arrayList) {
        this.f12261e = i12;
        this.f12074E = j10;
        this.f12085m = arrayList;
        this.f12071B = i11;
        this.f12092t = i10;
        this.f12095w = str;
        this.f12096x = z11;
        this.f12093u = z10;
    }

    /* renamed from: k2 */
    public void m9080k2() {
        this.f12086n.setOnMojitoViewCallback(new C7417j());
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: l0 */
    public void mo9081l0() {
        if (this.f12263g.f12320L) {
            m9057K1();
        }
    }

    /* renamed from: l2 */
    public final void m9082l2() {
        ArrayList arrayList;
        SelectMainStyle selectMainStyleM26627c = PictureSelectionConfig.f12295P0.m26627c();
        if (AbstractC0082o.m228c(selectMainStyleM26627c.m9507D())) {
            this.f12086n.setBackgroundColor(selectMainStyleM26627c.m9507D());
            return;
        }
        if (this.f12263g.f12337c == AbstractC10150d.m21191b() || ((arrayList = this.f12085m) != null && arrayList.size() > 0 && AbstractC10149c.m21175d(((LocalMedia) this.f12085m.get(0)).m9397t()))) {
            this.f12086n.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_white));
        } else {
            this.f12086n.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.ps_color_black));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: m0 */
    public void mo9083m0() {
        PicturePreviewAdapter picturePreviewAdapter = this.f12088p;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.m9145a();
        }
        super.mo9083m0();
    }

    /* renamed from: m2 */
    public final void m9084m2(int i10, int i11, int i12) {
        int i13;
        int i14;
        this.f12086n.m9445A(i10, i11, true);
        if (this.f12096x) {
            i12++;
        }
        ViewParams viewParamsM25088d = AbstractC11246a.m25088d(i12);
        if (viewParamsM25088d == null || i10 == 0) {
            i13 = i11;
            i14 = i10;
        } else if (i11 != 0) {
            this.f12086n.m9450F(viewParamsM25088d.f12468c, viewParamsM25088d.f12469d, viewParamsM25088d.f12470e, viewParamsM25088d.f12471f, i10, i11);
            return;
        } else {
            i14 = i10;
            i13 = i11;
        }
        this.f12086n.m9450F(0, 0, 0, 0, i14, i13);
    }

    /* renamed from: n2 */
    public final void m9085n2() {
        for (int i10 = 0; i10 < this.f12083N.size(); i10++) {
            ((View) this.f12083N.get(i10)).setEnabled(false);
        }
        this.f12089q.getEditor().setEnabled(false);
    }

    /* renamed from: o2 */
    public final void m9086o2(int[] iArr) {
        int i10;
        this.f12086n.m9445A(iArr[0], iArr[1], false);
        ViewParams viewParamsM25088d = AbstractC11246a.m25088d(this.f12096x ? this.f12092t + 1 : this.f12092t);
        if (viewParamsM25088d == null || ((i10 = iArr[0]) == 0 && iArr[1] == 0)) {
            this.f12086n.m9455K(iArr[0], iArr[1], false);
            this.f12086n.setBackgroundAlpha(1.0f);
            for (int i11 = 0; i11 < this.f12083N.size(); i11++) {
                ((View) this.f12083N.get(i11)).setAlpha(1.0f);
            }
        } else {
            this.f12086n.m9450F(viewParamsM25088d.f12468c, viewParamsM25088d.f12469d, viewParamsM25088d.f12470e, viewParamsM25088d.f12471f, i10, iArr[1]);
            this.f12086n.m9454J(false);
        }
        ObjectAnimator.ofFloat(this.f12087o, "alpha", 0.0f, 1.0f).setDuration(50L).start();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (m9061R1()) {
            int size = this.f12085m.size();
            int i10 = this.f12092t;
            if (size > i10) {
                LocalMedia localMedia = (LocalMedia) this.f12085m.get(i10);
                if (AbstractC10149c.m21180i(localMedia.m9397t())) {
                    m9054H1(localMedia, false, new C7421n());
                } else {
                    m9049C1(m9053G1(localMedia, false));
                }
            }
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i10, boolean z10, int i11) throws Resources.NotFoundException {
        if (m9061R1()) {
            return null;
        }
        PictureWindowAnimationStyle pictureWindowAnimationStyleM26629e = PictureSelectionConfig.f12295P0.m26629e();
        if (pictureWindowAnimationStyleM26629e.f12501e == 0 || pictureWindowAnimationStyleM26629e.f12502f == 0) {
            return super.onCreateAnimation(i10, z10, i11);
        }
        Animation animationLoadAnimation = AnimationUtils.loadAnimation(getActivity(), z10 ? pictureWindowAnimationStyleM26629e.f12501e : pictureWindowAnimationStyleM26629e.f12502f);
        if (z10) {
            m9291k0();
            return animationLoadAnimation;
        }
        mo9081l0();
        return animationLoadAnimation;
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        PicturePreviewAdapter picturePreviewAdapter = this.f12088p;
        if (picturePreviewAdapter != null) {
            picturePreviewAdapter.m9145a();
        }
        ViewPager2 viewPager2 = this.f12087o;
        if (viewPager2 != null) {
            viewPager2.unregisterOnPageChangeCallback(this.f12084O);
        }
        super.onDestroy();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("com.luck.picture.lib.current_page", this.f12261e);
        bundle.putLong("com.luck.picture.lib.current_bucketId", this.f12074E);
        bundle.putInt("com.luck.picture.lib.current_preview_position", this.f12092t);
        bundle.putInt("com.luck.picture.lib.current_album_total", this.f12071B);
        bundle.putBoolean("com.luck.picture.lib.external_preview", this.f12097y);
        bundle.putBoolean("com.luck.picture.lib.external_preview_display_delete", this.f12098z);
        bundle.putBoolean("com.luck.picture.lib.display_camera", this.f12096x);
        bundle.putBoolean("com.luck.picture.lib.bottom_preview", this.f12093u);
        bundle.putString("com.luck.picture.lib.current_album_name", this.f12095w);
        AbstractC11370a.m25296d(this.f12085m);
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m9076h2(bundle);
        this.f12094v = bundle != null;
        this.f12072C = AbstractC0072e.m165e(getContext());
        this.f12073D = AbstractC0072e.m167g(getContext());
        this.f12090r = (PreviewTitleBar) view.findViewById(R$id.title_bar);
        this.f12075F = (TextView) view.findViewById(R$id.ps_tv_selected);
        this.f12076G = (TextView) view.findViewById(R$id.ps_tv_selected_word);
        this.f12077H = view.findViewById(R$id.select_click_area);
        this.f12078I = (CompleteSelectView) view.findViewById(R$id.ps_complete_select);
        this.f12086n = (MagicalView) view.findViewById(R$id.magical);
        this.f12087o = new ViewPager2(getContext());
        this.f12089q = (PreviewBottomNavBar) view.findViewById(R$id.bottom_nar_bar);
        this.f12086n.setMagicalContent(this.f12087o);
        m9082l2();
        m9047A1(this.f12090r, this.f12075F, this.f12076G, this.f12077H, this.f12078I, this.f12089q);
        m9067Y1();
        m9013P1();
        m9060Q1(this.f12085m);
        if (this.f12097y) {
            m9052F1();
        } else {
            m9011M1();
            m9059O1((ViewGroup) view);
            m9012N1();
        }
        m9058L1();
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: p0 */
    public void mo9087p0() {
        m9069a2();
    }

    /* renamed from: p2 */
    public final void m9088p2(int i10) {
        this.f12087o.post(new RunnableC7418k(i10));
    }

    /* renamed from: q2 */
    public void m9089q2(LocalMedia localMedia) {
        if (this.f12094v || this.f12093u || !this.f12263g.f12322M) {
            return;
        }
        this.f12087o.post(new RunnableC7413f());
        if (AbstractC10149c.m21180i(localMedia.m9397t())) {
            m9054H1(localMedia, !AbstractC10149c.m21178g(localMedia.m9371g()), new C7414g());
        } else {
            m9086o2(m9053G1(localMedia, !AbstractC10149c.m21178g(localMedia.m9371g())));
        }
    }

    @Override // com.luck.picture.lib.basic.PictureCommonFragment
    /* renamed from: x0 */
    public void mo8988x0(boolean z10, LocalMedia localMedia) {
        this.f12075F.setSelected(AbstractC11370a.m25306n().contains(localMedia));
        this.f12089q.m9610h();
        this.f12078I.setSelectedChange(true);
        m9066X1(localMedia);
        m9065W1(z10, localMedia);
    }
}
