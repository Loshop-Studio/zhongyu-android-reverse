.class public final synthetic Lg5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/simpleBoard/action/BaseAction;

.field public final synthetic c:Landroid/view/MotionEvent;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;I)V
    .locals 0

    .line 1
    iput p3, p0, Lg5/a;->a:I

    iput-object p1, p0, Lg5/a;->b:Lcom/zykj/view/simpleBoard/action/BaseAction;

    iput-object p2, p0, Lg5/a;->c:Landroid/view/MotionEvent;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lg5/a;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg5/a;->b:Lcom/zykj/view/simpleBoard/action/BaseAction;

    iget-object v1, p0, Lg5/a;->c:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->d(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lg5/a;->b:Lcom/zykj/view/simpleBoard/action/BaseAction;

    iget-object v1, p0, Lg5/a;->c:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->a(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lg5/a;->b:Lcom/zykj/view/simpleBoard/action/BaseAction;

    iget-object v1, p0, Lg5/a;->c:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->b(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lg5/a;->b:Lcom/zykj/view/simpleBoard/action/BaseAction;

    iget-object v1, p0, Lg5/a;->c:Landroid/view/MotionEvent;

    invoke-static {v0, v1}, Lcom/zykj/view/simpleBoard/action/BaseAction;->c(Lcom/zykj/view/simpleBoard/action/BaseAction;Landroid/view/MotionEvent;)Ld6/s;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
