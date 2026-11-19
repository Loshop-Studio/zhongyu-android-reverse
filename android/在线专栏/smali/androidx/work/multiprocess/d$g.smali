.class Landroidx/work/multiprocess/d$g;
.super Landroidx/work/multiprocess/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/multiprocess/d;->v([BLandroidx/work/multiprocess/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/work/multiprocess/c<",
        "Ljava/util/List<",
        "Lx0/v;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic d:Landroidx/work/multiprocess/d;


# direct methods
.method constructor <init>(Landroidx/work/multiprocess/d;Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V
    .locals 0

    iput-object p1, p0, Landroidx/work/multiprocess/d$g;->d:Landroidx/work/multiprocess/d;

    invoke-direct {p0, p2, p3, p4}, Landroidx/work/multiprocess/c;-><init>(Ljava/util/concurrent/Executor;Landroidx/work/multiprocess/b;Lcom/google/common/util/concurrent/ListenableFuture;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)[B
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Landroidx/work/multiprocess/d$g;->c(Ljava/util/List;)[B

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/util/List;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx0/v;",
            ">;)[B"
        }
    .end annotation

    .line 1
    new-instance v0, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfos;

    invoke-direct {v0, p1}, Landroidx/work/multiprocess/parcelable/ParcelableWorkInfos;-><init>(Ljava/util/List;)V

    .line 2
    invoke-static {v0}, Lj1/a;->a(Landroid/os/Parcelable;)[B

    move-result-object p1

    return-object p1
.end method
