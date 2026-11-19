.class public final Lcom/friday/common/base/BaseCameraResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final __abp:Z

.field private final error:Lcom/friday/common/base/ErrorMessage;

.field private final result:Ljava/lang/Object;

.field private final success:Z

.field private final targetUrl:Ljava/lang/String;

.field private final unAuthorizedRequest:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZ)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    .line 4
    iput-boolean p3, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    .line 5
    iput-object p4, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    .line 6
    iput-boolean p5, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    .line 7
    iput-boolean p6, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZILkotlin/jvm/internal/n;)V
    .locals 7

    and-int/lit8 p7, p7, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move-object v4, p4

    move v5, p5

    move v6, p6

    .line 8
    invoke-direct/range {v0 .. v6}, Lcom/friday/common/base/BaseCameraResponse;-><init>(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/base/BaseCameraResponse;Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZILjava/lang/Object;)Lcom/friday/common/base/BaseCameraResponse;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-boolean p3, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-object p4, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-boolean p5, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    :cond_5
    move p7, p5

    move p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/friday/common/base/BaseCameraResponse;->copy(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZ)Lcom/friday/common/base/BaseCameraResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    return v0
.end method

.method public final component4()Lcom/friday/common/base/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    return v0
.end method

.method public final copy(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZ)Lcom/friday/common/base/BaseCameraResponse;
    .locals 8

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/common/base/BaseCameraResponse;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/friday/common/base/BaseCameraResponse;-><init>(Ljava/lang/Object;Ljava/lang/String;ZLcom/friday/common/base/ErrorMessage;ZZ)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/base/BaseCameraResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/base/BaseCameraResponse;

    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    iget-object v3, p1, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    iget-boolean v3, p1, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    iget-object v3, p1, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    iget-boolean v3, p1, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    iget-boolean p1, p1, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getError()Lcom/friday/common/base/ErrorMessage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTargetUrl()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUnAuthorizedRequest()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    .line 2
    .line 3
    return v0
.end method

.method public final get__abp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    invoke-virtual {v1}, Lcom/friday/common/base/ErrorMessage;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/friday/common/base/BaseCameraResponse;->result:Ljava/lang/Object;

    iget-object v1, p0, Lcom/friday/common/base/BaseCameraResponse;->targetUrl:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/friday/common/base/BaseCameraResponse;->success:Z

    iget-object v3, p0, Lcom/friday/common/base/BaseCameraResponse;->error:Lcom/friday/common/base/ErrorMessage;

    iget-boolean v4, p0, Lcom/friday/common/base/BaseCameraResponse;->unAuthorizedRequest:Z

    iget-boolean v5, p0, Lcom/friday/common/base/BaseCameraResponse;->__abp:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "BaseCameraResponse(result="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", targetUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", success="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unAuthorizedRequest="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", __abp="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
