.class public final synthetic Landroidx/activity/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(IILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/f;->a:I

    iput-object p3, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    iput p1, p0, Landroidx/activity/f;->c:I

    iput-object p4, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V
    .locals 1

    .line 2
    const/4 v0, 0x3

    iput v0, p0, Landroidx/activity/f;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    iput-object p2, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    iput p3, p0, Landroidx/activity/f;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/activity/f;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    check-cast v0, Lcom/zykj/merge/sketch/view/OldSketchProxyView;

    iget-object v1, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    check-cast v1, Lr6/c;

    iget v2, p0, Landroidx/activity/f;->c:I

    invoke-static {v0, v1, v2}, Lcom/zykj/merge/sketch/view/OldSketchProxyView;->c(Lcom/zykj/merge/sketch/view/OldSketchProxyView;Lr6/c;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/profileinstaller/DeviceProfileWriter;

    iget v1, p0, Landroidx/activity/f;->c:I

    iget-object v2, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    invoke-static {v0, v1, v2}, Landroidx/profileinstaller/DeviceProfileWriter;->a(Landroidx/profileinstaller/DeviceProfileWriter;ILjava/lang/Object;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity$activityResultRegistry$1;

    iget-object v1, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    check-cast v1, Landroid/content/IntentSender$SendIntentException;

    iget v2, p0, Landroidx/activity/f;->c:I

    invoke-static {v0, v2, v1}, Landroidx/activity/ComponentActivity$activityResultRegistry$1;->b(Landroidx/activity/ComponentActivity$activityResultRegistry$1;ILandroid/content/IntentSender$SendIntentException;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Landroidx/activity/f;->b:Ljava/lang/Object;

    check-cast v0, Landroidx/activity/ComponentActivity$activityResultRegistry$1;

    iget-object v1, p0, Landroidx/activity/f;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;

    iget v2, p0, Landroidx/activity/f;->c:I

    invoke-static {v0, v2, v1}, Landroidx/activity/ComponentActivity$activityResultRegistry$1;->c(Landroidx/activity/ComponentActivity$activityResultRegistry$1;ILandroidx/activity/result/contract/ActivityResultContract$SynchronousResult;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
