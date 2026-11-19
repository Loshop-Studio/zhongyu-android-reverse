package com.zykj.blackboard.core.loader;

import com.zykj.board.EzySource;

/* loaded from: classes4.dex */
public interface SourceLoader {
    EzySource.FileSource.FileInfo getFileCache(String str, int i10);

    EzySource.GeometrySource.GeometryInfo getGeometryCache(String str, int i10);

    EzySource.MatrixSource.MatrixInfo getMatrixCache(String str, int i10);

    EzySource.TextSource.TextInfo getTextCache(String str, int i10);

    EzySource.TouchSource.TouchInfo getTouchCache(String str, int i10);

    void initPath(String str);

    String path();

    void release();
}
