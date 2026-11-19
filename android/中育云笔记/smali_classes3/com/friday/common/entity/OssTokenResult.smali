.class public final Lcom/friday/common/entity/OssTokenResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final result:Lcom/friday/common/entity/OssTokenResponse;

.field private final success:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/common/entity/OssTokenResponse;Z)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/entity/OssTokenResult;Lcom/friday/common/entity/OssTokenResponse;ZILjava/lang/Object;)Lcom/friday/common/entity/OssTokenResult;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-boolean p2, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/friday/common/entity/OssTokenResult;->copy(Lcom/friday/common/entity/OssTokenResponse;Z)Lcom/friday/common/entity/OssTokenResult;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/friday/common/entity/OssTokenResponse;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    return v0
.end method

.method public final copy(Lcom/friday/common/entity/OssTokenResponse;Z)Lcom/friday/common/entity/OssTokenResult;
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/entity/OssTokenResult;

    invoke-direct {v0, p1, p2}, Lcom/friday/common/entity/OssTokenResult;-><init>(Lcom/friday/common/entity/OssTokenResponse;Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/entity/OssTokenResult;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/entity/OssTokenResult;

    iget-object v1, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    iget-object v3, p1, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    iget-boolean p1, p1, Lcom/friday/common/entity/OssTokenResult;->success:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getResult()Lcom/friday/common/entity/OssTokenResponse;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    invoke-virtual {v0}, Lcom/friday/common/entity/OssTokenResponse;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/friday/common/entity/OssTokenResult;->result:Lcom/friday/common/entity/OssTokenResponse;

    iget-boolean v1, p0, Lcom/friday/common/entity/OssTokenResult;->success:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "OssTokenResult(result="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
