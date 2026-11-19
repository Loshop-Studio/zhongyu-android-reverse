.class public final Lcom/friday/common/classtest/RequestScreencastData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation


# static fields
.field public static final $stable:I


# instance fields
.field private final ip:Ljava/lang/String;

.field private final isScreenCast:Z

.field private final userId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    .line 4
    iput-object p2, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 3

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x1

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    .line 6
    sget-object p2, Lcom/friday/common/helper/b;->a:Lcom/friday/common/helper/b$a;

    invoke-virtual {p2}, Lcom/friday/common/helper/b$a;->a()Lcom/friday/common/helper/b;

    move-result-object p2

    invoke-virtual {p2}, Lcom/friday/common/helper/b;->t()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    .line 7
    invoke-static {v0}, Lcom/blankj/utilcode/util/NetworkUtils;->getIPAddress(Z)Ljava/lang/String;

    move-result-object p3

    const-string p4, "getIPAddress(...)"

    invoke-static {p3, p4}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p4, "."

    const/4 p5, 0x0

    const/4 v0, 0x2

    invoke-static {p3, p4, p5, v0, p5}, Lqd/c0;->W0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 8
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/friday/common/classtest/RequestScreencastData;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/friday/common/classtest/RequestScreencastData;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/friday/common/classtest/RequestScreencastData;->copy(ZLjava/lang/String;Ljava/lang/String;)Lcom/friday/common/classtest/RequestScreencastData;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZLjava/lang/String;Ljava/lang/String;)Lcom/friday/common/classtest/RequestScreencastData;
    .locals 1

    const-string v0, "userId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ip"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/friday/common/classtest/RequestScreencastData;

    invoke-direct {v0, p1, p2, p3}, Lcom/friday/common/classtest/RequestScreencastData;-><init>(ZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/friday/common/classtest/RequestScreencastData;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/friday/common/classtest/RequestScreencastData;

    iget-boolean v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    iget-boolean v3, p1, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    iget-object v3, p1, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    iget-object p1, p1, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getIp()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUserId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final isScreenCast()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lcom/friday/common/classtest/RequestScreencastData;->isScreenCast:Z

    iget-object v1, p0, Lcom/friday/common/classtest/RequestScreencastData;->userId:Ljava/lang/String;

    iget-object v2, p0, Lcom/friday/common/classtest/RequestScreencastData;->ip:Ljava/lang/String;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "RequestScreencastData(isScreenCast="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", userId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", ip="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
