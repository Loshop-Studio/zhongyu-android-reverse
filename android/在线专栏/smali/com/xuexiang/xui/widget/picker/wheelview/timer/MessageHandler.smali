.class public final Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;
.super Landroid/os/Handler;
.source "SourceFile"


# static fields
.field public static final WHAT_INVALIDATE_LOOP_VIEW:I = 0x3e8

.field public static final WHAT_ITEM_SELECTED:I = 0xbb8

.field public static final WHAT_SMOOTH_SCROLL:I = 0x7d0


# instance fields
.field private final mWheelView:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;->mWheelView:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .line 1
    iget p1, p1, Landroid/os/Message;->what:I

    const/16 v0, 0x3e8

    if-eq p1, v0, :cond_2

    const/16 v0, 0x7d0

    if-eq p1, v0, :cond_1

    const/16 v0, 0xbb8

    if-eq p1, v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;->mWheelView:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->onItemSelected()V

    goto :goto_0

    .line 3
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;->mWheelView:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    sget-object v0, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;->FLING:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;->smoothScroll(Lcom/xuexiang/xui/widget/picker/wheelview/WheelView$ACTION;)V

    goto :goto_0

    .line 4
    :cond_2
    iget-object p1, p0, Lcom/xuexiang/xui/widget/picker/wheelview/timer/MessageHandler;->mWheelView:Lcom/xuexiang/xui/widget/picker/wheelview/WheelView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    :goto_0
    return-void
.end method
