package com.zykj.blackboard.bean;

import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.blackboard.core.action.GeometryActionEnum;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.listener.ImageCropView;
import com.zykj.blackboard.listener.TextEditView;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.board.EzyModeEnum;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes4.dex */
public final class BoardConfig {
    private Author author;
    private int backgroundColor;
    private final int height;
    private ImageCropView imageCropView;
    private boolean isDottedLine;
    private boolean isGroupGraphComplete;
    private boolean isImageBackground;
    private TextEditView textEditView;
    private final int width;
    private int maxImageSize = 3;
    private boolean isFingerDraw = true;
    private int paintColor = -16777216;
    private int beelinePaintColor = -16777216;
    private float beelinePaintWidth = 5.0f;
    private float paintWidth = 5.0f;
    private float eraserWidth = 40.0f;
    private float paintDottedLineItemLength = 30.0f;
    private float paintDottedLineSpacing = 15.0f;
    private EzyModeEnum.ModeEnum mode = EzyModeEnum.ModeEnum.ACTION_WRITING;
    private RectF addTextRectF = new RectF(0.0f, 0.0f, 400.0f, 100.0f);
    private String addTextOriginalText = "请输入文字";
    private float addTextOriginalTextSize = 28.0f;
    private float addTextOriginalTextMinSize = 20.0f;
    private float addTextOriginalTextMaxSize = 48.0f;
    private int addTextOriginalTextColor = -16777216;
    private final BackgroundLineConfig backgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
    private int cursorColor = SupportMenu.CATEGORY_MASK;
    private float cursorWidth = 20.0f;
    private float cursorOffset = 50.0f;
    private final MoveActionConfig moveActionConfig = new MoveActionConfig(false, false, false, false, false, 0, 0, 127, null);
    private float multiImageOffset = 50.0f;
    private List<? extends Graph> selectExcludeGraphList = AbstractC8809v.m14771n();
    private int backgroundColorOutside = -1;
    private final float selectButtonHeight = 60.0f;
    private float selectIconWidth = 36.0f;
    private List<Float> selectWriteLevel = AbstractC8809v.m14774q(Float.valueOf(3.0f), Float.valueOf(8.0f), Float.valueOf(15.0f));
    private List<Integer> selectNormalColor = AbstractC8809v.m14774q(-16777216, -1118482, -46799, -18386, -12531200, -13395457, -3782145, -43567);
    private List<Float> selectHighlighterLevel = AbstractC8809v.m14774q(Float.valueOf(28.0f), Float.valueOf(36.0f), Float.valueOf(56.0f));
    private float highlighterColorAlpha = 0.5f;
    private GeometryActionEnum geometryActionEnum = GeometryActionEnum.RECTANGLE;
    private float geometryStrokeWidth = 3.0f;
    private int geometryStrokeColor = -16777216;
    private float geometryMinSize = 36.0f;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BoardConfig(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public static /* synthetic */ void setDottedLine$default(BoardConfig boardConfig, boolean z10, float f10, float f11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 30.0f;
        }
        if ((i10 & 4) != 0) {
            f11 = 15.0f;
        }
        boardConfig.setDottedLine(z10, f10, f11);
    }

    public final String getAddTextOriginalText() {
        return this.addTextOriginalText;
    }

    public final int getAddTextOriginalTextColor() {
        return this.addTextOriginalTextColor;
    }

    public final float getAddTextOriginalTextMaxSize() {
        return this.addTextOriginalTextMaxSize;
    }

    public final float getAddTextOriginalTextMinSize() {
        return this.addTextOriginalTextMinSize;
    }

    public final float getAddTextOriginalTextSize() {
        return this.addTextOriginalTextSize;
    }

    public final RectF getAddTextRectF() {
        return this.addTextRectF;
    }

