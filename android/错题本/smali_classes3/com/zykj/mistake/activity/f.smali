.class public final synthetic Lcom/zykj/mistake/activity/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/activity/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/activity/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/activity/f;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/activity/f;->b:Lcom/zykj/mistake/activity/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lcom/zykj/mistake/activity/f;->a:I

    .line 2
    .line 3
    sget-object v1, Ld6/s;->a:Ld6/s;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/zykj/mistake/activity/f;->b:Lcom/zykj/mistake/activity/MainActivity;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/app/Activity;->finish()V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :pswitch_0
    sget v0, Lcom/zykj/mistake/activity/MainActivity;->o:I

    .line 17
    .line 18
    invoke-virtual {v2}, Lcom/zykj/mistake/activity/MainActivity;->o()Lcom/zykj/mistake/main/MainShellViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sget-object v2, Lcom/zykj/mistake/main/v0;->a:Lcom/zykj/mistake/main/v0;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lcom/zykj/mistake/main/MainShellViewModel;->b(Lcom/zykj/mistake/main/l;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_1
    invoke-static {v2}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    sget-object v3, Lkotlinx/coroutines/f0;->a:Lg7/e;

    .line 33
    .line 34
    sget-object v3, Lg7/d;->a:Lg7/d;

    .line 35
    .line 36
    new-instance v4, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    invoke-direct {v4, v2, v5}, Lcom/zykj/mistake/activity/MainActivity$connection$1$onServiceConnected$1$1$1$1;-><init>(Lcom/zykj/mistake/activity/MainActivity;Lh6/c;)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-static {v0, v3, v5, v4, v2}, Lkotlinx/coroutines/x;->v(Lkotlinx/coroutines/v;Lh6/h;Lkotlinx/coroutines/CoroutineStart;Lr6/e;I)Lkotlinx/coroutines/k1;

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
