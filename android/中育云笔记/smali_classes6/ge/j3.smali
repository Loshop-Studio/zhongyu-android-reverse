.class public final Lge/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lce/b;


# static fields
.field public static final a:Lge/j3;

.field public static final b:Lee/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lge/j3;

    .line 2
    .line 3
    invoke-direct {v0}, Lge/j3;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lge/j3;->a:Lge/j3;

    .line 7
    .line 8
    new-instance v0, Lge/j2;

    .line 9
    .line 10
    const-string v1, "kotlin.uuid.Uuid"

    .line 11
    .line 12
    sget-object v2, Lee/e$i;->a:Lee/e$i;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, Lge/j2;-><init>(Ljava/lang/String;Lee/e;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lge/j3;->b:Lee/f;

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
.method public a(Lfe/e;)Lkotlin/uuid/Uuid;
    .locals 1

    .line 1
    const-string v0, "decoder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lkotlin/uuid/Uuid;->e:Lkotlin/uuid/Uuid$a;

    .line 7
    .line 8
    invoke-interface {p1}, Lfe/e;->decodeString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p1}, Lkotlin/uuid/Uuid$a;->c(Ljava/lang/String;)Lkotlin/uuid/Uuid;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public b(Lfe/f;Lkotlin/uuid/Uuid;)V
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
    invoke-virtual {p2}, Lkotlin/uuid/Uuid;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-interface {p1, p2}, Lfe/f;->encodeString(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public bridge synthetic deserialize(Lfe/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lge/j3;->a(Lfe/e;)Lkotlin/uuid/Uuid;

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
    sget-object v0, Lge/j3;->b:Lee/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic serialize(Lfe/f;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lkotlin/uuid/Uuid;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lge/j3;->b(Lfe/f;Lkotlin/uuid/Uuid;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
