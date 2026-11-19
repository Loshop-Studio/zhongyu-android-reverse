package com.friday.lecture.floatwindow.studentdemo;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.GsonUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.classtest.MqttRequestEntity;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.classtest.RequestScreencastData;
import com.friday.common.classtest.RequestScreencastList;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.helper.C5962b;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.adapter.DemonstratingAdapter;
import com.friday.lecture.adapter.OnlineListAdapter;
import com.friday.lecture.databinding.WindowStudentDemoListBinding;
import com.friday.lecture.floatwindow.studentdemo.StudentDemoListLayout;
import com.friday.lecture.model.ClassTestHelper;
import com.friday.lecture.widget.LifecycleFrameLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9979u;
import p111d3.C8925a;
import p181hd.InterfaceC9529a;
import p268o1.InterfaceC10425b;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import tv.danmaku.ijk.media.player.IMediaPlayer;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class StudentDemoListLayout extends LifecycleFrameLayout {

    /* renamed from: d */
    public OnlineListAdapter f8790d;

    /* renamed from: e */
    public DemonstratingAdapter f8791e;

    /* renamed from: f */
    public WindowStudentDemoListBinding f8792f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StudentDemoListLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        m6672m();
    }

    /* renamed from: m */
    private final void m6672m() {
        DemonstratingAdapter demonstratingAdapter = null;
        View viewInflate = View.inflate(getContext(), R$layout.window_student_demo_list, null);
        addView(viewInflate);
        WindowStudentDemoListBinding windowStudentDemoListBindingM6502a = WindowStudentDemoListBinding.m6502a(viewInflate);
        AbstractC9979u.m20293f(windowStudentDemoListBindingM6502a, "bind(...)");
        this.f8792f = windowStudentDemoListBindingM6502a;
        if (windowStudentDemoListBindingM6502a == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBindingM6502a = null;
        }
        ClickUtils.applySingleDebouncing(windowStudentDemoListBindingM6502a.f8645g.f8546g, 3000L, new View.OnClickListener() { // from class: h3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentDemoListLayout.m6674o(this.f21867c, view);
            }
        });
        WindowStudentDemoListBinding windowStudentDemoListBinding = this.f8792f;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8644f.setOnClickListener(new View.OnClickListener() { // from class: h3.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentDemoListLayout.m6678s(view);
            }
        });
        WindowStudentDemoListBinding windowStudentDemoListBinding2 = this.f8792f;
        if (windowStudentDemoListBinding2 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding2 = null;
        }
        windowStudentDemoListBinding2.f8643e.setOnClickListener(new View.OnClickListener() { // from class: h3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                StudentDemoListLayout.m6679t(this.f21868c, view);
            }
        });
        WindowStudentDemoListBinding windowStudentDemoListBinding3 = this.f8792f;
        if (windowStudentDemoListBinding3 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding3 = null;
        }
        RecyclerView recyclerView = windowStudentDemoListBinding3.f8647i;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 8));
        recyclerView.setHasFixedSize(true);
        OnlineListAdapter onlineListAdapter = new OnlineListAdapter(new InterfaceC9529a() { // from class: h3.d
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return StudentDemoListLayout.m6680u(this.f21869c);
            }
        });
        this.f8790d = onlineListAdapter;
        recyclerView.setAdapter(onlineListAdapter);
        WindowStudentDemoListBinding windowStudentDemoListBinding4 = this.f8792f;
        if (windowStudentDemoListBinding4 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding4 = null;
        }
        final RecyclerView recyclerView2 = windowStudentDemoListBinding4.f8646h;
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext(), 0, false));
        recyclerView2.setHasFixedSize(true);
        recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.lecture.floatwindow.studentdemo.StudentDemoListLayout$initView$5$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.right = recyclerView2.getContext().getResources().getDimensionPixelSize(R$dimen.view_14);
            }
        });
        DemonstratingAdapter demonstratingAdapter2 = new DemonstratingAdapter();
        this.f8791e = demonstratingAdapter2;
        recyclerView2.setAdapter(demonstratingAdapter2);
        DemonstratingAdapter demonstratingAdapter3 = this.f8791e;
        if (demonstratingAdapter3 == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
        } else {
            demonstratingAdapter = demonstratingAdapter3;
        }
        demonstratingAdapter.setOnItemChildClickListener(new InterfaceC10425b() { // from class: h3.e
            @Override // p268o1.InterfaceC10425b
            /* renamed from: a */
            public final void mo18642a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                StudentDemoListLayout.m6673n(this.f21870a, baseQuickAdapter, view, i10);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public static final void m6673n(StudentDemoListLayout studentDemoListLayout, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "view");
        DemonstratingAdapter demonstratingAdapter = studentDemoListLayout.f8791e;
        BaseQuickAdapter baseQuickAdapter2 = null;
        if (demonstratingAdapter == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
            demonstratingAdapter = null;
        }
        Pair<? extends Boolean, ? extends MqttResponse.Student> item = demonstratingAdapter.getItem(i10);
        if (view.getId() != R$id.iv_remove) {
            if (view.getId() == R$id.iv_fullscreen) {
                String studentId = ((MqttResponse.Student) item.m20052g()).getStudentId();
                ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
                boolean z10 = !AbstractC9979u.m20289b(studentId, classTestHelper.getFullscreenMember());
                Observable observable = LiveEventBus.get(MqttEntity.class);
                MqttType mqttType = MqttType.NONE;
                String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_AUDIO_SEEK_RENDERING_START, new RequestScreencastData(z10, ((MqttResponse.Student) item.m20052g()).getStudentId(), null, 4, null)));
                AbstractC9979u.m20293f(json, "toJson(...)");
                observable.post(new MqttEntity(mqttType, json, null, 4, null));
                classTestHelper.setFullscreenMember(AbstractC9979u.m20289b(((MqttResponse.Student) item.m20052g()).getStudentId(), classTestHelper.getFullscreenMember()) ? null : ((MqttResponse.Student) item.m20052g()).getStudentId());
                DemonstratingAdapter demonstratingAdapter2 = studentDemoListLayout.f8791e;
                if (demonstratingAdapter2 == null) {
                    AbstractC9979u.m20312y("demonstratingAdapter");
                } else {
                    baseQuickAdapter2 = demonstratingAdapter2;
                }
                baseQuickAdapter2.setList(classTestHelper.getDemonstratingList());
                return;
            }
            return;
        }
        ClassTestHelper classTestHelper2 = ClassTestHelper.INSTANCE;
        classTestHelper2.removeFromDemonstratingList(item);
        Observable observable2 = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType2 = MqttType.NONE;
        String json2 = GsonUtils.toJson(new MqttRequestEntity(10010, new RequestScreencastData(false, ((MqttResponse.Student) item.m20052g()).getStudentId(), null, 5, null)));
        AbstractC9979u.m20293f(json2, "toJson(...)");
        observable2.post(new MqttEntity(mqttType2, json2, null, 4, null));
        DemonstratingAdapter demonstratingAdapter3 = studentDemoListLayout.f8791e;
        if (demonstratingAdapter3 == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
            demonstratingAdapter3 = null;
        }
        if (demonstratingAdapter3.getItemCount() == 1) {
            Observable observable3 = LiveEventBus.get(MqttEntity.class);
            String json3 = GsonUtils.toJson(new RequestScreencastList(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, AbstractC10978w.m24129g(Long.valueOf(C5962b.f6082a.m5299a().m5292t()))));
            AbstractC9979u.m20293f(json3, "toJson(...)");
            observable3.post(new MqttEntity(mqttType2, json3, null, 4, null));
            classTestHelper2.setTeacherDemonstrating();
        }
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8648j.setText("正在演示 " + classTestHelper2.getDemonstratingList().size() + "人");
        DemonstratingAdapter demonstratingAdapter4 = studentDemoListLayout.f8791e;
        if (demonstratingAdapter4 == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
            demonstratingAdapter4 = null;
        }
        demonstratingAdapter4.setList(classTestHelper2.getDemonstratingList());
        OnlineListAdapter onlineListAdapter = studentDemoListLayout.f8790d;
        if (onlineListAdapter == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
        } else {
            baseQuickAdapter2 = onlineListAdapter;
        }
        baseQuickAdapter2.setList(classTestHelper2.getStudentList());
        studentDemoListLayout.m6684y();
    }

    /* renamed from: o */
    public static final void m6674o(final StudentDemoListLayout studentDemoListLayout, View view) {
        List<MqttResponse.Student> value = ClassTestHelper.INSTANCE.getOnlineList().getValue();
        if (value == null || value.isEmpty()) {
            return;
        }
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        WindowStudentDemoListBinding windowStudentDemoListBinding2 = null;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8645g.f8542c.setVisibility(0);
        WindowStudentDemoListBinding windowStudentDemoListBinding3 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding3 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding3 = null;
        }
        windowStudentDemoListBinding3.f8642d.setVisibility(8);
        WindowStudentDemoListBinding windowStudentDemoListBinding4 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding4 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding4 = null;
        }
        windowStudentDemoListBinding4.f8641c.setVisibility(8);
        WindowStudentDemoListBinding windowStudentDemoListBinding5 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding5 == null) {
            AbstractC9979u.m20312y("binding");
        } else {
            windowStudentDemoListBinding2 = windowStudentDemoListBinding5;
        }
        ViewPropertyAnimator viewPropertyAnimatorRotationY = windowStudentDemoListBinding2.f8645g.f8544e.animate().withLayer().rotationY(180.0f);
        final long j10 = 1200;
        viewPropertyAnimatorRotationY.setDuration(1200L).setInterpolator(new AccelerateDecelerateInterpolator()).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: h3.g
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StudentDemoListLayout.m6675p(this.f21872a, valueAnimator);
            }
        }).withEndAction(new Runnable() { // from class: h3.h
            @Override // java.lang.Runnable
            public final void run() {
                StudentDemoListLayout.m6676q(this.f21873c, j10);
            }
        }).start();
    }

    /* renamed from: p */
    public static final void m6675p(StudentDemoListLayout studentDemoListLayout, ValueAnimator it) {
        AbstractC9979u.m20294g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        if (0.5f > animatedFraction || animatedFraction > 0.55f) {
            return;
        }
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8645g.f8544e.setImageResource(R$drawable.random_flip1);
    }

    /* renamed from: q */
    public static final void m6676q(final StudentDemoListLayout studentDemoListLayout, long j10) {
        Random random = new Random();
        OnlineListAdapter onlineListAdapter = studentDemoListLayout.f8790d;
        WindowStudentDemoListBinding windowStudentDemoListBinding = null;
        if (onlineListAdapter == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
            onlineListAdapter = null;
        }
        int iNextInt = random.nextInt(onlineListAdapter.getItemCount() - 1) + 1;
        OnlineListAdapter onlineListAdapter2 = studentDemoListLayout.f8790d;
        if (onlineListAdapter2 == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
            onlineListAdapter2 = null;
        }
        MqttResponse.Student item = onlineListAdapter2.getItem(iNextInt);
        ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
        classTestHelper.setRandomMember(item.getStudentId());
        DemonstratingAdapter demonstratingAdapter = studentDemoListLayout.f8791e;
        if (demonstratingAdapter == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
            demonstratingAdapter = null;
        }
        demonstratingAdapter.setList(classTestHelper.getDemonstratingList());
        OnlineListAdapter onlineListAdapter3 = studentDemoListLayout.f8790d;
        if (onlineListAdapter3 == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
            onlineListAdapter3 = null;
        }
        onlineListAdapter3.setList(classTestHelper.getStudentList());
        WindowStudentDemoListBinding windowStudentDemoListBinding2 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding2 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding2 = null;
        }
        windowStudentDemoListBinding2.f8645g.f8547h.setText(item.getStudentName());
        WindowStudentDemoListBinding windowStudentDemoListBinding3 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding3 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding3 = null;
        }
        RecyclerView.LayoutManager layoutManager = windowStudentDemoListBinding3.f8647i.getLayoutManager();
        AbstractC9979u.m20292e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        WindowStudentDemoListBinding windowStudentDemoListBinding4 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding4 == null) {
            AbstractC9979u.m20312y("binding");
        } else {
            windowStudentDemoListBinding = windowStudentDemoListBinding4;
        }
        RecyclerView rvStudentList = windowStudentDemoListBinding.f8647i;
        AbstractC9979u.m20293f(rvStudentList, "rvStudentList");
        studentDemoListLayout.m6682v(linearLayoutManager, rvStudentList, iNextInt);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: h3.i
            @Override // java.lang.Runnable
            public final void run() {
                StudentDemoListLayout.m6677r(this.f21875c);
            }
        }, j10 + 100);
    }

    /* renamed from: r */
    public static final void m6677r(StudentDemoListLayout studentDemoListLayout) {
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        WindowStudentDemoListBinding windowStudentDemoListBinding2 = null;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8645g.f8542c.setVisibility(8);
        WindowStudentDemoListBinding windowStudentDemoListBinding3 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding3 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding3 = null;
        }
        windowStudentDemoListBinding3.f8645g.f8544e.setRotationY(0.0f);
        WindowStudentDemoListBinding windowStudentDemoListBinding4 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding4 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding4 = null;
        }
        windowStudentDemoListBinding4.f8645g.f8544e.setImageResource(R$drawable.random_flip2);
        WindowStudentDemoListBinding windowStudentDemoListBinding5 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding5 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding5 = null;
        }
        windowStudentDemoListBinding5.f8645g.f8547h.setText("");
        WindowStudentDemoListBinding windowStudentDemoListBinding6 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding6 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding6 = null;
        }
        windowStudentDemoListBinding6.f8642d.setVisibility(0);
        WindowStudentDemoListBinding windowStudentDemoListBinding7 = studentDemoListLayout.f8792f;
        if (windowStudentDemoListBinding7 == null) {
            AbstractC9979u.m20312y("binding");
        } else {
            windowStudentDemoListBinding2 = windowStudentDemoListBinding7;
        }
        windowStudentDemoListBinding2.f8641c.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m6678s(View view) {
        C8925a.f20887a.m17517a();
    }

    /* renamed from: t */
    public static final void m6679t(StudentDemoListLayout studentDemoListLayout, View view) {
        ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
        classTestHelper.updateDemonstratingList();
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        OnlineListAdapter onlineListAdapter = null;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        windowStudentDemoListBinding.f8648j.setText("正在演示 " + classTestHelper.getDemonstratingList().size() + "人");
        DemonstratingAdapter demonstratingAdapter = studentDemoListLayout.f8791e;
        if (demonstratingAdapter == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
            demonstratingAdapter = null;
        }
        demonstratingAdapter.setList(classTestHelper.getDemonstratingList());
        OnlineListAdapter onlineListAdapter2 = studentDemoListLayout.f8790d;
        if (onlineListAdapter2 == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
        } else {
            onlineListAdapter = onlineListAdapter2;
        }
        onlineListAdapter.setList(classTestHelper.getStudentList());
        view.setEnabled(false);
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.NONE;
        List<Pair<Boolean, MqttResponse.Student>> demonstratingList = classTestHelper.getDemonstratingList();
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(demonstratingList, 10));
        Iterator<T> it = demonstratingList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(Long.parseLong(((MqttResponse.Student) ((Pair) it.next()).m20052g()).getStudentId())));
        }
        String json = GsonUtils.toJson(new RequestScreencastList(IMediaPlayer.MEDIA_INFO_VIDEO_SEEK_RENDERING_START, arrayList));
        AbstractC9979u.m20293f(json, "toJson(...)");
        observable.post(new MqttEntity(mqttType, json, null, 4, null));
    }

    /* renamed from: u */
    public static final C10786q m6680u(StudentDemoListLayout studentDemoListLayout) {
        studentDemoListLayout.m6684y();
        return C10786q.f26013a;
    }

    /* renamed from: w */
    public static final void m6681w(StudentDemoListLayout studentDemoListLayout, List list) {
        AbstractC9979u.m20291d(list);
        if (list.isEmpty()) {
            return;
        }
        studentDemoListLayout.m6683x(list);
        WindowStudentDemoListBinding windowStudentDemoListBinding = studentDemoListLayout.f8792f;
        DemonstratingAdapter demonstratingAdapter = null;
        if (windowStudentDemoListBinding == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding = null;
        }
        TextView textView = windowStudentDemoListBinding.f8648j;
        ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
        textView.setText("正在演示 " + classTestHelper.getDemonstratingList().size() + "人");
        DemonstratingAdapter demonstratingAdapter2 = studentDemoListLayout.f8791e;
        if (demonstratingAdapter2 == null) {
            AbstractC9979u.m20312y("demonstratingAdapter");
        } else {
            demonstratingAdapter = demonstratingAdapter2;
        }
        demonstratingAdapter.setList(classTestHelper.getDemonstratingList());
        studentDemoListLayout.m6684y();
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout
    /* renamed from: c */
    public LifecycleRegistry mo6640c() {
        return new LifecycleRegistry(this);
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.NONE;
        String json = GsonUtils.toJson(new MqttRequestEntity(IMediaPlayer.MEDIA_INFO_VIDEO_DECODED_START, null, 2, null));
        AbstractC9979u.m20293f(json, "toJson(...)");
        observable.post(new MqttEntity(mqttType, json, "board"));
        ClassTestHelper.INSTANCE.getOnlineList().observe(this, new Observer() { // from class: h3.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                StudentDemoListLayout.m6681w(this.f21871c, (List) obj);
            }
        });
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
        classTestHelper.setRandomMember(null);
        classTestHelper.clearSelectedList();
        Iterator<T> it = classTestHelper.getDemonstratingList().iterator();
        while (it.hasNext()) {
            ClassTestHelper.INSTANCE.updateSelectedList((MqttResponse.Student) ((Pair) it.next()).m20052g());
        }
    }

    /* renamed from: v */
    public final void m6682v(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, int i10) {
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (i10 <= iFindFirstVisibleItemPosition) {
            recyclerView.scrollToPosition(i10);
        } else if (i10 <= iFindLastVisibleItemPosition) {
            recyclerView.scrollBy(0, recyclerView.getChildAt(i10 - iFindFirstVisibleItemPosition).getTop());
        } else {
            recyclerView.scrollToPosition(i10);
        }
    }

    /* renamed from: x */
    public final void m6683x(List list) {
        OnlineListAdapter onlineListAdapter = this.f8790d;
        WindowStudentDemoListBinding windowStudentDemoListBinding = null;
        if (onlineListAdapter == null) {
            AbstractC9979u.m20312y("onlineListAdapter");
            onlineListAdapter = null;
        }
        onlineListAdapter.setList(list);
        WindowStudentDemoListBinding windowStudentDemoListBinding2 = this.f8792f;
        if (windowStudentDemoListBinding2 == null) {
            AbstractC9979u.m20312y("binding");
            windowStudentDemoListBinding2 = null;
        }
        windowStudentDemoListBinding2.f8650l.setText("学生" + (list.size() - 1) + "人）");
        WindowStudentDemoListBinding windowStudentDemoListBinding3 = this.f8792f;
        if (windowStudentDemoListBinding3 == null) {
            AbstractC9979u.m20312y("binding");
        } else {
            windowStudentDemoListBinding = windowStudentDemoListBinding3;
        }
        windowStudentDemoListBinding.f8652n.setText("（老师1人");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m6684y() {
        /*
            r4 = this;
            com.friday.lecture.databinding.WindowStudentDemoListBinding r0 = r4.f8792f
            if (r0 != 0) goto La
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.AbstractC9979u.m20312y(r0)
            r0 = 0
        La:
            androidx.cardview.widget.CardView r0 = r0.f8643e
            com.friday.lecture.model.ClassTestHelper r1 = com.friday.lecture.model.ClassTestHelper.INSTANCE
            java.util.Set r2 = r1.getSelectedList()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L5b
            java.util.List r1 = r1.getDemonstratingList()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = p325rc.AbstractC10980x.m24153x(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L49
            java.lang.Object r3 = r1.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.m20052g()
            com.friday.common.classtest.MqttResponse$Student r3 = (com.friday.common.classtest.MqttResponse.Student) r3
            java.lang.String r3 = r3.getStudentId()
            r2.add(r3)
            goto L2f
        L49:
            java.util.Set r1 = p325rc.AbstractC10947g0.m23929c1(r2)
            com.friday.lecture.model.ClassTestHelper r2 = com.friday.lecture.model.ClassTestHelper.INSTANCE
            java.util.Set r2 = r2.getSelectedList()
            boolean r1 = kotlin.jvm.internal.AbstractC9979u.m20289b(r1, r2)
            if (r1 != 0) goto L5b
            r1 = 1
            goto L5c
        L5b:
            r1 = 0
        L5c:
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.friday.lecture.floatwindow.studentdemo.StudentDemoListLayout.m6684y():void"); // DEX body: android/中育云笔记/smali_classes4/com/friday/lecture/floatwindow/studentdemo/StudentDemoListLayout.smali:3278
    }
}
