package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.protobuf.Any;
import com.taobao.accs.common.Constants;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes6.dex */
public final class ImageGraph extends ViewGraph {
    public static final int BOTTOM_CENTER = 8;
    public static final int BOTTOM_LEFT = 7;
    public static final int BOTTOM_RIGHT = 9;
    public static final int CENTER = 0;
    public static final int CENTER_LEFT = 4;
    public static final int CENTER_RIGHT = 6;
    public static final Companion Companion = new Companion(null);
    public static final int MODE_ADAPTER = 24;
    public static final int MODE_ADAPTER_8 = 25;
    public static final int MODE_MAX_HEIGHT = 21;
    public static final int MODE_MAX_VALUE = 22;
    public static final int MODE_MAX_WIDTH = 20;
    public static final int MODE_MIN_VALUE = 23;
    public static final int TOP_CENTER = 2;
    public static final int TOP_LEFT = 1;
    public static final int TOP_RIGHT = 3;
    private Bitmap bitmap;
    private String fileName;
    private int height;
    private final int positionFlag;
    private int viewHeight;
    private int viewWidth;
    private int width;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ImageGraph(IControl iControl, int i10, int i11, int i12, int i13, String str, int i14, int i15, AbstractC9972n abstractC9972n) {
        this(iControl, i10, i11, i12, i13, str, (i15 & 64) != 0 ? 0 : i14);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Matrix getTranslateCenterMatrix(int i10, int i11, int i12, int i13) {
        float f10 = i12;
        float f11 = f10 / 2.0f;
        float f12 = i13;
        float f13 = f12 / 2.0f;
        switch (this.positionFlag) {
            case 1:
                f11 = i10 / 2.0f;
                f13 = i11 / 2.0f;
                break;
            case 2:
                f13 = i11 / 2.0f;
                break;
            case 3:
                f11 = f10 - (i10 / 2.0f);
                f13 = i11 / 2.0f;
                break;
            case 4:
                f11 = i10 / 2.0f;
                break;
            case 6:
                f11 = f10 - (i10 / 2.0f);
                break;
            case 7:
                f11 = i10 / 2.0f;
                f13 = f12 - (i11 / 2.0f);
                break;
            case 8:
                f13 = f12 - (i11 / 2.0f);
                break;
            case 9:
                f11 = f10 - (i10 / 2.0f);
                f13 = f12 - (i11 / 2.0f);
                break;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(f11 - (i10 / 2.0f), f13 - (i11 / 2.0f));
        return matrix;
    }

    public static /* synthetic */ Matrix getTranslateCenterMatrix$default(ImageGraph imageGraph, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        return imageGraph.getTranslateCenterMatrix(i10, i11, i12, i13);
    }

    private final void reloadBitmap(File file) {
        Bitmap bitmap = this.bitmap;
        int width = bitmap != null ? bitmap.getWidth() : 0;
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options);
        if (width > 0) {
            this.bitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, width, (int) (bitmapDecodeFile.getHeight() / (bitmapDecodeFile.getWidth() / width)), false);
        } else {
            this.bitmap = bitmapDecodeFile;
            onMeasure();
        }
    }

    public final void checkOldData() {
        if (this.bitmap == null || r0.getWidth() == getOutRect().width()) {
            return;
        }
        getMOutRect().set(0.0f, 0.0f, r0.getWidth(), r0.getHeight());
        float width = (this.width * 1.0f) / r0.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(width, width);
        Matrix matrix2 = new Matrix();
        matrix2.postConcat(matrix);
        matrix2.postConcat(getMatrix());
        setMatrix(matrix2);
    }

