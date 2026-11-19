.class public final synthetic Lcom/zykj/mistake/activity/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/Ref$IntRef;

.field public final synthetic b:Lcom/zykj/mistake/activity/SketchActivity;

.field public final synthetic c:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/Ref$IntRef;Lcom/zykj/mistake/activity/SketchActivity;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/activity/d0;->a:Lkotlin/jvm/internal/Ref$IntRef;

    iput-object p2, p0, Lcom/zykj/mistake/activity/d0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    iput-object p3, p0, Lcom/zykj/mistake/activity/d0;->c:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 2
    .line 3
    iget-object v0, p0, Lcom/zykj/mistake/activity/d0;->a:Lkotlin/jvm/internal/Ref$IntRef;

    .line 4
    .line 5
    iget v0, v0, Lkotlin/jvm/internal/Ref$IntRef;->element:I

    .line 6
    .line 7
    iget-object v1, p0, Lcom/zykj/mistake/activity/d0;->b:Lcom/zykj/mistake/activity/SketchActivity;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    if-eq v0, v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string v0, "\u7d20\u6750\u5bfc\u5165\u5931\u8d25"

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v0, "\u56fe\u7247\u8fdd\u89c4\uff0c\u65e0\u6cd5\u5bfc\u5165"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->b(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :goto_0
    iget-object v0, p0, Lcom/zykj/mistake/activity/d0;->c:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_3

    .line 33
    .line 34
    iget-object v3, v1, Lcom/zykj/mistake/activity/SketchActivity;->j:Lcom/zykj/view/board/board/BoardFragment;

    .line 35
    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    invoke-virtual {v3, v0, v2}, Lcom/zykj/view/board/board/BoardFragment;->addBitmapList(Ljava/util/List;Z)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    const-string v0, "mSketchFragment"

    .line 43
    .line 44
    invoke-static {v0}, Lkotlin/jvm/internal/k;->p(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    throw v0

    .line 49
    :cond_3
    :goto_1
    invoke-virtual {v1}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 50
    .line 51
    .line 52
    return-void
.end method
