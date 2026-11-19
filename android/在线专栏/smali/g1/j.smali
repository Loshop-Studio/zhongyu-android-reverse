.class public Lg1/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private a:Ly0/i;

.field private b:Ljava/lang/String;

.field private c:Landroidx/work/WorkerParameters$a;


# direct methods
.method public constructor <init>(Ly0/i;Ljava/lang/String;Landroidx/work/WorkerParameters$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg1/j;->a:Ly0/i;

    .line 3
    iput-object p2, p0, Lg1/j;->b:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lg1/j;->c:Landroidx/work/WorkerParameters$a;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lg1/j;->a:Ly0/i;

    invoke-virtual {v0}, Ly0/i;->p()Ly0/d;

    move-result-object v0

    iget-object v1, p0, Lg1/j;->b:Ljava/lang/String;

    iget-object v2, p0, Lg1/j;->c:Landroidx/work/WorkerParameters$a;

    invoke-virtual {v0, v1, v2}, Ly0/d;->k(Ljava/lang/String;Landroidx/work/WorkerParameters$a;)Z

    return-void
.end method
