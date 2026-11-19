.class final Lcom/zykj/blackboard/core/edit/PageControl$save$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/PageControl;->save()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lhd/a;"
    }
.end annotation


# instance fields
.field public final synthetic c:Lcom/zykj/blackboard/core/edit/PageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/PageControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->c:Lcom/zykj/blackboard/core/edit/PageControl;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->c:Lcom/zykj/blackboard/core/edit/PageControl;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->P()Lv9/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lv9/b;->T()Landroid/graphics/Bitmap;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/blackboard/core/edit/PageControl$save$1;->a()Landroid/graphics/Bitmap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
