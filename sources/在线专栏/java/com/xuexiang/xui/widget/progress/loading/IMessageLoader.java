package com.xuexiang.xui.widget.progress.loading;

/* loaded from: classes.dex */
public interface IMessageLoader {
    void dismiss();

    boolean isLoading();

    void recycle();

    void setCancelable(boolean z3);

    void setLoadingCancelListener(LoadingCancelListener loadingCancelListener);

    void show();

    void updateMessage(int i4);

    void updateMessage(String str);
}
