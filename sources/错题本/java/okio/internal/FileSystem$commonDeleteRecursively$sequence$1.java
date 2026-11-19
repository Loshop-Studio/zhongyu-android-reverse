package okio.internal;

import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.collections.C5801p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import okio.FileSystem;
import okio.Path;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;
import p214z6.AbstractC6832j;

@Metadata(m5109d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m5110d2 = {"Lz6/j;", "Lokio/Path;", "Ld6/s;", "<anonymous>", "(Lz6/j;)V"}, m5111k = 3, m5112mv = {2, 1, 0})
@DebugMetadata(m5302c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m5303f = "FileSystem.kt", m5304i = {}, m5305l = {75}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements InterfaceC6473e {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, InterfaceC5631c<? super FileSystem$commonDeleteRecursively$sequence$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC5631c);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            AbstractC6832j abstractC6832j = (AbstractC6832j) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            C5801p c5801p = new C5801p();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(abstractC6832j, fileSystem, c5801p, path, false, true, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(AbstractC6832j abstractC6832j, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(abstractC6832j, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
