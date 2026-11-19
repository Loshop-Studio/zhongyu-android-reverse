.class public final Lcom/zykj/mistake/main/m;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/zykj/mistake/main/l;

.field public final b:Lcom/zykj/mistake/main/RemoveDialogTarget;


# direct methods
.method public constructor <init>(Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;)V
    .locals 1

    .line 1
    const-string v0, "endDrawer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 12
    .line 13
    return-void
.end method

.method public static a(Lcom/zykj/mistake/main/m;Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;I)Lcom/zykj/mistake/main/m;
    .locals 1

    .line 1
    and-int/lit8 v0, p3, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const-string p0, "endDrawer"

    .line 17
    .line 18
    invoke-static {p1, p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Lcom/zykj/mistake/main/m;

    .line 22
    .line 23
    invoke-direct {p0, p1, p2}, Lcom/zykj/mistake/main/m;-><init>(Lcom/zykj/mistake/main/l;Lcom/zykj/mistake/main/RemoveDialogTarget;)V

    .line 24
    .line 25
    .line 26
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/mistake/main/m;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/mistake/main/m;

    iget-object v1, p0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    iget-object v3, p1, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    iget-object p1, p1, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MainShellState(endDrawer="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/zykj/mistake/main/m;->a:Lcom/zykj/mistake/main/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", removeDialogTarget="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/zykj/mistake/main/m;->b:Lcom/zykj/mistake/main/RemoveDialogTarget;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
