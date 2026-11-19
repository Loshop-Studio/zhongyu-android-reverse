.class public final Lcom/zykj/evaluation/version/VersionResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/zykj/evaluation/version/VersionResp;",
        "",
        "result",
        "Lcom/zykj/evaluation/version/VersionResult;",
        "success",
        "",
        "error",
        "Lcom/zykj/evaluation/version/ErrorInfo;",
        "<init>",
        "(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)V",
        "getResult",
        "()Lcom/zykj/evaluation/version/VersionResult;",
        "getSuccess",
        "()Z",
        "getError",
        "()Lcom/zykj/evaluation/version/ErrorInfo;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
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
.field public static final $stable:I


# instance fields
.field private final error:Lcom/zykj/evaluation/version/ErrorInfo;

.field private final result:Lcom/zykj/evaluation/version/VersionResult;

.field private final success:Z


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/version/VersionResp;Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;ILjava/lang/Object;)Lcom/zykj/evaluation/version/VersionResp;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/zykj/evaluation/version/VersionResp;->copy(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)Lcom/zykj/evaluation/version/VersionResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/zykj/evaluation/version/VersionResult;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    return v0
.end method

.method public final component3()Lcom/zykj/evaluation/version/ErrorInfo;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    return-object v0
.end method

.method public final copy(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)Lcom/zykj/evaluation/version/VersionResp;
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/version/VersionResp;

    invoke-direct {v0, p1, p2, p3}, Lcom/zykj/evaluation/version/VersionResp;-><init>(Lcom/zykj/evaluation/version/VersionResult;ZLcom/zykj/evaluation/version/ErrorInfo;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/version/VersionResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/version/VersionResp;

    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    iget-object v3, p1, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    iget-boolean v3, p1, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    iget-object p1, p1, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getError()Lcom/zykj/evaluation/version/ErrorInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Lcom/zykj/evaluation/version/VersionResult;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/zykj/evaluation/version/VersionResult;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    invoke-static {v2}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/zykj/evaluation/version/ErrorInfo;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/zykj/evaluation/version/VersionResp;->result:Lcom/zykj/evaluation/version/VersionResult;

    iget-boolean v1, p0, Lcom/zykj/evaluation/version/VersionResp;->success:Z

    iget-object v2, p0, Lcom/zykj/evaluation/version/VersionResp;->error:Lcom/zykj/evaluation/version/ErrorInfo;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "VersionResp(result="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", success="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
