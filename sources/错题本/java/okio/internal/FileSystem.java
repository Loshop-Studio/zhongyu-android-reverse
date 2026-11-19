package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.C5801p;
import kotlin.collections.C5803r;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.FileMetadata;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p061g.AbstractC5535a;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p185v7.AbstractC6683l;
import p214z6.AbstractC6832j;
import p214z6.C6831i;
import p214z6.InterfaceC6830h;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\f\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u0010\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0014\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\r\u001a)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0016*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001aH\u0010\u001e\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u001b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010 \u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b \u0010!¨\u0006\""}, m5110d2 = {"Lokio/FileSystem;", "Lokio/Path;", "path", "Lokio/FileMetadata;", "commonMetadata", "(Lokio/FileSystem;Lokio/Path;)Lokio/FileMetadata;", "", "commonExists", "(Lokio/FileSystem;Lokio/Path;)Z", "dir", "mustCreate", "Ld6/s;", "commonCreateDirectories", "(Lokio/FileSystem;Lokio/Path;Z)V", "source", TypedValues.AttributesType.S_TARGET, "commonCopy", "(Lokio/FileSystem;Lokio/Path;Lokio/Path;)V", "fileOrDirectory", "mustExist", "commonDeleteRecursively", "followSymlinks", "Lz6/h;", "commonListRecursively", "(Lokio/FileSystem;Lokio/Path;Z)Lz6/h;", "Lz6/j;", "fileSystem", "Lkotlin/collections/p;", "stack", "postorder", "collectRecursively", "(Lz6/j;Lokio/FileSystem;Lkotlin/collections/p;Lokio/Path;ZZLh6/c;)Ljava/lang/Object;", "symlinkTarget", "(Lokio/FileSystem;Lokio/Path;)Lokio/Path;", "okio"}, m5111k = 2, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmName(name = "-FileSystem")
@SourceDebugExtension({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,155:1\n58#2,4:156\n58#2,22:160\n66#2,10:182\n62#2,3:192\n77#2,3:195\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/internal/-FileSystem\n*L\n65#1:156,4\n66#1:160,22\n65#1:182,10\n65#1:192,3\n65#1:195,3\n*E\n"})
/* renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystem {

    @Metadata(m5111k = 3, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    @DebugMetadata(m5302c = "okio.internal.-FileSystem", m5303f = "FileSystem.kt", m5304i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m5305l = {116, 135, 145}, m5306m = "collectRecursively", m5307n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, m5308s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    /* renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    public static final class C63501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public C63501(InterfaceC5631c<? super C63501> interfaceC5631c) {
            super(interfaceC5631c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileSystem.collectRecursively(null, null, null, null, false, false, this);
        }
    }

    @Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lz6/j;", "Lokio/Path;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
    @DebugMetadata(m5302c = "okio.internal.-FileSystem$commonListRecursively$1", m5303f = "FileSystem.kt", m5304i = {0, 0}, m5305l = {96}, m5306m = "invokeSuspend", m5307n = {"$this$sequence", "stack"}, m5308s = {"L$0", "L$1"})
    /* renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    public static final class C63511 extends RestrictedSuspendLambda implements InterfaceC6473e {
        final /* synthetic */ Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C63511(Path path, okio.FileSystem fileSystem, boolean z8, InterfaceC5631c<? super C63511> interfaceC5631c) {
            super(2, interfaceC5631c);
            this.$dir = path;
            this.$this_commonListRecursively = fileSystem;
            this.$followSymlinks = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
            C63511 c63511 = new C63511(this.$dir, this.$this_commonListRecursively, this.$followSymlinks, interfaceC5631c);
            c63511.L$0 = obj;
            return c63511;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AbstractC6832j abstractC6832j;
            C5801p c5801p;
            Iterator<Path> it;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5774b.m5119b(obj);
                AbstractC6832j abstractC6832j2 = (AbstractC6832j) this.L$0;
                C5801p c5801p2 = new C5801p();
                c5801p2.addLast(this.$dir);
                abstractC6832j = abstractC6832j2;
                c5801p = c5801p2;
                it = this.$this_commonListRecursively.list(this.$dir).iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                C5801p c5801p3 = (C5801p) this.L$1;
                abstractC6832j = (AbstractC6832j) this.L$0;
                AbstractC5774b.m5119b(obj);
                c5801p = c5801p3;
            }
            while (it.hasNext()) {
                Path next = it.next();
                okio.FileSystem fileSystem = this.$this_commonListRecursively;
                boolean z8 = this.$followSymlinks;
                this.L$0 = abstractC6832j;
                this.L$1 = c5801p;
                this.L$2 = it;
                this.label = 1;
                if (FileSystem.collectRecursively(abstractC6832j, fileSystem, c5801p, next, z8, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C5443s.f8405a;
        }

        @Override // p152r6.InterfaceC6473e
        public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
            return ((C63511) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r16.mo6491a(r4, r1) == r5) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d8, code lost:
    
        if (r0 != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r12 != 0) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dc, code lost:
    
        r6.addLast(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00df, code lost:
    
        r3 = r3.iterator();
        r3 = r1;
        r1 = r2;
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012d, code lost:
    
        r10 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed A[Catch: all -> 0x012c, TRY_LEAVE, TryCatch #2 {all -> 0x012c, blocks: (B:49:0x00e7, B:51:0x00ed, B:48:0x00df), top: B:75:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0124 -> B:20:0x005e). Please report as a decompilation issue!!! */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collectRecursively(@org.jetbrains.annotations.NotNull p214z6.AbstractC6832j r16, @org.jetbrains.annotations.NotNull okio.FileSystem r17, @org.jetbrains.annotations.NotNull kotlin.collections.C5801p r18, @org.jetbrains.annotations.NotNull okio.Path r19, boolean r20, boolean r21, @org.jetbrains.annotations.NotNull p075h6.InterfaceC5631c<? super p045d6.C5443s> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.FileSystem.collectRecursively(z6.j, okio.FileSystem, kotlin.collections.p, okio.Path, boolean, boolean, h6.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042 A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[Catch: all -> 0x003c, TRY_ENTER, TRY_LEAVE, TryCatch #5 {all -> 0x003c, blocks: (B:3:0x0016, B:21:0x0042, B:27:0x004d, B:16:0x0038, B:4:0x001e, B:13:0x0033), top: B:47:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void commonCopy(@org.jetbrains.annotations.NotNull okio.FileSystem r3, @org.jetbrains.annotations.NotNull okio.Path r4, @org.jetbrains.annotations.NotNull okio.Path r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r3, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r4, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.AbstractC5830k.m5330g(r5, r0)
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
            kotlin.collections.AbstractC5806u.m5266e(r5, r3)     // Catch: java.lang.Throwable -> L3c
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
            kotlin.collections.AbstractC5806u.m5266e(r3, r4)
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

    public static final void commonCreateDirectories(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z8) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(dir, "dir");
        C5801p c5801p = new C5801p();
        for (Path pathParent = dir; pathParent != null && !fileSystem.exists(pathParent); pathParent = pathParent.parent()) {
            c5801p.addFirst(pathParent);
        }
        if (z8 && c5801p.isEmpty()) {
            throw new IOException(dir + " already exists.");
        }
        Iterator<E> it = c5801p.iterator();
        while (it.hasNext()) {
            okio.FileSystem.createDirectory$default(fileSystem, (Path) it.next(), false, 2, null);
        }
    }

    public static final void commonDeleteRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path fileOrDirectory, boolean z8) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(fileOrDirectory, "fileOrDirectory");
        C6831i c6831iM6376p = AbstractC6683l.m6376p(new FileSystem$commonDeleteRecursively$sequence$1(fileSystem, fileOrDirectory, null));
        while (c6831iM6376p.hasNext()) {
            fileSystem.delete((Path) c6831iM6376p.next(), z8 && !c6831iM6376p.hasNext());
        }
    }

    public static final boolean commonExists(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(path, "path");
        return fileSystem.metadataOrNull(path) != null;
    }

    @NotNull
    public static final InterfaceC6830h commonListRecursively(@NotNull okio.FileSystem fileSystem, @NotNull Path dir, boolean z8) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(dir, "dir");
        return new C5803r(new C63511(dir, fileSystem, z8, null));
    }

    @NotNull
    public static final FileMetadata commonMetadata(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(path, "path");
        FileMetadata fileMetadataMetadataOrNull = fileSystem.metadataOrNull(path);
        if (fileMetadataMetadataOrNull != null) {
            return fileMetadataMetadataOrNull;
        }
        throw new FileNotFoundException(AbstractC5535a.m4895b(path, "no such file: "));
    }

    @Nullable
    public static final Path symlinkTarget(@NotNull okio.FileSystem fileSystem, @NotNull Path path) throws IOException {
        AbstractC5830k.m5330g(fileSystem, "<this>");
        AbstractC5830k.m5330g(path, "path");
        Path symlinkTarget = fileSystem.metadata(path).getSymlinkTarget();
        if (symlinkTarget == null) {
            return null;
        }
        Path pathParent = path.parent();
        AbstractC5830k.m5327d(pathParent);
        return pathParent.resolve(symlinkTarget);
    }
}
