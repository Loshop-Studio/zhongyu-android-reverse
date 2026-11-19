.class public Ly0/k$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly0/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field a:Landroid/content/Context;

.field b:Landroidx/work/ListenableWorker;

.field c:Le1/a;

.field d:Lh1/a;

.field e:Lx0/b;

.field f:Landroidx/work/impl/WorkDatabase;

.field g:Ljava/lang/String;

.field h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ly0/e;",
            ">;"
        }
    .end annotation
.end field

.field i:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lx0/b;Lh1/a;Le1/a;Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Landroidx/work/WorkerParameters$a;

    invoke-direct {v0}, Landroidx/work/WorkerParameters$a;-><init>()V

    iput-object v0, p0, Ly0/k$c;->i:Landroidx/work/WorkerParameters$a;

    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Ly0/k$c;->a:Landroid/content/Context;

    .line 4
    iput-object p3, p0, Ly0/k$c;->d:Lh1/a;

    .line 5
    iput-object p4, p0, Ly0/k$c;->c:Le1/a;

    .line 6
    iput-object p2, p0, Ly0/k$c;->e:Lx0/b;

    .line 7
    iput-object p5, p0, Ly0/k$c;->f:Landroidx/work/impl/WorkDatabase;

    .line 8
    iput-object p6, p0, Ly0/k$c;->g:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()Ly0/k;
    .locals 1

    new-instance v0, Ly0/k;

    invoke-direct {v0, p0}, Ly0/k;-><init>(Ly0/k$c;)V

    return-object v0
.end method

.method public b(Landroidx/work/WorkerParameters$a;)Ly0/k$c;
    .locals 0

    if-eqz p1, :cond_0

    iput-object p1, p0, Ly0/k$c;->i:Landroidx/work/WorkerParameters$a;

    :cond_0
    return-object p0
.end method

.method public c(Ljava/util/List;)Ly0/k$c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ly0/e;",
            ">;)",
            "Ly0/k$c;"
        }
    .end annotation

    iput-object p1, p0, Ly0/k$c;->h:Ljava/util/List;

    return-object p0
.end method
