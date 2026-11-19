.class public abstract Lw/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcoil3/c$c;

.field public static final b:Lcoil3/c$c;

.field public static final c:Lcoil3/c$c;

.field public static final d:Lcoil3/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {}, Lrc/w;->n()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lw/h;->a:Lcoil3/c$c;

    .line 11
    .line 12
    new-instance v0, Lcoil3/c$c;

    .line 13
    .line 14
    const/16 v1, 0x1000

    .line 15
    .line 16
    invoke-static {v1, v1}, Lx/f;->a(II)Lx/e;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lw/h;->b:Lcoil3/c$c;

    .line 24
    .line 25
    new-instance v0, Lcoil3/c$c;

    .line 26
    .line 27
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lw/h;->c:Lcoil3/c$c;

    .line 33
    .line 34
    new-instance v0, Lcoil3/c$c;

    .line 35
    .line 36
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    sput-object v0, Lw/h;->d:Lcoil3/c$c;

    .line 42
    .line 43
    return-void
.end method

.method public static final a(Lw/n;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/h;->c:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final b(Lw/g;)Z
    .locals 1

    .line 1
    sget-object v0, Lw/h;->d:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static final c(Lw/g;)Lx/e;
    .locals 1

    .line 1
    sget-object v0, Lw/h;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final d(Lw/n;)Lx/e;
    .locals 1

    .line 1
    sget-object v0, Lw/h;->b:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->b(Lw/n;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lx/e;

    .line 8
    .line 9
    return-object p0
.end method

.method public static final e(Lw/g;)Ljava/util/List;
    .locals 1

    .line 1
    sget-object v0, Lw/h;->a:Lcoil3/c$c;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcoil3/d;->a(Lw/g;Lcoil3/c$c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/util/List;

    .line 8
    .line 9
    return-object p0
.end method
