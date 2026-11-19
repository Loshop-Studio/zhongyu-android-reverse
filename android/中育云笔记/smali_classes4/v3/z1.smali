.class public final synthetic Lv3/z1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/SearchActivity;

.field public final synthetic d:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/z1;->c:Lcom/friday/main/view/SearchActivity;

    iput-object p2, p0, Lv3/z1;->d:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/z1;->c:Lcom/friday/main/view/SearchActivity;

    iget-object v1, p0, Lv3/z1;->d:Landroidx/recyclerview/widget/RecyclerView;

    check-cast p1, Landroidx/paging/CombinedLoadStates;

    invoke-static {v0, v1, p1}, Lcom/friday/main/view/SearchActivity;->Q(Lcom/friday/main/view/SearchActivity;Landroidx/recyclerview/widget/RecyclerView;Landroidx/paging/CombinedLoadStates;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
