package p169l5;

import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzySource;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import p199o5.C9179o;
import p199o5.C9180p;
import p199o5.C9181q;
import p199o5.C9182r;
import p199o5.C9183s;

/* renamed from: l5.a */
/* loaded from: classes4.dex */
public final class C8887a implements InterfaceC8891e {

    /* renamed from: a */
    public final Map f14690a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f14691b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f14692c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f14693d = new LinkedHashMap();

    /* renamed from: e */
    public final Map f14694e = new LinkedHashMap();

    /* renamed from: f */
    public String f14695f = "";

    @Override // p169l5.InterfaceC8891e
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo13811a(String sourceFileName, int i9) {
        Object objM24758constructorimpl;
        EzySource.TouchSource touchSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f14691b;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM13816f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(C9183s.f15580e.m14796a(this.f14695f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
                LogUtils.m2956i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
                objM24758constructorimpl = null;
            }
            if (objM24758constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24758constructorimpl));
                touchSource = (EzySource.TouchSource) objM24758constructorimpl;
            }
            return (EzySource.TouchSource.TouchInfo) objM13816f;
        }
        touchSource = (EzySource.TouchSource) obj;
        List listM9623t = touchSource.m9623t();
        Intrinsics.checkNotNullExpressionValue(listM9623t, "it.touchInfoList");
        objM13816f = m13816f(i9, listM9623t);
        return (EzySource.TouchSource.TouchInfo) objM13816f;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo13812b(String sourceFileName, int i9) {
        Object objM24758constructorimpl;
        EzySource.MatrixSource matrixSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f14692c;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM13816f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(C9181q.f15574e.m14784a(this.f14695f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
                LogUtils.m2956i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
                objM24758constructorimpl = null;
            }
            if (objM24758constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24758constructorimpl));
                matrixSource = (EzySource.MatrixSource) objM24758constructorimpl;
            }
            return (EzySource.MatrixSource.MatrixInfo) objM13816f;
        }
        matrixSource = (EzySource.MatrixSource) obj;
        List listM9489q = matrixSource.m9489q();
        Intrinsics.checkNotNullExpressionValue(listM9489q, "it.matrixInfoList");
        objM13816f = m13816f(i9, listM9489q);
        return (EzySource.MatrixSource.MatrixInfo) objM13816f;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo13813c(String sourceFileName, int i9) {
        Object objM24758constructorimpl;
        EzySource.TextSource textSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f14693d;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM13816f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(C9182r.f15577e.m14790a(this.f14695f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
                LogUtils.m2956i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
                objM24758constructorimpl = null;
            }
            if (objM24758constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24758constructorimpl));
                textSource = (EzySource.TextSource) objM24758constructorimpl;
            }
            return (EzySource.TextSource.TextInfo) objM13816f;
        }
        textSource = (EzySource.TextSource) obj;
        List listM9553t = textSource.m9553t();
        Intrinsics.checkNotNullExpressionValue(listM9553t, "it.textInfoList");
        objM13816f = m13816f(i9, listM9553t);
        return (EzySource.TextSource.TextInfo) objM13816f;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo13814d(String sourceFileName, int i9) {
        Object objM24758constructorimpl;
        EzySource.GeometrySource geometrySource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f14694e;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM13816f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(C9180p.f15571e.m14778a(this.f14695f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
                LogUtils.m2956i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
                objM24758constructorimpl = null;
            }
            if (objM24758constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24758constructorimpl));
                geometrySource = (EzySource.GeometrySource) objM24758constructorimpl;
            }
            return (EzySource.GeometrySource.GeometryInfo) objM13816f;
        }
        geometrySource = (EzySource.GeometrySource) obj;
        List listM9414q = geometrySource.m9414q();
        Intrinsics.checkNotNullExpressionValue(listM9414q, "it.geometryInfoList");
        objM13816f = m13816f(i9, listM9414q);
        return (EzySource.GeometrySource.GeometryInfo) objM13816f;
    }

    @Override // p169l5.InterfaceC8891e
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo13815e(String sourceFileName, int i9) {
        Object objM24758constructorimpl;
        EzySource.FileSource fileSource;
        Intrinsics.checkNotNullParameter(sourceFileName, "sourceFileName");
        Map map = this.f14690a;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM13816f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(C9179o.f15568e.m14772a(this.f14695f, sourceFileName));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM24758constructorimpl = Result.m24758constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m24761exceptionOrNullimpl(objM24758constructorimpl) != null) {
                LogUtils.m2956i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m24764isFailureimpl(objM24758constructorimpl)) {
                objM24758constructorimpl = null;
            }
            if (objM24758constructorimpl != null) {
                map.put(sourceFileName, new SoftReference(objM24758constructorimpl));
                fileSource = (EzySource.FileSource) objM24758constructorimpl;
            }
            return (EzySource.FileSource.FileInfo) objM13816f;
        }
        fileSource = (EzySource.FileSource) obj;
        List listM9347t = fileSource.m9347t();
        Intrinsics.checkNotNullExpressionValue(listM9347t, "it.fileInfoList");
        objM13816f = m13816f(i9, listM9347t);
        return (EzySource.FileSource.FileInfo) objM13816f;
    }

    /* renamed from: f */
    public final Object m13816f(int i9, List list) {
        if (i9 < 0 || i9 >= list.size()) {
            return null;
        }
        return list.get(i9);
    }

    /* renamed from: g */
    public void m13817g(String pageRootPath) {
        Intrinsics.checkNotNullParameter(pageRootPath, "pageRootPath");
        this.f14695f = pageRootPath;
    }

    /* renamed from: h */
    public void m13818h() {
        this.f14691b.clear();
        this.f14690a.clear();
        this.f14692c.clear();
        this.f14693d.clear();
        this.f14694e.clear();
    }

    @Override // p169l5.InterfaceC8891e
    public String path() {
        return this.f14695f;
    }
}
