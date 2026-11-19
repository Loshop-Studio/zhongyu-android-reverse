package com.zykj.base.bean;

import androidx.annotation.Keep;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Keep
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m13413d2 = {"Lcom/zykj/base/bean/FragmentBean;", "", "title", "", "fragment", "Landroidx/fragment/app/Fragment;", "(Ljava/lang/String;Landroidx/fragment/app/Fragment;)V", "getFragment", "()Landroidx/fragment/app/Fragment;", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, m13414k = 1, m13415mv = {1, 5, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final /* data */ class FragmentBean {
    private final Fragment fragment;
    private final String title;

    public FragmentBean(String title, Fragment fragment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.title = title;
        this.fragment = fragment;
    }

    public static /* synthetic */ FragmentBean copy$default(FragmentBean fragmentBean, String str, Fragment fragment, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = fragmentBean.title;
        }
        if ((i9 & 2) != 0) {
            fragment = fragmentBean.fragment;
        }
        return fragmentBean.copy(str, fragment);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final Fragment getFragment() {
        return this.fragment;
    }

    public final FragmentBean copy(String title, Fragment fragment) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new FragmentBean(title, fragment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentBean)) {
            return false;
        }
        FragmentBean fragmentBean = (FragmentBean) other;
        return Intrinsics.areEqual(this.title, fragmentBean.title) && Intrinsics.areEqual(this.fragment, fragmentBean.fragment);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.fragment.hashCode();
    }

    public String toString() {
        return "FragmentBean(title=" + this.title + ", fragment=" + this.fragment + ')';
    }
}
