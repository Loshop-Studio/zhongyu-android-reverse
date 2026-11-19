package com.xuexiang.xui.utils;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.C0589c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.XUI;
import com.xuexiang.xui.adapter.recyclerview.DividerItemDecoration;
import com.xuexiang.xui.adapter.recyclerview.GridDividerItemDecoration;
import com.xuexiang.xui.adapter.recyclerview.XGridLayoutManager;
import com.xuexiang.xui.adapter.recyclerview.XLinearLayoutManager;
import com.xuexiang.xui.widget.dialog.LoadingDialog;
import com.xuexiang.xui.widget.dialog.MiniLoadingDialog;
import com.xuexiang.xui.widget.progress.loading.IMessageLoader;
import com.xuexiang.xui.widget.progress.loading.LoadingViewLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class WidgetUtils {
    private WidgetUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static TabLayout.Tab addTabWithoutRipple(TabLayout tabLayout, CharSequence charSequence, int i4) {
        TabLayout.Tab tabNewTab = tabLayout.newTab();
        tabNewTab.setText(charSequence);
        tabNewTab.setIcon(i4);
        tabNewTab.view.setBackgroundColor(0);
        tabLayout.addTab(tabNewTab);
        return tabNewTab;
    }

    public static void clearActivityBackground(Activity activity) {
        if (activity == null) {
            return;
        }
        clearWindowBackground(activity.getWindow());
    }

    public static void clearAllViewBackground(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                clearAllViewBackground(viewGroup.getChildAt(i4));
            }
        }
        view.setBackgroundColor(0);
    }

    public static void clearViewBackground(View view) {
        if (view == null) {
            return;
        }
        view.setBackgroundColor(0);
    }

    public static void clearWindowBackground(Window window) {
        if (window == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public static Activity findActivity(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return findActivity(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static Bundle getChangePayload(List<Object> list) {
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof Bundle) {
                    return (Bundle) obj;
                }
            }
        }
        return null;
    }

    public static LoadingDialog getLoadingDialog(Context context) {
        return new LoadingDialog(context);
    }

    public static IMessageLoader getMessageLoader(boolean z3, Context context) {
        return z3 ? new LoadingDialog(context) : new LoadingViewLayout(context);
    }

    public static MiniLoadingDialog getMiniLoadingDialog(Context context) {
        return new MiniLoadingDialog(context);
    }

    public static void initGridRecyclerView(RecyclerView recyclerView, int i4) {
        recyclerView.setLayoutManager(new XGridLayoutManager(recyclerView.getContext(), i4));
        recyclerView.addItemDecoration(new GridDividerItemDecoration(recyclerView.getContext(), i4));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initRecyclerView(RecyclerView recyclerView) {
        recyclerView.setLayoutManager(new XLinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initSpinnerItem(Spinner spinner, String[] strArr) {
        ArrayAdapter arrayAdapter = new ArrayAdapter(spinner.getContext(), C2042R.layout.xui_layout_spinner_selected_item, C2042R.id.spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(C2042R.layout.xui_layout_spinner_drop_down_item);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
    }

    public static void initSpinnerStyle(Spinner spinner, String[] strArr) {
        initSpinnerStyle(spinner);
        initSpinnerItem(spinner, strArr);
    }

    public static void requestFullScreen(Activity activity) {
        activity.requestWindowFeature(1);
        activity.getWindow().setFlags(1024, 1024);
    }

    public static void setSpinnerDropDownVerticalOffset(Spinner spinner) {
        spinner.setDropDownVerticalOffset(ThemeUtils.resolveDimension(spinner.getContext(), C2042R.attr.ms_item_height_size) + ThemeUtils.resolveDimension(spinner.getContext(), C2042R.attr.ms_dropdown_offset));
    }

    public static void setTabLayoutTextFont(TabLayout tabLayout) {
        setTabLayoutTextFont(tabLayout, XUI.getDefaultTypeface());
    }

    public static void transparentBottomSheetDialogBackground(BottomSheetDialog bottomSheetDialog) {
        FrameLayout frameLayout;
        if (bottomSheetDialog == null || bottomSheetDialog.getWindow() == null || (frameLayout = (FrameLayout) bottomSheetDialog.getWindow().findViewById(C2042R.id.design_bottom_sheet)) == null) {
            return;
        }
        frameLayout.setBackgroundColor(0);
    }

    public static LoadingDialog updateLoadingMessage(LoadingDialog loadingDialog, Context context, String str) {
        if (loadingDialog == null) {
            loadingDialog = getLoadingDialog(context);
        }
        loadingDialog.updateMessage(str);
        loadingDialog.show();
        return loadingDialog;
    }

    public static LoadingDialog getLoadingDialog(Context context, String str) {
        return new LoadingDialog(context, str);
    }

    public static MiniLoadingDialog getMiniLoadingDialog(Context context, String str) {
        return new MiniLoadingDialog(context, str);
    }

    public static void setTabLayoutTextFont(TabLayout tabLayout, Typeface typeface) {
        if (tabLayout == null || typeface == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) tabLayout.getChildAt(0);
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(i4);
            int childCount2 = viewGroup2.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt = viewGroup2.getChildAt(i5);
                if (childAt instanceof TextView) {
                    ((TextView) childAt).setTypeface(typeface);
                }
            }
        }
    }

    public static void initSpinnerStyle(Spinner spinner) {
        spinner.setBackground(ResUtils.getDrawable(spinner.getContext(), C2042R.drawable.xui_config_bg_spinner));
        ViewUtils.setPaddingEnd(spinner, ResUtils.getDimensionPixelSize(C2042R.dimen.default_spinner_icon_padding_size));
        spinner.setPopupBackgroundDrawable(ResUtils.getDrawable(spinner.getContext(), C2042R.drawable.ms_drop_down_bg_radius));
        setSpinnerDropDownVerticalOffset(spinner);
    }

    public static void initGridRecyclerView(RecyclerView recyclerView, int i4, int i5) {
        recyclerView.setLayoutManager(new XGridLayoutManager(recyclerView.getContext(), i4));
        recyclerView.addItemDecoration(new GridDividerItemDecoration(recyclerView.getContext(), i4, i5));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initRecyclerView(RecyclerView recyclerView, int i4) {
        recyclerView.setLayoutManager(new XLinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1, i4));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static TabLayout.Tab addTabWithoutRipple(TabLayout tabLayout, CharSequence charSequence, Drawable drawable) {
        TabLayout.Tab tabNewTab = tabLayout.newTab();
        tabNewTab.setText(charSequence);
        tabNewTab.setIcon(drawable);
        tabNewTab.view.setBackgroundColor(0);
        tabLayout.addTab(tabNewTab);
        return tabNewTab;
    }

    public static void initGridRecyclerView(RecyclerView recyclerView, int i4, int i5, int i6) {
        recyclerView.setLayoutManager(new XGridLayoutManager(recyclerView.getContext(), i4));
        recyclerView.addItemDecoration(new GridDividerItemDecoration(recyclerView.getContext(), i4, i5, i6));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initRecyclerView(RecyclerView recyclerView, int i4, int i5) {
        recyclerView.setLayoutManager(new XLinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1, i4, i5));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initGridRecyclerView(RecyclerView recyclerView, boolean z3, int i4, int i5, int i6) {
        recyclerView.setLayoutManager(new XGridLayoutManager(recyclerView.getContext(), i4).setScrollEnabled(z3));
        recyclerView.addItemDecoration(new GridDividerItemDecoration(recyclerView.getContext(), i4, i5, i6));
        recyclerView.setItemAnimator(new C0589c());
    }

    public static void initRecyclerView(RecyclerView recyclerView, boolean z3, int i4, int i5) {
        recyclerView.setLayoutManager(new XLinearLayoutManager(recyclerView.getContext()).setScrollEnabled(z3));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1, i4, i5));
        recyclerView.setItemAnimator(new C0589c());
    }
}
