.class public final Lcom/friday/main/model/VersionUpdate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final __abp:Z

.field private final error:Ljava/lang/Object;

.field private final result:Lcom/friday/main/model/Result;

.field private final success:Z

.field private final targetUrl:Ljava/lang/Object;

.field private final unAuthorizedRequest:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(ZLjava/lang/Object;Lcom/friday/main/model/Result;ZLjava/lang/Object;Z)V
    .locals 1

    .line 1
    const-string v0, "error"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "result"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "targetUrl"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-boolean p1, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    .line 20
    .line 21
    iput-object p2, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    .line 24
    .line 25
    iput-boolean p4, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    .line 26
    .line 27
    iput-object p5, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    .line 28
    .line 29
    iput-boolean p6, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    .line 30
    .line 31
    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/main/model/VersionUpdate;ZLjava/lang/Object;Lcom/friday/main/model/Result;ZLjava/lang/Object;ZILjava/lang/Object;)Lcom/friday/main/model/VersionUpdate;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget-object p3, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget-boolean p4, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-boolean p6, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    :cond_5
    move-object p7, p5

    move p8, p6

    move-object p5, p3

    move p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/friday/main/model/VersionUpdate;->copy(ZLjava/lang/Object;Lcom/friday/main/model/Result;ZLjava/lang/Object;Z)Lcom/friday/main/model/VersionUpdate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    return v0
.end method

.method public final component2()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    return-object v0
.end method

.method public final component3()Lcom/friday/main/model/Result;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    return v0
.end method

.method public final component5()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    return v0
.end method

.method public final copy(ZLjava/lang/Object;Lcom/friday/main/model/Result;ZLjava/lang/Object;Z)Lcom/friday/main/model/VersionUpdate;
    .locals 8

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "targetUrl"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/friday/main/model/VersionUpdate;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move-object v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/friday/main/model/VersionUpdate;-><init>(ZLjava/lang/Object;Lcom/friday/main/model/Result;ZLjava/lang/Object;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/main/model/VersionUpdate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/main/model/VersionUpdate;

    iget-boolean v1, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    iget-boolean v3, p1, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    iget-object v3, p1, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    iget-object v3, p1, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    iget-boolean v3, p1, Lcom/friday/main/model/VersionUpdate;->success:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    iget-object v3, p1, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    iget-boolean p1, p1, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getError()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Lcom/friday/main/model/Result;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTargetUrl()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUnAuthorizedRequest()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    .line 2
    .line 3
    return v0
.end method

.method public final get__abp()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    invoke-virtual {v1}, Lcom/friday/main/model/Result;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lcom/friday/main/model/VersionUpdate;->__abp:Z

    iget-object v1, p0, Lcom/friday/main/model/VersionUpdate;->error:Ljava/lang/Object;

    iget-object v2, p0, Lcom/friday/main/model/VersionUpdate;->result:Lcom/friday/main/model/Result;

    iget-boolean v3, p0, Lcom/friday/main/model/VersionUpdate;->success:Z

    iget-object v4, p0, Lcom/friday/main/model/VersionUpdate;->targetUrl:Ljava/lang/Object;

    iget-boolean v5, p0, Lcom/friday/main/model/VersionUpdate;->unAuthorizedRequest:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "VersionUpdate(__abp="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", targetUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unAuthorizedRequest="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
