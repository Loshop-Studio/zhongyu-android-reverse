package cd;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.p227io.AccessDeniedException;
import kotlin.p227io.FileWalkDirection;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p296pd.InterfaceC10659g;
import p325rc.AbstractC10938c;

/* renamed from: cd.e */
/* loaded from: classes6.dex */
public final class C5426e implements InterfaceC10659g {

    /* renamed from: a */
    public final File f3506a;

    /* renamed from: b */
    public final FileWalkDirection f3507b;

    /* renamed from: c */
    public final InterfaceC9540l f3508c;

    /* renamed from: d */
    public final InterfaceC9540l f3509d;

    /* renamed from: e */
    public final InterfaceC9544p f3510e;

    /* renamed from: f */
    public final int f3511f;

    /* renamed from: cd.e$a */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File rootDir) {
            super(rootDir);
            AbstractC9979u.m20294g(rootDir, "rootDir");
        }
    }

    /* renamed from: cd.e$b */
    public final class b extends AbstractC10938c {

        /* renamed from: e */
        public final ArrayDeque f3512e;

        /* renamed from: cd.e$b$a */
        public final class a extends a {

            /* renamed from: b */
            public boolean f3514b;

            /* renamed from: c */
            public File[] f3515c;

            /* renamed from: d */
            public int f3516d;

            /* renamed from: e */
            public boolean f3517e;

            /* renamed from: f */
            public final /* synthetic */ b f3518f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File rootDir) {
                super(rootDir);
                AbstractC9979u.m20294g(rootDir, "rootDir");
                this.f3518f = bVar;
            }

            @Override // cd.C5426e.c
            /* renamed from: b */
            public File mo2915b() {
                if (!this.f3517e && this.f3515c == null) {
                    InterfaceC9540l interfaceC9540l = C5426e.this.f3508c;
                    if (interfaceC9540l != null && !((Boolean) interfaceC9540l.invoke(m2916a())).booleanValue()) {
                        return null;
                    }
                    File[] fileArrListFiles = m2916a().listFiles();
                    this.f3515c = fileArrListFiles;
                    if (fileArrListFiles == null) {
                        InterfaceC9544p interfaceC9544p = C5426e.this.f3510e;
                        if (interfaceC9544p != null) {
                            interfaceC9544p.invoke(m2916a(), new AccessDeniedException(m2916a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.f3517e = true;
                    }
                }
                File[] fileArr = this.f3515c;
                if (fileArr != null) {
                    int i10 = this.f3516d;
                    AbstractC9979u.m20291d(fileArr);
                    if (i10 < fileArr.length) {
                        File[] fileArr2 = this.f3515c;
                        AbstractC9979u.m20291d(fileArr2);
                        int i11 = this.f3516d;
                        this.f3516d = i11 + 1;
                        return fileArr2[i11];
                    }
                }
                if (!this.f3514b) {
                    this.f3514b = true;
                    return m2916a();
                }
                InterfaceC9540l interfaceC9540l2 = C5426e.this.f3509d;
                if (interfaceC9540l2 != null) {
                    interfaceC9540l2.invoke(m2916a());
                }
                return null;
            }
        }

        /* renamed from: cd.e$b$b, reason: collision with other inner class name */
        public final class C12093b extends c {

            /* renamed from: b */
            public boolean f3519b;

            /* renamed from: c */
            public final /* synthetic */ b f3520c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12093b(b bVar, File rootFile) {
                super(rootFile);
                AbstractC9979u.m20294g(rootFile, "rootFile");
                this.f3520c = bVar;
            }

            @Override // cd.C5426e.c
            /* renamed from: b */
            public File mo2915b() {
                if (this.f3519b) {
                    return null;
                }
                this.f3519b = true;
                return m2916a();
            }
        }

        /* renamed from: cd.e$b$c */
        public final class c extends a {

            /* renamed from: b */
            public boolean f3521b;

            /* renamed from: c */
            public File[] f3522c;

            /* renamed from: d */
            public int f3523d;

            /* renamed from: e */
            public final /* synthetic */ b f3524e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File rootDir) {
                super(rootDir);
                AbstractC9979u.m20294g(rootDir, "rootDir");
                this.f3524e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007e, code lost:
            
                if (r0.length == 0) goto L31;
             */
            @Override // cd.C5426e.c
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File mo2915b() {
                /*
                    r9 = this;
                    boolean r0 = r9.f3521b
                    r1 = 0
                    if (r0 != 0) goto L28
                    cd.e$b r0 = r9.f3524e
                    cd.e r0 = cd.C5426e.this
                    hd.l r0 = cd.C5426e.m2908e(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r9.m2916a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r9.f3521b = r0
                    java.io.File r0 = r9.m2916a()
                    return r0
                L28:
                    java.io.File[] r0 = r9.f3522c
                    if (r0 == 0) goto L47
                    int r2 = r9.f3523d
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    cd.e$b r0 = r9.f3524e
                    cd.e r0 = cd.C5426e.this
                    hd.l r0 = cd.C5426e.m2910g(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r9.m2916a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r9.f3522c
                    if (r0 != 0) goto L92
                    java.io.File r0 = r9.m2916a()
                    java.io.File[] r0 = r0.listFiles()
                    r9.f3522c = r0
                    if (r0 != 0) goto L76
                    cd.e$b r0 = r9.f3524e
                    cd.e r0 = cd.C5426e.this
                    hd.p r0 = cd.C5426e.m2909f(r0)
                    if (r0 == 0) goto L76
                    java.io.File r2 = r9.m2916a()
                    kotlin.io.AccessDeniedException r3 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r9.m2916a()
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r3)
                L76:
                    java.io.File[] r0 = r9.f3522c
                    if (r0 == 0) goto L80
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L92
                L80:
                    cd.e$b r0 = r9.f3524e
                    cd.e r0 = cd.C5426e.this
                    hd.l r0 = cd.C5426e.m2910g(r0)
                    if (r0 == 0) goto L91
                    java.io.File r2 = r9.m2916a()
                    r0.invoke(r2)
                L91:
                    return r1
                L92:
                    java.io.File[] r0 = r9.f3522c
                    kotlin.jvm.internal.AbstractC9979u.m20291d(r0)
                    int r1 = r9.f3523d
                    int r2 = r1 + 1
                    r9.f3523d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: cd.C5426e.b.c.mo2915b():java.io.File");
            }
        }

        /* renamed from: cd.e$b$d */
        public static final /* synthetic */ class d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f3525a;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.f23377c.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.f23378d.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f3525a = iArr;
            }
        }

        public b() {
            ArrayDeque arrayDeque = new ArrayDeque();
            this.f3512e = arrayDeque;
            if (C5426e.this.f3506a.isDirectory()) {
                arrayDeque.push(m2913e(C5426e.this.f3506a));
            } else if (C5426e.this.f3506a.isFile()) {
                arrayDeque.push(new C12093b(this, C5426e.this.f3506a));
            } else {
                m23874b();
            }
        }

        @Override // p325rc.AbstractC10938c
        /* renamed from: a */
        public void mo2912a() {
            File fileM2914f = m2914f();
            if (fileM2914f != null) {
                m23875c(fileM2914f);
            } else {
                m23874b();
            }
        }

        /* renamed from: e */
        public final a m2913e(File file) {
            int i10 = d.f3525a[C5426e.this.f3507b.ordinal()];
            if (i10 == 1) {
                return new c(this, file);
            }
            if (i10 == 2) {
                return new a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }

        /* renamed from: f */
        public final File m2914f() {
            File fileMo2915b;
            while (true) {
                c cVar = (c) this.f3512e.peek();
                if (cVar == null) {
                    return null;
                }
                fileMo2915b = cVar.mo2915b();
                if (fileMo2915b == null) {
                    this.f3512e.pop();
                } else {
                    if (AbstractC9979u.m20289b(fileMo2915b, cVar.m2916a()) || !fileMo2915b.isDirectory() || this.f3512e.size() >= C5426e.this.f3511f) {
                        break;
                    }
                    this.f3512e.push(m2913e(fileMo2915b));
                }
            }
            return fileMo2915b;
        }
    }

    /* renamed from: cd.e$c */
    public static abstract class c {

        /* renamed from: a */
        public final File f3526a;

        public c(File root) {
            AbstractC9979u.m20294g(root, "root");
            this.f3526a = root;
        }

        /* renamed from: a */
        public final File m2916a() {
            return this.f3526a;
        }

        /* renamed from: b */
        public abstract File mo2915b();
    }

    public C5426e(File file, FileWalkDirection fileWalkDirection, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9544p interfaceC9544p, int i10) {
        this.f3506a = file;
        this.f3507b = fileWalkDirection;
        this.f3508c = interfaceC9540l;
        this.f3509d = interfaceC9540l2;
        this.f3510e = interfaceC9544p;
        this.f3511f = i10;
    }

    @Override // p296pd.InterfaceC10659g
    public Iterator iterator() {
        return new b();
    }

    public /* synthetic */ C5426e(File file, FileWalkDirection fileWalkDirection, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, InterfaceC9544p interfaceC9544p, int i10, int i11, AbstractC9972n abstractC9972n) {
        this(file, (i11 & 2) != 0 ? FileWalkDirection.f23377c : fileWalkDirection, interfaceC9540l, interfaceC9540l2, interfaceC9544p, (i11 & 32) != 0 ? Integer.MAX_VALUE : i10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5426e(File start, FileWalkDirection direction) {
        this(start, direction, null, null, null, 0, 32, null);
        AbstractC9979u.m20294g(start, "start");
        AbstractC9979u.m20294g(direction, "direction");
    }
}
