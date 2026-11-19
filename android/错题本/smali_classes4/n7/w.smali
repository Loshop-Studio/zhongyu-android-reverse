.class public final Ln7/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Ln7/w;

.field public static final b:Ln7/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln7/w;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln7/w;->a:Ln7/w;

    .line 7
    .line 8
    sget-object v0, Ln7/v;->b:Ln7/v;

    .line 9
    .line 10
    sput-object v0, Ln7/w;->b:Ln7/v;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 5

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
    new-instance v0, Ln7/u;

    .line 10
    .line 11
    sget-object v1, Lm7/m1;->a:Lm7/m1;

    .line 12
    .line 13
    sget-object v2, Ln7/m;->a:Ln7/m;

    .line 14
    .line 15
    new-instance v3, Lm7/e0;

    .line 16
    .line 17
    const/4 v4, 0x1

    .line 18
    invoke-direct {v3, v1, v2, v4}, Lm7/e0;-><init>(Li7/b;Li7/b;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, p1}, Lm7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Ljava/util/Map;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Ln7/u;-><init>(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Ln7/w;->b:Ln7/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 4

    .line 1
    check-cast p2, Ln7/u;

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
    sget-object v0, Lm7/m1;->a:Lm7/m1;

    .line 12
    .line 13
    sget-object v1, Ln7/m;->a:Ln7/m;

    .line 14
    .line 15
    new-instance v2, Lm7/e0;

    .line 16
    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-direct {v2, v0, v1, v3}, Lm7/e0;-><init>(Li7/b;Li7/b;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, p1, p2}, Lm7/e0;->serialize(Ll7/f;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
