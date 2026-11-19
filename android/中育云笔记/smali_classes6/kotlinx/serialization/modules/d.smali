.class public abstract Lkotlinx/serialization/modules/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lhe/a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lkotlinx/serialization/modules/b;

    .line 2
    .line 3
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static {}, Lkotlin/collections/a;->h()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    const/4 v6, 0x0

    .line 24
    invoke-direct/range {v0 .. v6}, Lkotlinx/serialization/modules/b;-><init>(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Z)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lkotlinx/serialization/modules/d;->a:Lhe/a;

    .line 28
    .line 29
    return-void
.end method

.method public static final a()Lhe/a;
    .locals 1

    .line 1
    sget-object v0, Lkotlinx/serialization/modules/d;->a:Lhe/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final b(Lhe/a;Lhe/a;)Lhe/a;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    invoke-direct {v0}, Lkotlinx/serialization/modules/c;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lkotlinx/serialization/modules/c;->g(Lhe/a;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Lkotlinx/serialization/modules/d$a;

    .line 20
    .line 21
    invoke-direct {p0, v0}, Lkotlinx/serialization/modules/d$a;-><init>(Lkotlinx/serialization/modules/c;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lhe/a;->a(Lhe/c;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lkotlinx/serialization/modules/c;->f()Lhe/a;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public static final c(Lhe/a;Lhe/a;)Lhe/a;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "other"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lkotlinx/serialization/modules/c;

    .line 12
    .line 13
    invoke-direct {v0}, Lkotlinx/serialization/modules/c;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lkotlinx/serialization/modules/c;->g(Lhe/a;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lkotlinx/serialization/modules/c;->g(Lhe/a;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lkotlinx/serialization/modules/c;->f()Lhe/a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