    public final String getFileName() {
        return this.fileName;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData.Builder snapshotBuild = getSnapshotBuild();
        GraphSnapshot.File.Builder builderNewBuilder = GraphSnapshot.File.newBuilder();
        builderNewBuilder.setFileName(this.fileName);
        builderNewBuilder.setWidth(this.width);
        builderNewBuilder.setHeight(this.height);
        builderNewBuilder.setViewWidth(this.viewWidth);
        builderNewBuilder.setViewHeight(this.viewHeight);
        builderNewBuilder.setPositionFlag(this.positionFlag);
        snapshotBuild.setExtra(Any.pack(builderNewBuilder.build()));
        GraphSnapshot.GraphData graphDataBuild = snapshotBuild.build();
        AbstractC9979u.m20293f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.IMAGE_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
        if (this.bitmap != null) {
            getMOutRect().set(0.0f, 0.0f, r0.getWidth(), r0.getHeight());
            setChildExtendMatrix(new PointF(getMOutRect().left, getMOutRect().top));
            float width = (this.width * 1.0f) / r0.getWidth();
            Matrix matrix = new Matrix(GraphExtKt.inverts(GraphExtKt.getFP2WPMatrix(this)));
            matrix.postScale(width, width);
            matrix.postConcat(getTranslateCenterMatrix(this.width, this.height, this.viewWidth, this.viewHeight));
            setMatrix(matrix);
        }
    }

    public final void refreshBitmap(Bitmap bitmap) throws IOException {
        AbstractC9979u.m20294g(bitmap, "bitmap");
        FileUtils.Companion companion = FileUtils.Companion;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        sb2.append(this.fileName);
        companion.saveBitmap2SDCard(bitmap, sb2.toString());
        reloadBitmap(new File(getControl().getSketchConfig().getSourcePath() + str + Constants.SEND_TYPE_RES + str + this.fileName));
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(Canvas canvas) {
        AbstractC9979u.m20294g(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (bitmap.isRecycled()) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(getControl().getSketchConfig().getSourcePath());
                        String str = File.separator;
                        sb2.append(str);
                        sb2.append(Constants.SEND_TYPE_RES);
                        sb2.append(str);
                        sb2.append(this.fileName);
                        String string = sb2.toString();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        C10786q c10786q = C10786q.f26013a;
                        this.bitmap = BitmapFactory.decodeFile(string, options);
                    } else {
                        canvas.drawBitmap(bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
                    }
                    C10786q c10786q2 = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(IControl actionControl, int i10, int i11, int i12, int i13, String fileName, int i14) {
        super(actionControl);
        AbstractC9979u.m20294g(actionControl, "actionControl");
        AbstractC9979u.m20294g(fileName, "fileName");
        this.width = i10;
        this.height = i11;
        this.viewWidth = i12;
        this.viewHeight = i13;
        this.fileName = fileName;
        this.positionFlag = i14;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getControl().getSketchConfig().getSourcePath());
            String str = File.separator;
            sb2.append(str);
            sb2.append(Constants.SEND_TYPE_RES);
            sb2.append(str);
            sb2.append(this.fileName);
            String string = sb2.toString();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            C10786q c10786q = C10786q.f26013a;
            this.bitmap = BitmapFactory.decodeFile(string, options);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void refreshBitmap(String path) throws Throwable {
        AbstractC9979u.m20294g(path, "path");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb2.append(str);
        sb2.append(Constants.SEND_TYPE_RES);
        sb2.append(str);
        sb2.append(this.fileName);
        File file = new File(sb2.toString());
        if (file.exists()) {
            FileUtils.Companion companion = FileUtils.Companion;
            String strMd5HashCode = companion.Md5HashCode(file);
            File file2 = new File(path);
            if (!file2.exists() || AbstractC9979u.m20289b(companion.Md5HashCode(file2), strMd5HashCode)) {
                return;
            }
            companion.copyFileUsingFileChannels(file2, file);
            reloadBitmap(file);
            return;
        }
        File file3 = new File(path);
        if (file3.exists()) {
            FileUtils.Companion.copyFileUsingFileChannels(file3, file);
            reloadBitmap(file);
        }
    }
}
