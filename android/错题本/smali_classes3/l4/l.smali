.class public final synthetic Ll4/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/dialog/WebViewShotDialog;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;I)V
    .locals 0

    .line 1
    iput p2, p0, Ll4/l;->a:I

    iput-object p1, p0, Ll4/l;->b:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Ll4/l;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Ll4/l;->b:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->g:Lcom/zykj/mistake/activity/c0;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 20
    .line 21
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 22
    .line 23
    const-string v1, "webView"

    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x1

    .line 33
    invoke-virtual {p1, v1}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {v0, p1}, Lcom/zykj/mistake/activity/c0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    :cond_0
    return-void

    .line 44
    :pswitch_0
    iget-object p1, p0, Ll4/l;->b:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->dismiss()V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    iget-object p1, p0, Ll4/l;->b:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 51
    .line 52
    iget v0, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 53
    .line 54
    if-lez v0, :cond_1

    .line 55
    .line 56
    add-int/lit8 v0, v0, -0xa

    .line 57
    .line 58
    iput v0, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 59
    .line 60
    :cond_1
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 67
    .line 68
    iget v1, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->d:I

    .line 69
    .line 70
    iget p1, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 71
    .line 72
    add-int/2addr v1, p1

    .line 73
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_2
    iget-object p1, p0, Ll4/l;->b:Lcom/zykj/mistake/dialog/WebViewShotDialog;

    .line 78
    .line 79
    iget v0, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 80
    .line 81
    iget v1, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->e:I

    .line 82
    .line 83
    if-ge v0, v1, :cond_2

    .line 84
    .line 85
    add-int/lit8 v0, v0, 0xa

    .line 86
    .line 87
    iput v0, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 88
    .line 89
    :cond_2
    invoke-virtual {p1}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    check-cast v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 94
    .line 95
    iget-object v0, v0, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 96
    .line 97
    iget v1, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->d:I

    .line 98
    .line 99
    iget p1, p1, Lcom/zykj/mistake/dialog/WebViewShotDialog;->f:I

    .line 100
    .line 101
    add-int/2addr v1, p1

    .line 102
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
