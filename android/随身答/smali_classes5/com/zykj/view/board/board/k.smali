.class public final Lcom/zykj/view/board/board/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/view/board/board/l;


# direct methods
.method public constructor <init>(Lcom/zykj/view/board/board/l;)V
    .locals 1

    const-string v0, "eraserType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/view/board/board/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    sget-object p1, Lcom/zykj/view/board/board/l$b;->c:Lcom/zykj/view/board/board/l$b;

    .line 4
    :cond_0
    invoke-direct {p0, p1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/l;)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/zykj/view/board/board/l;)Lcom/zykj/view/board/board/k;
    .locals 1

    .line 1
    const-string v0, "eraserType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/zykj/view/board/board/k;

    invoke-direct {v0, p1}, Lcom/zykj/view/board/board/k;-><init>(Lcom/zykj/view/board/board/l;)V

    return-object v0
.end method

.method public final b()Lcom/zykj/view/board/board/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/view/board/board/k;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/view/board/board/k;

    iget-object v1, p0, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    iget-object p1, p1, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/view/board/board/k;->a:Lcom/zykj/view/board/board/l;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "EraserToolState(eraserType="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
