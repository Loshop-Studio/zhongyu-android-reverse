package com.xuexiang.xui.widget.statelayout;

import android.view.View;
import java.io.Serializable;

/* loaded from: classes.dex */
public class CustomStateOptions implements Serializable {
    private View.OnClickListener buttonClickListener;
    private String buttonText;
    private int imageRes;
    private boolean isLoading;
    private String message;

    public CustomStateOptions buttonClickListener(View.OnClickListener onClickListener) {
        this.buttonClickListener = onClickListener;
        return this;
    }

    public CustomStateOptions buttonText(String str) {
        this.buttonText = str;
        return this;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public View.OnClickListener getClickListener() {
        return this.buttonClickListener;
    }

    public int getImageRes() {
        return this.imageRes;
    }

    public String getMessage() {
        return this.message;
    }

    public CustomStateOptions image(int i4) {
        this.imageRes = i4;
        return this;
    }

    public boolean isLoading() {
        return this.isLoading;
    }

    public CustomStateOptions loading() {
        this.isLoading = true;
        return this;
    }

    public CustomStateOptions message(String str) {
        this.message = str;
        return this;
    }
}
