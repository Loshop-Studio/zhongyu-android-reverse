package p275w4;

import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRouterRecord;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p131j4.C7792a;
import p142k4.InterfaceC7880c;
import p188o4.AbstractC8700a;
import p188o4.AbstractC8704e;
import p188o4.C8701b;
import p188o4.InterfaceC8703d;
import p265v4.InterfaceC9668d;
import p285x4.C9850c;

/* renamed from: w4.h */
/* loaded from: classes4.dex */
public final class C9743h extends AbstractC8704e {

    /* renamed from: h */
    public long f17141h;

    /* renamed from: i */
    public long f17142i;

    /* renamed from: j */
    public ListIterator f17143j;

    /* renamed from: l */
    public ListIterator f17145l;

    /* renamed from: o */
    public long f17148o;

    /* renamed from: p */
    public AbstractC8700a f17149p;

    /* renamed from: k */
    public String f17144k = "";

    /* renamed from: m */
    public final ExecutorService f17146m = Executors.newSingleThreadExecutor();

    /* renamed from: n */
    public List f17147n = new ArrayList();

    /* renamed from: q */
    public int f17150q = -1;

    /* renamed from: w4.h$a */
    public static final class a implements InterfaceC8703d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC8704e f17152b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f17153c;

        public a(AbstractC8704e abstractC8704e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f17152b = abstractC8704e;
            this.f17153c = commandInfo;
        }

