package com.zykj.blackboard.core.loader;

import android.support.v4.media.AbstractC0037f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.core.record.dataRecorder.FileSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.GeometrySourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.MatrixSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.TextSourceRecord;
import com.zykj.blackboard.core.record.dataRecorder.TouchSourceRecord;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jt\u0010\u0012\u001a\u0004\u0018\u00018\u0001\"\u0006\b\u0000\u0010\u0004\u0018\u0001\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b0\n2\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000fH\u0082\b¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0014\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010,\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0006H\u0016¢\u0006\u0004\b,\u0010-R&\u0010/\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R&\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R&\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00100R&\u00106\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00100R&\u00108\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00100R\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109¨\u0006:"}, m5110d2 = {"Lcom/zykj/blackboard/core/loader/CacheSourceLoader;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "N", "", "sourceFileName", "", "sourceId", "", "Ljava/lang/ref/SoftReference;", "cacheMap", "Lkotlin/Function0;", "callForGet", "Lkotlin/Function1;", "", "mapToList", "getDataByCache", "(Ljava/lang/String;ILjava/util/Map;Lr6/a;Lr6/c;)Ljava/lang/Object;", "index", "list", "getIndexInList", "(ILjava/util/List;)Ljava/lang/Object;", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "getTouchCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "getFileCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$FileSource$FileInfo;", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "getMatrixCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "getTextCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$TextSource$TextInfo;", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "getGeometryCache", "(Ljava/lang/String;I)Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "path", "()Ljava/lang/String;", "Ld6/s;", "release", "pageRootPath", "initPath", "(Ljava/lang/String;)V", "Lcom/zykj/board/EzySource$FileSource;", "cacheFileMap", "Ljava/util/Map;", "Lcom/zykj/board/EzySource$TouchSource;", "cacheTouchMap", "Lcom/zykj/board/EzySource$MatrixSource;", "cacheMatrixMap", "Lcom/zykj/board/EzySource$TextSource;", "cacheTextMap", "Lcom/zykj/board/EzySource$GeometrySource;", "cacheGeometryMap", "Ljava/lang/String;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CacheSourceLoader implements SourceLoader {

    @NotNull
    private final Map<String, SoftReference<EzySource$FileSource>> cacheFileMap = new LinkedHashMap();

    @NotNull
    private final Map<String, SoftReference<EzySource$TouchSource>> cacheTouchMap = new LinkedHashMap();

    @NotNull
    private final Map<String, SoftReference<EzySource$MatrixSource>> cacheMatrixMap = new LinkedHashMap();

    @NotNull
    private final Map<String, SoftReference<EzySource$TextSource>> cacheTextMap = new LinkedHashMap();

    @NotNull
    private final Map<String, SoftReference<EzySource$GeometrySource>> cacheGeometryMap = new LinkedHashMap();

    @NotNull
    private String pageRootPath = "";

    private final /* synthetic */ <T, N> N getDataByCache(String sourceFileName, int sourceId, Map<String, SoftReference<T>> cacheMap, InterfaceC6469a callForGet, InterfaceC6471c mapToList) {
        Object objM13956constructorimpl;
        SoftReference<T> softReference = cacheMap.get(sourceFileName);
        T t8 = softReference != null ? softReference.get() : null;
        if (t8 != null) {
            return (N) getIndexInList(sourceId, (List) mapToList.invoke(t8));
        }
        try {
            objM13956constructorimpl = Result.m13956constructorimpl(callForGet.invoke());
        } catch (Throwable th) {
            objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
        }
        if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
            AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
        }
        if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
            objM13956constructorimpl = null;
        }
        if (objM13956constructorimpl == null) {
            return null;
        }
        cacheMap.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
        return (N) getIndexInList(sourceId, (List) mapToList.invoke(objM13956constructorimpl));
    }

    private final <T> T getIndexInList(int index, List<? extends T> list) {
        if (index < 0 || index >= list.size()) {
            return null;
        }
        return list.get(index);
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$FileSource.FileInfo getFileCache(@NotNull String sourceFileName, int sourceId) {
        Object objM13956constructorimpl;
        EzySource$FileSource ezySource$FileSource;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource$FileSource>> map = this.cacheFileMap;
        SoftReference<EzySource$FileSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource$FileSource ezySource$FileSource2 = softReference != null ? softReference.get() : null;
        if (ezySource$FileSource2 == null) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(FileSourceRecord.INSTANCE.getFileSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            if (objM13956constructorimpl != null) {
                map.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
                ezySource$FileSource = (EzySource$FileSource) objM13956constructorimpl;
            }
            return (EzySource$FileSource.FileInfo) indexInList;
        }
        ezySource$FileSource = ezySource$FileSource2;
        List<EzySource$FileSource.FileInfo> fileInfoList = ezySource$FileSource.getFileInfoList();
        AbstractC5830k.m5329f(fileInfoList, "it.fileInfoList");
        indexInList = getIndexInList(sourceId, fileInfoList);
        return (EzySource$FileSource.FileInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$GeometrySource.GeometryInfo getGeometryCache(@NotNull String sourceFileName, int sourceId) {
        Object objM13956constructorimpl;
        EzySource$GeometrySource ezySource$GeometrySource;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource$GeometrySource>> map = this.cacheGeometryMap;
        SoftReference<EzySource$GeometrySource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource$GeometrySource ezySource$GeometrySource2 = softReference != null ? softReference.get() : null;
        if (ezySource$GeometrySource2 == null) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(GeometrySourceRecord.INSTANCE.getGeometrySource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            if (objM13956constructorimpl != null) {
                map.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
                ezySource$GeometrySource = (EzySource$GeometrySource) objM13956constructorimpl;
            }
            return (EzySource$GeometrySource.GeometryInfo) indexInList;
        }
        ezySource$GeometrySource = ezySource$GeometrySource2;
        List<EzySource$GeometrySource.GeometryInfo> geometryInfoList = ezySource$GeometrySource.getGeometryInfoList();
        AbstractC5830k.m5329f(geometryInfoList, "it.geometryInfoList");
        indexInList = getIndexInList(sourceId, geometryInfoList);
        return (EzySource$GeometrySource.GeometryInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$MatrixSource.MatrixInfo getMatrixCache(@NotNull String sourceFileName, int sourceId) {
        Object objM13956constructorimpl;
        EzySource$MatrixSource ezySource$MatrixSource;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource$MatrixSource>> map = this.cacheMatrixMap;
        SoftReference<EzySource$MatrixSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource$MatrixSource ezySource$MatrixSource2 = softReference != null ? softReference.get() : null;
        if (ezySource$MatrixSource2 == null) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(MatrixSourceRecord.INSTANCE.getMatrixSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            if (objM13956constructorimpl != null) {
                map.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
                ezySource$MatrixSource = (EzySource$MatrixSource) objM13956constructorimpl;
            }
            return (EzySource$MatrixSource.MatrixInfo) indexInList;
        }
        ezySource$MatrixSource = ezySource$MatrixSource2;
        List<EzySource$MatrixSource.MatrixInfo> matrixInfoList = ezySource$MatrixSource.getMatrixInfoList();
        AbstractC5830k.m5329f(matrixInfoList, "it.matrixInfoList");
        indexInList = getIndexInList(sourceId, matrixInfoList);
        return (EzySource$MatrixSource.MatrixInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TextSource.TextInfo getTextCache(@NotNull String sourceFileName, int sourceId) {
        Object objM13956constructorimpl;
        EzySource$TextSource ezySource$TextSource;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource$TextSource>> map = this.cacheTextMap;
        SoftReference<EzySource$TextSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource$TextSource ezySource$TextSource2 = softReference != null ? softReference.get() : null;
        if (ezySource$TextSource2 == null) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(TextSourceRecord.INSTANCE.getTextSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            if (objM13956constructorimpl != null) {
                map.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
                ezySource$TextSource = (EzySource$TextSource) objM13956constructorimpl;
            }
            return (EzySource$TextSource.TextInfo) indexInList;
        }
        ezySource$TextSource = ezySource$TextSource2;
        List<EzySource$TextSource.TextInfo> textInfoList = ezySource$TextSource.getTextInfoList();
        AbstractC5830k.m5329f(textInfoList, "it.textInfoList");
        indexInList = getIndexInList(sourceId, textInfoList);
        return (EzySource$TextSource.TextInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @Nullable
    public EzySource$TouchSource.TouchInfo getTouchCache(@NotNull String sourceFileName, int sourceId) {
        Object objM13956constructorimpl;
        EzySource$TouchSource ezySource$TouchSource;
        AbstractC5830k.m5330g(sourceFileName, "sourceFileName");
        Map<String, SoftReference<EzySource$TouchSource>> map = this.cacheTouchMap;
        SoftReference<EzySource$TouchSource> softReference = map.get(sourceFileName);
        Object indexInList = null;
        EzySource$TouchSource ezySource$TouchSource2 = softReference != null ? softReference.get() : null;
        if (ezySource$TouchSource2 == null) {
            try {
                objM13956constructorimpl = Result.m13956constructorimpl(TouchSourceRecord.INSTANCE.getTouchSource(this.pageRootPath, sourceFileName));
            } catch (Throwable th) {
                objM13956constructorimpl = Result.m13956constructorimpl(AbstractC5774b.m5118a(th));
            }
            if (Result.m13959exceptionOrNullimpl(objM13956constructorimpl) != null) {
                AbstractC3387g.m2342e(AbstractC0037f.m86k("CacheSourceLoader:getDataByCache [", sourceFileName, "] 文件转化数据失败"));
            }
            if (Result.m13961isFailureimpl(objM13956constructorimpl)) {
                objM13956constructorimpl = null;
            }
            if (objM13956constructorimpl != null) {
                map.put(sourceFileName, new SoftReference<>(objM13956constructorimpl));
                ezySource$TouchSource = (EzySource$TouchSource) objM13956constructorimpl;
            }
            return (EzySource$TouchSource.TouchInfo) indexInList;
        }
        ezySource$TouchSource = ezySource$TouchSource2;
        List<EzySource$TouchSource.TouchInfo> touchInfoList = ezySource$TouchSource.getTouchInfoList();
        AbstractC5830k.m5329f(touchInfoList, "it.touchInfoList");
        indexInList = getIndexInList(sourceId, touchInfoList);
        return (EzySource$TouchSource.TouchInfo) indexInList;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    public void initPath(@NotNull String pageRootPath) {
        AbstractC5830k.m5330g(pageRootPath, "pageRootPath");
        this.pageRootPath = pageRootPath;
    }

    @Override // com.zykj.blackboard.core.loader.SourceLoader
    @NotNull
    /* renamed from: path, reason: from getter */
    public String getPageRootPath() {
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
