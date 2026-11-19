.class public final Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;
.super Landroidx/work/multiprocess/IWorkManagerImplCallback$Stub;
.source "SourceFile"


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
    iput-object p1, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;->$continuation:Lvc/c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/work/multiprocess/IWorkManagerImplCallback$Stub;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFailure(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;->$continuation:Lvc/c;

    .line 2
    .line 3
    sget-object v1, Lkotlin/Result;->d:Lkotlin/Result$a;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/RuntimeException;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Lkotlin/b;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onSuccess([B)V
    .locals 1

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/work/multiprocess/RemoteExecuteKt$execute$3$1;->$continuation:Lvc/c;

    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/Result;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p1}, Lvc/c;->resumeWith(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
