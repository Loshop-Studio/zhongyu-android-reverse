.class final Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$localRecipient$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/IBinder$DeathRecipient;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/RemoteExecuteKt;->execute(Landroid/os/IInterface;Landroidx/work/multiprocess/RemoteDispatcher;Lvc/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $continuation:Lvc/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvc/c<",
            "[B>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lvc/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvc/c<",
            "-[B>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$localRecipient$1;->$continuation:Lvc/c;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final binderDied()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$localRecipient$1;->$continuation:Lvc/c;

    .line 2
    .line 3
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    .line 6
    .line 7
    const-string v2, "Binder died"

    .line 8
    .line 9
    invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v0, v1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method
