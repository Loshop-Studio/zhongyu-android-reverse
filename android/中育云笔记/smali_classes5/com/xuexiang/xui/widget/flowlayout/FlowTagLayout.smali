.class public Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;
    }
.end annotation


# instance fields
.field public c:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;

.field public d:Ll8/a;

.field public e:I

.field public f:Z

.field public g:Landroid/util/SparseBooleanArray;

.field public h:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 3
    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 4
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 6
    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 8
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p3, 0x0

    .line 9
    iput p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 10
    new-instance p3, Landroid/util/SparseBooleanArray;

    invoke-direct {p3}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 11
    invoke-virtual {p0, p1, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->f(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Landroid/util/SparseBooleanArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->f:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->m(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->h()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final f(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout:[I

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_check_mode:I

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    iput p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 15
    .line 16
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_single_cancelable:I

    .line 17
    .line 18
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iput-boolean p2, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->f:Z

    .line 23
    .line 24
    sget p2, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_entries:I

    .line 25
    .line 26
    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-static {p2}, Lcom/xuexiang/xui/utils/f;->k(I)[Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->l([Ljava/lang/Object;)Ll8/a;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    sget v1, Lcom/xuexiang/xui/R$styleable;->FlowTagLayout_ftl_selecteds:I

    .line 41
    .line 42
    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_0

    .line 47
    .line 48
    invoke-static {v0}, Lcom/xuexiang/xui/utils/f;->h(I)[I

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p2, v0}, Ll8/a;->q([I)Ll8/a;

    .line 53
    .line 54
    .line 55
    :cond_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public final g()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public getAdapter()Ll8/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSelectedIndex()I
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/a;->l()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, -0x1

    .line 11
    return v0
.end method

.method public getSelectedIndexs()Ljava/util/List;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/a;->m()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()TT;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ll8/a;->n()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public getTagCheckMode()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 2
    .line 3
    return v0
.end method

.method public final h()V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 5
    .line 6
    const/4 v1, -0x2

    .line 7
    invoke-direct {v0, v1, v1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 8
    .line 9
    .line 10
    iget v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->h:I

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iput v1, v0, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 15
    .line 16
    :cond_0
    const/4 v1, 0x0

    .line 17
    move v2, v1

    .line 18
    move v3, v2

    .line 19
    :goto_0
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 20
    .line 21
    invoke-virtual {v4}, Lz7/b;->getCount()I

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-ge v2, v4, :cond_4

    .line 26
    .line 27
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 28
    .line 29
    invoke-virtual {v4, v2, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    invoke-virtual {v4, v2, v5, p0}, Lz7/a;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {p0, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 43
    .line 44
    if-eqz v6, :cond_3

    .line 45
    .line 46
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 47
    .line 48
    invoke-virtual {v6, v2}, Ll8/a;->o(I)Z

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    iget v7, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->e:I

    .line 53
    .line 54
    const/4 v8, 0x1

    .line 55
    if-ne v7, v8, :cond_1

    .line 56
    .line 57
    if-eqz v6, :cond_3

    .line 58
    .line 59
    if-nez v3, :cond_3

    .line 60
    .line 61
    iget-object v3, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 62
    .line 63
    invoke-virtual {v3, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    .line 67
    .line 68
    .line 69
    move v3, v8

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 v9, 0x2

    .line 72
    if-ne v7, v9, :cond_2

    .line 73
    .line 74
    if-eqz v6, :cond_3

    .line 75
    .line 76
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 77
    .line 78
    invoke-virtual {v6, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    const/4 v6, 0x3

    .line 86
    if-ne v7, v6, :cond_3

    .line 87
    .line 88
    iget-object v6, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g:Landroid/util/SparseBooleanArray;

    .line 89
    .line 90
    invoke-virtual {v6, v2, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v4, v8}, Landroid/view/View;->setSelected(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 97
    .line 98
    .line 99
    :cond_3
    :goto_1
    invoke-virtual {p0, v5}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->m(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v2, v4}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->j(ILandroid/view/View;)V

    .line 103
    .line 104
    .line 105
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    return-void
.end method

.method public i(Ll8/a;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->c:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/widget/BaseAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    new-instance p1, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;-><init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;)V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->c:Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$b;

    .line 25
    .line 26
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/widget/BaseAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method

.method public final j(ILandroid/view/View;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout$a;-><init>(Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;Landroid/view/View;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public k(Ljava/util/List;)Ll8/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ll8/a;->j(Ljava/util/List;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    new-instance v0, Ll8/b;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Ll8/b;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->i(Ll8/a;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ll8/a;->i(Ljava/util/List;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 25
    .line 26
    return-object p1
.end method

.method public final varargs l([Ljava/lang/Object;)Ll8/a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->k(Ljava/util/List;)Ll8/a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final m(Ljava/util/List;)Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->d:Ll8/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ll8/a;->p(Ljava/util/List;)Ll8/a;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-object p0
.end method

.method public onLayout(ZIIII)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result p4

    .line 17
    const/4 p5, 0x0

    .line 18
    :goto_0
    if-ge p5, p4, :cond_3

    .line 19
    .line 20
    invoke-virtual {p0, p5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/16 v2, 0x8

    .line 29
    .line 30
    if-ne v1, v2, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 46
    .line 47
    iget v4, v3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 48
    .line 49
    add-int/2addr v4, v1

    .line 50
    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 51
    .line 52
    add-int/2addr v4, v5

    .line 53
    iget v5, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 54
    .line 55
    add-int/2addr v5, v2

    .line 56
    iget v6, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 57
    .line 58
    add-int/2addr v5, v6

    .line 59
    add-int v6, p2, v4

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    sub-int v7, p1, v7

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    sub-int/2addr v7, v8

    .line 72
    if-le v6, v7, :cond_1

    .line 73
    .line 74
    add-int/2addr p3, v5

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    :cond_1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/flowlayout/FlowTagLayout;->g()Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-virtual {v3}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    add-int/2addr v5, p2

    .line 90
    sub-int v5, p1, v5

    .line 91
    .line 92
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 93
    .line 94
    add-int/2addr v3, p3

    .line 95
    sub-int v1, v5, v1

    .line 96
    .line 97
    add-int/2addr v2, v3

    .line 98
    invoke-virtual {v0, v1, v3, v5, v2}, Landroid/view/View;->layout(IIII)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    invoke-virtual {v3}, Landroid/view/ViewGroup$MarginLayoutParams;->getMarginStart()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    add-int/2addr v5, p2

    .line 107
    iget v3, v3, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 108
    .line 109
    add-int/2addr v3, p3

    .line 110
    add-int/2addr v1, v5

    .line 111
    add-int/2addr v2, v3

    .line 112
    invoke-virtual {v0, v5, v3, v1, v2}, Landroid/view/View;->layout(IIII)V

    .line 113
    .line 114
    .line 115
    :goto_1
    add-int/2addr p2, v4

    .line 116
    :goto_2
    add-int/lit8 p5, p5, 0x1

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_3
    return-void
.end method

.method public onMeasure(II)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-super/range {p0 .. p2}, Landroid/view/View;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x0

    .line 27
    move v7, v6

    .line 28
    move v8, v7

    .line 29
    move v9, v8

    .line 30
    move v10, v9

    .line 31
    :goto_0
    if-ge v6, v5, :cond_4

    .line 32
    .line 33
    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    move/from16 v12, p1

    .line 38
    .line 39
    move/from16 v13, p2

    .line 40
    .line 41
    invoke-virtual {v0, v11, v12, v13}, Landroid/view/ViewGroup;->measureChild(Landroid/view/View;II)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredWidth()I

    .line 45
    .line 46
    .line 47
    move-result v14

    .line 48
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    .line 49
    .line 50
    .line 51
    move-result v15

    .line 52
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    check-cast v11, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 57
    .line 58
    move/from16 v16, v1

    .line 59
    .line 60
    iget v1, v11, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 61
    .line 62
    add-int/2addr v14, v1

    .line 63
    iget v1, v11, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 64
    .line 65
    add-int/2addr v14, v1

    .line 66
    iget v1, v11, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 67
    .line 68
    add-int/2addr v15, v1

    .line 69
    iget v1, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 70
    .line 71
    add-int/2addr v15, v1

    .line 72
    add-int v1, v7, v14

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 75
    .line 76
    .line 77
    move-result v11

    .line 78
    sub-int v11, v16, v11

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 81
    .line 82
    .line 83
    move-result v17

    .line 84
    sub-int v11, v11, v17

    .line 85
    .line 86
    if-le v1, v11, :cond_0

    .line 87
    .line 88
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v10

    .line 92
    add-int/2addr v9, v15

    .line 93
    move v7, v14

    .line 94
    move v8, v15

    .line 95
    goto :goto_1

    .line 96
    :cond_0
    invoke-static {v8, v15}, Ljava/lang/Math;->max(II)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    move v8, v7

    .line 101
    move v7, v1

    .line 102
    :goto_1
    add-int/lit8 v1, v5, -0x1

    .line 103
    .line 104
    if-ne v6, v1, :cond_1

    .line 105
    .line 106
    invoke-static {v7, v10}, Ljava/lang/Math;->max(II)I

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    add-int/2addr v9, v8

    .line 111
    move v10, v1

    .line 112
    :cond_1
    const/high16 v1, 0x40000000    # 2.0f

    .line 113
    .line 114
    if-ne v3, v1, :cond_2

    .line 115
    .line 116
    move/from16 v11, v16

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_2
    move v11, v10

    .line 120
    :goto_2
    if-ne v4, v1, :cond_3

    .line 121
    .line 122
    move v1, v2

    .line 123
    goto :goto_3

    .line 124
    :cond_3
    move v1, v9

    .line 125
    :goto_3
    invoke-virtual {v0, v11, v1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v6, v6, 0x1

    .line 129
    .line 130
    move/from16 v1, v16

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_4
    return-void
.end method
