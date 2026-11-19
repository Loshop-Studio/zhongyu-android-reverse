.class public final Lcom/friday/main/view/SearchActivity$initView$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/main/view/SearchActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/main/view/SearchActivity;


# direct methods
.method public constructor <init>(Lcom/friday/main/view/SearchActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/main/view/SearchActivity$initView$3$1;->a:Lcom/friday/main/view/SearchActivity;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/blankj/utilcode/util/StringUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget p1, Lcom/friday/main/R$string;->input_search_content_please:I

    .line 9
    .line 10
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 11
    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    if-eqz p1, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/friday/main/view/SearchActivity$initView$3$1;->a:Lcom/friday/main/view/SearchActivity;

    .line 17
    .line 18
    invoke-static {v0}, Lcom/friday/main/view/SearchActivity;->V(Lcom/friday/main/view/SearchActivity;)Lcom/friday/main/viewmodel/SearchViewModel;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0, p1}, Lcom/friday/main/viewmodel/SearchViewModel;->x(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return v1
.end method
