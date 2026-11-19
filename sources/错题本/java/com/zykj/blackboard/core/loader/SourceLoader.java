package com.zykj.blackboard.core.loader;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H&¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/blackboard/core/loader/SourceLoader;", "", "", "sourceFileName", "", "sourceId", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "getTouchCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "getFileCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "getMatrixCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "getTextCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "getGeometryCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "path", "()Ljava/lang/String;", "pageRootPath", "Ld6/s;", "initPath", "(Ljava/lang/String;)V", "release", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface SourceLoader {
    @Nullable
    EzySource$FileSource.FileInfo getFileCache(@NotNull String sourceFileName, int sourceId);

    @Nullable
    EzySource$GeometrySource.GeometryInfo getGeometryCache(@NotNull String sourceFileName, int sourceId);

    @Nullable
    EzySource$MatrixSource.MatrixInfo getMatrixCache(@NotNull String sourceFileName, int sourceId);

    @Nullable
    EzySource$TextSource.TextInfo getTextCache(@NotNull String sourceFileName, int sourceId);

    @Nullable
    EzySource$TouchSource.TouchInfo getTouchCache(@NotNull String sourceFileName, int sourceId);

    void initPath(@NotNull String pageRootPath);

    @Nullable
    String path();

    void release();
}
