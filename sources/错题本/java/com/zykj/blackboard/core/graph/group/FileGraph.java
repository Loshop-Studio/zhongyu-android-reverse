package com.zykj.blackboard.core.graph.group;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Paint;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.C4361d0;
import com.zykj.board.EzySource$FileSource;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001b\"\u0004\b$\u0010\u0010R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/group/FileGraph;", "Lcom/zykj/blackboard/core/graph/group/GroupGraph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "path", "Ld6/s;", "updateFilePath", "(Ljava/lang/String;)V", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "initPath", "()V", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "getSourceLoader", "()Lcom/zykj/blackboard/core/loader/SourceLoader;", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "filePath", "getFilePath", "setFilePath", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "getPaint", "()Landroid/graphics/Paint;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class FileGraph extends GroupGraph {

    @Nullable
    private String filePath;

    @NotNull
    private final Paint paint;

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    @NotNull
    private final SourceLoader sourceLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileGraph(@NotNull String id, @NotNull RectF outRectF, @NotNull SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(ViewCompat.MEASURED_STATE_MASK);
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final Paint getPaint() {
        return this.paint;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 snapshot = super.getSnapshot();
        String str = this.filePath;
        if (str != null) {
            String strSubstring = str.substring(AbstractC5855p.m5385S(str, File.separatorChar, 0, 6) + 1);
            AbstractC5830k.m5329f(strSubstring, "this as java.lang.String).substring(startIndex)");
            snapshot.getClass();
            snapshot.f5475r = strSubstring;
            snapshot.f5458a |= 2048;
            snapshot.onChanged();
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @NotNull
    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    public void initPath() {
        String strPath;
        SourceLoader sourceLoader = this.sourceLoader;
        String sourceFileName = getSourceFileName();
        AbstractC5830k.m5327d(sourceFileName);
        Integer sourceId = getSourceId();
        AbstractC5830k.m5327d(sourceId);
        EzySource$FileSource.FileInfo fileCache = sourceLoader.getFileCache(sourceFileName, sourceId.intValue());
        if (fileCache == null || (strPath = this.sourceLoader.path()) == null) {
            return;
        }
        this.filePath = new File(SourceRouterRecord.INSTANCE.getResPath(strPath, DocumentType.IMAGE), fileCache.getName()).getAbsolutePath();
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    public void updateFilePath(@NotNull String path) {
        AbstractC5830k.m5330g(path, "path");
        this.filePath = path;
    }
}
