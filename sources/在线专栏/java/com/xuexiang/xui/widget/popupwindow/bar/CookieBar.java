package com.xuexiang.xui.widget.popupwindow.bar;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class CookieBar {
    private WeakReference<Activity> mActivityWeakRef;
    private Cookie mCookieView;

    public static class Builder {
        public Activity context;
        private Params params = new Params();

        public Builder(Activity activity) {
            this.context = activity;
        }

        public CookieBar create() {
            return new CookieBar(this.context, this.params);
        }

        public Builder setAction(String str, View.OnClickListener onClickListener) {
            Params params = this.params;
            params.action = str;
            params.onActionClickListener = onClickListener;
            return this;
        }

        public Builder setActionColor(int i4) {
            this.params.actionColor = i4;
            return this;
        }

        public Builder setActionWithIcon(int i4, View.OnClickListener onClickListener) {
            Params params = this.params;
            params.actionIcon = i4;
            params.onActionClickListener = onClickListener;
            return this;
        }

        public Builder setBackgroundColor(int i4) {
            this.params.backgroundColor = i4;
            return this;
        }

        public Builder setDuration(long j4) {
            this.params.duration = j4;
            return this;
        }

        public Builder setIcon(int i4) {
            this.params.iconResId = i4;
            return this;
        }

        public Builder setLayoutGravity(int i4) {
            this.params.layoutGravity = i4;
            return this;
        }

        public Builder setMessage(String str) {
            this.params.message = str;
            return this;
        }

        public Builder setMessageColor(int i4) {
            this.params.messageColor = i4;
            return this;
        }

        public Builder setTitle(String str) {
            this.params.title = str;
            return this;
        }

        public Builder setTitleColor(int i4) {
            this.params.titleColor = i4;
            return this;
        }

        public CookieBar show() {
            CookieBar cookieBarCreate = create();
            cookieBarCreate.show();
            return cookieBarCreate;
        }

        public Builder setMessage(int i4) {
            this.params.message = this.context.getString(i4);
            return this;
        }

        public Builder setTitle(int i4) {
            this.params.title = this.context.getString(i4);
            return this;
        }

        public Builder setAction(int i4, View.OnClickListener onClickListener) {
            this.params.action = this.context.getString(i4);
            this.params.onActionClickListener = onClickListener;
            return this;
        }
    }

    static final class Params {
        public String action;
        public int actionColor;
        public int actionIcon;
        public int backgroundColor;
        public int iconResId;
        public String message;
        public int messageColor;
        public View.OnClickListener onActionClickListener;
        public String title;
        public int titleColor;
        public long duration = Cookie.DEFAULT_COOKIE_DURATION;
        public int layoutGravity = 48;

        Params() {
        }
    }

    public static Builder builder(Activity activity) {
        return new Builder(activity);
    }

    public void dismiss() {
        Cookie cookie = this.mCookieView;
        if (cookie != null) {
            cookie.dismiss();
        }
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivityWeakRef;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.mActivityWeakRef.get();
    }

    public void show() {
        if (this.mCookieView == null || getActivity() == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getActivity().getWindow().getDecorView();
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.content);
        if (this.mCookieView.getParent() == null) {
            if (this.mCookieView.getLayoutGravity() == 80) {
                viewGroup2.addView(this.mCookieView);
            } else {
                viewGroup.addView(this.mCookieView);
            }
        }
    }

    private CookieBar() {
    }

    private CookieBar(Activity activity, Params params) {
        this.mActivityWeakRef = new WeakReference<>(activity);
        Cookie cookie = new Cookie(getActivity());
        this.mCookieView = cookie;
        cookie.setParams(params);
    }
}
