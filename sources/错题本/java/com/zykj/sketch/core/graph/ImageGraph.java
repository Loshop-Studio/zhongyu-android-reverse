package com.zykj.sketch.core.graph;

// RE note 本类字节码直接引用的读写或显示接口包括位图。

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.Any;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.utils.FileUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 .2\u00020\u0001:\u0001.BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0015\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b&\u0010)J\r\u0010*\u001a\u00020\u0013¢\u0006\u0004\b*\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010+R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010-¨\u0006/"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/ImageGraph;", "Lcom/zykj/sketch/core/graph/ViewGraph;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "", "width", "height", "viewWidth", "viewHeight", "", "fileName", "positionFlag", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;IIIILjava/lang/String;I)V", "Landroid/graphics/Matrix;", "getTranslateCenterMatrix", "(IIII)Landroid/graphics/Matrix;", "Ljava/io/File;", "file", "Ld6/s;", "reloadBitmap", "(Ljava/io/File;)V", "Landroid/graphics/Canvas;", "canvas", "render", "(Landroid/graphics/Canvas;)V", "getFileName", "()Ljava/lang/String;", "onMeasure", "()V", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "Landroid/graphics/Bitmap;", "bitmap", "refreshBitmap", "(Landroid/graphics/Bitmap;)V", "path", "(Ljava/lang/String;)V", "checkOldData", "I", "Ljava/lang/String;", "Landroid/graphics/Bitmap;", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ImageGraph extends ViewGraph {
    public static final int BOTTOM_CENTER = 8;
    public static final int BOTTOM_LEFT = 7;
    public static final int BOTTOM_RIGHT = 9;
    public static final int CENTER = 0;
    public static final int CENTER_LEFT = 4;
    public static final int CENTER_RIGHT = 6;
    public static final int MODE_ADAPTER = 24;
    public static final int MODE_ADAPTER_8 = 25;
    public static final int MODE_MAX_HEIGHT = 21;
    public static final int MODE_MAX_VALUE = 22;
    public static final int MODE_MAX_WIDTH = 20;
    public static final int MODE_MIN_VALUE = 23;
    public static final int TOP_CENTER = 2;
    public static final int TOP_LEFT = 1;
    public static final int TOP_RIGHT = 3;

    @Nullable
    private Bitmap bitmap;

    @NotNull
    private String fileName;
    private int height;
    private final int positionFlag;
    private int viewHeight;
    private int viewWidth;
    private int width;

    public /* synthetic */ ImageGraph(IControl iControl, int i, int i8, int i9, int i10, String str, int i11, int i12, AbstractC5824e abstractC5824e) {
        this(iControl, i, i8, i9, i10, str, (i12 & 64) != 0 ? 0 : i11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final Matrix getTranslateCenterMatrix(int width, int height, int viewWidth, int viewHeight) {
        float f = viewWidth;
        float f7 = f / 2.0f;
        float f8 = viewHeight;
        float f9 = f8 / 2.0f;
        switch (this.positionFlag) {
            case 1:
                f7 = width / 2.0f;
                f9 = height / 2.0f;
                break;
            case 2:
                f9 = height / 2.0f;
                break;
            case 3:
                f7 = f - (width / 2.0f);
                f9 = height / 2.0f;
                break;
            case 4:
                f7 = width / 2.0f;
                break;
            case 6:
                f7 = f - (width / 2.0f);
                break;
            case 7:
                f7 = width / 2.0f;
                f9 = f8 - (height / 2.0f);
                break;
            case 8:
                f9 = f8 - (height / 2.0f);
                break;
            case 9:
                f7 = f - (width / 2.0f);
                f9 = f8 - (height / 2.0f);
                break;
        }
        Matrix matrix = new Matrix();
        matrix.postTranslate(f7 - (width / 2.0f), f9 - (height / 2.0f));
        return matrix;
    }

    public static /* synthetic */ Matrix getTranslateCenterMatrix$default(ImageGraph imageGraph, int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i8 = 0;
        }
        return imageGraph.getTranslateCenterMatrix(i, i8, i9, i10);
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

    // Old snapshots stored the requested display width. Correct their matrix when it differs from the decoded bitmap.
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
        matrix2.postConcat(getMMatrix());
        setMatrix(matrix2);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
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
        AbstractC5830k.m5329f(graphDataBuild, "builder.build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.IMAGE_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    // Image placement uses bitmap pixels, the inverse world matrix at insertion, and the recorded viewport anchor.
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

    public final void refreshBitmap(@NotNull Bitmap bitmap) {
        AbstractC5830k.m5330g(bitmap, "bitmap");
        FileUtils.Companion companion = FileUtils.INSTANCE;
        StringBuilder sb = new StringBuilder();
        sb.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
        sb.append(str);
        sb.append(this.fileName);
        companion.saveBitmap2SDCard(bitmap, sb.toString());
        reloadBitmap(new File(getControl().getSketchConfig().getSourcePath() + str + SourceRouterRecord.SOURCE_RES_IMAGE + str + this.fileName));
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            synchronized (bitmap) {
                try {
                    if (bitmap.isRecycled()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(getControl().getSketchConfig().getSourcePath());
                        String str = File.separator;
                        sb.append(str);
                        sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
                        sb.append(str);
                        sb.append(this.fileName);
                        String string = sb.toString();
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inPreferredConfig = Bitmap.Config.RGB_565;
                        this.bitmap = BitmapFactory.decodeFile(string, options);
                    } else {
                        canvas.drawBitmap(bitmap, GraphExtKt.getFP2WPRendMatrix(this), getMPaint());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageGraph(@NotNull IControl actionControl, int i, int i8, int i9, int i10, @NotNull String fileName, int i11) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
        AbstractC5830k.m5330g(fileName, "fileName");
        this.width = i;
        this.height = i8;
        this.viewWidth = i9;
        this.viewHeight = i10;
        this.fileName = fileName;
        this.positionFlag = i11;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(getControl().getSketchConfig().getSourcePath());
            String str = File.separator;
            sb.append(str);
            sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
            sb.append(str);
            sb.append(this.fileName);
            String string = sb.toString();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            this.bitmap = BitmapFactory.decodeFile(string, options);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void refreshBitmap(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        StringBuilder sb = new StringBuilder();
        sb.append(getControl().getSketchConfig().getSourcePath());
        String str = File.separator;
        sb.append(str);
        sb.append(SourceRouterRecord.SOURCE_RES_IMAGE);
        sb.append(str);
        sb.append(this.fileName);
        File file = new File(sb.toString());
        if (file.exists()) {
            FileUtils.Companion companion = FileUtils.INSTANCE;
            String strMd5HashCode = companion.Md5HashCode(file);
            File file2 = new File(path);
            if (!file2.exists() || AbstractC5830k.m5325b(companion.Md5HashCode(file2), strMd5HashCode)) {
                return;
            }
            companion.copyFileUsingFileChannels(file2, file);
            reloadBitmap(file);
            return;
        }
        File file3 = new File(path);
        if (file3.exists()) {
            FileUtils.INSTANCE.copyFileUsingFileChannels(file3, file);
            reloadBitmap(file);
        }
    }
}
