package com.xuexiang.xui.widget.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.WidgetUtils;
import com.xuexiang.xui.widget.banner.anim.select.ZoomInEnter;
import com.xuexiang.xui.widget.banner.transform.DepthTransformer;
import com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BaseGuideActivity extends AppCompatActivity {
    protected abstract List<Object> getGuideResourceList();

    protected abstract Class<? extends Activity> getSkipClass();

    public void initGuideView(List<Object> list, Class<?> cls) throws Resources.NotFoundException {
        initGuideView(list, DepthTransformer.class, cls);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        WidgetUtils.requestFullScreen(this);
        setContentView(C2042R.layout.xui_activity_guide);
        initGuideView(getGuideResourceList(), getSkipClass());
        onCreateActivity();
    }

    protected void onCreateActivity() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initGuideView(List<Object> list, Class<? extends ViewPager.InterfaceC0780j> cls, final Class<?> cls2) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(C2042R.id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.setIndicatorWidth(6.0f).setIndicatorHeight(6.0f).setIndicatorGap(12.0f).setIndicatorCornerRadius(3.5f).setSelectAnimClass(ZoomInEnter.class).setTransformerClass(cls)).barPadding(IGoodView.DEFAULT_TO_ALPHA, 10.0f, IGoodView.DEFAULT_TO_ALPHA, 10.0f)).setSource(list)).startScroll();
        simpleGuideBanner.setOnJumpClickListener(new SimpleGuideBanner.OnJumpClickListener() { // from class: com.xuexiang.xui.widget.activity.BaseGuideActivity.1
            @Override // com.xuexiang.xui.widget.banner.widget.banner.SimpleGuideBanner.OnJumpClickListener
            public void onJumpClick() {
                BaseGuideActivity.this.startActivity(new Intent(BaseGuideActivity.this, (Class<?>) cls2));
                BaseGuideActivity.this.finish();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initGuideView(List<Object> list, Class<? extends ViewPager.InterfaceC0780j> cls, SimpleGuideBanner.OnJumpClickListener onJumpClickListener) throws Resources.NotFoundException {
        SimpleGuideBanner simpleGuideBanner = (SimpleGuideBanner) findViewById(C2042R.id.sgb);
        ((SimpleGuideBanner) ((SimpleGuideBanner) ((SimpleGuideBanner) simpleGuideBanner.setIndicatorWidth(6.0f).setIndicatorHeight(6.0f).setIndicatorGap(12.0f).setIndicatorCornerRadius(3.5f).setSelectAnimClass(ZoomInEnter.class).setTransformerClass(cls)).barPadding(IGoodView.DEFAULT_TO_ALPHA, 10.0f, IGoodView.DEFAULT_TO_ALPHA, 10.0f)).setSource(list)).startScroll();
        simpleGuideBanner.setOnJumpClickListener(onJumpClickListener);
    }
}
