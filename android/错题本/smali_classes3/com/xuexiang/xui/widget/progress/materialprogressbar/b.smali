.class public final Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;
.super Landroid/graphics/drawable/Drawable$ConstantState;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->a:I

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    return-void
.end method

.method public constructor <init>(Lm0/e;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->a:I

    .line 2
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable$ConstantState;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final getChangingConfigurations()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    const/4 v0, 0x0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final newDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->a:I

    packed-switch v0, :pswitch_data_0

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-direct {v0, p0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;)V

    return-object v0

    .line 2
    :pswitch_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->b:Ljava/lang/Object;

    check-cast v0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/d;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    .locals 1

    iget v0, p0, Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    .line 3
    :pswitch_0
    new-instance p1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    invoke-direct {p1, p0}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;-><init>(Lcom/xuexiang/xui/widget/progress/materialprogressbar/b;)V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
