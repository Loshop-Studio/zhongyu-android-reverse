package com.blankj.utilcode.util;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class BusUtils$ThreadMode {
    public static final BusUtils$ThreadMode CACHED;
    public static final BusUtils$ThreadMode CPU;

    /* renamed from: IO */
    public static final BusUtils$ThreadMode f2104IO;
    public static final BusUtils$ThreadMode MAIN;
    public static final BusUtils$ThreadMode POSTING;
    public static final BusUtils$ThreadMode SINGLE;

    /* renamed from: a */
    public static final /* synthetic */ BusUtils$ThreadMode[] f2105a;

    static {
        BusUtils$ThreadMode busUtils$ThreadMode = new BusUtils$ThreadMode("MAIN", 0);
        MAIN = busUtils$ThreadMode;
        BusUtils$ThreadMode busUtils$ThreadMode2 = new BusUtils$ThreadMode("IO", 1);
        f2104IO = busUtils$ThreadMode2;
        BusUtils$ThreadMode busUtils$ThreadMode3 = new BusUtils$ThreadMode("CPU", 2);
        CPU = busUtils$ThreadMode3;
        BusUtils$ThreadMode busUtils$ThreadMode4 = new BusUtils$ThreadMode("CACHED", 3);
        CACHED = busUtils$ThreadMode4;
        BusUtils$ThreadMode busUtils$ThreadMode5 = new BusUtils$ThreadMode("SINGLE", 4);
        SINGLE = busUtils$ThreadMode5;
        BusUtils$ThreadMode busUtils$ThreadMode6 = new BusUtils$ThreadMode("POSTING", 5);
        POSTING = busUtils$ThreadMode6;
        f2105a = new BusUtils$ThreadMode[]{busUtils$ThreadMode, busUtils$ThreadMode2, busUtils$ThreadMode3, busUtils$ThreadMode4, busUtils$ThreadMode5, busUtils$ThreadMode6};
    }

    public static BusUtils$ThreadMode valueOf(String str) {
        return (BusUtils$ThreadMode) Enum.valueOf(BusUtils$ThreadMode.class, str);
    }

    public static BusUtils$ThreadMode[] values() {
        return (BusUtils$ThreadMode[]) f2105a.clone();
    }
}
