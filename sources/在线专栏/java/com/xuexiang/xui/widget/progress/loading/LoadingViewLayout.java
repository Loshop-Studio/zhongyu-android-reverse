package com.xuexiang.xui.widget.progress.loading;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ResUtils;
import com.xuexiang.xui.utils.ThemeUtils;

/* loaded from: classes.dex */
public class LoadingViewLayout extends LinearLayout implements IMessageLoader {
    private ARCLoadingView mLoadingView;
    private TextView mTvTipMessage;

    public LoadingViewLayout(Context context) {
        super(context);
        initView(context);
        initAttrs(context, null);
    }

    private void initAttrs(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042R.styleable.LoadingViewLayout);
            String string = typedArrayObtainStyledAttributes.getString(C2042R.styleable.LoadingViewLayout_lvl_message);
            if (!TextUtils.isEmpty(string)) {
                updateMessage(string);
            }
            setLoadingIcon(ResUtils.getDrawableAttrRes(getContext(), typedArrayObtainStyledAttributes, C2042R.styleable.LoadingViewLayout_lvl_icon));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void initLayoutStyle(Context context) {
        setOrientation(1);
        setGravity(17);
        setVisibility(8);
        int iResolveDimension = ThemeUtils.resolveDimension(context, C2042R.attr.xui_dialog_loading_padding_size);
        setPadding(iResolveDimension, iResolveDimension, iResolveDimension, iResolveDimension);
        int iResolveDimension2 = ThemeUtils.resolveDimension(context, C2042R.attr.xui_dialog_loading_min_size);
        setMinimumHeight(iResolveDimension2);
        setMinimumWidth(iResolveDimension2);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(C2042R.layout.xui_layout_loading_view, (ViewGroup) this, true);
        this.mLoadingView = (ARCLoadingView) findViewById(C2042R.id.arc_loading_view);
        this.mTvTipMessage = (TextView) findViewById(C2042R.id.tv_tip_message);
        initLayoutStyle(context);
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void dismiss() {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.stop();
        }
        setVisibility(8);
    }

    public Drawable getDrawable(int i4) {
        return ResUtils.getDrawable(getContext(), i4);
    }

    public String getString(int i4) {
        return getContext().getResources().getString(i4);
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public boolean isLoading() {
        return getVisibility() == 0;
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void recycle() {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.recycle();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setCancelable(boolean z3) {
    }

    public LoadingViewLayout setIconScale(float f4) {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.setIconScale(f4);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void setLoadingCancelListener(LoadingCancelListener loadingCancelListener) {
    }

    public LoadingViewLayout setLoadingIcon(Drawable drawable) {
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.setLoadingIcon(drawable);
        }
        return this;
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void show() {
        setVisibility(0);
        ARCLoadingView aRCLoadingView = this.mLoadingView;
        if (aRCLoadingView != null) {
            aRCLoadingView.start();
        }
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void updateMessage(String str) {
        if (this.mTvTipMessage != null) {
            if (TextUtils.isEmpty(str)) {
                this.mTvTipMessage.setText("");
                this.mTvTipMessage.setVisibility(8);
            } else {
                this.mTvTipMessage.setText(str);
                this.mTvTipMessage.setVisibility(0);
            }
        }
    }

    public LoadingViewLayout setLoadingIcon(int i4) {
        return setLoadingIcon(getDrawable(i4));
    }

    public LoadingViewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initView(context);
        initAttrs(context, attributeSet);
    }

    public LoadingViewLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        initView(context);
        initAttrs(context, attributeSet);
    }

    @Override // com.xuexiang.xui.widget.progress.loading.IMessageLoader
    public void updateMessage(int i4) {
        updateMessage(getString(i4));
    }
}
