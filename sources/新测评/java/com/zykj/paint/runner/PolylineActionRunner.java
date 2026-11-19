package com.zykj.paint.runner;

import android.graphics.Color;
import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.paint.Actions;
import com.zykj.paint.data.Vector2D;
import com.zykj.paint.graphic.Graph;
import com.zykj.paint.graphic.PolyLine;
import com.zykj.paint.render.MapViewer;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class PolylineActionRunner extends ActionRunner {
    private static final long FRAME_TIME = 40;
    private boolean isImmediate;
    private ScheduledFuture<?> schedule;
    private ScheduledExecutorService taskScheduledExecutorService;

    public class TaskRunnable implements Runnable {
        Actions.EzyAction ezyAction;

        public TaskRunnable(Actions.EzyAction ezyAction) {
            this.ezyAction = ezyAction;
        }

        @Override // java.lang.Runnable
        public void run() throws InterruptedException {
            try {
                int duration = this.ezyAction.getDuration();
                Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) this.ezyAction.getData().unpack(Actions.NewPolylineData.class);
                Log.e("ActionRunner", "[run ezyAction]-->" + this.ezyAction.getGraphId());
                List<Actions.EzyPoint> pointsList = newPolylineData.getPointsList();
                int size = duration / pointsList.size();
                PolylineActionRunner.this.mapViewer.getWidth();
                PolylineActionRunner.this.mapViewer.getHeight();
                PolyLine polyLine = new PolyLine(PolylineActionRunner.this.map);
                Actions.EzyColor color = newPolylineData.getColor();
                polyLine.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
                polyLine.width = newPolylineData.getWidth();
                polyLine.graphId = this.ezyAction.getGraphId();
                int stickyGraphId = newPolylineData.getStickyGraphId();
                if (stickyGraphId != 0) {
                    Graph graphFindGraph = PolylineActionRunner.this.map.currentLayer.findGraph(stickyGraphId);
                    graphFindGraph.addGraph(polyLine);
                    Log.e("ActionRunner", "[graph.graphs.size()]-->" + graphFindGraph.graphs.size());
                } else {
                    PolylineActionRunner.this.map.currentLayer.graphList.add(polyLine);
                }
                int i10 = 0;
                for (int i11 = 0; i11 < pointsList.size(); i11++) {
                    Actions.EzyPoint ezyPoint = pointsList.get(i11);
                    double d10 = 1.0f;
                    polyLine.pointList.add(new Vector2D(ezyPoint.getX() * d10, ezyPoint.getY() * d10));
                    if ((i11 - i10) * size >= 40) {
                        PolylineActionRunner.this.mapViewer.directRenderAll();
                        i10 = i11;
                    } else if (i11 == pointsList.size() - 1) {
                        PolylineActionRunner.this.mapViewer.directRenderAll();
                    }
                    Thread.sleep(size);
                }
            } catch (InvalidProtocolBufferException e10) {
                e10.printStackTrace();
            } catch (InterruptedException e11) {
                e11.printStackTrace();
            }
        }
    }

    public PolylineActionRunner(MapViewer mapViewer) {
        super(mapViewer);
    }

    private void processPreActions(Actions.EzyAction ezyAction) {
        try {
            Actions.NewPolylineData newPolylineData = (Actions.NewPolylineData) ezyAction.getData().unpack(Actions.NewPolylineData.class);
            List<Actions.EzyPoint> pointsList = newPolylineData.getPointsList();
            this.mapViewer.getWidth();
            this.mapViewer.getHeight();
            PolyLine polyLine = new PolyLine(this.map);
            Actions.EzyColor color = newPolylineData.getColor();
            polyLine.setBaseColor(Color.argb(color.getAlpha(), color.getRed(), color.getGreen(), color.getBlue()));
            polyLine.width = newPolylineData.getWidth();
            polyLine.graphId = ezyAction.getGraphId();
            Log.e("ActionRunner", "[add id]-->" + polyLine.graphId);
            int stickyGraphId = newPolylineData.getStickyGraphId();
            if (stickyGraphId != 0) {
                this.map.currentLayer.findGraph(stickyGraphId).addGraph(polyLine);
            } else {
                this.map.currentLayer.graphList.add(polyLine);
            }
            for (int i10 = 0; i10 < pointsList.size(); i10++) {
                Actions.EzyPoint ezyPoint = pointsList.get(i10);
                double d10 = 1.0f;
                polyLine.pointList.add(new Vector2D(ezyPoint.getX() * d10, ezyPoint.getY() * d10));
            }
            this.mapViewer.directRenderAll();
        } catch (InvalidProtocolBufferException e10) {
            e10.printStackTrace();
        }
    }

    public ScheduledExecutorService getTaskScheduledExecutorService() {
        return this.taskScheduledExecutorService;
    }

    public boolean isImmediate() {
        return this.isImmediate;
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void pause() {
        ScheduledFuture<?> scheduledFuture = this.schedule;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void resume() {
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void run(Actions.EzyAction ezyAction) {
        if (this.isImmediate) {
            processPreActions(ezyAction);
        } else {
            this.schedule = this.taskScheduledExecutorService.schedule(new TaskRunnable(ezyAction), 0L, TimeUnit.SECONDS);
        }
    }

    public void setImmediate(boolean z9) {
        this.isImmediate = z9;
    }

    public void setTaskScheduledExecutorService(ScheduledExecutorService scheduledExecutorService) {
        this.taskScheduledExecutorService = scheduledExecutorService;
    }

    @Override // com.zykj.paint.runner.ActionRunner
    public void stop() {
        ScheduledExecutorService scheduledExecutorService = this.taskScheduledExecutorService;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }
}
