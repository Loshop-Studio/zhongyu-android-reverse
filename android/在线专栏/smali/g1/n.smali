.class public Lg1/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/j;


# instance fields
.field private final a:Lh1/a;

.field final b:Le1/a;

.field final c:Lf1/s;


# direct methods
.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Le1/a;Lh1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p2, p0, Lg1/n;->b:Le1/a;

    .line 3
    iput-object p3, p0, Lg1/n;->a:Lh1/a;

    .line 4
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->M()Lf1/s;

    move-result-object p1

    iput-object p1, p0, Lg1/n;->c:Lf1/s;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Lx0/i;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Lx0/i;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/work/impl/utils/futures/d;->s()Landroidx/work/impl/utils/futures/d;

    move-result-object v6

    .line 2
    iget-object v7, p0, Lg1/n;->a:Lh1/a;

    new-instance v8, Lg1/n$a;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p2

    move-object v4, p3

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lg1/n$a;-><init>(Lg1/n;Landroidx/work/impl/utils/futures/d;Ljava/util/UUID;Lx0/i;Landroid/content/Context;)V

    invoke-interface {v7, v8}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-object v6
.end method
