.class public final synthetic Lz5/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

.field public final synthetic b:Landroidx/navigation/NavController;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/navigation/NavController;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz5/m0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iput-object p2, p0, Lz5/m0;->b:Landroidx/navigation/NavController;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lz5/m0;->a:Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;

    iget-object v1, p0, Lz5/m0;->b:Landroidx/navigation/NavController;

    check-cast p1, Lcom/zykj/evaluation/ui/detail/mistake/TagData;

    invoke-static {v0, v1, p1}, Lcom/zykj/evaluation/ui/detail/mistake/MistakePageKt;->a(Lcom/zykj/evaluation/ui/detail/mistake/MistakeViewModel;Landroidx/navigation/NavController;Lcom/zykj/evaluation/ui/detail/mistake/TagData;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
