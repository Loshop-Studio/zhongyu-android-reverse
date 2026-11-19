.class public final Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;
.super Landroidx/activity/OnBackPressedCallback;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\n\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "com/zykj/mistake/base/BaseMVPActivity$showLoading$1",
        "Landroidx/activity/OnBackPressedCallback;",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lcom/zykj/mistake/base/BaseMVPActivity;


# direct methods
.method public constructor <init>(ZLcom/zykj/mistake/base/BaseMVPActivity;)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;->a:Z

    .line 2
    .line 3
    iput-object p2, p0, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;->b:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Landroidx/activity/OnBackPressedCallback;-><init>(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final handleOnBackPressed()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/zykj/mistake/base/BaseMVPActivity$showLoading$1;->b:Lcom/zykj/mistake/base/BaseMVPActivity;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/zykj/mistake/base/BaseMVPActivity;->c()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method
