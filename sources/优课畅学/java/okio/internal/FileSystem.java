package okio.internal;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import okio.FileMetadata;
import okio.Path;
import p101f8.AbstractC8471i;
import p101f8.AbstractC8472j;
import p101f8.InterfaceC8469g;
import p123h7.C8736p;
import p134i7.C8791m;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes5.dex */
public final class FileSystem {

    @InterfaceC9539d(m17800c = "okio.internal.-FileSystem", m17801f = "FileSystem.kt", m17802l = {116, 135, 145}, m17803m = "collectRecursively")
    /* renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    public static final class C95981 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C95981(InterfaceC9324c<? super C95981> interfaceC9324c) {
            super(interfaceC9324c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @InterfaceC9539d(m17800c = "okio.internal.-FileSystem$commonListRecursively$1", m17801f = "FileSystem.kt", m17802l = {96}, m17803m = "invokeSuspend")
    /* renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    public static final class C95991 extends RestrictedSuspendLambda implements InterfaceC10574p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C95991(Path path, okio.FileSystem fileSystem, boolean z10, InterfaceC9324c<? super C95991> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C95991 c95991 = new C95991(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC9324c);
            c95991.L$0 = obj;
            return c95991;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C95991) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC8471i abstractC8471i;
            C8791m c8791m;
            Iterator<Path> it;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                AbstractC8471i abstractC8471i2 = (AbstractC8471i) this.L$0;
                C8791m c8791m2 = new C8791m();
                c8791m2.addLast(this.$dir);
                abstractC8471i = abstractC8471i2;
                c8791m = c8791m2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                C8791m c8791m3 = (C8791m) this.L$1;
                abstractC8471i = (AbstractC8471i) this.L$0;
                AbstractC9079b.m15926b(obj);
                c8791m = c8791m3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = abstractC8471i;
                this.L$1 = c8791m;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(abstractC8471i, fileSystem, c8791m, next, z10, false, this) == objM17291f) {
                    return objM17291f;
                }
            }
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r15.mo13820a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e3, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e5, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e7, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ea, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0135, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0136, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x015d, code lost:
    
        if (r10.mo13820a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8 A[Catch: all -> 0x0135, TRY_LEAVE, TryCatch #2 {all -> 0x0135, blocks: (B:48:0x00f2, B:50:0x00f8, B:47:0x00ea), top: B:77:0x00ea }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x012d -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(p101f8.AbstractC8471i r15, okio.FileSystem r16, p134i7.C8791m r17, okio.Path r18, boolean r19, boolean r20, p179m7.InterfaceC9324c<? super p123h7.C8736p> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(f8.i, okio.FileSystem, i7.m, okio.Path, boolean, boolean, m7.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(okio.FileSystem r3, okio.Path r4, okio.Path r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.AbstractC9133u.m16133g(r5, r0)
            okio.Source r4 = r3.source(r4)
            r0 = 0
            r1 = 2
            r2 = 0
            okio.Sink r3 = okio.FileSystem.sink$default(r3, r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L3c
            okio.BufferedSink r3 = okio.Okio.buffer(r3)     // Catch: java.lang.Throwable -> L3c
            long r0 = r3.writeAll(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L2e
            r3.close()     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r3 = move-exception
            goto L40
        L2e:
            r3 = r2
            goto L40
        L30:
            r5 = move-exception
            if (r3 == 0) goto L3e
            r3.close()     // Catch: java.lang.Throwable -> L37
            goto L3e
        L37:
            r3 = move-exception
            p123h7.AbstractC8722b.m14228a(r5, r3)     // Catch: java.lang.Throwable -> L3c
            goto L3e
        L3c:
            r3 = move-exception
            goto L4e
        L3e:
            r3 = r5
            r5 = r2
        L40:
            if (r3 != 0) goto L4d
            r5.longValue()     // Catch: java.lang.Throwable -> L3c
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Throwable -> L4b
            goto L59
        L4b:
            r2 = move-exception
            goto L59
        L4d:
            throw r3     // Catch: java.lang.Throwable -> L3c
        L4e:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            p123h7.AbstractC8722b.m14228a(r3, r4)
        L58:
            r2 = r3
        L59:
            if (r2 != 0) goto L5c
            return
        L5c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.commonCopy(okio.FileSystem, okio.Path, okio.Path):void");
    }

    public static final void commonCreateDirectories(okio.FileSystem fileSystem, Path dir, boolean z10) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(dir, "dir");
        C8791m c8791m = new C8791m();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            c8791m.addFirst(pathParent);
        }
        if (z10 && c8791m.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c8791m.iterator();
        while (it.hasNext()) {
            okio.FileSystem.createDirectory$default(fileSystem, (Path) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path fileOrDirectory, boolean z10) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(fileOrDirectory, "fileOrDirectory");
        Iterator it = AbstractC8472j.m13827b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final InterfaceC8469g commonListRecursively(okio.FileSystem fileSystem, Path dir, boolean z10) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(dir, "dir");
        return AbstractC8472j.m13827b(new C95991(dir, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws FileNotFoundException {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) {
        AbstractC9133u.m16133g(fileSystem, "<this>");
        AbstractC9133u.m16133g(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        AbstractC9133u.m16130d(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