    public final Author getAuthor() {
        return this.author;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBackgroundColorOutside() {
        return this.backgroundColorOutside;
    }

    public final BackgroundLineConfig getBackgroundLineConfig() {
        return this.backgroundLineConfig;
    }

    public final int getBeelinePaintColor() {
        return this.beelinePaintColor;
    }

    public final float getBeelinePaintWidth() {
        return this.beelinePaintWidth;
    }

    public final int getCursorColor() {
        return this.cursorColor;
    }

    public final float getCursorOffset() {
        return this.cursorOffset;
    }

    public final float getCursorWidth() {
        return this.cursorWidth;
    }

    public final float getEraserWidth() {
        return this.eraserWidth;
    }

    public final GeometryActionEnum getGeometryActionEnum() {
        return this.geometryActionEnum;
    }

    public final float getGeometryMinSize() {
        return this.geometryMinSize;
    }

    public final int getGeometryStrokeColor() {
        return this.geometryStrokeColor;
    }

    public final float getGeometryStrokeWidth() {
        return this.geometryStrokeWidth;
    }

    public final int getHeight() {
        return this.height;
    }

    public final float getHighlighterColorAlpha() {
        return this.highlighterColorAlpha;
    }

    public final ImageCropView getImageCropView() {
        return this.imageCropView;
    }

    public final int getMaxImageSize() {
        return this.maxImageSize;
    }

    public final EzyModeEnum.ModeEnum getMode() {
        return this.mode;
    }

    public final MoveActionConfig getMoveActionConfig() {
        return this.moveActionConfig;
    }

    public final float getMultiImageOffset() {
        return this.multiImageOffset;
    }

    public final int getPaintColor() {
        return this.paintColor;
    }

    public final float getPaintDottedLineItemLength() {
        return this.paintDottedLineItemLength;
    }

    public final float getPaintDottedLineSpacing() {
        return this.paintDottedLineSpacing;
    }

    public final float getPaintWidth() {
        return this.paintWidth;
    }

    public final float getSelectButtonHeight() {
        return this.selectButtonHeight;
    }

    public final List<Graph> getSelectExcludeGraphList() {
        return this.selectExcludeGraphList;
    }

    public final List<Float> getSelectHighlighterLevel() {
        return this.selectHighlighterLevel;
    }

    public final float getSelectIconWidth() {
        return this.selectIconWidth;
    }

    public final List<Integer> getSelectNormalColor() {
        return this.selectNormalColor;
    }

    public final List<Float> getSelectWriteLevel() {
        return this.selectWriteLevel;
    }

    public final TextEditView getTextEditView() {
        return this.textEditView;
    }

    public final int getWidth() {
        return this.width;
    }

    public final boolean isDottedLine() {
        return this.isDottedLine;
    }

    public final boolean isFingerDraw() {
        return this.isFingerDraw;
    }

    public final boolean isGroupGraphComplete() {
        return this.isGroupGraphComplete;
    }

    public final boolean isImageBackground() {
        return this.isImageBackground;
    }

    public final void setAddTextOriginalText(String str) {
        AbstractC9133u.m16133g(str, "<set-?>");
        this.addTextOriginalText = str;
    }

    public final void setAddTextOriginalTextColor(int i10) {
        this.addTextOriginalTextColor = i10;
    }

    public final void setAddTextOriginalTextMaxSize(float f10) {
        this.addTextOriginalTextMaxSize = f10;
    }

    public final void setAddTextOriginalTextMinSize(float f10) {
        this.addTextOriginalTextMinSize = f10;
    }

    public final void setAddTextOriginalTextSize(float f10) {
        this.addTextOriginalTextSize = f10;
    }

    public final void setAddTextRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "<set-?>");
        this.addTextRectF = rectF;
    }

    public final void setAuthor(Author author) {
        this.author = author;
    }

    public final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    public final void setBackgroundColorOutside(int i10) {
        this.backgroundColorOutside = i10;
    }

    public final void setBeelinePaintColor(int i10) {
        this.beelinePaintColor = i10;
    }

    public final void setBeelinePaintWidth(float f10) {
        this.beelinePaintWidth = f10;
    }

    public final void setCursorColor(int i10) {
        this.cursorColor = i10;
    }

    public final void setCursorOffset(float f10) {
        this.cursorOffset = f10;
    }

    public final void setCursorWidth(float f10) {
        this.cursorWidth = f10;
    }

    public final void setDottedLine(boolean z10, float f10, float f11) {
        if (this.isDottedLine != z10) {
            EventBus.INSTANCE.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isDottedLine = z10;
        this.paintDottedLineItemLength = f10;
        this.paintDottedLineSpacing = f11;
    }

    public final void setEraserWidth(float f10) {
        this.eraserWidth = f10;
    }

    public final void setFingerDraw(boolean z10) {
        if (this.isFingerDraw != z10) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.isFingerDraw = z10;
    }

    public final void setGeometryActionEnum(GeometryActionEnum geometryActionEnum) {
        AbstractC9133u.m16133g(geometryActionEnum, "<set-?>");
        this.geometryActionEnum = geometryActionEnum;
    }

    public final void setGeometryMinSize(float f10) {
        this.geometryMinSize = f10;
    }

    public final void setGeometryStrokeColor(int i10) {
        this.geometryStrokeColor = i10;
    }

    public final void setGeometryStrokeWidth(float f10) {
        this.geometryStrokeWidth = f10;
    }

    public final void setGroupGraphComplete(boolean z10) {
        this.isGroupGraphComplete = z10;
    }

    public final void setHighlighterColorAlpha(float f10) {
        this.highlighterColorAlpha = f10;
    }

    public final void setImageBackground(boolean z10) {
        this.isImageBackground = z10;
    }

    public final void setImageCropView(ImageCropView imageCropView) {
        this.imageCropView = imageCropView;
    }

    public final void setMaxImageSize(int i10) {
        this.maxImageSize = i10;
    }

    public final void setMode(EzyModeEnum.ModeEnum mode) {
        AbstractC9133u.m16133g(mode, "mode");
        int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
        if (i10 == 1) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
            eventBus.post(EventKey.WRITE_NEW_GROUP);
        } else if (i10 != 2) {
            if (i10 == 3) {
                EventBus eventBus2 = EventBus.INSTANCE;
                eventBus2.post(EventKey.DELETE_ACTION);
                eventBus2.post(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 4) {
                EventBus eventBus3 = EventBus.INSTANCE;
                eventBus3.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                eventBus3.post(EventKey.WRITE_NEW_GROUP);
            } else if (i10 == 5) {
                EventBus.INSTANCE.post(EventKey.WRITE_NEW_GROUP);
            }
        } else if (this.mode != mode) {
            EventBus.INSTANCE.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.mode = mode;
    }

    public final void setMultiImageOffset(float f10) {
        this.multiImageOffset = f10;
    }

    public final void setPaintColor(int i10) {
        if (i10 != this.paintColor) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintColor = i10;
    }

    public final void setPaintWidth(float f10) {
        if (f10 != this.paintWidth) {
            EventBus eventBus = EventBus.INSTANCE;
            eventBus.post(EventKey.WRITE_NEW_GROUP);
            eventBus.post(EventKey.WRITE_BEELINE_NEW_GROUP);
        }
        this.paintWidth = f10;
    }

    public final void setSelectExcludeGraphList(List<? extends Graph> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.selectExcludeGraphList = list;
    }

    public final void setSelectHighlighterLevel(List<Float> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.selectHighlighterLevel = list;
    }

    public final void setSelectIconWidth(float f10) {
        this.selectIconWidth = f10;
    }

    public final void setSelectNormalColor(List<Integer> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.selectNormalColor = list;
    }

    public final void setSelectWriteLevel(List<Float> list) {
        AbstractC9133u.m16133g(list, "<set-?>");
        this.selectWriteLevel = list;
    }

    public final void setTextEditView(TextEditView textEditView) {
        this.textEditView = textEditView;
    }
}
