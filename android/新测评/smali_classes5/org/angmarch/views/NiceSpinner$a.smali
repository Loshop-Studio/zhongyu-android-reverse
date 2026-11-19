.class public Lorg/angmarch/views/NiceSpinner$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/angmarch/views/NiceSpinner;->o(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/angmarch/views/NiceSpinner;


# direct methods
.method public constructor <init>(Lorg/angmarch/views/NiceSpinner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/angmarch/views/NiceSpinner;->b(Lorg/angmarch/views/NiceSpinner;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-lt p3, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 10
    .line 11
    invoke-static {v0}, Lorg/angmarch/views/NiceSpinner;->d(Lorg/angmarch/views/NiceSpinner;)Lorg/angmarch/views/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lorg/angmarch/views/c;->getCount()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-ge p3, v0, :cond_0

    .line 20
    .line 21
    add-int/lit8 p3, p3, 0x1

    .line 22
    .line 23
    :cond_0
    move v3, p3

    .line 24
    iget-object p3, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 25
    .line 26
    invoke-static {p3, v3}, Lorg/angmarch/views/NiceSpinner;->c(Lorg/angmarch/views/NiceSpinner;I)I

    .line 27
    .line 28
    .line 29
    iget-object p3, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 30
    .line 31
    invoke-static {p3}, Lorg/angmarch/views/NiceSpinner;->e(Lorg/angmarch/views/NiceSpinner;)Ln9/b;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    if-eqz p3, :cond_1

    .line 36
    .line 37
    iget-object p3, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 38
    .line 39
    invoke-static {p3}, Lorg/angmarch/views/NiceSpinner;->e(Lorg/angmarch/views/NiceSpinner;)Ln9/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 44
    .line 45
    move-object v2, p2

    .line 46
    move-wide v4, p4

    .line 47
    invoke-interface/range {v0 .. v5}, Ln9/b;->a(Lorg/angmarch/views/NiceSpinner;Landroid/view/View;IJ)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object v2, p2

    .line 52
    move-wide v4, p4

    .line 53
    :goto_0
    iget-object p2, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 54
    .line 55
    invoke-static {p2}, Lorg/angmarch/views/NiceSpinner;->f(Lorg/angmarch/views/NiceSpinner;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    if-eqz p2, :cond_2

    .line 60
    .line 61
    iget-object p2, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 62
    .line 63
    invoke-static {p2}, Lorg/angmarch/views/NiceSpinner;->f(Lorg/angmarch/views/NiceSpinner;)Landroid/widget/AdapterView$OnItemClickListener;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    move-object v1, p1

    .line 68
    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemClickListener;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    move-object v1, p1

    .line 73
    :goto_1
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 74
    .line 75
    invoke-static {p1}, Lorg/angmarch/views/NiceSpinner;->g(Lorg/angmarch/views/NiceSpinner;)Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 82
    .line 83
    invoke-static {p1}, Lorg/angmarch/views/NiceSpinner;->g(Lorg/angmarch/views/NiceSpinner;)Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface/range {v0 .. v5}, Landroid/widget/AdapterView$OnItemSelectedListener;->onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    .line 88
    .line 89
    .line 90
    :cond_3
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 91
    .line 92
    invoke-static {p1}, Lorg/angmarch/views/NiceSpinner;->d(Lorg/angmarch/views/NiceSpinner;)Lorg/angmarch/views/c;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1, v3}, Lorg/angmarch/views/c;->b(I)V

    .line 97
    .line 98
    .line 99
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 100
    .line 101
    invoke-static {p1}, Lorg/angmarch/views/NiceSpinner;->d(Lorg/angmarch/views/NiceSpinner;)Lorg/angmarch/views/c;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p2, v3}, Lorg/angmarch/views/c;->a(I)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p2

    .line 109
    invoke-static {p1, p2}, Lorg/angmarch/views/NiceSpinner;->h(Lorg/angmarch/views/NiceSpinner;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    iget-object p1, p0, Lorg/angmarch/views/NiceSpinner$a;->a:Lorg/angmarch/views/NiceSpinner;

    .line 113
    .line 114
    invoke-virtual {p1}, Lorg/angmarch/views/NiceSpinner;->m()V

    .line 115
    .line 116
    .line 117
    return-void
.end method
