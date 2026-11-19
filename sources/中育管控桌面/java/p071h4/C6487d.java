package p071h4;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.lljjcoder.Interface.OnCityItemClickListener;
import com.lljjcoder.bean.CityBean;
import com.lljjcoder.bean.DistrictBean;
import com.lljjcoder.bean.ProvinceBean;
import com.lljjcoder.citywheel.CityConfig;
import com.lljjcoder.citywheel.CityParseHelper;
import com.lljjcoder.style.citylist.Toast.ToastUtils;
import com.lljjcoder.style.citypickerview.widget.CanShow;
import com.lljjcoder.style.citypickerview.widget.wheel.OnWheelChangedListener;
import com.lljjcoder.style.citypickerview.widget.wheel.WheelView;
import com.lljjcoder.utils.utils;
import com.zykj.manage.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p078i4.AbstractC6531a;

/* renamed from: h4.d */
/* loaded from: classes4.dex */
public final class C6487d implements CanShow, OnWheelChangedListener {

    /* renamed from: a */
    public PopupWindow f8279a;

    /* renamed from: b */
    public View f8280b;

    /* renamed from: c */
    public WheelView f8281c;

    /* renamed from: d */
    public WheelView f8282d;

    /* renamed from: e */
    public WheelView f8283e;

    /* renamed from: f */
    public RelativeLayout f8284f;

    /* renamed from: g */
    public TextView f8285g;

    /* renamed from: h */
    public TextView f8286h;

    /* renamed from: i */
    public TextView f8287i;

    /* renamed from: j */
    public OnCityItemClickListener f8288j;

    /* renamed from: k */
    public CityParseHelper f8289k;

    /* renamed from: l */
    public CityConfig f8290l;

    /* renamed from: m */
    public Context f8291m;

    /* renamed from: n */
    public List f8292n;

    /* renamed from: g */
    public static final void m7172g(C6487d c6487d) {
        CityConfig cityConfig = c6487d.f8290l;
        Intrinsics.checkNotNull(cityConfig);
        if (cityConfig.isShowBackground()) {
            utils.setBackgroundAlpha(c6487d.f8291m, 1.0f);
        }
    }

    /* renamed from: h */
    public static final void m7173h(C6487d c6487d, View view) {
        OnCityItemClickListener onCityItemClickListener = c6487d.f8288j;
        Intrinsics.checkNotNull(onCityItemClickListener);
        onCityItemClickListener.onCancel();
        c6487d.hide();
    }

    /* renamed from: i */
    public static final void m7174i(C6487d c6487d, View view) {
        if (c6487d.f8289k != null) {
            CityConfig cityConfig = c6487d.f8290l;
            Intrinsics.checkNotNull(cityConfig);
            if (cityConfig.getWheelType() == CityConfig.WheelType.PRO) {
                OnCityItemClickListener onCityItemClickListener = c6487d.f8288j;
                Intrinsics.checkNotNull(onCityItemClickListener);
                CityParseHelper cityParseHelper = c6487d.f8289k;
                Intrinsics.checkNotNull(cityParseHelper);
                onCityItemClickListener.onSelected(cityParseHelper.getProvinceBean(), new CityBean(), new DistrictBean());
            } else {
                CityConfig cityConfig2 = c6487d.f8290l;
                Intrinsics.checkNotNull(cityConfig2);
                if (cityConfig2.getWheelType() == CityConfig.WheelType.PRO_CITY) {
                    OnCityItemClickListener onCityItemClickListener2 = c6487d.f8288j;
                    Intrinsics.checkNotNull(onCityItemClickListener2);
                    CityParseHelper cityParseHelper2 = c6487d.f8289k;
                    Intrinsics.checkNotNull(cityParseHelper2);
                    ProvinceBean provinceBean = cityParseHelper2.getProvinceBean();
                    CityParseHelper cityParseHelper3 = c6487d.f8289k;
                    Intrinsics.checkNotNull(cityParseHelper3);
                    onCityItemClickListener2.onSelected(provinceBean, cityParseHelper3.getCityBean(), new DistrictBean());
                } else {
                    OnCityItemClickListener onCityItemClickListener3 = c6487d.f8288j;
                    Intrinsics.checkNotNull(onCityItemClickListener3);
                    CityParseHelper cityParseHelper4 = c6487d.f8289k;
                    Intrinsics.checkNotNull(cityParseHelper4);
                    ProvinceBean provinceBean2 = cityParseHelper4.getProvinceBean();
                    CityParseHelper cityParseHelper5 = c6487d.f8289k;
                    Intrinsics.checkNotNull(cityParseHelper5);
                    CityBean cityBean = cityParseHelper5.getCityBean();
                    CityParseHelper cityParseHelper6 = c6487d.f8289k;
                    Intrinsics.checkNotNull(cityParseHelper6);
                    onCityItemClickListener3.onSelected(provinceBean2, cityBean, cityParseHelper6.getDistrictBean());
                }
            }
        } else {
            OnCityItemClickListener onCityItemClickListener4 = c6487d.f8288j;
            Intrinsics.checkNotNull(onCityItemClickListener4);
            onCityItemClickListener4.onSelected(new ProvinceBean(), new CityBean(), new DistrictBean());
        }
        c6487d.hide();
    }

