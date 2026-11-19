package com.zykj.paint.runner;

// RE note 本类字节码直接引用的读写或显示接口包括文件流。

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.material3.AbstractC1923c;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.exchange.ActionType;
import com.zykj.paint.graphic.Layer;
import com.zykj.paint.graphic.Map;
import com.zykj.paint.graphic.PolyLine;
import com.zykj.paint.graphic.RectBmp;
import com.zykj.paint.render.SketchViewer;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class ActionProcessor {
    private static final long DELAY_TIME = 500;
    private static final long FRAME_TIME = 40;
    private static final String TAG = "ActionProcessor";
    private boolean isRunning;
    private Map map;
    ScheduledFuture<?> schedule;
    private SketchViewer sketchViewer;
    private String sourceUrl;
    private ScheduledExecutorService taskScheduledExecutorService = Executors.newScheduledThreadPool(1);

    public class ActionRunnable implements Runnable {
        Actions.EzyAction ezyAction;

        public ActionRunnable(Actions.EzyAction ezyAction) {
            this.ezyAction = ezyAction;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionProcessor.this.isRunning) {
                this.ezyAction.getStartAt();
                String typeUrl = this.ezyAction.getData().getTypeUrl();
                int actionType = this.ezyAction.getActionType();
                int graphId = this.ezyAction.getGraphId();
                Log.i(ActionProcessor.TAG, "名称为[" + typeUrl + "] actionType=[" + actionType + "]id=[" + graphId + "]");
                if (actionType == ActionType.ClearMap) {
                    ActionProcessor.this.map.getCurrentLayer().graphList.clear();
                    ActionProcessor.this.sketchViewer.renderAll();
                    return;
                }
                if (actionType == ActionType.ImageDel || actionType == ActionType.LayerDel || actionType == ActionType.PolylineDel || actionType == ActionType.ImageHide || actionType == ActionType.LayerHide || actionType == ActionType.PolylineHide) {
                    ActionProcessor.this.map.hide(graphId);
                    ActionProcessor.this.sketchViewer.renderAll();
                    return;
                }
                if (TextUtils.isEmpty(typeUrl)) {
                    return;
                }
                String str = typeUrl.split("/")[1];
                if (str.equals("NewPolylineData")) {
                    ActionProcessor.this.renderRunningPolyLine(this.ezyAction);
                    return;
                }
                if (str.equals("NewLayerData")) {
                    ActionProcessor.this.renderLayer(this.ezyAction);
                    ActionProcessor.this.sketchViewer.renderAll();
                } else if (str.equals("NewImageData")) {
                    ActionProcessor.this.renderImage(this.ezyAction);
                    ActionProcessor.this.sketchViewer.renderAll();
                } else if (str.equals("EzyMatrixData")) {
                    ActionProcessor.this.renderMatrix(this.ezyAction);
                    ActionProcessor.this.sketchViewer.renderAll();
                }
            }
        }
    }

    public class TaskRunnable implements Runnable {
        Actions.EzyAction ezyAction;

        public TaskRunnable(Actions.EzyAction ezyAction) {
            this.ezyAction = ezyAction;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionProcessor.this.isRunning) {
                try {
                    int duration = this.ezyAction.getDuration();
                    Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) this.ezyAction.getData().unpack(Actions.NewPolylineData.class);
                    List<Actions.EzyPoint> pointsList = newPolylineData.getPointsList();
                    int size = duration / pointsList.size();
                    PolyLine polyLine = new PolyLine(ActionProcessor.this.map);
                    Actions.EzyColor color = newPolylineData.getColor();
                    polyLine.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
                    polyLine.width = newPolylineData.getWidth();
                    polyLine.graphId = this.ezyAction.getGraphId();
                    int stickyGraphId = newPolylineData.getStickyGraphId();
                    if (stickyGraphId != 0) {
                        ActionProcessor.this.map.currentLayer.findGraph(stickyGraphId).addGraph(polyLine);
                    } else {
                        ActionProcessor.this.map.currentLayer.graphList.add(polyLine);
                    }
                    int i = 0;
                    for (int i8 = 0; i8 < pointsList.size(); i8++) {
                        Actions.EzyPoint ezyPoint = pointsList.get(i8);
                        double d9 = 1.0f;
                        polyLine.pointList.add(new Vector2D(ezyPoint.getX() * d9, ezyPoint.getY() * d9));
                        if ((i8 - i) * size >= 40) {
                            ActionProcessor.this.sketchViewer.renderAll();
                            i = i8;
                        } else if (i8 == pointsList.size() - 1) {
                            ActionProcessor.this.sketchViewer.renderAll();
                        }
                    }
                } catch (InvalidProtocolBufferException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public ActionProcessor(SketchViewer sketchViewer, Map map) {
        this.sketchViewer = sketchViewer;
        this.map = map;
    }

    public void addAction(Actions.EzyAction ezyAction, boolean z8) {
        ezyAction.getStartAt();
        String typeUrl = ezyAction.getData().getTypeUrl();
        int actionType = ezyAction.getActionType();
        int graphId = ezyAction.getGraphId();
        Log.i(TAG, "名称为[" + typeUrl + "] actionType=[" + actionType + "]id=[" + graphId + "]");
        if (actionType == ActionType.ClearMap) {
            this.map.getCurrentLayer().graphList.clear();
            this.sketchViewer.renderAll();
            return;
        }
        if (actionType == ActionType.ImageDel || actionType == ActionType.LayerDel || actionType == ActionType.PolylineDel || actionType == ActionType.ImageHide || actionType == ActionType.LayerHide || actionType == ActionType.PolylineHide) {
            this.map.hide(graphId);
            this.sketchViewer.renderAll();
            return;
        }
        if (TextUtils.isEmpty(typeUrl)) {
            return;
        }
        String str = typeUrl.split("/")[1];
        if (str.equals("NewPolylineData")) {
            if (!z8) {
                this.schedule = this.taskScheduledExecutorService.schedule(new TaskRunnable(ezyAction), 0L, TimeUnit.SECONDS);
                return;
            } else {
                renderPolyLine(ezyAction);
                this.sketchViewer.renderAll();
                return;
            }
        }
        if (str.equals("NewLayerData")) {
            renderLayer(ezyAction);
            this.sketchViewer.renderAll();
        } else if (str.equals("NewImageData")) {
            renderImage(ezyAction);
            this.sketchViewer.renderAll();
        } else if (str.equals("EzyMatrixData")) {
            renderMatrix(ezyAction);
            this.sketchViewer.renderAll();
        }
    }

    public ScheduledFuture<?> addMultiAction(Actions.EzyAction ezyAction) {
        ScheduledFuture<?> scheduledFutureSchedule = this.taskScheduledExecutorService.schedule(new ActionRunnable(ezyAction), 0L, TimeUnit.SECONDS);
        this.schedule = scheduledFutureSchedule;
        return scheduledFutureSchedule;
    }

    public void destroy() {
        this.isRunning = false;
        ScheduledExecutorService scheduledExecutorService = this.taskScheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public void pause() {
        this.isRunning = false;
        ScheduledFuture<?> scheduledFuture = this.schedule;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public void renderAction(List<Actions.EzyAction> list) {
        for (Actions.EzyAction ezyAction : list) {
            if (!this.isRunning) {
                return;
            }
            ezyAction.getStartAt();
            String typeUrl = ezyAction.getData().getTypeUrl();
            int actionType = ezyAction.getActionType();
            int graphId = ezyAction.getGraphId();
            Log.i(TAG, "名称为[" + typeUrl + "] actionType=[" + actionType + "]id=[" + graphId + "]");
            if (actionType == ActionType.ClearMap) {
                this.map.getCurrentLayer().graphList.clear();
            } else if (actionType == ActionType.ImageDel || actionType == ActionType.LayerDel || actionType == ActionType.PolylineDel || actionType == ActionType.ImageHide || actionType == ActionType.LayerHide || actionType == ActionType.PolylineHide) {
                this.map.hide(graphId);
            } else if (!TextUtils.isEmpty(typeUrl)) {
                String str = typeUrl.split("/")[1];
                if (str.equals("NewPolylineData")) {
                    renderRunningPolyLine(ezyAction);
                } else if (str.equals("NewLayerData")) {
                    renderLayer(ezyAction);
                } else if (str.equals("NewImageData")) {
                    renderImage(ezyAction);
                } else if (str.equals("EzyMatrixData")) {
                    renderMatrix(ezyAction);
                }
            }
        }
        this.sketchViewer.renderAll();
    }

    public void renderHistory(List<Actions.EzyAction> list) {
        for (Actions.EzyAction ezyAction : list) {
            ezyAction.getStartAt();
            String typeUrl = ezyAction.getData().getTypeUrl();
            int actionType = ezyAction.getActionType();
            int graphId = ezyAction.getGraphId();
            Log.i(TAG, "名称为[" + typeUrl + "] actionType=[" + actionType + "]id=[" + graphId + "]");
            if (actionType == ActionType.ClearMap) {
                this.map.getCurrentLayer().graphList.clear();
            } else if (actionType == ActionType.ImageDel || actionType == ActionType.LayerDel || actionType == ActionType.PolylineDel || actionType == ActionType.ImageHide || actionType == ActionType.LayerHide || actionType == ActionType.PolylineHide) {
                this.map.hide(graphId);
            } else if (!TextUtils.isEmpty(typeUrl)) {
                String str = typeUrl.split("/")[1];
                if (str.equals("NewPolylineData")) {
                    renderPolyLine(ezyAction);
                } else if (str.equals("NewLayerData")) {
                    renderLayer(ezyAction);
                } else if (str.equals("NewImageData")) {
                    renderImage(ezyAction);
                } else if (str.equals("EzyMatrixData")) {
                    renderMatrix(ezyAction);
                }
            }
        }
        this.sketchViewer.renderHistorySnapshot();
    }

    public void renderImage(Actions.EzyAction ezyAction) {
        Actions.NewImageData newImageData;
        try {
            newImageData = (Actions.NewImageData) ezyAction.getData().unpack(Actions.NewImageData.class);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            newImageData = null;
        }
        if (ezyAction.getActionType() == ActionType.ImageNew) {
            newImageData.getPoint();
            Actions.EzySize size = newImageData.getSize();
            String src = newImageData.getSrc();
            try {
                RectBmp rectBmp = new RectBmp(this.map, BitmapFactory.decodeStream(new FileInputStream(this.sourceUrl + "/res/" + src)));
                rectBmp.graphId = ezyAction.getGraphId();
                rectBmp.setFilePath(src);
                int width = this.sketchViewer.getWidth();
                int height = this.sketchViewer.getHeight();
                Log.e(TAG, "add image--->" + rectBmp.graphId);
                float f = (float) width;
                float f7 = (float) height;
                rectBmp.setVector2D(new Vector2D(AbstractC1923c.m1037a(size.getWidth(), 1.0f, f, 2.0f), AbstractC1923c.m1037a(size.getHeight(), 1.0f, f7, 2.0f)));
                rectBmp.setDstVector(new Vector2D(((size.getWidth() * 1.0f) + f) / 2.0f, ((size.getHeight() * 1.0f) + f7) / 2.0f));
                this.map.getCurrentLayer().graphList.add(rectBmp);
            } catch (FileNotFoundException e4) {
                e4.printStackTrace();
            }
        }
    }

    public void renderLayer(Actions.EzyAction ezyAction) {
        Actions.NewLayerData newLayerData;
        try {
            newLayerData = (Actions.NewLayerData) ezyAction.getData().unpack(Actions.NewLayerData.class);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
            newLayerData = null;
        }
        if (ezyAction.getActionType() == ActionType.LayerNew) {
            Layer layer = new Layer();
            Actions.EzyColor color = newLayerData.getColor();
            layer.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
            this.map.addLayer(layer);
        }
    }

    public void renderMatrix(Actions.EzyAction ezyAction) {
        int graphId = ezyAction.getGraphId();
        try {
            List<Float> valuesList = ((Actions.EzyMatrixData) ezyAction.getData().unpack(Actions.EzyMatrixData.class)).getValuesList();
            float[] fArr = new float[9];
            for (int i = 0; i < valuesList.size(); i++) {
                fArr[i] = valuesList.get(i).floatValue();
            }
            if (graphId == 0) {
                Log.i(TAG, "地图移动--->>>" + Arrays.toString(fArr));
                this.map.setMatrix(fArr);
                return;
            }
            if (graphId == -1) {
                Log.i(TAG, "地图移动 结束--->>>");
                this.map.updateMatrix();
            } else {
                RectBmp rectBmp = (RectBmp) this.map.getCurrentLayer().findGraph(graphId);
                if (rectBmp != null) {
                    rectBmp.graphMatrix.setValues(fArr);
                }
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    public void renderPolyLine(Actions.EzyAction ezyAction) {
        try {
            Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) ezyAction.getData().unpack(Actions.NewPolylineData.class);
            List<Actions.EzyPoint> pointsList = newPolylineData.getPointsList();
            PolyLine polyLine = new PolyLine(this.map);
            Actions.EzyColor color = newPolylineData.getColor();
            polyLine.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
            polyLine.width = newPolylineData.getWidth();
            polyLine.graphId = ezyAction.getGraphId();
            Log.e(TAG, "[add id]-->" + polyLine.graphId);
            int stickyGraphId = newPolylineData.getStickyGraphId();
            if (stickyGraphId != 0) {
                this.map.currentLayer.findGraph(stickyGraphId).addGraph(polyLine);
            } else {
                this.map.currentLayer.graphList.add(polyLine);
            }
            for (int i = 0; i < pointsList.size(); i++) {
                Actions.EzyPoint ezyPoint = pointsList.get(i);
                polyLine.pointList.add(new Vector2D(ezyPoint.getX(), ezyPoint.getY()));
            }
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    public void renderRunningPolyLine(Actions.EzyAction ezyAction) {
        try {
            int duration = ezyAction.getDuration();
            Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) ezyAction.getData().unpack(Actions.NewPolylineData.class);
            List<Actions.EzyPoint> pointsList = newPolylineData.getPointsList();
            int size = duration / pointsList.size();
            PolyLine polyLine = new PolyLine(this.map);
            Actions.EzyColor color = newPolylineData.getColor();
            polyLine.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
            polyLine.width = newPolylineData.getWidth();
            polyLine.graphId = ezyAction.getGraphId();
            int stickyGraphId = newPolylineData.getStickyGraphId();
            if (stickyGraphId != 0) {
                this.map.currentLayer.findGraph(stickyGraphId).addGraph(polyLine);
            } else {
                this.map.currentLayer.graphList.add(polyLine);
            }
            int i = 0;
            for (int i8 = 0; i8 < pointsList.size(); i8++) {
                Actions.EzyPoint ezyPoint = pointsList.get(i8);
                double d9 = 1.0f;
                polyLine.pointList.add(new Vector2D(ezyPoint.getX() * d9, ezyPoint.getY() * d9));
                if ((i8 - i) * size >= 40) {
                    this.sketchViewer.renderAll();
                    i = i8;
                } else if (i8 == pointsList.size() - 1) {
                    this.sketchViewer.renderAll();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resume() {
        this.isRunning = true;
    }

    public void setSourceUrl(String str) {
        this.sourceUrl = str;
        this.isRunning = true;
    }
}
