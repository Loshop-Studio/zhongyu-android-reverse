.class public final Lv1/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;


# direct methods
.method public synthetic constructor <init>(Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;I)V
    .locals 0

    .line 1
    iput p2, p0, Lv1/a;->a:I

    iput-object p1, p0, Lv1/a;->b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget v0, p0, Lv1/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lv1/a;->b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v0, p0, Lv1/a;->b:Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    iget v2, v0, Lcom/xuexiang/xui/widget/XUIKeyboardScrollView;->b:I

    .line 20
    .line 21
    add-int/2addr v1, v2

    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-virtual {v0, v2, v1}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
