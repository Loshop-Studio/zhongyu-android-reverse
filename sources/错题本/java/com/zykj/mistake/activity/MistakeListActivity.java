package com.zykj.mistake.activity;

// RE note 本类字节码直接引用的读写或显示接口包括偏好设置。

import android.app.Dialog;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.ComponentCallbacks2C3408b;
import com.zykj.mistake.R;
import com.zykj.mistake.adapter.MistakeListAdapter;
import com.zykj.mistake.base.BaseMVPActivity;
import com.zykj.mistake.databinding.ActivityMistakeListBinding;
import com.zykj.mistake.entity.req.MistakeListReq;
import com.zykj.mistake.entity.req.MultiRemoveMistakeReq;
import com.zykj.mistake.entity.req.MultiSetTagsReq;
import com.zykj.mistake.entity.resp.CustomTagInfo;
import com.zykj.mistake.presenter.MistakeListPresenter;
import com.zykj.mistake.utils.AbstractC5099d;
import com.zykj.mistake.widget.FlowLayout;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import p006a5.ViewOnClickListenerC0015f;
import p106l4.DialogC6058i;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/mistake/activity/MistakeListActivity;", "Lcom/zykj/mistake/base/BaseMVPActivity;", "Lcom/zykj/mistake/presenter/MistakeListPresenter;", "Lcom/zykj/mistake/databinding/ActivityMistakeListBinding;", "", "<init>", "()V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMistakeListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MistakeListActivity.kt\ncom/zykj/mistake/activity/MistakeListActivity\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,854:1\n1869#2,2:855\n1869#2,2:857\n1869#2:859\n1869#2:860\n774#2:861\n865#2,2:862\n1869#2,2:864\n1870#2:866\n1870#2:867\n1869#2:868\n230#2,2:869\n1870#2:871\n1761#2,3:872\n1761#2,3:875\n1761#2,3:878\n1869#2:881\n1761#2,3:882\n1870#2:885\n774#2:886\n865#2,2:887\n774#2:889\n865#2,2:890\n1869#2,2:892\n774#2:894\n865#2,2:895\n1869#2,2:897\n774#2:899\n865#2,2:900\n1869#2,2:902\n774#2:904\n865#2,2:905\n1869#2,2:907\n1869#2,2:909\n774#2:911\n865#2,2:912\n1869#2,2:914\n230#2,2:916\n*S KotlinDebug\n*F\n+ 1 MistakeListActivity.kt\ncom/zykj/mistake/activity/MistakeListActivity\n*L\n172#1:855,2\n269#1:857,2\n288#1:859\n293#1:860\n294#1:861\n294#1:862,2\n295#1:864,2\n293#1:866\n288#1:867\n621#1:868\n621#1:869,2\n621#1:871\n674#1:872,3\n685#1:875,3\n696#1:878,3\n701#1:881\n705#1:882,3\n701#1:885\n777#1:886\n777#1:887,2\n830#1:889\n830#1:890,2\n830#1:892,2\n832#1:894\n832#1:895,2\n832#1:897,2\n389#1:899\n389#1:900,2\n389#1:902,2\n407#1:904\n407#1:905,2\n407#1:907,2\n412#1:909,2\n440#1:911\n440#1:912,2\n462#1:914,2\n738#1:916,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MistakeListActivity extends BaseMVPActivity<MistakeListPresenter, ActivityMistakeListBinding> {

    /* renamed from: x */
    public static final /* synthetic */ int f5831x = 0;

    /* renamed from: f */
    public MistakeListAdapter f5833f;

    /* renamed from: g */
    public Dialog f5834g;

    /* renamed from: h */
    public DialogC6058i f5835h;

    /* renamed from: j */
    public int f5837j;

    /* renamed from: k */
    public boolean f5838k;

    /* renamed from: l */
    public boolean f5839l;

    /* renamed from: m */
    public boolean f5840m;

    /* renamed from: q */
    public long f5844q;

    /* renamed from: r */
    public long f5845r;

    /* renamed from: w */
    public boolean f5850w;

    /* renamed from: e */
    public final ArrayList f5832e = new ArrayList();

    /* renamed from: i */
    public final int f5836i = 10;

    /* renamed from: n */
    public final MistakeListReq f5841n = new MistakeListReq();

    /* renamed from: o */
    public final MultiRemoveMistakeReq f5842o = new MultiRemoveMistakeReq();

    /* renamed from: p */
    public final MultiSetTagsReq f5843p = new MultiSetTagsReq();

    /* renamed from: s */
    public final ArrayList f5846s = new ArrayList();

    /* renamed from: t */
    public final ArrayList f5847t = new ArrayList();

    /* renamed from: u */
    public final ArrayList f5848u = new ArrayList();

    /* renamed from: v */
    public final int f5849v = 6;

    /* renamed from: D */
    public static void m3932D(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setEnabled(z8);
        }
    }

    /* renamed from: y */
    public static View m3933y(MistakeListActivity mistakeListActivity, CustomTagInfo customTagInfo, boolean z8, int i) {
        if ((i & 2) != 0) {
            z8 = false;
        }
        boolean z9 = (i & 4) == 0;
        mistakeListActivity.getClass();
        View viewInflate = LayoutInflater.from(mistakeListActivity).inflate(R.layout.item_mistake_tag, (ViewGroup) null);
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
        imageView.setOnClickListener(new ViewOnClickListenerC4490z(mistakeListActivity, 11));
        textView.setOnClickListener(new ViewOnClickListenerC4475k(viewInflate, mistakeListActivity, customTagInfo, 2));
        textView.setOnLongClickListener(new ViewOnLongClickListenerC4476l(mistakeListActivity, customTagInfo));
        return viewInflate;
    }

    /* renamed from: A */
    public final void m3934A(boolean z8) {
        this.f5847t.clear();
        int childCount = ((ActivityMistakeListBinding) m3957p()).f6067b.f6155e.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = ((ActivityMistakeListBinding) m3957p()).f6067b.f6155e.getChildAt(i);
            childAt.setSelected(false);
            m3932D((ViewGroup) childAt, z8);
        }
        int childCount2 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6156f.getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6156f.getChildAt(i8);
            childAt2.setSelected(false);
            m3932D((ViewGroup) childAt2, z8);
        }
        int childCount3 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6157g.getChildCount();
        for (int i9 = 0; i9 < childCount3; i9++) {
            View childAt3 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6157g.getChildAt(i9);
            childAt3.setSelected(false);
            m3932D((ViewGroup) childAt3, z8);
        }
        int childCount4 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6154d.getChildCount();
        for (int i10 = 0; i10 < childCount4; i10++) {
            View childAt4 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6154d.getChildAt(i10);
            childAt4.setSelected(false);
            m3932D((ViewGroup) childAt4, z8);
        }
    }

    /* renamed from: B */
    public final void m3935B(boolean z8) {
        if (z8) {
            ((ActivityMistakeListBinding) m3957p()).f6082q.setText(getString(R.string.practice_mode_open));
            ((ActivityMistakeListBinding) m3957p()).f6082q.setSelected(true);
        } else {
            ((ActivityMistakeListBinding) m3957p()).f6082q.setText(getString(R.string.practice_mode_close));
            ((ActivityMistakeListBinding) m3957p()).f6082q.setSelected(false);
        }
    }

    /* renamed from: C */
    public final void m3936C(View view, CustomTagInfo customTagInfo) {
        boolean z8 = this.f5850w;
        ArrayList arrayList = this.f5847t;
        if (z8) {
            int i = 0;
            ((ActivityMistakeListBinding) m3957p()).f6067b.f6153c.getChildAt(0).setSelected(false);
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((CustomTagInfo) obj).getLocalType() == 3) {
                    arrayList2.add(obj);
                }
            }
            arrayList.removeAll(arrayList2);
        }
        view.setSelected(true);
        arrayList.add(customTagInfo);
    }

    /* renamed from: E */
    public final void m3937E(Integer num) {
        this.f5840m = true;
        MistakeListAdapter mistakeListAdapter = this.f5833f;
        if (mistakeListAdapter == null) {
            AbstractC5830k.m5339p("mMistakeListAdapter");
            throw null;
        }
        mistakeListAdapter.m3954a(true, num);
        ((ActivityMistakeListBinding) m3957p()).f6081p.setVisibility(8);
        ((ActivityMistakeListBinding) m3957p()).f6080o.setVisibility(8);
        ((ActivityMistakeListBinding) m3957p()).f6082q.setVisibility(8);
        ((ActivityMistakeListBinding) m3957p()).f6073h.setVisibility(0);
        if (num != null) {
            m3940w();
            this.f5846s.add(num.toString());
        } else {
            m3939v();
        }
        ((ActivityMistakeListBinding) m3957p()).f6077l.setEnabled(false);
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: o */
    public final int mo3905o() {
        return R.layout.activity_mistake_list;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.view.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i8, Intent intent) {
        super.onActivityResult(i, i8, intent);
        if (intent == null || !intent.getBooleanExtra("IS_DELETED", false)) {
            return;
        }
        String string = getString(R.string.remove_mistake_success);
        AbstractC5830k.m5329f(string, "getString(...)");
        mo3962b(string);
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        ComponentCallbacks2C3408b.m2360c(this).m2364b();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        AbstractC5830k.m5327d(keyEvent);
        if (keyEvent.getKeyCode() != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (((ActivityMistakeListBinding) m3957p()).f6066a.isDrawerOpen(GravityCompat.END)) {
            ((ActivityMistakeListBinding) m3957p()).f6066a.closeDrawer(GravityCompat.END);
            return true;
        }
        if (!this.f5840m) {
            return super.onKeyDown(i, keyEvent);
        }
        m3941x();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        MistakeListReq mistakeListReq = this.f5841n;
        mistakeListReq.setSkipCount(0);
        ((MistakeListPresenter) m3965r()).m4438d(mistakeListReq, true);
    }

    @Override // com.zykj.mistake.base.BaseActivity
    /* renamed from: q */
    public final void mo3906q() {
        m3935B(getSharedPreferences("zykjMistake", 0).getBoolean("SP_CONTACT_MODE", false));
        ((ActivityMistakeListBinding) m3957p()).f6082q.setOnClickListener(new ViewOnClickListenerC4490z(this, 0));
        ((ActivityMistakeListBinding) m3957p()).f6077l.setColorSchemeResources(R.color.colorPrimary);
        ((ActivityMistakeListBinding) m3957p()).f6077l.setOnRefreshListener(new C4482r(this));
        RecyclerView.LayoutManager layoutManager = ((ActivityMistakeListBinding) m3957p()).f6076k.getLayoutManager();
        AbstractC5830k.m5328e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
        ((ActivityMistakeListBinding) m3957p()).f6076k.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.zykj.mistake.activity.MistakeListActivity$initRecycler$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                AbstractC5830k.m5330g(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    MistakeListActivity mistakeListActivity = this.f5851a;
                    if (mistakeListActivity.f5837j + mistakeListActivity.f5836i < gridLayoutManager.getItemCount() || !mistakeListActivity.f5838k || mistakeListActivity.f5840m || !mistakeListActivity.f5839l) {
                        return;
                    }
                    MistakeListReq mistakeListReq = mistakeListActivity.f5841n;
                    mistakeListReq.setSkipCount(mistakeListReq.getSkipCount() + 20);
                    ((MistakeListPresenter) mistakeListActivity.m3965r()).m4438d(mistakeListReq, false);
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i8) {
                AbstractC5830k.m5330g(recyclerView, "recyclerView");
                super.onScrolled(recyclerView, i, i8);
                int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
                MistakeListActivity mistakeListActivity = this.f5851a;
                mistakeListActivity.f5837j = iFindLastVisibleItemPosition;
                mistakeListActivity.f5839l = i8 > 0;
            }
        });
        ArrayList mMistakeList = this.f5832e;
        AbstractC5830k.m5330g(mMistakeList, "mMistakeList");
        MistakeListAdapter mistakeListAdapter = new MistakeListAdapter();
        mistakeListAdapter.f5972a = this;
        mistakeListAdapter.f5973b = mMistakeList;
        mistakeListAdapter.f5974c = this;
        this.f5833f = mistakeListAdapter;
        RecyclerView recyclerView = ((ActivityMistakeListBinding) m3957p()).f6076k;
        MistakeListAdapter mistakeListAdapter2 = this.f5833f;
        if (mistakeListAdapter2 == null) {
            AbstractC5830k.m5339p("mMistakeListAdapter");
            throw null;
        }
        recyclerView.setAdapter(mistakeListAdapter2);
        this.f5835h = new DialogC6058i(this, 6);
        ((ActivityMistakeListBinding) m3957p()).f6066a.setDrawerLockMode(1);
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6160j.setText(getString(R.string.edit_tag));
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6152b.setOnClickListener(new ViewOnClickListenerC4490z(this, 1));
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6151a.setOnClickListener(new ViewOnClickListenerC4490z(this, 2));
        View viewInflate = LayoutInflater.from(this).inflate(R.layout.item_mistake_tag, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.tv_item_tag_content);
        textView.setText(getString(R.string.no_tag));
        textView.setOnClickListener(new ViewOnClickListenerC0015f(6, viewInflate, this));
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6153c.addView(viewInflate);
        View viewInflate2 = LayoutInflater.from(this).inflate(R.layout.dialog_remove_mistake, (ViewGroup) null);
        AbstractC5830k.m5329f(viewInflate2, "inflate(...)");
        ((TextView) viewInflate2.findViewById(R.id.tv_cancel)).setOnClickListener(new ViewOnClickListenerC4490z(this, 9));
        ((TextView) viewInflate2.findViewById(R.id.tv_confirm)).setOnClickListener(new ViewOnClickListenerC4490z(this, 10));
        Dialog dialog = new Dialog(this, R.style.remind_dialog_theme);
        this.f5834g = dialog;
        dialog.setContentView(viewInflate2);
        Dialog dialog2 = this.f5834g;
        if (dialog2 == null) {
            AbstractC5830k.m5339p("mRemoveMistakeDialog");
            throw null;
        }
        dialog2.setCanceledOnTouchOutside(true);
        ((ActivityMistakeListBinding) m3957p()).f6068c.setOnClickListener(new ViewOnClickListenerC4490z(this, 3));
        ((ActivityMistakeListBinding) m3957p()).f6081p.setOnClickListener(new ViewOnClickListenerC4490z(this, 4));
        ((ActivityMistakeListBinding) m3957p()).f6080o.setOnClickListener(new ViewOnClickListenerC4490z(this, 5));
        ((ActivityMistakeListBinding) m3957p()).f6071f.setOnClickListener(new ViewOnClickListenerC4490z(this, 6));
        ((ActivityMistakeListBinding) m3957p()).f6072g.setOnClickListener(new ViewOnClickListenerC4490z(this, 7));
        ((ActivityMistakeListBinding) m3957p()).f6074i.setOnClickListener(new ViewOnClickListenerC4490z(this, 8));
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: s */
    public final Class mo3916s() {
        return MistakeListPresenter.class;
    }

    @Override // com.zykj.mistake.base.BaseMVPActivity
    /* renamed from: t */
    public final void mo3917t() {
        ((ActivityMistakeListBinding) m3957p()).f6083r.setText(getIntent().getStringExtra(HintConstants.AUTOFILL_HINT_NAME));
        this.f5844q = getIntent().getLongExtra("bookId", 0L);
        this.f5845r = getIntent().getLongExtra("topicId", 0L);
        Long lValueOf = Long.valueOf(this.f5844q);
        MistakeListReq mistakeListReq = this.f5841n;
        mistakeListReq.setBookId(lValueOf);
        mistakeListReq.setMaxResultCount(20);
        this.f5842o.setBookId((int) this.f5844q);
        this.f5843p.setBookId((int) this.f5844q);
        MistakeListReq mistakeListReq2 = this.f5841n;
        mistakeListReq2.setSkipCount(0);
        ((MistakeListPresenter) m3965r()).m4438d(mistakeListReq2, true);
    }

    /* renamed from: u */
    public final void m3938u() {
        if (this.f5832e.isEmpty()) {
            ((ActivityMistakeListBinding) m3957p()).f6075j.setVisibility(0);
        } else {
            ((ActivityMistakeListBinding) m3957p()).f6075j.setVisibility(8);
        }
    }

    /* renamed from: v */
    public final void m3939v() {
        ((ActivityMistakeListBinding) m3957p()).f6071f.setEnabled(false);
        ((ActivityMistakeListBinding) m3957p()).f6069d.setEnabled(false);
        ((ActivityMistakeListBinding) m3957p()).f6078m.setEnabled(false);
        ((ActivityMistakeListBinding) m3957p()).f6072g.setEnabled(false);
        ((ActivityMistakeListBinding) m3957p()).f6070e.setEnabled(false);
        ((ActivityMistakeListBinding) m3957p()).f6079n.setEnabled(false);
    }

    /* renamed from: w */
    public final void m3940w() {
        ((ActivityMistakeListBinding) m3957p()).f6071f.setEnabled(true);
        ((ActivityMistakeListBinding) m3957p()).f6069d.setEnabled(true);
        ((ActivityMistakeListBinding) m3957p()).f6078m.setEnabled(true);
        ((ActivityMistakeListBinding) m3957p()).f6072g.setEnabled(true);
        ((ActivityMistakeListBinding) m3957p()).f6070e.setEnabled(true);
        ((ActivityMistakeListBinding) m3957p()).f6079n.setEnabled(true);
    }

    /* renamed from: x */
    public final void m3941x() {
        this.f5840m = false;
        this.f5846s.clear();
        MistakeListAdapter mistakeListAdapter = this.f5833f;
        if (mistakeListAdapter == null) {
            AbstractC5830k.m5339p("mMistakeListAdapter");
            throw null;
        }
        mistakeListAdapter.m3954a(this.f5840m, null);
        ((ActivityMistakeListBinding) m3957p()).f6081p.setVisibility(0);
        ((ActivityMistakeListBinding) m3957p()).f6080o.setVisibility(0);
        ((ActivityMistakeListBinding) m3957p()).f6082q.setVisibility(0);
        ((ActivityMistakeListBinding) m3957p()).f6073h.setVisibility(8);
        ((ActivityMistakeListBinding) m3957p()).f6077l.setEnabled(true);
    }

    /* renamed from: z */
    public final void m3942z(ArrayList arrayList, boolean z8) {
        boolean z9;
        boolean z10;
        boolean z11;
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6155e.removeAllViews();
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6156f.removeAllViews();
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6157g.removeAllViews();
        ((ActivityMistakeListBinding) m3957p()).f6067b.f6154d.removeAllViews();
        int i = 0;
        while (true) {
            boolean z12 = true;
            if (i >= 3) {
                break;
            }
            FlowLayout flowLayout = ((ActivityMistakeListBinding) m3957p()).f6067b.f6155e;
            String[] strArr = AbstractC5099d.f8030a;
            int i8 = i + 1;
            CustomTagInfo customTagInfo = new CustomTagInfo(strArr[i], i8, 0, 0, 4, null);
            if (arrayList.isEmpty()) {
                z12 = false;
            } else {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj = arrayList.get(i9);
                    i9++;
                    CustomTagInfo customTagInfo2 = (CustomTagInfo) obj;
                    if (customTagInfo2.getLocalType() != 0 || !AbstractC5830k.m5325b(customTagInfo2.getName(), strArr[i])) {
                    }
                }
                z12 = false;
            }
            flowLayout.addView(m3933y(this, customTagInfo, z12, 4));
            i = i8;
        }
        int i10 = 0;
        while (i10 < 3) {
            FlowLayout flowLayout2 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6156f;
            String[] strArr2 = AbstractC5099d.f8031b;
            int i11 = i10 + 1;
            CustomTagInfo customTagInfo3 = new CustomTagInfo(strArr2[i10], i11, 0, 1, 4, null);
            if (arrayList.isEmpty()) {
                z11 = false;
            } else {
                int size2 = arrayList.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = arrayList.get(i12);
                    i12++;
                    CustomTagInfo customTagInfo4 = (CustomTagInfo) obj2;
                    if (customTagInfo4.getLocalType() == 1 && AbstractC5830k.m5325b(customTagInfo4.getName(), strArr2[i10])) {
                        z11 = true;
                        break;
                    }
                }
                z11 = false;
            }
            flowLayout2.addView(m3933y(this, customTagInfo3, z11, 4));
            i10 = i11;
        }
        int i13 = 0;
        while (i13 < 4) {
            FlowLayout flowLayout3 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6157g;
            String[] strArr3 = AbstractC5099d.f8032c;
            int i14 = i13 + 1;
            CustomTagInfo customTagInfo5 = new CustomTagInfo(strArr3[i13], i14, 0, 2, 4, null);
            if (arrayList.isEmpty()) {
                z10 = false;
            } else {
                int size3 = arrayList.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayList.get(i15);
                    i15++;
                    CustomTagInfo customTagInfo6 = (CustomTagInfo) obj3;
                    if (customTagInfo6.getLocalType() == 2 && AbstractC5830k.m5325b(customTagInfo6.getName(), strArr3[i13])) {
                        z10 = true;
                        break;
                    }
                }
                z10 = false;
            }
            flowLayout3.addView(m3933y(this, customTagInfo5, z10, 4));
            i13 = i14;
        }
        if (z8) {
            ((ActivityMistakeListBinding) m3957p()).f6067b.f6154d.addView(m3933y(this, new CustomTagInfo(null, 0L, 0, 0, 15, null), false, 2));
        }
        ArrayList arrayList2 = this.f5848u;
        int size4 = arrayList2.size();
        int i16 = 0;
        while (i16 < size4) {
            Object obj4 = arrayList2.get(i16);
            i16++;
            CustomTagInfo customTagInfo7 = (CustomTagInfo) obj4;
            FlowLayout flowLayout4 = ((ActivityMistakeListBinding) m3957p()).f6067b.f6154d;
            if (arrayList.isEmpty()) {
                z9 = false;
            } else {
                int size5 = arrayList.size();
                int i17 = 0;
                while (i17 < size5) {
                    Object obj5 = arrayList.get(i17);
                    i17++;
                    if (customTagInfo7.getId() == ((CustomTagInfo) obj5).getId()) {
                        z9 = true;
                        break;
                    }
                }
                z9 = false;
            }
            flowLayout4.addView(m3933y(this, customTagInfo7, z9, 4));
        }
    }
}
