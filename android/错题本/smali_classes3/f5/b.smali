.class public final synthetic Lf5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/widget/StemWebView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/widget/StemWebView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lf5/b;->a:I

    iput-object p1, p0, Lf5/b;->b:Lcom/zykj/mistake/widget/StemWebView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lf5/b;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lf5/b;->b:Lcom/zykj/mistake/widget/StemWebView;

    .line 7
    .line 8
    iget v0, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    .line 12
    add-int/lit8 v0, v0, -0xa

    .line 13
    .line 14
    iput v0, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 15
    .line 16
    :cond_0
    iget-object v0, p1, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 17
    .line 18
    iget v1, p1, Lcom/zykj/mistake/widget/StemWebView;->d:I

    .line 19
    .line 20
    iget p1, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 21
    .line 22
    add-int/2addr v1, p1

    .line 23
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_0
    iget-object p1, p0, Lf5/b;->b:Lcom/zykj/mistake/widget/StemWebView;

    .line 28
    .line 29
    iget v0, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 30
    .line 31
    iget v1, p1, Lcom/zykj/mistake/widget/StemWebView;->e:I

    .line 32
    .line 33
    if-ge v0, v1, :cond_1

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0xa

    .line 36
    .line 37
    iput v0, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 38
    .line 39
    :cond_1
    iget-object v0, p1, Lcom/zykj/mistake/widget/StemWebView;->a:Landroid/webkit/WebView;

    .line 40
    .line 41
    iget v1, p1, Lcom/zykj/mistake/widget/StemWebView;->d:I

    .line 42
    .line 43
    iget p1, p1, Lcom/zykj/mistake/widget/StemWebView;->f:I

    .line 44
    .line 45
    add-int/2addr v1, p1

    .line 46
    invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setInitialScale(I)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
