.class public abstract Lcoil3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcoil3/c$c;

.field public static final b:Lcoil3/c$c;

.field public static final c:Lcoil3/c$c;

.field public static final d:Lcoil3/c$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lcoil3/c$c;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcoil3/g;->a:Lcoil3/c$c;

    .line 12
    .line 13
    new-instance v0, Lcoil3/c$c;

    .line 14
    .line 15
    sget-object v1, Ll/n;->c:Ll/n;

    .line 16
    .line 17
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcoil3/g;->b:Lcoil3/c$c;

    .line 21
    .line 22
    new-instance v0, Lcoil3/c$c;

    .line 23
    .line 24
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 25
    .line 26
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lcoil3/g;->c:Lcoil3/c$c;

    .line 30
    .line 31
    new-instance v0, Lcoil3/c$c;

    .line 32
    .line 33
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 34
    .line 35
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-direct {v0, v1}, Lcoil3/c$c;-><init>(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    sput-object v0, Lcoil3/g;->d:Lcoil3/c$c;

    .line 43
    .line 44
    return-void
.end method

.method public static final a(Lcoil3/RealImageLoader$a;)Ll/n;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcoil3/RealImageLoader$a;->c()Lw/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lw/g$b;->f()Lcoil3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lcoil3/g;->b:Lcoil3/c$c;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcoil3/d;->c(Lcoil3/c;Lcoil3/c$c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ll/n;

    .line 16
    .line 17
    return-object p0
.end method

.method public static final b(Lcoil3/RealImageLoader$a;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcoil3/RealImageLoader$a;->c()Lw/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lw/g$b;->f()Lcoil3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lcoil3/g;->a:Lcoil3/c$c;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcoil3/d;->c(Lcoil3/c;Lcoil3/c$c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public static final c(Lcoil3/RealImageLoader$a;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcoil3/RealImageLoader$a;->c()Lw/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lw/g$b;->f()Lcoil3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lcoil3/g;->c:Lcoil3/c$c;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcoil3/d;->c(Lcoil3/c;Lcoil3/c$c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method

.method public static final d(Lcoil3/RealImageLoader$a;)D
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcoil3/RealImageLoader$a;->c()Lw/g$b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Lw/g$b;->f()Lcoil3/c;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget-object v0, Lcoil3/g;->d:Lcoil3/c$c;

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcoil3/d;->c(Lcoil3/c;Lcoil3/c$c;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    return-wide v0
.end method
