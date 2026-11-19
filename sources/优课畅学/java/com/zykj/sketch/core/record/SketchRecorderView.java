package com.zykj.sketch.core.record;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.zykj.sketch.C7471R;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.config.GraphConfig;
import com.zykj.sketch.core.config.SketchConfig;
import com.zykj.sketch.core.data.Mode;
import com.zykj.sketch.core.data.ThumbnailBean;
import com.zykj.sketch.core.listener.ActionChangeListener;
import com.zykj.sketch.core.listener.AudioOperation;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import com.zykj.sketch.core.listener.NextPrevListener;
import com.zykj.sketch.core.listener.ProgressListener;
import com.zykj.sketch.exception.EmptyDataException;
import com.zykj.sketch.exception.HighVersionException;
import com.zykj.sketch.exception.LowVersionException;
import com.zykj.sketch.utils.FileUtils;
import com.zykj.sketch.widgets.DrawTempView;
import com.zykj.sketch.widgets.TextureDrawView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class SketchRecorderView extends RelativeLayout implements GraphOperation, AudioOperation {
    public static final Companion Companion = new Companion(null);
    public static final float ZOOM_IN_X = 1.2f;
    public static final float ZOOM_IN_Y = 1.2f;
    public static final float ZOOM_OUT_X = 0.8f;
    public static final float ZOOM_OUT_Y = 0.8f;
    public Map<Integer, View> _$_findViewCache;
    private boolean acceptTouchEvent;
    private boolean isLoading;
    private boolean isReady;
    private final TextureDrawView mDrawView;
    private final DrawTempView mTempDrawView;
    private RecordControl recordControl;
    private SketchConfig sketchConfig;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            iArr[Mode.ACTION_SELECT.ordinal()] = 1;
            iArr[Mode.ACTION_WRITING.ordinal()] = 2;
            iArr[Mode.ACTION_WRITING_MOVE.ordinal()] = 3;
            iArr[Mode.ACTION_SHAPE_RECT.ordinal()] = 4;
            iArr[Mode.ACTION_SHAPE_CIRCLE.ordinal()] = 5;
            iArr[Mode.ACTION_ERASER_VIEW.ordinal()] = 6;
            iArr[Mode.ACTION_ERASER_WRITING.ordinal()] = 7;
            iArr[Mode.ACTION_DELETE.ordinal()] = 8;
            iArr[Mode.ACTION_WRITING_MOVE_VERTICAL.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SketchRecorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        DrawTempView drawTempView = new DrawTempView(context, attributeSet);
        this.mTempDrawView = drawTempView;
        TextureDrawView textureDrawView = new TextureDrawView(context, attributeSet);
        this.mDrawView = textureDrawView;
        this.acceptTouchEvent = true;
        this.sketchConfig = new SketchConfig.Builder().build(context);
        setKeepScreenOn(true);
        addView(textureDrawView);
        addView(drawTempView);
        this.recordControl = new RecordControl(this, this.sketchConfig, textureDrawView, drawTempView);
        post(new Runnable() { // from class: com.zykj.sketch.core.record.c
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m27537_init_$lambda0(this.f10681a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m27537_init_$lambda0(SketchRecorderView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        this$0.isReady = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: initConfig$lambda-2$lambda-1, reason: not valid java name */
    public static final void m27538initConfig$lambda2$lambda1(SketchRecorderView this$0, String it, SketchConfig config, InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(it, "$it");
        AbstractC9133u.m16133g(config, "$config");
        AbstractC9133u.m16133g(callBack, "$callBack");
        if (FileUtils.Companion.copyFolder(this$0.sketchConfig.getSourcePath(), it)) {
            this$0.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.TRUE);
        } else {
            this$0.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12, reason: not valid java name */
    public static final void m27539loadData$lambda12(final SketchRecorderView this$0, final String path, final InterfaceC10570l finish, final InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(finish, "$finish");
        new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.e
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m27540loadData$lambda12$lambda11(this.f10686a, path, finish, interfaceC10559a);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11, reason: not valid java name */
    public static final void m27540loadData$lambda12$lambda11(final SketchRecorderView this$0, String path, InterfaceC10570l finish, final InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(this$0, "this$0");
        AbstractC9133u.m16133g(path, "$path");
        AbstractC9133u.m16133g(finish, "$finish");
        try {
            RecordControl.loadData$default(this$0.recordControl, path, null, new SketchRecorderView$loadData$1$1$1(this$0, finish), 2, null);
        } catch (EmptyDataException unused) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.i
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m27541loadData$lambda12$lambda11$lambda10(interfaceC10559a, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (HighVersionException unused2) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.g
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m27543loadData$lambda12$lambda11$lambda6(interfaceC10559a, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (LowVersionException unused3) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.f
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m27542loadData$lambda12$lambda11$lambda4(interfaceC10559a, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        } catch (FileNotFoundException unused4) {
            this$0.post(new Runnable() { // from class: com.zykj.sketch.core.record.h
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m27544loadData$lambda12$lambda11$lambda8(interfaceC10559a, this$0);
                }
            });
            this$0.isReady = true;
            this$0.isLoading = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-10, reason: not valid java name */
    public static final void m27541loadData$lambda12$lambda11$lambda10(InterfaceC10559a interfaceC10559a, SketchRecorderView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_file_not_found), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-4, reason: not valid java name */
    public static final void m27542loadData$lambda12$lambda11$lambda4(InterfaceC10559a interfaceC10559a, SketchRecorderView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_low_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-6, reason: not valid java name */
    public static final void m27543loadData$lambda12$lambda11$lambda6(InterfaceC10559a interfaceC10559a, SketchRecorderView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_height_version), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: loadData$lambda-12$lambda-11$lambda-8, reason: not valid java name */
    public static final void m27544loadData$lambda12$lambda11$lambda8(InterfaceC10559a interfaceC10559a, SketchRecorderView this$0) {
        AbstractC9133u.m16133g(this$0, "this$0");
        if (interfaceC10559a != null) {
            interfaceC10559a.invoke();
        }
        Context context = this$0.getContext();
        if (context != null) {
            Toast.makeText(context, context.getString(C7471R.string.tips_file_corrupted), 0).show();
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(Bitmap bitmap, int i10, int i11, InterfaceC10570l imageCallBack, InterfaceC10570l pathCallBack) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(imageCallBack, "imageCallBack");
        AbstractC9133u.m16133g(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, bitmap, getWidth(), getHeight(), i10, i11, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addPPT(String path, InterfaceC10570l callBack) throws IOException {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(callBack, "callBack");
        this.recordControl.addAdapterPPT(path, getWidth(), getHeight(), getWidth(), getHeight(), callBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void clear() {
        this.recordControl.clear();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public SketchConfig getConfig() {
        return this.sketchConfig;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public RectF getDrawArea() {
        return this.recordControl.getDrawConfig();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void getRecordPath(final InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(callBack, "callBack");
        stopRecord();
        this.recordControl.getRecordPath(getWidth(), getHeight(), new InterfaceC10570l() { // from class: com.zykj.sketch.core.record.SketchRecorderView.getRecordPath.1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((String) obj);
                return C8736p.f16368a;
            }

            public final void invoke(String str) {
                callBack.invoke(str);
            }
        });
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public List<String> getResList() {
        return this.recordControl.getResList();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void initConfig(final SketchConfig config, boolean z10, final InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(callBack, "callBack");
        this.sketchConfig.setTouchable(config.isTouchable());
        this.sketchConfig.setMaxImageCount(config.getMaxImageCount());
        if (AbstractC9133u.m16128b(this.sketchConfig.getSourcePath(), config.getSourcePath()) || !new File(this.sketchConfig.getSourcePath()).exists() || !z10) {
            this.sketchConfig.setSourcePath(config.getSourcePath());
            callBack.invoke(Boolean.TRUE);
            return;
        }
        final String sourcePath = config.getSourcePath();
        File file = new File(sourcePath);
        if (file.exists() || file.mkdirs()) {
            new Thread(new Runnable() { // from class: com.zykj.sketch.core.record.j
                @Override // java.lang.Runnable
                public final void run() {
                    SketchRecorderView.m27538initConfig$lambda2$lambda1(this.f10698a, sourcePath, config, callBack);
                }
            }).start();
        } else {
            callBack.invoke(Boolean.FALSE);
        }
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public boolean isRecord() {
        return this.recordControl.isRecord();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean isTouch() {
        return this.recordControl.isTouch();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public ThumbnailBean limitThumbnail() {
        return this.recordControl.limitThumbnail();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void loadData(final String path, InterfaceC10570l callBack, final InterfaceC10570l finish, final InterfaceC10559a interfaceC10559a) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(callBack, "callBack");
        AbstractC9133u.m16133g(finish, "finish");
        if (this.isLoading) {
            return;
        }
        this.isReady = false;
        this.isLoading = true;
        post(new Runnable() { // from class: com.zykj.sketch.core.record.d
            @Override // java.lang.Runnable
            public final void run() {
                SketchRecorderView.m27539loadData$lambda12(this.f10682a, path, finish, interfaceC10559a);
            }
        });
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void next() {
        this.recordControl.nextAction();
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (!this.isReady || this.isLoading || !this.acceptTouchEvent) {
            return true;
        }
        this.recordControl.onTouchAdapterEvent(event);
        return true;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void prev() {
        this.recordControl.prevAction();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void reset(boolean z10) {
        this.recordControl.reset(z10);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void resetMatrix() {
        this.recordControl.resetMatrix();
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void save() {
        RecordControl.getRecordPath$default(this.recordControl, getWidth(), getHeight(), null, 4, null);
    }

    public final void setAcceptTouchEvent(boolean z10) {
        this.acceptTouchEvent = z10;
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setActionChangeListener(ActionChangeListener actionChangeListener) {
        this.recordControl.addActionChangeListener(actionChangeListener);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.recordControl.setDrawConfig(Integer.valueOf(i10), null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setDrawArea(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        rectF.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        this.recordControl.setDrawConfig(null, rectF);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphConfig(GraphConfig config) {
        AbstractC9133u.m16133g(config, "config");
        EzyDrawBoard.ActionGraphConfig.GraphConfig.Builder builderNewBuilder = EzyDrawBoard.ActionGraphConfig.GraphConfig.newBuilder();
        builderNewBuilder.setColor(config.getColor());
        builderNewBuilder.setWidth(config.getWidth());
        RecordControl recordControl = this.recordControl;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfigBuild = builderNewBuilder.build();
        AbstractC9133u.m16132f(graphConfigBuild, "newBuilder.build()");
        recordControl.setGraphConfig(graphConfigBuild);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setGraphMatrixListener(GraphMatrixListener graphMatrixListener) {
        this.recordControl.setGraphMatrixListener(graphMatrixListener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setImageDeleteListener(ImageDeleteListener imageDeleteListener) {
        this.recordControl.setImageDeleteListener(imageDeleteListener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setMode(Mode mode) {
        AbstractC9133u.m16133g(mode, "mode");
        switch (WhenMappings.$EnumSwitchMapping$0[mode.ordinal()]) {
            case 1:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SELECT);
                break;
            case 2:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING);
                break;
            case 3:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE);
                break;
            case 4:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SHAPE_RECT);
                break;
            case 5:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_SHAPE_CIRCLE);
                break;
            case 6:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_VIEW);
                break;
            case 7:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_WRITING);
                break;
            case 8:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_DELETE);
                break;
            case 9:
                this.recordControl.setActionMode(EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE_VERTICAL);
                break;
        }
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setNextPrevListener(NextPrevListener nextPrevListener) {
        this.recordControl.addNextPrevListener(nextPrevListener);
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void setProgressListener(ProgressListener progressListener) {
        this.recordControl.addProgressListener(progressListener);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void setSketchBackground(int i10) {
        this.recordControl.setDrawConfig(Integer.valueOf(i10), null);
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void startRecord() {
        if (isRecord()) {
            return;
        }
        this.recordControl.startAudio();
    }

    @Override // com.zykj.sketch.core.listener.AudioOperation
    public void stopRecord() {
        if (isRecord()) {
            this.recordControl.stopAudio();
        }
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public Bitmap thumbnail() {
        return this.recordControl.thumbnail(getWidth(), getHeight());
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean tranlation(Float f10, Float f11, boolean z10) {
        return this.recordControl.translation(f10, f11, z10);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoom(float f10, float f11, float f12, float f13, boolean z10) {
        return this.recordControl.zoom(f10, f11, f12, f13, z10);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoomIn() {
        return RecordControl.zoom$default(this.recordControl, 1.2f, 1.2f, getWidth() / 2.0f, getHeight() / 2.0f, false, 16, null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public boolean zoomOut() {
        return RecordControl.zoom$default(this.recordControl, 0.8f, 0.8f, getWidth() / 2.0f, getHeight() / 2.0f, false, 16, null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(String path, int i10, int i11, InterfaceC10570l imageCallBack, InterfaceC10570l pathCallBack) throws Throwable {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(imageCallBack, "imageCallBack");
        AbstractC9133u.m16133g(pathCallBack, "pathCallBack");
        RecordControl.addAdapterImage$default(this.recordControl, path, getWidth(), getHeight(), i10, i11, imageCallBack, (String) null, pathCallBack, 64, (Object) null);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(Bitmap bitmap, String imageName, int i10, int i11, InterfaceC10570l imageCallBack, InterfaceC10570l pathCallBack) {
        AbstractC9133u.m16133g(bitmap, "bitmap");
        AbstractC9133u.m16133g(imageName, "imageName");
        AbstractC9133u.m16133g(imageCallBack, "imageCallBack");
        AbstractC9133u.m16133g(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(bitmap, getWidth(), getHeight(), i10, i11, imageCallBack, imageName, pathCallBack);
    }

    @Override // com.zykj.sketch.core.record.GraphOperation
    public void addImage(String path, String imageName, int i10, int i11, InterfaceC10570l imageCallBack, InterfaceC10570l pathCallBack) throws Throwable {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(imageName, "imageName");
        AbstractC9133u.m16133g(imageCallBack, "imageCallBack");
        AbstractC9133u.m16133g(pathCallBack, "pathCallBack");
        this.recordControl.addAdapterImage(path, getWidth(), getHeight(), i10, i11, imageCallBack, imageName, pathCallBack);
    }
}
