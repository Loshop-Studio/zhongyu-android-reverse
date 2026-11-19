.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/mistake/feature/notebook/detail/d;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/mistake/feature/notebook/detail/d;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/feature/notebook/detail/b;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/b;->b:Lcom/zykj/mistake/feature/notebook/detail/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b;->b:Lcom/zykj/mistake/feature/notebook/detail/d;

    .line 7
    .line 8
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/d;->c:Landroid/widget/LinearLayout;

    .line 9
    .line 10
    const/16 v1, 0x8

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 13
    .line 14
    .line 15
    :goto_0
    sget-object v0, Ld6/s;->a:Ld6/s;

    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_0
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/b;->b:Lcom/zykj/mistake/feature/notebook/detail/d;

    .line 19
    .line 20
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/d;->a:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 21
    .line 22
    const/16 v2, 0x8

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    iget-object v1, v0, Lcom/zykj/mistake/feature/notebook/detail/d;->b:Lcom/zykj/mistake/widget/ResizableImageView;

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    iget-object v0, v0, Lcom/zykj/mistake/feature/notebook/detail/d;->c:Landroid/widget/LinearLayout;

    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
