package okio.internal;

import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import okio.FileSystem;
import okio.Path;
import p181hd.InterfaceC9544p;
import p296pd.AbstractC10661i;
import p309qc.C10786q;
import p325rc.C10958m;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m26211f = "FileSystem.kt", m26212l = {75}, m26213m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes6.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, InterfaceC11588c<? super FileSystem$commonDeleteRecursively$sequence$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC11588c);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            AbstractC10661i abstractC10661i = (AbstractC10661i) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            C10958m c10958m = new C10958m();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(abstractC10661i, fileSystem, c10958m, path, false, true, this) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(AbstractC10661i abstractC10661i, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(abstractC10661i, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
