package com.zykj.mistake.activity;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.support.v4.media.AbstractC0037f;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.FragmentManager;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.blankj.utilcode.util.AbstractC3386f;
import com.bumptech.glide.C3412f;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.google.gson.C3841g;
import com.zykj.mistake.R;
import com.zykj.mistake.adapter.DetailPagerAdapter;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivityMistakeDetailBinding;
import com.zykj.mistake.entity.req.CreateOrUpdateMistakeReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.entity.resp.MistakeDetail;
import com.zykj.mistake.entity.resp.MistakeListResp;
import com.zykj.mistake.network.C5088a;
import com.zykj.mistake.presenter.MistakeDetailPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.utils.C5100e;
import com.zykj.mistake.widget.CustomViewPager;
import com.zykj.mistake.widget.FlowLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p021b5.C3192d;
import p045d6.C5443s;
import p095k1.C5752a;
import p106l4.DialogC6058i;
import p152r6.InterfaceC6469a;
import p180v0.AbstractC6664k;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/activity/MistakeDetailActivity;", "Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/presenter/MistakeDetailPresenter;", "Lcom/zykj/mistake/databinding/ActivityMistakeDetailBinding;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeDetailActivity.kt\ncom/zykj/mistake/activity/MistakeDetailActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,917:1\n1869#2,2:918\n1869#2,2:920\n1869#2,2:922\n774#2:924\n865#2,2:925\n1869#2,2:927\n1869#2,2:929\n1869#2:931\n1761#2,3:932\n1870#2:935\n774#2:936\n865#2,2:937\n1869#2,2:939\n774#2:941\n865#2,2:942\n1869#2,2:944\n774#2:946\n865#2:947\n1761#2,3:948\n866#2:951\n774#2:953\n865#2,2:954\n1869#2,2:956\n295#2,2:958\n1#3:952\n*S KotlinDebug\n*F\n+ 1 MistakeDetailActivity.kt\ncom/zykj/mistake/activity/MistakeDetailActivity\n*L\n192#1:918,2\n220#1:920,2\n235#1:922,2\n391#1:924\n391#1:925,2\n541#1:927,2\n593#1:929,2\n660#1:931\n664#1:932,3\n660#1:935\n801#1:936\n801#1:937,2\n801#1:939,2\n803#1:941\n803#1:942,2\n804#1:944,2\n881#1:946\n881#1:947\n881#1:948,3\n881#1:951\n477#1:953\n477#1:954,2\n477#1:956,2\n701#1:958,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeDetailActivity extends BaseMVPActivity<MistakeDetailPresenter, ActivityMistakeDetailBinding> {

    /* renamed from: s */
    public static final /* synthetic */ int f5816s = 0;

    /* renamed from: e */
    public PopupWindow f5817e;

    /* renamed from: f */
    public Dialog f5818f;

    /* renamed from: g */
    public DialogC6058i f5819g;

    /* renamed from: l */
    public DetailPagerAdapter f5824l;

    /* renamed from: o */
    public long f5827o;

    /* renamed from: p */
    public long f5828p;

    /* renamed from: r */
    public int f5830r;

    /* renamed from: h */
    public MistakeDetail f5820h = new MistakeDetail();

    /* renamed from: i */
    public final ArrayList f5821i = new ArrayList();

    /* renamed from: j */
    public final int f5822j = 6;

    /* renamed from: k */
    public final ArrayList f5823k = new ArrayList();

    /* renamed from: m */
    public MultiRemoveMistakeReq f5825m = new MultiRemoveMistakeReq();

    /* renamed from: n */
    public MultiSetTagsReq f5826n = new MultiSetTagsReq();

    /* renamed from: q */
    public final ArrayList f5829q = new ArrayList();

    /* renamed from: x */
    public static View m3922x(MistakeDetailActivity mistakeDetailActivity, CustomTagInfo customTagInfo, boolean z8, int i) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        boolean z9 = (i & 4) == 0;
        mistakeDetailActivity.getClass();
        View viewInflate = LayoutInflater.from(mistakeDetailActivity).inflate(R.layout.item_mistake_tag, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.iv_add);
        viewInflate.setSelected(z8);
        if (z9) {
            textView.setVisibility(8);
            imageView.setVisibility(0);
        } else {
            textView.setVisibility(0);
            imageView.setVisibility(8);
            textView.setText(customTagInfo.getName());
        }
        imageView.setOnClickListener(new ViewOnClickListenerC4487w(mistakeDetailActivity, 10));
        textView.setOnClickListener(new ViewOnClickListenerC4475k(viewInflate, mistakeDetailActivity, customTagInfo, 1));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC4476l(1, customTagInfo, mistakeDetailActivity));
        return viewInflate;
    }

    /* renamed from: A */
    public final void m3923A() {
        ((ActivityMistakeDetailBinding) m3957p()).f6059n.setText(m3929w().getRealTitle());
        MultiRemoveMistakeReq multiRemoveMistakeReq = new MultiRemoveMistakeReq();
        this.f5825m = multiRemoveMistakeReq;
        multiRemoveMistakeReq.setBookId((int) this.f5827o);
        this.f5825m.getItemIds().add(Integer.valueOf((int) m3929w().getId()));
        MultiSetTagsReq multiSetTagsReq = new MultiSetTagsReq();
        this.f5826n = multiSetTagsReq;
        multiSetTagsReq.setBookId((int) this.f5827o);
        this.f5826n.getItemIds().add(Integer.valueOf((int) m3929w().getId()));
        if (m3929w().getNumber() == null) {
            MistakeDetailPresenter mistakeDetailPresenter = (MistakeDetailPresenter) m3965r();
            int id = (int) m3929w().getId();
            C5088a c5088a = C5088a.f7986a;
            mistakeDetailPresenter.m3969a(C5088a.m4381b().m4392j(id), new C3192d(mistakeDetailPresenter, 0));
            return;
        }
        if (m3929w().getIsRelatedQstGroup()) {
            MistakeDetailPresenter mistakeDetailPresenter2 = (MistakeDetailPresenter) m3965r();
            int id2 = (int) m3929w().getId();
            C5088a c5088a2 = C5088a.f7986a;
            mistakeDetailPresenter2.m3969a(C5088a.m4381b().m4384b(id2), new C3192d(mistakeDetailPresenter2, 1));
            return;
        }
        MistakeDetailPresenter mistakeDetailPresenter3 = (MistakeDetailPresenter) m3965r();
        int id3 = (int) m3929w().getId();
        C5088a c5088a3 = C5088a.f7986a;
        mistakeDetailPresenter3.m3969a(C5088a.m4381b().m4401s(id3), new C3192d(mistakeDetailPresenter3, 2));
    }

    /* renamed from: B */
    public final void m3924B(String error) {
        AbstractC5830k.m5330g(error, "error");
        m3928v();
        mo3962b(error);
    }

    /* renamed from: C */
    public final void m3925C() {
        ((ActivityMistakeDetailBinding) m3957p()).f6047b.removeAllViews();
        ArrayList arrayListM3927u = m3927u();
        int size = arrayListM3927u.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM3927u.get(i);
            i++;
            CustomTagInfo customTagInfo = (CustomTagInfo) obj;
            FlowLayout flowLayout = ((ActivityMistakeDetailBinding) m3957p()).f6047b;
            View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_mistake_tag_little, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
            textView.setText(customTagInfo.getName());
            int localType = customTagInfo.getLocalType();
            if (localType == -1) {
                textView.setBackgroundResource(R.drawable.bg_blue_corner);
            } else if (localType == 0) {
                textView.setBackgroundResource(R.drawable.bg_tag_green);
            } else if (localType == 1) {
                textView.setBackgroundResource(R.drawable.bg_tag_yellow);
            } else if (localType == 2) {
                textView.setBackgroundResource(R.drawable.bg_tag_red);
            }
            flowLayout.addView(viewInflate);
        }
    }

    /* renamed from: D */
    public final void m3926D() {
        if (m3929w().getHasStem()) {
            C5088a c5088a = C5088a.f7986a;
            ((ActivityMistakeDetailBinding) m3957p()).f6062q.m4481b(C5088a.f7987b + this.f5820h.getQstPath() + "?showAnalysis=" + this.f5820h.getIsShowAnswer());
        }
        ((ActivityMistakeDetailBinding) m3957p()).f6053h.setVisibility(8);
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_mistake_detail;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i8, Intent intent) {
        String stringExtra;
        CreateOrUpdateMistakeReq createOrUpdateMistakeReq;
        super.onActivityResult(i, i8, intent);
        if (i == 0 && i8 == -1) {
            if (intent != null && (stringExtra = intent.getStringExtra("EDIT_MISTAKE_DATA")) != null && (createOrUpdateMistakeReq = (CreateOrUpdateMistakeReq) AbstractC3386f.m2337a().m2784c(stringExtra, new C5752a(CreateOrUpdateMistakeReq.class))) != null) {
                MistakeListResp.MistakeInfo mistakeInfoM3929w = m3929w();
                mistakeInfoM3929w.setTitle(createOrUpdateMistakeReq.getTitle());
                String stemShoot = createOrUpdateMistakeReq.getStemShoot();
                if (stemShoot != null) {
                    mistakeInfoM3929w.setStemShoot(stemShoot);
                }
            }
            m3923A();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC5830k.m5327d(keyEvent);
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (!((ActivityMistakeDetailBinding) m3957p()).f6046a.isDrawerOpen(GravityCompat.END)) {
            return super.onKeyDown(i, keyEvent);
        }
        ((ActivityMistakeDetailBinding) m3957p()).f6046a.closeDrawer(GravityCompat.END);
        return true;
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() throws Resources.NotFoundException {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        AbstractC5830k.m5329f(supportFragmentManager, "getSupportFragmentManager(...)");
        this.f5824l = new DetailPagerAdapter(this, supportFragmentManager);
        CustomViewPager customViewPager = ((ActivityMistakeDetailBinding) m3957p()).f6061p;
        DetailPagerAdapter detailPagerAdapter = this.f5824l;
        if (detailPagerAdapter == null) {
            AbstractC5830k.m5339p("mDetailPagerAdapter");
            throw null;
        }
        customViewPager.setAdapter(detailPagerAdapter);
        ((ActivityMistakeDetailBinding) m3957p()).f6061p.setOffscreenPageLimit(4);
        ((ActivityMistakeDetailBinding) m3957p()).f6055j.setViewPager(((ActivityMistakeDetailBinding) m3957p()).f6061p);
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.dialog_show_more, (ViewGroup) null);
        this.f5817e = new PopupWindow(viewInflate, -2, -2);
        ((LinearLayoutCompat) viewInflate.findViewById(R.id.ll_ask)).setOnClickListener(new ViewOnClickListenerC4486v(this));
        ((LinearLayoutCompat) viewInflate.findViewById(R.id.ll_edit)).setOnClickListener(new ViewOnClickListenerC4487w(this, 0));
        ((LinearLayoutCompat) viewInflate.findViewById(R.id.ll_remove)).setOnClickListener(new ViewOnClickListenerC4487w(this, 1));
        PopupWindow popupWindow = this.f5817e;
        if (popupWindow == null) {
            AbstractC5830k.m5339p("mMorePopUpWindow");
            throw null;
        }
        popupWindow.setOutsideTouchable(true);
        PopupWindow popupWindow2 = this.f5817e;
        if (popupWindow2 == null) {
            AbstractC5830k.m5339p("mMorePopUpWindow");
            throw null;
        }
        popupWindow2.setFocusable(true);
        PopupWindow popupWindow3 = this.f5817e;
        if (popupWindow3 == null) {
            AbstractC5830k.m5339p("mMorePopUpWindow");
            throw null;
        }
        popupWindow3.setBackgroundDrawable(new ColorDrawable(0));
        this.f5819g = new DialogC6058i(this, 6);
        ((ActivityMistakeDetailBinding) m3957p()).f6046a.setDrawerLockMode(1);
        ((ActivityMistakeDetailBinding) m3957p()).f6048c.f6160j.setText(getString(R.string.edit_tag));
        ((ActivityMistakeDetailBinding) m3957p()).f6048c.f6152b.setOnClickListener(new ViewOnClickListenerC4487w(this, 4));
        ((ActivityMistakeDetailBinding) m3957p()).f6048c.f6151a.setOnClickListener(new ViewOnClickListenerC4487w(this, 5));
        View viewInflate2 = LayoutInflater.from(this).inflate(R.layout.dialog_remove_mistake, (ViewGroup) null);
        AbstractC5830k.m5329f(viewInflate2, "inflate(...)");
        ((TextView) viewInflate2.findViewById(R.id.tv_cancel)).setOnClickListener(new ViewOnClickListenerC4487w(this, 2));
        ((TextView) viewInflate2.findViewById(R.id.tv_confirm)).setOnClickListener(new ViewOnClickListenerC4487w(this, 3));
        Dialog dialog = new Dialog(this, R.style.remind_dialog_theme);
        this.f5818f = dialog;
        dialog.setContentView(viewInflate2);
        Dialog dialog2 = this.f5818f;
        if (dialog2 == null) {
            AbstractC5830k.m5339p("mRemoveMistakeDialog");
            throw null;
        }
        dialog2.setCanceledOnTouchOutside(true);
        ((ActivityMistakeDetailBinding) m3957p()).f6049d.setOnClickListener(new ViewOnClickListenerC4487w(this, 6));
        ((ActivityMistakeDetailBinding) m3957p()).f6051f.setOnClickListener(new ViewOnClickListenerC4487w(this, 7));
        ((ActivityMistakeDetailBinding) m3957p()).f6050e.setOnClickListener(new ViewOnClickListenerC4487w(this, 8));
        ((ActivityMistakeDetailBinding) m3957p()).f6058m.setOnClickListener(new ViewOnClickListenerC4487w(this, 9));
        TextView tvLast = ((ActivityMistakeDetailBinding) m3957p()).f6056k;
        AbstractC5830k.m5329f(tvLast, "tvLast");
        final int i = 0;
        C5100e.m4461e(tvLast, new InterfaceC6469a(this) { // from class: com.zykj.mistake.activity.x

            /* renamed from: b */
            public final /* synthetic */ MistakeDetailActivity f5953b;

            {
                this.f5953b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i) {
                    case 0:
                        MistakeDetailActivity mistakeDetailActivity = this.f5953b;
                        int i8 = mistakeDetailActivity.f5830r;
                        if (i8 > 0) {
                            mistakeDetailActivity.f5830r = i8 - 1;
                            mistakeDetailActivity.m3923A();
                            C5100e.m4458b(4, "MistakeDetailSwitch", "上一题");
                        } else {
                            mistakeDetailActivity.mo3962b("已是第一题");
                        }
                        break;
                    default:
                        MistakeDetailActivity mistakeDetailActivity2 = this.f5953b;
                        if (mistakeDetailActivity2.f5830r < mistakeDetailActivity2.f5829q.size() - 1) {
                            mistakeDetailActivity2.f5830r++;
                            mistakeDetailActivity2.m3923A();
                            C5100e.m4458b(4, "MistakeDetailSwitch", "下一题");
                        } else {
                            mistakeDetailActivity2.mo3962b("已是最后一题");
                        }
                        break;
                }
                return C5443s.f8405a;
            }
        });
        TextView tvNext = ((ActivityMistakeDetailBinding) m3957p()).f6057l;
        AbstractC5830k.m5329f(tvNext, "tvNext");
        final int i8 = 1;
        C5100e.m4461e(tvNext, new InterfaceC6469a(this) { // from class: com.zykj.mistake.activity.x

            /* renamed from: b */
            public final /* synthetic */ MistakeDetailActivity f5953b;

            {
                this.f5953b = this;
            }

            @Override // p152r6.InterfaceC6469a
            public final Object invoke() {
                switch (i8) {
                    case 0:
                        MistakeDetailActivity mistakeDetailActivity = this.f5953b;
                        int i82 = mistakeDetailActivity.f5830r;
                        if (i82 > 0) {
                            mistakeDetailActivity.f5830r = i82 - 1;
                            mistakeDetailActivity.m3923A();
                            C5100e.m4458b(4, "MistakeDetailSwitch", "上一题");
                        } else {
                            mistakeDetailActivity.mo3962b("已是第一题");
                        }
                        break;
                    default:
                        MistakeDetailActivity mistakeDetailActivity2 = this.f5953b;
                        if (mistakeDetailActivity2.f5830r < mistakeDetailActivity2.f5829q.size() - 1) {
                            mistakeDetailActivity2.f5830r++;
                            mistakeDetailActivity2.m3923A();
                            C5100e.m4458b(4, "MistakeDetailSwitch", "下一题");
                        } else {
                            mistakeDetailActivity2.mo3962b("已是最后一题");
                        }
                        break;
                }
                return C5443s.f8405a;
            }
        });
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: s */
    public final Class mo3916s() {
        return MistakeDetailPresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: t */
    public final void mo3917t() {
        this.f5827o = getIntent().getLongExtra("bookId", 0L);
        this.f5828p = getIntent().getLongExtra("topicId", 0L);
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("mistakeList");
        if (stringArrayListExtra != null) {
            int size = stringArrayListExtra.size();
            int i = 0;
            while (i < size) {
                String str = stringArrayListExtra.get(i);
                i++;
                this.f5829q.add(new C3841g().m2784c(str, new C5752a(MistakeListResp.MistakeInfo.class)));
            }
        }
        this.f5830r = getIntent().getIntExtra(RequestParameters.POSITION, -1);
        ComponentCallbacks2C3408b.m2360c(this).m2364b();
        new Thread(new Runnable() { // from class: com.zykj.mistake.activity.u
            @Override // java.lang.Runnable
            public final void run() {
                int i8 = MistakeDetailActivity.f5816s;
                ComponentCallbacks2C3408b componentCallbacks2C3408bM2360c = ComponentCallbacks2C3408b.m2360c(this.f5948a);
                componentCallbacks2C3408bM2360c.getClass();
                char[] cArr = AbstractC6664k.f11243a;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    throw new IllegalArgumentException("You must call this method on a background thread");
                }
                componentCallbacks2C3408bM2360c.f2198a.f2296f.m2053a().clear();
            }
        }).start();
        m3923A();
    }

    /* renamed from: u */
    public final ArrayList m3927u() {
        ArrayList arrayList = new ArrayList();
        if (this.f5820h.getDiff() != 0) {
            arrayList.add(new CustomTagInfo(AbstractC5099d.f8030a[this.f5820h.getDiff() - 1], this.f5820h.getDiff(), 0, 0, 4, null));
        }
        if (this.f5820h.getAttainedLevel() != 0) {
            arrayList.add(new CustomTagInfo(AbstractC5099d.f8031b[this.f5820h.getAttainedLevel() - 1], this.f5820h.getAttainedLevel(), 0, 1, 4, null));
        }
        if (this.f5820h.getErrorReason() != 0) {
            arrayList.add(new CustomTagInfo(AbstractC5099d.f8032c[this.f5820h.getErrorReason() - 1], this.f5820h.getErrorReason(), 0, 2, 4, null));
        }
        arrayList.addAll(this.f5820h.getMistakeTags());
        return arrayList;
    }

    /* renamed from: v */
    public final void m3928v() {
        if (!getSharedPreferences("zykjMistake", 0).getBoolean("SP_CONTACT_MODE", false)) {
            m3926D();
            return;
        }
        if (m3929w().getHasStem()) {
            ((ActivityMistakeDetailBinding) m3957p()).f6062q.m4481b(AbstractC0037f.m75D(C5088a.f7987b, this.f5820h.getQstPath(), "?showAnalysis=false"));
        }
        ((ActivityMistakeDetailBinding) m3957p()).f6053h.setVisibility(0);
    }

    /* renamed from: w */
    public final MistakeListResp.MistakeInfo m3929w() {
        Object obj = this.f5829q.get(this.f5830r);
        AbstractC5830k.m5329f(obj, "get(...)");
        return (MistakeListResp.MistakeInfo) obj;
    }

    /* renamed from: y */
    public final void m3930y() {
        ((ActivityMistakeDetailBinding) m3957p()).f6052g.removeAllViews();
        ArrayList<String> extraStems = this.f5820h.getExtraStems();
        int size = extraStems.size();
        int i = 0;
        while (i < size) {
            String str = extraStems.get(i);
            i++;
            String str2 = str;
            ImageView imageView = new ImageView(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(getResources().getDimensionPixelSize(R.dimen.view_2), getResources().getDimensionPixelSize(R.dimen.view_2), getResources().getDimensionPixelSize(R.dimen.view_2), getResources().getDimensionPixelSize(R.dimen.view_2));
            imageView.setLayoutParams(layoutParams);
            ((ActivityMistakeDetailBinding) m3957p()).f6052g.addView(imageView);
            C3412f c3412fM2384j = ComponentCallbacks2C3408b.m2361d(this).m5863c(this).m2384j();
            c3412fM2384j.f2234w = str2;
            c3412fM2384j.f2236y = true;
            ((C3412f) c3412fM2384j.m6087h(R.mipmap.pic_error)).m2379z(new C4489y(imageView, this, str2));
        }
        ((ActivityMistakeDetailBinding) m3957p()).f6054i.setVisibility(0);
        ((ActivityMistakeDetailBinding) m3957p()).f6062q.setVisibility(8);
    }

    /* renamed from: z */
    public final void m3931z() {
        ((ActivityMistakeDetailBinding) m3957p()).f6054i.setVisibility(8);
        ((ActivityMistakeDetailBinding) m3957p()).f6062q.setVisibility(0);
    }
}
