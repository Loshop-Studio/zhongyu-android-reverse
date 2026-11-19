.class public final Lm1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lm1/c;->a:I

    iput-object p1, p0, Lm1/c;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget p1, p0, Lm1/c;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm1/c;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a()V

    .line 11
    .line 12
    .line 13
    :goto_0
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :pswitch_0
    iget-object p1, p0, Lm1/c;->b:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p1, Lm1/d;

    .line 18
    .line 19
    iget-object p1, p1, Lm1/d;->b:Lcom/jaredrummler/android/colorpicker/ColorPanelView;

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/jaredrummler/android/colorpicker/ColorPanelView;->a()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
