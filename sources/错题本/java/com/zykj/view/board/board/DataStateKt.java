package com.zykj.view.board.board;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.view.board.board.BackgroundType;
import com.zykj.view.board.board.EraserType;
import com.zykj.view.board.board.PenColor;
import com.zykj.view.board.board.PenType;
import com.zykj.view.board.board.ZoomLevel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0004\"\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0004\"\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0004\"\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0004\"\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0004¨\u0006\u0013"}, m5110d2 = {"zoomLevelList", "", "Lcom/zykj/view/board/board/ZoomLevel;", "getZoomLevelList", "()Ljava/util/List;", "zoomLevelList5", "getZoomLevelList5", "penTypeList", "Lcom/zykj/view/board/board/PenType;", "getPenTypeList", "penColorList", "Lcom/zykj/view/board/board/PenColor;", "getPenColorList", "eraserTypeList", "Lcom/zykj/view/board/board/EraserType;", "getEraserTypeList", "backgroundTypeList", "Lcom/zykj/view/board/board/BackgroundType;", "getBackgroundTypeList", "view_release"}, m5111k = 2, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DataStateKt {

    @NotNull
    private static final List<BackgroundType> backgroundTypeList;

    @NotNull
    private static final List<EraserType> eraserTypeList;

    @NotNull
    private static final List<PenColor> penColorList;

    @NotNull
    private static final List<PenType> penTypeList;

    @NotNull
    private static final List<ZoomLevel> zoomLevelList;

    @NotNull
    private static final List<ZoomLevel> zoomLevelList5;

    static {
        ZoomLevel.Level0 level0 = ZoomLevel.Level0.INSTANCE;
        ZoomLevel.Level1 level1 = ZoomLevel.Level1.INSTANCE;
        ZoomLevel.Level2 level2 = ZoomLevel.Level2.INSTANCE;
        ZoomLevel.Level3 level3 = ZoomLevel.Level3.INSTANCE;
        ZoomLevel.Level4 level4 = ZoomLevel.Level4.INSTANCE;
        ZoomLevel.Level5 level5 = ZoomLevel.Level5.INSTANCE;
        ZoomLevel.Level6 level6 = ZoomLevel.Level6.INSTANCE;
        zoomLevelList = AbstractC5806u.m5287z(level0, level1, level2, level3, level4, level5, level6);
        zoomLevelList5 = AbstractC5806u.m5287z(ZoomLevel.LevelN2.INSTANCE, ZoomLevel.LevelN1.INSTANCE, level0, level1, level2, level3, level4, level5, level6, ZoomLevel.Level7.INSTANCE, ZoomLevel.Level8.INSTANCE);
        penTypeList = AbstractC5806u.m5287z(PenType.Custom.INSTANCE, PenType.Line.INSTANCE, PenType.DottedLine.INSTANCE, PenType.Highlighter.INSTANCE, PenType.Cursor.INSTANCE);
        penColorList = AbstractC5806u.m5287z(new PenColor.ColorCustom(0, 1, null), PenColor.ColorBlack.INSTANCE, PenColor.ColorWhite.INSTANCE, PenColor.ColorRed.INSTANCE);
        eraserTypeList = AbstractC5806u.m5287z(EraserType.Little.INSTANCE, EraserType.Middle.INSTANCE, EraserType.Large.INSTANCE);
        backgroundTypeList = AbstractC5806u.m5287z(BackgroundType.ColorWhite.INSTANCE, BackgroundType.ColorBlack.INSTANCE, BackgroundType.ColorBlue.INSTANCE, BackgroundType.ColorGreen.INSTANCE, BackgroundType.LineInterweave.INSTANCE, BackgroundType.LineHorizontal.INSTANCE);
    }

    @NotNull
    public static final List<BackgroundType> getBackgroundTypeList() {
        return backgroundTypeList;
    }

    @NotNull
    public static final List<EraserType> getEraserTypeList() {
        return eraserTypeList;
    }

    @NotNull
    public static final List<PenColor> getPenColorList() {
        return penColorList;
    }

    @NotNull
    public static final List<PenType> getPenTypeList() {
        return penTypeList;
    }

    @NotNull
    public static final List<ZoomLevel> getZoomLevelList() {
        return zoomLevelList;
    }

    @NotNull
    public static final List<ZoomLevel> getZoomLevelList5() {
        return zoomLevelList5;
    }
}
