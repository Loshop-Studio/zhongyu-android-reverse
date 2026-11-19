package com.zykj.mistake.feature.home;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.enums.AbstractC5817a;
import org.jetbrains.annotations.NotNull;
import p092j6.InterfaceC5748a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m5110d2 = {"Lcom/zykj/mistake/feature/home/HomeTab;", "", "", "index", "I", "getIndex", "()I", "Companion", "com/zykj/mistake/feature/home/l", "REVIEW", "MISTAKE_NOTEBOOK", "MISTAKE_COLLECTION", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class HomeTab {

    @NotNull
    public static final C4739l Companion;
    public static final HomeTab MISTAKE_COLLECTION;
    public static final HomeTab MISTAKE_NOTEBOOK;
    public static final HomeTab REVIEW;

    /* renamed from: a */
    public static final /* synthetic */ HomeTab[] f6808a;

    /* renamed from: b */
    public static final /* synthetic */ InterfaceC5748a f6809b;
    private final int index;

    static {
        HomeTab homeTab = new HomeTab("REVIEW", 0, 0);
        REVIEW = homeTab;
        HomeTab homeTab2 = new HomeTab("MISTAKE_NOTEBOOK", 1, 1);
        MISTAKE_NOTEBOOK = homeTab2;
        HomeTab homeTab3 = new HomeTab("MISTAKE_COLLECTION", 2, 2);
        MISTAKE_COLLECTION = homeTab3;
        HomeTab[] homeTabArr = {homeTab, homeTab2, homeTab3};
        f6808a = homeTabArr;
        f6809b = AbstractC5817a.m5310a(homeTabArr);
        Companion = new C4739l();
    }

    public HomeTab(String str, int i, int i8) {
        this.index = i8;
    }

    @NotNull
    public static InterfaceC5748a getEntries() {
        return f6809b;
    }

    public static HomeTab valueOf(String str) {
        return (HomeTab) Enum.valueOf(HomeTab.class, str);
    }

    public static HomeTab[] values() {
        return (HomeTab[]) f6808a.clone();
    }

    public final int getIndex() {
        return this.index;
    }
}
