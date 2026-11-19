package p256t7;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.p159io.AccessDeniedException;
import kotlin.p159io.FileWalkDirection;
import p101f8.InterfaceC8469g;
import p134i7.AbstractC8771c;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* renamed from: t7.d */
/* loaded from: classes5.dex */
public final class C10119d implements InterfaceC8469g {

    /* renamed from: a */
    public final File f20193a;

    /* renamed from: b */
    public final FileWalkDirection f20194b;

    /* renamed from: c */
    public final InterfaceC10570l f20195c;

    /* renamed from: d */
    public final InterfaceC10570l f20196d;

    /* renamed from: e */
    public final InterfaceC10574p f20197e;

    /* renamed from: f */
    public final int f20198f;

    /* renamed from: t7.d$a */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            AbstractC9133u.m16133g(rootDir, "rootDir");
        }
    }

    /* renamed from: t7.d$b */
    public final class b extends AbstractC8771c {

        /* renamed from: c */
        public final ArrayDeque f20199c;

        /* renamed from: t7.d$b$a */
        public final class a extends a {

            /* renamed from: b */
            public boolean f20201b;

            /* renamed from: c */
            public File[] f20202c;

            /* renamed from: d */
            public int f20203d;

            /* renamed from: e */
            public boolean f20204e;

            /* renamed from: f */
            public final /* synthetic */ b f20205f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                AbstractC9133u.m16133g(rootDir, "rootDir");
                this.f20205f = bVar;
            }

            @Override // p256t7.C10119d.c
            /* renamed from: b */
            public File mo18872b() {
                if (!this.f20204e && this.f20202c == null) {
                    InterfaceC10570l interfaceC10570l = C10119d.this.f20195c;
                    if (interfaceC10570l != null && !((Boolean) interfaceC10570l.invoke(m18873a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = m18873a().listFiles();
                    this.f20202c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        InterfaceC10574p interfaceC10574p = C10119d.this.f20197e;
                        if (interfaceC10574p != null) {
                            interfaceC10574p.invoke(m18873a(), new AccessDeniedException(m18873a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f20204e = true;
                    }
                }
                File[] fileArr = this.f20202c;
                if (fileArr != null) {
                    int i10 = this.f20203d;
                    AbstractC9133u.m16130d(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f20202c;
                        AbstractC9133u.m16130d(fileArr2);
                        int i11 = this.f20203d;
                        this.f20203d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f20201b) {
                    this.f20201b = true;
                    return m18873a();
                }
                InterfaceC10570l interfaceC10570l2 = C10119d.this.f20196d;
                if (interfaceC10570l2 != null) {
                    interfaceC10570l2.invoke(m18873a());
                }
                return null;
            }
        }

        /* renamed from: t7.d$b$b, reason: collision with other inner class name */
        public final class C10815b extends c {

            /* renamed from: b */
            public boolean f20206b;

            /* renamed from: c */
            public final /* synthetic */ b f20207c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10815b(b bVar, File rootFile) {
                super(rootFile);
                AbstractC9133u.m16133g(rootFile, "rootFile");
                this.f20207c = bVar;
            }

            @Override // p256t7.C10119d.c
            /* renamed from: b */
            public File mo18872b() {
                if (this.f20206b) {
                    return null;
                }
                this.f20206b = true;
                return m18873a();
            }
        }

        /* renamed from: t7.d$b$c */
        public final class c extends a {

            /* renamed from: b */
            public boolean f20208b;

            /* renamed from: c */
            public File[] f20209c;

            /* renamed from: d */
            public int f20210d;

            /* renamed from: e */
            public final /* synthetic */ b f20211e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                AbstractC9133u.m16133g(rootDir, "rootDir");
                this.f20211e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // p256t7.C10119d.c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File mo18872b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f20208b
                    r1 = 0
                    if (r0 != 0) goto L28
                    t7.d$b r0 = r9.f20211e
                    t7.d r0 = p256t7.C10119d.this
                    x7.l r0 = p256t7.C10119d.m18866e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.m18873a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f20208b = r0
                    java.io.File r0 = r9.m18873a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f20209c
                    if (r0 == 0) goto L47
                    int r2 = r9.f20210d
                    kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    t7.d$b r0 = r9.f20211e
                    t7.d r0 = p256t7.C10119d.this
                    x7.l r0 = p256t7.C10119d.m18868g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.m18873a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f20209c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.m18873a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f20209c = r0
                    if (r0 != 0) goto L76
                    t7.d$b r0 = r9.f20211e
                    t7.d r0 = p256t7.C10119d.this
                    x7.p r0 = p256t7.C10119d.m18867f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.m18873a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.m18873a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f20209c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    t7.d$b r0 = r9.f20211e
                    t7.d r0 = p256t7.C10119d.this
                    x7.l r0 = p256t7.C10119d.m18868g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.m18873a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f20209c
                    kotlin.jvm.internal.AbstractC9133u.m16130d(r0)
                    int r1 = r9.f20210d
                    int r2 = r1 + 1
                    r9.f20210d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p256t7.C10119d.b.c.mo18872b():java.io.File");
            }
        }

        /* renamed from: t7.d$b$d */
        public static final /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f20212a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.f17464a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.f17465b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f20212a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f20199c = arrayDeque;
            if (C10119d.this.f20193a.isDirectory()) {
                arrayDeque.push(m18870e(C10119d.this.f20193a));
            } else if (C10119d.this.f20193a.isFile()) {
                arrayDeque.push(new C10815b(this, C10119d.this.f20193a));
            } else {
                m14507b();
            }
        }

        @Override // p134i7.AbstractC8771c
        /* renamed from: a */
        public void mo14506a() {
            File fileM18871f = m18871f();
            if (fileM18871f != null) {
                m14508c(fileM18871f);
            } else {
                m14507b();
            }
        }

        /* renamed from: e */
        public final a m18870e(File file) {
            int i10 = d.f20212a[C10119d.this.f20194b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: f */
        public final File m18871f() {
            File fileMo18872b;
            while (true) {
                c cVar = (c) this.f20199c.peek();
                if (cVar == null) {
                    return null;
                }
                fileMo18872b = cVar.mo18872b();
                if (fileMo18872b == null) {
                    this.f20199c.pop();
                } else {
                    if (AbstractC9133u.m16128b(fileMo18872b, cVar.m18873a()) || !fileMo18872b.isDirectory() || this.f20199c.size() >= C10119d.this.f20198f) {
                        break;
                    }
                    this.f20199c.push(m18870e(fileMo18872b));
                }
            }
            return fileMo18872b;
        }
    }

    /* renamed from: t7.d$c */
    public static abstract class c {

        /* renamed from: a */
        public final File f20213a;

        public c(File root) {
            AbstractC9133u.m16133g(root, "root");
            this.f20213a = root;
        }

        /* renamed from: a */
        public final File m18873a() {
            return this.f20213a;
        }

        /* renamed from: b */
        public abstract File mo18872b();
    }

    public C10119d(File file, FileWalkDirection fileWalkDirection, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10574p interfaceC10574p, int i10) {
        this.f20193a = file;
        this.f20194b = fileWalkDirection;
        this.f20195c = interfaceC10570l;
        this.f20196d = interfaceC10570l2;
        this.f20197e = interfaceC10574p;
        this.f20198f = i10;
    }

    @Override // p101f8.InterfaceC8469g
    public Iterator iterator() {
        return new b();
    }

    public /* synthetic */ C10119d(File file, FileWalkDirection fileWalkDirection, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, InterfaceC10574p interfaceC10574p, int i10, int i11, AbstractC9126n abstractC9126n) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.f17464a : fileWalkDirection, interfaceC10570l, interfaceC10570l2, interfaceC10574p, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10119d(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        AbstractC9133u.m16133g(start, "start");
        AbstractC9133u.m16133g(direction, "direction");
    }
}
