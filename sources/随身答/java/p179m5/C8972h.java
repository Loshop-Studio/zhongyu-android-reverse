package p179m5;

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
import p006a5.InterfaceC0039c;
import p095e5.AbstractC7846a;
import p095e5.AbstractC7850e;
import p095e5.C7847b;
import p095e5.InterfaceC7849d;
import p169l5.InterfaceC8891e;
import p189n5.C9097c;
import p312z4.C9998a;

/* renamed from: m5.h */
/* loaded from: classes4.dex */
public final class C8972h extends AbstractC7850e {

    /* renamed from: h */
    public long f15059h;

    /* renamed from: i */
    public long f15060i;

    /* renamed from: j */
    public ListIterator f15061j;

    /* renamed from: l */
    public ListIterator f15063l;

    /* renamed from: o */
    public long f15066o;

    /* renamed from: p */
    public AbstractC7846a f15067p;

    /* renamed from: k */
    public String f15062k = "";

    /* renamed from: m */
    public final ExecutorService f15064m = Executors.newSingleThreadExecutor();

    /* renamed from: n */
    public List f15065n = new ArrayList();

    /* renamed from: q */
    public int f15068q = -1;

    /* renamed from: m5.h$a */
    public static final class a implements InterfaceC7849d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC7850e f15070b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f15071c;

        public a(AbstractC7850e abstractC7850e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f15070b = abstractC7850e;
            this.f15071c = commandInfo;
        }

