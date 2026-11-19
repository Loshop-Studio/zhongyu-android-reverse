.class public final Le/e;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 7

    sget-object v5, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-string v0, "timeUnit"

    .line 1
    invoke-static {v5, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Le/q/e/a;

    sget-object v1, Le/q/d/c;->h:Le/q/d/c;

    const/4 v2, 0x5

    const-wide/16 v3, 0x5

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Le/q/e/a;-><init>(Le/q/d/c;IJLjava/util/concurrent/TimeUnit;)V

    const-string v0, "delegate"

    .line 2
    invoke-static {v6, v0}, Ld/f/b/d;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
