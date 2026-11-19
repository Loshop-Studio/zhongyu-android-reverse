package okio.internal;

import com.alibaba.fastjson.asm.Opcodes;
import com.taobao.sophix.PatchStatus;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import okio.FileMetadata;
import okio.Path;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p296pd.AbstractC10662j;
import p296pd.InterfaceC10659g;
import p309qc.C10786q;
import p325rc.C10958m;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes6.dex */
public final class FileSystem {

    @InterfaceC11829d(m26210c = "okio.internal.-FileSystem", m26211f = "FileSystem.kt", m26212l = {116, PatchStatus.CODE_LOAD_LIB_UNZIP, 145}, m26213m = "collectRecursively")
    /* renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    public static final class C105311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C105311(InterfaceC11588c<? super C105311> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @InterfaceC11829d(m26210c = "okio.internal.-FileSystem$commonListRecursively$1", m26211f = "FileSystem.kt", m26212l = {Opcodes.IADD}, m26213m = "invokeSuspend")
    /* renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    public static final class C105321 extends RestrictedSuspendLambda implements InterfaceC9544p {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C105321(Path path, okio.FileSystem fileSystem, boolean z10, InterfaceC11588c<? super C105321> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C105321 c105321 = new C105321(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC11588c);
            c105321.L$0 = obj;
            return c105321;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC10661i abstractC10661i;
            C10958m c10958m;
            Iterator<Path> it;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                AbstractC10661i abstractC10661i2 = (AbstractC10661i) this.L$0;
                C10958m c10958m2 = new C10958m();
                c10958m2.addLast(this.$dir);
                abstractC10661i = abstractC10661i2;
                c10958m = c10958m2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                C10958m c10958m3 = (C10958m) this.L$1;
                abstractC10661i = (AbstractC10661i) this.L$0;
                AbstractC9924b.m20071b(obj);
                c10958m = c10958m3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z10 = this.$followSymlinks;
                this.L$0 = abstractC10661i;
                this.L$1 = c10958m;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(abstractC10661i, fileSystem, c10958m, next, z10, false, this) == objM25952f) {
                    return objM25952f;
                }
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C105321) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r15.mo22551a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e8, code lost:
    
        if (r11 != 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ea, code lost:
    
        r6.addLast(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0139, code lost:
    
        r9 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0160, code lost:
    
        if (r10.mo22551a(r1, r4) == r5) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fb A[Catch: all -> 0x0138, TRY_LEAVE, TryCatch #2 {all -> 0x0138, blocks: (B:48:0x00f5, B:50:0x00fb, B:47:0x00ed), top: B:77:0x00ed }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0130 -> B:19:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(p296pd.AbstractC10661i r15, okio.FileSystem r16, p325rc.C10958m r17, okio.Path r18, boolean r19, boolean r20, vc.InterfaceC11588c<? super p309qc.C10786q> r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(pd.i, okio.FileSystem, rc.m, okio.Path, boolean, boolean, vc.c):java.lang.Object");
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
            kotlin.jvm.internal.AbstractC9979u.m20294g(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.AbstractC9979u.m20294g(r5, r0)
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
            p309qc.AbstractC10771b.m22973a(r5, r3)     // Catch: java.lang.Throwable -> L3c
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
            p309qc.AbstractC10771b.m22973a(r3, r4)
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
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(dir, "dir");
        C10958m c10958m = new C10958m();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            c10958m.addFirst(pathParent);
        }
        if (z10 && c10958m.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c10958m.iterator();
        while (it.hasNext()) {
            okio.FileSystem.createDirectory$default(fileSystem, (Path) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(okio.FileSystem fileSystem, Path fileOrDirectory, boolean z10) {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(fileOrDirectory, "fileOrDirectory");
        Iterator it = AbstractC10662j.m22558b(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null)).iterator();
        while (it.hasNext()) {
            fileSystem.delete((Path) it.next(), z10 && !it.hasNext());
        }
    }

    public static final boolean commonExists(okio.FileSystem fileSystem, Path path) {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    public static final InterfaceC10659g commonListRecursively(okio.FileSystem fileSystem, Path dir, boolean z10) {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(dir, "dir");
        return AbstractC10662j.m22558b(new C105321(dir, fileSystem, z10, null));
    }

    public static final FileMetadata commonMetadata(okio.FileSystem fileSystem, Path path) throws FileNotFoundException {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public static final Path symlinkTarget(okio.FileSystem fileSystem, Path path) {
        AbstractC9979u.m20294g(fileSystem, "<this>");
        AbstractC9979u.m20294g(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        AbstractC9979u.m20291d(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
