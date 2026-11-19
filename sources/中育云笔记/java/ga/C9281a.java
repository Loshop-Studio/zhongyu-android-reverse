package ga;

import com.blankj.utilcode.util.LogUtils;
import com.zykj.board.EzySource;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC9924b;
import kotlin.Result;
import kotlin.jvm.internal.AbstractC9979u;
import p208ja.C9704o;
import p208ja.C9705p;
import p208ja.C9706q;
import p208ja.C9707r;
import p208ja.C9708s;

/* renamed from: ga.a */
/* loaded from: classes5.dex */
public final class C9281a implements InterfaceC9284d {

    /* renamed from: a */
    public final Map f21652a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f21653b = new LinkedHashMap();

    /* renamed from: c */
    public final Map f21654c = new LinkedHashMap();

    /* renamed from: d */
    public final Map f21655d = new LinkedHashMap();

    /* renamed from: e */
    public final Map f21656e = new LinkedHashMap();

    /* renamed from: f */
    public String f21657f = "";

    @Override // ga.InterfaceC9284d
    /* renamed from: a */
    public EzySource.TouchSource.TouchInfo mo18289a(String sourceFileName, int i10) {
        Object objM20054c;
        EzySource.TouchSource touchSource;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        Map map = this.f21653b;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM18294f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(C9708s.f22595e.m19214a(this.f21657f, sourceFileName));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (Result.m20056e(objM20054c) != null) {
                LogUtils.m3888i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m20058g(objM20054c)) {
                objM20054c = null;
            }
            if (objM20054c != null) {
                map.put(sourceFileName, new SoftReference(objM20054c));
                touchSource = (EzySource.TouchSource) objM20054c;
            }
            return (EzySource.TouchSource.TouchInfo) objM18294f;
        }
        touchSource = (EzySource.TouchSource) obj;
        List listM16252k = touchSource.m16252k();
        AbstractC9979u.m20293f(listM16252k, "it.touchInfoList");
        objM18294f = m18294f(i10, listM16252k);
        return (EzySource.TouchSource.TouchInfo) objM18294f;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: b */
    public EzySource.MatrixSource.MatrixInfo mo18290b(String sourceFileName, int i10) {
        Object objM20054c;
        EzySource.MatrixSource matrixSource;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        Map map = this.f21654c;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM18294f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(C9706q.f22589e.m19202a(this.f21657f, sourceFileName));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (Result.m20056e(objM20054c) != null) {
                LogUtils.m3888i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m20058g(objM20054c)) {
                objM20054c = null;
            }
            if (objM20054c != null) {
                map.put(sourceFileName, new SoftReference(objM20054c));
                matrixSource = (EzySource.MatrixSource) objM20054c;
            }
            return (EzySource.MatrixSource.MatrixInfo) objM18294f;
        }
        matrixSource = (EzySource.MatrixSource) obj;
        List listM16118g = matrixSource.m16118g();
        AbstractC9979u.m20293f(listM16118g, "it.matrixInfoList");
        objM18294f = m18294f(i10, listM16118g);
        return (EzySource.MatrixSource.MatrixInfo) objM18294f;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: c */
    public EzySource.TextSource.TextInfo mo18291c(String sourceFileName, int i10) {
        Object objM20054c;
        EzySource.TextSource textSource;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        Map map = this.f21655d;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM18294f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(C9707r.f22592e.m19208a(this.f21657f, sourceFileName));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (Result.m20056e(objM20054c) != null) {
                LogUtils.m3888i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m20058g(objM20054c)) {
                objM20054c = null;
            }
            if (objM20054c != null) {
                map.put(sourceFileName, new SoftReference(objM20054c));
                textSource = (EzySource.TextSource) objM20054c;
            }
            return (EzySource.TextSource.TextInfo) objM18294f;
        }
        textSource = (EzySource.TextSource) obj;
        List listM16182k = textSource.m16182k();
        AbstractC9979u.m20293f(listM16182k, "it.textInfoList");
        objM18294f = m18294f(i10, listM16182k);
        return (EzySource.TextSource.TextInfo) objM18294f;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: d */
    public EzySource.GeometrySource.GeometryInfo mo18292d(String sourceFileName, int i10) {
        Object objM20054c;
        EzySource.GeometrySource geometrySource;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        Map map = this.f21656e;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM18294f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(C9705p.f22586e.m19196a(this.f21657f, sourceFileName));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (Result.m20056e(objM20054c) != null) {
                LogUtils.m3888i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m20058g(objM20054c)) {
                objM20054c = null;
            }
            if (objM20054c != null) {
                map.put(sourceFileName, new SoftReference(objM20054c));
                geometrySource = (EzySource.GeometrySource) objM20054c;
            }
            return (EzySource.GeometrySource.GeometryInfo) objM18294f;
        }
        geometrySource = (EzySource.GeometrySource) obj;
        List listM16043g = geometrySource.m16043g();
        AbstractC9979u.m20293f(listM16043g, "it.geometryInfoList");
        objM18294f = m18294f(i10, listM16043g);
        return (EzySource.GeometrySource.GeometryInfo) objM18294f;
    }

    @Override // ga.InterfaceC9284d
    /* renamed from: e */
    public EzySource.FileSource.FileInfo mo18293e(String sourceFileName, int i10) {
        Object objM20054c;
        EzySource.FileSource fileSource;
        AbstractC9979u.m20294g(sourceFileName, "sourceFileName");
        Map map = this.f21652a;
        SoftReference softReference = (SoftReference) map.get(sourceFileName);
        Object objM18294f = null;
        Object obj = softReference != null ? softReference.get() : null;
        if (obj == null) {
            try {
                Result.C9921a c9921a = Result.f23263d;
                objM20054c = Result.m20054c(C9704o.f22583e.m19190a(this.f21657f, sourceFileName));
            } catch (Throwable th) {
                Result.C9921a c9921a2 = Result.f23263d;
                objM20054c = Result.m20054c(AbstractC9924b.m20070a(th));
            }
            if (Result.m20056e(objM20054c) != null) {
                LogUtils.m3888i("CacheSourceLoader:getDataByCache [" + sourceFileName + "] 文件转化数据失败");
            }
            if (Result.m20058g(objM20054c)) {
                objM20054c = null;
            }
            if (objM20054c != null) {
                map.put(sourceFileName, new SoftReference(objM20054c));
                fileSource = (EzySource.FileSource) objM20054c;
            }
            return (EzySource.FileSource.FileInfo) objM18294f;
        }
        fileSource = (EzySource.FileSource) obj;
        List listM15976k = fileSource.m15976k();
        AbstractC9979u.m20293f(listM15976k, "it.fileInfoList");
        objM18294f = m18294f(i10, listM15976k);
        return (EzySource.FileSource.FileInfo) objM18294f;
    }

    /* renamed from: f */
    public final Object m18294f(int i10, List list) {
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    /* renamed from: g */
    public void m18295g(String pageRootPath) {
        AbstractC9979u.m20294g(pageRootPath, "pageRootPath");
        this.f21657f = pageRootPath;
    }

    /* renamed from: h */
    public void m18296h() {
        this.f21653b.clear();
        this.f21652a.clear();
        this.f21654c.clear();
        this.f21655d.clear();
        this.f21656e.clear();
    }

    @Override // ga.InterfaceC9284d
    public String path() {
        return this.f21657f;
    }
}
