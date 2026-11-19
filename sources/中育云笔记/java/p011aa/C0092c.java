package p011aa;

import com.google.protobuf.Any;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyCommandEnum;
import ga.InterfaceC9284d;
import kotlin.jvm.internal.AbstractC9979u;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12027a;
import p437z9.AbstractC12031e;

/* renamed from: aa.c */
/* loaded from: classes5.dex */
public final class C0092c extends AbstractC12027a {

    /* renamed from: a */
    public final C0096g f82a;

    /* renamed from: b */
    public final C0098i f83b;

    /* renamed from: c */
    public final C0097h f84c;

    /* renamed from: d */
    public final C0091b f85d;

    /* renamed from: e */
    public final C0090a f86e;

    /* renamed from: f */
    public final C0093d f87f;

    /* renamed from: g */
    public final C0095f f88g;

    /* renamed from: h */
    public final C0100k f89h;

    /* renamed from: i */
    public final C0094e f90i;

    /* renamed from: j */
    public final C0099j f91j;

    /* renamed from: aa.c$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f92a;

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
            f92a = iArr;
        }
    }

    public C0092c(InterfaceC9284d sourceLoader, C11373a matrixAdapter, InterfaceC11552c graphControl) {
        AbstractC9979u.m20294g(sourceLoader, "sourceLoader");
        AbstractC9979u.m20294g(matrixAdapter, "matrixAdapter");
        AbstractC9979u.m20294g(graphControl, "graphControl");
        this.f82a = new C0096g(sourceLoader, matrixAdapter, graphControl);
        this.f83b = new C0098i(sourceLoader, graphControl);
        this.f84c = new C0097h(sourceLoader, graphControl);
        this.f85d = new C0091b(sourceLoader, matrixAdapter, graphControl);
        this.f86e = new C0090a(matrixAdapter, graphControl);
        this.f87f = new C0093d(sourceLoader, graphControl);
        this.f88g = new C0095f(sourceLoader, graphControl);
        this.f89h = new C0100k(sourceLoader, graphControl);
        this.f90i = new C0094e(sourceLoader, matrixAdapter, graphControl);
        this.f91j = new C0099j(sourceLoader, graphControl);
    }

    @Override // p437z9.AbstractC12027a
    /* renamed from: c */
    public AbstractC12031e mo255c(boolean z10, EzyCommand.CommandSource.CommandInfo command, long j10) {
        AbstractC9979u.m20294g(command, "command");
        EzyCommandEnum.CommandEnum commandEnumM14693k = command.m14693k();
        switch (commandEnumM14693k == null ? -1 : a.f92a[commandEnumM14693k.ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m14979L(command.m14695n());
                if (z10) {
                    C0096g c0096g = this.f82a;
                    AbstractC9979u.m20293f(data, "data");
                    return c0096g.m263a(data, j10);
                }
                C0096g c0096g2 = this.f82a;
                AbstractC9979u.m20293f(data, "data");
                c0096g2.m264b(data);
                return null;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m15099p(command.m14695n());
                if (z10) {
                    C0098i c0098i = this.f83b;
                    AbstractC9979u.m20293f(data2, "data");
                    c0098i.m267a(data2, j10);
                    return null;
                }
                C0098i c0098i2 = this.f83b;
                AbstractC9979u.m20293f(data2, "data");
                c0098i2.m268b(data2);
                return null;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m15038H(command.m14695n());
                if (z10) {
                    C0097h c0097h = this.f84c;
                    AbstractC9979u.m20293f(data3, "data");
                    return c0097h.m265a(data3, j10);
                }
                C0097h c0097h2 = this.f84c;
                AbstractC9979u.m20293f(data3, "data");
                c0097h2.m266b(data3);
                return null;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m14741t(command.m14695n());
                if (z10) {
                    C0090a c0090a = this.f86e;
                    AbstractC9979u.m20293f(data4, "data");
                    return c0090a.m251a(data4, j10);
                }
                C0090a c0090a2 = this.f86e;
                AbstractC9979u.m20293f(data4, "data");
                c0090a2.m252b(data4);
                return null;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m14778A(command.m14695n());
                if (z10) {
                    C0091b c0091b = this.f85d;
                    AbstractC9979u.m20293f(data5, "data");
                    return c0091b.m253a(data5, j10);
                }
                C0091b c0091b2 = this.f85d;
                AbstractC9979u.m20293f(data5, "data");
                c0091b2.m254b(data5);
                return null;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m14827A(command.m14695n());
                if (z10) {
                    C0093d c0093d = this.f87f;
                    AbstractC9979u.m20293f(data6, "data");
                    return c0093d.m257a(data6, j10);
                }
                C0093d c0093d2 = this.f87f;
                AbstractC9979u.m20293f(data6, "data");
                c0093d2.m258b(data6);
                return null;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m14909N(command.m14695n());
                if (z10) {
                    C0095f c0095f = this.f88g;
                    AbstractC9979u.m20293f(data7, "data");
                    return c0095f.m261a(data7, j10);
                }
                C0095f c0095f2 = this.f88g;
                AbstractC9979u.m20293f(data7, "data");
                c0095f2.m262b(data7);
                return null;
            case 8:
                Any data8 = Any.parseFrom(command.m14695n());
                if (z10) {
                    C0100k c0100k = this.f89h;
                    AbstractC9979u.m20293f(data8, "data");
                    return c0100k.m271a(data8, j10);
                }
                C0100k c0100k2 = this.f89h;
                AbstractC9979u.m20293f(data8, "data");
                c0100k2.m272b(data8);
                return null;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m14881p(command.m14695n());
                if (z10) {
                    C0094e c0094e = this.f90i;
                    AbstractC9979u.m20293f(data9, "data");
                    return c0094e.m259a(data9, j10);
                }
                C0094e c0094e2 = this.f90i;
                AbstractC9979u.m20293f(data9, "data");
                c0094e2.m260b(data9);
                return null;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m15135v(command.m14695n());
                if (z10) {
                    C0099j c0099j = this.f91j;
                    AbstractC9979u.m20293f(data10, "data");
                    return c0099j.m269a(data10, j10);
                }
                C0099j c0099j2 = this.f91j;
                AbstractC9979u.m20293f(data10, "data");
                c0099j2.m270b(data10);
                return null;
            default:
                return null;
        }
    }

    @Override // p437z9.AbstractC12027a
    /* renamed from: d */
    public void mo256d(CommandInfoEntity command) {
        AbstractC9979u.m20294g(command, "command");
        switch (a.f92a[command.m14051a().ordinal()]) {
            case 1:
                EzyCommand.CommandSource.CommandInfo.GraphData data = EzyCommand.CommandSource.CommandInfo.GraphData.m14980M(command.m14052b());
                C0096g c0096g = this.f82a;
                AbstractC9979u.m20293f(data, "data");
                c0096g.m264b(data);
                break;
            case 2:
                EzyCommand.CommandSource.CommandInfo.GraphRemove data2 = EzyCommand.CommandSource.CommandInfo.GraphRemove.m15100r(command.m14052b());
                C0098i c0098i = this.f83b;
                AbstractC9979u.m20293f(data2, "data");
                c0098i.m268b(data2);
                break;
            case 3:
                EzyCommand.CommandSource.CommandInfo.GraphMatrix data3 = EzyCommand.CommandSource.CommandInfo.GraphMatrix.m15039I(command.m14052b());
                C0097h c0097h = this.f84c;
                AbstractC9979u.m20293f(data3, "data");
                c0097h.m266b(data3);
                break;
            case 4:
                EzyCommand.CommandSource.CommandInfo.Camera data4 = EzyCommand.CommandSource.CommandInfo.Camera.m14742u(command.m14052b());
                C0090a c0090a = this.f86e;
                AbstractC9979u.m20293f(data4, "data");
                c0090a.m252b(data4);
                break;
            case 5:
                EzyCommand.CommandSource.CommandInfo.CameraMatrix data5 = EzyCommand.CommandSource.CommandInfo.CameraMatrix.m14779C(command.m14052b());
                C0091b c0091b = this.f85d;
                AbstractC9979u.m20293f(data5, "data");
                c0091b.m254b(data5);
                break;
            case 6:
                EzyCommand.CommandSource.CommandInfo.Config data6 = EzyCommand.CommandSource.CommandInfo.Config.m14828C(command.m14052b());
                C0093d c0093d = this.f87f;
                AbstractC9979u.m20293f(data6, "data");
                c0093d.m258b(data6);
                break;
            case 7:
                EzyCommand.CommandSource.CommandInfo.GraphChange data7 = EzyCommand.CommandSource.CommandInfo.GraphChange.m14910O(command.m14052b());
                C0095f c0095f = this.f88g;
                AbstractC9979u.m20293f(data7, "data");
                c0095f.m262b(data7);
                break;
            case 8:
                Any data8 = Any.parseFrom(command.m14052b());
                C0100k c0100k = this.f89h;
                AbstractC9979u.m20293f(data8, "data");
                c0100k.m272b(data8);
                break;
            case 9:
                EzyCommand.CommandSource.CommandInfo.CursorMove data9 = EzyCommand.CommandSource.CommandInfo.CursorMove.m14882r(command.m14052b());
                C0094e c0094e = this.f90i;
                AbstractC9979u.m20293f(data9, "data");
                c0094e.m260b(data9);
                break;
            case 10:
                EzyCommand.CommandSource.CommandInfo.REBUILD data10 = EzyCommand.CommandSource.CommandInfo.REBUILD.m15136y(command.m14052b());
                C0099j c0099j = this.f91j;
                AbstractC9979u.m20293f(data10, "data");
                c0099j.m270b(data10);
                break;
        }
    }
}
