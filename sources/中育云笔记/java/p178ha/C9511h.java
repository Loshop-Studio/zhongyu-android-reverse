package p178ha;

import com.zykj.blackboard.enums.PlayStatus;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRouterRecord;
import ga.InterfaceC9284d;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC9979u;
import p194ia.C9619c;
import p309qc.C10786q;
import p362u9.C11373a;
import p377v9.InterfaceC11552c;
import p437z9.AbstractC12027a;
import p437z9.AbstractC12031e;
import p437z9.C12028b;
import p437z9.InterfaceC12030d;

/* renamed from: ha.h */
/* loaded from: classes5.dex */
public final class C9511h extends AbstractC12031e {

    /* renamed from: j */
    public long f22013j;

    /* renamed from: k */
    public long f22014k;

    /* renamed from: l */
    public ListIterator f22015l;

    /* renamed from: n */
    public ListIterator f22017n;

    /* renamed from: q */
    public long f22020q;

    /* renamed from: r */
    public AbstractC12027a f22021r;

    /* renamed from: m */
    public String f22016m = "";

    /* renamed from: o */
    public final ExecutorService f22018o = Executors.newSingleThreadExecutor();

    /* renamed from: p */
    public List f22019p = new ArrayList();

    /* renamed from: s */
    public int f22022s = -1;

    /* renamed from: ha.h$a */
    public static final class a implements InterfaceC12030d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC12031e f22024b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f22025c;

        public a(AbstractC12031e abstractC12031e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f22024b = abstractC12031e;
            this.f22025c = commandInfo;
        }

