.class public final Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/appcompat/widget/SearchView$OnQueryTextListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/friday/document/view/share/ShareSearchActivity;->initView()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/friday/document/view/share/ShareSearchActivity;


# direct methods
.method public constructor <init>(Lcom/friday/document/view/share/ShareSearchActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;->a:Lcom/friday/document/view/share/ShareSearchActivity;

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
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;->a:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 12
    .line 13
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    new-instance v5, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1$onQueryTextSubmit$1;

    .line 18
    .line 19
    iget-object v1, p0, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1;->a:Lcom/friday/document/view/share/ShareSearchActivity;

    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    invoke-direct {v5, v1, p1, v3}, Lcom/friday/document/view/share/ShareSearchActivity$initView$3$1$onQueryTextSubmit$1;-><init>(Lcom/friday/document/view/share/ShareSearchActivity;Ljava/lang/String;Lvc/c;)V

    .line 23
    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    const/4 v7, 0x0

    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-static/range {v2 .. v7}, Lsd/f;->d(Lsd/i0;Lkotlin/coroutines/d;Lkotlinx/coroutines/CoroutineStart;Lhd/p;ILjava/lang/Object;)Lkotlinx/coroutines/g;

    .line 29
    .line 30
    .line 31
    return v0

    .line 32
    :cond_1
    :goto_0
    sget p1, Lcom/friday/document/R$string;->input_search_content_please:I

    .line 33
    .line 34
    invoke-static {p1}, Lz1/b;->h(I)V

    .line 35
    .line 36
    .line 37
    return v0
.end method
