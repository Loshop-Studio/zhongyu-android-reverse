package p106f5;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.internal.Intrinsics;
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7846a;
import p095e5.AbstractC7850e;
import p169l5.InterfaceC8891e;
import p312z4.C9998a;

/* renamed from: f5.c */
/* loaded from: classes4.dex */
public final class C7925c extends AbstractC7846a {

    /* renamed from: a */
    public final C7929g f13357a;

    /* renamed from: b */
    public final C7931i f13358b;

    /* renamed from: c */
    public final C7930h f13359c;

    /* renamed from: d */
    public final C7924b f13360d;

    /* renamed from: e */
    public final C7923a f13361e;

    /* renamed from: f */
    public final C7926d f13362f;

    /* renamed from: g */
    public final C7928f f13363g;

    /* renamed from: h */
    public final C7933k f13364h;

    /* renamed from: i */
    public final C7927e f13365i;

    /* renamed from: j */
    public final C7932j f13366j;

    /* renamed from: f5.c$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13367a;

        static {
            int[] iArr = new int[EzyCommandEnum.CommandEnum.values().length];
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_ADD.ordinal()] = 1;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_REMOVE.ordinal()] = 2;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_MATRIX.ordinal()] = 3;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA.ordinal()] = 4;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CAMERA_MATRIX.ordinal()] = 5;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CONFIG.ordinal()] = 6;
            iArr[EzyCommandEnum.CommandEnum.ACTION_GRAPH_CHANGE.ordinal()] = 7;
            iArr[EzyCommandEnum.CommandEnum.ACTION_RECORD_STOP.ordinal()] = 8;
            iArr[EzyCommandEnum.CommandEnum.ACTION_CURSOR_MOVE.ordinal()] = 9;
            iArr[EzyCommandEnum.CommandEnum.ACTION_REBUILD.ordinal()] = 10;
            f13367a = iArr;
        }
    }

    public C7925c(InterfaceC8891e sourceLoader, C9998a matrixAdapter, InterfaceC0039c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f13357a = new C7929g(sourceLoader, matrixAdapter, graphControl);
        this.f13358b = new C7931i(sourceLoader, graphControl);
        this.f13359c = new C7930h(sourceLoader, graphControl);
        this.f13360d = new C7924b(sourceLoader, matrixAdapter, graphControl);
        this.f13361e = new C7923a(matrixAdapter, graphControl);
        this.f13362f = new C7926d(sourceLoader, graphControl);
        this.f13363g = new C7928f(sourceLoader, graphControl);
        this.f13364h = new C7933k(sourceLoader, graphControl);
        this.f13365i = new C7927e(sourceLoader, matrixAdapter, graphControl);
        this.f13366j = new C7932j(sourceLoader, graphControl);
    }

    @Override // p095e5.AbstractC7846a
    /* renamed from: c */
    public AbstractC7850e mo12299c(boolean z9, EzyCommand.CommandSource.CommandInfo command, long j9) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(command, "command");
        EzyCommandEnum.CommandEnum commandEnumM8077t = command.m8077t();
        switch (commandEnumM8077t == null ? -1 : a.f13367a[commandEnumM8077t.ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m8362O(command.m8079v());
                if (z9) {
                    C7929g c7929g = this.f13357a;
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    return c7929g.m12485a(data, j9);
                }
                C7929g c7929g2 = this.f13357a;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                c7929g2.m12486b(data);
                return null;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m8480x(command.m8079v());
                if (z9) {
                    C7931i c7931i = this.f13358b;
                    Intrinsics.checkNotNullExpressionValue(data2, "data");
                    c7931i.m12489a(data2, j9);
                    return null;
                }
                C7931i c7931i2 = this.f13358b;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                c7931i2.m12490b(data2);
                return null;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m8419K(command.m8079v());
                if (z9) {
                    C7930h c7930h = this.f13359c;
                    Intrinsics.checkNotNullExpressionValue(data3, "data");
                    return c7930h.m12487a(data3, j9);
                }
                C7930h c7930h2 = this.f13359c;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                c7930h2.m12488b(data3);
                return null;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m8123z(command.m8079v());
                if (z9) {
                    C7923a c7923a = this.f13361e;
                    Intrinsics.checkNotNullExpressionValue(data4, "data");
                    return c7923a.m12475a(data4, j9);
                }
                C7923a c7923a2 = this.f13361e;
                Intrinsics.checkNotNullExpressionValue(data4, "data");
                c7923a2.m12476b(data4);
                return null;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m8160E(command.m8079v());
                if (z9) {
                    C7924b c7924b = this.f13360d;
                    Intrinsics.checkNotNullExpressionValue(data5, "data");
                    return c7924b.m12477a(data5, j9);
                }
                C7924b c7924b2 = this.f13360d;
                Intrinsics.checkNotNullExpressionValue(data5, "data");
                c7924b2.m12478b(data5);
                return null;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m8209E(command.m8079v());
                if (z9) {
                    C7926d c7926d = this.f13362f;
                    Intrinsics.checkNotNullExpressionValue(data6, "data");
                    return c7926d.m12479a(data6, j9);
                }
                C7926d c7926d2 = this.f13362f;
                Intrinsics.checkNotNullExpressionValue(data6, "data");
                c7926d2.m12480b(data6);
                return null;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m8294Q(command.m8079v());
                if (z9) {
                    C7928f c7928f = this.f13363g;
                    Intrinsics.checkNotNullExpressionValue(data7, "data");
                    return c7928f.m12483a(data7, j9);
                }
                C7928f c7928f2 = this.f13363g;
                Intrinsics.checkNotNullExpressionValue(data7, "data");
                c7928f2.m12484b(data7);
                return null;
            case 8:
                Any data8 = Any.parseFrom(command.m8079v());
                if (z9) {
                    C7933k c7933k = this.f13364h;
                    Intrinsics.checkNotNullExpressionValue(data8, "data");
                    return c7933k.m12493a(data8, j9);
                }
                C7933k c7933k2 = this.f13364h;
                Intrinsics.checkNotNullExpressionValue(data8, "data");
                c7933k2.m12494b(data8);
                return null;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m8262x(command.m8079v());
                if (z9) {
                    C7927e c7927e = this.f13365i;
                    Intrinsics.checkNotNullExpressionValue(data9, "data");
                    return c7927e.m12481a(data9, j9);
                }
                C7927e c7927e2 = this.f13365i;
                Intrinsics.checkNotNullExpressionValue(data9, "data");
                c7927e2.m12482b(data9);
                return null;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m8509B(command.m8079v());
                if (z9) {
                    C7932j c7932j = this.f13366j;
                    Intrinsics.checkNotNullExpressionValue(data10, "data");
                    return c7932j.m12491a(data10, j9);
                }
                C7932j c7932j2 = this.f13366j;
                Intrinsics.checkNotNullExpressionValue(data10, "data");
                c7932j2.m12492b(data10);
                return null;
            default:
                return null;
        }
    }

