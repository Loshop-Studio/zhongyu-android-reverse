.class public Lcom/zykj/video/play/controller/TCControllerFullScreen$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerFullScreen;->h(Landroid/view/View;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:I

.field public final synthetic c:Lcom/zykj/video/play/controller/TCControllerFullScreen;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;Landroid/view/View;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->c:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->a:Landroid/view/View;

    .line 4
    .line 5
    iput p3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->b:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->a:Landroid/view/View;

    .line 5
    .line 6
    invoke-virtual {v1, v0}, Landroid/view/View;->getLocationInWindow([I)V

    .line 7
    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget v0, v0, v1

    .line 11
    .line 12
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->c:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 13
    .line 14
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->n(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->b:I

    .line 19
    .line 20
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Lj5/d;

    .line 25
    .line 26
    iget-object v3, v2, Lj5/d;->a:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v4, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->c:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 29
    .line 30
    invoke-static {v4}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    iget v2, v2, Lj5/d;->b:F

    .line 40
    .line 41
    float-to-long v6, v2

    .line 42
    invoke-static {v6, v7}, Ln5/d;->b(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, " "

    .line 50
    .line 51
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->c:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 65
    .line 66
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$c;->c:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 74
    .line 75
    invoke-static {v1, v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->p(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
