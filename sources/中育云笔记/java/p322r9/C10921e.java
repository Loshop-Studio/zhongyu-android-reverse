package p322r9;

import com.zykj.blackboard.core.action.CursorAction;
import com.zykj.blackboard.core.action.EraseWritingAction;
import com.zykj.blackboard.core.action.GeometryAction;
import com.zykj.blackboard.core.action.SelectAction;
import com.zykj.blackboard.core.action.TextAction;
import com.zykj.blackboard.core.action.WriteBeelineAction;
import com.zykj.blackboard.core.action.WritingAction;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyModeEnum;
import kotlin.jvm.internal.AbstractC9979u;
import ma.InterfaceC10214b;

/* renamed from: r9.e */
/* loaded from: classes5.dex */
public final class C10921e implements InterfaceC10214b {

    /* renamed from: a */
    public final WritingAction f26373a = new WritingAction();

    /* renamed from: b */
    public final WriteBeelineAction f26374b = new WriteBeelineAction();

    /* renamed from: c */
    public final SelectAction f26375c = new SelectAction();

    /* renamed from: d */
    public final EraseWritingAction f26376d = new EraseWritingAction();

    /* renamed from: e */
    public final C10920d f26377e = new C10920d();

    /* renamed from: f */
    public final TextAction f26378f = new TextAction();

    /* renamed from: g */
    public final CursorAction f26379g = new CursorAction();

    /* renamed from: h */
    public final NewSelectAction f26380h = new NewSelectAction();

    /* renamed from: i */
    public final GeometryAction f26381i = new GeometryAction();

    /* renamed from: r9.e$a */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26382a;

        static {
            int[] iArr = new int[EzyModeEnum.ModeEnum.values().length];
            iArr[EzyModeEnum.ModeEnum.ACTION_SELECT.ordinal()] = 1;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING.ordinal()] = 2;
            iArr[EzyModeEnum.ModeEnum.ACTION_WRITING_BEELINE.ordinal()] = 3;
            iArr[EzyModeEnum.ModeEnum.ACTION_ERASER_WRITING.ordinal()] = 4;
            iArr[EzyModeEnum.ModeEnum.ACTION_SEE.ordinal()] = 5;
            iArr[EzyModeEnum.ModeEnum.ACTION_TEXT.ordinal()] = 6;
            iArr[EzyModeEnum.ModeEnum.ACTION_CURSOR.ordinal()] = 7;
            iArr[EzyModeEnum.ModeEnum.ACTION_NEW_SELECT.ordinal()] = 8;
            iArr[EzyModeEnum.ModeEnum.ACTION_GEOMETRY.ordinal()] = 9;
            f26382a = iArr;
        }
    }

    @Override // ma.InterfaceC10214b
    /* renamed from: a */
    public void mo14413a(CommandInfoEntity entity) {
        AbstractC9979u.m20294g(entity, "entity");
    }

    /* renamed from: b */
    public final InterfaceC10919c m23811b(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        switch (a.f26382a[listener.mo23770j().m22918y().ordinal()]) {
            case 1:
                this.f26375c.m13804V();
                return this.f26375c;
            case 2:
                this.f26373a.m13758f0();
                return this.f26373a;
            case 3:
                this.f26374b.m13758f0();
                return this.f26374b;
            case 4:
                this.f26376d.m13785T();
                return this.f26376d;
            case 5:
                this.f26377e.m23800I();
                return this.f26377e;
            case 6:
                this.f26378f.m13832i0();
                return this.f26378f;
            case 7:
                this.f26379g.m13773P();
                return this.f26379g;
            case 8:
                this.f26380h.m13866T();
                return this.f26380h;
            case 9:
                this.f26381i.m13786I();
                return this.f26381i;
            default:
                return null;
        }
    }

    /* renamed from: c */
    public final InterfaceC10919c m23812c(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        switch (a.f26382a[listener.mo23770j().m22918y().ordinal()]) {
            case 1:
                return this.f26375c;
            case 2:
                return this.f26373a;
            case 3:
                return this.f26374b;
            case 4:
                return this.f26376d;
            case 5:
                return this.f26377e;
            case 6:
                return this.f26378f;
            case 7:
                return this.f26379g;
            case 8:
                return this.f26380h;
            case 9:
                return this.f26381i;
            default:
                return null;
        }
    }

    /* renamed from: d */
    public final WritingAction m23813d() {
        return this.f26373a;
    }

    /* renamed from: e */
    public final void m23814e(InterfaceC10918b listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.f26373a.mo13729k(listener);
        this.f26374b.mo13729k(listener);
        this.f26375c.mo13729k(listener);
        this.f26376d.mo13729k(listener);
        this.f26377e.mo13729k(listener);
        this.f26378f.mo13729k(listener);
        this.f26379g.mo13729k(listener);
        this.f26380h.mo13729k(listener);
        this.f26381i.mo13729k(listener);
    }
}
