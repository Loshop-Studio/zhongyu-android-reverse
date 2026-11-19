package com.zykj.blackboard.core.loader;

import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.core.record.dataRecorder.FileSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.GeometrySourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.MatrixSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.TextSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.TouchSourceRecord;
import com.zykj.board.EzySource;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9079b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class CacheSourceLoader implements SourceLoader {
    private final Map<String, SoftReference<EzySource.FileSource>> cacheFileMap = new LinkedHashMap();
    private final Map<String, SoftReference<EzySource.TouchSource>> cacheTouchMap = new LinkedHashMap();
    private final Map<String, SoftReference<EzySource.MatrixSource>> cacheMatrixMap = new LinkedHashMap();
    private final Map<String, SoftReference<EzySource.TextSource>> cacheTextMap = new LinkedHashMap();
    private final Map<String, SoftReference<EzySource.GeometrySource>> cacheGeometryMap = new LinkedHashMap();
    private String pageRootPath = "";

    private final /* synthetic */ <T, N> N getDataByCache(String str, int i10, Map<String, SoftReference<T>> map, InterfaceC10559a interfaceC10559a, InterfaceC10570l interfaceC10570l) {
        Object objM15909b;
        SoftReference<T> softReference = map.get(str);
        T t10 = softReference != null ? softReference.get() : null;
        if (t10 != null) {
            return (N) getIndexInList(i10, (List) interfaceC10570l.invoke(t10));
        }
        try {
            Result.C9076a c9076a = Result.f17350b;
            objM15909b = Result.m15909b(interfaceC10559a.invoke());
        } catch (Throwable th) {
            Result.C9076a c9076a2 = Result.f17350b;
            objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
        }
        if (Result.m15911d(objM15909b) != null) {
            AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + str + "] 文件转化数据失败");
        }
        if (Result.m15913g(objM15909b)) {
            objM15909b = null;
        }
        if (objM15909b == null) {
            return null;
        }
        map.put(str, new SoftReference<>(objM15909b));
        return (N) getIndexInList(i10, (List) interfaceC10570l.invoke(objM15909b));
    }

    private final <T> T getIndexInList(int i10, List<? extends T> list) {
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.FileSource.FileInfo getFileCache(String sourceFileName, int i10) {
        Object objM15909b;
        EzySource.FileSource fileSource;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource.FileSource>> map = this.cacheFileMap;
        SoftReference<EzySource.FileSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource.FileSource fileSource2 = softReference != null ? softReference.get() : null;
        if (fileSource2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(FileSourceRecord.Companion.getFileSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15911d(objM15909b) != null) {
                AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            if (objM15909b != null) {
                map.put(sourceFileName, new SoftReference<>(objM15909b));
                fileSource = (EzySource.FileSource) objM15909b;
            }
            return (EzySource.FileSource.FileInfo) indexInList;
        }
        fileSource = fileSource2;
        List listM8719h = fileSource.m8719h();
        AbstractC9133u.m16132f(listM8719h, "it.fileInfoList");
        indexInList = getIndexInList(i10, listM8719h);
        return (EzySource.FileSource.FileInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.GeometrySource.GeometryInfo getGeometryCache(String sourceFileName, int i10) {
        Object objM15909b;
        EzySource.GeometrySource geometrySource;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource.GeometrySource>> map = this.cacheGeometryMap;
        SoftReference<EzySource.GeometrySource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource.GeometrySource geometrySource2 = softReference != null ? softReference.get() : null;
        if (geometrySource2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(GeometrySourceRecord.Companion.getGeometrySource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15911d(objM15909b) != null) {
                AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            if (objM15909b != null) {
                map.put(sourceFileName, new SoftReference<>(objM15909b));
                geometrySource = (EzySource.GeometrySource) objM15909b;
            }
            return (EzySource.GeometrySource.GeometryInfo) indexInList;
        }
        geometrySource = geometrySource2;
        List listM8787h = geometrySource.m8787h();
        AbstractC9133u.m16132f(listM8787h, "it.geometryInfoList");
        indexInList = getIndexInList(i10, listM8787h);
        return (EzySource.GeometrySource.GeometryInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.MatrixSource.MatrixInfo getMatrixCache(String sourceFileName, int i10) {
        Object objM15909b;
        EzySource.MatrixSource matrixSource;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource.MatrixSource>> map = this.cacheMatrixMap;
        SoftReference<EzySource.MatrixSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource.MatrixSource matrixSource2 = softReference != null ? softReference.get() : null;
        if (matrixSource2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(MatrixSourceRecord.Companion.getMatrixSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15911d(objM15909b) != null) {
                AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            if (objM15909b != null) {
                map.put(sourceFileName, new SoftReference<>(objM15909b));
                matrixSource = (EzySource.MatrixSource) objM15909b;
            }
            return (EzySource.MatrixSource.MatrixInfo) indexInList;
        }
        matrixSource = matrixSource2;
        List listM8866g = matrixSource.m8866g();
        AbstractC9133u.m16132f(listM8866g, "it.matrixInfoList");
        indexInList = getIndexInList(i10, listM8866g);
        return (EzySource.MatrixSource.MatrixInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TextSource.TextInfo getTextCache(String sourceFileName, int i10) {
        Object objM15909b;
        EzySource.TextSource textSource;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource.TextSource>> map = this.cacheTextMap;
        SoftReference<EzySource.TextSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource.TextSource textSource2 = softReference != null ? softReference.get() : null;
        if (textSource2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(TextSourceRecord.Companion.getTextSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15911d(objM15909b) != null) {
                AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            if (objM15909b != null) {
                map.put(sourceFileName, new SoftReference<>(objM15909b));
                textSource = (EzySource.TextSource) objM15909b;
            }
            return (EzySource.TextSource.TextInfo) indexInList;
        }
        textSource = textSource2;
        List listM8930h = textSource.m8930h();
        AbstractC9133u.m16132f(listM8930h, "it.textInfoList");
        indexInList = getIndexInList(i10, listM8930h);
        return (EzySource.TextSource.TextInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public EzySource.TouchSource.TouchInfo getTouchCache(String sourceFileName, int i10) {
        Object objM15909b;
        EzySource.TouchSource touchSource;
        AbstractC9133u.m16133g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource.TouchSource>> map = this.cacheTouchMap;
        SoftReference<EzySource.TouchSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource.TouchSource touchSource2 = softReference != null ? softReference.get() : null;
        if (touchSource2 == null) {
            try {
                Result.C9076a c9076a = Result.f17350b;
                objM15909b = Result.m15909b(TouchSourceRecord.Companion.getTouchSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                Result.C9076a c9076a2 = Result.f17350b;
                objM15909b = Result.m15909b(AbstractC9079b.m15925a(th));
            }
            if (Result.m15911d(objM15909b) != null) {
                AbstractC5380q.m2623s("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m15913g(objM15909b)) {
                objM15909b = null;
            }
            if (objM15909b != null) {
                map.put(sourceFileName, new SoftReference<>(objM15909b));
                touchSource = (EzySource.TouchSource) objM15909b;
            }
            return (EzySource.TouchSource.TouchInfo) indexInList;
        }
        touchSource = touchSource2;
        List listM9000h = touchSource.m9000h();
        AbstractC9133u.m16132f(listM9000h, "it.touchInfoList");
        indexInList = getIndexInList(i10, listM9000h);
        return (EzySource.TouchSource.TouchInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(String pageRootPath) {
        AbstractC9133u.m16133g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public String path() {
        return this.pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void release() {
        this.cacheTouchMap.clear();
        this.cacheFileMap.clear();
        this.cacheMatrixMap.clear();
        this.cacheTextMap.clear();
        this.cacheGeometryMap.clear();
    }
}
