package io.microshow.rxffmpeg.player;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class MeasureHelper$FitModel {
    public static final MeasureHelper$FitModel FM_DEFAULT;
    public static final MeasureHelper$FitModel FM_FULL_SCREEN_HEIGHT;
    public static final MeasureHelper$FitModel FM_FULL_SCREEN_WIDTH;
    public static final MeasureHelper$FitModel FM_WH_16X9;

    /* renamed from: a */
    public static final /* synthetic */ MeasureHelper$FitModel[] f8872a;

    static {
        MeasureHelper$FitModel measureHelper$FitModel = new MeasureHelper$FitModel("FM_DEFAULT", 0);
        FM_DEFAULT = measureHelper$FitModel;
        MeasureHelper$FitModel measureHelper$FitModel2 = new MeasureHelper$FitModel("FM_FULL_SCREEN_WIDTH", 1);
        FM_FULL_SCREEN_WIDTH = measureHelper$FitModel2;
        MeasureHelper$FitModel measureHelper$FitModel3 = new MeasureHelper$FitModel("FM_FULL_SCREEN_HEIGHT", 2);
        FM_FULL_SCREEN_HEIGHT = measureHelper$FitModel3;
        MeasureHelper$FitModel measureHelper$FitModel4 = new MeasureHelper$FitModel("FM_WH_16X9", 3);
        FM_WH_16X9 = measureHelper$FitModel4;
        f8872a = new MeasureHelper$FitModel[]{measureHelper$FitModel, measureHelper$FitModel2, measureHelper$FitModel3, measureHelper$FitModel4};
    }

    public static MeasureHelper$FitModel valueOf(String str) {
        return (MeasureHelper$FitModel) Enum.valueOf(MeasureHelper$FitModel.class, str);
    }

    public static MeasureHelper$FitModel[] values() {
        return (MeasureHelper$FitModel[]) f8872a.clone();
    }
}
