package p265v4;

import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzySource;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import p295y4.C9920o;
import p295y4.C9921p;
import p295y4.C9922q;
import p295y4.C9923r;
import p295y4.C9924s;

/* renamed from: v4.a */
/* loaded from: classes4.dex */
public final class C9665a implements InterfaceC9668d {

    /* renamed from: a */
    public final Map f16928a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f16929b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f16930c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f16931d = new LinkedHashMap();

    /* renamed from: e */
    public final Map f16932e = new LinkedHashMap();

    /* renamed from: f */
    public String f16933f = "";

    @Override // p265v4.InterfaceC9668d
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo16166a(String sourceFileName, int i10) {
        Object objM24299constructorimpl;
        EzySource.TouchSource touchSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f16929b;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM16171f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(C9924s.f17726e.m16755a(this.f16933f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
                LogUtils.m3239i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            if (objM24299constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24299constructorimpl));
                touchSource = (EzySource.TouchSource) objM24299constructorimpl;
            }
            return (EzySource.TouchSource.TouchInfo) objM16171f;
        }
        touchSource = (EzySource.TouchSource) obj;
        List listM8469q = touchSource.m8469q();
        Intrinsics.checkNotNullExpressionValue(listM8469q, "it.touchInfoList");
        objM16171f = m16171f(i10, listM8469q);
        return (EzySource.TouchSource.TouchInfo) objM16171f;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo16167b(String sourceFileName, int i10) {
        Object objM24299constructorimpl;
        EzySource.MatrixSource matrixSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f16930c;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM16171f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(C9922q.f17720e.m16743a(this.f16933f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
                LogUtils.m3239i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            if (objM24299constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24299constructorimpl));
                matrixSource = (EzySource.MatrixSource) objM24299constructorimpl;
            }
            return (EzySource.MatrixSource.MatrixInfo) objM16171f;
        }
        matrixSource = (EzySource.MatrixSource) obj;
        List listM8342o = matrixSource.m8342o();
        Intrinsics.checkNotNullExpressionValue(listM8342o, "it.matrixInfoList");
        objM16171f = m16171f(i10, listM8342o);
        return (EzySource.MatrixSource.MatrixInfo) objM16171f;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo16168c(String sourceFileName, int i10) {
        Object objM24299constructorimpl;
        EzySource.TextSource textSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f16931d;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM16171f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(C9923r.f17723e.m16749a(this.f16933f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
                LogUtils.m3239i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            if (objM24299constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24299constructorimpl));
                textSource = (EzySource.TextSource) objM24299constructorimpl;
            }
            return (EzySource.TextSource.TextInfo) objM16171f;
        }
        textSource = (EzySource.TextSource) obj;
        List listM8403q = textSource.m8403q();
        Intrinsics.checkNotNullExpressionValue(listM8403q, "it.textInfoList");
        objM16171f = m16171f(i10, listM8403q);
        return (EzySource.TextSource.TextInfo) objM16171f;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo16169d(String sourceFileName, int i10) {
        Object objM24299constructorimpl;
        EzySource.GeometrySource geometrySource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f16932e;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM16171f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(C9921p.f17717e.m16737a(this.f16933f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
                LogUtils.m3239i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            if (objM24299constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24299constructorimpl));
                geometrySource = (EzySource.GeometrySource) objM24299constructorimpl;
            }
            return (EzySource.GeometrySource.GeometryInfo) objM16171f;
        }
        geometrySource = (EzySource.GeometrySource) obj;
        List listM8271o = geometrySource.m8271o();
        Intrinsics.checkNotNullExpressionValue(listM8271o, "it.geometryInfoList");
        objM16171f = m16171f(i10, listM8271o);
        return (EzySource.GeometrySource.GeometryInfo) objM16171f;
    }

    @Override // p265v4.InterfaceC9668d
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo16170e(String sourceFileName, int i10) {
        Object objM24299constructorimpl;
        EzySource.FileSource fileSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f16928a;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM16171f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(C9920o.f17714e.m16731a(this.f16933f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24299constructorimpl = Result.m24299constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24302exceptionOrNullimpl(objM24299constructorimpl) != null) {
                LogUtils.m3239i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24305isFailureimpl(objM24299constructorimpl)) {
                objM24299constructorimpl = null;
            }
            if (objM24299constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24299constructorimpl));
                fileSource = (EzySource.FileSource) objM24299constructorimpl;
            }
            return (EzySource.FileSource.FileInfo) objM16171f;
        }
        fileSource = (EzySource.FileSource) obj;
        List listM8206q = fileSource.m8206q();
        Intrinsics.checkNotNullExpressionValue(listM8206q, "it.fileInfoList");
        objM16171f = m16171f(i10, listM8206q);
        return (EzySource.FileSource.FileInfo) objM16171f;
    }

    /* renamed from: f */
    public final Object m16171f(int i10, List list) {
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* renamed from: g */
    public void m16172g(String pageRootPath) {
        Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
        this.f16933f = pageRootPath;
    }

    /* renamed from: h */
    public void m16173h() {
        this.f16929b.clear();
        this.f16928a.clear();
        this.f16930c.clear();
        this.f16931d.clear();
        this.f16932e.clear();
    }

    @Override // p265v4.InterfaceC9668d
    public String path() {
        return this.f16933f;
    }
}
