.class public abstract Lf1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf1/a$e;,
        Lf1/a$f;,
        Lf1/a$g;,
        Lf1/a$d;
    }
.end annotation


# static fields
.field public static final a:Lf1/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lf1/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lf1/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lf1/a;->a:Lf1/a$g;

    .line 7
    .line 8
    return-void
.end method

.method public static a(Landroidx/core/util/Pools$Pool;Lf1/a$d;)Landroidx/core/util/Pools$Pool;
    .locals 1

    .line 1
    invoke-static {}, Lf1/a;->c()Lf1/a$g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, Lf1/a;->b(Landroidx/core/util/Pools$Pool;Lf1/a$d;Lf1/a$g;)Landroidx/core/util/Pools$Pool;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public static b(Landroidx/core/util/Pools$Pool;Lf1/a$d;Lf1/a$g;)Landroidx/core/util/Pools$Pool;
    .locals 1

    .line 1
    new-instance v0, Lf1/a$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lf1/a$e;-><init>(Landroidx/core/util/Pools$Pool;Lf1/a$d;Lf1/a$g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static c()Lf1/a$g;
    .locals 1

    .line 1
    sget-object v0, Lf1/a;->a:Lf1/a$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d(ILf1/a$d;)Landroidx/core/util/Pools$Pool;
    .locals 1

    .line 1
    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, Lf1/a;->a(Landroidx/core/util/Pools$Pool;Lf1/a$d;)Landroidx/core/util/Pools$Pool;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static e()Landroidx/core/util/Pools$Pool;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, Lf1/a;->f(I)Landroidx/core/util/Pools$Pool;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static f(I)Landroidx/core/util/Pools$Pool;
    .locals 2

    .line 1
    new-instance v0, Landroidx/core/util/Pools$SynchronizedPool;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroidx/core/util/Pools$SynchronizedPool;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, Lf1/a$b;

    .line 7
    .line 8
    invoke-direct {p0}, Lf1/a$b;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lf1/a$c;

    .line 12
    .line 13
    invoke-direct {v1}, Lf1/a$c;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0, v1}, Lf1/a;->b(Landroidx/core/util/Pools$Pool;Lf1/a$d;Lf1/a$g;)Landroidx/core/util/Pools$Pool;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
