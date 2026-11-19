package com.zykj.study.bean;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9126n;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MenuBean {
    public static final int $stable = 8;
    private int mNormalIcon;
    private int mSelectIcon;
    private int mTitle;

    public MenuBean(int i10, int i11, @StringRes int i12) {
        this.mNormalIcon = i10;
        this.mSelectIcon = i11;
        this.mTitle = i12;
    }

    public static /* synthetic */ MenuBean copy$default(MenuBean menuBean, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = menuBean.mNormalIcon;
        }
        if ((i13 & 2) != 0) {
            i11 = menuBean.mSelectIcon;
        }
        if ((i13 & 4) != 0) {
            i12 = menuBean.mTitle;
        }
        return menuBean.copy(i10, i11, i12);
    }

    public final int component1() {
        return this.mNormalIcon;
    }

    public final int component2() {
        return this.mSelectIcon;
    }

    public final int component3() {
        return this.mTitle;
    }

    public final MenuBean copy(int i10, int i11, @StringRes int i12) {
        return new MenuBean(i10, i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MenuBean)) {
            return false;
        }
        MenuBean menuBean = (MenuBean) obj;
        return this.mNormalIcon == menuBean.mNormalIcon && this.mSelectIcon == menuBean.mSelectIcon && this.mTitle == menuBean.mTitle;
    }

    public final int getMNormalIcon() {
        return this.mNormalIcon;
    }

    public final int getMSelectIcon() {
        return this.mSelectIcon;
    }

    public final int getMTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.mNormalIcon) * 31) + Integer.hashCode(this.mSelectIcon)) * 31) + Integer.hashCode(this.mTitle);
    }

    public final void setMNormalIcon(int i10) {
        this.mNormalIcon = i10;
    }

    public final void setMSelectIcon(int i10) {
        this.mSelectIcon = i10;
    }

    public final void setMTitle(int i10) {
        this.mTitle = i10;
    }

    public String toString() {
        return "MenuBean(mNormalIcon=" + this.mNormalIcon + ", mSelectIcon=" + this.mSelectIcon + ", mTitle=" + this.mTitle + ")";
    }

    public /* synthetic */ MenuBean(int i10, int i11, int i12, int i13, AbstractC9126n abstractC9126n) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, i12);
    }
}
