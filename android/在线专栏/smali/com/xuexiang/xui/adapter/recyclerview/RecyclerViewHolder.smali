.class public Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
.super Landroidx/recyclerview/widget/RecyclerView$b0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;,
        Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemLongClickListener;,
        Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnItemClickListener;
    }
.end annotation


# instance fields
.field private mViews:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$b0;-><init>(Landroid/view/View;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->mViews:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method public backgroundResId(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setBackgroundResource(I)V

    return-object p0
.end method

.method public checked(IZ)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/Checkable;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/Checkable;

    invoke-interface {p1, p2}, Landroid/widget/Checkable;->setChecked(Z)V

    :cond_0
    return-object p0
.end method

.method public checkedListener(ILandroid/widget/CompoundButton$OnCheckedChangeListener;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/CompoundButton;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/CompoundButton;

    invoke-virtual {p1, p2}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    :cond_0
    return-object p0
.end method

.method public clearViews()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->mViews:Landroid/util/SparseArray;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    :cond_0
    return-void
.end method

.method public click(ILandroid/view/View$OnClickListener;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public enable(IZ)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setEnabled(Z)V

    .line 3
    instance-of v0, p1, Landroid/widget/EditText;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 5
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    :cond_0
    return-object p0
.end method

.method public findView(I)Landroid/view/View;
    .locals 0

    if-nez p1, :cond_0

    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public findViewById(I)Landroid/view/View;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(I)TT;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->mViews:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->mViews:Landroid/util/SparseArray;

    invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    :cond_0
    return-object v0
.end method

.method public getButton(I)Landroid/widget/Button;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/Button;

    return-object p1
.end method

.method public final getContext()Landroid/content/Context;
    .locals 1

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$b0;->itemView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public getEditText(I)Landroid/widget/EditText;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/EditText;

    return-object p1
.end method

.method public getImageButton(I)Landroid/widget/ImageButton;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageButton;

    return-object p1
.end method

.method public getImageView(I)Landroid/widget/ImageView;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    return-object p1
.end method

.method public getTextView(I)Landroid/widget/TextView;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->getView(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    return-object p1
.end method

.method public getView(I)Landroid/view/View;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findViewById(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public image(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageResource(I)V

    :cond_0
    return-object p0
.end method

.method public image(ILandroid/graphics/drawable/Drawable;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 5
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    return-object p0
.end method

.method public image(ILjava/lang/Object;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 7
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 8
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 9
    invoke-static {}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->get()Lcom/xuexiang/xui/widget/imageview/ImageLoader;

    move-result-object v0

    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {v0, p1, p2}, Lcom/xuexiang/xui/widget/imageview/ImageLoader;->loadImage(Landroid/widget/ImageView;Ljava/lang/Object;)V

    :cond_0
    return-object p0
.end method

.method public imageLevel(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageLevel(I)V

    :cond_0
    return-object p0
.end method

.method public select(IZ)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setSelected(Z)V

    return-object p0
.end method

.method public text(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 4
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 5
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 6
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(I)V

    :cond_0
    return-object p0
.end method

.method public text(ILjava/lang/CharSequence;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_0
    return-object p0
.end method

.method public textColorId(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    move-object v0, p1

    check-cast v0, Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, p2}, Landroidx/core/content/a;->b(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_0
    return-object p0
.end method

.method public textListener(ILandroid/text/TextWatcher;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/TextView;

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-object p0
.end method

.method public tint(ILandroid/content/res/ColorStateList;)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    instance-of v0, p1, Landroid/widget/ImageView;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Landroid/widget/ImageView;

    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    :cond_0
    return-object p0
.end method

.method public viewClick(ILcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;Ljava/lang/Object;I)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I",
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener<",
            "TT;>;TT;I)",
            "Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    if-eqz p2, :cond_0

    .line 2
    new-instance v0, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;

    invoke-direct {v0, p0, p2, p3, p4}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$1;-><init>(Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder$OnViewItemClickListener;Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    return-object p0
.end method

.method public visible(II)Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/adapter/recyclerview/RecyclerViewHolder;->findView(I)Landroid/view/View;

    move-result-object p1

    .line 2
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    return-object p0
.end method
