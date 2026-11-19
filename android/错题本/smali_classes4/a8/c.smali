.class public final La8/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;I)V
    .locals 0

    .line 1
    iput p2, p0, La8/c;->a:I

    iput-object p1, p0, La8/c;->b:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDismiss()V
    .locals 2

    .line 1
    iget v0, p0, La8/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La8/c;->b:Landroid/view/View;

    .line 7
    .line 8
    check-cast v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;

    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    iget-object v1, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->b:Landroid/widget/ImageView;

    .line 14
    .line 15
    iget-object v0, v0, Lcom/xuexiang/xui/widget/spinner/editspinner/EditSpinner;->e:Landroid/view/animation/RotateAnimation;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object v0, p0, La8/c;->b:Landroid/view/View;

    .line 22
    .line 23
    check-cast v0, Lorg/angmarch/views/NiceSpinner;

    .line 24
    .line 25
    iget-boolean v1, v0, Lorg/angmarch/views/NiceSpinner;->h:Z

    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-virtual {v0, v1}, Lorg/angmarch/views/NiceSpinner;->c(Z)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
