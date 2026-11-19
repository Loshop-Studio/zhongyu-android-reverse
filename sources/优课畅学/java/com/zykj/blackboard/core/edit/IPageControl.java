package com.zykj.blackboard.core.edit;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.listener.EventListener;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.listener.MicroPhoneListener;
import com.zykj.blackboard.listener.RecordListener;
import com.zykj.blackboard.listener.WithdrawListener;
import com.zykj.board.EzyPositionEnum;
import com.zykj.board.EzyScaleTypeEnum;
import java.util.List;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public interface IPageControl {

    public static final class DefaultImpls {
        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            return iPageControl.addImage(str, positionEnum, scaleTypeEnum, z10);
        }

        public static /* synthetic */ TextGraph addText$default(IPageControl iPageControl, String str, EzyPositionEnum.PositionEnum positionEnum, int i10, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addText");
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return iPageControl.addText(str, positionEnum, i10);
        }

        public static /* synthetic */ void areaMoveEnd$default(IPageControl iPageControl, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoveEnd");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            iPageControl.areaMoveEnd(f10, f11);
        }

        public static /* synthetic */ void areaMoving$default(IPageControl iPageControl, Float f10, Float f11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: areaMoving");
            }
            if ((i10 & 1) != 0) {
                f10 = null;
            }
            if ((i10 & 2) != 0) {
                f11 = null;
            }
            iPageControl.areaMoving(f10, f11);
        }

        public static /* synthetic */ void cleanPage$default(IPageControl iPageControl, IGraph iGraph, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cleanPage");
            }
            if ((i10 & 1) != 0) {
                iGraph = null;
            }
            iPageControl.cleanPage(iGraph);
        }

        public static /* synthetic */ Bitmap minScreenshot$default(IPageControl iPageControl, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph, int i14, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: minScreenshot");
            }
            if ((i14 & 16) != 0) {
                z10 = false;
            }
            if ((i14 & 32) != 0) {
                z11 = false;
            }
            if ((i14 & 64) != 0) {
                z12 = false;
            }
            if ((i14 & 128) != 0) {
                iGraph = null;
            }
            return iPageControl.minScreenshot(i10, i11, i12, i13, z10, z11, z12, iGraph);
        }

        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, Bitmap bitmap, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 8) != 0) {
                z10 = false;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = true;
            }
            return iPageControl.addImage(bitmap, positionEnum, scaleTypeEnum, z12, z11);
        }

        public static /* synthetic */ ImageGraph addImage$default(IPageControl iPageControl, Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addImage");
            }
            if ((i10 & 16) != 0) {
                z10 = false;
            }
            boolean z12 = z10;
            if ((i10 & 32) != 0) {
                z11 = true;
            }
            return iPageControl.addImage(bitmap, str, positionEnum, scaleTypeEnum, z12, z11);
        }
    }

    void addEventListener(EventListener eventListener);

    void addGraphDeleteListener(GraphDeleteListener graphDeleteListener);

    ImageGraph addImage(Bitmap bitmap, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11);

    ImageGraph addImage(Bitmap bitmap, String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10, boolean z11);

    ImageGraph addImage(String str, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum, boolean z10);

    List<ImageGraph> addImageList(List<String> list, EzyPositionEnum.PositionEnum positionEnum, EzyScaleTypeEnum.ScaleTypeEnum scaleTypeEnum);

    void addRenderRectChangeListener(RenderChangeListener renderChangeListener);

    ImageGraph addSpecialImage(Bitmap bitmap);

    ImageGraph addSpecialImage(String str);

    TextGraph addText(String str, EzyPositionEnum.PositionEnum positionEnum, int i10);

    void addWithdrawListener(WithdrawListener withdrawListener);

    void areaMoveEnd(Float f10, Float f11);

    void areaMoveStart();

    void areaMoving(Float f10, Float f11);

    boolean canSave();

    void changeImageOriginRect(ImageGraph imageGraph, RectF rectF);

    boolean changeTextColor(int i10);

    boolean changeTextSize(float f10);

    void cleanPage(IGraph iGraph);

    void clearHistoryList();

    void clearHistoryListWithoutCurrent();

    int getBackgroundColor();

    BackgroundLineConfig getBackgroundLineConfig();

    IGraph getFirstGraph();

    int getGroupGraphSize();

    int getImageGraphCount();

    float getMoveHorizontalProgress();

    float getMoveVerticalProgress();

    List<String> getNoRecordImagePathList();

    List<String> getPageImagePathList();

    RectF getRenderRect();

    float getZoomLevel();

    boolean isMicroTurnOn();

    boolean isPageNotEmpty();

    boolean isRecording();

    Bitmap minScreenshot(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph);

    void newSelectGraph(List<String> list);

    void onTouchEvent(MotionEvent motionEvent);

    boolean recover();

    void removeEventListener(EventListener eventListener);

    void removeGraphDeleteListener(GraphDeleteListener graphDeleteListener);

    void removeRenderRectChangeListener(RenderChangeListener renderChangeListener);

    void removeWithdrawListener(WithdrawListener withdrawListener);

    void save();

    void saveWithContentThumbnail();

    Bitmap screenshot();

    void selectedGraph(String str);

    void setAreaMoveListener(IAreaMoveListener iAreaMoveListener);

    void setBackgroundColor(int i10);

    void setBackgroundColorWithLineConfig(int i10, BackgroundLineConfig backgroundLineConfig);

    void setGeometryCreateListener(InterfaceC10570l interfaceC10570l);

    void setMicroPhoneListener(MicroPhoneListener microPhoneListener);

    void setRecordListener(RecordListener recordListener);

    void setTextSelectListener(ITextSelectListener iTextSelectListener);

    void setVisibleAreaProgress(Float f10, Float f11);

    void startRecord(boolean z10);

    void stopRecord();

    void turnOffMicro();

    void turnOnMicro();

    boolean withdraw();

    void zoomLevel(float f10, float f11, float f12);
}
