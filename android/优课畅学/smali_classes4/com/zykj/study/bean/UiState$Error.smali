.class public final Lcom/zykj/study/bean/UiState$Error;
.super Lcom/zykj/study/bean/UiState;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/study/bean/UiState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Error"
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final exception:Ljava/lang/Throwable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    const-string v0, "exception"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lcom/zykj/study/bean/UiState;-><init>(Lkotlin/jvm/internal/n;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    .line 11
    .line 12
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/study/bean/UiState$Error;Ljava/lang/Throwable;ILjava/lang/Object;)Lcom/zykj/study/bean/UiState$Error;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    :cond_0
    invoke-virtual {p0, p1}, Lcom/zykj/study/bean/UiState$Error;->copy(Ljava/lang/Throwable;)Lcom/zykj/study/bean/UiState$Error;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final copy(Ljava/lang/Throwable;)Lcom/zykj/study/bean/UiState$Error;
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/study/bean/UiState$Error;

    invoke-direct {v0, p1}, Lcom/zykj/study/bean/UiState$Error;-><init>(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/bean/UiState$Error;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/bean/UiState$Error;

    iget-object v1, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    iget-object p1, p1, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getException()Ljava/lang/Throwable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final isBadNetwork()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    .line 2
    .line 3
    instance-of v1, v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Lcom/zykj/http/exception/RemoteCodeException;

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/zykj/http/exception/RemoteCodeException;->getErrorCodeInfo()Lcom/zykj/lib/error/code/ErrorCodeInfo;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Lcom/zykj/lib/error/code/ErrorCodeInfo;->getCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x255

    .line 18
    .line 19
    if-gt v1, v0, :cond_0

    .line 20
    .line 21
    const/16 v1, 0x258

    .line 22
    .line 23
    if-ge v0, v1, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    return v0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/bean/UiState$Error;->exception:Ljava/lang/Throwable;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Error(exception="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
