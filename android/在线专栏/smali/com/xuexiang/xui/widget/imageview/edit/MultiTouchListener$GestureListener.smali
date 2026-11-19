.class final Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "GestureListener"
.end annotation


# instance fields
.field final synthetic this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;


# direct methods
.method private constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;-><init>(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)V

    return-void
.end method


# virtual methods
.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/GestureDetector$SimpleOnGestureListener;->onLongPress(Landroid/view/MotionEvent;)V

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$600(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$600(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;->onLongClick()V

    :cond_0
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$600(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$GestureListener;->this$0:Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;

    invoke-static {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;->access$600(Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener;)Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;

    move-result-object p1

    invoke-interface {p1}, Lcom/xuexiang/xui/widget/imageview/edit/MultiTouchListener$OnGestureControl;->onClick()V

    :cond_0
    const/4 p1, 0x1

    return p1
.end method
