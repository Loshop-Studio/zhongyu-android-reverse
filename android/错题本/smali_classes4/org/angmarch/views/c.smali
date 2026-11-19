.class public abstract Lorg/angmarch/views/c;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"


# instance fields
.field public final a:Lorg/angmarch/views/PopUpTextAlignment;

.field public final b:La8/f;

.field public final c:I

.field public final d:I

.field public e:I


# direct methods
.method public constructor <init>(IILa8/f;Lorg/angmarch/views/PopUpTextAlignment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/angmarch/views/c;->b:La8/f;

    .line 5
    .line 6
    iput p2, p0, Lorg/angmarch/views/c;->d:I

    .line 7
    .line 8
    iput p1, p0, Lorg/angmarch/views/c;->c:I

    .line 9
    .line 10
    iput-object p4, p0, Lorg/angmarch/views/c;->a:Lorg/angmarch/views/PopUpTextAlignment;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public abstract a(I)Ljava/lang/Object;
.end method

.method public final getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
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
    new-instance p3, La8/d;

    .line 32
    .line 33
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p3, La8/d;->a:Landroid/widget/TextView;

    .line 37
    .line 38
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    check-cast p3, La8/d;

    .line 47
    .line 48
    iget-object v0, p3, La8/d;->a:Landroid/widget/TextView;

    .line 49
    .line 50
    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/BaseAdapter;->getItem(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p3, p0, Lorg/angmarch/views/c;->b:La8/f;

    .line 55
    .line 56
    check-cast p3, Lio/reactivex/internal/operators/observable/c;

    .line 57
    .line 58
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance p3, Landroid/text/SpannableString;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-direct {p3, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    iget p1, p0, Lorg/angmarch/views/c;->c:I

    .line 74
    .line 75
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 76
    .line 77
    .line 78
    sget-object p1, Lorg/angmarch/views/b;->a:[I

    .line 79
    .line 80
    iget-object p3, p0, Lorg/angmarch/views/c;->a:Lorg/angmarch/views/PopUpTextAlignment;

    .line 81
    .line 82
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 83
    .line 84
    .line 85
    move-result p3

    .line 86
    aget p1, p1, p3

    .line 87
    .line 88
    const/4 p3, 0x1

    .line 89
    if-eq p1, p3, :cond_3

    .line 90
    .line 91
    const/4 v1, 0x2

    .line 92
    if-eq p1, v1, :cond_2

    .line 93
    .line 94
    const/4 v1, 0x3

    .line 95
    if-eq p1, v1, :cond_1

    .line 96
    .line 97
    return-object p2

    .line 98
    :cond_1
    invoke-virtual {v0, p3}, Landroid/widget/TextView;->setGravity(I)V

    .line 99
    .line 100
    .line 101
    return-object p2

    .line 102
    :cond_2
    const p1, 0x800005

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 106
    .line 107
    .line 108
    return-object p2

    .line 109
    :cond_3
    const p1, 0x800003

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 113
    .line 114
    .line 115
    return-object p2
.end method
