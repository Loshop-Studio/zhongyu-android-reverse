.class public Lg1/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx0/r;


# static fields
.field static final c:Ljava/lang/String;


# instance fields
.field final a:Landroidx/work/impl/WorkDatabase;

.field final b:Lh1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "WorkProgressUpdater"

    invoke-static {v0}, Lx0/n;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lg1/o;->c:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroidx/work/impl/WorkDatabase;Lh1/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg1/o;->a:Landroidx/work/impl/WorkDatabase;

    .line 3
    iput-object p2, p0, Lg1/o;->b:Lh1/a;

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/util/UUID;Landroidx/work/a;)Lcom/google/common/util/concurrent/ListenableFuture;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/UUID;",
            "Landroidx/work/a;",
            ")",
            "Lcom/google/common/util/concurrent/ListenableFuture<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/work/impl/utils/futures/d;->s()Landroidx/work/impl/utils/futures/d;

    move-result-object p1

    .line 2
    iget-object v0, p0, Lg1/o;->b:Lh1/a;

    new-instance v1, Lg1/o$a;

    invoke-direct {v1, p0, p2, p3, p1}, Lg1/o$a;-><init>(Lg1/o;Ljava/util/UUID;Landroidx/work/a;Landroidx/work/impl/utils/futures/d;)V

    invoke-interface {v0, v1}, Lh1/a;->b(Ljava/lang/Runnable;)V

    return-object p1
.end method
