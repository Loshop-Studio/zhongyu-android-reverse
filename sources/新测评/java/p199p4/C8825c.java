package p199p4;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import kotlin.jvm.internal.Intrinsics;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8700a;
import p188o4.AbstractC8704e;
import p265v4.InterfaceC9668d;

/* renamed from: p4.c */
/* loaded from: classes4.dex */
public final class C8825c extends AbstractC8700a {

    /* renamed from: a */
    public final C8829g f15009a;

    /* renamed from: b */
    public final C8831i f15010b;

    /* renamed from: c */
    public final C8830h f15011c;

    /* renamed from: d */
    public final C8824b f15012d;

    /* renamed from: e */
    public final C8823a f15013e;

    /* renamed from: f */
    public final C8826d f15014f;

    /* renamed from: g */
    public final C8828f f15015g;

    /* renamed from: h */
    public final C8833k f15016h;

    /* renamed from: i */
    public final C8827e f15017i;

    /* renamed from: j */
    public final C8832j f15018j;

    /* renamed from: p4.c$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15019a;

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
            f15019a = iArr;
        }
    }

    public C8825c(InterfaceC9668d sourceLoader, C7792a matrixAdapter, InterfaceC7880c graphControl) {
        Intrinsics.checkNotNullParameter(sourceLoader, "sourceLoader");
        Intrinsics.checkNotNullParameter(matrixAdapter, "matrixAdapter");
        Intrinsics.checkNotNullParameter(graphControl, "graphControl");
        this.f15009a = new C8829g(sourceLoader, matrixAdapter, graphControl);
        this.f15010b = new C8831i(sourceLoader, graphControl);
        this.f15011c = new C8830h(sourceLoader, graphControl);
        this.f15012d = new C8824b(sourceLoader, matrixAdapter, graphControl);
        this.f15013e = new C8823a(matrixAdapter, graphControl);
        this.f15014f = new C8826d(sourceLoader, graphControl);
        this.f15015g = new C8828f(sourceLoader, graphControl);
        this.f15016h = new C8833k(sourceLoader, graphControl);
        this.f15017i = new C8827e(sourceLoader, matrixAdapter, graphControl);
        this.f15018j = new C8832j(sourceLoader, graphControl);
    }

    @Override // p188o4.AbstractC8700a
    /* renamed from: c */
    public AbstractC8704e mo14308c(boolean z9, EzyCommand.CommandSource.CommandInfo command, long j10) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(command, "command");
        EzyCommandEnum.CommandEnum commandEnumM6959q = command.m6959q();
        switch (commandEnumM6959q == null ? -1 : a.f15019a[commandEnumM6959q.ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m7243L(command.m6961s());
                if (z9) {
                    C8829g c8829g = this.f15009a;
                    Intrinsics.checkNotNullExpressionValue(data, "data");
                    return c8829g.m14794a(data, j10);
                }
                C8829g c8829g2 = this.f15009a;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                c8829g2.m14795b(data);
                return null;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7363u(command.m6961s());
                if (z9) {
                    C8831i c8831i = this.f15010b;
                    Intrinsics.checkNotNullExpressionValue(data2, "data");
                    c8831i.m14798a(data2, j10);
                    return null;
                }
                C8831i c8831i2 = this.f15010b;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                c8831i2.m14799b(data2);
                return null;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7302H(command.m6961s());
                if (z9) {
                    C8830h c8830h = this.f15011c;
                    Intrinsics.checkNotNullExpressionValue(data3, "data");
                    return c8830h.m14796a(data3, j10);
                }
                C8830h c8830h2 = this.f15011c;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                c8830h2.m14797b(data3);
                return null;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m7006w(command.m6961s());
                if (z9) {
                    C8823a c8823a = this.f15013e;
                    Intrinsics.checkNotNullExpressionValue(data4, "data");
                    return c8823a.m14784a(data4, j10);
                }
                C8823a c8823a2 = this.f15013e;
                Intrinsics.checkNotNullExpressionValue(data4, "data");
                c8823a2.m14785b(data4);
                return null;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7043B(command.m6961s());
                if (z9) {
                    C8824b c8824b = this.f15012d;
                    Intrinsics.checkNotNullExpressionValue(data5, "data");
                    return c8824b.m14786a(data5, j10);
                }
                C8824b c8824b2 = this.f15012d;
                Intrinsics.checkNotNullExpressionValue(data5, "data");
                c8824b2.m14787b(data5);
                return null;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m7092B(command.m6961s());
                if (z9) {
                    C8826d c8826d = this.f15014f;
                    Intrinsics.checkNotNullExpressionValue(data6, "data");
                    return c8826d.m14788a(data6, j10);
                }
                C8826d c8826d2 = this.f15014f;
                Intrinsics.checkNotNullExpressionValue(data6, "data");
                c8826d2.m14789b(data6);
                return null;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m7175M(command.m6961s());
                if (z9) {
                    C8828f c8828f = this.f15015g;
                    Intrinsics.checkNotNullExpressionValue(data7, "data");
                    return c8828f.m14792a(data7, j10);
                }
                C8828f c8828f2 = this.f15015g;
                Intrinsics.checkNotNullExpressionValue(data7, "data");
                c8828f2.m14793b(data7);
                return null;
            case 8:
                Any data8 = Any.parseFrom(command.m6961s());
                if (z9) {
                    C8833k c8833k = this.f15016h;
                    Intrinsics.checkNotNullExpressionValue(data8, "data");
                    return c8833k.m14802a(data8, j10);
                }
                C8833k c8833k2 = this.f15016h;
                Intrinsics.checkNotNullExpressionValue(data8, "data");
                c8833k2.m14803b(data8);
                return null;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m7146u(command.m6961s());
                if (z9) {
                    C8827e c8827e = this.f15017i;
                    Intrinsics.checkNotNullExpressionValue(data9, "data");
                    return c8827e.m14790a(data9, j10);
                }
                C8827e c8827e2 = this.f15017i;
                Intrinsics.checkNotNullExpressionValue(data9, "data");
                c8827e2.m14791b(data9);
                return null;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m7399y(command.m6961s());
                if (z9) {
                    C8832j c8832j = this.f15018j;
                    Intrinsics.checkNotNullExpressionValue(data10, "data");
                    return c8832j.m14800a(data10, j10);
                }
                C8832j c8832j2 = this.f15018j;
                Intrinsics.checkNotNullExpressionValue(data10, "data");
                c8832j2.m14801b(data10);
                return null;
            default:
                return null;
        }
    }

