.class public abstract Lg7/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg7/a$b;,
        Lg7/a$h;,
        Lg7/a$f;,
        Lg7/a$c;,
        Lg7/a$e;,
        Lg7/a$d;,
        Lg7/a$a;,
        Lg7/a$g;
    }
.end annotation


# static fields
.field public static final a:Ls6/f;

.field public static final b:Ls6/f;

.field public static final c:Ls6/f;

.field public static final d:Ls6/f;

.field public static final e:Ls6/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lg7/a$h;

    .line 2
    .line 3
    invoke-direct {v0}, Lg7/a$h;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lf7/a;->g(Ljava/util/concurrent/Callable;)Ls6/f;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lg7/a;->a:Ls6/f;

    .line 11
    .line 12
    new-instance v0, Lg7/a$b;

    .line 13
    .line 14
    invoke-direct {v0}, Lg7/a$b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lf7/a;->d(Ljava/util/concurrent/Callable;)Ls6/f;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sput-object v0, Lg7/a;->b:Ls6/f;

    .line 22
    .line 23
    new-instance v0, Lg7/a$c;

    .line 24
    .line 25
    invoke-direct {v0}, Lg7/a$c;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lf7/a;->e(Ljava/util/concurrent/Callable;)Ls6/f;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sput-object v0, Lg7/a;->c:Ls6/f;

    .line 33
    .line 34
    invoke-static {}, Ld7/f;->d()Ld7/f;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lg7/a;->d:Ls6/f;

    .line 39
    .line 40
    new-instance v0, Lg7/a$f;

    .line 41
    .line 42
    invoke-direct {v0}, Lg7/a$f;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lf7/a;->f(Ljava/util/concurrent/Callable;)Ls6/f;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Lg7/a;->e:Ls6/f;

    .line 50
    .line 51
    return-void
.end method

.method public static a()Ls6/f;
    .locals 1

    .line 1
    sget-object v0, Lg7/a;->b:Ls6/f;

    .line 2
    .line 3
    invoke-static {v0}, Lf7/a;->j(Ls6/f;)Ls6/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static b()Ls6/f;
    .locals 1

    .line 1
    sget-object v0, Lg7/a;->c:Ls6/f;

    .line 2
    .line 3
    invoke-static {v0}, Lf7/a;->l(Ls6/f;)Ls6/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
