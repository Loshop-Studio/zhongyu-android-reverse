.class public final Lcom/zykj/mistake/entity/resp/CustomTagInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u000c\"\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0008\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0014\"\u0004\u0008\u0018\u0010\u0016\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/zykj/mistake/entity/resp/CustomTagInfo;",
        "",
        "name",
        "",
        "id",
        "",
        "bindItemsCount",
        "",
        "localType",
        "<init>",
        "(Ljava/lang/String;JII)V",
        "getName",
        "()Ljava/lang/String;",
        "setName",
        "(Ljava/lang/String;)V",
        "getId",
        "()J",
        "setId",
        "(J)V",
        "getBindItemsCount",
        "()I",
        "setBindItemsCount",
        "(I)V",
        "getLocalType",
        "setLocalType",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private bindItemsCount:I

.field private id:J

.field private localType:I

.field private name:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const/16 v6, 0xf

    const/4 v7, 0x0

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;JII)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->name:Ljava/lang/String;

    .line 4
    iput-wide p2, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->id:J

    .line 5
    iput p4, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->bindItemsCount:I

    .line 6
    iput p5, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->localType:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JIIILkotlin/jvm/internal/e;)V
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    .line 7
    const-string p1, ""

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const-wide/16 p2, 0x0

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    const/4 p4, 0x0

    :cond_2
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_3

    const/4 p5, -0x1

    :cond_3
    move p6, p4

    move p7, p5

    move-wide p4, p2

    move-object p2, p0

    move-object p3, p1

    .line 8
    invoke-direct/range {p2 .. p7}, Lcom/zykj/mistake/entity/resp/CustomTagInfo;-><init>(Ljava/lang/String;JII)V

    return-void
.end method


# virtual methods
.method public final getBindItemsCount()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->bindItemsCount:I

    .line 2
    .line 3
    return v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getLocalType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->localType:I

    .line 2
    .line 3
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setBindItemsCount(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->bindItemsCount:I

    .line 2
    .line 3
    return-void
.end method

.method public final setId(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->id:J

    .line 2
    .line 3
    return-void
.end method

.method public final setLocalType(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->localType:I

    .line 2
    .line 3
    return-void
.end method

.method public final setName(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/zykj/mistake/entity/resp/CustomTagInfo;->name:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method
