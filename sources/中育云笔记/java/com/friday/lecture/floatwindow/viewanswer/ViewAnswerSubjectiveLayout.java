package com.friday.lecture.floatwindow.viewanswer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.blankj.utilcode.util.ClickUtils;
import com.blankj.utilcode.util.FileUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.helper.GridSpacingItemDecoration;
import com.friday.lecture.R$color;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.adapter.ViewSubjectiveAnswerAdapter;
import com.friday.lecture.floatwindow.canvas.SimpleCanvasLayout;
import com.friday.lecture.floatwindow.options.C6149a;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout;
import com.friday.lecture.model.ClassTestHelper;
import com.friday.lecture.model.SubjectiveHomeworkAnswer;
import com.friday.lecture.widget.LifecycleFrameLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.jvm.internal.AbstractC9979u;
import p004a3.C0049c;
import p111d3.C8925a;
import p268o1.InterfaceC10427d;
import p325rc.AbstractC10947g0;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ViewAnswerSubjectiveLayout extends LifecycleFrameLayout {

    /* renamed from: d */
    public TextView f8827d;

    /* renamed from: e */
    public TextView f8828e;

    /* renamed from: f */
    public TextView f8829f;

    /* renamed from: g */
    public RecyclerView f8830g;

    /* renamed from: h */
    public ImageView f8831h;

    /* renamed from: i */
    public TextView f8832i;

    /* renamed from: j */
    public View f8833j;

    /* renamed from: k */
    public ViewPager f8834k;

    /* renamed from: l */
    public ConstraintLayout f8835l;

    /* renamed from: m */
    public LinearLayout f8836m;

    /* renamed from: n */
    public View f8837n;

    /* renamed from: o */
    public ImageView f8838o;

    /* renamed from: p */
    public TextView f8839p;

    /* renamed from: q */
    public View f8840q;

    /* renamed from: r */
    public View f8841r;

    /* renamed from: s */
    public boolean f8842s;

    /* renamed from: t */
    public boolean f8843t;

    /* renamed from: u */
    public SubjectiveHomeworkAnswer f8844u;

    /* renamed from: v */
    public C6152a f8845v;

    /* renamed from: w */
    public int f8846w;

    /* renamed from: x */
    public ViewSubjectiveAnswerAdapter f8847x;

    /* renamed from: com.friday.lecture.floatwindow.viewanswer.ViewAnswerSubjectiveLayout$a */
    public static final class C6152a {

        /* renamed from: a */
        public final SimpleCanvasLayout f8848a;

        /* renamed from: b */
        public final SubjectiveHomeworkAnswer f8849b;

        public C6152a(SimpleCanvasLayout canvasLayout, SubjectiveHomeworkAnswer entity) {
            AbstractC9979u.m20294g(canvasLayout, "canvasLayout");
            AbstractC9979u.m20294g(entity, "entity");
            this.f8848a = canvasLayout;
            this.f8849b = entity;
        }

        /* renamed from: a */
        public final SimpleCanvasLayout m6768a() {
            return this.f8848a;
        }

        /* renamed from: b */
        public final SubjectiveHomeworkAnswer m6769b() {
            return this.f8849b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6152a)) {
                return false;
            }
            C6152a c6152a = (C6152a) obj;
            return AbstractC9979u.m20289b(this.f8848a, c6152a.f8848a) && AbstractC9979u.m20289b(this.f8849b, c6152a.f8849b);
        }

        public int hashCode() {
            return (this.f8848a.hashCode() * 31) + this.f8849b.hashCode();
        }

        public String toString() {
            return "SimpleCanvasEntity(canvasLayout=" + this.f8848a + ", entity=" + this.f8849b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAnswerSubjectiveLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        m6760v();
    }

    /* renamed from: A */
    public static final void m6731A(final ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) {
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
        ImageView imageView = null;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        if (viewSubjectiveAnswerAdapter.getData().isEmpty()) {
            return;
        }
        ConstraintLayout constraintLayout = viewAnswerSubjectiveLayout.f8835l;
        if (constraintLayout == null) {
            AbstractC9979u.m20312y("clAnim");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(0);
        View view2 = viewAnswerSubjectiveLayout.f8840q;
        if (view2 == null) {
            AbstractC9979u.m20312y("layoutList");
            view2 = null;
        }
        view2.setVisibility(8);
        ImageView imageView2 = viewAnswerSubjectiveLayout.f8838o;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivFlipCard");
        } else {
            imageView = imageView2;
        }
        imageView.animate().withLayer().rotationY(180.0f).setDuration(1200L).setInterpolator(new AccelerateDecelerateInterpolator()).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: i3.u
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ViewAnswerSubjectiveLayout.m6732B(this.f22117a, valueAnimator);
            }
        }).withEndAction(new Runnable() { // from class: i3.v
            @Override // java.lang.Runnable
            public final void run() {
                ViewAnswerSubjectiveLayout.m6733C(this.f22118c);
            }
        }).start();
    }

    /* renamed from: B */
    public static final void m6732B(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, ValueAnimator it) {
        AbstractC9979u.m20294g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        if (0.5f > animatedFraction || animatedFraction > 0.55f) {
            return;
        }
        ImageView imageView = viewAnswerSubjectiveLayout.f8838o;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivFlipCard");
            imageView = null;
        }
        imageView.setImageResource(R$drawable.random_flip1);
    }

    /* renamed from: C */
    public static final void m6733C(final ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout) {
        MqttResponse.Student student;
        Random random = new Random();
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
        String studentName = null;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        int iNextInt = random.nextInt(viewSubjectiveAnswerAdapter.getData().size());
        viewAnswerSubjectiveLayout.f8842s = true;
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = viewAnswerSubjectiveLayout.f8847x;
        if (viewSubjectiveAnswerAdapter2 == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter2 = null;
        }
        viewAnswerSubjectiveLayout.f8844u = viewSubjectiveAnswerAdapter2.getItem(iNextInt).m6769b();
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter3 = viewAnswerSubjectiveLayout.f8847x;
        if (viewSubjectiveAnswerAdapter3 == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter3 = null;
        }
        viewAnswerSubjectiveLayout.f8845v = viewSubjectiveAnswerAdapter3.getData().get(iNextInt);
        TextView textView = viewAnswerSubjectiveLayout.f8839p;
        if (textView == null) {
            AbstractC9979u.m20312y("tvRandomName");
            textView = null;
        }
        SubjectiveHomeworkAnswer subjectiveHomeworkAnswer = viewAnswerSubjectiveLayout.f8844u;
        if (subjectiveHomeworkAnswer != null && (student = subjectiveHomeworkAnswer.getStudent()) != null) {
            studentName = student.getStudentName();
        }
        textView.setText(studentName);
        new Handler().postDelayed(new Runnable() { // from class: i3.w
            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                ViewAnswerSubjectiveLayout.m6734D(this.f22119c);
            }
        }, 1300L);
    }

    /* renamed from: D */
    public static final void m6734D(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout) throws Resources.NotFoundException {
        ConstraintLayout constraintLayout = viewAnswerSubjectiveLayout.f8835l;
        TextView textView = null;
        if (constraintLayout == null) {
            AbstractC9979u.m20312y("clAnim");
            constraintLayout = null;
        }
        constraintLayout.setVisibility(8);
        View view = viewAnswerSubjectiveLayout.f8840q;
        if (view == null) {
            AbstractC9979u.m20312y("layoutList");
            view = null;
        }
        view.setVisibility(0);
        ImageView imageView = viewAnswerSubjectiveLayout.f8838o;
        if (imageView == null) {
            AbstractC9979u.m20312y("ivFlipCard");
            imageView = null;
        }
        imageView.setRotationY(0.0f);
        ImageView imageView2 = viewAnswerSubjectiveLayout.f8838o;
        if (imageView2 == null) {
            AbstractC9979u.m20312y("ivFlipCard");
            imageView2 = null;
        }
        imageView2.setImageResource(R$drawable.random_flip2);
        TextView textView2 = viewAnswerSubjectiveLayout.f8839p;
        if (textView2 == null) {
            AbstractC9979u.m20312y("tvRandomName");
        } else {
            textView = textView2;
        }
        textView.setText("");
        viewAnswerSubjectiveLayout.m6767N();
    }

    /* renamed from: E */
    public static final void m6735E(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) throws Resources.NotFoundException {
        ViewPager viewPager = viewAnswerSubjectiveLayout.f8834k;
        if (viewPager == null) {
            AbstractC9979u.m20312y("viewPager");
            viewPager = null;
        }
        if (viewPager.getCurrentItem() > 0) {
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
            if (viewSubjectiveAnswerAdapter == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter = null;
            }
            List<C6152a> data = viewSubjectiveAnswerAdapter.getData();
            ViewPager viewPager2 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager2 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager2 = null;
            }
            data.get(viewPager2.getCurrentItem()).m6768a().m6553A();
            ViewPager viewPager3 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager3 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager3 = null;
            }
            ViewPager viewPager4 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager4 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager4 = null;
            }
            viewPager3.setCurrentItem(viewPager4.getCurrentItem() - 1, false);
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = viewAnswerSubjectiveLayout.f8847x;
            if (viewSubjectiveAnswerAdapter2 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter2 = null;
            }
            List<C6152a> data2 = viewSubjectiveAnswerAdapter2.getData();
            ViewPager viewPager5 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager5 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager5 = null;
            }
            data2.get(viewPager5.getCurrentItem()).m6768a().m6554B();
            TextView textView = viewAnswerSubjectiveLayout.f8832i;
            if (textView != null) {
                ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter3 = viewAnswerSubjectiveLayout.f8847x;
                if (viewSubjectiveAnswerAdapter3 == null) {
                    AbstractC9979u.m20312y("mAdapter");
                    viewSubjectiveAnswerAdapter3 = null;
                }
                List<C6152a> data3 = viewSubjectiveAnswerAdapter3.getData();
                ViewPager viewPager6 = viewAnswerSubjectiveLayout.f8834k;
                if (viewPager6 == null) {
                    AbstractC9979u.m20312y("viewPager");
                    viewPager6 = null;
                }
                MqttResponse.Student student = data3.get(viewPager6.getCurrentItem()).m6769b().getStudent();
                textView.setText(student != null ? student.getStudentName() : null);
            }
        }
    }

    /* renamed from: F */
    public static final void m6736F(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) throws Resources.NotFoundException {
        ViewPager viewPager = viewAnswerSubjectiveLayout.f8834k;
        if (viewPager == null) {
            AbstractC9979u.m20312y("viewPager");
            viewPager = null;
        }
        int currentItem = viewPager.getCurrentItem();
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        if (currentItem <= viewSubjectiveAnswerAdapter.getData().size() - 1) {
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = viewAnswerSubjectiveLayout.f8847x;
            if (viewSubjectiveAnswerAdapter2 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter2 = null;
            }
            List<C6152a> data = viewSubjectiveAnswerAdapter2.getData();
            ViewPager viewPager2 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager2 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager2 = null;
            }
            data.get(viewPager2.getCurrentItem()).m6768a().m6553A();
            ViewPager viewPager3 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager3 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager3 = null;
            }
            ViewPager viewPager4 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager4 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager4 = null;
            }
            viewPager3.setCurrentItem(viewPager4.getCurrentItem() + 1, false);
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter3 = viewAnswerSubjectiveLayout.f8847x;
            if (viewSubjectiveAnswerAdapter3 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter3 = null;
            }
            List<C6152a> data2 = viewSubjectiveAnswerAdapter3.getData();
            ViewPager viewPager5 = viewAnswerSubjectiveLayout.f8834k;
            if (viewPager5 == null) {
                AbstractC9979u.m20312y("viewPager");
                viewPager5 = null;
            }
            data2.get(viewPager5.getCurrentItem()).m6768a().m6554B();
            TextView textView = viewAnswerSubjectiveLayout.f8832i;
            if (textView != null) {
                ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter4 = viewAnswerSubjectiveLayout.f8847x;
                if (viewSubjectiveAnswerAdapter4 == null) {
                    AbstractC9979u.m20312y("mAdapter");
                    viewSubjectiveAnswerAdapter4 = null;
                }
                List<C6152a> data3 = viewSubjectiveAnswerAdapter4.getData();
                ViewPager viewPager6 = viewAnswerSubjectiveLayout.f8834k;
                if (viewPager6 == null) {
                    AbstractC9979u.m20312y("viewPager");
                    viewPager6 = null;
                }
                MqttResponse.Student student = data3.get(viewPager6.getCurrentItem()).m6769b().getStudent();
                textView.setText(student != null ? student.getStudentName() : null);
            }
        }
    }

    /* renamed from: G */
    public static final void m6737G(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) {
        View view2 = viewAnswerSubjectiveLayout.f8833j;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* renamed from: H */
    public static final void m6738H(View view, View view2) {
        view.setVisibility(0);
    }

    /* renamed from: I */
    public static final void m6739I(View view, View view2) {
        view.setVisibility(8);
    }

    /* renamed from: J */
    public static final void m6740J(View view) {
        String guid;
        Observable observable = LiveEventBus.get(MqttEntity.class);
        MqttType mqttType = MqttType.END_CLASS;
        ClassTestHelper classTestHelper = ClassTestHelper.INSTANCE;
        MqttResponse recentlyHomework = classTestHelper.getRecentlyHomework();
        if (recentlyHomework == null || (guid = recentlyHomework.getGuid()) == null) {
            guid = "";
        }
        observable.post(new MqttEntity(mqttType, guid, null, 4, null));
        C0049c c0049c = C0049c.f40a;
        c0049c.m106g();
        c0049c.mo103d(true);
        c0049c.m107h();
        classTestHelper.classEnd();
        C6149a.f8778g.m6662a().m6655k();
    }

    /* renamed from: K */
    public static final void m6741K(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, SubjectiveHomeworkAnswer subjectiveHomeworkAnswer) {
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
        Object obj = null;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        Iterator<T> it = viewSubjectiveAnswerAdapter.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (AbstractC9979u.m20289b(((C6152a) next).m6769b().getRemoteUrl(), subjectiveHomeworkAnswer.getRemoteUrl())) {
                obj = next;
                break;
            }
        }
        C6152a c6152a = (C6152a) obj;
        if (c6152a != null) {
            if (TextUtils.isEmpty(c6152a.m6769b().getLocalPath()) || !FileUtils.isFileExists(c6152a.m6769b().getLocalPath())) {
                c6152a.m6769b().setLocalPath(subjectiveHomeworkAnswer.getLocalPath());
            }
        }
    }

    /* renamed from: v */
    private final void m6760v() {
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = null;
        addView(View.inflate(getContext(), R$layout.window_subjective_answer, null));
        this.f8827d = (TextView) findViewById(R$id.cv_stop_answer);
        this.f8828e = (TextView) findViewById(R$id.cv_end_class);
        this.f8829f = (TextView) findViewById(R$id.tv_submit_count_after);
        this.f8830g = (RecyclerView) findViewById(R$id.rv_answer);
        this.f8831h = (ImageView) findViewById(R$id.iv_close_subjective);
        View viewFindViewById = findViewById(R$id.cl_anim);
        AbstractC9979u.m20293f(viewFindViewById, "findViewById(...)");
        this.f8835l = (ConstraintLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.ll_random);
        AbstractC9979u.m20293f(viewFindViewById2, "findViewById(...)");
        this.f8836m = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.iv_flip_card);
        AbstractC9979u.m20293f(viewFindViewById3, "findViewById(...)");
        this.f8838o = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.tv_random_name);
        AbstractC9979u.m20293f(viewFindViewById4, "findViewById(...)");
        this.f8839p = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.layout_list);
        AbstractC9979u.m20293f(viewFindViewById5, "findViewById(...)");
        this.f8840q = viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.layout_detail);
        AbstractC9979u.m20293f(viewFindViewById6, "findViewById(...)");
        this.f8841r = viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.layout_random);
        AbstractC9979u.m20293f(viewFindViewById7, "findViewById(...)");
        this.f8837n = viewFindViewById7;
        final View viewFindViewById8 = findViewById(R$id.layout_end_class);
        this.f8833j = findViewById(R$id.layout_time_up);
        View viewFindViewById9 = findViewById(R$id.tv_end_class_cancel);
        View viewFindViewById10 = findViewById(R$id.tv_end_class_ensure);
        View viewFindViewById11 = findViewById(R$id.tv_time_up_ensure);
        View viewFindViewById12 = findViewById(R$id.tv_time_up_cancel);
        this.f8832i = (TextView) findViewById(R$id.tv_name);
        this.f8847x = new ViewSubjectiveAnswerAdapter(R$layout.item_student_answer);
        LinearLayout linearLayout = this.f8836m;
        if (linearLayout == null) {
            AbstractC9979u.m20312y("llRandom");
            linearLayout = null;
        }
        ClickUtils.applySingleDebouncing(linearLayout, 3000L, new View.OnClickListener() { // from class: i3.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerSubjectiveLayout.m6731A(this.f22120c, view);
            }
        });
        View viewFindViewById13 = findViewById(R$id.view_pager);
        AbstractC9979u.m20293f(viewFindViewById13, "findViewById(...)");
        ViewPager viewPager = (ViewPager) viewFindViewById13;
        this.f8834k = viewPager;
        if (viewPager == null) {
            AbstractC9979u.m20312y("viewPager");
            viewPager = null;
        }
        viewPager.setAdapter(new ViewAnswerSubjectiveLayout$initView$2(this));
        findViewById(R$id.iv_prev).setOnClickListener(new View.OnClickListener() { // from class: i3.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ViewAnswerSubjectiveLayout.m6735E(this.f22121c, view);
            }
        });
        findViewById(R$id.iv_next).setOnClickListener(new View.OnClickListener() { // from class: i3.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Resources.NotFoundException {
                ViewAnswerSubjectiveLayout.m6736F(this.f22084c, view);
            }
        });
        TextView textView = this.f8827d;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: i3.b0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerSubjectiveLayout.m6737G(this.f22086c, view);
                }
            });
        }
        TextView textView2 = this.f8828e;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: i3.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerSubjectiveLayout.m6738H(viewFindViewById8, view);
                }
            });
        }
        viewFindViewById9.setOnClickListener(new View.OnClickListener() { // from class: i3.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerSubjectiveLayout.m6739I(viewFindViewById8, view);
            }
        });
        viewFindViewById10.setOnClickListener(new View.OnClickListener() { // from class: i3.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerSubjectiveLayout.m6740J(view);
            }
        });
        viewFindViewById12.setOnClickListener(new View.OnClickListener() { // from class: i3.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerSubjectiveLayout.m6761w(this.f22093c, view);
            }
        });
        viewFindViewById11.setOnClickListener(new View.OnClickListener() { // from class: i3.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerSubjectiveLayout.m6762x(this.f22115c, view);
            }
        });
        TextView textView3 = this.f8827d;
        if (textView3 != null) {
            textView3.setEnabled(false);
        }
        RecyclerView recyclerView = this.f8830g;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 4));
            recyclerView.addItemDecoration(new GridSpacingItemDecoration(4, (int) recyclerView.getResources().getDimension(R$dimen.view_17), false, false, 8, null));
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = this.f8847x;
            if (viewSubjectiveAnswerAdapter2 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter2 = null;
            }
            recyclerView.setAdapter(viewSubjectiveAnswerAdapter2);
            View viewInflate = View.inflate(recyclerView.getContext(), R$layout.empty_view_no_answer, null);
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter3 = this.f8847x;
            if (viewSubjectiveAnswerAdapter3 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter3 = null;
            }
            AbstractC9979u.m20291d(viewInflate);
            viewSubjectiveAnswerAdapter3.setEmptyView(viewInflate);
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter4 = this.f8847x;
            if (viewSubjectiveAnswerAdapter4 == null) {
                AbstractC9979u.m20312y("mAdapter");
            } else {
                viewSubjectiveAnswerAdapter = viewSubjectiveAnswerAdapter4;
            }
            viewSubjectiveAnswerAdapter.setOnItemClickListener(new InterfaceC10427d() { // from class: i3.t
                @Override // p268o1.InterfaceC10427d
                /* renamed from: a */
                public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) throws Resources.NotFoundException {
                    ViewAnswerSubjectiveLayout.m6763y(this.f22116a, baseQuickAdapter, view, i10);
                }
            });
        }
        ImageView imageView = this.f8831h;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: i3.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerSubjectiveLayout.m6764z(view);
                }
            });
        }
    }

    /* renamed from: w */
    public static final void m6761w(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) {
        View view2 = viewAnswerSubjectiveLayout.f8833j;
        if (view2 != null) {
            view2.setVisibility(8);
        }
    }

    /* renamed from: x */
    public static final void m6762x(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, View view) {
        LiveEventBus.get(MqttEntity.class).post(new MqttEntity(MqttType.TIME_UP, "", null, 4, null));
        viewAnswerSubjectiveLayout.m6765L();
    }

    /* renamed from: y */
    public static final void m6763y(ViewAnswerSubjectiveLayout viewAnswerSubjectiveLayout, BaseQuickAdapter baseQuickAdapter, View view, int i10) throws Resources.NotFoundException {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        viewAnswerSubjectiveLayout.f8842s = true;
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = viewAnswerSubjectiveLayout.f8847x;
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = null;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        viewAnswerSubjectiveLayout.f8844u = viewSubjectiveAnswerAdapter.getItem(i10).m6769b();
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter3 = viewAnswerSubjectiveLayout.f8847x;
        if (viewSubjectiveAnswerAdapter3 == null) {
            AbstractC9979u.m20312y("mAdapter");
        } else {
            viewSubjectiveAnswerAdapter2 = viewSubjectiveAnswerAdapter3;
        }
        viewAnswerSubjectiveLayout.f8845v = viewSubjectiveAnswerAdapter2.getData().get(i10);
        viewAnswerSubjectiveLayout.m6767N();
    }

    /* renamed from: z */
    public static final void m6764z(View view) {
        C8925a.f20887a.m17517a();
    }

    /* renamed from: L */
    public final void m6765L() {
        ClassTestHelper.INSTANCE.timeUp();
        this.f8843t = true;
        View view = this.f8833j;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = this.f8827d;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f8827d;
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor("#7B7B7B"));
        }
        TextView textView3 = this.f8827d;
        if (textView3 != null) {
            textView3.setText("已截止");
        }
    }

    /* renamed from: M */
    public final void m6766M(SubjectiveHomeworkAnswer subjectiveHomeworkAnswer) {
        Object next;
        AbstractC9979u.m20294g(subjectiveHomeworkAnswer, "subjectiveHomeworkAnswer");
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = this.f8847x;
        ViewPager viewPager = null;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        Iterator<T> it = viewSubjectiveAnswerAdapter.getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MqttResponse.Student student = ((C6152a) next).m6769b().getStudent();
            String studentId = student != null ? student.getStudentId() : null;
            MqttResponse.Student student2 = subjectiveHomeworkAnswer.getStudent();
            if (AbstractC9979u.m20289b(studentId, student2 != null ? student2.getStudentId() : null)) {
                break;
            }
        }
        C6152a c6152a = (C6152a) next;
        if (!this.f8843t && c6152a == null) {
            Context context = getContext();
            AbstractC9979u.m20293f(context, "getContext(...)");
            C6152a c6152a2 = new C6152a(new SimpleCanvasLayout(context, true), subjectiveHomeworkAnswer);
            ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = this.f8847x;
            if (viewSubjectiveAnswerAdapter2 == null) {
                AbstractC9979u.m20312y("mAdapter");
                viewSubjectiveAnswerAdapter2 = null;
            }
            viewSubjectiveAnswerAdapter2.addData((ViewSubjectiveAnswerAdapter) c6152a2);
            ViewPager viewPager2 = this.f8834k;
            if (viewPager2 == null) {
                AbstractC9979u.m20312y("viewPager");
            } else {
                viewPager = viewPager2;
            }
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            int i10 = this.f8846w + 1;
            this.f8846w = i10;
            TextView textView = this.f8829f;
            if (textView != null) {
                textView.setText("已提交: " + i10);
            }
        }
        if (this.f8846w == 1) {
            TextView textView2 = this.f8827d;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
            TextView textView3 = this.f8827d;
            if (textView3 != null) {
                textView3.setTextColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.view.View] */
    /* renamed from: N */
    public final void m6767N() throws Resources.NotFoundException {
        MqttResponse.Student student;
        ViewPager viewPager = null;
        if (!this.f8842s) {
            View view = this.f8840q;
            if (view == null) {
                AbstractC9979u.m20312y("layoutList");
                view = null;
            }
            view.setVisibility(0);
            View view2 = this.f8841r;
            if (view2 == null) {
                AbstractC9979u.m20312y("layoutDetail");
                view2 = null;
            }
            view2.setVisibility(8);
            ?? r02 = this.f8837n;
            if (r02 == 0) {
                AbstractC9979u.m20312y("layoutRandom");
            } else {
                viewPager = r02;
            }
            viewPager.setVisibility(0);
            return;
        }
        View view3 = this.f8840q;
        if (view3 == null) {
            AbstractC9979u.m20312y("layoutList");
            view3 = null;
        }
        view3.setVisibility(8);
        View view4 = this.f8837n;
        if (view4 == null) {
            AbstractC9979u.m20312y("layoutRandom");
            view4 = null;
        }
        view4.setVisibility(8);
        View view5 = this.f8841r;
        if (view5 == null) {
            AbstractC9979u.m20312y("layoutDetail");
            view5 = null;
        }
        view5.setVisibility(0);
        TextView textView = this.f8832i;
        if (textView != null) {
            SubjectiveHomeworkAnswer subjectiveHomeworkAnswer = this.f8844u;
            textView.setText((subjectiveHomeworkAnswer == null || (student = subjectiveHomeworkAnswer.getStudent()) == null) ? null : student.getStudentName());
        }
        ViewPager viewPager2 = this.f8834k;
        if (viewPager2 == null) {
            AbstractC9979u.m20312y("viewPager");
            viewPager2 = null;
        }
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter = this.f8847x;
        if (viewSubjectiveAnswerAdapter == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter = null;
        }
        viewPager2.setCurrentItem(AbstractC10947g0.m23949r0(viewSubjectiveAnswerAdapter.getData(), this.f8845v), false);
        ViewSubjectiveAnswerAdapter viewSubjectiveAnswerAdapter2 = this.f8847x;
        if (viewSubjectiveAnswerAdapter2 == null) {
            AbstractC9979u.m20312y("mAdapter");
            viewSubjectiveAnswerAdapter2 = null;
        }
        List<C6152a> data = viewSubjectiveAnswerAdapter2.getData();
        ViewPager viewPager3 = this.f8834k;
        if (viewPager3 == null) {
            AbstractC9979u.m20312y("viewPager");
        } else {
            viewPager = viewPager3;
        }
        data.get(viewPager.getCurrentItem()).m6768a().m6554B();
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout
    /* renamed from: c */
    public LifecycleRegistry mo6640c() {
        return new LifecycleRegistry(this);
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        LiveEventBus.get("updateTestLocalPath", SubjectiveHomeworkAnswer.class).observe(this, new Observer() { // from class: i3.r
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ViewAnswerSubjectiveLayout.m6741K(this.f22114c, (SubjectiveHomeworkAnswer) obj);
            }
        });
    }
}
