.class public final Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;
    }
.end annotation


# static fields
.field public static final f:Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Lcom/zykj/lib/ota/bean/AppType;

.field public final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->f:Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Lcom/zykj/lib/ota/bean/AppType;Z)V
    .locals 1

    .line 1
    const-string v0, "packageName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "versionName"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "appType"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput p2, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    .line 22
    .line 23
    iput-object p3, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p4, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    .line 26
    .line 27
    iput-boolean p5, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    .line 28
    .line 29
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;
    .locals 1

    sget-object v0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->f:Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/zykj/lib/ota/bean/AppType;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    .line 2
    .line 3
    return v0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;

    iget-object v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    iget v3, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    iget-object v3, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    iget-boolean p1, p1, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->a:Ljava/lang/String;

    iget v1, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->b:I

    iget-object v2, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->c:Ljava/lang/String;

    iget-object v3, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->d:Lcom/zykj/lib/ota/bean/AppType;

    iget-boolean v4, p0, Lcom/zykj/lib/ota/CheckVersionProgressDialogArgs;->e:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CheckVersionProgressDialogArgs(packageName="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", versionCode="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", versionName="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", appType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", silence="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
