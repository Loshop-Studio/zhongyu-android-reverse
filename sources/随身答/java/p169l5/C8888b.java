package p169l5;

import com.google.protobuf.ByteString;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l5.b */
/* loaded from: classes4.dex */
public final class C8888b {

    /* renamed from: a */
    public static final C8888b f14696a = new C8888b();

    /* renamed from: a */
    public final EzyCommand.CommandSource.CommandInfo m13819a(CommandInfoEntity commandInfoEntity) {
        if (commandInfoEntity == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.C7092b c7092bM8065B = EzyCommand.CommandSource.CommandInfo.m8065B();
        c7092bM8065B.m8570t(commandInfoEntity.getDelayTime());
        c7092bM8065B.m8571u(commandInfoEntity.getDuration());
        c7092bM8065B.m8573w(commandInfoEntity.getIsPlay());
        c7092bM8065B.m8567q(commandInfoEntity.getCommandEnum());
        c7092bM8065B.m8569s(ByteString.copyFrom(commandInfoEntity.getData()));
        return c7092bM8065B.build();
    }

    /* renamed from: b */
    public final EzySource.FileSource.FileInfo m13820b(FileInfoEntity fileInfoEntity) {
        if (fileInfoEntity == null) {
            return null;
        }
        EzySource.FileSource.FileInfo.C7139b c7139bM9358w = EzySource.FileSource.FileInfo.m9358w();
        c7139bM9358w.m9380s(fileInfoEntity.getFileName());
        c7139bM9358w.m9384w(fileInfoEntity.getWidth());
        c7139bM9358w.m9379r(fileInfoEntity.getHeight());
        c7139bM9358w.m9383v(fileInfoEntity.getValidate());
        return c7139bM9358w.build();
    }

    /* renamed from: c */
    public final EzySource.GeometrySource.GeometryInfo m13821c(GeometryInfoEntity geometryInfoEntity) {
        if (geometryInfoEntity == null) {
            return null;
        }
        EzySource.GeometrySource.GeometryInfo.C7143b c7143bM9418A = EzySource.GeometrySource.GeometryInfo.m9418A();
        c7143bM9418A.m9450p().m9123q(geometryInfoEntity.getColor());
        c7143bM9418A.m9450p().m9131y(geometryInfoEntity.getWidth());
        c7143bM9418A.m9450p().m9128v(geometryInfoEntity.getStyle());
        c7143bM9418A.m9450p().m9129w(geometryInfoEntity.getTextSize());
        c7143bM9418A.m9457x(geometryInfoEntity.getGeometryType());
        for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.m7480d()) {
            c7143bM9418A.m9438b(EzyPointF.PointF.m9138n().m9160t(geometryPointFEntity.getX()).m9161u(geometryPointFEntity.getY()).build());
        }
        return c7143bM9418A.build();
    }

    /* renamed from: d */
    public final EzySource.MatrixSource.MatrixInfo m13822d(MatrixEventEntity matrixEventEntity) {
        if (matrixEventEntity == null) {
            return null;
        }
        EzySource.MatrixSource.MatrixInfo.C7147b c7147bM9497q = EzySource.MatrixSource.MatrixInfo.m9497q();
        for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.m7553b()) {
            EzyMatrix.Matrix.C7109b c7109bM8839G = EzyMatrix.Matrix.m8839G();
            Intrinsics.checkNotNullExpressionValue(c7109bM8839G, "newBuilder()");
            c7109bM8839G.m8879q(matrixInfoEntity.getEventTime());
            c7109bM8839G.m8885w(matrixInfoEntity.getScaleX());
            c7109bM8839G.m8887y(matrixInfoEntity.getSkewX());
            c7109bM8839G.m8863A(matrixInfoEntity.getTransX());
            c7109bM8839G.m8888z(matrixInfoEntity.getSkewY());
            c7109bM8839G.m8886x(matrixInfoEntity.getScaleY());
            c7109bM8839G.m8864B(matrixInfoEntity.getTransY());
            c7109bM8839G.m8881s(matrixInfoEntity.getPerSp0());
            c7109bM8839G.m8882t(matrixInfoEntity.getPerSp1());
            c7109bM8839G.m8883u(matrixInfoEntity.getPerSp2());
            c7147bM9497q.m9503b(c7109bM8839G);
        }
        return c7147bM9497q.build();
    }

    /* renamed from: e */
    public final EzySource.TextSource.TextInfo m13823e(TextInfoEntity textInfoEntity) {
        if (textInfoEntity == null) {
            return null;
        }
        EzySource.TextSource.TextInfo.C7151b c7151bM9563w = EzySource.TextSource.TextInfo.m9563w();
        c7151bM9563w.m9582n().m9123q(textInfoEntity.getColor());
        c7151bM9563w.m9582n().m9131y(textInfoEntity.getWidth());
        c7151bM9563w.m9582n().m9128v(textInfoEntity.getStyle());
        c7151bM9563w.m9582n().m9129w(textInfoEntity.getTextSize());
        c7151bM9563w.m9588u(textInfoEntity.getContent());
        return c7151bM9563w.build();
    }

    /* renamed from: f */
    public final EzySource.TouchSource.TouchInfo m13824f(TouchEventEntity touchEventEntity) {
        if (touchEventEntity == null) {
            return null;
        }
        EzySource.TouchSource.TouchInfo.C7155b c7155bM9634x = EzySource.TouchSource.TouchInfo.m9634x();
        c7155bM9634x.m9657q().m9123q(touchEventEntity.getColor());
        c7155bM9634x.m9657q().m9131y(touchEventEntity.getWidth());
        c7155bM9634x.m9657q().m9127u(touchEventEntity.getSpacing());
        c7155bM9634x.m9657q().m9125s(touchEventEntity.getItemLength());
        c7155bM9634x.m9657q().m9128v(touchEventEntity.getStyle());
        c7155bM9634x.m9657q().m9129w(touchEventEntity.getTextSize());
        for (TouchInfoEntity touchInfoEntity : touchEventEntity.m7693h()) {
            EzyTouchEvent.TouchEvent.C7164b c7164bM9695A = EzyTouchEvent.TouchEvent.m9695A();
            Intrinsics.checkNotNullExpressionValue(c7164bM9695A, "newBuilder()");
            c7164bM9695A.m9788v(touchInfoEntity.getEventTime());
            c7164bM9695A.m9768B(touchInfoEntity.getX());
            c7164bM9695A.m9769C(touchInfoEntity.getY());
            c7155bM9634x.m9645d(c7164bM9695A);
        }
        return c7155bM9634x.build();
    }
}
