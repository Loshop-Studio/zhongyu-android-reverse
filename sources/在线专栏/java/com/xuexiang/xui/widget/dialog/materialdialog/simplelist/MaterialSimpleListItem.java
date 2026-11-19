package com.xuexiang.xui.widget.dialog.materialdialog.simplelist;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.content.C0332a;
import com.xuexiang.xui.C2042R;
import com.xuexiang.xui.utils.ThemeUtils;

/* loaded from: classes.dex */
public class MaterialSimpleListItem {
    private final Builder builder;

    public static class Builder {
        int backgroundColor = Color.parseColor("#00000000");
        protected CharSequence content;
        private final Context context;
        protected Drawable icon;
        int iconPadding;

        /* renamed from: id */
        protected long f9689id;
        Object tag;

        public Builder(Context context) {
            this.context = context;
            iconPadding(ThemeUtils.resolveDimension(context, C2042R.attr.md_simplelist_icon_padding));
        }

        public Builder backgroundColor(int i4) {
            this.backgroundColor = i4;
            return this;
        }

        public Builder backgroundColorAttr(int i4) {
            return backgroundColor(ThemeUtils.resolveColor(this.context, i4));
        }

        public Builder backgroundColorRes(int i4) {
            return backgroundColor(ThemeUtils.getColor(this.context, i4));
        }

        public MaterialSimpleListItem build() {
            return new MaterialSimpleListItem(this);
        }

        public Builder content(CharSequence charSequence) {
            this.content = charSequence;
            return this;
        }

        public Builder icon(Drawable drawable) {
            this.icon = drawable;
            return this;
        }

        public Builder iconPadding(int i4) {
            this.iconPadding = i4;
            return this;
        }

        public Builder iconPaddingDp(int i4) {
            this.iconPadding = (int) TypedValue.applyDimension(1, i4, this.context.getResources().getDisplayMetrics());
            return this;
        }

        public Builder iconPaddingRes(int i4) {
            return iconPadding(this.context.getResources().getDimensionPixelSize(i4));
        }

        /* renamed from: id */
        public Builder m7968id(long j4) {
            this.f9689id = j4;
            return this;
        }

        public Builder tag(Object obj) {
            this.tag = obj;
            return this;
        }

        public Builder content(int i4) {
            return content(this.context.getString(i4));
        }

        public Builder icon(int i4) {
            return icon(C0332a.m1806d(this.context, i4));
        }
    }

    public int getBackgroundColor() {
        return this.builder.backgroundColor;
    }

    public CharSequence getContent() {
        return this.builder.content;
    }

    public Drawable getIcon() {
        return this.builder.icon;
    }

    public int getIconPadding() {
        return this.builder.iconPadding;
    }

    public long getId() {
        return this.builder.f9689id;
    }

    public Object getTag() {
        return this.builder.tag;
    }

    public String toString() {
        return getContent() != null ? getContent().toString() : "(no content)";
    }

    private MaterialSimpleListItem(Builder builder) {
        this.builder = builder;
    }
}
