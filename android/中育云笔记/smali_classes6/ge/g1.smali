.class public final Lge/g1;
.super Lge/w0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lge/g1$a;
    }
.end annotation


# instance fields
.field public final c:Lee/f;


# direct methods
.method public constructor <init>(Lce/b;Lce/b;)V
    .locals 3

    .line 1
    const-string v0, "keySerializer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "valueSerializer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, p1, p2, v0}, Lge/w0;-><init>(Lce/b;Lce/b;Lkotlin/jvm/internal/n;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lee/o$c;->a:Lee/o$c;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    new-array v1, v1, [Lee/f;

    .line 19
    .line 20
    new-instance v2, Lge/f1;

    .line 21
    .line 22
    invoke-direct {v2, p1, p2}, Lge/f1;-><init>(Lce/b;Lce/b;)V

    .line 23
    .line 24
    .line 25
    const-string p1, "kotlin.collections.Map.Entry"

    .line 26
    .line 27
    invoke-static {p1, v0, v1, v2}, Lee/m;->h(Ljava/lang/String;Lee/n;[Lee/f;Lhd/l;)Lee/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, Lge/g1;->c:Lee/f;

    .line 32
    .line 33
    return-void
.end method

.method public static synthetic f(Lce/b;Lce/b;Lee/a;)Lqc/q;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lge/g1;->g(Lce/b;Lce/b;Lee/a;)Lqc/q;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lce/b;Lce/b;Lee/a;)Lqc/q;
    .locals 8

    .line 1
    const-string v0, "$this$buildSerialDescriptor"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lce/b;->getDescriptor()Lee/f;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    const/16 v6, 0xc

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const-string v2, "key"

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    const/4 v5, 0x0

    .line 17
    move-object v1, p2

    .line 18
    invoke-static/range {v1 .. v7}, Lee/a;->b(Lee/a;Ljava/lang/String;Lee/f;Ljava/util/List;ZILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1}, Lce/b;->getDescriptor()Lee/f;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v2, "value"

    .line 26
    .line 27
    invoke-static/range {v1 .. v7}, Lee/a;->b(Lee/a;Ljava/lang/String;Lee/f;Ljava/util/List;ZILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    sget-object v0, Lqc/q;->a:Lqc/q;

    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lge/g1;->h(Ljava/util/Map$Entry;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lge/g1;->i(Ljava/util/Map$Entry;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic e(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lge/g1;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getDescriptor()Lee/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lge/g1;->c:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public h(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public i(Ljava/util/Map$Entry;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    .line 1
    new-instance v0, Lge/g1$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lge/g1$a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
