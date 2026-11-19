package com.xuexiang.xui.widget.actionbar;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;

/* loaded from: classes.dex */
public final class TitleUtils {
    private TitleUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static TitleBar addTitleBarDynamic(final Activity activity, String str) {
        TitleBar titleBarInitTitleBarDynamic = initTitleBarDynamic(activity, str, new View.OnClickListener() { // from class: com.xuexiang.xui.widget.actionbar.TitleUtils.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                activity.finish();
            }
        });
        getRootView(activity).addView(titleBarInitTitleBarDynamic, 0);
        return titleBarInitTitleBarDynamic;
    }

    public static ViewGroup getRootView(Activity activity) {
        return (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
    }

    public static TitleBar initTitleBar(final Activity activity, int i4, String str) {
        TitleBar titleBar = (TitleBar) activity.findViewById(i4);
        initTitleBarStyle(titleBar, str, new View.OnClickListener() { // from class: com.xuexiang.xui.widget.actionbar.TitleUtils.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                activity.finish();
            }
        });
        return titleBar;
    }

    public static TitleBar initTitleBarDynamic(final Fragment fragment, String str) {
        return initTitleBarDynamic(fragment.getContext(), str, new View.OnClickListener() { // from class: com.xuexiang.xui.widget.actionbar.TitleUtils.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
                    return;
                }
                fragment.getActivity().finish();
            }
        });
    }

    public static TitleBar initTitleBarStyle(TitleBar titleBar, String str, View.OnClickListener onClickListener) {
        return initTitleBarStyle(titleBar, str).setLeftClickListener(onClickListener);
    }

    public static TitleBar initTitleBarDynamic(Context context, String str, View.OnClickListener onClickListener) {
        TitleBar titleBar = new TitleBar(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        titleBar.setLayoutParams(layoutParams);
        initTitleBarStyle(titleBar, str, onClickListener);
        return titleBar;
    }

    public static TitleBar initTitleBarStyle(TitleBar titleBar, String str) {
        titleBar.setLeftImageDrawable(ThemeUtils.resolveDrawable(titleBar.getContext(), C2042R.attr.xui_actionbar_ic_navigation_back)).setTitle(str);
        return titleBar;
    }

    public static TitleBar addTitleBarDynamic(ViewGroup viewGroup, String str, View.OnClickListener onClickListener) {
        TitleBar titleBarInitTitleBarDynamic = initTitleBarDynamic(viewGroup.getContext(), str, onClickListener);
        viewGroup.addView(titleBarInitTitleBarDynamic, 0);
        return titleBarInitTitleBarDynamic;
    }

    public static TitleBar initTitleBar(ViewGroup viewGroup, int i4, String str, View.OnClickListener onClickListener) {
        TitleBar titleBar = (TitleBar) viewGroup.findViewById(i4);
        initTitleBarStyle(titleBar, str, onClickListener);
        return titleBar;
    }

    public static TitleBar addTitleBarDynamic(Fragment fragment, ViewGroup viewGroup, String str) {
        TitleBar titleBarInitTitleBarDynamic = initTitleBarDynamic(fragment, str);
        viewGroup.addView(titleBarInitTitleBarDynamic, 0);
        return titleBarInitTitleBarDynamic;
    }
}
