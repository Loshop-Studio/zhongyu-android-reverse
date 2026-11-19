.class public final synthetic Lv3/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/friday/main/view/DBActivity;

.field public final synthetic d:Lcom/friday/main/viewmodel/DbViewModel;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lv3/d0;->c:Lcom/friday/main/view/DBActivity;

    iput-object p2, p0, Lv3/d0;->d:Lcom/friday/main/viewmodel/DbViewModel;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lv3/d0;->c:Lcom/friday/main/view/DBActivity;

    iget-object v1, p0, Lv3/d0;->d:Lcom/friday/main/viewmodel/DbViewModel;

    check-cast p1, Landroidx/navigation/NavGraphBuilder;

    invoke-static {v0, v1, p1}, Lcom/friday/main/view/DBActivity;->S(Lcom/friday/main/view/DBActivity;Lcom/friday/main/viewmodel/DbViewModel;Landroidx/navigation/NavGraphBuilder;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
