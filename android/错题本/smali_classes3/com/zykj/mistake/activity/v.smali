.class public final synthetic Lcom/zykj/mistake/activity/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/zykj/mistake/activity/v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MistakeDetailActivity;)V
    .locals 0

    .line 2
    const/4 p1, 0x0

    iput p1, p0, Lcom/zykj/mistake/activity/v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/v;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1}, Lcom/zykj/view/board/simple/SimpleFragment;->m(Landroid/view/View;)V

    return-void

    :pswitch_0
    sget p1, Lcom/zykj/mistake/activity/MistakeDetailActivity;->s:I

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
