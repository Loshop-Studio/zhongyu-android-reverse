package com.gyf.immersionbar;

/* loaded from: classes5.dex */
public class BarProperties {
    private int actionBarHeight;
    private boolean hasNavigationBar;
    private boolean landscapeLeft;
    private boolean landscapeRight;
    private int navigationBarHeight;
    private int navigationBarWidth;
    private int notchHeight;
    private boolean notchScreen;
    private boolean portrait;
    private int statusBarHeight;

    public int getActionBarHeight() {
        return this.actionBarHeight;
    }

    public int getNavigationBarHeight() {
        return this.navigationBarHeight;
    }

    public int getNavigationBarWidth() {
        return this.navigationBarWidth;
    }

    public int getNotchHeight() {
        return this.notchHeight;
    }

    public int getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public boolean hasNavigationBar() {
        return this.hasNavigationBar;
    }

    public boolean isLandscapeLeft() {
        return this.landscapeLeft;
    }

    public boolean isLandscapeRight() {
        return this.landscapeRight;
    }

    public boolean isNotchScreen() {
        return this.notchScreen;
    }

    public boolean isPortrait() {
        return this.portrait;
    }

    public void setActionBarHeight(int i10) {
        this.actionBarHeight = i10;
    }

    public void setLandscapeLeft(boolean z10) {
        this.landscapeLeft = z10;
    }

    public void setLandscapeRight(boolean z10) {
        this.landscapeRight = z10;
    }

    public void setNavigationBar(boolean z10) {
        this.hasNavigationBar = z10;
    }

    public void setNavigationBarHeight(int i10) {
        this.navigationBarHeight = i10;
    }

    public void setNavigationBarWidth(int i10) {
        this.navigationBarWidth = i10;
    }

    public void setNotchHeight(int i10) {
        this.notchHeight = i10;
    }

    public void setNotchScreen(boolean z10) {
        this.notchScreen = z10;
    }

    public void setPortrait(boolean z10) {
        this.portrait = z10;
    }

    public void setStatusBarHeight(int i10) {
        this.statusBarHeight = i10;
    }
}
