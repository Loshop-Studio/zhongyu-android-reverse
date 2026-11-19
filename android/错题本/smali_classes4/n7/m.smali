.class public final Ln7/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Ln7/m;

.field public static final b:Lk7/h;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ln7/m;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln7/m;->a:Ln7/m;

    .line 7
    .line 8
    sget-object v0, Lk7/c;->c:Lk7/c;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Lk7/g;

    .line 12
    .line 13
    new-instance v2, Ln7/l;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    invoke-direct {v2, v3}, Ln7/l;-><init>(I)V

    .line 17
    .line 18
    .line 19
    const-string v3, "kotlinx.serialization.json.JsonElement"

    .line 20
    .line 21
    invoke-static {v3, v0, v1, v2}, La/a;->g(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;Lr6/c;)Lk7/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ln7/m;->b:Lk7/h;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/collections/u;->g(Ll7/e;)Ln7/h;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-interface {p1}, Ln7/h;->a()Ln7/j;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Ln7/m;->b:Lk7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ln7/j;

    .line 2
    .line 3
    const-string v0, "value"

    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lkotlin/collections/u;->d(Ll7/f;)V

    .line 9
    .line 10
    .line 11
    instance-of v0, p2, Ln7/y;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Ln7/z;->a:Ln7/z;

    .line 16
    .line 17
    invoke-interface {p1, v0, p2}, Ll7/f;->encodeSerializableValue(Li7/e;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    instance-of v0, p2, Ln7/u;

    .line 22
    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    sget-object v0, Ln7/w;->a:Ln7/w;

    .line 26
    .line 27
    invoke-interface {p1, v0, p2}, Ll7/f;->encodeSerializableValue(Li7/e;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    instance-of v0, p2, Ln7/d;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    sget-object v0, Ln7/f;->a:Ln7/f;

    .line 36
    .line 37
    invoke-interface {p1, v0, p2}, Ll7/f;->encodeSerializableValue(Li7/e;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 42
    .line 43
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 44
    .line 45
    .line 46
    throw p1
.end method
