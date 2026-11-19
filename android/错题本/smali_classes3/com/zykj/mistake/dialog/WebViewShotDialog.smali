# RE note 本类字节码直接引用的读写或显示接口包括WebView。
.class public final Lcom/zykj/mistake/dialog/WebViewShotDialog;
.super Lcom/zykj/mistake/dialog/BaseDialogFragment;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/zykj/mistake/dialog/BaseDialogFragment<",
        "Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "Lcom/zykj/mistake/dialog/WebViewShotDialog;",
        "Lcom/zykj/mistake/dialog/BaseDialogFragment;",
        "Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;",
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
.field public final c:Ljava/lang/String;

.field public final d:I

.field public final e:I

.field public f:I

.field public g:Lcom/zykj/mistake/activity/c0;

.field public h:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->c:Ljava/lang/String;

    .line 10
    .line 11
    const/16 p1, 0x96

    .line 12
    .line 13
    iput p1, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->d:I

    .line 14
    .line 15
    const/16 p1, 0x32

    .line 16
    .line 17
    iput p1, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->e:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final e()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$color;->white:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    return v0
.end method

.method public final g()I
    .locals 1

    .line 1
    sget v0, Lcom/zykj/mistake/R$layout;->dialog_webview_shot:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()I
    .locals 1

    .line 1
    const/4 v0, -0x1

    return v0
.end method

.method public final j(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/webkit/WebView;->enableSlowWholeDocumentDraw()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 9
    .line 10
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 11
    .line 12
    iget v0, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->d:I

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 22
    .line 23
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v0}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 34
    .line 35
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 45
    .line 46
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/4 v1, 0x1

    .line 53
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 61
    .line 62
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 63
    .line 64
    const-string v1, "webView"

    .line 65
    .line 66
    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/16 v1, 0x64

    .line 74
    .line 75
    invoke-virtual {p1, v1}, Landroid/webkit/WebSettings;->setTextZoom(I)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 83
    .line 84
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 85
    .line 86
    new-instance v1, Ll4/m;

    .line 87
    .line 88
    invoke-direct {v1, p0}, Ll4/m;-><init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V

    .line 92
    .line 93
    .line 94
    iput-boolean v0, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->h:Z

    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 101
    .line 102
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->e:Landroid/widget/TextView;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 112
    .line 113
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->e:Landroid/widget/TextView;

    .line 114
    .line 115
    const-string v0, "\u6b63\u5728\u52a0\u8f7d\u3002\u3002\u3002"

    .line 116
    .line 117
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 125
    .line 126
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->f:Landroid/webkit/WebView;

    .line 127
    .line 128
    iget-object v0, p0, Lcom/zykj/mistake/dialog/WebViewShotDialog;->c:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p1, v0}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 138
    .line 139
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->d:Landroid/widget/ImageView;

    .line 140
    .line 141
    new-instance v0, Ll4/l;

    .line 142
    .line 143
    const/4 v1, 0x0

    .line 144
    invoke-direct {v0, p0, v1}, Ll4/l;-><init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;I)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 155
    .line 156
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->b:Landroid/widget/ImageView;

    .line 157
    .line 158
    new-instance v0, Ll4/l;

    .line 159
    .line 160
    const/4 v1, 0x1

    .line 161
    invoke-direct {v0, p0, v1}, Ll4/l;-><init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;I)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 172
    .line 173
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->a:Landroid/widget/ImageView;

    .line 174
    .line 175
    new-instance v0, Ll4/l;

    .line 176
    .line 177
    const/4 v1, 0x2

    .line 178
    invoke-direct {v0, p0, v1}, Ll4/l;-><init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;I)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lcom/zykj/mistake/dialog/BaseDialogFragment;->i()Landroidx/databinding/ViewDataBinding;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;

    .line 189
    .line 190
    iget-object p1, p1, Lcom/zykj/mistake/databinding/DialogWebviewShotBinding;->c:Landroid/widget/ImageView;

    .line 191
    .line 192
    new-instance v0, Ll4/l;

    .line 193
    .line 194
    const/4 v1, 0x3

    .line 195
    invoke-direct {v0, p0, v1}, Ll4/l;-><init>(Lcom/zykj/mistake/dialog/WebViewShotDialog;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 199
    .line 200
    .line 201
    return-void
.end method
