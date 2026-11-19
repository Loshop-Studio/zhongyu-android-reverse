.class public final synthetic Lcom/zykj/mistake/activity/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/view/KeyEvent$Callback;


# direct methods
.method public synthetic constructor <init>(Landroid/view/KeyEvent$Callback;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/b0;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/b0;->b:Landroid/view/KeyEvent$Callback;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/b0;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/activity/b0;->b:Landroid/view/KeyEvent$Callback;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast v2, Lcom/zykj/mistake/activity/SketchPlayerActivity;

    .line 11
    .line 12
    sget v0, Lcom/zykj/mistake/activity/SketchPlayerActivity;->g:I

    .line 13
    .line 14
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 15
    .line 16
    .line 17
    return-object v1

    .line 18
    :pswitch_0
    check-cast v2, Landroid/view/View;

    .line 19
    .line 20
    sget v0, Lcom/zykj/mistake/activity/SketchActivity;->v:I

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
