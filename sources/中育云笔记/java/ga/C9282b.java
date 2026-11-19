package ga;

import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import kotlin.jvm.internal.AbstractC9979u;

/* renamed from: ga.b */
/* loaded from: classes5.dex */
public final class C9282b {

    /* renamed from: a */
    public static final C9282b f21658a = new C9282b();

    /* renamed from: a */
    public final EzySource.FileSource.FileInfo m18297a(FileInfoEntity fileInfoEntity) {
        if (fileInfoEntity == null) {
            return null;
        }
        EzySource.FileSource.FileInfo.C8517b c8517bM15987o = EzySource.FileSource.FileInfo.m15987o();
        c8517bM15987o.m16009r(fileInfoEntity.m14078a());
        c8517bM15987o.m16013v(fileInfoEntity.m14083f());
        c8517bM15987o.m16008q(fileInfoEntity.m14079b());
        c8517bM15987o.m16012u(fileInfoEntity.m14082e());
        return c8517bM15987o.build();
    }

    /* renamed from: b */
    public final EzySource.GeometrySource.GeometryInfo m18298b(GeometryInfoEntity geometryInfoEntity) {
        if (geometryInfoEntity == null) {
            return null;
        }
        EzySource.GeometrySource.GeometryInfo.C8521b c8521bM16056u = EzySource.GeometrySource.GeometryInfo.m16056u();
        c8521bM16056u.m16078o().m15742p(geometryInfoEntity.m14104a());
        c8521bM16056u.m16078o().m15750x(geometryInfoEntity.m14111h());
        c8521bM16056u.m16078o().m15747u(geometryInfoEntity.m14109f());
        c8521bM16056u.m16078o().m15748v(geometryInfoEntity.m14110g());
        c8521bM16056u.m16085w(geometryInfoEntity.m14105b());
        for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.m14107d()) {
            c8521bM16056u.m16066b(EzyPointF.PointF.m15757f().m15779s(geometryPointFEntity.m14122c()).m15780t(geometryPointFEntity.m14123d()).build());
        }
        return c8521bM16056u.build();
    }

    /* renamed from: c */
    public final EzySource.MatrixSource.MatrixInfo m18299c(MatrixEventEntity matrixEventEntity) {
        if (matrixEventEntity == null) {
            return null;
        }
        EzySource.MatrixSource.MatrixInfo.C8525b c8525bM16126g = EzySource.MatrixSource.MatrixInfo.m16126g();
        for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.m14180b()) {
            EzyMatrix.Matrix.C8487b c8487bM15455D = EzyMatrix.Matrix.m15455D();
            AbstractC9979u.m20293f(c8487bM15455D, "newBuilder()");
            c8487bM15455D.m15494p(matrixInfoEntity.m14190a());
            c8487bM15455D.m15500v(matrixInfoEntity.m14196g());
            c8487bM15455D.m15502x(matrixInfoEntity.m14198i());
            c8487bM15455D.m15504z(matrixInfoEntity.m14200k());
            c8487bM15455D.m15503y(matrixInfoEntity.m14199j());
            c8487bM15455D.m15501w(matrixInfoEntity.m14197h());
            c8487bM15455D.m15479A(matrixInfoEntity.m14201l());
            c8487bM15455D.m15496r(matrixInfoEntity.m14192c());
            c8487bM15455D.m15497s(matrixInfoEntity.m14193d());
            c8487bM15455D.m15498t(matrixInfoEntity.m14194e());
            c8525bM16126g.m16132b(c8487bM15455D);
        }
        return c8525bM16126g.build();
    }

    /* renamed from: d */
    public final EzySource.TextSource.TextInfo m18300d(TextInfoEntity textInfoEntity) {
        if (textInfoEntity == null) {
            return null;
        }
        EzySource.TextSource.TextInfo.C8529b c8529bM16192o = EzySource.TextSource.TextInfo.m16192o();
        c8529bM16192o.m16211m().m15742p(textInfoEntity.m14287a());
        c8529bM16192o.m16211m().m15750x(textInfoEntity.m14293g());
        c8529bM16192o.m16211m().m15747u(textInfoEntity.m14291e());
        c8529bM16192o.m16211m().m15748v(textInfoEntity.m14292f());
        c8529bM16192o.m16217t(textInfoEntity.m14288b());
        return c8529bM16192o.build();
    }

    /* renamed from: e */
    public final EzySource.TouchSource.TouchInfo m18301e(TouchEventEntity touchEventEntity) {
        if (touchEventEntity == null) {
            return null;
        }
        EzySource.TouchSource.TouchInfo.C8533b c8533bM16263p = EzySource.TouchSource.TouchInfo.m16263p();
        c8533bM16263p.m16285p().m15742p(touchEventEntity.m14314a());
        c8533bM16263p.m16285p().m15750x(touchEventEntity.m14322i());
        c8533bM16263p.m16285p().m15746t(touchEventEntity.m14318e());
        c8533bM16263p.m16285p().m15744r(touchEventEntity.m14316c());
        c8533bM16263p.m16285p().m15747u(touchEventEntity.m14319f());
        c8533bM16263p.m16285p().m15748v(touchEventEntity.m14320g());
        for (TouchInfoEntity touchInfoEntity : touchEventEntity.m14321h()) {
            EzyTouchEvent.TouchEvent.C8542b c8542bM16335u = EzyTouchEvent.TouchEvent.m16335u();
            AbstractC9979u.m20293f(c8542bM16335u, "newBuilder()");
            c8542bM16335u.m16416u(touchInfoEntity.m14331a());
            c8542bM16335u.m16396A(touchInfoEntity.m14334d());
            c8542bM16335u.m16397B(touchInfoEntity.m14335e());
            c8533bM16263p.m16273d(c8542bM16335u);
        }
        return c8533bM16263p.build();
    }
}
