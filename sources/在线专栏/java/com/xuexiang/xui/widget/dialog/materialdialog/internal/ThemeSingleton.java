package com.xuexiang.xui.widget.dialog.materialdialog.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import com.xuexiang.xui.widget.dialog.materialdialog.GravityEnum;

/* loaded from: classes.dex */
public class ThemeSingleton {
    private static ThemeSingleton singleton;
    public GravityEnum btnStackedGravity;
    public GravityEnum buttonsGravity;
    public GravityEnum contentGravity;
    public GravityEnum itemsGravity;
    public GravityEnum titleGravity;
    public boolean darkTheme = false;
    public int titleColor = 0;
    public int contentColor = 0;
    public ColorStateList positiveColor = null;
    public ColorStateList neutralColor = null;
    public ColorStateList negativeColor = null;
    public int widgetColor = 0;
    public int itemColor = 0;
    public Drawable icon = null;
    public int backgroundColor = 0;
    public int dividerColor = 0;
    public ColorStateList linkColor = null;
    public int listSelector = 0;
    public int btnSelectorStacked = 0;
    public int btnSelectorPositive = 0;
    public int btnSelectorNeutral = 0;
    public int btnSelectorNegative = 0;

    public ThemeSingleton() {
        GravityEnum gravityEnum = GravityEnum.START;
        this.titleGravity = gravityEnum;
        this.contentGravity = gravityEnum;
        this.btnStackedGravity = GravityEnum.END;
        this.itemsGravity = gravityEnum;
        this.buttonsGravity = gravityEnum;
    }

    public static ThemeSingleton get(boolean z3) {
        if (singleton == null && z3) {
            singleton = new ThemeSingleton();
        }
        return singleton;
    }

    public static ThemeSingleton get() {
        return get(true);
    }
}
