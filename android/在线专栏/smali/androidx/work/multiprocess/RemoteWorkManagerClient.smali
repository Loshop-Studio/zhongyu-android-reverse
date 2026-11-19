.class public Landroidx/work/multiprocess/RemoteWorkManagerClient;
.super Li1/a;
.source "SourceFile"


# static fields
.field static final e:Ljava/lang/String;

.field private static final f:Lj/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/a<",
            "[B",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic g:I


# instance fields
.field final a:Landroid/content/Context;

.field final b:Ly0/i;

.field final c:Ljava/util/concurrent/Executor;

.field final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "RemoteWorkManagerClient"

    .line 1
    invoke-static {v0}, Lx0/n;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->e:Ljava/lang/String;

    .line 2
    new-instance v0, Landroidx/work/multiprocess/RemoteWorkManagerClient$a;

    invoke-direct {v0}, Landroidx/work/multiprocess/RemoteWorkManagerClient$a;-><init>()V

    sput-object v0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->f:Lj/a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ly0/i;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .line 1
    invoke-direct {p0}, Li1/a;-><init>()V

    .line 2
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->b:Ly0/i;

    .line 4
    invoke-virtual {p2}, Ly0/i;->u()Lh1/a;

    move-result-object p1

    invoke-interface {p1}, Lh1/a;->c()Lg1/i;

    move-result-object p1

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->c:Ljava/util/concurrent/Executor;

    .line 5
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/work/multiprocess/RemoteWorkManagerClient;->d:Ljava/lang/Object;

    return-void
.end method