        @Override // p437z9.InterfaceC12030d
        /* renamed from: a */
        public void mo18765a(AbstractC12031e thread, boolean z10) {
            AbstractC9979u.m20294g(thread, "thread");
            C9511h.this.f22019p.remove(thread);
            if (!z10 || this.f22024b.m26648g() == null) {
                return;
            }
            C9511h c9511h = C9511h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f22025c;
            AbstractC12027a abstractC12027a = c9511h.f22021r;
            if (abstractC12027a != null) {
                abstractC12027a.m26636b(commandInfo);
            }
        }
    }

    /* renamed from: ha.h$b */
    public static final class b implements InterfaceC12030d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC12031e f22027b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f22028c;

        public b(AbstractC12031e abstractC12031e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f22027b = abstractC12031e;
            this.f22028c = commandInfo;
        }

        @Override // p437z9.InterfaceC12030d
        /* renamed from: a */
        public void mo18765a(AbstractC12031e thread, boolean z10) {
            AbstractC9979u.m20294g(thread, "thread");
            C9511h.this.f22019p.remove(thread);
            if (!z10 || this.f22027b.m26648g() == null) {
                return;
            }
            C9511h c9511h = C9511h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f22028c;
            AbstractC12027a abstractC12027a = c9511h.f22021r;
            if (abstractC12027a != null) {
                abstractC12027a.m26636b(commandInfo);
            }
        }
    }

    /* renamed from: A */
    private final boolean m18753A() throws IOException {
        ListIterator listIterator = this.f22017n;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next();
        FileInputStream fileInputStream = new FileInputStream(new File(this.f22016m, sourceCommandRecord.getFileName()));
        EzyCommand.CommandSource commandSourceM14677p = EzyCommand.CommandSource.m14677p(fileInputStream);
        this.f22015l = commandSourceM14677p.m14679f().listIterator();
        System.out.println((Object) ("命令文件名=" + sourceCommandRecord.getFileName() + "  命令长度=" + commandSourceM14677p.m14679f().size()));
        fileInputStream.close();
        return true;
    }

    /* renamed from: B */
    private final boolean m18754B(ListIterator listIterator) {
        AbstractC12031e abstractC12031eM26635a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (commandInfo.m14699u()) {
                InterfaceC11552c interfaceC11552cM26643b = m26643b();
                if (interfaceC11552cM26643b != null && !interfaceC11552cM26643b.mo25423I()) {
                    InterfaceC11552c interfaceC11552cM26643b2 = m26643b();
                    if (interfaceC11552cM26643b2 != null) {
                        interfaceC11552cM26643b2.mo25452l(true);
                    }
                    InterfaceC11552c interfaceC11552cM26643b3 = m26643b();
                    if (interfaceC11552cM26643b3 != null) {
                        interfaceC11552cM26643b3.mo25447g();
                    }
                }
                if (this.f22014k < commandInfo.m14697r()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    return false;
                }
                if (m18757z(commandInfo)) {
                    AbstractC12027a abstractC12027a = this.f22021r;
                    if (abstractC12027a != null && (abstractC12031eM26635a = abstractC12027a.m26635a(commandInfo, this.f22014k - commandInfo.m14697r())) != null) {
                        abstractC12031eM26635a.m26654p(m26646e());
                        abstractC12031eM26635a.m26642a().add(new b(abstractC12031eM26635a, commandInfo));
                        abstractC12031eM26635a.mo18762t();
                        this.f22019p.add(abstractC12031eM26635a);
                        this.f22018o.execute(abstractC12031eM26635a);
                    }
                } else {
                    AbstractC12027a abstractC12027a2 = this.f22021r;
                    if (abstractC12027a2 != null) {
                        abstractC12027a2.m26636b(commandInfo);
                    }
                }
                this.f22014k -= commandInfo.m14697r() + commandInfo.m14698t();
            } else {
                InterfaceC11552c interfaceC11552cM26643b4 = m26643b();
                if (interfaceC11552cM26643b4 != null) {
                    interfaceC11552cM26643b4.mo25452l(false);
                }
                AbstractC12027a abstractC12027a3 = this.f22021r;
                if (abstractC12027a3 != null) {
                    abstractC12027a3.m26636b(commandInfo);
                }
            }
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m18757z(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m14698t() != 0 && this.f22014k >= commandInfo.m14697r() && this.f22014k < commandInfo.m14697r() + commandInfo.m14698t();
    }

    /* renamed from: C */
    public final void m18758C(long j10) throws InterruptedException, IOException {
        this.f22013j = j10;
        this.f22014k = j10;
        ListIterator listIterator = this.f22017n;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo14520s();
        }
        Thread.sleep(50L);
        this.f22019p.clear();
        m18753A();
        m18763x(j10);
    }

    /* renamed from: D */
    public final void m18759D(long j10) {
        this.f22020q = j10;
    }

    /* renamed from: E */
    public final void m18760E(String path) throws IOException {
        AbstractC9979u.m20294g(path, "path");
        this.f22017n = C9619c.f22151d.m18864c(path).m15847E().listIterator();
        this.f22016m = path;
        m18753A();
    }

    /* renamed from: F */
    public final void m18761F(int i10) {
        this.f22022s = i10;
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: k */
    public void mo14517k() {
        super.mo14517k();
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo14517k();
        }
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: l */
    public void mo14518l() {
        super.mo14518l();
        this.f22014k = 0L;
        this.f22013j = 0L;
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo14520s();
        }
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: m */
    public void mo14519m() {
        super.mo14519m();
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo14519m();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        InterfaceC9284d interfaceC9284dM26648g;
        InterfaceC11552c interfaceC11552cM26643b;
        C11373a c11373aM26644c;
        if (this.f22021r == null && (interfaceC9284dM26648g = m26648g()) != null && (interfaceC11552cM26643b = m26643b()) != null && (c11373aM26644c = m26644c()) != null) {
            this.f22021r = C12028b.f28398a.m26637a(this.f22022s, interfaceC9284dM26648g, c11373aM26644c, interfaceC11552cM26643b);
        }
        if (m26647f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m26647f() == PlayStatus.RECORD_END) {
            this.f22013j = 0L;
            this.f22014k = 0L;
            return;
        }
        while (m18754B(this.f22015l) && ((m26647f() == PlayStatus.RECORD_START || m26647f() == PlayStatus.RECORD_RESUME) && m18753A())) {
        }
        this.f22014k = this.f22014k + (m26646e() != null ? r2.m22937a() : 16);
        long jM22937a = this.f22013j + (m26646e() != null ? r2.m22937a() : 16);
        this.f22013j = jM22937a;
        if (jM22937a <= this.f22020q + (m26646e() != null ? r2.m22937a() : 16)) {
            m26651j(this.f22013j);
            return;
        }
        mo14521u();
        m26651j(this.f22020q);
        InterfaceC11552c interfaceC11552cM26643b2 = m26643b();
        if (interfaceC11552cM26643b2 != null) {
            interfaceC11552cM26643b2.mo25452l(true);
        }
        InterfaceC11552c interfaceC11552cM26643b3 = m26643b();
        if (interfaceC11552cM26643b3 != null) {
            interfaceC11552cM26643b3.mo25447g();
        }
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: s */
    public void mo14520s() {
        super.mo14520s();
        synchronized (this.f22019p) {
            try {
                Iterator it = this.f22019p.iterator();
                while (it.hasNext()) {
                    ((AbstractC12031e) it.next()).mo14520s();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f22018o.shutdown();
        this.f22017n = null;
        this.f22015l = null;
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: t */
    public void mo18762t() {
        super.mo18762t();
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo18762t();
        }
    }

    @Override // p437z9.AbstractC12031e
    /* renamed from: u */
    public void mo14521u() {
        super.mo14521u();
        Iterator it = this.f22019p.iterator();
        while (it.hasNext()) {
            ((AbstractC12031e) it.next()).mo14521u();
        }
    }

    /* renamed from: x */
    public final void m18763x(long j10) {
        System.out.println((Object) "即将快进");
        while (!m18764y(this.f22015l)) {
            if (!m18753A()) {
                System.out.println((Object) ("快进结束 nextCommandTime = " + this.f22014k));
                m26655q((1 > j10 || j10 >= this.f22020q) ? PlayStatus.RECORD_END : PlayStatus.RECORD_PAUSE);
                return;
            }
            System.out.println((Object) "装载了下一个 命令集合");
        }
    }

    /* renamed from: y */
    public final boolean m18764y(ListIterator listIterator) {
        AbstractC12031e abstractC12031eM26635a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f22014k < commandInfo.m14697r()) {
                System.out.println((Object) ("快进时，时间没到,快进即将结束 nextCommandTime = " + this.f22014k + "  next.delayTime = " + commandInfo.m14697r()));
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return true;
            }
            if (m18757z(commandInfo) && commandInfo.m14699u()) {
                System.out.println((Object) ("快进到需要播放的指令 nextCommandTime = " + this.f22014k + "  next.delayTime = " + commandInfo.m14697r()));
                InterfaceC11552c interfaceC11552cM26643b = m26643b();
                if (interfaceC11552cM26643b != null && !interfaceC11552cM26643b.mo25423I()) {
                    InterfaceC11552c interfaceC11552cM26643b2 = m26643b();
                    if (interfaceC11552cM26643b2 != null) {
                        interfaceC11552cM26643b2.mo25452l(true);
                    }
                    InterfaceC11552c interfaceC11552cM26643b3 = m26643b();
                    if (interfaceC11552cM26643b3 != null) {
                        interfaceC11552cM26643b3.mo25447g();
                    }
                }
                AbstractC12027a abstractC12027a = this.f22021r;
                if (abstractC12027a != null && (abstractC12031eM26635a = abstractC12027a.m26635a(commandInfo, this.f22014k - commandInfo.m14697r())) != null) {
                    System.out.println((Object) ("即将异步执行播放指令 " + abstractC12031eM26635a.getClass().getName()));
                    abstractC12031eM26635a.m26654p(m26646e());
                    abstractC12031eM26635a.m26642a().add(new a(abstractC12031eM26635a, commandInfo));
                    abstractC12031eM26635a.mo14517k();
                    this.f22019p.add(abstractC12031eM26635a);
                    this.f22018o.execute(abstractC12031eM26635a);
                }
            } else {
                AbstractC12027a abstractC12027a2 = this.f22021r;
                if (abstractC12027a2 != null) {
                    abstractC12027a2.m26636b(commandInfo);
                }
            }
            if (commandInfo.m14699u()) {
                this.f22014k -= commandInfo.m14697r() + commandInfo.m14698t();
            }
            System.out.println((Object) ("快进中 nextCommandTime = " + this.f22014k));
        }
        System.out.println((Object) "快进中 没有命令啦！！！，赶快去装载下个指令集合");
        return false;
    }
}
