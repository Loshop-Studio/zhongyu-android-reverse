.class public Lcom/xuexiang/xui/widget/imageview/photoview/c$a;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/xuexiang/xui/widget/imageview/photoview/c;-><init>(Landroid/widget/ImageView;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic c:Lcom/xuexiang/xui/widget/imageview/photoview/c;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/imageview/photoview/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->e(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Lcom/xuexiang/xui/widget/imageview/photoview/c$h;

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return p1
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->d(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Landroid/view/View$OnLongClickListener;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->u()Landroid/widget/ImageView;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getY()F

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    const/4 v0, 0x0

    .line 20
    cmpl-float p1, p1, v0

    .line 21
    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->u()Landroid/widget/ImageView;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getX()F

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    cmpl-float p1, p1, v0

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    .line 38
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 39
    .line 40
    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->d(Lcom/xuexiang/xui/widget/imageview/photoview/c;)Landroid/view/View$OnLongClickListener;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/photoview/c$a;->c:Lcom/xuexiang/xui/widget/imageview/photoview/c;

    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/xuexiang/xui/widget/imageview/photoview/c;->u()Landroid/widget/ImageView;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {p1, v0}, Landroid/view/View$OnLongClickListener;->onLongClick(Landroid/view/View;)Z

    .line 51
    .line 52
    .line 53
    :cond_0
    return-void
.end method