    /* renamed from: d */
    public final List m7175d(List list) {
        ArrayList arrayList = new ArrayList(list);
        CityConfig cityConfig = this.f8290l;
        Intrinsics.checkNotNull(cityConfig);
        if (!cityConfig.isShowGAT() && arrayList.size() >= 3) {
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
            arrayList.remove(arrayList.size() - 1);
        }
        this.f8292n = new ArrayList();
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            List list2 = this.f8292n;
            Intrinsics.checkNotNull(list2);
            Object obj = arrayList.get(i6);
            Intrinsics.checkNotNull(obj);
            list2.add(obj);
        }
        List list3 = this.f8292n;
        Intrinsics.checkNotNull(list3);
        return list3;
    }

    /* renamed from: e */
    public final void m7176e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f8291m = context;
        CityParseHelper cityParseHelper = new CityParseHelper();
        this.f8289k = cityParseHelper;
        Intrinsics.checkNotNull(cityParseHelper);
        if (cityParseHelper.getProvinceBeanArrayList().isEmpty()) {
            CityParseHelper cityParseHelper2 = this.f8289k;
            Intrinsics.checkNotNull(cityParseHelper2);
            cityParseHelper2.initData(context);
        }
    }

    /* renamed from: f */
    public final void m7177f() {
        if (this.f8290l == null) {
            throw new IllegalArgumentException("please set config first...");
        }
        if (this.f8289k == null) {
            this.f8289k = new CityParseHelper();
        }
        CityParseHelper cityParseHelper = this.f8289k;
        Intrinsics.checkNotNull(cityParseHelper);
        if (cityParseHelper.getProvinceBeanArrayList().isEmpty()) {
            ToastUtils.showLongToast(this.f8291m, "请在Activity中增加init操作");
            return;
        }
        View viewInflate = LayoutInflater.from(this.f8291m).inflate(R.layout.hw_view_city_picker, (ViewGroup) null);
        this.f8280b = viewInflate;
        Intrinsics.checkNotNull(viewInflate);
        this.f8281c = (WheelView) viewInflate.findViewById(R.id.id_province);
        View view = this.f8280b;
        Intrinsics.checkNotNull(view);
        this.f8282d = (WheelView) view.findViewById(R.id.id_city);
        View view2 = this.f8280b;
        Intrinsics.checkNotNull(view2);
        this.f8283e = (WheelView) view2.findViewById(R.id.id_district);
        View view3 = this.f8280b;
        Intrinsics.checkNotNull(view3);
        this.f8284f = (RelativeLayout) view3.findViewById(R.id.rl_title);
        View view4 = this.f8280b;
        Intrinsics.checkNotNull(view4);
        this.f8285g = (TextView) view4.findViewById(R.id.tv_confirm);
        View view5 = this.f8280b;
        Intrinsics.checkNotNull(view5);
        this.f8286h = (TextView) view5.findViewById(R.id.tv_title);
        View view6 = this.f8280b;
        Intrinsics.checkNotNull(view6);
        this.f8287i = (TextView) view6.findViewById(R.id.tv_cancel);
        View view7 = this.f8280b;
        Context context = this.f8291m;
        Intrinsics.checkNotNull(context);
        int dimension = (int) context.getResources().getDimension(R.dimen.pt153);
        Context context2 = this.f8291m;
        Intrinsics.checkNotNull(context2);
        PopupWindow popupWindow = new PopupWindow(view7, dimension, (int) context2.getResources().getDimension(R.dimen.pt153));
        this.f8279a = popupWindow;
        Intrinsics.checkNotNull(popupWindow);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        PopupWindow popupWindow2 = this.f8279a;
        Intrinsics.checkNotNull(popupWindow2);
        popupWindow2.setTouchable(true);
        PopupWindow popupWindow3 = this.f8279a;
        Intrinsics.checkNotNull(popupWindow3);
        popupWindow3.setOutsideTouchable(false);
        PopupWindow popupWindow4 = this.f8279a;
        Intrinsics.checkNotNull(popupWindow4);
        popupWindow4.setFocusable(true);
        PopupWindow popupWindow5 = this.f8279a;
        Intrinsics.checkNotNull(popupWindow5);
        popupWindow5.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: h4.a
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                C6487d.m7172g(this.f8276a);
            }
        });
        CityConfig cityConfig = this.f8290l;
        Intrinsics.checkNotNull(cityConfig);
        if (cityConfig.getTitleTextSize() > 0) {
            TextView textView = this.f8286h;
            Intrinsics.checkNotNull(textView);
            Intrinsics.checkNotNull(this.f8290l);
            textView.setTextSize(r1.getTitleTextSize());
        }
        CityConfig cityConfig2 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig2);
        if (!TextUtils.isEmpty(cityConfig2.getTitleTextColorStr())) {
            CityConfig cityConfig3 = this.f8290l;
            Intrinsics.checkNotNull(cityConfig3);
            String titleTextColorStr = cityConfig3.getTitleTextColorStr();
            Intrinsics.checkNotNullExpressionValue(titleTextColorStr, "getTitleTextColorStr(...)");
            if (StringsKt.startsWith$default(titleTextColorStr, "#", false, 2, (Object) null)) {
                TextView textView2 = this.f8286h;
                Intrinsics.checkNotNull(textView2);
                CityConfig cityConfig4 = this.f8290l;
                Intrinsics.checkNotNull(cityConfig4);
                textView2.setTextColor(Color.parseColor(cityConfig4.getTitleTextColorStr()));
            } else {
                TextView textView3 = this.f8286h;
                Intrinsics.checkNotNull(textView3);
                CityConfig cityConfig5 = this.f8290l;
                Intrinsics.checkNotNull(cityConfig5);
                textView3.setTextColor(Color.parseColor("#" + cityConfig5.getTitleTextColorStr()));
            }
        }
        CityConfig cityConfig6 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig6);
        if (!TextUtils.isEmpty(cityConfig6.getConfirmText())) {
            TextView textView4 = this.f8285g;
            Intrinsics.checkNotNull(textView4);
            CityConfig cityConfig7 = this.f8290l;
            Intrinsics.checkNotNull(cityConfig7);
            textView4.setText(cityConfig7.getConfirmText());
        }
        CityConfig cityConfig8 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig8);
        if (cityConfig8.getConfirmTextSize() > 0) {
            TextView textView5 = this.f8285g;
            Intrinsics.checkNotNull(textView5);
            Intrinsics.checkNotNull(this.f8290l);
            textView5.setTextSize(r1.getConfirmTextSize());
        }
        CityConfig cityConfig9 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig9);
        if (!TextUtils.isEmpty(cityConfig9.getCancelText())) {
            TextView textView6 = this.f8287i;
            Intrinsics.checkNotNull(textView6);
            CityConfig cityConfig10 = this.f8290l;
            Intrinsics.checkNotNull(cityConfig10);
            textView6.setText(cityConfig10.getCancelText());
        }
        CityConfig cityConfig11 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig11);
        if (cityConfig11.getCancelTextSize() > 0) {
            TextView textView7 = this.f8287i;
            Intrinsics.checkNotNull(textView7);
            Intrinsics.checkNotNull(this.f8290l);
            textView7.setTextSize(r1.getCancelTextSize());
        }
        CityConfig cityConfig12 = this.f8290l;
        Intrinsics.checkNotNull(cityConfig12);
        if (cityConfig12.getWheelType() == CityConfig.WheelType.PRO) {
            WheelView wheelView = this.f8282d;
            Intrinsics.checkNotNull(wheelView);
            wheelView.setVisibility(8);
            WheelView wheelView2 = this.f8283e;
            Intrinsics.checkNotNull(wheelView2);
            wheelView2.setVisibility(8);
        } else {
            CityConfig cityConfig13 = this.f8290l;
            Intrinsics.checkNotNull(cityConfig13);
            if (cityConfig13.getWheelType() == CityConfig.WheelType.PRO_CITY) {
                WheelView wheelView3 = this.f8283e;
                Intrinsics.checkNotNull(wheelView3);
                wheelView3.setVisibility(8);
            } else {
                WheelView wheelView4 = this.f8281c;
                Intrinsics.checkNotNull(wheelView4);
                wheelView4.setVisibility(0);
                WheelView wheelView5 = this.f8282d;
                Intrinsics.checkNotNull(wheelView5);
                wheelView5.setVisibility(0);
                WheelView wheelView6 = this.f8283e;
                Intrinsics.checkNotNull(wheelView6);
                wheelView6.setVisibility(0);
            }
        }
        WheelView wheelView7 = this.f8281c;
        Intrinsics.checkNotNull(wheelView7);
        wheelView7.addChangingListener(this);
        WheelView wheelView8 = this.f8282d;
        Intrinsics.checkNotNull(wheelView8);
        wheelView8.addChangingListener(this);
        WheelView wheelView9 = this.f8283e;
        Intrinsics.checkNotNull(wheelView9);
        wheelView9.addChangingListener(this);
        TextView textView8 = this.f8287i;
        Intrinsics.checkNotNull(textView8);
        textView8.setOnClickListener(new View.OnClickListener() { // from class: h4.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                C6487d.m7173h(this.f8277a, view8);
            }
        });
        TextView textView9 = this.f8285g;
        Intrinsics.checkNotNull(textView9);
        textView9.setOnClickListener(new View.OnClickListener() { // from class: h4.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view8) {
                C6487d.m7174i(this.f8278a, view8);
            }
        });
        m7180l();
        CityConfig cityConfig14 = this.f8290l;
        if (cityConfig14 != null) {
            Intrinsics.checkNotNull(cityConfig14);
            if (cityConfig14.isShowBackground()) {
                utils.setBackgroundAlpha(this.f8291m, 0.5f);
            }
        }
    }

    @Override // com.lljjcoder.style.citypickerview.widget.CanShow
    public void hide() {
        if (isShow()) {
            PopupWindow popupWindow = this.f8279a;
            Intrinsics.checkNotNull(popupWindow);
            popupWindow.dismiss();
        }
    }

    @Override // com.lljjcoder.style.citypickerview.widget.CanShow
    public boolean isShow() {
        PopupWindow popupWindow = this.f8279a;
        Intrinsics.checkNotNull(popupWindow);
        return popupWindow.isShowing();
    }

    /* renamed from: j */
    public final void m7178j(CityConfig cityConfig) {
        this.f8290l = cityConfig;
    }

    /* renamed from: k */
    public final void m7179k(OnCityItemClickListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f8288j = listener;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7180l() {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p071h4.C6487d.m7180l():void");
    }

    /* renamed from: m */
    public final void m7181m(View view) {
        m7177f();
        if (isShow()) {
            return;
        }
        PopupWindow popupWindow = this.f8279a;
        Intrinsics.checkNotNull(popupWindow);
        popupWindow.showAsDropDown(view, -AbstractC6531a.f8362a.m7297f(115.0f), 0, 80);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0135 A[Catch: Exception -> 0x003c, TryCatch #0 {Exception -> 0x003c, blocks: (B:2:0x0000, B:4:0x0014, B:7:0x0021, B:9:0x002e, B:14:0x003f, B:16:0x0079, B:19:0x00ac, B:21:0x00bd, B:23:0x00c3, B:25:0x00ca, B:30:0x00eb, B:32:0x00ff, B:34:0x010a, B:36:0x0141, B:40:0x0157, B:45:0x01b1, B:41:0x019b, B:43:0x01a9, B:35:0x0135, B:28:0x00e7), top: B:49:0x0000 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7182n() {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p071h4.C6487d.m7182n():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6 A[Catch: Exception -> 0x0088, TryCatch #0 {Exception -> 0x0088, blocks: (B:8:0x0013, B:11:0x0033, B:14:0x004a, B:16:0x005b, B:18:0x0061, B:20:0x0068, B:27:0x008c, B:29:0x00a0, B:31:0x00ab, B:33:0x00e2, B:35:0x00ec, B:37:0x00fd, B:36:0x00f5, B:32:0x00d6, B:23:0x0085), top: B:41:0x0013 }] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m7183o() {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p071h4.C6487d.m7183o():void");
    }

    @Override // com.lljjcoder.style.citypickerview.widget.wheel.OnWheelChangedListener
    public void onChanged(WheelView wheelView, int i6, int i7) {
        CityParseHelper cityParseHelper;
        if (wheelView == this.f8281c) {
            m7183o();
            return;
        }
        if (wheelView == this.f8282d) {
            m7182n();
            return;
        }
        if (wheelView != this.f8283e || (cityParseHelper = this.f8289k) == null) {
            return;
        }
        Intrinsics.checkNotNull(cityParseHelper);
        if (cityParseHelper.getCity_DisMap() != null) {
            CityParseHelper cityParseHelper2 = this.f8289k;
            Intrinsics.checkNotNull(cityParseHelper2);
            Map<String, List<DistrictBean>> city_DisMap = cityParseHelper2.getCity_DisMap();
            CityParseHelper cityParseHelper3 = this.f8289k;
            Intrinsics.checkNotNull(cityParseHelper3);
            String name = cityParseHelper3.getProvinceBean().getName();
            CityParseHelper cityParseHelper4 = this.f8289k;
            Intrinsics.checkNotNull(cityParseHelper4);
            List<DistrictBean> list = city_DisMap.get(name + cityParseHelper4.getCityBean().getName());
            Intrinsics.checkNotNull(list);
            DistrictBean districtBean = list.get(i7);
            CityParseHelper cityParseHelper5 = this.f8289k;
            Intrinsics.checkNotNull(cityParseHelper5);
            cityParseHelper5.setDistrictBean(districtBean);
        }
    }
}
