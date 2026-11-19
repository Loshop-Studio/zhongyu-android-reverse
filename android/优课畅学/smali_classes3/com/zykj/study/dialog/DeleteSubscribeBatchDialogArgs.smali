.class public final Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/navigation/NavArgs;


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x1
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;-><init>(Lkotlin/jvm/internal/n;)V

    sput-object v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->b:Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "number"

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
    iput-object p1, p0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->a:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static final fromBundle(Landroid/os/Bundle;)Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;
    .locals 1

    sget-object v0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->b:Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;

    invoke-virtual {v0, p0}, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs$a;->a(Landroid/os/Bundle;)Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;

    iget-object v1, p0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->a:Ljava/lang/String;

    iget-object p1, p1, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->a:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/u;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/zykj/study/dialog/DeleteSubscribeBatchDialogArgs;->a:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "DeleteSubscribeBatchDialogArgs(number="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
