.class Lz0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/a;->a(Lf1/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lf1/r;

.field final synthetic b:Lz0/a;


# direct methods
.method constructor <init>(Lz0/a;Lf1/r;)V
    .locals 0

    iput-object p1, p0, Lz0/a$a;->b:Lz0/a;

    iput-object p2, p0, Lz0/a$a;->a:Lf1/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .line 1
    invoke-static {}, Lx0/n;->c()Lx0/n;

    move-result-object v0

    sget-object v1, Lz0/a;->d:Ljava/lang/String;

    const/4 v2, 0x1

    new-array v3, v2, [Ljava/lang/Object;

    iget-object v4, p0, Lz0/a$a;->a:Lf1/r;

    iget-object v4, v4, Lf1/r;->a:Ljava/lang/String;

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const-string v4, "Scheduling work %s"

    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-array v4, v5, [Ljava/lang/Throwable;

    invoke-virtual {v0, v1, v3, v4}, Lx0/n;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 2
    iget-object v0, p0, Lz0/a$a;->b:Lz0/a;

    iget-object v0, v0, Lz0/a;->a:Lz0/b;

    new-array v1, v2, [Lf1/r;

    iget-object v2, p0, Lz0/a$a;->a:Lf1/r;

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Lz0/b;->f([Lf1/r;)V

    return-void
.end method
