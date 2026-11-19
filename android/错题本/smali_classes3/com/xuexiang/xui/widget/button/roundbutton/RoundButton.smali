.class public Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;
.super Landroidx/appcompat/widget/AppCompatButton;
.source "SourceFile"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    throw v0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2, p3}, Landroidx/appcompat/widget/AppCompatButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 6
    invoke-static {p1, p2}, Lcom/xuexiang/xui/widget/button/roundbutton/RoundButton;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static a(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    sget v0, Le2/a;->a:I

    .line 2
    .line 3
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->RoundButton:[I

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    sget p1, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_backgroundColor:I

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 12
    .line 13
    .line 14
    sget p1, Lcom/xuexiang/xui/R$styleable;->RoundButton_rb_borderColor:I

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lt1/a;->a()V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method
