.class final Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/blackboard/core/edit/BasePageControl;-><init>(Lcom/zykj/blackboard/core/edit/BoardControl;Lb5/j;Lcom/zykj/blackboard/core/data/dao/PageEntity;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lg5/c;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lg5/c;",
        "deleteGraph",
        "",
        "a",
        "(Lg5/c;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/blackboard/core/edit/BasePageControl;


# direct methods
.method public constructor <init>(Lcom/zykj/blackboard/core/edit/BasePageControl;)V
    .locals 0

    iput-object p1, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lg5/c;)V
    .locals 1

    .line 1
    const-string v0, "deleteGraph"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    .line 11
    .line 12
    invoke-interface {v0}, Ld5/k;->w()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Lcom/zykj/blackboard/core/graph/group/ImageGraph;

    .line 19
    .line 20
    invoke-virtual {p1}, Lh5/a;->H()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Lh5/a;->J()V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p1}, Lh5/a;->H()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object v0, p0, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->a:Lcom/zykj/blackboard/core/edit/BasePageControl;

    .line 36
    .line 37
    invoke-virtual {v0}, Lcom/zykj/blackboard/core/edit/BasePageControl;->S()Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lg5/c;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/zykj/blackboard/core/edit/BasePageControl$graphControl$1$1;->a(Lg5/c;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p1
.end method