        @Override // p188o4.InterfaceC8703d
        /* renamed from: a */
        public void mo14317a(AbstractC8704e thread, boolean z9) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            C9743h.this.f17147n.remove(thread);
            if (!z9 || this.f17152b.m14324g() == null) {
                return;
            }
            C9743h c9743h = C9743h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f17153c;
            AbstractC8700a abstractC8700a = c9743h.f17149p;
            if (abstractC8700a != null) {
                abstractC8700a.m14307b(commandInfo);
            }
        }
    }

    /* renamed from: w4.h$b */
    public static final class b implements InterfaceC8703d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC8704e f17155b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f17156c;

        public b(AbstractC8704e abstractC8704e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f17155b = abstractC8704e;
            this.f17156c = commandInfo;
        }

        @Override // p188o4.InterfaceC8703d
        /* renamed from: a */
        public void mo14317a(AbstractC8704e thread, boolean z9) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            C9743h.this.f17147n.remove(thread);
            if (!z9 || this.f17155b.m14324g() == null) {
                return;
            }
            C9743h c9743h = C9743h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f17156c;
            AbstractC8700a abstractC8700a = c9743h.f17149p;
            if (abstractC8700a != null) {
                abstractC8700a.m14307b(commandInfo);
            }
        }
    }

    /* renamed from: A */
    private final boolean m16331A() throws IOException {
        ListIterator listIterator = this.f17145l;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next();
        FileInputStream fileInputStream = new FileInputStream(new File(this.f17144k, sourceCommandRecord.getFileName()));
        EzyCommand.CommandSource commandSourceM6942u = EzyCommand.CommandSource.m6942u(fileInputStream);
        this.f17143j = commandSourceM6942u.m6944m().listIterator();
        System.out.println((Object) ("命令文件名=" + sourceCommandRecord.getFileName() + "  命令长度=" + commandSourceM6942u.m6944m().size()));
        fileInputStream.close();
        return true;
    }

    /* renamed from: B */
    private final boolean m16332B(ListIterator listIterator) {
        AbstractC8704e abstractC8704eM14306a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (commandInfo.m6965x()) {
                InterfaceC7880c interfaceC7880cM14319b = m14319b();
                if (interfaceC7880cM14319b != null && !interfaceC7880cM14319b.mo13421H()) {
                    InterfaceC7880c interfaceC7880cM14319b2 = m14319b();
                    if (interfaceC7880cM14319b2 != null) {
                        interfaceC7880cM14319b2.mo13444i(true);
                    }
                    InterfaceC7880c interfaceC7880cM14319b3 = m14319b();
                    if (interfaceC7880cM14319b3 != null) {
                        interfaceC7880cM14319b3.mo13440e();
                    }
                }
                if (this.f17142i < commandInfo.m6963v()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    return false;
                }
                if (m16335z(commandInfo)) {
                    AbstractC8700a abstractC8700a = this.f17149p;
                    if (abstractC8700a != null && (abstractC8704eM14306a = abstractC8700a.m14306a(commandInfo, this.f17142i - commandInfo.m6963v())) != null) {
                        abstractC8704eM14306a.m14330p(m14322e());
                        abstractC8704eM14306a.m14318a().add(new b(abstractC8704eM14306a, commandInfo));
                        abstractC8704eM14306a.mo14333t();
                        this.f17147n.add(abstractC8704eM14306a);
                        this.f17146m.execute(abstractC8704eM14306a);
                    }
                } else {
                    AbstractC8700a abstractC8700a2 = this.f17149p;
                    if (abstractC8700a2 != null) {
                        abstractC8700a2.m14307b(commandInfo);
                    }
                }
                this.f17142i -= commandInfo.m6963v() + commandInfo.m6964w();
            } else {
                InterfaceC7880c interfaceC7880cM14319b4 = m14319b();
                if (interfaceC7880cM14319b4 != null) {
                    interfaceC7880cM14319b4.mo13444i(false);
                }
                AbstractC8700a abstractC8700a3 = this.f17149p;
                if (abstractC8700a3 != null) {
                    abstractC8700a3.m14307b(commandInfo);
                }
            }
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m16335z(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m6964w() != 0 && this.f17142i >= commandInfo.m6963v() && this.f17142i < commandInfo.m6963v() + commandInfo.m6964w();
    }

    /* renamed from: C */
    public final void m16336C(long j10) throws InterruptedException, IOException {
        this.f17141h = j10;
        this.f17142i = j10;
        ListIterator listIterator = this.f17145l;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo6784s();
        }
        Thread.sleep(50L);
        this.f17147n.clear();
        m16331A();
        m16340x(j10);
    }

    /* renamed from: D */
    public final void m16337D(long j10) {
        this.f17148o = j10;
    }

    /* renamed from: E */
    public final void m16338E(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f17145l = C9850c.f17405d.m16499c(path).m8097E().listIterator();
        this.f17144k = path;
        m16331A();
    }

    /* renamed from: F */
    public final void m16339F(int i10) {
        this.f17150q = i10;
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: k */
    public void mo6781k() {
        super.mo6781k();
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo6781k();
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: l */
    public void mo6782l() {
        super.mo6782l();
        this.f17142i = 0L;
        this.f17141h = 0L;
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo6784s();
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: m */
    public void mo6783m() {
        super.mo6783m();
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo6783m();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        InterfaceC9668d interfaceC9668dM14324g;
        InterfaceC7880c interfaceC7880cM14319b;
        C7792a c7792aM14320c;
        if (this.f17149p == null && (interfaceC9668dM14324g = m14324g()) != null && (interfaceC7880cM14319b = m14319b()) != null && (c7792aM14320c = m14320c()) != null) {
            this.f17149p = C8701b.f14468a.m14310a(this.f17150q, interfaceC9668dM14324g, c7792aM14320c, interfaceC7880cM14319b);
        }
        if (m14323f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m14323f() == PlayStatus.RECORD_END) {
            this.f17141h = 0L;
            this.f17142i = 0L;
            return;
        }
        while (m16332B(this.f17143j) && ((m14323f() == PlayStatus.RECORD_START || m14323f() == PlayStatus.RECORD_RESUME) && m16331A())) {
        }
        this.f17142i = this.f17142i + (m14322e() != null ? r2.m12008a() : 16);
        long jM12008a = this.f17141h + (m14322e() != null ? r2.m12008a() : 16);
        this.f17141h = jM12008a;
        if (jM12008a <= this.f17148o + (m14322e() != null ? r2.m12008a() : 16)) {
            m14327j(this.f17141h);
            return;
        }
        mo6785u();
        m14327j(this.f17148o);
        InterfaceC7880c interfaceC7880cM14319b2 = m14319b();
        if (interfaceC7880cM14319b2 != null) {
            interfaceC7880cM14319b2.mo13444i(true);
        }
        InterfaceC7880c interfaceC7880cM14319b3 = m14319b();
        if (interfaceC7880cM14319b3 != null) {
            interfaceC7880cM14319b3.mo13440e();
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: s */
    public void mo6784s() {
        super.mo6784s();
        synchronized (this.f17147n) {
            try {
                Iterator it = this.f17147n.iterator();
                while (it.hasNext()) {
                    ((AbstractC8704e) it.next()).mo6784s();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f17146m.shutdown();
        this.f17145l = null;
        this.f17143j = null;
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: t */
    public void mo14333t() {
        super.mo14333t();
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo14333t();
        }
    }

    @Override // p188o4.AbstractC8704e
    /* renamed from: u */
    public void mo6785u() {
        super.mo6785u();
        Iterator it = this.f17147n.iterator();
        while (it.hasNext()) {
            ((AbstractC8704e) it.next()).mo6785u();
        }
    }

    /* renamed from: x */
    public final void m16340x(long j10) {
        System.out.println((Object) "即将快进");
        while (!m16341y(this.f17143j)) {
            if (!m16331A()) {
                System.out.println((Object) ("快进结束 nextCommandTime = " + this.f17142i));
                m14331q((1 > j10 || j10 >= this.f17148o) ? PlayStatus.RECORD_END : PlayStatus.RECORD_PAUSE);
                return;
            }
            System.out.println((Object) "装载了下一个 命令集合");
        }
    }

    /* renamed from: y */
    public final boolean m16341y(ListIterator listIterator) {
        AbstractC8704e abstractC8704eM14306a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f17142i < commandInfo.m6963v()) {
                System.out.println((Object) ("快进时，时间没到,快进即将结束 nextCommandTime = " + this.f17142i + "  next.delayTime = " + commandInfo.m6963v()));
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return true;
            }
            if (m16335z(commandInfo) && commandInfo.m6965x()) {
                System.out.println((Object) ("快进到需要播放的指令 nextCommandTime = " + this.f17142i + "  next.delayTime = " + commandInfo.m6963v()));
                InterfaceC7880c interfaceC7880cM14319b = m14319b();
                if (interfaceC7880cM14319b != null && !interfaceC7880cM14319b.mo13421H()) {
                    InterfaceC7880c interfaceC7880cM14319b2 = m14319b();
                    if (interfaceC7880cM14319b2 != null) {
                        interfaceC7880cM14319b2.mo13444i(true);
                    }
                    InterfaceC7880c interfaceC7880cM14319b3 = m14319b();
                    if (interfaceC7880cM14319b3 != null) {
                        interfaceC7880cM14319b3.mo13440e();
                    }
                }
                AbstractC8700a abstractC8700a = this.f17149p;
                if (abstractC8700a != null && (abstractC8704eM14306a = abstractC8700a.m14306a(commandInfo, this.f17142i - commandInfo.m6963v())) != null) {
                    System.out.println((Object) ("即将异步执行播放指令 " + abstractC8704eM14306a.getClass().getName()));
                    abstractC8704eM14306a.m14330p(m14322e());
                    abstractC8704eM14306a.m14318a().add(new a(abstractC8704eM14306a, commandInfo));
                    abstractC8704eM14306a.mo6781k();
                    this.f17147n.add(abstractC8704eM14306a);
                    this.f17146m.execute(abstractC8704eM14306a);
                }
            } else {
                AbstractC8700a abstractC8700a2 = this.f17149p;
                if (abstractC8700a2 != null) {
                    abstractC8700a2.m14307b(commandInfo);
                }
            }
            if (commandInfo.m6965x()) {
                this.f17142i -= commandInfo.m6963v() + commandInfo.m6964w();
            }
            System.out.println((Object) ("快进中 nextCommandTime = " + this.f17142i));
        }
        System.out.println((Object) "快进中 没有命令啦！！！，赶快去装载下个指令集合");
        return false;
    }
}
