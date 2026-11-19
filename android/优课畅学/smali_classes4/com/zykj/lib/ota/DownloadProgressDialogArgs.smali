.class public final Lcom/zykj/lib/ota/DownloadProgressDialogArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;
    }
.end annotation


# static fields
.field public static final c:Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->c:Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const-string v0, "fileUrl"

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
    iput-object p1, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput-boolean p2, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    .line 12
    .line 13
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/lib/ota/DownloadProgressDialogArgs;
    .locals 1

    sget-object v0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->c:Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/lib/ota/DownloadProgressDialogArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;

    iget-object v1, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    iget-boolean p1, p1, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    if-eq v1, p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->a:Ljava/lang/String;

    iget-boolean v1, p0, Lcom/zykj/lib/ota/DownloadProgressDialogArgs;->b:Z

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DownloadProgressDialogArgs(fileUrl="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", force="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
