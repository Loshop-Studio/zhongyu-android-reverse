package com.zykj.blackboard.core.loader;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.ByteString;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.data.dao.FileInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryInfoEntity;
import com.zykj.blackboard.core.data.dao.GeometryPointFEntity;
import com.zykj.blackboard.core.data.dao.MatrixEventEntity;
import com.zykj.blackboard.core.data.dao.MatrixInfoEntity;
import com.zykj.blackboard.core.data.dao.TextInfoEntity;
import com.zykj.blackboard.core.data.dao.TouchEventEntity;
import com.zykj.blackboard.core.data.dao.TouchInfoEntity;
import com.zykj.board.C4362e;
import com.zykj.board.C4375k0;
import com.zykj.board.C4381n0;
import com.zykj.board.C4387q0;
import com.zykj.board.C4393t0;
import com.zykj.board.C4399w0;
import com.zykj.board.C4401x0;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzySource$FileSource;
import com.zykj.board.EzySource$GeometrySource;
import com.zykj.board.EzySource$MatrixSource;
import com.zykj.board.EzySource$TextSource;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p020b4.C3115b0;
import p020b4.C3172u0;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0005\u001a\u0004\u0018\u00010\u0015¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/blackboard/core/loader/EntityConvertEzy;", "", "()V", "commandInfoConvertEzyCommandInfo", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "entity", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "fileInfoConvertEzyFileInfo", "Lcom/zykj/board/EzySource$FileSource$FileInfo;", "Lcom/zykj/blackboard/core/data/dao/FileInfoEntity;", "geometryInfoConvertEzyGeometryInfo", "Lcom/zykj/board/EzySource$GeometrySource$GeometryInfo;", "Lcom/zykj/blackboard/core/data/dao/GeometryInfoEntity;", "matrixEventConvertEzyMatrixInfo", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "Lcom/zykj/blackboard/core/data/dao/MatrixEventEntity;", "textInfoConvertEzyTextInfo", "Lcom/zykj/board/EzySource$TextSource$TextInfo;", "Lcom/zykj/blackboard/core/data/dao/TextInfoEntity;", "touchInfoConvertEzyTouchInfo", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "Lcom/zykj/blackboard/core/data/dao/TouchEventEntity;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EntityConvertEzy {

    @NotNull
    public static final EntityConvertEzy INSTANCE = new EntityConvertEzy();

    private EntityConvertEzy() {
    }

    @Nullable
    public final EzyCommand$CommandSource.CommandInfo commandInfoConvertEzyCommandInfo(@Nullable CommandInfoEntity entity) {
        if (entity == null) {
            return null;
        }
        C4362e c4362eNewBuilder = EzyCommand$CommandSource.CommandInfo.newBuilder();
        c4362eNewBuilder.m3727k(entity.getDelayTime());
        c4362eNewBuilder.m3728l(entity.getDuration());
        c4362eNewBuilder.m3729m(entity.isPlay());
        c4362eNewBuilder.m3725i(entity.getCommandEnum());
        c4362eNewBuilder.m3726j(ByteString.copyFrom(entity.getData()));
        return c4362eNewBuilder.build();
    }

    @Nullable
    public final EzySource$FileSource.FileInfo fileInfoConvertEzyFileInfo(@Nullable FileInfoEntity entity) {
        if (entity == null) {
            return null;
        }
        C4375k0 c4375k0NewBuilder = EzySource$FileSource.FileInfo.newBuilder();
        String fileName = entity.getFileName();
        c4375k0NewBuilder.getClass();
        fileName.getClass();
        c4375k0NewBuilder.f5523b = fileName;
        c4375k0NewBuilder.f5522a |= 1;
        c4375k0NewBuilder.onChanged();
        c4375k0NewBuilder.f5524c = entity.getWidth();
        c4375k0NewBuilder.f5522a |= 2;
        c4375k0NewBuilder.onChanged();
        c4375k0NewBuilder.f5525d = entity.getHeight();
        c4375k0NewBuilder.f5522a |= 4;
        c4375k0NewBuilder.onChanged();
        String validate = entity.getValidate();
        validate.getClass();
        c4375k0NewBuilder.f5526e = validate;
        c4375k0NewBuilder.f5522a |= 8;
        c4375k0NewBuilder.onChanged();
        return c4375k0NewBuilder.build();
    }

    @Nullable
    public final EzySource$GeometrySource.GeometryInfo geometryInfoConvertEzyGeometryInfo(@Nullable GeometryInfoEntity entity) {
        if (entity == null) {
            return null;
        }
        C4381n0 c4381n0NewBuilder = EzySource$GeometrySource.GeometryInfo.newBuilder();
        c4381n0NewBuilder.m3789h().m2103i(entity.getColor());
        c4381n0NewBuilder.m3789h().m2108n(entity.getWidth());
        c4381n0NewBuilder.m3789h().m2106l(entity.getStyle());
        c4381n0NewBuilder.m3789h().m2107m(entity.getTextSize());
        c4381n0NewBuilder.f5534b = entity.getGeometryType();
        c4381n0NewBuilder.f5533a |= 1;
        c4381n0NewBuilder.onChanged();
        for (GeometryPointFEntity geometryPointFEntity : entity.getPointList()) {
            C3172u0 c3172u0NewBuilder = EzyPointF$PointF.newBuilder();
            c3172u0NewBuilder.m2130i(geometryPointFEntity.getX());
            c3172u0NewBuilder.m2131j(geometryPointFEntity.getY());
            EzyPointF$PointF ezyPointF$PointFBuild = c3172u0NewBuilder.build();
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4381n0NewBuilder.f5536d;
            if (repeatedFieldBuilderV3 == null) {
                c4381n0NewBuilder.m3788g();
                c4381n0NewBuilder.f5535c.add(ezyPointF$PointFBuild);
                c4381n0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(ezyPointF$PointFBuild);
            }
        }
        return c4381n0NewBuilder.build();
    }

    @Nullable
    public final EzySource$MatrixSource.MatrixInfo matrixEventConvertEzyMatrixInfo(@Nullable MatrixEventEntity entity) {
        if (entity == null) {
            return null;
        }
        C4387q0 c4387q0NewBuilder = EzySource$MatrixSource.MatrixInfo.newBuilder();
        for (MatrixInfoEntity matrixInfoEntity : entity.getMatrixInfo()) {
            C3115b0 c3115b0NewBuilder = EzyMatrix$Matrix.newBuilder();
            AbstractC5830k.m5329f(c3115b0NewBuilder, "newBuilder()");
            c3115b0NewBuilder.m2075i(matrixInfoEntity.getEventTime());
            c3115b0NewBuilder.m2079m(matrixInfoEntity.getScaleX());
            c3115b0NewBuilder.m2081o(matrixInfoEntity.getSkewX());
            c3115b0NewBuilder.m2083q(matrixInfoEntity.getTransX());
            c3115b0NewBuilder.m2082p(matrixInfoEntity.getSkewY());
            c3115b0NewBuilder.m2080n(matrixInfoEntity.getScaleY());
            c3115b0NewBuilder.m2084r(matrixInfoEntity.getTransY());
            c3115b0NewBuilder.m2076j(matrixInfoEntity.getPerSp0());
            c3115b0NewBuilder.m2077k(matrixInfoEntity.getPerSp1());
            c3115b0NewBuilder.m2078l(matrixInfoEntity.getPerSp2());
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4387q0NewBuilder.f5566c;
            if (repeatedFieldBuilderV3 == null) {
                c4387q0NewBuilder.ensureMatrixIsMutable();
                c4387q0NewBuilder.f5565b.add(c3115b0NewBuilder.build());
                c4387q0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c3115b0NewBuilder.build());
            }
        }
        return c4387q0NewBuilder.build();
    }

    @Nullable
    public final EzySource$TextSource.TextInfo textInfoConvertEzyTextInfo(@Nullable TextInfoEntity entity) {
        if (entity == null) {
            return null;
        }
        C4393t0 c4393t0NewBuilder = EzySource$TextSource.TextInfo.newBuilder();
        c4393t0NewBuilder.m3838g().m2103i(entity.getColor());
        c4393t0NewBuilder.m3838g().m2108n(entity.getWidth());
        c4393t0NewBuilder.m3838g().m2106l(entity.getStyle());
        c4393t0NewBuilder.m3838g().m2107m(entity.getTextSize());
        String content = entity.getContent();
        content.getClass();
        c4393t0NewBuilder.f5580b = content;
        c4393t0NewBuilder.f5579a |= 1;
        c4393t0NewBuilder.onChanged();
        return c4393t0NewBuilder.build();
    }

    @Nullable
    public final EzySource$TouchSource.TouchInfo touchInfoConvertEzyTouchInfo(@Nullable TouchEventEntity entity) {
        if (entity == null) {
            return null;
        }
        C4399w0 c4399w0NewBuilder = EzySource$TouchSource.TouchInfo.newBuilder();
        c4399w0NewBuilder.m3855g().m2103i(entity.getColor());
        c4399w0NewBuilder.m3855g().m2108n(entity.getWidth());
        c4399w0NewBuilder.m3855g().m2105k(entity.getSpacing());
        c4399w0NewBuilder.m3855g().m2104j(entity.getItemLength());
        c4399w0NewBuilder.m3855g().m2106l(entity.getStyle());
        c4399w0NewBuilder.m3855g().m2107m(entity.getTextSize());
        for (TouchInfoEntity touchInfoEntity : entity.getTouchInfoList()) {
            C4401x0 c4401x0NewBuilder = EzyTouchEvent$TouchEvent.newBuilder();
            AbstractC5830k.m5329f(c4401x0NewBuilder, "newBuilder()");
            c4401x0NewBuilder.m3870i(touchInfoEntity.getEventTime());
            c4401x0NewBuilder.m3871j(touchInfoEntity.getX());
            c4401x0NewBuilder.m3872k(touchInfoEntity.getY());
            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = c4399w0NewBuilder.f5591c;
            if (repeatedFieldBuilderV3 == null) {
                c4399w0NewBuilder.ensureTouchEventIsMutable();
                c4399w0NewBuilder.f5590b.add(c4401x0NewBuilder.build());
                c4399w0NewBuilder.onChanged();
            } else {
                repeatedFieldBuilderV3.addMessage(c4401x0NewBuilder.build());
            }
        }
        return c4399w0NewBuilder.build();
    }
}
