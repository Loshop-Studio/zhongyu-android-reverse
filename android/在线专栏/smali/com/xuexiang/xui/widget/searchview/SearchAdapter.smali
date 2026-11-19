.class public Lcom/xuexiang/xui/widget/searchview/SearchAdapter;
.super Landroid/widget/BaseAdapter;
.source "SourceFile"

# interfaces
.implements Landroid/widget/Filterable;
.implements Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter$OnFilterResultListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;
    }
.end annotation


# instance fields
.field private mData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private mEllipsize:Z

.field private mInflater:Landroid/view/LayoutInflater;

.field private mSearchFilter:Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

.field private mSuggestionIcon:Landroid/graphics/drawable/Drawable;

.field private mSuggestions:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 2
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mData:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSuggestions:[Ljava/lang/String;

    .line 5
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/DefaultSearchFilter;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/searchview/DefaultSearchFilter;-><init>()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->setSearchFilter(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;)Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;[Ljava/lang/String;Landroid/graphics/drawable/Drawable;Z)V
    .locals 0

    .line 6
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 7
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mInflater:Landroid/view/LayoutInflater;

    .line 8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mData:Ljava/util/List;

    .line 9
    iput-object p2, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSuggestions:[Ljava/lang/String;

    .line 10
    iput-object p3, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSuggestionIcon:Landroid/graphics/drawable/Drawable;

    .line 11
    iput-boolean p4, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mEllipsize:Z

    .line 12
    new-instance p1, Lcom/xuexiang/xui/widget/searchview/DefaultSearchFilter;

    invoke-direct {p1}, Lcom/xuexiang/xui/widget/searchview/DefaultSearchFilter;-><init>()V

    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->setSearchFilter(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;)Lcom/xuexiang/xui/widget/searchview/SearchAdapter;

    return-void
.end method

.method static synthetic access$000(Lcom/xuexiang/xui/widget/searchview/SearchAdapter;)Landroid/graphics/drawable/Drawable;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSuggestionIcon:Landroid/graphics/drawable/Drawable;

    return-object p0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mData:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getFilter()Landroid/widget/Filter;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSearchFilter:Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

    return-object v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mData:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2

    if-nez p2, :cond_0

    .line 1
    iget-object p2, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mInflater:Landroid/view/LayoutInflater;

    sget v0, Lcom/xuexiang/xui/R$layout;->xui_layout_search_view_suggest_item:I

    const/4 v1, 0x0

    invoke-virtual {p2, v0, p3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 2
    new-instance p3, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;

    invoke-direct {p3, p0, p2}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;-><init>(Lcom/xuexiang/xui/widget/searchview/SearchAdapter;Landroid/view/View;)V

    .line 3
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    goto :goto_0

    .line 4
    :cond_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;

    .line 5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    .line 6
    iget-object v0, p3, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    iget-boolean p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mEllipsize:Z

    if-eqz p1, :cond_1

    .line 8
    iget-object p1, p3, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;->textView:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->setSingleLine()V

    .line 9
    iget-object p1, p3, Lcom/xuexiang/xui/widget/searchview/SearchAdapter$SuggestionsViewHolder;->textView:Landroid/widget/TextView;

    sget-object p3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    :cond_1
    return-object p2
.end method

.method public publishResults(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mData:Ljava/util/List;

    .line 2
    invoke-virtual {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    return-void
.end method

.method public setSearchFilter(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;)Lcom/xuexiang/xui/widget/searchview/SearchAdapter;
    .locals 1

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSearchFilter:Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSuggestions:[Ljava/lang/String;

    invoke-virtual {p1, v0}, Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;->setSuggestions([Ljava/lang/String;)Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/searchview/SearchAdapter;->mSearchFilter:Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

    invoke-virtual {p1, p0}, Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;->setOnFilterResultListener(Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter$OnFilterResultListener;)Lcom/xuexiang/xui/widget/searchview/AbstractSearchFilter;

    return-object p0
.end method