    @Override // p095e5.AbstractC7846a
    /* renamed from: d */
    public void mo12300d(CommandInfoEntity command) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(command, "command");
        switch (a.f13367a[command.getCommandEnum().ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m8363P(command.getData());
                C7929g c7929g = this.f13357a;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                c7929g.m12486b(data);
                break;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m8481y(command.getData());
                C7931i c7931i = this.f13358b;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                c7931i.m12490b(data2);
                break;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m8420L(command.getData());
                C7930h c7930h = this.f13359c;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                c7930h.m12488b(data3);
                break;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m8117A(command.getData());
                C7923a c7923a = this.f13361e;
                Intrinsics.checkNotNullExpressionValue(data4, "data");
                c7923a.m12476b(data4);
                break;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m8161F(command.getData());
                C7924b c7924b = this.f13360d;
                Intrinsics.checkNotNullExpressionValue(data5, "data");
                c7924b.m12478b(data5);
                break;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m8210F(command.getData());
                C7926d c7926d = this.f13362f;
                Intrinsics.checkNotNullExpressionValue(data6, "data");
                c7926d.m12480b(data6);
                break;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m8295R(command.getData());
                C7928f c7928f = this.f13363g;
                Intrinsics.checkNotNullExpressionValue(data7, "data");
                c7928f.m12484b(data7);
                break;
            case 8:
                Any data8 = Any.parseFrom(command.getData());
                C7933k c7933k = this.f13364h;
                Intrinsics.checkNotNullExpressionValue(data8, "data");
                c7933k.m12494b(data8);
                break;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m8263y(command.getData());
                C7927e c7927e = this.f13365i;
                Intrinsics.checkNotNullExpressionValue(data9, "data");
                c7927e.m12482b(data9);
                break;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m8510C(command.getData());
                C7932j c7932j = this.f13366j;
                Intrinsics.checkNotNullExpressionValue(data10, "data");
                c7932j.m12492b(data10);
                break;
        }
    }
}
