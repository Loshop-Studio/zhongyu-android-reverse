.class public final Lge/s2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# static fields
.field public static final a:Lge/s2;

.field public static final b:Lee/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lge/s2;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/s2;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/s2;->a:Lge/s2;

    .line 7
    .line 8
    new-instance v0, Lge/j2;

    .line 9
    .line 10
    const-string v1, "kotlin.String"

    .line 11
    .line 12
    sget-object v2, Lee/e$i;->a:Lee/e$i;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lge/j2;-><init>(Ljava/lang/String;Lee/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lge/s2;->b:Lee/f;

    .line 18
    .line 19
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lfe/e;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lfe/e;->decodeString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public b(Lfe/f;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "encoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "value"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, p2}, Lfe/f;->encodeString(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lge/s2;->a(Lfe/e;)Ljava/lang/String;

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
    sget-object v0, Lge/s2;->b:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lge/s2;->b(Lfe/f;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
