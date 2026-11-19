.class public final Lcom/zykj/http/bean/ApiResp;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\u0008\u0087\u0008\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B3\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0019\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0008H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00018\u0000H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017JJ\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00082\u0008\u0010!\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0004H\u00d6\u0001J\t\u0010#\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001a\u0010\u000b\u001a\u0004\u0018\u00018\u00008\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Lcom/zykj/http/bean/ApiResp;",
        "T",
        "",
        "code",
        "",
        "msg",
        "",
        "success",
        "",
        "error",
        "Lcom/zykj/http/bean/ErrorInfo;",
        "result",
        "<init>",
        "(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)V",
        "getCode",
        "()I",
        "getMsg",
        "()Ljava/lang/String;",
        "getSuccess",
        "()Z",
        "getError",
        "()Lcom/zykj/http/bean/ErrorInfo;",
        "getResult",
        "()Ljava/lang/Object;",
        "Ljava/lang/Object;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)Lcom/zykj/http/bean/ApiResp;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "http_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final code:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "code"
    .end annotation
.end field

.field private final error:Lcom/zykj/http/bean/ErrorInfo;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "error"
    .end annotation
.end field

.field private final msg:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "msg"
    .end annotation
.end field

.field private final result:Ljava/lang/Object;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        alternate = {
            "result"
        }
        value = "data"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private final success:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "success"
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Z",
            "Lcom/zykj/http/bean/ErrorInfo;",
            "TT;)V"
        }
    .end annotation

    .line 1
    const-string v0, "msg"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    .line 12
    .line 13
    iput-boolean p3, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    .line 14
    .line 15
    iput-object p4, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/http/bean/ApiResp;ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;ILjava/lang/Object;)Lcom/zykj/http/bean/ApiResp;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-boolean p3, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/zykj/http/bean/ApiResp;->copy(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)Lcom/zykj/http/bean/ApiResp;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    return v0
.end method

.method public final component4()Lcom/zykj/http/bean/ErrorInfo;
    .locals 1

    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    return-object v0
.end method

.method public final component5()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)Lcom/zykj/http/bean/ApiResp;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Z",
            "Lcom/zykj/http/bean/ErrorInfo;",
            "TT;)",
            "Lcom/zykj/http/bean/ApiResp<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/http/bean/ApiResp;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/zykj/http/bean/ApiResp;-><init>(ILjava/lang/String;ZLcom/zykj/http/bean/ErrorInfo;Ljava/lang/Object;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/http/bean/ApiResp;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/http/bean/ApiResp;

    iget v1, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    iget v3, p1, Lcom/zykj/http/bean/ApiResp;->code:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    iget-boolean v3, p1, Lcom/zykj/http/bean/ApiResp;->success:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    iget-object v3, p1, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    iget-object p1, p1, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    .line 2
    .line 3
    return v0
.end method

.method public final getError()Lcom/zykj/http/bean/ErrorInfo;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getMsg()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getResult()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSuccess()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/zykj/http/bean/ErrorInfo;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/zykj/http/bean/ApiResp;->code:I

    iget-object v1, p0, Lcom/zykj/http/bean/ApiResp;->msg:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/zykj/http/bean/ApiResp;->success:Z

    iget-object v3, p0, Lcom/zykj/http/bean/ApiResp;->error:Lcom/zykj/http/bean/ErrorInfo;

    iget-object v4, p0, Lcom/zykj/http/bean/ApiResp;->result:Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ApiResp(code="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", msg="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", success="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", error="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", result="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
