.class public final Ln7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li7/b;


# static fields
.field public static final a:Ln7/f;

.field public static final b:Ln7/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ln7/f;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ln7/f;->a:Ln7/f;

    .line 7
    .line 8
    sget-object v0, Ln7/e;->b:Ln7/e;

    .line 9
    .line 10
    sput-object v0, Ln7/f;->b:Ln7/e;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final deserialize(Ll7/e;)Ljava/lang/Object;
    .locals 2

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
    new-instance v0, Ln7/d;

    .line 10
    .line 11
    sget-object v1, Ln7/m;->a:Ln7/m;

    .line 12
    .line 13
    invoke-static {v1}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1}, Lm7/a;->deserialize(Ll7/e;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Ln7/d;-><init>(Ljava/util/List;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final getDescriptor()Lk7/g;
    .locals 1

    .line 1
    sget-object v0, Ln7/f;->b:Ln7/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final serialize(Ll7/f;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p2, Ln7/d;

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
    sget-object v0, Ln7/m;->a:Ln7/m;

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/collections/u;->c(Li7/b;)Lm7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0, p1, p2}, Lm7/r;->serialize(Ll7/f;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method