        @Override // p095e5.InterfaceC7849d
        /* renamed from: a */
        public void mo12308a(AbstractC7850e thread, boolean z9) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            C8972h.this.f15065n.remove(thread);
            if (!z9 || this.f15070b.m12315g() == null) {
                return;
            }
            C8972h c8972h = C8972h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f15071c;
            AbstractC7846a abstractC7846a = c8972h.f15067p;
            if (abstractC7846a != null) {
                abstractC7846a.m12298b(commandInfo);
            }
        }
    }

    /* renamed from: m5.h$b */
    public static final class b implements InterfaceC7849d {

        /* renamed from: b */
        public final /* synthetic */ AbstractC7850e f15073b;

        /* renamed from: c */
        public final /* synthetic */ EzyCommand.CommandSource.CommandInfo f15074c;

        public b(AbstractC7850e abstractC7850e, EzyCommand.CommandSource.CommandInfo commandInfo) {
            this.f15073b = abstractC7850e;
            this.f15074c = commandInfo;
        }

        @Override // p095e5.InterfaceC7849d
        /* renamed from: a */
        public void mo12308a(AbstractC7850e thread, boolean z9) {
            Intrinsics.checkNotNullParameter(thread, "thread");
            C8972h.this.f15065n.remove(thread);
            if (!z9 || this.f15073b.m12315g() == null) {
                return;
            }
            C8972h c8972h = C8972h.this;
            EzyCommand.CommandSource.CommandInfo commandInfo = this.f15074c;
            AbstractC7846a abstractC7846a = c8972h.f15067p;
            if (abstractC7846a != null) {
                abstractC7846a.m12298b(commandInfo);
            }
        }
    }

    /* renamed from: A */
    private final boolean m14325A() throws IOException {
        ListIterator listIterator = this.f15063l;
        if (listIterator == null || !listIterator.hasNext()) {
            return false;
        }
        EzyRouterRecord.RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord.RouterRecord.SourceCommandRecord) listIterator.next();
        FileInputStream fileInputStream = new FileInputStream(new File(this.f15062k, sourceCommandRecord.getFileName()));
        EzyCommand.CommandSource commandSourceM8058x = EzyCommand.CommandSource.m8058x(fileInputStream);
        this.f15061j = commandSourceM8058x.m8060n().listIterator();
        System.out.println((Object) ("命令文件名=" + sourceCommandRecord.getFileName() + "  命令长度=" + commandSourceM8058x.m8060n().size()));
        fileInputStream.close();
        return true;
    }

    /* renamed from: B */
    private final boolean m14326B(ListIterator listIterator) {
        AbstractC7850e abstractC7850eM12297a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (commandInfo.m8073A()) {
                InterfaceC0039c interfaceC0039cM12310b = m12310b();
                if (interfaceC0039cM12310b != null && !interfaceC0039cM12310b.mo181H()) {
                    InterfaceC0039c interfaceC0039cM12310b2 = m12310b();
                    if (interfaceC0039cM12310b2 != null) {
                        interfaceC0039cM12310b2.mo207j(true);
                    }
                    InterfaceC0039c interfaceC0039cM12310b3 = m12310b();
                    if (interfaceC0039cM12310b3 != null) {
                        interfaceC0039cM12310b3.mo202e();
                    }
                }
                if (this.f15060i < commandInfo.m8081y()) {
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    return false;
                }
                if (m14329z(commandInfo)) {
                    AbstractC7846a abstractC7846a = this.f15067p;
                    if (abstractC7846a != null && (abstractC7850eM12297a = abstractC7846a.m12297a(commandInfo, this.f15060i - commandInfo.m8081y())) != null) {
                        abstractC7850eM12297a.m12321p(m12313e());
                        abstractC7850eM12297a.m12309a().add(new b(abstractC7850eM12297a, commandInfo));
                        abstractC7850eM12297a.mo12324t();
                        this.f15065n.add(abstractC7850eM12297a);
                        this.f15064m.execute(abstractC7850eM12297a);
                    }
                } else {
                    AbstractC7846a abstractC7846a2 = this.f15067p;
                    if (abstractC7846a2 != null) {
                        abstractC7846a2.m12298b(commandInfo);
                    }
                }
                this.f15060i -= commandInfo.m8081y() + commandInfo.m8082z();
            } else {
                InterfaceC0039c interfaceC0039cM12310b4 = m12310b();
                if (interfaceC0039cM12310b4 != null) {
                    interfaceC0039cM12310b4.mo207j(false);
                }
                AbstractC7846a abstractC7846a3 = this.f15067p;
                if (abstractC7846a3 != null) {
                    abstractC7846a3.m12298b(commandInfo);
                }
            }
        }
        return true;
    }

    /* renamed from: z */
    private final boolean m14329z(EzyCommand.CommandSource.CommandInfo commandInfo) {
        return commandInfo.m8082z() != 0 && this.f15060i >= commandInfo.m8081y() && this.f15060i < commandInfo.m8081y() + commandInfo.m8082z();
    }

    /* renamed from: C */
    public final void m14330C(long j9) throws InterruptedException, IOException {
        this.f15059h = j9;
        this.f15060i = j9;
        ListIterator listIterator = this.f15063l;
        if (listIterator != null) {
            while (listIterator.hasPrevious()) {
                listIterator.previous();
            }
        }
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo7896s();
        }
        Thread.sleep(50L);
        this.f15065n.clear();
        m14325A();
        m14334x(j9);
    }

    /* renamed from: D */
    public final void m14331D(long j9) {
        this.f15066o = j9;
    }

    /* renamed from: E */
    public final void m14332E(String path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "path");
        this.f15063l = C9097c.f15322d.m14639c(path).m9229H().listIterator();
        this.f15062k = path;
        m14325A();
    }

    /* renamed from: F */
    public final void m14333F(int i9) {
        this.f15068q = i9;
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: k */
    public void mo7893k() {
        super.mo7893k();
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo7893k();
        }
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: l */
    public void mo7894l() {
        super.mo7894l();
        this.f15060i = 0L;
        this.f15059h = 0L;
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo7896s();
        }
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: m */
    public void mo7895m() {
        super.mo7895m();
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo7895m();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        InterfaceC8891e interfaceC8891eM12315g;
        InterfaceC0039c interfaceC0039cM12310b;
        C9998a c9998aM12311c;
        if (this.f15067p == null && (interfaceC8891eM12315g = m12315g()) != null && (interfaceC0039cM12310b = m12310b()) != null && (c9998aM12311c = m12311c()) != null) {
            this.f15067p = C7847b.f13183a.m12301a(this.f15068q, interfaceC8891eM12315g, c9998aM12311c, interfaceC0039cM12310b);
        }
        if (m12314f() == PlayStatus.RECORD_PAUSE) {
            return;
        }
        if (m12314f() == PlayStatus.RECORD_END) {
            this.f15059h = 0L;
            this.f15060i = 0L;
            return;
        }
        while (m14326B(this.f15061j) && ((m12314f() == PlayStatus.RECORD_START || m12314f() == PlayStatus.RECORD_RESUME) && m14325A())) {
        }
        this.f15060i = this.f15060i + (m12313e() != null ? r2.m16537a() : 16);
        long jM16537a = this.f15059h + (m12313e() != null ? r2.m16537a() : 16);
        this.f15059h = jM16537a;
        if (jM16537a <= this.f15066o + (m12313e() != null ? r2.m16537a() : 16)) {
            m12318j(this.f15059h);
            return;
        }
        mo7897u();
        m12318j(this.f15066o);
        InterfaceC0039c interfaceC0039cM12310b2 = m12310b();
        if (interfaceC0039cM12310b2 != null) {
            interfaceC0039cM12310b2.mo207j(true);
        }
        InterfaceC0039c interfaceC0039cM12310b3 = m12310b();
        if (interfaceC0039cM12310b3 != null) {
            interfaceC0039cM12310b3.mo202e();
        }
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: s */
    public void mo7896s() {
        super.mo7896s();
        synchronized (this.f15065n) {
            try {
                Iterator it = this.f15065n.iterator();
                while (it.hasNext()) {
                    ((AbstractC7850e) it.next()).mo7896s();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f15064m.shutdown();
        this.f15063l = null;
        this.f15061j = null;
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: t */
    public void mo12324t() {
        super.mo12324t();
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo12324t();
        }
    }

    @Override // p095e5.AbstractC7850e
    /* renamed from: u */
    public void mo7897u() {
        super.mo7897u();
        Iterator it = this.f15065n.iterator();
        while (it.hasNext()) {
            ((AbstractC7850e) it.next()).mo7897u();
        }
    }

    /* renamed from: x */
    public final void m14334x(long j9) {
        System.out.println((Object) "即将快进");
        while (!m14335y(this.f15061j)) {
            if (!m14325A()) {
                System.out.println((Object) ("快进结束 nextCommandTime = " + this.f15060i));
                m12322q((1 > j9 || j9 >= this.f15066o) ? PlayStatus.RECORD_END : PlayStatus.RECORD_PAUSE);
                return;
            }
            System.out.println((Object) "装载了下一个 命令集合");
        }
    }

    /* renamed from: y */
    public final boolean m14335y(ListIterator listIterator) {
        AbstractC7850e abstractC7850eM12297a;
        if (listIterator == null) {
            return false;
        }
        while (listIterator.hasNext()) {
            EzyCommand.CommandSource.CommandInfo commandInfo = (EzyCommand.CommandSource.CommandInfo) listIterator.next();
            if (this.f15060i < commandInfo.m8081y()) {
                System.out.println((Object) ("快进时，时间没到,快进即将结束 nextCommandTime = " + this.f15060i + "  next.delayTime = " + commandInfo.m8081y()));
                if (listIterator.hasPrevious()) {
                    listIterator.previous();
                }
                return true;
            }
            if (m14329z(commandInfo) && commandInfo.m8073A()) {
                System.out.println((Object) ("快进到需要播放的指令 nextCommandTime = " + this.f15060i + "  next.delayTime = " + commandInfo.m8081y()));
                InterfaceC0039c interfaceC0039cM12310b = m12310b();
                if (interfaceC0039cM12310b != null && !interfaceC0039cM12310b.mo181H()) {
                    InterfaceC0039c interfaceC0039cM12310b2 = m12310b();
                    if (interfaceC0039cM12310b2 != null) {
                        interfaceC0039cM12310b2.mo207j(true);
                    }
                    InterfaceC0039c interfaceC0039cM12310b3 = m12310b();
                    if (interfaceC0039cM12310b3 != null) {
                        interfaceC0039cM12310b3.mo202e();
                    }
                }
                AbstractC7846a abstractC7846a = this.f15067p;
                if (abstractC7846a != null && (abstractC7850eM12297a = abstractC7846a.m12297a(commandInfo, this.f15060i - commandInfo.m8081y())) != null) {
                    System.out.println((Object) ("即将异步执行播放指令 " + abstractC7850eM12297a.getClass().getName()));
                    abstractC7850eM12297a.m12321p(m12313e());
                    abstractC7850eM12297a.m12309a().add(new a(abstractC7850eM12297a, commandInfo));
                    abstractC7850eM12297a.mo7893k();
                    this.f15065n.add(abstractC7850eM12297a);
                    this.f15064m.execute(abstractC7850eM12297a);
                }
            } else {
                AbstractC7846a abstractC7846a2 = this.f15067p;
                if (abstractC7846a2 != null) {
                    abstractC7846a2.m12298b(commandInfo);
                }
            }
            if (commandInfo.m8073A()) {
                this.f15060i -= commandInfo.m8081y() + commandInfo.m8082z();
            }
            System.out.println((Object) ("快进中 nextCommandTime = " + this.f15060i));
        }
        System.out.println((Object) "快进中 没有命令啦！！！，赶快去装载下个指令集合");
        return false;
    }
}
