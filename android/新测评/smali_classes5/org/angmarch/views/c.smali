.class public abstract Lorg/angmarch/views/c;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/angmarch/views/c$b;
    }
.end annotation


# instance fields
.field public final a:Lorg/angmarch/views/PopUpTextAlignment;

.field public final b:Ln9/d;

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>(Landroid/content/Context;IILn9/d;Lorg/angmarch/views/PopUpTextAlignment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p4, p0, Lorg/angmarch/views/c;->b:Ln9/d;

    .line 5
    .line 6
    iput p3, p0, Lorg/angmarch/views/c;->d:I

    .line 7
    .line 8
    iput p2, p0, Lorg/angmarch/views/c;->c:I

    .line 9
    .line 10
    iput-object p5, p0, Lorg/angmarch/views/c;->a:Lorg/angmarch/views/PopUpTextAlignment;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(I)Ljava/lang/Object;
.end method

.method public b(I)V
    .locals 0

    .line 1
    iput p1, p0, Lorg/angmarch/views/c;->e:I

    .line 2
    .line 3
    return-void
.end method

.method public final c(Landroid/widget/TextView;)V
    .locals 3

    .line 1
    sget-object v0, Lorg/angmarch/views/c$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lorg/angmarch/views/c;->a:Lorg/angmarch/views/PopUpTextAlignment;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_1

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v0, v2, :cond_0

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setGravity(I)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    const v0, 0x800005

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_2
    const v0, 0x800003

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public abstract getCount()I
.end method

.method public abstract getItem(I)Ljava/lang/Object;
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p3}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    sget p2, Lorg/angmarch/views/R$layout;->spinner_list_item:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-static {p3, p2, v0}, Landroid/view/View;->inflate(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    sget v0, Lorg/angmarch/views/R$id;->text_view_spinner:I

    .line 15
    .line 16
    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/TextView;

    .line 21
    .line 22
    iget v1, p0, Lorg/angmarch/views/c;->d:I

    .line 23
    .line 24
    invoke-static {p3, v1}, Landroidx/core/content/ContextCompat;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 25
    .line 26
    .line 27
    move-result-object p3

    .line 28
    invoke-virtual {v0, p3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 29
    .line 30
    .line 31
    new-instance p3, Lorg/angmarch/views/c$b;

    .line 32
    .line 33
    invoke-direct {p3, v0}, Lorg/angmarch/views/c$b;-><init>(Landroid/widget/TextView;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    check-cast p3, Lorg/angmarch/views/c$b;

    .line 45
    .line 46
    iget-object v0, p3, Lorg/angmarch/views/c$b;->a:Landroid/widget/TextView;

    .line 47
    .line 48
    :goto_0
    iget-object p3, p0, Lorg/angmarch/views/c;->b:Ln9/d;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lorg/angmarch/views/c;->getItem(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p3, p1}, Ln9/d;->a(Ljava/lang/Object;)Landroid/text/Spannable;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    iget p1, p0, Lorg/angmarch/views/c;->c:I

    .line 62
    .line 63
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v0}, Lorg/angmarch/views/c;->c(Landroid/widget/TextView;)V

    .line 67
    .line 68
    .line 69
    return-object p2
.end method
