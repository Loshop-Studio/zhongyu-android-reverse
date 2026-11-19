.class public final synthetic Lg4/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/mistake/adapter/MistakeListAdapter;

.field public final synthetic b:I


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/adapter/MistakeListAdapter;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4/a;->a:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    iput p2, p0, Lg4/a;->b:I

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 3

    .line 1
    iget-object p1, p0, Lg4/a;->a:Lcom/zykj/mistake/adapter/MistakeListAdapter;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/zykj/mistake/adapter/MistakeListAdapter;->c:Lcom/zykj/mistake/activity/MistakeListActivity;

    .line 4
    .line 5
    iget-boolean v0, p1, Lcom/zykj/mistake/activity/MistakeListActivity;->m:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    const-string v0, "vibrator"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "null cannot be cast to non-null type android.os.Vibrator"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v0, Landroid/os/Vibrator;

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/os/Vibrator;->hasVibrator()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    const-wide/16 v1, 0x64

    .line 29
    .line 30
    invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget v0, p0, Lg4/a;->b:I

    .line 34
    .line 35
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, Lcom/zykj/mistake/activity/MistakeListActivity;->E(Ljava/lang/Integer;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    const/4 p1, 0x1

    .line 43
    return p1
.end method
