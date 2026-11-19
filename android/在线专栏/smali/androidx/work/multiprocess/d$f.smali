.class Landroidx/work/multiprocess/d$f;
.super Landroidx/work/multiprocess/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/d;->j(Landroidx/work/multiprocess/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/work/multiprocess/c<",
        "Lx0/q$b$c;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic d:Landroidx/work/multiprocess/d;


# direct methods
.method constructor <init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/multiprocess/d$f;->d:Landroidx/work/multiprocess/d;

    invoke-direct {p0, p2, p3, p4}, Landroidx/work/multiprocess/c;-><init>(Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)[B
    .locals 0

    check-cast p1, Lx0/q$b$c;

    invoke-virtual {p0, p1}, Landroidx/work/multiprocess/d$f;->c(Lx0/q$b$c;)[B

    move-result-object p1

    return-object p1
.end method

.method public c(Lx0/q$b$c;)[B
    .locals 0

    sget-object p1, Landroidx/work/multiprocess/d;->b:[B

    return-object p1
.end method
