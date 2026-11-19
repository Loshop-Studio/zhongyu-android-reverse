package com.zykj.blackboard.core.graph.group;

import android.graphics.Paint;
import android.graphics.RectF;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzySource;
import java.io.File;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* loaded from: classes4.dex */
public abstract class FileGraph extends GroupGraph {
    private String filePath;
    private final Paint paint;
    private String sourceFileName;
    private Integer sourceId;
    private final SourceLoader sourceLoader;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileGraph(String id, RectF outRectF, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRectF, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        this.sourceLoader = sourceLoader;
        this.sourceFileName = str;
        this.sourceId = num;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setColor(-16777216);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final Paint getPaint() {
        return this.paint;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot = super.getSnapshot();
        String str = this.filePath;
        if (str != null) {
            String strSubstring = str.substring(AbstractC8661c0.m13996k0(str, File.separatorChar, 0, false, 6, null) + 1);
            AbstractC9133u.m16132f(strSubstring, "this as java.lang.String).substring(startIndex)");
            snapshot.m8405J(strSubstring);
        }
        return snapshot;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public Integer getSourceId() {
        return this.sourceId;
    }

    public final SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    public void initPath() {
        String strPath;
        SourceLoader sourceLoader = this.sourceLoader;
        String sourceFileName = getSourceFileName();
        AbstractC9133u.m16130d(sourceFileName);
        Integer sourceId = getSourceId();
        AbstractC9133u.m16130d(sourceId);
        EzySource.FileSource.FileInfo fileCache = sourceLoader.getFileCache(sourceFileName, sourceId.intValue());
        if (fileCache == null || (strPath = this.sourceLoader.path()) == null) {
            return;
        }
        this.filePath = new File(SourceRouterRecord.Companion.getResPath(strPath, DocumentType.IMAGE), fileCache.getName()).getAbsolutePath();
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    @Override // com.zykj.blackboard.core.graph.group.GroupGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph
    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    public void updateFilePath(String path) {
        AbstractC9133u.m16133g(path, "path");
        this.filePath = path;
    }
}
