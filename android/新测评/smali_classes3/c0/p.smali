.class public final Lc0/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc0/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc0/p$a;
    }
.end annotation


# static fields
.field public static final a:Lc0/p$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lc0/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lc0/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lc0/p;->a:Lc0/p$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcoil3/util/Logger;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a()Z
    .locals 2

    .line 1
    sget-object v0, Lcoil3/util/b;->a:Lcoil3/util/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, Lcoil3/util/b;->b(Lcoil3/util/Logger;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public b(Lz/e;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lz/e;->b()Lz/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lz/a$a;

    .line 6
    .line 7
    const v2, 0x7fffffff

    .line 8
    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lz/a$a;

    .line 13
    .line 14
    invoke-virtual {v0}, Lz/a$a;->f()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v0, v2

    .line 20
    :goto_0
    const/16 v1, 0x64

    .line 21
    .line 22
    if-le v0, v1, :cond_2

    .line 23
    .line 24
    invoke-virtual {p1}, Lz/e;->a()Lz/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    instance-of v0, p1, Lz/a$a;

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    check-cast p1, Lz/a$a;

    .line 33
    .line 34
    invoke-virtual {p1}, Lz/a$a;->f()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    :cond_1
    if-le v2, v1, :cond_2

    .line 39
    .line 40
    const/4 p1, 0x1

    .line 41
    return p1

    .line 42
    :cond_2
    const/4 p1, 0x0

    .line 43
    return p1
.end method
