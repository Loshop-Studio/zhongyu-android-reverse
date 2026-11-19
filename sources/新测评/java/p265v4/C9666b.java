package p265v4;

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
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v4.b */
/* loaded from: classes4.dex */
public final class C9666b {

    /* renamed from: a */
    public static final C9666b f16934a = new C9666b();

    /* renamed from: a */
    public final EzySource.FileSource.FileInfo m16174a(FileInfoEntity fileInfoEntity) {
        if (fileInfoEntity == null) {
            return null;
        }
        EzySource.FileSource.FileInfo.C6820b c6820bM8217t = EzySource.FileSource.FileInfo.m8217t();
        c6820bM8217t.m8239s(fileInfoEntity.getFileName());
        c6820bM8217t.m8243w(fileInfoEntity.getWidth());
        c6820bM8217t.m8238r(fileInfoEntity.getHeight());
        c6820bM8217t.m8242v(fileInfoEntity.getValidate());
        return c6820bM8217t.build();
    }

    /* renamed from: b */
    public final EzySource.GeometrySource.GeometryInfo m16175b(GeometryInfoEntity geometryInfoEntity) {
        if (geometryInfoEntity == null) {
            return null;
        }
        EzySource.GeometrySource.GeometryInfo.C6824b c6824bM8284w = EzySource.GeometrySource.GeometryInfo.m8284w();
        c6824bM8284w.m8305p().m7991q(geometryInfoEntity.getColor());
        c6824bM8284w.m8305p().m7999y(geometryInfoEntity.getWidth());
        c6824bM8284w.m8305p().m7996v(geometryInfoEntity.getStyle());
        c6824bM8284w.m8305p().m7997w(geometryInfoEntity.getTextSize());
        c6824bM8284w.m8312x(geometryInfoEntity.getGeometryType());
        for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.m6381d()) {
            c6824bM8284w.m8293b(EzyPointF.PointF.m8006m().m8028t(geometryPointFEntity.getX()).m8029u(geometryPointFEntity.getY()).build());
        }
        return c6824bM8284w.build();
    }

    /* renamed from: c */
    public final EzySource.MatrixSource.MatrixInfo m16176c(MatrixEventEntity matrixEventEntity) {
        if (matrixEventEntity == null) {
            return null;
        }
        EzySource.MatrixSource.MatrixInfo.C6828b c6828bM8350o = EzySource.MatrixSource.MatrixInfo.m8350o();
        for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.m6452b()) {
            EzyMatrix.Matrix.C6790b c6790bM7710D = EzyMatrix.Matrix.m7710D();
            Intrinsics.checkNotNullExpressionValue(c6790bM7710D, "newBuilder()");
            c6790bM7710D.m7750q(matrixInfoEntity.getEventTime());
            c6790bM7710D.m7756w(matrixInfoEntity.getScaleX());
            c6790bM7710D.m7758y(matrixInfoEntity.getSkewX());
            c6790bM7710D.m7734A(matrixInfoEntity.getTransX());
            c6790bM7710D.m7759z(matrixInfoEntity.getSkewY());
            c6790bM7710D.m7757x(matrixInfoEntity.getScaleY());
            c6790bM7710D.m7735B(matrixInfoEntity.getTransY());
            c6790bM7710D.m7752s(matrixInfoEntity.getPerSp0());
            c6790bM7710D.m7753t(matrixInfoEntity.getPerSp1());
            c6790bM7710D.m7754u(matrixInfoEntity.getPerSp2());
            c6828bM8350o.m8356b(c6790bM7710D);
        }
        return c6828bM8350o.build();
    }

    /* renamed from: d */
    public final EzySource.TextSource.TextInfo m16177d(TextInfoEntity textInfoEntity) {
        if (textInfoEntity == null) {
            return null;
        }
        EzySource.TextSource.TextInfo.C6832b c6832bM8413s = EzySource.TextSource.TextInfo.m8413s();
        c6832bM8413s.m8431m().m7991q(textInfoEntity.getColor());
        c6832bM8413s.m8431m().m7999y(textInfoEntity.getWidth());
        c6832bM8413s.m8431m().m7996v(textInfoEntity.getStyle());
        c6832bM8413s.m8431m().m7997w(textInfoEntity.getTextSize());
        c6832bM8413s.m8437u(textInfoEntity.getContent());
        return c6832bM8413s.build();
    }

    /* renamed from: e */
    public final EzySource.TouchSource.TouchInfo m16178e(TouchEventEntity touchEventEntity) {
        if (touchEventEntity == null) {
            return null;
        }
        EzySource.TouchSource.TouchInfo.C6836b c6836bM8480t = EzySource.TouchSource.TouchInfo.m8480t();
        c6836bM8480t.m8500p().m7991q(touchEventEntity.getColor());
        c6836bM8480t.m8500p().m7999y(touchEventEntity.getWidth());
        c6836bM8480t.m8500p().m7995u(touchEventEntity.getSpacing());
        c6836bM8480t.m8500p().m7993s(touchEventEntity.getItemLength());
        c6836bM8480t.m8500p().m7996v(touchEventEntity.getStyle());
        c6836bM8480t.m8500p().m7997w(touchEventEntity.getTextSize());
        for (TouchInfoEntity touchInfoEntity : touchEventEntity.m6590h()) {
            EzyTouchEvent.TouchEvent.C6845b c6845bM8547x = EzyTouchEvent.TouchEvent.m8547x();
            Intrinsics.checkNotNullExpressionValue(c6845bM8547x, "newBuilder()");
            c6845bM8547x.m8629v(touchInfoEntity.getEventTime());
            c6845bM8547x.m8609B(touchInfoEntity.getX());
            c6845bM8547x.m8610C(touchInfoEntity.getY());
            c6836bM8480t.m8489c(c6845bM8547x);
        }
        return c6836bM8480t.build();
    }
}
