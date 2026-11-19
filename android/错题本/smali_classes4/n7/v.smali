.class public final Ln7/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk7/g;


# static fields
.field public static final b:Ln7/v;

.field public static final c:Ljava/lang/String;


# instance fields
.field public final synthetic a:Lm7/d0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln7/v;

    .line 2
    .line 3
    invoke-direct {v0}, Ln7/v;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln7/v;->b:Ln7/v;

    .line 7
    .line 8
    const-string v0, "kotlinx.serialization.json.JsonObject"

    .line 9
    .line 10
    sput-object v0, Ln7/v;->c:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lm7/m1;->a:Lm7/m1;

    .line 5
    .line 6
    sget-object v1, Ln7/m;->a:Ln7/m;

    .line 7
    .line 8
    new-instance v2, Lm7/d0;

    .line 9
    .line 10
    invoke-interface {v0}, Li7/e;->getDescriptor()Lk7/g;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v1}, Li7/e;->getDescriptor()Lk7/g;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v3, "keyDesc"

    .line 19
    .line 20
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-string v3, "valueDesc"

    .line 24
    .line 25
    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v3, "kotlin.collections.LinkedHashMap"

    .line 29
    .line 30
    invoke-direct {v2, v3, v0, v1}, Lm7/d0;-><init>(Ljava/lang/String;Lk7/g;Lk7/g;)V

    .line 31
    .line 32
    .line 33
    iput-object v2, p0, Ln7/v;->a:Lm7/d0;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method

.method public final c(Ljava/lang/String;)I
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm7/d0;->c(Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    return v0
.end method

.method public final e(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public final f(I)Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm7/d0;->f(I)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final g(I)Lk7/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm7/d0;->g(I)Lk7/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final getAnnotations()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 7
    .line 8
    return-object v0
.end method

.method public final getKind()Lcoil3/network/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lk7/l;->d:Lk7/l;

    .line 7
    .line 8
    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ln7/v;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lm7/d0;->i(I)Z

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public final isInline()Z
    .locals 1

    .line 1
    iget-object v0, p0, Ln7/v;->a:Lm7/d0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    return v0
.end method