    @Override // p188o4.AbstractC8700a
    /* renamed from: d */
    public void mo14309d(CommandInfoEntity command) throws InvalidProtocolBufferException {
        Intrinsics.checkNotNullParameter(command, "command");
        switch (a.f15019a[command.getCommandEnum().ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m7244M(command.getData());
                C8829g c8829g = this.f15009a;
                Intrinsics.checkNotNullExpressionValue(data, "data");
                c8829g.m14795b(data);
                break;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m7364v(command.getData());
                C8831i c8831i = this.f15010b;
                Intrinsics.checkNotNullExpressionValue(data2, "data");
                c8831i.m14799b(data2);
                break;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m7303I(command.getData());
                C8830h c8830h = this.f15011c;
                Intrinsics.checkNotNullExpressionValue(data3, "data");
                c8830h.m14797b(data3);
                break;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m7007x(command.getData());
                C8823a c8823a = this.f15013e;
                Intrinsics.checkNotNullExpressionValue(data4, "data");
                c8823a.m14785b(data4);
                break;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m7044C(command.getData());
                C8824b c8824b = this.f15012d;
                Intrinsics.checkNotNullExpressionValue(data5, "data");
                c8824b.m14787b(data5);
                break;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m7093C(command.getData());
                C8826d c8826d = this.f15014f;
                Intrinsics.checkNotNullExpressionValue(data6, "data");
                c8826d.m14789b(data6);
                break;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m7176N(command.getData());
                C8828f c8828f = this.f15015g;
                Intrinsics.checkNotNullExpressionValue(data7, "data");
                c8828f.m14793b(data7);
                break;
            case 8:
                Any data8 = Any.parseFrom(command.getData());
                C8833k c8833k = this.f15016h;
                Intrinsics.checkNotNullExpressionValue(data8, "data");
                c8833k.m14803b(data8);
                break;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m7147v(command.getData());
                C8827e c8827e = this.f15017i;
                Intrinsics.checkNotNullExpressionValue(data9, "data");
                c8827e.m14791b(data9);
                break;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m7400z(command.getData());
                C8832j c8832j = this.f15018j;
                Intrinsics.checkNotNullExpressionValue(data10, "data");
                c8832j.m14801b(data10);
                break;
        }
    }
}
