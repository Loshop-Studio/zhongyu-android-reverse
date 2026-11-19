package com.zykj.blackboard.core.loader;

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
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class EntityConvertEzy {
    public static final EntityConvertEzy INSTANCE = new EntityConvertEzy();

    private EntityConvertEzy() {
    }

    public final EzyCommand.CommandSource.CommandInfo commandInfoConvertEzyCommandInfo(CommandInfoEntity commandInfoEntity) {
        if (commandInfoEntity == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.C7202b c7202bM7445p = EzyCommand.CommandSource.CommandInfo.m7445p();
        c7202bM7445p.m7948t(commandInfoEntity.getDelayTime());
        c7202bM7445p.m7949u(commandInfoEntity.getDuration());
        c7202bM7445p.m7951w(commandInfoEntity.isPlay());
        c7202bM7445p.m7945q(commandInfoEntity.getCommandEnum());
        c7202bM7445p.m7947s(ByteString.copyFrom(commandInfoEntity.getData()));
        return c7202bM7445p.build();
    }

    public final EzySource.FileSource.FileInfo fileInfoConvertEzyFileInfo(FileInfoEntity fileInfoEntity) {
        if (fileInfoEntity == null) {
            return null;
        }
        EzySource.FileSource.FileInfo.C7249b c7249bM8730k = EzySource.FileSource.FileInfo.m8730k();
        c7249bM8730k.m8752s(fileInfoEntity.getFileName());
        c7249bM8730k.m8756w(fileInfoEntity.getWidth());
        c7249bM8730k.m8751r(fileInfoEntity.getHeight());
        c7249bM8730k.m8755v(fileInfoEntity.getValidate());
        return c7249bM8730k.build();
    }

    public final EzySource.GeometrySource.GeometryInfo geometryInfoConvertEzyGeometryInfo(GeometryInfoEntity geometryInfoEntity) {
        if (geometryInfoEntity == null) {
            return null;
        }
        EzySource.GeometrySource.GeometryInfo.C7253b c7253bM8800q = EzySource.GeometrySource.GeometryInfo.m8800q();
        c7253bM8800q.m8829q().m8497q(geometryInfoEntity.getColor());
        c7253bM8800q.m8829q().m8505y(geometryInfoEntity.getWidth());
        c7253bM8800q.m8829q().m8502v(geometryInfoEntity.getStyle());
        c7253bM8800q.m8829q().m8503w(geometryInfoEntity.getTextSize());
        c7253bM8800q.m8836z(geometryInfoEntity.getGeometryType());
        for (GeometryPointFEntity geometryPointFEntity : geometryInfoEntity.getPointList()) {
            c7253bM8800q.m8817c(EzyPointF.PointF.m8512e().m8534t(geometryPointFEntity.getX()).m8535u(geometryPointFEntity.getY()).build());
        }
        return c7253bM8800q.build();
    }

    public final EzySource.MatrixSource.MatrixInfo matrixEventConvertEzyMatrixInfo(MatrixEventEntity matrixEventEntity) {
        if (matrixEventEntity == null) {
            return null;
        }
        EzySource.MatrixSource.MatrixInfo.C7257b c7257bM8874g = EzySource.MatrixSource.MatrixInfo.m8874g();
        for (MatrixInfoEntity matrixInfoEntity : matrixEventEntity.getMatrixInfo()) {
            EzyMatrix.Matrix.C7219b c7219bM8226u = EzyMatrix.Matrix.m8226u();
            AbstractC9133u.m16132f(c7219bM8226u, "newBuilder()");
            c7219bM8226u.m8255q(matrixInfoEntity.getEventTime());
            c7219bM8226u.m8261w(matrixInfoEntity.getScaleX());
            c7219bM8226u.m8263y(matrixInfoEntity.getSkewX());
            c7219bM8226u.m8239A(matrixInfoEntity.getTransX());
            c7219bM8226u.m8264z(matrixInfoEntity.getSkewY());
            c7219bM8226u.m8262x(matrixInfoEntity.getScaleY());
            c7219bM8226u.m8240B(matrixInfoEntity.getTransY());
            c7219bM8226u.m8257s(matrixInfoEntity.getPerSp0());
            c7219bM8226u.m8258t(matrixInfoEntity.getPerSp1());
            c7219bM8226u.m8259u(matrixInfoEntity.getPerSp2());
            c7257bM8874g.m8880c(c7219bM8226u);
        }
        return c7257bM8874g.build();
    }

    public final EzySource.TextSource.TextInfo textInfoConvertEzyTextInfo(TextInfoEntity textInfoEntity) {
        if (textInfoEntity == null) {
            return null;
        }
        EzySource.TextSource.TextInfo.C7261b c7261bM8940k = EzySource.TextSource.TextInfo.m8940k();
        c7261bM8940k.m8959n().m8497q(textInfoEntity.getColor());
        c7261bM8940k.m8959n().m8505y(textInfoEntity.getWidth());
        c7261bM8940k.m8959n().m8502v(textInfoEntity.getStyle());
        c7261bM8940k.m8959n().m8503w(textInfoEntity.getTextSize());
        c7261bM8940k.m8965u(textInfoEntity.getContent());
        return c7261bM8940k.build();
    }

    public final EzySource.TouchSource.TouchInfo touchInfoConvertEzyTouchInfo(TouchEventEntity touchEventEntity) {
        if (touchEventEntity == null) {
            return null;
        }
        EzySource.TouchSource.TouchInfo.C7265b c7265bM9011l = EzySource.TouchSource.TouchInfo.m9011l();
        c7265bM9011l.m9034q().m8497q(touchEventEntity.getColor());
        c7265bM9011l.m9034q().m8505y(touchEventEntity.getWidth());
        c7265bM9011l.m9034q().m8501u(touchEventEntity.getSpacing());
        c7265bM9011l.m9034q().m8499s(touchEventEntity.getItemLength());
        c7265bM9011l.m9034q().m8502v(touchEventEntity.getStyle());
        c7265bM9011l.m9034q().m8503w(touchEventEntity.getTextSize());
        for (TouchInfoEntity touchInfoEntity : touchEventEntity.getTouchInfoList()) {
            EzyTouchEvent.TouchEvent.C7274b c7274bM9083o = EzyTouchEvent.TouchEvent.m9083o();
            AbstractC9133u.m16132f(c7274bM9083o, "newBuilder()");
            c7274bM9083o.m9165v(touchInfoEntity.getEventTime());
            c7274bM9083o.m9145B(touchInfoEntity.getX());
            c7274bM9083o.m9146C(touchInfoEntity.getY());
            c7265bM9011l.m9022e(c7274bM9083o);
        }
        return c7265bM9011l.build();
    }
}
