package okio.internal;

import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import okio.FileSystem;
import okio.Path;
import p101f8.AbstractC8471i;
import p123h7.C8736p;
import p134i7.C8791m;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m17801f = "FileSystem.kt", m17802l = {75}, m17803m = "invokeSuspend")
/* renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* loaded from: classes5.dex */
public final class FileSystem$commonDeleteRecursively$sequence$1 extends RestrictedSuspendLambda implements InterfaceC10574p {
    final /* synthetic */ Path $fileOrDirectory;
    final /* synthetic */ FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystem$commonDeleteRecursively$sequence$1(FileSystem fileSystem, Path path, InterfaceC9324c<? super FileSystem$commonDeleteRecursively$sequence$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$this_commonDeleteRecursively = fileSystem;
        this.$fileOrDirectory = path;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        FileSystem$commonDeleteRecursively$sequence$1 fileSystem$commonDeleteRecursively$sequence$1 = new FileSystem$commonDeleteRecursively$sequence$1(this.$this_commonDeleteRecursively, this.$fileOrDirectory, interfaceC9324c);
        fileSystem$commonDeleteRecursively$sequence$1.L$0 = obj;
        return fileSystem$commonDeleteRecursively$sequence$1;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(AbstractC8471i abstractC8471i, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((FileSystem$commonDeleteRecursively$sequence$1) create(abstractC8471i, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            AbstractC8471i abstractC8471i = (AbstractC8471i) this.L$0;
            FileSystem fileSystem = this.$this_commonDeleteRecursively;
            C8791m c8791m = new C8791m();
            Path path = this.$fileOrDirectory;
            this.label = 1;
            if (FileSystem.collectRecursively(abstractC8471i, fileSystem, c8791m, path, false, true, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
