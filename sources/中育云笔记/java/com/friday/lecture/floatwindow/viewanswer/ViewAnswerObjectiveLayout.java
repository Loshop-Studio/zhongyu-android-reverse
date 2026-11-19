package com.friday.lecture.floatwindow.viewanswer;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.blankj.utilcode.util.ThreadUtils;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.friday.common.classtest.MqttResponse;
import com.friday.common.entity.MqttEntity;
import com.friday.common.entity.MqttType;
import com.friday.common.helper.GridSpacingItemDecoration;
import com.friday.lecture.R$color;
import com.friday.lecture.R$dimen;
import com.friday.lecture.R$drawable;
import com.friday.lecture.R$id;
import com.friday.lecture.R$layout;
import com.friday.lecture.databinding.WindowViewObjectiveAnswerBinding;
import com.friday.lecture.floatwindow.options.C6149a;
import com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout;
import com.friday.lecture.model.ClassTestHelper;
import com.friday.lecture.widget.LifecycleFrameLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p004a3.C0049c;
import p111d3.C8925a;
import p268o1.InterfaceC10427d;
import p310qd.AbstractC10793c0;
import p325rc.AbstractC10978w;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ViewAnswerObjectiveLayout extends LifecycleFrameLayout {

    /* renamed from: d */
    public boolean f8794d;

    /* renamed from: e */
    public TheTabAdapter f8795e;

    /* renamed from: f */
    public TheViewPagerAdapter f8796f;

    /* renamed from: g */
    public TheDetailAdapter f8797g;

    /* renamed from: h */
    public TextView f8798h;

    /* renamed from: i */
    public TextView f8799i;

    /* renamed from: j */
    public TextView f8800j;

    /* renamed from: k */
    public TextView f8801k;

    /* renamed from: l */
    public TextView f8802l;

    /* renamed from: m */
    public TextView f8803m;

    /* renamed from: n */
    public View f8804n;

    /* renamed from: o */
    public ViewPager2 f8805o;

    /* renamed from: p */
    public int f8806p;

    /* renamed from: q */
    public final LinkedHashMap f8807q;

    /* renamed from: r */
    public final ArrayList f8808r;

    /* renamed from: s */
    public final ArrayList f8809s;

    /* renamed from: t */
    public final TreeSet f8810t;

    /* renamed from: u */
    public final TreeSet f8811u;

    /* renamed from: v */
    public View f8812v;

    /* renamed from: w */
    public View f8813w;

    /* renamed from: x */
    public int f8814x;

    /* renamed from: y */
    public TreeSet f8815y;

    /* renamed from: z */
    public WindowViewObjectiveAnswerBinding f8816z;

    @StabilityInferred(parameters = 0)
    public static final class StatisticAdapter extends BaseQuickAdapter<C6150a, BaseViewHolder> {

        /* renamed from: a */
        public final int f8817a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StatisticAdapter(int i10, List dataList) {
            super(R$layout.item_statistic_child, dataList);
            AbstractC9979u.m20294g(dataList, "dataList");
            this.f8817a = i10;
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, C6150a item) {
            AbstractC9979u.m20294g(holder, "holder");
            AbstractC9979u.m20294g(item, "item");
            holder.setText(R$id.tv_count, item.m6724b().isEmpty() ? "" : String.valueOf(item.m6724b().size())).setText(R$id.tv_option, item.m6723a());
            ImageView imageView = (ImageView) holder.getView(R$id.iv_percent);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            AbstractC9979u.m20292e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            layoutParams2.height = (int) (getContext().getResources().getDimension(R$dimen.view_110) * ((item.m6724b().size() * 1.0f) / this.f8817a));
            imageView.setLayoutParams(layoutParams2);
            if (item.m6725c()) {
                imageView.setBackgroundColor(Color.parseColor("#14FF9C"));
            } else {
                imageView.setBackgroundColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
            }
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TheDetailAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
        public TheDetailAdapter() {
            super(R$layout.item_option_detail, null, 2, null);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, String item) {
            AbstractC9979u.m20294g(holder, "holder");
            AbstractC9979u.m20294g(item, "item");
            holder.setText(R$id.tv_name, item);
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TheTabAdapter extends BaseQuickAdapter<C6151b, BaseViewHolder> {
        public TheTabAdapter() {
            super(R$layout.item_question_num_tab, null, 2, null);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, C6151b item) {
            AbstractC9979u.m20294g(holder, "holder");
            AbstractC9979u.m20294g(item, "item");
            holder.setText(R$id.tv_content, "第" + item.m6727a() + "题");
            TextView textView = (TextView) holder.getView(R$id.tv_content);
            if (item.m6729c()) {
                textView.setTextColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
            } else {
                textView.setTextColor(ContextCompat.getColor(getContext(), R$color.white));
            }
            textView.setSelected(item.m6729c());
        }
    }

    @StabilityInferred(parameters = 0)
    public static final class TheViewPagerAdapter extends BaseQuickAdapter<C6151b, BaseViewHolder> {
        public TheViewPagerAdapter() {
            super(R$layout.item_statistic, null, 2, null);
        }

        /* renamed from: k */
        public static final void m6721k(StatisticAdapter statisticAdapter, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
            AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
            AbstractC9979u.m20294g(view, "<unused var>");
            C6150a item = statisticAdapter.getItem(i10);
            if (item.m6724b().isEmpty()) {
                return;
            }
            Iterator<T> it = statisticAdapter.getData().iterator();
            while (it.hasNext()) {
                ((C6150a) it.next()).m6726d(false);
            }
            item.m6726d(true);
            statisticAdapter.notifyDataSetChanged();
            LiveEventBus.get("OptionDetail", C6150a.class).post(item);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void convert(BaseViewHolder holder, C6151b item) {
            Integer num;
            AbstractC9979u.m20294g(holder, "holder");
            AbstractC9979u.m20294g(item, "item");
            final RecyclerView recyclerView = (RecyclerView) holder.getView(R$id.rv_statistic);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout$TheViewPagerAdapter$convert$1$1
                    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
                    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                        AbstractC9979u.m20294g(outRect, "outRect");
                        AbstractC9979u.m20294g(view, "view");
                        AbstractC9979u.m20294g(parent, "parent");
                        AbstractC9979u.m20294g(state, "state");
                        super.getItemOffsets(outRect, view, parent, state);
                        outRect.right = (int) recyclerView.getContext().getResources().getDimension(R$dimen.view_30);
                    }
                });
            }
            Iterator it = item.m6728b().iterator();
            if (it.hasNext()) {
                Integer numValueOf = Integer.valueOf(((C6150a) it.next()).m6724b().size());
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((C6150a) it.next()).m6724b().size());
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            } else {
                num = null;
            }
            final StatisticAdapter statisticAdapter = new StatisticAdapter(num != null ? num.intValue() : 0, item.m6728b());
            recyclerView.setAdapter(statisticAdapter);
            statisticAdapter.setOnItemClickListener(new InterfaceC10427d() { // from class: i3.o
                @Override // p268o1.InterfaceC10427d
                /* renamed from: a */
                public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                    ViewAnswerObjectiveLayout.TheViewPagerAdapter.m6721k(statisticAdapter, baseQuickAdapter, view, i10);
                }
            });
        }
    }

    /* renamed from: com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout$b */
    public static final class C6151b {

        /* renamed from: a */
        public final String f8822a;

        /* renamed from: b */
        public boolean f8823b;

        /* renamed from: c */
        public final List f8824c;

        public C6151b(String content, boolean z10, List detail) {
            AbstractC9979u.m20294g(content, "content");
            AbstractC9979u.m20294g(detail, "detail");
            this.f8822a = content;
            this.f8823b = z10;
            this.f8824c = detail;
        }

        /* renamed from: a */
        public final String m6727a() {
            return this.f8822a;
        }

        /* renamed from: b */
        public final List m6728b() {
            return this.f8824c;
        }

        /* renamed from: c */
        public final boolean m6729c() {
            return this.f8823b;
        }

        /* renamed from: d */
        public final void m6730d(boolean z10) {
            this.f8823b = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6151b)) {
                return false;
            }
            C6151b c6151b = (C6151b) obj;
            return AbstractC9979u.m20289b(this.f8822a, c6151b.f8822a) && this.f8823b == c6151b.f8823b && AbstractC9979u.m20289b(this.f8824c, c6151b.f8824c);
        }

        public int hashCode() {
            return (((this.f8822a.hashCode() * 31) + Boolean.hashCode(this.f8823b)) * 31) + this.f8824c.hashCode();
        }

        public String toString() {
            return "TheTabEntity(content=" + this.f8822a + ", isSelected=" + this.f8823b + ", detail=" + this.f8824c + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAnswerObjectiveLayout(Context context) {
        super(context);
        AbstractC9979u.m20294g(context, "context");
        m6708t();
        this.f8807q = new LinkedHashMap();
        this.f8808r = new ArrayList();
        this.f8809s = new ArrayList();
        this.f8810t = new TreeSet();
        this.f8811u = new TreeSet();
        this.f8814x = 1;
        this.f8815y = new TreeSet();
    }

    /* renamed from: A */
    public static final void m6685A(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, BaseQuickAdapter baseQuickAdapter, View view, int i10) {
        AbstractC9979u.m20294g(baseQuickAdapter, "<unused var>");
        AbstractC9979u.m20294g(view, "<unused var>");
        TheTabAdapter theTabAdapter = viewAnswerObjectiveLayout.f8795e;
        if (theTabAdapter == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter = null;
        }
        if (theTabAdapter.getItem(i10).m6729c()) {
            return;
        }
        TheTabAdapter theTabAdapter2 = viewAnswerObjectiveLayout.f8795e;
        if (theTabAdapter2 == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter2 = null;
        }
        Iterator<T> it = theTabAdapter2.getData().iterator();
        while (it.hasNext()) {
            ((C6151b) it.next()).m6730d(false);
        }
        TheTabAdapter theTabAdapter3 = viewAnswerObjectiveLayout.f8795e;
        if (theTabAdapter3 == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter3 = null;
        }
        theTabAdapter3.getData().get(i10).m6730d(true);
        TheTabAdapter theTabAdapter4 = viewAnswerObjectiveLayout.f8795e;
        if (theTabAdapter4 == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter4 = null;
        }
        theTabAdapter4.notifyDataSetChanged();
        ViewPager2 viewPager2 = viewAnswerObjectiveLayout.f8805o;
        if (viewPager2 == null) {
            AbstractC9979u.m20312y("vpOptions");
            viewPager2 = null;
        }
        viewPager2.setCurrentItem(i10, false);
        LiveEventBus.get("OptionDetail", C6150a.class).post(null);
    }

    /* renamed from: B */
    public static final void m6686B(View view) {
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

    /* renamed from: C */
    public static final void m6687C(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, View view) {
        ArrayList arrayList = viewAnswerObjectiveLayout.f8809s;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Iterator it = ((C6151b) obj).m6728b().iterator();
            while (it.hasNext()) {
                ((C6150a) it.next()).m6726d(false);
            }
        }
        LiveEventBus.get("OptionDetail", C6150a.class).post(null);
        TheViewPagerAdapter theViewPagerAdapter = viewAnswerObjectiveLayout.f8796f;
        if (theViewPagerAdapter == null) {
            AbstractC9979u.m20312y("theViewPagerAdapter");
            theViewPagerAdapter = null;
        }
        theViewPagerAdapter.setList(viewAnswerObjectiveLayout.f8809s);
        TextView textView = viewAnswerObjectiveLayout.f8802l;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(viewAnswerObjectiveLayout.getContext(), R$color.colorPrimary));
        }
        TextView textView2 = viewAnswerObjectiveLayout.f8803m;
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(viewAnswerObjectiveLayout.getContext(), R$color.white));
        }
        Drawable drawable = ContextCompat.getDrawable(viewAnswerObjectiveLayout.getContext(), R$drawable.selected_indicator);
        TextView textView3 = viewAnswerObjectiveLayout.f8802l;
        if (textView3 != null) {
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
        TextView textView4 = viewAnswerObjectiveLayout.f8803m;
        if (textView4 != null) {
            textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: D */
    public static final void m6688D(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, View view) {
        ArrayList arrayList = viewAnswerObjectiveLayout.f8808r;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Iterator it = ((C6151b) obj).m6728b().iterator();
            while (it.hasNext()) {
                ((C6150a) it.next()).m6726d(false);
            }
        }
        LiveEventBus.get("OptionDetail", C6150a.class).post(null);
        TheViewPagerAdapter theViewPagerAdapter = viewAnswerObjectiveLayout.f8796f;
        if (theViewPagerAdapter == null) {
            AbstractC9979u.m20312y("theViewPagerAdapter");
            theViewPagerAdapter = null;
        }
        theViewPagerAdapter.setList(viewAnswerObjectiveLayout.f8808r);
        TextView textView = viewAnswerObjectiveLayout.f8803m;
        if (textView != null) {
            textView.setTextColor(ContextCompat.getColor(viewAnswerObjectiveLayout.getContext(), R$color.colorPrimary));
        }
        TextView textView2 = viewAnswerObjectiveLayout.f8802l;
        if (textView2 != null) {
            textView2.setTextColor(ContextCompat.getColor(viewAnswerObjectiveLayout.getContext(), R$color.white));
        }
        Drawable drawable = ContextCompat.getDrawable(viewAnswerObjectiveLayout.getContext(), R$drawable.selected_indicator);
        TextView textView3 = viewAnswerObjectiveLayout.f8803m;
        if (textView3 != null) {
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, drawable);
        }
        TextView textView4 = viewAnswerObjectiveLayout.f8802l;
        if (textView4 != null) {
            textView4.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: E */
    public static final void m6689E(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, View view) {
        LiveEventBus.get(MqttEntity.class).post(new MqttEntity(MqttType.TIME_UP, "", null, 4, null));
        viewAnswerObjectiveLayout.m6715G();
    }

    /* renamed from: F */
    public static final void m6690F(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, TextView textView, TextView textView2, View view, C6150a c6150a) {
        TheDetailAdapter theDetailAdapter = null;
        if (c6150a == null) {
            view.setVisibility(0);
            TheDetailAdapter theDetailAdapter2 = viewAnswerObjectiveLayout.f8797g;
            if (theDetailAdapter2 == null) {
                AbstractC9979u.m20312y("theDetailAdapter");
                theDetailAdapter2 = null;
            }
            theDetailAdapter2.setList(null);
            return;
        }
        TheDetailAdapter theDetailAdapter3 = viewAnswerObjectiveLayout.f8797g;
        if (theDetailAdapter3 == null) {
            AbstractC9979u.m20312y("theDetailAdapter");
        } else {
            theDetailAdapter = theDetailAdapter3;
        }
        theDetailAdapter.setList(c6150a.m6724b());
        textView.setText(String.valueOf(c6150a.m6724b().size()));
        textView2.setText("选择 " + c6150a.m6723a() + " 的学生");
        view.setVisibility(8);
    }

    /* renamed from: H */
    public static final void m6691H(final ViewAnswerObjectiveLayout viewAnswerObjectiveLayout) {
        int i10;
        viewAnswerObjectiveLayout.f8808r.clear();
        viewAnswerObjectiveLayout.f8809s.clear();
        int i11 = viewAnswerObjectiveLayout.f8806p;
        int i12 = 0;
        while (i12 < i11) {
            ArrayList arrayList = new ArrayList();
            for (String str : viewAnswerObjectiveLayout.f8811u) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : viewAnswerObjectiveLayout.f8807q.entrySet()) {
                    AbstractC9979u.m20293f(obj, "next(...)");
                    Map.Entry entry = (Map.Entry) obj;
                    Object value = entry.getValue();
                    AbstractC9979u.m20293f(value, "<get-value>(...)");
                    int i13 = 0;
                    for (Object obj2 : (Iterable) value) {
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            AbstractC10978w.m24145w();
                        }
                        String str2 = (String) obj2;
                        if (i13 == i12) {
                            i10 = i11;
                            if (AbstractC10793c0.m23108U(str2, str, false, 2, null)) {
                                arrayList2.add(entry.getKey());
                            }
                        } else {
                            i10 = i11;
                        }
                        i13 = i14;
                        i11 = i10;
                    }
                }
                arrayList.add(new C6150a(str, arrayList2, false, 4, null));
            }
            int i15 = i11;
            int i16 = i12 + 1;
            viewAnswerObjectiveLayout.f8809s.add(new C6151b(String.valueOf(i16), false, arrayList));
            ArrayList arrayList3 = new ArrayList();
            for (String string : viewAnswerObjectiveLayout.f8810t) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : viewAnswerObjectiveLayout.f8807q.entrySet()) {
                    AbstractC9979u.m20293f(obj3, "next(...)");
                    Map.Entry entry2 = (Map.Entry) obj3;
                    Object value2 = entry2.getValue();
                    AbstractC9979u.m20293f(value2, "<get-value>(...)");
                    int i17 = 0;
                    for (Object obj4 : (Iterable) value2) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            AbstractC10978w.m24145w();
                        }
                        String str3 = (String) obj4;
                        if (i17 == i12 && AbstractC9979u.m20289b(str3, string)) {
                            arrayList4.add(entry2.getKey());
                        }
                        i17 = i18;
                    }
                }
                if (string.length() > 4) {
                    StringBuffer stringBuffer = new StringBuffer();
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < string.length()) {
                        char cCharAt = string.charAt(i19);
                        int i21 = i20 + 1;
                        if (i20 == 3) {
                            stringBuffer.append(cCharAt);
                            stringBuffer.append(SignParameters.NEW_LINE);
                        } else {
                            stringBuffer.append(cCharAt);
                        }
                        i19++;
                        i20 = i21;
                    }
                    string = stringBuffer.toString();
                }
                String str4 = string;
                AbstractC9979u.m20291d(str4);
                if (arrayList4.size() > 0) {
                    arrayList3.add(new C6150a(str4, arrayList4, false, 4, null));
                }
            }
            viewAnswerObjectiveLayout.f8808r.add(new C6151b(String.valueOf(i16), false, arrayList3));
            i12 = i16;
            i11 = i15;
        }
        ThreadUtils.runOnUiThread(new Runnable() { // from class: i3.e
            @Override // java.lang.Runnable
            public final void run() {
                ViewAnswerObjectiveLayout.m6692I(this.f22091c);
            }
        });
    }

    /* renamed from: I */
    public static final void m6692I(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout) {
        ArrayList arrayList = viewAnswerObjectiveLayout.f8809s;
        if (arrayList != null && !arrayList.isEmpty()) {
            ((C6151b) viewAnswerObjectiveLayout.f8809s.get(0)).m6730d(true);
        }
        TheTabAdapter theTabAdapter = viewAnswerObjectiveLayout.f8795e;
        TheViewPagerAdapter theViewPagerAdapter = null;
        if (theTabAdapter == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter = null;
        }
        theTabAdapter.setList(viewAnswerObjectiveLayout.f8809s);
        TheViewPagerAdapter theViewPagerAdapter2 = viewAnswerObjectiveLayout.f8796f;
        if (theViewPagerAdapter2 == null) {
            AbstractC9979u.m20312y("theViewPagerAdapter");
        } else {
            theViewPagerAdapter = theViewPagerAdapter2;
        }
        theViewPagerAdapter.setList(viewAnswerObjectiveLayout.f8809s);
    }

    /* renamed from: t */
    private final void m6708t() {
        TheViewPagerAdapter theViewPagerAdapter = null;
        View viewInflate = View.inflate(getContext(), R$layout.window_view_objective_answer, null);
        addView(viewInflate);
        WindowViewObjectiveAnswerBinding windowViewObjectiveAnswerBindingM6510a = WindowViewObjectiveAnswerBinding.m6510a(viewInflate);
        AbstractC9979u.m20293f(windowViewObjectiveAnswerBindingM6510a, "bind(...)");
        this.f8816z = windowViewObjectiveAnswerBindingM6510a;
        this.f8812v = findViewById(R$id.before);
        this.f8813w = findViewById(R$id.statistics);
        ImageView imageView = (ImageView) findViewById(R$id.iv_close);
        this.f8798h = (TextView) findViewById(R$id.tv_submit_count_before);
        this.f8800j = (TextView) findViewById(R$id.tv_end_class_before);
        this.f8801k = (TextView) findViewById(R$id.tv_time_up_before);
        View viewFindViewById = findViewById(R$id.tv_end_class_cancel);
        View viewFindViewById2 = findViewById(R$id.tv_end_class_ensure);
        View viewFindViewById3 = findViewById(R$id.tv_time_up_ensure);
        View viewFindViewById4 = findViewById(R$id.tv_time_up_cancel);
        final View viewFindViewById5 = findViewById(R$id.layout_end_class);
        View viewFindViewById6 = findViewById(R$id.layout_time_up);
        AbstractC9979u.m20293f(viewFindViewById6, "findViewById(...)");
        this.f8804n = viewFindViewById6;
        this.f8799i = (TextView) findViewById(R$id.tv_submit_count_statistic);
        View viewFindViewById7 = findViewById(R$id.vp_options);
        AbstractC9979u.m20293f(viewFindViewById7, "findViewById(...)");
        this.f8805o = (ViewPager2) viewFindViewById7;
        RecyclerView recyclerView = (RecyclerView) findViewById(R$id.rv_option_detail);
        final RecyclerView recyclerView2 = (RecyclerView) findViewById(R$id.rv_question);
        this.f8802l = (TextView) findViewById(R$id.tv_selection_list);
        this.f8803m = (TextView) findViewById(R$id.tv_answer_list);
        TextView textView = this.f8800j;
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: i3.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerObjectiveLayout.m6709u(viewFindViewById5, view);
                }
            });
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: i3.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6710v(viewFindViewById5, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: i3.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6686B(view);
            }
        });
        TextView textView2 = this.f8802l;
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: i3.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerObjectiveLayout.m6687C(this.f22103c, view);
                }
            });
        }
        TextView textView3 = this.f8803m;
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: i3.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerObjectiveLayout.m6688D(this.f22104c, view);
                }
            });
        }
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: i3.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6689E(this.f22105c, view);
            }
        });
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: i3.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6711w(this.f22106c, view);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: i3.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6712x(view);
            }
        });
        TextView textView4 = this.f8801k;
        if (textView4 != null) {
            textView4.setOnClickListener(new View.OnClickListener() { // from class: i3.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ViewAnswerObjectiveLayout.m6713y(this.f22085c, view);
                }
            });
        }
        ((TextView) findViewById(R$id.tv_end_class_statistic)).setOnClickListener(new View.OnClickListener() { // from class: i3.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ViewAnswerObjectiveLayout.m6714z(viewFindViewById5, view);
            }
        });
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 2));
        recyclerView.addItemDecoration(new GridSpacingItemDecoration(2, (int) recyclerView.getContext().getResources().getDimension(R$dimen.view_10), false, false, 8, null));
        TheDetailAdapter theDetailAdapter = new TheDetailAdapter();
        this.f8797g = theDetailAdapter;
        recyclerView.setAdapter(theDetailAdapter);
        recyclerView2.setLayoutManager(new LinearLayoutManager(recyclerView2.getContext()));
        recyclerView2.addItemDecoration(new RecyclerView.ItemDecoration() { // from class: com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout$initView$12$1
            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                AbstractC9979u.m20294g(outRect, "outRect");
                AbstractC9979u.m20294g(view, "view");
                AbstractC9979u.m20294g(parent, "parent");
                AbstractC9979u.m20294g(state, "state");
                super.getItemOffsets(outRect, view, parent, state);
                outRect.top = (int) recyclerView2.getResources().getDimension(R$dimen.view_9);
                if (parent.getLayoutManager() != null) {
                    if (parent.getChildAdapterPosition(view) == r5.getItemCount() - 1) {
                        outRect.bottom = (int) recyclerView2.getResources().getDimension(R$dimen.view_9);
                    }
                }
            }
        });
        TheTabAdapter theTabAdapter = new TheTabAdapter();
        this.f8795e = theTabAdapter;
        recyclerView2.setAdapter(theTabAdapter);
        TheTabAdapter theTabAdapter2 = this.f8795e;
        if (theTabAdapter2 == null) {
            AbstractC9979u.m20312y("theTabAdapter");
            theTabAdapter2 = null;
        }
        theTabAdapter2.setOnItemClickListener(new InterfaceC10427d() { // from class: i3.g
            @Override // p268o1.InterfaceC10427d
            /* renamed from: a */
            public final void mo2825a(BaseQuickAdapter baseQuickAdapter, View view, int i10) {
                ViewAnswerObjectiveLayout.m6685A(this.f22094a, baseQuickAdapter, view, i10);
            }
        });
        ViewPager2 viewPager2 = this.f8805o;
        if (viewPager2 == null) {
            AbstractC9979u.m20312y("vpOptions");
            viewPager2 = null;
        }
        this.f8796f = new TheViewPagerAdapter();
        viewPager2.setUserInputEnabled(false);
        viewPager2.setOrientation(1);
        TheViewPagerAdapter theViewPagerAdapter2 = this.f8796f;
        if (theViewPagerAdapter2 == null) {
            AbstractC9979u.m20312y("theViewPagerAdapter");
        } else {
            theViewPagerAdapter = theViewPagerAdapter2;
        }
        viewPager2.setAdapter(theViewPagerAdapter);
        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() { // from class: com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout$initView$13$1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                super.onPageSelected(i10);
                ViewAnswerObjectiveLayout.TheViewPagerAdapter theViewPagerAdapter3 = this.f8826a.f8796f;
                ViewAnswerObjectiveLayout.TheViewPagerAdapter theViewPagerAdapter4 = null;
                if (theViewPagerAdapter3 == null) {
                    AbstractC9979u.m20312y("theViewPagerAdapter");
                    theViewPagerAdapter3 = null;
                }
                Iterator it = theViewPagerAdapter3.getItem(i10).m6728b().iterator();
                while (it.hasNext()) {
                    ((ViewAnswerObjectiveLayout.C6150a) it.next()).m6726d(false);
                }
                ViewAnswerObjectiveLayout.TheViewPagerAdapter theViewPagerAdapter5 = this.f8826a.f8796f;
                if (theViewPagerAdapter5 == null) {
                    AbstractC9979u.m20312y("theViewPagerAdapter");
                } else {
                    theViewPagerAdapter4 = theViewPagerAdapter5;
                }
                theViewPagerAdapter4.notifyDataSetChanged();
            }
        });
        TextView textView5 = this.f8801k;
        if (textView5 != null) {
            textView5.setEnabled(false);
        }
    }

    /* renamed from: u */
    public static final void m6709u(View view, View view2) {
        view.setVisibility(0);
    }

    /* renamed from: v */
    public static final void m6710v(View view, View view2) {
        view.setVisibility(8);
    }

    /* renamed from: w */
    public static final void m6711w(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, View view) {
        View view2 = viewAnswerObjectiveLayout.f8804n;
        if (view2 == null) {
            AbstractC9979u.m20312y("layoutTimeUp");
            view2 = null;
        }
        view2.setVisibility(8);
    }

    /* renamed from: x */
    public static final void m6712x(View view) {
        C8925a.f20887a.m17517a();
    }

    /* renamed from: y */
    public static final void m6713y(ViewAnswerObjectiveLayout viewAnswerObjectiveLayout, View view) {
        View view2 = viewAnswerObjectiveLayout.f8804n;
        if (view2 == null) {
            AbstractC9979u.m20312y("layoutTimeUp");
            view2 = null;
        }
        view2.setVisibility(0);
    }

    /* renamed from: z */
    public static final void m6714z(View view, View view2) {
        view.setVisibility(0);
    }

    /* renamed from: G */
    public final void m6715G() {
        ClassTestHelper.INSTANCE.timeUp();
        this.f8794d = true;
        View view = this.f8804n;
        if (view == null) {
            AbstractC9979u.m20312y("layoutTimeUp");
            view = null;
        }
        view.setVisibility(8);
        View view2 = this.f8812v;
        if (view2 != null) {
            view2.setVisibility(4);
        }
        View view3 = this.f8813w;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        TextView textView = this.f8799i;
        if (textView != null) {
            textView.setText("选择题统计     已提交:    " + this.f8807q.size());
        }
        new Thread(new Runnable() { // from class: i3.d
            @Override // java.lang.Runnable
            public final void run() {
                ViewAnswerObjectiveLayout.m6691H(this.f22089c);
            }
        }).start();
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout
    /* renamed from: c */
    public LifecycleRegistry mo6640c() {
        return new LifecycleRegistry(this);
    }

    @Override // com.friday.lecture.widget.LifecycleFrameLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextView textView = (TextView) findViewById(R$id.tv_option_student);
        final TextView textView2 = (TextView) findViewById(R$id.tv_option_count);
        final View viewFindViewById = findViewById(R$id.empty_view);
        LiveEventBus.get("OptionDetail", C6150a.class).observe(this, new Observer() { // from class: i3.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                ViewAnswerObjectiveLayout.m6690F(this.f22080c, textView2, textView, viewFindViewById, (ViewAnswerObjectiveLayout.C6150a) obj);
            }
        });
    }

    /* renamed from: s */
    public final synchronized void m6716s(int i10, int i11, MqttResponse.Student student, List list) {
        try {
            AbstractC9979u.m20294g(list, "list");
            if (this.f8794d) {
                return;
            }
            this.f8814x = i11;
            if (i11 == 1) {
                TextView textView = this.f8802l;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                TextView textView2 = this.f8803m;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
            } else {
                TextView textView3 = this.f8802l;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = this.f8803m;
                if (textView4 != null) {
                    textView4.setVisibility(0);
                }
            }
            this.f8806p = list.size();
            if (1 <= i10) {
                int i12 = 1;
                while (true) {
                    switch (i12) {
                        case 1:
                            this.f8811u.add(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);
                            break;
                        case 2:
                            this.f8811u.add("B");
                            break;
                        case 3:
                            this.f8811u.add("C");
                            break;
                        case 4:
                            this.f8811u.add("D");
                            break;
                        case 5:
                            this.f8811u.add(ExifInterface.LONGITUDE_EAST);
                            break;
                        case 6:
                            this.f8811u.add("F");
                            break;
                        case 7:
                            this.f8811u.add("G");
                            break;
                        case 8:
                            this.f8811u.add("H");
                            break;
                    }
                    if (i12 != i10) {
                        i12++;
                    }
                }
            }
            if (i11 != 1) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.f8810t.add((String) it.next());
                }
            }
            if (student != null) {
                this.f8815y.add(student.getStudentId());
                this.f8807q.put(student.getStudentName(), list);
            }
            TextView textView5 = this.f8798h;
            if (textView5 != null) {
                textView5.setText("已提交: " + this.f8807q.size());
            }
            TextView textView6 = this.f8801k;
            if (textView6 != null) {
                textView6.setEnabled(true);
            }
            TextView textView7 = this.f8801k;
            if (textView7 != null) {
                textView7.setTextColor(ContextCompat.getColor(getContext(), R$color.colorPrimary));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.friday.lecture.floatwindow.viewanswer.ViewAnswerObjectiveLayout$a */
    public static final class C6150a {

        /* renamed from: a */
        public final String f8819a;

        /* renamed from: b */
        public List f8820b;

        /* renamed from: c */
        public boolean f8821c;

        public C6150a(String option, List students, boolean z10) {
            AbstractC9979u.m20294g(option, "option");
            AbstractC9979u.m20294g(students, "students");
            this.f8819a = option;
            this.f8820b = students;
            this.f8821c = z10;
        }

        /* renamed from: a */
        public final String m6723a() {
            return this.f8819a;
        }

        /* renamed from: b */
        public final List m6724b() {
            return this.f8820b;
        }

        /* renamed from: c */
        public final boolean m6725c() {
            return this.f8821c;
        }

        /* renamed from: d */
        public final void m6726d(boolean z10) {
            this.f8821c = z10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6150a)) {
                return false;
            }
            C6150a c6150a = (C6150a) obj;
            return AbstractC9979u.m20289b(this.f8819a, c6150a.f8819a) && AbstractC9979u.m20289b(this.f8820b, c6150a.f8820b) && this.f8821c == c6150a.f8821c;
        }

        public int hashCode() {
            return (((this.f8819a.hashCode() * 31) + this.f8820b.hashCode()) * 31) + Boolean.hashCode(this.f8821c);
        }

        public String toString() {
            return "TheStatisticsEntity(option=" + this.f8819a + ", students=" + this.f8820b + ", isSelected=" + this.f8821c + ")";
        }

        public /* synthetic */ C6150a(String str, List list, boolean z10, int i10, AbstractC9972n abstractC9972n) {
            this(str, list, (i10 & 4) != 0 ? false : z10);
        }
    }
}
