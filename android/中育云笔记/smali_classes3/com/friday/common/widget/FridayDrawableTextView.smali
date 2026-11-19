.class public final Lcom/friday/common/widget/FridayDrawableTextView;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "Recycle"
    }
.end annotation

.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation


# instance fields
.field public d:Landroid/graphics/drawable/Drawable;

.field public e:Landroid/graphics/drawable/Drawable;

.field public f:Landroid/graphics/drawable/Drawable;

.field public g:Landroid/graphics/drawable/Drawable;

.field public h:I

.field public i:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/friday/common/widget/FridayDrawableTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/friday/common/widget/FridayDrawableTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    sget-object p3, Lcom/friday/common/R$styleable;->FridayDrawableTextView:[I

    invoke-virtual {p1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    const/4 p3, 0x0

    move v0, p3

    :goto_0
    if-ge v0, p2, :cond_6

    .line 7
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v1

    .line 8
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableTop:I

    if-ne v1, v2, :cond_0

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->d:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    .line 9
    :cond_0
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableLeft:I

    if-ne v1, v2, :cond_1

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->e:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    .line 10
    :cond_1
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableBottom:I

    if-ne v1, v2, :cond_2

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->f:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    .line 11
    :cond_2
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableRight:I

    if-ne v1, v2, :cond_3

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->g:Landroid/graphics/drawable/Drawable;

    goto :goto_1

    .line 12
    :cond_3
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableWidth:I

    if-ne v1, v2, :cond_4

    invoke-virtual {p1, v1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->h:I

    goto :goto_1

    .line 13
    :cond_4
    sget v2, Lcom/friday/common/R$styleable;->FridayDrawableTextView_drawableHeight:I

    if-ne v1, v2, :cond_5

    invoke-virtual {p1, v1, p3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->i:I

    :cond_5
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 14
    :cond_6
    iget-object p1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->d:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_7

    iget p2, p0, Lcom/friday/common/widget/FridayDrawableTextView;->h:I

    iget v0, p0, Lcom/friday/common/widget/FridayDrawableTextView;->i:I

    invoke-virtual {p1, p3, p3, p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 15
    :cond_7
    iget-object p1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->e:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_8

    iget p2, p0, Lcom/friday/common/widget/FridayDrawableTextView;->h:I

    iget v0, p0, Lcom/friday/common/widget/FridayDrawableTextView;->i:I

    invoke-virtual {p1, p3, p3, p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 16
    :cond_8
    iget-object p1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->f:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_9

    iget p2, p0, Lcom/friday/common/widget/FridayDrawableTextView;->h:I

    iget v0, p0, Lcom/friday/common/widget/FridayDrawableTextView;->i:I

    invoke-virtual {p1, p3, p3, p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 17
    :cond_9
    iget-object p1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->g:Landroid/graphics/drawable/Drawable;

    if-eqz p1, :cond_a

    iget p2, p0, Lcom/friday/common/widget/FridayDrawableTextView;->h:I

    iget v0, p0, Lcom/friday/common/widget/FridayDrawableTextView;->i:I

    invoke-virtual {p1, p3, p3, p2, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 18
    :cond_a
    iget-object p1, p0, Lcom/friday/common/widget/FridayDrawableTextView;->e:Landroid/graphics/drawable/Drawable;

    iget-object p2, p0, Lcom/friday/common/widget/FridayDrawableTextView;->d:Landroid/graphics/drawable/Drawable;

    iget-object p3, p0, Lcom/friday/common/widget/FridayDrawableTextView;->g:Landroid/graphics/drawable/Drawable;

    iget-object v0, p0, Lcom/friday/common/widget/FridayDrawableTextView;->f:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setCompoundDrawables(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    const/16 p1, 0x11

    .line 19
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/friday/common/widget/FridayDrawableTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method
