.class public final Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/friday/document/adapter/RecycleBinAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RecycleBinHolder"
.end annotation


# instance fields
.field public final c:Lcom/friday/document/databinding/ItemRecycleBinBinding;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lcom/friday/document/databinding/ItemRecycleBinBinding;)V
    .locals 1

    .line 1
    const-string v0, "binding"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/u;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/databinding/ViewDataBinding;->getRoot()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->c:Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a()Lcom/friday/document/databinding/ItemRecycleBinBinding;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/RecycleBinAdapter$RecycleBinHolder;->c:Lcom/friday/document/databinding/ItemRecycleBinBinding;

    .line 2
    .line 3
    return-object v0
.end method
