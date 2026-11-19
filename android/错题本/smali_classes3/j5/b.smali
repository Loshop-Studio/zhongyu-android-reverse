.class public final synthetic Lj5/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/zykj/view/widget/radio/CustomColorRadioButton;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/widget/radio/CustomColorRadioButton;I)V
    .locals 0

    .line 1
    iput p2, p0, Lj5/b;->a:I

    iput-object p1, p0, Lj5/b;->b:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lj5/b;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lj5/b;->b:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    invoke-static {v0}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->b(Lcom/zykj/view/widget/radio/CustomColorRadioButton;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lj5/b;->b:Lcom/zykj/view/widget/radio/CustomColorRadioButton;

    invoke-static {v0}, Lcom/zykj/view/widget/radio/CustomColorRadioButton;->c(Lcom/zykj/view/widget/radio/CustomColorRadioButton;)Landroid/graphics/Rect;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
