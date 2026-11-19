.class public final Lge/d3;
.super Lge/i2;
.source "SourceFile"

# interfaces
.implements Lce/b;


# static fields
.field public static final c:Lge/d3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lge/d3;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/d3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/d3;->c:Lge/d3;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lqc/l;->d:Lqc/l$a;

    .line 2
    .line 3
    invoke-static {v0}, Lde/a;->G(Lqc/l$a;)Lce/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lge/i2;-><init>(Lce/b;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public bridge synthetic e(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lqc/m;

    .line 2
    .line 3
    invoke-virtual {p1}, Lqc/m;->p()[J

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lge/d3;->v([J)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public bridge synthetic h(Lfe/c;ILjava/lang/Object;Z)V
    .locals 0

    .line 1
    check-cast p3, Lge/c3;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lge/d3;->x(Lfe/c;ILge/c3;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lqc/m;

    .line 2
    .line 3
    invoke-virtual {p1}, Lqc/m;->p()[J

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0, p1}, Lge/d3;->y([J)Lge/c3;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public bridge synthetic r()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lge/d3;->w()[J

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lqc/m;->a([J)Lqc/m;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public bridge synthetic u(Lfe/d;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    check-cast p2, Lqc/m;

    .line 2
    .line 3
    invoke-virtual {p2}, Lqc/m;->p()[J

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lge/d3;->z(Lfe/d;[JI)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public v([J)I
    .locals 1

    .line 1
    const-string v0, "$this$collectionSize"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lqc/m;->j([J)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public w()[J
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Lqc/m;->b(I)[J

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    return-object v0
.end method

.method public x(Lfe/c;ILge/c3;Z)V
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
    invoke-virtual {p0}, Lge/i2;->getDescriptor()Lee/f;

    .line 12
    .line 13
    .line 14
    move-result-object p4

    .line 15
    invoke-interface {p1, p4, p2}, Lfe/c;->decodeInlineElement(Lee/f;I)Lfe/e;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-interface {p1}, Lfe/e;->decodeLong()J

    .line 20
    .line 21
    .line 22
    move-result-wide p1

    .line 23
    invoke-static {p1, p2}, Lqc/l;->b(J)J

    .line 24
    .line 25
    .line 26
    move-result-wide p1

    .line 27
    invoke-virtual {p3, p1, p2}, Lge/c3;->e(J)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public y([J)Lge/c3;
    .locals 2

    .line 1
    const-string v0, "$this$toBuilder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lge/c3;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p1, v1}, Lge/c3;-><init>([JLkotlin/jvm/internal/n;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public z(Lfe/d;[JI)V
    .locals 4

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
    invoke-virtual {p0}, Lge/i2;->getDescriptor()Lee/f;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-interface {p1, v1, v0}, Lfe/d;->encodeInlineElement(Lee/f;I)Lfe/f;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-static {p2, v0}, Lqc/m;->h([JI)J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    invoke-interface {v1, v2, v3}, Lfe/f;->encodeLong(J)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void
.end method
