.class public final Lw8/q2;
.super Lw8/i2;
.source "SourceFile"

# interfaces
.implements Ls8/b;


# static fields
.field public static final c:Lw8/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lw8/q2;

    .line 2
    .line 3
    invoke-direct {v0}, Lw8/q2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lw8/q2;->c:Lw8/q2;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lkotlin/jvm/internal/a0;->a:Lkotlin/jvm/internal/a0;

    .line 2
    .line 3
    invoke-static {v0}, Lt8/a;->G(Lkotlin/jvm/internal/a0;)Ls8/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lw8/i2;-><init>(Ls8/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, [S

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw8/q2;->v([S)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic h(Lv8/c;ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p3, Lw8/p2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lw8/q2;->x(Lv8/c;ILw8/p2;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, [S

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lw8/q2;->y([S)Lw8/p2;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic r()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lw8/q2;->w()[S

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic u(Lv8/d;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, [S

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lw8/q2;->z(Lv8/d;[SI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public v([S)I
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    array-length p1, p1

    .line 7
    return p1
.end method

.method public w()[S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [S

    .line 3
    .line 4
    return-object v0
.end method

.method public x(Lv8/c;ILw8/p2;Z)V
    .locals 0

    .line 1
    const-string p4, "decoder"

    .line 2
    .line 3
    invoke-static {p1, p4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p4, "builder"

    .line 7
    .line 8
    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lw8/i2;->getDescriptor()Lu8/f;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-interface {p1, p4, p2}, Lv8/c;->decodeShortElement(Lu8/f;I)S

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-virtual {p3, p1}, Lw8/p2;->e(S)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public y([S)Lw8/p2;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lw8/p2;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lw8/p2;-><init>([S)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public z(Lv8/d;[SI)V
    .locals 3

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "content"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p3, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Lw8/i2;->getDescriptor()Lu8/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    aget-short v2, p2, v0

    .line 19
    .line 20
    invoke-interface {p1, v1, v0, v2}, Lv8/d;->encodeShortElement(Lu8/f;IS)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
