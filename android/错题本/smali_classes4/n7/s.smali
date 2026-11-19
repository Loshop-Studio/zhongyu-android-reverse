.class public final Ln7/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Ln7/s;

.field public static final b:Lk7/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ln7/s;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln7/s;->a:Ln7/s;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Lk7/g;

    .line 10
    .line 11
    const-string v1, "kotlinx.serialization.json.JsonNull"

    .line 12
    .line 13
    sget-object v2, Lk7/k;->b:Lk7/k;

    .line 14
    .line 15
    invoke-static {v1, v2, v0}, La/a;->h(Ljava/lang/String;Lcoil3/network/g;[Lk7/g;)Lk7/h;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Ln7/s;->b:Lk7/h;

    .line 20
    .line 21
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
    invoke-interface {p1}, Ll7/e;->decodeNotNullMark()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p1}, Ll7/e;->decodeNull()Ljava/lang/Void;

    .line 16
    .line 17
    .line 18
    sget-object p1, Ln7/r;->INSTANCE:Ln7/r;

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    new-instance p1, Lkotlinx/serialization/json/internal/JsonDecodingException;

    .line 22
    .line 23
    const-string v0, "Expected \'null\' literal"

    .line 24
    .line 25
    invoke-direct {p1, v0}, Lkotlinx/serialization/json/internal/JsonDecodingException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p1
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Ln7/s;->b:Lk7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ln7/r;

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
    invoke-interface {p1}, Ll7/f;->encodeNull()V

    .line 12
    .line 13
    .line 14
    return-void
.end method
