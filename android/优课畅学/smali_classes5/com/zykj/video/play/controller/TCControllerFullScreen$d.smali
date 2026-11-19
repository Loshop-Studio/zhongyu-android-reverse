.class public Lcom/zykj/video/play/controller/TCControllerFullScreen$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/zykj/video/play/controller/TCControllerFullScreen;->z(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/video/play/controller/TCControllerFullScreen;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/controller/TCControllerFullScreen;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->b:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    iput p2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->a:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->b:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->a:I

    .line 12
    .line 13
    div-int/lit8 v2, v0, 0x2

    .line 14
    .line 15
    sub-int/2addr v1, v2

    .line 16
    iget-object v2, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->b:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 17
    .line 18
    invoke-static {v2}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 27
    .line 28
    iput v1, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 29
    .line 30
    if-gez v1, :cond_0

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 34
    .line 35
    :cond_0
    iget-object v3, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->b:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 36
    .line 37
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 46
    .line 47
    add-int/2addr v1, v0

    .line 48
    if-le v1, v3, :cond_1

    .line 49
    .line 50
    sub-int/2addr v3, v0

    .line 51
    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->leftMargin:I

    .line 52
    .line 53
    :cond_1
    iget-object v0, p0, Lcom/zykj/video/play/controller/TCControllerFullScreen$d;->b:Lcom/zykj/video/play/controller/TCControllerFullScreen;

    .line 54
    .line 55
    invoke-static {v0}, Lcom/zykj/video/play/controller/TCControllerFullScreen;->o(Lcom/zykj/video/play/controller/TCControllerFullScreen;)Landroid/widget/TextView;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 60
    .line 61
    .line 62
    return-void
.end method
