.class public Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filter$FilterListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$i;,
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$h;,
        Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;
    }
.end annotation


# instance fields
.field public c:Z

.field public d:I

.field public e:Z

.field public f:Landroid/view/View;

.field public g:Landroid/view/View;

.field public h:Landroid/widget/ListView;

.field public i:Landroid/widget/EditText;

.field public j:Landroid/widget/ImageButton;

.field public k:Landroid/widget/ImageButton;

.field public l:Landroid/widget/ImageButton;

.field public m:Landroid/widget/LinearLayout;

.field public n:Ljava/lang/CharSequence;

.field public o:Ljava/lang/CharSequence;

.field public p:Landroid/widget/ListAdapter;

.field public q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Landroid/graphics/drawable/Drawable;

.field public v:Landroid/content/Context;

.field public final w:Landroid/view/View$OnClickListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 3
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Z

    .line 4
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Z

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 6
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r(Landroid/content/Context;)V

    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 8
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 9
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 10
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Z

    .line 11
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Z

    .line 12
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;

    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 13
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r(Landroid/content/Context;)V

    .line 14
    invoke-virtual {p0, p2, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 15
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 17
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Z

    .line 18
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Z

    .line 19
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$d;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    iput-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 20
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r(Landroid/content/Context;)V

    .line 21
    invoke-virtual {p0, p2, p3}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static synthetic a(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Z

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic c(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic d(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$i;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    return-object p0
.end method

.method public static synthetic e(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->E(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->v(Ljava/lang/CharSequence;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/EditText;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic h(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/ImageButton;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic i(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic j(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic k(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/widget/ImageButton;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic l(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/view/View;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->B(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public B(Z)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 17
    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->y()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    :goto_0
    const/4 p1, 0x1

    .line 32
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 33
    .line 34
    return-void
.end method

.method public C()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public D(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->t()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->t:Z

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 21
    .line 22
    const/16 v0, 0x8

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final E(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Landroid/widget/Filterable;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/widget/Filterable;

    .line 10
    .line 11
    invoke-interface {v0}, Landroid/widget/Filterable;->getFilter()Landroid/widget/Filter;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1, p0}, Landroid/widget/Filter;->filter(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterListener;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public clearFocus()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Z

    .line 3
    .line 4
    invoke-virtual {p0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o(Landroid/view/View;)V

    .line 5
    .line 6
    .line 7
    invoke-super {p0}, Landroid/view/View;->clearFocus()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Z

    .line 17
    .line 18
    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->clearFocus()V

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 21
    .line 22
    const/16 v1, 0x8

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 25
    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    iput-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 29
    .line 30
    return-void
.end method

.method public n()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 10
    .line 11
    const/16 v1, 0x8

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public o(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "input_method"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public onFilterComplete(I)V
    .locals 0

    .line 1
    if-lez p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->C()V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 10
    .line 11
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 12
    .line 13
    iget-boolean p1, p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->d:Z

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->B(Z)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 22
    .line 23
    iget-object v0, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->c:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, v0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->x(Ljava/lang/CharSequence;Z)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/AbsSavedState;->getSuperState()Landroid/os/Parcelable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iput-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 11
    .line 12
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Ljava/lang/CharSequence;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    iput-object v0, v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->c:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->q:Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;

    .line 25
    .line 26
    iget-boolean v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 27
    .line 28
    iput-boolean v1, v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$SavedState;->d:Z

    .line 29
    .line 30
    return-object v0
.end method

.method public final p()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$a;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$a;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 12
    .line 13
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$b;

    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$b;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 22
    .line 23
    new-instance v1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$c;

    .line 24
    .line 25
    invoke-direct {v1, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$c;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final q(Landroid/util/AttributeSet;I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->v:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView:[I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-eqz p1, :cond_a

    .line 11
    .line 12
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackground:I

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackground:I

    .line 25
    .line 26
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 31
    .line 32
    .line 33
    :cond_0
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColor:I

    .line 34
    .line 35
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColor:I

    .line 42
    .line 43
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setTextColor(I)V

    .line 48
    .line 49
    .line 50
    :cond_1
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColorHint:I

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_textColorHint:I

    .line 59
    .line 60
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHintTextColor(I)V

    .line 65
    .line 66
    .line 67
    :cond_2
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_hint:I

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-eqz p2, :cond_3

    .line 74
    .line 75
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_hint:I

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setHint(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchVoiceIcon:I

    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 87
    .line 88
    .line 89
    move-result p2

    .line 90
    if-eqz p2, :cond_4

    .line 91
    .line 92
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchVoiceIcon:I

    .line 97
    .line 98
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setVoiceIcon(Landroid/graphics/drawable/Drawable;)V

    .line 103
    .line 104
    .line 105
    :cond_4
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchClearIcon:I

    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 108
    .line 109
    .line 110
    move-result p2

    .line 111
    if-eqz p2, :cond_5

    .line 112
    .line 113
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchClearIcon:I

    .line 118
    .line 119
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setCloseIcon(Landroid/graphics/drawable/Drawable;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackIcon:I

    .line 127
    .line 128
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    if-eqz p2, :cond_6

    .line 133
    .line 134
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchBackIcon:I

    .line 139
    .line 140
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 141
    .line 142
    .line 143
    move-result-object p2

    .line 144
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setBackIcon(Landroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    .line 147
    :cond_6
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionBackground:I

    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-eqz p2, :cond_7

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 156
    .line 157
    .line 158
    move-result-object p2

    .line 159
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionBackground:I

    .line 160
    .line 161
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 162
    .line 163
    .line 164
    move-result-object p2

    .line 165
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V

    .line 166
    .line 167
    .line 168
    :cond_7
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionIcon:I

    .line 169
    .line 170
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 171
    .line 172
    .line 173
    move-result p2

    .line 174
    if-eqz p2, :cond_8

    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 177
    .line 178
    .line 179
    move-result-object p2

    .line 180
    sget v0, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_msv_searchSuggestionIcon:I

    .line 181
    .line 182
    invoke-static {p2, p1, v0}, Lcom/xuexiang/xui/utils/f;->g(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;

    .line 183
    .line 184
    .line 185
    move-result-object p2

    .line 186
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V

    .line 187
    .line 188
    .line 189
    :cond_8
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_inputType:I

    .line 190
    .line 191
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    if-eqz p2, :cond_9

    .line 196
    .line 197
    sget p2, Lcom/xuexiang/xui/R$styleable;->MaterialSearchView_android_inputType:I

    .line 198
    .line 199
    invoke-virtual {p1, p2, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    .line 200
    .line 201
    .line 202
    move-result p2

    .line 203
    invoke-virtual {p0, p2}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setInputType(I)V

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 207
    .line 208
    .line 209
    :cond_a
    return-void
.end method

.method public final r(Landroid/content/Context;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->v:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_search_view:I

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, v0, p0, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    sget p1, Lcom/xuexiang/xui/R$id;->search_layout:I

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 20
    .line 21
    sget v0, Lcom/xuexiang/xui/R$id;->search_top_bar:I

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, Landroid/widget/LinearLayout;

    .line 28
    .line 29
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 32
    .line 33
    sget v0, Lcom/xuexiang/xui/R$id;->suggestion_list:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    check-cast p1, Landroid/widget/ListView;

    .line 40
    .line 41
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 42
    .line 43
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 44
    .line 45
    sget v0, Lcom/xuexiang/xui/R$id;->searchTextView:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    check-cast p1, Landroid/widget/EditText;

    .line 52
    .line 53
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 54
    .line 55
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 56
    .line 57
    sget v0, Lcom/xuexiang/xui/R$id;->action_up_btn:I

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Landroid/widget/ImageButton;

    .line 64
    .line 65
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/ImageButton;

    .line 66
    .line 67
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 68
    .line 69
    sget v0, Lcom/xuexiang/xui/R$id;->action_voice_btn:I

    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    check-cast p1, Landroid/widget/ImageButton;

    .line 76
    .line 77
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 78
    .line 79
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 80
    .line 81
    sget v0, Lcom/xuexiang/xui/R$id;->action_clear_btn:I

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    check-cast p1, Landroid/widget/ImageButton;

    .line 88
    .line 89
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 90
    .line 91
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 92
    .line 93
    sget v0, Lcom/xuexiang/xui/R$id;->transparent_view:I

    .line 94
    .line 95
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/view/View;

    .line 100
    .line 101
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 102
    .line 103
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 104
    .line 105
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 106
    .line 107
    .line 108
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/ImageButton;

    .line 109
    .line 110
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 111
    .line 112
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 113
    .line 114
    .line 115
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 116
    .line 117
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 118
    .line 119
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 123
    .line 124
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 125
    .line 126
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 127
    .line 128
    .line 129
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/view/View;

    .line 130
    .line 131
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->w:Landroid/view/View$OnClickListener;

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x0

    .line 137
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->t:Z

    .line 138
    .line 139
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->D(Z)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p()V

    .line 143
    .line 144
    .line 145
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 146
    .line 147
    const/16 v0, 0x8

    .line 148
    .line 149
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 150
    .line 151
    .line 152
    sget p1, Lcom/xuexiang/xui/widget/searchview/b;->a:I

    .line 153
    .line 154
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAnimationDuration(I)V

    .line 155
    .line 156
    .line 157
    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->e:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isFocusable()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return v1

    .line 14
    :cond_1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    return p1
.end method

.method public s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->c:Z

    .line 2
    .line 3
    return v0
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->E(Ljava/lang/CharSequence;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public setAnimationDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->d:I

    .line 2
    .line 3
    return-void
.end method

.method public setBackIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->j:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBackgroundColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Landroid/widget/LinearLayout;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCloseIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setCursorDrawable(I)V
    .locals 2

    .line 1
    :try_start_0
    const-class v0, Landroid/widget/TextView;

    .line 2
    .line 3
    const-string v1, "mCursorDrawableRes"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 14
    .line 15
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :catch_0
    move-exception p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setEllipsize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public setHint(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHintTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setInputType(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setInputType(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setMenuItem(Landroid/view/MenuItem;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$f;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOnQueryTextListener(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$h;)V
    .locals 0

    return-void
.end method

.method public setOnSearchViewListener(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$i;)V
    .locals 0

    return-void
.end method

.method public setSearchFilter(Lcom/xuexiang/xui/widget/searchview/a;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->p:Landroid/widget/ListAdapter;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    instance-of v1, v0, Lcom/xuexiang/xui/widget/searchview/d;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/xuexiang/xui/widget/searchview/d;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Lcom/xuexiang/xui/widget/searchview/d;->c(Lcom/xuexiang/xui/widget/searchview/a;)Lcom/xuexiang/xui/widget/searchview/d;

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public setSubmitOnClick(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->r:Z

    .line 2
    .line 3
    return-void
.end method

.method public setSuggestionBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->h:Landroid/widget/ListView;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setSuggestionIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->u:Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method

.method public setSuggestions([Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    array-length v0, p1

    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/view/View;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/d;

    .line 13
    .line 14
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->v:Landroid/content/Context;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->u:Landroid/graphics/drawable/Drawable;

    .line 17
    .line 18
    iget-boolean v3, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->s:Z

    .line 19
    .line 20
    invoke-direct {v0, v1, p1, v2, v3}, Lcom/xuexiang/xui/widget/searchview/d;-><init>(Landroid/content/Context;[Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 24
    .line 25
    .line 26
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;

    .line 27
    .line 28
    invoke-direct {p1, p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$e;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;Lcom/xuexiang/xui/widget/searchview/d;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->g:Landroid/view/View;

    .line 36
    .line 37
    const/16 v0, 0x8

    .line 38
    .line 39
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public setTextColor(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVoiceIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->k:Landroid/widget/ImageButton;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setVoiceSearch(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method public final t()Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Landroid/content/Intent;

    .line 18
    .line 19
    const-string v3, "android.speech.action.RECOGNIZE_SPEECH"

    .line 20
    .line 21
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    return v1

    .line 36
    :cond_1
    return v3
.end method

.method public final u()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final v(Ljava/lang/CharSequence;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Ljava/lang/CharSequence;

    .line 8
    .line 9
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->D(Z)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->l:Landroid/widget/ImageButton;

    .line 26
    .line 27
    const/16 v1, 0x8

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 30
    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    invoke-virtual {p0, v0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->D(Z)V

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->n:Ljava/lang/CharSequence;

    .line 41
    .line 42
    return-void
.end method

.method public final w()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.speech.action.RECOGNIZE_SPEECH"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "android.speech.extra.LANGUAGE_MODEL"

    .line 9
    .line 10
    const-string v2, "web_search"

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 13
    .line 14
    .line 15
    const-string v1, "android.speech.extra.MAX_RESULTS"

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->v:Landroid/content/Context;

    .line 22
    .line 23
    instance-of v2, v1, Landroid/app/Activity;

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    check-cast v1, Landroid/app/Activity;

    .line 28
    .line 29
    const/16 v2, 0x270f

    .line 30
    .line 31
    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :catch_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget v1, Lcom/xuexiang/xui/R$string;->xui_tip_no_recognize_speech:I

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public x(Ljava/lang/CharSequence;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->i:Landroid/widget/EditText;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/TextView;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->o:Ljava/lang/CharSequence;

    .line 18
    .line 19
    :cond_0
    if-eqz p2, :cond_1

    .line 20
    .line 21
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-nez p1, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->u()V

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public final y()V
    .locals 3

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView$g;-><init>(Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->f:Landroid/view/View;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lcom/xuexiang/xui/widget/searchview/MaterialSearchView;->m:Landroid/widget/LinearLayout;

    .line 13
    .line 14
    invoke-static {v1, v0}, Lcom/xuexiang/xui/widget/searchview/b;->a(Landroid/view/View;Lcom/xuexiang/xui/widget/searchview/b$b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public z(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "input_method"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-virtual {v0, p1, v1}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
